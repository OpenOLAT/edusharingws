
package org.edu_sharing.repository.client.rpc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.edu_sharing.webservices.alfresco.extension.ArrayOfTns2ACE;


/**
 * <p>Classe Java pour ACL complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ACL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aces" type="{http://extension.alfresco.webservices.edu_sharing.org}ArrayOf_tns2_ACE"/&gt;
 *         &lt;element name="inherited" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACL", propOrder = {
    "aces",
    "inherited"
})
public class ACL {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2ACE aces;
    protected boolean inherited;

    /**
     * Obtient la valeur de la propriété aces.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2ACE }
     *     
     */
    public ArrayOfTns2ACE getAces() {
        return aces;
    }

    /**
     * Définit la valeur de la propriété aces.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2ACE }
     *     
     */
    public void setAces(ArrayOfTns2ACE value) {
        this.aces = value;
    }

    /**
     * Obtient la valeur de la propriété inherited.
     * 
     */
    public boolean isInherited() {
        return inherited;
    }

    /**
     * Définit la valeur de la propriété inherited.
     * 
     */
    public void setInherited(boolean value) {
        this.inherited = value;
    }

}
