
package org.edu_sharing.webservices.render;

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
 *         &lt;element name="getRenderInfoLMSReturn" type="{http://render.webservices.edu_sharing.org}RenderInfoResult"/&gt;
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
    "getRenderInfoLMSReturn"
})
@XmlRootElement(name = "getRenderInfoLMSResponse")
public class GetRenderInfoLMSResponse {

    @XmlElement(required = true)
    protected RenderInfoResult getRenderInfoLMSReturn;

    /**
     * Obtient la valeur de la propriété getRenderInfoLMSReturn.
     * 
     * @return
     *     possible object is
     *     {@link RenderInfoResult }
     *     
     */
    public RenderInfoResult getGetRenderInfoLMSReturn() {
        return getRenderInfoLMSReturn;
    }

    /**
     * Définit la valeur de la propriété getRenderInfoLMSReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link RenderInfoResult }
     *     
     */
    public void setGetRenderInfoLMSReturn(RenderInfoResult value) {
        this.getRenderInfoLMSReturn = value;
    }

}
