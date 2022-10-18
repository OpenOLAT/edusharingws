
package org.edu_sharing.webservices.tracking;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.edu_sharing.webservices.tracking package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Fault_QNAME = new QName("http://tracking.webservices.edu_sharing.org", "fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.edu_sharing.webservices.tracking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrackEvent }
     * 
     */
    public TrackEvent createTrackEvent() {
        return new TrackEvent();
    }

    /**
     * Create an instance of {@link TrackingItem }
     * 
     */
    public TrackingItem createTrackingItem() {
        return new TrackingItem();
    }

    /**
     * Create an instance of {@link TrackEventResponse }
     * 
     */
    public TrackEventResponse createTrackEventResponse() {
        return new TrackEventResponse();
    }

    /**
     * Create an instance of {@link TrackingException }
     * 
     */
    public TrackingException createTrackingException() {
        return new TrackingException();
    }

    /**
     * Create an instance of {@link TrackEvents }
     * 
     */
    public TrackEvents createTrackEvents() {
        return new TrackEvents();
    }

    /**
     * Create an instance of {@link TrackEventsResponse }
     * 
     */
    public TrackEventsResponse createTrackEventsResponse() {
        return new TrackEventsResponse();
    }

    /**
     * Create an instance of {@link TrackingItemContext }
     * 
     */
    public TrackingItemContext createTrackingItemContext() {
        return new TrackingItemContext();
    }

    /**
     * Create an instance of {@link ArrayOfTrackingItemContext }
     * 
     */
    public ArrayOfTrackingItemContext createArrayOfTrackingItemContext() {
        return new ArrayOfTrackingItemContext();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackingException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrackingException }{@code >}
     */
    @XmlElementDecl(namespace = "http://tracking.webservices.edu_sharing.org", name = "fault")
    public JAXBElement<TrackingException> createFault(TrackingException value) {
        return new JAXBElement<TrackingException>(_Fault_QNAME, TrackingException.class, null, value);
    }

}
