
package org.edu_sharing.webservices.usage;

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
 *         &lt;element name="getUsageByParentNodeIdReturn" type="{http://usage.webservices.edu_sharing.org}UsageResult" maxOccurs="unbounded"/&gt;
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
    "getUsageByParentNodeIdReturn"
})
@XmlRootElement(name = "getUsageByParentNodeIdResponse")
public class GetUsageByParentNodeIdResponse {

    @XmlElement(required = true)
    protected List<UsageResult> getUsageByParentNodeIdReturn;

    /**
     * Gets the value of the getUsageByParentNodeIdReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getUsageByParentNodeIdReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetUsageByParentNodeIdReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageResult }
     * 
     * 
     */
    public List<UsageResult> getGetUsageByParentNodeIdReturn() {
        if (getUsageByParentNodeIdReturn == null) {
            getUsageByParentNodeIdReturn = new ArrayList<UsageResult>();
        }
        return this.getUsageByParentNodeIdReturn;
    }

}
