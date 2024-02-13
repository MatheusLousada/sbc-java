
package br.gov.sp.saobernardo.paradigma.ws.empresa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CrcHistoricoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrcHistoricoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdCrcHistorico" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdVersao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nNrOrdem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sDsLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNmDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sSgDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtHistorico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrcHistoricoDTO", propOrder = {
    "nCdCrcHistorico",
    "nCdVersao",
    "nNrOrdem",
    "sDsLink",
    "sNmDocumento",
    "sSgDocumento",
    "tDtHistorico"
})
public class CrcHistoricoDTO
    extends DtoBase
{

    protected long nCdCrcHistorico;
    protected long nCdVersao;
    protected int nNrOrdem;
    @XmlElement(required = true, nillable = true)
    protected String sDsLink;
    @XmlElement(required = true, nillable = true)
    protected String sNmDocumento;
    @XmlElement(required = true, nillable = true)
    protected String sSgDocumento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtHistorico;

    /**
     * Gets the value of the nCdCrcHistorico property.
     * 
     */
    public long getNCdCrcHistorico() {
        return nCdCrcHistorico;
    }

    /**
     * Sets the value of the nCdCrcHistorico property.
     * 
     */
    public void setNCdCrcHistorico(long value) {
        this.nCdCrcHistorico = value;
    }

    /**
     * Gets the value of the nCdVersao property.
     * 
     */
    public long getNCdVersao() {
        return nCdVersao;
    }

    /**
     * Sets the value of the nCdVersao property.
     * 
     */
    public void setNCdVersao(long value) {
        this.nCdVersao = value;
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
     * Gets the value of the sDsLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsLink() {
        return sDsLink;
    }

    /**
     * Sets the value of the sDsLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsLink(String value) {
        this.sDsLink = value;
    }

    /**
     * Gets the value of the sNmDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNmDocumento() {
        return sNmDocumento;
    }

    /**
     * Sets the value of the sNmDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNmDocumento(String value) {
        this.sNmDocumento = value;
    }

    /**
     * Gets the value of the sSgDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSgDocumento() {
        return sSgDocumento;
    }

    /**
     * Sets the value of the sSgDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSgDocumento(String value) {
        this.sSgDocumento = value;
    }

    /**
     * Gets the value of the tDtHistorico property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtHistorico() {
        return tDtHistorico;
    }

    /**
     * Sets the value of the tDtHistorico property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtHistorico(XMLGregorianCalendar value) {
        this.tDtHistorico = value;
    }

}
