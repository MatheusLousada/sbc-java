
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
 * <p>Java class for EmpresaRepresentanteSocioDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpresaRepresentanteSocioDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlAtiva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlValidadeIndeterminada" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCdTipoRepresentanteMap" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sDsEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNmRepresentante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrCpf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrTelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrTelefoneDDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtFimMandato" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtInicioMandato" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpresaRepresentanteSocioDTO", propOrder = {
    "bFlAtiva",
    "bFlValidadeIndeterminada",
    "nCdTipoRepresentanteMap",
    "sDsEmail",
    "sDsEndereco",
    "sNmRepresentante",
    "sNrCpf",
    "sNrTelefone",
    "sNrTelefoneDDD",
    "tDtFimMandato",
    "tDtInicioMandato"
})
public class EmpresaRepresentanteSocioDTO
    extends DtoBase
{

    protected Integer bFlAtiva;
    protected Integer bFlValidadeIndeterminada;
    protected int nCdTipoRepresentanteMap;
    @XmlElement(required = true, nillable = true)
    protected String sDsEmail;
    @XmlElementRef(name = "sDsEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsEndereco;
    @XmlElement(required = true, nillable = true)
    protected String sNmRepresentante;
    @XmlElement(required = true, nillable = true)
    protected String sNrCpf;
    @XmlElementRef(name = "sNrTelefone", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrTelefone;
    @XmlElementRef(name = "sNrTelefoneDDD", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrTelefoneDDD;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFimMandato;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtInicioMandato;

    /**
     * Gets the value of the bFlAtiva property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlAtiva() {
        return bFlAtiva;
    }

    /**
     * Sets the value of the bFlAtiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlAtiva(Integer value) {
        this.bFlAtiva = value;
    }

    /**
     * Gets the value of the bFlValidadeIndeterminada property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlValidadeIndeterminada() {
        return bFlValidadeIndeterminada;
    }

    /**
     * Sets the value of the bFlValidadeIndeterminada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlValidadeIndeterminada(Integer value) {
        this.bFlValidadeIndeterminada = value;
    }

    /**
     * Gets the value of the nCdTipoRepresentanteMap property.
     * 
     */
    public int getNCdTipoRepresentanteMap() {
        return nCdTipoRepresentanteMap;
    }

    /**
     * Sets the value of the nCdTipoRepresentanteMap property.
     * 
     */
    public void setNCdTipoRepresentanteMap(int value) {
        this.nCdTipoRepresentanteMap = value;
    }

    /**
     * Gets the value of the sDsEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsEmail() {
        return sDsEmail;
    }

    /**
     * Sets the value of the sDsEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsEmail(String value) {
        this.sDsEmail = value;
    }

    /**
     * Gets the value of the sDsEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsEndereco() {
        return sDsEndereco;
    }

    /**
     * Sets the value of the sDsEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsEndereco(JAXBElement<String> value) {
        this.sDsEndereco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNmRepresentante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmRepresentante() {
        return sNmRepresentante;
    }

    /**
     * Sets the value of the sNmRepresentante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmRepresentante(String value) {
        this.sNmRepresentante = value;
    }

    /**
     * Gets the value of the sNrCpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrCpf() {
        return sNrCpf;
    }

    /**
     * Sets the value of the sNrCpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrCpf(String value) {
        this.sNrCpf = value;
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

    /**
     * Gets the value of the tDtFimMandato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtFimMandato() {
        return tDtFimMandato;
    }

    /**
     * Sets the value of the tDtFimMandato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtFimMandato(XMLGregorianCalendar value) {
        this.tDtFimMandato = value;
    }

    /**
     * Gets the value of the tDtInicioMandato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtInicioMandato() {
        return tDtInicioMandato;
    }

    /**
     * Sets the value of the tDtInicioMandato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtInicioMandato(XMLGregorianCalendar value) {
        this.tDtInicioMandato = value;
    }

}
