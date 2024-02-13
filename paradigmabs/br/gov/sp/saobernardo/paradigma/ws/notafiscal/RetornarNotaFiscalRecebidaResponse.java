
package br.gov.sp.saobernardo.paradigma.ws.notafiscal;

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
 *         &lt;element name="RetornarNotaFiscalRecebidaResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_NotaFiscalDTO_x003E_" minOccurs="0"/>
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
    "retornarNotaFiscalRecebidaResult"
})
@XmlRootElement(name = "RetornarNotaFiscalRecebidaResponse", namespace = "http://tempuri.org/")
public class RetornarNotaFiscalRecebidaResponse {

    @XmlElementRef(name = "RetornarNotaFiscalRecebidaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CNotaFiscalDTOX003E> retornarNotaFiscalRecebidaResult;

    /**
     * Gets the value of the retornarNotaFiscalRecebidaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CNotaFiscalDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CNotaFiscalDTOX003E> getRetornarNotaFiscalRecebidaResult() {
        return retornarNotaFiscalRecebidaResult;
    }

    /**
     * Sets the value of the retornarNotaFiscalRecebidaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CNotaFiscalDTOX003E }{@code >}
     *     
     */
    public void setRetornarNotaFiscalRecebidaResult(JAXBElement<RetornoListaX003CNotaFiscalDTOX003E> value) {
        this.retornarNotaFiscalRecebidaResult = ((JAXBElement<RetornoListaX003CNotaFiscalDTOX003E> ) value);
    }

}