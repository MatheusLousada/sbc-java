
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
 *         &lt;element name="RetornarProdutoSemDeParaResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_ProdutoDTO_x003E_" minOccurs="0"/>
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
    "retornarProdutoSemDeParaResult"
})
@XmlRootElement(name = "RetornarProdutoSemDeParaResponse", namespace = "http://tempuri.org/")
public class RetornarProdutoSemDeParaResponse {

    @XmlElementRef(name = "RetornarProdutoSemDeParaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CProdutoDTOX003E> retornarProdutoSemDeParaResult;

    /**
     * Gets the value of the retornarProdutoSemDeParaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CProdutoDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CProdutoDTOX003E> getRetornarProdutoSemDeParaResult() {
        return retornarProdutoSemDeParaResult;
    }

    /**
     * Sets the value of the retornarProdutoSemDeParaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CProdutoDTOX003E }{@code >}
     *     
     */
    public void setRetornarProdutoSemDeParaResult(JAXBElement<RetornoListaX003CProdutoDTOX003E> value) {
        this.retornarProdutoSemDeParaResult = ((JAXBElement<RetornoListaX003CProdutoDTOX003E> ) value);
    }

}
