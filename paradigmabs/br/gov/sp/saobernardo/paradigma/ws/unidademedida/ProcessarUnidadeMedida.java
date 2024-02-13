
package br.gov.sp.saobernardo.paradigma.ws.unidademedida;

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
 *         &lt;element name="lstUnidadeMedida" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfUnidadeMedidaDTO" minOccurs="0"/>
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
    "lstUnidadeMedida"
})
@XmlRootElement(name = "ProcessarUnidadeMedida", namespace = "http://tempuri.org/")
public class ProcessarUnidadeMedida {

    @XmlElementRef(name = "lstUnidadeMedida", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfUnidadeMedidaDTO> lstUnidadeMedida;

    /**
     * Gets the value of the lstUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnidadeMedidaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUnidadeMedidaDTO> getLstUnidadeMedida() {
        return lstUnidadeMedida;
    }

    /**
     * Sets the value of the lstUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnidadeMedidaDTO }{@code >}
     *     
     */
    public void setLstUnidadeMedida(JAXBElement<ArrayOfUnidadeMedidaDTO> value) {
        this.lstUnidadeMedida = ((JAXBElement<ArrayOfUnidadeMedidaDTO> ) value);
    }

}
