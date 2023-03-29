/*
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.vpat.ui;

import com.google.inject.Injector;
import fr.lcis.castav.vpat.ui.internal.VpatActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class VPATExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(VpatActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		VpatActivator activator = VpatActivator.getInstance();
		return activator != null ? activator.getInjector(VpatActivator.FR_LCIS_CASTAV_VPAT_VPAT) : null;
	}

}
