
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CotacaoItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CotacaoItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlCalculaReferencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dQtItem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlReferencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lstCotacaoItemEnderecoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCotacaoItemEnderecoDTO"/>
 *         &lt;element name="lstCotacaoItemParticipanteDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCotacaoItemParticipanteDTO" minOccurs="0"/>
 *         &lt;element name="lstCotacaoItemTaxaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCotacaoItemTaxaDTO"/>
 *         &lt;element name="lstCotacaoPropostaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCotacaoPropostaDTO"/>
 *         &lt;element name="nCdAplicacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sCdClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCotacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdItemWbc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemWbcPai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdMarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsJustificativa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CotacaoItemDTO", propOrder = {
    "bFlCalculaReferencia",
    "dQtItem",
    "dVlReferencia",
    "lstCotacaoItemEnderecoDTO",
    "lstCotacaoItemParticipanteDTO",
    "lstCotacaoItemTaxaDTO",
    "lstCotacaoPropostaDTO",
    "nCdAplicacao",
    "nCdSituacao",
    "sCdClasse",
    "sCdCondicaoPagamento",
    "sCdCotacao",
    "sCdItemEmpresa",
    "sCdItemWbc",
    "sCdItemWbcPai",
    "sCdMarca",
    "sCdProduto",
    "sCdUnidadeMedida",
    "sDsItem",
    "sDsJustificativa",
    "sDsObservacao"
})
public class CotacaoItemDTO
    extends DtoBase
{

    protected int bFlCalculaReferencia;
    @XmlElement(required = true)
    protected BigDecimal dQtItem;
    protected BigDecimal dVlReferencia;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCotacaoItemEnderecoDTO lstCotacaoItemEnderecoDTO;
    protected ArrayOfCotacaoItemParticipanteDTO lstCotacaoItemParticipanteDTO;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCotacaoItemTaxaDTO lstCotacaoItemTaxaDTO;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCotacaoPropostaDTO lstCotacaoPropostaDTO;
    protected long nCdAplicacao;
    protected long nCdSituacao;
    @XmlElement(required = true, nillable = true)
    protected String sCdClasse;
    @XmlElement(required = true, nillable = true)
    protected String sCdCondicaoPagamento;
    @XmlElementRef(name = "sCdCotacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCotacao;
    @XmlElement(required = true, nillable = true)
    protected String sCdItemEmpresa;
    @XmlElementRef(name = "sCdItemWbc", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemWbc;
    @XmlElementRef(name = "sCdItemWbcPai", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemWbcPai;
    @XmlElementRef(name = "sCdMarca", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdMarca;
    protected String sCdProduto;
    @XmlElement(required = true, nillable = true)
    protected String sCdUnidadeMedida;
    @XmlElement(required = true, nillable = true)
    protected String sDsItem;
    @XmlElement(required = true, nillable = true)
    protected String sDsJustificativa;
    @XmlElementRef(name = "sDsObservacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsObservacao;

    /**
     * Gets the value of the bFlCalculaReferencia property.
     * 
     */
    public int getBFlCalculaReferencia() {
        return bFlCalculaReferencia;
    }

    /**
     * Sets the value of the bFlCalculaReferencia property.
     * 
     */
    public void setBFlCalculaReferencia(int value) {
        this.bFlCalculaReferencia = value;
    }

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
     * Gets the value of the lstCotacaoItemEnderecoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCotacaoItemEnderecoDTO }
     *     
     */
    public ArrayOfCotacaoItemEnderecoDTO getLstCotacaoItemEnderecoDTO() {
        return lstCotacaoItemEnderecoDTO;
    }

    /**
     * Sets the value of the lstCotacaoItemEnderecoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCotacaoItemEnderecoDTO }
     *     
     */
    public void setLstCotacaoItemEnderecoDTO(ArrayOfCotacaoItemEnderecoDTO value) {
        this.lstCotacaoItemEnderecoDTO = value;
    }

    /**
     * Gets the value of the lstCotacaoItemParticipanteDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCotacaoItemParticipanteDTO }
     *     
     */
    public ArrayOfCotacaoItemParticipanteDTO getLstCotacaoItemParticipanteDTO() {
        return lstCotacaoItemParticipanteDTO;
    }

    /**
     * Sets the value of the lstCotacaoItemParticipanteDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCotacaoItemParticipanteDTO }
     *     
     */
    public void setLstCotacaoItemParticipanteDTO(ArrayOfCotacaoItemParticipanteDTO value) {
        this.lstCotacaoItemParticipanteDTO = value;
    }

    /**
     * Gets the value of the lstCotacaoItemTaxaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCotacaoItemTaxaDTO }
     *     
     */
    public ArrayOfCotacaoItemTaxaDTO getLstCotacaoItemTaxaDTO() {
        return lstCotacaoItemTaxaDTO;
    }

    /**
     * Sets the value of the lstCotacaoItemTaxaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCotacaoItemTaxaDTO }
     *     
     */
    public void setLstCotacaoItemTaxaDTO(ArrayOfCotacaoItemTaxaDTO value) {
        this.lstCotacaoItemTaxaDTO = value;
    }

    /**
     * Gets the value of the lstCotacaoPropostaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCotacaoPropostaDTO }
     *     
     */
    public ArrayOfCotacaoPropostaDTO getLstCotacaoPropostaDTO() {
        return lstCotacaoPropostaDTO;
    }

    /**
     * Sets the value of the lstCotacaoPropostaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCotacaoPropostaDTO }
     *     
     */
    public void setLstCotacaoPropostaDTO(ArrayOfCotacaoPropostaDTO value) {
        this.lstCotacaoPropostaDTO = value;
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
     * Gets the value of the sCdCotacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdCotacao() {
        return sCdCotacao;
    }

    /**
     * Sets the value of the sCdCotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdCotacao(JAXBElement<String> value) {
        this.sCdCotacao = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdItemWbcPai property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdItemWbcPai() {
        return sCdItemWbcPai;
    }

    /**
     * Sets the value of the sCdItemWbcPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdItemWbcPai(JAXBElement<String> value) {
        this.sCdItemWbcPai = ((JAXBElement<String> ) value);
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
     * Gets the value of the sDsItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsItem() {
        return sDsItem;
    }

    /**
     * Sets the value of the sDsItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsItem(String value) {
        this.sDsItem = value;
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

}
