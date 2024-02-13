
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlmoxarifadoDocaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlmoxarifadoDocaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdAlmoxarifadoDoca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsAlmoxarifadoDoca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlmoxarifadoDocaDTO", propOrder = {
    "sCdAlmoxarifadoDoca",
    "sDsAlmoxarifadoDoca"
})
public class AlmoxarifadoDocaDTO
    extends DtoBase
{

    @XmlElementRef(name = "sCdAlmoxarifadoDoca", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdAlmoxarifadoDoca;
    @XmlElementRef(name = "sDsAlmoxarifadoDoca", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsAlmoxarifadoDoca;

    /**
     * Gets the value of the sCdAlmoxarifadoDoca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdAlmoxarifadoDoca() {
        return sCdAlmoxarifadoDoca;
    }

    /**
     * Sets the value of the sCdAlmoxarifadoDoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdAlmoxarifadoDoca(JAXBElement<String> value) {
        this.sCdAlmoxarifadoDoca = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsAlmoxarifadoDoca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsAlmoxarifadoDoca() {
        return sDsAlmoxarifadoDoca;
    }

    /**
     * Sets the value of the sDsAlmoxarifadoDoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsAlmoxarifadoDoca(JAXBElement<String> value) {
        this.sDsAlmoxarifadoDoca = ((JAXBElement<String> ) value);
    }

}
