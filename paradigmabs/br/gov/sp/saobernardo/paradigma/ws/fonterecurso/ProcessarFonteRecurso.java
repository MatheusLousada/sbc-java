
package br.gov.sp.saobernardo.paradigma.ws.fonterecurso;

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
 *         &lt;element name="lstFonteRecurso" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfFonteRecursoDTO" minOccurs="0"/>
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
    "lstFonteRecurso"
})
@XmlRootElement(name = "ProcessarFonteRecurso", namespace = "http://tempuri.org/")
public class ProcessarFonteRecurso {

    @XmlElementRef(name = "lstFonteRecurso", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFonteRecursoDTO> lstFonteRecurso;

    /**
     * Gets the value of the lstFonteRecurso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFonteRecursoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFonteRecursoDTO> getLstFonteRecurso() {
        return lstFonteRecurso;
    }

    /**
     * Sets the value of the lstFonteRecurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFonteRecursoDTO }{@code >}
     *     
     */
    public void setLstFonteRecurso(JAXBElement<ArrayOfFonteRecursoDTO> value) {
        this.lstFonteRecurso = ((JAXBElement<ArrayOfFonteRecursoDTO> ) value);
    }

}
