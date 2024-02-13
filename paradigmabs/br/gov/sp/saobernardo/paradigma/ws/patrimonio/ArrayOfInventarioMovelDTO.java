
package br.gov.sp.saobernardo.paradigma.ws.patrimonio;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInventarioMovelDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInventarioMovelDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InventarioMovelDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}InventarioMovelDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInventarioMovelDTO", propOrder = {
    "inventarioMovelDTO"
})
public class ArrayOfInventarioMovelDTO {

    @XmlElement(name = "InventarioMovelDTO", nillable = true)
    protected List<InventarioMovelDTO> inventarioMovelDTO;

    /**
     * Gets the value of the inventarioMovelDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventarioMovelDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventarioMovelDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventarioMovelDTO }
     * 
     * 
     */
    public List<InventarioMovelDTO> getInventarioMovelDTO() {
        if (inventarioMovelDTO == null) {
            inventarioMovelDTO = new ArrayList<InventarioMovelDTO>();
        }
        return this.inventarioMovelDTO;
    }

}
