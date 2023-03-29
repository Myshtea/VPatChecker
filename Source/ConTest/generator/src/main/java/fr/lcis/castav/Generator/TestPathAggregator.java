package fr.lcis.castav.Generator;

import java.lang.String;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import fr.lcis.castav.Generator.model.TestPath;
import fr.lcis.castav.Generator.model.TestPathElement;
import fr.lcis.castav.Generator.utils.Util;
import fr.lcis.castav.Generator.utils.Util.TypeOfState;
import fr.lcis.castav.cdml.cDML.State;
import fr.lcis.castav.cdml.cDML.SuperState;

/**
 * Combines every set of paths of every statemachine into a single set of full paths
 * 
 * @author baheuxbi
 *
 */
public class TestPathAggregator {
	
	private Map<String, Set<TestPath>> pathsMap;
	
	public TestPathAggregator(Map<String, Set<TestPath>> pathsMap) {
		this.pathsMap = pathsMap;
	}
	
	/**
	 * Helper function
	 * 
	 * Enhances a testPath with its subpaths if the testpath contains super states
	 * 
	 * @param path Testpath to enhance
	 * @return The set of testPaths generated or "path" itself if there is no super state in "path"
	 */
	private Set<TestPath> aggregatePath(TestPath path){
		Set<TestPath> finalMap = new HashSet<>();
		
		int i = 0;
		for(TestPathElement el : path.getElements()) {
			State st = el.getState();
			if(Util.checkTypeOfState(st) == TypeOfState.Super) {
				SuperState spSt = (SuperState) st;
				
				for(TestPath subPath: aggregate(spSt.getAbstracts().getName())) {
					TestPath tempPath;
					try {
						tempPath = (TestPath) path.clone();
						//System.out.println("Adding "+spSt.getName()+" subpaths ");

						finalMap.addAll(aggregatePath(tempPath.expand(i, subPath)));
					
						//System.out.println("Added "+finalMap.size());

					} catch (CloneNotSupportedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			i = i+1;
		}
		if (finalMap.size() == 0) {
			finalMap.add(path);
		}

		return finalMap;
	}
	
	/**
	 * Creates the set of fullpaths starting at the state "start"
	 * 
	 * @param start The state.name to start building fullpaths from
	 * @return The fullpaths starting from start
	 */
	public Set<TestPath> aggregate(String start){
		//System.out.println("Path "+start+" DOWN ");

		Set<TestPath> startMaps = pathsMap.get(start);
		Set<TestPath> finalMap = new HashSet<>();
		for(TestPath path : startMaps) {
			finalMap.addAll(aggregatePath(path));
		}
		//System.out.println("Path "+start+" UP ");

		
		return finalMap;
	}
	
	

	/*
	 * Aggregates current subpath to the set of complete paths "aggregatedPaths"
	 * If subpath has a superState -> finds the index and continues aggregation from the super state
	 *//*
	public Set<TestPath> aggregate(TestPath subpath) {
		Set<TestPath> aggregatedPaths = new HashSet<TestPath>();
		int superStateElIndex = this.getSuperStateElementIndex(subpath);
		if(superStateElIndex != -1) { // path has super state
			System.out.println("== 1");
			for(TestPath path: this.aggregate(subpath, superStateElIndex)) {
				aggregatedPaths.addAll(aggregate(path));
			}
		} else {
			System.out.println("== -1");
			aggregatedPaths.add(subpath);
		}
		return aggregatedPaths;
	}
	
	private Set<TestPath> aggregate(TestPath subpath, int superStateIndex) {
		Set<TestPath> aggregatedPaths = new HashSet<TestPath>();
		TestPathElement superStateEl = subpath.getElements().get(superStateIndex);
		System.out.println(superStateEl.getState());
		SuperState superState = (SuperState) superStateEl.getState();
		if(null != pathsMap.get(superState.getAbstracts().getName())) {
			for(TestPath path: pathsMap.get(superState.getAbstracts().getName())) {
				Transition externalTransition = getExternalTransition(path);
			if(externalTransition.getTarget().getName().equals(superStateEl.getTransition().getTarget().getName())) {
				aggregatedPaths.add(subpath.expand(superStateIndex, path));
				}
			}
		}
		return aggregatedPaths;
	}
	
	private Transition getExternalTransition(TestPath path) {
		for(TestPathElement el: path.getElements()) {
			if(el.getTransition() != null && el.getTransition().isExternal()) {
				return el.getTransition();
			}
		}
		return null;
	}
 
	
	private int getSuperStateElementIndex(TestPath path) {
		for (TestPathElement el: path.getElements()) { 
			if(el.getState() instanceof SuperState) {
				return path.getElements().indexOf(el);
			}
		}
		return -1;
	}*/
}
