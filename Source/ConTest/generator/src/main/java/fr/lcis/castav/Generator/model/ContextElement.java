package fr.lcis.castav.Generator.model;

/**
 * Class defining a ContextElement TODO 
 * I AM VERY FIER : J'ai besoin de vacances 
 * 
 * @author baheuxbi
 *
 */
public class ContextElement  {
	public ContextElement(ContextLinker origin, String contextValue) {
		super();
		this.origin = origin;
		this.contextValue = contextValue;
	}
	
	ContextLinker origin;
	String contextValue;
	
	
	public ContextLinker getOrigin() {
		return origin;
	}
	public void setOrigin(ContextLinker origin) {
		this.origin = origin;
	}
	public String getContextValue() {
		return contextValue;
	}
	public void setContextValue(String contextValue) {
		this.contextValue = contextValue;
	}
	
	@Override
	public boolean equals(Object obj) {

		if(!(obj instanceof ContextElement)) return false;
		ContextElement el = (ContextElement)obj;
		if(!el.getContextValue().equals(this.contextValue)) return false;
		if(el.getOrigin() != this.getOrigin()) return false;
		return true;
	}
	
}
