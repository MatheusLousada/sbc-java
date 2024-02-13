
package br.gov.sp.saobernardo.paradigma.ws.banco;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lstBanco" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfBancoDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lstBanco"
})
@XmlRootElement(name = "ProcessarBanco", namespace = "http://tempuri.org/")
public class ProcessarBanco {

    @XmlElementRef(name = "lstBanco", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfBancoDTO> lstBanco;

    /**
     * Gets the value of the lstBanco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBancoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBancoDTO> getLstBanco() {
        return lstBanco;
    }

    /**
     * Sets the value of the lstBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBancoDTO }{@code >}
     *     
     */
    public void setLstBanco(JAXBElement<ArrayOfBancoDTO> value) {
        this.lstBanco = ((JAXBElement<ArrayOfBancoDTO> ) value);
    }

}
