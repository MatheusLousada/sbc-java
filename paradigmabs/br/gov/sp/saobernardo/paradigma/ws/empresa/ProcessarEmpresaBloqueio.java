
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
 *         &lt;element name="lstEmpresaBloqueio" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaBloqueioDTO" minOccurs="0"/>
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
    "lstEmpresaBloqueio"
})
@XmlRootElement(name = "ProcessarEmpresaBloqueio", namespace = "http://tempuri.org/")
public class ProcessarEmpresaBloqueio {

    @XmlElementRef(name = "lstEmpresaBloqueio", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaBloqueioDTO> lstEmpresaBloqueio;

    /**
     * Gets the value of the lstEmpresaBloqueio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaBloqueioDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaBloqueioDTO> getLstEmpresaBloqueio() {
        return lstEmpresaBloqueio;
    }

    /**
     * Sets the value of the lstEmpresaBloqueio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaBloqueioDTO }{@code >}
     *     
     */
    public void setLstEmpresaBloqueio(JAXBElement<ArrayOfEmpresaBloqueioDTO> value) {
        this.lstEmpresaBloqueio = ((JAXBElement<ArrayOfEmpresaBloqueioDTO> ) value);
    }

}
