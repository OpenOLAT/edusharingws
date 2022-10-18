
package org.edu_sharing.webservices.usage2;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Usage2Result complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Usage2Result"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appUser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="appUserMail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="courseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="distinctPersons" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fromUsed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="lmsId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parentNodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resourceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toUsed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="usageCounter" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="usageVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usageXmlParams" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Usage2Result", propOrder = {
    "appUser",
    "appUserMail",
    "courseId",
    "distinctPersons",
    "fromUsed",
    "lmsId",
    "nodeId",
    "parentNodeId",
    "resourceId",
    "toUsed",
    "usageCounter",
    "usageVersion",
    "usageXmlParams"
})
public class Usage2Result {

    @XmlElement(required = true, nillable = true)
    protected String appUser;
    @XmlElement(required = true, nillable = true)
    protected String appUserMail;
    @XmlElement(required = true, nillable = true)
    protected String courseId;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer distinctPersons;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromUsed;
    @XmlElement(required = true, nillable = true)
    protected String lmsId;
    @XmlElement(required = true, nillable = true)
    protected String nodeId;
    @XmlElement(required = true, nillable = true)
    protected String parentNodeId;
    @XmlElement(required = true, nillable = true)
    protected String resourceId;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toUsed;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer usageCounter;
    @XmlElement(required = true, nillable = true)
    protected String usageVersion;
    @XmlElement(required = true, nillable = true)
    protected String usageXmlParams;

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
     * Obtient la valeur de la propriété appUserMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppUserMail() {
        return appUserMail;
    }

    /**
     * Définit la valeur de la propriété appUserMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppUserMail(String value) {
        this.appUserMail = value;
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
     * Obtient la valeur de la propriété distinctPersons.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistinctPersons() {
        return distinctPersons;
    }

    /**
     * Définit la valeur de la propriété distinctPersons.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistinctPersons(Integer value) {
        this.distinctPersons = value;
    }

    /**
     * Obtient la valeur de la propriété fromUsed.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromUsed() {
        return fromUsed;
    }

    /**
     * Définit la valeur de la propriété fromUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromUsed(XMLGregorianCalendar value) {
        this.fromUsed = value;
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
     * Obtient la valeur de la propriété toUsed.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToUsed() {
        return toUsed;
    }

    /**
     * Définit la valeur de la propriété toUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToUsed(XMLGregorianCalendar value) {
        this.toUsed = value;
    }

    /**
     * Obtient la valeur de la propriété usageCounter.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsageCounter() {
        return usageCounter;
    }

    /**
     * Définit la valeur de la propriété usageCounter.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsageCounter(Integer value) {
        this.usageCounter = value;
    }

    /**
     * Obtient la valeur de la propriété usageVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageVersion() {
        return usageVersion;
    }

    /**
     * Définit la valeur de la propriété usageVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageVersion(String value) {
        this.usageVersion = value;
    }

    /**
     * Obtient la valeur de la propriété usageXmlParams.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageXmlParams() {
        return usageXmlParams;
    }

    /**
     * Définit la valeur de la propriété usageXmlParams.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageXmlParams(String value) {
        this.usageXmlParams = value;
    }

}
