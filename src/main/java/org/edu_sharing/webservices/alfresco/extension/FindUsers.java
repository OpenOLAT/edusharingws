
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
 *         &lt;element name="searchProps" type="{http://extension.alfresco.webservices.edu_sharing.org}KeyValue" maxOccurs="unbounded"/&gt;
 *         &lt;element name="eduGroupNodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nrOfResults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "searchProps",
    "eduGroupNodeId",
    "from",
    "nrOfResults"
})
@XmlRootElement(name = "findUsers")
public class FindUsers {

    @XmlElement(required = true)
    protected List<KeyValue> searchProps;
    @XmlElement(required = true)
    protected String eduGroupNodeId;
    protected int from;
    protected int nrOfResults;

    /**
     * Gets the value of the searchProps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchProps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchProps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * 
     * 
     */
    public List<KeyValue> getSearchProps() {
        if (searchProps == null) {
            searchProps = new ArrayList<KeyValue>();
        }
        return this.searchProps;
    }

    /**
     * Obtient la valeur de la propriété eduGroupNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduGroupNodeId() {
        return eduGroupNodeId;
    }

    /**
     * Définit la valeur de la propriété eduGroupNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduGroupNodeId(String value) {
        this.eduGroupNodeId = value;
    }

    /**
     * Obtient la valeur de la propriété from.
     * 
     */
    public int getFrom() {
        return from;
    }

    /**
     * Définit la valeur de la propriété from.
     * 
     */
    public void setFrom(int value) {
        this.from = value;
    }

    /**
     * Obtient la valeur de la propriété nrOfResults.
     * 
     */
    public int getNrOfResults() {
        return nrOfResults;
    }

    /**
     * Définit la valeur de la propriété nrOfResults.
     * 
     */
    public void setNrOfResults(int value) {
        this.nrOfResults = value;
    }

}
