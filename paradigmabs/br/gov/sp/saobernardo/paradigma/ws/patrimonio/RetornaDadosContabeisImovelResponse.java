
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
 *         &lt;element name="RetornaDadosContabeisImovelResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_DadosContabeisDTO_x003E_" minOccurs="0"/>
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
    "retornaDadosContabeisImovelResult"
})
@XmlRootElement(name = "RetornaDadosContabeisImovelResponse", namespace = "http://tempuri.org/")
public class RetornaDadosContabeisImovelResponse {

    @XmlElementRef(name = "RetornaDadosContabeisImovelResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CDadosContabeisDTOX003E> retornaDadosContabeisImovelResult;

    /**
     * Gets the value of the retornaDadosContabeisImovelResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CDadosContabeisDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CDadosContabeisDTOX003E> getRetornaDadosContabeisImovelResult() {
        return retornaDadosContabeisImovelResult;
    }

    /**
     * Sets the value of the retornaDadosContabeisImovelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CDadosContabeisDTOX003E }{@code >}
     *     
     */
    public void setRetornaDadosContabeisImovelResult(JAXBElement<RetornoListaX003CDadosContabeisDTOX003E> value) {
        this.retornaDadosContabeisImovelResult = ((JAXBElement<RetornoListaX003CDadosContabeisDTOX003E> ) value);
    }

}
