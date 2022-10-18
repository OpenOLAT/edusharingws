
package org.edu_sharing.webservices.alfresco.extension;

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
 *         &lt;element name="getCompanyHomeNodeIdReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "getCompanyHomeNodeIdReturn"
})
@XmlRootElement(name = "getCompanyHomeNodeIdResponse")
public class GetCompanyHomeNodeIdResponse {

    @XmlElement(required = true)
    protected String getCompanyHomeNodeIdReturn;

    /**
     * Obtient la valeur de la propriété getCompanyHomeNodeIdReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCompanyHomeNodeIdReturn() {
        return getCompanyHomeNodeIdReturn;
    }

    /**
     * Définit la valeur de la propriété getCompanyHomeNodeIdReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCompanyHomeNodeIdReturn(String value) {
        this.getCompanyHomeNodeIdReturn = value;
    }

}
