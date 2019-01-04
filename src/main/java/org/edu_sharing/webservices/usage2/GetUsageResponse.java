
package org.edu_sharing.webservices.usage2;

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
 *         &lt;element name="getUsageReturn" type="{http://usage2.webservices.edu_sharing.org}Usage2Result"/&gt;
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
    protected Usage2Result getUsageReturn;

    /**
     * Obtient la valeur de la propriété getUsageReturn.
     * 
     * @return
     *     possible object is
     *     {@link Usage2Result }
     *     
     */
    public Usage2Result getGetUsageReturn() {
        return getUsageReturn;
    }

    /**
     * Définit la valeur de la propriété getUsageReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link Usage2Result }
     *     
     */
    public void setGetUsageReturn(Usage2Result value) {
        this.getUsageReturn = value;
    }

}
