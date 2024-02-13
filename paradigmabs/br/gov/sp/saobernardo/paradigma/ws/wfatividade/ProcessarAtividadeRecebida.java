
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
 *         &lt;element name="lstCdAtividade" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
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
    "lstCdAtividade"
})
@XmlRootElement(name = "ProcessarAtividadeRecebida", namespace = "http://tempuri.org/")
public class ProcessarAtividadeRecebida {

    @XmlElementRef(name = "lstCdAtividade", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOflong> lstCdAtividade;

    /**
     * Gets the value of the lstCdAtividade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getLstCdAtividade() {
        return lstCdAtividade;
    }

    /**
     * Sets the value of the lstCdAtividade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setLstCdAtividade(JAXBElement<ArrayOflong> value) {
        this.lstCdAtividade = ((JAXBElement<ArrayOflong> ) value);
    }

}
