/*
 * generated by Xtext 2.28.0
 */
package fr.lcis.castav.vpat;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class VPATStandaloneSetup extends VPATStandaloneSetupGenerated {

	public static void doSetup() {
		new VPATStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
