
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
 *         &lt;element name="lstEmpresa" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaDTO" minOccurs="0"/>
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
    "lstEmpresa"
})
@XmlRootElement(name = "ProcessarEmpresa", namespace = "http://tempuri.org/")
public class ProcessarEmpresa {

    @XmlElementRef(name = "lstEmpresa", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaDTO> lstEmpresa;

    /**
     * Gets the value of the lstEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaDTO> getLstEmpresa() {
        return lstEmpresa;
    }

    /**
     * Sets the value of the lstEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaDTO }{@code >}
     *     
     */
    public void setLstEmpresa(JAXBElement<ArrayOfEmpresaDTO> value) {
        this.lstEmpresa = ((JAXBElement<ArrayOfEmpresaDTO> ) value);
    }

}
