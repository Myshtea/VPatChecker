//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0.1 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2022.12.12 à 02:50:55 PM UTC 
//


package fr.castav.lcis.Checker.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StaticContext"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="APIVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TestPath" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="state" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence minOccurs="0"&gt;
 *                             &lt;element name="transition"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence minOccurs="0"&gt;
 *                                       &lt;element name="contexts"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="context"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                                         &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="situations" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="situation"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                                         &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="dataflows" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="dataflow" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence minOccurs="0"&gt;
 *                                                 &lt;element name="parameters"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="parameter" maxOccurs="unbounded"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;simpleContent&gt;
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                                                   &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                 &lt;/extension&gt;
 *                                                               &lt;/simpleContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PermissionType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="component" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="exported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "staticContext",
    "testPath"
})
@XmlRootElement(name = "TestPaths")
public class TestPaths {

    @XmlElement(name = "StaticContext", required = false)
    protected TestPaths.StaticContext staticContext;
    @XmlElement(name = "TestPath", required = true)
    protected List<TestPaths.TestPath> testPath;
    @XmlAttribute(name = "PermissionType", required = true)
    protected String permissionType;
    @XmlAttribute(name = "component", required = true)
    protected String component;
    @XmlAttribute(name = "exported", required = true)
    protected boolean exported;
    
    
    @Override
    public TestPaths clone() throws CloneNotSupportedException {
    	TestPaths newTestPaths = (TestPaths) super.clone();
 
        // primitive fields are ignored, as their content is already copied
        // immutable fields like string are ignored
 
        // create new objects for any non-primitive, mutable fields
    	newTestPaths.setComponent(this.getComponent());
    	newTestPaths.setExported(this.isExported());
    	newTestPaths.setPermissionType(this.getPermissionType());
    	newTestPaths.setStaticContext(this.getStaticContext().clone());
    	
    	List<TestPaths.TestPath> testpaths = new ArrayList<TestPaths.TestPath>();
    	for(TestPaths.TestPath p : this.getTestPath()) {
    		testpaths.add(p.clone());

    	}
    	
    	newTestPaths.setTestPath(testpaths);   
    	
        return newTestPaths;        // return deep copy
    }
    
    public void setTestPath(List<TestPaths.TestPath> testPath) {
		this.testPath = testPath;
	}

	/**
     * Gets the value of the testPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestPaths.TestPath }
     * 
     * 
     */
    public List<TestPaths.TestPath> getTestPath() {
        if (testPath == null) {
            testPath = new ArrayList<TestPaths.TestPath>();
        }
        return this.testPath;
    }

    /**
     * Obtient la valeur de la propriété permissionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionType() {
        return permissionType;
    }

    /**
     * Définit la valeur de la propriété permissionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionType(String value) {
        this.permissionType = value;
    }

    /**
     * Obtient la valeur de la propriété component.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponent() {
        return component;
    }

    /**
     * Définit la valeur de la propriété component.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponent(String value) {
        this.component = value;
    }

    /**
     * Obtient la valeur de la propriété exported.
     * 
     */
    public boolean isExported() {
        return exported;
    }

    /**
     * Définit la valeur de la propriété exported.
     * 
     */
    public void setExported(boolean value) {
        this.exported = value;
    }

    public TestPaths.StaticContext getStaticContext() {
		return staticContext;
	}

	public void setStaticContext(TestPaths.StaticContext staticContext) {
		this.staticContext = staticContext;
	}
    
    
    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="APIVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StaticContext {

        @XmlAttribute(name = "APIVersion", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short apiVersion;

        /**
         * Obtient la valeur de la propriété apiVersion.
         * 
         */
        public short getAPIVersion() {
            return apiVersion;
        }

        /**
         * Définit la valeur de la propriété apiVersion.
         * 
         */
        public void setAPIVersion(short value) {
            this.apiVersion = value;
        }
        
        @Override
        public StaticContext clone() throws CloneNotSupportedException {
        	StaticContext newStaticContext = (StaticContext) super.clone();
     
            // primitive fields are ignored, as their content is already copied
            // immutable fields like string are ignored
     
            // create new objects for any non-primitive, mutable fields
        	newStaticContext.setAPIVersion(this.getAPIVersion());
        	
            return newStaticContext;        // return deep copy
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="state" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence minOccurs="0"&gt;
     *                   &lt;element name="transition"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence minOccurs="0"&gt;
     *                             &lt;element name="contexts"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="context"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                               &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="situations" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="situation"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                               &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="dataflows" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="dataflow" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence minOccurs="0"&gt;
     *                                       &lt;element name="parameters"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="parameter" maxOccurs="unbounded"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;simpleContent&gt;
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                                         &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                       &lt;/extension&gt;
     *                                                     &lt;/simpleContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlRootElement(name = "TestPath")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "state"
    })
    public static class TestPath {

