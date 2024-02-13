
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
 *         &lt;element name="lstAtestoDocumentoHabilDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfRetornoAtestoDocumentoHabilDTO" minOccurs="0"/>
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
    "lstAtestoDocumentoHabilDTO"
})
@XmlRootElement(name = "ProcessarAtestoDocumentoHabil", namespace = "http://tempuri.org/")
public class ProcessarAtestoDocumentoHabil {

    @XmlElementRef(name = "lstAtestoDocumentoHabilDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRetornoAtestoDocumentoHabilDTO> lstAtestoDocumentoHabilDTO;

    /**
     * Gets the value of the lstAtestoDocumentoHabilDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRetornoAtestoDocumentoHabilDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRetornoAtestoDocumentoHabilDTO> getLstAtestoDocumentoHabilDTO() {
        return lstAtestoDocumentoHabilDTO;
    }

    /**
     * Sets the value of the lstAtestoDocumentoHabilDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRetornoAtestoDocumentoHabilDTO }{@code >}
     *     
     */
    public void setLstAtestoDocumentoHabilDTO(JAXBElement<ArrayOfRetornoAtestoDocumentoHabilDTO> value) {
        this.lstAtestoDocumentoHabilDTO = ((JAXBElement<ArrayOfRetornoAtestoDocumentoHabilDTO> ) value);
    }

}
