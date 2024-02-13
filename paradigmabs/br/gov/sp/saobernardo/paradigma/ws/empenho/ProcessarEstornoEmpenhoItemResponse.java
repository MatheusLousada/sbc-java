
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
 *         &lt;element name="ProcessarEstornoEmpenhoItemResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoDTO" minOccurs="0"/>
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
    "processarEstornoEmpenhoItemResult"
})
@XmlRootElement(name = "ProcessarEstornoEmpenhoItemResponse", namespace = "http://tempuri.org/")
public class ProcessarEstornoEmpenhoItemResponse {

    @XmlElementRef(name = "ProcessarEstornoEmpenhoItemResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoDTO> processarEstornoEmpenhoItemResult;

    /**
     * Gets the value of the processarEstornoEmpenhoItemResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}
     *     
     */
    public JAXBElement<RetornoDTO> getProcessarEstornoEmpenhoItemResult() {
        return processarEstornoEmpenhoItemResult;
    }

    /**
     * Sets the value of the processarEstornoEmpenhoItemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}
     *     
     */
    public void setProcessarEstornoEmpenhoItemResult(JAXBElement<RetornoDTO> value) {
        this.processarEstornoEmpenhoItemResult = ((JAXBElement<RetornoDTO> ) value);
    }

}
