//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.25 at 04:25:33 PM EDT 
//


package com.percussion.workbench.ui.views.hierarchy.xmlbind;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.percussion.workbench.ui.views.hierarchy.xmlbind package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Description_QNAME = new QName("", "Description");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.percussion.workbench.ui.views.hierarchy.xmlbind
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Node }
     * 
     */
    public Node createNode() {
        return new Node();
    }

    /**
     * Create an instance of {@link InstanceTree }
     * 
     */
    public InstanceTree createInstanceTree() {
        return new InstanceTree();
    }

    /**
     * Create an instance of {@link Handler }
     * 
     */
    public Handler createHandler() {
        return new Handler();
    }

    /**
     * Create an instance of {@link Node.NodeProperty }
     * 
     */
    public Node.NodeProperty createNodeNodeProperty() {
        return new Node.NodeProperty();
    }

    /**
     * Create an instance of {@link Node.HomeNodeProperty }
     * 
     */
    public Node.HomeNodeProperty createNodeHomeNodeProperty() {
        return new Node.HomeNodeProperty();
    }

    /**
     * Create an instance of {@link CatalogProperty }
     * 
     */
    public CatalogProperty createCatalogProperty() {
        return new CatalogProperty();
    }

    /**
     * Create an instance of {@link Catalog }
     * 
     */
    public Catalog createCatalog() {
        return new Catalog();
    }

    /**
     * Create an instance of {@link TreeDef }
     * 
     */
    public TreeDef createTreeDef() {
        return new TreeDef();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

}
