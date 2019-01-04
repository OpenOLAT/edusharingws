
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
 *         &lt;element name="authenticateByCASReturn" type="{http://authentication.webservices.edu_sharing.org}AuthenticationResult"/&gt;
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
    "authenticateByCASReturn"
})
@XmlRootElement(name = "authenticateByCASResponse")
public class AuthenticateByCASResponse {

    @XmlElement(required = true)
    protected AuthenticationResult authenticateByCASReturn;

    /**
     * Obtient la valeur de la propriété authenticateByCASReturn.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationResult }
     *     
     */
    public AuthenticationResult getAuthenticateByCASReturn() {
        return authenticateByCASReturn;
    }

    /**
     * Définit la valeur de la propriété authenticateByCASReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationResult }
     *     
     */
    public void setAuthenticateByCASReturn(AuthenticationResult value) {
        this.authenticateByCASReturn = value;
    }

}
