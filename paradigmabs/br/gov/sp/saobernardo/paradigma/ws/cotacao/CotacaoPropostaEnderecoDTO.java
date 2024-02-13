
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CotacaoPropostaEnderecoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CotacaoPropostaEnderecoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtFornecimento" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dQtPorUnidade" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dQtUnidade" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dVlFrete" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nCdPropostaEndereco" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nSqItemEndereco" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdTransportadora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUnidadeFornecimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNmTransportadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtFornecimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CotacaoPropostaEnderecoDTO", propOrder = {
    "dQtFornecimento",
    "dQtPorUnidade",
    "dQtUnidade",
    "dVlFrete",
    "nCdPropostaEndereco",
    "nSqItemEndereco",
    "sCdTransportadora",
    "sCdUnidadeFornecimento",
    "sNmTransportadora",
    "tDtFornecimento"
})
public class CotacaoPropostaEnderecoDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dQtFornecimento;
    @XmlElementRef(name = "dQtPorUnidade", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dQtPorUnidade;
    @XmlElementRef(name = "dQtUnidade", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> dQtUnidade;
    protected BigDecimal dVlFrete;
    protected Long nCdPropostaEndereco;
    protected int nSqItemEndereco;
    @XmlElement(required = true, nillable = true)
    protected String sCdTransportadora;
    @XmlElementRef(name = "sCdUnidadeFornecimento", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdUnidadeFornecimento;
    @XmlElementRef(name = "sNmTransportadora", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sNmTransportadora;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFornecimento;

    /**
     * Gets the value of the dQtFornecimento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtFornecimento() {
        return dQtFornecimento;
    }

    /**
     * Sets the value of the dQtFornecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtFornecimento(BigDecimal value) {
        this.dQtFornecimento = value;
    }

    /**
     * Gets the value of the dQtPorUnidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDQtPorUnidade() {
        return dQtPorUnidade;
    }

    /**
     * Sets the value of the dQtPorUnidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDQtPorUnidade(JAXBElement<BigDecimal> value) {
        this.dQtPorUnidade = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the dQtUnidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDQtUnidade() {
        return dQtUnidade;
    }

    /**
     * Sets the value of the dQtUnidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDQtUnidade(JAXBElement<BigDecimal> value) {
        this.dQtUnidade = ((JAXBElement<BigDecimal> ) value);
    }

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
     * Gets the value of the nSqItemEndereco property.
     * 
     */
    public int getNSqItemEndereco() {
        return nSqItemEndereco;
    }

    /**
     * Sets the value of the nSqItemEndereco property.
     * 
     */
    public void setNSqItemEndereco(int value) {
        this.nSqItemEndereco = value;
    }

    /**
     * Gets the value of the sCdTransportadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdTransportadora() {
        return sCdTransportadora;
    }

    /**
     * Sets the value of the sCdTransportadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdTransportadora(String value) {
        this.sCdTransportadora = value;
    }

    /**
     * Gets the value of the sCdUnidadeFornecimento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdUnidadeFornecimento() {
        return sCdUnidadeFornecimento;
    }

    /**
     * Sets the value of the sCdUnidadeFornecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdUnidadeFornecimento(JAXBElement<String> value) {
        this.sCdUnidadeFornecimento = ((JAXBElement<String> ) value);
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

    /**
     * Gets the value of the tDtFornecimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtFornecimento() {
        return tDtFornecimento;
    }

    /**
     * Sets the value of the tDtFornecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtFornecimento(XMLGregorianCalendar value) {
        this.tDtFornecimento = value;
    }

}
