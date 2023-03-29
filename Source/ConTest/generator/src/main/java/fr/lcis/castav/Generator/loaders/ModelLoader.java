/**
 * 
 */
package fr.lcis.castav.Generator.loaders;

import org.eclipse.emf.ecore.EObject;

/**
 * @author asadwan
 *	loads an ECORE model from the file system
 */
public interface ModelLoader {
	
	EObject load(String path);
}
