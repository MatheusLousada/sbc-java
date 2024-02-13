
package br.gov.sp.saobernardo.paradigma.ws.empresacondicaopagamento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmpresaCondicaoPagamentoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmpresaCondicaoPagamentoDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="sCdCondicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "EmpresaCondicaoPagamentoDTO", propOrder = {
    "sCdCondicaoPagamento",
    "sCdEmpresa"
})
public class EmpresaCondicaoPagamentoDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected String sCdCondicaoPagamento;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;

    /**
     * Gets the value of the sCdCondicaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCondicaoPagamento() {
        return sCdCondicaoPagamento;
    }

    /**
     * Sets the value of the sCdCondicaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCondicaoPagamento(String value) {
        this.sCdCondicaoPagamento = value;
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
