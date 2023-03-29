package fr.lcis.castav.Generator.model;

import java.util.ArrayList;
import java.util.List;

import fr.lcis.castav.Generator.utils.Util;
import fr.lcis.castav.cdml.cDML.Cdml;
import fr.lcis.castav.cdml.cDML.StaticContexts;

public class StaticContext {	
	
	
	List<StaticContextGroup> contexts;

	
	public StaticContext(Cdml cbmlModel) {
		/**
		 * minimum sdk version
		 * Default value is 1 if not set 
		 * source : https://developer.android.com/guide/topics/manifest/uses-sdk-element
		 */
		int minSdk=1;
		
		/**
		 * target sdk version
		 * -1 means that targetSdk == minSdk
		 * source : https://developer.android.com/guide/topics/manifest/uses-sdk-element
		 */
		int targetSdk=-1;
		
		/**
		 * max sdk version
		 * -1 means that the value is not set (as such max value is target)
		 */
		int maxSdk=-1;
		
		
		contexts = new ArrayList<StaticContextGroup>();
		for(StaticContexts sc: cbmlModel.getStaticContexts()) {
			for(fr.lcis.castav.cdml.cDML.StaticContext staticContext : sc.getStaticContexts()) {
				if(staticContext.getName().equals("minSdk") && Util.isNumeric(staticContext.getValue())) {
					minSdk = Integer.valueOf(staticContext.getValue());
				}
				else if(staticContext.getName().equals("targetSdk") && Util.isNumeric(staticContext.getValue())) {
					targetSdk = Integer.valueOf(staticContext.getValue());
				}
				else if(staticContext.getName().equals("maxSdk") && Util.isNumeric(staticContext.getValue())) {
					maxSdk = Integer.valueOf(staticContext.getValue());
				}
			}
		}
		System.out.println("min" + minSdk + "max" + maxSdk + "target" + targetSdk);

		int max = (maxSdk == -1) ? targetSdk : maxSdk;
		for (int i = minSdk; i <= max; i = i + 1) {
			contexts.add(new StaticContextGroup(i));
		}
		
		
	}

	
	/**
	 * Contains a set of static contexts.
	 * Each group will multiply the number of tests generated
	 * 
	 * For now (09/01/2023) only api version is supported
	 *  
	 * @author baheuxbi
	 *
	 */
	public class StaticContextGroup {
		public int getAPIVersion() {
			return APIVersion;
		}


		public void setAPIVersion(int aPIVersion) {
			APIVersion = aPIVersion;
		}


		int APIVersion;
		
		
		public StaticContextGroup(int APIVersion) {
			this.APIVersion = APIVersion;
		}
	}


	public List<StaticContextGroup> getGroups() {
		return contexts;
	}
}
