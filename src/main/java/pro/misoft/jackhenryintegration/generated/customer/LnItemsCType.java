
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for LnItems_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnItems_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateRoundMthd" type="{http://jackhenry.com/jxchange/TPG/2008}RateRoundMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRoundToPct" type="{http://jackhenry.com/jxchange/TPG/2008}RateRoundToPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtRoundMthd" type="{http://jackhenry.com/jxchange/TPG/2008}PmtRoundMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtRoundToPct" type="{http://jackhenry.com/jxchange/TPG/2008}PmtRoundToPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="AlwRateLockType" type="{http://jackhenry.com/jxchange/TPG/2008}AlwRateLockType_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateChgDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}RateChgDayOfMonth_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateFlr" type="{http://jackhenry.com/jxchange/TPG/2008}RateFlr_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateCeil" type="{http://jackhenry.com/jxchange/TPG/2008}RateCeil_Type" minOccurs="0"/&gt;
 *         &lt;element name="LifetimeCapRate" type="{http://jackhenry.com/jxchange/TPG/2008}LnCapRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnCapBasisType" type="{http://jackhenry.com/jxchange/TPG/2008}LnCapBasisType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PeriodCapUp" type="{http://jackhenry.com/jxchange/TPG/2008}RateCapUp_Type" minOccurs="0"/&gt;
 *         &lt;element name="PeriodCapDown" type="{http://jackhenry.com/jxchange/TPG/2008}RateCapDown_Type" minOccurs="0"/&gt;
 *         &lt;element name="PeriodCapBasisType" type="{http://jackhenry.com/jxchange/TPG/2008}PeriodCapBasisType_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MaxAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatArray" type="{http://jackhenry.com/jxchange/TPG/2008}CollatArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PurposeArray" type="{http://jackhenry.com/jxchange/TPG/2008}PurposeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PmtCodeArray" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCodeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="LnTraitArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnTraitArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="LnRegArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnRegArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "LnItems_CType", propOrder = {
    "rateRoundMthd",
    "rateRoundToPct",
    "pmtRoundMthd",
    "pmtRoundToPct",
    "alwRateLockType",
    "rateChgDayOfMonth",
    "rateFlr",
    "rateCeil",
    "lifetimeCapRate",
    "lnCapBasisType",
    "periodCapUp",
    "periodCapDown",
    "periodCapBasisType",
    "minAmt",
    "maxAmt",
    "collatArray",
    "purposeArray",
    "pmtCodeArray",
    "lnTraitArray",
    "lnRegArray",
    "custom",
    "ver1",
    "any"
})
public class LnItemsCType {

    @XmlElement(name = "RateRoundMthd")
    protected RateRoundMthdType rateRoundMthd;
    @XmlElement(name = "RateRoundToPct")
    protected RateRoundToPctType rateRoundToPct;
    @XmlElement(name = "PmtRoundMthd")
    protected PmtRoundMthdType pmtRoundMthd;
    @XmlElement(name = "PmtRoundToPct")
    protected PmtRoundToPctType pmtRoundToPct;
    @XmlElement(name = "AlwRateLockType")
    protected AlwRateLockTypeType alwRateLockType;
    @XmlElement(name = "RateChgDayOfMonth")
    protected RateChgDayOfMonthType rateChgDayOfMonth;
    @XmlElement(name = "RateFlr")
    protected RateFlrType rateFlr;
    @XmlElement(name = "RateCeil")
    protected RateCeilType rateCeil;
    @XmlElement(name = "LifetimeCapRate")
    protected LnCapRateType lifetimeCapRate;
    @XmlElement(name = "LnCapBasisType")
    protected LnCapBasisTypeType lnCapBasisType;
    @XmlElement(name = "PeriodCapUp")
    protected RateCapUpType periodCapUp;
    @XmlElement(name = "PeriodCapDown")
    protected RateCapDownType periodCapDown;
    @XmlElement(name = "PeriodCapBasisType")
    protected PeriodCapBasisTypeType periodCapBasisType;
    @XmlElement(name = "MinAmt")
    protected AmtType minAmt;
    @XmlElement(name = "MaxAmt")
    protected AmtType maxAmt;
    @XmlElement(name = "CollatArray")
    protected CollatArrayAType collatArray;
    @XmlElement(name = "PurposeArray")
    protected PurposeArrayAType purposeArray;
    @XmlElement(name = "PmtCodeArray")
    protected PmtCodeArrayAType pmtCodeArray;
    @XmlElement(name = "LnTraitArray")
    protected LnTraitArrayAType lnTraitArray;
    @XmlElement(name = "LnRegArray")
    protected LnRegArrayAType lnRegArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the rateRoundMthd property.
     * 
     * @return
     *     possible object is
     *     {@link RateRoundMthdType }
     *     
     */
    public RateRoundMthdType getRateRoundMthd() {
        return rateRoundMthd;
    }

