
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
 *         &lt;element name="getPropertiesSimpleReturn" type="{http://xml.apache.org/xml-soap}Map"/&gt;
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
    "getPropertiesSimpleReturn"
})
@XmlRootElement(name = "getPropertiesSimpleResponse")
public class GetPropertiesSimpleResponse {

    @XmlElement(required = true)
    protected Map getPropertiesSimpleReturn;

    /**
     * Obtient la valeur de la propriété getPropertiesSimpleReturn.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getGetPropertiesSimpleReturn() {
        return getPropertiesSimpleReturn;
    }

    /**
     * Définit la valeur de la propriété getPropertiesSimpleReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setGetPropertiesSimpleReturn(Map value) {
        this.getPropertiesSimpleReturn = value;
    }

}
