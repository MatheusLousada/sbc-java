
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
 * <p>Java class for PedidoItemEntregaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PedidoItemEntregaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtEntrega" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dQtItemRealizado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dQtPorUnidade" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dQtUnidade" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nQtDiasEntrega" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="oCobrancaEndereco" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EnderecoDTO" minOccurs="0"/>
 *         &lt;element name="oEntregaEndereco" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EnderecoDTO" minOccurs="0"/>
 *         &lt;element name="oFaturamentoEndereco" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EnderecoDTO" minOccurs="0"/>
 *         &lt;element name="sCdAlmoxarifado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdAlmoxarifadoDoca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdCentroCustoRequisicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdCobrancaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaCobrancaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaEntregaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaFaturamentoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEntregaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdFaturamentoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemEntregaEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemRequisicaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdRequisicaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUnidadeFornecimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtColeta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidoItemEntregaDTO", propOrder = {
    "dQtEntrega",
    "dQtItemRealizado",
    "dQtPorUnidade",
    "dQtUnidade",
    "nQtDiasEntrega",
    "oCobrancaEndereco",
    "oEntregaEndereco",
    "oFaturamentoEndereco",
    "sCdAlmoxarifado",
    "sCdAlmoxarifadoDoca",
    "sCdCentroCustoRequisicao",
    "sCdCobrancaEndereco",
    "sCdEmpresaCobrancaEndereco",
    "sCdEmpresaEntregaEndereco",
    "sCdEmpresaFaturamentoEndereco",
    "sCdEntregaEndereco",
    "sCdFaturamentoEndereco",
    "sCdItemEntregaEmpresa",
    "sCdItemRequisicaoEmpresa",
    "sCdRequisicaoEmpresa",
    "sCdUnidadeFornecimento",
    "tDtColeta",
    "tDtEntrega"
})
public class PedidoItemEntregaDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dQtEntrega;
    @XmlElementRef(name = "dQtItemRealizado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dQtItemRealizado;
    @XmlElementRef(name = "dQtPorUnidade", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dQtPorUnidade;
    @XmlElementRef(name = "dQtUnidade", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dQtUnidade;
    protected BigDecimal nQtDiasEntrega;
    @XmlElementRef(name = "oCobrancaEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<EnderecoDTO> oCobrancaEndereco;
    @XmlElementRef(name = "oEntregaEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<EnderecoDTO> oEntregaEndereco;
    @XmlElementRef(name = "oFaturamentoEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<EnderecoDTO> oFaturamentoEndereco;
    @XmlElementRef(name = "sCdAlmoxarifado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdAlmoxarifado;
    @XmlElementRef(name = "sCdAlmoxarifadoDoca", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdAlmoxarifadoDoca;
    @XmlElementRef(name = "sCdCentroCustoRequisicao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCentroCustoRequisicao;
    @XmlElementRef(name = "sCdCobrancaEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCobrancaEndereco;
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
    @XmlElementRef(name = "sCdItemEntregaEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemEntregaEmpresa;
    @XmlElementRef(name = "sCdItemRequisicaoEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemRequisicaoEmpresa;
    @XmlElementRef(name = "sCdRequisicaoEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdRequisicaoEmpresa;
    @XmlElementRef(name = "sCdUnidadeFornecimento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUnidadeFornecimento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtColeta;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEntrega;

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
     * Gets the value of the dQtItemRealizado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDQtItemRealizado() {
        return dQtItemRealizado;
    }

    /**
     * Sets the value of the dQtItemRealizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDQtItemRealizado(JAXBElement<BigDecimal> value) {
        this.dQtItemRealizado = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dQtPorUnidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDQtPorUnidade() {
        return dQtPorUnidade;
    }

    /**
     * Sets the value of the dQtPorUnidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDQtPorUnidade(JAXBElement<BigDecimal> value) {
        this.dQtPorUnidade = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dQtUnidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDQtUnidade() {
        return dQtUnidade;
    }

    /**
     * Sets the value of the dQtUnidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDQtUnidade(JAXBElement<BigDecimal> value) {
        this.dQtUnidade = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the nQtDiasEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNQtDiasEntrega() {
        return nQtDiasEntrega;
    }

    /**
     * Sets the value of the nQtDiasEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNQtDiasEntrega(BigDecimal value) {
        this.nQtDiasEntrega = value;
    }

    /**
     * Gets the value of the oCobrancaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}
     *     
     */
    public JAXBElement<EnderecoDTO> getOCobrancaEndereco() {
        return oCobrancaEndereco;
    }

    /**
     * Sets the value of the oCobrancaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}
     *     
     */
    public void setOCobrancaEndereco(JAXBElement<EnderecoDTO> value) {
        this.oCobrancaEndereco = ((JAXBElement<EnderecoDTO> ) value);
    }

    /**
     * Gets the value of the oEntregaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}
     *     
     */
    public JAXBElement<EnderecoDTO> getOEntregaEndereco() {
        return oEntregaEndereco;
    }

    /**
     * Sets the value of the oEntregaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}
     *     
     */
    public void setOEntregaEndereco(JAXBElement<EnderecoDTO> value) {
        this.oEntregaEndereco = ((JAXBElement<EnderecoDTO> ) value);
    }

    /**
     * Gets the value of the oFaturamentoEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}
     *     
     */
    public JAXBElement<EnderecoDTO> getOFaturamentoEndereco() {
        return oFaturamentoEndereco;
    }

    /**
     * Sets the value of the oFaturamentoEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnderecoDTO }{@code >}
     *     
     */
    public void setOFaturamentoEndereco(JAXBElement<EnderecoDTO> value) {
        this.oFaturamentoEndereco = ((JAXBElement<EnderecoDTO> ) value);
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
     * Gets the value of the sCdAlmoxarifadoDoca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdAlmoxarifadoDoca() {
        return sCdAlmoxarifadoDoca;
    }

    /**
     * Sets the value of the sCdAlmoxarifadoDoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdAlmoxarifadoDoca(JAXBElement<String> value) {
        this.sCdAlmoxarifadoDoca = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdCentroCustoRequisicao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdCentroCustoRequisicao() {
        return sCdCentroCustoRequisicao;
    }

    /**
     * Sets the value of the sCdCentroCustoRequisicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdCentroCustoRequisicao(JAXBElement<String> value) {
        this.sCdCentroCustoRequisicao = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdItemEntregaEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdItemEntregaEmpresa() {
        return sCdItemEntregaEmpresa;
    }

    /**
     * Sets the value of the sCdItemEntregaEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdItemEntregaEmpresa(JAXBElement<String> value) {
        this.sCdItemEntregaEmpresa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdItemRequisicaoEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdItemRequisicaoEmpresa() {
        return sCdItemRequisicaoEmpresa;
    }

    /**
     * Sets the value of the sCdItemRequisicaoEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdItemRequisicaoEmpresa(JAXBElement<String> value) {
        this.sCdItemRequisicaoEmpresa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdRequisicaoEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdRequisicaoEmpresa() {
        return sCdRequisicaoEmpresa;
    }

    /**
     * Sets the value of the sCdRequisicaoEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdRequisicaoEmpresa(JAXBElement<String> value) {
        this.sCdRequisicaoEmpresa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdUnidadeFornecimento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUnidadeFornecimento() {
        return sCdUnidadeFornecimento;
    }

    /**
     * Sets the value of the sCdUnidadeFornecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUnidadeFornecimento(JAXBElement<String> value) {
        this.sCdUnidadeFornecimento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtColeta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtColeta() {
        return tDtColeta;
    }

    /**
     * Sets the value of the tDtColeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtColeta(XMLGregorianCalendar value) {
        this.tDtColeta = value;
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

}
