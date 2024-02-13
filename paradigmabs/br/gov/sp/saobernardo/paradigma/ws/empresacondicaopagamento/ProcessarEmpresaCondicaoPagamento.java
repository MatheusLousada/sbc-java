
package br.gov.sp.saobernardo.paradigma.ws.empresacondicaopagamento;

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
 *         &lt;element name="lstEmpresaCondicaoPagamento" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaCondicaoPagamentoDTO" minOccurs="0"/>
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
    "lstEmpresaCondicaoPagamento"
})
@XmlRootElement(name = "ProcessarEmpresaCondicaoPagamento", namespace = "http://tempuri.org/")
public class ProcessarEmpresaCondicaoPagamento {

    @XmlElementRef(name = "lstEmpresaCondicaoPagamento", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaCondicaoPagamentoDTO> lstEmpresaCondicaoPagamento;

    /**
     * Gets the value of the lstEmpresaCondicaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaCondicaoPagamentoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaCondicaoPagamentoDTO> getLstEmpresaCondicaoPagamento() {
        return lstEmpresaCondicaoPagamento;
    }

    /**
     * Sets the value of the lstEmpresaCondicaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaCondicaoPagamentoDTO }{@code >}
     *     
     */
    public void setLstEmpresaCondicaoPagamento(JAXBElement<ArrayOfEmpresaCondicaoPagamentoDTO> value) {
        this.lstEmpresaCondicaoPagamento = ((JAXBElement<ArrayOfEmpresaCondicaoPagamentoDTO> ) value);
    }

}
