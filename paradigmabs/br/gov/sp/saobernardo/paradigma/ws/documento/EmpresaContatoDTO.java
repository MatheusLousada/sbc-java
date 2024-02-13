
package br.gov.sp.saobernardo.paradigma.ws.documento;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmpresaContatoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpresaContatoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstDocumentoContato" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfDocumentoDTO" minOccurs="0"/>
 *         &lt;element name="lstTipoContato" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfTipoContatoDTO" minOccurs="0"/>
 *         &lt;element name="nCdContato" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sDsCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNmContato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrRamal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrTelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrTelefoneDDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpresaContatoDTO", propOrder = {
    "lstDocumentoContato",
    "lstTipoContato",
    "nCdContato",
    "sDsCargo",
    "sDsEmail",
    "sNmContato",
    "sNrCelular",
    "sNrRamal",
    "sNrTelefone",
    "sNrTelefoneDDD"
})
public class EmpresaContatoDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstDocumentoContato", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDocumentoDTO> lstDocumentoContato;
    @XmlElementRef(name = "lstTipoContato", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTipoContatoDTO> lstTipoContato;
    @XmlElementRef(name = "nCdContato", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdContato;
    @XmlElementRef(name = "sDsCargo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsCargo;
    @XmlElementRef(name = "sDsEmail", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsEmail;
    @XmlElement(required = true, nillable = true)
    protected String sNmContato;
    @XmlElementRef(name = "sNrCelular", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrCelular;
    @XmlElementRef(name = "sNrRamal", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrRamal;
    @XmlElementRef(name = "sNrTelefone", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrTelefone;
    @XmlElementRef(name = "sNrTelefoneDDD", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrTelefoneDDD;

    /**
     * Gets the value of the lstDocumentoContato property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentoDTO> getLstDocumentoContato() {
        return lstDocumentoContato;
    }

    /**
     * Sets the value of the lstDocumentoContato property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentoDTO }{@code >}
     *     
     */
    public void setLstDocumentoContato(JAXBElement<ArrayOfDocumentoDTO> value) {
        this.lstDocumentoContato = ((JAXBElement<ArrayOfDocumentoDTO> ) value);
    }

    /**
     * Gets the value of the lstTipoContato property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTipoContatoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTipoContatoDTO> getLstTipoContato() {
        return lstTipoContato;
    }

    /**
     * Sets the value of the lstTipoContato property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTipoContatoDTO }{@code >}
     *     
     */
    public void setLstTipoContato(JAXBElement<ArrayOfTipoContatoDTO> value) {
        this.lstTipoContato = ((JAXBElement<ArrayOfTipoContatoDTO> ) value);
    }

    /**
     * Gets the value of the nCdContato property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdContato() {
        return nCdContato;
    }

    /**
     * Sets the value of the nCdContato property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdContato(JAXBElement<Long> value) {
        this.nCdContato = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the sDsCargo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsCargo() {
        return sDsCargo;
    }

    /**
     * Sets the value of the sDsCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsCargo(JAXBElement<String> value) {
        this.sDsCargo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsEmail() {
        return sDsEmail;
    }

    /**
     * Sets the value of the sDsEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsEmail(JAXBElement<String> value) {
        this.sDsEmail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNmContato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmContato() {
        return sNmContato;
    }

    /**
     * Sets the value of the sNmContato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmContato(String value) {
        this.sNmContato = value;
    }

    /**
     * Gets the value of the sNrCelular property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrCelular() {
        return sNrCelular;
    }

    /**
     * Sets the value of the sNrCelular property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrCelular(JAXBElement<String> value) {
        this.sNrCelular = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrRamal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrRamal() {
        return sNrRamal;
    }

    /**
     * Sets the value of the sNrRamal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrRamal(JAXBElement<String> value) {
        this.sNrRamal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrTelefone() {
        return sNrTelefone;
    }

    /**
     * Sets the value of the sNrTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrTelefone(JAXBElement<String> value) {
        this.sNrTelefone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrTelefoneDDD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrTelefoneDDD() {
        return sNrTelefoneDDD;
    }

    /**
     * Sets the value of the sNrTelefoneDDD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrTelefoneDDD(JAXBElement<String> value) {
        this.sNrTelefoneDDD = ((JAXBElement<String> ) value);
    }

}
