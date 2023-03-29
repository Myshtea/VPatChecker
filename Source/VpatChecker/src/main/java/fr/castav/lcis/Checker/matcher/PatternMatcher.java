package fr.castav.lcis.Checker.matcher;

import java.util.Set;

import fr.castav.lcis.Checker.model.TestPaths;
import fr.castav.lcis.Checker.model.TestPaths.TestPath;
import fr.castav.lcis.Checker.reporting.Report;
import fr.castav.lcis.Checker.reporting.ReportFolder;
import fr.castav.lcis.Checker.model.VulnerabilityModel;

/**
 * Interface for designing a pattern matcher
 * @author baheuxbi
 *
 */
public interface PatternMatcher {
	/**
	 * Checks if a single TestPath contains the vulnerability defined by vulnToFind
	 * 
	 * @param pathToCheck Path to be checked
	 * @param vulnToFind Vulnerability to be tested
	 * @return A report containing information on both the input parameters as well as the information on positivity of matching
	 */
	public Report matchSingle(TestPath pathToCheck, VulnerabilityModel vulnToFind);
	
	/**
	 * Checks if a vulnerability is found on a set of testpaths
	 * 
	 * @param pathsToCheck Paths to be checked
	 * @param vulnToFind Vulnerability to be tested
	 * @return A set of reports ontaining information on both the input parameters as well as the information on positivity of matching
	 */
	public ReportFolder matchGroup(TestPaths pathsToCheck, VulnerabilityModel vulnToFind);
	
	/**
	 * Checks if a set of vulnerability are found on a set of testpaths. 
	 * This function should be designed to give for each pair PATH/VULNERABILITY, the report on positivity
	 * 
	 * @param pathsToCheck Paths to be checked
	 * @param vulnToFind Vulnerability to be tested
	 * @return A set of reports containing information on both the input parameters as well as the information on positivity of matching for each pair PATH/VULN
	 */
	public ReportFolder matchCartesianProduct(TestPaths pathsToCheck, Set<VulnerabilityModel> vulnsToFind);
}