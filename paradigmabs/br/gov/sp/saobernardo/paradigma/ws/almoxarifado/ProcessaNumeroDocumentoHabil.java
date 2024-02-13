
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

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
 *         &lt;element name="lstNumeroDocumentoHabilDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfNumeroDocumentoHabilDTO" minOccurs="0"/>
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
    "lstNumeroDocumentoHabilDTO"
})
@XmlRootElement(name = "ProcessaNumeroDocumentoHabil", namespace = "http://tempuri.org/")
public class ProcessaNumeroDocumentoHabil {

    @XmlElementRef(name = "lstNumeroDocumentoHabilDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNumeroDocumentoHabilDTO> lstNumeroDocumentoHabilDTO;

    /**
     * Gets the value of the lstNumeroDocumentoHabilDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNumeroDocumentoHabilDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNumeroDocumentoHabilDTO> getLstNumeroDocumentoHabilDTO() {
        return lstNumeroDocumentoHabilDTO;
    }

    /**
     * Sets the value of the lstNumeroDocumentoHabilDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNumeroDocumentoHabilDTO }{@code >}
     *     
     */
    public void setLstNumeroDocumentoHabilDTO(JAXBElement<ArrayOfNumeroDocumentoHabilDTO> value) {
        this.lstNumeroDocumentoHabilDTO = ((JAXBElement<ArrayOfNumeroDocumentoHabilDTO> ) value);
    }

}
