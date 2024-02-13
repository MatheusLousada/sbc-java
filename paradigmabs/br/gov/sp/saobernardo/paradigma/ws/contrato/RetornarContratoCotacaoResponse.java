
package br.gov.sp.saobernardo.paradigma.ws.contrato;

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
 *         &lt;element name="RetornarContratoCotacaoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfContratoDTO" minOccurs="0"/>
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
    "retornarContratoCotacaoResult"
})
@XmlRootElement(name = "RetornarContratoCotacaoResponse")
public class RetornarContratoCotacaoResponse {

    @XmlElementRef(name = "RetornarContratoCotacaoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfContratoDTO> retornarContratoCotacaoResult;

    /**
     * Gets the value of the retornarContratoCotacaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfContratoDTO> getRetornarContratoCotacaoResult() {
        return retornarContratoCotacaoResult;
    }

    /**
     * Sets the value of the retornarContratoCotacaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}
     *     
     */
    public void setRetornarContratoCotacaoResult(JAXBElement<ArrayOfContratoDTO> value) {
        this.retornarContratoCotacaoResult = ((JAXBElement<ArrayOfContratoDTO> ) value);
    }

}
