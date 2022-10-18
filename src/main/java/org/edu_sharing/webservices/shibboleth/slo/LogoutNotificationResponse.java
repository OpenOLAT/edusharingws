
package org.edu_sharing.webservices.shibboleth.slo;

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
 *         &lt;element name="logoutNotificationReturn" type="{http://slo.shibboleth.webservices.edu_sharing.org}OKType"/&gt;
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
    "logoutNotificationReturn"
})
@XmlRootElement(name = "logoutNotificationResponse")
public class LogoutNotificationResponse {

    @XmlElement(required = true)
    protected OKType logoutNotificationReturn;

    /**
     * Obtient la valeur de la propriété logoutNotificationReturn.
     * 
     * @return
     *     possible object is
     *     {@link OKType }
     *     
     */
    public OKType getLogoutNotificationReturn() {
        return logoutNotificationReturn;
    }

    /**
     * Définit la valeur de la propriété logoutNotificationReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link OKType }
     *     
     */
    public void setLogoutNotificationReturn(OKType value) {
        this.logoutNotificationReturn = value;
    }

}
