
package br.gov.sp.saobernardo.paradigma.ws.empresa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmpresaBancoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpresaBancoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlPrincipal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nCdTipoConta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdAgencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdAgenciaDigito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdBanco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdContaCorrente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdContaDigito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNmTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpresaBancoDTO", propOrder = {
    "bFlPrincipal",
    "nCdTipoConta",
    "sCdAgencia",
    "sCdAgenciaDigito",
    "sCdBanco",
    "sCdContaCorrente",
    "sCdContaDigito",
    "sCdEmpresa",
    "sCdPais",
    "sNmTitular"
})
public class EmpresaBancoDTO
    extends DtoBase
{

    protected int bFlPrincipal;
    @XmlElementRef(name = "nCdTipoConta", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nCdTipoConta;
    @XmlElement(required = true, nillable = true)
    protected String sCdAgencia;
    @XmlElement(required = true, nillable = true)
    protected String sCdAgenciaDigito;
    @XmlElement(required = true, nillable = true)
    protected String sCdBanco;
    @XmlElement(required = true, nillable = true)
    protected String sCdContaCorrente;
    @XmlElement(required = true, nillable = true)
    protected String sCdContaDigito;
    @XmlElementRef(name = "sCdEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresa;
    @XmlElementRef(name = "sCdPais", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdPais;
    @XmlElementRef(name = "sNmTitular", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNmTitular;

    /**
     * Gets the value of the bFlPrincipal property.
     * 
     */
    public int getBFlPrincipal() {
        return bFlPrincipal;
    }

    /**
     * Sets the value of the bFlPrincipal property.
     * 
     */
    public void setBFlPrincipal(int value) {
        this.bFlPrincipal = value;
    }

    /**
     * Gets the value of the nCdTipoConta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNCdTipoConta() {
        return nCdTipoConta;
    }

    /**
     * Sets the value of the nCdTipoConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNCdTipoConta(JAXBElement<Integer> value) {
        this.nCdTipoConta = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sCdAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdAgencia() {
        return sCdAgencia;
    }

    /**
     * Sets the value of the sCdAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdAgencia(String value) {
        this.sCdAgencia = value;
    }

    /**
     * Gets the value of the sCdAgenciaDigito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdAgenciaDigito() {
        return sCdAgenciaDigito;
    }

    /**
     * Sets the value of the sCdAgenciaDigito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdAgenciaDigito(String value) {
        this.sCdAgenciaDigito = value;
    }

    /**
     * Gets the value of the sCdBanco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdBanco() {
        return sCdBanco;
    }

    /**
     * Sets the value of the sCdBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdBanco(String value) {
        this.sCdBanco = value;
    }

    /**
     * Gets the value of the sCdContaCorrente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdContaCorrente() {
        return sCdContaCorrente;
    }

    /**
     * Sets the value of the sCdContaCorrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdContaCorrente(String value) {
        this.sCdContaCorrente = value;
    }

    /**
     * Gets the value of the sCdContaDigito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdContaDigito() {
        return sCdContaDigito;
    }

    /**
     * Sets the value of the sCdContaDigito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdContaDigito(String value) {
        this.sCdContaDigito = value;
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
     * Gets the value of the sCdPais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdPais() {
        return sCdPais;
    }

    /**
     * Sets the value of the sCdPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdPais(JAXBElement<String> value) {
        this.sCdPais = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNmTitular property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNmTitular() {
        return sNmTitular;
    }

    /**
     * Sets the value of the sNmTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNmTitular(JAXBElement<String> value) {
        this.sNmTitular = ((JAXBElement<String> ) value);
    }

}
