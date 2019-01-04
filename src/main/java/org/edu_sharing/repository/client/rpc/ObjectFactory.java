
package org.edu_sharing.repository.client.rpc;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.edu_sharing.repository.client.rpc package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.edu_sharing.repository.client.rpc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ACL }
     * 
     */
    public ACL createACL() {
        return new ACL();
    }

    /**
     * Create an instance of {@link GetPreviewResult }
     * 
     */
    public GetPreviewResult createGetPreviewResult() {
        return new GetPreviewResult();
    }

    /**
     * Create an instance of {@link Share }
     * 
     */
    public Share createShare() {
        return new Share();
    }

    /**
     * Create an instance of {@link Notify }
     * 
     */
    public Notify createNotify() {
        return new Notify();
    }

    /**
     * Create an instance of {@link ACE }
     * 
     */
    public ACE createACE() {
        return new ACE();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

}
