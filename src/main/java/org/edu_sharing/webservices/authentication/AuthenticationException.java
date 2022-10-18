
package org.edu_sharing.webservices.authentication;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AuthenticationException complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cause" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationException", propOrder = {
    "cause",
    "message"
})
public class AuthenticationException {

    @XmlElement(required = true, nillable = true)
    protected Object cause;
    @XmlElement(required = true, nillable = true)
    protected String message;

    /**
     * Obtient la valeur de la propriété cause.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCause() {
        return cause;
    }

    /**
     * Définit la valeur de la propriété cause.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCause(Object value) {
        this.cause = value;
    }

    /**
     * Obtient la valeur de la propriété message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Définit la valeur de la propriété message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
