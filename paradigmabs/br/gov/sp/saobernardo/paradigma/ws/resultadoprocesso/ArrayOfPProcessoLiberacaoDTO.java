
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPProcessoLiberacaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPProcessoLiberacaoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PProcessoLiberacaoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}PProcessoLiberacaoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPProcessoLiberacaoDTO", propOrder = {
    "pProcessoLiberacaoDTO"
})
public class ArrayOfPProcessoLiberacaoDTO {

    @XmlElement(name = "PProcessoLiberacaoDTO", nillable = true)
    protected List<PProcessoLiberacaoDTO> pProcessoLiberacaoDTO;

    /**
     * Gets the value of the pProcessoLiberacaoDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pProcessoLiberacaoDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPProcessoLiberacaoDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PProcessoLiberacaoDTO }
     * 
     * 
     */
    public List<PProcessoLiberacaoDTO> getPProcessoLiberacaoDTO() {
        if (pProcessoLiberacaoDTO == null) {
            pProcessoLiberacaoDTO = new ArrayList<PProcessoLiberacaoDTO>();
        }
        return this.pProcessoLiberacaoDTO;
    }

}
