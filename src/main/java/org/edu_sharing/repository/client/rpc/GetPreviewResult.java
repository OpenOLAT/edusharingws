
package org.edu_sharing.repository.client.rpc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GetPreviewResult complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetPreviewResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createActionIsRunning" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="createActionRunning" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPreviewResult", propOrder = {
    "createActionIsRunning",
    "createActionRunning",
    "type",
    "url"
})
public class GetPreviewResult {

    protected boolean createActionIsRunning;
    protected boolean createActionRunning;
    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String url;

    /**
     * Obtient la valeur de la propriété createActionIsRunning.
     * 
     */
    public boolean isCreateActionIsRunning() {
        return createActionIsRunning;
    }

    /**
     * Définit la valeur de la propriété createActionIsRunning.
     * 
     */
    public void setCreateActionIsRunning(boolean value) {
        this.createActionIsRunning = value;
    }

    /**
     * Obtient la valeur de la propriété createActionRunning.
     * 
     */
    public boolean isCreateActionRunning() {
        return createActionRunning;
    }

    /**
     * Définit la valeur de la propriété createActionRunning.
     * 
     */
    public void setCreateActionRunning(boolean value) {
        this.createActionRunning = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Définit la valeur de la propriété url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
