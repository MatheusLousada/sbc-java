
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

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
 *         &lt;element name="RetornarCotacaoComEmpresaSemDeParaResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfProcessoCotacaoDTO" minOccurs="0"/>
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
    "retornarCotacaoComEmpresaSemDeParaResult"
})
@XmlRootElement(name = "RetornarCotacaoComEmpresaSemDeParaResponse", namespace = "http://tempuri.org/")
public class RetornarCotacaoComEmpresaSemDeParaResponse {

    @XmlElementRef(name = "RetornarCotacaoComEmpresaSemDeParaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProcessoCotacaoDTO> retornarCotacaoComEmpresaSemDeParaResult;

    /**
     * Gets the value of the retornarCotacaoComEmpresaSemDeParaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProcessoCotacaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProcessoCotacaoDTO> getRetornarCotacaoComEmpresaSemDeParaResult() {
        return retornarCotacaoComEmpresaSemDeParaResult;
    }

    /**
     * Sets the value of the retornarCotacaoComEmpresaSemDeParaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProcessoCotacaoDTO }{@code >}
     *     
     */
    public void setRetornarCotacaoComEmpresaSemDeParaResult(JAXBElement<ArrayOfProcessoCotacaoDTO> value) {
        this.retornarCotacaoComEmpresaSemDeParaResult = ((JAXBElement<ArrayOfProcessoCotacaoDTO> ) value);
    }

}
