
package br.gov.sp.saobernardo.paradigma.ws.centrocusto;

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
 *         &lt;element name="lstCentroCustoInativarDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCentroCustoDTO" minOccurs="0"/>
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
    "lstCentroCustoInativarDTO"
})
@XmlRootElement(name = "ProcessarInativarCentroCustoDePara", namespace = "http://tempuri.org/")
public class ProcessarInativarCentroCustoDePara {

    @XmlElementRef(name = "lstCentroCustoInativarDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCentroCustoDTO> lstCentroCustoInativarDTO;

    /**
     * Gets the value of the lstCentroCustoInativarDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCentroCustoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCentroCustoDTO> getLstCentroCustoInativarDTO() {
        return lstCentroCustoInativarDTO;
    }

    /**
     * Sets the value of the lstCentroCustoInativarDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCentroCustoDTO }{@code >}
     *     
     */
    public void setLstCentroCustoInativarDTO(JAXBElement<ArrayOfCentroCustoDTO> value) {
        this.lstCentroCustoInativarDTO = ((JAXBElement<ArrayOfCentroCustoDTO> ) value);
    }

}
