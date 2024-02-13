
package br.gov.sp.saobernardo.paradigma.ws.empresa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="lstProcessoLeilaoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfProcessoLeilaoDTO" minOccurs="0"/>
 *         &lt;element name="nFlParticipa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "lstProcessoLeilaoDTO",
    "nFlParticipa"
})
@XmlRootElement(name = "RetornarEmpresaLeilao", namespace = "http://tempuri.org/")
public class RetornarEmpresaLeilao {

    @XmlElementRef(name = "lstProcessoLeilaoDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProcessoLeilaoDTO> lstProcessoLeilaoDTO;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Integer nFlParticipa;

    /**
     * Gets the value of the lstProcessoLeilaoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProcessoLeilaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProcessoLeilaoDTO> getLstProcessoLeilaoDTO() {
        return lstProcessoLeilaoDTO;
    }

    /**
     * Sets the value of the lstProcessoLeilaoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProcessoLeilaoDTO }{@code >}
     *     
     */
    public void setLstProcessoLeilaoDTO(JAXBElement<ArrayOfProcessoLeilaoDTO> value) {
        this.lstProcessoLeilaoDTO = ((JAXBElement<ArrayOfProcessoLeilaoDTO> ) value);
    }

    /**
     * Gets the value of the nFlParticipa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNFlParticipa() {
        return nFlParticipa;
    }

    /**
     * Sets the value of the nFlParticipa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNFlParticipa(Integer value) {
        this.nFlParticipa = value;
    }

}
