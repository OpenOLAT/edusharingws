
package org.edu_sharing.webservices.usage;

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
 *         &lt;element name="getUsageReturn" type="{http://usage.webservices.edu_sharing.org}UsageResult"/&gt;
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
    "getUsageReturn"
})
@XmlRootElement(name = "getUsageResponse")
public class GetUsageResponse {

    @XmlElement(required = true)
    protected UsageResult getUsageReturn;

    /**
     * Obtient la valeur de la propriété getUsageReturn.
     * 
     * @return
     *     possible object is
     *     {@link UsageResult }
     *     
     */
    public UsageResult getGetUsageReturn() {
        return getUsageReturn;
    }

    /**
     * Définit la valeur de la propriété getUsageReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageResult }
     *     
     */
    public void setGetUsageReturn(UsageResult value) {
        this.getUsageReturn = value;
    }

}
