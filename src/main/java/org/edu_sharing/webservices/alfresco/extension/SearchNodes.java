
package org.edu_sharing.webservices.alfresco.extension;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="store" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="luceneQuery" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="permission" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="propertiesToReturn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
    "permission",
    "propertiesToReturn"
})
@XmlRootElement(name = "searchNodes")
public class SearchNodes {

    @XmlElement(required = true)
    protected String store;
    @XmlElement(required = true)
    protected String luceneQuery;
    @XmlElement(required = true)
    protected String permission;
    @XmlElement(required = true)
    protected List<String> propertiesToReturn;

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

    /**
     * Gets the value of the propertiesToReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertiesToReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertiesToReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPropertiesToReturn() {
        if (propertiesToReturn == null) {
            propertiesToReturn = new ArrayList<String>();
        }
        return this.propertiesToReturn;
    }

}
