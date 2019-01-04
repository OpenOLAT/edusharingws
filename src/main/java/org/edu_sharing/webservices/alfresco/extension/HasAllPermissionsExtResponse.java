
package org.edu_sharing.webservices.alfresco.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="hasAllPermissionsExtReturn" type="{http://xml.apache.org/xml-soap}Map"/&gt;
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
    "hasAllPermissionsExtReturn"
})
@XmlRootElement(name = "hasAllPermissionsExtResponse")
public class HasAllPermissionsExtResponse {

    @XmlElement(required = true)
    protected Map hasAllPermissionsExtReturn;

    /**
     * Obtient la valeur de la propriété hasAllPermissionsExtReturn.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getHasAllPermissionsExtReturn() {
        return hasAllPermissionsExtReturn;
    }

    /**
     * Définit la valeur de la propriété hasAllPermissionsExtReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setHasAllPermissionsExtReturn(Map value) {
        this.hasAllPermissionsExtReturn = value;
    }

}
