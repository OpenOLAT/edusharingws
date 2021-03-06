
package org.edu_sharing.webservices.crud;

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
 * 2019-01-04T16:42:50.530+01:00
 * Generated source version: 3.2.7
 *
 */
public final class Crud_Crud_Client {

    private static final QName SERVICE_NAME = new QName("http://crud.webservices.edu_sharing.org", "CrudService");

    private Crud_Crud_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CrudService.WSDL_LOCATION;
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

        CrudService ss = new CrudService(wsdlURL, SERVICE_NAME);
        Crud port = ss.getCrud();

        {
        System.out.println("Invoking update...");
        java.lang.String _update_username = "";
        java.lang.String _update_ticket = "";
        java.lang.String _update_nodeType = "";
        java.lang.String _update_repositoryId = "";
        java.lang.String _update_nodeId = "";
        org.apache.xml.xml_soap.Map _update_properties = null;
        byte[] _update_content = new byte[0];
        byte[] _update_icon = new byte[0];
        java.lang.String _update__return = port.update(_update_username, _update_ticket, _update_nodeType, _update_repositoryId, _update_nodeId, _update_properties, _update_content, _update_icon);
        System.out.println("update.result=" + _update__return);


        }
        {
        System.out.println("Invoking create...");
        java.lang.String _create_username = "";
        java.lang.String _create_ticket = "";
        java.lang.String _create_nodeType = "";
        java.lang.String _create_repositoryId = "";
        org.apache.xml.xml_soap.Map _create_properties = null;
        byte[] _create_content = new byte[0];
        byte[] _create_icon = new byte[0];
        java.lang.String _create__return = port.create(_create_username, _create_ticket, _create_nodeType, _create_repositoryId, _create_properties, _create_content, _create_icon);
        System.out.println("create.result=" + _create__return);


        }

        System.exit(0);
    }

}
