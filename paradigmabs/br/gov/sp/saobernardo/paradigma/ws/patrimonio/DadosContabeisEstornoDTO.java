
package br.gov.sp.saobernardo.paradigma.ws.patrimonio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DadosContabeisEstornoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosContabeisEstornoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdOperacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sCdDocumentoContabil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsGestaoOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsJustificativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsUgOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sVlAnoExercicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtEstorno" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosContabeisEstornoDTO", propOrder = {
    "nCdOperacao",
    "sCdDocumentoContabil",
    "sDsGestaoOrigem",
    "sDsJustificativa",
    "sDsUgOrigem",
    "sVlAnoExercicio",
    "tDtEstorno"
})
public class DadosContabeisEstornoDTO
    extends DtoBase
{

    protected Long nCdOperacao;
    @XmlElementRef(name = "sCdDocumentoContabil", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdDocumentoContabil;
    @XmlElementRef(name = "sDsGestaoOrigem", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsGestaoOrigem;
    @XmlElementRef(name = "sDsJustificativa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsJustificativa;
    @XmlElementRef(name = "sDsUgOrigem", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsUgOrigem;
    @XmlElementRef(name = "sVlAnoExercicio", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sVlAnoExercicio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEstorno;

    /**
     * Gets the value of the nCdOperacao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdOperacao() {
        return nCdOperacao;
    }

    /**
     * Sets the value of the nCdOperacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdOperacao(Long value) {
        this.nCdOperacao = value;
    }

    /**
     * Gets the value of the sCdDocumentoContabil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdDocumentoContabil() {
        return sCdDocumentoContabil;
    }

    /**
     * Sets the value of the sCdDocumentoContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdDocumentoContabil(JAXBElement<String> value) {
        this.sCdDocumentoContabil = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsGestaoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsGestaoOrigem() {
        return sDsGestaoOrigem;
    }

    /**
     * Sets the value of the sDsGestaoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsGestaoOrigem(JAXBElement<String> value) {
        this.sDsGestaoOrigem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsJustificativa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsJustificativa() {
        return sDsJustificativa;
    }

    /**
     * Sets the value of the sDsJustificativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsJustificativa(JAXBElement<String> value) {
        this.sDsJustificativa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsUgOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsUgOrigem() {
        return sDsUgOrigem;
    }

    /**
     * Sets the value of the sDsUgOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsUgOrigem(JAXBElement<String> value) {
        this.sDsUgOrigem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sVlAnoExercicio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSVlAnoExercicio() {
        return sVlAnoExercicio;
    }

    /**
     * Sets the value of the sVlAnoExercicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSVlAnoExercicio(JAXBElement<String> value) {
        this.sVlAnoExercicio = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtEstorno property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtEstorno() {
        return tDtEstorno;
    }

    /**
     * Sets the value of the tDtEstorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtEstorno(XMLGregorianCalendar value) {
        this.tDtEstorno = value;
    }

}
