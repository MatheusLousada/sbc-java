
package br.gov.sp.saobernardo.paradigma.ws.unidademedida;

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
 *         &lt;element name="sCdUnidadeMedidaErp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sCdUnidadeMedidaErp"
})
@XmlRootElement(name = "RetornarUnidadeMedida", namespace = "http://tempuri.org/")
public class RetornarUnidadeMedida {

    @XmlElementRef(name = "sCdUnidadeMedidaErp", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdUnidadeMedidaErp;

    /**
     * Gets the value of the sCdUnidadeMedidaErp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUnidadeMedidaErp() {
        return sCdUnidadeMedidaErp;
    }

    /**
     * Sets the value of the sCdUnidadeMedidaErp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUnidadeMedidaErp(JAXBElement<String> value) {
        this.sCdUnidadeMedidaErp = ((JAXBElement<String> ) value);
    }

}
