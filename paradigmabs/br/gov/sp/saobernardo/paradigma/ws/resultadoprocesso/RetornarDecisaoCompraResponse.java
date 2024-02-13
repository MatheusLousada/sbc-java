
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

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
 *         &lt;element name="RetornarDecisaoCompraResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfDecisaoCompraDTO" minOccurs="0"/>
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
    "retornarDecisaoCompraResult"
})
@XmlRootElement(name = "RetornarDecisaoCompraResponse", namespace = "http://tempuri.org/")
public class RetornarDecisaoCompraResponse {

    @XmlElementRef(name = "RetornarDecisaoCompraResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDecisaoCompraDTO> retornarDecisaoCompraResult;

    /**
     * Gets the value of the retornarDecisaoCompraResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDecisaoCompraDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDecisaoCompraDTO> getRetornarDecisaoCompraResult() {
        return retornarDecisaoCompraResult;
    }

    /**
     * Sets the value of the retornarDecisaoCompraResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDecisaoCompraDTO }{@code >}
     *     
     */
    public void setRetornarDecisaoCompraResult(JAXBElement<ArrayOfDecisaoCompraDTO> value) {
        this.retornarDecisaoCompraResult = ((JAXBElement<ArrayOfDecisaoCompraDTO> ) value);
    }

}
