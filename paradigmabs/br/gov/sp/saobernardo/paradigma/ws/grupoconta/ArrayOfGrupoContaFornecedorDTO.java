
package br.gov.sp.saobernardo.paradigma.ws.grupoconta;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGrupoContaFornecedorDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGrupoContaFornecedorDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrupoContaFornecedorDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}GrupoContaFornecedorDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGrupoContaFornecedorDTO", propOrder = {
    "grupoContaFornecedorDTO"
})
public class ArrayOfGrupoContaFornecedorDTO {

    @XmlElement(name = "GrupoContaFornecedorDTO", nillable = true)
    protected List<GrupoContaFornecedorDTO> grupoContaFornecedorDTO;

    /**
     * Gets the value of the grupoContaFornecedorDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grupoContaFornecedorDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrupoContaFornecedorDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrupoContaFornecedorDTO }
     * 
     * 
     */
    public List<GrupoContaFornecedorDTO> getGrupoContaFornecedorDTO() {
        if (grupoContaFornecedorDTO == null) {
            grupoContaFornecedorDTO = new ArrayList<GrupoContaFornecedorDTO>();
        }
        return this.grupoContaFornecedorDTO;
    }

}
