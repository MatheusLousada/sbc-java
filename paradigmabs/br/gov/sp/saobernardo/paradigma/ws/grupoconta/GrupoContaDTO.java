
package br.gov.sp.saobernardo.paradigma.ws.grupoconta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrupoContaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrupoContaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstGrupoContaIdioma" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfGrupoContaIdiomaDTO" minOccurs="0"/>
 *         &lt;element name="sCdGrupoConta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsGrupoConta" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "GrupoContaDTO", propOrder = {
    "lstGrupoContaIdioma",
    "sCdGrupoConta",
    "sDsGrupoConta",
    "sSgGrupoConta"
})
public class GrupoContaDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstGrupoContaIdioma", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfGrupoContaIdiomaDTO> lstGrupoContaIdioma;
    @XmlElement(required = true, nillable = true)
    protected String sCdGrupoConta;
    @XmlElement(required = true, nillable = true)
    protected String sDsGrupoConta;
    @XmlElementRef(name = "sSgGrupoConta", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sSgGrupoConta;

    /**
     * Gets the value of the lstGrupoContaIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGrupoContaIdiomaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGrupoContaIdiomaDTO> getLstGrupoContaIdioma() {
        return lstGrupoContaIdioma;
    }

    /**
     * Sets the value of the lstGrupoContaIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGrupoContaIdiomaDTO }{@code >}
     *     
     */
    public void setLstGrupoContaIdioma(JAXBElement<ArrayOfGrupoContaIdiomaDTO> value) {
        this.lstGrupoContaIdioma = ((JAXBElement<ArrayOfGrupoContaIdiomaDTO> ) value);
    }

    /**
     * Gets the value of the sCdGrupoConta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdGrupoConta() {
        return sCdGrupoConta;
    }

    /**
     * Sets the value of the sCdGrupoConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdGrupoConta(String value) {
        this.sCdGrupoConta = value;
    }

    /**
     * Gets the value of the sDsGrupoConta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsGrupoConta() {
        return sDsGrupoConta;
    }

    /**
     * Sets the value of the sDsGrupoConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsGrupoConta(String value) {
        this.sDsGrupoConta = value;
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
