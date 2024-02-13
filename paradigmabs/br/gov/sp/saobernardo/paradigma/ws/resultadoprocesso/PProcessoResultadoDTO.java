
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PProcessoResultadoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PProcessoResultadoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlAplicaLei123" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlChatBilateral" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlExigeCapacitacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlMostraReferencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlObrigarDeclaracaoVendedor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlPublicarEdital" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlRequerCRC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlRestrito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlTermo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lstPPProcessoOrdemCompra" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoOrdemCompraDTO" minOccurs="0"/>
 *         &lt;element name="lstPProcessoAnexo" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoAnexoDTO" minOccurs="0"/>
 *         &lt;element name="lstPProcessoConvidado" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoConvidadoDTO"/>
 *         &lt;element name="lstPProcessoItem" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoItemDTO"/>
 *         &lt;element name="lstPProcessoLote" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoLoteDTO" minOccurs="0"/>
 *         &lt;element name="lstPProcessoResultadoIdioma" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoResultadoIdiomaDTO" minOccurs="0"/>
 *         &lt;element name="nCdCriterio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdModalidadeCompraDireta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdModalidadePregaoPresencial" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdModulo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nCdMoeda" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdOrigem" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdPregaoTipo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdTemplate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdTipoProcesso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdAutoEncerramento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdMarca" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdModalidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdModelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdProcedencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdSuperSimples" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nIdTipoApuracao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nNrCasasDecimais" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nVlProrroga" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nVlProrrogaCondicao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nVlTempoDisputa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdComprador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdPrazoEntrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuarioCriador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObjeto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObservacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsTermo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrEdital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrProcessoDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtInicialDisputa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "PProcessoResultadoDTO", propOrder = {
    "bFlAplicaLei123",
    "bFlChatBilateral",
    "bFlExigeCapacitacao",
    "bFlMostraReferencia",
    "bFlObrigarDeclaracaoVendedor",
    "bFlPublicarEdital",
    "bFlRequerCRC",
    "bFlRestrito",
    "bFlTermo",
    "lstPPProcessoOrdemCompra",
    "lstPProcessoAnexo",
    "lstPProcessoConvidado",
    "lstPProcessoItem",
    "lstPProcessoLote",
    "lstPProcessoResultadoIdioma",
    "nCdCriterio",
    "nCdModalidadeCompraDireta",
    "nCdModalidadePregaoPresencial",
    "nCdModulo",
    "nCdMoeda",
    "nCdOrigem",
    "nCdPregaoTipo",
    "nCdSituacao",
    "nCdTemplate",
    "nCdTipoProcesso",
    "nIdAutoEncerramento",
    "nIdMarca",
    "nIdModalidade",
    "nIdModelo",
    "nIdProcedencia",
    "nIdSuperSimples",
    "nIdTipoApuracao",
    "nNrCasasDecimais",
    "nVlProrroga",
    "nVlProrrogaCondicao",
    "nVlTempoDisputa",
    "sCdComprador",
    "sCdCondicaoPagamento",
    "sCdPrazoEntrega",
    "sCdUsuarioCriador",
    "sDsObjeto",
    "sDsObservacao",
    "sDsTermo",
    "sNrEdital",
    "sNrProcessoDisplay",
    "tDtFinal",
    "tDtInicial",
    "tDtInicialDisputa",
    "tDtPublicacao"
})
public class PProcessoResultadoDTO
    extends DtoBase
{

    @XmlElementRef(name = "bFlAplicaLei123", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlAplicaLei123;
    @XmlElementRef(name = "bFlChatBilateral", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlChatBilateral;
    @XmlElementRef(name = "bFlExigeCapacitacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlExigeCapacitacao;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer bFlMostraReferencia;
    @XmlElementRef(name = "bFlObrigarDeclaracaoVendedor", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlObrigarDeclaracaoVendedor;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer bFlPublicarEdital;
    @XmlElementRef(name = "bFlRequerCRC", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlRequerCRC;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer bFlRestrito;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer bFlTermo;
    @XmlElementRef(name = "lstPPProcessoOrdemCompra", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPProcessoOrdemCompraDTO> lstPPProcessoOrdemCompra;
    @XmlElementRef(name = "lstPProcessoAnexo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPProcessoAnexoDTO> lstPProcessoAnexo;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPProcessoConvidadoDTO lstPProcessoConvidado;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPProcessoItemDTO lstPProcessoItem;
    @XmlElementRef(name = "lstPProcessoLote", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPProcessoLoteDTO> lstPProcessoLote;
    @XmlElementRef(name = "lstPProcessoResultadoIdioma", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPProcessoResultadoIdiomaDTO> lstPProcessoResultadoIdioma;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long nCdCriterio;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long nCdModalidadeCompraDireta;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long nCdModalidadePregaoPresencial;
    protected int nCdModulo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long nCdMoeda;
    protected long nCdOrigem;
    @XmlElementRef(name = "nCdPregaoTipo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nCdPregaoTipo;
    protected long nCdSituacao;
    protected long nCdTemplate;
    @XmlElementRef(name = "nCdTipoProcesso", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nCdTipoProcesso;
    @XmlElementRef(name = "nIdAutoEncerramento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdAutoEncerramento;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nIdMarca;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nIdModalidade;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nIdModelo;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nIdProcedencia;
    @XmlElementRef(name = "nIdSuperSimples", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdSuperSimples;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nIdTipoApuracao;
    protected int nNrCasasDecimais;
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
    protected String sCdPrazoEntrega;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuarioCriador;
    @XmlElement(required = true, nillable = true)
    protected String sDsObjeto;
    @XmlElement(required = true, nillable = true)
    protected String sDsObservacao;
    @XmlElement(required = true, nillable = true)
    protected String sDsTermo;
    @XmlElementRef(name = "sNrEdital", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrEdital;
    @XmlElement(required = true, nillable = true)
    protected String sNrProcessoDisplay;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFinal;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtInicial;
    @XmlElementRef(name = "tDtInicialDisputa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtInicialDisputa;
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
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlChatBilateral() {
        return bFlChatBilateral;
    }

    /**
     * Sets the value of the bFlChatBilateral property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlChatBilateral(JAXBElement<Integer> value) {
        this.bFlChatBilateral = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bFlExigeCapacitacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlExigeCapacitacao() {
        return bFlExigeCapacitacao;
    }

    /**
     * Sets the value of the bFlExigeCapacitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlExigeCapacitacao(JAXBElement<Integer> value) {
        this.bFlExigeCapacitacao = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bFlMostraReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlMostraReferencia() {
        return bFlMostraReferencia;
    }

    /**
     * Sets the value of the bFlMostraReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlMostraReferencia(Integer value) {
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
     * Gets the value of the bFlPublicarEdital property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlPublicarEdital() {
        return bFlPublicarEdital;
    }

    /**
     * Sets the value of the bFlPublicarEdital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlPublicarEdital(Integer value) {
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
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlRestrito() {
        return bFlRestrito;
    }

    /**
     * Sets the value of the bFlRestrito property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlRestrito(Integer value) {
        this.bFlRestrito = value;
    }

    /**
     * Gets the value of the bFlTermo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlTermo() {
        return bFlTermo;
    }

    /**
     * Sets the value of the bFlTermo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlTermo(Integer value) {
        this.bFlTermo = value;
    }

    /**
     * Gets the value of the lstPPProcessoOrdemCompra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoOrdemCompraDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPProcessoOrdemCompraDTO> getLstPPProcessoOrdemCompra() {
        return lstPPProcessoOrdemCompra;
    }

    /**
     * Sets the value of the lstPPProcessoOrdemCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoOrdemCompraDTO }{@code >}
     *     
     */
    public void setLstPPProcessoOrdemCompra(JAXBElement<ArrayOfPProcessoOrdemCompraDTO> value) {
        this.lstPPProcessoOrdemCompra = ((JAXBElement<ArrayOfPProcessoOrdemCompraDTO> ) value);
    }

    /**
     * Gets the value of the lstPProcessoAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoAnexoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPProcessoAnexoDTO> getLstPProcessoAnexo() {
        return lstPProcessoAnexo;
    }

    /**
     * Sets the value of the lstPProcessoAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoAnexoDTO }{@code >}
     *     
     */
    public void setLstPProcessoAnexo(JAXBElement<ArrayOfPProcessoAnexoDTO> value) {
        this.lstPProcessoAnexo = ((JAXBElement<ArrayOfPProcessoAnexoDTO> ) value);
    }

    /**
     * Gets the value of the lstPProcessoConvidado property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPProcessoConvidadoDTO }
     *     
     */
    public ArrayOfPProcessoConvidadoDTO getLstPProcessoConvidado() {
        return lstPProcessoConvidado;
    }

    /**
     * Sets the value of the lstPProcessoConvidado property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPProcessoConvidadoDTO }
     *     
     */
    public void setLstPProcessoConvidado(ArrayOfPProcessoConvidadoDTO value) {
        this.lstPProcessoConvidado = value;
    }

    /**
     * Gets the value of the lstPProcessoItem property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPProcessoItemDTO }
     *     
     */
    public ArrayOfPProcessoItemDTO getLstPProcessoItem() {
        return lstPProcessoItem;
    }

    /**
     * Sets the value of the lstPProcessoItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPProcessoItemDTO }
     *     
     */
    public void setLstPProcessoItem(ArrayOfPProcessoItemDTO value) {
        this.lstPProcessoItem = value;
    }

    /**
     * Gets the value of the lstPProcessoLote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLoteDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPProcessoLoteDTO> getLstPProcessoLote() {
        return lstPProcessoLote;
    }

    /**
     * Sets the value of the lstPProcessoLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLoteDTO }{@code >}
     *     
     */
    public void setLstPProcessoLote(JAXBElement<ArrayOfPProcessoLoteDTO> value) {
        this.lstPProcessoLote = ((JAXBElement<ArrayOfPProcessoLoteDTO> ) value);
    }

    /**
     * Gets the value of the lstPProcessoResultadoIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoResultadoIdiomaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPProcessoResultadoIdiomaDTO> getLstPProcessoResultadoIdioma() {
        return lstPProcessoResultadoIdioma;
    }

    /**
     * Sets the value of the lstPProcessoResultadoIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoResultadoIdiomaDTO }{@code >}
     *     
     */
    public void setLstPProcessoResultadoIdioma(JAXBElement<ArrayOfPProcessoResultadoIdiomaDTO> value) {
        this.lstPProcessoResultadoIdioma = ((JAXBElement<ArrayOfPProcessoResultadoIdiomaDTO> ) value);
    }

    /**
     * Gets the value of the nCdCriterio property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdCriterio() {
        return nCdCriterio;
    }

    /**
     * Sets the value of the nCdCriterio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdCriterio(Long value) {
        this.nCdCriterio = value;
    }

    /**
     * Gets the value of the nCdModalidadeCompraDireta property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdModalidadeCompraDireta() {
        return nCdModalidadeCompraDireta;
    }

    /**
     * Sets the value of the nCdModalidadeCompraDireta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdModalidadeCompraDireta(Long value) {
        this.nCdModalidadeCompraDireta = value;
    }

    /**
     * Gets the value of the nCdModalidadePregaoPresencial property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdModalidadePregaoPresencial() {
        return nCdModalidadePregaoPresencial;
    }

    /**
     * Sets the value of the nCdModalidadePregaoPresencial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdModalidadePregaoPresencial(Long value) {
        this.nCdModalidadePregaoPresencial = value;
    }

    /**
     * Gets the value of the nCdModulo property.
     * 
     */
    public int getNCdModulo() {
        return nCdModulo;
    }

    /**
     * Sets the value of the nCdModulo property.
     * 
     */
    public void setNCdModulo(int value) {
        this.nCdModulo = value;
    }

    /**
     * Gets the value of the nCdMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdMoeda() {
        return nCdMoeda;
    }

    /**
     * Sets the value of the nCdMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdMoeda(Long value) {
        this.nCdMoeda = value;
    }

    /**
     * Gets the value of the nCdOrigem property.
     * 
     */
    public long getNCdOrigem() {
        return nCdOrigem;
    }

    /**
     * Sets the value of the nCdOrigem property.
     * 
     */
    public void setNCdOrigem(long value) {
        this.nCdOrigem = value;
    }

    /**
     * Gets the value of the nCdPregaoTipo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNCdPregaoTipo() {
        return nCdPregaoTipo;
    }

    /**
     * Sets the value of the nCdPregaoTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNCdPregaoTipo(JAXBElement<Integer> value) {
        this.nCdPregaoTipo = ((JAXBElement<Integer> ) value);
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
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNCdTipoProcesso() {
        return nCdTipoProcesso;
    }

    /**
     * Sets the value of the nCdTipoProcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNCdTipoProcesso(JAXBElement<Integer> value) {
        this.nCdTipoProcesso = ((JAXBElement<Integer> ) value);
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
     * Gets the value of the nIdMarca property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNIdMarca() {
        return nIdMarca;
    }

    /**
     * Sets the value of the nIdMarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNIdMarca(Integer value) {
        this.nIdMarca = value;
    }

    /**
     * Gets the value of the nIdModalidade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNIdModalidade() {
        return nIdModalidade;
    }

    /**
     * Sets the value of the nIdModalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNIdModalidade(Integer value) {
        this.nIdModalidade = value;
    }

    /**
     * Gets the value of the nIdModelo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNIdModelo() {
        return nIdModelo;
    }

    /**
     * Sets the value of the nIdModelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNIdModelo(Integer value) {
        this.nIdModelo = value;
    }

    /**
     * Gets the value of the nIdProcedencia property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNIdProcedencia() {
        return nIdProcedencia;
    }

    /**
     * Sets the value of the nIdProcedencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNIdProcedencia(Integer value) {
        this.nIdProcedencia = value;
    }

    /**
     * Gets the value of the nIdSuperSimples property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdSuperSimples() {
        return nIdSuperSimples;
    }

    /**
     * Sets the value of the nIdSuperSimples property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdSuperSimples(JAXBElement<Integer> value) {
        this.nIdSuperSimples = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nIdTipoApuracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNIdTipoApuracao() {
        return nIdTipoApuracao;
    }

    /**
     * Sets the value of the nIdTipoApuracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNIdTipoApuracao(Integer value) {
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
     *     {@link String }
     *     
     */
    public String getSDsTermo() {
        return sDsTermo;
    }

    /**
     * Sets the value of the sDsTermo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsTermo(String value) {
        this.sDsTermo = value;
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
     * Gets the value of the tDtInicialDisputa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTDtInicialDisputa() {
        return tDtInicialDisputa;
    }

    /**
     * Sets the value of the tDtInicialDisputa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTDtInicialDisputa(JAXBElement<XMLGregorianCalendar> value) {
        this.tDtInicialDisputa = ((JAXBElement<XMLGregorianCalendar> ) value);
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
