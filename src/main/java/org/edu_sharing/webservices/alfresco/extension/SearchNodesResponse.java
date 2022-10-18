
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
 *         &lt;element name="searchNodesReturn" type="{http://extension.alfresco.webservices.edu_sharing.org}RepositoryNode" maxOccurs="unbounded"/&gt;
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
    "searchNodesReturn"
})
@XmlRootElement(name = "searchNodesResponse")
public class SearchNodesResponse {

    @XmlElement(required = true)
    protected List<RepositoryNode> searchNodesReturn;

    /**
     * Gets the value of the searchNodesReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the searchNodesReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchNodesReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepositoryNode }
     * 
     * 
     */
    public List<RepositoryNode> getSearchNodesReturn() {
        if (searchNodesReturn == null) {
            searchNodesReturn = new ArrayList<RepositoryNode>();
        }
        return this.searchNodesReturn;
    }

}
