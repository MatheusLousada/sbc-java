
package br.gov.sp.saobernardo.paradigma.ws.compradireta;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompraDiretaItemEnderecoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompraDiretaItemEnderecoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtItem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sCdEmpresaCobrancaEndereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresaEntregaEndereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresaFaturamentoEndereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompraDiretaItemEnderecoDTO", propOrder = {
    "dQtItem",
    "sCdEmpresaCobrancaEndereco",
    "sCdEmpresaEntregaEndereco",
    "sCdEmpresaFaturamentoEndereco"
})
public class CompraDiretaItemEnderecoDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dQtItem;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaCobrancaEndereco;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaEntregaEndereco;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresaFaturamentoEndereco;

    /**
     * Gets the value of the dQtItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtItem() {
        return dQtItem;
    }

    /**
     * Sets the value of the dQtItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtItem(BigDecimal value) {
        this.dQtItem = value;
    }

    /**
     * Gets the value of the sCdEmpresaCobrancaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaCobrancaEndereco() {
        return sCdEmpresaCobrancaEndereco;
    }

    /**
     * Sets the value of the sCdEmpresaCobrancaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaCobrancaEndereco(String value) {
        this.sCdEmpresaCobrancaEndereco = value;
    }

    /**
     * Gets the value of the sCdEmpresaEntregaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaEntregaEndereco() {
        return sCdEmpresaEntregaEndereco;
    }

    /**
     * Sets the value of the sCdEmpresaEntregaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaEntregaEndereco(String value) {
        this.sCdEmpresaEntregaEndereco = value;
    }

    /**
     * Gets the value of the sCdEmpresaFaturamentoEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresaFaturamentoEndereco() {
        return sCdEmpresaFaturamentoEndereco;
    }

    /**
     * Sets the value of the sCdEmpresaFaturamentoEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresaFaturamentoEndereco(String value) {
        this.sCdEmpresaFaturamentoEndereco = value;
    }

}
