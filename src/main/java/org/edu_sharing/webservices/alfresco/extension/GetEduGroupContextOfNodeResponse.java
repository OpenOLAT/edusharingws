
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
 *         &lt;element name="getEduGroupContextOfNodeReturn" type="{http://extension.alfresco.webservices.edu_sharing.org}KeyValue" maxOccurs="unbounded"/&gt;
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
    "getEduGroupContextOfNodeReturn"
})
@XmlRootElement(name = "getEduGroupContextOfNodeResponse")
public class GetEduGroupContextOfNodeResponse {

    @XmlElement(required = true)
    protected List<KeyValue> getEduGroupContextOfNodeReturn;

    /**
     * Gets the value of the getEduGroupContextOfNodeReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the getEduGroupContextOfNodeReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetEduGroupContextOfNodeReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * 
     * 
     */
    public List<KeyValue> getGetEduGroupContextOfNodeReturn() {
        if (getEduGroupContextOfNodeReturn == null) {
            getEduGroupContextOfNodeReturn = new ArrayList<KeyValue>();
        }
        return this.getEduGroupContextOfNodeReturn;
    }

}
