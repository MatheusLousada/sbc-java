
package br.gov.sp.saobernardo.paradigma.ws.centrocusto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentroCustoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentroCustoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlAtivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lstCentroCustoIdioma" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfCentroCustoIdiomaDTO" minOccurs="0"/>
 *         &lt;element name="sCdCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdCentroCustoPai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentroCustoDTO", propOrder = {
    "bFlAtivo",
    "lstCentroCustoIdioma",
    "sCdCentroCusto",
    "sCdCentroCustoPai",
    "sCdEmpresa",
    "sDsCentroCusto"
})
public class CentroCustoDTO
    extends DtoBase
{

    @XmlElementRef(name = "bFlAtivo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlAtivo;
    @XmlElementRef(name = "lstCentroCustoIdioma", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCentroCustoIdiomaDTO> lstCentroCustoIdioma;
    @XmlElement(required = true, nillable = true)
    protected String sCdCentroCusto;
    @XmlElementRef(name = "sCdCentroCustoPai", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdCentroCustoPai;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sDsCentroCusto;

    /**
     * Gets the value of the bFlAtivo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlAtivo() {
        return bFlAtivo;
    }

    /**
     * Sets the value of the bFlAtivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlAtivo(JAXBElement<Integer> value) {
        this.bFlAtivo = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the lstCentroCustoIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCentroCustoIdiomaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCentroCustoIdiomaDTO> getLstCentroCustoIdioma() {
        return lstCentroCustoIdioma;
    }

    /**
     * Sets the value of the lstCentroCustoIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCentroCustoIdiomaDTO }{@code >}
     *     
     */
    public void setLstCentroCustoIdioma(JAXBElement<ArrayOfCentroCustoIdiomaDTO> value) {
        this.lstCentroCustoIdioma = ((JAXBElement<ArrayOfCentroCustoIdiomaDTO> ) value);
    }

    /**
     * Gets the value of the sCdCentroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCentroCusto() {
        return sCdCentroCusto;
    }

    /**
     * Sets the value of the sCdCentroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCentroCusto(String value) {
        this.sCdCentroCusto = value;
    }

    /**
     * Gets the value of the sCdCentroCustoPai property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdCentroCustoPai() {
        return sCdCentroCustoPai;
    }

    /**
     * Sets the value of the sCdCentroCustoPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdCentroCustoPai(JAXBElement<String> value) {
        this.sCdCentroCustoPai = ((JAXBElement<String> ) value);
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
     * Gets the value of the sDsCentroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsCentroCusto() {
        return sDsCentroCusto;
    }

    /**
     * Sets the value of the sDsCentroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsCentroCusto(String value) {
        this.sDsCentroCusto = value;
    }

}
