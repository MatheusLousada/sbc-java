
package br.gov.sp.saobernardo.paradigma.ws.notafiscaltituloresumida;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NotaFiscalTituloResumidaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotaFiscalTituloResumidaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstNotaFiscalItemTituloResumidaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfNotaFiscalItemTituloResumidaDTO"/>
 *         &lt;element name="sCdEmpresaFornecedora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrNotaFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrSerie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaFiscalTituloResumidaDTO", propOrder = {
    "dVlTotal",
    "lstNotaFiscalItemTituloResumidaDTO",
    "sCdEmpresaFornecedora",
    "sNrNotaFiscal",
    "sNrSerie",
    "tDtEmissao",
    "tDtVencimento"
})
public class NotaFiscalTituloResumidaDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dVlTotal;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfNotaFiscalItemTituloResumidaDTO lstNotaFiscalItemTituloResumidaDTO;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaFornecedora;
    @XmlElement(required = true, nillable = true)
    protected String sNrNotaFiscal;
    @XmlElement(required = true, nillable = true)
    protected String sNrSerie;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEmissao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtVencimento;

    /**
     * Gets the value of the dVlTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlTotal() {
        return dVlTotal;
    }

    /**
     * Sets the value of the dVlTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlTotal(BigDecimal value) {
        this.dVlTotal = value;
    }

    /**
     * Gets the value of the lstNotaFiscalItemTituloResumidaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotaFiscalItemTituloResumidaDTO }
     *     
     */
    public ArrayOfNotaFiscalItemTituloResumidaDTO getLstNotaFiscalItemTituloResumidaDTO() {
        return lstNotaFiscalItemTituloResumidaDTO;
    }

    /**
     * Sets the value of the lstNotaFiscalItemTituloResumidaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotaFiscalItemTituloResumidaDTO }
     *     
     */
    public void setLstNotaFiscalItemTituloResumidaDTO(ArrayOfNotaFiscalItemTituloResumidaDTO value) {
        this.lstNotaFiscalItemTituloResumidaDTO = value;
    }

    /**
     * Gets the value of the sCdEmpresaFornecedora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaFornecedora() {
        return sCdEmpresaFornecedora;
    }

    /**
     * Sets the value of the sCdEmpresaFornecedora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaFornecedora(String value) {
        this.sCdEmpresaFornecedora = value;
    }

    /**
     * Gets the value of the sNrNotaFiscal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrNotaFiscal() {
        return sNrNotaFiscal;
    }

    /**
     * Sets the value of the sNrNotaFiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrNotaFiscal(String value) {
        this.sNrNotaFiscal = value;
    }

    /**
     * Gets the value of the sNrSerie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrSerie() {
        return sNrSerie;
    }

    /**
     * Sets the value of the sNrSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrSerie(String value) {
        this.sNrSerie = value;
    }

    /**
     * Gets the value of the tDtEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtEmissao() {
        return tDtEmissao;
    }

    /**
     * Sets the value of the tDtEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtEmissao(XMLGregorianCalendar value) {
        this.tDtEmissao = value;
    }

    /**
     * Gets the value of the tDtVencimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtVencimento() {
        return tDtVencimento;
    }

    /**
     * Sets the value of the tDtVencimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtVencimento(XMLGregorianCalendar value) {
        this.tDtVencimento = value;
    }

}
