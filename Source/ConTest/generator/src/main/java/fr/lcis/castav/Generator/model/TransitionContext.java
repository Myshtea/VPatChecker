package fr.lcis.castav.Generator.model;

import java.util.List;

import fr.lcis.castav.cdml.cDML.Context;
import fr.lcis.castav.cdml.cDML.Situation;
import fr.lcis.castav.cdml.cDML.State;
import fr.lcis.castav.cdml.cDML.Transition;

/**
 * <pre>
 * For now useless (02/12/2022). 
 * Represents a transition
 * Is like a testPathElement but from the point of view of a transition instead of a state
 * </pre>
 * 
 * @author baheuxbi
 *
 */
public class TransitionContext  {
	

	public TransitionContext(Transition transition) {
		super();
		this.transition = transition;
	}

	public TransitionContext(List<Context> contexts, List<Situation> situations) {
		super();
		this.transition = null;
		this.contexts = contexts;
		this.situations = situations;
	}
	
	public TransitionContext(Transition transition, List<Context> contexts, List<Situation> situations) {
		super();
		this.transition = transition;
		this.contexts = contexts;
		this.situations = situations;
	}

	private Transition transition;
	private List<Context> contexts;
	private List<Situation> situations;
	private State destination;
	
	public Boolean isSituationTransition() {
		return transition!=null;
	}

	public Transition getTransition() {
		return transition;
	}

	public void setTransition(Transition transition) {
		this.transition = transition;
	}

	public List<Context> getContexts() {
		return contexts;
	}

	public void setContexts(List<Context> contexts) {
		this.contexts = contexts;
	}

	public List<Situation> getSituations() {
		return situations;
	}

	public void setSituations(List<Situation> situations) {
		this.situations = situations;
	}

	public State getDestination() {
		return destination;
	}

	public void setDestination(State destination) {
		this.destination = destination;
	}
	
	
}
