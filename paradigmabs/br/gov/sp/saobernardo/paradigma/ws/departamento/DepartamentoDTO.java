
package br.gov.sp.saobernardo.paradigma.ws.departamento;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepartamentoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartamentoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstDepartamentoIdioma" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfDepartamentoIdiomaDTO" minOccurs="0"/>
 *         &lt;element name="nCdSituacaoMap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdDepartamentoPai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdDeptoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartamentoDTO", propOrder = {
    "lstDepartamentoIdioma",
    "nCdSituacaoMap",
    "sCdDepartamento",
    "sCdDepartamentoPai",
    "sCdDeptoEmpresa",
    "sCdEmpresa",
    "sDsDepartamento"
})
public class DepartamentoDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstDepartamentoIdioma", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDepartamentoIdiomaDTO> lstDepartamentoIdioma;
    protected Integer nCdSituacaoMap;
    @XmlElement(required = true, nillable = true)
    protected String sCdDepartamento;
    @XmlElementRef(name = "sCdDepartamentoPai", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdDepartamentoPai;
    @XmlElementRef(name = "sCdDeptoEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdDeptoEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sDsDepartamento;

    /**
     * Gets the value of the lstDepartamentoIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDepartamentoIdiomaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDepartamentoIdiomaDTO> getLstDepartamentoIdioma() {
        return lstDepartamentoIdioma;
    }

    /**
     * Sets the value of the lstDepartamentoIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDepartamentoIdiomaDTO }{@code >}
     *     
     */
    public void setLstDepartamentoIdioma(JAXBElement<ArrayOfDepartamentoIdiomaDTO> value) {
        this.lstDepartamentoIdioma = ((JAXBElement<ArrayOfDepartamentoIdiomaDTO> ) value);
    }

    /**
     * Gets the value of the nCdSituacaoMap property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCdSituacaoMap() {
        return nCdSituacaoMap;
    }

    /**
     * Sets the value of the nCdSituacaoMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCdSituacaoMap(Integer value) {
        this.nCdSituacaoMap = value;
    }

    /**
     * Gets the value of the sCdDepartamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdDepartamento() {
        return sCdDepartamento;
    }

    /**
     * Sets the value of the sCdDepartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdDepartamento(String value) {
        this.sCdDepartamento = value;
    }

    /**
     * Gets the value of the sCdDepartamentoPai property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdDepartamentoPai() {
        return sCdDepartamentoPai;
    }

    /**
     * Sets the value of the sCdDepartamentoPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdDepartamentoPai(JAXBElement<String> value) {
        this.sCdDepartamentoPai = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdDeptoEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdDeptoEmpresa() {
        return sCdDeptoEmpresa;
    }

    /**
     * Sets the value of the sCdDeptoEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdDeptoEmpresa(JAXBElement<String> value) {
        this.sCdDeptoEmpresa = ((JAXBElement<String> ) value);
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
     * Gets the value of the sDsDepartamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsDepartamento() {
        return sDsDepartamento;
    }

    /**
     * Sets the value of the sDsDepartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsDepartamento(String value) {
        this.sDsDepartamento = value;
    }

}
