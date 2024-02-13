
package br.gov.sp.saobernardo.paradigma.ws.titulo;

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
 * <p>Java class for TituloDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TituloDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlPago" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlTitulo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstTituloDescontoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfTituloDescontoDTO" minOccurs="0"/>
 *         &lt;element name="lstTituloItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfTituloItemDTO"/>
 *         &lt;element name="lstTituloPagamentoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfTituloPagamentoDTO" minOccurs="0"/>
 *         &lt;element name="lstTituloTaxaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfTituloTaxaDTO" minOccurs="0"/>
 *         &lt;element name="nCdSituacaoEvento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCdSituacaoOperacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCdSituacaoSemaforo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCdSituacaoStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nCdSituacaoTitulo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nNrVersao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdComprador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdFornecedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsMotivoRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsPasso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrNotaFiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrNotaFiscalSerie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrProtocolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrProtocoloComplementar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrTitulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtEnvioEvento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtProtocolo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtProtocoloComplementar" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TituloDTO", propOrder = {
    "dVlPago",
    "dVlTitulo",
    "lstTituloDescontoDTO",
    "lstTituloItemDTO",
    "lstTituloPagamentoDTO",
    "lstTituloTaxaDTO",
    "nCdSituacaoEvento",
    "nCdSituacaoOperacao",
    "nCdSituacaoSemaforo",
    "nCdSituacaoStatus",
    "nCdSituacaoTitulo",
    "nNrVersao",
    "sCdComprador",
    "sCdCondicaoPagamento",
    "sCdFornecedor",
    "sCdMoeda",
    "sCdUsuario",
    "sDsMotivoRetorno",
    "sDsObservacao",
    "sDsPasso",
    "sNrContrato",
    "sNrNotaFiscal",
    "sNrNotaFiscalSerie",
    "sNrPedido",
    "sNrProtocolo",
    "sNrProtocoloComplementar",
    "sNrTitulo",
    "tDtEmissao",
    "tDtEnvioEvento",
    "tDtPagamento",
    "tDtProtocolo",
    "tDtProtocoloComplementar",
    "tDtVencimento"
})
public class TituloDTO
    extends DtoBase
{

    protected BigDecimal dVlPago;
    @XmlElement(required = true)
    protected BigDecimal dVlTitulo;
    @XmlElementRef(name = "lstTituloDescontoDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTituloDescontoDTO> lstTituloDescontoDTO;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTituloItemDTO lstTituloItemDTO;
    @XmlElementRef(name = "lstTituloPagamentoDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTituloPagamentoDTO> lstTituloPagamentoDTO;
    @XmlElementRef(name = "lstTituloTaxaDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTituloTaxaDTO> lstTituloTaxaDTO;
    @XmlElementRef(name = "nCdSituacaoEvento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nCdSituacaoEvento;
    @XmlElementRef(name = "nCdSituacaoOperacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nCdSituacaoOperacao;
    @XmlElementRef(name = "nCdSituacaoSemaforo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nCdSituacaoSemaforo;
    protected int nCdSituacaoStatus;
    @XmlElementRef(name = "nCdSituacaoTitulo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nCdSituacaoTitulo;
    @XmlElementRef(name = "nNrVersao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nNrVersao;
    @XmlElement(required = true, nillable = true)
    protected String sCdComprador;
    @XmlElement(required = true, nillable = true)
    protected String sCdCondicaoPagamento;
    @XmlElement(required = true, nillable = true)
    protected String sCdFornecedor;
    @XmlElementRef(name = "sCdMoeda", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdMoeda;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuario;
    @XmlElementRef(name = "sDsMotivoRetorno", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsMotivoRetorno;
    @XmlElementRef(name = "sDsObservacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsObservacao;
    @XmlElementRef(name = "sDsPasso", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsPasso;
    @XmlElementRef(name = "sNrContrato", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrContrato;
    @XmlElementRef(name = "sNrNotaFiscal", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrNotaFiscal;
    @XmlElementRef(name = "sNrNotaFiscalSerie", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrNotaFiscalSerie;
    @XmlElementRef(name = "sNrPedido", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrPedido;
    @XmlElementRef(name = "sNrProtocolo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrProtocolo;
    @XmlElementRef(name = "sNrProtocoloComplementar", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrProtocoloComplementar;
    @XmlElement(required = true, nillable = true)
    protected String sNrTitulo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEmissao;
    @XmlElementRef(name = "tDtEnvioEvento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtEnvioEvento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtPagamento;
    @XmlElementRef(name = "tDtProtocolo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtProtocolo;
    @XmlElementRef(name = "tDtProtocoloComplementar", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtProtocoloComplementar;
    @XmlElementRef(name = "tDtVencimento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtVencimento;

    /**
     * Gets the value of the dVlPago property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlPago() {
        return dVlPago;
    }

    /**
     * Sets the value of the dVlPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlPago(BigDecimal value) {
        this.dVlPago = value;
    }

    /**
     * Gets the value of the dVlTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlTitulo() {
        return dVlTitulo;
    }

    /**
     * Sets the value of the dVlTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlTitulo(BigDecimal value) {
        this.dVlTitulo = value;
    }

    /**
     * Gets the value of the lstTituloDescontoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTituloDescontoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTituloDescontoDTO> getLstTituloDescontoDTO() {
        return lstTituloDescontoDTO;
    }

    /**
     * Sets the value of the lstTituloDescontoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTituloDescontoDTO }{@code >}
     *     
     */
    public void setLstTituloDescontoDTO(JAXBElement<ArrayOfTituloDescontoDTO> value) {
        this.lstTituloDescontoDTO = ((JAXBElement<ArrayOfTituloDescontoDTO> ) value);
    }

    /**
     * Gets the value of the lstTituloItemDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTituloItemDTO }
     *     
     */
    public ArrayOfTituloItemDTO getLstTituloItemDTO() {
        return lstTituloItemDTO;
    }

    /**
     * Sets the value of the lstTituloItemDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTituloItemDTO }
     *     
     */
    public void setLstTituloItemDTO(ArrayOfTituloItemDTO value) {
        this.lstTituloItemDTO = value;
    }

    /**
     * Gets the value of the lstTituloPagamentoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTituloPagamentoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTituloPagamentoDTO> getLstTituloPagamentoDTO() {
        return lstTituloPagamentoDTO;
    }

    /**
     * Sets the value of the lstTituloPagamentoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTituloPagamentoDTO }{@code >}
     *     
     */
    public void setLstTituloPagamentoDTO(JAXBElement<ArrayOfTituloPagamentoDTO> value) {
        this.lstTituloPagamentoDTO = ((JAXBElement<ArrayOfTituloPagamentoDTO> ) value);
    }

    /**
     * Gets the value of the lstTituloTaxaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTituloTaxaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTituloTaxaDTO> getLstTituloTaxaDTO() {
        return lstTituloTaxaDTO;
    }

    /**
     * Sets the value of the lstTituloTaxaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTituloTaxaDTO }{@code >}
     *     
     */
    public void setLstTituloTaxaDTO(JAXBElement<ArrayOfTituloTaxaDTO> value) {
        this.lstTituloTaxaDTO = ((JAXBElement<ArrayOfTituloTaxaDTO> ) value);
    }

    /**
     * Gets the value of the nCdSituacaoEvento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNCdSituacaoEvento() {
        return nCdSituacaoEvento;
    }

    /**
     * Sets the value of the nCdSituacaoEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNCdSituacaoEvento(JAXBElement<Integer> value) {
        this.nCdSituacaoEvento = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nCdSituacaoOperacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNCdSituacaoOperacao() {
        return nCdSituacaoOperacao;
    }

    /**
     * Sets the value of the nCdSituacaoOperacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNCdSituacaoOperacao(JAXBElement<Integer> value) {
        this.nCdSituacaoOperacao = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nCdSituacaoSemaforo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNCdSituacaoSemaforo() {
        return nCdSituacaoSemaforo;
    }

    /**
     * Sets the value of the nCdSituacaoSemaforo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNCdSituacaoSemaforo(JAXBElement<Integer> value) {
        this.nCdSituacaoSemaforo = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nCdSituacaoStatus property.
     * 
     */
    public int getNCdSituacaoStatus() {
        return nCdSituacaoStatus;
    }

    /**
     * Sets the value of the nCdSituacaoStatus property.
     * 
     */
    public void setNCdSituacaoStatus(int value) {
        this.nCdSituacaoStatus = value;
    }

    /**
     * Gets the value of the nCdSituacaoTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNCdSituacaoTitulo() {
        return nCdSituacaoTitulo;
    }

    /**
     * Sets the value of the nCdSituacaoTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNCdSituacaoTitulo(JAXBElement<Integer> value) {
        this.nCdSituacaoTitulo = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nNrVersao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNNrVersao() {
        return nNrVersao;
    }

    /**
     * Sets the value of the nNrVersao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNNrVersao(JAXBElement<Integer> value) {
        this.nNrVersao = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sCdComprador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdComprador() {
        return sCdComprador;
    }

    /**
     * Sets the value of the sCdComprador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdComprador(String value) {
        this.sCdComprador = value;
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
     * Gets the value of the sCdFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdFornecedor() {
        return sCdFornecedor;
    }

    /**
     * Sets the value of the sCdFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdFornecedor(String value) {
        this.sCdFornecedor = value;
    }

    /**
     * Gets the value of the sCdMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdMoeda() {
        return sCdMoeda;
    }

    /**
     * Sets the value of the sCdMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdMoeda(JAXBElement<String> value) {
        this.sCdMoeda = ((JAXBElement<String> ) value);
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
     * Gets the value of the sDsMotivoRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsMotivoRetorno() {
        return sDsMotivoRetorno;
    }

    /**
     * Sets the value of the sDsMotivoRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsMotivoRetorno(JAXBElement<String> value) {
        this.sDsMotivoRetorno = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsObservacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsObservacao() {
        return sDsObservacao;
    }

    /**
     * Sets the value of the sDsObservacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsObservacao(JAXBElement<String> value) {
        this.sDsObservacao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsPasso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsPasso() {
        return sDsPasso;
    }

    /**
     * Sets the value of the sDsPasso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsPasso(JAXBElement<String> value) {
        this.sDsPasso = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrContrato property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrContrato() {
        return sNrContrato;
    }

    /**
     * Sets the value of the sNrContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrContrato(JAXBElement<String> value) {
        this.sNrContrato = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrNotaFiscal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrNotaFiscal() {
        return sNrNotaFiscal;
    }

    /**
     * Sets the value of the sNrNotaFiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrNotaFiscal(JAXBElement<String> value) {
        this.sNrNotaFiscal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrNotaFiscalSerie property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrNotaFiscalSerie() {
        return sNrNotaFiscalSerie;
    }

    /**
     * Sets the value of the sNrNotaFiscalSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrNotaFiscalSerie(JAXBElement<String> value) {
        this.sNrNotaFiscalSerie = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrPedido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrPedido() {
        return sNrPedido;
    }

    /**
     * Sets the value of the sNrPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrPedido(JAXBElement<String> value) {
        this.sNrPedido = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrProtocolo() {
        return sNrProtocolo;
    }

    /**
     * Sets the value of the sNrProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrProtocolo(JAXBElement<String> value) {
        this.sNrProtocolo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrProtocoloComplementar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrProtocoloComplementar() {
        return sNrProtocoloComplementar;
    }

    /**
     * Sets the value of the sNrProtocoloComplementar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrProtocoloComplementar(JAXBElement<String> value) {
        this.sNrProtocoloComplementar = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrTitulo() {
        return sNrTitulo;
    }

    /**
     * Sets the value of the sNrTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrTitulo(String value) {
        this.sNrTitulo = value;
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
     * Gets the value of the tDtEnvioEvento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTDtEnvioEvento() {
        return tDtEnvioEvento;
    }

    /**
     * Sets the value of the tDtEnvioEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTDtEnvioEvento(JAXBElement<XMLGregorianCalendar> value) {
        this.tDtEnvioEvento = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the tDtPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtPagamento() {
        return tDtPagamento;
    }

    /**
     * Sets the value of the tDtPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtPagamento(XMLGregorianCalendar value) {
        this.tDtPagamento = value;
    }

    /**
     * Gets the value of the tDtProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTDtProtocolo() {
        return tDtProtocolo;
    }

    /**
     * Sets the value of the tDtProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTDtProtocolo(JAXBElement<XMLGregorianCalendar> value) {
        this.tDtProtocolo = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the tDtProtocoloComplementar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTDtProtocoloComplementar() {
        return tDtProtocoloComplementar;
    }

    /**
     * Sets the value of the tDtProtocoloComplementar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTDtProtocoloComplementar(JAXBElement<XMLGregorianCalendar> value) {
        this.tDtProtocoloComplementar = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the tDtVencimento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTDtVencimento() {
        return tDtVencimento;
    }

    /**
     * Sets the value of the tDtVencimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTDtVencimento(JAXBElement<XMLGregorianCalendar> value) {
        this.tDtVencimento = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
