
package br.gov.sp.saobernardo.paradigma.ws.centrocusto;

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
 *         &lt;element name="RetornarCentroCustoPorDepartamentoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_CentroCustoDTO_x003E_" minOccurs="0"/>
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
    "retornarCentroCustoPorDepartamentoResult"
})
@XmlRootElement(name = "RetornarCentroCustoPorDepartamentoResponse", namespace = "http://tempuri.org/")
public class RetornarCentroCustoPorDepartamentoResponse {

    @XmlElementRef(name = "RetornarCentroCustoPorDepartamentoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CCentroCustoDTOX003E> retornarCentroCustoPorDepartamentoResult;

    /**
     * Gets the value of the retornarCentroCustoPorDepartamentoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CCentroCustoDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CCentroCustoDTOX003E> getRetornarCentroCustoPorDepartamentoResult() {
        return retornarCentroCustoPorDepartamentoResult;
    }

    /**
     * Sets the value of the retornarCentroCustoPorDepartamentoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CCentroCustoDTOX003E }{@code >}
     *     
     */
    public void setRetornarCentroCustoPorDepartamentoResult(JAXBElement<RetornoListaX003CCentroCustoDTOX003E> value) {
        this.retornarCentroCustoPorDepartamentoResult = ((JAXBElement<RetornoListaX003CCentroCustoDTOX003E> ) value);
    }

}
