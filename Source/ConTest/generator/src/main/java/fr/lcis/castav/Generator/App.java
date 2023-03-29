package fr.lcis.castav.Generator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import fr.lcis.castav.cdml.cDML.*;
import fr.lcis.castav.Generator.generators.AllTransitionsTestSubpathGenerator;
import fr.lcis.castav.Generator.generators.TestSubpathGenerator;
import fr.lcis.castav.Generator.loaders.*;
import fr.lcis.castav.Generator.model.TestPath;
import fr.lcis.castav.Generator.utils.Config;
import fr.lcis.castav.Generator.utils.TestPathPrinter;
import fr.lcis.castav.cdl.cDL.*;


/**
 * Main
 * 
 * @author baheuxbi
 *
 */
public class App {
	
    public static void main( String[] args ) {
    	
    	
    	/** 
    	 * Configure the loaders.
    	 * Load the cbml file and cdl file
    	 */
    	//Coverage.GraphCriteria graphCoverage = Coverage.GraphCriteria.ALL_TRANSITIONS;
    	//Coverage.ContextCriteria contextCoverage = Coverage.ContextCriteria.ALL_SITUATIONS;
    	Config config = Config.getInstance();
    	config.load();
    	ModelLoader devModelLoader = new DevModelLoader();
    	ModelLoader contextModelLoader = new ContextModelLoader();
    	
    	/**
    	 * Handle the possibility that cbml or cdl file have errors
    	 */
    	//HANDLE DEVMODEL ERROR :
    	Cdml devModel = (Cdml) devModelLoader.load(config.getDevModelPath());
    	if(!((devModel.eResource().getWarnings() == null || devModel.eResource().getWarnings().size() == 0)
	    		&& (devModel.eResource().getErrors() == null || devModel.eResource().getErrors().size() == 0)) ) {
    		System.out.println("Error in CBML file");
    		System.exit(0);
	    }
    	//HANDLE DEVMODEL ERROR 
    	ContextModel contextModel = (ContextModel) contextModelLoader.load(config.getContextModelPath());
    	if(!((contextModel.eResource().getWarnings() == null || contextModel.eResource().getWarnings().size() == 0)
	    		&& (contextModel.eResource().getErrors() == null || contextModel.eResource().getErrors().size() == 0)) ) {
    		System.out.println("Error in CDL file");
    		System.exit(0);
	    }

		/**
		 * Debug devmodel
		 */
		System.out.println(devModel.getName());
		System.out.println(devModel.getClass());
		System.out.println(devModel.getAdaptations());
		System.out.println(devModel.getContexts());
		System.out.println(devModel.getSituations());
		System.out.println(devModel.getStatemachines());

		/**
		 * Initialize the staticContexts
		 * i.e the list of model staticContexts to be added to each test at the end
		 */
		fr.lcis.castav.Generator.model.StaticContext staticContext = new fr.lcis.castav.Generator.model.StaticContext(devModel);
		
		/**
		 * Initalize generator 
		 * This means : 
		 * 	- create a map of the transitions to adaptedStates
		 *  - map the contexts that we will need to handle (i.e the contexts that the devmodel depend on)
		 *  - map the situations of the devModel and the situations of the contextModel
		 */
		TestSubpathGenerator generator = new AllTransitionsTestSubpathGenerator();
		// Initialise adaptiveTransitions
    	generator.mapAdaptedTransitions(new HashSet<Adaptation>(devModel.getAdaptations()));
    	generator.mapUnhandledContexts(devModel, contextModel);
    	generator.mapSituationLinker(devModel, contextModel);
    	
    	/**
    	 * Generate the tests for each statemachine
    	 * Find the main of the program (currently(09/01/2023) the first statemachine)
    	 */
		String MAIN_STR = "";
		Map<String, Set<TestPath>> map = new HashMap<String, Set<TestPath>>();
		for(Statemachine sm: devModel.getStatemachines()) {
			System.out.println(sm.getName());
			// main is defined as first statemachine
			if(MAIN_STR == "") {MAIN_STR = sm.getName(); }
			map.put(sm.getName(), generator.generate(sm,contextModel));
			System.out.println("End of generation for ------- "+sm.getName());

			/**
			 * Debug the testPaths
			 */
			for (TestPath t: map.get(sm.getName())){
				t.prettyPrint();;
			}
		}

		System.out.println("Aggregating...");
		
		/**
		 * Initialize the aggregator
		 * map is the set of statemachine names (activities) mapped to their tests
		 */
		Set<TestPath> fullPaths = new HashSet<>();
		TestPathAggregator aggregator = new TestPathAggregator(map);
		

		/*
		 * Aggregate tests from the main statemachine
		 * Output the tests 
		 */
		fullPaths.addAll(aggregator.aggregate(MAIN_STR));
		
		
		
		TestPathPrinter.OutputTest(fullPaths, staticContext, MAIN_STR, null);
		System.out.println("Generated " + fullPaths.size() + " tests for every context");

		fullPaths.clear();
		
		
		/*
		 * Aggregate tests from the every other statemachine that has the exported attribute
		 * Output the tests 
		 */
		for(Statemachine sm: devModel.getStatemachines()) {
			if(sm.isExported()) {
				fullPaths.addAll(aggregator.aggregate(sm.getName()));
				TestPathPrinter.OutputTest(fullPaths, staticContext, sm.getName(), sm);
				System.out.println("Generated " + fullPaths.size() + " tests for every context");
				fullPaths.clear();
			}

		}

		
		
		
    	
    }
}
