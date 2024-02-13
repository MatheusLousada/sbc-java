
package br.gov.sp.saobernardo.paradigma.ws.leilao;

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
 * <p>Java class for LeilaoLanceDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeilaoLanceDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlDesclassificado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dVlLance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nCdSituacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nIdVencedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nNrRanking" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDsMotivoDesclassificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "LeilaoLanceDTO", propOrder = {
    "bFlDesclassificado",
    "dVlLance",
    "nCdSituacao",
    "nIdVencedor",
    "nNrRanking",
    "sCdEmpresa",
    "sCdUsuario",
    "sDsMotivoDesclassificado",
    "tDtLance"
})
public class LeilaoLanceDTO
    extends DtoBase
{

    protected int bFlDesclassificado;
    @XmlElement(required = true)
    protected BigDecimal dVlLance;
    protected long nCdSituacao;
    protected int nIdVencedor;
    protected long nNrRanking;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sCdUsuario;
    @XmlElementRef(name = "sDsMotivoDesclassificado", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sDsMotivoDesclassificado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtLance;

    /**
     * Gets the value of the bFlDesclassificado property.
     * 
     */
    public int getBFlDesclassificado() {
        return bFlDesclassificado;
    }

    /**
     * Sets the value of the bFlDesclassificado property.
     * 
     */
    public void setBFlDesclassificado(int value) {
        this.bFlDesclassificado = value;
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
     * Gets the value of the nCdSituacao property.
     * 
     */
    public long getNCdSituacao() {
        return nCdSituacao;
    }

    /**
     * Sets the value of the nCdSituacao property.
     * 
     */
    public void setNCdSituacao(long value) {
        this.nCdSituacao = value;
    }

    /**
     * Gets the value of the nIdVencedor property.
     * 
     */
    public int getNIdVencedor() {
        return nIdVencedor;
    }

    /**
     * Sets the value of the nIdVencedor property.
     * 
     */
    public void setNIdVencedor(int value) {
        this.nIdVencedor = value;
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
     * Gets the value of the sCdUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdUsuario() {
        return sCdUsuario;
    }

    /**
     * Sets the value of the sCdUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdUsuario(String value) {
        this.sCdUsuario = value;
    }

    /**
     * Gets the value of the sDsMotivoDesclassificado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSDsMotivoDesclassificado() {
        return sDsMotivoDesclassificado;
    }

    /**
     * Sets the value of the sDsMotivoDesclassificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSDsMotivoDesclassificado(JAXBElement<String> value) {
        this.sDsMotivoDesclassificado = ((JAXBElement<String> ) value);
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
