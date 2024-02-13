
package br.gov.sp.saobernardo.paradigma.ws.patrimonio;

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
 *         &lt;element name="lstIventarioMovelDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfInventarioMovelDTO" minOccurs="0"/>
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
    "lstIventarioMovelDTO"
})
@XmlRootElement(name = "ProcessarInventarioMovel", namespace = "http://tempuri.org/")
public class ProcessarInventarioMovel {

    @XmlElementRef(name = "lstIventarioMovelDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfInventarioMovelDTO> lstIventarioMovelDTO;

    /**
     * Gets the value of the lstIventarioMovelDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventarioMovelDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInventarioMovelDTO> getLstIventarioMovelDTO() {
        return lstIventarioMovelDTO;
    }

    /**
     * Sets the value of the lstIventarioMovelDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventarioMovelDTO }{@code >}
     *     
     */
    public void setLstIventarioMovelDTO(JAXBElement<ArrayOfInventarioMovelDTO> value) {
        this.lstIventarioMovelDTO = ((JAXBElement<ArrayOfInventarioMovelDTO> ) value);
    }

}
