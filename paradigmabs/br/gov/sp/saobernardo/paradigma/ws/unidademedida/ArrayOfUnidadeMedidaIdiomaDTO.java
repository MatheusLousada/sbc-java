
package br.gov.sp.saobernardo.paradigma.ws.unidademedida;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUnidadeMedidaIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnidadeMedidaIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnidadeMedidaIdiomaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}UnidadeMedidaIdiomaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnidadeMedidaIdiomaDTO", propOrder = {
    "unidadeMedidaIdiomaDTO"
})
public class ArrayOfUnidadeMedidaIdiomaDTO {

    @XmlElement(name = "UnidadeMedidaIdiomaDTO", nillable = true)
    protected List<UnidadeMedidaIdiomaDTO> unidadeMedidaIdiomaDTO;

    /**
     * Gets the value of the unidadeMedidaIdiomaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidadeMedidaIdiomaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnidadeMedidaIdiomaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnidadeMedidaIdiomaDTO }
     * 
     * 
     */
    public List<UnidadeMedidaIdiomaDTO> getUnidadeMedidaIdiomaDTO() {
        if (unidadeMedidaIdiomaDTO == null) {
            unidadeMedidaIdiomaDTO = new ArrayList<UnidadeMedidaIdiomaDTO>();
        }
        return this.unidadeMedidaIdiomaDTO;
    }

}
