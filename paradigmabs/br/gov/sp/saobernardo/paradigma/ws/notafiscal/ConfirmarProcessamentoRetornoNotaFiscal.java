
package br.gov.sp.saobernardo.paradigma.ws.notafiscal;

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
 *         &lt;element name="lstNotaFiscalFiltroDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfNotaFiscalFiltroDTO" minOccurs="0"/>
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
    "lstNotaFiscalFiltroDTO"
})
@XmlRootElement(name = "ConfirmarProcessamentoRetornoNotaFiscal", namespace = "http://tempuri.org/")
public class ConfirmarProcessamentoRetornoNotaFiscal {

    @XmlElementRef(name = "lstNotaFiscalFiltroDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNotaFiscalFiltroDTO> lstNotaFiscalFiltroDTO;

    /**
     * Gets the value of the lstNotaFiscalFiltroDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalFiltroDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNotaFiscalFiltroDTO> getLstNotaFiscalFiltroDTO() {
        return lstNotaFiscalFiltroDTO;
    }

    /**
     * Sets the value of the lstNotaFiscalFiltroDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalFiltroDTO }{@code >}
     *     
     */
    public void setLstNotaFiscalFiltroDTO(JAXBElement<ArrayOfNotaFiscalFiltroDTO> value) {
        this.lstNotaFiscalFiltroDTO = ((JAXBElement<ArrayOfNotaFiscalFiltroDTO> ) value);
    }

}
