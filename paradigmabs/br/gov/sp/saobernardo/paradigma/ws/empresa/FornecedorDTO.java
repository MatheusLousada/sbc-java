
package br.gov.sp.saobernardo.paradigma.ws.empresa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FornecedorDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FornecedorDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstEmpresaBanco" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaBancoDTO" minOccurs="0"/>
 *         &lt;element name="lstEmpresaEnderecoCobranca" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaEnderecoDTO" minOccurs="0"/>
 *         &lt;element name="lstEmpresaEnderecoEntrega" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaEnderecoDTO" minOccurs="0"/>
 *         &lt;element name="lstEmpresaEnderecoInstitucional" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaEnderecoDTO" minOccurs="0"/>
 *         &lt;element name="nCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nIdTipoPessoa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nStEmpresa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsContatoDDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsContatoEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsContatoFone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNmEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNmFantasia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrCnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrInscricaoEstadual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtInicioAtividade" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtNascimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FornecedorDTO", propOrder = {
    "lstEmpresaBanco",
    "lstEmpresaEnderecoCobranca",
    "lstEmpresaEnderecoEntrega",
    "lstEmpresaEnderecoInstitucional",
    "nCdEmpresa",
    "nIdTipoPessoa",
    "nStEmpresa",
    "sCdPais",
    "sDsContatoDDD",
    "sDsContatoEmail",
    "sDsContatoFone",
    "sNmEmpresa",
    "sNmFantasia",
    "sNrCnpj",
    "sNrInscricaoEstadual",
    "tDtInicioAtividade",
    "tDtNascimento"
})
public class FornecedorDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstEmpresaBanco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaBancoDTO> lstEmpresaBanco;
    @XmlElementRef(name = "lstEmpresaEnderecoCobranca", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaEnderecoDTO> lstEmpresaEnderecoCobranca;
    @XmlElementRef(name = "lstEmpresaEnderecoEntrega", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaEnderecoDTO> lstEmpresaEnderecoEntrega;
    @XmlElementRef(name = "lstEmpresaEnderecoInstitucional", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaEnderecoDTO> lstEmpresaEnderecoInstitucional;
    protected long nCdEmpresa;
    protected Integer nIdTipoPessoa;
    protected Integer nStEmpresa;
    @XmlElementRef(name = "sCdPais", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdPais;
    @XmlElementRef(name = "sDsContatoDDD", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsContatoDDD;
    @XmlElement(required = true, nillable = true)
    protected String sDsContatoEmail;
    @XmlElementRef(name = "sDsContatoFone", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsContatoFone;
    @XmlElement(required = true, nillable = true)
    protected String sNmEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sNmFantasia;
    @XmlElementRef(name = "sNrCnpj", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrCnpj;
    @XmlElementRef(name = "sNrInscricaoEstadual", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrInscricaoEstadual;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtInicioAtividade;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtNascimento;

    /**
     * Gets the value of the lstEmpresaBanco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaBancoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaBancoDTO> getLstEmpresaBanco() {
        return lstEmpresaBanco;
    }

    /**
     * Sets the value of the lstEmpresaBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaBancoDTO }{@code >}
     *     
     */
    public void setLstEmpresaBanco(JAXBElement<ArrayOfEmpresaBancoDTO> value) {
        this.lstEmpresaBanco = ((JAXBElement<ArrayOfEmpresaBancoDTO> ) value);
    }

    /**
     * Gets the value of the lstEmpresaEnderecoCobranca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> getLstEmpresaEnderecoCobranca() {
        return lstEmpresaEnderecoCobranca;
    }

    /**
     * Sets the value of the lstEmpresaEnderecoCobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public void setLstEmpresaEnderecoCobranca(JAXBElement<ArrayOfEmpresaEnderecoDTO> value) {
        this.lstEmpresaEnderecoCobranca = ((JAXBElement<ArrayOfEmpresaEnderecoDTO> ) value);
    }

    /**
     * Gets the value of the lstEmpresaEnderecoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> getLstEmpresaEnderecoEntrega() {
        return lstEmpresaEnderecoEntrega;
    }

    /**
     * Sets the value of the lstEmpresaEnderecoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public void setLstEmpresaEnderecoEntrega(JAXBElement<ArrayOfEmpresaEnderecoDTO> value) {
        this.lstEmpresaEnderecoEntrega = ((JAXBElement<ArrayOfEmpresaEnderecoDTO> ) value);
    }

    /**
     * Gets the value of the lstEmpresaEnderecoInstitucional property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaEnderecoDTO> getLstEmpresaEnderecoInstitucional() {
        return lstEmpresaEnderecoInstitucional;
    }

    /**
     * Sets the value of the lstEmpresaEnderecoInstitucional property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaEnderecoDTO }{@code >}
     *     
     */
    public void setLstEmpresaEnderecoInstitucional(JAXBElement<ArrayOfEmpresaEnderecoDTO> value) {
        this.lstEmpresaEnderecoInstitucional = ((JAXBElement<ArrayOfEmpresaEnderecoDTO> ) value);
    }

    /**
     * Gets the value of the nCdEmpresa property.
     * 
     */
    public long getNCdEmpresa() {
        return nCdEmpresa;
    }

    /**
     * Sets the value of the nCdEmpresa property.
     * 
     */
    public void setNCdEmpresa(long value) {
        this.nCdEmpresa = value;
    }

    /**
     * Gets the value of the nIdTipoPessoa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNIdTipoPessoa() {
        return nIdTipoPessoa;
    }

    /**
     * Sets the value of the nIdTipoPessoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNIdTipoPessoa(Integer value) {
        this.nIdTipoPessoa = value;
    }

    /**
     * Gets the value of the nStEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNStEmpresa() {
        return nStEmpresa;
    }

    /**
     * Sets the value of the nStEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNStEmpresa(Integer value) {
        this.nStEmpresa = value;
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
     * Gets the value of the sDsContatoDDD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsContatoDDD() {
        return sDsContatoDDD;
    }

    /**
     * Sets the value of the sDsContatoDDD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsContatoDDD(JAXBElement<String> value) {
        this.sDsContatoDDD = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsContatoEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsContatoEmail() {
        return sDsContatoEmail;
    }

    /**
     * Sets the value of the sDsContatoEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsContatoEmail(String value) {
        this.sDsContatoEmail = value;
    }

    /**
     * Gets the value of the sDsContatoFone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsContatoFone() {
        return sDsContatoFone;
    }

    /**
     * Sets the value of the sDsContatoFone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsContatoFone(JAXBElement<String> value) {
        this.sDsContatoFone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNmEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmEmpresa() {
        return sNmEmpresa;
    }

    /**
     * Sets the value of the sNmEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmEmpresa(String value) {
        this.sNmEmpresa = value;
    }

    /**
     * Gets the value of the sNmFantasia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmFantasia() {
        return sNmFantasia;
    }

    /**
     * Sets the value of the sNmFantasia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmFantasia(String value) {
        this.sNmFantasia = value;
    }

    /**
     * Gets the value of the sNrCnpj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrCnpj() {
        return sNrCnpj;
    }

    /**
     * Sets the value of the sNrCnpj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrCnpj(JAXBElement<String> value) {
        this.sNrCnpj = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrInscricaoEstadual property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrInscricaoEstadual() {
        return sNrInscricaoEstadual;
    }

    /**
     * Sets the value of the sNrInscricaoEstadual property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrInscricaoEstadual(JAXBElement<String> value) {
        this.sNrInscricaoEstadual = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtInicioAtividade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtInicioAtividade() {
        return tDtInicioAtividade;
    }

    /**
     * Sets the value of the tDtInicioAtividade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtInicioAtividade(XMLGregorianCalendar value) {
        this.tDtInicioAtividade = value;
    }

    /**
     * Gets the value of the tDtNascimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtNascimento() {
        return tDtNascimento;
    }

    /**
     * Sets the value of the tDtNascimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtNascimento(XMLGregorianCalendar value) {
        this.tDtNascimento = value;
    }

}
