
package org.edu_sharing.webservices.authentication;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 4.0.0-SNAPSHOT-30b8b01da0cbd72d784fbbb0710efe252293caec
 * 2022-10-11T18:45:11.239+02:00
 * Generated source version: 4.0.0-SNAPSHOT
 *
 */
public final class Authentication_Authentication_Client {

    private static final QName SERVICE_NAME = new QName("http://authentication.webservices.edu_sharing.org", "AuthenticationService");

    private Authentication_Authentication_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AuthenticationService.WSDL_LOCATION;
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

        AuthenticationService ss = new AuthenticationService(wsdlURL, SERVICE_NAME);
        Authentication port = ss.getAuthentication();

        {
        System.out.println("Invoking authenticateByCAS...");
        java.lang.String _authenticateByCAS_username = "";
        java.lang.String _authenticateByCAS_proxyTicket = "";
        try {
            org.edu_sharing.webservices.authentication.AuthenticationResult _authenticateByCAS__return = port.authenticateByCAS(_authenticateByCAS_username, _authenticateByCAS_proxyTicket);
            System.out.println("authenticateByCAS.result=" + _authenticateByCAS__return);

        } catch (AuthenticationException_Exception e) {
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking authenticate...");
        java.lang.String _authenticate_username = "";
        java.lang.String _authenticate_password = "";
        try {
            org.edu_sharing.webservices.authentication.AuthenticationResult _authenticate__return = port.authenticate(_authenticate_username, _authenticate_password);
            System.out.println("authenticate.result=" + _authenticate__return);

        } catch (AuthenticationException_Exception e) {
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking authenticateByTrustedApp...");
        java.lang.String _authenticateByTrustedApp_applicationId = "";
        java.lang.String _authenticateByTrustedApp_ticket = "";
        java.util.List<org.edu_sharing.webservices.types.KeyValue> _authenticateByTrustedApp_ssoData = null;
        try {
            org.edu_sharing.webservices.authentication.AuthenticationResult _authenticateByTrustedApp__return = port.authenticateByTrustedApp(_authenticateByTrustedApp_applicationId, _authenticateByTrustedApp_ticket, _authenticateByTrustedApp_ssoData);
            System.out.println("authenticateByTrustedApp.result=" + _authenticateByTrustedApp__return);

        } catch (AuthenticationException_Exception e) {
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking authenticateByApp...");
        java.lang.String _authenticateByApp_applicationId = "";
        java.lang.String _authenticateByApp_username = "";
        java.lang.String _authenticateByApp_email = "";
        java.lang.String _authenticateByApp_ticket = "";
        boolean _authenticateByApp_createUser = false;
        try {
            org.edu_sharing.webservices.authentication.AuthenticationResult _authenticateByApp__return = port.authenticateByApp(_authenticateByApp_applicationId, _authenticateByApp_username, _authenticateByApp_email, _authenticateByApp_ticket, _authenticateByApp_createUser);
            System.out.println("authenticateByApp.result=" + _authenticateByApp__return);

        } catch (AuthenticationException_Exception e) {
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking checkTicket...");
        java.lang.String _checkTicket_username = "";
        java.lang.String _checkTicket_ticket = "";
        try {
            boolean _checkTicket__return = port.checkTicket(_checkTicket_username, _checkTicket_ticket);
            System.out.println("checkTicket.result=" + _checkTicket__return);

        } catch (AuthenticationException_Exception e) {
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        }

            }

        System.exit(0);
    }

}
