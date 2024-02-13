
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmxKardexFiltroDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmxKardexFiltroDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdTipoMap" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmxKardexFiltroDTO", propOrder = {
    "nCdTipoMap"
})
public class AmxKardexFiltroDTO
    extends DtoBase
{

    protected int nCdTipoMap;

    /**
     * Gets the value of the nCdTipoMap property.
     * 
     */
    public int getNCdTipoMap() {
        return nCdTipoMap;
    }

    /**
     * Sets the value of the nCdTipoMap property.
     * 
     */
    public void setNCdTipoMap(int value) {
        this.nCdTipoMap = value;
    }

}
