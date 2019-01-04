
package org.edu_sharing.webservices.alfresco.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="isAdminReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "isAdminReturn"
})
@XmlRootElement(name = "isAdminResponse")
public class IsAdminResponse {

    protected boolean isAdminReturn;

    /**
     * Obtient la valeur de la propriété isAdminReturn.
     * 
     */
    public boolean isIsAdminReturn() {
        return isAdminReturn;
    }

    /**
     * Définit la valeur de la propriété isAdminReturn.
     * 
     */
    public void setIsAdminReturn(boolean value) {
        this.isAdminReturn = value;
    }

}
