
package br.gov.sp.saobernardo.paradigma.ws.empenho;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PedidoItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PedidoItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dPcDesconto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dQtItem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dVlItem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lstAnexo" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfAnexoDTO" minOccurs="0"/>
 *         &lt;element name="lstPedidoItemEntrega" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPedidoItemEntregaDTO"/>
 *         &lt;element name="lstPedidoItemTaxa" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPedidoItemTaxaDTO"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sCdClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemOrigemEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdItemWbc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdNbm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdOrigemEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUnidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuarioResponsavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidoItemDTO", propOrder = {
    "dPcDesconto",
    "dQtItem",
    "dVlItem",
    "lstAnexo",
    "lstPedidoItemEntrega",
    "lstPedidoItemTaxa",
    "nCdSituacao",
    "sCdClasse",
    "sCdEmpresa",
    "sCdItemEmpresa",
    "sCdItemOrigemEmpresa",
    "sCdItemWbc",
    "sCdIva",
    "sCdNbm",
    "sCdOrigemEmpresa",
    "sCdProduto",
    "sCdUnidadeMedida",
    "sCdUsuarioResponsavel",
    "sDsItem",
    "sDsObservacao"
})
public class PedidoItemDTO
    extends DtoBase
{

    @XmlElementRef(name = "dPcDesconto", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dPcDesconto;
    @XmlElement(required = true)
    protected BigDecimal dQtItem;
    @XmlElement(required = true)
    protected BigDecimal dVlItem;
    @XmlElementRef(name = "lstAnexo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAnexoDTO> lstAnexo;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPedidoItemEntregaDTO lstPedidoItemEntrega;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPedidoItemTaxaDTO lstPedidoItemTaxa;
    protected Long nCdSituacao;
    @XmlElement(required = true, nillable = true)
    protected String sCdClasse;
    @XmlElementRef(name = "sCdEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresa;
    @XmlElementRef(name = "sCdItemEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemEmpresa;
    @XmlElementRef(name = "sCdItemOrigemEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemOrigemEmpresa;
    @XmlElementRef(name = "sCdItemWbc", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemWbc;
    @XmlElementRef(name = "sCdIva", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdIva;
    @XmlElementRef(name = "sCdNbm", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdNbm;
    @XmlElementRef(name = "sCdOrigemEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdOrigemEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;
    @XmlElement(required = true, nillable = true)
    protected String sCdUnidadeMedida;
    @XmlElementRef(name = "sCdUsuarioResponsavel", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUsuarioResponsavel;
    @XmlElement(required = true, nillable = true)
    protected String sDsItem;
    @XmlElementRef(name = "sDsObservacao", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsObservacao;

    /**
     * Gets the value of the dPcDesconto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDPcDesconto() {
        return dPcDesconto;
    }

    /**
     * Sets the value of the dPcDesconto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDPcDesconto(JAXBElement<BigDecimal> value) {
        this.dPcDesconto = ((JAXBElement<BigDecimal> ) value);
    }

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
     * Gets the value of the dVlItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlItem() {
        return dVlItem;
    }

    /**
     * Sets the value of the dVlItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlItem(BigDecimal value) {
        this.dVlItem = value;
    }

    /**
     * Gets the value of the lstAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAnexoDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAnexoDTO> getLstAnexo() {
        return lstAnexo;
    }

    /**
     * Sets the value of the lstAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAnexoDTO }{@code >}
     *     
     */
    public void setLstAnexo(JAXBElement<ArrayOfAnexoDTO> value) {
        this.lstAnexo = ((JAXBElement<ArrayOfAnexoDTO> ) value);
    }

    /**
     * Gets the value of the lstPedidoItemEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPedidoItemEntregaDTO }
     *     
     */
    public ArrayOfPedidoItemEntregaDTO getLstPedidoItemEntrega() {
        return lstPedidoItemEntrega;
    }

    /**
     * Sets the value of the lstPedidoItemEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPedidoItemEntregaDTO }
     *     
     */
    public void setLstPedidoItemEntrega(ArrayOfPedidoItemEntregaDTO value) {
        this.lstPedidoItemEntrega = value;
    }

    /**
     * Gets the value of the lstPedidoItemTaxa property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPedidoItemTaxaDTO }
     *     
     */
    public ArrayOfPedidoItemTaxaDTO getLstPedidoItemTaxa() {
        return lstPedidoItemTaxa;
    }

    /**
     * Sets the value of the lstPedidoItemTaxa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPedidoItemTaxaDTO }
     *     
     */
    public void setLstPedidoItemTaxa(ArrayOfPedidoItemTaxaDTO value) {
        this.lstPedidoItemTaxa = value;
    }

    /**
     * Gets the value of the nCdSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdSituacao() {
        return nCdSituacao;
    }

    /**
     * Sets the value of the nCdSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdSituacao(Long value) {
        this.nCdSituacao = value;
    }

    /**
     * Gets the value of the sCdClasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdClasse() {
        return sCdClasse;
    }

    /**
     * Sets the value of the sCdClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdClasse(String value) {
        this.sCdClasse = value;
    }

    /**
     * Gets the value of the sCdEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdEmpresa() {
        return sCdEmpresa;
    }

    /**
     * Sets the value of the sCdEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdEmpresa(JAXBElement<String> value) {
        this.sCdEmpresa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdItemEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdItemEmpresa() {
        return sCdItemEmpresa;
    }

    /**
     * Sets the value of the sCdItemEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdItemEmpresa(JAXBElement<String> value) {
        this.sCdItemEmpresa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdItemOrigemEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdItemOrigemEmpresa() {
        return sCdItemOrigemEmpresa;
    }

    /**
     * Sets the value of the sCdItemOrigemEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdItemOrigemEmpresa(JAXBElement<String> value) {
        this.sCdItemOrigemEmpresa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdItemWbc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdItemWbc() {
        return sCdItemWbc;
    }

    /**
     * Sets the value of the sCdItemWbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdItemWbc(JAXBElement<String> value) {
        this.sCdItemWbc = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdNbm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdNbm() {
        return sCdNbm;
    }

    /**
     * Sets the value of the sCdNbm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdNbm(JAXBElement<String> value) {
        this.sCdNbm = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdOrigemEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdOrigemEmpresa() {
        return sCdOrigemEmpresa;
    }

    /**
     * Sets the value of the sCdOrigemEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdOrigemEmpresa(JAXBElement<String> value) {
        this.sCdOrigemEmpresa = ((JAXBElement<String> ) value);
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
     * Gets the value of the sCdUnidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUnidadeMedida() {
        return sCdUnidadeMedida;
    }

    /**
     * Sets the value of the sCdUnidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUnidadeMedida(String value) {
        this.sCdUnidadeMedida = value;
    }

    /**
     * Gets the value of the sCdUsuarioResponsavel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUsuarioResponsavel() {
        return sCdUsuarioResponsavel;
    }

    /**
     * Sets the value of the sCdUsuarioResponsavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUsuarioResponsavel(JAXBElement<String> value) {
        this.sCdUsuarioResponsavel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsItem() {
        return sDsItem;
    }

    /**
     * Sets the value of the sDsItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsItem(String value) {
        this.sDsItem = value;
    }

    /**
     * Gets the value of the sDsObservacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsObservacao() {
        return sDsObservacao;
    }

    /**
     * Sets the value of the sDsObservacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsObservacao(JAXBElement<String> value) {
        this.sDsObservacao = ((JAXBElement<String> ) value);
    }

}
