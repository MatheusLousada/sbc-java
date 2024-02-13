
package br.gov.sp.saobernardo.paradigma.ws.ordemcompra;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnderecoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnderecoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdCep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsComplemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsEndereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNmBairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNmCidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrEndereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sSgEstado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sSgPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnderecoDTO", propOrder = {
    "sCdCep",
    "sDsComplemento",
    "sDsEndereco",
    "sNmBairro",
    "sNmCidade",
    "sNrEndereco",
    "sSgEstado",
    "sSgPais"
})
public class EnderecoDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdCep;
    @XmlElementRef(name = "sDsComplemento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsComplemento;
    @XmlElement(required = true, nillable = true)
    protected String sDsEndereco;
    @XmlElement(required = true, nillable = true)
    protected String sNmBairro;
    @XmlElement(required = true, nillable = true)
    protected String sNmCidade;
    @XmlElement(required = true, nillable = true)
    protected String sNrEndereco;
    @XmlElement(required = true, nillable = true)
    protected String sSgEstado;
    @XmlElement(required = true, nillable = true)
    protected String sSgPais;

    /**
     * Gets the value of the sCdCep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCep() {
        return sCdCep;
    }

    /**
     * Sets the value of the sCdCep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCep(String value) {
        this.sCdCep = value;
    }

    /**
     * Gets the value of the sDsComplemento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsComplemento() {
        return sDsComplemento;
    }

    /**
     * Sets the value of the sDsComplemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsComplemento(JAXBElement<String> value) {
        this.sDsComplemento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsEndereco() {
        return sDsEndereco;
    }

    /**
     * Sets the value of the sDsEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsEndereco(String value) {
        this.sDsEndereco = value;
    }

    /**
     * Gets the value of the sNmBairro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmBairro() {
        return sNmBairro;
    }

    /**
     * Sets the value of the sNmBairro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmBairro(String value) {
        this.sNmBairro = value;
    }

    /**
     * Gets the value of the sNmCidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmCidade() {
        return sNmCidade;
    }

    /**
     * Sets the value of the sNmCidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmCidade(String value) {
        this.sNmCidade = value;
    }

    /**
     * Gets the value of the sNrEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrEndereco() {
        return sNrEndereco;
    }

    /**
     * Sets the value of the sNrEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrEndereco(String value) {
        this.sNrEndereco = value;
    }

    /**
     * Gets the value of the sSgEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSgEstado() {
        return sSgEstado;
    }

    /**
     * Sets the value of the sSgEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSgEstado(String value) {
        this.sSgEstado = value;
    }

    /**
     * Gets the value of the sSgPais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSgPais() {
        return sSgPais;
    }

    /**
     * Sets the value of the sSgPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSgPais(String value) {
        this.sSgPais = value;
    }

}
