
package org.edu_sharing.repository.client.rpc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Group complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Group"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authorityDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authorityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authorityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="editable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="groupType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="repositoryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
    "authorityDisplayName",
    "authorityName",
    "authorityType",
    "displayName",
    "editable",
    "groupType",
    "name",
    "nodeId",
    "repositoryId"
})
public class Group {

    @XmlElement(required = true, nillable = true)
    protected String authorityDisplayName;
    @XmlElement(required = true, nillable = true)
    protected String authorityName;
    @XmlElement(required = true, nillable = true)
    protected String authorityType;
    @XmlElement(required = true, nillable = true)
    protected String displayName;
    protected boolean editable;
    @XmlElement(required = true, nillable = true)
    protected String groupType;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String nodeId;
    @XmlElement(required = true, nillable = true)
    protected String repositoryId;

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
     * Obtient la valeur de la propriété displayName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Définit la valeur de la propriété displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Obtient la valeur de la propriété editable.
     * 
     */
    public boolean isEditable() {
        return editable;
    }

    /**
     * Définit la valeur de la propriété editable.
     * 
     */
    public void setEditable(boolean value) {
        this.editable = value;
    }

    /**
     * Obtient la valeur de la propriété groupType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Définit la valeur de la propriété groupType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

}
