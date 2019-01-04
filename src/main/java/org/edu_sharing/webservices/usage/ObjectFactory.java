
package org.edu_sharing.webservices.usage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.edu_sharing.webservices.authentication.AuthenticationException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.edu_sharing.webservices.usage package. 
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

    private final static QName _Fault_QNAME = new QName("http://usage.webservices.edu_sharing.org", "fault");
    private final static QName _Fault1_QNAME = new QName("http://usage.webservices.edu_sharing.org", "fault1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.edu_sharing.webservices.usage
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link UsageException }
     * 
     */
    public UsageException createUsageException() {
        return new UsageException();
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
     * Create an instance of {@link UsageResult }
     * 
     */
    public UsageResult createUsageResult() {
        return new UsageResult();
    }

    /**
     * Create an instance of {@link DeleteUsages }
     * 
     */
    public DeleteUsages createDeleteUsages() {
        return new DeleteUsages();
    }

    /**
     * Create an instance of {@link DeleteUsagesResponse }
     * 
     */
    public DeleteUsagesResponse createDeleteUsagesResponse() {
        return new DeleteUsagesResponse();
    }

    /**
     * Create an instance of {@link UsageAllowed }
     * 
     */
    public UsageAllowed createUsageAllowed() {
        return new UsageAllowed();
    }

    /**
     * Create an instance of {@link UsageAllowedResponse }
     * 
     */
    public UsageAllowedResponse createUsageAllowedResponse() {
        return new UsageAllowedResponse();
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
     * Create an instance of {@link GetUsageByParentNodeId }
     * 
     */
    public GetUsageByParentNodeId createGetUsageByParentNodeId() {
        return new GetUsageByParentNodeId();
    }

    /**
     * Create an instance of {@link GetUsageByParentNodeIdResponse }
     * 
     */
    public GetUsageByParentNodeIdResponse createGetUsageByParentNodeIdResponse() {
        return new GetUsageByParentNodeIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsageException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usage.webservices.edu_sharing.org", name = "fault")
    public JAXBElement<UsageException> createFault(UsageException value) {
        return new JAXBElement<UsageException>(_Fault_QNAME, UsageException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usage.webservices.edu_sharing.org", name = "fault1")
    public JAXBElement<AuthenticationException> createFault1(AuthenticationException value) {
        return new JAXBElement<AuthenticationException>(_Fault1_QNAME, AuthenticationException.class, null, value);
    }

}
