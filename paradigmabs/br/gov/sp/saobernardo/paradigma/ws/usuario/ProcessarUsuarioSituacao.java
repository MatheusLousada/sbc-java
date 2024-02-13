
package br.gov.sp.saobernardo.paradigma.ws.usuario;

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
 *         &lt;element name="lstSituacaoUsuario" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfUsuarioSituacaoDTO" minOccurs="0"/>
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
    "lstSituacaoUsuario"
})
@XmlRootElement(name = "ProcessarUsuarioSituacao", namespace = "http://tempuri.org/")
public class ProcessarUsuarioSituacao {

    @XmlElementRef(name = "lstSituacaoUsuario", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfUsuarioSituacaoDTO> lstSituacaoUsuario;

    /**
     * Gets the value of the lstSituacaoUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUsuarioSituacaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUsuarioSituacaoDTO> getLstSituacaoUsuario() {
        return lstSituacaoUsuario;
    }

    /**
     * Sets the value of the lstSituacaoUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUsuarioSituacaoDTO }{@code >}
     *     
     */
    public void setLstSituacaoUsuario(JAXBElement<ArrayOfUsuarioSituacaoDTO> value) {
        this.lstSituacaoUsuario = ((JAXBElement<ArrayOfUsuarioSituacaoDTO> ) value);
    }

}
