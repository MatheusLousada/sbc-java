
package br.gov.sp.saobernardo.paradigma.ws.empresa;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EmpresaAvaliacaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpresaAvaliacaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nNrAvaliacao" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nNrAvaliacaoMedia" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtAutoAvaliacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpresaAvaliacaoDTO", propOrder = {
    "nCdTipoDocumento",
    "nNrAvaliacao",
    "nNrAvaliacaoMedia",
    "sCdEmpresa",
    "sCdUsuario",
    "sNrDocumento",
    "tDtAutoAvaliacao"
})
public class EmpresaAvaliacaoDTO
    extends DtoBase
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nCdTipoDocumento;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal nNrAvaliacao;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal nNrAvaliacaoMedia;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElementRef(name = "sCdUsuario", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUsuario;
    @XmlElementRef(name = "sNrDocumento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNrDocumento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtAutoAvaliacao;

    /**
     * Gets the value of the nCdTipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCdTipoDocumento() {
        return nCdTipoDocumento;
    }

    /**
     * Sets the value of the nCdTipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCdTipoDocumento(Integer value) {
        this.nCdTipoDocumento = value;
    }

    /**
     * Gets the value of the nNrAvaliacao property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNNrAvaliacao() {
        return nNrAvaliacao;
    }

    /**
     * Sets the value of the nNrAvaliacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNNrAvaliacao(BigDecimal value) {
        this.nNrAvaliacao = value;
    }

    /**
     * Gets the value of the nNrAvaliacaoMedia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNNrAvaliacaoMedia() {
        return nNrAvaliacaoMedia;
    }

    /**
     * Sets the value of the nNrAvaliacaoMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNNrAvaliacaoMedia(BigDecimal value) {
        this.nNrAvaliacaoMedia = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUsuario() {
        return sCdUsuario;
    }

    /**
     * Sets the value of the sCdUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUsuario(JAXBElement<String> value) {
        this.sCdUsuario = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNrDocumento() {
        return sNrDocumento;
    }

    /**
     * Sets the value of the sNrDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNrDocumento(JAXBElement<String> value) {
        this.sNrDocumento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtAutoAvaliacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtAutoAvaliacao() {
        return tDtAutoAvaliacao;
    }

    /**
     * Sets the value of the tDtAutoAvaliacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtAutoAvaliacao(XMLGregorianCalendar value) {
        this.tDtAutoAvaliacao = value;
    }

}
