package fr.castav.lcis.Checker.loader;

import org.eclipse.emf.ecore.EObject;

public interface ModelLoader {
	
	EObject load(String path);
}
