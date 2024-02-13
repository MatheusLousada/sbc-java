
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
 *         &lt;element name="RetornarMovimentacaoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_AmxKardexDTO_x003E_" minOccurs="0"/>
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
    "retornarMovimentacaoResult"
})
@XmlRootElement(name = "RetornarMovimentacaoResponse", namespace = "http://tempuri.org/")
public class RetornarMovimentacaoResponse {

    @XmlElementRef(name = "RetornarMovimentacaoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CAmxKardexDTOX003E> retornarMovimentacaoResult;

    /**
     * Gets the value of the retornarMovimentacaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CAmxKardexDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CAmxKardexDTOX003E> getRetornarMovimentacaoResult() {
        return retornarMovimentacaoResult;
    }

    /**
     * Sets the value of the retornarMovimentacaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CAmxKardexDTOX003E }{@code >}
     *     
     */
    public void setRetornarMovimentacaoResult(JAXBElement<RetornoListaX003CAmxKardexDTOX003E> value) {
        this.retornarMovimentacaoResult = ((JAXBElement<RetornoListaX003CAmxKardexDTOX003E> ) value);
    }

}
