
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

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
 *         &lt;element name="oAmxKardexFiltroDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}AmxKardexFiltroDTO" minOccurs="0"/>
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
    "oAmxKardexFiltroDTO"
})
@XmlRootElement(name = "RetornarMovimentacao", namespace = "http://tempuri.org/")
public class RetornarMovimentacao {

    @XmlElementRef(name = "oAmxKardexFiltroDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<AmxKardexFiltroDTO> oAmxKardexFiltroDTO;

    /**
     * Gets the value of the oAmxKardexFiltroDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmxKardexFiltroDTO }{@code >}
     *     
     */
    public JAXBElement<AmxKardexFiltroDTO> getOAmxKardexFiltroDTO() {
        return oAmxKardexFiltroDTO;
    }

    /**
     * Sets the value of the oAmxKardexFiltroDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmxKardexFiltroDTO }{@code >}
     *     
     */
    public void setOAmxKardexFiltroDTO(JAXBElement<AmxKardexFiltroDTO> value) {
        this.oAmxKardexFiltroDTO = ((JAXBElement<AmxKardexFiltroDTO> ) value);
    }

}
