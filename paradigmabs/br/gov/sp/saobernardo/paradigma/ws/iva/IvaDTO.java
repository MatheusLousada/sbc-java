
package br.gov.sp.saobernardo.paradigma.ws.iva;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IvaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IvaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlAtivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lstIvaIdiomaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfIvaIdiomaDTO" minOccurs="0"/>
 *         &lt;element name="sCdIva" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsIva" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IvaDTO", propOrder = {
    "bFlAtivo",
    "lstIvaIdiomaDTO",
    "sCdIva",
    "sDsIva"
})
public class IvaDTO
    extends DtoBase
{

    protected int bFlAtivo;
    @XmlElementRef(name = "lstIvaIdiomaDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfIvaIdiomaDTO> lstIvaIdiomaDTO;
    @XmlElement(required = true, nillable = true)
    protected String sCdIva;
    @XmlElement(required = true, nillable = true)
    protected String sDsIva;

    /**
     * Gets the value of the bFlAtivo property.
     * 
     */
    public int getBFlAtivo() {
        return bFlAtivo;
    }

    /**
     * Sets the value of the bFlAtivo property.
     * 
     */
    public void setBFlAtivo(int value) {
        this.bFlAtivo = value;
    }

    /**
     * Gets the value of the lstIvaIdiomaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIvaIdiomaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfIvaIdiomaDTO> getLstIvaIdiomaDTO() {
        return lstIvaIdiomaDTO;
    }

    /**
     * Sets the value of the lstIvaIdiomaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIvaIdiomaDTO }{@code >}
     *     
     */
    public void setLstIvaIdiomaDTO(JAXBElement<ArrayOfIvaIdiomaDTO> value) {
        this.lstIvaIdiomaDTO = ((JAXBElement<ArrayOfIvaIdiomaDTO> ) value);
    }

    /**
     * Gets the value of the sCdIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdIva() {
        return sCdIva;
    }

    /**
     * Sets the value of the sCdIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdIva(String value) {
        this.sCdIva = value;
    }

    /**
     * Gets the value of the sDsIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsIva() {
        return sDsIva;
    }

    /**
     * Sets the value of the sDsIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsIva(String value) {
        this.sDsIva = value;
    }

}
