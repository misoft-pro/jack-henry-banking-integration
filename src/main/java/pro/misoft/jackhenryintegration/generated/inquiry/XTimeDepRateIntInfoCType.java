
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
 * <p>Java class for x_TimeDepRateIntInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_TimeDepRateIntInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeDepRateIntInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepRateIntInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="CombIntChkDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CombIntChkDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayAllIntDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PayAllIntDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntPmtDtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}IntPmtDtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="MultiRateDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MultiRateDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="MultiDrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MultiDrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateSchedDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RateSchedDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntCalcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}IntCalcDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntYrBaseDesc" type="{http://jackhenry.com/jxchange/TPG/2008}IntYrBaseDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EvenPayDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EvenPayDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AccrIntThruDt" type="{http://jackhenry.com/jxchange/TPG/2008}AccrIntThruDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AnnPctYield" type="{http://jackhenry.com/jxchange/TPG/2008}AnnPctYield_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="DailyAccrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}DailyAccrAmt_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
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
@XmlType(name = "x_TimeDepRateIntInfo_CType", propOrder = {
    "timeDepRateIntInfo",
    "combIntChkDesc",
    "payAllIntDesc",
    "intPmtDtDesc",
    "multiRateDesc",
    "multiDrDesc",
    "rateSchedDesc",
    "intCalcDesc",
    "intYrBaseDesc",
    "evenPayDesc",
    "custom",
    "ver1",
    "accrIntThruDt",
    "ver2",
    "annPctYield",
    "ver3",
    "dailyAccrAmt",
    "ver4",
    "any"
})
public class XTimeDepRateIntInfoCType {

