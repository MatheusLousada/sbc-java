
package br.gov.sp.saobernardo.paradigma.ws.moeda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoedaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoedaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstMoedaIdioma" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfMoedaIdiomaDTO" minOccurs="0"/>
 *         &lt;element name="sCdMoeda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsMoeda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sSgMoeda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoedaDTO", propOrder = {
    "lstMoedaIdioma",
    "sCdMoeda",
    "sDsMoeda",
    "sSgMoeda"
})
public class MoedaDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstMoedaIdioma", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfMoedaIdiomaDTO> lstMoedaIdioma;
    @XmlElement(required = true, nillable = true)
    protected String sCdMoeda;
    @XmlElement(required = true, nillable = true)
    protected String sDsMoeda;
    @XmlElement(required = true, nillable = true)
    protected String sSgMoeda;

    /**
     * Gets the value of the lstMoedaIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMoedaIdiomaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMoedaIdiomaDTO> getLstMoedaIdioma() {
        return lstMoedaIdioma;
    }

    /**
     * Sets the value of the lstMoedaIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMoedaIdiomaDTO }{@code >}
     *     
     */
    public void setLstMoedaIdioma(JAXBElement<ArrayOfMoedaIdiomaDTO> value) {
        this.lstMoedaIdioma = ((JAXBElement<ArrayOfMoedaIdiomaDTO> ) value);
    }

    /**
     * Gets the value of the sCdMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdMoeda() {
        return sCdMoeda;
    }

    /**
     * Sets the value of the sCdMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdMoeda(String value) {
        this.sCdMoeda = value;
    }

    /**
     * Gets the value of the sDsMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsMoeda() {
        return sDsMoeda;
    }

    /**
     * Sets the value of the sDsMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsMoeda(String value) {
        this.sDsMoeda = value;
    }

    /**
     * Gets the value of the sSgMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSgMoeda() {
        return sSgMoeda;
    }

    /**
     * Sets the value of the sSgMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSgMoeda(String value) {
        this.sSgMoeda = value;
    }

}
