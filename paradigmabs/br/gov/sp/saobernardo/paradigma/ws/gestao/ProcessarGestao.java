
package br.gov.sp.saobernardo.paradigma.ws.gestao;

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
 *         &lt;element name="lstGestao" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfGestaoDTO" minOccurs="0"/>
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
    "lstGestao"
})
@XmlRootElement(name = "ProcessarGestao", namespace = "http://tempuri.org/")
public class ProcessarGestao {

    @XmlElementRef(name = "lstGestao", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfGestaoDTO> lstGestao;

    /**
     * Gets the value of the lstGestao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGestaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGestaoDTO> getLstGestao() {
        return lstGestao;
    }

    /**
     * Sets the value of the lstGestao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGestaoDTO }{@code >}
     *     
     */
    public void setLstGestao(JAXBElement<ArrayOfGestaoDTO> value) {
        this.lstGestao = ((JAXBElement<ArrayOfGestaoDTO> ) value);
    }

}
