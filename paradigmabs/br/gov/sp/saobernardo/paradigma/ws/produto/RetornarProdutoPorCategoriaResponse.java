
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
 *         &lt;element name="RetornarProdutoPorCategoriaResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfProdutoDTO" minOccurs="0"/>
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
    "retornarProdutoPorCategoriaResult"
})
@XmlRootElement(name = "RetornarProdutoPorCategoriaResponse", namespace = "http://tempuri.org/")
public class RetornarProdutoPorCategoriaResponse {

    @XmlElementRef(name = "RetornarProdutoPorCategoriaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProdutoDTO> retornarProdutoPorCategoriaResult;

    /**
     * Gets the value of the retornarProdutoPorCategoriaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProdutoDTO> getRetornarProdutoPorCategoriaResult() {
        return retornarProdutoPorCategoriaResult;
    }

    /**
     * Sets the value of the retornarProdutoPorCategoriaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProdutoDTO }{@code >}
     *     
     */
    public void setRetornarProdutoPorCategoriaResult(JAXBElement<ArrayOfProdutoDTO> value) {
        this.retornarProdutoPorCategoriaResult = ((JAXBElement<ArrayOfProdutoDTO> ) value);
    }

}
