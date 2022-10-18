
package org.edu_sharing.webservices.alfresco.extension;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="searchCriterias" type="{http://extension.alfresco.webservices.edu_sharing.org}SearchCriteria" maxOccurs="unbounded"/&gt;
 *         &lt;element name="metadatasetId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nrOfResults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="facettes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
    "searchCriterias",
    "metadatasetId",
    "start",
    "nrOfResults",
    "facettes"
})
@XmlRootElement(name = "search")
public class Search {

    @XmlElement(required = true)
    protected List<SearchCriteria> searchCriterias;
    @XmlElement(required = true)
    protected String metadatasetId;
    protected int start;
    protected int nrOfResults;
    @XmlElement(required = true)
    protected List<String> facettes;

    /**
     * Gets the value of the searchCriterias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriterias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriterias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchCriteria }
     * 
     * 
     */
    public List<SearchCriteria> getSearchCriterias() {
        if (searchCriterias == null) {
            searchCriterias = new ArrayList<SearchCriteria>();
        }
        return this.searchCriterias;
    }

    /**
     * Obtient la valeur de la propriété metadatasetId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadatasetId() {
        return metadatasetId;
    }

    /**
     * Définit la valeur de la propriété metadatasetId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadatasetId(String value) {
        this.metadatasetId = value;
    }

    /**
     * Obtient la valeur de la propriété start.
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * Définit la valeur de la propriété start.
     * 
     */
    public void setStart(int value) {
        this.start = value;
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

    /**
     * Gets the value of the facettes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the facettes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacettes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFacettes() {
        if (facettes == null) {
            facettes = new ArrayList<String>();
        }
        return this.facettes;
    }

}
