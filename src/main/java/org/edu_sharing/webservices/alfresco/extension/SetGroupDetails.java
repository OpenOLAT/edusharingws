
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
 *         &lt;element name="groupDetails" type="{http://extension.alfresco.webservices.edu_sharing.org}GroupDetails"/&gt;
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
    "groupDetails"
})
@XmlRootElement(name = "setGroupDetails")
public class SetGroupDetails {

    @XmlElement(required = true)
    protected GroupDetails groupDetails;

    /**
     * Obtient la valeur de la propriété groupDetails.
     * 
     * @return
     *     possible object is
     *     {@link GroupDetails }
     *     
     */
    public GroupDetails getGroupDetails() {
        return groupDetails;
    }

    /**
     * Définit la valeur de la propriété groupDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupDetails }
     *     
     */
    public void setGroupDetails(GroupDetails value) {
        this.groupDetails = value;
    }

}
