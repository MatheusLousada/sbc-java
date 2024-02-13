
package br.gov.sp.saobernardo.paradigma.ws.empresaclasse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmpresaListaClasseDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmpresaListaClasseDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmpresaListaClasseDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO.Negocio}EmpresaListaClasseDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmpresaListaClasseDTO", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO.Negocio", propOrder = {
    "empresaListaClasseDTO"
})
public class ArrayOfEmpresaListaClasseDTO {

    @XmlElement(name = "EmpresaListaClasseDTO", nillable = true)
    protected List<EmpresaListaClasseDTO> empresaListaClasseDTO;

    /**
     * Gets the value of the empresaListaClasseDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the empresaListaClasseDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmpresaListaClasseDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmpresaListaClasseDTO }
     * 
     * 
     */
    public List<EmpresaListaClasseDTO> getEmpresaListaClasseDTO() {
        if (empresaListaClasseDTO == null) {
            empresaListaClasseDTO = new ArrayList<EmpresaListaClasseDTO>();
        }
        return this.empresaListaClasseDTO;
    }

}
