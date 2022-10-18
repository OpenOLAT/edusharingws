
package org.edu_sharing.webservices.usage;

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
 *         &lt;element name="repositoryTicket" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="repositoryUsername" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lmsId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="courseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parentNodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="appUser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resourceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "lmsId",
    "courseId",
    "parentNodeId",
    "appUser",
    "resourceId"
})
@XmlRootElement(name = "getUsage")
public class GetUsage {

    @XmlElement(required = true)
    protected String repositoryTicket;
    @XmlElement(required = true)
    protected String repositoryUsername;
    @XmlElement(required = true)
    protected String lmsId;
    @XmlElement(required = true)
    protected String courseId;
    @XmlElement(required = true)
    protected String parentNodeId;
    @XmlElement(required = true)
    protected String appUser;
    @XmlElement(required = true)
    protected String resourceId;

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
     * Obtient la valeur de la propriété lmsId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLmsId() {
        return lmsId;
    }

    /**
     * Définit la valeur de la propriété lmsId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLmsId(String value) {
        this.lmsId = value;
    }

    /**
     * Obtient la valeur de la propriété courseId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * Définit la valeur de la propriété courseId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseId(String value) {
        this.courseId = value;
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

    /**
     * Obtient la valeur de la propriété appUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppUser() {
        return appUser;
    }

    /**
     * Définit la valeur de la propriété appUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppUser(String value) {
        this.appUser = value;
    }

    /**
     * Obtient la valeur de la propriété resourceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Définit la valeur de la propriété resourceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceId(String value) {
        this.resourceId = value;
    }

}
