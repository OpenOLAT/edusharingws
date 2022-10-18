
package org.edu_sharing.webservices.tracking;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TrackingItem complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrackingItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="context" type="{http://tracking.webservices.edu_sharing.org}ArrayOfTrackingItemContext"/&gt;
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlType(name = "TrackingItem", propOrder = {
    "activity",
    "applicationId",
    "context",
    "place",
    "session",
    "time",
    "version"
})
public class TrackingItem {

    @XmlElement(required = true)
    protected String activity;
    @XmlElement(required = true)
    protected String applicationId;
    @XmlElement(required = true)
    protected ArrayOfTrackingItemContext context;
    @XmlElement(required = true)
    protected String place;
    @XmlElement(required = true)
    protected String session;
    protected long time;
    @XmlElement(required = true)
    protected String version;

    /**
     * Obtient la valeur de la propriété activity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Définit la valeur de la propriété activity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Obtient la valeur de la propriété applicationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Définit la valeur de la propriété applicationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * Obtient la valeur de la propriété context.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackingItemContext }
     *     
     */
    public ArrayOfTrackingItemContext getContext() {
        return context;
    }

    /**
     * Définit la valeur de la propriété context.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackingItemContext }
     *     
     */
    public void setContext(ArrayOfTrackingItemContext value) {
        this.context = value;
    }

    /**
     * Obtient la valeur de la propriété place.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Définit la valeur de la propriété place.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Obtient la valeur de la propriété session.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSession() {
        return session;
    }

    /**
     * Définit la valeur de la propriété session.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSession(String value) {
        this.session = value;
    }

    /**
     * Obtient la valeur de la propriété time.
     * 
     */
    public long getTime() {
        return time;
    }

    /**
     * Définit la valeur de la propriété time.
     * 
     */
    public void setTime(long value) {
        this.time = value;
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
