
package br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PregaoEletronicoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PregaoEletronicoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlAplicaLei123" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlChatBilateral" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlExigeCapacitacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlHomologacaoParcial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlMostrarReferencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlNaturezaObjeto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlObrigarDeclaracaoVendedor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlPermiteFornecedorCadastroVencido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlPermitirLance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlPublicarEdital" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlRequerCRC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlRestrito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlTermo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lstPregaoEletronicoComissao" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfComissaoDTO" minOccurs="0"/>
 *         &lt;element name="lstPregaoEletronicoItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPregaoEletronicoItemDTO"/>
 *         &lt;element name="lstPregaoEletronicoLoteDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPregaoEletronicoLoteDTO" minOccurs="0"/>
 *         &lt;element name="nCdPregaoTipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdTemplate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdTipoProcesso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nIdAnexoNegociacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdAutoEncerramento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdEstilo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdHabilitacaoAnexo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdModalidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdPropostaAnexo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdPropostaMarca" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdPropostaModelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdPropostaProcedencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdSuperSimples" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdTipoApuracao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nNrCasasDecimais" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nQtItensPagina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nVlProrroga" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nVlProrrogaCondicao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nVlTempoDisputa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdComprador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdMoeda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdPrazoEntrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuarioCriador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObjeto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObservacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsTermo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrEdital" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrProcessoDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtFinalProposta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtInicialDisputa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtInicialProposta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "PregaoEletronicoDTO", propOrder = {
    "bFlAplicaLei123",
    "bFlChatBilateral",
    "bFlExigeCapacitacao",
    "bFlHomologacaoParcial",
    "bFlMostrarReferencia",
    "bFlNaturezaObjeto",
    "bFlObrigarDeclaracaoVendedor",
    "bFlPermiteFornecedorCadastroVencido",
    "bFlPermitirLance",
    "bFlPublicarEdital",
    "bFlRequerCRC",
    "bFlRestrito",
    "bFlTermo",
    "lstPregaoEletronicoComissao",
    "lstPregaoEletronicoItemDTO",
    "lstPregaoEletronicoLoteDTO",
    "nCdPregaoTipo",
    "nCdSituacao",
    "nCdTemplate",
    "nCdTipoProcesso",
    "nIdAnexoNegociacao",
    "nIdAutoEncerramento",
    "nIdEstilo",
    "nIdHabilitacaoAnexo",
    "nIdModalidade",
    "nIdPropostaAnexo",
    "nIdPropostaMarca",
    "nIdPropostaModelo",
    "nIdPropostaProcedencia",
    "nIdSuperSimples",
    "nIdTipoApuracao",
    "nNrCasasDecimais",
    "nQtItensPagina",
    "nVlProrroga",
    "nVlProrrogaCondicao",
    "nVlTempoDisputa",
    "sCdComprador",
    "sCdCondicaoPagamento",
    "sCdMoeda",
    "sCdPrazoEntrega",
    "sCdUsuarioCriador",
    "sDsObjeto",
    "sDsObservacao",
    "sDsTermo",
    "sNrEdital",
    "sNrProcessoDisplay",
    "tDtFinalProposta",
    "tDtInicialDisputa",
    "tDtInicialProposta",
    "tDtPublicacao"
})
public class PregaoEletronicoDTO
    extends DtoBase
{

    @XmlElementRef(name = "bFlAplicaLei123", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlAplicaLei123;
    protected int bFlChatBilateral;
    protected int bFlExigeCapacitacao;
    @XmlElementRef(name = "bFlHomologacaoParcial", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlHomologacaoParcial;
    @XmlElementRef(name = "bFlMostrarReferencia", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlMostrarReferencia;
    @XmlElementRef(name = "bFlNaturezaObjeto", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlNaturezaObjeto;
    @XmlElementRef(name = "bFlObrigarDeclaracaoVendedor", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlObrigarDeclaracaoVendedor;
    @XmlElementRef(name = "bFlPermiteFornecedorCadastroVencido", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlPermiteFornecedorCadastroVencido;
    @XmlElementRef(name = "bFlPermitirLance", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlPermitirLance;
    protected int bFlPublicarEdital;
    @XmlElementRef(name = "bFlRequerCRC", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlRequerCRC;
    protected int bFlRestrito;
    protected int bFlTermo;
    @XmlElementRef(name = "lstPregaoEletronicoComissao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfComissaoDTO> lstPregaoEletronicoComissao;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPregaoEletronicoItemDTO lstPregaoEletronicoItemDTO;
    @XmlElementRef(name = "lstPregaoEletronicoLoteDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPregaoEletronicoLoteDTO> lstPregaoEletronicoLoteDTO;
    protected int nCdPregaoTipo;
    protected long nCdSituacao;
    protected long nCdTemplate;
    @XmlElementRef(name = "nCdTipoProcesso", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdTipoProcesso;
    @XmlElementRef(name = "nIdAnexoNegociacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdAnexoNegociacao;
    @XmlElementRef(name = "nIdAutoEncerramento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdAutoEncerramento;
    @XmlElementRef(name = "nIdEstilo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdEstilo;
    @XmlElementRef(name = "nIdHabilitacaoAnexo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdHabilitacaoAnexo;
    protected int nIdModalidade;
    protected int nIdPropostaAnexo;
    protected int nIdPropostaMarca;
    protected int nIdPropostaModelo;
    protected int nIdPropostaProcedencia;
    protected int nIdSuperSimples;
    protected int nIdTipoApuracao;
    protected int nNrCasasDecimais;
    protected int nQtItensPagina;
    @XmlElementRef(name = "nVlProrroga", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nVlProrroga;
    @XmlElementRef(name = "nVlProrrogaCondicao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nVlProrrogaCondicao;
    @XmlElementRef(name = "nVlTempoDisputa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nVlTempoDisputa;
    @XmlElement(required = true, nillable = true)
    protected String sCdComprador;
    @XmlElement(required = true, nillable = true)
    protected String sCdCondicaoPagamento;
    @XmlElement(required = true, nillable = true)
    protected String sCdMoeda;
    @XmlElement(required = true, nillable = true)
    protected String sCdPrazoEntrega;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuarioCriador;
    @XmlElement(required = true, nillable = true)
    protected String sDsObjeto;
    @XmlElement(required = true, nillable = true)
    protected String sDsObservacao;
    @XmlElementRef(name = "sDsTermo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsTermo;
    @XmlElement(required = true, nillable = true)
    protected String sNrEdital;
    @XmlElement(required = true, nillable = true)
    protected String sNrProcessoDisplay;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFinalProposta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtInicialDisputa;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtInicialProposta;
    @XmlElementRef(name = "tDtPublicacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtPublicacao;

    /**
     * Gets the value of the bFlAplicaLei123 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlAplicaLei123() {
        return bFlAplicaLei123;
    }

    /**
     * Sets the value of the bFlAplicaLei123 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlAplicaLei123(JAXBElement<Integer> value) {
        this.bFlAplicaLei123 = ((JAXBElement<Integer> ) value);
    }

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
     * Gets the value of the bFlExigeCapacitacao property.
     * 
     */
    public int getBFlExigeCapacitacao() {
        return bFlExigeCapacitacao;
    }

    /**
     * Sets the value of the bFlExigeCapacitacao property.
     * 
     */
    public void setBFlExigeCapacitacao(int value) {
        this.bFlExigeCapacitacao = value;
    }

    /**
     * Gets the value of the bFlHomologacaoParcial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlHomologacaoParcial() {
        return bFlHomologacaoParcial;
    }

    /**
     * Sets the value of the bFlHomologacaoParcial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlHomologacaoParcial(JAXBElement<Integer> value) {
        this.bFlHomologacaoParcial = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bFlMostrarReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlMostrarReferencia() {
        return bFlMostrarReferencia;
    }

    /**
     * Sets the value of the bFlMostrarReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlMostrarReferencia(JAXBElement<Integer> value) {
        this.bFlMostrarReferencia = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bFlNaturezaObjeto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlNaturezaObjeto() {
        return bFlNaturezaObjeto;
    }

    /**
     * Sets the value of the bFlNaturezaObjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlNaturezaObjeto(JAXBElement<Integer> value) {
        this.bFlNaturezaObjeto = ((JAXBElement<Integer> ) value);
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
     * Gets the value of the bFlPermiteFornecedorCadastroVencido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlPermiteFornecedorCadastroVencido() {
        return bFlPermiteFornecedorCadastroVencido;
    }

    /**
     * Sets the value of the bFlPermiteFornecedorCadastroVencido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlPermiteFornecedorCadastroVencido(JAXBElement<Integer> value) {
        this.bFlPermiteFornecedorCadastroVencido = ((JAXBElement<Integer> ) value);
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
     * Gets the value of the bFlRequerCRC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlRequerCRC() {
        return bFlRequerCRC;
    }

    /**
     * Sets the value of the bFlRequerCRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlRequerCRC(JAXBElement<Integer> value) {
        this.bFlRequerCRC = ((JAXBElement<Integer> ) value);
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
     * Gets the value of the lstPregaoEletronicoComissao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComissaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfComissaoDTO> getLstPregaoEletronicoComissao() {
        return lstPregaoEletronicoComissao;
    }

    /**
     * Sets the value of the lstPregaoEletronicoComissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComissaoDTO }{@code >}
     *     
     */
    public void setLstPregaoEletronicoComissao(JAXBElement<ArrayOfComissaoDTO> value) {
        this.lstPregaoEletronicoComissao = ((JAXBElement<ArrayOfComissaoDTO> ) value);
    }

    /**
     * Gets the value of the lstPregaoEletronicoItemDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPregaoEletronicoItemDTO }
     *     
     */
    public ArrayOfPregaoEletronicoItemDTO getLstPregaoEletronicoItemDTO() {
        return lstPregaoEletronicoItemDTO;
    }

    /**
     * Sets the value of the lstPregaoEletronicoItemDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPregaoEletronicoItemDTO }
     *     
     */
    public void setLstPregaoEletronicoItemDTO(ArrayOfPregaoEletronicoItemDTO value) {
        this.lstPregaoEletronicoItemDTO = value;
    }

    /**
     * Gets the value of the lstPregaoEletronicoLoteDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoLoteDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPregaoEletronicoLoteDTO> getLstPregaoEletronicoLoteDTO() {
        return lstPregaoEletronicoLoteDTO;
    }

    /**
     * Sets the value of the lstPregaoEletronicoLoteDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoLoteDTO }{@code >}
     *     
     */
    public void setLstPregaoEletronicoLoteDTO(JAXBElement<ArrayOfPregaoEletronicoLoteDTO> value) {
        this.lstPregaoEletronicoLoteDTO = ((JAXBElement<ArrayOfPregaoEletronicoLoteDTO> ) value);
    }

    /**
     * Gets the value of the nCdPregaoTipo property.
     * 
     */
    public int getNCdPregaoTipo() {
        return nCdPregaoTipo;
    }

    /**
     * Sets the value of the nCdPregaoTipo property.
     * 
     */
    public void setNCdPregaoTipo(int value) {
        this.nCdPregaoTipo = value;
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
     * Gets the value of the nCdTipoProcesso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdTipoProcesso() {
        return nCdTipoProcesso;
    }

    /**
     * Sets the value of the nCdTipoProcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdTipoProcesso(JAXBElement<Long> value) {
        this.nCdTipoProcesso = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the nIdAnexoNegociacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdAnexoNegociacao() {
        return nIdAnexoNegociacao;
    }

    /**
     * Sets the value of the nIdAnexoNegociacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdAnexoNegociacao(JAXBElement<Integer> value) {
        this.nIdAnexoNegociacao = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nIdAutoEncerramento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdAutoEncerramento() {
        return nIdAutoEncerramento;
    }

    /**
     * Sets the value of the nIdAutoEncerramento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdAutoEncerramento(JAXBElement<Integer> value) {
        this.nIdAutoEncerramento = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nIdEstilo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdEstilo() {
        return nIdEstilo;
    }

    /**
     * Sets the value of the nIdEstilo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdEstilo(JAXBElement<Integer> value) {
        this.nIdEstilo = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nIdHabilitacaoAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdHabilitacaoAnexo() {
        return nIdHabilitacaoAnexo;
    }

    /**
     * Sets the value of the nIdHabilitacaoAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdHabilitacaoAnexo(JAXBElement<Integer> value) {
        this.nIdHabilitacaoAnexo = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nIdModalidade property.
     * 
     */
    public int getNIdModalidade() {
        return nIdModalidade;
    }

    /**
     * Sets the value of the nIdModalidade property.
     * 
     */
    public void setNIdModalidade(int value) {
        this.nIdModalidade = value;
    }

    /**
     * Gets the value of the nIdPropostaAnexo property.
     * 
     */
    public int getNIdPropostaAnexo() {
        return nIdPropostaAnexo;
    }

    /**
     * Sets the value of the nIdPropostaAnexo property.
     * 
     */
    public void setNIdPropostaAnexo(int value) {
        this.nIdPropostaAnexo = value;
    }

    /**
     * Gets the value of the nIdPropostaMarca property.
     * 
     */
    public int getNIdPropostaMarca() {
        return nIdPropostaMarca;
    }

    /**
     * Sets the value of the nIdPropostaMarca property.
     * 
     */
    public void setNIdPropostaMarca(int value) {
        this.nIdPropostaMarca = value;
    }

    /**
     * Gets the value of the nIdPropostaModelo property.
     * 
     */
    public int getNIdPropostaModelo() {
        return nIdPropostaModelo;
    }

    /**
     * Sets the value of the nIdPropostaModelo property.
     * 
     */
    public void setNIdPropostaModelo(int value) {
        this.nIdPropostaModelo = value;
    }

    /**
     * Gets the value of the nIdPropostaProcedencia property.
     * 
     */
    public int getNIdPropostaProcedencia() {
        return nIdPropostaProcedencia;
    }

    /**
     * Sets the value of the nIdPropostaProcedencia property.
     * 
     */
    public void setNIdPropostaProcedencia(int value) {
        this.nIdPropostaProcedencia = value;
    }

    /**
     * Gets the value of the nIdSuperSimples property.
     * 
     */
    public int getNIdSuperSimples() {
        return nIdSuperSimples;
    }

    /**
     * Sets the value of the nIdSuperSimples property.
     * 
     */
    public void setNIdSuperSimples(int value) {
        this.nIdSuperSimples = value;
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
    public int getNQtItensPagina() {
        return nQtItensPagina;
    }

    /**
     * Sets the value of the nQtItensPagina property.
     * 
     */
    public void setNQtItensPagina(int value) {
        this.nQtItensPagina = value;
    }

    /**
     * Gets the value of the nVlProrroga property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNVlProrroga() {
        return nVlProrroga;
    }

    /**
     * Sets the value of the nVlProrroga property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNVlProrroga(JAXBElement<Integer> value) {
        this.nVlProrroga = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nVlProrrogaCondicao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNVlProrrogaCondicao() {
        return nVlProrrogaCondicao;
    }

    /**
     * Sets the value of the nVlProrrogaCondicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNVlProrrogaCondicao(JAXBElement<Integer> value) {
        this.nVlProrrogaCondicao = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nVlTempoDisputa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNVlTempoDisputa() {
        return nVlTempoDisputa;
    }

    /**
     * Sets the value of the nVlTempoDisputa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNVlTempoDisputa(JAXBElement<Integer> value) {
        this.nVlTempoDisputa = ((JAXBElement<Integer> ) value);
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
     * Gets the value of the sCdMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdMoeda() {
        return sCdMoeda;
    }

    /**
     * Sets the value of the sCdMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdMoeda(String value) {
        this.sCdMoeda = value;
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
     *     {@link String }
     *     
     */
    public String getSNrEdital() {
        return sNrEdital;
    }

    /**
     * Sets the value of the sNrEdital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrEdital(String value) {
        this.sNrEdital = value;
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
     * Gets the value of the tDtFinalProposta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtFinalProposta() {
        return tDtFinalProposta;
    }

    /**
     * Sets the value of the tDtFinalProposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtFinalProposta(XMLGregorianCalendar value) {
        this.tDtFinalProposta = value;
    }

    /**
     * Gets the value of the tDtInicialDisputa property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtInicialDisputa() {
        return tDtInicialDisputa;
    }

    /**
     * Sets the value of the tDtInicialDisputa property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtInicialDisputa(XMLGregorianCalendar value) {
        this.tDtInicialDisputa = value;
    }

    /**
     * Gets the value of the tDtInicialProposta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtInicialProposta() {
        return tDtInicialProposta;
    }

    /**
     * Sets the value of the tDtInicialProposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtInicialProposta(XMLGregorianCalendar value) {
        this.tDtInicialProposta = value;
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
