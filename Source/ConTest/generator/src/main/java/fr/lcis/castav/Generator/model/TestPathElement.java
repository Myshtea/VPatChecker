package fr.lcis.castav.Generator.model;

import java.util.Set;

import fr.lcis.castav.cdml.cDML.*;

/**
 * Class representing a step of the testPath
 * 	A step (or testPathElement) contains :
 * 		- A State (mandatory)
 * 		- A transition (optionnal)
 * 			- If there is a transition :
 * 				- A set of contexts (optionnal)
 *   				- If there are contexts :
 * 						- A set of situations (optionnal)
 * 
 * A step can also be a stub :
 * 		A stub is a state that will be replaced with its top statemachine targetstate
 * 		A stub is used when a statemachine ends with an empty contextual transition.
 * 			An empty contextual transition is a transition waiting to be replaced but that contains the context/situation
 * 
 * @author baheuxbi
 *
 */
public class TestPathElement {
	
	private Boolean isStub = false;
	private State state;
	private Transition transition;
	/**
	 * Contexts stored by the name of their possible values 
	 * EX : "offline", "wifi"...
	 * 
	 * TODO : Replace string with more acceptable type using EMF 
	 */
	private Set<ContextElement> contexts;
	
	/**
	 * Situations stored by their name 
	 * EX : "INTERNET_DISCONNECTED", "INTERNET_SLOW"...
	 * 
	 * TODO : Replace string with more acceptable type using EMF 
	 */
	private Set<String> situations;
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Transition getTransition() {
		return transition;
	}

	public void setTransition(Transition transition) {
		this.transition = transition;
	}
	

	public Set<ContextElement> getContexts() {
		return contexts;
	}

	public void setContexts(Set<ContextElement> contexts) {
		this.contexts = contexts;
	}
	
	public Set<String> getSituations() {
		return situations;
	}

	public void setSituations(Set<String> situations) {
		this.situations = situations;
	}


	/**
	 * Creates a testPathElement with state and transition
	 *
	 * @param state State to be added to testPathElement
	 * @param transition Transition to be added to testPathElement
	 */
	public TestPathElement(State state, Transition transition) {
		super();
		this.state = state;
		this.transition = transition;
		this.isStub = false;

	}
	
	/**
	 * Creates a testPathElement with state, transition and context	
	 *
	 * @param state State to be added to testPathElement
	 * @param transition Transition to be added to testPathElement
	 * @param contexts Set of contexts to be added to testPathElement
	 */
	public TestPathElement(State state, Transition transition, Set<ContextElement> contexts) {
		super();
		this.state = state;
		this.transition = transition;
		this.contexts = contexts;
		this.isStub = false;
	}
	
	/**
	 * Creates a testPathElement with state, transition, context and situations
	 *
	 * @param state State to be added to testPathElement
	 * @param transition Transition to be added to testPathElement
	 * @param contexts Set of contexts to be added to testPathElement
	 * @param situations Set of situations to be added to testPathElement
	 */
	public TestPathElement(State state, Transition transition, Set<ContextElement> contexts, Set<String> situations) {
		super();
		this.setState(state);
		this.setTransition(transition);
		this.setContexts(contexts);
		this.setSituations(situations);
		this.isStub = false;
	}
	
	/**
	 * Creates a testPathElement with only a state
	 *
	 * @param state State to be added to testPathElement
	 */
	public TestPathElement(State state) {
		super();
		this.state = state;
		this.isStub = false;

	}
	
	/**
	 * Creates a stub state / stub testPathElement
	 */
	public TestPathElement() {
		super();
		this.isStub = true;
	}

	/**
	 * Checks if current ("this") testPathElement is a stub
	 * 
	 * @return true if testPathElement is a stub else false
	 */
	public Boolean isStub() {
		return this.isStub;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof TestPathElement)) return false;
		TestPathElement el = (TestPathElement)obj;
		if(this.state != el.getState() || this.transition != el.getTransition() || java.util.Objects.equals(this.getContexts(),el.getContexts())  || java.util.Objects.equals(this.getSituations(),el.getSituations()) ) return false;
		return true;
	}
}
