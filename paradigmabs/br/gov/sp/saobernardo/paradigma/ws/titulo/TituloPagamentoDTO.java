
package br.gov.sp.saobernardo.paradigma.ws.titulo;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TituloPagamentoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TituloPagamentoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlCambio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlPagamento" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nCdBanco" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdMoeda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sCdAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdAgenciaDigito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdContaCorrente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdContaDigito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrTransacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TituloPagamentoDTO", propOrder = {
    "dVlCambio",
    "dVlPagamento",
    "nCdBanco",
    "nCdMoeda",
    "sCdAgencia",
    "sCdAgenciaDigito",
    "sCdBanco",
    "sCdContaCorrente",
    "sCdContaDigito",
    "sCdMoeda",
    "sDsPagamento",
    "sNrTransacao"
})
public class TituloPagamentoDTO
    extends DtoBase
{

    protected BigDecimal dVlCambio;
    @XmlElement(required = true)
    protected BigDecimal dVlPagamento;
    @XmlElementRef(name = "nCdBanco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdBanco;
    @XmlElementRef(name = "nCdMoeda", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdMoeda;
    @XmlElementRef(name = "sCdAgencia", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdAgencia;
    @XmlElementRef(name = "sCdAgenciaDigito", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdAgenciaDigito;
    @XmlElementRef(name = "sCdBanco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdBanco;
    @XmlElementRef(name = "sCdContaCorrente", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdContaCorrente;
    @XmlElementRef(name = "sCdContaDigito", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdContaDigito;
    @XmlElementRef(name = "sCdMoeda", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdMoeda;
    @XmlElement(required = true, nillable = true)
    protected String sDsPagamento;
    @XmlElementRef(name = "sNrTransacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrTransacao;

    /**
     * Gets the value of the dVlCambio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlCambio() {
        return dVlCambio;
    }

    /**
     * Sets the value of the dVlCambio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlCambio(BigDecimal value) {
        this.dVlCambio = value;
    }

    /**
     * Gets the value of the dVlPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlPagamento() {
        return dVlPagamento;
    }

    /**
     * Sets the value of the dVlPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlPagamento(BigDecimal value) {
        this.dVlPagamento = value;
    }

    /**
     * Gets the value of the nCdBanco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdBanco() {
        return nCdBanco;
    }

    /**
     * Sets the value of the nCdBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdBanco(JAXBElement<Long> value) {
        this.nCdBanco = ((JAXBElement<Long> ) value);
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
     * Gets the value of the sCdAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdAgencia() {
        return sCdAgencia;
    }

    /**
     * Sets the value of the sCdAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdAgencia(JAXBElement<String> value) {
        this.sCdAgencia = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdAgenciaDigito property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdAgenciaDigito() {
        return sCdAgenciaDigito;
    }

    /**
     * Sets the value of the sCdAgenciaDigito property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdAgenciaDigito(JAXBElement<String> value) {
        this.sCdAgenciaDigito = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdBanco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdBanco() {
        return sCdBanco;
    }

    /**
     * Sets the value of the sCdBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdBanco(JAXBElement<String> value) {
        this.sCdBanco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdContaCorrente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdContaCorrente() {
        return sCdContaCorrente;
    }

    /**
     * Sets the value of the sCdContaCorrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdContaCorrente(JAXBElement<String> value) {
        this.sCdContaCorrente = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdContaDigito property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdContaDigito() {
        return sCdContaDigito;
    }

    /**
     * Sets the value of the sCdContaDigito property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdContaDigito(JAXBElement<String> value) {
        this.sCdContaDigito = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdMoeda() {
        return sCdMoeda;
    }

    /**
     * Sets the value of the sCdMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdMoeda(JAXBElement<String> value) {
        this.sCdMoeda = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsPagamento() {
        return sDsPagamento;
    }

    /**
     * Sets the value of the sDsPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsPagamento(String value) {
        this.sDsPagamento = value;
    }

    /**
     * Gets the value of the sNrTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrTransacao() {
        return sNrTransacao;
    }

    /**
     * Sets the value of the sNrTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrTransacao(JAXBElement<String> value) {
        this.sNrTransacao = ((JAXBElement<String> ) value);
    }

}
