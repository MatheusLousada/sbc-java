
package br.gov.sp.saobernardo.paradigma.ws.gestao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GestaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GestaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdGestao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsGestao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsMinemonico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsMotivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNmUsuarioResponsavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtFimVigencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtInicioVigencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtRealizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestaoDTO", propOrder = {
    "sCdGestao",
    "sDsGestao",
    "sDsMinemonico",
    "sDsMotivo",
    "sNmUsuarioResponsavel",
    "tDtFimVigencia",
    "tDtInicioVigencia",
    "tDtRealizacao"
})
public class GestaoDTO
    extends DtoBase
{

    @XmlElementRef(name = "sCdGestao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdGestao;
    @XmlElementRef(name = "sDsGestao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsGestao;
    @XmlElementRef(name = "sDsMinemonico", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsMinemonico;
    @XmlElementRef(name = "sDsMotivo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsMotivo;
    @XmlElementRef(name = "sNmUsuarioResponsavel", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNmUsuarioResponsavel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFimVigencia;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtInicioVigencia;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtRealizacao;

    /**
     * Gets the value of the sCdGestao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdGestao() {
        return sCdGestao;
    }

    /**
     * Sets the value of the sCdGestao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdGestao(JAXBElement<String> value) {
        this.sCdGestao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsGestao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsGestao() {
        return sDsGestao;
    }

    /**
     * Sets the value of the sDsGestao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsGestao(JAXBElement<String> value) {
        this.sDsGestao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsMinemonico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsMinemonico() {
        return sDsMinemonico;
    }

    /**
     * Sets the value of the sDsMinemonico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsMinemonico(JAXBElement<String> value) {
        this.sDsMinemonico = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsMotivo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsMotivo() {
        return sDsMotivo;
    }

    /**
     * Sets the value of the sDsMotivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsMotivo(JAXBElement<String> value) {
        this.sDsMotivo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNmUsuarioResponsavel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNmUsuarioResponsavel() {
        return sNmUsuarioResponsavel;
    }

    /**
     * Sets the value of the sNmUsuarioResponsavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNmUsuarioResponsavel(JAXBElement<String> value) {
        this.sNmUsuarioResponsavel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtFimVigencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtFimVigencia() {
        return tDtFimVigencia;
    }

    /**
     * Sets the value of the tDtFimVigencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtFimVigencia(XMLGregorianCalendar value) {
        this.tDtFimVigencia = value;
    }

    /**
     * Gets the value of the tDtInicioVigencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtInicioVigencia() {
        return tDtInicioVigencia;
    }

    /**
     * Sets the value of the tDtInicioVigencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtInicioVigencia(XMLGregorianCalendar value) {
        this.tDtInicioVigencia = value;
    }

    /**
     * Gets the value of the tDtRealizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtRealizacao() {
        return tDtRealizacao;
    }

    /**
     * Sets the value of the tDtRealizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtRealizacao(XMLGregorianCalendar value) {
        this.tDtRealizacao = value;
    }

}
