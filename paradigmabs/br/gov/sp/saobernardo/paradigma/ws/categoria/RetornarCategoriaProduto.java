
package br.gov.sp.saobernardo.paradigma.ws.categoria;

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
 *         &lt;element name="sCdCategoriaProdutpERP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sCdCategoriaProdutpERP"
})
@XmlRootElement(name = "RetornarCategoriaProduto", namespace = "http://tempuri.org/")
public class RetornarCategoriaProduto {

    @XmlElementRef(name = "sCdCategoriaProdutpERP", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdCategoriaProdutpERP;

    /**
     * Gets the value of the sCdCategoriaProdutpERP property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdCategoriaProdutpERP() {
        return sCdCategoriaProdutpERP;
    }

    /**
     * Sets the value of the sCdCategoriaProdutpERP property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdCategoriaProdutpERP(JAXBElement<String> value) {
        this.sCdCategoriaProdutpERP = ((JAXBElement<String> ) value);
    }

}
