
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
 *         &lt;element name="findNodeByPathReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "findNodeByPathReturn"
})
@XmlRootElement(name = "findNodeByPathResponse")
public class FindNodeByPathResponse {

    @XmlElement(required = true)
    protected String findNodeByPathReturn;

    /**
     * Obtient la valeur de la propriété findNodeByPathReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindNodeByPathReturn() {
        return findNodeByPathReturn;
    }

    /**
     * Définit la valeur de la propriété findNodeByPathReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindNodeByPathReturn(String value) {
        this.findNodeByPathReturn = value;
    }

}
