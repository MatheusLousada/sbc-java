
package br.gov.sp.saobernardo.paradigma.ws.ordemcompra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetornoLista_x003C_OrdemCompraConsumoDTO_x003E_ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetornoLista_x003C_OrdemCompraConsumoDTO_x003E_">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="lstObjetoRetorno" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}ArrayOfOrdemCompraConsumoDTO"/>
 *         &lt;element name="nQtRegistrosRetorno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nQtRegistrosTotal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oRetornoDTO" type="{http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO}RetornoDTO"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetornoLista_x003C_OrdemCompraConsumoDTO_x003E_", propOrder = {
    "lstObjetoRetorno",
    "nQtRegistrosRetorno",
    "nQtRegistrosTotal",
    "oRetornoDTO"
})
public class RetornoListaX003COrdemCompraConsumoDTOX003E
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfOrdemCompraConsumoDTO lstObjetoRetorno;
    protected int nQtRegistrosRetorno;
    protected int nQtRegistrosTotal;
    @XmlElement(required = true, nillable = true)
    protected RetornoDTO oRetornoDTO;

    /**
     * Gets the value of the lstObjetoRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrdemCompraConsumoDTO }
     *     
     */
    public ArrayOfOrdemCompraConsumoDTO getLstObjetoRetorno() {
        return lstObjetoRetorno;
    }

    /**
     * Sets the value of the lstObjetoRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrdemCompraConsumoDTO }
     *     
     */
    public void setLstObjetoRetorno(ArrayOfOrdemCompraConsumoDTO value) {
        this.lstObjetoRetorno = value;
    }

    /**
     * Gets the value of the nQtRegistrosRetorno property.
     * 
     */
    public int getNQtRegistrosRetorno() {
        return nQtRegistrosRetorno;
    }

    /**
     * Sets the value of the nQtRegistrosRetorno property.
     * 
     */
    public void setNQtRegistrosRetorno(int value) {
        this.nQtRegistrosRetorno = value;
    }

    /**
     * Gets the value of the nQtRegistrosTotal property.
     * 
     */
    public int getNQtRegistrosTotal() {
        return nQtRegistrosTotal;
    }

    /**
     * Sets the value of the nQtRegistrosTotal property.
     * 
     */
    public void setNQtRegistrosTotal(int value) {
        this.nQtRegistrosTotal = value;
    }

    /**
     * Gets the value of the oRetornoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link RetornoDTO }
     *     
     */
    public RetornoDTO getORetornoDTO() {
        return oRetornoDTO;
    }

    /**
     * Sets the value of the oRetornoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoDTO }
     *     
     */
    public void setORetornoDTO(RetornoDTO value) {
        this.oRetornoDTO = value;
    }

}
