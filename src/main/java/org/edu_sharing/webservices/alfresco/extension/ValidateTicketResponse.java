
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
 *         &lt;element name="validateTicketReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "validateTicketReturn"
})
@XmlRootElement(name = "validateTicketResponse")
public class ValidateTicketResponse {

    @XmlElement(required = true)
    protected String validateTicketReturn;

    /**
     * Obtient la valeur de la propriété validateTicketReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateTicketReturn() {
        return validateTicketReturn;
    }

    /**
     * Définit la valeur de la propriété validateTicketReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateTicketReturn(String value) {
        this.validateTicketReturn = value;
    }

}
