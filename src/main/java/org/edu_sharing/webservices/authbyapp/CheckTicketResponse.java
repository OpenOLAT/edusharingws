
package org.edu_sharing.webservices.authbyapp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="checkTicketReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "checkTicketReturn"
})
@XmlRootElement(name = "checkTicketResponse")
public class CheckTicketResponse {

    protected boolean checkTicketReturn;

    /**
     * Obtient la valeur de la propriété checkTicketReturn.
     * 
     */
    public boolean isCheckTicketReturn() {
        return checkTicketReturn;
    }

    /**
     * Définit la valeur de la propriété checkTicketReturn.
     * 
     */
    public void setCheckTicketReturn(boolean value) {
        this.checkTicketReturn = value;
    }

}
