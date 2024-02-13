
package br.gov.sp.saobernardo.paradigma.ws.banco;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetornoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetornoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstWbtLogDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfWbtLogDTO"/>
 *         &lt;element name="nIdRetorno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sNrToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetornoDTO", propOrder = {
    "lstWbtLogDTO",
    "nIdRetorno",
    "sNrToken"
})
public class RetornoDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfWbtLogDTO lstWbtLogDTO;
    protected long nIdRetorno;
    @XmlElementRef(name = "sNrToken", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrToken;

    /**
     * Gets the value of the lstWbtLogDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWbtLogDTO }
     *     
     */
    public ArrayOfWbtLogDTO getLstWbtLogDTO() {
        return lstWbtLogDTO;
    }

    /**
     * Sets the value of the lstWbtLogDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWbtLogDTO }
     *     
     */
    public void setLstWbtLogDTO(ArrayOfWbtLogDTO value) {
        this.lstWbtLogDTO = value;
    }

    /**
     * Gets the value of the nIdRetorno property.
     * 
     */
    public long getNIdRetorno() {
        return nIdRetorno;
    }

    /**
     * Sets the value of the nIdRetorno property.
     * 
     */
    public void setNIdRetorno(long value) {
        this.nIdRetorno = value;
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

}
