
package org.edu_sharing.webservices.authentication;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.edu_sharing.webservices.types.KeyValue;


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
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ssoData" type="{http://types.webservices.edu_sharing.org}KeyValue" maxOccurs="unbounded"/&gt;
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
    "applicationId",
    "ticket",
    "ssoData"
})
@XmlRootElement(name = "authenticateByTrustedApp")
public class AuthenticateByTrustedApp {

    @XmlElement(required = true)
    protected String applicationId;
    @XmlElement(required = true)
    protected String ticket;
    @XmlElement(required = true)
    protected List<KeyValue> ssoData;

    /**
     * Obtient la valeur de la propriété applicationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Définit la valeur de la propriété applicationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
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
     * Gets the value of the ssoData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssoData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsoData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * 
     * 
     */
    public List<KeyValue> getSsoData() {
        if (ssoData == null) {
            ssoData = new ArrayList<KeyValue>();
        }
        return this.ssoData;
    }

}
