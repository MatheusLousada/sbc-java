
package br.gov.sp.saobernardo.paradigma.ws.departamento;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDepartamentoIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDepartamentoIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartamentoIdiomaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}DepartamentoIdiomaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDepartamentoIdiomaDTO", propOrder = {
    "departamentoIdiomaDTO"
})
public class ArrayOfDepartamentoIdiomaDTO {

    @XmlElement(name = "DepartamentoIdiomaDTO", nillable = true)
    protected List<DepartamentoIdiomaDTO> departamentoIdiomaDTO;

    /**
     * Gets the value of the departamentoIdiomaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departamentoIdiomaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartamentoIdiomaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepartamentoIdiomaDTO }
     * 
     * 
     */
    public List<DepartamentoIdiomaDTO> getDepartamentoIdiomaDTO() {
        if (departamentoIdiomaDTO == null) {
            departamentoIdiomaDTO = new ArrayList<DepartamentoIdiomaDTO>();
        }
        return this.departamentoIdiomaDTO;
    }

}
