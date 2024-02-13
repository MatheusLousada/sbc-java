
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropostaRequisicaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropostaRequisicaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlFrete" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lstPropostaEntrega" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfPropostaEntregaDTO" minOccurs="0"/>
 *         &lt;element name="nCdPropostaEndereco" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sCdRequisicaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCdTransportadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNmTransportadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropostaRequisicaoDTO", propOrder = {
    "dVlFrete",
    "lstPropostaEntrega",
    "nCdPropostaEndereco",
    "sCdRequisicaoEmpresa",
    "sCdTransportadora",
    "sNmTransportadora"
})
public class PropostaRequisicaoDTO
    extends DtoBase
{

    protected BigDecimal dVlFrete;
    @XmlElementRef(name = "lstPropostaEntrega", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPropostaEntregaDTO> lstPropostaEntrega;
    protected Long nCdPropostaEndereco;
    @XmlElementRef(name = "sCdRequisicaoEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdRequisicaoEmpresa;
    @XmlElementRef(name = "sCdTransportadora", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdTransportadora;
    @XmlElementRef(name = "sNmTransportadora", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNmTransportadora;

    /**
     * Gets the value of the dVlFrete property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlFrete() {
        return dVlFrete;
    }

    /**
     * Sets the value of the dVlFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlFrete(BigDecimal value) {
        this.dVlFrete = value;
    }

    /**
     * Gets the value of the lstPropostaEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPropostaEntregaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPropostaEntregaDTO> getLstPropostaEntrega() {
        return lstPropostaEntrega;
    }

    /**
     * Sets the value of the lstPropostaEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPropostaEntregaDTO }{@code >}
     *     
     */
    public void setLstPropostaEntrega(JAXBElement<ArrayOfPropostaEntregaDTO> value) {
        this.lstPropostaEntrega = ((JAXBElement<ArrayOfPropostaEntregaDTO> ) value);
    }

    /**
     * Gets the value of the nCdPropostaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdPropostaEndereco() {
        return nCdPropostaEndereco;
    }

    /**
     * Sets the value of the nCdPropostaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdPropostaEndereco(Long value) {
        this.nCdPropostaEndereco = value;
    }

    /**
     * Gets the value of the sCdRequisicaoEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdRequisicaoEmpresa() {
        return sCdRequisicaoEmpresa;
    }

    /**
     * Sets the value of the sCdRequisicaoEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdRequisicaoEmpresa(JAXBElement<String> value) {
        this.sCdRequisicaoEmpresa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sCdTransportadora property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdTransportadora() {
        return sCdTransportadora;
    }

    /**
     * Sets the value of the sCdTransportadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdTransportadora(JAXBElement<String> value) {
        this.sCdTransportadora = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sNmTransportadora property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSNmTransportadora() {
        return sNmTransportadora;
    }

    /**
     * Sets the value of the sNmTransportadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSNmTransportadora(JAXBElement<String> value) {
        this.sNmTransportadora = ((JAXBElement<String> ) value);
    }

}
