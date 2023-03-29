package fr.lcis.castav.Generator.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import fr.lcis.castav.Generator.utils.*;
import fr.lcis.castav.cdml.cDML.DataFlow;
import fr.lcis.castav.cdml.cDML.Parameter;
import fr.lcis.castav.cdml.cDML.Sink;
import fr.lcis.castav.cdml.cDML.Source;
import fr.lcis.castav.cdml.cDML.State;
import fr.lcis.castav.cdml.cDML.Transition;


/**
 * Class representing a path (a test or incomplete test)
 * Each step of the path contains a TestPathElement which defines a state,
 * 	possibly a transition (i.e the condition not the target), a possible context for the transition
 * 	and a possible situation for the transition (a situation being a combination of contexts)
 * 
 * @author baheuxbi
 *
 */
public class TestPath implements Cloneable{
	
	/**
	 * List of testPathElements representing a testPath
	 * A new testPathElement cannot be appended if last testPathElement has no transition
	 */
	private List<TestPathElement> elements = new ArrayList<TestPathElement>();
	
	public List<TestPathElement> getElements() {
		return elements;
	}
	
	private void setElements(List<TestPathElement> elements) {
		this.elements = elements;
	}
	
	/**
	 * Add a state to the current ("this") testPath
	 * 
	 * @param state The state to add to the testPath
	 */
	public void add(State state) {
		TestPathElement el = new TestPathElement(state);
		elements.add(el);
	}
	
	/**
	 * Add a transition with no context to the current ("this") testPath
	 * TODO : Handle a real exception when there is no transition in the last testPathElement
	 * 
	 * @param transition The transition to add to the testPath
	 */
	public void add(Transition transition) {
		if(elements.size() > 0) {
			if(elements.get(elements.size() - 1).getTransition() == null) {
				elements.get(elements.size() - 1).setTransition(transition);
			} else {
				System.out.println("Unable to add transition, consecutive transitions are not allowed");
			}
		} else {
			System.out.println("Unable to add transition, test path is empty");
		}
	}
	
	/**
	 * Add a full transition with contexts to the current ("this") testPath
	 * TODO : Handle a real exception when there is no transition in the last testPathElement
	 * 
	 * @param transition The transition to add to the testPath
	 * @param contexts The contexts to add to the transition
	 */
	public void add(Transition transition, Set<ContextElement> contexts) {
		if(elements.size() > 0) {
			if(elements.get(elements.size() - 1).getTransition() == null) {
				elements.get(elements.size() - 1).setTransition(transition);
				elements.get(elements.size() - 1).setContexts(contexts);
			} else {
				System.out.println("Unable to add transition, consecutive transitions are not allowed");
			}
		} else {
			System.out.println("Unable to add transition, test path is empty");
		}
	}
	
	/**
	 * Add a full transition with contexts and situations to the current ("this") testPath
	 * TODO : Handle a real exception when there is no transition in the last testPathElement
	 * 
	 * @param transition The transition to add to the testPath
	 * @param contexts The contexts to add to the transition
	 * @param situations The situations to add to the transition
	 */
	public void add(Transition transition, Set<ContextElement> contexts, Set<String> situations) {
		if(elements.size() > 0) {
			if(elements.get(elements.size() - 1).getTransition() == null) {
				elements.get(elements.size() - 1).setTransition(transition);
				elements.get(elements.size() - 1).setContexts(contexts);
				elements.get(elements.size() - 1).setSituations(situations);
			} else {
				System.out.println("Unable to add transition, consecutive transitions are not allowed");
			}
		} else {
			System.out.println("Unable to add transition, test path is empty");
		}
	}
	
