
package br.gov.sp.saobernardo.paradigma.ws.pregaoeletronico;

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
 * <p>Java class for PregaoEletronicoItemLanceDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PregaoEletronicoItemLanceDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlBeneficiarioLei123" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bFlVencedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dVlLance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nNrRanking" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsMarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsModelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtLance" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PregaoEletronicoItemLanceDTO", propOrder = {
    "bFlBeneficiarioLei123",
    "bFlVencedor",
    "dVlLance",
    "nNrRanking",
    "sCdEmpresa",
    "sDsMarca",
    "sDsModelo",
    "tDtLance"
})
public class PregaoEletronicoItemLanceDTO
    extends DtoBase
{

    protected int bFlBeneficiarioLei123;
    protected int bFlVencedor;
    @XmlElement(required = true)
    protected BigDecimal dVlLance;
    protected int nNrRanking;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElementRef(name = "sDsMarca", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsMarca;
    @XmlElementRef(name = "sDsModelo", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsModelo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtLance;

    /**
     * Gets the value of the bFlBeneficiarioLei123 property.
     * 
     */
    public int getBFlBeneficiarioLei123() {
        return bFlBeneficiarioLei123;
    }

    /**
     * Sets the value of the bFlBeneficiarioLei123 property.
     * 
     */
    public void setBFlBeneficiarioLei123(int value) {
        this.bFlBeneficiarioLei123 = value;
    }

    /**
     * Gets the value of the bFlVencedor property.
     * 
     */
    public int getBFlVencedor() {
        return bFlVencedor;
    }

    /**
     * Sets the value of the bFlVencedor property.
     * 
     */
    public void setBFlVencedor(int value) {
        this.bFlVencedor = value;
    }

    /**
     * Gets the value of the dVlLance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlLance() {
        return dVlLance;
    }

    /**
     * Sets the value of the dVlLance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlLance(BigDecimal value) {
        this.dVlLance = value;
    }

    /**
     * Gets the value of the nNrRanking property.
     * 
     */
    public int getNNrRanking() {
        return nNrRanking;
    }

    /**
     * Sets the value of the nNrRanking property.
     * 
     */
    public void setNNrRanking(int value) {
        this.nNrRanking = value;
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
     * Gets the value of the tDtLance property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtLance() {
        return tDtLance;
    }

    /**
     * Sets the value of the tDtLance property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtLance(XMLGregorianCalendar value) {
        this.tDtLance = value;
    }

}
