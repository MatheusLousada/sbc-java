
package br.gov.sp.saobernardo.paradigma.ws.condicaopagamento;

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
 *         &lt;element name="lstCondicaoPagamento" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCondicaoPagamentoDTO" minOccurs="0"/>
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
    "lstCondicaoPagamento"
})
@XmlRootElement(name = "ProcessarCondicaoPagamento", namespace = "http://tempuri.org/")
public class ProcessarCondicaoPagamento {

    @XmlElementRef(name = "lstCondicaoPagamento", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCondicaoPagamentoDTO> lstCondicaoPagamento;

    /**
     * Gets the value of the lstCondicaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCondicaoPagamentoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCondicaoPagamentoDTO> getLstCondicaoPagamento() {
        return lstCondicaoPagamento;
    }

    /**
     * Sets the value of the lstCondicaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCondicaoPagamentoDTO }{@code >}
     *     
     */
    public void setLstCondicaoPagamento(JAXBElement<ArrayOfCondicaoPagamentoDTO> value) {
        this.lstCondicaoPagamento = ((JAXBElement<ArrayOfCondicaoPagamentoDTO> ) value);
    }

}
