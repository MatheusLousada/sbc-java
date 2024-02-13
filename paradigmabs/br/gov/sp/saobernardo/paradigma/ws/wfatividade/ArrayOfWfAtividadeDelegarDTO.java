
package br.gov.sp.saobernardo.paradigma.ws.wfatividade;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWfAtividadeDelegarDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWfAtividadeDelegarDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WfAtividadeDelegarDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}WfAtividadeDelegarDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWfAtividadeDelegarDTO", propOrder = {
    "wfAtividadeDelegarDTO"
})
public class ArrayOfWfAtividadeDelegarDTO {

    @XmlElement(name = "WfAtividadeDelegarDTO", nillable = true)
    protected List<WfAtividadeDelegarDTO> wfAtividadeDelegarDTO;

    /**
     * Gets the value of the wfAtividadeDelegarDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wfAtividadeDelegarDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWfAtividadeDelegarDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WfAtividadeDelegarDTO }
     * 
     * 
     */
    public List<WfAtividadeDelegarDTO> getWfAtividadeDelegarDTO() {
        if (wfAtividadeDelegarDTO == null) {
            wfAtividadeDelegarDTO = new ArrayList<WfAtividadeDelegarDTO>();
        }
        return this.wfAtividadeDelegarDTO;
    }

}
