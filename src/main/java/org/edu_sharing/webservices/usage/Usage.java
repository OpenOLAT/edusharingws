package org.edu_sharing.webservices.usage;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-01-04T16:42:50.686+01:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://usage.webservices.edu_sharing.org", name = "Usage")
@XmlSeeAlso({ObjectFactory.class, org.edu_sharing.webservices.authentication.ObjectFactory.class})
public interface Usage {

    @WebMethod
    @RequestWrapper(localName = "getUsage", targetNamespace = "http://usage.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage.GetUsage")
    @ResponseWrapper(localName = "getUsageResponse", targetNamespace = "http://usage.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage.GetUsageResponse")
    @WebResult(name = "getUsageReturn", targetNamespace = "http://usage.webservices.edu_sharing.org")
    public org.edu_sharing.webservices.usage.UsageResult getUsage(
        @WebParam(name = "repositoryTicket", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String repositoryTicket,
        @WebParam(name = "repositoryUsername", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String repositoryUsername,
        @WebParam(name = "lmsId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String lmsId,
        @WebParam(name = "courseId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String courseId,
        @WebParam(name = "parentNodeId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String parentNodeId,
        @WebParam(name = "appUser", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String appUser,
        @WebParam(name = "resourceId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String resourceId
    ) throws AuthenticationException, UsageException_Exception;

    @WebMethod
    @RequestWrapper(localName = "setUsage", targetNamespace = "http://usage.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage.SetUsage")
    @ResponseWrapper(localName = "setUsageResponse", targetNamespace = "http://usage.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage.SetUsageResponse")
    public void setUsage(
        @WebParam(name = "repositoryTicket", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String repositoryTicket,
        @WebParam(name = "repositoryUsername", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String repositoryUsername,
        @WebParam(name = "lmsId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String lmsId,
        @WebParam(name = "courseId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String courseId,
        @WebParam(name = "parentNodeId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String parentNodeId,
        @WebParam(name = "appUser", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String appUser,
        @WebParam(name = "appUserMail", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String appUserMail,
        @WebParam(name = "fromUsed", targetNamespace = "http://usage.webservices.edu_sharing.org")
        javax.xml.datatype.XMLGregorianCalendar fromUsed,
        @WebParam(name = "toUsed", targetNamespace = "http://usage.webservices.edu_sharing.org")
        javax.xml.datatype.XMLGregorianCalendar toUsed,
        @WebParam(name = "distinctPersons", targetNamespace = "http://usage.webservices.edu_sharing.org")
        int distinctPersons,
        @WebParam(name = "version", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String version,
        @WebParam(name = "resourceId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String resourceId,
        @WebParam(name = "xmlParams", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String xmlParams
    ) throws AuthenticationException, UsageException_Exception;

    @WebMethod
    @RequestWrapper(localName = "deleteUsages", targetNamespace = "http://usage.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage.DeleteUsages")
    @ResponseWrapper(localName = "deleteUsagesResponse", targetNamespace = "http://usage.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage.DeleteUsagesResponse")
    @WebResult(name = "deleteUsagesReturn", targetNamespace = "http://usage.webservices.edu_sharing.org")
    public boolean deleteUsages(
        @WebParam(name = "repositoryTicket", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String repositoryTicket,
        @WebParam(name = "repositoryUsername", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String repositoryUsername,
        @WebParam(name = "appSessionId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String appSessionId,
        @WebParam(name = "appCurrentUserId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String appCurrentUserId,
        @WebParam(name = "lmsId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String lmsId,
        @WebParam(name = "courseId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String courseId
    ) throws AuthenticationException, UsageException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getUsageByParentNodeId", targetNamespace = "http://usage.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage.GetUsageByParentNodeId")
    @ResponseWrapper(localName = "getUsageByParentNodeIdResponse", targetNamespace = "http://usage.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage.GetUsageByParentNodeIdResponse")
    @WebResult(name = "getUsageByParentNodeIdReturn", targetNamespace = "http://usage.webservices.edu_sharing.org")
    public java.util.List<org.edu_sharing.webservices.usage.UsageResult> getUsageByParentNodeId(
        @WebParam(name = "repositoryTicket", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String repositoryTicket,
        @WebParam(name = "repositoryUsername", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String repositoryUsername,
        @WebParam(name = "parentNodeId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String parentNodeId
    ) throws AuthenticationException, UsageException_Exception;

    @WebMethod
    @RequestWrapper(localName = "deleteUsage", targetNamespace = "http://usage.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage.DeleteUsage")
    @ResponseWrapper(localName = "deleteUsageResponse", targetNamespace = "http://usage.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage.DeleteUsageResponse")
    @WebResult(name = "deleteUsageReturn", targetNamespace = "http://usage.webservices.edu_sharing.org")
    public boolean deleteUsage(
        @WebParam(name = "repositoryTicket", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String repositoryTicket,
        @WebParam(name = "repositoryUsername", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String repositoryUsername,
        @WebParam(name = "appSessionId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String appSessionId,
        @WebParam(name = "appCurrentUserId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String appCurrentUserId,
        @WebParam(name = "lmsId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String lmsId,
        @WebParam(name = "courseId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String courseId,
        @WebParam(name = "parentNodeId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String parentNodeId,
        @WebParam(name = "resourceId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String resourceId
    ) throws AuthenticationException, UsageException_Exception;

    @WebMethod
    @RequestWrapper(localName = "usageAllowed", targetNamespace = "http://usage.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage.UsageAllowed")
    @ResponseWrapper(localName = "usageAllowedResponse", targetNamespace = "http://usage.webservices.edu_sharing.org", className = "org.edu_sharing.webservices.usage.UsageAllowedResponse")
    @WebResult(name = "usageAllowedReturn", targetNamespace = "http://usage.webservices.edu_sharing.org")
    public boolean usageAllowed(
        @WebParam(name = "repositoryTicket", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String repositoryTicket,
        @WebParam(name = "repositoryUsername", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String repositoryUsername,
        @WebParam(name = "nodeId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String nodeId,
        @WebParam(name = "lmsId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String lmsId,
        @WebParam(name = "courseId", targetNamespace = "http://usage.webservices.edu_sharing.org")
        java.lang.String courseId
    ) throws AuthenticationException, UsageException_Exception;
}