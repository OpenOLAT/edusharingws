
package org.edu_sharing.webservices.alfresco.extension;

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
 *         &lt;element name="hasPermissionsSimpleReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "hasPermissionsSimpleReturn"
})
@XmlRootElement(name = "hasPermissionsSimpleResponse")
public class HasPermissionsSimpleResponse {

    protected boolean hasPermissionsSimpleReturn;

    /**
     * Obtient la valeur de la propriété hasPermissionsSimpleReturn.
     * 
     */
    public boolean isHasPermissionsSimpleReturn() {
        return hasPermissionsSimpleReturn;
    }

    /**
     * Définit la valeur de la propriété hasPermissionsSimpleReturn.
     * 
     */
    public void setHasPermissionsSimpleReturn(boolean value) {
        this.hasPermissionsSimpleReturn = value;
    }

}
