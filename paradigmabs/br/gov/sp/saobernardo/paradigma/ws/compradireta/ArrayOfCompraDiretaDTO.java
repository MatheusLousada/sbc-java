
package br.gov.sp.saobernardo.paradigma.ws.compradireta;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCompraDiretaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCompraDiretaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompraDiretaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}CompraDiretaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCompraDiretaDTO", propOrder = {
    "compraDiretaDTO"
})
public class ArrayOfCompraDiretaDTO {

    @XmlElement(name = "CompraDiretaDTO", nillable = true)
    protected List<CompraDiretaDTO> compraDiretaDTO;

    /**
     * Gets the value of the compraDiretaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compraDiretaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompraDiretaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompraDiretaDTO }
     * 
     * 
     */
    public List<CompraDiretaDTO> getCompraDiretaDTO() {
        if (compraDiretaDTO == null) {
            compraDiretaDTO = new ArrayList<CompraDiretaDTO>();
        }
        return this.compraDiretaDTO;
    }

}
