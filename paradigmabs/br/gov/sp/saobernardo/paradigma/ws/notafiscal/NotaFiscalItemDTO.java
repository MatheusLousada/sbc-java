
package br.gov.sp.saobernardo.paradigma.ws.notafiscal;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotaFiscalItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotaFiscalItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtFaturada" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dQtFaturar" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dQtPorUnidade" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlDespesa" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlFrete" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlSeguro" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstNotaFiscalItemRateioDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfNotaFiscalItemRateioDTO" minOccurs="0"/>
 *         &lt;element name="lstNotaFiscalItemTaxaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfNotaFiscalItemTaxaDTO"/>
 *         &lt;element name="sCdCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdCfop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdContaContabil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaCompradora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemRequisicaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemWbc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdPedidoERP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdRequisicaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUnidadeNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsProdutoNotaFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaFiscalItemDTO", propOrder = {
    "dQtFaturada",
    "dQtFaturar",
    "dQtPorUnidade",
    "dVlDespesa",
    "dVlFrete",
    "dVlSeguro",
    "dVlUnitario",
    "lstNotaFiscalItemRateioDTO",
    "lstNotaFiscalItemTaxaDTO",
    "sCdCentroCusto",
    "sCdCfop",
    "sCdCondicaoPagamento",
    "sCdContaContabil",
    "sCdEmpresaCompradora",
    "sCdItemRequisicaoEmpresa",
    "sCdItemWbc",
    "sCdPedidoERP",
    "sCdProduto",
    "sCdRequisicaoEmpresa",
    "sCdUnidadeMedida",
    "sCdUnidadeNegocio",
    "sDsProdutoNotaFiscal"
})
public class NotaFiscalItemDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dQtFaturada;
    @XmlElement(required = true)
    protected BigDecimal dQtFaturar;
    @XmlElement(required = true)
    protected BigDecimal dQtPorUnidade;
    @XmlElement(required = true)
    protected BigDecimal dVlDespesa;
    @XmlElement(required = true)
    protected BigDecimal dVlFrete;
    @XmlElement(required = true)
    protected BigDecimal dVlSeguro;
    @XmlElement(required = true)
    protected BigDecimal dVlUnitario;
    @XmlElementRef(name = "lstNotaFiscalItemRateioDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNotaFiscalItemRateioDTO> lstNotaFiscalItemRateioDTO;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfNotaFiscalItemTaxaDTO lstNotaFiscalItemTaxaDTO;
    @XmlElementRef(name = "sCdCentroCusto", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCentroCusto;
    @XmlElement(required = true, nillable = true)
    protected String sCdCfop;
    @XmlElementRef(name = "sCdCondicaoPagamento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCondicaoPagamento;
    @XmlElementRef(name = "sCdContaContabil", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdContaContabil;
    @XmlElementRef(name = "sCdEmpresaCompradora", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaCompradora;
    @XmlElementRef(name = "sCdItemRequisicaoEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemRequisicaoEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sCdItemWbc;
    @XmlElementRef(name = "sCdPedidoERP", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdPedidoERP;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;
    @XmlElementRef(name = "sCdRequisicaoEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdRequisicaoEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sCdUnidadeMedida;
    @XmlElementRef(name = "sCdUnidadeNegocio", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUnidadeNegocio;
    @XmlElement(required = true, nillable = true)
    protected String sDsProdutoNotaFiscal;

    /**
     * Gets the value of the dQtFaturada property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtFaturada() {
        return dQtFaturada;
    }

    /**
     * Sets the value of the dQtFaturada property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtFaturada(BigDecimal value) {
        this.dQtFaturada = value;
    }

    /**
     * Gets the value of the dQtFaturar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtFaturar() {
        return dQtFaturar;
    }

    /**
     * Sets the value of the dQtFaturar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtFaturar(BigDecimal value) {
        this.dQtFaturar = value;
    }

    /**
     * Gets the value of the dQtPorUnidade property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtPorUnidade() {
        return dQtPorUnidade;
    }

    /**
     * Sets the value of the dQtPorUnidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtPorUnidade(BigDecimal value) {
        this.dQtPorUnidade = value;
    }

    /**
     * Gets the value of the dVlDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlDespesa() {
        return dVlDespesa;
    }

    /**
     * Sets the value of the dVlDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlDespesa(BigDecimal value) {
        this.dVlDespesa = value;
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
     * Gets the value of the dVlSeguro property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlSeguro() {
        return dVlSeguro;
    }

    /**
     * Sets the value of the dVlSeguro property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlSeguro(BigDecimal value) {
        this.dVlSeguro = value;
    }

    /**
     * Gets the value of the dVlUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlUnitario() {
        return dVlUnitario;
    }

    /**
     * Sets the value of the dVlUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlUnitario(BigDecimal value) {
        this.dVlUnitario = value;
    }

    /**
     * Gets the value of the lstNotaFiscalItemRateioDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalItemRateioDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNotaFiscalItemRateioDTO> getLstNotaFiscalItemRateioDTO() {
        return lstNotaFiscalItemRateioDTO;
    }

    /**
     * Sets the value of the lstNotaFiscalItemRateioDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalItemRateioDTO }{@code >}
     *     
     */
    public void setLstNotaFiscalItemRateioDTO(JAXBElement<ArrayOfNotaFiscalItemRateioDTO> value) {
        this.lstNotaFiscalItemRateioDTO = ((JAXBElement<ArrayOfNotaFiscalItemRateioDTO> ) value);
    }

    /**
     * Gets the value of the lstNotaFiscalItemTaxaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotaFiscalItemTaxaDTO }
     *     
     */
    public ArrayOfNotaFiscalItemTaxaDTO getLstNotaFiscalItemTaxaDTO() {
        return lstNotaFiscalItemTaxaDTO;
    }

    /**
     * Sets the value of the lstNotaFiscalItemTaxaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotaFiscalItemTaxaDTO }
     *     
     */
    public void setLstNotaFiscalItemTaxaDTO(ArrayOfNotaFiscalItemTaxaDTO value) {
        this.lstNotaFiscalItemTaxaDTO = value;
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
     * Gets the value of the sCdCondicaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdCondicaoPagamento() {
        return sCdCondicaoPagamento;
    }

    /**
     * Sets the value of the sCdCondicaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdCondicaoPagamento(JAXBElement<String> value) {
        this.sCdCondicaoPagamento = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdEmpresaCompradora property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresaCompradora() {
        return sCdEmpresaCompradora;
    }

    /**
     * Sets the value of the sCdEmpresaCompradora property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresaCompradora(JAXBElement<String> value) {
        this.sCdEmpresaCompradora = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdItemWbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdItemWbc() {
        return sCdItemWbc;
    }

    /**
     * Sets the value of the sCdItemWbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdItemWbc(String value) {
        this.sCdItemWbc = value;
    }

    /**
     * Gets the value of the sCdPedidoERP property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdPedidoERP() {
        return sCdPedidoERP;
    }

    /**
     * Sets the value of the sCdPedidoERP property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdPedidoERP(JAXBElement<String> value) {
        this.sCdPedidoERP = ((JAXBElement<String> ) value);
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
     * Gets the value of the sDsProdutoNotaFiscal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsProdutoNotaFiscal() {
        return sDsProdutoNotaFiscal;
    }

    /**
     * Sets the value of the sDsProdutoNotaFiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsProdutoNotaFiscal(String value) {
        this.sDsProdutoNotaFiscal = value;
    }

}
