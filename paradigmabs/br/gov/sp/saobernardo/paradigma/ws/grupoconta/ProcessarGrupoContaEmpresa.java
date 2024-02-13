
package br.gov.sp.saobernardo.paradigma.ws.grupoconta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lstGrupoContaEmpresa" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfGrupoContaEmpresaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lstGrupoContaEmpresa"
})
@XmlRootElement(name = "ProcessarGrupoContaEmpresa", namespace = "http://tempuri.org/")
public class ProcessarGrupoContaEmpresa {

    @XmlElementRef(name = "lstGrupoContaEmpresa", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfGrupoContaEmpresaDTO> lstGrupoContaEmpresa;

    /**
     * Gets the value of the lstGrupoContaEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGrupoContaEmpresaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGrupoContaEmpresaDTO> getLstGrupoContaEmpresa() {
        return lstGrupoContaEmpresa;
    }

    /**
     * Sets the value of the lstGrupoContaEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGrupoContaEmpresaDTO }{@code >}
     *     
     */
    public void setLstGrupoContaEmpresa(JAXBElement<ArrayOfGrupoContaEmpresaDTO> value) {
        this.lstGrupoContaEmpresa = ((JAXBElement<ArrayOfGrupoContaEmpresaDTO> ) value);
    }

}
