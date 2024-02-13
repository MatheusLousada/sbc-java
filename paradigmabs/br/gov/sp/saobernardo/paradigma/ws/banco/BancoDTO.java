
package br.gov.sp.saobernardo.paradigma.ws.banco;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BancoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BancoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstAgenciaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfAgenciaBancoDTO" minOccurs="0"/>
 *         &lt;element name="nNrBanco" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nNrDigitoBanco" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdBanco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNmBanco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BancoDTO", propOrder = {
    "lstAgenciaDTO",
    "nNrBanco",
    "nNrDigitoBanco",
    "sCdBanco",
    "sCdPais",
    "sNmBanco"
})
public class BancoDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstAgenciaDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAgenciaBancoDTO> lstAgenciaDTO;
    @XmlElementRef(name = "nNrBanco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nNrBanco;
    @XmlElementRef(name = "nNrDigitoBanco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nNrDigitoBanco;
    @XmlElement(required = true, nillable = true)
    protected String sCdBanco;
    @XmlElementRef(name = "sCdPais", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdPais;
    @XmlElement(required = true, nillable = true)
    protected String sNmBanco;

    /**
     * Gets the value of the lstAgenciaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAgenciaBancoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAgenciaBancoDTO> getLstAgenciaDTO() {
        return lstAgenciaDTO;
    }

    /**
     * Sets the value of the lstAgenciaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAgenciaBancoDTO }{@code >}
     *     
     */
    public void setLstAgenciaDTO(JAXBElement<ArrayOfAgenciaBancoDTO> value) {
        this.lstAgenciaDTO = ((JAXBElement<ArrayOfAgenciaBancoDTO> ) value);
    }

    /**
     * Gets the value of the nNrBanco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNNrBanco() {
        return nNrBanco;
    }

    /**
     * Sets the value of the nNrBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNNrBanco(JAXBElement<Integer> value) {
        this.nNrBanco = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nNrDigitoBanco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNNrDigitoBanco() {
        return nNrDigitoBanco;
    }

    /**
     * Sets the value of the nNrDigitoBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNNrDigitoBanco(JAXBElement<Integer> value) {
        this.nNrDigitoBanco = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sCdBanco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdBanco() {
        return sCdBanco;
    }

    /**
     * Sets the value of the sCdBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdBanco(String value) {
        this.sCdBanco = value;
    }

    /**
     * Gets the value of the sCdPais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdPais() {
        return sCdPais;
    }

    /**
     * Sets the value of the sCdPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdPais(JAXBElement<String> value) {
        this.sCdPais = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNmBanco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmBanco() {
        return sNmBanco;
    }

    /**
     * Sets the value of the sNmBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmBanco(String value) {
        this.sNmBanco = value;
    }

}
