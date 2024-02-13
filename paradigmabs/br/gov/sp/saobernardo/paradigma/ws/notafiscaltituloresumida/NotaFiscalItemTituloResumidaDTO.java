
package br.gov.sp.saobernardo.paradigma.ws.notafiscaltituloresumida;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotaFiscalItemTituloResumidaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotaFiscalItemTituloResumidaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstNotaFiscalItemRateioTituloResumidaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfNotaFiscalItemRateioTituloResumidaDTO"/>
 *         &lt;element name="lstNotaFiscalItemTaxaTituloResumidaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfNotaFiscalItemTaxaTituloResumidaDTO"/>
 *         &lt;element name="sCdContaContabil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsProdutoNotaFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaFiscalItemTituloResumidaDTO", propOrder = {
    "dVlUnitario",
    "lstNotaFiscalItemRateioTituloResumidaDTO",
    "lstNotaFiscalItemTaxaTituloResumidaDTO",
    "sCdContaContabil",
    "sCdProduto",
    "sDsProdutoNotaFiscal"
})
public class NotaFiscalItemTituloResumidaDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dVlUnitario;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfNotaFiscalItemRateioTituloResumidaDTO lstNotaFiscalItemRateioTituloResumidaDTO;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfNotaFiscalItemTaxaTituloResumidaDTO lstNotaFiscalItemTaxaTituloResumidaDTO;
    @XmlElement(required = true, nillable = true)
    protected String sCdContaContabil;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;
    @XmlElement(required = true, nillable = true)
    protected String sDsProdutoNotaFiscal;

    /**
     * Gets the value of the dVlUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlUnitario() {
        return dVlUnitario;
    }

    /**
     * Sets the value of the dVlUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlUnitario(BigDecimal value) {
        this.dVlUnitario = value;
    }

    /**
     * Gets the value of the lstNotaFiscalItemRateioTituloResumidaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotaFiscalItemRateioTituloResumidaDTO }
     *     
     */
    public ArrayOfNotaFiscalItemRateioTituloResumidaDTO getLstNotaFiscalItemRateioTituloResumidaDTO() {
        return lstNotaFiscalItemRateioTituloResumidaDTO;
    }

    /**
     * Sets the value of the lstNotaFiscalItemRateioTituloResumidaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotaFiscalItemRateioTituloResumidaDTO }
     *     
     */
    public void setLstNotaFiscalItemRateioTituloResumidaDTO(ArrayOfNotaFiscalItemRateioTituloResumidaDTO value) {
        this.lstNotaFiscalItemRateioTituloResumidaDTO = value;
    }

    /**
     * Gets the value of the lstNotaFiscalItemTaxaTituloResumidaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotaFiscalItemTaxaTituloResumidaDTO }
     *     
     */
    public ArrayOfNotaFiscalItemTaxaTituloResumidaDTO getLstNotaFiscalItemTaxaTituloResumidaDTO() {
        return lstNotaFiscalItemTaxaTituloResumidaDTO;
    }

    /**
     * Sets the value of the lstNotaFiscalItemTaxaTituloResumidaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotaFiscalItemTaxaTituloResumidaDTO }
     *     
     */
    public void setLstNotaFiscalItemTaxaTituloResumidaDTO(ArrayOfNotaFiscalItemTaxaTituloResumidaDTO value) {
        this.lstNotaFiscalItemTaxaTituloResumidaDTO = value;
    }

    /**
     * Gets the value of the sCdContaContabil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdContaContabil() {
        return sCdContaContabil;
    }

    /**
     * Sets the value of the sCdContaContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdContaContabil(String value) {
        this.sCdContaContabil = value;
    }

    /**
     * Gets the value of the sCdProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdProduto() {
        return sCdProduto;
    }

    /**
     * Sets the value of the sCdProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdProduto(String value) {
        this.sCdProduto = value;
    }

    /**
     * Gets the value of the sDsProdutoNotaFiscal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsProdutoNotaFiscal() {
        return sDsProdutoNotaFiscal;
    }

    /**
     * Sets the value of the sDsProdutoNotaFiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsProdutoNotaFiscal(String value) {
        this.sDsProdutoNotaFiscal = value;
    }

}
