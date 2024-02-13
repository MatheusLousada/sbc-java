
package br.gov.sp.saobernardo.paradigma.ws.unidadenegocio;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmpresaUnidadeNegocioDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmpresaUnidadeNegocioDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmpresaUnidadeNegocioDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EmpresaUnidadeNegocioDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmpresaUnidadeNegocioDTO", propOrder = {
    "empresaUnidadeNegocioDTO"
})
public class ArrayOfEmpresaUnidadeNegocioDTO {

    @XmlElement(name = "EmpresaUnidadeNegocioDTO", nillable = true)
    protected List<EmpresaUnidadeNegocioDTO> empresaUnidadeNegocioDTO;

    /**
     * Gets the value of the empresaUnidadeNegocioDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the empresaUnidadeNegocioDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmpresaUnidadeNegocioDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmpresaUnidadeNegocioDTO }
     * 
     * 
     */
    public List<EmpresaUnidadeNegocioDTO> getEmpresaUnidadeNegocioDTO() {
        if (empresaUnidadeNegocioDTO == null) {
            empresaUnidadeNegocioDTO = new ArrayList<EmpresaUnidadeNegocioDTO>();
        }
        return this.empresaUnidadeNegocioDTO;
    }

}
