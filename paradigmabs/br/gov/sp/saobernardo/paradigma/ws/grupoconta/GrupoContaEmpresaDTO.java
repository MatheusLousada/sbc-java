
package br.gov.sp.saobernardo.paradigma.ws.grupoconta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrupoContaEmpresaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrupoContaEmpresaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstGrupoContaFornecedor" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfGrupoContaFornecedorDTO"/>
 *         &lt;element name="sCdGrupoConta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrupoContaEmpresaDTO", propOrder = {
    "lstGrupoContaFornecedor",
    "sCdGrupoConta"
})
public class GrupoContaEmpresaDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfGrupoContaFornecedorDTO lstGrupoContaFornecedor;
    @XmlElement(required = true, nillable = true)
    protected String sCdGrupoConta;

    /**
     * Gets the value of the lstGrupoContaFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGrupoContaFornecedorDTO }
     *     
     */
    public ArrayOfGrupoContaFornecedorDTO getLstGrupoContaFornecedor() {
        return lstGrupoContaFornecedor;
    }

    /**
     * Sets the value of the lstGrupoContaFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGrupoContaFornecedorDTO }
     *     
     */
    public void setLstGrupoContaFornecedor(ArrayOfGrupoContaFornecedorDTO value) {
        this.lstGrupoContaFornecedor = value;
    }

    /**
     * Gets the value of the sCdGrupoConta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdGrupoConta() {
        return sCdGrupoConta;
    }

    /**
     * Sets the value of the sCdGrupoConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdGrupoConta(String value) {
        this.sCdGrupoConta = value;
    }

}
