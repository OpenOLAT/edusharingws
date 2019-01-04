
package org.edu_sharing.webservices.alfresco.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SearchCriteria complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="queryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="values" type="{http://extension.alfresco.webservices.edu_sharing.org}ArrayOf_xsd_string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria", propOrder = {
    "property",
    "queryId",
    "values"
})
public class SearchCriteria {

    @XmlElement(required = true, nillable = true)
    protected String property;
    @XmlElement(required = true, nillable = true)
    protected String queryId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString values;

    /**
     * Obtient la valeur de la propriété property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * Définit la valeur de la propriété property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * Obtient la valeur de la propriété queryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryId() {
        return queryId;
    }

    /**
     * Définit la valeur de la propriété queryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryId(String value) {
        this.queryId = value;
    }

    /**
     * Obtient la valeur de la propriété values.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getValues() {
        return values;
    }

    /**
     * Définit la valeur de la propriété values.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setValues(ArrayOfXsdString value) {
        this.values = value;
    }

}
