
package br.gov.sp.saobernardo.paradigma.ws.wfatividade;

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
 *         &lt;element name="RetornarAtividadeAprovacaoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_WfAtividadeAprovacaoDTO_x003E_" minOccurs="0"/>
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
    "retornarAtividadeAprovacaoResult"
})
@XmlRootElement(name = "RetornarAtividadeAprovacaoResponse", namespace = "http://tempuri.org/")
public class RetornarAtividadeAprovacaoResponse {

    @XmlElementRef(name = "RetornarAtividadeAprovacaoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CWfAtividadeAprovacaoDTOX003E> retornarAtividadeAprovacaoResult;

    /**
     * Gets the value of the retornarAtividadeAprovacaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CWfAtividadeAprovacaoDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CWfAtividadeAprovacaoDTOX003E> getRetornarAtividadeAprovacaoResult() {
        return retornarAtividadeAprovacaoResult;
    }

    /**
     * Sets the value of the retornarAtividadeAprovacaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CWfAtividadeAprovacaoDTOX003E }{@code >}
     *     
     */
    public void setRetornarAtividadeAprovacaoResult(JAXBElement<RetornoListaX003CWfAtividadeAprovacaoDTOX003E> value) {
        this.retornarAtividadeAprovacaoResult = ((JAXBElement<RetornoListaX003CWfAtividadeAprovacaoDTOX003E> ) value);
    }

}
