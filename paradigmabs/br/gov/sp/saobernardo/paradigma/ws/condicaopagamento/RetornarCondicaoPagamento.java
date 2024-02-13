
package br.gov.sp.saobernardo.paradigma.ws.condicaopagamento;

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
 *         &lt;element name="sCdCondicaoPagamentoErp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sCdCondicaoPagamentoErp"
})
@XmlRootElement(name = "RetornarCondicaoPagamento", namespace = "http://tempuri.org/")
public class RetornarCondicaoPagamento {

    @XmlElementRef(name = "sCdCondicaoPagamentoErp", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdCondicaoPagamentoErp;

    /**
     * Gets the value of the sCdCondicaoPagamentoErp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdCondicaoPagamentoErp() {
        return sCdCondicaoPagamentoErp;
    }

    /**
     * Sets the value of the sCdCondicaoPagamentoErp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdCondicaoPagamentoErp(JAXBElement<String> value) {
        this.sCdCondicaoPagamentoErp = ((JAXBElement<String> ) value);
    }

}
