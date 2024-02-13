
package br.gov.sp.saobernardo.paradigma.ws.marca;

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
 *         &lt;element name="RetornarMarcaPorProdutoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_MarcaDTO_x003E_" minOccurs="0"/>
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
    "retornarMarcaPorProdutoResult"
})
@XmlRootElement(name = "RetornarMarcaPorProdutoResponse", namespace = "http://tempuri.org/")
public class RetornarMarcaPorProdutoResponse {

    @XmlElementRef(name = "RetornarMarcaPorProdutoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CMarcaDTOX003E> retornarMarcaPorProdutoResult;

    /**
     * Gets the value of the retornarMarcaPorProdutoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CMarcaDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CMarcaDTOX003E> getRetornarMarcaPorProdutoResult() {
        return retornarMarcaPorProdutoResult;
    }

    /**
     * Sets the value of the retornarMarcaPorProdutoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CMarcaDTOX003E }{@code >}
     *     
     */
    public void setRetornarMarcaPorProdutoResult(JAXBElement<RetornoListaX003CMarcaDTOX003E> value) {
        this.retornarMarcaPorProdutoResult = ((JAXBElement<RetornoListaX003CMarcaDTOX003E> ) value);
    }

}
