
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
 *         &lt;element name="sDsProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sStProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sDsProduto",
    "sStProduto",
    "nNrPagina"
})
@XmlRootElement(name = "RetornarProdutoEmContratoPorDescricao", namespace = "http://tempuri.org/")
public class RetornarProdutoEmContratoPorDescricao {

    @XmlElementRef(name = "sDsProduto", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sDsProduto;
    @XmlElementRef(name = "sStProduto", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sStProduto;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Integer nNrPagina;

    /**
     * Gets the value of the sDsProduto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsProduto() {
        return sDsProduto;
    }

    /**
     * Sets the value of the sDsProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsProduto(JAXBElement<String> value) {
        this.sDsProduto = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sStProduto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSStProduto() {
        return sStProduto;
    }

    /**
     * Sets the value of the sStProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSStProduto(JAXBElement<String> value) {
        this.sStProduto = ((JAXBElement<String> ) value);
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
