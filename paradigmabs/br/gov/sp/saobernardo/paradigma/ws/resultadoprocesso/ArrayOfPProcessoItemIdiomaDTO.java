
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPProcessoItemIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPProcessoItemIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PProcessoItemIdiomaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}PProcessoItemIdiomaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPProcessoItemIdiomaDTO", propOrder = {
    "pProcessoItemIdiomaDTO"
})
public class ArrayOfPProcessoItemIdiomaDTO {

    @XmlElement(name = "PProcessoItemIdiomaDTO", nillable = true)
    protected List<PProcessoItemIdiomaDTO> pProcessoItemIdiomaDTO;

    /**
     * Gets the value of the pProcessoItemIdiomaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pProcessoItemIdiomaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPProcessoItemIdiomaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PProcessoItemIdiomaDTO }
     * 
     * 
     */
    public List<PProcessoItemIdiomaDTO> getPProcessoItemIdiomaDTO() {
        if (pProcessoItemIdiomaDTO == null) {
            pProcessoItemIdiomaDTO = new ArrayList<PProcessoItemIdiomaDTO>();
        }
        return this.pProcessoItemIdiomaDTO;
    }

}
