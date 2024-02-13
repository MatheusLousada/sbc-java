
package br.gov.sp.saobernardo.paradigma.ws.ordemcompra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrdemCompraConsumoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdemCompraConsumoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}OrdemCompraDTO">
 *       &lt;sequence>
 *         &lt;element name="nCdEmpresaTipo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nCdRegistroPreco" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sCdProcessoConsumo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdemCompraConsumoDTO", propOrder = {
    "nCdEmpresaTipo",
    "nCdRegistroPreco",
    "sCdProcessoConsumo"
})
public class OrdemCompraConsumoDTO
    extends OrdemCompraDTO
{

    protected long nCdEmpresaTipo;
    protected long nCdRegistroPreco;
    @XmlElement(required = true, nillable = true)
    protected String sCdProcessoConsumo;

    /**
     * Gets the value of the nCdEmpresaTipo property.
     * 
     */
    public long getNCdEmpresaTipo() {
        return nCdEmpresaTipo;
    }

    /**
     * Sets the value of the nCdEmpresaTipo property.
     * 
     */
    public void setNCdEmpresaTipo(long value) {
        this.nCdEmpresaTipo = value;
    }

    /**
     * Gets the value of the nCdRegistroPreco property.
     * 
     */
    public long getNCdRegistroPreco() {
        return nCdRegistroPreco;
    }

    /**
     * Sets the value of the nCdRegistroPreco property.
     * 
     */
    public void setNCdRegistroPreco(long value) {
        this.nCdRegistroPreco = value;
    }

    /**
     * Gets the value of the sCdProcessoConsumo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdProcessoConsumo() {
        return sCdProcessoConsumo;
    }

    /**
     * Sets the value of the sCdProcessoConsumo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdProcessoConsumo(String value) {
        this.sCdProcessoConsumo = value;
    }

}
