
package br.gov.sp.saobernardo.paradigma.ws.compradireta;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompraDiretaItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompraDiretaItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtItem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlReferencia" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstCompraDiretaItemEndereco" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCompraDiretaItemEnderecoDTO"/>
 *         &lt;element name="lstCompraDiretaItemLance" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCompraDiretaItemLanceDTO" minOccurs="0"/>
 *         &lt;element name="lstCompraDiretaItemTaxa" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCompraDiretaItemTaxaDTO" minOccurs="0"/>
 *         &lt;element name="nCdItemSequencial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nStItem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdItemLegado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdLoteLegado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompraDiretaItemDTO", propOrder = {
    "dQtItem",
    "dVlReferencia",
    "lstCompraDiretaItemEndereco",
    "lstCompraDiretaItemLance",
    "lstCompraDiretaItemTaxa",
    "nCdItemSequencial",
    "nStItem",
    "sCdClasse",
    "sCdItemLegado",
    "sCdLoteLegado",
    "sCdProduto",
    "sCdUnidadeMedida",
    "sDsItem"
})
public class CompraDiretaItemDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dQtItem;
    @XmlElement(required = true)
    protected BigDecimal dVlReferencia;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCompraDiretaItemEnderecoDTO lstCompraDiretaItemEndereco;
    @XmlElementRef(name = "lstCompraDiretaItemLance", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCompraDiretaItemLanceDTO> lstCompraDiretaItemLance;
    @XmlElementRef(name = "lstCompraDiretaItemTaxa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCompraDiretaItemTaxaDTO> lstCompraDiretaItemTaxa;
    protected int nCdItemSequencial;
    protected int nStItem;
    @XmlElement(required = true, nillable = true)
    protected String sCdClasse;
    @XmlElementRef(name = "sCdItemLegado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemLegado;
    @XmlElementRef(name = "sCdLoteLegado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdLoteLegado;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;
    @XmlElement(required = true, nillable = true)
    protected String sCdUnidadeMedida;
    @XmlElement(required = true, nillable = true)
    protected String sDsItem;

    /**
     * Gets the value of the dQtItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtItem() {
        return dQtItem;
    }

    /**
     * Sets the value of the dQtItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtItem(BigDecimal value) {
        this.dQtItem = value;
    }

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
     * Gets the value of the lstCompraDiretaItemEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompraDiretaItemEnderecoDTO }
     *     
     */
    public ArrayOfCompraDiretaItemEnderecoDTO getLstCompraDiretaItemEndereco() {
        return lstCompraDiretaItemEndereco;
    }

    /**
     * Sets the value of the lstCompraDiretaItemEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompraDiretaItemEnderecoDTO }
     *     
     */
    public void setLstCompraDiretaItemEndereco(ArrayOfCompraDiretaItemEnderecoDTO value) {
        this.lstCompraDiretaItemEndereco = value;
    }

    /**
     * Gets the value of the lstCompraDiretaItemLance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaItemLanceDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCompraDiretaItemLanceDTO> getLstCompraDiretaItemLance() {
        return lstCompraDiretaItemLance;
    }

    /**
     * Sets the value of the lstCompraDiretaItemLance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaItemLanceDTO }{@code >}
     *     
     */
    public void setLstCompraDiretaItemLance(JAXBElement<ArrayOfCompraDiretaItemLanceDTO> value) {
        this.lstCompraDiretaItemLance = ((JAXBElement<ArrayOfCompraDiretaItemLanceDTO> ) value);
    }

    /**
     * Gets the value of the lstCompraDiretaItemTaxa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaItemTaxaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCompraDiretaItemTaxaDTO> getLstCompraDiretaItemTaxa() {
        return lstCompraDiretaItemTaxa;
    }

    /**
     * Sets the value of the lstCompraDiretaItemTaxa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCompraDiretaItemTaxaDTO }{@code >}
     *     
     */
    public void setLstCompraDiretaItemTaxa(JAXBElement<ArrayOfCompraDiretaItemTaxaDTO> value) {
        this.lstCompraDiretaItemTaxa = ((JAXBElement<ArrayOfCompraDiretaItemTaxaDTO> ) value);
    }

    /**
     * Gets the value of the nCdItemSequencial property.
     * 
     */
    public int getNCdItemSequencial() {
        return nCdItemSequencial;
    }

    /**
     * Sets the value of the nCdItemSequencial property.
     * 
     */
    public void setNCdItemSequencial(int value) {
        this.nCdItemSequencial = value;
    }

    /**
     * Gets the value of the nStItem property.
     * 
     */
    public int getNStItem() {
        return nStItem;
    }

    /**
     * Sets the value of the nStItem property.
     * 
     */
    public void setNStItem(int value) {
        this.nStItem = value;
    }

    /**
     * Gets the value of the sCdClasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdClasse() {
        return sCdClasse;
    }

    /**
     * Sets the value of the sCdClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdClasse(String value) {
        this.sCdClasse = value;
    }

    /**
     * Gets the value of the sCdItemLegado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdItemLegado() {
        return sCdItemLegado;
    }

    /**
     * Sets the value of the sCdItemLegado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdItemLegado(JAXBElement<String> value) {
        this.sCdItemLegado = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdLoteLegado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdLoteLegado() {
        return sCdLoteLegado;
    }

    /**
     * Sets the value of the sCdLoteLegado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdLoteLegado(JAXBElement<String> value) {
        this.sCdLoteLegado = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUnidadeMedida() {
        return sCdUnidadeMedida;
    }

    /**
     * Sets the value of the sCdUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUnidadeMedida(String value) {
        this.sCdUnidadeMedida = value;
    }

    /**
     * Gets the value of the sDsItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsItem() {
        return sDsItem;
    }

    /**
     * Sets the value of the sDsItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsItem(String value) {
        this.sDsItem = value;
    }

}
