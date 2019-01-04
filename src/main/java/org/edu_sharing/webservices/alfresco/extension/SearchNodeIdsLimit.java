
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
 *         &lt;element name="luceneString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "luceneString",
    "limit"
})
@XmlRootElement(name = "searchNodeIdsLimit")
public class SearchNodeIdsLimit {

    @XmlElement(required = true)
    protected String luceneString;
    protected int limit;

    /**
     * Obtient la valeur de la propriété luceneString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLuceneString() {
        return luceneString;
    }

    /**
     * Définit la valeur de la propriété luceneString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuceneString(String value) {
        this.luceneString = value;
    }

    /**
     * Obtient la valeur de la propriété limit.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Définit la valeur de la propriété limit.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

}
