/**
 *
 */
package fr.lcis.castav.Generator.generators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.lcis.castav.cdml.cDML.Adaptation;
import fr.lcis.castav.cdml.cDML.Cdml;
import fr.lcis.castav.cdml.cDML.State;
import fr.lcis.castav.cdml.cDML.Statemachine;
import fr.lcis.castav.cdml.cDML.Transition;
import fr.lcis.castav.Generator.model.ContextLinker;
import fr.lcis.castav.Generator.model.SituationLinker;
import fr.lcis.castav.Generator.model.TestPath;
import fr.lcis.castav.Generator.model.TransitionPair;
import fr.lcis.castav.Generator.utils.Util;
import fr.lcis.castav.cdl.cDL.ContextModel;

/**
 * @author asadwan
 * Generates test sub-paths from a state machine according to the all-transitions-pairs coverage criterion
 * Not up to date for now (2/12/2022) - Ivan B.
 * 
 * @deprecated
 */
public class AllTransitionPairsTestSubpathGenerator implements TestSubpathGenerator {

	private List<TransitionPair> transitionPairs;

	@Override
	public Map<String,Set<Adaptation>> mapAdaptedTransitions(Set<Adaptation> adaptations){
		return null;
	}

	@Override
	public Set<TestPath> generate(Statemachine sm, ContextModel contextModel) {
		Set<TestPath> subpaths = new HashSet<>();
		transitionPairs = getTransitionPairs(sm);
		while(!isAllTransitionPairsCovered()) {
			TestPath subpath = new TestPath();
			State current = sm.getStates().get(0);
			subpath.add(current);
			while(current != null && !current.getTransitions().isEmpty()) {
				boolean currentPairsCovered = true;
				State target;
				outerLoop:
				for(Transition transition: current.getTransitions()) {
					target = transition.getTarget();
					for(Transition secTransition: target.getTransitions()) {
						TransitionPair pair = getTransitionPair(transition, secTransition);
						if(pair != null && !pair.isCovered()) {
							pair.setCovered(true);
							currentPairsCovered = false;
							subpath.add(transition);
							subpath.add(target);
							subpath.add(secTransition);
							subpath.add(secTransition.getTarget());
							current = secTransition.getTarget();
							break outerLoop;
						}
					}
				}
				if(currentPairsCovered) {
					int randomTransitionIndex = Util.randInt(0, current.getTransitions().size() - 1);
					Transition random = current.getTransitions().get(randomTransitionIndex);
					subpath.add(random);
					subpath.add(random.getTarget());
					current = random.getTarget();
				}
			}
			subpaths.add(subpath);
		}
		return subpaths;
	}


	private List<TransitionPair> getTransitionPairs(Statemachine sm) {
		List<TransitionPair> pairs = new ArrayList<>();
		for (State state: sm.getStates()) {
			for(Transition firstTransition: state.getTransitions()) {
				if(firstTransition.getTarget() != null) {
					for(Transition secondTransition: firstTransition.getTarget().getTransitions()) {
						pairs.add(new TransitionPair(firstTransition, secondTransition));
					}
				}
			}
		}
		return pairs;
	}

	private Boolean isAllTransitionPairsCovered() {
		for(TransitionPair pair: transitionPairs) {
			if(!pair.isCovered()) {
				return false;
			}
		}
		return true;
	}

	private TransitionPair getTransitionPair(Transition first, Transition second) {
		for(TransitionPair pair: transitionPairs) {
			if(pair.getFirst() == first && pair.getSecond() == second) {
				return pair;
			}
		}
		return null;
	}

	@Override
	public Map<String, Map<String, ContextLinker>> mapUnhandledContexts(Cdml cbmlModel, ContextModel contextModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, SituationLinker> mapSituationLinker(Cdml cbmlModel, ContextModel contextModel) {
		// TODO Auto-generated method stub
		return null;
	}
}
