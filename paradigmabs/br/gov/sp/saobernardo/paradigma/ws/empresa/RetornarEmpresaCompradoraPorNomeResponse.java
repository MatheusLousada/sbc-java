
package br.gov.sp.saobernardo.paradigma.ws.empresa;

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
 *         &lt;element name="RetornarEmpresaCompradoraPorNomeResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_EmpresaDTO_x003E_" minOccurs="0"/>
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
    "retornarEmpresaCompradoraPorNomeResult"
})
@XmlRootElement(name = "RetornarEmpresaCompradoraPorNomeResponse", namespace = "http://tempuri.org/")
public class RetornarEmpresaCompradoraPorNomeResponse {

    @XmlElementRef(name = "RetornarEmpresaCompradoraPorNomeResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CEmpresaDTOX003E> retornarEmpresaCompradoraPorNomeResult;

    /**
     * Gets the value of the retornarEmpresaCompradoraPorNomeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CEmpresaDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CEmpresaDTOX003E> getRetornarEmpresaCompradoraPorNomeResult() {
        return retornarEmpresaCompradoraPorNomeResult;
    }

    /**
     * Sets the value of the retornarEmpresaCompradoraPorNomeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CEmpresaDTOX003E }{@code >}
     *     
     */
    public void setRetornarEmpresaCompradoraPorNomeResult(JAXBElement<RetornoListaX003CEmpresaDTOX003E> value) {
        this.retornarEmpresaCompradoraPorNomeResult = ((JAXBElement<RetornoListaX003CEmpresaDTOX003E> ) value);
    }

}
