
package org.edu_sharing.webservices.tracking;

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
 *         &lt;element name="event" type="{http://tracking.webservices.edu_sharing.org}TrackingItem"/&gt;
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
    "event"
})
@XmlRootElement(name = "trackEvent")
public class TrackEvent {

    @XmlElement(required = true)
    protected TrackingItem event;

    /**
     * Obtient la valeur de la propriété event.
     * 
     * @return
     *     possible object is
     *     {@link TrackingItem }
     *     
     */
    public TrackingItem getEvent() {
        return event;
    }

    /**
     * Définit la valeur de la propriété event.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingItem }
     *     
     */
    public void setEvent(TrackingItem value) {
        this.event = value;
    }

}
