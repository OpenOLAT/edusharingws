
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
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="assocType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="assocName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "from",
    "to",
    "assocType",
    "assocName"
})
@XmlRootElement(name = "createChildAssociation")
public class CreateChildAssociation {

    @XmlElement(required = true)
    protected String from;
    @XmlElement(required = true)
    protected String to;
    @XmlElement(required = true)
    protected String assocType;
    @XmlElement(required = true)
    protected String assocName;

    /**
     * Obtient la valeur de la propriété from.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Définit la valeur de la propriété from.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Obtient la valeur de la propriété to.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Définit la valeur de la propriété to.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Obtient la valeur de la propriété assocType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssocType() {
        return assocType;
    }

    /**
     * Définit la valeur de la propriété assocType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssocType(String value) {
        this.assocType = value;
    }

    /**
     * Obtient la valeur de la propriété assocName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssocName() {
        return assocName;
    }

    /**
     * Définit la valeur de la propriété assocName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssocName(String value) {
        this.assocName = value;
    }

}
