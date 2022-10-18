
package org.edu_sharing.webservices.alfresco.extension;

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
 *         &lt;element name="store" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="luceneQuery" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="permission" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "store",
    "luceneQuery",
    "permission"
})
@XmlRootElement(name = "searchNodeIds")
public class SearchNodeIds {

    @XmlElement(required = true)
    protected String store;
    @XmlElement(required = true)
    protected String luceneQuery;
    @XmlElement(required = true)
    protected String permission;

    /**
     * Obtient la valeur de la propriété store.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStore() {
        return store;
    }

    /**
     * Définit la valeur de la propriété store.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStore(String value) {
        this.store = value;
    }

    /**
     * Obtient la valeur de la propriété luceneQuery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLuceneQuery() {
        return luceneQuery;
    }

    /**
     * Définit la valeur de la propriété luceneQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuceneQuery(String value) {
        this.luceneQuery = value;
    }

    /**
     * Obtient la valeur de la propriété permission.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermission() {
        return permission;
    }

    /**
     * Définit la valeur de la propriété permission.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermission(String value) {
        this.permission = value;
    }

}
