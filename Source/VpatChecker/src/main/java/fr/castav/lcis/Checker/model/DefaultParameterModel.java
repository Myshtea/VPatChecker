package fr.castav.lcis.Checker.model;

import fr.castav.lcis.Checker.Util.Util;
import fr.castav.lcis.Checker.Util.Util.TypeOfFunc;
import fr.castav.lcis.Checker.model.TestPaths.TestPath;
import fr.castav.lcis.Checker.model.TestPaths.TestPath.State.Dataflows.Dataflow;

/**
 * Model for a parameter that is not a source, sink nor input of a vulnerability model
 * This model is either a specific static value or any value (*).
 * 
 * @author baheuxbi
 *
 */
public class DefaultParameterModel implements ParameterModel {
	String name;
	String value;
	boolean isAny = false;
	
	
	public DefaultParameterModel() {
		this.name = "String";
		this.isAny = true;
	}
	
	public DefaultParameterModel(String value) {
		this.name = "String";
		this.value = Util.removeQuote(value);
	}

	
	public boolean isAny() {
		return isAny;
	}
	
	public boolean hasValue() {
		return !isAny;
	}
	
	public String getValue() {
		return this.hasValue() ? this.value : null;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof String) {
			String val = (String) obj;
			if( val == "*" && !this.isAny()) return false;
			if( val != "*" && this.isAny()) return false;
			if( val != this.getValue() ) return false;
		}
		else if (obj instanceof DefaultParameterModel) {
			DefaultParameterModel model = (DefaultParameterModel) obj;
			if( model.getName() != this.getName()) return false;
			if( model.getValue() != this.getValue()) return false;
		}
		else {
			return false;
		}
		
		return true;
	}
	
	@Override
	public TypeOfFunc getType() {
		return TypeOfFunc.Value;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		String ret = "DefaultModel [name=" + name;
		if (this.hasValue()) {
			ret += ", value="+value+"]";
		}
		if(this.isAny()) {
			ret += ", AnyValue]";
		}
		return ret;
	}
	
	/**
	 * Checks if a testpath's parameter matches with this parameter
	 * A default parameter has the specificity that it can match with a static value (what this really models) 
	 *   but it can also match with an input.
	 * This is due to the fact that we can transform an input into any sort of value we want, so a static value in a pattern 
	 *   can be recreated with an input in a real test
	 *   
	 * The problem is that a static value is not a dataflow in a testpath, thus it can never call contains(path,dataflow)
	 *   so we just assume that if we enter this method, that means that its either an input or they do not match
	 * 
	 * WARNING : The check to see if a static value in a path checks with the parameter of a vulnerability must be made in a higher level function
	 *   in our simplematcher, as we only use SinkModel.contains() we know that this is handled by SinkModel.contains()
	 * 
	 * @parma pathToCheck The path whose parameter we check
	 * @param sink The parameter of the testpath
	 * @return True if the parameter matches else False
	 */
	@Override
	public boolean contains(TestPath pathToCheck, Dataflow df) {
		//DefaultParameter is either the a value like df or
		//  df is an input that can be the same as the value
		//  In this contains we assume that df is not a value (as value cannot be a dataflow, only parameter)

		// If type is not input
		if(!df.getType().equals("Input")) return false;
		
		/**
		 * I'd consider this a hack, maybe it would be best to find a better architecture to change the next line.
		 * If the path's dataflow is an input then we need to set its value to the value of the vulnerability's parameter
		 */ //TODO REMOVE PLEASE, this does not copy to a new path, it changes it for everyone !!!!!
		df.setValue(this.getValue());
		
		return true;
	}
	
}