	/**
	 * Add a stub element to the end of current ("this") testPath
	 * Example:
	 * 		A -> B (with A,B States and "->" transition)
	 * 		result = A -> B stubTransition stubState
	 * This stub is here when we need to provide context when aggregating paths
	 * TODO : Handle a real exception when there is no transition in the last testPathElement
	 * 
	 * @param contexts Context added to the stub transition 
	 */
	public void add(Set<ContextElement> contexts) {
		if(elements.size() > 0) {
			if(elements.get(elements.size() - 1).getTransition() == null) {
				elements.get(elements.size() - 1).setContexts(contexts);
				TestPathElement el = new TestPathElement();
				elements.add(el);
			} else {
				System.out.println("Unable to add transition, consecutive transitions are not allowed");
			}
		} else {
			System.out.println("Unable to add transition, test path is empty");
		}
	}
	

	
	/**
	 * Pretty print of current ("this") testPath
	 * 
	 */
	public void prettyPrint() {
		for(TestPathElement el: elements) {
			if(!el.isStub()) {
				Util.colprint(5,"state");
				System.out.print(" -> ");
				Util.colprint(7,el.getState().getName()+"\n");		
				if(el.getTransition() != null || el.getContexts()!=null) {
					System.out.print("  "); Util.colprint(3, "event"); 
				}
				if(el.getTransition() != null) {
					System.out.print(" -> ");
					Util.colprint(4,el.getTransition().getOn() == null ? "null" : el.getTransition().getOn().getName());
				}
				if(el.getContexts() != null && !el.getContexts().isEmpty()) {
					if(el.getTransition() == null) {
						System.out.print(" -> ");
						Util.colprint(4, "StubTransition");
					}
					Iterator<ContextElement> it = el.getContexts().iterator();
					Util.colprint(8, " with context ");
					while(it.hasNext()) {
						Util.colprint(6, it.next().getContextValue()+" ");
						if (it.hasNext()) {
							Util.colprint(8, " AND ");
						}
					}
				}
				if(el.getSituations() != null && !el.getSituations().isEmpty()) {
					Iterator<String> it = el.getSituations().iterator();
					Util.colprint(8, "[");
					while(it.hasNext()) {
						Util.colprint(3, it.next()+" ");
						if (it.hasNext()) {
							Util.colprint(8, " AND ");
						}
					}
					Util.colprint(8, "]");
	
				}
				System.out.print("\n");
			}
			else {
				Util.colprint(5,"state");
				System.out.print(" -> ");
				Util.colprint(7,"StubState\n");	
			}
		}
		System.out.println("");
		System.out.println("----------------------------------------------------------");
		System.out.println("");
	}
	
	/**
	 * Checks if testPath contains a specific transition "trans"
	 * 
	 * @param trans Transition to check
	 * @return true if trans is in elements else false
	 */
	public Boolean contains(Transition trans) {
		for (TestPathElement el: elements) {
			if( el.getTransition() != null && el.getTransition().equals(trans) ) {
				return true;
			}
		}
		return false;
		
	}
	
	/**
	 * Copies the transition of "tpe" into the last transition of the current ("this") testpath
	 * Does not copy context or situation
	 * 
	 * @param tpe TestPathElement to copy transition from
	 */
	public void fuse(TestPathElement tpe) {
		this.elements.get(elements.size()-1).setTransition(tpe.getTransition());
	}
	
	
	/**
	 * Copies the testPathElement at index start to lastStateToCopy from "testPath" to the end of the current ("this") testPath 
	 * 
	 * /!\ Modifies current ("this") testpath
	 * 
	 * @param path Path to copy
	 * @param start Starting index to copy
	 * @param lastStateToCopy Last index to copy
	 * @return Result testPath 
	 */
	private TestPath copy(TestPath path, int start, int lastStateToCopy) {
		int j = 0;
    	for (TestPathElement t: path.getElements()) {
    		if(j < start) {
    			j++;
    			continue;
    		}
    		if(!t.isStub()) {
	    		this.add(t.getState());
	    		this.add(t.getTransition(), t.getContexts(), t.getSituations());
    		}
    		//System.out.println("Added step "+t.getState().getName());
    		if (j < lastStateToCopy) {
    			j++;
    		}
    		else {
    			break;
    		}
    	}
    	return this;
	}
	