    /**
     * Sets the value of the rateRoundMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRoundMthdType }
     *     
     */
    public void setRateRoundMthd(RateRoundMthdType value) {
        this.rateRoundMthd = value;
    }

    /**
     * Gets the value of the rateRoundToPct property.
     * 
     * @return
     *     possible object is
     *     {@link RateRoundToPctType }
     *     
     */
    public RateRoundToPctType getRateRoundToPct() {
        return rateRoundToPct;
    }

    /**
     * Sets the value of the rateRoundToPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRoundToPctType }
     *     
     */
    public void setRateRoundToPct(RateRoundToPctType value) {
        this.rateRoundToPct = value;
    }

    /**
     * Gets the value of the pmtRoundMthd property.
     * 
     * @return
     *     possible object is
     *     {@link PmtRoundMthdType }
     *     
     */
    public PmtRoundMthdType getPmtRoundMthd() {
        return pmtRoundMthd;
    }

    /**
     * Sets the value of the pmtRoundMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtRoundMthdType }
     *     
     */
    public void setPmtRoundMthd(PmtRoundMthdType value) {
        this.pmtRoundMthd = value;
    }

    /**
     * Gets the value of the pmtRoundToPct property.
     * 
     * @return
     *     possible object is
     *     {@link PmtRoundToPctType }
     *     
     */
    public PmtRoundToPctType getPmtRoundToPct() {
        return pmtRoundToPct;
    }

    /**
     * Sets the value of the pmtRoundToPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtRoundToPctType }
     *     
     */
    public void setPmtRoundToPct(PmtRoundToPctType value) {
        this.pmtRoundToPct = value;
    }

    /**
     * Gets the value of the alwRateLockType property.
     * 
     * @return
     *     possible object is
     *     {@link AlwRateLockTypeType }
     *     
     */
    public AlwRateLockTypeType getAlwRateLockType() {
        return alwRateLockType;
    }

    /**
     * Sets the value of the alwRateLockType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlwRateLockTypeType }
     *     
     */
    public void setAlwRateLockType(AlwRateLockTypeType value) {
        this.alwRateLockType = value;
    }

    /**
     * Gets the value of the rateChgDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link RateChgDayOfMonthType }
     *     
     */
    public RateChgDayOfMonthType getRateChgDayOfMonth() {
        return rateChgDayOfMonth;
    }

    /**
     * Sets the value of the rateChgDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateChgDayOfMonthType }
     *     
     */
    public void setRateChgDayOfMonth(RateChgDayOfMonthType value) {
        this.rateChgDayOfMonth = value;
    }

    /**
     * Gets the value of the rateFlr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFlrType }
     *     
     */
    public RateFlrType getRateFlr() {
        return rateFlr;
    }

    /**
     * Sets the value of the rateFlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFlrType }
     *     
     */
    public void setRateFlr(RateFlrType value) {
        this.rateFlr = value;
    }

    /**
     * Gets the value of the rateCeil property.
     * 
     * @return
     *     possible object is
     *     {@link RateCeilType }
     *     
     */
    public RateCeilType getRateCeil() {
        return rateCeil;
    }

    /**
     * Sets the value of the rateCeil property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCeilType }
     *     
     */
    public void setRateCeil(RateCeilType value) {
        this.rateCeil = value;
    }

    /**
     * Gets the value of the lifetimeCapRate property.
     * 
     * @return
     *     possible object is
     *     {@link LnCapRateType }
     *     
     */
    public LnCapRateType getLifetimeCapRate() {
        return lifetimeCapRate;
    }

    /**
     * Sets the value of the lifetimeCapRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnCapRateType }
     *     
     */
    public void setLifetimeCapRate(LnCapRateType value) {
        this.lifetimeCapRate = value;
    }

