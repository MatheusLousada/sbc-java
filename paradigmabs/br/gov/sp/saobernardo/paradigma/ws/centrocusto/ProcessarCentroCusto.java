
package br.gov.sp.saobernardo.paradigma.ws.centrocusto;

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
 *         &lt;element name="lstCentroCusto" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCentroCustoDTO" minOccurs="0"/>
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
    "lstCentroCusto"
})
@XmlRootElement(name = "ProcessarCentroCusto", namespace = "http://tempuri.org/")
public class ProcessarCentroCusto {

    @XmlElementRef(name = "lstCentroCusto", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCentroCustoDTO> lstCentroCusto;

    /**
     * Gets the value of the lstCentroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCentroCustoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCentroCustoDTO> getLstCentroCusto() {
        return lstCentroCusto;
    }

    /**
     * Sets the value of the lstCentroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCentroCustoDTO }{@code >}
     *     
     */
    public void setLstCentroCusto(JAXBElement<ArrayOfCentroCustoDTO> value) {
        this.lstCentroCusto = ((JAXBElement<ArrayOfCentroCustoDTO> ) value);
    }

}
