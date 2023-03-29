package fr.castav.lcis.Checker.loader;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import fr.castav.lcis.Checker.model.TestPaths;

/**
 * Unmarshaller Class - Convert XML to Object in Java
 * Source : https://www.javaguides.net/2018/10/how-to-convert-xml-to-java-object-jaxb-unmarshalling.html
 * @author baheuxbi
 *
 */
public class TestPathsUnmarshaller {
	
    public static TestPaths convertXMLToObject(String xml_file) {
    	TestPaths tests = null;
        try {
            JAXBContext context = JAXBContext.newInstance(TestPaths.class);
            Unmarshaller un = (Unmarshaller) context.createUnmarshaller();
            tests = (TestPaths) ((javax.xml.bind.Unmarshaller) un).unmarshal(new File(xml_file));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return tests;
    }
}