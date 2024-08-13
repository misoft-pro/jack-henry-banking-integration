
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
 * <p>Java class for WireSchedRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireSchedRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay1" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay1_Type" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay2" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay2_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedFirstDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFirstDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedNextDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferNextDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferDayOfMonth_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedFreq" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedFreqUnits" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFreqUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedDayOfWeek" type="{http://jackhenry.com/jxchange/TPG/2008}DayOfWeek_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedDayOfWeekOccur" type="{http://jackhenry.com/jxchange/TPG/2008}DayOfWeekOccur_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedStat" type="{http://jackhenry.com/jxchange/TPG/2008}WireSchedStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireInitDt" type="{http://jackhenry.com/jxchange/TPG/2008}WireInitDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireInitTime" type="{http://jackhenry.com/jxchange/TPG/2008}WireInitTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "WireSchedRec_CType", propOrder = {
    "amt",
    "semiDay1",
    "semiDay2",
    "wireSchedFirstDt",
    "wireSchedNextDt",
    "wireSchedExpDt",
    "wireSchedDayOfMonth",
    "wireSchedFreq",
    "wireSchedFreqUnits",
    "wireSchedDayOfWeek",
    "wireSchedDayOfWeekOccur",
    "wireSchedStat",
    "wireInitDt",
    "wireInitTime",
    "intnetFinInstId",
    "ver1",
    "any"
})
public class WireSchedRecCType {

    @XmlElement(name = "Amt")
    protected AmtType amt;
    @XmlElement(name = "SemiDay1")
    protected SemiDay1Type semiDay1;
    @XmlElement(name = "SemiDay2")
    protected SemiDay2Type semiDay2;
    @XmlElement(name = "WireSchedFirstDt")
    protected FutXferFirstDtType wireSchedFirstDt;
    @XmlElement(name = "WireSchedNextDt")
    protected FutXferNextDtType wireSchedNextDt;
    @XmlElement(name = "WireSchedExpDt")
    protected FutXferExpDtType wireSchedExpDt;
    @XmlElement(name = "WireSchedDayOfMonth")
    protected FutXferDayOfMonthType wireSchedDayOfMonth;
    @XmlElement(name = "WireSchedFreq")
    protected FutXferFreqType wireSchedFreq;
    @XmlElement(name = "WireSchedFreqUnits")
    protected FutXferFreqUnitsType wireSchedFreqUnits;
    @XmlElement(name = "WireSchedDayOfWeek")
    protected DayOfWeekType wireSchedDayOfWeek;
    @XmlElement(name = "WireSchedDayOfWeekOccur")
    protected DayOfWeekOccurType wireSchedDayOfWeekOccur;
    @XmlElement(name = "WireSchedStat")
    protected WireSchedStatType wireSchedStat;
    @XmlElement(name = "WireInitDt")
    protected WireInitDtType wireInitDt;
    @XmlElement(name = "WireInitTime")
    protected WireInitTimeType wireInitTime;
    @XmlElement(name = "IntnetFinInstId")
    protected IntnetFinInstIdType intnetFinInstId;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setAmt(AmtType value) {
        this.amt = value;
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
     * Gets the value of the wireSchedFirstDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferFirstDtType }
     *     
     */
    public FutXferFirstDtType getWireSchedFirstDt() {
        return wireSchedFirstDt;
    }

    /**
     * Sets the value of the wireSchedFirstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferFirstDtType }
     *     
     */
    public void setWireSchedFirstDt(FutXferFirstDtType value) {
        this.wireSchedFirstDt = value;
    }

    /**
     * Gets the value of the wireSchedNextDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferNextDtType }
     *     
     */
    public FutXferNextDtType getWireSchedNextDt() {
        return wireSchedNextDt;
    }

    /**
     * Sets the value of the wireSchedNextDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferNextDtType }
     *     
     */
    public void setWireSchedNextDt(FutXferNextDtType value) {
        this.wireSchedNextDt = value;
    }

    /**
     * Gets the value of the wireSchedExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferExpDtType }
     *     
     */
    public FutXferExpDtType getWireSchedExpDt() {
        return wireSchedExpDt;
    }

