
package org.edu_sharing.webservices.authbyapp;

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
 * 2023-01-03T11:03:55.818+01:00
 * Generated source version: 4.0.0
 *
 */
public final class AuthByApp_Authbyapp_Client {

    private static final QName SERVICE_NAME = new QName("http://authbyapp.webservices.edu_sharing.org", "AuthByAppService");

    private AuthByApp_Authbyapp_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AuthByAppService.WSDL_LOCATION;
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

        AuthByAppService ss = new AuthByAppService(wsdlURL, SERVICE_NAME);
        AuthByApp port = ss.getAuthbyapp();

        {
        System.out.println("Invoking checkTicket...");
        java.lang.String _checkTicket_ticket = "";
        try {
            boolean _checkTicket__return = port.checkTicket(_checkTicket_ticket);
            System.out.println("checkTicket.result=" + _checkTicket__return);

        } catch (AuthenticationException e) {
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking authenticateByTrustedApp...");
        java.lang.String _authenticateByTrustedApp_applicationId = "";
        java.util.List<org.edu_sharing.webservices.types.KeyValue> _authenticateByTrustedApp_ssoData = null;
        try {
            org.edu_sharing.webservices.authentication.AuthenticationResult _authenticateByTrustedApp__return = port.authenticateByTrustedApp(_authenticateByTrustedApp_applicationId, _authenticateByTrustedApp_ssoData);
            System.out.println("authenticateByTrustedApp.result=" + _authenticateByTrustedApp__return);

        } catch (AuthenticationException e) {
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        }

            }

        System.exit(0);
    }

}
