
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
 *         &lt;element name="RetornarEmpresaVencedoraSemDeParaResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaDTO" minOccurs="0"/>
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
    "retornarEmpresaVencedoraSemDeParaResult"
})
@XmlRootElement(name = "RetornarEmpresaVencedoraSemDeParaResponse", namespace = "http://tempuri.org/")
public class RetornarEmpresaVencedoraSemDeParaResponse {

    @XmlElementRef(name = "RetornarEmpresaVencedoraSemDeParaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaDTO> retornarEmpresaVencedoraSemDeParaResult;

    /**
     * Gets the value of the retornarEmpresaVencedoraSemDeParaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaDTO> getRetornarEmpresaVencedoraSemDeParaResult() {
        return retornarEmpresaVencedoraSemDeParaResult;
    }

    /**
     * Sets the value of the retornarEmpresaVencedoraSemDeParaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}
     *     
     */
    public void setRetornarEmpresaVencedoraSemDeParaResult(JAXBElement<ArrayOfEmpresaDTO> value) {
        this.retornarEmpresaVencedoraSemDeParaResult = ((JAXBElement<ArrayOfEmpresaDTO> ) value);
    }

}
