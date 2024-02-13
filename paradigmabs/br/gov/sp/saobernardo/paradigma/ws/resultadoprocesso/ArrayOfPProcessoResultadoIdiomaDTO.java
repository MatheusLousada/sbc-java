
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPProcessoResultadoIdiomaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPProcessoResultadoIdiomaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PProcessoResultadoIdiomaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}PProcessoResultadoIdiomaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPProcessoResultadoIdiomaDTO", propOrder = {
    "pProcessoResultadoIdiomaDTO"
})
public class ArrayOfPProcessoResultadoIdiomaDTO {

    @XmlElement(name = "PProcessoResultadoIdiomaDTO", nillable = true)
    protected List<PProcessoResultadoIdiomaDTO> pProcessoResultadoIdiomaDTO;

    /**
     * Gets the value of the pProcessoResultadoIdiomaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pProcessoResultadoIdiomaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPProcessoResultadoIdiomaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PProcessoResultadoIdiomaDTO }
     * 
     * 
     */
    public List<PProcessoResultadoIdiomaDTO> getPProcessoResultadoIdiomaDTO() {
        if (pProcessoResultadoIdiomaDTO == null) {
            pProcessoResultadoIdiomaDTO = new ArrayList<PProcessoResultadoIdiomaDTO>();
        }
        return this.pProcessoResultadoIdiomaDTO;
    }

}
