
package org.edu_sharing.webservices.alfresco.extension;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Facette complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Facette"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facettePairs" type="{http://extension.alfresco.webservices.edu_sharing.org}ArrayOfFacettePair"/&gt;
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Facette", propOrder = {
    "facettePairs",
    "property"
})
public class Facette {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfFacettePair facettePairs;
    @XmlElement(required = true, nillable = true)
    protected String property;

    /**
     * Obtient la valeur de la propriété facettePairs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFacettePair }
     *     
     */
    public ArrayOfFacettePair getFacettePairs() {
        return facettePairs;
    }

    /**
     * Définit la valeur de la propriété facettePairs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFacettePair }
     *     
     */
    public void setFacettePairs(ArrayOfFacettePair value) {
        this.facettePairs = value;
    }

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

}
