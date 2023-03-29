package fr.castav.lcis.Checker.model;

import fr.castav.lcis.Checker.Util.Util.TypeOfFunc;
import fr.castav.lcis.Checker.model.TestPaths.TestPath;
import fr.castav.lcis.Checker.model.TestPaths.TestPath.State.Dataflows.Dataflow;


/**
 * Interface of every parameter
 * A parameter must have : 
 * 	- A type : TypeOfFunc.Source, TypeOfFunc.Sink, TypeOfFunc.Input
 * 	- A name
 * 	- A way to check if it matches to its corresponding dataflow in a test
 * 
 * @author baheuxbi
 *
 */
public interface ParameterModel {
	public TypeOfFunc getType();
	public String getName();
	public boolean contains(TestPath pathToCheck, Dataflow val);
}
