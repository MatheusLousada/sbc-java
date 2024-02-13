
package br.gov.sp.saobernardo.paradigma.ws.empresa;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmpresaAvaliacaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmpresaAvaliacaoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmpresaAvaliacaoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EmpresaAvaliacaoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmpresaAvaliacaoDTO", propOrder = {
    "empresaAvaliacaoDTO"
})
public class ArrayOfEmpresaAvaliacaoDTO {

    @XmlElement(name = "EmpresaAvaliacaoDTO", nillable = true)
    protected List<EmpresaAvaliacaoDTO> empresaAvaliacaoDTO;

    /**
     * Gets the value of the empresaAvaliacaoDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the empresaAvaliacaoDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmpresaAvaliacaoDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmpresaAvaliacaoDTO }
     * 
     * 
     */
    public List<EmpresaAvaliacaoDTO> getEmpresaAvaliacaoDTO() {
        if (empresaAvaliacaoDTO == null) {
            empresaAvaliacaoDTO = new ArrayList<EmpresaAvaliacaoDTO>();
        }
        return this.empresaAvaliacaoDTO;
    }

}
