
package br.gov.sp.saobernardo.paradigma.ws.unidadenegocio;

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
 *         &lt;element name="lstUnidadeNegocio" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfUnidadeNegocioDTO" minOccurs="0"/>
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
    "lstUnidadeNegocio"
})
@XmlRootElement(name = "ProcessarUnidadeNegocio", namespace = "http://tempuri.org/")
public class ProcessarUnidadeNegocio {

    @XmlElementRef(name = "lstUnidadeNegocio", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfUnidadeNegocioDTO> lstUnidadeNegocio;

    /**
     * Gets the value of the lstUnidadeNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnidadeNegocioDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUnidadeNegocioDTO> getLstUnidadeNegocio() {
        return lstUnidadeNegocio;
    }

    /**
     * Sets the value of the lstUnidadeNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnidadeNegocioDTO }{@code >}
     *     
     */
    public void setLstUnidadeNegocio(JAXBElement<ArrayOfUnidadeNegocioDTO> value) {
        this.lstUnidadeNegocio = ((JAXBElement<ArrayOfUnidadeNegocioDTO> ) value);
    }

}
