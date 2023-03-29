package fr.castav.lcis.Checker.model;


import fr.castav.lcis.Checker.Util.Util.TypeOfFunc;
import fr.castav.lcis.Checker.model.TestPaths.TestPath;
import fr.castav.lcis.Checker.model.TestPaths.TestPath.State.Dataflows.Dataflow;
import fr.lcis.castav.vpat.vPAT.Source;

/**
 * Model for a source of the vulnerability model
 * A model can either be a specific function or any private data source
 * TODO : expand source to define a specific private data (like localisation) so that it matches to a multiplicity of different methods
 * 
 * @author baheuxbi
 *
 */
public class SourceModel implements ParameterModel {
	String name;
	boolean anyPrivate = false;
	String method;
	
	
	public SourceModel(Source source) {
		this.name = source.getName();
		this.anyPrivate = source.isAnyPrivate();
		if(this.anyPrivate == false) {
			this.method = source.getMethod();
		}
	}
	
	
	public boolean isPrivateWildcard() {
		return anyPrivate;
	}
	
	public boolean hasMethod() {
		return !anyPrivate;
	}
	
	public String getMethod() {
		return this.hasMethod() ? this.method : null;
	}

	/**
	 * Checks if the source of a specific testpath matches with this source 
	 * Dangerous :
	 * Sources use their method as their name => if two sources come from the same method they will have unexpected values
	 *   TODO : Handle this -> maybe add method field and use an ID instead
	 *   
	 * @parma pathToCheck The path whose source we check
	 * @param source The source of the testpath
	 * @return True if the source matches else False
	 */
	@Override
	public boolean contains(TestPath pathToCheck, Dataflow source) {
		// If type is not sink
		if(!source.getType().equals("Source")) return false;
		
		
		// If vulnerability pattern accepts all sources 
		if(this.isPrivateWildcard()) return true;
		
		// If name (method) is not the same
		if(!source.getName().equals(this.getMethod())) return false;
		
		return true;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Source) {
			Source source = (Source) obj;
			if( source.isAnyPrivate() != this.anyPrivate) return false;
			if( !this.anyPrivate && source.getMethod() != this.getMethod() ) return false;
		}
		else if (obj instanceof SourceModel) {
			SourceModel sourceModel = (SourceModel) obj;
			if(sourceModel.getName() != this.getName()) return false;
			if( sourceModel.getMethod() != this.getMethod()) return false;
		}
		else {
			return false;
		}
		
		return true;
	}
	
	@Override
	public TypeOfFunc getType() {
		return TypeOfFunc.Source;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	
	@Override
	public String toString() {
		String ret = "SourceModel [name=" + name;
		if (this.hasMethod()) {
			ret += ", method="+method+"]";
		}
		if(this.isPrivateWildcard()) {
			ret += ", AnyValue]";
		}
		return ret;
	}
}
