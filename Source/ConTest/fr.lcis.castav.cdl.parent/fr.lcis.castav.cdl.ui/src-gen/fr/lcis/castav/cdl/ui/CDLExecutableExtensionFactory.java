/*
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdl.ui;

import com.google.inject.Injector;
import fr.lcis.castav.cdl.ui.internal.CdlActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CDLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(CdlActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		CdlActivator activator = CdlActivator.getInstance();
		return activator != null ? activator.getInjector(CdlActivator.FR_LCIS_CASTAV_CDL_CDL) : null;
	}

}