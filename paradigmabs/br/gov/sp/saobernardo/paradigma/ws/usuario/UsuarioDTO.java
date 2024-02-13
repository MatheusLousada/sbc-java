
package br.gov.sp.saobernardo.paradigma.ws.usuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsuarioDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsuarioDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstGrupoUsuario" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfGrupoUsuarioDTO" minOccurs="0"/>
 *         &lt;element name="lstIdPerfil" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="lstIdPerfis" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPerfilDTO" minOccurs="0"/>
 *         &lt;element name="lstUsuarioCentroCusto" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfUsuarioCentroCustoDTO" minOccurs="0"/>
 *         &lt;element name="lstUsuarioEmpresa" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfUsuarioEmpresaDTO" minOccurs="0"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nIdRepresentante" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuarioEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsEmailContato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNmUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrCPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "UsuarioDTO", propOrder = {
    "lstGrupoUsuario",
    "lstIdPerfil",
    "lstIdPerfis",
    "lstUsuarioCentroCusto",
    "lstUsuarioEmpresa",
    "nCdSituacao",
    "nIdRepresentante",
    "sCdDepartamento",
    "sCdEmpresa",
    "sCdUsuario",
    "sCdUsuarioEmpresa",
    "sDsEmailContato",
    "sNmUsuario",
    "sNrCPF",
    "sNrTelefone",
    "sNrTelefoneDDD"
})
public class UsuarioDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstGrupoUsuario", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfGrupoUsuarioDTO> lstGrupoUsuario;
    @XmlElementRef(name = "lstIdPerfil", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfint> lstIdPerfil;
    @XmlElementRef(name = "lstIdPerfis", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPerfilDTO> lstIdPerfis;
    @XmlElementRef(name = "lstUsuarioCentroCusto", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfUsuarioCentroCustoDTO> lstUsuarioCentroCusto;
    @XmlElementRef(name = "lstUsuarioEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfUsuarioEmpresaDTO> lstUsuarioEmpresa;
    protected int nCdSituacao;
    @XmlElementRef(name = "nIdRepresentante", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nIdRepresentante;
    @XmlElementRef(name = "sCdDepartamento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdDepartamento;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuario;
    @XmlElementRef(name = "sCdUsuarioEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUsuarioEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sDsEmailContato;
    @XmlElement(required = true, nillable = true)
    protected String sNmUsuario;
    @XmlElementRef(name = "sNrCPF", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrCPF;
    @XmlElementRef(name = "sNrTelefone", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrTelefone;
    @XmlElementRef(name = "sNrTelefoneDDD", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrTelefoneDDD;

    /**
     * Gets the value of the lstGrupoUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGrupoUsuarioDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGrupoUsuarioDTO> getLstGrupoUsuario() {
        return lstGrupoUsuario;
    }

    /**
     * Sets the value of the lstGrupoUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGrupoUsuarioDTO }{@code >}
     *     
     */
    public void setLstGrupoUsuario(JAXBElement<ArrayOfGrupoUsuarioDTO> value) {
        this.lstGrupoUsuario = ((JAXBElement<ArrayOfGrupoUsuarioDTO> ) value);
    }

    /**
     * Gets the value of the lstIdPerfil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getLstIdPerfil() {
        return lstIdPerfil;
    }

    /**
     * Sets the value of the lstIdPerfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setLstIdPerfil(JAXBElement<ArrayOfint> value) {
        this.lstIdPerfil = ((JAXBElement<ArrayOfint> ) value);
    }

    /**
     * Gets the value of the lstIdPerfis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPerfilDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPerfilDTO> getLstIdPerfis() {
        return lstIdPerfis;
    }

    /**
     * Sets the value of the lstIdPerfis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPerfilDTO }{@code >}
     *     
     */
    public void setLstIdPerfis(JAXBElement<ArrayOfPerfilDTO> value) {
        this.lstIdPerfis = ((JAXBElement<ArrayOfPerfilDTO> ) value);
    }

    /**
     * Gets the value of the lstUsuarioCentroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUsuarioCentroCustoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUsuarioCentroCustoDTO> getLstUsuarioCentroCusto() {
        return lstUsuarioCentroCusto;
    }

    /**
     * Sets the value of the lstUsuarioCentroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUsuarioCentroCustoDTO }{@code >}
     *     
     */
    public void setLstUsuarioCentroCusto(JAXBElement<ArrayOfUsuarioCentroCustoDTO> value) {
        this.lstUsuarioCentroCusto = ((JAXBElement<ArrayOfUsuarioCentroCustoDTO> ) value);
    }

    /**
     * Gets the value of the lstUsuarioEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUsuarioEmpresaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUsuarioEmpresaDTO> getLstUsuarioEmpresa() {
        return lstUsuarioEmpresa;
    }

    /**
     * Sets the value of the lstUsuarioEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUsuarioEmpresaDTO }{@code >}
     *     
     */
    public void setLstUsuarioEmpresa(JAXBElement<ArrayOfUsuarioEmpresaDTO> value) {
        this.lstUsuarioEmpresa = ((JAXBElement<ArrayOfUsuarioEmpresaDTO> ) value);
    }

    /**
     * Gets the value of the nCdSituacao property.
     * 
     */
    public int getNCdSituacao() {
        return nCdSituacao;
    }

    /**
     * Sets the value of the nCdSituacao property.
     * 
     */
    public void setNCdSituacao(int value) {
        this.nCdSituacao = value;
    }

    /**
     * Gets the value of the nIdRepresentante property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNIdRepresentante() {
        return nIdRepresentante;
    }

    /**
     * Sets the value of the nIdRepresentante property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNIdRepresentante(JAXBElement<Integer> value) {
        this.nIdRepresentante = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sCdDepartamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdDepartamento() {
        return sCdDepartamento;
    }

    /**
     * Sets the value of the sCdDepartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdDepartamento(JAXBElement<String> value) {
        this.sCdDepartamento = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUsuario() {
        return sCdUsuario;
    }

    /**
     * Sets the value of the sCdUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUsuario(String value) {
        this.sCdUsuario = value;
    }

    /**
     * Gets the value of the sCdUsuarioEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUsuarioEmpresa() {
        return sCdUsuarioEmpresa;
    }

    /**
     * Sets the value of the sCdUsuarioEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUsuarioEmpresa(JAXBElement<String> value) {
        this.sCdUsuarioEmpresa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsEmailContato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsEmailContato() {
        return sDsEmailContato;
    }

    /**
     * Sets the value of the sDsEmailContato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsEmailContato(String value) {
        this.sDsEmailContato = value;
    }

    /**
     * Gets the value of the sNmUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmUsuario() {
        return sNmUsuario;
    }

    /**
     * Sets the value of the sNmUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmUsuario(String value) {
        this.sNmUsuario = value;
    }

    /**
     * Gets the value of the sNrCPF property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrCPF() {
        return sNrCPF;
    }

    /**
     * Sets the value of the sNrCPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrCPF(JAXBElement<String> value) {
        this.sNrCPF = ((JAXBElement<String> ) value);
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
