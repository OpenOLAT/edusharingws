
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
 *         &lt;element name="fromID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "fromID",
    "toID",
    "association"
})
@XmlRootElement(name = "removeAssociation")
public class RemoveAssociation {

    @XmlElement(required = true)
    protected String fromID;
    @XmlElement(required = true)
    protected String toID;
    @XmlElement(required = true)
    protected String association;

    /**
     * Obtient la valeur de la propriété fromID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromID() {
        return fromID;
    }

    /**
     * Définit la valeur de la propriété fromID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromID(String value) {
        this.fromID = value;
    }

    /**
     * Obtient la valeur de la propriété toID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToID() {
        return toID;
    }

    /**
     * Définit la valeur de la propriété toID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToID(String value) {
        this.toID = value;
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
