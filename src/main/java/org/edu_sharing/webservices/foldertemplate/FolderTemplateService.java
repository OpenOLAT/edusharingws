package org.edu_sharing.webservices.foldertemplate;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-01-03T11:03:55.403+01:00
 * Generated source version: 4.0.0
 *
 */
@WebServiceClient(name = "FolderTemplateService",
                  wsdlLocation = "classpath:wsdl/FolderTemplate.wsdl",
                  targetNamespace = "http://foldertemplate.webservices.edu_sharing.org")
public class FolderTemplateService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://foldertemplate.webservices.edu_sharing.org", "FolderTemplateService");
    public final static QName FolderTemplate = new QName("http://foldertemplate.webservices.edu_sharing.org", "FolderTemplate");
    static {
        URL url = FolderTemplateService.class.getClassLoader().getResource("wsdl/FolderTemplate.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(FolderTemplateService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/FolderTemplate.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FolderTemplateService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FolderTemplateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FolderTemplateService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public FolderTemplateService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public FolderTemplateService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public FolderTemplateService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns FolderTemplate
     */
    @WebEndpoint(name = "FolderTemplate")
    public FolderTemplate getFolderTemplate() {
        return super.getPort(FolderTemplate, FolderTemplate.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FolderTemplate
     */
    @WebEndpoint(name = "FolderTemplate")
    public FolderTemplate getFolderTemplate(WebServiceFeature... features) {
        return super.getPort(FolderTemplate, FolderTemplate.class, features);
    }

}
