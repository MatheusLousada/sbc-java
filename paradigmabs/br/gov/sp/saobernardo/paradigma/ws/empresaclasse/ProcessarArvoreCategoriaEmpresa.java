
package br.gov.sp.saobernardo.paradigma.ws.empresaclasse;

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
 *         &lt;element name="lstEmpresaClasse" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfEmpresaClasseDTO" minOccurs="0"/>
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
    "lstEmpresaClasse"
})
@XmlRootElement(name = "ProcessarArvoreCategoriaEmpresa")
public class ProcessarArvoreCategoriaEmpresa {

    @XmlElementRef(name = "lstEmpresaClasse", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEmpresaClasseDTO> lstEmpresaClasse;

    /**
     * Gets the value of the lstEmpresaClasse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaClasseDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpresaClasseDTO> getLstEmpresaClasse() {
        return lstEmpresaClasse;
    }

    /**
     * Sets the value of the lstEmpresaClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpresaClasseDTO }{@code >}
     *     
     */
    public void setLstEmpresaClasse(JAXBElement<ArrayOfEmpresaClasseDTO> value) {
        this.lstEmpresaClasse = ((JAXBElement<ArrayOfEmpresaClasseDTO> ) value);
    }

}
