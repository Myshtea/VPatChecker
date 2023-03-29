package fr.castav.lcis.Checker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



import fr.castav.lcis.Checker.Util.Config;
import fr.castav.lcis.Checker.loader.*;
import fr.castav.lcis.Checker.matcher.PatternMatcher;
import fr.castav.lcis.Checker.matcher.SimpleMatcher;
import fr.castav.lcis.Checker.model.TestPaths;
import fr.castav.lcis.Checker.reporting.GlobalData;
import fr.castav.lcis.Checker.reporting.Report;
import fr.castav.lcis.Checker.reporting.ReportFolder;
import fr.castav.lcis.Checker.model.VulnerabilityModel;

import fr.lcis.castav.vpat.vPAT.Vulnerability;

/**
 * Main
 * 
 * @author baheuxbi
 *
 */
public class App {
	
	/**
	 * Used to be able to print negative reports
	 */
	boolean debugNegativeReports = true;
	
    public static void main( String[] args ) {
    	System.out.println("Hello warudo !");
    	
    	
    	Config config = Config.getInstance();
    	config.load();
    	ModelLoader patternModelLoader = new PatternModelLoader();
    	//Vulnerability pattern = (Vulnerability) patternModelLoader.load(config.getPatternFolderPath());
    	
    	Set<VulnerabilityModel> patterns = new HashSet<VulnerabilityModel>();
    	
    	try {
			Files.list(new File(config.getPatternFolderPath()).toPath())
			.forEach(path -> {
			    System.out.println(path);
			    Vulnerability vuln = (Vulnerability) patternModelLoader.load(path.toString());
			    if((vuln.eResource().getWarnings() == null || vuln.eResource().getWarnings().size() == 0)
			    		&& (vuln.eResource().getErrors() == null || vuln.eResource().getErrors().size() == 0) ) {
			    	patterns.add(new VulnerabilityModel((Vulnerability) patternModelLoader.load(path.toString())));
			    }
			    else {
			    	System.out.println("MainAPP -> Error in pattern");
			    }
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	for (VulnerabilityModel v: patterns) {
    		System.out.println(v.toString());
    		/*Util.colprint(1,v.getName()+"  --  ");
    		Util.colprint(2,v.getDescription());
    			
    		for(Context c: v.getContext()) {
    			Util.colprint(4,c.toString());
    		}
    		System.out.println();
    		
    		for(Function f: v.getFunction()) {
    			Util.colprint(3, f.getClass() +" : " + f.getName());
        		System.out.println();
    		}
    		System.out.println();*/
    	}
    	
    	
    	/*
    	 * How to compare 
    	 * 
    	 * 
    	 */
    	Set<TestPaths> testsSet = new HashSet<TestPaths>();
    	
    	try {
			Files.list(new File(config.getTestFolderPath()).toPath())
			.filter(s -> s.toString().endsWith(".xml"))
			.forEach(path -> {
			    System.out.println(path);
			    testsSet.add( TestPathsUnmarshaller.convertXMLToObject(path.toString()) );
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	System.out.println(testsSet.toString());
    	
    	PatternMatcher patternMatcher = new SimpleMatcher();
    	List<ReportFolder> reportFolders = new ArrayList<ReportFolder>(); 
    	for(TestPaths paths: testsSet)
    		reportFolders.add(patternMatcher.matchCartesianProduct(paths, patterns));
    	    	
    	GlobalData data = new GlobalData();
    	
    	System.out.println("End of analysis");
    	for (ReportFolder reportFolder : reportFolders) {
    		
    		for(Report report : reportFolder.getReports()) {
    			data.add(report.isPositive(), report.getVuln().getName(), reportFolder.getComponent(), reportFolder.getContextID(), report.getIdentity());
    		}
    		
    		try {
				reportFolder.writeToFile(config.getOutputFolderPath(), false);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
		data.printDebugInformation();
    }
}
