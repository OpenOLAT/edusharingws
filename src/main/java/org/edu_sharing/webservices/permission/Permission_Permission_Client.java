
package org.edu_sharing.webservices.permission;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-01-04T16:42:50.569+01:00
 * Generated source version: 3.2.7
 *
 */
public final class Permission_Permission_Client {

    private static final QName SERVICE_NAME = new QName("http://permission.webservices.edu_sharing.org", "PermissionService");

    private Permission_Permission_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = PermissionService.WSDL_LOCATION;
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

        PermissionService ss = new PermissionService(wsdlURL, SERVICE_NAME);
        Permission port = ss.getPermission();

        {
        System.out.println("Invoking getPermission...");
        java.lang.String _getPermission_session = "";
        int _getPermission_courseid = 0;
        java.lang.String _getPermission_action = "";
        java.lang.String _getPermission_resourceid = "";
        boolean _getPermission__return = port.getPermission(_getPermission_session, _getPermission_courseid, _getPermission_action, _getPermission_resourceid);
        System.out.println("getPermission.result=" + _getPermission__return);


        }
        {
        System.out.println("Invoking checkCourse...");
        java.lang.String _checkCourse_in0 = "";
        int _checkCourse_in1 = 0;
        java.lang.String _checkCourse__return = port.checkCourse(_checkCourse_in0, _checkCourse_in1);
        System.out.println("checkCourse.result=" + _checkCourse__return);


        }

        System.exit(0);
    }

}