
package br.gov.sp.saobernardo.paradigma.ws.ordemcompra;

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
 *         &lt;element name="RetornarOrdemCompraConsumoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_OrdemCompraConsumoDTO_x003E_" minOccurs="0"/>
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
    "retornarOrdemCompraConsumoResult"
})
@XmlRootElement(name = "RetornarOrdemCompraConsumoResponse", namespace = "http://tempuri.org/")
public class RetornarOrdemCompraConsumoResponse {

    @XmlElementRef(name = "RetornarOrdemCompraConsumoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003COrdemCompraConsumoDTOX003E> retornarOrdemCompraConsumoResult;

    /**
     * Gets the value of the retornarOrdemCompraConsumoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003COrdemCompraConsumoDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003COrdemCompraConsumoDTOX003E> getRetornarOrdemCompraConsumoResult() {
        return retornarOrdemCompraConsumoResult;
    }

    /**
     * Sets the value of the retornarOrdemCompraConsumoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003COrdemCompraConsumoDTOX003E }{@code >}
     *     
     */
    public void setRetornarOrdemCompraConsumoResult(JAXBElement<RetornoListaX003COrdemCompraConsumoDTOX003E> value) {
        this.retornarOrdemCompraConsumoResult = ((JAXBElement<RetornoListaX003COrdemCompraConsumoDTOX003E> ) value);
    }

}
