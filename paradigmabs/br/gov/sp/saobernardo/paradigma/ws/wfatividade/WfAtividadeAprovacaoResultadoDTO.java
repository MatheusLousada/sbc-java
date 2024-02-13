
package br.gov.sp.saobernardo.paradigma.ws.wfatividade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WfAtividadeAprovacaoResultadoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WfAtividadeAprovacaoResultadoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdAtividade" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nIdAprovado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sDsJustificativa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtConcluidaEm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WfAtividadeAprovacaoResultadoDTO", propOrder = {
    "nCdAtividade",
    "nIdAprovado",
    "sDsJustificativa",
    "tDtConcluidaEm",
    "tDtInicio"
})
public class WfAtividadeAprovacaoResultadoDTO
    extends DtoBase
{

    protected long nCdAtividade;
    protected int nIdAprovado;
    @XmlElement(required = true, nillable = true)
    protected String sDsJustificativa;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtConcluidaEm;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtInicio;

    /**
     * Gets the value of the nCdAtividade property.
     * 
     */
    public long getNCdAtividade() {
        return nCdAtividade;
    }

    /**
     * Sets the value of the nCdAtividade property.
     * 
     */
    public void setNCdAtividade(long value) {
        this.nCdAtividade = value;
    }

    /**
     * Gets the value of the nIdAprovado property.
     * 
     */
    public int getNIdAprovado() {
        return nIdAprovado;
    }

    /**
     * Sets the value of the nIdAprovado property.
     * 
     */
    public void setNIdAprovado(int value) {
        this.nIdAprovado = value;
    }

    /**
     * Gets the value of the sDsJustificativa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsJustificativa() {
        return sDsJustificativa;
    }

    /**
     * Sets the value of the sDsJustificativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsJustificativa(String value) {
        this.sDsJustificativa = value;
    }

    /**
     * Gets the value of the tDtConcluidaEm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtConcluidaEm() {
        return tDtConcluidaEm;
    }

    /**
     * Sets the value of the tDtConcluidaEm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtConcluidaEm(XMLGregorianCalendar value) {
        this.tDtConcluidaEm = value;
    }

    /**
     * Gets the value of the tDtInicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtInicio() {
        return tDtInicio;
    }

    /**
     * Sets the value of the tDtInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtInicio(XMLGregorianCalendar value) {
        this.tDtInicio = value;
    }

}
