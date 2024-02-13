
package br.gov.sp.saobernardo.paradigma.ws.grupoconta;

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
 *         &lt;element name="lstGrupoConta" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfGrupoContaDTO" minOccurs="0"/>
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
    "lstGrupoConta"
})
@XmlRootElement(name = "ProcessarGrupoConta", namespace = "http://tempuri.org/")
public class ProcessarGrupoConta {

    @XmlElementRef(name = "lstGrupoConta", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfGrupoContaDTO> lstGrupoConta;

    /**
     * Gets the value of the lstGrupoConta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGrupoContaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGrupoContaDTO> getLstGrupoConta() {
        return lstGrupoConta;
    }

    /**
     * Sets the value of the lstGrupoConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGrupoContaDTO }{@code >}
     *     
     */
    public void setLstGrupoConta(JAXBElement<ArrayOfGrupoContaDTO> value) {
        this.lstGrupoConta = ((JAXBElement<ArrayOfGrupoContaDTO> ) value);
    }

}
