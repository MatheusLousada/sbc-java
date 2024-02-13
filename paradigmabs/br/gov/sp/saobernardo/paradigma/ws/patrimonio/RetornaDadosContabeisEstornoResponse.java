
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
 *         &lt;element name="RetornaDadosContabeisEstornoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_DadosContabeisEstornoDTO_x003E_" minOccurs="0"/>
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
    "retornaDadosContabeisEstornoResult"
})
@XmlRootElement(name = "RetornaDadosContabeisEstornoResponse", namespace = "http://tempuri.org/")
public class RetornaDadosContabeisEstornoResponse {

    @XmlElementRef(name = "RetornaDadosContabeisEstornoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CDadosContabeisEstornoDTOX003E> retornaDadosContabeisEstornoResult;

    /**
     * Gets the value of the retornaDadosContabeisEstornoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CDadosContabeisEstornoDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CDadosContabeisEstornoDTOX003E> getRetornaDadosContabeisEstornoResult() {
        return retornaDadosContabeisEstornoResult;
    }

    /**
     * Sets the value of the retornaDadosContabeisEstornoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CDadosContabeisEstornoDTOX003E }{@code >}
     *     
     */
    public void setRetornaDadosContabeisEstornoResult(JAXBElement<RetornoListaX003CDadosContabeisEstornoDTOX003E> value) {
        this.retornaDadosContabeisEstornoResult = ((JAXBElement<RetornoListaX003CDadosContabeisEstornoDTOX003E> ) value);
    }

}
