
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
 *         &lt;element name="repositoryTicket" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="repositoryUsername" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parentNodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "repositoryTicket",
    "repositoryUsername",
    "parentNodeId"
})
@XmlRootElement(name = "getUsageByParentNodeId")
public class GetUsageByParentNodeId {

    @XmlElement(required = true)
    protected String repositoryTicket;
    @XmlElement(required = true)
    protected String repositoryUsername;
    @XmlElement(required = true)
    protected String parentNodeId;

    /**
     * Obtient la valeur de la propriété repositoryTicket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryTicket() {
        return repositoryTicket;
    }

    /**
     * Définit la valeur de la propriété repositoryTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryTicket(String value) {
        this.repositoryTicket = value;
    }

    /**
     * Obtient la valeur de la propriété repositoryUsername.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryUsername() {
        return repositoryUsername;
    }

    /**
     * Définit la valeur de la propriété repositoryUsername.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryUsername(String value) {
        this.repositoryUsername = value;
    }

    /**
     * Obtient la valeur de la propriété parentNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentNodeId() {
        return parentNodeId;
    }

    /**
     * Définit la valeur de la propriété parentNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentNodeId(String value) {
        this.parentNodeId = value;
    }

}
