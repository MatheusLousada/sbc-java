
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
 *         &lt;element name="RetornarAlcadaUsuarioResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_WfAlcadaUsuarioDTO_x003E_" minOccurs="0"/>
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
    "retornarAlcadaUsuarioResult"
})
@XmlRootElement(name = "RetornarAlcadaUsuarioResponse", namespace = "http://tempuri.org/")
public class RetornarAlcadaUsuarioResponse {

    @XmlElementRef(name = "RetornarAlcadaUsuarioResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CWfAlcadaUsuarioDTOX003E> retornarAlcadaUsuarioResult;

    /**
     * Gets the value of the retornarAlcadaUsuarioResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CWfAlcadaUsuarioDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CWfAlcadaUsuarioDTOX003E> getRetornarAlcadaUsuarioResult() {
        return retornarAlcadaUsuarioResult;
    }

    /**
     * Sets the value of the retornarAlcadaUsuarioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CWfAlcadaUsuarioDTOX003E }{@code >}
     *     
     */
    public void setRetornarAlcadaUsuarioResult(JAXBElement<RetornoListaX003CWfAlcadaUsuarioDTOX003E> value) {
        this.retornarAlcadaUsuarioResult = ((JAXBElement<RetornoListaX003CWfAlcadaUsuarioDTOX003E> ) value);
    }

}
