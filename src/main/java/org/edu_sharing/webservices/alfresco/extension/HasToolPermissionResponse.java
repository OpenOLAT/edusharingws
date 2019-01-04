
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
 *         &lt;element name="hasToolPermissionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "hasToolPermissionReturn"
})
@XmlRootElement(name = "hasToolPermissionResponse")
public class HasToolPermissionResponse {

    protected boolean hasToolPermissionReturn;

    /**
     * Obtient la valeur de la propriété hasToolPermissionReturn.
     * 
     */
    public boolean isHasToolPermissionReturn() {
        return hasToolPermissionReturn;
    }

    /**
     * Définit la valeur de la propriété hasToolPermissionReturn.
     * 
     */
    public void setHasToolPermissionReturn(boolean value) {
        this.hasToolPermissionReturn = value;
    }

}
