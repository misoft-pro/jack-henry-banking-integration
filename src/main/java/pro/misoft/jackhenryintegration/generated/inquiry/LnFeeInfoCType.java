
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
 * <p>Java class for LnFeeInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnFeeInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnFeeAssmntDt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeAssmntDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeNxtPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeLastPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeRemAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeRemAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeCaplze" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeCaplze_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeWavDt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeWavDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeRate" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeRateIdx" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeRateIdx_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeFreq" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeFreqUnits" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeFreqUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeIntBase" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeIntBase_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeAccr" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeAccr_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeExpTerm" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeExpTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeExpTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeExpTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeStat" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeFirstPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeEscrwType" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeEscrwType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeAPRType" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeAPRType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeePmtType" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeePmtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeePayoffType" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeePayoffType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeClsType" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeClsType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeBaseAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeBaseAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeColAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeColAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeePaidAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeePaidAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeStatChgDt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeStatChgDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="SemiDay1" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay1_Type" minOccurs="0"/&gt;
 *           &lt;element name="SemiDay2" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay2_Type" minOccurs="0"/&gt;
 *           &lt;element name="LnFeeDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeDayOfMonth_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="LOCRecurFeePct" type="{http://jackhenry.com/jxchange/TPG/2008}LOCRecurFeePct_Type" minOccurs="0"/&gt;
 *             &lt;element name="LOCRecurFeeCalcType" type="{http://jackhenry.com/jxchange/TPG/2008}LOCRecurFeeCalcType_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "LnFeeInfo_CType", propOrder = {
    "lnFeeAssmntDt",
    "lnFeeNxtPayDt",
    "lnFeeLastPmtDt",
    "lnFeeRemAmt",
    "lnFeeCaplze",
    "lnFeeAmt",
    "lnFeeWavDt",
    "lnFeeRate",
    "lnFeeRateIdx",
    "lnFeeFreq",
    "lnFeeFreqUnits",
    "lnFeeIntBase",
    "lnFeeAccr",
    "lnFeeExpDt",
    "lnFeeExpTerm",
    "lnFeeExpTermUnits",
    "lnFeeStat",
    "lnFeeFirstPmtDt",
    "lnFeeOffCode",
    "lnFeeEscrwType",
    "lnFeeAPRType",
    "lnFeePmtType",
    "lnFeePayoffType",
    "lnFeeClsType",
    "lnFeeBaseAmt",
    "lnFeeColAmt",
    "lnFeePaidAmt",
    "lnFeeStatChgDt",
    "custom",
    "ver1",
    "semiDay1",
    "semiDay2",
    "lnFeeDayOfMonth",
    "ver2",
    "locRecurFeePct",
    "locRecurFeeCalcType",
    "ver3",
    "any"
})
public class LnFeeInfoCType {