    /**
     * Gets the value of the lnCapBasisType property.
     * 
     * @return
     *     possible object is
     *     {@link LnCapBasisTypeType }
     *     
     */
    public LnCapBasisTypeType getLnCapBasisType() {
        return lnCapBasisType;
    }

    /**
     * Sets the value of the lnCapBasisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnCapBasisTypeType }
     *     
     */
    public void setLnCapBasisType(LnCapBasisTypeType value) {
        this.lnCapBasisType = value;
    }

    /**
     * Gets the value of the periodCapUp property.
     * 
     * @return
     *     possible object is
     *     {@link RateCapUpType }
     *     
     */
    public RateCapUpType getPeriodCapUp() {
        return periodCapUp;
    }

    /**
     * Sets the value of the periodCapUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCapUpType }
     *     
     */
    public void setPeriodCapUp(RateCapUpType value) {
        this.periodCapUp = value;
    }

    /**
     * Gets the value of the periodCapDown property.
     * 
     * @return
     *     possible object is
     *     {@link RateCapDownType }
     *     
     */
    public RateCapDownType getPeriodCapDown() {
        return periodCapDown;
    }

    /**
     * Sets the value of the periodCapDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCapDownType }
     *     
     */
    public void setPeriodCapDown(RateCapDownType value) {
        this.periodCapDown = value;
    }

    /**
     * Gets the value of the periodCapBasisType property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodCapBasisTypeType }
     *     
     */
    public PeriodCapBasisTypeType getPeriodCapBasisType() {
        return periodCapBasisType;
    }

    /**
     * Sets the value of the periodCapBasisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodCapBasisTypeType }
     *     
     */
    public void setPeriodCapBasisType(PeriodCapBasisTypeType value) {
        this.periodCapBasisType = value;
    }

    /**
     * Gets the value of the minAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getMinAmt() {
        return minAmt;
    }

    /**
     * Sets the value of the minAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setMinAmt(AmtType value) {
        this.minAmt = value;
    }

    /**
     * Gets the value of the maxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getMaxAmt() {
        return maxAmt;
    }

    /**
     * Sets the value of the maxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setMaxAmt(AmtType value) {
        this.maxAmt = value;
    }

    /**
     * Gets the value of the collatArray property.
     * 
     * @return
     *     possible object is
     *     {@link CollatArrayAType }
     *     
     */
    public CollatArrayAType getCollatArray() {
        return collatArray;
    }

    /**
     * Sets the value of the collatArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatArrayAType }
     *     
     */
    public void setCollatArray(CollatArrayAType value) {
        this.collatArray = value;
    }

    /**
     * Gets the value of the purposeArray property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeArrayAType }
     *     
     */
    public PurposeArrayAType getPurposeArray() {
        return purposeArray;
    }

    /**
     * Sets the value of the purposeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeArrayAType }
     *     
     */
    public void setPurposeArray(PurposeArrayAType value) {
        this.purposeArray = value;
    }

    /**
     * Gets the value of the pmtCodeArray property.
     * 
     * @return
     *     possible object is
     *     {@link PmtCodeArrayAType }
     *     
     */
    public PmtCodeArrayAType getPmtCodeArray() {
        return pmtCodeArray;
    }

    /**
     * Sets the value of the pmtCodeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtCodeArrayAType }
     *     
     */
    public void setPmtCodeArray(PmtCodeArrayAType value) {
        this.pmtCodeArray = value;
    }

    /**
     * Gets the value of the lnTraitArray property.
     * 
     * @return
     *     possible object is
     *     {@link LnTraitArrayAType }
     *     
     */
    public LnTraitArrayAType getLnTraitArray() {
        return lnTraitArray;
    }

    /**
     * Sets the value of the lnTraitArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnTraitArrayAType }
     *     
     */
    public void setLnTraitArray(LnTraitArrayAType value) {
        this.lnTraitArray = value;
    }

    /**
     * Gets the value of the lnRegArray property.
     * 
     * @return
     *     possible object is
     *     {@link LnRegArrayAType }
     *     
     */
    public LnRegArrayAType getLnRegArray() {
        return lnRegArray;
    }

    /**
     * Sets the value of the lnRegArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnRegArrayAType }
     *     
     */
    public void setLnRegArray(LnRegArrayAType value) {
        this.lnRegArray = value;
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
