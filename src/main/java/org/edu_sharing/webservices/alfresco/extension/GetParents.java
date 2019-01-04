
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
 *         &lt;element name="nodeID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="primary" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "nodeID",
    "primary"
})
@XmlRootElement(name = "getParents")
public class GetParents {

    @XmlElement(required = true)
    protected String nodeID;
    protected boolean primary;

    /**
     * Obtient la valeur de la propriété nodeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeID() {
        return nodeID;
    }

    /**
     * Définit la valeur de la propriété nodeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeID(String value) {
        this.nodeID = value;
    }

    /**
     * Obtient la valeur de la propriété primary.
     * 
     */
    public boolean isPrimary() {
        return primary;
    }

    /**
     * Définit la valeur de la propriété primary.
     * 
     */
    public void setPrimary(boolean value) {
        this.primary = value;
    }

}
