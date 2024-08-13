
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
 * <p>Java class for SvcFeeInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcFeeInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcFeeChgDt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeChgDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeFreq" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeFreqUnits" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeFreqUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeDayOfMonth_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeType" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeWavCnt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeWavCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeStat" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeCycCnt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeCycCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeCycAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeCycAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeMTDCnt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeMTDCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeMTDAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeMTDAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeQTDCnt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeQTDCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeQTDAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeQTDAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeYTDCnt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeYTDCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeYTDAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeYTDAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeLTDCnt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeLTDCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeLTDAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeLTDAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "SvcFeeInfo_CType", propOrder = {
    "svcFeeChgDt",
    "svcFeeFreq",
    "svcFeeFreqUnits",
    "svcFeeDayOfMonth",
    "svcFeeExpDt",
    "svcFeeType",
    "svcFeeWavCnt",
    "svcFeeStat",
    "svcFeeCycCnt",
    "svcFeeCycAmt",
    "svcFeeMTDCnt",
    "svcFeeMTDAmt",
    "svcFeeQTDCnt",
    "svcFeeQTDAmt",
    "svcFeeYTDCnt",
    "svcFeeYTDAmt",
    "svcFeeLTDCnt",
    "svcFeeLTDAmt",
    "ver1",
    "any"
})
public class SvcFeeInfoCType {

