package fr.castav.lcis.Checker.model;

import fr.castav.lcis.Checker.Util.Util.TypeOfFunc;
import fr.castav.lcis.Checker.model.TestPaths.TestPath;
import fr.castav.lcis.Checker.model.TestPaths.TestPath.State.Dataflows.Dataflow;
import fr.lcis.castav.vpat.vPAT.Input;

/**
 * Model for an input of the vulnerability model
 * 
 * @author baheuxbi
 *
 */
public class InputModel implements ParameterModel {

	String name;
	String method;
	
	
	public InputModel(Input input) {
		this.name = input.getName();
		this.method = input.getMethod();
	}
	
	
	public String getMethod() {
		return this.method;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Input) {
			Input input = (Input) obj;
			if( input.getMethod() != this.getMethod()) return false;
		}
		else if (obj instanceof InputModel) {
			InputModel inputModel = (InputModel) obj;
			if( inputModel.getName() != this.getName()) return false;
			if( inputModel.getMethod() != this.getMethod()) return false;
		}
		else {
			return false;
		}
		
		return true;
	}
	

	@Override
	public TypeOfFunc getType() {
		return TypeOfFunc.Input;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		String ret = "SourceModel [name=" + name;
		ret += ", method="+method+"]";

		return ret;
	}

	/**
	 * Checks if a testpath's input matches with this input
	 * 
	 * @parma pathToCheck The path whose input we check
	 * @param sink The input of the testpath
	 * @return True if the input matches else False
	 */
	@Override
	public boolean contains(TestPath pathToCheck, Dataflow input) {
		// If type is not input
		if(!input.getType().equals("Input")) return false;
		
		// If name (method) is not the same
		if(!input.getName().equals(this.getMethod())) return false;
		
		return true;
	}
}
