
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
 *         &lt;element name="RetornarAlmoxarifadoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_AlmoxarifadoDTO_x003E_" minOccurs="0"/>
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
    "retornarAlmoxarifadoResult"
})
@XmlRootElement(name = "RetornarAlmoxarifadoResponse", namespace = "http://tempuri.org/")
public class RetornarAlmoxarifadoResponse {

    @XmlElementRef(name = "RetornarAlmoxarifadoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CAlmoxarifadoDTOX003E> retornarAlmoxarifadoResult;

    /**
     * Gets the value of the retornarAlmoxarifadoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CAlmoxarifadoDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CAlmoxarifadoDTOX003E> getRetornarAlmoxarifadoResult() {
        return retornarAlmoxarifadoResult;
    }

    /**
     * Sets the value of the retornarAlmoxarifadoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CAlmoxarifadoDTOX003E }{@code >}
     *     
     */
    public void setRetornarAlmoxarifadoResult(JAXBElement<RetornoListaX003CAlmoxarifadoDTOX003E> value) {
        this.retornarAlmoxarifadoResult = ((JAXBElement<RetornoListaX003CAlmoxarifadoDTOX003E> ) value);
    }

}
