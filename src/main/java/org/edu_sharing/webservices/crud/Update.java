
package org.edu_sharing.webservices.crud;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.xml.xml_soap.Map;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="repositoryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="properties" type="{http://xml.apache.org/xml-soap}Map"/&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "username",
    "ticket",
    "nodeType",
    "repositoryId",
    "nodeId",
    "properties",
    "content",
    "icon"
})
@XmlRootElement(name = "update")
public class Update {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String ticket;
    @XmlElement(required = true)
    protected String nodeType;
    @XmlElement(required = true)
    protected String repositoryId;
    @XmlElement(required = true)
    protected String nodeId;
    @XmlElement(required = true)
    protected Map properties;
    @XmlElement(required = true)
    protected byte[] content;
    @XmlElement(required = true)
    protected byte[] icon;

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

    /**
     * Obtient la valeur de la propriété ticket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * Définit la valeur de la propriété ticket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

    /**
     * Obtient la valeur de la propriété nodeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * Définit la valeur de la propriété nodeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeType(String value) {
        this.nodeType = value;
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
     * Obtient la valeur de la propriété properties.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getProperties() {
        return properties;
    }

    /**
     * Définit la valeur de la propriété properties.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setProperties(Map value) {
        this.properties = value;
    }

    /**
     * Obtient la valeur de la propriété content.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Définit la valeur de la propriété content.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
    }

    /**
     * Obtient la valeur de la propriété icon.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIcon() {
        return icon;
    }

    /**
     * Définit la valeur de la propriété icon.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIcon(byte[] value) {
        this.icon = value;
    }

}
