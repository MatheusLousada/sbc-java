
package br.gov.sp.saobernardo.paradigma.ws.condicaopagamento;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CondicaoPagamentoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CondicaoPagamentoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstCondicaoPagamentoIdioma" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCondicaoPagamentoIdimaDTO" minOccurs="0"/>
 *         &lt;element name="lstCondicaoPagamentoItem" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCondicaoItemDTO" minOccurs="0"/>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CondicaoPagamentoDTO", propOrder = {
    "lstCondicaoPagamentoIdioma",
    "lstCondicaoPagamentoItem",
    "sCdCondicaoPagamento",
    "sCdEmpresa",
    "sDsCondicaoPagamento"
})
public class CondicaoPagamentoDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstCondicaoPagamentoIdioma", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCondicaoPagamentoIdimaDTO> lstCondicaoPagamentoIdioma;
    @XmlElementRef(name = "lstCondicaoPagamentoItem", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCondicaoItemDTO> lstCondicaoPagamentoItem;
    @XmlElement(required = true, nillable = true)
    protected String sCdCondicaoPagamento;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sDsCondicaoPagamento;

    /**
     * Gets the value of the lstCondicaoPagamentoIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCondicaoPagamentoIdimaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCondicaoPagamentoIdimaDTO> getLstCondicaoPagamentoIdioma() {
        return lstCondicaoPagamentoIdioma;
    }

    /**
     * Sets the value of the lstCondicaoPagamentoIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCondicaoPagamentoIdimaDTO }{@code >}
     *     
     */
    public void setLstCondicaoPagamentoIdioma(JAXBElement<ArrayOfCondicaoPagamentoIdimaDTO> value) {
        this.lstCondicaoPagamentoIdioma = ((JAXBElement<ArrayOfCondicaoPagamentoIdimaDTO> ) value);
    }

    /**
     * Gets the value of the lstCondicaoPagamentoItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCondicaoItemDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCondicaoItemDTO> getLstCondicaoPagamentoItem() {
        return lstCondicaoPagamentoItem;
    }

    /**
     * Sets the value of the lstCondicaoPagamentoItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCondicaoItemDTO }{@code >}
     *     
     */
    public void setLstCondicaoPagamentoItem(JAXBElement<ArrayOfCondicaoItemDTO> value) {
        this.lstCondicaoPagamentoItem = ((JAXBElement<ArrayOfCondicaoItemDTO> ) value);
    }

    /**
     * Gets the value of the sCdCondicaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCondicaoPagamento() {
        return sCdCondicaoPagamento;
    }

    /**
     * Sets the value of the sCdCondicaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCondicaoPagamento(String value) {
        this.sCdCondicaoPagamento = value;
    }

    /**
     * Gets the value of the sCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresa() {
        return sCdEmpresa;
    }

    /**
     * Sets the value of the sCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresa(String value) {
        this.sCdEmpresa = value;
    }

    /**
     * Gets the value of the sDsCondicaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsCondicaoPagamento() {
        return sDsCondicaoPagamento;
    }

    /**
     * Sets the value of the sDsCondicaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsCondicaoPagamento(String value) {
        this.sDsCondicaoPagamento = value;
    }

}
