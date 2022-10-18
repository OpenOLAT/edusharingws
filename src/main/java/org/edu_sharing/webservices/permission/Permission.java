package org.edu_sharing.webservices.permission;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.0-SNAPSHOT-30b8b01da0cbd72d784fbbb0710efe252293caec
 * 2022-10-11T18:45:11.298+02:00
 * Generated source version: 4.0.0-SNAPSHOT
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
