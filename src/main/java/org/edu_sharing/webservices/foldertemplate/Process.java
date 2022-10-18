
package org.edu_sharing.webservices.foldertemplate;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="folderid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "template",
    "group",
    "folderid"
})
@XmlRootElement(name = "process")
public class Process {

    @XmlElement(required = true)
    protected String template;
    @XmlElement(required = true)
    protected String group;
    @XmlElement(required = true)
    protected String folderid;

    /**
     * Obtient la valeur de la propriété template.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Définit la valeur de la propriété template.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

    /**
     * Obtient la valeur de la propriété group.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Définit la valeur de la propriété group.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Obtient la valeur de la propriété folderid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderid() {
        return folderid;
    }

    /**
     * Définit la valeur de la propriété folderid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderid(String value) {
        this.folderid = value;
    }

}
