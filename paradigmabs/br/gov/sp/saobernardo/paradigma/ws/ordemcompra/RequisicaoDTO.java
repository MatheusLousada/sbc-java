
package br.gov.sp.saobernardo.paradigma.ws.ordemcompra;

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
 * <p>Java class for RequisicaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequisicaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlLiberaRequisicao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dQtEntrega" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlReferencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lstAnexo" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfAnexoDTO" minOccurs="0"/>
 *         &lt;element name="lstRequisicaoEmpresaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfRequisicaoEmpresaDTO" minOccurs="0"/>
 *         &lt;element name="lstRequisicaoIdioma" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfRequisicaoIdiomaDTO" minOccurs="0"/>
 *         &lt;element name="nCdAplicacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdMarca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdModalidade" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdMoeda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdOrigem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nIdTipoOrigem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nIdTipoRequisicao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="oAplicacaoDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}AplicacaoDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oContaContabilDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ContaContabilDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oCriterioDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}CriterioDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oMarcaDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}MarcaDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oNaturezaDespesaDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}NaturezaDespesaDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oUnidadeMedidaDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}UnidadeMedidaDetalheDTO" minOccurs="0"/>
 *         &lt;element name="sCdCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCobrancaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdContaContabil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresaCobrancaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaEntregaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaFaturamentoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEntregaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdFaturamentoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdFonteRecurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdGrupoCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdNaturezaDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdRequisicaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUnidadeNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUsuarioComprador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUsuarioResponsavel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsAnexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsDetalheCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsJustificativa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsObservacaoInterna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsProdutoRequisicao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtCriacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtLiberacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtMoedaCotacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtProcesso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequisicaoDTO", propOrder = {
    "bFlLiberaRequisicao",
    "dQtEntrega",
    "dVlReferencia",
    "lstAnexo",
    "lstRequisicaoEmpresaDTO",
    "lstRequisicaoIdioma",
    "nCdAplicacao",
    "nCdMarca",
    "nCdModalidade",
    "nCdMoeda",
    "nCdOrigem",
    "nCdSituacao",
    "nIdTipoOrigem",
    "nIdTipoRequisicao",
    "oAplicacaoDetalhe",
    "oContaContabilDetalhe",
    "oCriterioDetalhe",
    "oMarcaDetalhe",
    "oNaturezaDespesaDetalhe",
    "oUnidadeMedidaDetalhe",
    "sCdCentroCusto",
    "sCdClasse",
    "sCdCobrancaEndereco",
    "sCdContaContabil",
    "sCdDepartamento",
    "sCdEmpresa",
    "sCdEmpresaCobrancaEndereco",
    "sCdEmpresaEntregaEndereco",
    "sCdEmpresaFaturamentoEndereco",
    "sCdEntregaEndereco",
    "sCdFaturamentoEndereco",
    "sCdFonteRecurso",
    "sCdGrupoCompra",
    "sCdItemEmpresa",
    "sCdNaturezaDespesa",
    "sCdProduto",
    "sCdRequisicaoEmpresa",
    "sCdUnidadeMedida",
    "sCdUnidadeNegocio",
    "sCdUsuarioComprador",
    "sCdUsuarioResponsavel",
    "sDsAnexo",
    "sDsDetalheCliente",
    "sDsJustificativa",
    "sDsObservacao",
    "sDsObservacaoInterna",
    "sDsProdutoRequisicao",
    "tDtCriacao",
    "tDtEntrega",
    "tDtLiberacao",
    "tDtMoedaCotacao",
    "tDtProcesso"
})
public class RequisicaoDTO
    extends DtoBase
{

    protected Integer bFlLiberaRequisicao;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal dQtEntrega;
    @XmlElementRef(name = "dVlReferencia", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dVlReferencia;
    @XmlElementRef(name = "lstAnexo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAnexoDTO> lstAnexo;
    @XmlElementRef(name = "lstRequisicaoEmpresaDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRequisicaoEmpresaDTO> lstRequisicaoEmpresaDTO;
    @XmlElementRef(name = "lstRequisicaoIdioma", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRequisicaoIdiomaDTO> lstRequisicaoIdioma;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long nCdAplicacao;
    @XmlElementRef(name = "nCdMarca", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdMarca;
    @XmlElementRef(name = "nCdModalidade", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdModalidade;
    @XmlElementRef(name = "nCdMoeda", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdMoeda;
    protected Long nCdOrigem;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long nCdSituacao;
    protected Long nIdTipoOrigem;
    @XmlElementRef(name = "nIdTipoRequisicao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdTipoRequisicao;
    @XmlElementRef(name = "oAplicacaoDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<AplicacaoDetalheDTO> oAplicacaoDetalhe;
    @XmlElementRef(name = "oContaContabilDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ContaContabilDetalheDTO> oContaContabilDetalhe;
    @XmlElementRef(name = "oCriterioDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<CriterioDetalheDTO> oCriterioDetalhe;
    @XmlElementRef(name = "oMarcaDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<MarcaDetalheDTO> oMarcaDetalhe;
    @XmlElementRef(name = "oNaturezaDespesaDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<NaturezaDespesaDetalheDTO> oNaturezaDespesaDetalhe;
    @XmlElementRef(name = "oUnidadeMedidaDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<UnidadeMedidaDetalheDTO> oUnidadeMedidaDetalhe;
    @XmlElementRef(name = "sCdCentroCusto", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCentroCusto;
    @XmlElement(required = true, nillable = true)
    protected String sCdClasse;
    @XmlElementRef(name = "sCdCobrancaEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCobrancaEndereco;
    @XmlElementRef(name = "sCdContaContabil", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdContaContabil;
    @XmlElementRef(name = "sCdDepartamento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdDepartamento;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElementRef(name = "sCdEmpresaCobrancaEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaCobrancaEndereco;
    @XmlElementRef(name = "sCdEmpresaEntregaEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaEntregaEndereco;
    @XmlElementRef(name = "sCdEmpresaFaturamentoEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaFaturamentoEndereco;
    @XmlElementRef(name = "sCdEntregaEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEntregaEndereco;
    @XmlElementRef(name = "sCdFaturamentoEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdFaturamentoEndereco;
    @XmlElementRef(name = "sCdFonteRecurso", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdFonteRecurso;
    @XmlElementRef(name = "sCdGrupoCompra", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdGrupoCompra;
    @XmlElement(required = true, nillable = true)
    protected String sCdItemEmpresa;
    @XmlElementRef(name = "sCdNaturezaDespesa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdNaturezaDespesa;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;
    @XmlElement(required = true, nillable = true)
    protected String sCdRequisicaoEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sCdUnidadeMedida;
    @XmlElementRef(name = "sCdUnidadeNegocio", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUnidadeNegocio;
    @XmlElementRef(name = "sCdUsuarioComprador", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUsuarioComprador;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuarioResponsavel;
    @XmlElementRef(name = "sDsAnexo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsAnexo;
    @XmlElementRef(name = "sDsDetalheCliente", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsDetalheCliente;
    @XmlElement(required = true, nillable = true)
    protected String sDsJustificativa;
    @XmlElementRef(name = "sDsObservacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsObservacao;
    @XmlElementRef(name = "sDsObservacaoInterna", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsObservacaoInterna;
    @XmlElement(required = true, nillable = true)
    protected String sDsProdutoRequisicao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtCriacao;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEntrega;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtLiberacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtMoedaCotacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtProcesso;

    /**
     * Gets the value of the bFlLiberaRequisicao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlLiberaRequisicao() {
        return bFlLiberaRequisicao;
    }

    /**
     * Sets the value of the bFlLiberaRequisicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlLiberaRequisicao(Integer value) {
        this.bFlLiberaRequisicao = value;
    }

    /**
     * Gets the value of the dQtEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtEntrega() {
        return dQtEntrega;
    }

    /**
     * Sets the value of the dQtEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtEntrega(BigDecimal value) {
        this.dQtEntrega = value;
    }

    /**
     * Gets the value of the dVlReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDVlReferencia() {
        return dVlReferencia;
    }

    /**
     * Sets the value of the dVlReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDVlReferencia(JAXBElement<BigDecimal> value) {
        this.dVlReferencia = ((JAXBElement<BigDecimal> ) value);
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
     * Gets the value of the lstRequisicaoEmpresaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRequisicaoEmpresaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRequisicaoEmpresaDTO> getLstRequisicaoEmpresaDTO() {
        return lstRequisicaoEmpresaDTO;
    }

    /**
     * Sets the value of the lstRequisicaoEmpresaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRequisicaoEmpresaDTO }{@code >}
     *     
     */
    public void setLstRequisicaoEmpresaDTO(JAXBElement<ArrayOfRequisicaoEmpresaDTO> value) {
        this.lstRequisicaoEmpresaDTO = ((JAXBElement<ArrayOfRequisicaoEmpresaDTO> ) value);
    }

    /**
     * Gets the value of the lstRequisicaoIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRequisicaoIdiomaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRequisicaoIdiomaDTO> getLstRequisicaoIdioma() {
        return lstRequisicaoIdioma;
    }

    /**
     * Sets the value of the lstRequisicaoIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRequisicaoIdiomaDTO }{@code >}
     *     
     */
    public void setLstRequisicaoIdioma(JAXBElement<ArrayOfRequisicaoIdiomaDTO> value) {
        this.lstRequisicaoIdioma = ((JAXBElement<ArrayOfRequisicaoIdiomaDTO> ) value);
    }

    /**
     * Gets the value of the nCdAplicacao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdAplicacao() {
        return nCdAplicacao;
    }

    /**
     * Sets the value of the nCdAplicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdAplicacao(Long value) {
        this.nCdAplicacao = value;
    }

    /**
     * Gets the value of the nCdMarca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdMarca() {
        return nCdMarca;
    }

    /**
     * Sets the value of the nCdMarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdMarca(JAXBElement<Long> value) {
        this.nCdMarca = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the nCdModalidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdModalidade() {
        return nCdModalidade;
    }

    /**
     * Sets the value of the nCdModalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdModalidade(JAXBElement<Long> value) {
        this.nCdModalidade = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the nCdMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdMoeda() {
        return nCdMoeda;
    }

    /**
     * Sets the value of the nCdMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdMoeda(JAXBElement<Long> value) {
        this.nCdMoeda = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the nCdOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdOrigem() {
        return nCdOrigem;
    }

    /**
     * Sets the value of the nCdOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdOrigem(Long value) {
        this.nCdOrigem = value;
    }

    /**
     * Gets the value of the nCdSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdSituacao() {
        return nCdSituacao;
    }

    /**
     * Sets the value of the nCdSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdSituacao(Long value) {
        this.nCdSituacao = value;
    }

    /**
     * Gets the value of the nIdTipoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNIdTipoOrigem() {
        return nIdTipoOrigem;
    }

    /**
     * Sets the value of the nIdTipoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNIdTipoOrigem(Long value) {
        this.nIdTipoOrigem = value;
    }

    /**
     * Gets the value of the nIdTipoRequisicao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdTipoRequisicao() {
        return nIdTipoRequisicao;
    }

    /**
     * Sets the value of the nIdTipoRequisicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdTipoRequisicao(JAXBElement<Integer> value) {
        this.nIdTipoRequisicao = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the oAplicacaoDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AplicacaoDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<AplicacaoDetalheDTO> getOAplicacaoDetalhe() {
        return oAplicacaoDetalhe;
    }

    /**
     * Sets the value of the oAplicacaoDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AplicacaoDetalheDTO }{@code >}
     *     
     */
    public void setOAplicacaoDetalhe(JAXBElement<AplicacaoDetalheDTO> value) {
        this.oAplicacaoDetalhe = ((JAXBElement<AplicacaoDetalheDTO> ) value);
    }

    /**
     * Gets the value of the oContaContabilDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContaContabilDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<ContaContabilDetalheDTO> getOContaContabilDetalhe() {
        return oContaContabilDetalhe;
    }

    /**
     * Sets the value of the oContaContabilDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContaContabilDetalheDTO }{@code >}
     *     
     */
    public void setOContaContabilDetalhe(JAXBElement<ContaContabilDetalheDTO> value) {
        this.oContaContabilDetalhe = ((JAXBElement<ContaContabilDetalheDTO> ) value);
    }

    /**
     * Gets the value of the oCriterioDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CriterioDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<CriterioDetalheDTO> getOCriterioDetalhe() {
        return oCriterioDetalhe;
    }

    /**
     * Sets the value of the oCriterioDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CriterioDetalheDTO }{@code >}
     *     
     */
    public void setOCriterioDetalhe(JAXBElement<CriterioDetalheDTO> value) {
        this.oCriterioDetalhe = ((JAXBElement<CriterioDetalheDTO> ) value);
    }

    /**
     * Gets the value of the oMarcaDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MarcaDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<MarcaDetalheDTO> getOMarcaDetalhe() {
        return oMarcaDetalhe;
    }

    /**
     * Sets the value of the oMarcaDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MarcaDetalheDTO }{@code >}
     *     
     */
    public void setOMarcaDetalhe(JAXBElement<MarcaDetalheDTO> value) {
        this.oMarcaDetalhe = ((JAXBElement<MarcaDetalheDTO> ) value);
    }

    /**
     * Gets the value of the oNaturezaDespesaDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NaturezaDespesaDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<NaturezaDespesaDetalheDTO> getONaturezaDespesaDetalhe() {
        return oNaturezaDespesaDetalhe;
    }

    /**
     * Sets the value of the oNaturezaDespesaDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NaturezaDespesaDetalheDTO }{@code >}
     *     
     */
    public void setONaturezaDespesaDetalhe(JAXBElement<NaturezaDespesaDetalheDTO> value) {
        this.oNaturezaDespesaDetalhe = ((JAXBElement<NaturezaDespesaDetalheDTO> ) value);
    }

    /**
     * Gets the value of the oUnidadeMedidaDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnidadeMedidaDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<UnidadeMedidaDetalheDTO> getOUnidadeMedidaDetalhe() {
        return oUnidadeMedidaDetalhe;
    }

    /**
     * Sets the value of the oUnidadeMedidaDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnidadeMedidaDetalheDTO }{@code >}
     *     
     */
    public void setOUnidadeMedidaDetalhe(JAXBElement<UnidadeMedidaDetalheDTO> value) {
        this.oUnidadeMedidaDetalhe = ((JAXBElement<UnidadeMedidaDetalheDTO> ) value);
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
     * Gets the value of the sCdClasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdClasse() {
        return sCdClasse;
    }

    /**
     * Sets the value of the sCdClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdClasse(String value) {
        this.sCdClasse = value;
    }

    /**
     * Gets the value of the sCdCobrancaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdCobrancaEndereco() {
        return sCdCobrancaEndereco;
    }

    /**
     * Sets the value of the sCdCobrancaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdCobrancaEndereco(JAXBElement<String> value) {
        this.sCdCobrancaEndereco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdContaContabil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdContaContabil() {
        return sCdContaContabil;
    }

    /**
     * Sets the value of the sCdContaContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdContaContabil(JAXBElement<String> value) {
        this.sCdContaContabil = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdDepartamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdDepartamento() {
        return sCdDepartamento;
    }

    /**
     * Sets the value of the sCdDepartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdDepartamento(JAXBElement<String> value) {
        this.sCdDepartamento = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdEmpresaCobrancaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresaCobrancaEndereco() {
        return sCdEmpresaCobrancaEndereco;
    }

    /**
     * Sets the value of the sCdEmpresaCobrancaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresaCobrancaEndereco(JAXBElement<String> value) {
        this.sCdEmpresaCobrancaEndereco = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdItemEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdItemEmpresa() {
        return sCdItemEmpresa;
    }

    /**
     * Sets the value of the sCdItemEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdItemEmpresa(String value) {
        this.sCdItemEmpresa = value;
    }

    /**
     * Gets the value of the sCdNaturezaDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdNaturezaDespesa() {
        return sCdNaturezaDespesa;
    }

    /**
     * Sets the value of the sCdNaturezaDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdNaturezaDespesa(JAXBElement<String> value) {
        this.sCdNaturezaDespesa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdProduto() {
        return sCdProduto;
    }

    /**
     * Sets the value of the sCdProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdProduto(String value) {
        this.sCdProduto = value;
    }

    /**
     * Gets the value of the sCdRequisicaoEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdRequisicaoEmpresa() {
        return sCdRequisicaoEmpresa;
    }

    /**
     * Sets the value of the sCdRequisicaoEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdRequisicaoEmpresa(String value) {
        this.sCdRequisicaoEmpresa = value;
    }

    /**
     * Gets the value of the sCdUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUnidadeMedida() {
        return sCdUnidadeMedida;
    }

    /**
     * Sets the value of the sCdUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUnidadeMedida(String value) {
        this.sCdUnidadeMedida = value;
    }

    /**
     * Gets the value of the sCdUnidadeNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUnidadeNegocio() {
        return sCdUnidadeNegocio;
    }

    /**
     * Sets the value of the sCdUnidadeNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUnidadeNegocio(JAXBElement<String> value) {
        this.sCdUnidadeNegocio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdUsuarioComprador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUsuarioComprador() {
        return sCdUsuarioComprador;
    }

    /**
     * Sets the value of the sCdUsuarioComprador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUsuarioComprador(JAXBElement<String> value) {
        this.sCdUsuarioComprador = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdUsuarioResponsavel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUsuarioResponsavel() {
        return sCdUsuarioResponsavel;
    }

    /**
     * Sets the value of the sCdUsuarioResponsavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUsuarioResponsavel(String value) {
        this.sCdUsuarioResponsavel = value;
    }

    /**
     * Gets the value of the sDsAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsAnexo() {
        return sDsAnexo;
    }

    /**
     * Sets the value of the sDsAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsAnexo(JAXBElement<String> value) {
        this.sDsAnexo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsDetalheCliente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsDetalheCliente() {
        return sDsDetalheCliente;
    }

    /**
     * Sets the value of the sDsDetalheCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsDetalheCliente(JAXBElement<String> value) {
        this.sDsDetalheCliente = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsJustificativa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsJustificativa() {
        return sDsJustificativa;
    }

    /**
     * Sets the value of the sDsJustificativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsJustificativa(String value) {
        this.sDsJustificativa = value;
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
     * Gets the value of the sDsObservacaoInterna property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsObservacaoInterna() {
        return sDsObservacaoInterna;
    }

    /**
     * Sets the value of the sDsObservacaoInterna property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsObservacaoInterna(JAXBElement<String> value) {
        this.sDsObservacaoInterna = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsProdutoRequisicao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsProdutoRequisicao() {
        return sDsProdutoRequisicao;
    }

    /**
     * Sets the value of the sDsProdutoRequisicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsProdutoRequisicao(String value) {
        this.sDsProdutoRequisicao = value;
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
     * Gets the value of the tDtLiberacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtLiberacao() {
        return tDtLiberacao;
    }

    /**
     * Sets the value of the tDtLiberacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtLiberacao(XMLGregorianCalendar value) {
        this.tDtLiberacao = value;
    }

    /**
     * Gets the value of the tDtMoedaCotacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtMoedaCotacao() {
        return tDtMoedaCotacao;
    }

    /**
     * Sets the value of the tDtMoedaCotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtMoedaCotacao(XMLGregorianCalendar value) {
        this.tDtMoedaCotacao = value;
    }

    /**
     * Gets the value of the tDtProcesso property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtProcesso() {
        return tDtProcesso;
    }

    /**
     * Sets the value of the tDtProcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtProcesso(XMLGregorianCalendar value) {
        this.tDtProcesso = value;
    }

}
