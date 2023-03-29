package fr.castav.lcis.Checker.reporting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Contains the compilation of every report outcome
 * Used for debug, pretty print and more
 * This was originally designed to be part of the process in the report constructor
 *   but it was changed to be an autonomous part as it did not match our design of report
 *   
 * @author baheuxbi
 *
 */
public class GlobalData {
	
	/**
	 * Contains the compilation of every report outcome for a single vulnerability
	 * This means : 
	 * 	- number of reports for the vulnerability
	 *  - number of positive reports for the vulnerability
	 *  - number of negative reports for the vulnerability
	 *  - The path (in the file system) to every positive vulnerability report
	 *  
	 * @author baheuxbi
	 *
	 */
	public class Data {
		
		String vuln;


		int total = 0;
		int positives = 0;
		int negatives = 0;
		List<String> positiveFilePaths = new ArrayList<String>();
		
		public Data(String vuln) {
			this.vuln = vuln;
		}
		
		public void addPositive(String filePath) {
			positiveFilePaths.add(filePath);
			positives++;
			total++;
		}
		
		public void addNegative() {
			negatives++;
			total++;
		}

		public int getTotal() {
			return total;
		}

		public int getPositives() {
			return positives;
		}

		public int getNegatives() {
			return negatives;
		}

		public List<String> getPositiveFilePaths() {
			return positiveFilePaths;
		}	
		
		public String getVuln() {
			return vuln;
		}

		public void setVuln(String vuln) {
			this.vuln = vuln;
		}
	}
	
	/**
	 * For each component name get the map of each vulnerability name to its data
	 * 
	 */
	Map<String,Map<String,Data>> componentData = new HashMap<String,Map<String,Data>>();
	public GlobalData() {
	}
	
	public GlobalData(List<ReportFolder> reportFolders) {
	 //TODO ?	
	}
	
	
	public void addPositive(String component, String vuln, String filePath) {
		Map<String, Data> dataMap;
		if(!componentData.containsKey(component)) {
			dataMap = new HashMap<String, Data>();
			componentData.put(component, dataMap);
		}
		dataMap = componentData.get(component);

		if (!dataMap.containsKey(vuln)) {
			dataMap.put(vuln,new Data(vuln));
		}

		Data d = dataMap.get(vuln);
		d.addPositive(filePath);
		dataMap.put(vuln, d);
		
		componentData.put(component, dataMap);
	}
	
	public void addNegative(String component, String vuln) {
		Map<String, Data> dataMap;
		if(!componentData.containsKey(component)) {
			dataMap = new HashMap<String, Data>();
			componentData.put(component, dataMap);
		}
		dataMap = componentData.get(component);

		if (!dataMap.containsKey(vuln)) {
			dataMap.put(vuln,new Data(vuln));
		}
		
		Data d = dataMap.get(vuln);
		d.addNegative();
		dataMap.put(vuln, d);
		
		componentData.put(component, dataMap);
	}
	
	public void add(boolean positive, String vulnName, String componentName, int ContextID, String id) {
		String contextDir = (ContextID==-1 ? "" : "Context_"+String.valueOf(ContextID) + "/");
		if(positive)
			addPositive(componentName, vulnName, "/"+componentName+"/"+vulnName+"/"+contextDir+vulnName+"_"+id);
		else
			addNegative(componentName, vulnName);
	}

	public void clear() {
		componentData.clear();
	}
	
	public void printDebugInformation() {
		System.out.println("Self Diagnosis : ");
		System.out.println("I have "+String.valueOf(componentData.size())+" elements");

		
		String line = "------------------------------------";
		for (Map.Entry<String, Map<String,Data>> componentEntrySet : componentData.entrySet()) {
			System.out.println(line+" Debug Information for "+componentEntrySet.getKey() + " " + line);
			
			for (Map.Entry<String,Data> entry : componentEntrySet.getValue().entrySet()) {
				System.out.println("   =====> "+entry.getKey() + " has :");
				System.out.println("    Total tested "+entry.getValue().getTotal());
				System.out.println("    Negatives    "+entry.getValue().getNegatives());
				System.out.println("    Positives    "+entry.getValue().getPositives());
				for(String pos : entry.getValue().getPositiveFilePaths()) {
					//System.out.println("    Positive -> <OUTPUT_FOLDER>"+pos);
				}
			}
			System.out.println(line+line+line);
		}
	}
}
