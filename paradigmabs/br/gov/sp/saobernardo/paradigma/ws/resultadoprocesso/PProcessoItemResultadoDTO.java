
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

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
 * <p>Java class for PProcessoItemResultadoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PProcessoItemResultadoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlBeneficiarioLei123" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bFlHabilitado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlVencedor" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dVlResultado" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nCdMarca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nCdMoeda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nNrRanking" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nStLance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdFornecedor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsMarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsModelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtResultado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PProcessoItemResultadoDTO", propOrder = {
    "bFlBeneficiarioLei123",
    "bFlHabilitado",
    "bFlVencedor",
    "dVlResultado",
    "nCdMarca",
    "nCdMoeda",
    "nNrRanking",
    "nStLance",
    "sCdFornecedor",
    "sDsMarca",
    "sDsModelo",
    "tDtResultado"
})
public class PProcessoItemResultadoDTO
    extends DtoBase
{

    protected Long bFlBeneficiarioLei123;
    @XmlElementRef(name = "bFlHabilitado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlHabilitado;
    protected long bFlVencedor;
    @XmlElement(required = true)
    protected BigDecimal dVlResultado;
    @XmlElementRef(name = "nCdMarca", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdMarca;
    protected Long nCdMoeda;
    protected long nNrRanking;
    @XmlElementRef(name = "nStLance", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nStLance;
    @XmlElement(required = true, nillable = true)
    protected String sCdFornecedor;
    @XmlElementRef(name = "sDsMarca", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsMarca;
    @XmlElementRef(name = "sDsModelo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsModelo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtResultado;

    /**
     * Gets the value of the bFlBeneficiarioLei123 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBFlBeneficiarioLei123() {
        return bFlBeneficiarioLei123;
    }

    /**
     * Sets the value of the bFlBeneficiarioLei123 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBFlBeneficiarioLei123(Long value) {
        this.bFlBeneficiarioLei123 = value;
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
     * Gets the value of the bFlVencedor property.
     * 
     */
    public long getBFlVencedor() {
        return bFlVencedor;
    }

    /**
     * Sets the value of the bFlVencedor property.
     * 
     */
    public void setBFlVencedor(long value) {
        this.bFlVencedor = value;
    }

    /**
     * Gets the value of the dVlResultado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlResultado() {
        return dVlResultado;
    }

    /**
     * Sets the value of the dVlResultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlResultado(BigDecimal value) {
        this.dVlResultado = value;
    }

    /**
     * Gets the value of the nCdMarca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdMarca() {
        return nCdMarca;
    }

    /**
     * Sets the value of the nCdMarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdMarca(JAXBElement<Long> value) {
        this.nCdMarca = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the nCdMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNCdMoeda() {
        return nCdMoeda;
    }

    /**
     * Sets the value of the nCdMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNCdMoeda(Long value) {
        this.nCdMoeda = value;
    }

    /**
     * Gets the value of the nNrRanking property.
     * 
     */
    public long getNNrRanking() {
        return nNrRanking;
    }

    /**
     * Sets the value of the nNrRanking property.
     * 
     */
    public void setNNrRanking(long value) {
        this.nNrRanking = value;
    }

    /**
     * Gets the value of the nStLance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNStLance() {
        return nStLance;
    }

    /**
     * Sets the value of the nStLance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNStLance(JAXBElement<Integer> value) {
        this.nStLance = ((JAXBElement<Integer> ) value);
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
     * Gets the value of the sDsMarca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsMarca() {
        return sDsMarca;
    }

    /**
     * Sets the value of the sDsMarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsMarca(JAXBElement<String> value) {
        this.sDsMarca = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sDsModelo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsModelo() {
        return sDsModelo;
    }

    /**
     * Sets the value of the sDsModelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsModelo(JAXBElement<String> value) {
        this.sDsModelo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtResultado property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtResultado() {
        return tDtResultado;
    }

    /**
     * Sets the value of the tDtResultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtResultado(XMLGregorianCalendar value) {
        this.tDtResultado = value;
    }

}
