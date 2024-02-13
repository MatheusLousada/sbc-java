
package br.gov.sp.saobernardo.paradigma.ws.leilao;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLeilaoItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLeilaoItemDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LeilaoItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}LeilaoItemDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLeilaoItemDTO", propOrder = {
    "leilaoItemDTO"
})
public class ArrayOfLeilaoItemDTO {

    @XmlElement(name = "LeilaoItemDTO", nillable = true)
    protected List<LeilaoItemDTO> leilaoItemDTO;

    /**
     * Gets the value of the leilaoItemDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leilaoItemDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeilaoItemDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LeilaoItemDTO }
     * 
     * 
     */
    public List<LeilaoItemDTO> getLeilaoItemDTO() {
        if (leilaoItemDTO == null) {
            leilaoItemDTO = new ArrayList<LeilaoItemDTO>();
        }
        return this.leilaoItemDTO;
    }

}
