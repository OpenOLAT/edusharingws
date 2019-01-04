
package org.edu_sharing.webservices.render;

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
 *         &lt;element name="getRenderInfoRepoReturn" type="{http://render.webservices.edu_sharing.org}RenderInfoResult"/&gt;
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
    "getRenderInfoRepoReturn"
})
@XmlRootElement(name = "getRenderInfoRepoResponse")
public class GetRenderInfoRepoResponse {

    @XmlElement(required = true)
    protected RenderInfoResult getRenderInfoRepoReturn;

    /**
     * Obtient la valeur de la propriété getRenderInfoRepoReturn.
     * 
     * @return
     *     possible object is
     *     {@link RenderInfoResult }
     *     
     */
    public RenderInfoResult getGetRenderInfoRepoReturn() {
        return getRenderInfoRepoReturn;
    }

    /**
     * Définit la valeur de la propriété getRenderInfoRepoReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link RenderInfoResult }
     *     
     */
    public void setGetRenderInfoRepoReturn(RenderInfoResult value) {
        this.getRenderInfoRepoReturn = value;
    }

}
