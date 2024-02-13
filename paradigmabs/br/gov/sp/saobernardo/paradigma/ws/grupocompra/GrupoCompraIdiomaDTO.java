
package br.gov.sp.saobernardo.paradigma.ws.grupocompra;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrupoCompraIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrupoCompraIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}IdiomaDTOOfGrupoCompraIdiomaDTOljhnh6kL">
 *       &lt;sequence>
 *         &lt;element name="sDsGrupoCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "GrupoCompraIdiomaDTO", propOrder = {
    "sDsGrupoCompra",
    "sSgGrupoCompra"
})
public class GrupoCompraIdiomaDTO
    extends IdiomaDTOOfGrupoCompraIdiomaDTOljhnh6KL
{

    @XmlElementRef(name = "sDsGrupoCompra", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsGrupoCompra;
    @XmlElementRef(name = "sSgGrupoCompra", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sSgGrupoCompra;

    /**
     * Gets the value of the sDsGrupoCompra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsGrupoCompra() {
        return sDsGrupoCompra;
    }

    /**
     * Sets the value of the sDsGrupoCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsGrupoCompra(JAXBElement<String> value) {
        this.sDsGrupoCompra = ((JAXBElement<String> ) value);
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
