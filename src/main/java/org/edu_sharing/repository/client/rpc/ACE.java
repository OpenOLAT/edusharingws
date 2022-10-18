
package org.edu_sharing.repository.client.rpc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ACE complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ACE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authority" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authorityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="edited" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="group" type="{http://rpc.client.repository.edu_sharing.org}Group"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="inherited" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="permission" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="user" type="{http://rpc.client.repository.edu_sharing.org}User"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACE", propOrder = {
    "accessStatus",
    "authority",
    "authorityType",
    "edited",
    "group",
    "id",
    "inherited",
    "permission",
    "user"
})
public class ACE {

    @XmlElement(required = true, nillable = true)
    protected String accessStatus;
    @XmlElement(required = true, nillable = true)
    protected String authority;
    @XmlElement(required = true, nillable = true)
    protected String authorityType;
    protected boolean edited;
    @XmlElement(required = true, nillable = true)
    protected Group group;
    protected int id;
    protected boolean inherited;
    @XmlElement(required = true, nillable = true)
    protected String permission;
    @XmlElement(required = true, nillable = true)
    protected User user;

    /**
     * Obtient la valeur de la propriété accessStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessStatus() {
        return accessStatus;
    }

    /**
     * Définit la valeur de la propriété accessStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessStatus(String value) {
        this.accessStatus = value;
    }

    /**
     * Obtient la valeur de la propriété authority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Définit la valeur de la propriété authority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
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
     * Obtient la valeur de la propriété edited.
     * 
     */
    public boolean isEdited() {
        return edited;
    }

    /**
     * Définit la valeur de la propriété edited.
     * 
     */
    public void setEdited(boolean value) {
        this.edited = value;
    }

    /**
     * Obtient la valeur de la propriété group.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Définit la valeur de la propriété group.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété inherited.
     * 
     */
    public boolean isInherited() {
        return inherited;
    }

    /**
     * Définit la valeur de la propriété inherited.
     * 
     */
    public void setInherited(boolean value) {
        this.inherited = value;
    }

    /**
     * Obtient la valeur de la propriété permission.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermission() {
        return permission;
    }

    /**
     * Définit la valeur de la propriété permission.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermission(String value) {
        this.permission = value;
    }

    /**
     * Obtient la valeur de la propriété user.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Définit la valeur de la propriété user.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
