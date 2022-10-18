
package org.edu_sharing.repository.client.rpc;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Notify complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Notify"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acl" type="{http://rpc.client.repository.edu_sharing.org}ACL"/&gt;
 *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="createdFormated" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="currentState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="notifyAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="notifyEvent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="notifyTarget" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="notifyUser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notify", propOrder = {
    "acl",
    "change",
    "created",
    "createdFormated",
    "currentState",
    "nodeId",
    "notifyAction",
    "notifyEvent",
    "notifyTarget",
    "notifyUser"
})
public class Notify {

    @XmlElement(required = true, nillable = true)
    protected ACL acl;
    @XmlElement(required = true, nillable = true)
    protected String change;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(required = true, nillable = true)
    protected String createdFormated;
    @XmlElement(required = true, nillable = true)
    protected String currentState;
    @XmlElement(required = true, nillable = true)
    protected String nodeId;
    @XmlElement(required = true, nillable = true)
    protected String notifyAction;
    @XmlElement(required = true, nillable = true)
    protected String notifyEvent;
    @XmlElement(required = true, nillable = true)
    protected String notifyTarget;
    @XmlElement(required = true, nillable = true)
    protected String notifyUser;

    /**
     * Obtient la valeur de la propriété acl.
     * 
     * @return
     *     possible object is
     *     {@link ACL }
     *     
     */
    public ACL getAcl() {
        return acl;
    }

    /**
     * Définit la valeur de la propriété acl.
     * 
     * @param value
     *     allowed object is
     *     {@link ACL }
     *     
     */
    public void setAcl(ACL value) {
        this.acl = value;
    }

    /**
     * Obtient la valeur de la propriété change.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChange() {
        return change;
    }

    /**
     * Définit la valeur de la propriété change.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChange(String value) {
        this.change = value;
    }

    /**
     * Obtient la valeur de la propriété created.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Définit la valeur de la propriété created.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Obtient la valeur de la propriété createdFormated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedFormated() {
        return createdFormated;
    }

    /**
     * Définit la valeur de la propriété createdFormated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedFormated(String value) {
        this.createdFormated = value;
    }

    /**
     * Obtient la valeur de la propriété currentState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentState() {
        return currentState;
    }

    /**
     * Définit la valeur de la propriété currentState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentState(String value) {
        this.currentState = value;
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
     * Obtient la valeur de la propriété notifyAction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyAction() {
        return notifyAction;
    }

    /**
     * Définit la valeur de la propriété notifyAction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyAction(String value) {
        this.notifyAction = value;
    }

    /**
     * Obtient la valeur de la propriété notifyEvent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyEvent() {
        return notifyEvent;
    }

    /**
     * Définit la valeur de la propriété notifyEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyEvent(String value) {
        this.notifyEvent = value;
    }

    /**
     * Obtient la valeur de la propriété notifyTarget.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyTarget() {
        return notifyTarget;
    }

    /**
     * Définit la valeur de la propriété notifyTarget.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyTarget(String value) {
        this.notifyTarget = value;
    }

    /**
     * Obtient la valeur de la propriété notifyUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyUser() {
        return notifyUser;
    }

    /**
     * Définit la valeur de la propriété notifyUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyUser(String value) {
        this.notifyUser = value;
    }

}
