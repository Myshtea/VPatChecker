package fr.castav.lcis.Checker.model;

import fr.lcis.castav.vpat.vPAT.Context;
import fr.lcis.castav.vpat.vPAT.Version;
import fr.lcis.castav.vpat.vPAT.Vulnerability;

/**
 * Model for the static model of a vulnerability pattern
 * For now (27/01) the model is incomplete and limited to the api version
 * The problem with modelling the static context is that it can have a lot of different forms so the model feels like a list
 * Maybe it could be interesting to rethink the whole static model part. Else we can simply fill for every context
 * 
 * @author baheuxbi
 *
 */
public class StaticContextModel {
	/**
	 * Shows if there is no static model
	 */
	boolean isEmpty = true;
	
	int APIVersion = -1;
	
	public StaticContextModel(Vulnerability vuln) {
		for(Context context : vuln.getContext()) {
			if(context.isNetwork()) {
				//TODO
				isEmpty = false;
			}
			else if(context.isPermission()){
				//TODO
				isEmpty = false;
			}
			else if(context.isVersion()) {
				APIVersion = Integer.valueOf(((Version) context.getValue()).getName());
				isEmpty = false;
			}
		}
	}

	@Override
	public String toString() {
		String ret = "NO STATICMODEL IMPLEMENTATION FOR NOW";

		if (APIVersion != -1) {
			ret = "API "+String.valueOf(APIVersion);
		}
		
		return ret;
	}

	public int getAPIVersion() {
		return APIVersion;
	}

	public void setAPIVersion(int aPIVersion) {
		APIVersion = aPIVersion;
	}
	
	public boolean isEmpty() {
		return this.isEmpty;
	}
}
