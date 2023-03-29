package fr.lcis.castav.Generator.generators;

import java.util.Map;
import java.util.Set;

import fr.lcis.castav.cdml.cDML.Adaptation;
import fr.lcis.castav.cdml.cDML.Cdml;
import fr.lcis.castav.cdml.cDML.Statemachine;
import fr.lcis.castav.Generator.model.ContextLinker;
import fr.lcis.castav.Generator.model.SituationLinker;
import fr.lcis.castav.Generator.model.TestPath;
import fr.lcis.castav.cdl.cDL.ContextModel;

/**
 * @author baheuxbi
 * 
 *	Top Level interface to define a subpath generator
 *	Each implementing class should follow a criterion of transition and context when generating 
 */
public interface TestSubpathGenerator {
	/**
	 * Generates the set of subpaths for the statemachine and contextmodel sent in parameter
	 * The set of tests generated are considered subpaths as they may contain super states that link to other statemachines 
	 * (See @link TestPathAggregator.java for full tests)
	 * 
	 * @param sm Statemachine from which we generate every path
	 * @param contextModel ContextModel (*.cdl file) defining the possible contexts/situation and their meaning
	 */
	public Set<TestPath> generate(Statemachine sm, ContextModel contextModel);
	
	/**
	 * Generates and Initializes in TestSubpathGenerator the mapping between a state.name and their possible adaptations
	 * 
	 * @param adaptations Set of every adaptation to be mapped to its name
	 */
	public Map<String,Set<Adaptation>> mapAdaptedTransitions(Set<Adaptation> adaptations);
	
	/**
	 * Generates and Initializes in TestSubpathGenerator the mapping between a state.name and the possible contexts it is aware of
	 * The contents are :
	 * 	For each state.name we get the Mapping between a context name and it's ContextLinker type
	 * 
	 * @param cbmlModel Behaviour Model defining the statemachines and adaptations.
	 * @param contextModel ContextModel (*.cdl file) defining the possible contexts/situation and their meaning
	 */
	public Map<String,Map<String,ContextLinker>> mapUnhandledContexts(Cdml cbmlModel, ContextModel contextModel);
	
	/**
	 * Generates and Initializes in TestSubpathGenerator the mappings between a situation name and it's SituationLinker type
	 * 
	 * @param cbmlModel Behaviour Model defining the statemachines and adaptations.
	 * @param contextModel ContextModel (*.cdl file) defining the possible contexts/situation and their meaning
	 */
	public Map<String,SituationLinker> mapSituationLinker(Cdml cbmlModel, ContextModel contextModel);
}
