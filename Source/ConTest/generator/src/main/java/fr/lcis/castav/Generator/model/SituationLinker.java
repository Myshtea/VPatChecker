package fr.lcis.castav.Generator.model;


import java.util.ArrayList;
import java.util.List;

import fr.lcis.castav.cdml.cDML.Situation;
import fr.lcis.castav.cdl.cDL.ContextExpression;
import fr.lcis.castav.cdl.cDL.ContextModel;
;

/**
 * A class to link the situation in a cdl language and the situation in a cbml language
 * 
 * The linking is made with a comparison of the name value of the situation.
 * An interesting upgrade would be to use the features of EMF to link both languages and change the hierarchy of the languages.
 * Thus we would not need this class.
 * 
 * @author baheuxbi
 *
 */
public class SituationLinker  {
	private fr.lcis.castav.cdl.cDL.Situation cdlSituation;
	private List<ContextElement> contextElement;
	
 	/**
	 * Creates the class by trying to find a set cbml situation in the contextModel
	 * Technically the cbml situation should always at least be included in the contextModel.
	 * 
	 * TODO : Handle exception when cbml situation is not found in contextModel.
	 * This means that the cbml is badly written or cdl is incomplete.
	 * 
	 * @param cbmlSituation A set situation defined by the cbml (behaviour language)
	 * @param contextModel The model of the context
	 */
	public SituationLinker(Situation cbmlSituation, ContextModel contextModel) {
		super();

		for(fr.lcis.castav.cdl.cDL.Situation cdlSit: contextModel.getSituations()) {

			if(cdlSit.getName().equals(cbmlSituation.getName())) {
				cdlSituation = cdlSit;
				break;
			}
		}
		if(cdlSituation == null) {
			System.out.println("PROBLEM WITH MODEL : NO SITUATION -> " + cbmlSituation.getName());
		}
	}
	
	/**
	 * Get the list of context values for validating the current context.
	 * Very limited function that will break when using more complex programs.
	 * 
	 * @return List of values as a string list
	 */
	public List<String> getSituationContextString(){
		List<String> contextToValue = new ArrayList<>();
		for(ContextExpression ex : cdlSituation.getExpression()) {
			contextToValue.add(ex.getValue().getName());
		}
		return contextToValue;
	}
	

	public List<ContextElement> getContextElement() {
		return contextElement;
	}

	public void setContextElement(List<ContextElement> contextElement) {
		this.contextElement = contextElement;
	}
	
}