
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

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
 *         &lt;element name="RetornarExcluirDocumentoOrigemResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_ExcluirDocumentoOrigemDTO_x003E_" minOccurs="0"/>
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
    "retornarExcluirDocumentoOrigemResult"
})
@XmlRootElement(name = "RetornarExcluirDocumentoOrigemResponse", namespace = "http://tempuri.org/")
public class RetornarExcluirDocumentoOrigemResponse {

    @XmlElementRef(name = "RetornarExcluirDocumentoOrigemResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CExcluirDocumentoOrigemDTOX003E> retornarExcluirDocumentoOrigemResult;

    /**
     * Gets the value of the retornarExcluirDocumentoOrigemResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CExcluirDocumentoOrigemDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CExcluirDocumentoOrigemDTOX003E> getRetornarExcluirDocumentoOrigemResult() {
        return retornarExcluirDocumentoOrigemResult;
    }

    /**
     * Sets the value of the retornarExcluirDocumentoOrigemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CExcluirDocumentoOrigemDTOX003E }{@code >}
     *     
     */
    public void setRetornarExcluirDocumentoOrigemResult(JAXBElement<RetornoListaX003CExcluirDocumentoOrigemDTOX003E> value) {
        this.retornarExcluirDocumentoOrigemResult = ((JAXBElement<RetornoListaX003CExcluirDocumentoOrigemDTOX003E> ) value);
    }

}
