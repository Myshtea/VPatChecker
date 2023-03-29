package fr.lcis.castav.Generator.model;

import fr.lcis.castav.cdml.cDML.Transition;

/**
 * Class representing a pair of transitions
 * Used for AllTransitionsPair Coverage. Deprecated for now 02/12/2022
 * 
 * @deprecated
 * 
 * @author asadwan
 *
 */
public class TransitionPair {

	private Transition first;
	private Transition second;
	private Boolean covered = false;



	public TransitionPair(Transition first, Transition second) {
		this.first = first;
		this.second = second;
	}

	public Transition getFirst() {
		return first;
	}

	public Transition getSecond() {
		return second;
	}

	public void setCovered(Boolean covered) {
		this.covered = covered;
	}

	public Boolean isCovered() {
		return covered;
	}

}
