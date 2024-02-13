
package br.gov.sp.saobernardo.paradigma.ws.condicaopagamento;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CondicaoItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CondicaoItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dPcParcela" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nNrDias" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CondicaoItemDTO", propOrder = {
    "dPcParcela",
    "nNrDias"
})
public class CondicaoItemDTO
    extends DtoBase
{

    protected BigDecimal dPcParcela;
    protected Long nNrDias;

    /**
     * Gets the value of the dPcParcela property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDPcParcela() {
        return dPcParcela;
    }

    /**
     * Sets the value of the dPcParcela property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDPcParcela(BigDecimal value) {
        this.dPcParcela = value;
    }

    /**
     * Gets the value of the nNrDias property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNNrDias() {
        return nNrDias;
    }

    /**
     * Sets the value of the nNrDias property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNNrDias(Long value) {
        this.nNrDias = value;
    }

}
