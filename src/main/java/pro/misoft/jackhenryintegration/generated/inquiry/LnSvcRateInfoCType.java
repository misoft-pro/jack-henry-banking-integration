
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for LnSvcRateInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnSvcRateInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcInvRate" type="{http://jackhenry.com/jxchange/TPG/2008}SvcInvRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeRate" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeRateVarType" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeRateVarType_Type" minOccurs="0"/&gt;
 *         &lt;element name="YieldDiffRate" type="{http://jackhenry.com/jxchange/TPG/2008}YieldDiffRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuarContrRate" type="{http://jackhenry.com/jxchange/TPG/2008}GuarContrRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="PoolBuyRate" type="{http://jackhenry.com/jxchange/TPG/2008}PoolBuyRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="PoolBuyRateVarType" type="{http://jackhenry.com/jxchange/TPG/2008}PoolBuyRateVarType_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuarAltRate" type="{http://jackhenry.com/jxchange/TPG/2008}GuarAltRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuarBuyRate" type="{http://jackhenry.com/jxchange/TPG/2008}GuarBuyRate_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LnSvcRateInfo_CType", propOrder = {
    "svcInvRate",
    "svcFeeRate",
    "svcFeeRateVarType",
    "yieldDiffRate",
    "guarContrRate",
    "poolBuyRate",
    "poolBuyRateVarType",
    "guarAltRate",
    "guarBuyRate",
    "ver1",
    "any"
})
public class LnSvcRateInfoCType {

    @XmlElement(name = "SvcInvRate")
    protected SvcInvRateType svcInvRate;
    @XmlElement(name = "SvcFeeRate")
    protected SvcFeeRateType svcFeeRate;
    @XmlElement(name = "SvcFeeRateVarType")
    protected SvcFeeRateVarTypeType svcFeeRateVarType;
    @XmlElement(name = "YieldDiffRate")
    protected YieldDiffRateType yieldDiffRate;
    @XmlElement(name = "GuarContrRate")
    protected GuarContrRateType guarContrRate;
    @XmlElement(name = "PoolBuyRate")
    protected PoolBuyRateType poolBuyRate;
    @XmlElement(name = "PoolBuyRateVarType")
    protected PoolBuyRateVarTypeType poolBuyRateVarType;
    @XmlElement(name = "GuarAltRate")
    protected GuarAltRateType guarAltRate;
    @XmlElement(name = "GuarBuyRate")
    protected GuarBuyRateType guarBuyRate;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the svcInvRate property.
     * 
     * @return
     *     possible object is
     *     {@link SvcInvRateType }
     *     
     */
    public SvcInvRateType getSvcInvRate() {
        return svcInvRate;
    }

    /**
     * Sets the value of the svcInvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcInvRateType }
     *     
     */
    public void setSvcInvRate(SvcInvRateType value) {
        this.svcInvRate = value;
    }

    /**
     * Gets the value of the svcFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeRateType }
     *     
     */
    public SvcFeeRateType getSvcFeeRate() {
        return svcFeeRate;
    }

    /**
     * Sets the value of the svcFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeRateType }
     *     
     */
    public void setSvcFeeRate(SvcFeeRateType value) {
        this.svcFeeRate = value;
    }

    /**
     * Gets the value of the svcFeeRateVarType property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeRateVarTypeType }
     *     
     */
    public SvcFeeRateVarTypeType getSvcFeeRateVarType() {
        return svcFeeRateVarType;
    }

    /**
     * Sets the value of the svcFeeRateVarType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeRateVarTypeType }
     *     
     */
    public void setSvcFeeRateVarType(SvcFeeRateVarTypeType value) {
        this.svcFeeRateVarType = value;
    }

    /**
     * Gets the value of the yieldDiffRate property.
     * 
     * @return
     *     possible object is
     *     {@link YieldDiffRateType }
     *     
     */
    public YieldDiffRateType getYieldDiffRate() {
        return yieldDiffRate;
    }

    /**
     * Sets the value of the yieldDiffRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldDiffRateType }
     *     
     */
    public void setYieldDiffRate(YieldDiffRateType value) {
        this.yieldDiffRate = value;
    }

    /**
     * Gets the value of the guarContrRate property.
     * 
     * @return
     *     possible object is
     *     {@link GuarContrRateType }
     *     
     */
    public GuarContrRateType getGuarContrRate() {
        return guarContrRate;
    }

    /**
     * Sets the value of the guarContrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuarContrRateType }
     *     
     */
    public void setGuarContrRate(GuarContrRateType value) {
        this.guarContrRate = value;
    }

    /**
     * Gets the value of the poolBuyRate property.
     * 
     * @return
     *     possible object is
     *     {@link PoolBuyRateType }
     *     
     */
    public PoolBuyRateType getPoolBuyRate() {
        return poolBuyRate;
    }

    /**
     * Sets the value of the poolBuyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoolBuyRateType }
     *     
     */
    public void setPoolBuyRate(PoolBuyRateType value) {
        this.poolBuyRate = value;
    }

    /**
     * Gets the value of the poolBuyRateVarType property.
     * 
     * @return
     *     possible object is
     *     {@link PoolBuyRateVarTypeType }
     *     
     */
    public PoolBuyRateVarTypeType getPoolBuyRateVarType() {
        return poolBuyRateVarType;
    }

    /**
     * Sets the value of the poolBuyRateVarType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoolBuyRateVarTypeType }
     *     
     */
    public void setPoolBuyRateVarType(PoolBuyRateVarTypeType value) {
        this.poolBuyRateVarType = value;
    }

    /**
     * Gets the value of the guarAltRate property.
     * 
     * @return
     *     possible object is
     *     {@link GuarAltRateType }
     *     
     */
    public GuarAltRateType getGuarAltRate() {
        return guarAltRate;
    }

    /**
     * Sets the value of the guarAltRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuarAltRateType }
     *     
     */
    public void setGuarAltRate(GuarAltRateType value) {
        this.guarAltRate = value;
    }

    /**
     * Gets the value of the guarBuyRate property.
     * 
     * @return
     *     possible object is
     *     {@link GuarBuyRateType }
     *     
     */
    public GuarBuyRateType getGuarBuyRate() {
        return guarBuyRate;
    }

    /**
     * Sets the value of the guarBuyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuarBuyRateType }
     *     
     */
    public void setGuarBuyRate(GuarBuyRateType value) {
        this.guarBuyRate = value;
    }

    /**
     * Gets the value of the ver1 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver1CType }
     *     
     */
    public Ver1CType getVer1() {
        return ver1;
    }

    /**
     * Sets the value of the ver1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver1CType }
     *     
     */
    public void setVer1(Ver1CType value) {
        this.ver1 = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
