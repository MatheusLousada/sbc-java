
package br.gov.sp.saobernardo.paradigma.ws.empenho;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmpenhoCapaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmpenhoCapaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmpenhoCapaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EmpenhoCapaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmpenhoCapaDTO", propOrder = {
    "empenhoCapaDTO"
})
public class ArrayOfEmpenhoCapaDTO {

    @XmlElement(name = "EmpenhoCapaDTO", nillable = true)
    protected List<EmpenhoCapaDTO> empenhoCapaDTO;

    /**
     * Gets the value of the empenhoCapaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the empenhoCapaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmpenhoCapaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmpenhoCapaDTO }
     * 
     * 
     */
    public List<EmpenhoCapaDTO> getEmpenhoCapaDTO() {
        if (empenhoCapaDTO == null) {
            empenhoCapaDTO = new ArrayList<EmpenhoCapaDTO>();
        }
        return this.empenhoCapaDTO;
    }

}
