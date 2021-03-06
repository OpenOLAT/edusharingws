package org.edu_sharing.webservices.usage2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-01-04T16:42:50.737+01:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://usage2.webservices.edu_sharing.org", name = "Usage2")
@XmlSeeAlso({ObjectFactory.class})
public interface Usage2 {

    @WebMethod
    @RequestWrapper(localName = "getUsagesByEduRef", targetNamespace = "http://usage2.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage2.GetUsagesByEduRef")
    @ResponseWrapper(localName = "getUsagesByEduRefResponse", targetNamespace = "http://usage2.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage2.GetUsagesByEduRefResponse")
    @WebResult(name = "getUsagesByEduRefReturn", targetNamespace = "http://usage2.webservices.edu_sharing.org")
    public java.util.List<org.edu_sharing.webservices.usage2.Usage2Result> getUsagesByEduRef(
        @WebParam(name = "eduRef", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String eduRef,
        @WebParam(name = "user", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String user
    ) throws Usage2Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "setUsage", targetNamespace = "http://usage2.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage2.SetUsage")
    @ResponseWrapper(localName = "setUsageResponse", targetNamespace = "http://usage2.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage2.SetUsageResponse")
    @WebResult(name = "setUsageReturn", targetNamespace = "http://usage2.webservices.edu_sharing.org")
    public org.edu_sharing.webservices.usage2.Usage2Result setUsage(
        @WebParam(name = "eduRef", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String eduRef,
        @WebParam(name = "user", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String user,
        @WebParam(name = "lmsId", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String lmsId,
        @WebParam(name = "courseId", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String courseId,
        @WebParam(name = "userMail", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String userMail,
        @WebParam(name = "fromUsed", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        javax.xml.datatype.XMLGregorianCalendar fromUsed,
        @WebParam(name = "toUsed", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        javax.xml.datatype.XMLGregorianCalendar toUsed,
        @WebParam(name = "distinctPersons", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        int distinctPersons,
        @WebParam(name = "version", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String version,
        @WebParam(name = "resourceId", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String resourceId,
        @WebParam(name = "xmlParams", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String xmlParams
    ) throws Usage2Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "getUsage", targetNamespace = "http://usage2.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage2.GetUsage")
    @ResponseWrapper(localName = "getUsageResponse", targetNamespace = "http://usage2.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage2.GetUsageResponse")
    @WebResult(name = "getUsageReturn", targetNamespace = "http://usage2.webservices.edu_sharing.org")
    public org.edu_sharing.webservices.usage2.Usage2Result getUsage(
        @WebParam(name = "eduRef", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String eduRef,
        @WebParam(name = "lmsId", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String lmsId,
        @WebParam(name = "courseId", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String courseId,
        @WebParam(name = "user", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String user,
        @WebParam(name = "resourceId", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String resourceId
    ) throws Usage2Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "deleteUsage", targetNamespace = "http://usage2.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage2.DeleteUsage")
    @ResponseWrapper(localName = "deleteUsageResponse", targetNamespace = "http://usage2.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage2.DeleteUsageResponse")
    @WebResult(name = "deleteUsageReturn", targetNamespace = "http://usage2.webservices.edu_sharing.org")
    public boolean deleteUsage(
        @WebParam(name = "eduRef", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String eduRef,
        @WebParam(name = "user", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String user,
        @WebParam(name = "lmsId", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String lmsId,
        @WebParam(name = "courseId", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String courseId,
        @WebParam(name = "resourceId", targetNamespace = "http://usage2.webservices.edu_sharing.org")
        java.lang.String resourceId
    ) throws Usage2Exception_Exception;
}
