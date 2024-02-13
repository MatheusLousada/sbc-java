
package br.gov.sp.saobernardo.paradigma.ws.notafiscaltituloresumida;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotaFiscalItemRateioTituloResumidaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotaFiscalItemRateioTituloResumidaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dPcRateio" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sCdCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaFiscalItemRateioTituloResumidaDTO", propOrder = {
    "dPcRateio",
    "sCdCentroCusto"
})
public class NotaFiscalItemRateioTituloResumidaDTO
    extends DtoBase
{

    @XmlElement(required = true)
    protected BigDecimal dPcRateio;
    @XmlElement(required = true, nillable = true)
    protected String sCdCentroCusto;

    /**
     * Gets the value of the dPcRateio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDPcRateio() {
        return dPcRateio;
    }

    /**
     * Sets the value of the dPcRateio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDPcRateio(BigDecimal value) {
        this.dPcRateio = value;
    }

    /**
     * Gets the value of the sCdCentroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCentroCusto() {
        return sCdCentroCusto;
    }

    /**
     * Sets the value of the sCdCentroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCentroCusto(String value) {
        this.sCdCentroCusto = value;
    }

}
