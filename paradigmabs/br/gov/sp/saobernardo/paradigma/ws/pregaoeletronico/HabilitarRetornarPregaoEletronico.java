
package br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico;

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
 *         &lt;element name="lstHabilitarPregaoEletronicoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfHabilitarPregaoEletronicoDTO" minOccurs="0"/>
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
    "lstHabilitarPregaoEletronicoDTO"
})
@XmlRootElement(name = "HabilitarRetornarPregaoEletronico", namespace = "http://tempuri.org/")
public class HabilitarRetornarPregaoEletronico {

    @XmlElementRef(name = "lstHabilitarPregaoEletronicoDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfHabilitarPregaoEletronicoDTO> lstHabilitarPregaoEletronicoDTO;

    /**
     * Gets the value of the lstHabilitarPregaoEletronicoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHabilitarPregaoEletronicoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHabilitarPregaoEletronicoDTO> getLstHabilitarPregaoEletronicoDTO() {
        return lstHabilitarPregaoEletronicoDTO;
    }

    /**
     * Sets the value of the lstHabilitarPregaoEletronicoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHabilitarPregaoEletronicoDTO }{@code >}
     *     
     */
    public void setLstHabilitarPregaoEletronicoDTO(JAXBElement<ArrayOfHabilitarPregaoEletronicoDTO> value) {
        this.lstHabilitarPregaoEletronicoDTO = ((JAXBElement<ArrayOfHabilitarPregaoEletronicoDTO> ) value);
    }

}
