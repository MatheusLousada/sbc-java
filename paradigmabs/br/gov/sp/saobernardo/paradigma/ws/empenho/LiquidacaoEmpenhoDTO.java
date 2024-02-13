
package br.gov.sp.saobernardo.paradigma.ws.empenho;

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
 * <p>Java class for LiquidacaoEmpenhoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiquidacaoEmpenhoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlLiquidado" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstLiquidacaoEmpenhoItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfLiquidacaoEmpenhoItemDTO"/>
 *         &lt;element name="nCdIndicadorMap" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdEmpresaCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrEmpenho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrEstorno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrLiquidacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtLancamento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtRegistro" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidacaoEmpenhoDTO", propOrder = {
    "dVlLiquidado",
    "lstLiquidacaoEmpenhoItemDTO",
    "nCdIndicadorMap",
    "sCdEmpresaCliente",
    "sDsObservacao",
    "sNrEmpenho",
    "sNrEstorno",
    "sNrLiquidacao",
    "tDtLancamento",
    "tDtRegistro"
})
public class LiquidacaoEmpenhoDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dVlLiquidado;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfLiquidacaoEmpenhoItemDTO lstLiquidacaoEmpenhoItemDTO;
    protected int nCdIndicadorMap;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaCliente;
    @XmlElementRef(name = "sDsObservacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsObservacao;
    @XmlElement(required = true, nillable = true)
    protected String sNrEmpenho;
    @XmlElement(required = true, nillable = true)
    protected String sNrEstorno;
    @XmlElement(required = true, nillable = true)
    protected String sNrLiquidacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtLancamento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtRegistro;

    /**
     * Gets the value of the dVlLiquidado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlLiquidado() {
        return dVlLiquidado;
    }

    /**
     * Sets the value of the dVlLiquidado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlLiquidado(BigDecimal value) {
        this.dVlLiquidado = value;
    }

    /**
     * Gets the value of the lstLiquidacaoEmpenhoItemDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLiquidacaoEmpenhoItemDTO }
     *     
     */
    public ArrayOfLiquidacaoEmpenhoItemDTO getLstLiquidacaoEmpenhoItemDTO() {
        return lstLiquidacaoEmpenhoItemDTO;
    }

    /**
     * Sets the value of the lstLiquidacaoEmpenhoItemDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLiquidacaoEmpenhoItemDTO }
     *     
     */
    public void setLstLiquidacaoEmpenhoItemDTO(ArrayOfLiquidacaoEmpenhoItemDTO value) {
        this.lstLiquidacaoEmpenhoItemDTO = value;
    }

    /**
     * Gets the value of the nCdIndicadorMap property.
     * 
     */
    public int getNCdIndicadorMap() {
        return nCdIndicadorMap;
    }

    /**
     * Sets the value of the nCdIndicadorMap property.
     * 
     */
    public void setNCdIndicadorMap(int value) {
        this.nCdIndicadorMap = value;
    }

    /**
     * Gets the value of the sCdEmpresaCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaCliente() {
        return sCdEmpresaCliente;
    }

    /**
     * Sets the value of the sCdEmpresaCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaCliente(String value) {
        this.sCdEmpresaCliente = value;
    }

    /**
     * Gets the value of the sDsObservacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsObservacao() {
        return sDsObservacao;
    }

    /**
     * Sets the value of the sDsObservacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsObservacao(JAXBElement<String> value) {
        this.sDsObservacao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrEmpenho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrEmpenho() {
        return sNrEmpenho;
    }

    /**
     * Sets the value of the sNrEmpenho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrEmpenho(String value) {
        this.sNrEmpenho = value;
    }

    /**
     * Gets the value of the sNrEstorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrEstorno() {
        return sNrEstorno;
    }

    /**
     * Sets the value of the sNrEstorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrEstorno(String value) {
        this.sNrEstorno = value;
    }

    /**
     * Gets the value of the sNrLiquidacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrLiquidacao() {
        return sNrLiquidacao;
    }

    /**
     * Sets the value of the sNrLiquidacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrLiquidacao(String value) {
        this.sNrLiquidacao = value;
    }

    /**
     * Gets the value of the tDtLancamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtLancamento() {
        return tDtLancamento;
    }

    /**
     * Sets the value of the tDtLancamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtLancamento(XMLGregorianCalendar value) {
        this.tDtLancamento = value;
    }

    /**
     * Gets the value of the tDtRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtRegistro() {
        return tDtRegistro;
    }

    /**
     * Sets the value of the tDtRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtRegistro(XMLGregorianCalendar value) {
        this.tDtRegistro = value;
    }

}
