
package br.gov.sp.saobernardo.paradigma.ws.leilao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeilaoItemParticipanteDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeilaoItemParticipanteDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="bFlHomologado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdItem" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeilaoItemParticipanteDTO", propOrder = {
    "bFlHomologado",
    "sCdEmpresa",
    "sCdItem"
})
public class LeilaoItemParticipanteDTO
    extends DtoBase
{

    protected int bFlHomologado;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    protected long sCdItem;

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
     * Gets the value of the sCdItem property.
     * 
     */
    public long getSCdItem() {
        return sCdItem;
    }

    /**
     * Sets the value of the sCdItem property.
     * 
     */
    public void setSCdItem(long value) {
        this.sCdItem = value;
    }

}
