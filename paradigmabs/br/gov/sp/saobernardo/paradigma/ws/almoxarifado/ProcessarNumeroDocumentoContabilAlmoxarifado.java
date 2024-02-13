
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
 *         &lt;element name="lstNumeroDocumentoContabilDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO" minOccurs="0"/>
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
    "lstNumeroDocumentoContabilDTO"
})
@XmlRootElement(name = "ProcessarNumeroDocumentoContabilAlmoxarifado", namespace = "http://tempuri.org/")
public class ProcessarNumeroDocumentoContabilAlmoxarifado {

    @XmlElementRef(name = "lstNumeroDocumentoContabilDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO> lstNumeroDocumentoContabilDTO;

    /**
     * Gets the value of the lstNumeroDocumentoContabilDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO> getLstNumeroDocumentoContabilDTO() {
        return lstNumeroDocumentoContabilDTO;
    }

    /**
     * Sets the value of the lstNumeroDocumentoContabilDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO }{@code >}
     *     
     */
    public void setLstNumeroDocumentoContabilDTO(JAXBElement<ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO> value) {
        this.lstNumeroDocumentoContabilDTO = ((JAXBElement<ArrayOfNumeroDocumentoContabilAlmoxarifadoDTO> ) value);
    }

}
