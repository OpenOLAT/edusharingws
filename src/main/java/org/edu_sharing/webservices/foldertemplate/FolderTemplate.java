package org.edu_sharing.webservices.foldertemplate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-01-04T16:42:49.693+01:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://foldertemplate.webservices.edu_sharing.org", name = "FolderTemplate")
@XmlSeeAlso({ObjectFactory.class})
public interface FolderTemplate {

    @WebMethod
    @RequestWrapper(localName = "process", targetNamespace = "http://foldertemplate.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.foldertemplate.Process")
    @ResponseWrapper(localName = "processResponse", targetNamespace = "http://foldertemplate.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.foldertemplate.ProcessResponse")
    @WebResult(name = "processReturn", targetNamespace = "http://foldertemplate.webservices.edu_sharing.org")
    public java.lang.String process(
        @WebParam(name = "template", targetNamespace = "http://foldertemplate.webservices.edu_sharing.org")
        java.lang.String template,
        @WebParam(name = "group", targetNamespace = "http://foldertemplate.webservices.edu_sharing.org")
        java.lang.String group,
        @WebParam(name = "folderid", targetNamespace = "http://foldertemplate.webservices.edu_sharing.org")
        java.lang.String folderid
    );
}
