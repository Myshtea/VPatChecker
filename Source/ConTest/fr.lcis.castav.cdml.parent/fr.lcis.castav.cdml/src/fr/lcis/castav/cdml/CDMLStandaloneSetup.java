/*
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdml;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class CDMLStandaloneSetup extends CDMLStandaloneSetupGenerated {

	public static void doSetup() {
		new CDMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}