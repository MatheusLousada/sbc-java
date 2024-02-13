
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CotacaoItemParticipanteDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CotacaoItemParticipanteDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlHomologado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nCdItem" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CotacaoItemParticipanteDTO", propOrder = {
    "bFlHomologado",
    "nCdItem",
    "sCdEmpresa"
})
public class CotacaoItemParticipanteDTO
    extends DtoBase
{

    protected int bFlHomologado;
    protected long nCdItem;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;

    /**
     * Gets the value of the bFlHomologado property.
     * 
     */
    public int getBFlHomologado() {
        return bFlHomologado;
    }

    /**
     * Sets the value of the bFlHomologado property.
     * 
     */
    public void setBFlHomologado(int value) {
        this.bFlHomologado = value;
    }

    /**
     * Gets the value of the nCdItem property.
     * 
     */
    public long getNCdItem() {
        return nCdItem;
    }

    /**
     * Sets the value of the nCdItem property.
     * 
     */
    public void setNCdItem(long value) {
        this.nCdItem = value;
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

}
