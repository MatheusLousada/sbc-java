
package br.gov.sp.saobernardo.paradigma.ws.ordemcompra;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrdemCompraItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrdemCompraItemDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrdemCompraItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}OrdemCompraItemDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrdemCompraItemDTO", propOrder = {
    "ordemCompraItemDTO"
})
public class ArrayOfOrdemCompraItemDTO {

    @XmlElement(name = "OrdemCompraItemDTO", nillable = true)
    protected List<OrdemCompraItemDTO> ordemCompraItemDTO;

    /**
     * Gets the value of the ordemCompraItemDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordemCompraItemDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdemCompraItemDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdemCompraItemDTO }
     * 
     * 
     */
    public List<OrdemCompraItemDTO> getOrdemCompraItemDTO() {
        if (ordemCompraItemDTO == null) {
            ordemCompraItemDTO = new ArrayList<OrdemCompraItemDTO>();
        }
        return this.ordemCompraItemDTO;
    }

}
