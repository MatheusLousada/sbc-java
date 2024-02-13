
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmacaoNegociacaoItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmacaoNegociacaoItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdProcessoItemWbc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmacaoNegociacaoItemDTO", propOrder = {
    "sCdProcessoItemWbc"
})
public class ConfirmacaoNegociacaoItemDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdProcessoItemWbc;

    /**
     * Gets the value of the sCdProcessoItemWbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdProcessoItemWbc() {
        return sCdProcessoItemWbc;
    }

    /**
     * Sets the value of the sCdProcessoItemWbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdProcessoItemWbc(String value) {
        this.sCdProcessoItemWbc = value;
    }

}
