
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
 *         &lt;element name="searchWord" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "searchWord",
    "eduGroupNodeId",
    "from",
    "nrOfResults"
})
@XmlRootElement(name = "findGroups")
public class FindGroups {

    @XmlElement(required = true)
    protected String searchWord;
    @XmlElement(required = true)
    protected String eduGroupNodeId;
    protected int from;
    protected int nrOfResults;

    /**
     * Obtient la valeur de la propriété searchWord.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchWord() {
        return searchWord;
    }

    /**
     * Définit la valeur de la propriété searchWord.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchWord(String value) {
        this.searchWord = value;
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
