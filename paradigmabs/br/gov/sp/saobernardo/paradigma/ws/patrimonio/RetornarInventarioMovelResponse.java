
package br.gov.sp.saobernardo.paradigma.ws.patrimonio;

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
 *         &lt;element name="RetornarInventarioMovelResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_InventarioMovelDTO_x003E_" minOccurs="0"/>
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
    "retornarInventarioMovelResult"
})
@XmlRootElement(name = "RetornarInventarioMovelResponse", namespace = "http://tempuri.org/")
public class RetornarInventarioMovelResponse {

    @XmlElementRef(name = "RetornarInventarioMovelResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CInventarioMovelDTOX003E> retornarInventarioMovelResult;

    /**
     * Gets the value of the retornarInventarioMovelResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CInventarioMovelDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CInventarioMovelDTOX003E> getRetornarInventarioMovelResult() {
        return retornarInventarioMovelResult;
    }

    /**
     * Sets the value of the retornarInventarioMovelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CInventarioMovelDTOX003E }{@code >}
     *     
     */
    public void setRetornarInventarioMovelResult(JAXBElement<RetornoListaX003CInventarioMovelDTOX003E> value) {
        this.retornarInventarioMovelResult = ((JAXBElement<RetornoListaX003CInventarioMovelDTOX003E> ) value);
    }

}
