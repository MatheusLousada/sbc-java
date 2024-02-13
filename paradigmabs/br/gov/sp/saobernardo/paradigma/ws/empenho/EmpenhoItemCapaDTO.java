
package br.gov.sp.saobernardo.paradigma.ws.empenho;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmpenhoItemCapaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpenhoItemCapaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}PedidoItemDTO">
 *       &lt;sequence>
 *         &lt;element name="dVlTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="oEmpenhoItemDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}EmpenhoItemDTO"/>
 *         &lt;element name="sCdComprador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdPedidoERP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sNrItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpenhoItemCapaDTO", propOrder = {
    "dVlTotal",
    "oEmpenhoItemDTO",
    "sCdComprador",
    "sCdPedidoERP",
    "sNrItem"
})
public class EmpenhoItemCapaDTO
    extends PedidoItemDTO
{

    @XmlElement(required = true)
    protected BigDecimal dVlTotal;
    @XmlElement(required = true, nillable = true)
    protected EmpenhoItemDTO oEmpenhoItemDTO;
    @XmlElement(required = true, nillable = true)
    protected String sCdComprador;
    @XmlElement(required = true, nillable = true)
    protected String sCdPedidoERP;
    @XmlElement(required = true, nillable = true)
    protected String sNrItem;

    /**
     * Gets the value of the dVlTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlTotal() {
        return dVlTotal;
    }

    /**
     * Sets the value of the dVlTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlTotal(BigDecimal value) {
        this.dVlTotal = value;
    }

    /**
     * Gets the value of the oEmpenhoItemDTO property.
     * 
     * @return
     *     possible object is
     *     {@link EmpenhoItemDTO }
     *     
     */
    public EmpenhoItemDTO getOEmpenhoItemDTO() {
        return oEmpenhoItemDTO;
    }

    /**
     * Sets the value of the oEmpenhoItemDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmpenhoItemDTO }
     *     
     */
    public void setOEmpenhoItemDTO(EmpenhoItemDTO value) {
        this.oEmpenhoItemDTO = value;
    }

    /**
     * Gets the value of the sCdComprador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdComprador() {
        return sCdComprador;
    }

    /**
     * Sets the value of the sCdComprador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdComprador(String value) {
        this.sCdComprador = value;
    }

    /**
     * Gets the value of the sCdPedidoERP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdPedidoERP() {
        return sCdPedidoERP;
    }

    /**
     * Sets the value of the sCdPedidoERP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdPedidoERP(String value) {
        this.sCdPedidoERP = value;
    }

    /**
     * Gets the value of the sNrItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNrItem() {
        return sNrItem;
    }

    /**
     * Sets the value of the sNrItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNrItem(String value) {
        this.sNrItem = value;
    }

}
