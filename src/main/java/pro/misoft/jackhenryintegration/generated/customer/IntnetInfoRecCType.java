
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
 * <p>Java class for IntnetInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillPayAlw" type="{http://jackhenry.com/jxchange/TPG/2008}BillPayAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrtPswdIdChngLtr" type="{http://jackhenry.com/jxchange/TPG/2008}CrtPswdIdChngLtr_Type" minOccurs="0"/&gt;
 *         &lt;element name="BillPayProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}BillPayProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevStmtDspAlw" type="{http://jackhenry.com/jxchange/TPG/2008}PrevStmtDspAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnPmtAlw" type="{http://jackhenry.com/jxchange/TPG/2008}LnPmtAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopPmtInqAlw" type="{http://jackhenry.com/jxchange/TPG/2008}StopPmtInqAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopPmtAddAlw" type="{http://jackhenry.com/jxchange/TPG/2008}StopPmtAddAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtRtnDays" type="{http://jackhenry.com/jxchange/TPG/2008}StmtRtnDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClsDspAcctDays" type="{http://jackhenry.com/jxchange/TPG/2008}ClsDspAcctDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetIdActStat" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetIdActStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetFinInstPswdId" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstPswdId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmailNotifType" type="{http://jackhenry.com/jxchange/TPG/2008}EmailNotifType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetIdStat" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetIdStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="UpdCustEmailType" type="{http://jackhenry.com/jxchange/TPG/2008}UpdCustEmailType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmailRelCust" type="{http://jackhenry.com/jxchange/TPG/2008}EmailRelCust_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctViewAvlBalCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctViewAvlBalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnXferAvlBalCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnXferAvlBalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferAvlBalCode" type="{http://jackhenry.com/jxchange/TPG/2008}XferAvlBalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BillPayAvlBalCode" type="{http://jackhenry.com/jxchange/TPG/2008}BillPayAvlBalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FeeChgAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="IntnetMonthAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetMonthAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetMonthFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetMonthFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetMonthChgFreq" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetMonthChgFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="FirstAccessDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstAccessDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastAccessDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastAccessDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastAccessTime" type="{http://jackhenry.com/jxchange/TPG/2008}LastAccessTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BillPayOrigDt" type="{http://jackhenry.com/jxchange/TPG/2008}BillPayOrigDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BillPayTolrCnt" type="{http://jackhenry.com/jxchange/TPG/2008}BillPayTolrCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireCompId" type="{http://jackhenry.com/jxchange/TPG/2008}WireCompId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DspAppInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}DspAppInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AliasUsrName" type="{http://jackhenry.com/jxchange/TPG/2008}AliasUsrName_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntnetIdState" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetIdState_Type" minOccurs="0"/&gt;
 *           &lt;element name="LastFailLogInTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastFailLogInTimeDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="SecTokenInUse" type="{http://jackhenry.com/jxchange/TPG/2008}SecTokenInUse_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntnetAcptTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetAcptTimeDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntnetOrigPIN" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetOrigPIN_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExtcFldrName" type="{http://jackhenry.com/jxchange/TPG/2008}ExtcFldrName_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ACHFeeChgAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *             &lt;element name="IntnetCatType" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetCatType_Type" minOccurs="0"/&gt;
 *             &lt;element name="IntnetFeeChgArray" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFeeChgArray_AType"/&gt;
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
@XmlType(name = "IntnetInfoRec_CType", propOrder = {
    "billPayAlw",
    "crtPswdIdChngLtr",
    "billPayProdCode",
    "prevStmtDspAlw",
    "lnPmtAlw",
    "stopPmtInqAlw",
    "stopPmtAddAlw",
    "stmtRtnDays",
    "clsDspAcctDays",
    "intnetIdActStat",
    "intnetFinInstPswdId",
    "emailNotifType",
    "intnetIdStat",
    "updCustEmailType",
    "emailRelCust",
    "acctViewAvlBalCode",
    "trnXferAvlBalCode",
    "xferAvlBalCode",
    "billPayAvlBalCode",
    "feeChgAcctId",
    "intnetMonthAnlysId",
    "intnetMonthFeeAmt",
    "intnetMonthChgFreq",
    "firstAccessDt",
    "lastAccessDt",
    "lastAccessTime",
    "lastMainDt",
    "billPayOrigDt",
    "billPayTolrCnt",
    "wireCompId",
    "dspAppInfoArray",
    "emailArray",
    "ver1",
    "aliasUsrName",
    "intnetIdState",
    "lastFailLogInTimeDt",
    "secTokenInUse",
    "intnetAcptTimeDt",
    "intnetOrigPIN",
    "extcFldrName",
    "ver2",
    "achFeeChgAcctId",
    "intnetCatType",
    "intnetFeeChgArray",
    "ver3",
    "any"
})
public class IntnetInfoRecCType {

    @XmlElement(name = "BillPayAlw")
    protected BillPayAlwType billPayAlw;
    @XmlElement(name = "CrtPswdIdChngLtr")
    protected CrtPswdIdChngLtrType crtPswdIdChngLtr;
    @XmlElement(name = "BillPayProdCode")
    protected BillPayProdCodeType billPayProdCode;
    @XmlElement(name = "PrevStmtDspAlw")
    protected PrevStmtDspAlwType prevStmtDspAlw;
    @XmlElement(name = "LnPmtAlw")
    protected LnPmtAlwType lnPmtAlw;
    @XmlElement(name = "StopPmtInqAlw")
    protected StopPmtInqAlwType stopPmtInqAlw;
    @XmlElement(name = "StopPmtAddAlw")
    protected StopPmtAddAlwType stopPmtAddAlw;
    @XmlElement(name = "StmtRtnDays")
    protected StmtRtnDaysType stmtRtnDays;
    @XmlElement(name = "ClsDspAcctDays")
    protected ClsDspAcctDaysType clsDspAcctDays;
    @XmlElement(name = "IntnetIdActStat")
    protected IntnetIdActStatType intnetIdActStat;
    @XmlElement(name = "IntnetFinInstPswdId")
    protected IntnetFinInstPswdIdType intnetFinInstPswdId;
    @XmlElement(name = "EmailNotifType")
    protected EmailNotifTypeType emailNotifType;
    @XmlElement(name = "IntnetIdStat")
    protected IntnetIdStatType intnetIdStat;
    @XmlElement(name = "UpdCustEmailType")
    protected UpdCustEmailTypeType updCustEmailType;
    @XmlElement(name = "EmailRelCust")
    protected EmailRelCustType emailRelCust;
    @XmlElement(name = "AcctViewAvlBalCode")
    protected AcctViewAvlBalCodeType acctViewAvlBalCode;
    @XmlElement(name = "TrnXferAvlBalCode")
    protected TrnXferAvlBalCodeType trnXferAvlBalCode;
    @XmlElement(name = "XferAvlBalCode")
    protected XferAvlBalCodeType xferAvlBalCode;
    @XmlElement(name = "BillPayAvlBalCode")
    protected BillPayAvlBalCodeType billPayAvlBalCode;
    @XmlElement(name = "FeeChgAcctId")
    protected AccountIdCType feeChgAcctId;
    @XmlElement(name = "IntnetMonthAnlysId")
    protected IntnetMonthAnlysIdType intnetMonthAnlysId;
    @XmlElement(name = "IntnetMonthFeeAmt")
    protected IntnetMonthFeeAmtType intnetMonthFeeAmt;
    @XmlElement(name = "IntnetMonthChgFreq")
    protected IntnetMonthChgFreqType intnetMonthChgFreq;
    @XmlElement(name = "FirstAccessDt")
    protected FirstAccessDtType firstAccessDt;
    @XmlElement(name = "LastAccessDt")
    protected LastAccessDtType lastAccessDt;
    @XmlElement(name = "LastAccessTime")
    protected LastAccessTimeType lastAccessTime;
    @XmlElement(name = "LastMainDt")
    protected LastMainDtType lastMainDt;
    @XmlElement(name = "BillPayOrigDt")
    protected BillPayOrigDtType billPayOrigDt;
    @XmlElement(name = "BillPayTolrCnt")
    protected BillPayTolrCntType billPayTolrCnt;
    @XmlElement(name = "WireCompId")
    protected WireCompIdType wireCompId;
    @XmlElement(name = "DspAppInfoArray")
    protected DspAppInfoArrayAType dspAppInfoArray;
    @XmlElement(name = "EmailArray")
    protected EmailArrayAType emailArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AliasUsrName")
    protected AliasUsrNameType aliasUsrName;
    @XmlElement(name = "IntnetIdState")
    protected IntnetIdStateType intnetIdState;
    @XmlElement(name = "LastFailLogInTimeDt")
    protected LastFailLogInTimeDtType lastFailLogInTimeDt;
    @XmlElement(name = "SecTokenInUse")
    protected SecTokenInUseType secTokenInUse;
    @XmlElement(name = "IntnetAcptTimeDt")
    protected IntnetAcptTimeDtType intnetAcptTimeDt;
    @XmlElement(name = "IntnetOrigPIN")
    protected IntnetOrigPINType intnetOrigPIN;
    @XmlElement(name = "ExtcFldrName")
    protected ExtcFldrNameType extcFldrName;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ACHFeeChgAcctId")
    protected AccountIdCType achFeeChgAcctId;
    @XmlElement(name = "IntnetCatType")
    protected IntnetCatTypeType intnetCatType;
    @XmlElement(name = "IntnetFeeChgArray")
    protected IntnetFeeChgArrayAType intnetFeeChgArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the billPayAlw property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayAlwType }
     *     
     */
    public BillPayAlwType getBillPayAlw() {
        return billPayAlw;
    }

    /**
     * Sets the value of the billPayAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayAlwType }
     *     
     */
    public void setBillPayAlw(BillPayAlwType value) {
        this.billPayAlw = value;
    }

    /**
     * Gets the value of the crtPswdIdChngLtr property.
     * 
     * @return
     *     possible object is
     *     {@link CrtPswdIdChngLtrType }
     *     
     */
    public CrtPswdIdChngLtrType getCrtPswdIdChngLtr() {
        return crtPswdIdChngLtr;
    }

    /**
     * Sets the value of the crtPswdIdChngLtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrtPswdIdChngLtrType }
     *     
     */
    public void setCrtPswdIdChngLtr(CrtPswdIdChngLtrType value) {
        this.crtPswdIdChngLtr = value;
    }

    /**
     * Gets the value of the billPayProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayProdCodeType }
     *     
     */
    public BillPayProdCodeType getBillPayProdCode() {
        return billPayProdCode;
    }

    /**
     * Sets the value of the billPayProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayProdCodeType }
     *     
     */
    public void setBillPayProdCode(BillPayProdCodeType value) {
        this.billPayProdCode = value;
    }

    /**
     * Gets the value of the prevStmtDspAlw property.
     * 
     * @return
     *     possible object is
     *     {@link PrevStmtDspAlwType }
     *     
     */
    public PrevStmtDspAlwType getPrevStmtDspAlw() {
        return prevStmtDspAlw;
    }

    /**
     * Sets the value of the prevStmtDspAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevStmtDspAlwType }
     *     
     */
    public void setPrevStmtDspAlw(PrevStmtDspAlwType value) {
        this.prevStmtDspAlw = value;
    }

    /**
     * Gets the value of the lnPmtAlw property.
     * 
     * @return
     *     possible object is
     *     {@link LnPmtAlwType }
     *     
     */
    public LnPmtAlwType getLnPmtAlw() {
        return lnPmtAlw;
    }

    /**
     * Sets the value of the lnPmtAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnPmtAlwType }
     *     
     */
    public void setLnPmtAlw(LnPmtAlwType value) {
        this.lnPmtAlw = value;
    }

    /**
     * Gets the value of the stopPmtInqAlw property.
     * 
     * @return
     *     possible object is
     *     {@link StopPmtInqAlwType }
     *     
     */
    public StopPmtInqAlwType getStopPmtInqAlw() {
        return stopPmtInqAlw;
    }

    /**
     * Sets the value of the stopPmtInqAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPmtInqAlwType }
     *     
     */
    public void setStopPmtInqAlw(StopPmtInqAlwType value) {
        this.stopPmtInqAlw = value;
    }

    /**
     * Gets the value of the stopPmtAddAlw property.
     * 
     * @return
     *     possible object is
     *     {@link StopPmtAddAlwType }
     *     
     */
    public StopPmtAddAlwType getStopPmtAddAlw() {
        return stopPmtAddAlw;
    }

    /**
     * Sets the value of the stopPmtAddAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPmtAddAlwType }
     *     
     */
    public void setStopPmtAddAlw(StopPmtAddAlwType value) {
        this.stopPmtAddAlw = value;
    }

    /**
     * Gets the value of the stmtRtnDays property.
     * 
     * @return
     *     possible object is
     *     {@link StmtRtnDaysType }
     *     
     */
    public StmtRtnDaysType getStmtRtnDays() {
        return stmtRtnDays;
    }

    /**
     * Sets the value of the stmtRtnDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtRtnDaysType }
     *     
     */
    public void setStmtRtnDays(StmtRtnDaysType value) {
        this.stmtRtnDays = value;
    }

    /**
     * Gets the value of the clsDspAcctDays property.
     * 
     * @return
     *     possible object is
     *     {@link ClsDspAcctDaysType }
     *     
     */
    public ClsDspAcctDaysType getClsDspAcctDays() {
        return clsDspAcctDays;
    }

    /**
     * Sets the value of the clsDspAcctDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsDspAcctDaysType }
     *     
     */
    public void setClsDspAcctDays(ClsDspAcctDaysType value) {
        this.clsDspAcctDays = value;
    }

    /**
     * Gets the value of the intnetIdActStat property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetIdActStatType }
     *     
     */
    public IntnetIdActStatType getIntnetIdActStat() {
        return intnetIdActStat;
    }

    /**
     * Sets the value of the intnetIdActStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetIdActStatType }
     *     
     */
    public void setIntnetIdActStat(IntnetIdActStatType value) {
        this.intnetIdActStat = value;
    }

    /**
     * Gets the value of the intnetFinInstPswdId property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetFinInstPswdIdType }
     *     
     */
    public IntnetFinInstPswdIdType getIntnetFinInstPswdId() {
        return intnetFinInstPswdId;
    }

    /**
     * Sets the value of the intnetFinInstPswdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetFinInstPswdIdType }
     *     
     */
    public void setIntnetFinInstPswdId(IntnetFinInstPswdIdType value) {
        this.intnetFinInstPswdId = value;
    }

    /**
     * Gets the value of the emailNotifType property.
     * 
     * @return
     *     possible object is
     *     {@link EmailNotifTypeType }
     *     
     */
    public EmailNotifTypeType getEmailNotifType() {
        return emailNotifType;
    }

    /**
     * Sets the value of the emailNotifType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailNotifTypeType }
     *     
     */
    public void setEmailNotifType(EmailNotifTypeType value) {
        this.emailNotifType = value;
    }

    /**
     * Gets the value of the intnetIdStat property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetIdStatType }
     *     
     */
    public IntnetIdStatType getIntnetIdStat() {
        return intnetIdStat;
    }

    /**
     * Sets the value of the intnetIdStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetIdStatType }
     *     
     */
    public void setIntnetIdStat(IntnetIdStatType value) {
        this.intnetIdStat = value;
    }

    /**
     * Gets the value of the updCustEmailType property.
     * 
     * @return
     *     possible object is
     *     {@link UpdCustEmailTypeType }
     *     
     */
    public UpdCustEmailTypeType getUpdCustEmailType() {
        return updCustEmailType;
    }

    /**
     * Sets the value of the updCustEmailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdCustEmailTypeType }
     *     
     */
    public void setUpdCustEmailType(UpdCustEmailTypeType value) {
        this.updCustEmailType = value;
    }

    /**
     * Gets the value of the emailRelCust property.
     * 
     * @return
     *     possible object is
     *     {@link EmailRelCustType }
     *     
     */
    public EmailRelCustType getEmailRelCust() {
        return emailRelCust;
    }

    /**
     * Sets the value of the emailRelCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailRelCustType }
     *     
     */
    public void setEmailRelCust(EmailRelCustType value) {
        this.emailRelCust = value;
    }

    /**
     * Gets the value of the acctViewAvlBalCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctViewAvlBalCodeType }
     *     
     */
    public AcctViewAvlBalCodeType getAcctViewAvlBalCode() {
        return acctViewAvlBalCode;
    }

    /**
     * Sets the value of the acctViewAvlBalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctViewAvlBalCodeType }
     *     
     */
    public void setAcctViewAvlBalCode(AcctViewAvlBalCodeType value) {
        this.acctViewAvlBalCode = value;
    }

    /**
     * Gets the value of the trnXferAvlBalCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrnXferAvlBalCodeType }
     *     
     */
    public TrnXferAvlBalCodeType getTrnXferAvlBalCode() {
        return trnXferAvlBalCode;
    }

    /**
     * Sets the value of the trnXferAvlBalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnXferAvlBalCodeType }
     *     
     */
    public void setTrnXferAvlBalCode(TrnXferAvlBalCodeType value) {
        this.trnXferAvlBalCode = value;
    }

    /**
     * Gets the value of the xferAvlBalCode property.
     * 
     * @return
     *     possible object is
     *     {@link XferAvlBalCodeType }
     *     
     */
    public XferAvlBalCodeType getXferAvlBalCode() {
        return xferAvlBalCode;
    }

    /**
     * Sets the value of the xferAvlBalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferAvlBalCodeType }
     *     
     */
    public void setXferAvlBalCode(XferAvlBalCodeType value) {
        this.xferAvlBalCode = value;
    }

    /**
     * Gets the value of the billPayAvlBalCode property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayAvlBalCodeType }
     *     
     */
    public BillPayAvlBalCodeType getBillPayAvlBalCode() {
        return billPayAvlBalCode;
    }

    /**
     * Sets the value of the billPayAvlBalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayAvlBalCodeType }
     *     
     */
    public void setBillPayAvlBalCode(BillPayAvlBalCodeType value) {
        this.billPayAvlBalCode = value;
    }

    /**
     * Gets the value of the feeChgAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getFeeChgAcctId() {
        return feeChgAcctId;
    }

    /**
     * Sets the value of the feeChgAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setFeeChgAcctId(AccountIdCType value) {
        this.feeChgAcctId = value;
    }

    /**
     * Gets the value of the intnetMonthAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetMonthAnlysIdType }
     *     
     */
    public IntnetMonthAnlysIdType getIntnetMonthAnlysId() {
        return intnetMonthAnlysId;
    }

    /**
     * Sets the value of the intnetMonthAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetMonthAnlysIdType }
     *     
     */
    public void setIntnetMonthAnlysId(IntnetMonthAnlysIdType value) {
        this.intnetMonthAnlysId = value;
    }

    /**
     * Gets the value of the intnetMonthFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetMonthFeeAmtType }
     *     
     */
    public IntnetMonthFeeAmtType getIntnetMonthFeeAmt() {
        return intnetMonthFeeAmt;
    }

    /**
     * Sets the value of the intnetMonthFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetMonthFeeAmtType }
     *     
     */
    public void setIntnetMonthFeeAmt(IntnetMonthFeeAmtType value) {
        this.intnetMonthFeeAmt = value;
    }

    /**
     * Gets the value of the intnetMonthChgFreq property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetMonthChgFreqType }
     *     
     */
    public IntnetMonthChgFreqType getIntnetMonthChgFreq() {
        return intnetMonthChgFreq;
    }

    /**
     * Sets the value of the intnetMonthChgFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetMonthChgFreqType }
     *     
     */
    public void setIntnetMonthChgFreq(IntnetMonthChgFreqType value) {
        this.intnetMonthChgFreq = value;
    }

    /**
     * Gets the value of the firstAccessDt property.
     * 
     * @return
     *     possible object is
     *     {@link FirstAccessDtType }
     *     
     */
    public FirstAccessDtType getFirstAccessDt() {
        return firstAccessDt;
    }

    /**
     * Sets the value of the firstAccessDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstAccessDtType }
     *     
     */
    public void setFirstAccessDt(FirstAccessDtType value) {
        this.firstAccessDt = value;
    }

    /**
     * Gets the value of the lastAccessDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastAccessDtType }
     *     
     */
    public LastAccessDtType getLastAccessDt() {
        return lastAccessDt;
    }

    /**
     * Sets the value of the lastAccessDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastAccessDtType }
     *     
     */
    public void setLastAccessDt(LastAccessDtType value) {
        this.lastAccessDt = value;
    }

    /**
     * Gets the value of the lastAccessTime property.
     * 
     * @return
     *     possible object is
     *     {@link LastAccessTimeType }
     *     
     */
    public LastAccessTimeType getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * Sets the value of the lastAccessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastAccessTimeType }
     *     
     */
    public void setLastAccessTime(LastAccessTimeType value) {
        this.lastAccessTime = value;
    }

    /**
     * Gets the value of the lastMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastMainDtType }
     *     
     */
    public LastMainDtType getLastMainDt() {
        return lastMainDt;
    }

    /**
     * Sets the value of the lastMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastMainDtType }
     *     
     */
    public void setLastMainDt(LastMainDtType value) {
        this.lastMainDt = value;
    }

    /**
     * Gets the value of the billPayOrigDt property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayOrigDtType }
     *     
     */
    public BillPayOrigDtType getBillPayOrigDt() {
        return billPayOrigDt;
    }

    /**
     * Sets the value of the billPayOrigDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayOrigDtType }
     *     
     */
    public void setBillPayOrigDt(BillPayOrigDtType value) {
        this.billPayOrigDt = value;
    }

    /**
     * Gets the value of the billPayTolrCnt property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayTolrCntType }
     *     
     */
    public BillPayTolrCntType getBillPayTolrCnt() {
        return billPayTolrCnt;
    }

    /**
     * Sets the value of the billPayTolrCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayTolrCntType }
     *     
     */
    public void setBillPayTolrCnt(BillPayTolrCntType value) {
        this.billPayTolrCnt = value;
    }

    /**
     * Gets the value of the wireCompId property.
     * 
     * @return
     *     possible object is
     *     {@link WireCompIdType }
     *     
     */
    public WireCompIdType getWireCompId() {
        return wireCompId;
    }

    /**
     * Sets the value of the wireCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireCompIdType }
     *     
     */
    public void setWireCompId(WireCompIdType value) {
        this.wireCompId = value;
    }

    /**
     * Gets the value of the dspAppInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link DspAppInfoArrayAType }
     *     
     */
    public DspAppInfoArrayAType getDspAppInfoArray() {
        return dspAppInfoArray;
    }

    /**
     * Sets the value of the dspAppInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DspAppInfoArrayAType }
     *     
     */
    public void setDspAppInfoArray(DspAppInfoArrayAType value) {
        this.dspAppInfoArray = value;
    }

    /**
     * Gets the value of the emailArray property.
     * 
     * @return
     *     possible object is
     *     {@link EmailArrayAType }
     *     
     */
    public EmailArrayAType getEmailArray() {
        return emailArray;
    }

    /**
     * Sets the value of the emailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailArrayAType }
     *     
     */
    public void setEmailArray(EmailArrayAType value) {
        this.emailArray = value;
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
     * Gets the value of the aliasUsrName property.
     * 
     * @return
     *     possible object is
     *     {@link AliasUsrNameType }
     *     
     */
    public AliasUsrNameType getAliasUsrName() {
        return aliasUsrName;
    }

    /**
     * Sets the value of the aliasUsrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasUsrNameType }
     *     
     */
    public void setAliasUsrName(AliasUsrNameType value) {
        this.aliasUsrName = value;
    }

    /**
     * Gets the value of the intnetIdState property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetIdStateType }
     *     
     */
    public IntnetIdStateType getIntnetIdState() {
        return intnetIdState;
    }

    /**
     * Sets the value of the intnetIdState property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetIdStateType }
     *     
     */
    public void setIntnetIdState(IntnetIdStateType value) {
        this.intnetIdState = value;
    }

    /**
     * Gets the value of the lastFailLogInTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastFailLogInTimeDtType }
     *     
     */
    public LastFailLogInTimeDtType getLastFailLogInTimeDt() {
        return lastFailLogInTimeDt;
    }

    /**
     * Sets the value of the lastFailLogInTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastFailLogInTimeDtType }
     *     
     */
    public void setLastFailLogInTimeDt(LastFailLogInTimeDtType value) {
        this.lastFailLogInTimeDt = value;
    }

    /**
     * Gets the value of the secTokenInUse property.
     * 
     * @return
     *     possible object is
     *     {@link SecTokenInUseType }
     *     
     */
    public SecTokenInUseType getSecTokenInUse() {
        return secTokenInUse;
    }

    /**
     * Sets the value of the secTokenInUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecTokenInUseType }
     *     
     */
    public void setSecTokenInUse(SecTokenInUseType value) {
        this.secTokenInUse = value;
    }

    /**
     * Gets the value of the intnetAcptTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetAcptTimeDtType }
     *     
     */
    public IntnetAcptTimeDtType getIntnetAcptTimeDt() {
        return intnetAcptTimeDt;
    }

    /**
     * Sets the value of the intnetAcptTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetAcptTimeDtType }
     *     
     */
    public void setIntnetAcptTimeDt(IntnetAcptTimeDtType value) {
        this.intnetAcptTimeDt = value;
    }

    /**
     * Gets the value of the intnetOrigPIN property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetOrigPINType }
     *     
     */
    public IntnetOrigPINType getIntnetOrigPIN() {
        return intnetOrigPIN;
    }

    /**
     * Sets the value of the intnetOrigPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetOrigPINType }
     *     
     */
    public void setIntnetOrigPIN(IntnetOrigPINType value) {
        this.intnetOrigPIN = value;
    }

    /**
     * Gets the value of the extcFldrName property.
     * 
     * @return
     *     possible object is
     *     {@link ExtcFldrNameType }
     *     
     */
    public ExtcFldrNameType getExtcFldrName() {
        return extcFldrName;
    }

    /**
     * Sets the value of the extcFldrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtcFldrNameType }
     *     
     */
    public void setExtcFldrName(ExtcFldrNameType value) {
        this.extcFldrName = value;
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
     * Gets the value of the achFeeChgAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getACHFeeChgAcctId() {
        return achFeeChgAcctId;
    }

    /**
     * Sets the value of the achFeeChgAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setACHFeeChgAcctId(AccountIdCType value) {
        this.achFeeChgAcctId = value;
    }

    /**
     * Gets the value of the intnetCatType property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetCatTypeType }
     *     
     */
    public IntnetCatTypeType getIntnetCatType() {
        return intnetCatType;
    }

    /**
     * Sets the value of the intnetCatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetCatTypeType }
     *     
     */
    public void setIntnetCatType(IntnetCatTypeType value) {
        this.intnetCatType = value;
    }

    /**
     * Gets the value of the intnetFeeChgArray property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetFeeChgArrayAType }
     *     
     */
    public IntnetFeeChgArrayAType getIntnetFeeChgArray() {
        return intnetFeeChgArray;
    }

    /**
     * Sets the value of the intnetFeeChgArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetFeeChgArrayAType }
     *     
     */
    public void setIntnetFeeChgArray(IntnetFeeChgArrayAType value) {
        this.intnetFeeChgArray = value;
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
