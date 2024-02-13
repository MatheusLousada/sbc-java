
package br.gov.sp.saobernardo.paradigma.ws.unidademedida;

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
 *         &lt;element name="RetornarUnidadeMedidaAtivaResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_UnidadeMedidaDTO_x003E_" minOccurs="0"/>
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
    "retornarUnidadeMedidaAtivaResult"
})
@XmlRootElement(name = "RetornarUnidadeMedidaAtivaResponse", namespace = "http://tempuri.org/")
public class RetornarUnidadeMedidaAtivaResponse {

    @XmlElementRef(name = "RetornarUnidadeMedidaAtivaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CUnidadeMedidaDTOX003E> retornarUnidadeMedidaAtivaResult;

    /**
     * Gets the value of the retornarUnidadeMedidaAtivaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CUnidadeMedidaDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CUnidadeMedidaDTOX003E> getRetornarUnidadeMedidaAtivaResult() {
        return retornarUnidadeMedidaAtivaResult;
    }

    /**
     * Sets the value of the retornarUnidadeMedidaAtivaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CUnidadeMedidaDTOX003E }{@code >}
     *     
     */
    public void setRetornarUnidadeMedidaAtivaResult(JAXBElement<RetornoListaX003CUnidadeMedidaDTOX003E> value) {
        this.retornarUnidadeMedidaAtivaResult = ((JAXBElement<RetornoListaX003CUnidadeMedidaDTOX003E> ) value);
    }

}
