
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
 *         &lt;element name="sCdDePara" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdMultiEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sCdDePara",
    "sCdEmpresa",
    "sCdMultiEmpresa"
})
@XmlRootElement(name = "GerarDeParaMultiploPorEmpresa")
public class GerarDeParaMultiploPorEmpresa {

    protected EnumTipoDocumento enumTipoDocumento;
    @XmlElementRef(name = "sCdDePara", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdDePara;
    @XmlElementRef(name = "sCdEmpresa", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresa;
    @XmlElementRef(name = "sCdMultiEmpresa", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> sCdMultiEmpresa;

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
     * Gets the value of the sCdDePara property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdDePara() {
        return sCdDePara;
    }

    /**
     * Sets the value of the sCdDePara property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdDePara(JAXBElement<String> value) {
        this.sCdDePara = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdMultiEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdMultiEmpresa() {
        return sCdMultiEmpresa;
    }

    /**
     * Sets the value of the sCdMultiEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdMultiEmpresa(JAXBElement<String> value) {
        this.sCdMultiEmpresa = ((JAXBElement<String> ) value);
    }

}
