
package br.gov.sp.saobernardo.paradigma.ws.fonterecurso;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WbtLogDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WbtLogDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nIdRetorno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sCdComplemento1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdComplemento2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtLog" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbtLogDTO", propOrder = {
    "nIdRetorno",
    "sCdComplemento1",
    "sCdComplemento2",
    "sCdOrigem",
    "sDsLog",
    "sNrToken",
    "tDtLog"
})
public class WbtLogDTO
    extends DtoBase
{

    protected Long nIdRetorno;
    @XmlElementRef(name = "sCdComplemento1", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdComplemento1;
    @XmlElementRef(name = "sCdComplemento2", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdComplemento2;
    @XmlElementRef(name = "sCdOrigem", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdOrigem;
    @XmlElementRef(name = "sDsLog", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsLog;
    @XmlElementRef(name = "sNrToken", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrToken;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtLog;

    /**
     * Gets the value of the nIdRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNIdRetorno() {
        return nIdRetorno;
    }

    /**
     * Sets the value of the nIdRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNIdRetorno(Long value) {
        this.nIdRetorno = value;
    }

    /**
     * Gets the value of the sCdComplemento1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdComplemento1() {
        return sCdComplemento1;
    }

    /**
     * Sets the value of the sCdComplemento1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdComplemento1(JAXBElement<String> value) {
        this.sCdComplemento1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdComplemento2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdComplemento2() {
        return sCdComplemento2;
    }

    /**
     * Sets the value of the sCdComplemento2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdComplemento2(JAXBElement<String> value) {
        this.sCdComplemento2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdOrigem() {
        return sCdOrigem;
    }

    /**
     * Sets the value of the sCdOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdOrigem(JAXBElement<String> value) {
        this.sCdOrigem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsLog property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsLog() {
        return sDsLog;
    }

    /**
     * Sets the value of the sDsLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsLog(JAXBElement<String> value) {
        this.sDsLog = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrToken() {
        return sNrToken;
    }

    /**
     * Sets the value of the sNrToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrToken(JAXBElement<String> value) {
        this.sNrToken = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtLog property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtLog() {
        return tDtLog;
    }

    /**
     * Sets the value of the tDtLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtLog(XMLGregorianCalendar value) {
        this.tDtLog = value;
    }

}
