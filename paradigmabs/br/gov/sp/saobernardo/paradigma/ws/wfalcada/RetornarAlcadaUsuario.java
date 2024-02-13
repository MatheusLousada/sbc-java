
package br.gov.sp.saobernardo.paradigma.ws.wfalcada;

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
 *         &lt;element name="wfAlcadaUsuarioPesquisaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}WfAlcadaUsuarioPesquisaDTO" minOccurs="0"/>
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
    "wfAlcadaUsuarioPesquisaDTO"
})
@XmlRootElement(name = "RetornarAlcadaUsuario", namespace = "http://tempuri.org/")
public class RetornarAlcadaUsuario {

    @XmlElementRef(name = "wfAlcadaUsuarioPesquisaDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<WfAlcadaUsuarioPesquisaDTO> wfAlcadaUsuarioPesquisaDTO;

    /**
     * Gets the value of the wfAlcadaUsuarioPesquisaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WfAlcadaUsuarioPesquisaDTO }{@code >}
     *     
     */
    public JAXBElement<WfAlcadaUsuarioPesquisaDTO> getWfAlcadaUsuarioPesquisaDTO() {
        return wfAlcadaUsuarioPesquisaDTO;
    }

    /**
     * Sets the value of the wfAlcadaUsuarioPesquisaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WfAlcadaUsuarioPesquisaDTO }{@code >}
     *     
     */
    public void setWfAlcadaUsuarioPesquisaDTO(JAXBElement<WfAlcadaUsuarioPesquisaDTO> value) {
        this.wfAlcadaUsuarioPesquisaDTO = ((JAXBElement<WfAlcadaUsuarioPesquisaDTO> ) value);
    }

}
