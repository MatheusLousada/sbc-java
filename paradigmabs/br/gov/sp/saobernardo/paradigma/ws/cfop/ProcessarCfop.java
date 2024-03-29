
package br.gov.sp.saobernardo.paradigma.ws.cfop;

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
 *         &lt;element name="lstCfop" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCfopDTO" minOccurs="0"/>
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
    "lstCfop"
})
@XmlRootElement(name = "ProcessarCfop", namespace = "http://tempuri.org/")
public class ProcessarCfop {

    @XmlElementRef(name = "lstCfop", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCfopDTO> lstCfop;

    /**
     * Gets the value of the lstCfop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCfopDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCfopDTO> getLstCfop() {
        return lstCfop;
    }

    /**
     * Sets the value of the lstCfop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCfopDTO }{@code >}
     *     
     */
    public void setLstCfop(JAXBElement<ArrayOfCfopDTO> value) {
        this.lstCfop = ((JAXBElement<ArrayOfCfopDTO> ) value);
    }

}
