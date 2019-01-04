
package org.edu_sharing.webservices.usage2;

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
 *         &lt;element name="getUsagesByEduRefReturn" type="{http://usage2.webservices.edu_sharing.org}Usage2Result" maxOccurs="unbounded"/&gt;
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
    "getUsagesByEduRefReturn"
})
@XmlRootElement(name = "getUsagesByEduRefResponse")
public class GetUsagesByEduRefResponse {

    @XmlElement(required = true)
    protected List<Usage2Result> getUsagesByEduRefReturn;

    /**
     * Gets the value of the getUsagesByEduRefReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getUsagesByEduRefReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetUsagesByEduRefReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Usage2Result }
     * 
     * 
     */
    public List<Usage2Result> getGetUsagesByEduRefReturn() {
        if (getUsagesByEduRefReturn == null) {
            getUsagesByEduRefReturn = new ArrayList<Usage2Result>();
        }
        return this.getUsagesByEduRefReturn;
    }

}
