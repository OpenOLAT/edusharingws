
package org.edu_sharing.webservices.crud;

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
 *         &lt;element name="updateReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "updateReturn"
})
@XmlRootElement(name = "updateResponse")
public class UpdateResponse {

    @XmlElement(required = true)
    protected String updateReturn;

    /**
     * Obtient la valeur de la propriété updateReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateReturn() {
        return updateReturn;
    }

    /**
     * Définit la valeur de la propriété updateReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateReturn(String value) {
        this.updateReturn = value;
    }

}
