
package br.gov.sp.saobernardo.paradigma.ws.prioridade;

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
 *         &lt;element name="RetornarPrioridadeResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_PrioridadeDTO_x003E_" minOccurs="0"/>
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
    "retornarPrioridadeResult"
})
@XmlRootElement(name = "RetornarPrioridadeResponse", namespace = "http://tempuri.org/")
public class RetornarPrioridadeResponse {

    @XmlElementRef(name = "RetornarPrioridadeResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CPrioridadeDTOX003E> retornarPrioridadeResult;

    /**
     * Gets the value of the retornarPrioridadeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CPrioridadeDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CPrioridadeDTOX003E> getRetornarPrioridadeResult() {
        return retornarPrioridadeResult;
    }

    /**
     * Sets the value of the retornarPrioridadeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CPrioridadeDTOX003E }{@code >}
     *     
     */
    public void setRetornarPrioridadeResult(JAXBElement<RetornoListaX003CPrioridadeDTOX003E> value) {
        this.retornarPrioridadeResult = ((JAXBElement<RetornoListaX003CPrioridadeDTOX003E> ) value);
    }

}
