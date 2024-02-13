
package br.gov.sp.saobernardo.paradigma.ws.convite;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConviteDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConviteDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlLei123" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlObrigarDeclaracaoVendedor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlPublicarEdital" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlRestrito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlTermo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lstConviteComissao" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfComissaoDTO" minOccurs="0"/>
 *         &lt;element name="lstConviteItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfConviteItemDTO"/>
 *         &lt;element name="lstConviteLoteDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfConviteLoteDTO" minOccurs="0"/>
 *         &lt;element name="nCdConviteTipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nCdMoeda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nCdTemplate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdAvaliacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdPropostaAnexo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdPropostaMarca" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdPropostaProcedencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdSuperSimples" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdTipoApuracao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nNrCasasDecimais" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nQtItensPagina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdComprador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdPrazoEntrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuarioCriador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObjeto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObservacoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsTermo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrEdital" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrProcessoDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtFinalProposta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtInicialProposta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConviteDTO", propOrder = {
    "bFlLei123",
    "bFlObrigarDeclaracaoVendedor",
    "bFlPublicarEdital",
    "bFlRestrito",
    "bFlTermo",
    "lstConviteComissao",
    "lstConviteItemDTO",
    "lstConviteLoteDTO",
    "nCdConviteTipo",
    "nCdMoeda",
    "nCdSituacao",
    "nCdTemplate",
    "nIdAvaliacao",
    "nIdPropostaAnexo",
    "nIdPropostaMarca",
    "nIdPropostaProcedencia",
    "nIdSuperSimples",
    "nIdTipoApuracao",
    "nNrCasasDecimais",
    "nQtItensPagina",
    "sCdComprador",
    "sCdCondicaoPagamento",
    "sCdPrazoEntrega",
    "sCdUsuarioCriador",
    "sDsObjeto",
    "sDsObservacoes",
    "sDsTermo",
    "sNrEdital",
    "sNrProcessoDisplay",
    "tDtFinalProposta",
    "tDtInicialProposta"
})
public class ConviteDTO
    extends DtoBase
{

    protected int bFlLei123;
    protected Integer bFlObrigarDeclaracaoVendedor;
    protected int bFlPublicarEdital;
    protected int bFlRestrito;
    protected int bFlTermo;
    @XmlElementRef(name = "lstConviteComissao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfComissaoDTO> lstConviteComissao;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfConviteItemDTO lstConviteItemDTO;
    @XmlElementRef(name = "lstConviteLoteDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfConviteLoteDTO> lstConviteLoteDTO;
    protected int nCdConviteTipo;
    protected int nCdMoeda;
    protected int nCdSituacao;
    protected int nCdTemplate;
    protected int nIdAvaliacao;
    protected int nIdPropostaAnexo;
    protected int nIdPropostaMarca;
    protected int nIdPropostaProcedencia;
    protected int nIdSuperSimples;
    protected int nIdTipoApuracao;
    protected int nNrCasasDecimais;
    protected int nQtItensPagina;
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
    @XmlElement(required = true, nillable = true)
    protected String sNrEdital;
    @XmlElement(required = true, nillable = true)
    protected String sNrProcessoDisplay;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFinalProposta;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtInicialProposta;

    /**
     * Gets the value of the bFlLei123 property.
     * 
     */
    public int getBFlLei123() {
        return bFlLei123;
    }

    /**
     * Sets the value of the bFlLei123 property.
     * 
     */
    public void setBFlLei123(int value) {
        this.bFlLei123 = value;
    }

    /**
     * Gets the value of the bFlObrigarDeclaracaoVendedor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlObrigarDeclaracaoVendedor() {
        return bFlObrigarDeclaracaoVendedor;
    }

    /**
     * Sets the value of the bFlObrigarDeclaracaoVendedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlObrigarDeclaracaoVendedor(Integer value) {
        this.bFlObrigarDeclaracaoVendedor = value;
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
     * Gets the value of the lstConviteComissao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComissaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfComissaoDTO> getLstConviteComissao() {
        return lstConviteComissao;
    }

    /**
     * Sets the value of the lstConviteComissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComissaoDTO }{@code >}
     *     
     */
    public void setLstConviteComissao(JAXBElement<ArrayOfComissaoDTO> value) {
        this.lstConviteComissao = ((JAXBElement<ArrayOfComissaoDTO> ) value);
    }

    /**
     * Gets the value of the lstConviteItemDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConviteItemDTO }
     *     
     */
    public ArrayOfConviteItemDTO getLstConviteItemDTO() {
        return lstConviteItemDTO;
    }

    /**
     * Sets the value of the lstConviteItemDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConviteItemDTO }
     *     
     */
    public void setLstConviteItemDTO(ArrayOfConviteItemDTO value) {
        this.lstConviteItemDTO = value;
    }

    /**
     * Gets the value of the lstConviteLoteDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConviteLoteDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfConviteLoteDTO> getLstConviteLoteDTO() {
        return lstConviteLoteDTO;
    }

    /**
     * Sets the value of the lstConviteLoteDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConviteLoteDTO }{@code >}
     *     
     */
    public void setLstConviteLoteDTO(JAXBElement<ArrayOfConviteLoteDTO> value) {
        this.lstConviteLoteDTO = ((JAXBElement<ArrayOfConviteLoteDTO> ) value);
    }

    /**
     * Gets the value of the nCdConviteTipo property.
     * 
     */
    public int getNCdConviteTipo() {
        return nCdConviteTipo;
    }

    /**
     * Sets the value of the nCdConviteTipo property.
     * 
     */
    public void setNCdConviteTipo(int value) {
        this.nCdConviteTipo = value;
    }

    /**
     * Gets the value of the nCdMoeda property.
     * 
     */
    public int getNCdMoeda() {
        return nCdMoeda;
    }

    /**
     * Sets the value of the nCdMoeda property.
     * 
     */
    public void setNCdMoeda(int value) {
        this.nCdMoeda = value;
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
     * Gets the value of the nCdTemplate property.
     * 
     */
    public int getNCdTemplate() {
        return nCdTemplate;
    }

    /**
     * Sets the value of the nCdTemplate property.
     * 
     */
    public void setNCdTemplate(int value) {
        this.nCdTemplate = value;
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

}
