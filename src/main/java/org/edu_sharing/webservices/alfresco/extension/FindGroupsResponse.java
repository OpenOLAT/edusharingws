
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
 *         &lt;element name="findGroupsReturn" type="{http://extension.alfresco.webservices.edu_sharing.org}SearchResult"/&gt;
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
    "findGroupsReturn"
})
@XmlRootElement(name = "findGroupsResponse")
public class FindGroupsResponse {

    @XmlElement(required = true)
    protected SearchResult findGroupsReturn;

    /**
     * Obtient la valeur de la propriété findGroupsReturn.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getFindGroupsReturn() {
        return findGroupsReturn;
    }

    /**
     * Définit la valeur de la propriété findGroupsReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setFindGroupsReturn(SearchResult value) {
        this.findGroupsReturn = value;
    }

}
