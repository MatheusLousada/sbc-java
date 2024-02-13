
package br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico;

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
 *         &lt;element name="RetornarPregaoEletronicoResult" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPregaoEletronicoDTO" minOccurs="0"/>
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
    "retornarPregaoEletronicoResult"
})
@XmlRootElement(name = "RetornarPregaoEletronicoResponse", namespace = "http://tempuri.org/")
public class RetornarPregaoEletronicoResponse {

    @XmlElementRef(name = "RetornarPregaoEletronicoResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPregaoEletronicoDTO> retornarPregaoEletronicoResult;

    /**
     * Gets the value of the retornarPregaoEletronicoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPregaoEletronicoDTO> getRetornarPregaoEletronicoResult() {
        return retornarPregaoEletronicoResult;
    }

    /**
     * Sets the value of the retornarPregaoEletronicoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPregaoEletronicoDTO }{@code >}
     *     
     */
    public void setRetornarPregaoEletronicoResult(JAXBElement<ArrayOfPregaoEletronicoDTO> value) {
        this.retornarPregaoEletronicoResult = ((JAXBElement<ArrayOfPregaoEletronicoDTO> ) value);
    }

}
