
package br.gov.sp.saobernardo.paradigma.ws.notafiscal;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NotaFiscalDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotaFiscalDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlConheceFrete" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlFrete" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lstNotaFiscalItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfNotaFiscalItemDTO"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nCdTipo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sCdCfop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCfop2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdChave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaCompradora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresaEntregaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaFaturamentoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaFornecedora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresaTransportadora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEntregaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEspecie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEspecieConheceFrete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdFaturamentoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdFrete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdNatOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObservacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsPlacaVeiculo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNmEmpresaTransportadora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrConheceFrete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrNotaFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrSerie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrSerieConheceFrete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtConheceFrete" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtCriacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtSaida" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaFiscalDTO", propOrder = {
    "dVlConheceFrete",
    "dVlFrete",
    "dVlTotal",
    "lstNotaFiscalItemDTO",
    "nCdSituacao",
    "nCdTipo",
    "sCdCfop",
    "sCdCfop2",
    "sCdChave",
    "sCdEmpresaCompradora",
    "sCdEmpresaEntregaEndereco",
    "sCdEmpresaFaturamentoEndereco",
    "sCdEmpresaFornecedora",
    "sCdEmpresaTransportadora",
    "sCdEntregaEndereco",
    "sCdEspecie",
    "sCdEspecieConheceFrete",
    "sCdFaturamentoEndereco",
    "sCdFrete",
    "sCdNatOperacao",
    "sCdUsuario",
    "sDsObservacao",
    "sDsPlacaVeiculo",
    "sNmEmpresaTransportadora",
    "sNrConheceFrete",
    "sNrNotaFiscal",
    "sNrSerie",
    "sNrSerieConheceFrete",
    "tDtConheceFrete",
    "tDtCriacao",
    "tDtEmissao",
    "tDtEntrega",
    "tDtSaida"
})
public class NotaFiscalDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dVlConheceFrete;
    @XmlElement(required = true)
    protected BigDecimal dVlFrete;
    protected BigDecimal dVlTotal;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfNotaFiscalItemDTO lstNotaFiscalItemDTO;
    protected int nCdSituacao;
    @XmlElementRef(name = "nCdTipo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdTipo;
    @XmlElement(required = true, nillable = true)
    protected String sCdCfop;
    @XmlElement(required = true, nillable = true)
    protected String sCdCfop2;
    @XmlElementRef(name = "sCdChave", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdChave;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaCompradora;
    @XmlElementRef(name = "sCdEmpresaEntregaEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaEntregaEndereco;
    @XmlElementRef(name = "sCdEmpresaFaturamentoEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaFaturamentoEndereco;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaFornecedora;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaTransportadora;
    @XmlElementRef(name = "sCdEntregaEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEntregaEndereco;
    @XmlElement(required = true, nillable = true)
    protected String sCdEspecie;
    @XmlElement(required = true, nillable = true)
    protected String sCdEspecieConheceFrete;
    @XmlElementRef(name = "sCdFaturamentoEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdFaturamentoEndereco;
    @XmlElement(required = true, nillable = true)
    protected String sCdFrete;
    @XmlElementRef(name = "sCdNatOperacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdNatOperacao;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuario;
    @XmlElement(required = true, nillable = true)
    protected String sDsObservacao;
    @XmlElement(required = true, nillable = true)
    protected String sDsPlacaVeiculo;
    @XmlElement(required = true, nillable = true)
    protected String sNmEmpresaTransportadora;
    @XmlElement(required = true, nillable = true)
    protected String sNrConheceFrete;
    @XmlElement(required = true, nillable = true)
    protected String sNrNotaFiscal;
    @XmlElement(required = true, nillable = true)
    protected String sNrSerie;
    @XmlElement(required = true, nillable = true)
    protected String sNrSerieConheceFrete;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtConheceFrete;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtCriacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEmissao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEntrega;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtSaida;

    /**
     * Gets the value of the dVlConheceFrete property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlConheceFrete() {
        return dVlConheceFrete;
    }

    /**
     * Sets the value of the dVlConheceFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlConheceFrete(BigDecimal value) {
        this.dVlConheceFrete = value;
    }

    /**
     * Gets the value of the dVlFrete property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlFrete() {
        return dVlFrete;
    }

    /**
     * Sets the value of the dVlFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlFrete(BigDecimal value) {
        this.dVlFrete = value;
    }

    /**
     * Gets the value of the dVlTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlTotal() {
        return dVlTotal;
    }

    /**
     * Sets the value of the dVlTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlTotal(BigDecimal value) {
        this.dVlTotal = value;
    }

    /**
     * Gets the value of the lstNotaFiscalItemDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotaFiscalItemDTO }
     *     
     */
    public ArrayOfNotaFiscalItemDTO getLstNotaFiscalItemDTO() {
        return lstNotaFiscalItemDTO;
    }

    /**
     * Sets the value of the lstNotaFiscalItemDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotaFiscalItemDTO }
     *     
     */
    public void setLstNotaFiscalItemDTO(ArrayOfNotaFiscalItemDTO value) {
        this.lstNotaFiscalItemDTO = value;
    }

    /**
     * Gets the value of the nCdSituacao property.
     * 
     */
    public int getNCdSituacao() {
        return nCdSituacao;
    }

    /**
     * Sets the value of the nCdSituacao property.
     * 
     */
    public void setNCdSituacao(int value) {
        this.nCdSituacao = value;
    }

    /**
     * Gets the value of the nCdTipo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdTipo() {
        return nCdTipo;
    }

    /**
     * Sets the value of the nCdTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdTipo(JAXBElement<Long> value) {
        this.nCdTipo = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the sCdCfop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCfop() {
        return sCdCfop;
    }

    /**
     * Sets the value of the sCdCfop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCfop(String value) {
        this.sCdCfop = value;
    }

    /**
     * Gets the value of the sCdCfop2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCfop2() {
        return sCdCfop2;
    }

    /**
     * Sets the value of the sCdCfop2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCfop2(String value) {
        this.sCdCfop2 = value;
    }

    /**
     * Gets the value of the sCdChave property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdChave() {
        return sCdChave;
    }

    /**
     * Sets the value of the sCdChave property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdChave(JAXBElement<String> value) {
        this.sCdChave = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdEmpresaCompradora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaCompradora() {
        return sCdEmpresaCompradora;
    }

    /**
     * Sets the value of the sCdEmpresaCompradora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaCompradora(String value) {
        this.sCdEmpresaCompradora = value;
    }

    /**
     * Gets the value of the sCdEmpresaEntregaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresaEntregaEndereco() {
        return sCdEmpresaEntregaEndereco;
    }

    /**
     * Sets the value of the sCdEmpresaEntregaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresaEntregaEndereco(JAXBElement<String> value) {
        this.sCdEmpresaEntregaEndereco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdEmpresaFaturamentoEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresaFaturamentoEndereco() {
        return sCdEmpresaFaturamentoEndereco;
    }

    /**
     * Sets the value of the sCdEmpresaFaturamentoEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresaFaturamentoEndereco(JAXBElement<String> value) {
        this.sCdEmpresaFaturamentoEndereco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdEmpresaFornecedora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaFornecedora() {
        return sCdEmpresaFornecedora;
    }

    /**
     * Sets the value of the sCdEmpresaFornecedora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaFornecedora(String value) {
        this.sCdEmpresaFornecedora = value;
    }

    /**
     * Gets the value of the sCdEmpresaTransportadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaTransportadora() {
        return sCdEmpresaTransportadora;
    }

    /**
     * Sets the value of the sCdEmpresaTransportadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaTransportadora(String value) {
        this.sCdEmpresaTransportadora = value;
    }

    /**
     * Gets the value of the sCdEntregaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEntregaEndereco() {
        return sCdEntregaEndereco;
    }

    /**
     * Sets the value of the sCdEntregaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEntregaEndereco(JAXBElement<String> value) {
        this.sCdEntregaEndereco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdEspecie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEspecie() {
        return sCdEspecie;
    }

    /**
     * Sets the value of the sCdEspecie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEspecie(String value) {
        this.sCdEspecie = value;
    }

    /**
     * Gets the value of the sCdEspecieConheceFrete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEspecieConheceFrete() {
        return sCdEspecieConheceFrete;
    }

    /**
     * Sets the value of the sCdEspecieConheceFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEspecieConheceFrete(String value) {
        this.sCdEspecieConheceFrete = value;
    }

    /**
     * Gets the value of the sCdFaturamentoEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdFaturamentoEndereco() {
        return sCdFaturamentoEndereco;
    }

    /**
     * Sets the value of the sCdFaturamentoEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdFaturamentoEndereco(JAXBElement<String> value) {
        this.sCdFaturamentoEndereco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdFrete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdFrete() {
        return sCdFrete;
    }

    /**
     * Sets the value of the sCdFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdFrete(String value) {
        this.sCdFrete = value;
    }

    /**
     * Gets the value of the sCdNatOperacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdNatOperacao() {
        return sCdNatOperacao;
    }

    /**
     * Sets the value of the sCdNatOperacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdNatOperacao(JAXBElement<String> value) {
        this.sCdNatOperacao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUsuario() {
        return sCdUsuario;
    }

    /**
     * Sets the value of the sCdUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUsuario(String value) {
        this.sCdUsuario = value;
    }

    /**
     * Gets the value of the sDsObservacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsObservacao() {
        return sDsObservacao;
    }

    /**
     * Sets the value of the sDsObservacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsObservacao(String value) {
        this.sDsObservacao = value;
    }

    /**
     * Gets the value of the sDsPlacaVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsPlacaVeiculo() {
        return sDsPlacaVeiculo;
    }

    /**
     * Sets the value of the sDsPlacaVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsPlacaVeiculo(String value) {
        this.sDsPlacaVeiculo = value;
    }

    /**
     * Gets the value of the sNmEmpresaTransportadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmEmpresaTransportadora() {
        return sNmEmpresaTransportadora;
    }

    /**
     * Sets the value of the sNmEmpresaTransportadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmEmpresaTransportadora(String value) {
        this.sNmEmpresaTransportadora = value;
    }

    /**
     * Gets the value of the sNrConheceFrete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrConheceFrete() {
        return sNrConheceFrete;
    }

    /**
     * Sets the value of the sNrConheceFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrConheceFrete(String value) {
        this.sNrConheceFrete = value;
    }

    /**
     * Gets the value of the sNrNotaFiscal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrNotaFiscal() {
        return sNrNotaFiscal;
    }

    /**
     * Sets the value of the sNrNotaFiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrNotaFiscal(String value) {
        this.sNrNotaFiscal = value;
    }

    /**
     * Gets the value of the sNrSerie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrSerie() {
        return sNrSerie;
    }

    /**
     * Sets the value of the sNrSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrSerie(String value) {
        this.sNrSerie = value;
    }

    /**
     * Gets the value of the sNrSerieConheceFrete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrSerieConheceFrete() {
        return sNrSerieConheceFrete;
    }

    /**
     * Sets the value of the sNrSerieConheceFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrSerieConheceFrete(String value) {
        this.sNrSerieConheceFrete = value;
    }

    /**
     * Gets the value of the tDtConheceFrete property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtConheceFrete() {
        return tDtConheceFrete;
    }

    /**
     * Sets the value of the tDtConheceFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtConheceFrete(XMLGregorianCalendar value) {
        this.tDtConheceFrete = value;
    }

    /**
     * Gets the value of the tDtCriacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtCriacao() {
        return tDtCriacao;
    }

    /**
     * Sets the value of the tDtCriacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtCriacao(XMLGregorianCalendar value) {
        this.tDtCriacao = value;
    }

    /**
     * Gets the value of the tDtEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtEmissao() {
        return tDtEmissao;
    }

    /**
     * Sets the value of the tDtEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtEmissao(XMLGregorianCalendar value) {
        this.tDtEmissao = value;
    }

    /**
     * Gets the value of the tDtEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtEntrega() {
        return tDtEntrega;
    }

    /**
     * Sets the value of the tDtEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtEntrega(XMLGregorianCalendar value) {
        this.tDtEntrega = value;
    }

    /**
     * Gets the value of the tDtSaida property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtSaida() {
        return tDtSaida;
    }

    /**
     * Sets the value of the tDtSaida property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtSaida(XMLGregorianCalendar value) {
        this.tDtSaida = value;
    }

}
