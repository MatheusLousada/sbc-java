
package br.gov.sp.saobernardo.paradigma.ws.ordemcompra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrdemCompraTipoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdemCompraTipoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlVisivel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nCdTipoOrdemCompra" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sDsTipoOrdemCompra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdemCompraTipoDTO", propOrder = {
    "bFlVisivel",
    "nCdTipoOrdemCompra",
    "sDsTipoOrdemCompra"
})
public class OrdemCompraTipoDTO
    extends DtoBase
{

    protected Integer bFlVisivel;
    protected long nCdTipoOrdemCompra;
    @XmlElement(required = true, nillable = true)
    protected String sDsTipoOrdemCompra;

    /**
     * Gets the value of the bFlVisivel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFlVisivel() {
        return bFlVisivel;
    }

    /**
     * Sets the value of the bFlVisivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFlVisivel(Integer value) {
        this.bFlVisivel = value;
    }

    /**
     * Gets the value of the nCdTipoOrdemCompra property.
     * 
     */
    public long getNCdTipoOrdemCompra() {
        return nCdTipoOrdemCompra;
    }

    /**
     * Sets the value of the nCdTipoOrdemCompra property.
     * 
     */
    public void setNCdTipoOrdemCompra(long value) {
        this.nCdTipoOrdemCompra = value;
    }

    /**
     * Gets the value of the sDsTipoOrdemCompra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDsTipoOrdemCompra() {
        return sDsTipoOrdemCompra;
    }

    /**
     * Sets the value of the sDsTipoOrdemCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDsTipoOrdemCompra(String value) {
        this.sDsTipoOrdemCompra = value;
    }

}
