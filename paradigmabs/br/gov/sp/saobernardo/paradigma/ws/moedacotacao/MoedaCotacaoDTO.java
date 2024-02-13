
package br.gov.sp.saobernardo.paradigma.ws.moedacotacao;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MoedaCotacaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoedaCotacaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlMoedaCotacao" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sCdMoedaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdMoedaOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtMoedaCotacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoedaCotacaoDTO", propOrder = {
    "dVlMoedaCotacao",
    "sCdMoedaDestino",
    "sCdMoedaOrigem",
    "tDtMoedaCotacao"
})
public class MoedaCotacaoDTO
    extends DtoBase
{

    protected BigDecimal dVlMoedaCotacao;
    @XmlElementRef(name = "sCdMoedaDestino", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdMoedaDestino;
    @XmlElementRef(name = "sCdMoedaOrigem", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdMoedaOrigem;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtMoedaCotacao;

    /**
     * Gets the value of the dVlMoedaCotacao property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlMoedaCotacao() {
        return dVlMoedaCotacao;
    }

    /**
     * Sets the value of the dVlMoedaCotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlMoedaCotacao(BigDecimal value) {
        this.dVlMoedaCotacao = value;
    }

    /**
     * Gets the value of the sCdMoedaDestino property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdMoedaDestino() {
        return sCdMoedaDestino;
    }

    /**
     * Sets the value of the sCdMoedaDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdMoedaDestino(JAXBElement<String> value) {
        this.sCdMoedaDestino = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdMoedaOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdMoedaOrigem() {
        return sCdMoedaOrigem;
    }

    /**
     * Sets the value of the sCdMoedaOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdMoedaOrigem(JAXBElement<String> value) {
        this.sCdMoedaOrigem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtMoedaCotacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtMoedaCotacao() {
        return tDtMoedaCotacao;
    }

    /**
     * Sets the value of the tDtMoedaCotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtMoedaCotacao(XMLGregorianCalendar value) {
        this.tDtMoedaCotacao = value;
    }

}
