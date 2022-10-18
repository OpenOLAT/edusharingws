
package org.edu_sharing.webservices.alfresco.extension;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.xml.xml_soap.Map;


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
 *         &lt;element name="getUserInfoReturn" type="{http://xml.apache.org/xml-soap}Map"/&gt;
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
    "getUserInfoReturn"
})
@XmlRootElement(name = "getUserInfoResponse")
public class GetUserInfoResponse {

    @XmlElement(required = true)
    protected Map getUserInfoReturn;

    /**
     * Obtient la valeur de la propriété getUserInfoReturn.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getGetUserInfoReturn() {
        return getUserInfoReturn;
    }

    /**
     * Définit la valeur de la propriété getUserInfoReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setGetUserInfoReturn(Map value) {
        this.getUserInfoReturn = value;
    }

}
