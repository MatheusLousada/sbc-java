
package br.gov.sp.saobernardo.paradigma.ws.almoxarifado;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmxKardexDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmxKardexDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Paradigma.Framework.Servico.Core}DtoBase">
 *       &lt;sequence>
 *         &lt;element name="dVlMedio" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nCdKardex" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nNrAno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nNrMes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCdCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdClasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdContaContabil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCdProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmxKardexDTO", propOrder = {
    "dVlMedio",
    "nCdKardex",
    "nNrAno",
    "nNrMes",
    "sCdCentroCusto",
    "sCdClasse",
    "sCdContaContabil",
    "sCdEmpresa",
    "sCdProduto"
})
public class AmxKardexDTO
    extends DtoBase
{

    @XmlElement(required = true, nillable = true)
    protected BigDecimal dVlMedio;
    protected long nCdKardex;
    protected int nNrAno;
    protected int nNrMes;
    @XmlElement(required = true, nillable = true)
    protected String sCdCentroCusto;
    @XmlElement(required = true, nillable = true)
    protected String sCdClasse;
    @XmlElement(required = true, nillable = true)
    protected String sCdContaContabil;
    @XmlElement(required = true, nillable = true)
    protected String sCdEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String sCdProduto;

    /**
     * Gets the value of the dVlMedio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVlMedio() {
        return dVlMedio;
    }

    /**
     * Sets the value of the dVlMedio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVlMedio(BigDecimal value) {
        this.dVlMedio = value;
    }

    /**
     * Gets the value of the nCdKardex property.
     * 
     */
    public long getNCdKardex() {
        return nCdKardex;
    }

    /**
     * Sets the value of the nCdKardex property.
     * 
     */
    public void setNCdKardex(long value) {
        this.nCdKardex = value;
    }

    /**
     * Gets the value of the nNrAno property.
     * 
     */
    public int getNNrAno() {
        return nNrAno;
    }

    /**
     * Sets the value of the nNrAno property.
     * 
     */
    public void setNNrAno(int value) {
        this.nNrAno = value;
    }

    /**
     * Gets the value of the nNrMes property.
     * 
     */
    public int getNNrMes() {
        return nNrMes;
    }

    /**
     * Sets the value of the nNrMes property.
     * 
     */
    public void setNNrMes(int value) {
        this.nNrMes = value;
    }

    /**
     * Gets the value of the sCdCentroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdCentroCusto() {
        return sCdCentroCusto;
    }

    /**
     * Sets the value of the sCdCentroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdCentroCusto(String value) {
        this.sCdCentroCusto = value;
    }

    /**
     * Gets the value of the sCdClasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdClasse() {
        return sCdClasse;
    }

    /**
     * Sets the value of the sCdClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdClasse(String value) {
        this.sCdClasse = value;
    }

    /**
     * Gets the value of the sCdContaContabil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdContaContabil() {
        return sCdContaContabil;
    }

    /**
     * Sets the value of the sCdContaContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdContaContabil(String value) {
        this.sCdContaContabil = value;
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
     * Gets the value of the sCdProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCdProduto() {
        return sCdProduto;
    }

    /**
     * Sets the value of the sCdProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCdProduto(String value) {
        this.sCdProduto = value;
    }

}
