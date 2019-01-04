
package org.edu_sharing.webservices.alfresco.extension;

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
 *         &lt;element name="getTypeReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "getTypeReturn"
})
@XmlRootElement(name = "getTypeResponse")
public class GetTypeResponse {

    @XmlElement(required = true)
    protected String getTypeReturn;

    /**
     * Obtient la valeur de la propriété getTypeReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetTypeReturn() {
        return getTypeReturn;
    }

    /**
     * Définit la valeur de la propriété getTypeReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetTypeReturn(String value) {
        this.getTypeReturn = value;
    }

}
