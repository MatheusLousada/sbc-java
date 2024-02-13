
package br.gov.sp.saobernardo.paradigma.ws.compradireta;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CompraDiretaItemLanceDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompraDiretaItemLanceDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlVencedor" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dVlLance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nNrRanking" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtLance" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompraDiretaItemLanceDTO", propOrder = {
    "bFlVencedor",
    "dVlLance",
    "nNrRanking",
    "sCdEmpresa",
    "tDtLance"
})
public class CompraDiretaItemLanceDTO
    extends DtoBase
{

    protected Long bFlVencedor;
    protected BigDecimal dVlLance;
    protected Long nNrRanking;
    @XmlElementRef(name = "sCdEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdEmpresa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtLance;

    /**
     * Gets the value of the bFlVencedor property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBFlVencedor() {
        return bFlVencedor;
    }

    /**
     * Sets the value of the bFlVencedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBFlVencedor(Long value) {
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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNNrRanking() {
        return nNrRanking;
    }

    /**
     * Sets the value of the nNrRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNNrRanking(Long value) {
        this.nNrRanking = value;
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
