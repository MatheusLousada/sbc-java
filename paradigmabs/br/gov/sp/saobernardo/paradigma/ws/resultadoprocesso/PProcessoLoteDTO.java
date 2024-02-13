
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

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
 * <p>Java class for PProcessoLoteDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PProcessoLoteDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlReferencia" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstPProcessoLoteIdioma" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoLoteIdiomaDTO" minOccurs="0"/>
 *         &lt;element name="lstPProcessoLoteResultado" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoLoteResultadoDTO" minOccurs="0"/>
 *         &lt;element name="nCdLoteSequencial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nStLote" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdLoteLegado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuarioFinalizacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsLote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtAdjudicacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtFinalizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PProcessoLoteDTO", propOrder = {
    "dVlReferencia",
    "lstPProcessoLoteIdioma",
    "lstPProcessoLoteResultado",
    "nCdLoteSequencial",
    "nStLote",
    "sCdLoteLegado",
    "sCdUsuarioFinalizacao",
    "sDsLote",
    "tDtAdjudicacao",
    "tDtFinalizacao"
})
public class PProcessoLoteDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dVlReferencia;
    @XmlElementRef(name = "lstPProcessoLoteIdioma", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPProcessoLoteIdiomaDTO> lstPProcessoLoteIdioma;
    @XmlElementRef(name = "lstPProcessoLoteResultado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPProcessoLoteResultadoDTO> lstPProcessoLoteResultado;
    protected int nCdLoteSequencial;
    protected int nStLote;
    @XmlElement(required = true, nillable = true)
    protected String sCdLoteLegado;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuarioFinalizacao;
    @XmlElement(required = true, nillable = true)
    protected String sDsLote;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtAdjudicacao;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFinalizacao;

    /**
     * Gets the value of the dVlReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlReferencia() {
        return dVlReferencia;
    }

    /**
     * Sets the value of the dVlReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlReferencia(BigDecimal value) {
        this.dVlReferencia = value;
    }

    /**
     * Gets the value of the lstPProcessoLoteIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLoteIdiomaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPProcessoLoteIdiomaDTO> getLstPProcessoLoteIdioma() {
        return lstPProcessoLoteIdioma;
    }

    /**
     * Sets the value of the lstPProcessoLoteIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLoteIdiomaDTO }{@code >}
     *     
     */
    public void setLstPProcessoLoteIdioma(JAXBElement<ArrayOfPProcessoLoteIdiomaDTO> value) {
        this.lstPProcessoLoteIdioma = ((JAXBElement<ArrayOfPProcessoLoteIdiomaDTO> ) value);
    }

    /**
     * Gets the value of the lstPProcessoLoteResultado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLoteResultadoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPProcessoLoteResultadoDTO> getLstPProcessoLoteResultado() {
        return lstPProcessoLoteResultado;
    }

    /**
     * Sets the value of the lstPProcessoLoteResultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoLoteResultadoDTO }{@code >}
     *     
     */
    public void setLstPProcessoLoteResultado(JAXBElement<ArrayOfPProcessoLoteResultadoDTO> value) {
        this.lstPProcessoLoteResultado = ((JAXBElement<ArrayOfPProcessoLoteResultadoDTO> ) value);
    }

    /**
     * Gets the value of the nCdLoteSequencial property.
     * 
     */
    public int getNCdLoteSequencial() {
        return nCdLoteSequencial;
    }

    /**
     * Sets the value of the nCdLoteSequencial property.
     * 
     */
    public void setNCdLoteSequencial(int value) {
        this.nCdLoteSequencial = value;
    }

    /**
     * Gets the value of the nStLote property.
     * 
     */
    public int getNStLote() {
        return nStLote;
    }

    /**
     * Sets the value of the nStLote property.
     * 
     */
    public void setNStLote(int value) {
        this.nStLote = value;
    }

    /**
     * Gets the value of the sCdLoteLegado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdLoteLegado() {
        return sCdLoteLegado;
    }

    /**
     * Sets the value of the sCdLoteLegado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdLoteLegado(String value) {
        this.sCdLoteLegado = value;
    }

    /**
     * Gets the value of the sCdUsuarioFinalizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUsuarioFinalizacao() {
        return sCdUsuarioFinalizacao;
    }

    /**
     * Sets the value of the sCdUsuarioFinalizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUsuarioFinalizacao(String value) {
        this.sCdUsuarioFinalizacao = value;
    }

    /**
     * Gets the value of the sDsLote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsLote() {
        return sDsLote;
    }

    /**
     * Sets the value of the sDsLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsLote(String value) {
        this.sDsLote = value;
    }

    /**
     * Gets the value of the tDtAdjudicacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtAdjudicacao() {
        return tDtAdjudicacao;
    }

    /**
     * Sets the value of the tDtAdjudicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtAdjudicacao(XMLGregorianCalendar value) {
        this.tDtAdjudicacao = value;
    }

    /**
     * Gets the value of the tDtFinalizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtFinalizacao() {
        return tDtFinalizacao;
    }

    /**
     * Sets the value of the tDtFinalizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtFinalizacao(XMLGregorianCalendar value) {
        this.tDtFinalizacao = value;
    }

}