    @XmlElement(name = "SvcFeeChgDt")
    protected SvcFeeChgDtType svcFeeChgDt;
    @XmlElement(name = "SvcFeeFreq")
    protected SvcFeeFreqType svcFeeFreq;
    @XmlElement(name = "SvcFeeFreqUnits")
    protected SvcFeeFreqUnitsType svcFeeFreqUnits;
    @XmlElement(name = "SvcFeeDayOfMonth")
    protected SvcFeeDayOfMonthType svcFeeDayOfMonth;
    @XmlElement(name = "SvcFeeExpDt")
    protected ExpDtType svcFeeExpDt;
    @XmlElement(name = "SvcFeeType")
    protected SvcFeeTypeType svcFeeType;
    @XmlElement(name = "SvcFeeWavCnt")
    protected SvcFeeWavCntType svcFeeWavCnt;
    @XmlElement(name = "SvcFeeStat")
    protected SvcFeeStatType svcFeeStat;
    @XmlElement(name = "SvcFeeCycCnt")
    protected SvcFeeCycCntType svcFeeCycCnt;
    @XmlElement(name = "SvcFeeCycAmt")
    protected SvcFeeCycAmtType svcFeeCycAmt;
    @XmlElement(name = "SvcFeeMTDCnt")
    protected SvcFeeMTDCntType svcFeeMTDCnt;
    @XmlElement(name = "SvcFeeMTDAmt")
    protected SvcFeeMTDAmtType svcFeeMTDAmt;
    @XmlElement(name = "SvcFeeQTDCnt")
    protected SvcFeeQTDCntType svcFeeQTDCnt;
    @XmlElement(name = "SvcFeeQTDAmt")
    protected SvcFeeQTDAmtType svcFeeQTDAmt;
    @XmlElement(name = "SvcFeeYTDCnt")
    protected SvcFeeYTDCntType svcFeeYTDCnt;
    @XmlElement(name = "SvcFeeYTDAmt")
    protected SvcFeeYTDAmtType svcFeeYTDAmt;
    @XmlElement(name = "SvcFeeLTDCnt")
    protected SvcFeeLTDCntType svcFeeLTDCnt;
    @XmlElement(name = "SvcFeeLTDAmt")
    protected SvcFeeLTDAmtType svcFeeLTDAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the svcFeeChgDt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeChgDtType }
     *     
     */
    public SvcFeeChgDtType getSvcFeeChgDt() {
        return svcFeeChgDt;
    }

    /**
     * Sets the value of the svcFeeChgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeChgDtType }
     *     
     */
    public void setSvcFeeChgDt(SvcFeeChgDtType value) {
        this.svcFeeChgDt = value;
    }

    /**
     * Gets the value of the svcFeeFreq property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeFreqType }
     *     
     */
    public SvcFeeFreqType getSvcFeeFreq() {
        return svcFeeFreq;
    }

    /**
     * Sets the value of the svcFeeFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeFreqType }
     *     
     */
    public void setSvcFeeFreq(SvcFeeFreqType value) {
        this.svcFeeFreq = value;
    }

    /**
     * Gets the value of the svcFeeFreqUnits property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeFreqUnitsType }
     *     
     */
    public SvcFeeFreqUnitsType getSvcFeeFreqUnits() {
        return svcFeeFreqUnits;
    }

    /**
     * Sets the value of the svcFeeFreqUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeFreqUnitsType }
     *     
     */
    public void setSvcFeeFreqUnits(SvcFeeFreqUnitsType value) {
        this.svcFeeFreqUnits = value;
    }

    /**
     * Gets the value of the svcFeeDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeDayOfMonthType }
     *     
     */
    public SvcFeeDayOfMonthType getSvcFeeDayOfMonth() {
        return svcFeeDayOfMonth;
    }

    /**
     * Sets the value of the svcFeeDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeDayOfMonthType }
     *     
     */
    public void setSvcFeeDayOfMonth(SvcFeeDayOfMonthType value) {
        this.svcFeeDayOfMonth = value;
    }

    /**
     * Gets the value of the svcFeeExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getSvcFeeExpDt() {
        return svcFeeExpDt;
    }

    /**
     * Sets the value of the svcFeeExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setSvcFeeExpDt(ExpDtType value) {
        this.svcFeeExpDt = value;
    }

    /**
     * Gets the value of the svcFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeTypeType }
     *     
     */
    public SvcFeeTypeType getSvcFeeType() {
        return svcFeeType;
    }

    /**
     * Sets the value of the svcFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeTypeType }
     *     
     */
    public void setSvcFeeType(SvcFeeTypeType value) {
        this.svcFeeType = value;
    }

    /**
     * Gets the value of the svcFeeWavCnt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeWavCntType }
     *     
     */
    public SvcFeeWavCntType getSvcFeeWavCnt() {
        return svcFeeWavCnt;
    }

    /**
     * Sets the value of the svcFeeWavCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeWavCntType }
     *     
     */
    public void setSvcFeeWavCnt(SvcFeeWavCntType value) {
        this.svcFeeWavCnt = value;
    }

    /**
     * Gets the value of the svcFeeStat property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeStatType }
     *     
     */
    public SvcFeeStatType getSvcFeeStat() {
        return svcFeeStat;
    }

    /**
     * Sets the value of the svcFeeStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeStatType }
     *     
     */
    public void setSvcFeeStat(SvcFeeStatType value) {
        this.svcFeeStat = value;
    }

    /**
     * Gets the value of the svcFeeCycCnt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeCycCntType }
     *     
     */
    public SvcFeeCycCntType getSvcFeeCycCnt() {
        return svcFeeCycCnt;
    }

    /**
     * Sets the value of the svcFeeCycCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeCycCntType }
     *     
     */
    public void setSvcFeeCycCnt(SvcFeeCycCntType value) {
        this.svcFeeCycCnt = value;
    }

    /**
     * Gets the value of the svcFeeCycAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeCycAmtType }
     *     
     */
    public SvcFeeCycAmtType getSvcFeeCycAmt() {
        return svcFeeCycAmt;
    }

    /**
     * Sets the value of the svcFeeCycAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeCycAmtType }
     *     
     */
    public void setSvcFeeCycAmt(SvcFeeCycAmtType value) {
        this.svcFeeCycAmt = value;
    }

    /**
     * Gets the value of the svcFeeMTDCnt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeMTDCntType }
     *     
     */
    public SvcFeeMTDCntType getSvcFeeMTDCnt() {
        return svcFeeMTDCnt;
    }

    /**
     * Sets the value of the svcFeeMTDCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeMTDCntType }
     *     
     */
    public void setSvcFeeMTDCnt(SvcFeeMTDCntType value) {
        this.svcFeeMTDCnt = value;
    }

    /**
     * Gets the value of the svcFeeMTDAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeMTDAmtType }
     *     
     */
    public SvcFeeMTDAmtType getSvcFeeMTDAmt() {
        return svcFeeMTDAmt;
    }

    /**
     * Sets the value of the svcFeeMTDAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeMTDAmtType }
     *     
     */
    public void setSvcFeeMTDAmt(SvcFeeMTDAmtType value) {
        this.svcFeeMTDAmt = value;
    }

    /**
     * Gets the value of the svcFeeQTDCnt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeQTDCntType }
     *     
     */
    public SvcFeeQTDCntType getSvcFeeQTDCnt() {
        return svcFeeQTDCnt;
    }

    /**
     * Sets the value of the svcFeeQTDCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeQTDCntType }
     *     
     */
    public void setSvcFeeQTDCnt(SvcFeeQTDCntType value) {
        this.svcFeeQTDCnt = value;
    }

    /**
     * Gets the value of the svcFeeQTDAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeQTDAmtType }
     *     
     */
    public SvcFeeQTDAmtType getSvcFeeQTDAmt() {
        return svcFeeQTDAmt;
    }

    /**
     * Sets the value of the svcFeeQTDAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeQTDAmtType }
     *     
     */
    public void setSvcFeeQTDAmt(SvcFeeQTDAmtType value) {
        this.svcFeeQTDAmt = value;
    }

    /**
     * Gets the value of the svcFeeYTDCnt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeYTDCntType }
     *     
     */
    public SvcFeeYTDCntType getSvcFeeYTDCnt() {
        return svcFeeYTDCnt;
    }

    /**
     * Sets the value of the svcFeeYTDCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeYTDCntType }
     *     
     */
    public void setSvcFeeYTDCnt(SvcFeeYTDCntType value) {
        this.svcFeeYTDCnt = value;
    }

    /**
     * Gets the value of the svcFeeYTDAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeYTDAmtType }
     *     
     */
    public SvcFeeYTDAmtType getSvcFeeYTDAmt() {
        return svcFeeYTDAmt;
    }

    /**
     * Sets the value of the svcFeeYTDAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeYTDAmtType }
     *     
     */
    public void setSvcFeeYTDAmt(SvcFeeYTDAmtType value) {
        this.svcFeeYTDAmt = value;
    }

    /**
     * Gets the value of the svcFeeLTDCnt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeLTDCntType }
     *     
     */
    public SvcFeeLTDCntType getSvcFeeLTDCnt() {
        return svcFeeLTDCnt;
    }

    /**
     * Sets the value of the svcFeeLTDCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeLTDCntType }
     *     
     */
    public void setSvcFeeLTDCnt(SvcFeeLTDCntType value) {
        this.svcFeeLTDCnt = value;
    }

    /**
     * Gets the value of the svcFeeLTDAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeLTDAmtType }
     *     
     */
    public SvcFeeLTDAmtType getSvcFeeLTDAmt() {
        return svcFeeLTDAmt;
    }

    /**
     * Sets the value of the svcFeeLTDAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeLTDAmtType }
     *     
     */
    public void setSvcFeeLTDAmt(SvcFeeLTDAmtType value) {
        this.svcFeeLTDAmt = value;
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
