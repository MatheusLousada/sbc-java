
package br.gov.sp.saobernardo.paradigma.ws.compradireta;

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
 * <p>Java class for CompraDiretaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompraDiretaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlChatBilateral" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlChatBilateralRestrito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlDesativarAutoEncerramento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlMostraReferencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlObrigarDeclaracaoVendedor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlPermiteInvalidar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlPermitirLance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlProrroga" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlPublicarEdital" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlRestrito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlTermo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlVariacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dVlVariacaoMax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlVariacaoMin" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lstCompraDiretaComissao" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfComissaoDTO" minOccurs="0"/>
 *         &lt;element name="lstCompraDiretaItem" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCompraDiretaItemDTO"/>
 *         &lt;element name="lstCompraDiretaLote" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCompraDiretaLoteDTO" minOccurs="0"/>
 *         &lt;element name="nCdMoeda" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdTemplate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdTipoCompraDireta" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nIdAvaliacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdEstilo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdLanceMarca" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdLanceProcedencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdTipoApuracao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdTipoLanceInicial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nNrCasasDecimais" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nQtItensPagina" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nVlProrroga" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nVlProrrogaCondicao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdComprador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdPrazoEntrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuarioCriador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObjeto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObservacoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsTermo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrEdital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrProcessoDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtPublicacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompraDiretaDTO", propOrder = {
    "bFlChatBilateral",
    "bFlChatBilateralRestrito",
    "bFlDesativarAutoEncerramento",
    "bFlMostraReferencia",
    "bFlObrigarDeclaracaoVendedor",
    "bFlPermiteInvalidar",
    "bFlPermitirLance",
    "bFlProrroga",
    "bFlPublicarEdital",
    "bFlRestrito",
    "bFlTermo",
    "bFlVariacao",
    "dVlVariacaoMax",
    "dVlVariacaoMin",
    "lstCompraDiretaComissao",
    "lstCompraDiretaItem",
    "lstCompraDiretaLote",
    "nCdMoeda",
    "nCdSituacao",
    "nCdTemplate",
    "nCdTipoCompraDireta",
    "nIdAvaliacao",
    "nIdEstilo",
    "nIdLanceMarca",
    "nIdLanceProcedencia",
    "nIdTipoApuracao",
    "nIdTipoLanceInicial",
    "nNrCasasDecimais",
    "nQtItensPagina",
    "nVlProrroga",
    "nVlProrrogaCondicao",
    "sCdComprador",
    "sCdCondicaoPagamento",
    "sCdPrazoEntrega",
    "sCdUsuarioCriador",
    "sDsObjeto",
    "sDsObservacoes",
    "sDsTermo",
    "sNrEdital",
    "sNrProcessoDisplay",
    "tDtFinal",
    "tDtInicial",
    "tDtPublicacao"
})
public class CompraDiretaDTO
    extends DtoBase
{

    protected int bFlChatBilateral;
    protected int bFlChatBilateralRestrito;
    protected int bFlDesativarAutoEncerramento;
    protected int bFlMostraReferencia;
    @XmlElementRef(name = "bFlObrigarDeclaracaoVendedor", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlObrigarDeclaracaoVendedor;
    protected int bFlPermiteInvalidar;
    @XmlElementRef(name = "bFlPermitirLance", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlPermitirLance;
    protected int bFlProrroga;
    protected int bFlPublicarEdital;
    protected int bFlRestrito;
    protected int bFlTermo;
    protected int bFlVariacao;
    protected BigDecimal dVlVariacaoMax;
    protected BigDecimal dVlVariacaoMin;
    @XmlElementRef(name = "lstCompraDiretaComissao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfComissaoDTO> lstCompraDiretaComissao;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCompraDiretaItemDTO lstCompraDiretaItem;
    @XmlElementRef(name = "lstCompraDiretaLote", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCompraDiretaLoteDTO> lstCompraDiretaLote;
    protected long nCdMoeda;
    protected long nCdSituacao;
    protected long nCdTemplate;
    @XmlElementRef(name = "nCdTipoCompraDireta", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdTipoCompraDireta;
    protected int nIdAvaliacao;
    protected int nIdEstilo;
    protected int nIdLanceMarca;
    protected int nIdLanceProcedencia;
    protected int nIdTipoApuracao;
    @XmlElementRef(name = "nIdTipoLanceInicial", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdTipoLanceInicial;
    protected int nNrCasasDecimais;
    protected long nQtItensPagina;
    protected Integer nVlProrroga;
    protected Integer nVlProrrogaCondicao;
    @XmlElement(required = true, nillable = true)
    protected String sCdComprador;
    @XmlElement(required = true, nillable = true)
    protected String sCdCondicaoPagamento;
    @XmlElement(required = true, nillable = true)
    protected String sCdPrazoEntrega;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuarioCriador;
    @XmlElement(required = true, nillable = true)
    protected String sDsObjeto;
    @XmlElementRef(name = "sDsObservacoes", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsObservacoes;
    @XmlElementRef(name = "sDsTermo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsTermo;
    @XmlElementRef(name = "sNrEdital", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrEdital;
    @XmlElement(required = true, nillable = true)
    protected String sNrProcessoDisplay;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFinal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtInicial;
    @XmlElementRef(name = "tDtPublicacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtPublicacao;

    /**
     * Gets the value of the bFlChatBilateral property.
     * 
     */
    public int getBFlChatBilateral() {
        return bFlChatBilateral;
    }

    /**
     * Sets the value of the bFlChatBilateral property.
     * 
     */
    public void setBFlChatBilateral(int value) {
        this.bFlChatBilateral = value;
    }

    /**
     * Gets the value of the bFlChatBilateralRestrito property.
     * 
     */
    public int getBFlChatBilateralRestrito() {
        return bFlChatBilateralRestrito;
    }

    /**
     * Sets the value of the bFlChatBilateralRestrito property.
     * 
     */
    public void setBFlChatBilateralRestrito(int value) {
        this.bFlChatBilateralRestrito = value;
    }

    /**
     * Gets the value of the bFlDesativarAutoEncerramento property.
     * 
     */
    public int getBFlDesativarAutoEncerramento() {
        return bFlDesativarAutoEncerramento;
    }

    /**
     * Sets the value of the bFlDesativarAutoEncerramento property.
     * 
     */
    public void setBFlDesativarAutoEncerramento(int value) {
        this.bFlDesativarAutoEncerramento = value;
    }

    /**
     * Gets the value of the bFlMostraReferencia property.
     * 
     */
    public int getBFlMostraReferencia() {
        return bFlMostraReferencia;
    }

    /**
     * Sets the value of the bFlMostraReferencia property.
     * 
     */
    public void setBFlMostraReferencia(int value) {
        this.bFlMostraReferencia = value;
    }

    /**
     * Gets the value of the bFlObrigarDeclaracaoVendedor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlObrigarDeclaracaoVendedor() {
        return bFlObrigarDeclaracaoVendedor;
    }

    /**
     * Sets the value of the bFlObrigarDeclaracaoVendedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlObrigarDeclaracaoVendedor(JAXBElement<Integer> value) {
        this.bFlObrigarDeclaracaoVendedor = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bFlPermiteInvalidar property.
     * 
     */
    public int getBFlPermiteInvalidar() {
        return bFlPermiteInvalidar;
    }

    /**
     * Sets the value of the bFlPermiteInvalidar property.
     * 
     */
    public void setBFlPermiteInvalidar(int value) {
        this.bFlPermiteInvalidar = value;
    }

    /**
     * Gets the value of the bFlPermitirLance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlPermitirLance() {
        return bFlPermitirLance;
    }

    /**
     * Sets the value of the bFlPermitirLance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlPermitirLance(JAXBElement<Integer> value) {
        this.bFlPermitirLance = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bFlProrroga property.
     * 
     */
    public int getBFlProrroga() {
        return bFlProrroga;
    }

    /**
     * Sets the value of the bFlProrroga property.
     * 
     */
    public void setBFlProrroga(int value) {
        this.bFlProrroga = value;
    }

    /**
     * Gets the value of the bFlPublicarEdital property.
     * 
     */
    public int getBFlPublicarEdital() {
        return bFlPublicarEdital;
    }

    /**
     * Sets the value of the bFlPublicarEdital property.
     * 
     */
    public void setBFlPublicarEdital(int value) {
        this.bFlPublicarEdital = value;
    }

    /**
     * Gets the value of the bFlRestrito property.
     * 
     */
    public int getBFlRestrito() {
        return bFlRestrito;
    }

    /**
     * Sets the value of the bFlRestrito property.
     * 
     */
    public void setBFlRestrito(int value) {
        this.bFlRestrito = value;
    }

    /**
     * Gets the value of the bFlTermo property.
     * 
     */
    public int getBFlTermo() {
        return bFlTermo;
    }

    /**
     * Sets the value of the bFlTermo property.
     * 
     */
    public void setBFlTermo(int value) {
        this.bFlTermo = value;
    }

    /**
     * Gets the value of the bFlVariacao property.
     * 
     */
    public int getBFlVariacao() {
        return bFlVariacao;
    }

    /**
     * Sets the value of the bFlVariacao property.
     * 
     */
    public void setBFlVariacao(int value) {
        this.bFlVariacao = value;
    }

    /**
     * Gets the value of the dVlVariacaoMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlVariacaoMax() {
        return dVlVariacaoMax;
    }

    /**
     * Sets the value of the dVlVariacaoMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlVariacaoMax(BigDecimal value) {
        this.dVlVariacaoMax = value;
    }

    /**
     * Gets the value of the dVlVariacaoMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlVariacaoMin() {
        return dVlVariacaoMin;
    }

    /**
     * Sets the value of the dVlVariacaoMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlVariacaoMin(BigDecimal value) {
        this.dVlVariacaoMin = value;
    }

    /**
     * Gets the value of the lstCompraDiretaComissao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComissaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfComissaoDTO> getLstCompraDiretaComissao() {
        return lstCompraDiretaComissao;
    }

    /**
     * Sets the value of the lstCompraDiretaComissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComissaoDTO }{@code >}
     *     
     */
    public void setLstCompraDiretaComissao(JAXBElement<ArrayOfComissaoDTO> value) {
        this.lstCompraDiretaComissao = ((JAXBElement<ArrayOfComissaoDTO> ) value);
    }

    /**
     * Gets the value of the lstCompraDiretaItem property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompraDiretaItemDTO }
     *     
     */
    public ArrayOfCompraDiretaItemDTO getLstCompraDiretaItem() {
        return lstCompraDiretaItem;
    }

    /**
     * Sets the value of the lstCompraDiretaItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompraDiretaItemDTO }
     *     
     */
    public void setLstCompraDiretaItem(ArrayOfCompraDiretaItemDTO value) {
        this.lstCompraDiretaItem = value;
    }

    /**
     * Gets the value of the lstCompraDiretaLote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaLoteDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCompraDiretaLoteDTO> getLstCompraDiretaLote() {
        return lstCompraDiretaLote;
    }

    /**
     * Sets the value of the lstCompraDiretaLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaLoteDTO }{@code >}
     *     
     */
    public void setLstCompraDiretaLote(JAXBElement<ArrayOfCompraDiretaLoteDTO> value) {
        this.lstCompraDiretaLote = ((JAXBElement<ArrayOfCompraDiretaLoteDTO> ) value);
    }

    /**
     * Gets the value of the nCdMoeda property.
     * 
     */
    public long getNCdMoeda() {
        return nCdMoeda;
    }

    /**
     * Sets the value of the nCdMoeda property.
     * 
     */
    public void setNCdMoeda(long value) {
        this.nCdMoeda = value;
    }

    /**
     * Gets the value of the nCdSituacao property.
     * 
     */
    public long getNCdSituacao() {
        return nCdSituacao;
    }

    /**
     * Sets the value of the nCdSituacao property.
     * 
     */
    public void setNCdSituacao(long value) {
        this.nCdSituacao = value;
    }

    /**
     * Gets the value of the nCdTemplate property.
     * 
     */
    public long getNCdTemplate() {
        return nCdTemplate;
    }

    /**
     * Sets the value of the nCdTemplate property.
     * 
     */
    public void setNCdTemplate(long value) {
        this.nCdTemplate = value;
    }

    /**
     * Gets the value of the nCdTipoCompraDireta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdTipoCompraDireta() {
        return nCdTipoCompraDireta;
    }

    /**
     * Sets the value of the nCdTipoCompraDireta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdTipoCompraDireta(JAXBElement<Long> value) {
        this.nCdTipoCompraDireta = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the nIdAvaliacao property.
     * 
     */
    public int getNIdAvaliacao() {
        return nIdAvaliacao;
    }

    /**
     * Sets the value of the nIdAvaliacao property.
     * 
     */
    public void setNIdAvaliacao(int value) {
        this.nIdAvaliacao = value;
    }

    /**
     * Gets the value of the nIdEstilo property.
     * 
     */
    public int getNIdEstilo() {
        return nIdEstilo;
    }

    /**
     * Sets the value of the nIdEstilo property.
     * 
     */
    public void setNIdEstilo(int value) {
        this.nIdEstilo = value;
    }

    /**
     * Gets the value of the nIdLanceMarca property.
     * 
     */
    public int getNIdLanceMarca() {
        return nIdLanceMarca;
    }

    /**
     * Sets the value of the nIdLanceMarca property.
     * 
     */
    public void setNIdLanceMarca(int value) {
        this.nIdLanceMarca = value;
    }

    /**
     * Gets the value of the nIdLanceProcedencia property.
     * 
     */
    public int getNIdLanceProcedencia() {
        return nIdLanceProcedencia;
    }

    /**
     * Sets the value of the nIdLanceProcedencia property.
     * 
     */
    public void setNIdLanceProcedencia(int value) {
        this.nIdLanceProcedencia = value;
    }

    /**
     * Gets the value of the nIdTipoApuracao property.
     * 
     */
    public int getNIdTipoApuracao() {
        return nIdTipoApuracao;
    }

    /**
     * Sets the value of the nIdTipoApuracao property.
     * 
     */
    public void setNIdTipoApuracao(int value) {
        this.nIdTipoApuracao = value;
    }

    /**
     * Gets the value of the nIdTipoLanceInicial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdTipoLanceInicial() {
        return nIdTipoLanceInicial;
    }

    /**
     * Sets the value of the nIdTipoLanceInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdTipoLanceInicial(JAXBElement<Integer> value) {
        this.nIdTipoLanceInicial = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nNrCasasDecimais property.
     * 
     */
    public int getNNrCasasDecimais() {
        return nNrCasasDecimais;
    }

    /**
     * Sets the value of the nNrCasasDecimais property.
     * 
     */
    public void setNNrCasasDecimais(int value) {
        this.nNrCasasDecimais = value;
    }

    /**
     * Gets the value of the nQtItensPagina property.
     * 
     */
    public long getNQtItensPagina() {
        return nQtItensPagina;
    }

    /**
     * Sets the value of the nQtItensPagina property.
     * 
     */
    public void setNQtItensPagina(long value) {
        this.nQtItensPagina = value;
    }

    /**
     * Gets the value of the nVlProrroga property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNVlProrroga() {
        return nVlProrroga;
    }

    /**
     * Sets the value of the nVlProrroga property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNVlProrroga(Integer value) {
        this.nVlProrroga = value;
    }

    /**
     * Gets the value of the nVlProrrogaCondicao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNVlProrrogaCondicao() {
        return nVlProrrogaCondicao;
    }

    /**
     * Sets the value of the nVlProrrogaCondicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNVlProrrogaCondicao(Integer value) {
        this.nVlProrrogaCondicao = value;
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
     * Gets the value of the sCdPrazoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdPrazoEntrega() {
        return sCdPrazoEntrega;
    }

    /**
     * Sets the value of the sCdPrazoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdPrazoEntrega(String value) {
        this.sCdPrazoEntrega = value;
    }

    /**
     * Gets the value of the sCdUsuarioCriador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUsuarioCriador() {
        return sCdUsuarioCriador;
    }

    /**
     * Sets the value of the sCdUsuarioCriador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUsuarioCriador(String value) {
        this.sCdUsuarioCriador = value;
    }

    /**
     * Gets the value of the sDsObjeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsObjeto() {
        return sDsObjeto;
    }

    /**
     * Sets the value of the sDsObjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsObjeto(String value) {
        this.sDsObjeto = value;
    }

    /**
     * Gets the value of the sDsObservacoes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsObservacoes() {
        return sDsObservacoes;
    }

    /**
     * Sets the value of the sDsObservacoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsObservacoes(JAXBElement<String> value) {
        this.sDsObservacoes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsTermo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsTermo() {
        return sDsTermo;
    }

    /**
     * Sets the value of the sDsTermo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsTermo(JAXBElement<String> value) {
        this.sDsTermo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrEdital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrEdital() {
        return sNrEdital;
    }

    /**
     * Sets the value of the sNrEdital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrEdital(JAXBElement<String> value) {
        this.sNrEdital = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrProcessoDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrProcessoDisplay() {
        return sNrProcessoDisplay;
    }

    /**
     * Sets the value of the sNrProcessoDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrProcessoDisplay(String value) {
        this.sNrProcessoDisplay = value;
    }

    /**
     * Gets the value of the tDtFinal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtFinal() {
        return tDtFinal;
    }

    /**
     * Sets the value of the tDtFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtFinal(XMLGregorianCalendar value) {
        this.tDtFinal = value;
    }

    /**
     * Gets the value of the tDtInicial property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtInicial() {
        return tDtInicial;
    }

    /**
     * Sets the value of the tDtInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtInicial(XMLGregorianCalendar value) {
        this.tDtInicial = value;
    }

    /**
     * Gets the value of the tDtPublicacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTDtPublicacao() {
        return tDtPublicacao;
    }

    /**
     * Sets the value of the tDtPublicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTDtPublicacao(JAXBElement<XMLGregorianCalendar> value) {
        this.tDtPublicacao = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
