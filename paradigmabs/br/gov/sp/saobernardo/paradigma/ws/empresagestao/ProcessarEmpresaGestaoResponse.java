
package br.gov.sp.saobernardo.paradigma.ws.empresagestao;

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
 *         &lt;element name="ProcessarEmpresaGestaoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoDTO" minOccurs="0"/>
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
    "processarEmpresaGestaoResult"
})
@XmlRootElement(name = "ProcessarEmpresaGestaoResponse", namespace = "http://tempuri.org/")
public class ProcessarEmpresaGestaoResponse {

    @XmlElementRef(name = "ProcessarEmpresaGestaoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoDTO> processarEmpresaGestaoResult;

    /**
     * Gets the value of the processarEmpresaGestaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}
     *     
     */
    public JAXBElement<RetornoDTO> getProcessarEmpresaGestaoResult() {
        return processarEmpresaGestaoResult;
    }

    /**
     * Sets the value of the processarEmpresaGestaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoDTO }{@code >}
     *     
     */
    public void setProcessarEmpresaGestaoResult(JAXBElement<RetornoDTO> value) {
        this.processarEmpresaGestaoResult = ((JAXBElement<RetornoDTO> ) value);
    }

}