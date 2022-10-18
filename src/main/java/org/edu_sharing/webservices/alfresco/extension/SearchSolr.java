
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
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startIdx" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nrOfresults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="facettes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="facettesMinCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="facettesLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "query",
    "startIdx",
    "nrOfresults",
    "facettes",
    "facettesMinCount",
    "facettesLimit"
})
@XmlRootElement(name = "searchSolr")
public class SearchSolr {

    @XmlElement(required = true)
    protected String query;
    protected int startIdx;
    protected int nrOfresults;
    @XmlElement(required = true)
    protected List<String> facettes;
    protected int facettesMinCount;
    protected int facettesLimit;

    /**
     * Obtient la valeur de la propriété query.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Définit la valeur de la propriété query.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Obtient la valeur de la propriété startIdx.
     * 
     */
    public int getStartIdx() {
        return startIdx;
    }

    /**
     * Définit la valeur de la propriété startIdx.
     * 
     */
    public void setStartIdx(int value) {
        this.startIdx = value;
    }

    /**
     * Obtient la valeur de la propriété nrOfresults.
     * 
     */
    public int getNrOfresults() {
        return nrOfresults;
    }

    /**
     * Définit la valeur de la propriété nrOfresults.
     * 
     */
    public void setNrOfresults(int value) {
        this.nrOfresults = value;
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

    /**
     * Obtient la valeur de la propriété facettesMinCount.
     * 
     */
    public int getFacettesMinCount() {
        return facettesMinCount;
    }

    /**
     * Définit la valeur de la propriété facettesMinCount.
     * 
     */
    public void setFacettesMinCount(int value) {
        this.facettesMinCount = value;
    }

    /**
     * Obtient la valeur de la propriété facettesLimit.
     * 
     */
    public int getFacettesLimit() {
        return facettesLimit;
    }

    /**
     * Définit la valeur de la propriété facettesLimit.
     * 
     */
    public void setFacettesLimit(int value) {
        this.facettesLimit = value;
    }

}
