
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
 * <p>Java class for LnPayoffInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnPayoffInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="EffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DailyAccrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}DailyAccrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayoffAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PayoffAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}AccrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdAccr" type="{http://jackhenry.com/jxchange/TPG/2008}SecdAccr_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRebate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRebate_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlrRebate" type="{http://jackhenry.com/jxchange/TPG/2008}DlrRebate_Type" minOccurs="0"/&gt;
 *         &lt;element name="LateChgDueAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgDueAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}OthChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PartPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PartPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinInt" type="{http://jackhenry.com/jxchange/TPG/2008}MinInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InsurAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NetMemoPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NetMemoPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPayoffArray" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPayoffArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPayoffArray" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPayoffArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="FeePayoffArray" type="{http://jackhenry.com/jxchange/TPG/2008}FeePayoffArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="MemoPostArray" type="{http://jackhenry.com/jxchange/TPG/2008}MemoPostArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="InsDailyAccrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InsDailyAccrAmt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="EscrwIntWithAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwIntWithAmt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="PayoffPend" type="{http://jackhenry.com/jxchange/TPG/2008}PayoffPend_Type" minOccurs="0"/&gt;
 *               &lt;element name="BankDisc" type="{http://jackhenry.com/jxchange/TPG/2008}BankDisc_Type" minOccurs="0"/&gt;
 *               &lt;element name="DlrDisc" type="{http://jackhenry.com/jxchange/TPG/2008}DlrDisc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnPayoffInqRs_MType", propOrder = {
    "msgRsHdr",
    "accountId",
    "effDt",
    "dailyAccrAmt",
    "payoffAmt",
    "curBal",
    "accrInt",
    "secdAccr",
    "intRebate",
    "dlrRebate",
    "lateChgDueAmt",
    "othChgAmt",
    "partPmtAmt",
    "minInt",
    "prePmtPenAmt",
    "insurAmt",
    "escrwAmt",
    "feeAmt",
    "netMemoPostAmt",
    "insurPayoffArray",
    "escrwPayoffArray",
    "feePayoffArray",
    "memoPostArray",
    "custom",
    "ver1",
    "insDailyAccrAmt",
    "ver2",
    "escrwIntWithAmt",
    "ver3",
    "payoffPend",
    "bankDisc",
    "dlrDisc",
    "ver4",
    "any"
})
public class LnPayoffInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElementRef(name = "EffDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EffDtType> effDt;
    @XmlElementRef(name = "DailyAccrAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DailyAccrAmtType> dailyAccrAmt;
    @XmlElementRef(name = "PayoffAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PayoffAmtType> payoffAmt;
    @XmlElementRef(name = "CurBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurBalType> curBal;
    @XmlElementRef(name = "AccrInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccrIntType> accrInt;
    @XmlElementRef(name = "SecdAccr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SecdAccrType> secdAccr;
    @XmlElementRef(name = "IntRebate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntRebateType> intRebate;
    @XmlElementRef(name = "DlrRebate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlrRebateType> dlrRebate;
    @XmlElementRef(name = "LateChgDueAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LateChgDueAmtType> lateChgDueAmt;
    @XmlElementRef(name = "OthChgAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OthChgAmtType> othChgAmt;
    @XmlElementRef(name = "PartPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PartPmtAmtType> partPmtAmt;
    @XmlElementRef(name = "MinInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MinIntType> minInt;
    @XmlElementRef(name = "PrePmtPenAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePmtPenAmtType> prePmtPenAmt;
    @XmlElementRef(name = "InsurAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InsurAmtType> insurAmt;
    @XmlElementRef(name = "EscrwAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwAmtType> escrwAmt;
    @XmlElementRef(name = "FeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FeeAmtType> feeAmt;
    @XmlElementRef(name = "NetMemoPostAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NetMemoPostAmtType> netMemoPostAmt;
    @XmlElementRef(name = "InsurPayoffArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InsurPayoffArrayAType> insurPayoffArray;
    @XmlElementRef(name = "EscrwPayoffArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPayoffArrayAType> escrwPayoffArray;
    @XmlElementRef(name = "FeePayoffArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FeePayoffArrayAType> feePayoffArray;
    @XmlElementRef(name = "MemoPostArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MemoPostArrayAType> memoPostArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "InsDailyAccrAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InsDailyAccrAmtType> insDailyAccrAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "EscrwIntWithAmt")
    protected EscrwIntWithAmtType escrwIntWithAmt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "PayoffPend")
    protected PayoffPendType payoffPend;
    @XmlElement(name = "BankDisc")
    protected BankDiscType bankDisc;
    @XmlElement(name = "DlrDisc")
    protected DlrDiscType dlrDisc;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public MsgRsHdrCType getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Sets the value of the msgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public void setMsgRsHdr(MsgRsHdrCType value) {
        this.msgRsHdr = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<AccountIdCType> value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EffDtType }{@code >}
     *     
     */
    public JAXBElement<EffDtType> getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EffDtType }{@code >}
     *     
     */
    public void setEffDt(JAXBElement<EffDtType> value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the dailyAccrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DailyAccrAmtType }{@code >}
     *     
     */
    public JAXBElement<DailyAccrAmtType> getDailyAccrAmt() {
        return dailyAccrAmt;
    }

    /**
     * Sets the value of the dailyAccrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DailyAccrAmtType }{@code >}
     *     
     */
    public void setDailyAccrAmt(JAXBElement<DailyAccrAmtType> value) {
        this.dailyAccrAmt = value;
    }

    /**
     * Gets the value of the payoffAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PayoffAmtType }{@code >}
     *     
     */
    public JAXBElement<PayoffAmtType> getPayoffAmt() {
        return payoffAmt;
    }

    /**
     * Sets the value of the payoffAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PayoffAmtType }{@code >}
     *     
     */
    public void setPayoffAmt(JAXBElement<PayoffAmtType> value) {
        this.payoffAmt = value;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurBalType }{@code >}
     *     
     */
    public JAXBElement<CurBalType> getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurBalType }{@code >}
     *     
     */
    public void setCurBal(JAXBElement<CurBalType> value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the accrInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccrIntType }{@code >}
     *     
     */
    public JAXBElement<AccrIntType> getAccrInt() {
        return accrInt;
    }

    /**
     * Sets the value of the accrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccrIntType }{@code >}
     *     
     */
    public void setAccrInt(JAXBElement<AccrIntType> value) {
        this.accrInt = value;
    }

    /**
     * Gets the value of the secdAccr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecdAccrType }{@code >}
     *     
     */
    public JAXBElement<SecdAccrType> getSecdAccr() {
        return secdAccr;
    }

    /**
     * Sets the value of the secdAccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecdAccrType }{@code >}
     *     
     */
    public void setSecdAccr(JAXBElement<SecdAccrType> value) {
        this.secdAccr = value;
    }

    /**
     * Gets the value of the intRebate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntRebateType }{@code >}
     *     
     */
    public JAXBElement<IntRebateType> getIntRebate() {
        return intRebate;
    }

    /**
     * Sets the value of the intRebate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntRebateType }{@code >}
     *     
     */
    public void setIntRebate(JAXBElement<IntRebateType> value) {
        this.intRebate = value;
    }

    /**
     * Gets the value of the dlrRebate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlrRebateType }{@code >}
     *     
     */
    public JAXBElement<DlrRebateType> getDlrRebate() {
        return dlrRebate;
    }

    /**
     * Sets the value of the dlrRebate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlrRebateType }{@code >}
     *     
     */
    public void setDlrRebate(JAXBElement<DlrRebateType> value) {
        this.dlrRebate = value;
    }

    /**
     * Gets the value of the lateChgDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LateChgDueAmtType }{@code >}
     *     
     */
    public JAXBElement<LateChgDueAmtType> getLateChgDueAmt() {
        return lateChgDueAmt;
    }

    /**
     * Sets the value of the lateChgDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LateChgDueAmtType }{@code >}
     *     
     */
    public void setLateChgDueAmt(JAXBElement<LateChgDueAmtType> value) {
        this.lateChgDueAmt = value;
    }

    /**
     * Gets the value of the othChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OthChgAmtType }{@code >}
     *     
     */
    public JAXBElement<OthChgAmtType> getOthChgAmt() {
        return othChgAmt;
    }

    /**
     * Sets the value of the othChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OthChgAmtType }{@code >}
     *     
     */
    public void setOthChgAmt(JAXBElement<OthChgAmtType> value) {
        this.othChgAmt = value;
    }

    /**
     * Gets the value of the partPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PartPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<PartPmtAmtType> getPartPmtAmt() {
        return partPmtAmt;
    }

    /**
     * Sets the value of the partPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PartPmtAmtType }{@code >}
     *     
     */
    public void setPartPmtAmt(JAXBElement<PartPmtAmtType> value) {
        this.partPmtAmt = value;
    }

    /**
     * Gets the value of the minInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MinIntType }{@code >}
     *     
     */
    public JAXBElement<MinIntType> getMinInt() {
        return minInt;
    }

    /**
     * Sets the value of the minInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MinIntType }{@code >}
     *     
     */
    public void setMinInt(JAXBElement<MinIntType> value) {
        this.minInt = value;
    }

    /**
     * Gets the value of the prePmtPenAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenAmtType }{@code >}
     *     
     */
    public JAXBElement<PrePmtPenAmtType> getPrePmtPenAmt() {
        return prePmtPenAmt;
    }

    /**
     * Sets the value of the prePmtPenAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenAmtType }{@code >}
     *     
     */
    public void setPrePmtPenAmt(JAXBElement<PrePmtPenAmtType> value) {
        this.prePmtPenAmt = value;
    }

    /**
     * Gets the value of the insurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsurAmtType }{@code >}
     *     
     */
    public JAXBElement<InsurAmtType> getInsurAmt() {
        return insurAmt;
    }

    /**
     * Sets the value of the insurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsurAmtType }{@code >}
     *     
     */
    public void setInsurAmt(JAXBElement<InsurAmtType> value) {
        this.insurAmt = value;
    }

    /**
     * Gets the value of the escrwAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwAmtType> getEscrwAmt() {
        return escrwAmt;
    }

    /**
     * Sets the value of the escrwAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwAmtType }{@code >}
     *     
     */
    public void setEscrwAmt(JAXBElement<EscrwAmtType> value) {
        this.escrwAmt = value;
    }

    /**
     * Gets the value of the feeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FeeAmtType }{@code >}
     *     
     */
    public JAXBElement<FeeAmtType> getFeeAmt() {
        return feeAmt;
    }

    /**
     * Sets the value of the feeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FeeAmtType }{@code >}
     *     
     */
    public void setFeeAmt(JAXBElement<FeeAmtType> value) {
        this.feeAmt = value;
    }

    /**
     * Gets the value of the netMemoPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetMemoPostAmtType }{@code >}
     *     
     */
    public JAXBElement<NetMemoPostAmtType> getNetMemoPostAmt() {
        return netMemoPostAmt;
    }

    /**
     * Sets the value of the netMemoPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetMemoPostAmtType }{@code >}
     *     
     */
    public void setNetMemoPostAmt(JAXBElement<NetMemoPostAmtType> value) {
        this.netMemoPostAmt = value;
    }

    /**
     * Gets the value of the insurPayoffArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsurPayoffArrayAType }{@code >}
     *     
     */
    public JAXBElement<InsurPayoffArrayAType> getInsurPayoffArray() {
        return insurPayoffArray;
    }

    /**
     * Sets the value of the insurPayoffArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsurPayoffArrayAType }{@code >}
     *     
     */
    public void setInsurPayoffArray(JAXBElement<InsurPayoffArrayAType> value) {
        this.insurPayoffArray = value;
    }

    /**
     * Gets the value of the escrwPayoffArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPayoffArrayAType }{@code >}
     *     
     */
    public JAXBElement<EscrwPayoffArrayAType> getEscrwPayoffArray() {
        return escrwPayoffArray;
    }

    /**
     * Sets the value of the escrwPayoffArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPayoffArrayAType }{@code >}
     *     
     */
    public void setEscrwPayoffArray(JAXBElement<EscrwPayoffArrayAType> value) {
        this.escrwPayoffArray = value;
    }

    /**
     * Gets the value of the feePayoffArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FeePayoffArrayAType }{@code >}
     *     
     */
    public JAXBElement<FeePayoffArrayAType> getFeePayoffArray() {
        return feePayoffArray;
    }

    /**
     * Sets the value of the feePayoffArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FeePayoffArrayAType }{@code >}
     *     
     */
    public void setFeePayoffArray(JAXBElement<FeePayoffArrayAType> value) {
        this.feePayoffArray = value;
    }

    /**
     * Gets the value of the memoPostArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MemoPostArrayAType }{@code >}
     *     
     */
    public JAXBElement<MemoPostArrayAType> getMemoPostArray() {
        return memoPostArray;
    }

    /**
     * Sets the value of the memoPostArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MemoPostArrayAType }{@code >}
     *     
     */
    public void setMemoPostArray(JAXBElement<MemoPostArrayAType> value) {
        this.memoPostArray = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
     * Gets the value of the insDailyAccrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsDailyAccrAmtType }{@code >}
     *     
     */
    public JAXBElement<InsDailyAccrAmtType> getInsDailyAccrAmt() {
        return insDailyAccrAmt;
    }

    /**
     * Sets the value of the insDailyAccrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsDailyAccrAmtType }{@code >}
     *     
     */
    public void setInsDailyAccrAmt(JAXBElement<InsDailyAccrAmtType> value) {
        this.insDailyAccrAmt = value;
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
     * Gets the value of the escrwIntWithAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwIntWithAmtType }
     *     
     */
    public EscrwIntWithAmtType getEscrwIntWithAmt() {
        return escrwIntWithAmt;
    }

    /**
     * Sets the value of the escrwIntWithAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwIntWithAmtType }
     *     
     */
    public void setEscrwIntWithAmt(EscrwIntWithAmtType value) {
        this.escrwIntWithAmt = value;
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
     * Gets the value of the payoffPend property.
     * 
     * @return
     *     possible object is
     *     {@link PayoffPendType }
     *     
     */
    public PayoffPendType getPayoffPend() {
        return payoffPend;
    }

    /**
     * Sets the value of the payoffPend property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoffPendType }
     *     
     */
    public void setPayoffPend(PayoffPendType value) {
        this.payoffPend = value;
    }

    /**
     * Gets the value of the bankDisc property.
     * 
     * @return
     *     possible object is
     *     {@link BankDiscType }
     *     
     */
    public BankDiscType getBankDisc() {
        return bankDisc;
    }

    /**
     * Sets the value of the bankDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankDiscType }
     *     
     */
    public void setBankDisc(BankDiscType value) {
        this.bankDisc = value;
    }

    /**
     * Gets the value of the dlrDisc property.
     * 
     * @return
     *     possible object is
     *     {@link DlrDiscType }
     *     
     */
    public DlrDiscType getDlrDisc() {
        return dlrDisc;
    }

    /**
     * Sets the value of the dlrDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DlrDiscType }
     *     
     */
    public void setDlrDisc(DlrDiscType value) {
        this.dlrDisc = value;
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
