
package br.gov.sp.saobernardo.paradigma.ws.resultadoprocesso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PProcessoLiberacaoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PProcessoLiberacaoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdItemRequisicaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdRequisicaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PProcessoLiberacaoDTO", propOrder = {
    "sCdItemRequisicaoEmpresa",
    "sCdRequisicaoEmpresa"
})
public class PProcessoLiberacaoDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdItemRequisicaoEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sCdRequisicaoEmpresa;

    /**
     * Gets the value of the sCdItemRequisicaoEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdItemRequisicaoEmpresa() {
        return sCdItemRequisicaoEmpresa;
    }

    /**
     * Sets the value of the sCdItemRequisicaoEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdItemRequisicaoEmpresa(String value) {
        this.sCdItemRequisicaoEmpresa = value;
    }

    /**
     * Gets the value of the sCdRequisicaoEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdRequisicaoEmpresa() {
        return sCdRequisicaoEmpresa;
    }

    /**
     * Sets the value of the sCdRequisicaoEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdRequisicaoEmpresa(String value) {
        this.sCdRequisicaoEmpresa = value;
    }

}
