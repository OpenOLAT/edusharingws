
package org.edu_sharing.webservices.alfresco.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="createNodeAtomicValuesReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "createNodeAtomicValuesReturn"
})
@XmlRootElement(name = "createNodeAtomicValuesResponse")
public class CreateNodeAtomicValuesResponse {

    @XmlElement(required = true)
    protected String createNodeAtomicValuesReturn;

    /**
     * Obtient la valeur de la propriété createNodeAtomicValuesReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateNodeAtomicValuesReturn() {
        return createNodeAtomicValuesReturn;
    }

    /**
     * Définit la valeur de la propriété createNodeAtomicValuesReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateNodeAtomicValuesReturn(String value) {
        this.createNodeAtomicValuesReturn = value;
    }

}
