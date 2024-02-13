
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
 *         &lt;element name="lstConfirmacaoNegociacaoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfConfirmacaoNegociacaoDTO" minOccurs="0"/>
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
    "lstConfirmacaoNegociacaoDTO"
})
@XmlRootElement(name = "ReabrirCotacao", namespace = "http://tempuri.org/")
public class ReabrirCotacao {

    @XmlElementRef(name = "lstConfirmacaoNegociacaoDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfConfirmacaoNegociacaoDTO> lstConfirmacaoNegociacaoDTO;

    /**
     * Gets the value of the lstConfirmacaoNegociacaoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConfirmacaoNegociacaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfConfirmacaoNegociacaoDTO> getLstConfirmacaoNegociacaoDTO() {
        return lstConfirmacaoNegociacaoDTO;
    }

    /**
     * Sets the value of the lstConfirmacaoNegociacaoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConfirmacaoNegociacaoDTO }{@code >}
     *     
     */
    public void setLstConfirmacaoNegociacaoDTO(JAXBElement<ArrayOfConfirmacaoNegociacaoDTO> value) {
        this.lstConfirmacaoNegociacaoDTO = ((JAXBElement<ArrayOfConfirmacaoNegociacaoDTO> ) value);
    }

}
