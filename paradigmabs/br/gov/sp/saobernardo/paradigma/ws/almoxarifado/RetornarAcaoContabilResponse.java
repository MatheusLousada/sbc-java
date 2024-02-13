
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
 *         &lt;element name="RetornarAcaoContabilResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoLista_x003C_DadosContabeisAlmoxarifadoDTO_x003E_" minOccurs="0"/>
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
    "retornarAcaoContabilResult"
})
@XmlRootElement(name = "RetornarAcaoContabilResponse", namespace = "http://tempuri.org/")
public class RetornarAcaoContabilResponse {

    @XmlElementRef(name = "RetornarAcaoContabilResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E> retornarAcaoContabilResult;

    /**
     * Gets the value of the retornarAcaoContabilResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E }{@code >}
     *     
     */
    public JAXBElement<RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E> getRetornarAcaoContabilResult() {
        return retornarAcaoContabilResult;
    }

    /**
     * Sets the value of the retornarAcaoContabilResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E }{@code >}
     *     
     */
    public void setRetornarAcaoContabilResult(JAXBElement<RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E> value) {
        this.retornarAcaoContabilResult = ((JAXBElement<RetornoListaX003CDadosContabeisAlmoxarifadoDTOX003E> ) value);
    }

}
