
package org.edu_sharing.webservices.usage;

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
 * 2023-01-03T11:03:55.953+01:00
 * Generated source version: 4.0.0
 *
 */
public final class Usage_Usage_Client {

    private static final QName SERVICE_NAME = new QName("http://usage.webservices.edu_sharing.org", "UsageService");

    private Usage_Usage_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = UsageService.WSDL_LOCATION;
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

        UsageService ss = new UsageService(wsdlURL, SERVICE_NAME);
        Usage port = ss.getUsage();

        {
        System.out.println("Invoking getUsage...");
        java.lang.String _getUsage_repositoryTicket = "";
        java.lang.String _getUsage_repositoryUsername = "";
        java.lang.String _getUsage_lmsId = "";
        java.lang.String _getUsage_courseId = "";
        java.lang.String _getUsage_parentNodeId = "";
        java.lang.String _getUsage_appUser = "";
        java.lang.String _getUsage_resourceId = "";
        try {
            org.edu_sharing.webservices.usage.UsageResult _getUsage__return = port.getUsage(_getUsage_repositoryTicket, _getUsage_repositoryUsername, _getUsage_lmsId, _getUsage_courseId, _getUsage_parentNodeId, _getUsage_appUser, _getUsage_resourceId);
            System.out.println("getUsage.result=" + _getUsage__return);

        } catch (AuthenticationException e) {
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (UsageException_Exception e) {
            System.out.println("Expected exception: UsageException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking setUsage...");
        java.lang.String _setUsage_repositoryTicket = "";
        java.lang.String _setUsage_repositoryUsername = "";
        java.lang.String _setUsage_lmsId = "";
        java.lang.String _setUsage_courseId = "";
        java.lang.String _setUsage_parentNodeId = "";
        java.lang.String _setUsage_appUser = "";
        java.lang.String _setUsage_appUserMail = "";
        javax.xml.datatype.XMLGregorianCalendar _setUsage_fromUsed = null;
        javax.xml.datatype.XMLGregorianCalendar _setUsage_toUsed = null;
        int _setUsage_distinctPersons = 0;
        java.lang.String _setUsage_version = "";
        java.lang.String _setUsage_resourceId = "";
        java.lang.String _setUsage_xmlParams = "";
        try {
            port.setUsage(_setUsage_repositoryTicket, _setUsage_repositoryUsername, _setUsage_lmsId, _setUsage_courseId, _setUsage_parentNodeId, _setUsage_appUser, _setUsage_appUserMail, _setUsage_fromUsed, _setUsage_toUsed, _setUsage_distinctPersons, _setUsage_version, _setUsage_resourceId, _setUsage_xmlParams);

        } catch (AuthenticationException e) {
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (UsageException_Exception e) {
            System.out.println("Expected exception: UsageException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking deleteUsages...");
        java.lang.String _deleteUsages_repositoryTicket = "";
        java.lang.String _deleteUsages_repositoryUsername = "";
        java.lang.String _deleteUsages_appSessionId = "";
        java.lang.String _deleteUsages_appCurrentUserId = "";
        java.lang.String _deleteUsages_lmsId = "";
        java.lang.String _deleteUsages_courseId = "";
        try {
            boolean _deleteUsages__return = port.deleteUsages(_deleteUsages_repositoryTicket, _deleteUsages_repositoryUsername, _deleteUsages_appSessionId, _deleteUsages_appCurrentUserId, _deleteUsages_lmsId, _deleteUsages_courseId);
            System.out.println("deleteUsages.result=" + _deleteUsages__return);

        } catch (AuthenticationException e) {
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (UsageException_Exception e) {
            System.out.println("Expected exception: UsageException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking getUsageByParentNodeId...");
        java.lang.String _getUsageByParentNodeId_repositoryTicket = "";
        java.lang.String _getUsageByParentNodeId_repositoryUsername = "";
        java.lang.String _getUsageByParentNodeId_parentNodeId = "";
        try {
            java.util.List<org.edu_sharing.webservices.usage.UsageResult> _getUsageByParentNodeId__return = port.getUsageByParentNodeId(_getUsageByParentNodeId_repositoryTicket, _getUsageByParentNodeId_repositoryUsername, _getUsageByParentNodeId_parentNodeId);
            System.out.println("getUsageByParentNodeId.result=" + _getUsageByParentNodeId__return);

        } catch (AuthenticationException e) {
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (UsageException_Exception e) {
            System.out.println("Expected exception: UsageException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking deleteUsage...");
        java.lang.String _deleteUsage_repositoryTicket = "";
        java.lang.String _deleteUsage_repositoryUsername = "";
        java.lang.String _deleteUsage_appSessionId = "";
        java.lang.String _deleteUsage_appCurrentUserId = "";
        java.lang.String _deleteUsage_lmsId = "";
        java.lang.String _deleteUsage_courseId = "";
        java.lang.String _deleteUsage_parentNodeId = "";
        java.lang.String _deleteUsage_resourceId = "";
        try {
            boolean _deleteUsage__return = port.deleteUsage(_deleteUsage_repositoryTicket, _deleteUsage_repositoryUsername, _deleteUsage_appSessionId, _deleteUsage_appCurrentUserId, _deleteUsage_lmsId, _deleteUsage_courseId, _deleteUsage_parentNodeId, _deleteUsage_resourceId);
            System.out.println("deleteUsage.result=" + _deleteUsage__return);

        } catch (AuthenticationException e) {
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (UsageException_Exception e) {
            System.out.println("Expected exception: UsageException has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking usageAllowed...");
        java.lang.String _usageAllowed_repositoryTicket = "";
        java.lang.String _usageAllowed_repositoryUsername = "";
        java.lang.String _usageAllowed_nodeId = "";
        java.lang.String _usageAllowed_lmsId = "";
        java.lang.String _usageAllowed_courseId = "";
        try {
            boolean _usageAllowed__return = port.usageAllowed(_usageAllowed_repositoryTicket, _usageAllowed_repositoryUsername, _usageAllowed_nodeId, _usageAllowed_lmsId, _usageAllowed_courseId);
            System.out.println("usageAllowed.result=" + _usageAllowed__return);

        } catch (AuthenticationException e) {
            System.out.println("Expected exception: AuthenticationException has occurred.");
            System.out.println(e.toString());
        } catch (UsageException_Exception e) {
            System.out.println("Expected exception: UsageException has occurred.");
            System.out.println(e.toString());
        }

            }

        System.exit(0);
    }

}
