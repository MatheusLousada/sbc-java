
package br.gov.sp.saobernardo.paradigma.ws.notafiscaltituloresumida;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNotaFiscalItemTaxaTituloResumidaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNotaFiscalItemTaxaTituloResumidaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotaFiscalItemTaxaTituloResumidaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}NotaFiscalItemTaxaTituloResumidaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNotaFiscalItemTaxaTituloResumidaDTO", propOrder = {
    "notaFiscalItemTaxaTituloResumidaDTO"
})
public class ArrayOfNotaFiscalItemTaxaTituloResumidaDTO {

    @XmlElement(name = "NotaFiscalItemTaxaTituloResumidaDTO", nillable = true)
    protected List<NotaFiscalItemTaxaTituloResumidaDTO> notaFiscalItemTaxaTituloResumidaDTO;

    /**
     * Gets the value of the notaFiscalItemTaxaTituloResumidaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notaFiscalItemTaxaTituloResumidaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotaFiscalItemTaxaTituloResumidaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotaFiscalItemTaxaTituloResumidaDTO }
     * 
     * 
     */
    public List<NotaFiscalItemTaxaTituloResumidaDTO> getNotaFiscalItemTaxaTituloResumidaDTO() {
        if (notaFiscalItemTaxaTituloResumidaDTO == null) {
            notaFiscalItemTaxaTituloResumidaDTO = new ArrayList<NotaFiscalItemTaxaTituloResumidaDTO>();
        }
        return this.notaFiscalItemTaxaTituloResumidaDTO;
    }

}
