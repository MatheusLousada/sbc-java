
package br.gov.sp.saobernardo.paradigma.ws.ordemcompra;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnidadeMedidaDetalheDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnidadeMedidaDetalheDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sDsUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sSgUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadeMedidaDetalheDTO", propOrder = {
    "sDsUnidadeMedida",
    "sSgUnidadeMedida"
})
public class UnidadeMedidaDetalheDTO
    extends DtoBase
{

    @XmlElementRef(name = "sDsUnidadeMedida", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsUnidadeMedida;
    @XmlElementRef(name = "sSgUnidadeMedida", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sSgUnidadeMedida;

    /**
     * Gets the value of the sDsUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsUnidadeMedida() {
        return sDsUnidadeMedida;
    }

    /**
     * Sets the value of the sDsUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsUnidadeMedida(JAXBElement<String> value) {
        this.sDsUnidadeMedida = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sSgUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSSgUnidadeMedida() {
        return sSgUnidadeMedida;
    }

    /**
     * Sets the value of the sSgUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSSgUnidadeMedida(JAXBElement<String> value) {
        this.sSgUnidadeMedida = ((JAXBElement<String> ) value);
    }

}
