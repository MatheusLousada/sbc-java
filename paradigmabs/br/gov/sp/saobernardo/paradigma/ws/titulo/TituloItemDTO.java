
package br.gov.sp.saobernardo.paradigma.ws.titulo;

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
 * <p>Java class for TituloItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TituloItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlTitulo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nCdSituacaoOperacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nCdSituacaoStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sNrParcela" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrTitulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TituloItemDTO", propOrder = {
    "dVlTitulo",
    "nCdSituacaoOperacao",
    "nCdSituacaoStatus",
    "sNrParcela",
    "sNrTitulo",
    "tDtEmissao",
    "tDtVencimento"
})
public class TituloItemDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dVlTitulo;
    protected int nCdSituacaoOperacao;
    protected int nCdSituacaoStatus;
    @XmlElement(required = true, nillable = true)
    protected String sNrParcela;
    @XmlElement(required = true, nillable = true)
    protected String sNrTitulo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEmissao;
    @XmlElementRef(name = "tDtVencimento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtVencimento;

    /**
     * Gets the value of the dVlTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlTitulo() {
        return dVlTitulo;
    }

    /**
     * Sets the value of the dVlTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlTitulo(BigDecimal value) {
        this.dVlTitulo = value;
    }

    /**
     * Gets the value of the nCdSituacaoOperacao property.
     * 
     */
    public int getNCdSituacaoOperacao() {
        return nCdSituacaoOperacao;
    }

    /**
     * Sets the value of the nCdSituacaoOperacao property.
     * 
     */
    public void setNCdSituacaoOperacao(int value) {
        this.nCdSituacaoOperacao = value;
    }

    /**
     * Gets the value of the nCdSituacaoStatus property.
     * 
     */
    public int getNCdSituacaoStatus() {
        return nCdSituacaoStatus;
    }

    /**
     * Sets the value of the nCdSituacaoStatus property.
     * 
     */
    public void setNCdSituacaoStatus(int value) {
        this.nCdSituacaoStatus = value;
    }

    /**
     * Gets the value of the sNrParcela property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrParcela() {
        return sNrParcela;
    }

    /**
     * Sets the value of the sNrParcela property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrParcela(String value) {
        this.sNrParcela = value;
    }

    /**
     * Gets the value of the sNrTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrTitulo() {
        return sNrTitulo;
    }

    /**
     * Sets the value of the sNrTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrTitulo(String value) {
        this.sNrTitulo = value;
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
     * Gets the value of the tDtVencimento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTDtVencimento() {
        return tDtVencimento;
    }

    /**
     * Sets the value of the tDtVencimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTDtVencimento(JAXBElement<XMLGregorianCalendar> value) {
        this.tDtVencimento = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
