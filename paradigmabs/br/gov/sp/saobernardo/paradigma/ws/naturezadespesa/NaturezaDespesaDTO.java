
package br.gov.sp.saobernardo.paradigma.ws.naturezadespesa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NaturezaDespesaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NaturezaDespesaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlAtivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdNaturezaDespesa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdNaturezaDespesaPai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsNaturezaDespesa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtFimVigencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tDtInicioVigencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaturezaDespesaDTO", propOrder = {
    "bFlAtivo",
    "sCdCodigo",
    "sCdNaturezaDespesa",
    "sCdNaturezaDespesaPai",
    "sDsNaturezaDespesa",
    "tDtFimVigencia",
    "tDtInicioVigencia"
})
public class NaturezaDespesaDTO
    extends DtoBase
{

    @XmlElementRef(name = "bFlAtivo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlAtivo;
    @XmlElement(required = true, nillable = true)
    protected String sCdCodigo;
    @XmlElement(required = true, nillable = true)
    protected String sCdNaturezaDespesa;
    @XmlElementRef(name = "sCdNaturezaDespesaPai", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdNaturezaDespesaPai;
    @XmlElement(required = true, nillable = true)
    protected String sDsNaturezaDespesa;
    @XmlElementRef(name = "tDtFimVigencia", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtFimVigencia;
    @XmlElementRef(name = "tDtInicioVigencia", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> tDtInicioVigencia;

    /**
     * Gets the value of the bFlAtivo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlAtivo() {
        return bFlAtivo;
    }

    /**
     * Sets the value of the bFlAtivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlAtivo(JAXBElement<Integer> value) {
        this.bFlAtivo = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sCdCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCodigo() {
        return sCdCodigo;
    }

    /**
     * Sets the value of the sCdCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCodigo(String value) {
        this.sCdCodigo = value;
    }

    /**
     * Gets the value of the sCdNaturezaDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdNaturezaDespesa() {
        return sCdNaturezaDespesa;
    }

    /**
     * Sets the value of the sCdNaturezaDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdNaturezaDespesa(String value) {
        this.sCdNaturezaDespesa = value;
    }

    /**
     * Gets the value of the sCdNaturezaDespesaPai property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdNaturezaDespesaPai() {
        return sCdNaturezaDespesaPai;
    }

    /**
     * Sets the value of the sCdNaturezaDespesaPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdNaturezaDespesaPai(JAXBElement<String> value) {
        this.sCdNaturezaDespesaPai = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsNaturezaDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsNaturezaDespesa() {
        return sDsNaturezaDespesa;
    }

    /**
     * Sets the value of the sDsNaturezaDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsNaturezaDespesa(String value) {
        this.sDsNaturezaDespesa = value;
    }

    /**
     * Gets the value of the tDtFimVigencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTDtFimVigencia() {
        return tDtFimVigencia;
    }

    /**
     * Sets the value of the tDtFimVigencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTDtFimVigencia(JAXBElement<XMLGregorianCalendar> value) {
        this.tDtFimVigencia = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the tDtInicioVigencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTDtInicioVigencia() {
        return tDtInicioVigencia;
    }

    /**
     * Sets the value of the tDtInicioVigencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTDtInicioVigencia(JAXBElement<XMLGregorianCalendar> value) {
        this.tDtInicioVigencia = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
