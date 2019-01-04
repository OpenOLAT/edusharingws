
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
 *         &lt;element name="parentID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="childID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "parentID",
    "childID",
    "association"
})
@XmlRootElement(name = "removeChild")
public class RemoveChild {

    @XmlElement(required = true)
    protected String parentID;
    @XmlElement(required = true)
    protected String childID;
    @XmlElement(required = true)
    protected String association;

    /**
     * Obtient la valeur de la propriété parentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentID() {
        return parentID;
    }

    /**
     * Définit la valeur de la propriété parentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentID(String value) {
        this.parentID = value;
    }

    /**
     * Obtient la valeur de la propriété childID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildID() {
        return childID;
    }

    /**
     * Définit la valeur de la propriété childID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildID(String value) {
        this.childID = value;
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
