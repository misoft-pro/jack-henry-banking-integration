
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
 * <p>Java class for TimeDepRateIntInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDepRateIntInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="YTDInt" type="{http://jackhenry.com/jxchange/TPG/2008}YTDInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastYrInt" type="{http://jackhenry.com/jxchange/TPG/2008}LastYrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastInt" type="{http://jackhenry.com/jxchange/TPG/2008}LastInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtInt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPayDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntDisp" type="{http://jackhenry.com/jxchange/TPG/2008}IntDisp_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntDispAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}IntDispAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntDispAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}IntDispAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntYrBaseCode" type="{http://jackhenry.com/jxchange/TPG/2008}IntYrBaseCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntCalcCode" type="{http://jackhenry.com/jxchange/TPG/2008}IntCalcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntTerm" type="{http://jackhenry.com/jxchange/TPG/2008}IntTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}IntTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="EvenPayCode" type="{http://jackhenry.com/jxchange/TPG/2008}EvenPayCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="VarIntRateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}VarIntRateInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="IntDayMonth" type="{http://jackhenry.com/jxchange/TPG/2008}IntDayMonth_Type" minOccurs="0"/&gt;
 *         &lt;element name="CombIntChkCode" type="{http://jackhenry.com/jxchange/TPG/2008}CombIntChkCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CombIntChkCustId" type="{http://jackhenry.com/jxchange/TPG/2008}CombIntChkCustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayAllIntCode" type="{http://jackhenry.com/jxchange/TPG/2008}PayAllIntCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntPmtDtCode" type="{http://jackhenry.com/jxchange/TPG/2008}IntPmtDtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MultiRateCode" type="{http://jackhenry.com/jxchange/TPG/2008}MultiRateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MultiDrCode" type="{http://jackhenry.com/jxchange/TPG/2008}MultiDrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateSchedCode" type="{http://jackhenry.com/jxchange/TPG/2008}RateSchedCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="StepUpIntRateInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}StepUpIntRateInfoArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="TeaserRate" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRate_Type" minOccurs="0"/&gt;
 *             &lt;element name="TeaserRateEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateEffDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="TeaserRateExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateExpDt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="DlyDayFinalIntPmt" type="{http://jackhenry.com/jxchange/TPG/2008}DlyDayFinalIntPmt_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="MTDAccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}MTDAccrInt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="MTDAccrDays" type="{http://jackhenry.com/jxchange/TPG/2008}MTDAccrDays_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="MultiDepRateArray" type="{http://jackhenry.com/jxchange/TPG/2008}MultiDepRateArray_AType" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TimeDepRateIntInfo_CType", propOrder = {
    "ytdInt",
    "lastYrInt",
    "lastInt",
    "nxtInt",
    "intRate",
    "lastPayDt",
    "nxtPayDt",
    "intDisp",
    "intDispAcctId",
    "intDispAcctType",
    "intYrBaseCode",
    "intCalcCode",
    "intTerm",
    "intTermUnits",
    "evenPayCode",
    "varIntRateInfo",
    "intDayMonth",
    "combIntChkCode",
    "combIntChkCustId",
    "payAllIntCode",
    "intPmtDtCode",
    "multiRateCode",
    "multiDrCode",
    "rateSchedCode",
    "ver1",
    "stepUpIntRateInfoArray",
    "ver2",
    "teaserRate",
    "teaserRateEffDt",
    "teaserRateExpDt",
    "ver3",
    "dlyDayFinalIntPmt",
    "ver4",
    "mtdAccrInt",
    "mtdAccrDays",
    "ver5",
    "multiDepRateArray",
    "ver6",
    "any"
})
public class TimeDepRateIntInfoCType {

