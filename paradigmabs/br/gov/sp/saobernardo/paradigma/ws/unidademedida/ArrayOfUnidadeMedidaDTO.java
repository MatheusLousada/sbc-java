
package br.gov.sp.saobernardo.paradigma.ws.unidademedida;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUnidadeMedidaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnidadeMedidaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnidadeMedidaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}UnidadeMedidaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnidadeMedidaDTO", propOrder = {
    "unidadeMedidaDTO"
})
public class ArrayOfUnidadeMedidaDTO {

    @XmlElement(name = "UnidadeMedidaDTO", nillable = true)
    protected List<UnidadeMedidaDTO> unidadeMedidaDTO;

    /**
     * Gets the value of the unidadeMedidaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidadeMedidaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnidadeMedidaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnidadeMedidaDTO }
     * 
     * 
     */
    public List<UnidadeMedidaDTO> getUnidadeMedidaDTO() {
        if (unidadeMedidaDTO == null) {
            unidadeMedidaDTO = new ArrayList<UnidadeMedidaDTO>();
        }
        return this.unidadeMedidaDTO;
    }

}
