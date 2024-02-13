
package br.gov.sp.saobernardo.paradigma.ws.empresagestao;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmpresaGestaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmpresaGestaoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmpresaGestaoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EmpresaGestaoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmpresaGestaoDTO", propOrder = {
    "empresaGestaoDTO"
})
public class ArrayOfEmpresaGestaoDTO {

    @XmlElement(name = "EmpresaGestaoDTO", nillable = true)
    protected List<EmpresaGestaoDTO> empresaGestaoDTO;

    /**
     * Gets the value of the empresaGestaoDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the empresaGestaoDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmpresaGestaoDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmpresaGestaoDTO }
     * 
     * 
     */
    public List<EmpresaGestaoDTO> getEmpresaGestaoDTO() {
        if (empresaGestaoDTO == null) {
            empresaGestaoDTO = new ArrayList<EmpresaGestaoDTO>();
        }
        return this.empresaGestaoDTO;
    }

}
