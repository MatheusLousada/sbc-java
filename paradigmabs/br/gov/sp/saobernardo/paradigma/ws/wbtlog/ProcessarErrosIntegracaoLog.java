
package br.gov.sp.saobernardo.paradigma.ws.wbtlog;

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
 *         &lt;element name="lstIdentificadores" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
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
    "lstIdentificadores"
})
@XmlRootElement(name = "ProcessarErrosIntegracaoLog")
public class ProcessarErrosIntegracaoLog {

    @XmlElementRef(name = "lstIdentificadores", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfint> lstIdentificadores;

    /**
     * Gets the value of the lstIdentificadores property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getLstIdentificadores() {
        return lstIdentificadores;
    }

    /**
     * Sets the value of the lstIdentificadores property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setLstIdentificadores(JAXBElement<ArrayOfint> value) {
        this.lstIdentificadores = ((JAXBElement<ArrayOfint> ) value);
    }

}
