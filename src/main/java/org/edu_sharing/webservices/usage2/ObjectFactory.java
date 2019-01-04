
package org.edu_sharing.webservices.usage2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.edu_sharing.webservices.usage2 package. 
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

    private final static QName _Fault_QNAME = new QName("http://usage2.webservices.edu_sharing.org", "fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.edu_sharing.webservices.usage2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUsagesByEduRef }
     * 
     */
    public GetUsagesByEduRef createGetUsagesByEduRef() {
        return new GetUsagesByEduRef();
    }

    /**
     * Create an instance of {@link GetUsagesByEduRefResponse }
     * 
     */
    public GetUsagesByEduRefResponse createGetUsagesByEduRefResponse() {
        return new GetUsagesByEduRefResponse();
    }

    /**
     * Create an instance of {@link Usage2Result }
     * 
     */
    public Usage2Result createUsage2Result() {
        return new Usage2Result();
    }

    /**
     * Create an instance of {@link Usage2Exception }
     * 
     */
    public Usage2Exception createUsage2Exception() {
        return new Usage2Exception();
    }

    /**
     * Create an instance of {@link DeleteUsage }
     * 
     */
    public DeleteUsage createDeleteUsage() {
        return new DeleteUsage();
    }

    /**
     * Create an instance of {@link DeleteUsageResponse }
     * 
     */
    public DeleteUsageResponse createDeleteUsageResponse() {
        return new DeleteUsageResponse();
    }

    /**
     * Create an instance of {@link GetUsage }
     * 
     */
    public GetUsage createGetUsage() {
        return new GetUsage();
    }

    /**
     * Create an instance of {@link GetUsageResponse }
     * 
     */
    public GetUsageResponse createGetUsageResponse() {
        return new GetUsageResponse();
    }

    /**
     * Create an instance of {@link SetUsage }
     * 
     */
    public SetUsage createSetUsage() {
        return new SetUsage();
    }

    /**
     * Create an instance of {@link SetUsageResponse }
     * 
     */
    public SetUsageResponse createSetUsageResponse() {
        return new SetUsageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usage2Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usage2.webservices.edu_sharing.org", name = "fault")
    public JAXBElement<Usage2Exception> createFault(Usage2Exception value) {
        return new JAXBElement<Usage2Exception>(_Fault_QNAME, Usage2Exception.class, null, value);
    }

}
