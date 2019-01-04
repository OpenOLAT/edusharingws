
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
 *         &lt;element name="setGroupDetailsReturn" type="{http://extension.alfresco.webservices.edu_sharing.org}GroupDetails"/&gt;
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
    "setGroupDetailsReturn"
})
@XmlRootElement(name = "setGroupDetailsResponse")
public class SetGroupDetailsResponse {

    @XmlElement(required = true)
    protected GroupDetails setGroupDetailsReturn;

    /**
     * Obtient la valeur de la propriété setGroupDetailsReturn.
     * 
     * @return
     *     possible object is
     *     {@link GroupDetails }
     *     
     */
    public GroupDetails getSetGroupDetailsReturn() {
        return setGroupDetailsReturn;
    }

    /**
     * Définit la valeur de la propriété setGroupDetailsReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupDetails }
     *     
     */
    public void setSetGroupDetailsReturn(GroupDetails value) {
        this.setGroupDetailsReturn = value;
    }

}
