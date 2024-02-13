
package br.gov.sp.saobernardo.paradigma.ws.empenho;

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
 *         &lt;element name="lstEmpenhoItemCapaDto" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpenhoItemCapaDTO" minOccurs="0"/>
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
    "lstEmpenhoItemCapaDto"
})
@XmlRootElement(name = "ProcessarEmpenhoItem", namespace = "http://tempuri.org/")
public class ProcessarEmpenhoItem {

    @XmlElementRef(name = "lstEmpenhoItemCapaDto", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpenhoItemCapaDTO> lstEmpenhoItemCapaDto;

    /**
     * Gets the value of the lstEmpenhoItemCapaDto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpenhoItemCapaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpenhoItemCapaDTO> getLstEmpenhoItemCapaDto() {
        return lstEmpenhoItemCapaDto;
    }

    /**
     * Sets the value of the lstEmpenhoItemCapaDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpenhoItemCapaDTO }{@code >}
     *     
     */
    public void setLstEmpenhoItemCapaDto(JAXBElement<ArrayOfEmpenhoItemCapaDTO> value) {
        this.lstEmpenhoItemCapaDto = ((JAXBElement<ArrayOfEmpenhoItemCapaDTO> ) value);
    }

}
