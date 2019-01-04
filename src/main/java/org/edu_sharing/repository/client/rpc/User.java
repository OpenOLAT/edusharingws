
package org.edu_sharing.repository.client.rpc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour User complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authorityDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authorityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authorityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="repositoryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "authorityDisplayName",
    "authorityName",
    "authorityType",
    "email",
    "givenName",
    "nodeId",
    "repositoryId",
    "surname",
    "username"
})
public class User {

    @XmlElement(required = true, nillable = true)
    protected String authorityDisplayName;
    @XmlElement(required = true, nillable = true)
    protected String authorityName;
    @XmlElement(required = true, nillable = true)
    protected String authorityType;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true, nillable = true)
    protected String givenName;
    @XmlElement(required = true, nillable = true)
    protected String nodeId;
    @XmlElement(required = true, nillable = true)
    protected String repositoryId;
    @XmlElement(required = true, nillable = true)
    protected String surname;
    @XmlElement(required = true, nillable = true)
    protected String username;

    /**
     * Obtient la valeur de la propriété authorityDisplayName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityDisplayName() {
        return authorityDisplayName;
    }

    /**
     * Définit la valeur de la propriété authorityDisplayName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityDisplayName(String value) {
        this.authorityDisplayName = value;
    }

    /**
     * Obtient la valeur de la propriété authorityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /**
     * Définit la valeur de la propriété authorityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityName(String value) {
        this.authorityName = value;
    }

    /**
     * Obtient la valeur de la propriété authorityType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityType() {
        return authorityType;
    }

    /**
     * Définit la valeur de la propriété authorityType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityType(String value) {
        this.authorityType = value;
    }

    /**
     * Obtient la valeur de la propriété email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit la valeur de la propriété email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtient la valeur de la propriété givenName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Définit la valeur de la propriété givenName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Obtient la valeur de la propriété nodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Définit la valeur de la propriété nodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeId(String value) {
        this.nodeId = value;
    }

    /**
     * Obtient la valeur de la propriété repositoryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * Définit la valeur de la propriété repositoryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryId(String value) {
        this.repositoryId = value;
    }

    /**
     * Obtient la valeur de la propriété surname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Définit la valeur de la propriété surname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Obtient la valeur de la propriété username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Définit la valeur de la propriété username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
