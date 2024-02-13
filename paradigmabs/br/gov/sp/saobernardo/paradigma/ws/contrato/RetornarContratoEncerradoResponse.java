
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
 *         &lt;element name="RetornarContratoEncerradoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfContratoDTO" minOccurs="0"/>
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
    "retornarContratoEncerradoResult"
})
@XmlRootElement(name = "RetornarContratoEncerradoResponse")
public class RetornarContratoEncerradoResponse {

    @XmlElementRef(name = "RetornarContratoEncerradoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfContratoDTO> retornarContratoEncerradoResult;

    /**
     * Gets the value of the retornarContratoEncerradoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfContratoDTO> getRetornarContratoEncerradoResult() {
        return retornarContratoEncerradoResult;
    }

    /**
     * Sets the value of the retornarContratoEncerradoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContratoDTO }{@code >}
     *     
     */
    public void setRetornarContratoEncerradoResult(JAXBElement<ArrayOfContratoDTO> value) {
        this.retornarContratoEncerradoResult = ((JAXBElement<ArrayOfContratoDTO> ) value);
    }

}
