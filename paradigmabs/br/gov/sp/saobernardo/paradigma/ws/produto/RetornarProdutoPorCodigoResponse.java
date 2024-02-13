
package br.gov.sp.saobernardo.paradigma.ws.produto;

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
 *         &lt;element name="RetornarProdutoPorCodigoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_ProdutoDTO_x003E_" minOccurs="0"/>
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
    "retornarProdutoPorCodigoResult"
})
@XmlRootElement(name = "RetornarProdutoPorCodigoResponse", namespace = "http://tempuri.org/")
public class RetornarProdutoPorCodigoResponse {

    @XmlElementRef(name = "RetornarProdutoPorCodigoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CProdutoDTOX003E> retornarProdutoPorCodigoResult;

    /**
     * Gets the value of the retornarProdutoPorCodigoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CProdutoDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CProdutoDTOX003E> getRetornarProdutoPorCodigoResult() {
        return retornarProdutoPorCodigoResult;
    }

    /**
     * Sets the value of the retornarProdutoPorCodigoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CProdutoDTOX003E }{@code >}
     *     
     */
    public void setRetornarProdutoPorCodigoResult(JAXBElement<RetornoListaX003CProdutoDTOX003E> value) {
        this.retornarProdutoPorCodigoResult = ((JAXBElement<RetornoListaX003CProdutoDTOX003E> ) value);
    }

}
