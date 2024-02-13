
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
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdProdutoWBC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sCdProduto",
    "sCdProdutoWBC"
})
@XmlRootElement(name = "ProcessarProdutoCodigoDePara", namespace = "http://tempuri.org/")
public class ProcessarProdutoCodigoDePara {

    @XmlElementRef(name = "sCdProduto", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdProduto;
    @XmlElementRef(name = "sCdProdutoWBC", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdProdutoWBC;

    /**
     * Gets the value of the sCdProduto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdProduto() {
        return sCdProduto;
    }

    /**
     * Sets the value of the sCdProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdProduto(JAXBElement<String> value) {
        this.sCdProduto = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdProdutoWBC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdProdutoWBC() {
        return sCdProdutoWBC;
    }

    /**
     * Sets the value of the sCdProdutoWBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdProdutoWBC(JAXBElement<String> value) {
        this.sCdProdutoWBC = ((JAXBElement<String> ) value);
    }

}
