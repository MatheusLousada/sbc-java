
package br.gov.sp.saobernardo.paradigma.ws.empresaproduto;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmpresaProdutoDetalheDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpresaProdutoDetalheDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlHomologado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dVlConversao" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nNrDiasLeadTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nNrDiasTransitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdComprador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUnidadeFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsDescricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsDescricaoDetalhada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpresaProdutoDetalheDTO", propOrder = {
    "bFlHomologado",
    "dVlConversao",
    "nNrDiasLeadTime",
    "nNrDiasTransitTime",
    "sCdComprador",
    "sCdEmpresa",
    "sCdIva",
    "sCdProduto",
    "sCdUnidadeFornecedor",
    "sDsDescricao",
    "sDsDescricaoDetalhada"
})
public class EmpresaProdutoDetalheDTO
    extends DtoBase
{

    protected Integer bFlHomologado;
    protected BigDecimal dVlConversao;
    @XmlElementRef(name = "nNrDiasLeadTime", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nNrDiasLeadTime;
    @XmlElementRef(name = "nNrDiasTransitTime", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nNrDiasTransitTime;
    @XmlElementRef(name = "sCdComprador", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdComprador;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElementRef(name = "sCdIva", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdIva;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;
    @XmlElementRef(name = "sCdUnidadeFornecedor", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUnidadeFornecedor;
    @XmlElementRef(name = "sDsDescricao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsDescricao;
    @XmlElementRef(name = "sDsDescricaoDetalhada", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsDescricaoDetalhada;

    /**
     * Gets the value of the bFlHomologado property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlHomologado() {
        return bFlHomologado;
    }

    /**
     * Sets the value of the bFlHomologado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlHomologado(Integer value) {
        this.bFlHomologado = value;
    }

    /**
     * Gets the value of the dVlConversao property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlConversao() {
        return dVlConversao;
    }

    /**
     * Sets the value of the dVlConversao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlConversao(BigDecimal value) {
        this.dVlConversao = value;
    }

    /**
     * Gets the value of the nNrDiasLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNNrDiasLeadTime() {
        return nNrDiasLeadTime;
    }

    /**
     * Sets the value of the nNrDiasLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNNrDiasLeadTime(JAXBElement<Integer> value) {
        this.nNrDiasLeadTime = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the nNrDiasTransitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNNrDiasTransitTime() {
        return nNrDiasTransitTime;
    }

    /**
     * Sets the value of the nNrDiasTransitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNNrDiasTransitTime(JAXBElement<Integer> value) {
        this.nNrDiasTransitTime = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sCdComprador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdComprador() {
        return sCdComprador;
    }

    /**
     * Sets the value of the sCdComprador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdComprador(JAXBElement<String> value) {
        this.sCdComprador = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdEmpresa() {
        return sCdEmpresa;
    }

    /**
     * Sets the value of the sCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdEmpresa(String value) {
        this.sCdEmpresa = value;
    }

    /**
     * Gets the value of the sCdIva property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdIva() {
        return sCdIva;
    }

    /**
     * Sets the value of the sCdIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdIva(JAXBElement<String> value) {
        this.sCdIva = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdProduto() {
        return sCdProduto;
    }

    /**
     * Sets the value of the sCdProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdProduto(String value) {
        this.sCdProduto = value;
    }

    /**
     * Gets the value of the sCdUnidadeFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUnidadeFornecedor() {
        return sCdUnidadeFornecedor;
    }

    /**
     * Sets the value of the sCdUnidadeFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUnidadeFornecedor(JAXBElement<String> value) {
        this.sCdUnidadeFornecedor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsDescricao() {
        return sDsDescricao;
    }

    /**
     * Sets the value of the sDsDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsDescricao(JAXBElement<String> value) {
        this.sDsDescricao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsDescricaoDetalhada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsDescricaoDetalhada() {
        return sDsDescricaoDetalhada;
    }

    /**
     * Sets the value of the sDsDescricaoDetalhada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsDescricaoDetalhada(JAXBElement<String> value) {
        this.sDsDescricaoDetalhada = ((JAXBElement<String> ) value);
    }

}
