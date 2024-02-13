
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSequencialDocumentoOrigemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSequencialDocumentoOrigemDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SequencialDocumentoOrigemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}SequencialDocumentoOrigemDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSequencialDocumentoOrigemDTO", propOrder = {
    "sequencialDocumentoOrigemDTO"
})
public class ArrayOfSequencialDocumentoOrigemDTO {

    @XmlElement(name = "SequencialDocumentoOrigemDTO", nillable = true)
    protected List<SequencialDocumentoOrigemDTO> sequencialDocumentoOrigemDTO;

    /**
     * Gets the value of the sequencialDocumentoOrigemDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sequencialDocumentoOrigemDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequencialDocumentoOrigemDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequencialDocumentoOrigemDTO }
     * 
     * 
     */
    public List<SequencialDocumentoOrigemDTO> getSequencialDocumentoOrigemDTO() {
        if (sequencialDocumentoOrigemDTO == null) {
            sequencialDocumentoOrigemDTO = new ArrayList<SequencialDocumentoOrigemDTO>();
        }
        return this.sequencialDocumentoOrigemDTO;
    }

}
