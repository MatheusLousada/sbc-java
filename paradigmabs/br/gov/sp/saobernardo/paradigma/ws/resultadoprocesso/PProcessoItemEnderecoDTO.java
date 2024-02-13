
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PProcessoItemEnderecoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PProcessoItemEnderecoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtItem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstPProcessoItemEnderecoRequisicao" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPProcessoItemEnderecoRequisicaoDTO" minOccurs="0"/>
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
@XmlType(name = "PProcessoItemEnderecoDTO", propOrder = {
    "dQtItem",
    "lstPProcessoItemEnderecoRequisicao",
    "sCdEmpresaCobrancaEndereco",
    "sCdEmpresaEntregaEndereco",
    "sCdEmpresaFaturamentoEndereco"
})
public class PProcessoItemEnderecoDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dQtItem;
    @XmlElementRef(name = "lstPProcessoItemEnderecoRequisicao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPProcessoItemEnderecoRequisicaoDTO> lstPProcessoItemEnderecoRequisicao;
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
     * Gets the value of the lstPProcessoItemEnderecoRequisicao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoItemEnderecoRequisicaoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPProcessoItemEnderecoRequisicaoDTO> getLstPProcessoItemEnderecoRequisicao() {
        return lstPProcessoItemEnderecoRequisicao;
    }

    /**
     * Sets the value of the lstPProcessoItemEnderecoRequisicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPProcessoItemEnderecoRequisicaoDTO }{@code >}
     *     
     */
    public void setLstPProcessoItemEnderecoRequisicao(JAXBElement<ArrayOfPProcessoItemEnderecoRequisicaoDTO> value) {
        this.lstPProcessoItemEnderecoRequisicao = ((JAXBElement<ArrayOfPProcessoItemEnderecoRequisicaoDTO> ) value);
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
