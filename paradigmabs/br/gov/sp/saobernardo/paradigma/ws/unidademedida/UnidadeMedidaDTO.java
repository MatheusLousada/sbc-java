
package br.gov.sp.saobernardo.paradigma.ws.unidademedida;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnidadeMedidaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnidadeMedidaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lstUnidadeMedidaIdioma" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfUnidadeMedidaIdiomaDTO" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sSgUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadeMedidaDTO", propOrder = {
    "bFlStatus",
    "lstUnidadeMedidaIdioma",
    "sCdEmpresa",
    "sCdUnidadeMedida",
    "sDsUnidadeMedida",
    "sSgUnidadeMedida"
})
public class UnidadeMedidaDTO
    extends DtoBase
{

    @XmlElementRef(name = "bFlStatus", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlStatus;
    @XmlElementRef(name = "lstUnidadeMedidaIdioma", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfUnidadeMedidaIdiomaDTO> lstUnidadeMedidaIdioma;
    @XmlElementRef(name = "sCdEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sCdUnidadeMedida;
    @XmlElement(required = true, nillable = true)
    protected String sDsUnidadeMedida;
    @XmlElement(required = true, nillable = true)
    protected String sSgUnidadeMedida;

    /**
     * Gets the value of the bFlStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlStatus() {
        return bFlStatus;
    }

    /**
     * Sets the value of the bFlStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlStatus(JAXBElement<Integer> value) {
        this.bFlStatus = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the lstUnidadeMedidaIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnidadeMedidaIdiomaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUnidadeMedidaIdiomaDTO> getLstUnidadeMedidaIdioma() {
        return lstUnidadeMedidaIdioma;
    }

    /**
     * Sets the value of the lstUnidadeMedidaIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnidadeMedidaIdiomaDTO }{@code >}
     *     
     */
    public void setLstUnidadeMedidaIdioma(JAXBElement<ArrayOfUnidadeMedidaIdiomaDTO> value) {
        this.lstUnidadeMedidaIdioma = ((JAXBElement<ArrayOfUnidadeMedidaIdiomaDTO> ) value);
    }

    /**
     * Gets the value of the sCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresa() {
        return sCdEmpresa;
    }

    /**
     * Sets the value of the sCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresa(JAXBElement<String> value) {
        this.sCdEmpresa = ((JAXBElement<String> ) value);
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
     * Gets the value of the sDsUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsUnidadeMedida() {
        return sDsUnidadeMedida;
    }

    /**
     * Sets the value of the sDsUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsUnidadeMedida(String value) {
        this.sDsUnidadeMedida = value;
    }

    /**
     * Gets the value of the sSgUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSgUnidadeMedida() {
        return sSgUnidadeMedida;
    }

    /**
     * Sets the value of the sSgUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSgUnidadeMedida(String value) {
        this.sSgUnidadeMedida = value;
    }

}
