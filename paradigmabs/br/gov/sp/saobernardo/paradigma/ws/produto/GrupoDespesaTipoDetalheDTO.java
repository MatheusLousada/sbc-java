
package br.gov.sp.saobernardo.paradigma.ws.produto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrupoDespesaTipoDetalheDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrupoDespesaTipoDetalheDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sDsGrupoDespesaTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrupoDespesaTipoDetalheDTO", propOrder = {
    "sDsGrupoDespesaTipo"
})
public class GrupoDespesaTipoDetalheDTO {

    @XmlElementRef(name = "sDsGrupoDespesaTipo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsGrupoDespesaTipo;

    /**
     * Gets the value of the sDsGrupoDespesaTipo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsGrupoDespesaTipo() {
        return sDsGrupoDespesaTipo;
    }

    /**
     * Sets the value of the sDsGrupoDespesaTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsGrupoDespesaTipo(JAXBElement<String> value) {
        this.sDsGrupoDespesaTipo = ((JAXBElement<String> ) value);
    }

}
