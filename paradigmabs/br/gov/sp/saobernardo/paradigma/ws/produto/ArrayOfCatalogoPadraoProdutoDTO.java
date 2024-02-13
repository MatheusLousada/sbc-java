
package br.gov.sp.saobernardo.paradigma.ws.produto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCatalogoPadraoProdutoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCatalogoPadraoProdutoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CatalogoPadraoProdutoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}CatalogoPadraoProdutoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCatalogoPadraoProdutoDTO", propOrder = {
    "catalogoPadraoProdutoDTO"
})
public class ArrayOfCatalogoPadraoProdutoDTO {

    @XmlElement(name = "CatalogoPadraoProdutoDTO", nillable = true)
    protected List<CatalogoPadraoProdutoDTO> catalogoPadraoProdutoDTO;

    /**
     * Gets the value of the catalogoPadraoProdutoDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalogoPadraoProdutoDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalogoPadraoProdutoDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogoPadraoProdutoDTO }
     * 
     * 
     */
    public List<CatalogoPadraoProdutoDTO> getCatalogoPadraoProdutoDTO() {
        if (catalogoPadraoProdutoDTO == null) {
            catalogoPadraoProdutoDTO = new ArrayList<CatalogoPadraoProdutoDTO>();
        }
        return this.catalogoPadraoProdutoDTO;
    }

}
