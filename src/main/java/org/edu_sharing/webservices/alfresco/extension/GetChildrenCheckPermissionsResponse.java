
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
 *         &lt;element name="getChildrenCheckPermissionsReturn" type="{http://xml.apache.org/xml-soap}Map"/&gt;
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
    "getChildrenCheckPermissionsReturn"
})
@XmlRootElement(name = "getChildrenCheckPermissionsResponse")
public class GetChildrenCheckPermissionsResponse {

    @XmlElement(required = true)
    protected Map getChildrenCheckPermissionsReturn;

    /**
     * Obtient la valeur de la propriété getChildrenCheckPermissionsReturn.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getGetChildrenCheckPermissionsReturn() {
        return getChildrenCheckPermissionsReturn;
    }

    /**
     * Définit la valeur de la propriété getChildrenCheckPermissionsReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setGetChildrenCheckPermissionsReturn(Map value) {
        this.getChildrenCheckPermissionsReturn = value;
    }

}
