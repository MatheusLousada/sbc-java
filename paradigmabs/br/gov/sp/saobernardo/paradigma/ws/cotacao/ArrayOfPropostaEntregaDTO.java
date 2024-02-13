
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPropostaEntregaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPropostaEntregaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PropostaEntregaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}PropostaEntregaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPropostaEntregaDTO", propOrder = {
    "propostaEntregaDTO"
})
public class ArrayOfPropostaEntregaDTO {

    @XmlElement(name = "PropostaEntregaDTO", nillable = true)
    protected List<PropostaEntregaDTO> propostaEntregaDTO;

    /**
     * Gets the value of the propostaEntregaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propostaEntregaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropostaEntregaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropostaEntregaDTO }
     * 
     * 
     */
    public List<PropostaEntregaDTO> getPropostaEntregaDTO() {
        if (propostaEntregaDTO == null) {
            propostaEntregaDTO = new ArrayList<PropostaEntregaDTO>();
        }
        return this.propostaEntregaDTO;
    }

}
