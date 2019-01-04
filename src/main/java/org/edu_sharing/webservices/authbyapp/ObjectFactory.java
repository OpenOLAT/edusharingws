
package org.edu_sharing.webservices.authbyapp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.edu_sharing.webservices.authentication.AuthenticationException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.edu_sharing.webservices.authbyapp package. 
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

    private final static QName _Fault_QNAME = new QName("http://authbyapp.webservices.edu_sharing.org", "fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.edu_sharing.webservices.authbyapp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckTicket }
     * 
     */
    public CheckTicket createCheckTicket() {
        return new CheckTicket();
    }

    /**
     * Create an instance of {@link CheckTicketResponse }
     * 
     */
    public CheckTicketResponse createCheckTicketResponse() {
        return new CheckTicketResponse();
    }

    /**
     * Create an instance of {@link AuthenticateByTrustedApp }
     * 
     */
    public AuthenticateByTrustedApp createAuthenticateByTrustedApp() {
        return new AuthenticateByTrustedApp();
    }

    /**
     * Create an instance of {@link AuthenticateByTrustedAppResponse }
     * 
     */
    public AuthenticateByTrustedAppResponse createAuthenticateByTrustedAppResponse() {
        return new AuthenticateByTrustedAppResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authbyapp.webservices.edu_sharing.org", name = "fault")
    public JAXBElement<AuthenticationException> createFault(AuthenticationException value) {
        return new JAXBElement<AuthenticationException>(_Fault_QNAME, AuthenticationException.class, null, value);
    }

}
