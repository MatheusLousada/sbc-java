
package br.gov.sp.saobernardo.paradigma.ws.leilao;

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
 *         &lt;element name="lstLeilao" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfLeilaoDTO" minOccurs="0"/>
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
    "lstLeilao"
})
@XmlRootElement(name = "ProcessarLeilao", namespace = "http://tempuri.org/")
public class ProcessarLeilao {

    @XmlElementRef(name = "lstLeilao", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfLeilaoDTO> lstLeilao;

    /**
     * Gets the value of the lstLeilao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLeilaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLeilaoDTO> getLstLeilao() {
        return lstLeilao;
    }

    /**
     * Sets the value of the lstLeilao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLeilaoDTO }{@code >}
     *     
     */
    public void setLstLeilao(JAXBElement<ArrayOfLeilaoDTO> value) {
        this.lstLeilao = ((JAXBElement<ArrayOfLeilaoDTO> ) value);
    }

}