        @XmlElement(required = true)
        protected List<TestPaths.TestPath.State> state;
        
        @Override
        public TestPath clone() throws CloneNotSupportedException {
        	//TestPath newTestPath = (TestPath) super.clone();
        	TestPath newTestPath = new TestPath();
     
            // primitive fields are ignored, as their content is already copied
            // immutable fields like string are ignored
     
            // create new objects for any non-primitive, mutable fields
        	List<TestPaths.TestPath.State> states = new ArrayList<TestPaths.TestPath.State>();
        	for(TestPaths.TestPath.State p : this.getState()) {
        		states.add(p.clone());

        	}
        	
        	newTestPath.setState(states);     


        	
        	
            return newTestPath;        // return deep copy
        }
       
        /**
         * Gets the value of the state property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the state property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getState().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TestPaths.TestPath.State }
         * 
         * 
         */
        public List<TestPaths.TestPath.State> getState() {
            if (state == null) {
                state = new ArrayList<TestPaths.TestPath.State>();
            }
            return this.state;
        }
        
    	public void setState(List<TestPaths.TestPath.State> state) {
			this.state = state;
		}



        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence minOccurs="0"&gt;
         *         &lt;element name="transition"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence minOccurs="0"&gt;
         *                   &lt;element name="contexts"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="context"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                                     &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/simpleContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="situations" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="situation"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                                     &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/simpleContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="dataflows" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="dataflow" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence minOccurs="0"&gt;
         *                             &lt;element name="parameters"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="parameter" maxOccurs="unbounded"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;simpleContent&gt;
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                                               &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                             &lt;/extension&gt;
         *                                           &lt;/simpleContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "transition",
            "dataflows"
        })
        public static class State {

            protected TestPaths.TestPath.State.Transition transition;
            protected TestPaths.TestPath.State.Dataflows dataflows;
            @XmlAttribute(name = "name", required = true)
            protected String name;

            @Override
            public State clone() throws CloneNotSupportedException {
            	//State newState = (State) super.clone();
            	State newState = new State();
         
                // primitive fields are ignored, as their content is already copied
                // immutable fields like string are ignored
         
                // create new objects for any non-primitive, mutable fields
            	newState.setName(this.getName());
            	if(this.getDataflows() != null) newState.setDataflows(this.getDataflows().clone());
            	if(this.getTransition() != null) newState.setTransition(this.getTransition().clone());
         
                return newState;        // return deep copy
            }
            
            /**
             * Obtient la valeur de la propriété transition.
             * 
             * @return
             *     possible object is
             *     {@link TestPaths.TestPath.State.Transition }
             *     
             */
            public TestPaths.TestPath.State.Transition getTransition() {
                return transition;
            }

            /**
             * Définit la valeur de la propriété transition.
             * 
             * @param value
             *     allowed object is
             *     {@link TestPaths.TestPath.State.Transition }
             *     
             */
            public void setTransition(TestPaths.TestPath.State.Transition value) {
                this.transition = value;
            }

            /**
             * Obtient la valeur de la propriété dataflows.
             * 
             * @return
             *     possible object is
             *     {@link TestPaths.TestPath.State.Dataflows }
             *     
             */
            public TestPaths.TestPath.State.Dataflows getDataflows() {
                return dataflows;
            }

            /**
             * Définit la valeur de la propriété dataflows.
             * 
             * @param value
             *     allowed object is
             *     {@link TestPaths.TestPath.State.Dataflows }
             *     
             */
            public void setDataflows(TestPaths.TestPath.State.Dataflows value) {
                this.dataflows = value;
            }

            /**
             * Obtient la valeur de la propriété name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Définit la valeur de la propriété name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="dataflow" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence minOccurs="0"&gt;
             *                   &lt;element name="parameters"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="parameter" maxOccurs="unbounded"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;simpleContent&gt;
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                                     &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                   &lt;/extension&gt;
             *                                 &lt;/simpleContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "dataflow"
            })
            public static class Dataflows {

				@XmlElement(required = true)
                protected List<TestPaths.TestPath.State.Dataflows.Dataflow> dataflow;
                
                @Override
                public Dataflows clone() throws CloneNotSupportedException {
                	//Dataflows newDataflows = (Dataflows) super.clone();
                	Dataflows newDataflows = new Dataflows();
             
                    // primitive fields are ignored, as their content is already copied
                    // immutable fields like string are ignored
             
                    // create new objects for any non-primitive, mutable fields
                	List<TestPaths.TestPath.State.Dataflows.Dataflow> dataflows = new ArrayList<TestPaths.TestPath.State.Dataflows.Dataflow>();
                	for(TestPaths.TestPath.State.Dataflows.Dataflow p : this.getDataflow()) {
                		dataflows.add(p.clone());

                	}
                	
                	newDataflows.setDataflow(dataflows);
             
                    return newDataflows;        // return deep copy
                }

                

                /**
                 * Gets the value of the dataflow property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dataflow property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDataflow().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TestPaths.TestPath.State.Dataflows.Dataflow }
                 * 
                 * 
                 */
                public List<TestPaths.TestPath.State.Dataflows.Dataflow> getDataflow() {
                    if (dataflow == null) {
                        dataflow = new ArrayList<TestPaths.TestPath.State.Dataflows.Dataflow>();
                    }
                    return this.dataflow;
                }
                
                public void setDataflow(List<TestPaths.TestPath.State.Dataflows.Dataflow> dataflow) {
    					this.dataflow = dataflow;
    				}



                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence minOccurs="0"&gt;
                 *         &lt;element name="parameters"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="parameter" maxOccurs="unbounded"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;simpleContent&gt;
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *                           &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                         &lt;/extension&gt;
                 *                       &lt;/simpleContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "parameters"
                })
                public static class Dataflow {

                    protected TestPaths.TestPath.State.Dataflows.Dataflow.Parameters parameters;
                    @XmlAttribute(name = "name", required = true)
                    protected String name;
                    @XmlAttribute(name = "type", required = true)
                    protected String type;
                    @XmlAttribute(name = "value")
                    protected String value;

                    
                    @Override
                    public Dataflow clone() throws CloneNotSupportedException {
                    	//Dataflow newDataflow = (Dataflow) super.clone();
                    	Dataflow newDataflow = new Dataflow();
                 
                        // primitive fields are ignored, as their content is already copied
                        // immutable fields like string are ignored
                 
                        // create new objects for any non-primitive, mutable fields
                    	newDataflow.setName(this.getName());
                    	newDataflow.setType(this.getType());
                    	newDataflow.setValue(this.getValue());
                    	if(this.getParameters() != null) newDataflow.setParameters(this.getParameters().clone());
                 
                        return newDataflow;        // return deep copy
                    }
                    
                    /**
                     * Obtient la valeur de la propriété parameters.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TestPaths.TestPath.State.Dataflows.Dataflow.Parameters }
                     *     
                     */
                    public TestPaths.TestPath.State.Dataflows.Dataflow.Parameters getParameters() {
                        return parameters;
                    }

                    /**
                     * Définit la valeur de la propriété parameters.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TestPaths.TestPath.State.Dataflows.Dataflow.Parameters }
                     *     
                     */
                    public void setParameters(TestPaths.TestPath.State.Dataflows.Dataflow.Parameters value) {
                        this.parameters = value;
                    }

                    /**
                     * Obtient la valeur de la propriété name.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Définit la valeur de la propriété name.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Obtient la valeur de la propriété type.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Définit la valeur de la propriété type.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Obtient la valeur de la propriété value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Définit la valeur de la propriété value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="parameter" maxOccurs="unbounded"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;simpleContent&gt;
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                     *                 &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *               &lt;/extension&gt;
                     *             &lt;/simpleContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "parameter"
                    })
                    public static class Parameters {

						@XmlElement(required = true)
                        protected List<TestPaths.TestPath.State.Dataflows.Dataflow.Parameters.Parameter> parameter;
                        
                        @Override
                        public Parameters clone() throws CloneNotSupportedException {
                        	//Parameters newParameters = (Parameters) super.clone();
                        	Parameters newParameters = new Parameters();
                     
                            // primitive fields are ignored, as their content is already copied
                            // immutable fields like string are ignored
                     
                            // create new objects for any non-primitive, mutable fields 
                        	List<TestPaths.TestPath.State.Dataflows.Dataflow.Parameters.Parameter> parameters = new ArrayList<TestPaths.TestPath.State.Dataflows.Dataflow.Parameters.Parameter>();
                        	for(TestPaths.TestPath.State.Dataflows.Dataflow.Parameters.Parameter p : this.getParameter()) {
                        		parameters.add(p.clone());
                            	
                        	}
                        	
                        	newParameters.setParameter(parameters);
                     
                            return newParameters;        // return deep copy
                        }

                        
                        /**
                         * Gets the value of the parameter property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the parameter property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getParameter().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link TestPaths.TestPath.State.Dataflows.Dataflow.Parameters.Parameter }
                         * 
                         * 
                         */
                        public List<TestPaths.TestPath.State.Dataflows.Dataflow.Parameters.Parameter> getParameter() {
                            if (parameter == null) {
                                parameter = new ArrayList<TestPaths.TestPath.State.Dataflows.Dataflow.Parameters.Parameter>();
                            }
                            return this.parameter;
                        }


                        public void setParameter(List<TestPaths.TestPath.State.Dataflows.Dataflow.Parameters.Parameter> parameter) {
							this.parameter = parameter;
						}

                        

                        /**
                         * <p>Classe Java pour anonymous complex type.
                         * 
                         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;simpleContent&gt;
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                         *       &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                         *     &lt;/extension&gt;
                         *   &lt;/simpleContent&gt;
                         * &lt;/complexType&gt;
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class Parameter {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "origin", required = true)
                            protected String origin;

                            @Override
                            public Parameter clone() throws CloneNotSupportedException {
                            	//Parameter newParameter = (Parameter) super.clone();
                            	Parameter newParameter = new Parameter();

                                // primitive fields are ignored, as their content is already copied
                                // immutable fields like string are ignored
                         
                                // create new objects for any non-primitive, mutable fields
                            	
                            	newParameter.setOrigin(this.getOrigin());
                            	newParameter.setValue(this.getValue());

                                return newParameter;        // return deep copy
                            }
                            
                            /**
                             * Obtient la valeur de la propriété value.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Définit la valeur de la propriété value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                            /**
                             * Obtient la valeur de la propriété origin.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getOrigin() {
                                return origin;
                            }

                            /**
                             * Définit la valeur de la propriété origin.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setOrigin(String value) {
                                this.origin = value;
                            }

                        }

                    }

                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence minOccurs="0"&gt;
             *         &lt;element name="contexts"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="context"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                           &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/simpleContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="situations" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="situation"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                           &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/simpleContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "contexts",
                "situations"
            })
            public static class Transition {

                protected TestPaths.TestPath.State.Transition.Contexts contexts;
                protected TestPaths.TestPath.State.Transition.Situations situations;
                @XmlAttribute(name = "name", required = true)
                protected String name;
                
                
                @Override
                public Transition clone() throws CloneNotSupportedException {
                	//Transition newTransition = (Transition) super.clone();
                	Transition newTransition = new Transition();
             
                    // primitive fields are ignored, as their content is already copied
                    // immutable fields like string are ignored
             
                    // create new objects for any non-primitive, mutable fields
                	newTransition.setName(this.name);
                	if (this.getContexts() != null) newTransition.setContexts(this.getContexts().clone());
                	if (this.getSituations() != null) newTransition.setSituations(this.getSituations().clone());
             
                    return newTransition;        // return deep copy
                }


                /**
                 * Obtient la valeur de la propriété contexts.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TestPaths.TestPath.State.Transition.Contexts }
                 *     
                 */
                public TestPaths.TestPath.State.Transition.Contexts getContexts() {
                    return contexts;
                }

                /**
                 * Définit la valeur de la propriété contexts.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TestPaths.TestPath.State.Transition.Contexts }
                 *     
                 */
                public void setContexts(TestPaths.TestPath.State.Transition.Contexts value) {
                    this.contexts = value;
                }

                /**
                 * Obtient la valeur de la propriété situations.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TestPaths.TestPath.State.Transition.Situations }
                 *     
                 */
                public TestPaths.TestPath.State.Transition.Situations getSituations() {
                    return situations;
                }

                /**
                 * Définit la valeur de la propriété situations.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TestPaths.TestPath.State.Transition.Situations }
                 *     
                 */
                public void setSituations(TestPaths.TestPath.State.Transition.Situations value) {
                    this.situations = value;
                }

                /**
                 * Obtient la valeur de la propriété name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Définit la valeur de la propriété name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="context"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *                 &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/simpleContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "context"
                })
                public static class Contexts {

                    @XmlElement(required = true)
                    protected TestPaths.TestPath.State.Transition.Contexts.Context context;

                    @Override
                    public Contexts clone() throws CloneNotSupportedException {
                    	//Contexts newContext = (Contexts) super.clone();
                    	Contexts newContext = new Contexts();
                 
                        // primitive fields are ignored, as their content is already copied
                        // immutable fields like string are ignored
                 
                        // create new objects for any non-primitive, mutable fields
                    	newContext.setContext(this.getContext().clone());
                 
                        return newContext;        // return deep copy
                    }
                    
                    /**
                     * Obtient la valeur de la propriété context.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TestPaths.TestPath.State.Transition.Contexts.Context }
                     *     
                     */
                    public TestPaths.TestPath.State.Transition.Contexts.Context getContext() {
                        return context;
                    }

                    /**
                     * Définit la valeur de la propriété context.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TestPaths.TestPath.State.Transition.Contexts.Context }
                     *     
                     */
                    public void setContext(TestPaths.TestPath.State.Transition.Contexts.Context value) {
                        this.context = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;simpleContent&gt;
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                     *       &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *     &lt;/extension&gt;
                     *   &lt;/simpleContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Context {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "origin", required = true)
                        protected String origin;

                        
                        @Override
                        public Context clone() throws CloneNotSupportedException {
                        	//Context newContext = (Context) super.clone();
                        	Context newContext = new Context();
                     
                            // primitive fields are ignored, as their content is already copied
                            // immutable fields like string are ignored
                     
                            // create new objects for any non-primitive, mutable fields
                        	newContext.setValue(value);
                        	newContext.setOrigin(origin);
                     
                            return newContext;        // return deep copy
                        }

                        
                        /**
                         * Obtient la valeur de la propriété value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Définit la valeur de la propriété value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtient la valeur de la propriété origin.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrigin() {
                            return origin;
                        }

                        /**
                         * Définit la valeur de la propriété origin.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrigin(String value) {
                            this.origin = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="situation"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *                 &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/simpleContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "situation"
                })
                public static class Situations {

                    @XmlElement(required = true)
                    protected TestPaths.TestPath.State.Transition.Situations.Situation situation;
                    
                    @Override
                    public Situations clone() throws CloneNotSupportedException {
                    	//Situations newSituations = (Situations) super.clone();
                    	Situations newSituations = new Situations();
                 
                        // primitive fields are ignored, as their content is already copied
                        // immutable fields like string are ignored
                 
                        // create new objects for any non-primitive, mutable fields
                    	newSituations.setSituation(this.getSituation().clone());
                 
                        return newSituations;        // return deep copy
                    }

                    /**
                     * Obtient la valeur de la propriété situation.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TestPaths.TestPath.State.Transition.Situations.Situation }
                     *     
                     */
                    public TestPaths.TestPath.State.Transition.Situations.Situation getSituation() {
                        return situation;
                    }

                    /**
                     * Définit la valeur de la propriété situation.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TestPaths.TestPath.State.Transition.Situations.Situation }
                     *     
                     */
                    public void setSituation(TestPaths.TestPath.State.Transition.Situations.Situation value) {
                        this.situation = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;simpleContent&gt;
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                     *       &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *     &lt;/extension&gt;
                     *   &lt;/simpleContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Situation {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "origin", required = true)
                        protected String origin;

                        @Override
                        public Situation clone() throws CloneNotSupportedException {
                        	//Situation newSituation = (Situation) super.clone();
                        	Situation newSituation = new Situation();
                     
                            // primitive fields are ignored, as their content is already copied
                            // immutable fields like string are ignored
                     
                            // create new objects for any non-primitive, mutable fields
                        	newSituation.setValue(value);
                        	newSituation.setOrigin(origin);
                     
                            return newSituation;        // return deep copy
                        }
                        
                        /**
                         * Obtient la valeur de la propriété value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Définit la valeur de la propriété value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtient la valeur de la propriété origin.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrigin() {
                            return origin;
                        }

                        /**
                         * Définit la valeur de la propriété origin.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrigin(String value) {
                            this.origin = value;
                        }

                    }

                }

            }

        }

    }

}