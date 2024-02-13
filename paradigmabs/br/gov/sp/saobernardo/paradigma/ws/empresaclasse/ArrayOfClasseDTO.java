
package br.gov.sp.saobernardo.paradigma.ws.empresaclasse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClasseDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClasseDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClasseDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO.Negocio}ClasseDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClasseDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO.Negocio", propOrder = {
    "classeDTO"
})
public class ArrayOfClasseDTO {

    @XmlElement(name = "ClasseDTO", nillable = true)
    protected List<ClasseDTO> classeDTO;

    /**
     * Gets the value of the classeDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classeDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClasseDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClasseDTO }
     * 
     * 
     */
    public List<ClasseDTO> getClasseDTO() {
        if (classeDTO == null) {
            classeDTO = new ArrayList<ClasseDTO>();
        }
        return this.classeDTO;
    }

}