    @XmlElement(name = "TimeDepRateIntInfo")
    protected TimeDepRateIntInfoCType timeDepRateIntInfo;
    @XmlElement(name = "CombIntChkDesc")
    protected CombIntChkDescType combIntChkDesc;
    @XmlElement(name = "PayAllIntDesc")
    protected PayAllIntDescType payAllIntDesc;
    @XmlElement(name = "IntPmtDtDesc")
    protected IntPmtDtDescType intPmtDtDesc;
    @XmlElement(name = "MultiRateDesc")
    protected MultiRateDescType multiRateDesc;
    @XmlElement(name = "MultiDrDesc")
    protected MultiDrDescType multiDrDesc;
    @XmlElement(name = "RateSchedDesc")
    protected RateSchedDescType rateSchedDesc;
    @XmlElement(name = "IntCalcDesc")
    protected IntCalcDescType intCalcDesc;
    @XmlElement(name = "IntYrBaseDesc")
    protected IntYrBaseDescType intYrBaseDesc;
    @XmlElement(name = "EvenPayDesc")
    protected EvenPayDescType evenPayDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AccrIntThruDt")
    protected AccrIntThruDtType accrIntThruDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "AnnPctYield")
    protected AnnPctYieldType annPctYield;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "DailyAccrAmt")
    protected DailyAccrAmtType dailyAccrAmt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the timeDepRateIntInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepRateIntInfoCType }
     *     
     */
    public TimeDepRateIntInfoCType getTimeDepRateIntInfo() {
        return timeDepRateIntInfo;
    }

    /**
     * Sets the value of the timeDepRateIntInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepRateIntInfoCType }
     *     
     */
    public void setTimeDepRateIntInfo(TimeDepRateIntInfoCType value) {
        this.timeDepRateIntInfo = value;
    }

    /**
     * Gets the value of the combIntChkDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CombIntChkDescType }
     *     
     */
    public CombIntChkDescType getCombIntChkDesc() {
        return combIntChkDesc;
    }

    /**
     * Sets the value of the combIntChkDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombIntChkDescType }
     *     
     */
    public void setCombIntChkDesc(CombIntChkDescType value) {
        this.combIntChkDesc = value;
    }

    /**
     * Gets the value of the payAllIntDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PayAllIntDescType }
     *     
     */
    public PayAllIntDescType getPayAllIntDesc() {
        return payAllIntDesc;
    }

    /**
     * Sets the value of the payAllIntDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayAllIntDescType }
     *     
     */
    public void setPayAllIntDesc(PayAllIntDescType value) {
        this.payAllIntDesc = value;
    }

    /**
     * Gets the value of the intPmtDtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link IntPmtDtDescType }
     *     
     */
    public IntPmtDtDescType getIntPmtDtDesc() {
        return intPmtDtDesc;
    }

    /**
     * Sets the value of the intPmtDtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntPmtDtDescType }
     *     
     */
    public void setIntPmtDtDesc(IntPmtDtDescType value) {
        this.intPmtDtDesc = value;
    }

    /**
     * Gets the value of the multiRateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MultiRateDescType }
     *     
     */
    public MultiRateDescType getMultiRateDesc() {
        return multiRateDesc;
    }

    /**
     * Sets the value of the multiRateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiRateDescType }
     *     
     */
    public void setMultiRateDesc(MultiRateDescType value) {
        this.multiRateDesc = value;
    }

    /**
     * Gets the value of the multiDrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MultiDrDescType }
     *     
     */
    public MultiDrDescType getMultiDrDesc() {
        return multiDrDesc;
    }

    /**
     * Sets the value of the multiDrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiDrDescType }
     *     
     */
    public void setMultiDrDesc(MultiDrDescType value) {
        this.multiDrDesc = value;
    }

    /**
     * Gets the value of the rateSchedDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RateSchedDescType }
     *     
     */
    public RateSchedDescType getRateSchedDesc() {
        return rateSchedDesc;
    }

    /**
     * Sets the value of the rateSchedDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSchedDescType }
     *     
     */
    public void setRateSchedDesc(RateSchedDescType value) {
        this.rateSchedDesc = value;
    }

    /**
     * Gets the value of the intCalcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link IntCalcDescType }
     *     
     */
    public IntCalcDescType getIntCalcDesc() {
        return intCalcDesc;
    }

    /**
     * Sets the value of the intCalcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntCalcDescType }
     *     
     */
    public void setIntCalcDesc(IntCalcDescType value) {
        this.intCalcDesc = value;
    }

    /**
     * Gets the value of the intYrBaseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link IntYrBaseDescType }
     *     
     */
    public IntYrBaseDescType getIntYrBaseDesc() {
        return intYrBaseDesc;
    }

    /**
     * Sets the value of the intYrBaseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntYrBaseDescType }
     *     
     */
    public void setIntYrBaseDesc(IntYrBaseDescType value) {
        this.intYrBaseDesc = value;
    }

    /**
     * Gets the value of the evenPayDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EvenPayDescType }
     *     
     */
    public EvenPayDescType getEvenPayDesc() {
        return evenPayDesc;
    }

    /**
     * Sets the value of the evenPayDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvenPayDescType }
     *     
     */
    public void setEvenPayDesc(EvenPayDescType value) {
        this.evenPayDesc = value;
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
     * Gets the value of the accrIntThruDt property.
     * 
     * @return
     *     possible object is
     *     {@link AccrIntThruDtType }
     *     
     */
    public AccrIntThruDtType getAccrIntThruDt() {
        return accrIntThruDt;
    }

    /**
     * Sets the value of the accrIntThruDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrIntThruDtType }
     *     
     */
    public void setAccrIntThruDt(AccrIntThruDtType value) {
        this.accrIntThruDt = value;
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
     * Gets the value of the annPctYield property.
     * 
     * @return
     *     possible object is
     *     {@link AnnPctYieldType }
     *     
     */
    public AnnPctYieldType getAnnPctYield() {
        return annPctYield;
    }

    /**
     * Sets the value of the annPctYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnPctYieldType }
     *     
     */
    public void setAnnPctYield(AnnPctYieldType value) {
        this.annPctYield = value;
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
     * Gets the value of the dailyAccrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DailyAccrAmtType }
     *     
     */
    public DailyAccrAmtType getDailyAccrAmt() {
        return dailyAccrAmt;
    }

    /**
     * Sets the value of the dailyAccrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyAccrAmtType }
     *     
     */
    public void setDailyAccrAmt(DailyAccrAmtType value) {
        this.dailyAccrAmt = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
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
