
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
 *         &lt;element name="RetornarEmpresaPorCnpjResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EmpresaDTO" minOccurs="0"/>
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
    "retornarEmpresaPorCnpjResult"
})
@XmlRootElement(name = "RetornarEmpresaPorCnpjResponse", namespace = "http://tempuri.org/")
public class RetornarEmpresaPorCnpjResponse {

    @XmlElementRef(name = "RetornarEmpresaPorCnpjResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<EmpresaDTO> retornarEmpresaPorCnpjResult;

    /**
     * Gets the value of the retornarEmpresaPorCnpjResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmpresaDTO }{@code >}
     *     
     */
    public JAXBElement<EmpresaDTO> getRetornarEmpresaPorCnpjResult() {
        return retornarEmpresaPorCnpjResult;
    }

    /**
     * Sets the value of the retornarEmpresaPorCnpjResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmpresaDTO }{@code >}
     *     
     */
    public void setRetornarEmpresaPorCnpjResult(JAXBElement<EmpresaDTO> value) {
        this.retornarEmpresaPorCnpjResult = ((JAXBElement<EmpresaDTO> ) value);
    }

}
