
package br.gov.sp.saobernardo.paradigma.ws.convite;

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
 *         &lt;element name="lstConvite" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfConviteDTO" minOccurs="0"/>
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
    "lstConvite"
})
@XmlRootElement(name = "ProcessarConvite", namespace = "http://tempuri.org/")
public class ProcessarConvite {

    @XmlElementRef(name = "lstConvite", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfConviteDTO> lstConvite;

    /**
     * Gets the value of the lstConvite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConviteDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfConviteDTO> getLstConvite() {
        return lstConvite;
    }

    /**
     * Sets the value of the lstConvite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConviteDTO }{@code >}
     *     
     */
    public void setLstConvite(JAXBElement<ArrayOfConviteDTO> value) {
        this.lstConvite = ((JAXBElement<ArrayOfConviteDTO> ) value);
    }

}