    /**
     * Sets the value of the wireSchedExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferExpDtType }
     *     
     */
    public void setWireSchedExpDt(FutXferExpDtType value) {
        this.wireSchedExpDt = value;
    }

    /**
     * Gets the value of the wireSchedDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferDayOfMonthType }
     *     
     */
    public FutXferDayOfMonthType getWireSchedDayOfMonth() {
        return wireSchedDayOfMonth;
    }

    /**
     * Sets the value of the wireSchedDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferDayOfMonthType }
     *     
     */
    public void setWireSchedDayOfMonth(FutXferDayOfMonthType value) {
        this.wireSchedDayOfMonth = value;
    }

    /**
     * Gets the value of the wireSchedFreq property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferFreqType }
     *     
     */
    public FutXferFreqType getWireSchedFreq() {
        return wireSchedFreq;
    }

    /**
     * Sets the value of the wireSchedFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferFreqType }
     *     
     */
    public void setWireSchedFreq(FutXferFreqType value) {
        this.wireSchedFreq = value;
    }

    /**
     * Gets the value of the wireSchedFreqUnits property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferFreqUnitsType }
     *     
     */
    public FutXferFreqUnitsType getWireSchedFreqUnits() {
        return wireSchedFreqUnits;
    }

    /**
     * Sets the value of the wireSchedFreqUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferFreqUnitsType }
     *     
     */
    public void setWireSchedFreqUnits(FutXferFreqUnitsType value) {
        this.wireSchedFreqUnits = value;
    }

    /**
     * Gets the value of the wireSchedDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getWireSchedDayOfWeek() {
        return wireSchedDayOfWeek;
    }

    /**
     * Sets the value of the wireSchedDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setWireSchedDayOfWeek(DayOfWeekType value) {
        this.wireSchedDayOfWeek = value;
    }

    /**
     * Gets the value of the wireSchedDayOfWeekOccur property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekOccurType }
     *     
     */
    public DayOfWeekOccurType getWireSchedDayOfWeekOccur() {
        return wireSchedDayOfWeekOccur;
    }

    /**
     * Sets the value of the wireSchedDayOfWeekOccur property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekOccurType }
     *     
     */
    public void setWireSchedDayOfWeekOccur(DayOfWeekOccurType value) {
        this.wireSchedDayOfWeekOccur = value;
    }

    /**
     * Gets the value of the wireSchedStat property.
     * 
     * @return
     *     possible object is
     *     {@link WireSchedStatType }
     *     
     */
    public WireSchedStatType getWireSchedStat() {
        return wireSchedStat;
    }

    /**
     * Sets the value of the wireSchedStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireSchedStatType }
     *     
     */
    public void setWireSchedStat(WireSchedStatType value) {
        this.wireSchedStat = value;
    }

    /**
     * Gets the value of the wireInitDt property.
     * 
     * @return
     *     possible object is
     *     {@link WireInitDtType }
     *     
     */
    public WireInitDtType getWireInitDt() {
        return wireInitDt;
    }

    /**
     * Sets the value of the wireInitDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireInitDtType }
     *     
     */
    public void setWireInitDt(WireInitDtType value) {
        this.wireInitDt = value;
    }

    /**
     * Gets the value of the wireInitTime property.
     * 
     * @return
     *     possible object is
     *     {@link WireInitTimeType }
     *     
     */
    public WireInitTimeType getWireInitTime() {
        return wireInitTime;
    }

    /**
     * Sets the value of the wireInitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireInitTimeType }
     *     
     */
    public void setWireInitTime(WireInitTimeType value) {
        this.wireInitTime = value;
    }

    /**
     * Gets the value of the intnetFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetFinInstIdType }
     *     
     */
    public IntnetFinInstIdType getIntnetFinInstId() {
        return intnetFinInstId;
    }

    /**
     * Sets the value of the intnetFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetFinInstIdType }
     *     
     */
    public void setIntnetFinInstId(IntnetFinInstIdType value) {
        this.intnetFinInstId = value;
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
