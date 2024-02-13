
package br.gov.sp.saobernardo.paradigma.ws.empresa;

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
 *         &lt;element name="RetornarEmpresaLeilaoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaDTO" minOccurs="0"/>
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
    "retornarEmpresaLeilaoResult"
})
@XmlRootElement(name = "RetornarEmpresaLeilaoResponse", namespace = "http://tempuri.org/")
public class RetornarEmpresaLeilaoResponse {

    @XmlElementRef(name = "RetornarEmpresaLeilaoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaDTO> retornarEmpresaLeilaoResult;

    /**
     * Gets the value of the retornarEmpresaLeilaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaDTO> getRetornarEmpresaLeilaoResult() {
        return retornarEmpresaLeilaoResult;
    }

    /**
     * Sets the value of the retornarEmpresaLeilaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}
     *     
     */
    public void setRetornarEmpresaLeilaoResult(JAXBElement<ArrayOfEmpresaDTO> value) {
        this.retornarEmpresaLeilaoResult = ((JAXBElement<ArrayOfEmpresaDTO> ) value);
    }

}
