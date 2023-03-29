package fr.lcis.castav.Generator.loaders;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import fr.lcis.castav.Generator.model.StaticContext;


/**
 * Loader for the Android Manifest Files files
 * 
 * @author baheuxbi
 *
 */
public class ManifestLoader {

	Document manifest;
	
	/**
	 * This function loads the Manifest of the android application
	 * 
	 * @param path to the android manifest
	 * @return The document to be interpreted as an xml file
	 */
	public Document load(String path) {
		File xmlFile = new File(path);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;		
		Document doc = null;
		try {
			builder = factory.newDocumentBuilder();

			doc = builder.parse(xmlFile);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		manifest = doc;
		return doc;
	}
	
	/**
	 * Same as Document.getElementsByTagName
	 * @param tag Tag used to find the nodelist with the tag "tag"
	 * @return The nodelist of nodes with the tag "tag"
	 */
	public NodeList getElementsByTagName(String tag) {
		return manifest.getElementsByTagName(tag);
	}
	
	/**
	 * Build the static context from the android manifest
	 * This should contain information like (TODO) :
	 * 	- Android network configuration
	 *  ...
	 * @return The staticContext object containing the parsed information
	 */
	public StaticContext getStaticContext() {
		//TODO
		//StaticContext sc = new StaticContext();
		return null;
	}

}
