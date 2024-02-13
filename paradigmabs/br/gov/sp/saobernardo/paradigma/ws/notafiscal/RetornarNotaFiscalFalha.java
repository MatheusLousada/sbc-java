
package br.gov.sp.saobernardo.paradigma.ws.notafiscal;

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
 *         &lt;element name="lstLog" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfWbtLogCapaDTO" minOccurs="0"/>
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
    "lstLog"
})
@XmlRootElement(name = "RetornarNotaFiscalFalha", namespace = "http://tempuri.org/")
public class RetornarNotaFiscalFalha {

    @XmlElementRef(name = "lstLog", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfWbtLogCapaDTO> lstLog;

    /**
     * Gets the value of the lstLog property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWbtLogCapaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWbtLogCapaDTO> getLstLog() {
        return lstLog;
    }

    /**
     * Sets the value of the lstLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWbtLogCapaDTO }{@code >}
     *     
     */
    public void setLstLog(JAXBElement<ArrayOfWbtLogCapaDTO> value) {
        this.lstLog = ((JAXBElement<ArrayOfWbtLogCapaDTO> ) value);
    }

}