	/**
	 * Combines the current testPath with another path from the TestPathElement number "superStateIndex"
	 * Example : 
	 * 	this = A -> B -> C; superStateIndex = 1; path = H -> I -> J (A,B,C,H,I,J being testPathElements)
	 * 		return = A -> H -> I -> J -> C
	 *				with J taking the transition (not the context or the situation) of B
	 * 
	 * We stop at the last non-stub TestPathElement of "path" then continue with "this"
	 * 
	 * /!\ The current testPath ("this"), is not modified only a copy is outputted
	 * 			TODO : To prevent misuse change "this" to another parameter ?
	 * 
	 * @param superStateIndex The index at which we add "path" into "this"
	 * @param path The path to add into "this"
	 * @return The combination of "path" added into "this" (see general description)
	 */
	public TestPath expand(int superStateIndex, TestPath path) {
		//System.out.println("====================================================================================");
		TestPath expanded = new TestPath();
		expanded.copy(this, 0,superStateIndex - 1);
		
		//expanded.print();
		
		expanded.copy(path, 0, path.getElements().size()-1);
				
		//Fuse last of path with superstate transition
		expanded.fuse(this.getElements().get(superStateIndex));
		
		
		//expanded.print();
		
		expanded.copy(this, superStateIndex+1, this.elements.size());

		//expanded.print();
		
		//System.out.println("====================================================================================");
		
		return expanded;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof TestPath)) return false;
		TestPath path = (TestPath)obj;
		if(path.getElements().size() != this.elements.size()) return false;
		for(int i = 0; i < this.elements.size(); i++) {
			if(this.elements.get(i) != this.getElements().get(i)) {
				return false;
			}
		}
		return true;
	}
	
	
    @Override
    public TestPath clone() throws CloneNotSupportedException {
    	TestPath newpath = (TestPath) super.clone();
 
        // primitive fields are ignored, as their content is already copied
        // immutable fields like string are ignored
 
        // create new objects for any non-primitive, mutable fields
    	newpath.elements = new ArrayList<TestPathElement>();
    	
    	for (TestPathElement t: this.elements) {
    		newpath.add(t.getState());
    		newpath.add(t.getTransition(), t.getContexts(), t.getSituations());
    	}
 
        return newpath;        // return deep copy
    }
    
    public Element toXML() throws ParserConfigurationException {
    	DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
    	Document doc = docBuilder.newDocument();
    	
    	Element rootElement = doc.createElement("TestPath");
    	doc.appendChild(rootElement);
    	for(TestPathElement el : elements) {
    		Element newEl = doc.createElement("state");
    		newEl.setAttribute("name", el.getState().getName());
    		rootElement.appendChild(newEl);
    		if(el.getTransition() != null) {
    			Element trans = doc.createElement("transition");
    			trans.setAttribute("name", el.getTransition().getOn().getName());
    			newEl.appendChild(trans);
    			if(el.getContexts() != null) {
    				Element contexts = doc.createElement("contexts");
    				trans.appendChild(contexts);
    				for(ContextElement con: el.getContexts()) {
    					Element context = doc.createElement("context"); //TODO str -> Context
    					context.setAttribute("origin", con.getOrigin().getCdlContext().getName());
    					context.setTextContent(con.getContextValue());
    					contexts.appendChild(context);
    				}
    			}
    			if(el.getSituations() != null) {
    				Element situations = doc.createElement("situations");
    				trans.appendChild(situations);
	    			for(String str: el.getSituations()) {
    					Element situation = doc.createElement("situation"); //TODO str -> situation
    					situation.setAttribute("origin", "DEFAULT_ORIGIN");
    					situation.setTextContent(str);
    					situations.appendChild(situation);
	    			}
    			}
    		}
    		
    		if(el.getState().getDataflows() != null && el.getState().getDataflows().size() != 0) {
    			Element dataflowsEl = doc.createElement("dataflows");
        		newEl.appendChild(dataflowsEl);
        		for(DataFlow d: el.getState().getDataflows()) {
        			Element dataflow = doc.createElement("dataflow");
        			dataflowsEl.appendChild(dataflow);
        			d.setName(Util.removeQuote(d.getName()));
        			//FIND INSTANCE
        			if (d instanceof Sink) {
        				Sink dSink = (Sink) d;
        				dataflow.setAttribute("type","Sink");
        				dataflow.setAttribute("name",dSink.getName());
        				if(dSink.getParameters() != null && dSink.getParameters().size() != 0) {
        					Element parameters = doc.createElement("parameters");
        					dataflow.appendChild(parameters);
        					for(Parameter p : dSink.getParameters()) {
            					Element parameter = doc.createElement("parameter");
            					if( p.isWildcard() ) {
            						parameter.setAttribute("origin", "any");
            						parameter.setTextContent("*");
            					}
            					else if ( p.isSource() ) {
            						parameter.setAttribute("origin", "source");
            						parameter.setTextContent(p.getOrigin().getName());
            					}
            					else {
            						parameter.setAttribute("origin", "value");
            						parameter.setTextContent(p.getValue());
            					}
            					parameters.appendChild(parameter);
            				}
        				}
        				
        			}
        			else if(d instanceof Source){
        				Source dSource = (Source) d;
        				//System.out.println("IS aware "+atom.isContextAware());
        				if (dSource.isInput()) {
        					dataflow.setAttribute("type", "Input");
        				}
        				else {
        					dataflow.setAttribute("type", "Source");
        				}
        				dataflow.setAttribute("name",dSource.getName());
        			}
        			
        			
        			
        			
        		}
    		}
    	}
    	
    	
    	//DOMSource source = new DOMSource(doc);
    	return rootElement;
    }

}
