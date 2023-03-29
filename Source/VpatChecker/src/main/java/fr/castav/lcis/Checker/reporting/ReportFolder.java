package fr.castav.lcis.Checker.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * The class holds every report for a single component (i.e : starting node)
 * 
 * @author baheuxbi
 *
 */
public class ReportFolder {
	
	String component = "";
	int contextID;

	List<Report> reports = new ArrayList<Report>();
	
	public ReportFolder(String component) {
		this.component = component;
		this.contextID = -1;

	}
	
	public ReportFolder(String component, int contextID) {
		this.component = component;
		this.contextID = contextID;
	}
	
	public ReportFolder(List<Report> reports, String component) {
		this.component = component;
		this.reports = reports;
	}
	
	public boolean addAll(List<Report> reports) {
		return this.reports.addAll(reports);
	}

	public boolean addAll(ReportFolder reportFolder) {
		if(!reportFolder.getComponent().equals(reportFolder.getComponent()) ) {
			return false;
		}
		return this.reports.addAll(reportFolder.getReports());
	}
	
	public boolean add(Report report) {
		return this.reports.add(report);
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public List<Report> getReports() {
		return reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}	
	
	public int getContextID() {
		return contextID;
	}

	public void setContextID(int contextID) {
		this.contextID = contextID;
	}

	
	public void writeToFile(String outputFolder, boolean printNegative) throws Exception {
		for(Report report : reports) {
			if( !(report.isPositive() || printNegative) )
				continue;

			String output;
			
			String vulnName = report.getVuln().getName();
			
			File componentDir = new File(outputFolder+"/"+this.getComponent());
			//System.out.println(componentDir.getCanonicalPath());
			if (!componentDir.exists()){
				componentDir.mkdirs();
			}
			
			File reportFolderDir = new File(componentDir+"/"+vulnName);
			if (!reportFolderDir.exists()){
				reportFolderDir.mkdirs();
			}
			
			if(this.getContextID() != -1) {
				File contextIdDir = new File(reportFolderDir+"/"+"Context_"+String.valueOf(this.getContextID()));
				if (!contextIdDir.exists()){
					contextIdDir.mkdirs();
				}
				output = contextIdDir.getCanonicalPath();
			}
			else {
				output = reportFolderDir.getCanonicalPath();
			}
			
			report.writeToFile(output);
		}
	}
	
	public void printDebugInformation() {
		String debugLine = "------------ Debug information for "+this.getComponent()+" ------------";
		System.out.println(debugLine);
		
		//TODO PRINT DEBUG DATA
		for (int i=0; i<debugLine.length(); i++){
		    System.out.print("-");
		}
		System.out.print("\n\n");
	}

}
