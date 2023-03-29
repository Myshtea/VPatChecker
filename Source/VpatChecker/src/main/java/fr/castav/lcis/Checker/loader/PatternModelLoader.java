package fr.castav.lcis.Checker.loader;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import fr.lcis.castav.vpat.VPATStandaloneSetup;

/**
 * Loader for the .vpat files
 * 
 * @author baheuxbi
 *
 */
public class PatternModelLoader implements ModelLoader {

	@Override
	public EObject load(String path) {
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new VPATStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(
		    URI.createURI(path), true);
		return resource.getContents().get(0);	
	}

}
