
package br.gov.sp.saobernardo.paradigma.ws.unidadenegocio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnidadeNegocioDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnidadeNegocioDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstEmpresaUnidadeNegocioDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaUnidadeNegocioDTO" minOccurs="0"/>
 *         &lt;element name="lstUnidadeNegocioCentroCustoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfUnidadeNegocioCentroCustoDTO" minOccurs="0"/>
 *         &lt;element name="sCdUnidadeNegocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsSiglaUnidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsUnidadeNegocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadeNegocioDTO", propOrder = {
    "lstEmpresaUnidadeNegocioDTO",
    "lstUnidadeNegocioCentroCustoDTO",
    "sCdUnidadeNegocio",
    "sDsSiglaUnidade",
    "sDsUnidadeNegocio"
})
public class UnidadeNegocioDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstEmpresaUnidadeNegocioDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaUnidadeNegocioDTO> lstEmpresaUnidadeNegocioDTO;
    @XmlElementRef(name = "lstUnidadeNegocioCentroCustoDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfUnidadeNegocioCentroCustoDTO> lstUnidadeNegocioCentroCustoDTO;
    @XmlElement(required = true, nillable = true)
    protected String sCdUnidadeNegocio;
    @XmlElementRef(name = "sDsSiglaUnidade", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsSiglaUnidade;
    @XmlElement(required = true, nillable = true)
    protected String sDsUnidadeNegocio;

    /**
     * Gets the value of the lstEmpresaUnidadeNegocioDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaUnidadeNegocioDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaUnidadeNegocioDTO> getLstEmpresaUnidadeNegocioDTO() {
        return lstEmpresaUnidadeNegocioDTO;
    }

    /**
     * Sets the value of the lstEmpresaUnidadeNegocioDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaUnidadeNegocioDTO }{@code >}
     *     
     */
    public void setLstEmpresaUnidadeNegocioDTO(JAXBElement<ArrayOfEmpresaUnidadeNegocioDTO> value) {
        this.lstEmpresaUnidadeNegocioDTO = ((JAXBElement<ArrayOfEmpresaUnidadeNegocioDTO> ) value);
    }

    /**
     * Gets the value of the lstUnidadeNegocioCentroCustoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnidadeNegocioCentroCustoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUnidadeNegocioCentroCustoDTO> getLstUnidadeNegocioCentroCustoDTO() {
        return lstUnidadeNegocioCentroCustoDTO;
    }

    /**
     * Sets the value of the lstUnidadeNegocioCentroCustoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnidadeNegocioCentroCustoDTO }{@code >}
     *     
     */
    public void setLstUnidadeNegocioCentroCustoDTO(JAXBElement<ArrayOfUnidadeNegocioCentroCustoDTO> value) {
        this.lstUnidadeNegocioCentroCustoDTO = ((JAXBElement<ArrayOfUnidadeNegocioCentroCustoDTO> ) value);
    }

    /**
     * Gets the value of the sCdUnidadeNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUnidadeNegocio() {
        return sCdUnidadeNegocio;
    }

    /**
     * Sets the value of the sCdUnidadeNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUnidadeNegocio(String value) {
        this.sCdUnidadeNegocio = value;
    }

    /**
     * Gets the value of the sDsSiglaUnidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsSiglaUnidade() {
        return sDsSiglaUnidade;
    }

    /**
     * Sets the value of the sDsSiglaUnidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsSiglaUnidade(JAXBElement<String> value) {
        this.sDsSiglaUnidade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsUnidadeNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsUnidadeNegocio() {
        return sDsUnidadeNegocio;
    }

    /**
     * Sets the value of the sDsUnidadeNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsUnidadeNegocio(String value) {
        this.sDsUnidadeNegocio = value;
    }

}
