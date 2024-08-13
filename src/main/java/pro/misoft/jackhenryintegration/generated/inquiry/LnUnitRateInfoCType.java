
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
 * <p>Java class for LnUnitRateInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnUnitRateInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevDt" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateVarCode" type="{http://jackhenry.com/jxchange/TPG/2008}RateVarCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateVar" type="{http://jackhenry.com/jxchange/TPG/2008}RateVar_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevTerm" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateFlr" type="{http://jackhenry.com/jxchange/TPG/2008}RateFlr_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateCeil" type="{http://jackhenry.com/jxchange/TPG/2008}RateCeil_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtRateChgNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtRateChgNotCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="RateCapUp" type="{http://jackhenry.com/jxchange/TPG/2008}RateCapUp_Type" minOccurs="0"/&gt;
 *           &lt;element name="RateCapDown" type="{http://jackhenry.com/jxchange/TPG/2008}RateCapDown_Type" minOccurs="0"/&gt;
 *           &lt;element name="RateCapRevDt" type="{http://jackhenry.com/jxchange/TPG/2008}RateCapRevDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="RateCapRevTerm" type="{http://jackhenry.com/jxchange/TPG/2008}RateCapRevTerm_Type" minOccurs="0"/&gt;
 *           &lt;element name="RateCapRevTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}RateCapRevTermUnits_Type" minOccurs="0"/&gt;
 *           &lt;element name="RateRoundMthd" type="{http://jackhenry.com/jxchange/TPG/2008}RateRoundMthd_Type" minOccurs="0"/&gt;
 *           &lt;element name="RateRoundToPct" type="{http://jackhenry.com/jxchange/TPG/2008}RateRoundToPct_Type" minOccurs="0"/&gt;
 *           &lt;element name="DaysBeforeRateChg" type="{http://jackhenry.com/jxchange/TPG/2008}DaysBeforeRateChg_Type" minOccurs="0"/&gt;
 *           &lt;element name="OrigIdxVal" type="{http://jackhenry.com/jxchange/TPG/2008}OrigIdxVal_Type" minOccurs="0"/&gt;
 *           &lt;element name="RateRevDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevDayOfMonth_Type" minOccurs="0"/&gt;
 *           &lt;element name="RateCapRevDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}RateCapRevDayOfMonth_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LnUnitRateInfo_CType", propOrder = {
    "rateIdxNum",
    "rateRevDt",
    "rateVarCode",
    "rateVar",
    "rateRevTerm",
    "rateRevTermUnits",
    "rateFlr",
    "rateCeil",
    "prtRateChgNotCode",
    "ver1",
    "rateCapUp",
    "rateCapDown",
    "rateCapRevDt",
    "rateCapRevTerm",
    "rateCapRevTermUnits",
    "rateRoundMthd",
    "rateRoundToPct",
    "daysBeforeRateChg",
    "origIdxVal",
    "rateRevDayOfMonth",
    "rateCapRevDayOfMonth",
    "ver2",
    "any"
})
public class LnUnitRateInfoCType {

    @XmlElement(name = "RateIdxNum")
    protected RateIdxNumType rateIdxNum;
    @XmlElement(name = "RateRevDt")
    protected RateRevDtType rateRevDt;
    @XmlElement(name = "RateVarCode")
    protected RateVarCodeType rateVarCode;
    @XmlElement(name = "RateVar")
    protected RateVarType rateVar;
    @XmlElement(name = "RateRevTerm")
    protected RateRevTermType rateRevTerm;
    @XmlElement(name = "RateRevTermUnits")
    protected RateRevTermUnitsType rateRevTermUnits;
    @XmlElement(name = "RateFlr")
    protected RateFlrType rateFlr;
    @XmlElement(name = "RateCeil")
    protected RateCeilType rateCeil;
    @XmlElement(name = "PrtRateChgNotCode")
    protected PrtRateChgNotCodeType prtRateChgNotCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "RateCapUp")
    protected RateCapUpType rateCapUp;
    @XmlElement(name = "RateCapDown")
    protected RateCapDownType rateCapDown;
    @XmlElement(name = "RateCapRevDt")
    protected RateCapRevDtType rateCapRevDt;
    @XmlElement(name = "RateCapRevTerm")
    protected RateCapRevTermType rateCapRevTerm;
    @XmlElement(name = "RateCapRevTermUnits")
    protected RateCapRevTermUnitsType rateCapRevTermUnits;
    @XmlElement(name = "RateRoundMthd")
    protected RateRoundMthdType rateRoundMthd;
    @XmlElement(name = "RateRoundToPct")
    protected RateRoundToPctType rateRoundToPct;
    @XmlElement(name = "DaysBeforeRateChg")
    protected DaysBeforeRateChgType daysBeforeRateChg;
    @XmlElement(name = "OrigIdxVal")
    protected OrigIdxValType origIdxVal;
    @XmlElement(name = "RateRevDayOfMonth")
    protected RateRevDayOfMonthType rateRevDayOfMonth;
    @XmlElement(name = "RateCapRevDayOfMonth")
    protected RateCapRevDayOfMonthType rateCapRevDayOfMonth;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the rateIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link RateIdxNumType }
     *     
     */
    public RateIdxNumType getRateIdxNum() {
        return rateIdxNum;
    }

    /**
     * Sets the value of the rateIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIdxNumType }
     *     
     */
    public void setRateIdxNum(RateIdxNumType value) {
        this.rateIdxNum = value;
    }

    /**
     * Gets the value of the rateRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevDtType }
     *     
     */
    public RateRevDtType getRateRevDt() {
        return rateRevDt;
    }

    /**
     * Sets the value of the rateRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevDtType }
     *     
     */
    public void setRateRevDt(RateRevDtType value) {
        this.rateRevDt = value;
    }

    /**
     * Gets the value of the rateVarCode property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarCodeType }
     *     
     */
    public RateVarCodeType getRateVarCode() {
        return rateVarCode;
    }

    /**
     * Sets the value of the rateVarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarCodeType }
     *     
     */
    public void setRateVarCode(RateVarCodeType value) {
        this.rateVarCode = value;
    }

    /**
     * Gets the value of the rateVar property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarType }
     *     
     */
    public RateVarType getRateVar() {
        return rateVar;
    }

    /**
     * Sets the value of the rateVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarType }
     *     
     */
    public void setRateVar(RateVarType value) {
        this.rateVar = value;
    }

    /**
     * Gets the value of the rateRevTerm property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevTermType }
     *     
     */
    public RateRevTermType getRateRevTerm() {
        return rateRevTerm;
    }

    /**
     * Sets the value of the rateRevTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevTermType }
     *     
     */
    public void setRateRevTerm(RateRevTermType value) {
        this.rateRevTerm = value;
    }

    /**
     * Gets the value of the rateRevTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevTermUnitsType }
     *     
     */
    public RateRevTermUnitsType getRateRevTermUnits() {
        return rateRevTermUnits;
    }

    /**
     * Sets the value of the rateRevTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevTermUnitsType }
     *     
     */
    public void setRateRevTermUnits(RateRevTermUnitsType value) {
        this.rateRevTermUnits = value;
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
     * Gets the value of the prtRateChgNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrtRateChgNotCodeType }
     *     
     */
    public PrtRateChgNotCodeType getPrtRateChgNotCode() {
        return prtRateChgNotCode;
    }

    /**
     * Sets the value of the prtRateChgNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtRateChgNotCodeType }
     *     
     */
    public void setPrtRateChgNotCode(PrtRateChgNotCodeType value) {
        this.prtRateChgNotCode = value;
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
     * Gets the value of the rateCapUp property.
     * 
     * @return
     *     possible object is
     *     {@link RateCapUpType }
     *     
     */
    public RateCapUpType getRateCapUp() {
        return rateCapUp;
    }

    /**
     * Sets the value of the rateCapUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCapUpType }
     *     
     */
    public void setRateCapUp(RateCapUpType value) {
        this.rateCapUp = value;
    }

    /**
     * Gets the value of the rateCapDown property.
     * 
     * @return
     *     possible object is
     *     {@link RateCapDownType }
     *     
     */
    public RateCapDownType getRateCapDown() {
        return rateCapDown;
    }

    /**
     * Sets the value of the rateCapDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCapDownType }
     *     
     */
    public void setRateCapDown(RateCapDownType value) {
        this.rateCapDown = value;
    }

    /**
     * Gets the value of the rateCapRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link RateCapRevDtType }
     *     
     */
    public RateCapRevDtType getRateCapRevDt() {
        return rateCapRevDt;
    }

    /**
     * Sets the value of the rateCapRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCapRevDtType }
     *     
     */
    public void setRateCapRevDt(RateCapRevDtType value) {
        this.rateCapRevDt = value;
    }

    /**
     * Gets the value of the rateCapRevTerm property.
     * 
     * @return
     *     possible object is
     *     {@link RateCapRevTermType }
     *     
     */
    public RateCapRevTermType getRateCapRevTerm() {
        return rateCapRevTerm;
    }

    /**
     * Sets the value of the rateCapRevTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCapRevTermType }
     *     
     */
    public void setRateCapRevTerm(RateCapRevTermType value) {
        this.rateCapRevTerm = value;
    }

    /**
     * Gets the value of the rateCapRevTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link RateCapRevTermUnitsType }
     *     
     */
    public RateCapRevTermUnitsType getRateCapRevTermUnits() {
        return rateCapRevTermUnits;
    }

    /**
     * Sets the value of the rateCapRevTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCapRevTermUnitsType }
     *     
     */
    public void setRateCapRevTermUnits(RateCapRevTermUnitsType value) {
        this.rateCapRevTermUnits = value;
    }

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
     * Gets the value of the daysBeforeRateChg property.
     * 
     * @return
     *     possible object is
     *     {@link DaysBeforeRateChgType }
     *     
     */
    public DaysBeforeRateChgType getDaysBeforeRateChg() {
        return daysBeforeRateChg;
    }

    /**
     * Sets the value of the daysBeforeRateChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysBeforeRateChgType }
     *     
     */
    public void setDaysBeforeRateChg(DaysBeforeRateChgType value) {
        this.daysBeforeRateChg = value;
    }

    /**
     * Gets the value of the origIdxVal property.
     * 
     * @return
     *     possible object is
     *     {@link OrigIdxValType }
     *     
     */
    public OrigIdxValType getOrigIdxVal() {
        return origIdxVal;
    }

    /**
     * Sets the value of the origIdxVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigIdxValType }
     *     
     */
    public void setOrigIdxVal(OrigIdxValType value) {
        this.origIdxVal = value;
    }

    /**
     * Gets the value of the rateRevDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevDayOfMonthType }
     *     
     */
    public RateRevDayOfMonthType getRateRevDayOfMonth() {
        return rateRevDayOfMonth;
    }

    /**
     * Sets the value of the rateRevDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevDayOfMonthType }
     *     
     */
    public void setRateRevDayOfMonth(RateRevDayOfMonthType value) {
        this.rateRevDayOfMonth = value;
    }

    /**
     * Gets the value of the rateCapRevDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link RateCapRevDayOfMonthType }
     *     
     */
    public RateCapRevDayOfMonthType getRateCapRevDayOfMonth() {
        return rateCapRevDayOfMonth;
    }

    /**
     * Sets the value of the rateCapRevDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCapRevDayOfMonthType }
     *     
     */
    public void setRateCapRevDayOfMonth(RateCapRevDayOfMonthType value) {
        this.rateCapRevDayOfMonth = value;
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
