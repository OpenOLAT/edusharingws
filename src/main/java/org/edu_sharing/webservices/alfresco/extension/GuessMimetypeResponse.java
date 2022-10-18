
package org.edu_sharing.webservices.alfresco.extension;

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
 *         &lt;element name="guessMimetypeReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "guessMimetypeReturn"
})
@XmlRootElement(name = "guessMimetypeResponse")
public class GuessMimetypeResponse {

    @XmlElement(required = true)
    protected String guessMimetypeReturn;

    /**
     * Obtient la valeur de la propriété guessMimetypeReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuessMimetypeReturn() {
        return guessMimetypeReturn;
    }

    /**
     * Définit la valeur de la propriété guessMimetypeReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuessMimetypeReturn(String value) {
        this.guessMimetypeReturn = value;
    }

}
