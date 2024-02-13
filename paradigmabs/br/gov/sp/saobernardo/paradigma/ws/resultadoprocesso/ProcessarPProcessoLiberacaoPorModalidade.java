
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
 *         &lt;element name="lstProcessoLiberacaoModalidadeDto" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoLiberacaoModalidadeDTO" minOccurs="0"/>
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
    "lstProcessoLiberacaoModalidadeDto"
})
@XmlRootElement(name = "ProcessarPProcessoLiberacaoPorModalidade", namespace = "http://tempuri.org/")
public class ProcessarPProcessoLiberacaoPorModalidade {

    @XmlElementRef(name = "lstProcessoLiberacaoModalidadeDto", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPProcessoLiberacaoModalidadeDTO> lstProcessoLiberacaoModalidadeDto;

    /**
     * Gets the value of the lstProcessoLiberacaoModalidadeDto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLiberacaoModalidadeDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPProcessoLiberacaoModalidadeDTO> getLstProcessoLiberacaoModalidadeDto() {
        return lstProcessoLiberacaoModalidadeDto;
    }

    /**
     * Sets the value of the lstProcessoLiberacaoModalidadeDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLiberacaoModalidadeDTO }{@code >}
     *     
     */
    public void setLstProcessoLiberacaoModalidadeDto(JAXBElement<ArrayOfPProcessoLiberacaoModalidadeDTO> value) {
        this.lstProcessoLiberacaoModalidadeDto = ((JAXBElement<ArrayOfPProcessoLiberacaoModalidadeDTO> ) value);
    }

}
