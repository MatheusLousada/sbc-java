
package br.gov.sp.saobernardo.paradigma.ws.usuario;

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
 *         &lt;element name="RetornarUsuarioCompradorResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_UsuarioDTO_x003E_" minOccurs="0"/>
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
    "retornarUsuarioCompradorResult"
})
@XmlRootElement(name = "RetornarUsuarioCompradorResponse", namespace = "http://tempuri.org/")
public class RetornarUsuarioCompradorResponse {

    @XmlElementRef(name = "RetornarUsuarioCompradorResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CUsuarioDTOX003E> retornarUsuarioCompradorResult;

    /**
     * Gets the value of the retornarUsuarioCompradorResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CUsuarioDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CUsuarioDTOX003E> getRetornarUsuarioCompradorResult() {
        return retornarUsuarioCompradorResult;
    }

    /**
     * Sets the value of the retornarUsuarioCompradorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CUsuarioDTOX003E }{@code >}
     *     
     */
    public void setRetornarUsuarioCompradorResult(JAXBElement<RetornoListaX003CUsuarioDTOX003E> value) {
        this.retornarUsuarioCompradorResult = ((JAXBElement<RetornoListaX003CUsuarioDTOX003E> ) value);
    }

}
