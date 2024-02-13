
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
 *         &lt;element name="lstSequencialDocumentoOrigemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfSequencialDocumentoOrigemDTO" minOccurs="0"/>
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
    "lstSequencialDocumentoOrigemDTO"
})
@XmlRootElement(name = "ProcessarExcluirDocumentoOrigem", namespace = "http://tempuri.org/")
public class ProcessarExcluirDocumentoOrigem {

    @XmlElementRef(name = "lstSequencialDocumentoOrigemDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfSequencialDocumentoOrigemDTO> lstSequencialDocumentoOrigemDTO;

    /**
     * Gets the value of the lstSequencialDocumentoOrigemDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSequencialDocumentoOrigemDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSequencialDocumentoOrigemDTO> getLstSequencialDocumentoOrigemDTO() {
        return lstSequencialDocumentoOrigemDTO;
    }

    /**
     * Sets the value of the lstSequencialDocumentoOrigemDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSequencialDocumentoOrigemDTO }{@code >}
     *     
     */
    public void setLstSequencialDocumentoOrigemDTO(JAXBElement<ArrayOfSequencialDocumentoOrigemDTO> value) {
        this.lstSequencialDocumentoOrigemDTO = ((JAXBElement<ArrayOfSequencialDocumentoOrigemDTO> ) value);
    }

}
