
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
 *         &lt;element name="PesquisarProcessoCanceladoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCotacaoIntegracaoDTO" minOccurs="0"/>
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
    "pesquisarProcessoCanceladoResult"
})
@XmlRootElement(name = "PesquisarProcessoCanceladoResponse", namespace = "http://tempuri.org/")
public class PesquisarProcessoCanceladoResponse {

    @XmlElementRef(name = "PesquisarProcessoCanceladoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCotacaoIntegracaoDTO> pesquisarProcessoCanceladoResult;

    /**
     * Gets the value of the pesquisarProcessoCanceladoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCotacaoIntegracaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCotacaoIntegracaoDTO> getPesquisarProcessoCanceladoResult() {
        return pesquisarProcessoCanceladoResult;
    }

    /**
     * Sets the value of the pesquisarProcessoCanceladoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCotacaoIntegracaoDTO }{@code >}
     *     
     */
    public void setPesquisarProcessoCanceladoResult(JAXBElement<ArrayOfCotacaoIntegracaoDTO> value) {
        this.pesquisarProcessoCanceladoResult = ((JAXBElement<ArrayOfCotacaoIntegracaoDTO> ) value);
    }

}
