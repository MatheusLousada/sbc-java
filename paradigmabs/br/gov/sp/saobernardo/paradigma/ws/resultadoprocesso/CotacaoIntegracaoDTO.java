
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CotacaoIntegracaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CotacaoIntegracaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlVencedor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dVlProposta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nCdCotacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdItem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdProcesso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdRequisicao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCdSituacaoIntegracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdModalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdProcesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdRequisicaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUsuarioResponsavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrCnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrCnpjFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtProposta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtValidade" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CotacaoIntegracaoDTO", propOrder = {
    "bFlVencedor",
    "dVlProposta",
    "nCdCotacao",
    "nCdEmpresa",
    "nCdItem",
    "nCdProcesso",
    "nCdRequisicao",
    "nCdSituacao",
    "nCdSituacaoIntegracao",
    "sCdModalidade",
    "sCdProcesso",
    "sCdRequisicaoEmpresa",
    "sCdUsuarioResponsavel",
    "sNrCnpj",
    "sNrCnpjFornecedor",
    "tDtEntrega",
    "tDtProposta",
    "tDtValidade"
})
public class CotacaoIntegracaoDTO
    extends DtoBase
{

    protected Integer bFlVencedor;
    protected BigDecimal dVlProposta;
    protected Long nCdCotacao;
    protected Long nCdEmpresa;
    protected Long nCdItem;
    protected Long nCdProcesso;
    protected Long nCdRequisicao;
    protected Integer nCdSituacao;
    protected Integer nCdSituacaoIntegracao;
    @XmlElementRef(name = "sCdModalidade", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdModalidade;
    @XmlElementRef(name = "sCdProcesso", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdProcesso;
    @XmlElementRef(name = "sCdRequisicaoEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdRequisicaoEmpresa;
    @XmlElementRef(name = "sCdUsuarioResponsavel", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUsuarioResponsavel;
    @XmlElementRef(name = "sNrCnpj", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrCnpj;
    @XmlElementRef(name = "sNrCnpjFornecedor", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrCnpjFornecedor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEntrega;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtProposta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtValidade;

    /**
     * Gets the value of the bFlVencedor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlVencedor() {
        return bFlVencedor;
    }

    /**
     * Sets the value of the bFlVencedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlVencedor(Integer value) {
        this.bFlVencedor = value;
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
     * Gets the value of the nCdCotacao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdCotacao() {
        return nCdCotacao;
    }

    /**
     * Sets the value of the nCdCotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdCotacao(Long value) {
        this.nCdCotacao = value;
    }

    /**
     * Gets the value of the nCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdEmpresa() {
        return nCdEmpresa;
    }

    /**
     * Sets the value of the nCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdEmpresa(Long value) {
        this.nCdEmpresa = value;
    }

    /**
     * Gets the value of the nCdItem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdItem() {
        return nCdItem;
    }

    /**
     * Sets the value of the nCdItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdItem(Long value) {
        this.nCdItem = value;
    }

    /**
     * Gets the value of the nCdProcesso property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdProcesso() {
        return nCdProcesso;
    }

    /**
     * Sets the value of the nCdProcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdProcesso(Long value) {
        this.nCdProcesso = value;
    }

    /**
     * Gets the value of the nCdRequisicao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdRequisicao() {
        return nCdRequisicao;
    }

    /**
     * Sets the value of the nCdRequisicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdRequisicao(Long value) {
        this.nCdRequisicao = value;
    }

    /**
     * Gets the value of the nCdSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCdSituacao() {
        return nCdSituacao;
    }

    /**
     * Sets the value of the nCdSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCdSituacao(Integer value) {
        this.nCdSituacao = value;
    }

    /**
     * Gets the value of the nCdSituacaoIntegracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCdSituacaoIntegracao() {
        return nCdSituacaoIntegracao;
    }

    /**
     * Sets the value of the nCdSituacaoIntegracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCdSituacaoIntegracao(Integer value) {
        this.nCdSituacaoIntegracao = value;
    }

    /**
     * Gets the value of the sCdModalidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdModalidade() {
        return sCdModalidade;
    }

    /**
     * Sets the value of the sCdModalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdModalidade(JAXBElement<String> value) {
        this.sCdModalidade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdProcesso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdProcesso() {
        return sCdProcesso;
    }

    /**
     * Sets the value of the sCdProcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdProcesso(JAXBElement<String> value) {
        this.sCdProcesso = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdUsuarioResponsavel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUsuarioResponsavel() {
        return sCdUsuarioResponsavel;
    }

    /**
     * Sets the value of the sCdUsuarioResponsavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUsuarioResponsavel(JAXBElement<String> value) {
        this.sCdUsuarioResponsavel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrCnpj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrCnpj() {
        return sNrCnpj;
    }

    /**
     * Sets the value of the sNrCnpj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrCnpj(JAXBElement<String> value) {
        this.sNrCnpj = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrCnpjFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrCnpjFornecedor() {
        return sNrCnpjFornecedor;
    }

    /**
     * Sets the value of the sNrCnpjFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrCnpjFornecedor(JAXBElement<String> value) {
        this.sNrCnpjFornecedor = ((JAXBElement<String> ) value);
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
