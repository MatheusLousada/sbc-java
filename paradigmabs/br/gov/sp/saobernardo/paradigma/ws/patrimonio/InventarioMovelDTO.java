
package br.gov.sp.saobernardo.paradigma.ws.patrimonio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventarioMovelDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventarioMovelDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstInventarioItem" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfInventarioMovelItemDTO" minOccurs="0"/>
 *         &lt;element name="nCdInventario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nIdTipoApuracao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sDsInventario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNrInventario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventarioMovelDTO", propOrder = {
    "lstInventarioItem",
    "nCdInventario",
    "nIdTipoApuracao",
    "sDsInventario",
    "sNrInventario"
})
public class InventarioMovelDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstInventarioItem", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfInventarioMovelItemDTO> lstInventarioItem;
    protected long nCdInventario;
    protected Long nIdTipoApuracao;
    @XmlElementRef(name = "sDsInventario", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsInventario;
    @XmlElement(required = true, nillable = true)
    protected String sNrInventario;

    /**
     * Gets the value of the lstInventarioItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventarioMovelItemDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInventarioMovelItemDTO> getLstInventarioItem() {
        return lstInventarioItem;
    }

    /**
     * Sets the value of the lstInventarioItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventarioMovelItemDTO }{@code >}
     *     
     */
    public void setLstInventarioItem(JAXBElement<ArrayOfInventarioMovelItemDTO> value) {
        this.lstInventarioItem = ((JAXBElement<ArrayOfInventarioMovelItemDTO> ) value);
    }

    /**
     * Gets the value of the nCdInventario property.
     * 
     */
    public long getNCdInventario() {
        return nCdInventario;
    }

    /**
     * Sets the value of the nCdInventario property.
     * 
     */
    public void setNCdInventario(long value) {
        this.nCdInventario = value;
    }

    /**
     * Gets the value of the nIdTipoApuracao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNIdTipoApuracao() {
        return nIdTipoApuracao;
    }

    /**
     * Sets the value of the nIdTipoApuracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNIdTipoApuracao(Long value) {
        this.nIdTipoApuracao = value;
    }

    /**
     * Gets the value of the sDsInventario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsInventario() {
        return sDsInventario;
    }

    /**
     * Sets the value of the sDsInventario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsInventario(JAXBElement<String> value) {
        this.sDsInventario = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNrInventario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrInventario() {
        return sNrInventario;
    }

    /**
     * Sets the value of the sNrInventario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrInventario(String value) {
        this.sNrInventario = value;
    }

}
