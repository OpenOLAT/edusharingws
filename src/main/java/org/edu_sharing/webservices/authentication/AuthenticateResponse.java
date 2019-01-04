
package org.edu_sharing.webservices.authentication;

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
 *         &lt;element name="authenticateReturn" type="{http://authentication.webservices.edu_sharing.org}AuthenticationResult"/&gt;
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
    "authenticateReturn"
})
@XmlRootElement(name = "authenticateResponse")
public class AuthenticateResponse {

    @XmlElement(required = true)
    protected AuthenticationResult authenticateReturn;

    /**
     * Obtient la valeur de la propriété authenticateReturn.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationResult }
     *     
     */
    public AuthenticationResult getAuthenticateReturn() {
        return authenticateReturn;
    }

    /**
     * Définit la valeur de la propriété authenticateReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationResult }
     *     
     */
    public void setAuthenticateReturn(AuthenticationResult value) {
        this.authenticateReturn = value;
    }

}
