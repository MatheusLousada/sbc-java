
package br.gov.sp.saobernardo.paradigma.ws.documento;

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
 *         &lt;element name="RetornarDocumentoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfDocumentoEmpresaDTO" minOccurs="0"/>
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
    "retornarDocumentoResult"
})
@XmlRootElement(name = "RetornarDocumentoResponse", namespace = "http://tempuri.org/")
public class RetornarDocumentoResponse {

    @XmlElementRef(name = "RetornarDocumentoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDocumentoEmpresaDTO> retornarDocumentoResult;

    /**
     * Gets the value of the retornarDocumentoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentoEmpresaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentoEmpresaDTO> getRetornarDocumentoResult() {
        return retornarDocumentoResult;
    }

    /**
     * Sets the value of the retornarDocumentoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentoEmpresaDTO }{@code >}
     *     
     */
    public void setRetornarDocumentoResult(JAXBElement<ArrayOfDocumentoEmpresaDTO> value) {
        this.retornarDocumentoResult = ((JAXBElement<ArrayOfDocumentoEmpresaDTO> ) value);
    }

}
