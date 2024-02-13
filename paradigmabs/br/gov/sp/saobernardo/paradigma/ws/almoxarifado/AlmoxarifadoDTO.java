
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlmoxarifadoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlmoxarifadoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstAlmoxarifadoDoca" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfAlmoxarifadoDocaDTO" minOccurs="0"/>
 *         &lt;element name="sCdAlmoxarifado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsAlmoxarifado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sSgAlmoxarifado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlmoxarifadoDTO", propOrder = {
    "lstAlmoxarifadoDoca",
    "sCdAlmoxarifado",
    "sCdEmpresa",
    "sCdUsuario",
    "sDsAlmoxarifado",
    "sSgAlmoxarifado"
})
public class AlmoxarifadoDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstAlmoxarifadoDoca", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAlmoxarifadoDocaDTO> lstAlmoxarifadoDoca;
    @XmlElement(required = true, nillable = true)
    protected String sCdAlmoxarifado;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElementRef(name = "sCdUsuario", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUsuario;
    @XmlElement(required = true, nillable = true)
    protected String sDsAlmoxarifado;
    @XmlElementRef(name = "sSgAlmoxarifado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sSgAlmoxarifado;

    /**
     * Gets the value of the lstAlmoxarifadoDoca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlmoxarifadoDocaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAlmoxarifadoDocaDTO> getLstAlmoxarifadoDoca() {
        return lstAlmoxarifadoDoca;
    }

    /**
     * Sets the value of the lstAlmoxarifadoDoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlmoxarifadoDocaDTO }{@code >}
     *     
     */
    public void setLstAlmoxarifadoDoca(JAXBElement<ArrayOfAlmoxarifadoDocaDTO> value) {
        this.lstAlmoxarifadoDoca = ((JAXBElement<ArrayOfAlmoxarifadoDocaDTO> ) value);
    }

    /**
     * Gets the value of the sCdAlmoxarifado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdAlmoxarifado() {
        return sCdAlmoxarifado;
    }

    /**
     * Sets the value of the sCdAlmoxarifado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdAlmoxarifado(String value) {
        this.sCdAlmoxarifado = value;
    }

    /**
     * Gets the value of the sCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresa() {
        return sCdEmpresa;
    }

    /**
     * Sets the value of the sCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresa(String value) {
        this.sCdEmpresa = value;
    }

    /**
     * Gets the value of the sCdUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUsuario() {
        return sCdUsuario;
    }

    /**
     * Sets the value of the sCdUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUsuario(JAXBElement<String> value) {
        this.sCdUsuario = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsAlmoxarifado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsAlmoxarifado() {
        return sDsAlmoxarifado;
    }

    /**
     * Sets the value of the sDsAlmoxarifado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsAlmoxarifado(String value) {
        this.sDsAlmoxarifado = value;
    }

    /**
     * Gets the value of the sSgAlmoxarifado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSSgAlmoxarifado() {
        return sSgAlmoxarifado;
    }

    /**
     * Sets the value of the sSgAlmoxarifado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSSgAlmoxarifado(JAXBElement<String> value) {
        this.sSgAlmoxarifado = ((JAXBElement<String> ) value);
    }

}
