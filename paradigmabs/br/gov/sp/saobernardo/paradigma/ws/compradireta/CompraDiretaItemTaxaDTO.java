
package br.gov.sp.saobernardo.paradigma.ws.compradireta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompraDiretaItemTaxaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompraDiretaItemTaxaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlIncluso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nCdTaxa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompraDiretaItemTaxaDTO", propOrder = {
    "bFlIncluso",
    "nCdTaxa"
})
public class CompraDiretaItemTaxaDTO
    extends DtoBase
{

    protected int bFlIncluso;
    protected long nCdTaxa;

    /**
     * Gets the value of the bFlIncluso property.
     * 
     */
    public int getBFlIncluso() {
        return bFlIncluso;
    }

    /**
     * Sets the value of the bFlIncluso property.
     * 
     */
    public void setBFlIncluso(int value) {
        this.bFlIncluso = value;
    }

    /**
     * Gets the value of the nCdTaxa property.
     * 
     */
    public long getNCdTaxa() {
        return nCdTaxa;
    }

    /**
     * Sets the value of the nCdTaxa property.
     * 
     */
    public void setNCdTaxa(long value) {
        this.nCdTaxa = value;
    }

}
