
package br.gov.sp.saobernardo.paradigma.ws.compradireta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HabilitarCompraDiretaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HabilitarCompraDiretaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdComprador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrEdital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrProcessoDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HabilitarCompraDiretaDTO", propOrder = {
    "sCdComprador",
    "sNrEdital",
    "sNrProcessoDisplay"
})
public class HabilitarCompraDiretaDTO
    extends DtoBase
{

    protected String sCdComprador;
    @XmlElementRef(name = "sNrEdital", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrEdital;
    protected String sNrProcessoDisplay;

    /**
     * Gets the value of the sCdComprador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdComprador() {
        return sCdComprador;
    }

    /**
     * Sets the value of the sCdComprador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdComprador(String value) {
        this.sCdComprador = value;
    }

    /**
     * Gets the value of the sNrEdital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrEdital() {
        return sNrEdital;
    }

    /**
     * Sets the value of the sNrEdital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrEdital(JAXBElement<String> value) {
        this.sNrEdital = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrProcessoDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrProcessoDisplay() {
        return sNrProcessoDisplay;
    }

    /**
     * Sets the value of the sNrProcessoDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrProcessoDisplay(String value) {
        this.sNrProcessoDisplay = value;
    }

}
