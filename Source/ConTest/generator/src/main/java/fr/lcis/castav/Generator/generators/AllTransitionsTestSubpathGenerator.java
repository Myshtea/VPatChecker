/**
 *
 */
package fr.lcis.castav.Generator.generators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Lists;

import fr.lcis.castav.cdml.cDML.Adaptation;
import fr.lcis.castav.cdml.cDML.AtomicState;
import fr.lcis.castav.cdml.cDML.Cdml;
import fr.lcis.castav.cdml.cDML.Context;
import fr.lcis.castav.cdml.cDML.Situation;
import fr.lcis.castav.cdml.cDML.Situations;
import fr.lcis.castav.cdml.cDML.State;
import fr.lcis.castav.cdml.cDML.Statemachine;
import fr.lcis.castav.cdml.cDML.Transition;
import fr.lcis.castav.Generator.model.ContextElement;
import fr.lcis.castav.Generator.model.ContextLinker;
import fr.lcis.castav.Generator.model.SituationLinker;
import fr.lcis.castav.Generator.model.TestPath;
import fr.lcis.castav.Generator.utils.Util;
import fr.lcis.castav.Generator.utils.Util.TypeOfState;
import fr.lcis.castav.cdl.cDL.ContextModel;

/**
 * Generate test sub-paths from a state machine according to the all-transitions coverage criterion.
 * Subpath generator that generates tests from a state machine according to the all-transition/all-contexts coverage criterion.
 * 
 * @author adwanab, baheuxbi.
 * 
 */
public class AllTransitionsTestSubpathGenerator implements TestSubpathGenerator {
	/**
	 * Map between a state.name and its already visited transitions, used during subpath generation.
	 */
	private Map<State,Set<Transition>> visitedTransitions;

	/**
	 * Map containing for each State, the mapping between the context name and their ContextLinker.
	 * This is used to have a list of transitions for a specific Situation (Context).
	 */
	private Map<String,Map<String,ContextLinker>> unhandledContexts;
	
	private Set<ContextLinker> contextLinkers;
	
	/**
	 * Map containing for each situation name, its SituationLinker.
	 */
	private Map<String,SituationLinker> situationLinkers;
	
	/**
	 * Map containing for each State, the adaptations that can be derived.
	 * This is used to have a list of transitions for a specific Situation (Context).
	 */
	private Map<String,Set<Adaptation>> unhandledAdaptations;



	public Map<String, Set<Adaptation>> getUnhandledAdaptations() {
		return unhandledAdaptations;
	}

	public void setAdaptedTransitions(Map<String, Set<Adaptation>> unhandledAdaptations) {
		this.unhandledAdaptations = unhandledAdaptations;
	}

	


	private Set<TestPath> generateWithContext(State currentState, TestPath testPath, List<ContextElement> contexts){
		return generateWithContext(currentState, currentState, testPath, contexts);
	}
	
