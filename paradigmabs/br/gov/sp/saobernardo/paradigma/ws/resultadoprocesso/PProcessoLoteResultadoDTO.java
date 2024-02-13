
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PProcessoLoteResultadoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PProcessoLoteResultadoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlBeneficiarioLei123" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlHabilitado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bFlVencedor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dVlResultado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nCdMoeda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nNrRanking" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nStLoteLance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sCdFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtResultado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PProcessoLoteResultadoDTO", propOrder = {
    "bFlBeneficiarioLei123",
    "bFlHabilitado",
    "bFlVencedor",
    "dVlResultado",
    "nCdMoeda",
    "nNrRanking",
    "nStLoteLance",
    "sCdFornecedor",
    "tDtResultado"
})
public class PProcessoLoteResultadoDTO
    extends DtoBase
{

    @XmlElementRef(name = "bFlBeneficiarioLei123", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlBeneficiarioLei123;
    @XmlElementRef(name = "bFlHabilitado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> bFlHabilitado;
    protected Integer bFlVencedor;
    protected BigDecimal dVlResultado;
    @XmlElementRef(name = "nCdMoeda", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Long> nCdMoeda;
    protected Integer nNrRanking;
    @XmlElementRef(name = "nStLoteLance", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<Integer> nStLoteLance;
    @XmlElementRef(name = "sCdFornecedor", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdFornecedor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtResultado;

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
     * Gets the value of the nCdMoeda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNCdMoeda() {
        return nCdMoeda;
    }

    /**
     * Sets the value of the nCdMoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNCdMoeda(JAXBElement<Long> value) {
        this.nCdMoeda = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the nNrRanking property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNNrRanking() {
        return nNrRanking;
    }

    /**
     * Sets the value of the nNrRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNNrRanking(Integer value) {
        this.nNrRanking = value;
    }

    /**
     * Gets the value of the nStLoteLance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNStLoteLance() {
        return nStLoteLance;
    }

    /**
     * Sets the value of the nStLoteLance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNStLoteLance(JAXBElement<Integer> value) {
        this.nStLoteLance = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sCdFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdFornecedor() {
        return sCdFornecedor;
    }

    /**
     * Sets the value of the sCdFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdFornecedor(JAXBElement<String> value) {
        this.sCdFornecedor = ((JAXBElement<String> ) value);
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
