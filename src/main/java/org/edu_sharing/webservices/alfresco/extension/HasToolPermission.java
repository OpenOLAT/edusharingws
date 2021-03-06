
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
 *         &lt;element name="toolPermission" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "toolPermission"
})
@XmlRootElement(name = "hasToolPermission")
public class HasToolPermission {

    @XmlElement(required = true)
    protected String toolPermission;

    /**
     * Obtient la valeur de la propriété toolPermission.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolPermission() {
        return toolPermission;
    }

    /**
     * Définit la valeur de la propriété toolPermission.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolPermission(String value) {
        this.toolPermission = value;
    }

}
