
package org.edu_sharing.webservices.usage2;

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
 *         &lt;element name="setUsageReturn" type="{http://usage2.webservices.edu_sharing.org}Usage2Result"/&gt;
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
    "setUsageReturn"
})
@XmlRootElement(name = "setUsageResponse")
public class SetUsageResponse {

    @XmlElement(required = true)
    protected Usage2Result setUsageReturn;

    /**
     * Obtient la valeur de la propriété setUsageReturn.
     * 
     * @return
     *     possible object is
     *     {@link Usage2Result }
     *     
     */
    public Usage2Result getSetUsageReturn() {
        return setUsageReturn;
    }

    /**
     * Définit la valeur de la propriété setUsageReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link Usage2Result }
     *     
     */
    public void setSetUsageReturn(Usage2Result value) {
        this.setUsageReturn = value;
    }

}
