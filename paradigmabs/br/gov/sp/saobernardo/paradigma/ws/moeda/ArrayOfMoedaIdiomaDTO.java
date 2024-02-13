
package br.gov.sp.saobernardo.paradigma.ws.moeda;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMoedaIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMoedaIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MoedaIdiomaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}MoedaIdiomaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMoedaIdiomaDTO", propOrder = {
    "moedaIdiomaDTO"
})
public class ArrayOfMoedaIdiomaDTO {

    @XmlElement(name = "MoedaIdiomaDTO", nillable = true)
    protected List<MoedaIdiomaDTO> moedaIdiomaDTO;

    /**
     * Gets the value of the moedaIdiomaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moedaIdiomaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoedaIdiomaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoedaIdiomaDTO }
     * 
     * 
     */
    public List<MoedaIdiomaDTO> getMoedaIdiomaDTO() {
        if (moedaIdiomaDTO == null) {
            moedaIdiomaDTO = new ArrayList<MoedaIdiomaDTO>();
        }
        return this.moedaIdiomaDTO;
    }

}