	/**
	 * Helper function
	 * 
	 * Function called by generate2 to generate subpaths of a state that has a context but no situation.
	 * 
	 * Calls recursively generate2 on every substate.
	 * 
	 * @param currentState The state to study, add to the testPath and follow transitions of.
	 * @param testPath TestPath to build on when generating the continuation of the path.
	 * @param contexts The contexts, written as a string array, of the transition between currentState and the following states.
	 * @return A set of testpath.
	 */
	private Set<TestPath> generateWithContext(State adaptedState, State currentState, TestPath testPath, List<ContextElement> contexts){
		Set<TestPath> paths = new HashSet<>();
		Set<ContextElement> contextsSet = new HashSet<>(contexts);

		//visited Transitions for the current state
		Set<Transition> visitedTransitionsForState = visitedTransitions.get(adaptedState);
		if (visitedTransitionsForState == null) {
			visitedTransitionsForState = new HashSet<>();
			visitedTransitions.put(adaptedState, visitedTransitionsForState);
		}
		
		if(currentState.getTransitions().isEmpty()) {
			// ADD STUB IN CASE THERE IS NO DIRECT TRANSITION (FOR SUPER CONTEXTS)
			TestPath tempPath;
			try {
				tempPath = testPath.clone();
				tempPath.add(contextsSet);
				paths.add(tempPath);
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


		for(Transition transition: currentState.getTransitions()) {
			try {
				TestPath tempPath = testPath.clone();

				tempPath.add(transition,contextsSet);
				currentState = transition.getTarget();
				visitedTransitionsForState.add(transition);

				paths.addAll(generate2(transition.getTarget(),tempPath));
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		visitedTransitions.put(adaptedState, visitedTransitionsForState);
		return paths;
	}
	
	/**
	 * Helper function
	 * 
	 * Function called by generate2 to generate subpaths of a state in an adaptation. (I.E when transiting from Statemachine.state to Adaptation.state).
	 * 
	 * Calls recursively generate2 on every substate.
	 * 
	 * @param currentState The state to study, add to the testPath and follow transitions of.
	 * @param testPath TestPath to build on when generating the continuation of the path.
	 * @param contexts The contexts, written as a string array, of the transition between currentState and the following states.
	 * @param situations The situation, written as a string array, of the transition between currentState and the following states.
	 * @return A set of testpath.
	 */
	private Set<TestPath> generateWithContext(State adaptedState, State currentState, TestPath testPath, List<ContextElement> contexts, List<String> situations){
		Set<TestPath> paths = new HashSet<>();
		
		/**
		 * We chose to add adaptedState instead of current state to keep sinks/sources/inputs of the original state 
		 *  could be a bad design choice but it is simple to change
		 */
		testPath.add(adaptedState);
		
		
		Set<ContextElement> contextsSet = new HashSet<>(contexts);

		for(String s: situations) {
			contextsSet.addAll(situationLinkers.get(s).getContextElement());
		}


		Set<String> situationsSet = new HashSet<>(situations);

		//visited Transitions for the current state
		Set<Transition> visitedTransitionsForState = visitedTransitions.get(adaptedState);
		if (visitedTransitionsForState == null) {
			visitedTransitionsForState = new HashSet<>();
			visitedTransitions.put(adaptedState, visitedTransitionsForState);
		}
		
		for(Transition transition: currentState.getTransitions()) {
			try {
				TestPath tempPath = testPath.clone();

				tempPath.add(transition,contextsSet,situationsSet);
				currentState = transition.getTarget();
				visitedTransitionsForState.add(transition);

				paths.addAll(generate2(transition.getTarget(),tempPath));
				//tempPath.print();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		visitedTransitions.put(adaptedState, visitedTransitionsForState);
		return paths;
	}

	/**
	 * Helper function.
	 * 
	 * Generates a set test path from a given state and testpath (can be empty).
	 * 
	 * Checks :
	 * 	If there are adaptation of said state.
	 * 	If there are contextual transitions (AtomicAware type).
	 *
	 * This being a recursive functions, it will call itself for every non-contextual transition to a state..
	 * 
	 * @param currentState The state to study, add to the testPath and follow transitions of.
	 * @param testPath TestPath to build on when generating the continuation of the path
	 * @return A set of testpath
	 */
	private Set<TestPath> generate2(State currentState,
								   TestPath testPath){

		Set<TestPath> paths = new HashSet<>();
		TypeOfState t = Util.checkTypeOfState(currentState);
		//System.out.println("----" + currentState.getName()+ " of type "+t);
		//testPath.print();


		//visited Transitions for the current state
		Set<Transition> visitedTransitionsForState = visitedTransitions.get(currentState);
		if (visitedTransitionsForState == null) {
			visitedTransitionsForState = new HashSet<>();
			visitedTransitions.put(currentState, visitedTransitionsForState);
		}



		if(t == TypeOfState.AwareAtomic && unhandledAdaptations.get(currentState.getName())!=null && unhandledAdaptations.get(currentState.getName()) != null) {
			//for every adaptation not done continue transitions
			AtomicState atomState = (AtomicState) currentState;
			Set<Adaptation> adaptations = unhandledAdaptations.get(currentState.getName());
			Map<String,ContextLinker> contextMap = unhandledContexts.get(atomState.getName());

			List<List<ContextElement>> contexts = new ArrayList<>();
			//Generate list of list of contexts

			for (String key: contextMap.keySet()) {
				contexts.add(contextMap.get(key).getContextElementList());
			}

			//unhandledContexts.remove(atomState.getName());
			List<List<ContextElement>> contextsToAvoid = new ArrayList<>();
			//Handle adaptations (if we haven't for the current state)
			if(adaptations != null && !adaptations.isEmpty()) {
				unhandledAdaptations.remove(currentState.getName());

				//handle adaptations
				for(Adaptation a: adaptations) {
					// List of context (not context values) to be filtered after generating with situation
					List<ContextLinker> tempContextList = new ArrayList<>();
					
					/**
					 *  List of context values (Each value of the list gives the list of context values of a specific context) filtered out of the context 
					 *   values of the situation
					 */
					List<List<ContextElement>> tempcontexts = new ArrayList<>();
					
					/**
					 * Names of the situations
					 */
					List<String> adaptationTopContext = new ArrayList<>();
					
					/**
					 * For each situation we store :
					 * 	- The contexts that each situation contains (not context value)
					 * 	- The name of the situations
					 *  - The context values that each of the situations need to exist (so that we don't use them when generating the non-situational transitions)
					 */
					for(Situation sit: a.getSituations()) {
						//contexts.add(contextMap.get(sit.getContext()).getContextList());
						tempContextList.add(contextMap.get(sit.getContext().getName()));
						adaptationTopContext.add(sit.getName());
						contextsToAvoid.add(situationLinkers.get(sit.getName()).getContextElement());	
					}

					//Generate temp list of list of contexts that is missing from the specific context of the situation
					for (String key: contextMap.keySet()) {
						if(!tempContextList.contains(contextMap.get(key))) {
							tempcontexts.add(contextMap.get(key).getContextElementList());
						}
					}
					
					if (tempcontexts != null && tempcontexts.size() != 0) {
						for(List<ContextElement> ctbt: Lists.cartesianProduct(tempcontexts)) {
							try {
								paths.addAll(generateWithContext(currentState,a.getState(),testPath.clone(),ctbt,adaptationTopContext));
							} catch (CloneNotSupportedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					else {
						try {
							paths.addAll(generateWithContext(currentState,a.getState(),testPath.clone(),new ArrayList<ContextElement>(),adaptationTopContext));
						} catch (CloneNotSupportedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
			testPath.add(currentState);
			//System.out.println("Currently generating the rest");
			//testPath.print();			
			if(contexts != null && !contexts.isEmpty()) {
				//For each combination of context : Do transition
				boolean ignore = false;
				for(List<ContextElement> ctbt: Lists.cartesianProduct(contexts)) {

					//for(String str: ctbt) {
					//	Util.colprint(2, str+" ");
					//}
					//System.out.println("");
					try {
						for(List<ContextElement> toAvoid: contextsToAvoid) {
							if(ctbt.containsAll(toAvoid)) {
								ignore = true;
								break;
							}
						}

						if(!ignore) {
							paths.addAll(generateWithContext(currentState,testPath.clone(),ctbt));
						}
						else {
							ignore = false;
						}
					} catch (CloneNotSupportedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

			// Handle rest "normal" contextual transitions
		}
		else {
			testPath.add(currentState);

			
			//testPath.print();
			if(!currentState.getTransitions().isEmpty()) {
				if(visitedTransitionsForState.containsAll(currentState.getTransitions())) {
					Transition nexttrans = currentState.getTransitions().get(0);
					for(Transition trans: currentState.getTransitions()) {
						if(!testPath.contains(trans)) {
							nexttrans = trans;
						}
					}
					testPath.add(nexttrans);
					currentState = nexttrans.getTarget();
					paths.addAll(generate2(currentState,testPath));
				} // Else : Stop on the first new transition
				else {

					try {

						for(Transition transition: currentState.getTransitions()) {
							TestPath tempPath = testPath.clone();

							//System.out.println("IN ["+currentState.getName()+"] Adding :"+transition.getOn().getName());

							if(!visitedTransitionsForState.contains(transition)) {
								tempPath.add(transition);
								visitedTransitionsForState.add(transition);
								visitedTransitions.put(currentState, visitedTransitionsForState);

								paths.addAll(generate2(transition.getTarget(),tempPath));
							}

						}
					} catch (CloneNotSupportedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
			else {
				paths.add(testPath);
			}
		}

		return paths;
	}



	@Override
	public Map<String, SituationLinker> mapSituationLinker(Cdml cbmlModel, ContextModel contextModel) {
		situationLinkers = new HashMap<>();
		List<ContextElement> contextElements;
		
		for(Situations topS: cbmlModel.getSituations()) {
			for(Situation s: topS.getSituations()) {
				contextElements = new ArrayList<ContextElement>();
				SituationLinker sitL = new SituationLinker(s,contextModel);
				for(String str: sitL.getSituationContextString()) {
					for(ContextLinker cl: contextLinkers) {
						if(cl.getContextStringList().contains(str)) {
							System.out.println(s.getName());
							contextElements.add(new ContextElement(cl,str));
							break;
						}
					}
				}
				sitL.setContextElement(contextElements);
				situationLinkers.put(s.getName(), sitL);
			}

		}

		return situationLinkers;
	}

	
	/**
	 * Set-ups the variable adaptedTransitions
	 */
	@Override
	public Map<String,Set<Adaptation>> mapAdaptedTransitions(Set<Adaptation> adaptations){
		unhandledAdaptations = new HashMap<>();

		for(Adaptation a: adaptations) {
			String str = a.getState().getName();
			unhandledAdaptations.compute(str, (k, v) -> {
				if(v==null) {
					return new HashSet<>(Arrays.asList(a));
				}
				else {
					v.add(a); return v;
				}
			});
		}
		return unhandledAdaptations;
	}


	@Override
	public Map<String,Map<String,ContextLinker>> mapUnhandledContexts(Cdml cbmlModel, ContextModel contextModel) {

		unhandledContexts = new HashMap<>();
		contextLinkers = new HashSet<>();

		for(Statemachine sm: cbmlModel.getStatemachines()) {
			for(State state: sm.getStates()){
				if(state instanceof AtomicState) {
					AtomicState atomState = (AtomicState) state;
					if(atomState.isContextAware()) {
						Map<String, ContextLinker> tempMap = new HashMap<>();
						for(Context c: atomState.getContexts()) {
							ContextLinker cl = new ContextLinker(c, contextModel);
							contextLinkers.add(cl);
							tempMap.put(c.getName(), cl);
						}
						unhandledContexts.put(atomState.getName(), tempMap);
					}
				}
			}
		}

		for(Adaptation sm: cbmlModel.getAdaptations()) {
			for(State state: sm.getStates()){
				if(state instanceof AtomicState) {
					AtomicState atomState = (AtomicState) state;
					if(atomState.isContextAware()) {
						Map<String, ContextLinker> tempMap = new HashMap<>();
						for(Context c: atomState.getContexts()) {
							ContextLinker cl = new ContextLinker(c, contextModel);
							contextLinkers.add(cl);
							tempMap.put(c.getName(), cl);
						}
						unhandledContexts.put(atomState.getName(), tempMap);
					}
				}
			}
		}

		return unhandledContexts;
	}



	@Override
	public Set<TestPath> generate(Statemachine sm, ContextModel contextModel) {
		visitedTransitions = new HashMap<>();
		Map<State,Set<Transition>> transitions = getTransitions(sm);
		Set<TestPath> testSubpaths = new HashSet<>();

		for(Map.Entry<State, Set<Transition>> map : transitions.entrySet()) {
			System.out.print(map.getKey().getName() + " [ ");
			for(Transition t: map.getValue()) {
				System.out.print(t.getTarget().getName() + "  ");
			}
			System.out.print("]\n");
		}
		System.out.print("\n");

		
		while(!visitedTransitions.equals(transitions)) {

			System.out.print("\n");
			TestPath testPath = new TestPath();
			State currentState = sm.getStates().get(0);

			testSubpaths.addAll(generate2(currentState,testPath));
			System.out.println("[generate] testSubpaths has "+testSubpaths.size());
			for(Map.Entry<State, Set<Transition>> map : visitedTransitions.entrySet()) {
				System.out.print(map.getKey().getName() + " [ ");
				for(Transition t: map.getValue()) {
					System.out.print(t.getTarget().getName() + "  ");
				}
				System.out.print("]\n");
			}
		}

		return testSubpaths;
	}

	private Map<State,Set<Transition>> getTransitions(Statemachine sm) {
		Map<State,Set<Transition>> transitions = new HashMap<>();
		Set<Transition> temp;

		for(State state: sm.getStates()) {
			temp = new HashSet<>();
			temp.addAll(state.getTransitions());
			transitions.put(state, temp);
			if(unhandledAdaptations.get(state.getName()) != null) {
				for(Adaptation adapt: unhandledAdaptations.get(state.getName()) ) {
					for(State st: adapt.getStates()) {
						temp = new HashSet<>();
						temp.addAll(st.getTransitions());
						if(st.getName().equals(state.getName())) {
							temp.addAll(transitions.get(state));
							transitions.put(state, temp);
						}
						else {
							transitions.put(st, temp);
						}
					}
				}
			}
		}
		return transitions;
	}



}
