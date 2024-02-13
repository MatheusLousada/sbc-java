
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
 *         &lt;element name="sCdItemWbc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sCdItemWbc"
})
@XmlRootElement(name = "RetornarDeParaErp")
public class RetornarDeParaErp {

    protected EnumTipoDocumento enumTipoDocumento;
    @XmlElementRef(name = "sCdItemWbc", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemWbc;

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
     * Gets the value of the sCdItemWbc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdItemWbc() {
        return sCdItemWbc;
    }

    /**
     * Sets the value of the sCdItemWbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdItemWbc(JAXBElement<String> value) {
        this.sCdItemWbc = ((JAXBElement<String> ) value);
    }

}
