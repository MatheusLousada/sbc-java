
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
 *         &lt;element name="lstWfAtividadeAprovacaoResultadoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfWfAtividadeAprovacaoResultadoDTO" minOccurs="0"/>
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
    "lstWfAtividadeAprovacaoResultadoDTO"
})
@XmlRootElement(name = "ProcessarAtividadeAprovacao", namespace = "http://tempuri.org/")
public class ProcessarAtividadeAprovacao {

    @XmlElementRef(name = "lstWfAtividadeAprovacaoResultadoDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfWfAtividadeAprovacaoResultadoDTO> lstWfAtividadeAprovacaoResultadoDTO;

    /**
     * Gets the value of the lstWfAtividadeAprovacaoResultadoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWfAtividadeAprovacaoResultadoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWfAtividadeAprovacaoResultadoDTO> getLstWfAtividadeAprovacaoResultadoDTO() {
        return lstWfAtividadeAprovacaoResultadoDTO;
    }

    /**
     * Sets the value of the lstWfAtividadeAprovacaoResultadoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWfAtividadeAprovacaoResultadoDTO }{@code >}
     *     
     */
    public void setLstWfAtividadeAprovacaoResultadoDTO(JAXBElement<ArrayOfWfAtividadeAprovacaoResultadoDTO> value) {
        this.lstWfAtividadeAprovacaoResultadoDTO = ((JAXBElement<ArrayOfWfAtividadeAprovacaoResultadoDTO> ) value);
    }

}
