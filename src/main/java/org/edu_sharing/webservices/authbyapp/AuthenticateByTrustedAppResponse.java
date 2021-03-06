
package org.edu_sharing.webservices.authbyapp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.edu_sharing.webservices.authentication.AuthenticationResult;


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
 *         &lt;element name="authenticateByTrustedAppReturn" type="{http://authentication.webservices.edu_sharing.org}AuthenticationResult"/&gt;
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
    "authenticateByTrustedAppReturn"
})
@XmlRootElement(name = "authenticateByTrustedAppResponse")
public class AuthenticateByTrustedAppResponse {

    @XmlElement(required = true)
    protected AuthenticationResult authenticateByTrustedAppReturn;

    /**
     * Obtient la valeur de la propriété authenticateByTrustedAppReturn.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationResult }
     *     
     */
    public AuthenticationResult getAuthenticateByTrustedAppReturn() {
        return authenticateByTrustedAppReturn;
    }

    /**
     * Définit la valeur de la propriété authenticateByTrustedAppReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationResult }
     *     
     */
    public void setAuthenticateByTrustedAppReturn(AuthenticationResult value) {
        this.authenticateByTrustedAppReturn = value;
    }

}
