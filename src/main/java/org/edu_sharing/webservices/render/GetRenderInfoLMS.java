
package org.edu_sharing.webservices.render;

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
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lmsId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="courseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resourceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "userName",
    "nodeId",
    "lmsId",
    "courseId",
    "resourceId",
    "version"
})
@XmlRootElement(name = "getRenderInfoLMS")
public class GetRenderInfoLMS {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String nodeId;
    @XmlElement(required = true)
    protected String lmsId;
    @XmlElement(required = true)
    protected String courseId;
    @XmlElement(required = true)
    protected String resourceId;
    @XmlElement(required = true)
    protected String version;

    /**
     * Obtient la valeur de la propriété userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Définit la valeur de la propriété userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Obtient la valeur de la propriété nodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Définit la valeur de la propriété nodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeId(String value) {
        this.nodeId = value;
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

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
