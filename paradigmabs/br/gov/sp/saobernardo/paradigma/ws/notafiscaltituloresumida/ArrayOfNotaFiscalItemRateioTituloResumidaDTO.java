
package br.gov.sp.saobernardo.paradigma.ws.notafiscaltituloresumida;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNotaFiscalItemRateioTituloResumidaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNotaFiscalItemRateioTituloResumidaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotaFiscalItemRateioTituloResumidaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}NotaFiscalItemRateioTituloResumidaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNotaFiscalItemRateioTituloResumidaDTO", propOrder = {
    "notaFiscalItemRateioTituloResumidaDTO"
})
public class ArrayOfNotaFiscalItemRateioTituloResumidaDTO {

    @XmlElement(name = "NotaFiscalItemRateioTituloResumidaDTO", nillable = true)
    protected List<NotaFiscalItemRateioTituloResumidaDTO> notaFiscalItemRateioTituloResumidaDTO;

    /**
     * Gets the value of the notaFiscalItemRateioTituloResumidaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notaFiscalItemRateioTituloResumidaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotaFiscalItemRateioTituloResumidaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotaFiscalItemRateioTituloResumidaDTO }
     * 
     * 
     */
    public List<NotaFiscalItemRateioTituloResumidaDTO> getNotaFiscalItemRateioTituloResumidaDTO() {
        if (notaFiscalItemRateioTituloResumidaDTO == null) {
            notaFiscalItemRateioTituloResumidaDTO = new ArrayList<NotaFiscalItemRateioTituloResumidaDTO>();
        }
        return this.notaFiscalItemRateioTituloResumidaDTO;
    }

}
