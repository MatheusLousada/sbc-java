
package br.gov.sp.saobernardo.paradigma.ws.leilao;

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
 * <p>Java class for LeilaoItemEnderecoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeilaoItemEnderecoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtEntrega" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nSqItemEndereco" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdCobrancaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaCobrancaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaEntregaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresaFaturamentoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEntregaEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdFaturamentoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemRequisicaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdRequisicaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tDtEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeilaoItemEnderecoDTO", propOrder = {
    "dQtEntrega",
    "nSqItemEndereco",
    "sCdCobrancaEndereco",
    "sCdEmpresaCobrancaEndereco",
    "sCdEmpresaEntregaEndereco",
    "sCdEmpresaFaturamentoEndereco",
    "sCdEntregaEndereco",
    "sCdFaturamentoEndereco",
    "sCdItemRequisicaoEmpresa",
    "sCdRequisicaoEmpresa",
    "tDtEntrega"
})
public class LeilaoItemEnderecoDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dQtEntrega;
    protected int nSqItemEndereco;
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
    protected String sCdItemRequisicaoEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sCdRequisicaoEmpresa;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtEntrega;

    /**
     * Gets the value of the dQtEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtEntrega() {
        return dQtEntrega;
    }

    /**
     * Sets the value of the dQtEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtEntrega(BigDecimal value) {
        this.dQtEntrega = value;
    }

    /**
     * Gets the value of the nSqItemEndereco property.
     * 
     */
    public int getNSqItemEndereco() {
        return nSqItemEndereco;
    }

    /**
     * Sets the value of the nSqItemEndereco property.
     * 
     */
    public void setNSqItemEndereco(int value) {
        this.nSqItemEndereco = value;
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
     * Gets the value of the sCdItemRequisicaoEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdItemRequisicaoEmpresa() {
        return sCdItemRequisicaoEmpresa;
    }

    /**
     * Sets the value of the sCdItemRequisicaoEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdItemRequisicaoEmpresa(String value) {
        this.sCdItemRequisicaoEmpresa = value;
    }

    /**
     * Gets the value of the sCdRequisicaoEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdRequisicaoEmpresa() {
        return sCdRequisicaoEmpresa;
    }

    /**
     * Sets the value of the sCdRequisicaoEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdRequisicaoEmpresa(String value) {
        this.sCdRequisicaoEmpresa = value;
    }

    /**
     * Gets the value of the tDtEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtEntrega() {
        return tDtEntrega;
    }

    /**
     * Sets the value of the tDtEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtEntrega(XMLGregorianCalendar value) {
        this.tDtEntrega = value;
    }

}
