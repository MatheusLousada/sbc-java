
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPProcessoItemResultadoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPProcessoItemResultadoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PProcessoItemResultadoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}PProcessoItemResultadoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPProcessoItemResultadoDTO", propOrder = {
    "pProcessoItemResultadoDTO"
})
public class ArrayOfPProcessoItemResultadoDTO {

    @XmlElement(name = "PProcessoItemResultadoDTO", nillable = true)
    protected List<PProcessoItemResultadoDTO> pProcessoItemResultadoDTO;

    /**
     * Gets the value of the pProcessoItemResultadoDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pProcessoItemResultadoDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPProcessoItemResultadoDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PProcessoItemResultadoDTO }
     * 
     * 
     */
    public List<PProcessoItemResultadoDTO> getPProcessoItemResultadoDTO() {
        if (pProcessoItemResultadoDTO == null) {
            pProcessoItemResultadoDTO = new ArrayList<PProcessoItemResultadoDTO>();
        }
        return this.pProcessoItemResultadoDTO;
    }

}
