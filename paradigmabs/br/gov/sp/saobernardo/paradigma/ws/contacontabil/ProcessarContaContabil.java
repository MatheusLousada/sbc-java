
package br.gov.sp.saobernardo.paradigma.ws.contacontabil;

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
 *         &lt;element name="lstContaContabil" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfContaContabilDTO" minOccurs="0"/>
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
    "lstContaContabil"
})
@XmlRootElement(name = "ProcessarContaContabil", namespace = "http://tempuri.org/")
public class ProcessarContaContabil {

    @XmlElementRef(name = "lstContaContabil", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfContaContabilDTO> lstContaContabil;

    /**
     * Gets the value of the lstContaContabil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContaContabilDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfContaContabilDTO> getLstContaContabil() {
        return lstContaContabil;
    }

    /**
     * Sets the value of the lstContaContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContaContabilDTO }{@code >}
     *     
     */
    public void setLstContaContabil(JAXBElement<ArrayOfContaContabilDTO> value) {
        this.lstContaContabil = ((JAXBElement<ArrayOfContaContabilDTO> ) value);
    }

}
