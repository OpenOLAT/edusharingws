
package org.edu_sharing.webservices.render;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.edu_sharing.webservices.usage.UsageResult;


/**
 * <p>Classe Java pour RenderInfoResult complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RenderInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aspects" type="{http://render.webservices.edu_sharing.org}ArrayOf_xsd_string"/&gt;
 *         &lt;element name="contentHash" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="eduSchoolPrimaryAffiliation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="guestReadAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasContentLicense" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="labels" type="{http://render.webservices.edu_sharing.org}ArrayOf_tns2_KeyValue"/&gt;
 *         &lt;element name="mdsTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mimeTypeUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="permissions" type="{http://render.webservices.edu_sharing.org}ArrayOf_xsd_string"/&gt;
 *         &lt;element name="previewUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="properties" type="{http://render.webservices.edu_sharing.org}ArrayOf_tns2_KeyValue"/&gt;
 *         &lt;element name="propertiesToolInstance" type="{http://render.webservices.edu_sharing.org}ArrayOf_tns2_KeyValue"/&gt;
 *         &lt;element name="publishRight" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="remoteRoles" type="{http://render.webservices.edu_sharing.org}ArrayOf_xsd_string"/&gt;
 *         &lt;element name="usage" type="{http://usage.webservices.edu_sharing.org}UsageResult"/&gt;
 *         &lt;element name="userReadAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RenderInfoResult", propOrder = {
    "aspects",
    "contentHash",
    "eduSchoolPrimaryAffiliation",
    "guestReadAllowed",
    "hasContentLicense",
    "labels",
    "mdsTemplate",
    "mimeTypeUrl",
    "permissions",
    "previewUrl",
    "properties",
    "propertiesToolInstance",
    "publishRight",
    "remoteRoles",
    "usage",
    "userReadAllowed"
})
public class RenderInfoResult {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString aspects;
    protected int contentHash;
    @XmlElement(required = true, nillable = true)
    protected String eduSchoolPrimaryAffiliation;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean guestReadAllowed;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean hasContentLicense;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2KeyValue labels;
    @XmlElement(required = true, nillable = true)
    protected String mdsTemplate;
    @XmlElement(required = true, nillable = true)
    protected String mimeTypeUrl;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString permissions;
    @XmlElement(required = true, nillable = true)
    protected String previewUrl;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2KeyValue properties;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2KeyValue propertiesToolInstance;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean publishRight;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString remoteRoles;
    @XmlElement(required = true, nillable = true)
    protected UsageResult usage;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean userReadAllowed;

    /**
     * Obtient la valeur de la propriété aspects.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getAspects() {
        return aspects;
    }

    /**
     * Définit la valeur de la propriété aspects.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setAspects(ArrayOfXsdString value) {
        this.aspects = value;
    }

    /**
     * Obtient la valeur de la propriété contentHash.
     * 
     */
    public int getContentHash() {
        return contentHash;
    }

    /**
     * Définit la valeur de la propriété contentHash.
     * 
     */
    public void setContentHash(int value) {
        this.contentHash = value;
    }

    /**
     * Obtient la valeur de la propriété eduSchoolPrimaryAffiliation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduSchoolPrimaryAffiliation() {
        return eduSchoolPrimaryAffiliation;
    }

    /**
     * Définit la valeur de la propriété eduSchoolPrimaryAffiliation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduSchoolPrimaryAffiliation(String value) {
        this.eduSchoolPrimaryAffiliation = value;
    }

    /**
     * Obtient la valeur de la propriété guestReadAllowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestReadAllowed() {
        return guestReadAllowed;
    }

    /**
     * Définit la valeur de la propriété guestReadAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestReadAllowed(Boolean value) {
        this.guestReadAllowed = value;
    }

    /**
     * Obtient la valeur de la propriété hasContentLicense.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasContentLicense() {
        return hasContentLicense;
    }

    /**
     * Définit la valeur de la propriété hasContentLicense.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasContentLicense(Boolean value) {
        this.hasContentLicense = value;
    }

    /**
     * Obtient la valeur de la propriété labels.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2KeyValue }
     *     
     */
    public ArrayOfTns2KeyValue getLabels() {
        return labels;
    }

    /**
     * Définit la valeur de la propriété labels.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2KeyValue }
     *     
     */
    public void setLabels(ArrayOfTns2KeyValue value) {
        this.labels = value;
    }

    /**
     * Obtient la valeur de la propriété mdsTemplate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdsTemplate() {
        return mdsTemplate;
    }

    /**
     * Définit la valeur de la propriété mdsTemplate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdsTemplate(String value) {
        this.mdsTemplate = value;
    }

    /**
     * Obtient la valeur de la propriété mimeTypeUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeTypeUrl() {
        return mimeTypeUrl;
    }

    /**
     * Définit la valeur de la propriété mimeTypeUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeTypeUrl(String value) {
        this.mimeTypeUrl = value;
    }

    /**
     * Obtient la valeur de la propriété permissions.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getPermissions() {
        return permissions;
    }

    /**
     * Définit la valeur de la propriété permissions.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setPermissions(ArrayOfXsdString value) {
        this.permissions = value;
    }

    /**
     * Obtient la valeur de la propriété previewUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewUrl() {
        return previewUrl;
    }

    /**
     * Définit la valeur de la propriété previewUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewUrl(String value) {
        this.previewUrl = value;
    }

    /**
     * Obtient la valeur de la propriété properties.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2KeyValue }
     *     
     */
    public ArrayOfTns2KeyValue getProperties() {
        return properties;
    }

    /**
     * Définit la valeur de la propriété properties.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2KeyValue }
     *     
     */
    public void setProperties(ArrayOfTns2KeyValue value) {
        this.properties = value;
    }

    /**
     * Obtient la valeur de la propriété propertiesToolInstance.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2KeyValue }
     *     
     */
    public ArrayOfTns2KeyValue getPropertiesToolInstance() {
        return propertiesToolInstance;
    }

    /**
     * Définit la valeur de la propriété propertiesToolInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2KeyValue }
     *     
     */
    public void setPropertiesToolInstance(ArrayOfTns2KeyValue value) {
        this.propertiesToolInstance = value;
    }

    /**
     * Obtient la valeur de la propriété publishRight.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublishRight() {
        return publishRight;
    }

    /**
     * Définit la valeur de la propriété publishRight.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublishRight(Boolean value) {
        this.publishRight = value;
    }

    /**
     * Obtient la valeur de la propriété remoteRoles.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getRemoteRoles() {
        return remoteRoles;
    }

    /**
     * Définit la valeur de la propriété remoteRoles.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setRemoteRoles(ArrayOfXsdString value) {
        this.remoteRoles = value;
    }

    /**
     * Obtient la valeur de la propriété usage.
     * 
     * @return
     *     possible object is
     *     {@link UsageResult }
     *     
     */
    public UsageResult getUsage() {
        return usage;
    }

    /**
     * Définit la valeur de la propriété usage.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageResult }
     *     
     */
    public void setUsage(UsageResult value) {
        this.usage = value;
    }

    /**
     * Obtient la valeur de la propriété userReadAllowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserReadAllowed() {
        return userReadAllowed;
    }

    /**
     * Définit la valeur de la propriété userReadAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserReadAllowed(Boolean value) {
        this.userReadAllowed = value;
    }

}
