
package org.edu_sharing.webservices.render;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-01-03T11:03:55.760+01:00
 * Generated source version: 4.0.0
 *
 */
public final class RenderInfo_RenderInfo_Client {

    private static final QName SERVICE_NAME = new QName("http://render.webservices.edu_sharing.org", "RenderInfoService");

    private RenderInfo_RenderInfo_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RenderInfoService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        RenderInfoService ss = new RenderInfoService(wsdlURL, SERVICE_NAME);
        RenderInfo port = ss.getRenderInfo();

        {
        System.out.println("Invoking getRenderInfoRepo...");
        java.lang.String _getRenderInfoRepo_userName = "";
        java.lang.String _getRenderInfoRepo_nodeId = "";
        java.lang.String _getRenderInfoRepo_version = "";
        org.edu_sharing.webservices.render.RenderInfoResult _getRenderInfoRepo__return = port.getRenderInfoRepo(_getRenderInfoRepo_userName, _getRenderInfoRepo_nodeId, _getRenderInfoRepo_version);
        System.out.println("getRenderInfoRepo.result=" + _getRenderInfoRepo__return);


        }
        {
        System.out.println("Invoking getRenderInfoLMS...");
        java.lang.String _getRenderInfoLMS_userName = "";
        java.lang.String _getRenderInfoLMS_nodeId = "";
        java.lang.String _getRenderInfoLMS_lmsId = "";
        java.lang.String _getRenderInfoLMS_courseId = "";
        java.lang.String _getRenderInfoLMS_resourceId = "";
        java.lang.String _getRenderInfoLMS_version = "";
        org.edu_sharing.webservices.render.RenderInfoResult _getRenderInfoLMS__return = port.getRenderInfoLMS(_getRenderInfoLMS_userName, _getRenderInfoLMS_nodeId, _getRenderInfoLMS_lmsId, _getRenderInfoLMS_courseId, _getRenderInfoLMS_resourceId, _getRenderInfoLMS_version);
        System.out.println("getRenderInfoLMS.result=" + _getRenderInfoLMS__return);


        }

        System.exit(0);
    }

}
