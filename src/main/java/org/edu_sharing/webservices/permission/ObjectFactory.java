
package org.edu_sharing.webservices.permission;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.edu_sharing.webservices.permission package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.edu_sharing.webservices.permission
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckCourse }
     * 
     */
    public CheckCourse createCheckCourse() {
        return new CheckCourse();
    }

    /**
     * Create an instance of {@link CheckCourseResponse }
     * 
     */
    public CheckCourseResponse createCheckCourseResponse() {
        return new CheckCourseResponse();
    }

    /**
     * Create an instance of {@link GetPermission }
     * 
     */
    public GetPermission createGetPermission() {
        return new GetPermission();
    }

    /**
     * Create an instance of {@link GetPermissionResponse }
     * 
     */
    public GetPermissionResponse createGetPermissionResponse() {
        return new GetPermissionResponse();
    }

}
