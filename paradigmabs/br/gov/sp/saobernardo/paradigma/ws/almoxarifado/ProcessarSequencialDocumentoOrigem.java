
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
 *         &lt;element name="lstSequencialDocumentoHabilDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfSequencialDocumentoHabilDTO" minOccurs="0"/>
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
    "lstSequencialDocumentoHabilDTO"
})
@XmlRootElement(name = "ProcessarSequencialDocumentoOrigem", namespace = "http://tempuri.org/")
public class ProcessarSequencialDocumentoOrigem {

    @XmlElementRef(name = "lstSequencialDocumentoHabilDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfSequencialDocumentoHabilDTO> lstSequencialDocumentoHabilDTO;

    /**
     * Gets the value of the lstSequencialDocumentoHabilDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSequencialDocumentoHabilDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSequencialDocumentoHabilDTO> getLstSequencialDocumentoHabilDTO() {
        return lstSequencialDocumentoHabilDTO;
    }

    /**
     * Sets the value of the lstSequencialDocumentoHabilDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSequencialDocumentoHabilDTO }{@code >}
     *     
     */
    public void setLstSequencialDocumentoHabilDTO(JAXBElement<ArrayOfSequencialDocumentoHabilDTO> value) {
        this.lstSequencialDocumentoHabilDTO = ((JAXBElement<ArrayOfSequencialDocumentoHabilDTO> ) value);
    }

}
