package fr.lcis.castav.Generator.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import fr.lcis.castav.Generator.model.StaticContext;
import fr.lcis.castav.Generator.model.TestPath;
import fr.lcis.castav.Generator.model.StaticContext.StaticContextGroup;
import fr.lcis.castav.cdml.cDML.Statemachine;

public class TestPathPrinter {
	
	public static boolean OutputTest(Set<TestPath> fullPaths, StaticContext staticContext, String componentName, Statemachine sm) {
		String fileName = "";
		String prefix = "Main_";
		String postfix = ".xml";
		

		Iterator<TestPath> it = fullPaths.iterator();
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		try {
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			StreamResult result;
			
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	    	DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	    	Document doc = docBuilder.newDocument();
	    	
	    	Element rootElement = doc.createElement("TestPaths");
	    	Element staticContextElement = doc.createElement("StaticContext");
	    	rootElement.appendChild(staticContextElement);

	    	rootElement.setAttribute("exported", "false");
	    	rootElement.setAttribute("component", componentName.replace("\"", ""));

	    	
	    	if(sm != null) {
		    	String permType = "None";
		    	if(sm.getPermission() != null) {
			    	if(sm.getPermission().isDangerous()) permType = "Dangerous";
			    	else if (sm.getPermission().isNormal()) permType = "Normal";
			    	else if (sm.getPermission().isSignature()) permType = "Signature";
			    	else if (sm.getPermission().isSignatureOrSystem()) permType = "SignatureOrSystem";
			    	
		    	}
		    	rootElement.setAttribute("PermissionType", permType);
		    	fileName = componentName.replace("\"", "");
	    	}
	    	else {
	    		fileName = prefix+componentName.replace("\"", "");
	    	}
	    	
	    	doc.appendChild(rootElement);
	    	
			while(it.hasNext()) {
				TestPath path = (TestPath) it.next();
				
				rootElement.appendChild(doc.importNode(path.toXML(), true));
		    	
			}
			int id = 0;
			for(StaticContextGroup scg : staticContext.getGroups()) {
					File reportFolderDir = new File("temp/");
					if (!reportFolderDir.exists()){
						reportFolderDir.mkdirs();
					}
					FileOutputStream output = new FileOutputStream("temp/"+fileName+"_"+id+".xml");
				    System.out.println("TestFile created " + System.getProperty("user.dir") + "/temp/"+fileName+"_"+id+postfix);
				    
				    /**
				     * add all the attributes of the static context group
				     */
			    	staticContextElement.setAttribute("APIVersion",String.valueOf(scg.getAPIVersion()));
				    
				    result = new StreamResult(output);
					DOMSource source = new DOMSource(doc);
					transformer.transform(source,result);
					id++;
					
					/**
					 * Remove all the old attributes of the static context group
					 */
					staticContextElement.removeAttribute("APIVersion");
			}	
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}
		return true;
	}

}
