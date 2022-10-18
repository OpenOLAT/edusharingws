
package org.edu_sharing.webservices.alfresco.extension;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.xml.xml_soap.Map;


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
 *         &lt;element name="parentID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nodeTypeString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="childAssociation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="props" type="{http://xml.apache.org/xml-soap}Map"/&gt;
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
    "parentID",
    "nodeTypeString",
    "childAssociation",
    "props"
})
@XmlRootElement(name = "createNodeAtomicValues")
public class CreateNodeAtomicValues {

    @XmlElement(required = true)
    protected String parentID;
    @XmlElement(required = true)
    protected String nodeTypeString;
    @XmlElement(required = true)
    protected String childAssociation;
    @XmlElement(required = true)
    protected Map props;

    /**
     * Obtient la valeur de la propriété parentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentID() {
        return parentID;
    }

    /**
     * Définit la valeur de la propriété parentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentID(String value) {
        this.parentID = value;
    }

    /**
     * Obtient la valeur de la propriété nodeTypeString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeTypeString() {
        return nodeTypeString;
    }

    /**
     * Définit la valeur de la propriété nodeTypeString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeTypeString(String value) {
        this.nodeTypeString = value;
    }

    /**
     * Obtient la valeur de la propriété childAssociation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildAssociation() {
        return childAssociation;
    }

    /**
     * Définit la valeur de la propriété childAssociation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildAssociation(String value) {
        this.childAssociation = value;
    }

    /**
     * Obtient la valeur de la propriété props.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getProps() {
        return props;
    }

    /**
     * Définit la valeur de la propriété props.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setProps(Map value) {
        this.props = value;
    }

}
