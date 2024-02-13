
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
 *         &lt;element name="lstEmpenhoDesembolsoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpenhoDesembolsoDTO" minOccurs="0"/>
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
    "lstEmpenhoDesembolsoDTO"
})
@XmlRootElement(name = "ProcessarDesembolsoEmpenho", namespace = "http://tempuri.org/")
public class ProcessarDesembolsoEmpenho {

    @XmlElementRef(name = "lstEmpenhoDesembolsoDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpenhoDesembolsoDTO> lstEmpenhoDesembolsoDTO;

    /**
     * Gets the value of the lstEmpenhoDesembolsoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpenhoDesembolsoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpenhoDesembolsoDTO> getLstEmpenhoDesembolsoDTO() {
        return lstEmpenhoDesembolsoDTO;
    }

    /**
     * Sets the value of the lstEmpenhoDesembolsoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpenhoDesembolsoDTO }{@code >}
     *     
     */
    public void setLstEmpenhoDesembolsoDTO(JAXBElement<ArrayOfEmpenhoDesembolsoDTO> value) {
        this.lstEmpenhoDesembolsoDTO = ((JAXBElement<ArrayOfEmpenhoDesembolsoDTO> ) value);
    }

}
