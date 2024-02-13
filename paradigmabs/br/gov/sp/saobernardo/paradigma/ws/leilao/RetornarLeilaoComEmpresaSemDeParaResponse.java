
package br.gov.sp.saobernardo.paradigma.ws.leilao;

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
 *         &lt;element name="RetornarLeilaoComEmpresaSemDeParaResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfProcessoLeilaoDTO" minOccurs="0"/>
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
    "retornarLeilaoComEmpresaSemDeParaResult"
})
@XmlRootElement(name = "RetornarLeilaoComEmpresaSemDeParaResponse", namespace = "http://tempuri.org/")
public class RetornarLeilaoComEmpresaSemDeParaResponse {

    @XmlElementRef(name = "RetornarLeilaoComEmpresaSemDeParaResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProcessoLeilaoDTO> retornarLeilaoComEmpresaSemDeParaResult;

    /**
     * Gets the value of the retornarLeilaoComEmpresaSemDeParaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProcessoLeilaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProcessoLeilaoDTO> getRetornarLeilaoComEmpresaSemDeParaResult() {
        return retornarLeilaoComEmpresaSemDeParaResult;
    }

    /**
     * Sets the value of the retornarLeilaoComEmpresaSemDeParaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProcessoLeilaoDTO }{@code >}
     *     
     */
    public void setRetornarLeilaoComEmpresaSemDeParaResult(JAXBElement<ArrayOfProcessoLeilaoDTO> value) {
        this.retornarLeilaoComEmpresaSemDeParaResult = ((JAXBElement<ArrayOfProcessoLeilaoDTO> ) value);
    }

}
