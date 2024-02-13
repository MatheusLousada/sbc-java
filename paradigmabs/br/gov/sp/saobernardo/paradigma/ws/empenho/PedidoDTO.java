
package br.gov.sp.saobernardo.paradigma.ws.empenho;

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
 * <p>Java class for PedidoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PedidoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstAnexo" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfAnexoDTO" minOccurs="0"/>
 *         &lt;element name="lstPedidoItem" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPedidoItemDTO"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdTipo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nIdTipoOrigem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nNrVersao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdComprador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdFonteRecurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdFornecedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdFrete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdGrupoCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdPedidoERP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdPedidoWBC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdTransportadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuarioProgramador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsObservacoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsPedidoAuditoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrProjeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrRgPesquisador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtFaturamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidoDTO", propOrder = {
    "dVlTotal",
    "lstAnexo",
    "lstPedidoItem",
    "nCdSituacao",
    "nCdTipo",
    "nIdTipoOrigem",
    "nNrVersao",
    "sCdCentroCusto",
    "sCdComprador",
    "sCdCondicaoPagamento",
    "sCdFonteRecurso",
    "sCdFornecedor",
    "sCdFrete",
    "sCdGrupoCompra",
    "sCdMoeda",
    "sCdPedidoERP",
    "sCdPedidoWBC",
    "sCdTransportadora",
    "sCdUsuario",
    "sCdUsuarioProgramador",
    "sDsObservacoes",
    "sDsPedidoAuditoria",
    "sNrProjeto",
    "sNrRgPesquisador",
    "tDtCadastro",
    "tDtEmissao",
    "tDtFaturamento"
})
public class PedidoDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dVlTotal;
    @XmlElementRef(name = "lstAnexo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAnexoDTO> lstAnexo;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPedidoItemDTO lstPedidoItem;
    protected long nCdSituacao;
    protected long nCdTipo;
    protected Integer nIdTipoOrigem;
    @XmlElementRef(name = "nNrVersao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nNrVersao;
    @XmlElementRef(name = "sCdCentroCusto", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCentroCusto;
    @XmlElement(required = true, nillable = true)
    protected String sCdComprador;
    @XmlElement(required = true, nillable = true)
    protected String sCdCondicaoPagamento;
    @XmlElementRef(name = "sCdFonteRecurso", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdFonteRecurso;
    @XmlElement(required = true, nillable = true)
    protected String sCdFornecedor;
    @XmlElement(required = true, nillable = true)
    protected String sCdFrete;
    @XmlElementRef(name = "sCdGrupoCompra", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdGrupoCompra;
    @XmlElementRef(name = "sCdMoeda", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdMoeda;
    @XmlElement(required = true, nillable = true)
    protected String sCdPedidoERP;
    @XmlElementRef(name = "sCdPedidoWBC", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdPedidoWBC;
    @XmlElementRef(name = "sCdTransportadora", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdTransportadora;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuario;
    @XmlElementRef(name = "sCdUsuarioProgramador", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUsuarioProgramador;
    @XmlElementRef(name = "sDsObservacoes", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsObservacoes;
    @XmlElementRef(name = "sDsPedidoAuditoria", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsPedidoAuditoria;
    @XmlElementRef(name = "sNrProjeto", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrProjeto;
    @XmlElementRef(name = "sNrRgPesquisador", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrRgPesquisador;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtCadastro;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEmissao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFaturamento;

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
     * Gets the value of the lstAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAnexoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAnexoDTO> getLstAnexo() {
        return lstAnexo;
    }

    /**
     * Sets the value of the lstAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAnexoDTO }{@code >}
     *     
     */
    public void setLstAnexo(JAXBElement<ArrayOfAnexoDTO> value) {
        this.lstAnexo = ((JAXBElement<ArrayOfAnexoDTO> ) value);
    }

    /**
     * Gets the value of the lstPedidoItem property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPedidoItemDTO }
     *     
     */
    public ArrayOfPedidoItemDTO getLstPedidoItem() {
        return lstPedidoItem;
    }

    /**
     * Sets the value of the lstPedidoItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPedidoItemDTO }
     *     
     */
    public void setLstPedidoItem(ArrayOfPedidoItemDTO value) {
        this.lstPedidoItem = value;
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
     * Gets the value of the nCdTipo property.
     * 
     */
    public long getNCdTipo() {
        return nCdTipo;
    }

    /**
     * Sets the value of the nCdTipo property.
     * 
     */
    public void setNCdTipo(long value) {
        this.nCdTipo = value;
    }

    /**
     * Gets the value of the nIdTipoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNIdTipoOrigem() {
        return nIdTipoOrigem;
    }

    /**
     * Sets the value of the nIdTipoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNIdTipoOrigem(Integer value) {
        this.nIdTipoOrigem = value;
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
     * Gets the value of the sCdCentroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdCentroCusto() {
        return sCdCentroCusto;
    }

    /**
     * Sets the value of the sCdCentroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdCentroCusto(JAXBElement<String> value) {
        this.sCdCentroCusto = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdFonteRecurso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdFonteRecurso() {
        return sCdFonteRecurso;
    }

    /**
     * Sets the value of the sCdFonteRecurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdFonteRecurso(JAXBElement<String> value) {
        this.sCdFonteRecurso = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdGrupoCompra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdGrupoCompra() {
        return sCdGrupoCompra;
    }

    /**
     * Sets the value of the sCdGrupoCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdGrupoCompra(JAXBElement<String> value) {
        this.sCdGrupoCompra = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdPedidoERP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdPedidoERP() {
        return sCdPedidoERP;
    }

    /**
     * Sets the value of the sCdPedidoERP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdPedidoERP(String value) {
        this.sCdPedidoERP = value;
    }

    /**
     * Gets the value of the sCdPedidoWBC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdPedidoWBC() {
        return sCdPedidoWBC;
    }

    /**
     * Sets the value of the sCdPedidoWBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdPedidoWBC(JAXBElement<String> value) {
        this.sCdPedidoWBC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdTransportadora property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdTransportadora() {
        return sCdTransportadora;
    }

    /**
     * Sets the value of the sCdTransportadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdTransportadora(JAXBElement<String> value) {
        this.sCdTransportadora = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdUsuarioProgramador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUsuarioProgramador() {
        return sCdUsuarioProgramador;
    }

    /**
     * Sets the value of the sCdUsuarioProgramador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUsuarioProgramador(JAXBElement<String> value) {
        this.sCdUsuarioProgramador = ((JAXBElement<String> ) value);
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
     * Gets the value of the sDsPedidoAuditoria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsPedidoAuditoria() {
        return sDsPedidoAuditoria;
    }

    /**
     * Sets the value of the sDsPedidoAuditoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsPedidoAuditoria(JAXBElement<String> value) {
        this.sDsPedidoAuditoria = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrProjeto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrProjeto() {
        return sNrProjeto;
    }

    /**
     * Sets the value of the sNrProjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrProjeto(JAXBElement<String> value) {
        this.sNrProjeto = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrRgPesquisador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrRgPesquisador() {
        return sNrRgPesquisador;
    }

    /**
     * Sets the value of the sNrRgPesquisador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrRgPesquisador(JAXBElement<String> value) {
        this.sNrRgPesquisador = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtCadastro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtCadastro() {
        return tDtCadastro;
    }

    /**
     * Sets the value of the tDtCadastro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtCadastro(XMLGregorianCalendar value) {
        this.tDtCadastro = value;
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
     * Gets the value of the tDtFaturamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtFaturamento() {
        return tDtFaturamento;
    }

    /**
     * Sets the value of the tDtFaturamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtFaturamento(XMLGregorianCalendar value) {
        this.tDtFaturamento = value;
    }

}
