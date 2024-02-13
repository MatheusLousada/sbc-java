
package br.gov.sp.saobernardo.paradigma.ws.empresabanco;

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
 *         &lt;element name="lstEmpresaBanco" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaBancoDTO" minOccurs="0"/>
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
    "lstEmpresaBanco"
})
@XmlRootElement(name = "ProcessarContaBancaria", namespace = "http://tempuri.org/")
public class ProcessarContaBancaria {

    @XmlElementRef(name = "lstEmpresaBanco", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaBancoDTO> lstEmpresaBanco;

    /**
     * Gets the value of the lstEmpresaBanco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaBancoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaBancoDTO> getLstEmpresaBanco() {
        return lstEmpresaBanco;
    }

    /**
     * Sets the value of the lstEmpresaBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaBancoDTO }{@code >}
     *     
     */
    public void setLstEmpresaBanco(JAXBElement<ArrayOfEmpresaBancoDTO> value) {
        this.lstEmpresaBanco = ((JAXBElement<ArrayOfEmpresaBancoDTO> ) value);
    }

}
