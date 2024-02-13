
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
 *         &lt;element name="lstProcessoLiberacaoDto" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoLiberacaoDTO" minOccurs="0"/>
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
    "lstProcessoLiberacaoDto"
})
@XmlRootElement(name = "ProcessarPProcessoLiberacao", namespace = "http://tempuri.org/")
public class ProcessarPProcessoLiberacao {

    @XmlElementRef(name = "lstProcessoLiberacaoDto", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPProcessoLiberacaoDTO> lstProcessoLiberacaoDto;

    /**
     * Gets the value of the lstProcessoLiberacaoDto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLiberacaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPProcessoLiberacaoDTO> getLstProcessoLiberacaoDto() {
        return lstProcessoLiberacaoDto;
    }

    /**
     * Sets the value of the lstProcessoLiberacaoDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLiberacaoDTO }{@code >}
     *     
     */
    public void setLstProcessoLiberacaoDto(JAXBElement<ArrayOfPProcessoLiberacaoDTO> value) {
        this.lstProcessoLiberacaoDto = ((JAXBElement<ArrayOfPProcessoLiberacaoDTO> ) value);
    }

}
