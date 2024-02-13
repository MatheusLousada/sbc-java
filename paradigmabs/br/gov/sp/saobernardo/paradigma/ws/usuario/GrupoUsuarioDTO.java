
package br.gov.sp.saobernardo.paradigma.ws.usuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrupoUsuarioDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrupoUsuarioDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="nCdGrupo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrupoUsuarioDTO", propOrder = {
    "nCdGrupo"
})
public class GrupoUsuarioDTO
    extends DtoBase
{

    protected long nCdGrupo;

    /**
     * Gets the value of the nCdGrupo property.
     * 
     */
    public long getNCdGrupo() {
        return nCdGrupo;
    }

    /**
     * Sets the value of the nCdGrupo property.
     * 
     */
    public void setNCdGrupo(long value) {
        this.nCdGrupo = value;
    }

}
