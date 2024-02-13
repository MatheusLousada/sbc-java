
package br.gov.sp.saobernardo.paradigma.ws.cotacao;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PropostaEntregaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropostaEntregaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dQtFornecimento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sCdItemRequisicaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tDtFornecimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropostaEntregaDTO", propOrder = {
    "dQtFornecimento",
    "sCdItemRequisicaoEmpresa",
    "tDtFornecimento"
})
public class PropostaEntregaDTO
    extends DtoBase
{

    protected BigDecimal dQtFornecimento;
    @XmlElementRef(name = "sCdItemRequisicaoEmpresa", namespace = "http://schemas.datacontract.org/2004/07/Paradigma.Wbc.Servico.DTO", type = JAXBElement.class)
    protected JAXBElement<String> sCdItemRequisicaoEmpresa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tDtFornecimento;

    /**
     * Gets the value of the dQtFornecimento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDQtFornecimento() {
        return dQtFornecimento;
    }

    /**
     * Sets the value of the dQtFornecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDQtFornecimento(BigDecimal value) {
        this.dQtFornecimento = value;
    }

    /**
     * Gets the value of the sCdItemRequisicaoEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCdItemRequisicaoEmpresa() {
        return sCdItemRequisicaoEmpresa;
    }

    /**
     * Sets the value of the sCdItemRequisicaoEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCdItemRequisicaoEmpresa(JAXBElement<String> value) {
        this.sCdItemRequisicaoEmpresa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tDtFornecimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDtFornecimento() {
        return tDtFornecimento;
    }

    /**
     * Sets the value of the tDtFornecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDtFornecimento(XMLGregorianCalendar value) {
        this.tDtFornecimento = value;
    }

}
