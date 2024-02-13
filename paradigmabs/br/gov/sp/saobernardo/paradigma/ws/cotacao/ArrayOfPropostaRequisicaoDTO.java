
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPropostaRequisicaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPropostaRequisicaoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PropostaRequisicaoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}PropostaRequisicaoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPropostaRequisicaoDTO", propOrder = {
    "propostaRequisicaoDTO"
})
public class ArrayOfPropostaRequisicaoDTO {

    @XmlElement(name = "PropostaRequisicaoDTO", nillable = true)
    protected List<PropostaRequisicaoDTO> propostaRequisicaoDTO;

    /**
     * Gets the value of the propostaRequisicaoDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propostaRequisicaoDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropostaRequisicaoDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropostaRequisicaoDTO }
     * 
     * 
     */
    public List<PropostaRequisicaoDTO> getPropostaRequisicaoDTO() {
        if (propostaRequisicaoDTO == null) {
            propostaRequisicaoDTO = new ArrayList<PropostaRequisicaoDTO>();
        }
        return this.propostaRequisicaoDTO;
    }

}
