
package br.gov.sp.saobernardo.paradigma.ws.unidademedida;

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
 *         &lt;element name="ProcessarUnidadeMedidaResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoDTO" minOccurs="0"/>
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
    "processarUnidadeMedidaResult"
})
@XmlRootElement(name = "ProcessarUnidadeMedidaResponse", namespace = "http://tempuri.org/")
public class ProcessarUnidadeMedidaResponse {

    @XmlElementRef(name = "ProcessarUnidadeMedidaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoDTO> processarUnidadeMedidaResult;

    /**
     * Gets the value of the processarUnidadeMedidaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}
     *     
     */
    public JAXBElement<RetornoDTO> getProcessarUnidadeMedidaResult() {
        return processarUnidadeMedidaResult;
    }

    /**
     * Sets the value of the processarUnidadeMedidaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}
     *     
     */
    public void setProcessarUnidadeMedidaResult(JAXBElement<RetornoDTO> value) {
        this.processarUnidadeMedidaResult = ((JAXBElement<RetornoDTO> ) value);
    }

}
