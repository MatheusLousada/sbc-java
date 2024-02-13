
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
 *         &lt;element name="RetornarFornecedorIntegracaoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfFornecedorDTO" minOccurs="0"/>
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
    "retornarFornecedorIntegracaoResult"
})
@XmlRootElement(name = "RetornarFornecedorIntegracaoResponse", namespace = "http://tempuri.org/")
public class RetornarFornecedorIntegracaoResponse {

    @XmlElementRef(name = "RetornarFornecedorIntegracaoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFornecedorDTO> retornarFornecedorIntegracaoResult;

    /**
     * Gets the value of the retornarFornecedorIntegracaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFornecedorDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFornecedorDTO> getRetornarFornecedorIntegracaoResult() {
        return retornarFornecedorIntegracaoResult;
    }

    /**
     * Sets the value of the retornarFornecedorIntegracaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFornecedorDTO }{@code >}
     *     
     */
    public void setRetornarFornecedorIntegracaoResult(JAXBElement<ArrayOfFornecedorDTO> value) {
        this.retornarFornecedorIntegracaoResult = ((JAXBElement<ArrayOfFornecedorDTO> ) value);
    }

}