    @XmlElement(name = "LnFeeAssmntDt")
    protected LnFeeAssmntDtType lnFeeAssmntDt;
    @XmlElement(name = "LnFeeNxtPayDt")
    protected NxtPayDtType lnFeeNxtPayDt;
    @XmlElement(name = "LnFeeLastPmtDt")
    protected LastPmtDtType lnFeeLastPmtDt;
    @XmlElement(name = "LnFeeRemAmt")
    protected LnFeeRemAmtType lnFeeRemAmt;
    @XmlElement(name = "LnFeeCaplze")
    protected LnFeeCaplzeType lnFeeCaplze;
    @XmlElement(name = "LnFeeAmt")
    protected LnFeeAmtType lnFeeAmt;
    @XmlElement(name = "LnFeeWavDt")
    protected LnFeeWavDtType lnFeeWavDt;
    @XmlElement(name = "LnFeeRate")
    protected LnFeeRateType lnFeeRate;
    @XmlElement(name = "LnFeeRateIdx")
    protected LnFeeRateIdxType lnFeeRateIdx;
    @XmlElement(name = "LnFeeFreq")
    protected LnFeeFreqType lnFeeFreq;
    @XmlElement(name = "LnFeeFreqUnits")
    protected LnFeeFreqUnitsType lnFeeFreqUnits;
    @XmlElement(name = "LnFeeIntBase")
    protected LnFeeIntBaseType lnFeeIntBase;
    @XmlElement(name = "LnFeeAccr")
    protected LnFeeAccrType lnFeeAccr;
    @XmlElement(name = "LnFeeExpDt")
    protected ExpDtType lnFeeExpDt;
    @XmlElement(name = "LnFeeExpTerm")
    protected LnFeeExpTermType lnFeeExpTerm;
    @XmlElement(name = "LnFeeExpTermUnits")
    protected LnFeeExpTermUnitsType lnFeeExpTermUnits;
    @XmlElement(name = "LnFeeStat")
    protected LnFeeStatType lnFeeStat;
    @XmlElement(name = "LnFeeFirstPmtDt")
    protected FirstPmtDtType lnFeeFirstPmtDt;
    @XmlElement(name = "LnFeeOffCode")
    protected OffCodeType lnFeeOffCode;
    @XmlElement(name = "LnFeeEscrwType")
    protected LnFeeEscrwTypeType lnFeeEscrwType;
    @XmlElement(name = "LnFeeAPRType")
    protected LnFeeAPRTypeType lnFeeAPRType;
    @XmlElement(name = "LnFeePmtType")
    protected LnFeePmtTypeType lnFeePmtType;
    @XmlElement(name = "LnFeePayoffType")
    protected LnFeePayoffTypeType lnFeePayoffType;
    @XmlElement(name = "LnFeeClsType")
    protected LnFeeClsTypeType lnFeeClsType;
    @XmlElement(name = "LnFeeBaseAmt")
    protected LnFeeBaseAmtType lnFeeBaseAmt;
    @XmlElement(name = "LnFeeColAmt")
    protected LnFeeColAmtType lnFeeColAmt;
    @XmlElement(name = "LnFeePaidAmt")
    protected LnFeePaidAmtType lnFeePaidAmt;
    @XmlElement(name = "LnFeeStatChgDt")
    protected LnFeeStatChgDtType lnFeeStatChgDt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "SemiDay1")
    protected SemiDay1Type semiDay1;
    @XmlElement(name = "SemiDay2")
    protected SemiDay2Type semiDay2;
    @XmlElement(name = "LnFeeDayOfMonth")
    protected LnFeeDayOfMonthType lnFeeDayOfMonth;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "LOCRecurFeePct")
    protected LOCRecurFeePctType locRecurFeePct;
    @XmlElement(name = "LOCRecurFeeCalcType")
    protected LOCRecurFeeCalcTypeType locRecurFeeCalcType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnFeeAssmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeAssmntDtType }
     *     
     */
    public LnFeeAssmntDtType getLnFeeAssmntDt() {
        return lnFeeAssmntDt;
    }

    /**
     * Sets the value of the lnFeeAssmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeAssmntDtType }
     *     
     */
    public void setLnFeeAssmntDt(LnFeeAssmntDtType value) {
        this.lnFeeAssmntDt = value;
    }

    /**
     * Gets the value of the lnFeeNxtPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link NxtPayDtType }
     *     
     */
    public NxtPayDtType getLnFeeNxtPayDt() {
        return lnFeeNxtPayDt;
    }

    /**
     * Sets the value of the lnFeeNxtPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NxtPayDtType }
     *     
     */
    public void setLnFeeNxtPayDt(NxtPayDtType value) {
        this.lnFeeNxtPayDt = value;
    }

    /**
     * Gets the value of the lnFeeLastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastPmtDtType }
     *     
     */
    public LastPmtDtType getLnFeeLastPmtDt() {
        return lnFeeLastPmtDt;
    }

    /**
     * Sets the value of the lnFeeLastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPmtDtType }
     *     
     */
    public void setLnFeeLastPmtDt(LastPmtDtType value) {
        this.lnFeeLastPmtDt = value;
    }

    /**
     * Gets the value of the lnFeeRemAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeRemAmtType }
     *     
     */
    public LnFeeRemAmtType getLnFeeRemAmt() {
        return lnFeeRemAmt;
    }

    /**
     * Sets the value of the lnFeeRemAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeRemAmtType }
     *     
     */
    public void setLnFeeRemAmt(LnFeeRemAmtType value) {
        this.lnFeeRemAmt = value;
    }

    /**
     * Gets the value of the lnFeeCaplze property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeCaplzeType }
     *     
     */
    public LnFeeCaplzeType getLnFeeCaplze() {
        return lnFeeCaplze;
    }

    /**
     * Sets the value of the lnFeeCaplze property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeCaplzeType }
     *     
     */
    public void setLnFeeCaplze(LnFeeCaplzeType value) {
        this.lnFeeCaplze = value;
    }

    /**
     * Gets the value of the lnFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeAmtType }
     *     
     */
    public LnFeeAmtType getLnFeeAmt() {
        return lnFeeAmt;
    }

    /**
     * Sets the value of the lnFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeAmtType }
     *     
     */
    public void setLnFeeAmt(LnFeeAmtType value) {
        this.lnFeeAmt = value;
    }

    /**
     * Gets the value of the lnFeeWavDt property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeWavDtType }
     *     
     */
    public LnFeeWavDtType getLnFeeWavDt() {
        return lnFeeWavDt;
    }

    /**
     * Sets the value of the lnFeeWavDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeWavDtType }
     *     
     */
    public void setLnFeeWavDt(LnFeeWavDtType value) {
        this.lnFeeWavDt = value;
    }

    /**
     * Gets the value of the lnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeRateType }
     *     
     */
    public LnFeeRateType getLnFeeRate() {
        return lnFeeRate;
    }

    /**
     * Sets the value of the lnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeRateType }
     *     
     */
    public void setLnFeeRate(LnFeeRateType value) {
        this.lnFeeRate = value;
    }

    /**
     * Gets the value of the lnFeeRateIdx property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeRateIdxType }
     *     
     */
    public LnFeeRateIdxType getLnFeeRateIdx() {
        return lnFeeRateIdx;
    }

    /**
     * Sets the value of the lnFeeRateIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeRateIdxType }
     *     
     */
    public void setLnFeeRateIdx(LnFeeRateIdxType value) {
        this.lnFeeRateIdx = value;
    }

    /**
     * Gets the value of the lnFeeFreq property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeFreqType }
     *     
     */
    public LnFeeFreqType getLnFeeFreq() {
        return lnFeeFreq;
    }

    /**
     * Sets the value of the lnFeeFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeFreqType }
     *     
     */
    public void setLnFeeFreq(LnFeeFreqType value) {
        this.lnFeeFreq = value;
    }

    /**
     * Gets the value of the lnFeeFreqUnits property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeFreqUnitsType }
     *     
     */
    public LnFeeFreqUnitsType getLnFeeFreqUnits() {
        return lnFeeFreqUnits;
    }

    /**
     * Sets the value of the lnFeeFreqUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeFreqUnitsType }
     *     
     */
    public void setLnFeeFreqUnits(LnFeeFreqUnitsType value) {
        this.lnFeeFreqUnits = value;
    }

    /**
     * Gets the value of the lnFeeIntBase property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeIntBaseType }
     *     
     */
    public LnFeeIntBaseType getLnFeeIntBase() {
        return lnFeeIntBase;
    }

    /**
     * Sets the value of the lnFeeIntBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeIntBaseType }
     *     
     */
    public void setLnFeeIntBase(LnFeeIntBaseType value) {
        this.lnFeeIntBase = value;
    }

    /**
     * Gets the value of the lnFeeAccr property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeAccrType }
     *     
     */
    public LnFeeAccrType getLnFeeAccr() {
        return lnFeeAccr;
    }

    /**
     * Sets the value of the lnFeeAccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeAccrType }
     *     
     */
    public void setLnFeeAccr(LnFeeAccrType value) {
        this.lnFeeAccr = value;
    }

    /**
     * Gets the value of the lnFeeExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getLnFeeExpDt() {
        return lnFeeExpDt;
    }

    /**
     * Sets the value of the lnFeeExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setLnFeeExpDt(ExpDtType value) {
        this.lnFeeExpDt = value;
    }

    /**
     * Gets the value of the lnFeeExpTerm property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeExpTermType }
     *     
     */
    public LnFeeExpTermType getLnFeeExpTerm() {
        return lnFeeExpTerm;
    }

    /**
     * Sets the value of the lnFeeExpTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeExpTermType }
     *     
     */
    public void setLnFeeExpTerm(LnFeeExpTermType value) {
        this.lnFeeExpTerm = value;
    }

    /**
     * Gets the value of the lnFeeExpTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeExpTermUnitsType }
     *     
     */
    public LnFeeExpTermUnitsType getLnFeeExpTermUnits() {
        return lnFeeExpTermUnits;
    }

    /**
     * Sets the value of the lnFeeExpTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeExpTermUnitsType }
     *     
     */
    public void setLnFeeExpTermUnits(LnFeeExpTermUnitsType value) {
        this.lnFeeExpTermUnits = value;
    }

    /**
     * Gets the value of the lnFeeStat property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeStatType }
     *     
     */
    public LnFeeStatType getLnFeeStat() {
        return lnFeeStat;
    }

    /**
     * Sets the value of the lnFeeStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeStatType }
     *     
     */
    public void setLnFeeStat(LnFeeStatType value) {
        this.lnFeeStat = value;
    }

    /**
     * Gets the value of the lnFeeFirstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link FirstPmtDtType }
     *     
     */
    public FirstPmtDtType getLnFeeFirstPmtDt() {
        return lnFeeFirstPmtDt;
    }

    /**
     * Sets the value of the lnFeeFirstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstPmtDtType }
     *     
     */
    public void setLnFeeFirstPmtDt(FirstPmtDtType value) {
        this.lnFeeFirstPmtDt = value;
    }

    /**
     * Gets the value of the lnFeeOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getLnFeeOffCode() {
        return lnFeeOffCode;
    }

    /**
     * Sets the value of the lnFeeOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setLnFeeOffCode(OffCodeType value) {
        this.lnFeeOffCode = value;
    }

    /**
     * Gets the value of the lnFeeEscrwType property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeEscrwTypeType }
     *     
     */
    public LnFeeEscrwTypeType getLnFeeEscrwType() {
        return lnFeeEscrwType;
    }

    /**
     * Sets the value of the lnFeeEscrwType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeEscrwTypeType }
     *     
     */
    public void setLnFeeEscrwType(LnFeeEscrwTypeType value) {
        this.lnFeeEscrwType = value;
    }

    /**
     * Gets the value of the lnFeeAPRType property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeAPRTypeType }
     *     
     */
    public LnFeeAPRTypeType getLnFeeAPRType() {
        return lnFeeAPRType;
    }

    /**
     * Sets the value of the lnFeeAPRType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeAPRTypeType }
     *     
     */
    public void setLnFeeAPRType(LnFeeAPRTypeType value) {
        this.lnFeeAPRType = value;
    }

    /**
     * Gets the value of the lnFeePmtType property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeePmtTypeType }
     *     
     */
    public LnFeePmtTypeType getLnFeePmtType() {
        return lnFeePmtType;
    }

    /**
     * Sets the value of the lnFeePmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeePmtTypeType }
     *     
     */
    public void setLnFeePmtType(LnFeePmtTypeType value) {
        this.lnFeePmtType = value;
    }

    /**
     * Gets the value of the lnFeePayoffType property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeePayoffTypeType }
     *     
     */
    public LnFeePayoffTypeType getLnFeePayoffType() {
        return lnFeePayoffType;
    }

    /**
     * Sets the value of the lnFeePayoffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeePayoffTypeType }
     *     
     */
    public void setLnFeePayoffType(LnFeePayoffTypeType value) {
        this.lnFeePayoffType = value;
    }

    /**
     * Gets the value of the lnFeeClsType property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeClsTypeType }
     *     
     */
    public LnFeeClsTypeType getLnFeeClsType() {
        return lnFeeClsType;
    }

    /**
     * Sets the value of the lnFeeClsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeClsTypeType }
     *     
     */
    public void setLnFeeClsType(LnFeeClsTypeType value) {
        this.lnFeeClsType = value;
    }

    /**
     * Gets the value of the lnFeeBaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeBaseAmtType }
     *     
     */
    public LnFeeBaseAmtType getLnFeeBaseAmt() {
        return lnFeeBaseAmt;
    }

    /**
     * Sets the value of the lnFeeBaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeBaseAmtType }
     *     
     */
    public void setLnFeeBaseAmt(LnFeeBaseAmtType value) {
        this.lnFeeBaseAmt = value;
    }

    /**
     * Gets the value of the lnFeeColAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeColAmtType }
     *     
     */
    public LnFeeColAmtType getLnFeeColAmt() {
        return lnFeeColAmt;
    }

    /**
     * Sets the value of the lnFeeColAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeColAmtType }
     *     
     */
    public void setLnFeeColAmt(LnFeeColAmtType value) {
        this.lnFeeColAmt = value;
    }

    /**
     * Gets the value of the lnFeePaidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeePaidAmtType }
     *     
     */
    public LnFeePaidAmtType getLnFeePaidAmt() {
        return lnFeePaidAmt;
    }

    /**
     * Sets the value of the lnFeePaidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeePaidAmtType }
     *     
     */
    public void setLnFeePaidAmt(LnFeePaidAmtType value) {
        this.lnFeePaidAmt = value;
    }

    /**
     * Gets the value of the lnFeeStatChgDt property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeStatChgDtType }
     *     
     */
    public LnFeeStatChgDtType getLnFeeStatChgDt() {
        return lnFeeStatChgDt;
    }

    /**
     * Sets the value of the lnFeeStatChgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeStatChgDtType }
     *     
     */
    public void setLnFeeStatChgDt(LnFeeStatChgDtType value) {
        this.lnFeeStatChgDt = value;
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
     * Gets the value of the semiDay1 property.
     * 
     * @return
     *     possible object is
     *     {@link SemiDay1Type }
     *     
     */
    public SemiDay1Type getSemiDay1() {
        return semiDay1;
    }

    /**
     * Sets the value of the semiDay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SemiDay1Type }
     *     
     */
    public void setSemiDay1(SemiDay1Type value) {
        this.semiDay1 = value;
    }

    /**
     * Gets the value of the semiDay2 property.
     * 
     * @return
     *     possible object is
     *     {@link SemiDay2Type }
     *     
     */
    public SemiDay2Type getSemiDay2() {
        return semiDay2;
    }

    /**
     * Sets the value of the semiDay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SemiDay2Type }
     *     
     */
    public void setSemiDay2(SemiDay2Type value) {
        this.semiDay2 = value;
    }

    /**
     * Gets the value of the lnFeeDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeDayOfMonthType }
     *     
     */
    public LnFeeDayOfMonthType getLnFeeDayOfMonth() {
        return lnFeeDayOfMonth;
    }

    /**
     * Sets the value of the lnFeeDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeDayOfMonthType }
     *     
     */
    public void setLnFeeDayOfMonth(LnFeeDayOfMonthType value) {
        this.lnFeeDayOfMonth = value;
    }

    /**
     * Gets the value of the ver2 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver2CType }
     *     
     */
    public Ver2CType getVer2() {
        return ver2;
    }

    /**
     * Sets the value of the ver2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver2CType }
     *     
     */
    public void setVer2(Ver2CType value) {
        this.ver2 = value;
    }

    /**
     * Gets the value of the locRecurFeePct property.
     * 
     * @return
     *     possible object is
     *     {@link LOCRecurFeePctType }
     *     
     */
    public LOCRecurFeePctType getLOCRecurFeePct() {
        return locRecurFeePct;
    }

    /**
     * Sets the value of the locRecurFeePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCRecurFeePctType }
     *     
     */
    public void setLOCRecurFeePct(LOCRecurFeePctType value) {
        this.locRecurFeePct = value;
    }

    /**
     * Gets the value of the locRecurFeeCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link LOCRecurFeeCalcTypeType }
     *     
     */
    public LOCRecurFeeCalcTypeType getLOCRecurFeeCalcType() {
        return locRecurFeeCalcType;
    }

    /**
     * Sets the value of the locRecurFeeCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCRecurFeeCalcTypeType }
     *     
     */
    public void setLOCRecurFeeCalcType(LOCRecurFeeCalcTypeType value) {
        this.locRecurFeeCalcType = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
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
