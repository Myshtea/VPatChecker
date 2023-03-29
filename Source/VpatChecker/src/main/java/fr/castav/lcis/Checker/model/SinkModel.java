package fr.castav.lcis.Checker.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.castav.lcis.Checker.Util.Util;
import fr.castav.lcis.Checker.Util.Util.TypeOfFunc;
import fr.lcis.castav.vpat.vPAT.Input;
import fr.lcis.castav.vpat.vPAT.Parameter;
import fr.lcis.castav.vpat.vPAT.Sink;
import fr.lcis.castav.vpat.vPAT.Source;
import fr.castav.lcis.Checker.model.TestPaths.TestPath;
import fr.castav.lcis.Checker.model.TestPaths.TestPath.State.Dataflows.Dataflow;
import fr.castav.lcis.Checker.model.TestPaths.TestPath.State.Dataflows.Dataflow.Parameters;

/**
 * Model for a sink of the vulnerability model
 * 
 * @author baheuxbi
 *
 */
public class SinkModel implements ParameterModel {

	String name;
	List<ParameterModel> parameters;
	
	/**
	 * Constructor for the sink.
	 * The sink being defined by its parameters we have to parse every parameter of the pattern and link them to "parameters"
	 * 
	 * @param sink
	 */
	public SinkModel(Sink sink) {
		if(sink.getName().charAt(0) == '\"') sink.setName(sink.getName().substring(1));
		if(sink.getName().charAt(sink.getName().length() - 1) == '\"') sink.setName(sink.getName().substring(0, sink.getName().length()-1));
		this.name = sink.getName();
		parameters = new ArrayList<ParameterModel>();
		for(Parameter p : sink.getParameter()) {
			//System.out.println(p.getOrigin().getClass());
			if(p.getOrigin() != null) {
				if(p.getOrigin() instanceof Source) {
					Source s = (Source) p.getOrigin();
					parameters.add(new SourceModel(s));
				}
				else if (p.getOrigin() instanceof Input) {
					Input s = (Input) p.getOrigin();
					parameters.add(new InputModel(s));
				}				
				else if (p.getOrigin() instanceof Sink) {
					Sink s = (Sink) p.getOrigin();
					parameters.add(new SinkModel(s));
				}
			}
			else {
				if(p.isAnyValue()){
					parameters.add(new DefaultParameterModel());
				}
				else {
					parameters.add(new DefaultParameterModel(p.getValue()));
				}
			}
		}
	}
	
	/**
	 * Checks if a testpath's sink matches with this sink
	 * Like the constructor, the sink's contains method is more complex than other models because we have to match every parameter
	 * 
	 * @parma pathToCheck The path whose sink we check
	 * @param sink The sink of the testpath
	 * @return True if the sink matches else False
	 */
	@Override
	public boolean contains(TestPath pathToCheck, Dataflow sink) {
		
		//System.out.println("Checking "+sink.getName() + " of type : "+sink.getType()+ " on sinkModel "+this.getName());
		
		// If type is not sink
		if(!sink.getType().equals("Sink")) return false;

		// If name (method) is not the same
		if(!sink.getName().equals(this.getName())) return false;
		//System.out.println("same name");

		
		Parameters testParameters = ((Parameters) sink.getParameters());
		// If there is no parameters in one but at least one in the other
		if((testParameters != null && this.getParameters() == null) || (testParameters == null && this.getParameters() != null)) return false;

		// If there is parameters but they don't have the same number
		if(testParameters != null && this.getParameters() != null) {
			if(testParameters.getParameter().size() != this.getParameters().size()) return false;
		}
		else {
			return true;
		}

		//System.out.println("same number of parameters");

		
		// If we are here we have two parameter lists of the same size and not empty.
		Iterator<fr.castav.lcis.Checker.model.TestPaths.TestPath.State.Dataflows.Dataflow.Parameters.Parameter> iter = testParameters.getParameter().iterator();
		fr.castav.lcis.Checker.model.TestPaths.TestPath.State.Dataflows.Dataflow.Parameters.Parameter tempParameter;

		Dataflow df;
		for(ParameterModel param: this.parameters) {

			tempParameter = iter.next();
			System.out.println("Type "+param.getType());
			switch(param.getType()) {
				case Sink:
					// Find origin of tempParameter in dataflows
					df = Util.findParameterInDataflows(pathToCheck, tempParameter);
					
					// Exit if tempParameter has no origin (SINK should always have one)
					if (df == null) return false;
					
					// If the parameter of the pattern contains the test
					if(!((SinkModel) param).contains(pathToCheck,df)) return false;
					break;
				case Source:
					// Find origin of tempParameter in dataflows
					df = Util.findParameterInDataflows(pathToCheck, tempParameter);

					// Exit if tempParameter has no origin (Source should always have one)
					if (df == null) return false;

					// If the parameter of the pattern contains the test
					if(!((SourceModel) param).contains(pathToCheck,df)) return false;
					break;
				case Input: //Does this have a reason to exist ?
					// Find origin of tempParameter in dataflows
					df = Util.findParameterInDataflows(pathToCheck, tempParameter);
					
					// Exit if tempParameter has no origin (Input should always have one)
					if (df == null) return false;
					
					// If the parameter of the pattern contains the test
					if(!((InputModel) param).contains(pathToCheck,df)) return false;
					break;
				case Value:
					//Check if tempParameter has origin
					df = Util.findParameterInDataflows(pathToCheck, tempParameter);
					
					// Exit if tempParameter has no origin and values are different (i.e tempParam is a value and is different from param)
					if (df == null) {
						if(!( (DefaultParameterModel) param).getValue().equals(tempParameter.getValue())) return false;
					}
					else {
						// If df == null, then df must be Input, else we exit
						if(!((DefaultParameterModel) param).contains(pathToCheck,df)) return false;
					}

					break;
				default:
					System.out.println("ERROR : [SinkModel] PARAMETER IS NOT OF ANY TYPE");
					return false;
			}
		}

		return true;
	}
	
	public List<ParameterModel> getParameters() {
		return parameters;
	}

	public void setParameters(List<ParameterModel> parameters) {
		this.parameters = parameters;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public TypeOfFunc getType() {
		return TypeOfFunc.Sink;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		String ret = "SinkModel [name=" + name + ", parameters:\n";
		if( this.parameters != null ) {
			Iterator <ParameterModel> it = parameters.iterator();
			while(it.hasNext()) {
				ret += "---  ";
				ret += it.next().toString();
				if(it.hasNext()) {
					ret += ",\n";
				}
				ret += "]";
			}
		}
		return ret;
	}

}
