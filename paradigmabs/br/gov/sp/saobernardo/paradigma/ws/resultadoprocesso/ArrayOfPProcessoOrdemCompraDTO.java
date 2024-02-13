
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPProcessoOrdemCompraDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPProcessoOrdemCompraDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PProcessoOrdemCompraDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}PProcessoOrdemCompraDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPProcessoOrdemCompraDTO", propOrder = {
    "pProcessoOrdemCompraDTO"
})
public class ArrayOfPProcessoOrdemCompraDTO {

    @XmlElement(name = "PProcessoOrdemCompraDTO", nillable = true)
    protected List<PProcessoOrdemCompraDTO> pProcessoOrdemCompraDTO;

    /**
     * Gets the value of the pProcessoOrdemCompraDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pProcessoOrdemCompraDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPProcessoOrdemCompraDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PProcessoOrdemCompraDTO }
     * 
     * 
     */
    public List<PProcessoOrdemCompraDTO> getPProcessoOrdemCompraDTO() {
        if (pProcessoOrdemCompraDTO == null) {
            pProcessoOrdemCompraDTO = new ArrayList<PProcessoOrdemCompraDTO>();
        }
        return this.pProcessoOrdemCompraDTO;
    }

}
