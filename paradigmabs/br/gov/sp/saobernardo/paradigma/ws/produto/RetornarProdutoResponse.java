
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
 *         &lt;element name="RetornarProdutoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ProdutoDTO" minOccurs="0"/>
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
    "retornarProdutoResult"
})
@XmlRootElement(name = "RetornarProdutoResponse", namespace = "http://tempuri.org/")
public class RetornarProdutoResponse {

    @XmlElementRef(name = "RetornarProdutoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ProdutoDTO> retornarProdutoResult;

    /**
     * Gets the value of the retornarProdutoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProdutoDTO }{@code >}
     *     
     */
    public JAXBElement<ProdutoDTO> getRetornarProdutoResult() {
        return retornarProdutoResult;
    }

    /**
     * Sets the value of the retornarProdutoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProdutoDTO }{@code >}
     *     
     */
    public void setRetornarProdutoResult(JAXBElement<ProdutoDTO> value) {
        this.retornarProdutoResult = ((JAXBElement<ProdutoDTO> ) value);
    }

}
