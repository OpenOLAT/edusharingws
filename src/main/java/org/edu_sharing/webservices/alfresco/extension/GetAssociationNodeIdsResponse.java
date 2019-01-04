
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
 *         &lt;element name="getAssociationNodeIdsReturn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
    "getAssociationNodeIdsReturn"
})
@XmlRootElement(name = "getAssociationNodeIdsResponse")
public class GetAssociationNodeIdsResponse {

    @XmlElement(required = true)
    protected List<String> getAssociationNodeIdsReturn;

    /**
     * Gets the value of the getAssociationNodeIdsReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getAssociationNodeIdsReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetAssociationNodeIdsReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGetAssociationNodeIdsReturn() {
        if (getAssociationNodeIdsReturn == null) {
            getAssociationNodeIdsReturn = new ArrayList<String>();
        }
        return this.getAssociationNodeIdsReturn;
    }

}
