
package org.edu_sharing.webservices.usage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="usageAllowedReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "usageAllowedReturn"
})
@XmlRootElement(name = "usageAllowedResponse")
public class UsageAllowedResponse {

    protected boolean usageAllowedReturn;

    /**
     * Obtient la valeur de la propriété usageAllowedReturn.
     * 
     */
    public boolean isUsageAllowedReturn() {
        return usageAllowedReturn;
    }

    /**
     * Définit la valeur de la propriété usageAllowedReturn.
     * 
     */
    public void setUsageAllowedReturn(boolean value) {
        this.usageAllowedReturn = value;
    }

}
