package fr.lcis.castav.Generator.model;

import java.util.ArrayList;
import java.util.List;

import fr.lcis.castav.cdml.cDML.Context;
import fr.lcis.castav.cdl.cDL.BooleanType;
import fr.lcis.castav.cdl.cDL.ContextModel;
import fr.lcis.castav.cdl.cDL.ContextValue;
import fr.lcis.castav.cdl.cDL.DoubleType;
import fr.lcis.castav.cdl.cDL.IntegerType;
import fr.lcis.castav.cdl.cDL.Property;
import fr.lcis.castav.cdl.cDL.StringType;
import fr.lcis.castav.cdl.cDL.TypeRef;

/**
 * A class to link the context in a cdl language and the context in a cbml language
 * 
 * The linking is made with a comparison of the name value of the context.
 * An interesting upgrade would be to use the features of EMF to link both languages and change the hierarchy of the languages.
 * Thus we would not need this class.
 * 
 * @author baheuxbi
 *
 */
public class ContextLinker  {
	private fr.lcis.castav.cdl.cDL.Context cdlContext;
	private fr.lcis.castav.cdml.cDML.Context cbmlContext;
	
	/**
	 * Creates the class by trying to find a set cbml context in the contextModel
	 * Technically the cbml context should always at least be included in the contextModel.
	 * 
	 * TODO : Handle exception when cbml context is not found in contextModel.
	 * This means that the cbml is badly written or cdl is incomplete.
	 * 
	 * @param cbmlContext A set context defined by the cbml (behaviour language)
	 * @param contextModel The model of the context
	 */
	public ContextLinker(Context cbmlContext, ContextModel contextModel) {
		super();
		for(fr.lcis.castav.cdl.cDL.Context con: contextModel.getContexts()) {
			System.out.println("Comparing contexts " + con.getName() + " AND " + cbmlContext.getName());
			
			if(con.getName().equals(cbmlContext.getName())) {
				this.cdlContext = con;
				this.cbmlContext = cbmlContext;
				break;
			}
		}
	}
	
	/**
	 * Return the list of context values (properties) that this context holds
	 * For each property we simply append the values, this means that it is impossible to differenciate multiple properties.
	 * 
	 * TODO : Change to another return type to handle multiple properties
	 * 
	 * @return List of context values as a ContextElement list
	 */
	public List<ContextElement> getContextElementList(){
		List<ContextElement> cons = new ArrayList<ContextElement>();
		if (cdlContext == null) {
			return null;
		}
		for (Property p: cdlContext.getProperties()) {
			//System.out.println(p.getType().getClass().getSimpleName());
			if(p.getType() instanceof TypeRef) {
				TypeRef t = (TypeRef) p.getType();
				for(ContextValue c: t.getRef().getValues()) {
					cons.add(new ContextElement(this, c.getName()));
				}
			}
			else {
				if (p.getType() instanceof StringType){
					StringType t = (StringType) p.getType();
					cons.add(new ContextElement(this, t.getClass().getSimpleName()));
				}
				else if (p.getType() instanceof IntegerType){
					IntegerType t = (IntegerType) p.getType();
					cons.add(new ContextElement(this, t.getClass().getSimpleName()));
				}
				else if (p.getType() instanceof BooleanType){
					BooleanType t = (BooleanType) p.getType();
					cons.add(new ContextElement(this, t.getClass().getSimpleName()));
				}
				else if (p.getType() instanceof DoubleType){
					DoubleType t = (DoubleType) p.getType();
					cons.add(new ContextElement(this, t.getClass().getSimpleName()));
				}
			}	
			
		}
		return cons;
	}
	
	/**
	 * Return the list of context values (properties) that this context holds
	 * For each property we simply append the values, this means that it is impossible to differenciate multiple properties.
	 * 
	 * TODO : Change to another return type to handle multiple properties
	 * 
	 * @return List of context values as a list of strings
	 */
	public List<String> getContextStringList(){
		List<String> cons = new ArrayList<String>();
		if (cdlContext == null) {
			return null;
		}
		for (Property p: cdlContext.getProperties()) {
			//System.out.println(p.getType().getClass().getSimpleName());
			if(p.getType() instanceof TypeRef) {
				TypeRef t = (TypeRef) p.getType();
				for(ContextValue c: t.getRef().getValues()) {
					cons.add(c.getName());
				}
			}
			else {
				if (p.getType() instanceof StringType){
					StringType t = (StringType) p.getType();
					cons.add(t.getClass().getSimpleName());
				}
				else if (p.getType() instanceof IntegerType){
					IntegerType t = (IntegerType) p.getType();
					cons.add(t.getClass().getSimpleName());
				}
				else if (p.getType() instanceof BooleanType){
					BooleanType t = (BooleanType) p.getType();
					cons.add(t.getClass().getSimpleName());
				}
				else if (p.getType() instanceof DoubleType){
					DoubleType t = (DoubleType) p.getType();
					cons.add(t.getClass().getSimpleName());
				}
			}	
			
		}
		return cons;
	}

	public fr.lcis.castav.cdl.cDL.Context getCdlContext() {
		return cdlContext;
	}

	public void setCdlContext(fr.lcis.castav.cdl.cDL.Context cdlContext) {
		this.cdlContext = cdlContext;
	}

	public fr.lcis.castav.cdml.cDML.Context getCbmlContext() {
		return cbmlContext;
	}

	public void setCbmlContext(fr.lcis.castav.cdml.cDML.Context cbmlContext) {
		this.cbmlContext = cbmlContext;
	}
}