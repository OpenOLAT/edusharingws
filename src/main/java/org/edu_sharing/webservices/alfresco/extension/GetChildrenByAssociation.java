
package org.edu_sharing.webservices.alfresco.extension;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="storeString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="association" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "storeString",
    "nodeId",
    "association"
})
@XmlRootElement(name = "getChildrenByAssociation")
public class GetChildrenByAssociation {

    @XmlElement(required = true)
    protected String storeString;
    @XmlElement(required = true)
    protected String nodeId;
    @XmlElement(required = true)
    protected String association;

    /**
     * Obtient la valeur de la propriété storeString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreString() {
        return storeString;
    }

    /**
     * Définit la valeur de la propriété storeString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreString(String value) {
        this.storeString = value;
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
     * Obtient la valeur de la propriété association.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociation() {
        return association;
    }

    /**
     * Définit la valeur de la propriété association.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociation(String value) {
        this.association = value;
    }

}
