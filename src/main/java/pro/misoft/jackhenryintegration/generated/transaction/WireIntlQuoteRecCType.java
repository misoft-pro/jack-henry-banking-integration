
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for WireIntlQuoteRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireIntlQuoteRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireTrnTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}WireTrnTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurrPmtType" type="{http://jackhenry.com/jxchange/TPG/2008}CurrPmtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="FornCurrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FornCurrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurrExchRate" type="{http://jackhenry.com/jxchange/TPG/2008}CurrExchRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="SttlCostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SttlCostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBankFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireBankFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBankTaxAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireBankTaxAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TotFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FeeCurrType" type="{http://jackhenry.com/jxchange/TPG/2008}CurrType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SttlNetCostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SttlNetCostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "WireIntlQuoteRec_CType", propOrder = {
    "wireTrnTimeDt",
    "currPmtType",
    "fornCurrAmt",
    "currExchRate",
    "sttlCostAmt",
    "wireBankFeeAmt",
    "wireBankTaxAmt",
    "totFeeAmt",
    "feeCurrType",
    "sttlNetCostAmt",
    "custom",
    "ver1",
    "any"
})
public class WireIntlQuoteRecCType {

    @XmlElement(name = "WireTrnTimeDt")
    protected WireTrnTimeDtType wireTrnTimeDt;
    @XmlElement(name = "CurrPmtType")
    protected CurrPmtTypeType currPmtType;
    @XmlElement(name = "FornCurrAmt")
    protected FornCurrAmtType fornCurrAmt;
    @XmlElement(name = "CurrExchRate")
    protected CurrExchRateType currExchRate;
    @XmlElement(name = "SttlCostAmt")
    protected SttlCostAmtType sttlCostAmt;
    @XmlElement(name = "WireBankFeeAmt")
    protected WireBankFeeAmtType wireBankFeeAmt;
    @XmlElement(name = "WireBankTaxAmt")
    protected WireBankTaxAmtType wireBankTaxAmt;
    @XmlElement(name = "TotFeeAmt")
    protected FeeAmtType totFeeAmt;
    @XmlElement(name = "FeeCurrType")
    protected CurrTypeType feeCurrType;
    @XmlElement(name = "SttlNetCostAmt")
    protected SttlNetCostAmtType sttlNetCostAmt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the wireTrnTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link WireTrnTimeDtType }
     *     
     */
    public WireTrnTimeDtType getWireTrnTimeDt() {
        return wireTrnTimeDt;
    }

    /**
     * Sets the value of the wireTrnTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTrnTimeDtType }
     *     
     */
    public void setWireTrnTimeDt(WireTrnTimeDtType value) {
        this.wireTrnTimeDt = value;
    }

    /**
     * Gets the value of the currPmtType property.
     * 
     * @return
     *     possible object is
     *     {@link CurrPmtTypeType }
     *     
     */
    public CurrPmtTypeType getCurrPmtType() {
        return currPmtType;
    }

    /**
     * Sets the value of the currPmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrPmtTypeType }
     *     
     */
    public void setCurrPmtType(CurrPmtTypeType value) {
        this.currPmtType = value;
    }

    /**
     * Gets the value of the fornCurrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FornCurrAmtType }
     *     
     */
    public FornCurrAmtType getFornCurrAmt() {
        return fornCurrAmt;
    }

    /**
     * Sets the value of the fornCurrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FornCurrAmtType }
     *     
     */
    public void setFornCurrAmt(FornCurrAmtType value) {
        this.fornCurrAmt = value;
    }

    /**
     * Gets the value of the currExchRate property.
     * 
     * @return
     *     possible object is
     *     {@link CurrExchRateType }
     *     
     */
    public CurrExchRateType getCurrExchRate() {
        return currExchRate;
    }

    /**
     * Sets the value of the currExchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrExchRateType }
     *     
     */
    public void setCurrExchRate(CurrExchRateType value) {
        this.currExchRate = value;
    }

    /**
     * Gets the value of the sttlCostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SttlCostAmtType }
     *     
     */
    public SttlCostAmtType getSttlCostAmt() {
        return sttlCostAmt;
    }

    /**
     * Sets the value of the sttlCostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SttlCostAmtType }
     *     
     */
    public void setSttlCostAmt(SttlCostAmtType value) {
        this.sttlCostAmt = value;
    }

    /**
     * Gets the value of the wireBankFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WireBankFeeAmtType }
     *     
     */
    public WireBankFeeAmtType getWireBankFeeAmt() {
        return wireBankFeeAmt;
    }

    /**
     * Sets the value of the wireBankFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBankFeeAmtType }
     *     
     */
    public void setWireBankFeeAmt(WireBankFeeAmtType value) {
        this.wireBankFeeAmt = value;
    }

    /**
     * Gets the value of the wireBankTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WireBankTaxAmtType }
     *     
     */
    public WireBankTaxAmtType getWireBankTaxAmt() {
        return wireBankTaxAmt;
    }

    /**
     * Sets the value of the wireBankTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBankTaxAmtType }
     *     
     */
    public void setWireBankTaxAmt(WireBankTaxAmtType value) {
        this.wireBankTaxAmt = value;
    }

    /**
     * Gets the value of the totFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmtType }
     *     
     */
    public FeeAmtType getTotFeeAmt() {
        return totFeeAmt;
    }

    /**
     * Sets the value of the totFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmtType }
     *     
     */
    public void setTotFeeAmt(FeeAmtType value) {
        this.totFeeAmt = value;
    }

    /**
     * Gets the value of the feeCurrType property.
     * 
     * @return
     *     possible object is
     *     {@link CurrTypeType }
     *     
     */
    public CurrTypeType getFeeCurrType() {
        return feeCurrType;
    }

    /**
     * Sets the value of the feeCurrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrTypeType }
     *     
     */
    public void setFeeCurrType(CurrTypeType value) {
        this.feeCurrType = value;
    }

    /**
     * Gets the value of the sttlNetCostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SttlNetCostAmtType }
     *     
     */
    public SttlNetCostAmtType getSttlNetCostAmt() {
        return sttlNetCostAmt;
    }

    /**
     * Sets the value of the sttlNetCostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SttlNetCostAmtType }
     *     
     */
    public void setSttlNetCostAmt(SttlNetCostAmtType value) {
        this.sttlNetCostAmt = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
        this.custom = value;
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
     * {@link Element }
     * {@link Object }
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
