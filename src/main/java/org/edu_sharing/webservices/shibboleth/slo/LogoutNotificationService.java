package org.edu_sharing.webservices.shibboleth.slo;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-01-04T16:42:50.356+01:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "LogoutNotificationService",
                  wsdlLocation = "classpath:wsdl/ShibbolethLogoutNotification.wsdl",
                  targetNamespace = "http://slo.shibboleth.webservices.edu_sharing.org")
public class LogoutNotificationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://slo.shibboleth.webservices.edu_sharing.org", "LogoutNotificationService");
    public final static QName LogoutNotification = new QName("http://slo.shibboleth.webservices.edu_sharing.org", "LogoutNotification");
    static {
        URL url = LogoutNotificationService.class.getClassLoader().getResource("wsdl/ShibbolethLogoutNotification.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(LogoutNotificationService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/ShibbolethLogoutNotification.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LogoutNotificationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LogoutNotificationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LogoutNotificationService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public LogoutNotificationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public LogoutNotificationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public LogoutNotificationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns LogoutNotification
     */
    @WebEndpoint(name = "LogoutNotification")
    public LogoutNotification getLogoutNotification() {
        return super.getPort(LogoutNotification, LogoutNotification.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LogoutNotification
     */
    @WebEndpoint(name = "LogoutNotification")
    public LogoutNotification getLogoutNotification(WebServiceFeature... features) {
        return super.getPort(LogoutNotification, LogoutNotification.class, features);
    }

}
