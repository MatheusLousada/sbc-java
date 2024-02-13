
package br.gov.sp.saobernardo.paradigma.ws.ordemcompra;

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
 *         &lt;element name="RetornarOrdemCompraTipoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_OrdemCompraTipoDTO_x003E_" minOccurs="0"/>
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
    "retornarOrdemCompraTipoResult"
})
@XmlRootElement(name = "RetornarOrdemCompraTipoResponse", namespace = "http://tempuri.org/")
public class RetornarOrdemCompraTipoResponse {

    @XmlElementRef(name = "RetornarOrdemCompraTipoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003COrdemCompraTipoDTOX003E> retornarOrdemCompraTipoResult;

    /**
     * Gets the value of the retornarOrdemCompraTipoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003COrdemCompraTipoDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003COrdemCompraTipoDTOX003E> getRetornarOrdemCompraTipoResult() {
        return retornarOrdemCompraTipoResult;
    }

    /**
     * Sets the value of the retornarOrdemCompraTipoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003COrdemCompraTipoDTOX003E }{@code >}
     *     
     */
    public void setRetornarOrdemCompraTipoResult(JAXBElement<RetornoListaX003COrdemCompraTipoDTOX003E> value) {
        this.retornarOrdemCompraTipoResult = ((JAXBElement<RetornoListaX003COrdemCompraTipoDTOX003E> ) value);
    }

}
