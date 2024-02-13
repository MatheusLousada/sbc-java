
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
 *         &lt;element name="RetornarNotaFiscalResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfNotaFiscalDTO" minOccurs="0"/>
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
    "retornarNotaFiscalResult"
})
@XmlRootElement(name = "RetornarNotaFiscalResponse", namespace = "http://tempuri.org/")
public class RetornarNotaFiscalResponse {

    @XmlElementRef(name = "RetornarNotaFiscalResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNotaFiscalDTO> retornarNotaFiscalResult;

    /**
     * Gets the value of the retornarNotaFiscalResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNotaFiscalDTO> getRetornarNotaFiscalResult() {
        return retornarNotaFiscalResult;
    }

    /**
     * Sets the value of the retornarNotaFiscalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotaFiscalDTO }{@code >}
     *     
     */
    public void setRetornarNotaFiscalResult(JAXBElement<ArrayOfNotaFiscalDTO> value) {
        this.retornarNotaFiscalResult = ((JAXBElement<ArrayOfNotaFiscalDTO> ) value);
    }

}
