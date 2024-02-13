
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmacaoNegociacaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmacaoNegociacaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstConfirmacaoNegociacaoItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfConfirmacaoNegociacaoItemDTO"/>
 *         &lt;element name="nIdTipoProcesso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdProcessoWbc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmacaoNegociacaoDTO", propOrder = {
    "lstConfirmacaoNegociacaoItemDTO",
    "nIdTipoProcesso",
    "sCdProcessoWbc"
})
public class ConfirmacaoNegociacaoDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfConfirmacaoNegociacaoItemDTO lstConfirmacaoNegociacaoItemDTO;
    protected int nIdTipoProcesso;
    @XmlElement(required = true, nillable = true)
    protected String sCdProcessoWbc;

    /**
     * Gets the value of the lstConfirmacaoNegociacaoItemDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConfirmacaoNegociacaoItemDTO }
     *     
     */
    public ArrayOfConfirmacaoNegociacaoItemDTO getLstConfirmacaoNegociacaoItemDTO() {
        return lstConfirmacaoNegociacaoItemDTO;
    }

    /**
     * Sets the value of the lstConfirmacaoNegociacaoItemDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConfirmacaoNegociacaoItemDTO }
     *     
     */
    public void setLstConfirmacaoNegociacaoItemDTO(ArrayOfConfirmacaoNegociacaoItemDTO value) {
        this.lstConfirmacaoNegociacaoItemDTO = value;
    }

    /**
     * Gets the value of the nIdTipoProcesso property.
     * 
     */
    public int getNIdTipoProcesso() {
        return nIdTipoProcesso;
    }

    /**
     * Sets the value of the nIdTipoProcesso property.
     * 
     */
    public void setNIdTipoProcesso(int value) {
        this.nIdTipoProcesso = value;
    }

    /**
     * Gets the value of the sCdProcessoWbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdProcessoWbc() {
        return sCdProcessoWbc;
    }

    /**
     * Sets the value of the sCdProcessoWbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdProcessoWbc(String value) {
        this.sCdProcessoWbc = value;
    }

}
