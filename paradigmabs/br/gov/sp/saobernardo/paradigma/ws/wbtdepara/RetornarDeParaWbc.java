
package br.gov.sp.saobernardo.paradigma.ws.wbtdepara;

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
 *         &lt;element name="enumTipoDocumento" type="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Integracao}enumTipoDocumento" minOccurs="0"/>
 *         &lt;element name="oWbtDeParaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}WbtDeParaDTO" minOccurs="0"/>
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
    "enumTipoDocumento",
    "oWbtDeParaDTO"
})
@XmlRootElement(name = "RetornarDeParaWbc")
public class RetornarDeParaWbc {

    protected EnumTipoDocumento enumTipoDocumento;
    @XmlElementRef(name = "oWbtDeParaDTO", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<WbtDeParaDTO> oWbtDeParaDTO;

    /**
     * Gets the value of the enumTipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTipoDocumento }
     *     
     */
    public EnumTipoDocumento getEnumTipoDocumento() {
        return enumTipoDocumento;
    }

    /**
     * Sets the value of the enumTipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTipoDocumento }
     *     
     */
    public void setEnumTipoDocumento(EnumTipoDocumento value) {
        this.enumTipoDocumento = value;
    }

    /**
     * Gets the value of the oWbtDeParaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WbtDeParaDTO }{@code >}
     *     
     */
    public JAXBElement<WbtDeParaDTO> getOWbtDeParaDTO() {
        return oWbtDeParaDTO;
    }

    /**
     * Sets the value of the oWbtDeParaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WbtDeParaDTO }{@code >}
     *     
     */
    public void setOWbtDeParaDTO(JAXBElement<WbtDeParaDTO> value) {
        this.oWbtDeParaDTO = ((JAXBElement<WbtDeParaDTO> ) value);
    }

}
