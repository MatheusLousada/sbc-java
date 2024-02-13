
package br.gov.sp.saobernardo.paradigma.ws.produto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="nNrPagina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "nNrPagina"
})
@XmlRootElement(name = "RetornarProdutoPorCodigo", namespace = "http://tempuri.org/")
public class RetornarProdutoPorCodigo {

    @XmlElementRef(name = "sCdProduto", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdProduto;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Integer nNrPagina;

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
     * Gets the value of the nNrPagina property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNNrPagina() {
        return nNrPagina;
    }

    /**
     * Sets the value of the nNrPagina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNNrPagina(Integer value) {
        this.nNrPagina = value;
    }

}
