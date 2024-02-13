
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PProcessoConvidadoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PProcessoConvidadoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlBeneficiarioLei123" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlHabilitado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlParticipa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlVencedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nStParticipacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sCdFornecedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsJustificativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PProcessoConvidadoDTO", propOrder = {
    "bFlBeneficiarioLei123",
    "bFlHabilitado",
    "bFlParticipa",
    "bFlVencedor",
    "nStParticipacao",
    "sCdFornecedor",
    "sDsJustificativa"
})
public class PProcessoConvidadoDTO
    extends DtoBase
{

    @XmlElementRef(name = "bFlBeneficiarioLei123", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlBeneficiarioLei123;
    @XmlElementRef(name = "bFlHabilitado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlHabilitado;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer bFlParticipa;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer bFlVencedor;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long nStParticipacao;
    @XmlElement(required = true, nillable = true)
    protected String sCdFornecedor;
    @XmlElementRef(name = "sDsJustificativa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsJustificativa;

    /**
     * Gets the value of the bFlBeneficiarioLei123 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlBeneficiarioLei123() {
        return bFlBeneficiarioLei123;
    }

    /**
     * Sets the value of the bFlBeneficiarioLei123 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlBeneficiarioLei123(JAXBElement<Integer> value) {
        this.bFlBeneficiarioLei123 = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bFlHabilitado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBFlHabilitado() {
        return bFlHabilitado;
    }

    /**
     * Sets the value of the bFlHabilitado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBFlHabilitado(JAXBElement<Integer> value) {
        this.bFlHabilitado = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the bFlParticipa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlParticipa() {
        return bFlParticipa;
    }

    /**
     * Sets the value of the bFlParticipa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlParticipa(Integer value) {
        this.bFlParticipa = value;
    }

    /**
     * Gets the value of the bFlVencedor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlVencedor() {
        return bFlVencedor;
    }

    /**
     * Sets the value of the bFlVencedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlVencedor(Integer value) {
        this.bFlVencedor = value;
    }

    /**
     * Gets the value of the nStParticipacao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNStParticipacao() {
        return nStParticipacao;
    }

    /**
     * Sets the value of the nStParticipacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNStParticipacao(Long value) {
        this.nStParticipacao = value;
    }

    /**
     * Gets the value of the sCdFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdFornecedor() {
        return sCdFornecedor;
    }

    /**
     * Sets the value of the sCdFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdFornecedor(String value) {
        this.sCdFornecedor = value;
    }

    /**
     * Gets the value of the sDsJustificativa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsJustificativa() {
        return sDsJustificativa;
    }

    /**
     * Sets the value of the sDsJustificativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsJustificativa(JAXBElement<String> value) {
        this.sDsJustificativa = ((JAXBElement<String> ) value);
    }

}
