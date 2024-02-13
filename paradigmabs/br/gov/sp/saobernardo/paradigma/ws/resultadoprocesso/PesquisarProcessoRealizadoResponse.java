
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
 *         &lt;element name="PesquisarProcessoRealizadoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCotacaoIntegracaoDTO" minOccurs="0"/>
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
    "pesquisarProcessoRealizadoResult"
})
@XmlRootElement(name = "PesquisarProcessoRealizadoResponse", namespace = "http://tempuri.org/")
public class PesquisarProcessoRealizadoResponse {

    @XmlElementRef(name = "PesquisarProcessoRealizadoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCotacaoIntegracaoDTO> pesquisarProcessoRealizadoResult;

    /**
     * Gets the value of the pesquisarProcessoRealizadoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCotacaoIntegracaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCotacaoIntegracaoDTO> getPesquisarProcessoRealizadoResult() {
        return pesquisarProcessoRealizadoResult;
    }

    /**
     * Sets the value of the pesquisarProcessoRealizadoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCotacaoIntegracaoDTO }{@code >}
     *     
     */
    public void setPesquisarProcessoRealizadoResult(JAXBElement<ArrayOfCotacaoIntegracaoDTO> value) {
        this.pesquisarProcessoRealizadoResult = ((JAXBElement<ArrayOfCotacaoIntegracaoDTO> ) value);
    }

}
