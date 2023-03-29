package fr.castav.lcis.Checker.matcher;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import fr.castav.lcis.Checker.model.TestPaths;
import fr.castav.lcis.Checker.model.TestPaths.StaticContext;
import fr.castav.lcis.Checker.model.TestPaths.TestPath;
import fr.castav.lcis.Checker.model.TestPaths.TestPath.State;
import fr.castav.lcis.Checker.model.TestPaths.TestPath.State.Dataflows.Dataflow;
import fr.castav.lcis.Checker.reporting.Report;
import fr.castav.lcis.Checker.reporting.ReportFolder;
import fr.castav.lcis.Checker.model.VulnerabilityModel;

public class SimpleMatcher implements PatternMatcher {

	/**
	 * Remembers how many time each component has called matchCartesian
	 * Equals the number of equivalent testpaths with only different staticContext
	 */
	private Map<String,Integer> nameIteration;
	private int identity = 0;
	private StaticContext staticContext = null;
	
	public SimpleMatcher() {
		nameIteration = new HashMap<String, Integer>();
	}
	
	@Override
	public Report matchSingle(TestPath pathToCheck, VulnerabilityModel vulnToFind) {
		TestPath newPath = null;
		try {
			newPath = pathToCheck.clone();
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Report report = new Report(false, newPath, vulnToFind, Integer.toString(this.identity), staticContext);
		
		System.out.println("Checking vulnPattern :" + vulnToFind.getName() + " on testPath " + pathToCheck);
		
		for (State state:  pathToCheck.getState()) {
			if(state.getDataflows() != null) {
				for(Dataflow d: state.getDataflows().getDataflow()) {
					System.out.println("Checking dataflow "+d.getName() +" of type "+d.getType());
					if(d.getType().equals("Sink")) {
						//Check if sink is same as pattern created
						 
						if(!vulnToFind.checkSink(newPath, d)) {
								report.setPositive(false);
						}
						else {
							report.setPositive(true);
							//TODO HANDLE MULTIPLE "main" SINKS (Not needed as of 03/01/2022)
							return report;

						}
					}
				}
			}
		}
		//TODO
		
		return report;
	}

	@Override
	public ReportFolder matchGroup(TestPaths pathsToCheck, VulnerabilityModel vulnToFind) {
		ReportFolder reports = new ReportFolder(pathsToCheck.getComponent());
		
		/**
		 * Check if vulnerability has the same static context as the paths
		 */
		if(pathsToCheck.getStaticContext() != null) {
			if(!vulnToFind.checkContext(pathsToCheck.getStaticContext())) {
				System.out.println("BAD CONTEXT");
				return reports;
			}
			this.staticContext = pathsToCheck.getStaticContext();
		}
		
		this.identity = 0;
		
		for(TestPath test: pathsToCheck.getTestPath()) {
			reports.add(this.matchSingle(test, vulnToFind));
			this.identity += 1;
		}

		return reports;
	}

	@Override
	public ReportFolder matchCartesianProduct(TestPaths pathsToCheck, Set<VulnerabilityModel> vulnsToFind) {
		nameIteration.merge(pathsToCheck.getComponent(), 1, Integer::sum);
		ReportFolder reports = new ReportFolder(pathsToCheck.getComponent(), nameIteration.get(pathsToCheck.getComponent()));
		
		for(VulnerabilityModel vuln: vulnsToFind) {
			reports.addAll(this.matchGroup(pathsToCheck, vuln));
		}

		return reports;
	}

}
