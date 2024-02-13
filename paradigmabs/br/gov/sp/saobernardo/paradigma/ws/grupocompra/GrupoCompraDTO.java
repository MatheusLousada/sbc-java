
package br.gov.sp.saobernardo.paradigma.ws.grupocompra;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrupoCompraDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrupoCompraDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstGrupoCompraIdioma" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfGrupoCompraIdiomaDTO" minOccurs="0"/>
 *         &lt;element name="sCdGrupoCompra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsGrupoCompra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sSgGrupoCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrupoCompraDTO", propOrder = {
    "lstGrupoCompraIdioma",
    "sCdGrupoCompra",
    "sDsGrupoCompra",
    "sSgGrupoCompra"
})
public class GrupoCompraDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstGrupoCompraIdioma", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfGrupoCompraIdiomaDTO> lstGrupoCompraIdioma;
    @XmlElement(required = true, nillable = true)
    protected String sCdGrupoCompra;
    @XmlElement(required = true, nillable = true)
    protected String sDsGrupoCompra;
    @XmlElementRef(name = "sSgGrupoCompra", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sSgGrupoCompra;

    /**
     * Gets the value of the lstGrupoCompraIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGrupoCompraIdiomaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGrupoCompraIdiomaDTO> getLstGrupoCompraIdioma() {
        return lstGrupoCompraIdioma;
    }

    /**
     * Sets the value of the lstGrupoCompraIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGrupoCompraIdiomaDTO }{@code >}
     *     
     */
    public void setLstGrupoCompraIdioma(JAXBElement<ArrayOfGrupoCompraIdiomaDTO> value) {
        this.lstGrupoCompraIdioma = ((JAXBElement<ArrayOfGrupoCompraIdiomaDTO> ) value);
    }

    /**
     * Gets the value of the sCdGrupoCompra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdGrupoCompra() {
        return sCdGrupoCompra;
    }

    /**
     * Sets the value of the sCdGrupoCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdGrupoCompra(String value) {
        this.sCdGrupoCompra = value;
    }

    /**
     * Gets the value of the sDsGrupoCompra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsGrupoCompra() {
        return sDsGrupoCompra;
    }

    /**
     * Sets the value of the sDsGrupoCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsGrupoCompra(String value) {
        this.sDsGrupoCompra = value;
    }

    /**
     * Gets the value of the sSgGrupoCompra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSSgGrupoCompra() {
        return sSgGrupoCompra;
    }

    /**
     * Sets the value of the sSgGrupoCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSSgGrupoCompra(JAXBElement<String> value) {
        this.sSgGrupoCompra = ((JAXBElement<String> ) value);
    }

}
