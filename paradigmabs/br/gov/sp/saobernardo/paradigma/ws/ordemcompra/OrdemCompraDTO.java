
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
 * <p>Java class for OrdemCompraDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdemCompraDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlLiberaRequisicao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dVlTotalEstimado" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstOrdemCompraItem" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfOrdemCompraItemDTO" minOccurs="0"/>
 *         &lt;element name="nCdAplicacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdClassificacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdCriterioPlanejamento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdModalidade" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdOrdemCompra" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdPrioridade" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdTipoOrdemCompra" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="oAlmoxarifadoDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}AlmoxarifadoDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oAplicacaoDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}AplicacaoDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oCentroCustoDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}CentroCustoDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oDepartamentoDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}DepartamentoDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oEmpresaDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EmpresaDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oEnderecoCobrancaDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EnderecoDTO" minOccurs="0"/>
 *         &lt;element name="oEnderecoEntregaDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EnderecoDTO" minOccurs="0"/>
 *         &lt;element name="oEnderecoFaturamentoDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EnderecoDTO" minOccurs="0"/>
 *         &lt;element name="oPrioridadeDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}PrioridadeDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oUsuarioCompradorDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}UsuarioDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oUsuarioResponsavelDetalhe" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}UsuarioDetalheDTO" minOccurs="0"/>
 *         &lt;element name="sCdAlmoxarifado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdCobrancaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdContaContabil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresaCobrancaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaEntregaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaFaturamentoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEntregaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdFaturamentoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdGestao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdOrdemCompraEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuarioComprador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUsuarioResponsavel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsJustificativa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsOrdemCompra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdemCompraDTO", propOrder = {
    "bFlLiberaRequisicao",
    "dVlTotalEstimado",
    "lstOrdemCompraItem",
    "nCdAplicacao",
    "nCdClassificacao",
    "nCdCriterioPlanejamento",
    "nCdModalidade",
    "nCdOrdemCompra",
    "nCdPrioridade",
    "nCdSituacao",
    "nCdTipoOrdemCompra",
    "oAlmoxarifadoDetalhe",
    "oAplicacaoDetalhe",
    "oCentroCustoDetalhe",
    "oDepartamentoDetalhe",
    "oEmpresaDetalhe",
    "oEnderecoCobrancaDetalhe",
    "oEnderecoEntregaDetalhe",
    "oEnderecoFaturamentoDetalhe",
    "oPrioridadeDetalhe",
    "oUsuarioCompradorDetalhe",
    "oUsuarioResponsavelDetalhe",
    "sCdAlmoxarifado",
    "sCdCentroCusto",
    "sCdCobrancaEndereco",
    "sCdContaContabil",
    "sCdDepartamento",
    "sCdEmpresa",
    "sCdEmpresaCobrancaEndereco",
    "sCdEmpresaEntregaEndereco",
    "sCdEmpresaFaturamentoEndereco",
    "sCdEntregaEndereco",
    "sCdFaturamentoEndereco",
    "sCdGestao",
    "sCdOrdemCompraEmpresa",
    "sCdUsuarioComprador",
    "sCdUsuarioResponsavel",
    "sDsJustificativa",
    "sDsOrdemCompra",
    "tDtCadastro",
    "tDtEmissao"
})
public class OrdemCompraDTO
    extends DtoBase
{

    @XmlElementRef(name = "bFlLiberaRequisicao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> bFlLiberaRequisicao;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal dVlTotalEstimado;
    @XmlElementRef(name = "lstOrdemCompraItem", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrdemCompraItemDTO> lstOrdemCompraItem;
    protected long nCdAplicacao;
    @XmlElementRef(name = "nCdClassificacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdClassificacao;
    @XmlElementRef(name = "nCdCriterioPlanejamento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdCriterioPlanejamento;
    @XmlElementRef(name = "nCdModalidade", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdModalidade;
    protected Long nCdOrdemCompra;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long nCdPrioridade;
    protected long nCdSituacao;
    protected long nCdTipoOrdemCompra;
    @XmlElementRef(name = "oAlmoxarifadoDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<AlmoxarifadoDetalheDTO> oAlmoxarifadoDetalhe;
    @XmlElementRef(name = "oAplicacaoDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<AplicacaoDetalheDTO> oAplicacaoDetalhe;
    @XmlElementRef(name = "oCentroCustoDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<CentroCustoDetalheDTO> oCentroCustoDetalhe;
    @XmlElementRef(name = "oDepartamentoDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<DepartamentoDetalheDTO> oDepartamentoDetalhe;
    @XmlElementRef(name = "oEmpresaDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<EmpresaDetalheDTO> oEmpresaDetalhe;
    @XmlElementRef(name = "oEnderecoCobrancaDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<EnderecoDTO> oEnderecoCobrancaDetalhe;
    @XmlElementRef(name = "oEnderecoEntregaDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<EnderecoDTO> oEnderecoEntregaDetalhe;
    @XmlElementRef(name = "oEnderecoFaturamentoDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<EnderecoDTO> oEnderecoFaturamentoDetalhe;
    @XmlElementRef(name = "oPrioridadeDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<PrioridadeDetalheDTO> oPrioridadeDetalhe;
    @XmlElementRef(name = "oUsuarioCompradorDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<UsuarioDetalheDTO> oUsuarioCompradorDetalhe;
    @XmlElementRef(name = "oUsuarioResponsavelDetalhe", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<UsuarioDetalheDTO> oUsuarioResponsavelDetalhe;
    @XmlElementRef(name = "sCdAlmoxarifado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdAlmoxarifado;
    @XmlElementRef(name = "sCdCentroCusto", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCentroCusto;
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
    @XmlElementRef(name = "sCdGestao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdGestao;
    @XmlElement(required = true, nillable = true)
    protected String sCdOrdemCompraEmpresa;
    @XmlElementRef(name = "sCdUsuarioComprador", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUsuarioComprador;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuarioResponsavel;
    @XmlElement(required = true, nillable = true)
    protected String sDsJustificativa;
    @XmlElement(required = true, nillable = true)
    protected String sDsOrdemCompra;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtCadastro;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEmissao;

    /**
     * Gets the value of the bFlLiberaRequisicao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBFlLiberaRequisicao() {
        return bFlLiberaRequisicao;
    }

    /**
     * Sets the value of the bFlLiberaRequisicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBFlLiberaRequisicao(JAXBElement<Long> value) {
        this.bFlLiberaRequisicao = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the dVlTotalEstimado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlTotalEstimado() {
        return dVlTotalEstimado;
    }

    /**
     * Sets the value of the dVlTotalEstimado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlTotalEstimado(BigDecimal value) {
        this.dVlTotalEstimado = value;
    }

    /**
     * Gets the value of the lstOrdemCompraItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrdemCompraItemDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrdemCompraItemDTO> getLstOrdemCompraItem() {
        return lstOrdemCompraItem;
    }

    /**
     * Sets the value of the lstOrdemCompraItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrdemCompraItemDTO }{@code >}
     *     
     */
    public void setLstOrdemCompraItem(JAXBElement<ArrayOfOrdemCompraItemDTO> value) {
        this.lstOrdemCompraItem = ((JAXBElement<ArrayOfOrdemCompraItemDTO> ) value);
    }

    /**
     * Gets the value of the nCdAplicacao property.
     * 
     */
    public long getNCdAplicacao() {
        return nCdAplicacao;
    }

    /**
     * Sets the value of the nCdAplicacao property.
     * 
     */
    public void setNCdAplicacao(long value) {
        this.nCdAplicacao = value;
    }

    /**
     * Gets the value of the nCdClassificacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdClassificacao() {
        return nCdClassificacao;
    }

    /**
     * Sets the value of the nCdClassificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdClassificacao(JAXBElement<Long> value) {
        this.nCdClassificacao = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the nCdCriterioPlanejamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdCriterioPlanejamento() {
        return nCdCriterioPlanejamento;
    }

    /**
     * Sets the value of the nCdCriterioPlanejamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdCriterioPlanejamento(JAXBElement<Long> value) {
        this.nCdCriterioPlanejamento = ((JAXBElement<Long> ) value);
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
     * Gets the value of the nCdOrdemCompra property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdOrdemCompra() {
        return nCdOrdemCompra;
    }

    /**
     * Sets the value of the nCdOrdemCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdOrdemCompra(Long value) {
        this.nCdOrdemCompra = value;
    }

    /**
     * Gets the value of the nCdPrioridade property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdPrioridade() {
        return nCdPrioridade;
    }

    /**
     * Sets the value of the nCdPrioridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdPrioridade(Long value) {
        this.nCdPrioridade = value;
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
     * Gets the value of the nCdTipoOrdemCompra property.
     * 
     */
    public long getNCdTipoOrdemCompra() {
        return nCdTipoOrdemCompra;
    }

    /**
     * Sets the value of the nCdTipoOrdemCompra property.
     * 
     */
    public void setNCdTipoOrdemCompra(long value) {
        this.nCdTipoOrdemCompra = value;
    }

    /**
     * Gets the value of the oAlmoxarifadoDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlmoxarifadoDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<AlmoxarifadoDetalheDTO> getOAlmoxarifadoDetalhe() {
        return oAlmoxarifadoDetalhe;
    }

    /**
     * Sets the value of the oAlmoxarifadoDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlmoxarifadoDetalheDTO }{@code >}
     *     
     */
    public void setOAlmoxarifadoDetalhe(JAXBElement<AlmoxarifadoDetalheDTO> value) {
        this.oAlmoxarifadoDetalhe = ((JAXBElement<AlmoxarifadoDetalheDTO> ) value);
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
     * Gets the value of the oCentroCustoDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CentroCustoDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<CentroCustoDetalheDTO> getOCentroCustoDetalhe() {
        return oCentroCustoDetalhe;
    }

    /**
     * Sets the value of the oCentroCustoDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CentroCustoDetalheDTO }{@code >}
     *     
     */
    public void setOCentroCustoDetalhe(JAXBElement<CentroCustoDetalheDTO> value) {
        this.oCentroCustoDetalhe = ((JAXBElement<CentroCustoDetalheDTO> ) value);
    }

    /**
     * Gets the value of the oDepartamentoDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DepartamentoDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<DepartamentoDetalheDTO> getODepartamentoDetalhe() {
        return oDepartamentoDetalhe;
    }

    /**
     * Sets the value of the oDepartamentoDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DepartamentoDetalheDTO }{@code >}
     *     
     */
    public void setODepartamentoDetalhe(JAXBElement<DepartamentoDetalheDTO> value) {
        this.oDepartamentoDetalhe = ((JAXBElement<DepartamentoDetalheDTO> ) value);
    }

    /**
     * Gets the value of the oEmpresaDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmpresaDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<EmpresaDetalheDTO> getOEmpresaDetalhe() {
        return oEmpresaDetalhe;
    }

    /**
     * Sets the value of the oEmpresaDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmpresaDetalheDTO }{@code >}
     *     
     */
    public void setOEmpresaDetalhe(JAXBElement<EmpresaDetalheDTO> value) {
        this.oEmpresaDetalhe = ((JAXBElement<EmpresaDetalheDTO> ) value);
    }

    /**
     * Gets the value of the oEnderecoCobrancaDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}
     *     
     */
    public JAXBElement<EnderecoDTO> getOEnderecoCobrancaDetalhe() {
        return oEnderecoCobrancaDetalhe;
    }

    /**
     * Sets the value of the oEnderecoCobrancaDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}
     *     
     */
    public void setOEnderecoCobrancaDetalhe(JAXBElement<EnderecoDTO> value) {
        this.oEnderecoCobrancaDetalhe = ((JAXBElement<EnderecoDTO> ) value);
    }

    /**
     * Gets the value of the oEnderecoEntregaDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}
     *     
     */
    public JAXBElement<EnderecoDTO> getOEnderecoEntregaDetalhe() {
        return oEnderecoEntregaDetalhe;
    }

    /**
     * Sets the value of the oEnderecoEntregaDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}
     *     
     */
    public void setOEnderecoEntregaDetalhe(JAXBElement<EnderecoDTO> value) {
        this.oEnderecoEntregaDetalhe = ((JAXBElement<EnderecoDTO> ) value);
    }

    /**
     * Gets the value of the oEnderecoFaturamentoDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}
     *     
     */
    public JAXBElement<EnderecoDTO> getOEnderecoFaturamentoDetalhe() {
        return oEnderecoFaturamentoDetalhe;
    }

    /**
     * Sets the value of the oEnderecoFaturamentoDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}
     *     
     */
    public void setOEnderecoFaturamentoDetalhe(JAXBElement<EnderecoDTO> value) {
        this.oEnderecoFaturamentoDetalhe = ((JAXBElement<EnderecoDTO> ) value);
    }

    /**
     * Gets the value of the oPrioridadeDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrioridadeDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<PrioridadeDetalheDTO> getOPrioridadeDetalhe() {
        return oPrioridadeDetalhe;
    }

    /**
     * Sets the value of the oPrioridadeDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrioridadeDetalheDTO }{@code >}
     *     
     */
    public void setOPrioridadeDetalhe(JAXBElement<PrioridadeDetalheDTO> value) {
        this.oPrioridadeDetalhe = ((JAXBElement<PrioridadeDetalheDTO> ) value);
    }

    /**
     * Gets the value of the oUsuarioCompradorDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UsuarioDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<UsuarioDetalheDTO> getOUsuarioCompradorDetalhe() {
        return oUsuarioCompradorDetalhe;
    }

    /**
     * Sets the value of the oUsuarioCompradorDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UsuarioDetalheDTO }{@code >}
     *     
     */
    public void setOUsuarioCompradorDetalhe(JAXBElement<UsuarioDetalheDTO> value) {
        this.oUsuarioCompradorDetalhe = ((JAXBElement<UsuarioDetalheDTO> ) value);
    }

    /**
     * Gets the value of the oUsuarioResponsavelDetalhe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UsuarioDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<UsuarioDetalheDTO> getOUsuarioResponsavelDetalhe() {
        return oUsuarioResponsavelDetalhe;
    }

    /**
     * Sets the value of the oUsuarioResponsavelDetalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UsuarioDetalheDTO }{@code >}
     *     
     */
    public void setOUsuarioResponsavelDetalhe(JAXBElement<UsuarioDetalheDTO> value) {
        this.oUsuarioResponsavelDetalhe = ((JAXBElement<UsuarioDetalheDTO> ) value);
    }

    /**
     * Gets the value of the sCdAlmoxarifado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdAlmoxarifado() {
        return sCdAlmoxarifado;
    }

    /**
     * Sets the value of the sCdAlmoxarifado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdAlmoxarifado(JAXBElement<String> value) {
        this.sCdAlmoxarifado = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdGestao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdGestao() {
        return sCdGestao;
    }

    /**
     * Sets the value of the sCdGestao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdGestao(JAXBElement<String> value) {
        this.sCdGestao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdOrdemCompraEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdOrdemCompraEmpresa() {
        return sCdOrdemCompraEmpresa;
    }

    /**
     * Sets the value of the sCdOrdemCompraEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdOrdemCompraEmpresa(String value) {
        this.sCdOrdemCompraEmpresa = value;
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
     * Gets the value of the sDsOrdemCompra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsOrdemCompra() {
        return sDsOrdemCompra;
    }

    /**
     * Sets the value of the sDsOrdemCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsOrdemCompra(String value) {
        this.sDsOrdemCompra = value;
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

}
