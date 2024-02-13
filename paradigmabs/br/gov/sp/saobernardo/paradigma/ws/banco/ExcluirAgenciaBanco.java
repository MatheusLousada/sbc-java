
package br.gov.sp.saobernardo.paradigma.ws.banco;

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
 *         &lt;element name="lstAgenciaBanco" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfAgenciaBancoExclusaoDTO" minOccurs="0"/>
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
    "lstAgenciaBanco"
})
@XmlRootElement(name = "ExcluirAgenciaBanco", namespace = "http://tempuri.org/")
public class ExcluirAgenciaBanco {

    @XmlElementRef(name = "lstAgenciaBanco", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAgenciaBancoExclusaoDTO> lstAgenciaBanco;

    /**
     * Gets the value of the lstAgenciaBanco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAgenciaBancoExclusaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAgenciaBancoExclusaoDTO> getLstAgenciaBanco() {
        return lstAgenciaBanco;
    }

    /**
     * Sets the value of the lstAgenciaBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAgenciaBancoExclusaoDTO }{@code >}
     *     
     */
    public void setLstAgenciaBanco(JAXBElement<ArrayOfAgenciaBancoExclusaoDTO> value) {
        this.lstAgenciaBanco = ((JAXBElement<ArrayOfAgenciaBancoExclusaoDTO> ) value);
    }

}
