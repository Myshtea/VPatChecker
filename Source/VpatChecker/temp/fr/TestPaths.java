//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0.1 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.01.09 à 12:59:40 PM UTC 
//


package fr;

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
 *                                       &lt;element name="dataflow"&gt;
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

    @XmlElement(name = "StaticContext", required = true)
    protected TestPaths.StaticContext staticContext;
    @XmlElement(name = "TestPath", required = true)
    protected List<TestPaths.TestPath> testPath;
    @XmlAttribute(name = "component", required = true)
    protected String component;
    @XmlAttribute(name = "exported", required = true)
    protected boolean exported;

    /**
     * Obtient la valeur de la propriété staticContext.
     * 
     * @return
     *     possible object is
     *     {@link TestPaths.StaticContext }
     *     
     */
    public TestPaths.StaticContext getStaticContext() {
        return staticContext;
    }

    /**
     * Définit la valeur de la propriété staticContext.
     * 
     * @param value
     *     allowed object is
     *     {@link TestPaths.StaticContext }
     *     
     */
    public void setStaticContext(TestPaths.StaticContext value) {
        this.staticContext = value;
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
     *                             &lt;element name="dataflow"&gt;
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
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "state"
    })
    public static class TestPath {

        @XmlElement(required = true)
        protected List<TestPaths.TestPath.State> state;

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
         *                   &lt;element name="dataflow"&gt;
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
             *         &lt;element name="dataflow"&gt;
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
                protected TestPaths.TestPath.State.Dataflows.Dataflow dataflow;

                /**
                 * Obtient la valeur de la propriété dataflow.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TestPaths.TestPath.State.Dataflows.Dataflow }
                 *     
                 */
                public TestPaths.TestPath.State.Dataflows.Dataflow getDataflow() {
                    return dataflow;
                }

                /**
                 * Définit la valeur de la propriété dataflow.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TestPaths.TestPath.State.Dataflows.Dataflow }
                 *     
                 */
                public void setDataflow(TestPaths.TestPath.State.Dataflows.Dataflow value) {
                    this.dataflow = value;
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
