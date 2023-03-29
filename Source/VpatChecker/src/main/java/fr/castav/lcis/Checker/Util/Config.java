package fr.castav.lcis.Checker.Util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import org.xml.sax.SAXException;

/**
 * Configuration of the main
 * Allows to simplify the initialization phase.
 * 
 * @author baheuxbi
 *
 */
public class Config {
	
	private static Config INSTANCE = new Config();
	final static private String CONFIG_PATH = "config/config.xml";
	private static Document configDoc;
	
	private Config() {
	}
	
	public static Config getInstance() {
		return INSTANCE;
	}
	
	public void load() {
        try {
			InputStream is = INSTANCE.getConfigFileFromResourceAsStream(CONFIG_PATH);
			configDoc = INSTANCE.parseConfigFile(is);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public String getPatternFolderPath() {
		return configDoc.getElementsByTagName("patFolder").item(0).getTextContent();
	}
	
	public String getOutputFolderPath() {
		return configDoc.getElementsByTagName("outputFolder").item(0).getTextContent();
	}
	
	public String getTestFolderPath() {
		return configDoc.getElementsByTagName("testFolder").item(0).getTextContent();
	}
	
	private InputStream getConfigFileFromResourceAsStream(String path) throws FileNotFoundException {
		ClassLoader cl = getClass().getClassLoader();
		InputStream is = cl.getResourceAsStream(path);
		
		if(is == null) {
			throw new FileNotFoundException("config file not found");
		} else {
			return is;
		}
		
	} 
	
    private Document parseConfigFile(InputStream is)
            throws ParserConfigurationException,
            SAXException, IOException {
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(is);
        doc.getDocumentElement().normalize();
        return doc;
    }

}
