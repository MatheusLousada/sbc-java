
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

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
 *         &lt;element name="RetornarCotacaoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCotacaoDTO" minOccurs="0"/>
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
    "retornarCotacaoResult"
})
@XmlRootElement(name = "RetornarCotacaoResponse", namespace = "http://tempuri.org/")
public class RetornarCotacaoResponse {

    @XmlElementRef(name = "RetornarCotacaoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCotacaoDTO> retornarCotacaoResult;

    /**
     * Gets the value of the retornarCotacaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCotacaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCotacaoDTO> getRetornarCotacaoResult() {
        return retornarCotacaoResult;
    }

    /**
     * Sets the value of the retornarCotacaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCotacaoDTO }{@code >}
     *     
     */
    public void setRetornarCotacaoResult(JAXBElement<ArrayOfCotacaoDTO> value) {
        this.retornarCotacaoResult = ((JAXBElement<ArrayOfCotacaoDTO> ) value);
    }

}
