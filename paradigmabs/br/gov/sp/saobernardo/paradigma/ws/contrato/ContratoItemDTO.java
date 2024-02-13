
package br.gov.sp.saobernardo.paradigma.ws.contrato;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContratoItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContratoItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtItemPrevisto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dQtItemRealizado" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlItem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstContratoItemEnderecoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfContratoItemEnderecoDTO"/>
 *         &lt;element name="nCdSituacaoItem" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sCdClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdFrete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdGarantia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemErp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemPaiErp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemWbc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdMarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdNegociacaoItemWbc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObservacoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsProdutoContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContratoItemDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", propOrder = {
    "dQtItemPrevisto",
    "dQtItemRealizado",
    "dVlItem",
    "lstContratoItemEnderecoDTO",
    "nCdSituacaoItem",
    "sCdClasse",
    "sCdCondicaoPagamento",
    "sCdFrete",
    "sCdGarantia",
    "sCdItemErp",
    "sCdItemPaiErp",
    "sCdItemWbc",
    "sCdIva",
    "sCdMarca",
    "sCdNegociacaoItemWbc",
    "sCdProduto",
    "sCdUnidadeMedida",
    "sDsObservacoes",
    "sDsProdutoContrato"
})
public class ContratoItemDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dQtItemPrevisto;
    @XmlElement(required = true)
    protected BigDecimal dQtItemRealizado;
    @XmlElement(required = true)
    protected BigDecimal dVlItem;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfContratoItemEnderecoDTO lstContratoItemEnderecoDTO;
    protected long nCdSituacaoItem;
    @XmlElement(required = true, nillable = true)
    protected String sCdClasse;
    @XmlElement(required = true, nillable = true)
    protected String sCdCondicaoPagamento;
    @XmlElement(required = true, nillable = true)
    protected String sCdFrete;
    @XmlElementRef(name = "sCdGarantia", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdGarantia;
    @XmlElementRef(name = "sCdItemErp", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemErp;
    @XmlElementRef(name = "sCdItemPaiErp", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemPaiErp;
    @XmlElementRef(name = "sCdItemWbc", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemWbc;
    @XmlElementRef(name = "sCdIva", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdIva;
    @XmlElementRef(name = "sCdMarca", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdMarca;
    @XmlElement(required = true, nillable = true)
    protected String sCdNegociacaoItemWbc;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;
    @XmlElement(required = true, nillable = true)
    protected String sCdUnidadeMedida;
    @XmlElementRef(name = "sDsObservacoes", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsObservacoes;
    @XmlElement(required = true, nillable = true)
    protected String sDsProdutoContrato;

    /**
     * Gets the value of the dQtItemPrevisto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtItemPrevisto() {
        return dQtItemPrevisto;
    }

    /**
     * Sets the value of the dQtItemPrevisto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtItemPrevisto(BigDecimal value) {
        this.dQtItemPrevisto = value;
    }

    /**
     * Gets the value of the dQtItemRealizado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtItemRealizado() {
        return dQtItemRealizado;
    }

    /**
     * Sets the value of the dQtItemRealizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtItemRealizado(BigDecimal value) {
        this.dQtItemRealizado = value;
    }

    /**
     * Gets the value of the dVlItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlItem() {
        return dVlItem;
    }

    /**
     * Sets the value of the dVlItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlItem(BigDecimal value) {
        this.dVlItem = value;
    }

    /**
     * Gets the value of the lstContratoItemEnderecoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContratoItemEnderecoDTO }
     *     
     */
    public ArrayOfContratoItemEnderecoDTO getLstContratoItemEnderecoDTO() {
        return lstContratoItemEnderecoDTO;
    }

    /**
     * Sets the value of the lstContratoItemEnderecoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContratoItemEnderecoDTO }
     *     
     */
    public void setLstContratoItemEnderecoDTO(ArrayOfContratoItemEnderecoDTO value) {
        this.lstContratoItemEnderecoDTO = value;
    }

    /**
     * Gets the value of the nCdSituacaoItem property.
     * 
     */
    public long getNCdSituacaoItem() {
        return nCdSituacaoItem;
    }

    /**
     * Sets the value of the nCdSituacaoItem property.
     * 
     */
    public void setNCdSituacaoItem(long value) {
        this.nCdSituacaoItem = value;
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
     * Gets the value of the sCdGarantia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdGarantia() {
        return sCdGarantia;
    }

    /**
     * Sets the value of the sCdGarantia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdGarantia(JAXBElement<String> value) {
        this.sCdGarantia = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdItemErp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdItemErp() {
        return sCdItemErp;
    }

    /**
     * Sets the value of the sCdItemErp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdItemErp(JAXBElement<String> value) {
        this.sCdItemErp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdItemPaiErp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdItemPaiErp() {
        return sCdItemPaiErp;
    }

    /**
     * Sets the value of the sCdItemPaiErp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdItemPaiErp(JAXBElement<String> value) {
        this.sCdItemPaiErp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdItemWbc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdItemWbc() {
        return sCdItemWbc;
    }

    /**
     * Sets the value of the sCdItemWbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdItemWbc(JAXBElement<String> value) {
        this.sCdItemWbc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdIva property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdIva() {
        return sCdIva;
    }

    /**
     * Sets the value of the sCdIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdIva(JAXBElement<String> value) {
        this.sCdIva = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdMarca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdMarca() {
        return sCdMarca;
    }

    /**
     * Sets the value of the sCdMarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdMarca(JAXBElement<String> value) {
        this.sCdMarca = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdNegociacaoItemWbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdNegociacaoItemWbc() {
        return sCdNegociacaoItemWbc;
    }

    /**
     * Sets the value of the sCdNegociacaoItemWbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdNegociacaoItemWbc(String value) {
        this.sCdNegociacaoItemWbc = value;
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
     * Gets the value of the sDsProdutoContrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsProdutoContrato() {
        return sDsProdutoContrato;
    }

    /**
     * Sets the value of the sDsProdutoContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsProdutoContrato(String value) {
        this.sDsProdutoContrato = value;
    }

}
