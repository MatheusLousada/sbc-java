
package br.gov.sp.saobernardo.paradigma.ws.empenho;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLiquidacaoEmpenhoItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLiquidacaoEmpenhoItemDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LiquidacaoEmpenhoItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}LiquidacaoEmpenhoItemDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLiquidacaoEmpenhoItemDTO", propOrder = {
    "liquidacaoEmpenhoItemDTO"
})
public class ArrayOfLiquidacaoEmpenhoItemDTO {

    @XmlElement(name = "LiquidacaoEmpenhoItemDTO", nillable = true)
    protected List<LiquidacaoEmpenhoItemDTO> liquidacaoEmpenhoItemDTO;

    /**
     * Gets the value of the liquidacaoEmpenhoItemDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liquidacaoEmpenhoItemDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiquidacaoEmpenhoItemDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidacaoEmpenhoItemDTO }
     * 
     * 
     */
    public List<LiquidacaoEmpenhoItemDTO> getLiquidacaoEmpenhoItemDTO() {
        if (liquidacaoEmpenhoItemDTO == null) {
            liquidacaoEmpenhoItemDTO = new ArrayList<LiquidacaoEmpenhoItemDTO>();
        }
        return this.liquidacaoEmpenhoItemDTO;
    }

}
