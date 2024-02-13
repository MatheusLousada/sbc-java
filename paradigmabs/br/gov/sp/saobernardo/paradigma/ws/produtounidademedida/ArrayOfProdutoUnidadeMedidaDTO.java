
package br.gov.sp.saobernardo.paradigma.ws.produtounidademedida;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProdutoUnidadeMedidaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProdutoUnidadeMedidaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProdutoUnidadeMedidaDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ProdutoUnidadeMedidaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProdutoUnidadeMedidaDTO", propOrder = {
    "produtoUnidadeMedidaDTO"
})
public class ArrayOfProdutoUnidadeMedidaDTO {

    @XmlElement(name = "ProdutoUnidadeMedidaDTO", nillable = true)
    protected List<ProdutoUnidadeMedidaDTO> produtoUnidadeMedidaDTO;

    /**
     * Gets the value of the produtoUnidadeMedidaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the produtoUnidadeMedidaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdutoUnidadeMedidaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdutoUnidadeMedidaDTO }
     * 
     * 
     */
    public List<ProdutoUnidadeMedidaDTO> getProdutoUnidadeMedidaDTO() {
        if (produtoUnidadeMedidaDTO == null) {
            produtoUnidadeMedidaDTO = new ArrayList<ProdutoUnidadeMedidaDTO>();
        }
        return this.produtoUnidadeMedidaDTO;
    }

}
