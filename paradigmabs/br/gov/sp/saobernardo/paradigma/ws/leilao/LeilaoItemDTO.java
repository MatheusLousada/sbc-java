
package br.gov.sp.saobernardo.paradigma.ws.leilao;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeilaoItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeilaoItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtItem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlAlvo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlReferencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlVariacaoMax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlVariacaoMin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstLeilaoItemEnderecoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfLeilaoItemEnderecoDTO"/>
 *         &lt;element name="lstLeilaoItemParticipanteDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfLeilaoItemParticipanteDTO"/>
 *         &lt;element name="lstLeilaoLanceDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfLeilaoLanceDTO"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nIdVariacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdItemWbc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdMarca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdMoeda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsJustificativa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsProdutoLeilao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeilaoItemDTO", propOrder = {
    "dQtItem",
    "dVlAlvo",
    "dVlReferencia",
    "dVlVariacaoMax",
    "dVlVariacaoMin",
    "lstLeilaoItemEnderecoDTO",
    "lstLeilaoItemParticipanteDTO",
    "lstLeilaoLanceDTO",
    "nCdSituacao",
    "nIdVariacao",
    "sCdClasse",
    "sCdCondicaoPagamento",
    "sCdItemEmpresa",
    "sCdItemWbc",
    "sCdMarca",
    "sCdMoeda",
    "sCdProduto",
    "sCdUnidadeMedida",
    "sDsJustificativa",
    "sDsProdutoLeilao"
})
public class LeilaoItemDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dQtItem;
    @XmlElement(required = true)
    protected BigDecimal dVlAlvo;
    protected BigDecimal dVlReferencia;
    @XmlElement(required = true)
    protected BigDecimal dVlVariacaoMax;
    @XmlElement(required = true)
    protected BigDecimal dVlVariacaoMin;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfLeilaoItemEnderecoDTO lstLeilaoItemEnderecoDTO;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfLeilaoItemParticipanteDTO lstLeilaoItemParticipanteDTO;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfLeilaoLanceDTO lstLeilaoLanceDTO;
    protected long nCdSituacao;
    protected int nIdVariacao;
    @XmlElement(required = true, nillable = true)
    protected String sCdClasse;
    @XmlElementRef(name = "sCdCondicaoPagamento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCondicaoPagamento;
    @XmlElement(required = true, nillable = true)
    protected String sCdItemEmpresa;
    @XmlElementRef(name = "sCdItemWbc", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemWbc;
    @XmlElement(required = true, nillable = true)
    protected String sCdMarca;
    @XmlElement(required = true, nillable = true)
    protected String sCdMoeda;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;
    @XmlElement(required = true, nillable = true)
    protected String sCdUnidadeMedida;
    @XmlElement(required = true, nillable = true)
    protected String sDsJustificativa;
    @XmlElement(required = true, nillable = true)
    protected String sDsProdutoLeilao;

    /**
     * Gets the value of the dQtItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtItem() {
        return dQtItem;
    }

    /**
     * Sets the value of the dQtItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtItem(BigDecimal value) {
        this.dQtItem = value;
    }

    /**
     * Gets the value of the dVlAlvo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlAlvo() {
        return dVlAlvo;
    }

    /**
     * Sets the value of the dVlAlvo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlAlvo(BigDecimal value) {
        this.dVlAlvo = value;
    }

    /**
     * Gets the value of the dVlReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlReferencia() {
        return dVlReferencia;
    }

    /**
     * Sets the value of the dVlReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlReferencia(BigDecimal value) {
        this.dVlReferencia = value;
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
     * Gets the value of the lstLeilaoItemEnderecoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLeilaoItemEnderecoDTO }
     *     
     */
    public ArrayOfLeilaoItemEnderecoDTO getLstLeilaoItemEnderecoDTO() {
        return lstLeilaoItemEnderecoDTO;
    }

    /**
     * Sets the value of the lstLeilaoItemEnderecoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLeilaoItemEnderecoDTO }
     *     
     */
    public void setLstLeilaoItemEnderecoDTO(ArrayOfLeilaoItemEnderecoDTO value) {
        this.lstLeilaoItemEnderecoDTO = value;
    }

    /**
     * Gets the value of the lstLeilaoItemParticipanteDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLeilaoItemParticipanteDTO }
     *     
     */
    public ArrayOfLeilaoItemParticipanteDTO getLstLeilaoItemParticipanteDTO() {
        return lstLeilaoItemParticipanteDTO;
    }

    /**
     * Sets the value of the lstLeilaoItemParticipanteDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLeilaoItemParticipanteDTO }
     *     
     */
    public void setLstLeilaoItemParticipanteDTO(ArrayOfLeilaoItemParticipanteDTO value) {
        this.lstLeilaoItemParticipanteDTO = value;
    }

    /**
     * Gets the value of the lstLeilaoLanceDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLeilaoLanceDTO }
     *     
     */
    public ArrayOfLeilaoLanceDTO getLstLeilaoLanceDTO() {
        return lstLeilaoLanceDTO;
    }

    /**
     * Sets the value of the lstLeilaoLanceDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLeilaoLanceDTO }
     *     
     */
    public void setLstLeilaoLanceDTO(ArrayOfLeilaoLanceDTO value) {
        this.lstLeilaoLanceDTO = value;
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
     * Gets the value of the nIdVariacao property.
     * 
     */
    public int getNIdVariacao() {
        return nIdVariacao;
    }

    /**
     * Sets the value of the nIdVariacao property.
     * 
     */
    public void setNIdVariacao(int value) {
        this.nIdVariacao = value;
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
     * Gets the value of the sCdMarca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdMarca() {
        return sCdMarca;
    }

    /**
     * Sets the value of the sCdMarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdMarca(String value) {
        this.sCdMarca = value;
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
     * Gets the value of the sDsProdutoLeilao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsProdutoLeilao() {
        return sDsProdutoLeilao;
    }

    /**
     * Sets the value of the sDsProdutoLeilao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsProdutoLeilao(String value) {
        this.sDsProdutoLeilao = value;
    }

}
