
package br.gov.sp.saobernardo.paradigma.ws.aplicacao;

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
 *         &lt;element name="RetornarAplicacaoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_AplicacaoDTO_x003E_" minOccurs="0"/>
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
    "retornarAplicacaoResult"
})
@XmlRootElement(name = "RetornarAplicacaoResponse", namespace = "http://tempuri.org/")
public class RetornarAplicacaoResponse {

    @XmlElementRef(name = "RetornarAplicacaoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CAplicacaoDTOX003E> retornarAplicacaoResult;

    /**
     * Gets the value of the retornarAplicacaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CAplicacaoDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CAplicacaoDTOX003E> getRetornarAplicacaoResult() {
        return retornarAplicacaoResult;
    }

    /**
     * Sets the value of the retornarAplicacaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CAplicacaoDTOX003E }{@code >}
     *     
     */
    public void setRetornarAplicacaoResult(JAXBElement<RetornoListaX003CAplicacaoDTOX003E> value) {
        this.retornarAplicacaoResult = ((JAXBElement<RetornoListaX003CAplicacaoDTOX003E> ) value);
    }

}
