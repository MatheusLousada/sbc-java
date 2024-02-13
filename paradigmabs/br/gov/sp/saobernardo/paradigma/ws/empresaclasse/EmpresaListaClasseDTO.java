
package br.gov.sp.saobernardo.paradigma.ws.empresaclasse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmpresaListaClasseDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpresaListaClasseDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstClasse" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO.Negocio}ArrayOfClasseDTO" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpresaListaClasseDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO.Negocio", propOrder = {
    "lstClasse",
    "sCdEmpresa"
})
public class EmpresaListaClasseDTO
    extends DtoBase
{

    @XmlElementRef(name = "lstClasse", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO.Negocio", type = JAXBElement.class)
    protected JAXBElement<ArrayOfClasseDTO> lstClasse;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;

    /**
     * Gets the value of the lstClasse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClasseDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfClasseDTO> getLstClasse() {
        return lstClasse;
    }

    /**
     * Sets the value of the lstClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClasseDTO }{@code >}
     *     
     */
    public void setLstClasse(JAXBElement<ArrayOfClasseDTO> value) {
        this.lstClasse = ((JAXBElement<ArrayOfClasseDTO> ) value);
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

}
