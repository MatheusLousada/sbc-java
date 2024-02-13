
package br.gov.sp.saobernardo.paradigma.ws.contrato;

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
 * <p>Java class for ContratoItemEnderecoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContratoItemEnderecoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtItemPrevista" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dQtItemRealizado" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlAliquota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lstContratoItemEnderecoTaxaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfContratoItemTaxaDTO"/>
 *         &lt;element name="nIdSuperSimples" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdCobrancaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaCobrancaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaEntregaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaFaturamentoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEntregaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdFaturamentoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemEnderecoWbc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtEntregaPrevista" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tDtEntregaRealizado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContratoItemEnderecoDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", propOrder = {
    "dQtItemPrevista",
    "dQtItemRealizado",
    "dVlAliquota",
    "lstContratoItemEnderecoTaxaDTO",
    "nIdSuperSimples",
    "sCdCobrancaEndereco",
    "sCdEmpresaCobrancaEndereco",
    "sCdEmpresaEntregaEndereco",
    "sCdEmpresaFaturamentoEndereco",
    "sCdEntregaEndereco",
    "sCdFaturamentoEndereco",
    "sCdItemEnderecoWbc",
    "tDtEntregaPrevista",
    "tDtEntregaRealizado"
})
public class ContratoItemEnderecoDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dQtItemPrevista;
    @XmlElement(required = true)
    protected BigDecimal dQtItemRealizado;
    protected BigDecimal dVlAliquota;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfContratoItemTaxaDTO lstContratoItemEnderecoTaxaDTO;
    protected Integer nIdSuperSimples;
    @XmlElementRef(name = "sCdCobrancaEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCobrancaEndereco;
    @XmlElementRef(name = "sCdEmpresaCobrancaEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaCobrancaEndereco;
    @XmlElementRef(name = "sCdEmpresaEntregaEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaEntregaEndereco;
    @XmlElementRef(name = "sCdEmpresaFaturamentoEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresaFaturamentoEndereco;
    @XmlElementRef(name = "sCdEntregaEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEntregaEndereco;
    @XmlElementRef(name = "sCdFaturamentoEndereco", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdFaturamentoEndereco;
    @XmlElement(required = true, nillable = true)
    protected String sCdItemEnderecoWbc;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEntregaPrevista;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEntregaRealizado;

    /**
     * Gets the value of the dQtItemPrevista property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtItemPrevista() {
        return dQtItemPrevista;
    }

    /**
     * Sets the value of the dQtItemPrevista property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtItemPrevista(BigDecimal value) {
        this.dQtItemPrevista = value;
    }

    /**
     * Gets the value of the dQtItemRealizado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtItemRealizado() {
        return dQtItemRealizado;
    }

    /**
     * Sets the value of the dQtItemRealizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtItemRealizado(BigDecimal value) {
        this.dQtItemRealizado = value;
    }

    /**
     * Gets the value of the dVlAliquota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlAliquota() {
        return dVlAliquota;
    }

    /**
     * Sets the value of the dVlAliquota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlAliquota(BigDecimal value) {
        this.dVlAliquota = value;
    }

    /**
     * Gets the value of the lstContratoItemEnderecoTaxaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContratoItemTaxaDTO }
     *     
     */
    public ArrayOfContratoItemTaxaDTO getLstContratoItemEnderecoTaxaDTO() {
        return lstContratoItemEnderecoTaxaDTO;
    }

    /**
     * Sets the value of the lstContratoItemEnderecoTaxaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContratoItemTaxaDTO }
     *     
     */
    public void setLstContratoItemEnderecoTaxaDTO(ArrayOfContratoItemTaxaDTO value) {
        this.lstContratoItemEnderecoTaxaDTO = value;
    }

    /**
     * Gets the value of the nIdSuperSimples property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNIdSuperSimples() {
        return nIdSuperSimples;
    }

    /**
     * Sets the value of the nIdSuperSimples property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNIdSuperSimples(Integer value) {
        this.nIdSuperSimples = value;
    }

    /**
     * Gets the value of the sCdCobrancaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdCobrancaEndereco() {
        return sCdCobrancaEndereco;
    }

    /**
     * Sets the value of the sCdCobrancaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdCobrancaEndereco(JAXBElement<String> value) {
        this.sCdCobrancaEndereco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdEmpresaCobrancaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresaCobrancaEndereco() {
        return sCdEmpresaCobrancaEndereco;
    }

    /**
     * Sets the value of the sCdEmpresaCobrancaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresaCobrancaEndereco(JAXBElement<String> value) {
        this.sCdEmpresaCobrancaEndereco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdEmpresaEntregaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresaEntregaEndereco() {
        return sCdEmpresaEntregaEndereco;
    }

    /**
     * Sets the value of the sCdEmpresaEntregaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresaEntregaEndereco(JAXBElement<String> value) {
        this.sCdEmpresaEntregaEndereco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdEmpresaFaturamentoEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresaFaturamentoEndereco() {
        return sCdEmpresaFaturamentoEndereco;
    }

    /**
     * Sets the value of the sCdEmpresaFaturamentoEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresaFaturamentoEndereco(JAXBElement<String> value) {
        this.sCdEmpresaFaturamentoEndereco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdEntregaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEntregaEndereco() {
        return sCdEntregaEndereco;
    }

    /**
     * Sets the value of the sCdEntregaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEntregaEndereco(JAXBElement<String> value) {
        this.sCdEntregaEndereco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdFaturamentoEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdFaturamentoEndereco() {
        return sCdFaturamentoEndereco;
    }

    /**
     * Sets the value of the sCdFaturamentoEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdFaturamentoEndereco(JAXBElement<String> value) {
        this.sCdFaturamentoEndereco = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdItemEnderecoWbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdItemEnderecoWbc() {
        return sCdItemEnderecoWbc;
    }

    /**
     * Sets the value of the sCdItemEnderecoWbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdItemEnderecoWbc(String value) {
        this.sCdItemEnderecoWbc = value;
    }

    /**
     * Gets the value of the tDtEntregaPrevista property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtEntregaPrevista() {
        return tDtEntregaPrevista;
    }

    /**
     * Sets the value of the tDtEntregaPrevista property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtEntregaPrevista(XMLGregorianCalendar value) {
        this.tDtEntregaPrevista = value;
    }

    /**
     * Gets the value of the tDtEntregaRealizado property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtEntregaRealizado() {
        return tDtEntregaRealizado;
    }

    /**
     * Sets the value of the tDtEntregaRealizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtEntregaRealizado(XMLGregorianCalendar value) {
        this.tDtEntregaRealizado = value;
    }

}
