package org.edu_sharing.webservices.usage2;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.0-SNAPSHOT-30b8b01da0cbd72d784fbbb0710efe252293caec
 * 2022-10-11T18:45:11.400+02:00
 * Generated source version: 4.0.0-SNAPSHOT
 *
 */
@WebServiceClient(name = "Usage2Service",
                  wsdlLocation = "classpath:wsdl/usage2.wsdl",
                  targetNamespace = "http://usage2.webservices.edu_sharing.org")
public class Usage2Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://usage2.webservices.edu_sharing.org", "Usage2Service");
    public final static QName Usage2 = new QName("http://usage2.webservices.edu_sharing.org", "usage2");
    static {
        URL url = Usage2Service.class.getClassLoader().getResource("wsdl/usage2.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(Usage2Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/usage2.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Usage2Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Usage2Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Usage2Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Usage2Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Usage2Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Usage2Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Usage2
     */
    @WebEndpoint(name = "usage2")
    public Usage2 getUsage2() {
        return super.getPort(Usage2, Usage2.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Usage2
     */
    @WebEndpoint(name = "usage2")
    public Usage2 getUsage2(WebServiceFeature... features) {
        return super.getPort(Usage2, Usage2.class, features);
    }

}
