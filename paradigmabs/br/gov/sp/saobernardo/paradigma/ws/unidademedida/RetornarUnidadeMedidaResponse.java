
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
 *         &lt;element name="RetornarUnidadeMedidaResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}UnidadeMedidaDTO" minOccurs="0"/>
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
    "retornarUnidadeMedidaResult"
})
@XmlRootElement(name = "RetornarUnidadeMedidaResponse", namespace = "http://tempuri.org/")
public class RetornarUnidadeMedidaResponse {

    @XmlElementRef(name = "RetornarUnidadeMedidaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<UnidadeMedidaDTO> retornarUnidadeMedidaResult;

    /**
     * Gets the value of the retornarUnidadeMedidaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnidadeMedidaDTO }{@code >}
     *     
     */
    public JAXBElement<UnidadeMedidaDTO> getRetornarUnidadeMedidaResult() {
        return retornarUnidadeMedidaResult;
    }

    /**
     * Sets the value of the retornarUnidadeMedidaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnidadeMedidaDTO }{@code >}
     *     
     */
    public void setRetornarUnidadeMedidaResult(JAXBElement<UnidadeMedidaDTO> value) {
        this.retornarUnidadeMedidaResult = ((JAXBElement<UnidadeMedidaDTO> ) value);
    }

}
