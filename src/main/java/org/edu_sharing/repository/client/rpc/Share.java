
package org.edu_sharing.repository.client.rpc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Share complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Share"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="expiryDateFormated" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="invitedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="invitedAtFormated" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="invitedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ioNodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Share", propOrder = {
    "email",
    "expiryDate",
    "expiryDateFormated",
    "invitedAt",
    "invitedAtFormated",
    "invitedBy",
    "ioNodeId",
    "nodeId",
    "token"
})
public class Share {

    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long expiryDate;
    @XmlElement(required = true, nillable = true)
    protected String expiryDateFormated;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invitedAt;
    @XmlElement(required = true, nillable = true)
    protected String invitedAtFormated;
    @XmlElement(required = true, nillable = true)
    protected String invitedBy;
    @XmlElement(required = true, nillable = true)
    protected String ioNodeId;
    @XmlElement(required = true, nillable = true)
    protected String nodeId;
    @XmlElement(required = true, nillable = true)
    protected String token;

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
     * Obtient la valeur de la propriété expiryDate.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpiryDate() {
        return expiryDate;
    }

    /**
     * Définit la valeur de la propriété expiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpiryDate(Long value) {
        this.expiryDate = value;
    }

    /**
     * Obtient la valeur de la propriété expiryDateFormated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDateFormated() {
        return expiryDateFormated;
    }

    /**
     * Définit la valeur de la propriété expiryDateFormated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDateFormated(String value) {
        this.expiryDateFormated = value;
    }

    /**
     * Obtient la valeur de la propriété invitedAt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvitedAt() {
        return invitedAt;
    }

    /**
     * Définit la valeur de la propriété invitedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvitedAt(XMLGregorianCalendar value) {
        this.invitedAt = value;
    }

    /**
     * Obtient la valeur de la propriété invitedAtFormated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvitedAtFormated() {
        return invitedAtFormated;
    }

    /**
     * Définit la valeur de la propriété invitedAtFormated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvitedAtFormated(String value) {
        this.invitedAtFormated = value;
    }

    /**
     * Obtient la valeur de la propriété invitedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvitedBy() {
        return invitedBy;
    }

    /**
     * Définit la valeur de la propriété invitedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvitedBy(String value) {
        this.invitedBy = value;
    }

    /**
     * Obtient la valeur de la propriété ioNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIoNodeId() {
        return ioNodeId;
    }

    /**
     * Définit la valeur de la propriété ioNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIoNodeId(String value) {
        this.ioNodeId = value;
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
     * Obtient la valeur de la propriété token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Définit la valeur de la propriété token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
