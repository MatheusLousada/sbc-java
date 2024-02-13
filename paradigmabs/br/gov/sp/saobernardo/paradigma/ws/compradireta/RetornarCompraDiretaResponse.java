
package br.gov.sp.saobernardo.paradigma.ws.compradireta;

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
 *         &lt;element name="RetornarCompraDiretaResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCompraDiretaDTO" minOccurs="0"/>
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
    "retornarCompraDiretaResult"
})
@XmlRootElement(name = "RetornarCompraDiretaResponse", namespace = "http://tempuri.org/")
public class RetornarCompraDiretaResponse {

    @XmlElementRef(name = "RetornarCompraDiretaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCompraDiretaDTO> retornarCompraDiretaResult;

    /**
     * Gets the value of the retornarCompraDiretaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCompraDiretaDTO> getRetornarCompraDiretaResult() {
        return retornarCompraDiretaResult;
    }

    /**
     * Sets the value of the retornarCompraDiretaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaDTO }{@code >}
     *     
     */
    public void setRetornarCompraDiretaResult(JAXBElement<ArrayOfCompraDiretaDTO> value) {
        this.retornarCompraDiretaResult = ((JAXBElement<ArrayOfCompraDiretaDTO> ) value);
    }

}
