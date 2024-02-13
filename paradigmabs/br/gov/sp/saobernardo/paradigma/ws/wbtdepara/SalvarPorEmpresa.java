
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
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemWbc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sCdEmpresa",
    "sCdItemWbc",
    "sCdItemEmpresa"
})
@XmlRootElement(name = "SalvarPorEmpresa")
public class SalvarPorEmpresa {

    protected EnumTipoDocumento enumTipoDocumento;
    @XmlElementRef(name = "sCdEmpresa", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresa;
    @XmlElementRef(name = "sCdItemWbc", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemWbc;
    @XmlElementRef(name = "sCdItemEmpresa", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemEmpresa;

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
     * Gets the value of the sCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresa() {
        return sCdEmpresa;
    }

    /**
     * Sets the value of the sCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresa(JAXBElement<String> value) {
        this.sCdEmpresa = ((JAXBElement<String> ) value);
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

    /**
     * Gets the value of the sCdItemEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdItemEmpresa() {
        return sCdItemEmpresa;
    }

    /**
     * Sets the value of the sCdItemEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdItemEmpresa(JAXBElement<String> value) {
        this.sCdItemEmpresa = ((JAXBElement<String> ) value);
    }

}
