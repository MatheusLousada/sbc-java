
package br.gov.sp.saobernardo.paradigma.ws.grupoconta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrupoContaIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrupoContaIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}IdiomaDTOOfGrupoContaIdiomaDTOljhnh6kL">
 *       &lt;sequence>
 *         &lt;element name="sDsGrupoConta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sSgGrupoConta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrupoContaIdiomaDTO", propOrder = {
    "sDsGrupoConta",
    "sSgGrupoConta"
})
public class GrupoContaIdiomaDTO
    extends IdiomaDTOOfGrupoContaIdiomaDTOljhnh6KL
{

    @XmlElementRef(name = "sDsGrupoConta", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsGrupoConta;
    @XmlElementRef(name = "sSgGrupoConta", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sSgGrupoConta;

    /**
     * Gets the value of the sDsGrupoConta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsGrupoConta() {
        return sDsGrupoConta;
    }

    /**
     * Sets the value of the sDsGrupoConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsGrupoConta(JAXBElement<String> value) {
        this.sDsGrupoConta = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sSgGrupoConta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSSgGrupoConta() {
        return sSgGrupoConta;
    }

    /**
     * Sets the value of the sSgGrupoConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSSgGrupoConta(JAXBElement<String> value) {
        this.sSgGrupoConta = ((JAXBElement<String> ) value);
    }

}
