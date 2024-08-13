
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for FutXferRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FutXferRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedPrinc" type="{http://jackhenry.com/jxchange/TPG/2008}RedPrinc_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtRcpt" type="{http://jackhenry.com/jxchange/TPG/2008}PrtRcpt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay1" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay1_Type" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay2" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay2_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferFirstDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFirstDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferNextDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferNextDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferSuspStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferSuspStartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferSuspEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferSuspEndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferDayOfMonth_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferFreq" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferFreqUnits" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFreqUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferAmtLTD" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferAmtLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferUseLnAmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferUseLnAmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferUseLnDtCode" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferUseLnDtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferNSFCode" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferNSFCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferLateChgCode" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferLateChgCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EftDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}EftDesc_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="FutXferOccr" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferOccr_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="FutXferMatPmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferMatPmtCode_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="RcptDlvryMthd" type="{http://jackhenry.com/jxchange/TPG/2008}RcptDlvryMthd_Type" minOccurs="0"/&gt;
 *               &lt;element name="PrtPartRcpt" type="{http://jackhenry.com/jxchange/TPG/2008}PrtPartRcpt_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="FutXferDayOfWeek" type="{http://jackhenry.com/jxchange/TPG/2008}DayOfWeek_Type" minOccurs="0"/&gt;
 *                 &lt;element name="FutXferDayOfWeekOccur" type="{http://jackhenry.com/jxchange/TPG/2008}DayOfWeekOccur_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="XferSrcType" type="{http://jackhenry.com/jxchange/TPG/2008}XferSrcType_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="LnUnitId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitId_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="GLTrnDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                       &lt;/sequence&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "FutXferRec_CType", propOrder = {
    "amt",
    "redPrinc",
    "trnCodeCode",
    "prtRcpt",
    "semiDay1",
    "semiDay2",
    "futXferFirstDt",
    "futXferNextDt",
    "futXferExpDt",
    "futXferSuspStartDt",
    "futXferSuspEndDt",
    "futXferDayOfMonth",
    "futXferFreq",
    "futXferFreqUnits",
    "futXferAmtLTD",
    "futXferUseLnAmtCode",
    "futXferUseLnDtCode",
    "futXferNSFCode",
    "futXferLateChgCode",
    "eftDescArray",
    "ver1",
    "futXferOccr",
    "ver2",
    "futXferMatPmtCode",
    "ver3",
    "rcptDlvryMthd",
    "prtPartRcpt",
    "ver4",
    "futXferDayOfWeek",
    "futXferDayOfWeekOccur",
    "ver5",
    "xferSrcType",
    "ver6",
    "lnUnitId",
    "ver7",
    "glTrnDescArray",
    "ver8",
    "any"
})
public class FutXferRecCType {

    @XmlElementRef(name = "Amt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AmtType> amt;
    @XmlElementRef(name = "RedPrinc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RedPrincType> redPrinc;
    @XmlElementRef(name = "TrnCodeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnCodeCodeType> trnCodeCode;
    @XmlElementRef(name = "PrtRcpt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtRcptType> prtRcpt;
    @XmlElementRef(name = "SemiDay1", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SemiDay1Type> semiDay1;
    @XmlElementRef(name = "SemiDay2", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SemiDay2Type> semiDay2;
    @XmlElementRef(name = "FutXferFirstDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferFirstDtType> futXferFirstDt;
    @XmlElementRef(name = "FutXferNextDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferNextDtType> futXferNextDt;
    @XmlElementRef(name = "FutXferExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferExpDtType> futXferExpDt;
    @XmlElementRef(name = "FutXferSuspStartDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferSuspStartDtType> futXferSuspStartDt;
    @XmlElementRef(name = "FutXferSuspEndDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferSuspEndDtType> futXferSuspEndDt;
    @XmlElementRef(name = "FutXferDayOfMonth", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferDayOfMonthType> futXferDayOfMonth;
    @XmlElementRef(name = "FutXferFreq", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferFreqType> futXferFreq;
    @XmlElementRef(name = "FutXferFreqUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferFreqUnitsType> futXferFreqUnits;
    @XmlElementRef(name = "FutXferAmtLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferAmtLTDType> futXferAmtLTD;
    @XmlElementRef(name = "FutXferUseLnAmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferUseLnAmtCodeType> futXferUseLnAmtCode;
    @XmlElementRef(name = "FutXferUseLnDtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferUseLnDtCodeType> futXferUseLnDtCode;
    @XmlElementRef(name = "FutXferNSFCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferNSFCodeType> futXferNSFCode;
    @XmlElementRef(name = "FutXferLateChgCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferLateChgCodeType> futXferLateChgCode;
    @XmlElement(name = "EftDescArray")
    protected EftDescAType eftDescArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "FutXferOccr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferOccrType> futXferOccr;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "FutXferMatPmtCode")
    protected FutXferMatPmtCodeType futXferMatPmtCode;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "RcptDlvryMthd")
    protected RcptDlvryMthdType rcptDlvryMthd;
    @XmlElement(name = "PrtPartRcpt")
    protected PrtPartRcptType prtPartRcpt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "FutXferDayOfWeek")
    protected DayOfWeekType futXferDayOfWeek;
    @XmlElement(name = "FutXferDayOfWeekOccur")
    protected DayOfWeekOccurType futXferDayOfWeekOccur;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "XferSrcType")
    protected XferSrcTypeType xferSrcType;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "LnUnitId")
    protected LnUnitIdType lnUnitId;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "GLTrnDescArray")
    protected RmkAType glTrnDescArray;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmtType }{@code >}
     *     
     */
    public JAXBElement<AmtType> getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmtType }{@code >}
     *     
     */
    public void setAmt(JAXBElement<AmtType> value) {
        this.amt = value;
    }

    /**
     * Gets the value of the redPrinc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RedPrincType }{@code >}
     *     
     */
    public JAXBElement<RedPrincType> getRedPrinc() {
        return redPrinc;
    }

    /**
     * Sets the value of the redPrinc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RedPrincType }{@code >}
     *     
     */
    public void setRedPrinc(JAXBElement<RedPrincType> value) {
        this.redPrinc = value;
    }

    /**
     * Gets the value of the trnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnCodeCodeType }{@code >}
     *     
     */
    public JAXBElement<TrnCodeCodeType> getTrnCodeCode() {
        return trnCodeCode;
    }

    /**
     * Sets the value of the trnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnCodeCodeType }{@code >}
     *     
     */
    public void setTrnCodeCode(JAXBElement<TrnCodeCodeType> value) {
        this.trnCodeCode = value;
    }

    /**
     * Gets the value of the prtRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtRcptType }{@code >}
     *     
     */
    public JAXBElement<PrtRcptType> getPrtRcpt() {
        return prtRcpt;
    }

    /**
     * Sets the value of the prtRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtRcptType }{@code >}
     *     
     */
    public void setPrtRcpt(JAXBElement<PrtRcptType> value) {
        this.prtRcpt = value;
    }

    /**
     * Gets the value of the semiDay1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}
     *     
     */
    public JAXBElement<SemiDay1Type> getSemiDay1() {
        return semiDay1;
    }

    /**
     * Sets the value of the semiDay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}
     *     
     */
    public void setSemiDay1(JAXBElement<SemiDay1Type> value) {
        this.semiDay1 = value;
    }

    /**
     * Gets the value of the semiDay2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}
     *     
     */
    public JAXBElement<SemiDay2Type> getSemiDay2() {
        return semiDay2;
    }

    /**
     * Sets the value of the semiDay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}
     *     
     */
    public void setSemiDay2(JAXBElement<SemiDay2Type> value) {
        this.semiDay2 = value;
    }

    /**
     * Gets the value of the futXferFirstDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferFirstDtType }{@code >}
     *     
     */
    public JAXBElement<FutXferFirstDtType> getFutXferFirstDt() {
        return futXferFirstDt;
    }

    /**
     * Sets the value of the futXferFirstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferFirstDtType }{@code >}
     *     
     */
    public void setFutXferFirstDt(JAXBElement<FutXferFirstDtType> value) {
        this.futXferFirstDt = value;
    }

    /**
     * Gets the value of the futXferNextDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferNextDtType }{@code >}
     *     
     */
    public JAXBElement<FutXferNextDtType> getFutXferNextDt() {
        return futXferNextDt;
    }

    /**
     * Sets the value of the futXferNextDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferNextDtType }{@code >}
     *     
     */
    public void setFutXferNextDt(JAXBElement<FutXferNextDtType> value) {
        this.futXferNextDt = value;
    }

    /**
     * Gets the value of the futXferExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferExpDtType }{@code >}
     *     
     */
    public JAXBElement<FutXferExpDtType> getFutXferExpDt() {
        return futXferExpDt;
    }

    /**
     * Sets the value of the futXferExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferExpDtType }{@code >}
     *     
     */
    public void setFutXferExpDt(JAXBElement<FutXferExpDtType> value) {
        this.futXferExpDt = value;
    }

    /**
     * Gets the value of the futXferSuspStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferSuspStartDtType }{@code >}
     *     
     */
    public JAXBElement<FutXferSuspStartDtType> getFutXferSuspStartDt() {
        return futXferSuspStartDt;
    }

    /**
     * Sets the value of the futXferSuspStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferSuspStartDtType }{@code >}
     *     
     */
    public void setFutXferSuspStartDt(JAXBElement<FutXferSuspStartDtType> value) {
        this.futXferSuspStartDt = value;
    }

    /**
     * Gets the value of the futXferSuspEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferSuspEndDtType }{@code >}
     *     
     */
    public JAXBElement<FutXferSuspEndDtType> getFutXferSuspEndDt() {
        return futXferSuspEndDt;
    }

    /**
     * Sets the value of the futXferSuspEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferSuspEndDtType }{@code >}
     *     
     */
    public void setFutXferSuspEndDt(JAXBElement<FutXferSuspEndDtType> value) {
        this.futXferSuspEndDt = value;
    }

    /**
     * Gets the value of the futXferDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferDayOfMonthType }{@code >}
     *     
     */
    public JAXBElement<FutXferDayOfMonthType> getFutXferDayOfMonth() {
        return futXferDayOfMonth;
    }

    /**
     * Sets the value of the futXferDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferDayOfMonthType }{@code >}
     *     
     */
    public void setFutXferDayOfMonth(JAXBElement<FutXferDayOfMonthType> value) {
        this.futXferDayOfMonth = value;
    }

    /**
     * Gets the value of the futXferFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferFreqType }{@code >}
     *     
     */
    public JAXBElement<FutXferFreqType> getFutXferFreq() {
        return futXferFreq;
    }

    /**
     * Sets the value of the futXferFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferFreqType }{@code >}
     *     
     */
    public void setFutXferFreq(JAXBElement<FutXferFreqType> value) {
        this.futXferFreq = value;
    }

    /**
     * Gets the value of the futXferFreqUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferFreqUnitsType }{@code >}
     *     
     */
    public JAXBElement<FutXferFreqUnitsType> getFutXferFreqUnits() {
        return futXferFreqUnits;
    }

    /**
     * Sets the value of the futXferFreqUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferFreqUnitsType }{@code >}
     *     
     */
    public void setFutXferFreqUnits(JAXBElement<FutXferFreqUnitsType> value) {
        this.futXferFreqUnits = value;
    }

    /**
     * Gets the value of the futXferAmtLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferAmtLTDType }{@code >}
     *     
     */
    public JAXBElement<FutXferAmtLTDType> getFutXferAmtLTD() {
        return futXferAmtLTD;
    }

    /**
     * Sets the value of the futXferAmtLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferAmtLTDType }{@code >}
     *     
     */
    public void setFutXferAmtLTD(JAXBElement<FutXferAmtLTDType> value) {
        this.futXferAmtLTD = value;
    }

    /**
     * Gets the value of the futXferUseLnAmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferUseLnAmtCodeType }{@code >}
     *     
     */
    public JAXBElement<FutXferUseLnAmtCodeType> getFutXferUseLnAmtCode() {
        return futXferUseLnAmtCode;
    }

    /**
     * Sets the value of the futXferUseLnAmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferUseLnAmtCodeType }{@code >}
     *     
     */
    public void setFutXferUseLnAmtCode(JAXBElement<FutXferUseLnAmtCodeType> value) {
        this.futXferUseLnAmtCode = value;
    }

    /**
     * Gets the value of the futXferUseLnDtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferUseLnDtCodeType }{@code >}
     *     
     */
    public JAXBElement<FutXferUseLnDtCodeType> getFutXferUseLnDtCode() {
        return futXferUseLnDtCode;
    }

    /**
     * Sets the value of the futXferUseLnDtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferUseLnDtCodeType }{@code >}
     *     
     */
    public void setFutXferUseLnDtCode(JAXBElement<FutXferUseLnDtCodeType> value) {
        this.futXferUseLnDtCode = value;
    }

    /**
     * Gets the value of the futXferNSFCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferNSFCodeType }{@code >}
     *     
     */
    public JAXBElement<FutXferNSFCodeType> getFutXferNSFCode() {
        return futXferNSFCode;
    }

    /**
     * Sets the value of the futXferNSFCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferNSFCodeType }{@code >}
     *     
     */
    public void setFutXferNSFCode(JAXBElement<FutXferNSFCodeType> value) {
        this.futXferNSFCode = value;
    }

    /**
     * Gets the value of the futXferLateChgCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferLateChgCodeType }{@code >}
     *     
     */
    public JAXBElement<FutXferLateChgCodeType> getFutXferLateChgCode() {
        return futXferLateChgCode;
    }

    /**
     * Sets the value of the futXferLateChgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferLateChgCodeType }{@code >}
     *     
     */
    public void setFutXferLateChgCode(JAXBElement<FutXferLateChgCodeType> value) {
        this.futXferLateChgCode = value;
    }

    /**
     * Gets the value of the eftDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link EftDescAType }
     *     
     */
    public EftDescAType getEftDescArray() {
        return eftDescArray;
    }

    /**
     * Sets the value of the eftDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EftDescAType }
     *     
     */
    public void setEftDescArray(EftDescAType value) {
        this.eftDescArray = value;
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
     * Gets the value of the futXferOccr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferOccrType }{@code >}
     *     
     */
    public JAXBElement<FutXferOccrType> getFutXferOccr() {
        return futXferOccr;
    }

    /**
     * Sets the value of the futXferOccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferOccrType }{@code >}
     *     
     */
    public void setFutXferOccr(JAXBElement<FutXferOccrType> value) {
        this.futXferOccr = value;
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
     * Gets the value of the futXferMatPmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferMatPmtCodeType }
     *     
     */
    public FutXferMatPmtCodeType getFutXferMatPmtCode() {
        return futXferMatPmtCode;
    }

    /**
     * Sets the value of the futXferMatPmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferMatPmtCodeType }
     *     
     */
    public void setFutXferMatPmtCode(FutXferMatPmtCodeType value) {
        this.futXferMatPmtCode = value;
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
     * Gets the value of the rcptDlvryMthd property.
     * 
     * @return
     *     possible object is
     *     {@link RcptDlvryMthdType }
     *     
     */
    public RcptDlvryMthdType getRcptDlvryMthd() {
        return rcptDlvryMthd;
    }

    /**
     * Sets the value of the rcptDlvryMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RcptDlvryMthdType }
     *     
     */
    public void setRcptDlvryMthd(RcptDlvryMthdType value) {
        this.rcptDlvryMthd = value;
    }

    /**
     * Gets the value of the prtPartRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PrtPartRcptType }
     *     
     */
    public PrtPartRcptType getPrtPartRcpt() {
        return prtPartRcpt;
    }

    /**
     * Sets the value of the prtPartRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtPartRcptType }
     *     
     */
    public void setPrtPartRcpt(PrtPartRcptType value) {
        this.prtPartRcpt = value;
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
     * Gets the value of the futXferDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getFutXferDayOfWeek() {
        return futXferDayOfWeek;
    }

    /**
     * Sets the value of the futXferDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setFutXferDayOfWeek(DayOfWeekType value) {
        this.futXferDayOfWeek = value;
    }

    /**
     * Gets the value of the futXferDayOfWeekOccur property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekOccurType }
     *     
     */
    public DayOfWeekOccurType getFutXferDayOfWeekOccur() {
        return futXferDayOfWeekOccur;
    }

    /**
     * Sets the value of the futXferDayOfWeekOccur property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekOccurType }
     *     
     */
    public void setFutXferDayOfWeekOccur(DayOfWeekOccurType value) {
        this.futXferDayOfWeekOccur = value;
    }

    /**
     * Gets the value of the ver5 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver5CType }
     *     
     */
    public Ver5CType getVer5() {
        return ver5;
    }

    /**
     * Sets the value of the ver5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver5CType }
     *     
     */
    public void setVer5(Ver5CType value) {
        this.ver5 = value;
    }

    /**
     * Gets the value of the xferSrcType property.
     * 
     * @return
     *     possible object is
     *     {@link XferSrcTypeType }
     *     
     */
    public XferSrcTypeType getXferSrcType() {
        return xferSrcType;
    }

    /**
     * Sets the value of the xferSrcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferSrcTypeType }
     *     
     */
    public void setXferSrcType(XferSrcTypeType value) {
        this.xferSrcType = value;
    }

    /**
     * Gets the value of the ver6 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver6CType }
     *     
     */
    public Ver6CType getVer6() {
        return ver6;
    }

    /**
     * Sets the value of the ver6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver6CType }
     *     
     */
    public void setVer6(Ver6CType value) {
        this.ver6 = value;
    }

    /**
     * Gets the value of the lnUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitIdType }
     *     
     */
    public LnUnitIdType getLnUnitId() {
        return lnUnitId;
    }

    /**
     * Sets the value of the lnUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitIdType }
     *     
     */
    public void setLnUnitId(LnUnitIdType value) {
        this.lnUnitId = value;
    }

    /**
     * Gets the value of the ver7 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver7CType }
     *     
     */
    public Ver7CType getVer7() {
        return ver7;
    }

    /**
     * Sets the value of the ver7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver7CType }
     *     
     */
    public void setVer7(Ver7CType value) {
        this.ver7 = value;
    }

    /**
     * Gets the value of the glTrnDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getGLTrnDescArray() {
        return glTrnDescArray;
    }

    /**
     * Sets the value of the glTrnDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setGLTrnDescArray(RmkAType value) {
        this.glTrnDescArray = value;
    }

    /**
     * Gets the value of the ver8 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver8CType }
     *     
     */
    public Ver8CType getVer8() {
        return ver8;
    }

    /**
     * Sets the value of the ver8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver8CType }
     *     
     */
    public void setVer8(Ver8CType value) {
        this.ver8 = value;
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
