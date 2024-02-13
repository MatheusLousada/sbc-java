
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPProcessoItemEnderecoRequisicaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPProcessoItemEnderecoRequisicaoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PProcessoItemEnderecoRequisicaoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}PProcessoItemEnderecoRequisicaoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPProcessoItemEnderecoRequisicaoDTO", propOrder = {
    "pProcessoItemEnderecoRequisicaoDTO"
})
public class ArrayOfPProcessoItemEnderecoRequisicaoDTO {

    @XmlElement(name = "PProcessoItemEnderecoRequisicaoDTO", nillable = true)
    protected List<PProcessoItemEnderecoRequisicaoDTO> pProcessoItemEnderecoRequisicaoDTO;

    /**
     * Gets the value of the pProcessoItemEnderecoRequisicaoDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pProcessoItemEnderecoRequisicaoDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPProcessoItemEnderecoRequisicaoDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PProcessoItemEnderecoRequisicaoDTO }
     * 
     * 
     */
    public List<PProcessoItemEnderecoRequisicaoDTO> getPProcessoItemEnderecoRequisicaoDTO() {
        if (pProcessoItemEnderecoRequisicaoDTO == null) {
            pProcessoItemEnderecoRequisicaoDTO = new ArrayList<PProcessoItemEnderecoRequisicaoDTO>();
        }
        return this.pProcessoItemEnderecoRequisicaoDTO;
    }

}
