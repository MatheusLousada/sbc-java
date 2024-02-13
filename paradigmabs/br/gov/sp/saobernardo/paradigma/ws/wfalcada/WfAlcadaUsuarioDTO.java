
package br.gov.sp.saobernardo.paradigma.ws.wfalcada;

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
 * <p>Java class for WfAlcadaUsuarioDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WfAlcadaUsuarioDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlAlcadaFinal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlAlcadaInicial" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlPeso" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nCdAlcada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdObjeto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nNrOrdem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oUsuarioDetalheAprovador" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}UsuarioDetalheDTO" minOccurs="0"/>
 *         &lt;element name="oUsuarioDetalheSubstituto" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}UsuarioDetalheDTO" minOccurs="0"/>
 *         &lt;element name="sCdUsuarioAprovador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuarioAprovadorSubstituto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sVlAtributo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtSubstitutoAte" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtSubstitutoDe" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WfAlcadaUsuarioDTO", propOrder = {
    "dVlAlcadaFinal",
    "dVlAlcadaInicial",
    "dVlPeso",
    "nCdAlcada",
    "nCdObjeto",
    "nNrOrdem",
    "oUsuarioDetalheAprovador",
    "oUsuarioDetalheSubstituto",
    "sCdUsuarioAprovador",
    "sCdUsuarioAprovadorSubstituto",
    "sVlAtributo",
    "tDtCadastro",
    "tDtSubstitutoAte",
    "tDtSubstitutoDe"
})
public class WfAlcadaUsuarioDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected BigDecimal dVlAlcadaFinal;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal dVlAlcadaInicial;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal dVlPeso;
    protected long nCdAlcada;
    protected long nCdObjeto;
    protected int nNrOrdem;
    @XmlElementRef(name = "oUsuarioDetalheAprovador", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<UsuarioDetalheDTO> oUsuarioDetalheAprovador;
    @XmlElementRef(name = "oUsuarioDetalheSubstituto", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<UsuarioDetalheDTO> oUsuarioDetalheSubstituto;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuarioAprovador;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuarioAprovadorSubstituto;
    @XmlElement(required = true, nillable = true)
    protected String sVlAtributo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtCadastro;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtSubstitutoAte;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtSubstitutoDe;

    /**
     * Gets the value of the dVlAlcadaFinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlAlcadaFinal() {
        return dVlAlcadaFinal;
    }

    /**
     * Sets the value of the dVlAlcadaFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlAlcadaFinal(BigDecimal value) {
        this.dVlAlcadaFinal = value;
    }

    /**
     * Gets the value of the dVlAlcadaInicial property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlAlcadaInicial() {
        return dVlAlcadaInicial;
    }

    /**
     * Sets the value of the dVlAlcadaInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlAlcadaInicial(BigDecimal value) {
        this.dVlAlcadaInicial = value;
    }

    /**
     * Gets the value of the dVlPeso property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlPeso() {
        return dVlPeso;
    }

    /**
     * Sets the value of the dVlPeso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlPeso(BigDecimal value) {
        this.dVlPeso = value;
    }

    /**
     * Gets the value of the nCdAlcada property.
     * 
     */
    public long getNCdAlcada() {
        return nCdAlcada;
    }

    /**
     * Sets the value of the nCdAlcada property.
     * 
     */
    public void setNCdAlcada(long value) {
        this.nCdAlcada = value;
    }

    /**
     * Gets the value of the nCdObjeto property.
     * 
     */
    public long getNCdObjeto() {
        return nCdObjeto;
    }

    /**
     * Sets the value of the nCdObjeto property.
     * 
     */
    public void setNCdObjeto(long value) {
        this.nCdObjeto = value;
    }

    /**
     * Gets the value of the nNrOrdem property.
     * 
     */
    public int getNNrOrdem() {
        return nNrOrdem;
    }

    /**
     * Sets the value of the nNrOrdem property.
     * 
     */
    public void setNNrOrdem(int value) {
        this.nNrOrdem = value;
    }

    /**
     * Gets the value of the oUsuarioDetalheAprovador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UsuarioDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<UsuarioDetalheDTO> getOUsuarioDetalheAprovador() {
        return oUsuarioDetalheAprovador;
    }

    /**
     * Sets the value of the oUsuarioDetalheAprovador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UsuarioDetalheDTO }{@code >}
     *     
     */
    public void setOUsuarioDetalheAprovador(JAXBElement<UsuarioDetalheDTO> value) {
        this.oUsuarioDetalheAprovador = ((JAXBElement<UsuarioDetalheDTO> ) value);
    }

    /**
     * Gets the value of the oUsuarioDetalheSubstituto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UsuarioDetalheDTO }{@code >}
     *     
     */
    public JAXBElement<UsuarioDetalheDTO> getOUsuarioDetalheSubstituto() {
        return oUsuarioDetalheSubstituto;
    }

    /**
     * Sets the value of the oUsuarioDetalheSubstituto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UsuarioDetalheDTO }{@code >}
     *     
     */
    public void setOUsuarioDetalheSubstituto(JAXBElement<UsuarioDetalheDTO> value) {
        this.oUsuarioDetalheSubstituto = ((JAXBElement<UsuarioDetalheDTO> ) value);
    }

    /**
     * Gets the value of the sCdUsuarioAprovador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUsuarioAprovador() {
        return sCdUsuarioAprovador;
    }

    /**
     * Sets the value of the sCdUsuarioAprovador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUsuarioAprovador(String value) {
        this.sCdUsuarioAprovador = value;
    }

    /**
     * Gets the value of the sCdUsuarioAprovadorSubstituto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUsuarioAprovadorSubstituto() {
        return sCdUsuarioAprovadorSubstituto;
    }

    /**
     * Sets the value of the sCdUsuarioAprovadorSubstituto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUsuarioAprovadorSubstituto(String value) {
        this.sCdUsuarioAprovadorSubstituto = value;
    }

    /**
     * Gets the value of the sVlAtributo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVlAtributo() {
        return sVlAtributo;
    }

    /**
     * Sets the value of the sVlAtributo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVlAtributo(String value) {
        this.sVlAtributo = value;
    }

    /**
     * Gets the value of the tDtCadastro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtCadastro() {
        return tDtCadastro;
    }

    /**
     * Sets the value of the tDtCadastro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtCadastro(XMLGregorianCalendar value) {
        this.tDtCadastro = value;
    }

    /**
     * Gets the value of the tDtSubstitutoAte property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtSubstitutoAte() {
        return tDtSubstitutoAte;
    }

    /**
     * Sets the value of the tDtSubstitutoAte property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtSubstitutoAte(XMLGregorianCalendar value) {
        this.tDtSubstitutoAte = value;
    }

    /**
     * Gets the value of the tDtSubstitutoDe property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtSubstitutoDe() {
        return tDtSubstitutoDe;
    }

    /**
     * Sets the value of the tDtSubstitutoDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtSubstitutoDe(XMLGregorianCalendar value) {
        this.tDtSubstitutoDe = value;
    }

}
