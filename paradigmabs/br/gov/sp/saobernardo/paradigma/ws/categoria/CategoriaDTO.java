
package br.gov.sp.saobernardo.paradigma.ws.categoria;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoriaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoriaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstCategoriaIdioma" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCategoriaIdiomaDTO" minOccurs="0"/>
 *         &lt;element name="sCdClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdClasseEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdClassePai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdSituacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoriaDTO", propOrder = {
    "lstCategoriaIdioma",
    "sCdClasse",
    "sCdClasseEmpresa",
    "sCdClassePai",
    "sCdEmpresa",
    "sCdSituacao",
    "sDsClasse"
})
public class CategoriaDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstCategoriaIdioma", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCategoriaIdiomaDTO> lstCategoriaIdioma;
    @XmlElement(required = true, nillable = true)
    protected String sCdClasse;
    @XmlElementRef(name = "sCdClasseEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdClasseEmpresa;
    protected String sCdClassePai;
    @XmlElementRef(name = "sCdEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresa;
    @XmlElementRef(name = "sCdSituacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdSituacao;
    @XmlElement(required = true, nillable = true)
    protected String sDsClasse;

    /**
     * Gets the value of the lstCategoriaIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCategoriaIdiomaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCategoriaIdiomaDTO> getLstCategoriaIdioma() {
        return lstCategoriaIdioma;
    }

    /**
     * Sets the value of the lstCategoriaIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCategoriaIdiomaDTO }{@code >}
     *     
     */
    public void setLstCategoriaIdioma(JAXBElement<ArrayOfCategoriaIdiomaDTO> value) {
        this.lstCategoriaIdioma = ((JAXBElement<ArrayOfCategoriaIdiomaDTO> ) value);
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
     * Gets the value of the sCdClasseEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdClasseEmpresa() {
        return sCdClasseEmpresa;
    }

    /**
     * Sets the value of the sCdClasseEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdClasseEmpresa(JAXBElement<String> value) {
        this.sCdClasseEmpresa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdClassePai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdClassePai() {
        return sCdClassePai;
    }

    /**
     * Sets the value of the sCdClassePai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdClassePai(String value) {
        this.sCdClassePai = value;
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
     * Gets the value of the sCdSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdSituacao() {
        return sCdSituacao;
    }

    /**
     * Sets the value of the sCdSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdSituacao(JAXBElement<String> value) {
        this.sCdSituacao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsClasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsClasse() {
        return sDsClasse;
    }

    /**
     * Sets the value of the sDsClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsClasse(String value) {
        this.sDsClasse = value;
    }

}
