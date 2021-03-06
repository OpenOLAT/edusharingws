package org.edu_sharing.webservices.permission;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-01-04T16:42:50.572+01:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://permission.webservices.edu_sharing.org", name = "Permission")
@XmlSeeAlso({ObjectFactory.class})
public interface Permission {

    @WebMethod
    @RequestWrapper(localName = "getPermission", targetNamespace = "http://permission.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.permission.GetPermission")
    @ResponseWrapper(localName = "getPermissionResponse", targetNamespace = "http://permission.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.permission.GetPermissionResponse")
    @WebResult(name = "getPermissionReturn", targetNamespace = "http://permission.webservices.edu_sharing.org")
    public boolean getPermission(
        @WebParam(name = "session", targetNamespace = "http://permission.webservices.edu_sharing.org")
        java.lang.String session,
        @WebParam(name = "courseid", targetNamespace = "http://permission.webservices.edu_sharing.org")
        int courseid,
        @WebParam(name = "action", targetNamespace = "http://permission.webservices.edu_sharing.org")
        java.lang.String action,
        @WebParam(name = "resourceid", targetNamespace = "http://permission.webservices.edu_sharing.org")
        java.lang.String resourceid
    );

    @WebMethod
    @RequestWrapper(localName = "checkCourse", targetNamespace = "http://permission.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.permission.CheckCourse")
    @ResponseWrapper(localName = "checkCourseResponse", targetNamespace = "http://permission.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.permission.CheckCourseResponse")
    @WebResult(name = "checkCourseReturn", targetNamespace = "http://permission.webservices.edu_sharing.org")
    public java.lang.String checkCourse(
        @WebParam(name = "in0", targetNamespace = "http://permission.webservices.edu_sharing.org")
        java.lang.String in0,
        @WebParam(name = "in1", targetNamespace = "http://permission.webservices.edu_sharing.org")
        int in1
    );
}
