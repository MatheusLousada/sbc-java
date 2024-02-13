
package br.gov.sp.saobernardo.paradigma.ws.contacontabil;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContaContabilDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContaContabilDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlAtivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdContaContabil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdContaContabilPai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsContaContabil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContaContabilDTO", propOrder = {
    "bFlAtivo",
    "sCdContaContabil",
    "sCdContaContabilPai",
    "sCdEmpresa",
    "sDsContaContabil"
})
public class ContaContabilDTO
    extends DtoBase
{

    @XmlElementRef(name = "bFlAtivo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlAtivo;
    @XmlElement(required = true, nillable = true)
    protected String sCdContaContabil;
    @XmlElementRef(name = "sCdContaContabilPai", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdContaContabilPai;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sDsContaContabil;

    /**
     * Gets the value of the bFlAtivo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlAtivo() {
        return bFlAtivo;
    }

    /**
     * Sets the value of the bFlAtivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlAtivo(JAXBElement<Integer> value) {
        this.bFlAtivo = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sCdContaContabil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdContaContabil() {
        return sCdContaContabil;
    }

    /**
     * Sets the value of the sCdContaContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdContaContabil(String value) {
        this.sCdContaContabil = value;
    }

    /**
     * Gets the value of the sCdContaContabilPai property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdContaContabilPai() {
        return sCdContaContabilPai;
    }

    /**
     * Sets the value of the sCdContaContabilPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdContaContabilPai(JAXBElement<String> value) {
        this.sCdContaContabilPai = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresa() {
        return sCdEmpresa;
    }

    /**
     * Sets the value of the sCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresa(String value) {
        this.sCdEmpresa = value;
    }

    /**
     * Gets the value of the sDsContaContabil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsContaContabil() {
        return sDsContaContabil;
    }

    /**
     * Sets the value of the sDsContaContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsContaContabil(String value) {
        this.sDsContaContabil = value;
    }

}
