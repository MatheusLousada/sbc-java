
package br.gov.sp.saobernardo.paradigma.ws.patrimonio;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInventarioMovelItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInventarioMovelItemDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InventarioMovelItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}InventarioMovelItemDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInventarioMovelItemDTO", propOrder = {
    "inventarioMovelItemDTO"
})
public class ArrayOfInventarioMovelItemDTO {

    @XmlElement(name = "InventarioMovelItemDTO", nillable = true)
    protected List<InventarioMovelItemDTO> inventarioMovelItemDTO;

    /**
     * Gets the value of the inventarioMovelItemDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventarioMovelItemDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventarioMovelItemDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventarioMovelItemDTO }
     * 
     * 
     */
    public List<InventarioMovelItemDTO> getInventarioMovelItemDTO() {
        if (inventarioMovelItemDTO == null) {
            inventarioMovelItemDTO = new ArrayList<InventarioMovelItemDTO>();
        }
        return this.inventarioMovelItemDTO;
    }

}
