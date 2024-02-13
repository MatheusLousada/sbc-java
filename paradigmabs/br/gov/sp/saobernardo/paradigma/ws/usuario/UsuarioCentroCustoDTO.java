
package br.gov.sp.saobernardo.paradigma.ws.usuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsuarioCentroCustoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsuarioCentroCustoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsuarioCentroCustoDTO", propOrder = {
    "sCdCentroCusto"
})
public class UsuarioCentroCustoDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdCentroCusto;

    /**
     * Gets the value of the sCdCentroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCentroCusto() {
        return sCdCentroCusto;
    }

    /**
     * Sets the value of the sCdCentroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCentroCusto(String value) {
        this.sCdCentroCusto = value;
    }

}
