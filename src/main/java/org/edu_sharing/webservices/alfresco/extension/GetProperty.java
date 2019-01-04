
package org.edu_sharing.webservices.alfresco.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="storeProtocol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "storeProtocol",
    "storeIdentifier",
    "nodeId",
    "property"
})
@XmlRootElement(name = "getProperty")
public class GetProperty {

    @XmlElement(required = true)
    protected String storeProtocol;
    @XmlElement(required = true)
    protected String storeIdentifier;
    @XmlElement(required = true)
    protected String nodeId;
    @XmlElement(required = true)
    protected String property;

    /**
     * Obtient la valeur de la propriété storeProtocol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreProtocol() {
        return storeProtocol;
    }

    /**
     * Définit la valeur de la propriété storeProtocol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreProtocol(String value) {
        this.storeProtocol = value;
    }

    /**
     * Obtient la valeur de la propriété storeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreIdentifier() {
        return storeIdentifier;
    }

    /**
     * Définit la valeur de la propriété storeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreIdentifier(String value) {
        this.storeIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété nodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Définit la valeur de la propriété nodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeId(String value) {
        this.nodeId = value;
    }

    /**
     * Obtient la valeur de la propriété property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * Définit la valeur de la propriété property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

}
