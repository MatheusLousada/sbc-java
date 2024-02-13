
package br.gov.sp.saobernardo.paradigma.ws.compradireta;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCompraDiretaItemEnderecoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCompraDiretaItemEnderecoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompraDiretaItemEnderecoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}CompraDiretaItemEnderecoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCompraDiretaItemEnderecoDTO", propOrder = {
    "compraDiretaItemEnderecoDTO"
})
public class ArrayOfCompraDiretaItemEnderecoDTO {

    @XmlElement(name = "CompraDiretaItemEnderecoDTO", nillable = true)
    protected List<CompraDiretaItemEnderecoDTO> compraDiretaItemEnderecoDTO;

    /**
     * Gets the value of the compraDiretaItemEnderecoDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compraDiretaItemEnderecoDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompraDiretaItemEnderecoDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompraDiretaItemEnderecoDTO }
     * 
     * 
     */
    public List<CompraDiretaItemEnderecoDTO> getCompraDiretaItemEnderecoDTO() {
        if (compraDiretaItemEnderecoDTO == null) {
            compraDiretaItemEnderecoDTO = new ArrayList<CompraDiretaItemEnderecoDTO>();
        }
        return this.compraDiretaItemEnderecoDTO;
    }

}
