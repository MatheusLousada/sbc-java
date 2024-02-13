
package br.gov.sp.saobernardo.paradigma.ws.departamento;

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
 *         &lt;element name="lstDepartamentoInativarDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfDepartamentoEmpresaDTO" minOccurs="0"/>
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
    "lstDepartamentoInativarDTO"
})
@XmlRootElement(name = "ProcessarInativarDepartamentoDePara", namespace = "http://tempuri.org/")
public class ProcessarInativarDepartamentoDePara {

    @XmlElementRef(name = "lstDepartamentoInativarDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDepartamentoEmpresaDTO> lstDepartamentoInativarDTO;

    /**
     * Gets the value of the lstDepartamentoInativarDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDepartamentoEmpresaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDepartamentoEmpresaDTO> getLstDepartamentoInativarDTO() {
        return lstDepartamentoInativarDTO;
    }

    /**
     * Sets the value of the lstDepartamentoInativarDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDepartamentoEmpresaDTO }{@code >}
     *     
     */
    public void setLstDepartamentoInativarDTO(JAXBElement<ArrayOfDepartamentoEmpresaDTO> value) {
        this.lstDepartamentoInativarDTO = ((JAXBElement<ArrayOfDepartamentoEmpresaDTO> ) value);
    }

}
