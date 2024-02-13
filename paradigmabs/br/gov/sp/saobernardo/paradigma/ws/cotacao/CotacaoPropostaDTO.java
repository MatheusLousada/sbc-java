
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

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
 * <p>Java class for CotacaoPropostaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CotacaoPropostaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dPcDesconto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlLiquido" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlProposta" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstCotacaoPropostaEnderecoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCotacaoPropostaEnderecoDTO"/>
 *         &lt;element name="lstCotacaoPropostaTaxaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCotacaoPropostaTaxaDTO"/>
 *         &lt;element name="lstPropostaRequisicaoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPropostaRequisicaoDTO"/>
 *         &lt;element name="nCdProposta" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nIdVencedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nNrRanking" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdFrete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdMarca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdNmb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsMotivoDesclassificado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObservacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtAlteracao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtProposta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtValidade" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CotacaoPropostaDTO", propOrder = {
    "dPcDesconto",
    "dVlLiquido",
    "dVlProposta",
    "dVlUnitario",
    "lstCotacaoPropostaEnderecoDTO",
    "lstCotacaoPropostaTaxaDTO",
    "lstPropostaRequisicaoDTO",
    "nCdProposta",
    "nCdSituacao",
    "nIdVencedor",
    "nNrRanking",
    "sCdCondicaoPagamento",
    "sCdEmpresa",
    "sCdFrete",
    "sCdIva",
    "sCdMarca",
    "sCdNmb",
    "sCdUsuario",
    "sDsMotivoDesclassificado",
    "sDsObservacao",
    "tDtAlteracao",
    "tDtProposta",
    "tDtValidade"
})
public class CotacaoPropostaDTO
    extends DtoBase
{

    protected BigDecimal dPcDesconto;
    @XmlElement(required = true)
    protected BigDecimal dVlLiquido;
    @XmlElement(required = true)
    protected BigDecimal dVlProposta;
    @XmlElement(required = true)
    protected BigDecimal dVlUnitario;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCotacaoPropostaEnderecoDTO lstCotacaoPropostaEnderecoDTO;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCotacaoPropostaTaxaDTO lstCotacaoPropostaTaxaDTO;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPropostaRequisicaoDTO lstPropostaRequisicaoDTO;
    protected Long nCdProposta;
    protected long nCdSituacao;
    protected int nIdVencedor;
    protected int nNrRanking;
    @XmlElement(required = true, nillable = true)
    protected String sCdCondicaoPagamento;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sCdFrete;
    @XmlElementRef(name = "sCdIva", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdIva;
    @XmlElement(required = true, nillable = true)
    protected String sCdMarca;
    @XmlElementRef(name = "sCdNmb", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdNmb;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuario;
    @XmlElement(required = true, nillable = true)
    protected String sDsMotivoDesclassificado;
    @XmlElement(required = true, nillable = true)
    protected String sDsObservacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtAlteracao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtProposta;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtValidade;

    /**
     * Gets the value of the dPcDesconto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDPcDesconto() {
        return dPcDesconto;
    }

    /**
     * Sets the value of the dPcDesconto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDPcDesconto(BigDecimal value) {
        this.dPcDesconto = value;
    }

    /**
     * Gets the value of the dVlLiquido property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlLiquido() {
        return dVlLiquido;
    }

    /**
     * Sets the value of the dVlLiquido property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlLiquido(BigDecimal value) {
        this.dVlLiquido = value;
    }

    /**
     * Gets the value of the dVlProposta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlProposta() {
        return dVlProposta;
    }

    /**
     * Sets the value of the dVlProposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlProposta(BigDecimal value) {
        this.dVlProposta = value;
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
     * Gets the value of the lstCotacaoPropostaEnderecoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCotacaoPropostaEnderecoDTO }
     *     
     */
    public ArrayOfCotacaoPropostaEnderecoDTO getLstCotacaoPropostaEnderecoDTO() {
        return lstCotacaoPropostaEnderecoDTO;
    }

    /**
     * Sets the value of the lstCotacaoPropostaEnderecoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCotacaoPropostaEnderecoDTO }
     *     
     */
    public void setLstCotacaoPropostaEnderecoDTO(ArrayOfCotacaoPropostaEnderecoDTO value) {
        this.lstCotacaoPropostaEnderecoDTO = value;
    }

    /**
     * Gets the value of the lstCotacaoPropostaTaxaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCotacaoPropostaTaxaDTO }
     *     
     */
    public ArrayOfCotacaoPropostaTaxaDTO getLstCotacaoPropostaTaxaDTO() {
        return lstCotacaoPropostaTaxaDTO;
    }

    /**
     * Sets the value of the lstCotacaoPropostaTaxaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCotacaoPropostaTaxaDTO }
     *     
     */
    public void setLstCotacaoPropostaTaxaDTO(ArrayOfCotacaoPropostaTaxaDTO value) {
        this.lstCotacaoPropostaTaxaDTO = value;
    }

    /**
     * Gets the value of the lstPropostaRequisicaoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPropostaRequisicaoDTO }
     *     
     */
    public ArrayOfPropostaRequisicaoDTO getLstPropostaRequisicaoDTO() {
        return lstPropostaRequisicaoDTO;
    }

    /**
     * Sets the value of the lstPropostaRequisicaoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPropostaRequisicaoDTO }
     *     
     */
    public void setLstPropostaRequisicaoDTO(ArrayOfPropostaRequisicaoDTO value) {
        this.lstPropostaRequisicaoDTO = value;
    }

    /**
     * Gets the value of the nCdProposta property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdProposta() {
        return nCdProposta;
    }

    /**
     * Sets the value of the nCdProposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdProposta(Long value) {
        this.nCdProposta = value;
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
     * Gets the value of the nIdVencedor property.
     * 
     */
    public int getNIdVencedor() {
        return nIdVencedor;
    }

    /**
     * Sets the value of the nIdVencedor property.
     * 
     */
    public void setNIdVencedor(int value) {
        this.nIdVencedor = value;
    }

    /**
     * Gets the value of the nNrRanking property.
     * 
     */
    public int getNNrRanking() {
        return nNrRanking;
    }

    /**
     * Sets the value of the nNrRanking property.
     * 
     */
    public void setNNrRanking(int value) {
        this.nNrRanking = value;
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
     * Gets the value of the sCdNmb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdNmb() {
        return sCdNmb;
    }

    /**
     * Sets the value of the sCdNmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdNmb(JAXBElement<String> value) {
        this.sCdNmb = ((JAXBElement<String> ) value);
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
     * Gets the value of the sDsMotivoDesclassificado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsMotivoDesclassificado() {
        return sDsMotivoDesclassificado;
    }

    /**
     * Sets the value of the sDsMotivoDesclassificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsMotivoDesclassificado(String value) {
        this.sDsMotivoDesclassificado = value;
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
     * Gets the value of the tDtAlteracao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtAlteracao() {
        return tDtAlteracao;
    }

    /**
     * Sets the value of the tDtAlteracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtAlteracao(XMLGregorianCalendar value) {
        this.tDtAlteracao = value;
    }

    /**
     * Gets the value of the tDtProposta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtProposta() {
        return tDtProposta;
    }

    /**
     * Sets the value of the tDtProposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtProposta(XMLGregorianCalendar value) {
        this.tDtProposta = value;
    }

    /**
     * Gets the value of the tDtValidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtValidade() {
        return tDtValidade;
    }

    /**
     * Sets the value of the tDtValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtValidade(XMLGregorianCalendar value) {
        this.tDtValidade = value;
    }

}