    @XmlElementRef(name = "YTDInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<YTDIntType> ytdInt;
    @XmlElementRef(name = "LastYrInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastYrIntType> lastYrInt;
    @XmlElementRef(name = "LastInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastIntType> lastInt;
    @XmlElementRef(name = "NxtInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NxtIntType> nxtInt;
    @XmlElementRef(name = "IntRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntRateType> intRate;
    @XmlElementRef(name = "LastPayDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastPayDtType> lastPayDt;
    @XmlElementRef(name = "NxtPayDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NxtPayDtType> nxtPayDt;
    @XmlElementRef(name = "IntDisp", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntDispType> intDisp;
    @XmlElementRef(name = "IntDispAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntDispAcctIdType> intDispAcctId;
    @XmlElementRef(name = "IntDispAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntDispAcctTypeType> intDispAcctType;
    @XmlElementRef(name = "IntYrBaseCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntYrBaseCodeType> intYrBaseCode;
    @XmlElementRef(name = "IntCalcCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntCalcCodeType> intCalcCode;
    @XmlElementRef(name = "IntTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntTermType> intTerm;
    @XmlElementRef(name = "IntTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntTermUnitsType> intTermUnits;
    @XmlElementRef(name = "EvenPayCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EvenPayCodeType> evenPayCode;
    @XmlElement(name = "VarIntRateInfo")
    protected VarIntRateInfoCType varIntRateInfo;
    @XmlElementRef(name = "IntDayMonth", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntDayMonthType> intDayMonth;
    @XmlElementRef(name = "CombIntChkCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CombIntChkCodeType> combIntChkCode;
    @XmlElementRef(name = "CombIntChkCustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CombIntChkCustIdType> combIntChkCustId;
    @XmlElementRef(name = "PayAllIntCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PayAllIntCodeType> payAllIntCode;
    @XmlElementRef(name = "IntPmtDtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntPmtDtCodeType> intPmtDtCode;
    @XmlElementRef(name = "MultiRateCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiRateCodeType> multiRateCode;
    @XmlElementRef(name = "MultiDrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiDrCodeType> multiDrCode;
    @XmlElementRef(name = "RateSchedCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateSchedCodeType> rateSchedCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "StepUpIntRateInfoArray")
    protected StepUpIntRateInfoArrayAType stepUpIntRateInfoArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "TeaserRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TeaserRateType> teaserRate;
    @XmlElementRef(name = "TeaserRateEffDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TeaserRateEffDtType> teaserRateEffDt;
    @XmlElementRef(name = "TeaserRateExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TeaserRateExpDtType> teaserRateExpDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "DlyDayFinalIntPmt")
    protected DlyDayFinalIntPmtType dlyDayFinalIntPmt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "MTDAccrInt")
    protected MTDAccrIntType mtdAccrInt;
    @XmlElement(name = "MTDAccrDays")
    protected MTDAccrDaysType mtdAccrDays;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "MultiDepRateArray")
    protected MultiDepRateArrayAType multiDepRateArray;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the ytdInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YTDIntType }{@code >}
     *     
     */
    public JAXBElement<YTDIntType> getYTDInt() {
        return ytdInt;
    }

    /**
     * Sets the value of the ytdInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YTDIntType }{@code >}
     *     
     */
    public void setYTDInt(JAXBElement<YTDIntType> value) {
        this.ytdInt = value;
    }

    /**
     * Gets the value of the lastYrInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastYrIntType }{@code >}
     *     
     */
    public JAXBElement<LastYrIntType> getLastYrInt() {
        return lastYrInt;
    }

    /**
     * Sets the value of the lastYrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastYrIntType }{@code >}
     *     
     */
    public void setLastYrInt(JAXBElement<LastYrIntType> value) {
        this.lastYrInt = value;
    }

    /**
     * Gets the value of the lastInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastIntType }{@code >}
     *     
     */
    public JAXBElement<LastIntType> getLastInt() {
        return lastInt;
    }

    /**
     * Sets the value of the lastInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastIntType }{@code >}
     *     
     */
    public void setLastInt(JAXBElement<LastIntType> value) {
        this.lastInt = value;
    }

    /**
     * Gets the value of the nxtInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NxtIntType }{@code >}
     *     
     */
    public JAXBElement<NxtIntType> getNxtInt() {
        return nxtInt;
    }

    /**
     * Sets the value of the nxtInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NxtIntType }{@code >}
     *     
     */
    public void setNxtInt(JAXBElement<NxtIntType> value) {
        this.nxtInt = value;
    }

    /**
     * Gets the value of the intRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntRateType }{@code >}
     *     
     */
    public JAXBElement<IntRateType> getIntRate() {
        return intRate;
    }

    /**
     * Sets the value of the intRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntRateType }{@code >}
     *     
     */
    public void setIntRate(JAXBElement<IntRateType> value) {
        this.intRate = value;
    }

    /**
     * Gets the value of the lastPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastPayDtType }{@code >}
     *     
     */
    public JAXBElement<LastPayDtType> getLastPayDt() {
        return lastPayDt;
    }

    /**
     * Sets the value of the lastPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastPayDtType }{@code >}
     *     
     */
    public void setLastPayDt(JAXBElement<LastPayDtType> value) {
        this.lastPayDt = value;
    }

    /**
     * Gets the value of the nxtPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NxtPayDtType }{@code >}
     *     
     */
    public JAXBElement<NxtPayDtType> getNxtPayDt() {
        return nxtPayDt;
    }

    /**
     * Sets the value of the nxtPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NxtPayDtType }{@code >}
     *     
     */
    public void setNxtPayDt(JAXBElement<NxtPayDtType> value) {
        this.nxtPayDt = value;
    }

    /**
     * Gets the value of the intDisp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntDispType }{@code >}
     *     
     */
    public JAXBElement<IntDispType> getIntDisp() {
        return intDisp;
    }

    /**
     * Sets the value of the intDisp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntDispType }{@code >}
     *     
     */
    public void setIntDisp(JAXBElement<IntDispType> value) {
        this.intDisp = value;
    }

    /**
     * Gets the value of the intDispAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntDispAcctIdType }{@code >}
     *     
     */
    public JAXBElement<IntDispAcctIdType> getIntDispAcctId() {
        return intDispAcctId;
    }

    /**
     * Sets the value of the intDispAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntDispAcctIdType }{@code >}
     *     
     */
    public void setIntDispAcctId(JAXBElement<IntDispAcctIdType> value) {
        this.intDispAcctId = value;
    }

    /**
     * Gets the value of the intDispAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntDispAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<IntDispAcctTypeType> getIntDispAcctType() {
        return intDispAcctType;
    }

    /**
     * Sets the value of the intDispAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntDispAcctTypeType }{@code >}
     *     
     */
    public void setIntDispAcctType(JAXBElement<IntDispAcctTypeType> value) {
        this.intDispAcctType = value;
    }

    /**
     * Gets the value of the intYrBaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntYrBaseCodeType }{@code >}
     *     
     */
    public JAXBElement<IntYrBaseCodeType> getIntYrBaseCode() {
        return intYrBaseCode;
    }

    /**
     * Sets the value of the intYrBaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntYrBaseCodeType }{@code >}
     *     
     */
    public void setIntYrBaseCode(JAXBElement<IntYrBaseCodeType> value) {
        this.intYrBaseCode = value;
    }

    /**
     * Gets the value of the intCalcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntCalcCodeType }{@code >}
     *     
     */
    public JAXBElement<IntCalcCodeType> getIntCalcCode() {
        return intCalcCode;
    }

    /**
     * Sets the value of the intCalcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntCalcCodeType }{@code >}
     *     
     */
    public void setIntCalcCode(JAXBElement<IntCalcCodeType> value) {
        this.intCalcCode = value;
    }

    /**
     * Gets the value of the intTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntTermType }{@code >}
     *     
     */
    public JAXBElement<IntTermType> getIntTerm() {
        return intTerm;
    }

    /**
     * Sets the value of the intTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntTermType }{@code >}
     *     
     */
    public void setIntTerm(JAXBElement<IntTermType> value) {
        this.intTerm = value;
    }

    /**
     * Gets the value of the intTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntTermUnitsType }{@code >}
     *     
     */
    public JAXBElement<IntTermUnitsType> getIntTermUnits() {
        return intTermUnits;
    }

    /**
     * Sets the value of the intTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntTermUnitsType }{@code >}
     *     
     */
    public void setIntTermUnits(JAXBElement<IntTermUnitsType> value) {
        this.intTermUnits = value;
    }

    /**
     * Gets the value of the evenPayCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EvenPayCodeType }{@code >}
     *     
     */
    public JAXBElement<EvenPayCodeType> getEvenPayCode() {
        return evenPayCode;
    }

    /**
     * Sets the value of the evenPayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EvenPayCodeType }{@code >}
     *     
     */
    public void setEvenPayCode(JAXBElement<EvenPayCodeType> value) {
        this.evenPayCode = value;
    }

    /**
     * Gets the value of the varIntRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VarIntRateInfoCType }
     *     
     */
    public VarIntRateInfoCType getVarIntRateInfo() {
        return varIntRateInfo;
    }

    /**
     * Sets the value of the varIntRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarIntRateInfoCType }
     *     
     */
    public void setVarIntRateInfo(VarIntRateInfoCType value) {
        this.varIntRateInfo = value;
    }

    /**
     * Gets the value of the intDayMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntDayMonthType }{@code >}
     *     
     */
    public JAXBElement<IntDayMonthType> getIntDayMonth() {
        return intDayMonth;
    }

    /**
     * Sets the value of the intDayMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntDayMonthType }{@code >}
     *     
     */
    public void setIntDayMonth(JAXBElement<IntDayMonthType> value) {
        this.intDayMonth = value;
    }

    /**
     * Gets the value of the combIntChkCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CombIntChkCodeType }{@code >}
     *     
     */
    public JAXBElement<CombIntChkCodeType> getCombIntChkCode() {
        return combIntChkCode;
    }

    /**
     * Sets the value of the combIntChkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CombIntChkCodeType }{@code >}
     *     
     */
    public void setCombIntChkCode(JAXBElement<CombIntChkCodeType> value) {
        this.combIntChkCode = value;
    }

    /**
     * Gets the value of the combIntChkCustId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CombIntChkCustIdType }{@code >}
     *     
     */
    public JAXBElement<CombIntChkCustIdType> getCombIntChkCustId() {
        return combIntChkCustId;
    }

    /**
     * Sets the value of the combIntChkCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CombIntChkCustIdType }{@code >}
     *     
     */
    public void setCombIntChkCustId(JAXBElement<CombIntChkCustIdType> value) {
        this.combIntChkCustId = value;
    }

    /**
     * Gets the value of the payAllIntCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PayAllIntCodeType }{@code >}
     *     
     */
    public JAXBElement<PayAllIntCodeType> getPayAllIntCode() {
        return payAllIntCode;
    }

    /**
     * Sets the value of the payAllIntCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PayAllIntCodeType }{@code >}
     *     
     */
    public void setPayAllIntCode(JAXBElement<PayAllIntCodeType> value) {
        this.payAllIntCode = value;
    }

    /**
     * Gets the value of the intPmtDtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntPmtDtCodeType }{@code >}
     *     
     */
    public JAXBElement<IntPmtDtCodeType> getIntPmtDtCode() {
        return intPmtDtCode;
    }

    /**
     * Sets the value of the intPmtDtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntPmtDtCodeType }{@code >}
     *     
     */
    public void setIntPmtDtCode(JAXBElement<IntPmtDtCodeType> value) {
        this.intPmtDtCode = value;
    }

    /**
     * Gets the value of the multiRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiRateCodeType }{@code >}
     *     
     */
    public JAXBElement<MultiRateCodeType> getMultiRateCode() {
        return multiRateCode;
    }

    /**
     * Sets the value of the multiRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiRateCodeType }{@code >}
     *     
     */
    public void setMultiRateCode(JAXBElement<MultiRateCodeType> value) {
        this.multiRateCode = value;
    }

    /**
     * Gets the value of the multiDrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiDrCodeType }{@code >}
     *     
     */
    public JAXBElement<MultiDrCodeType> getMultiDrCode() {
        return multiDrCode;
    }

    /**
     * Sets the value of the multiDrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiDrCodeType }{@code >}
     *     
     */
    public void setMultiDrCode(JAXBElement<MultiDrCodeType> value) {
        this.multiDrCode = value;
    }

    /**
     * Gets the value of the rateSchedCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateSchedCodeType }{@code >}
     *     
     */
    public JAXBElement<RateSchedCodeType> getRateSchedCode() {
        return rateSchedCode;
    }

    /**
     * Sets the value of the rateSchedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateSchedCodeType }{@code >}
     *     
     */
    public void setRateSchedCode(JAXBElement<RateSchedCodeType> value) {
        this.rateSchedCode = value;
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
     * Gets the value of the stepUpIntRateInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link StepUpIntRateInfoArrayAType }
     *     
     */
    public StepUpIntRateInfoArrayAType getStepUpIntRateInfoArray() {
        return stepUpIntRateInfoArray;
    }

    /**
     * Sets the value of the stepUpIntRateInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link StepUpIntRateInfoArrayAType }
     *     
     */
    public void setStepUpIntRateInfoArray(StepUpIntRateInfoArrayAType value) {
        this.stepUpIntRateInfoArray = value;
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
     * Gets the value of the teaserRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateType }{@code >}
     *     
     */
    public JAXBElement<TeaserRateType> getTeaserRate() {
        return teaserRate;
    }

    /**
     * Sets the value of the teaserRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateType }{@code >}
     *     
     */
    public void setTeaserRate(JAXBElement<TeaserRateType> value) {
        this.teaserRate = value;
    }

    /**
     * Gets the value of the teaserRateEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateEffDtType }{@code >}
     *     
     */
    public JAXBElement<TeaserRateEffDtType> getTeaserRateEffDt() {
        return teaserRateEffDt;
    }

    /**
     * Sets the value of the teaserRateEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateEffDtType }{@code >}
     *     
     */
    public void setTeaserRateEffDt(JAXBElement<TeaserRateEffDtType> value) {
        this.teaserRateEffDt = value;
    }

    /**
     * Gets the value of the teaserRateExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateExpDtType }{@code >}
     *     
     */
    public JAXBElement<TeaserRateExpDtType> getTeaserRateExpDt() {
        return teaserRateExpDt;
    }

    /**
     * Sets the value of the teaserRateExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateExpDtType }{@code >}
     *     
     */
    public void setTeaserRateExpDt(JAXBElement<TeaserRateExpDtType> value) {
        this.teaserRateExpDt = value;
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
     * Gets the value of the dlyDayFinalIntPmt property.
     * 
     * @return
     *     possible object is
     *     {@link DlyDayFinalIntPmtType }
     *     
     */
    public DlyDayFinalIntPmtType getDlyDayFinalIntPmt() {
        return dlyDayFinalIntPmt;
    }

    /**
     * Sets the value of the dlyDayFinalIntPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DlyDayFinalIntPmtType }
     *     
     */
    public void setDlyDayFinalIntPmt(DlyDayFinalIntPmtType value) {
        this.dlyDayFinalIntPmt = value;
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
     * Gets the value of the mtdAccrInt property.
     * 
     * @return
     *     possible object is
     *     {@link MTDAccrIntType }
     *     
     */
    public MTDAccrIntType getMTDAccrInt() {
        return mtdAccrInt;
    }

    /**
     * Sets the value of the mtdAccrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MTDAccrIntType }
     *     
     */
    public void setMTDAccrInt(MTDAccrIntType value) {
        this.mtdAccrInt = value;
    }

    /**
     * Gets the value of the mtdAccrDays property.
     * 
     * @return
     *     possible object is
     *     {@link MTDAccrDaysType }
     *     
     */
    public MTDAccrDaysType getMTDAccrDays() {
        return mtdAccrDays;
    }

    /**
     * Sets the value of the mtdAccrDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link MTDAccrDaysType }
     *     
     */
    public void setMTDAccrDays(MTDAccrDaysType value) {
        this.mtdAccrDays = value;
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
     * Gets the value of the multiDepRateArray property.
     * 
     * @return
     *     possible object is
     *     {@link MultiDepRateArrayAType }
     *     
     */
    public MultiDepRateArrayAType getMultiDepRateArray() {
        return multiDepRateArray;
    }

    /**
     * Sets the value of the multiDepRateArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiDepRateArrayAType }
     *     
     */
    public void setMultiDepRateArray(MultiDepRateArrayAType value) {
        this.multiDepRateArray = value;
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
