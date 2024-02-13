
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
 *         &lt;element name="RetornarAlcadaResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_WfAlcadaDTO_x003E_" minOccurs="0"/>
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
    "retornarAlcadaResult"
})
@XmlRootElement(name = "RetornarAlcadaResponse", namespace = "http://tempuri.org/")
public class RetornarAlcadaResponse {

    @XmlElementRef(name = "RetornarAlcadaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CWfAlcadaDTOX003E> retornarAlcadaResult;

    /**
     * Gets the value of the retornarAlcadaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CWfAlcadaDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CWfAlcadaDTOX003E> getRetornarAlcadaResult() {
        return retornarAlcadaResult;
    }

    /**
     * Sets the value of the retornarAlcadaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CWfAlcadaDTOX003E }{@code >}
     *     
     */
    public void setRetornarAlcadaResult(JAXBElement<RetornoListaX003CWfAlcadaDTOX003E> value) {
        this.retornarAlcadaResult = ((JAXBElement<RetornoListaX003CWfAlcadaDTOX003E> ) value);
    }

}
