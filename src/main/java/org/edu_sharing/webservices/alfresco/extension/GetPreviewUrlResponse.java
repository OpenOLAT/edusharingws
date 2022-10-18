
package org.edu_sharing.webservices.alfresco.extension;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.edu_sharing.repository.client.rpc.GetPreviewResult;


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
 *         &lt;element name="getPreviewUrlReturn" type="{http://rpc.client.repository.edu_sharing.org}GetPreviewResult"/&gt;
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
    "getPreviewUrlReturn"
})
@XmlRootElement(name = "getPreviewUrlResponse")
public class GetPreviewUrlResponse {

    @XmlElement(required = true)
    protected GetPreviewResult getPreviewUrlReturn;

    /**
     * Obtient la valeur de la propriété getPreviewUrlReturn.
     * 
     * @return
     *     possible object is
     *     {@link GetPreviewResult }
     *     
     */
    public GetPreviewResult getGetPreviewUrlReturn() {
        return getPreviewUrlReturn;
    }

    /**
     * Définit la valeur de la propriété getPreviewUrlReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPreviewResult }
     *     
     */
    public void setGetPreviewUrlReturn(GetPreviewResult value) {
        this.getPreviewUrlReturn = value;
    }

}
