package fr.castav.lcis.Checker.reporting;

import fr.castav.lcis.Checker.model.TestPaths.StaticContext;
import fr.castav.lcis.Checker.model.TestPaths.TestPath;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import fr.castav.lcis.Checker.model.VulnerabilityModel;

/**
 * The class represents a report on a single vulnerability pattern checked on a single test.
 * isPositive shows if the vulnerability was found or not.
 * @author baheuxbi
 *
 */
public class Report {
	/**
	 * Id of the vulnerability-testpath combination
	 * Each ID is unique in the context of a set vulnerability AND component
	 */
	String identity;

	/**
	 * If a testPath must be modified so that the exploit works 
	 * for example set an input to a specific value
	 */
	boolean toBeModified;
	
	/**
	 * Path tested
	 */
	TestPath test;
	
	/**
	 * Vulnerability checked on a specific testpath
	 */
	VulnerabilityModel vuln;
	
	/*
	 * StaticContext of the present report 
	 * May be null if there is no specific static context 
	 */
	StaticContext staticContext;
	
	/**
	 * Positivity of a vulnerability on a testpath
	 * False : The vulnerability vuln was not found on testpath test
	 * True : The vulnerability vuln was found on testpath test
	 */
	boolean isPositive;
	
	public Report(boolean isPositive, TestPath test, VulnerabilityModel vuln, String identity, StaticContext staticContext) {
		this.isPositive = isPositive;
		this.test = test;
		this.vuln = vuln;
		this.identity = identity;
		this.staticContext = staticContext;
	}

	public TestPath getTest() {
		return test;
	}

	public void setTest(TestPath test) {
		this.test = test;
	}

	public VulnerabilityModel getVuln() {
		return vuln;
	}

	public void setVuln(VulnerabilityModel vuln) {
		this.vuln = vuln;
	}

	public boolean isPositive() {
		return isPositive;
	}

	public void setPositive(boolean isPositive) {
		this.isPositive = isPositive;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public void writeToFile(String outputFolder) throws Exception {
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		StreamResult result;
		
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder docBuilder 		  = docFactory.newDocumentBuilder();
    	Document doc = docBuilder.newDocument();
		
		JAXBContext jaxbContext 	= JAXBContext.newInstance( TestPath.class );
		Marshaller jaxbMarshaller 	= jaxbContext.createMarshaller();
		jaxbMarshaller.marshal(this.getTest(), doc );
		
		if(staticContext != null) {
			Element staticContextElement = doc.createElement("staticContext");
			staticContextElement.setAttribute("APIVersion", String.valueOf(staticContext.getAPIVersion()));
    		Element root = doc.getDocumentElement();
    		root.insertBefore(staticContextElement, root.getFirstChild());
		}
		
		FileOutputStream output = 
				new FileOutputStream(outputFolder+"/"+this.getVuln().getName()+"_"+this.getIdentity()+".xml");
		result = new StreamResult(output);
		DOMSource source = new DOMSource(doc);
		transformer.transform(source,result);
		
	}
	
}
