/*
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class CDLStandaloneSetup extends CDLStandaloneSetupGenerated {

	public static void doSetup() {
		new CDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
