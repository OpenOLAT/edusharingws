
package org.edu_sharing.webservices.alfresco.extension;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SearchResult complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data" type="{http://extension.alfresco.webservices.edu_sharing.org}ArrayOfRepositoryNode"/&gt;
 *         &lt;element name="facettes" type="{http://extension.alfresco.webservices.edu_sharing.org}ArrayOfFacette"/&gt;
 *         &lt;element name="nodeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="startIDX" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResult", propOrder = {
    "data",
    "facettes",
    "nodeCount",
    "startIDX"
})
public class SearchResult {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfRepositoryNode data;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfFacette facettes;
    protected int nodeCount;
    protected int startIDX;

    /**
     * Obtient la valeur de la propriété data.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRepositoryNode }
     *     
     */
    public ArrayOfRepositoryNode getData() {
        return data;
    }

    /**
     * Définit la valeur de la propriété data.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRepositoryNode }
     *     
     */
    public void setData(ArrayOfRepositoryNode value) {
        this.data = value;
    }

    /**
     * Obtient la valeur de la propriété facettes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFacette }
     *     
     */
    public ArrayOfFacette getFacettes() {
        return facettes;
    }

    /**
     * Définit la valeur de la propriété facettes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFacette }
     *     
     */
    public void setFacettes(ArrayOfFacette value) {
        this.facettes = value;
    }

    /**
     * Obtient la valeur de la propriété nodeCount.
     * 
     */
    public int getNodeCount() {
        return nodeCount;
    }

    /**
     * Définit la valeur de la propriété nodeCount.
     * 
     */
    public void setNodeCount(int value) {
        this.nodeCount = value;
    }

    /**
     * Obtient la valeur de la propriété startIDX.
     * 
     */
    public int getStartIDX() {
        return startIDX;
    }

    /**
     * Définit la valeur de la propriété startIDX.
     * 
     */
    public void setStartIDX(int value) {
        this.startIDX = value;
    }

}
