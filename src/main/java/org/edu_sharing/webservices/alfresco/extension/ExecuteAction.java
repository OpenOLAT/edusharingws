
package org.edu_sharing.webservices.alfresco.extension;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
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
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parameters" type="{http://xml.apache.org/xml-soap}Map"/&gt;
 *         &lt;element name="async" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "nodeId",
    "actionName",
    "actionId",
    "parameters",
    "async"
})
@XmlRootElement(name = "executeAction")
public class ExecuteAction {

    @XmlElement(required = true)
    protected String nodeId;
    @XmlElement(required = true)
    protected String actionName;
    @XmlElement(required = true)
    protected String actionId;
    @XmlElement(required = true)
    protected Map parameters;
    protected boolean async;

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
     * Obtient la valeur de la propriété actionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Définit la valeur de la propriété actionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

    /**
     * Obtient la valeur de la propriété actionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * Définit la valeur de la propriété actionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionId(String value) {
        this.actionId = value;
    }

    /**
     * Obtient la valeur de la propriété parameters.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getParameters() {
        return parameters;
    }

    /**
     * Définit la valeur de la propriété parameters.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setParameters(Map value) {
        this.parameters = value;
    }

    /**
     * Obtient la valeur de la propriété async.
     * 
     */
    public boolean isAsync() {
        return async;
    }

    /**
     * Définit la valeur de la propriété async.
     * 
     */
    public void setAsync(boolean value) {
        this.async = value;
    }

}
