
package org.edu_sharing.webservices.usage2;

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
 *         &lt;element name="eduRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lmsId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="courseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "eduRef",
    "lmsId",
    "courseId",
    "user",
    "resourceId"
})
@XmlRootElement(name = "getUsage")
public class GetUsage {

    @XmlElement(required = true)
    protected String eduRef;
    @XmlElement(required = true)
    protected String lmsId;
    @XmlElement(required = true)
    protected String courseId;
    @XmlElement(required = true)
    protected String user;
    @XmlElement(required = true)
    protected String resourceId;

    /**
     * Obtient la valeur de la propriété eduRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduRef() {
        return eduRef;
    }

    /**
     * Définit la valeur de la propriété eduRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduRef(String value) {
        this.eduRef = value;
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
     * Obtient la valeur de la propriété user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Définit la valeur de la propriété user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
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
