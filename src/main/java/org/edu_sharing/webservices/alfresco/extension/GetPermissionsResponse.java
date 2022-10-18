
package org.edu_sharing.webservices.alfresco.extension;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.edu_sharing.repository.client.rpc.ACL;


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
 *         &lt;element name="getPermissionsReturn" type="{http://rpc.client.repository.edu_sharing.org}ACL"/&gt;
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
    "getPermissionsReturn"
})
@XmlRootElement(name = "getPermissionsResponse")
public class GetPermissionsResponse {

    @XmlElement(required = true)
    protected ACL getPermissionsReturn;

    /**
     * Obtient la valeur de la propriété getPermissionsReturn.
     * 
     * @return
     *     possible object is
     *     {@link ACL }
     *     
     */
    public ACL getGetPermissionsReturn() {
        return getPermissionsReturn;
    }

    /**
     * Définit la valeur de la propriété getPermissionsReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link ACL }
     *     
     */
    public void setGetPermissionsReturn(ACL value) {
        this.getPermissionsReturn = value;
    }

}
