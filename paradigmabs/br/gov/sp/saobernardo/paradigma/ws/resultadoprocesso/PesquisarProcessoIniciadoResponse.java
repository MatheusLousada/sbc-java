
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
 *         &lt;element name="PesquisarProcessoIniciadoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCotacaoIntegracaoDTO" minOccurs="0"/>
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
    "pesquisarProcessoIniciadoResult"
})
@XmlRootElement(name = "PesquisarProcessoIniciadoResponse", namespace = "http://tempuri.org/")
public class PesquisarProcessoIniciadoResponse {

    @XmlElementRef(name = "PesquisarProcessoIniciadoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCotacaoIntegracaoDTO> pesquisarProcessoIniciadoResult;

    /**
     * Gets the value of the pesquisarProcessoIniciadoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCotacaoIntegracaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCotacaoIntegracaoDTO> getPesquisarProcessoIniciadoResult() {
        return pesquisarProcessoIniciadoResult;
    }

    /**
     * Sets the value of the pesquisarProcessoIniciadoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCotacaoIntegracaoDTO }{@code >}
     *     
     */
    public void setPesquisarProcessoIniciadoResult(JAXBElement<ArrayOfCotacaoIntegracaoDTO> value) {
        this.pesquisarProcessoIniciadoResult = ((JAXBElement<ArrayOfCotacaoIntegracaoDTO> ) value);
    }

}
