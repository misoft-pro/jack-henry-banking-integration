
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
 * <p>Java class for LtrOfCrInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtrOfCrInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LOCAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCode" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LOCDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStat" type="{http://jackhenry.com/jxchange/TPG/2008}LOCStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LOCStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCBrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCBrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCOrigAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCOrigAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAvlBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCommBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCommBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCTotAdvaAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCTotAdvaAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCFrzAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCFrzAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCallRptCode" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCallRptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCollatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCollatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCOrigTerm" type="{http://jackhenry.com/jxchange/TPG/2008}LOCOrigTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCOrigTermUnit" type="{http://jackhenry.com/jxchange/TPG/2008}LOCOrigTermUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCPrtCnsldtStmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCPrtCnsldtStmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStmtDay" type="{http://jackhenry.com/jxchange/TPG/2008}StmtDay_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStmtFreq" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStmtFreqCode" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFreqCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStmtFreqDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFreqDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCSemiDay1" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay1_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCSemiDay2" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay2_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLastStmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastStmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCTaxRefId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCTaxRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCGdnceBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCGdnceAvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceAvlBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCGdnceType" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCGdnceBorwAck" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceBorwAck_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCGdnceRedType" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceRedType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCPrincRedAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCPrincRedAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCMasterAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCMasterAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="LOCAvlCalcType" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAvlCalcType_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="LtrOfCrLmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLmt_Type" minOccurs="0"/&gt;
 *             &lt;element name="LtrOfCrAvl" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAvlBal_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="MaxTrancheCrtCnt" type="{http://jackhenry.com/jxchange/TPG/2008}RecCnt_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="MLLIncCombStmt" type="{http://jackhenry.com/jxchange/TPG/2008}IncCombStmt_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LtrOfCrInqRec_CType", propOrder = {
    "locAmt",
    "locExpDt",
    "locCode",
    "locDesc",
    "locStat",
    "locStatDesc",
    "locBrCode",
    "locBrDesc",
    "locOffCode",
    "locOffDesc",
    "locCurBal",
    "locOrigAmt",
    "locAvlBal",
    "locCommBal",
    "locTotAdvaAmt",
    "locFrzAmt",
    "locCallRptCode",
    "locCallRptDesc",
    "locCollatCode",
    "locCollatDesc",
    "locOrigTerm",
    "locOrigTermUnit",
    "locPrtCnsldtStmt",
    "locStmtDay",
    "locStmtFreq",
    "locStmtFreqCode",
    "locStmtFreqDesc",
    "locSemiDay1",
    "locSemiDay2",
    "locLastStmtDt",
    "locLastMainDt",
    "locTaxRefId",
    "locGdnceBal",
    "locGdnceAvlBal",
    "locGdnceType",
    "locGdnceBorwAck",
    "locGdnceRedType",
    "locPrincRedAmt",
    "locMasterAcctId",
    "custom",
    "ver1",
    "locAvlCalcType",
    "ver2",
    "ltrOfCrLmt",
    "ltrOfCrAvl",
    "ver3",
    "maxTrancheCrtCnt",
    "ver4",
    "mllIncCombStmt",
    "ver5",
    "any"
})
public class LtrOfCrInqRecCType {

    @XmlElement(name = "LOCAmt")
    protected LOCAmtType locAmt;
    @XmlElement(name = "LOCExpDt")
    protected LOCExpDtType locExpDt;
    @XmlElement(name = "LOCCode")
    protected LOCCodeType locCode;
    @XmlElement(name = "LOCDesc")
    protected LOCDescType locDesc;
    @XmlElement(name = "LOCStat")
    protected LOCStatType locStat;
    @XmlElement(name = "LOCStatDesc")
    protected LOCStatDescType locStatDesc;
    @XmlElement(name = "LOCBrCode")
    protected BrCodeType locBrCode;
    @XmlElement(name = "LOCBrDesc")
    protected BrDescType locBrDesc;
    @XmlElement(name = "LOCOffCode")
    protected OffCodeType locOffCode;
    @XmlElement(name = "LOCOffDesc")
    protected OffDescType locOffDesc;
    @XmlElement(name = "LOCCurBal")
    protected LOCCurBalType locCurBal;
    @XmlElement(name = "LOCOrigAmt")
    protected LOCOrigAmtType locOrigAmt;
    @XmlElement(name = "LOCAvlBal")
    protected LOCAvlBalType locAvlBal;
    @XmlElement(name = "LOCCommBal")
    protected LOCCommBalType locCommBal;
    @XmlElement(name = "LOCTotAdvaAmt")
    protected LOCTotAdvaAmtType locTotAdvaAmt;
    @XmlElement(name = "LOCFrzAmt")
    protected LOCFrzAmtType locFrzAmt;
    @XmlElement(name = "LOCCallRptCode")
    protected CallRptCodeType locCallRptCode;
    @XmlElement(name = "LOCCallRptDesc")
    protected CallRptDescType locCallRptDesc;
    @XmlElement(name = "LOCCollatCode")
    protected CollatCodeType locCollatCode;
    @XmlElement(name = "LOCCollatDesc")
    protected CollatDescType locCollatDesc;
    @XmlElement(name = "LOCOrigTerm")
    protected LOCOrigTermType locOrigTerm;
    @XmlElement(name = "LOCOrigTermUnit")
    protected LOCOrigTermUnitType locOrigTermUnit;
    @XmlElement(name = "LOCPrtCnsldtStmt")
    protected LOCPrtCnsldtStmtType locPrtCnsldtStmt;
    @XmlElement(name = "LOCStmtDay")
    protected StmtDayType locStmtDay;
    @XmlElement(name = "LOCStmtFreq")
    protected StmtFreqType locStmtFreq;
    @XmlElement(name = "LOCStmtFreqCode")
    protected StmtFreqCodeType locStmtFreqCode;
    @XmlElement(name = "LOCStmtFreqDesc")
    protected StmtFreqDescType locStmtFreqDesc;
    @XmlElement(name = "LOCSemiDay1")
    protected SemiDay1Type locSemiDay1;
    @XmlElement(name = "LOCSemiDay2")
    protected SemiDay2Type locSemiDay2;
    @XmlElement(name = "LOCLastStmtDt")
    protected LastStmtDtType locLastStmtDt;
    @XmlElement(name = "LOCLastMainDt")
    protected LastMainDtType locLastMainDt;
    @XmlElement(name = "LOCTaxRefId")
    protected LOCTaxRefIdType locTaxRefId;
    @XmlElement(name = "LOCGdnceBal")
    protected LOCGdnceBalType locGdnceBal;
    @XmlElement(name = "LOCGdnceAvlBal")
    protected LOCGdnceAvlBalType locGdnceAvlBal;
    @XmlElement(name = "LOCGdnceType")
    protected LOCGdnceTypeType locGdnceType;
    @XmlElement(name = "LOCGdnceBorwAck")
    protected LOCGdnceBorwAckType locGdnceBorwAck;
    @XmlElement(name = "LOCGdnceRedType")
    protected LOCGdnceRedTypeType locGdnceRedType;
    @XmlElement(name = "LOCPrincRedAmt")
    protected LOCPrincRedAmtType locPrincRedAmt;
    @XmlElement(name = "LOCMasterAcctId")
    protected LOCMasterAcctIdType locMasterAcctId;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "LOCAvlCalcType")
    protected LOCAvlCalcTypeType locAvlCalcType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "LtrOfCrLmt")
    protected LOCLmtType ltrOfCrLmt;
    @XmlElement(name = "LtrOfCrAvl")
    protected LOCAvlBalType ltrOfCrAvl;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "MaxTrancheCrtCnt")
    protected RecCntType maxTrancheCrtCnt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "MLLIncCombStmt")
    protected IncCombStmtType mllIncCombStmt;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the locAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAmtType }
     *     
     */
    public LOCAmtType getLOCAmt() {
        return locAmt;
    }

    /**
     * Sets the value of the locAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAmtType }
     *     
     */
    public void setLOCAmt(LOCAmtType value) {
        this.locAmt = value;
    }

    /**
     * Gets the value of the locExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCExpDtType }
     *     
     */
    public LOCExpDtType getLOCExpDt() {
        return locExpDt;
    }

    /**
     * Sets the value of the locExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCExpDtType }
     *     
     */
    public void setLOCExpDt(LOCExpDtType value) {
        this.locExpDt = value;
    }

    /**
     * Gets the value of the locCode property.
     * 
     * @return
     *     possible object is
     *     {@link LOCCodeType }
     *     
     */
    public LOCCodeType getLOCCode() {
        return locCode;
    }

    /**
     * Sets the value of the locCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCCodeType }
     *     
     */
    public void setLOCCode(LOCCodeType value) {
        this.locCode = value;
    }

    /**
     * Gets the value of the locDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LOCDescType }
     *     
     */
    public LOCDescType getLOCDesc() {
        return locDesc;
    }

    /**
     * Sets the value of the locDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCDescType }
     *     
     */
    public void setLOCDesc(LOCDescType value) {
        this.locDesc = value;
    }

    /**
     * Gets the value of the locStat property.
     * 
     * @return
     *     possible object is
     *     {@link LOCStatType }
     *     
     */
    public LOCStatType getLOCStat() {
        return locStat;
    }

    /**
     * Sets the value of the locStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCStatType }
     *     
     */
    public void setLOCStat(LOCStatType value) {
        this.locStat = value;
    }

    /**
     * Gets the value of the locStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LOCStatDescType }
     *     
     */
    public LOCStatDescType getLOCStatDesc() {
        return locStatDesc;
    }

    /**
     * Sets the value of the locStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCStatDescType }
     *     
     */
    public void setLOCStatDesc(LOCStatDescType value) {
        this.locStatDesc = value;
    }

    /**
     * Gets the value of the locBrCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getLOCBrCode() {
        return locBrCode;
    }

    /**
     * Sets the value of the locBrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setLOCBrCode(BrCodeType value) {
        this.locBrCode = value;
    }

    /**
     * Gets the value of the locBrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getLOCBrDesc() {
        return locBrDesc;
    }

    /**
     * Sets the value of the locBrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setLOCBrDesc(BrDescType value) {
        this.locBrDesc = value;
    }

    /**
     * Gets the value of the locOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getLOCOffCode() {
        return locOffCode;
    }

    /**
     * Sets the value of the locOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setLOCOffCode(OffCodeType value) {
        this.locOffCode = value;
    }

    /**
     * Gets the value of the locOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getLOCOffDesc() {
        return locOffDesc;
    }

    /**
     * Sets the value of the locOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setLOCOffDesc(OffDescType value) {
        this.locOffDesc = value;
    }

    /**
     * Gets the value of the locCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCCurBalType }
     *     
     */
    public LOCCurBalType getLOCCurBal() {
        return locCurBal;
    }

    /**
     * Sets the value of the locCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCCurBalType }
     *     
     */
    public void setLOCCurBal(LOCCurBalType value) {
        this.locCurBal = value;
    }

    /**
     * Gets the value of the locOrigAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCOrigAmtType }
     *     
     */
    public LOCOrigAmtType getLOCOrigAmt() {
        return locOrigAmt;
    }

    /**
     * Sets the value of the locOrigAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCOrigAmtType }
     *     
     */
    public void setLOCOrigAmt(LOCOrigAmtType value) {
        this.locOrigAmt = value;
    }

    /**
     * Gets the value of the locAvlBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAvlBalType }
     *     
     */
    public LOCAvlBalType getLOCAvlBal() {
        return locAvlBal;
    }

    /**
     * Sets the value of the locAvlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAvlBalType }
     *     
     */
    public void setLOCAvlBal(LOCAvlBalType value) {
        this.locAvlBal = value;
    }

    /**
     * Gets the value of the locCommBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCCommBalType }
     *     
     */
    public LOCCommBalType getLOCCommBal() {
        return locCommBal;
    }

    /**
     * Sets the value of the locCommBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCCommBalType }
     *     
     */
    public void setLOCCommBal(LOCCommBalType value) {
        this.locCommBal = value;
    }

    /**
     * Gets the value of the locTotAdvaAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCTotAdvaAmtType }
     *     
     */
    public LOCTotAdvaAmtType getLOCTotAdvaAmt() {
        return locTotAdvaAmt;
    }

    /**
     * Sets the value of the locTotAdvaAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCTotAdvaAmtType }
     *     
     */
    public void setLOCTotAdvaAmt(LOCTotAdvaAmtType value) {
        this.locTotAdvaAmt = value;
    }

    /**
     * Gets the value of the locFrzAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCFrzAmtType }
     *     
     */
    public LOCFrzAmtType getLOCFrzAmt() {
        return locFrzAmt;
    }

    /**
     * Sets the value of the locFrzAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCFrzAmtType }
     *     
     */
    public void setLOCFrzAmt(LOCFrzAmtType value) {
        this.locFrzAmt = value;
    }

    /**
     * Gets the value of the locCallRptCode property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptCodeType }
     *     
     */
    public CallRptCodeType getLOCCallRptCode() {
        return locCallRptCode;
    }

    /**
     * Sets the value of the locCallRptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptCodeType }
     *     
     */
    public void setLOCCallRptCode(CallRptCodeType value) {
        this.locCallRptCode = value;
    }

    /**
     * Gets the value of the locCallRptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptDescType }
     *     
     */
    public CallRptDescType getLOCCallRptDesc() {
        return locCallRptDesc;
    }

    /**
     * Sets the value of the locCallRptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptDescType }
     *     
     */
    public void setLOCCallRptDesc(CallRptDescType value) {
        this.locCallRptDesc = value;
    }

    /**
     * Gets the value of the locCollatCode property.
     * 
     * @return
     *     possible object is
     *     {@link CollatCodeType }
     *     
     */
    public CollatCodeType getLOCCollatCode() {
        return locCollatCode;
    }

    /**
     * Sets the value of the locCollatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatCodeType }
     *     
     */
    public void setLOCCollatCode(CollatCodeType value) {
        this.locCollatCode = value;
    }

    /**
     * Gets the value of the locCollatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDescType }
     *     
     */
    public CollatDescType getLOCCollatDesc() {
        return locCollatDesc;
    }

    /**
     * Sets the value of the locCollatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDescType }
     *     
     */
    public void setLOCCollatDesc(CollatDescType value) {
        this.locCollatDesc = value;
    }

    /**
     * Gets the value of the locOrigTerm property.
     * 
     * @return
     *     possible object is
     *     {@link LOCOrigTermType }
     *     
     */
    public LOCOrigTermType getLOCOrigTerm() {
        return locOrigTerm;
    }

    /**
     * Sets the value of the locOrigTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCOrigTermType }
     *     
     */
    public void setLOCOrigTerm(LOCOrigTermType value) {
        this.locOrigTerm = value;
    }

    /**
     * Gets the value of the locOrigTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link LOCOrigTermUnitType }
     *     
     */
    public LOCOrigTermUnitType getLOCOrigTermUnit() {
        return locOrigTermUnit;
    }

    /**
     * Sets the value of the locOrigTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCOrigTermUnitType }
     *     
     */
    public void setLOCOrigTermUnit(LOCOrigTermUnitType value) {
        this.locOrigTermUnit = value;
    }

    /**
     * Gets the value of the locPrtCnsldtStmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCPrtCnsldtStmtType }
     *     
     */
    public LOCPrtCnsldtStmtType getLOCPrtCnsldtStmt() {
        return locPrtCnsldtStmt;
    }

    /**
     * Sets the value of the locPrtCnsldtStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCPrtCnsldtStmtType }
     *     
     */
    public void setLOCPrtCnsldtStmt(LOCPrtCnsldtStmtType value) {
        this.locPrtCnsldtStmt = value;
    }

    /**
     * Gets the value of the locStmtDay property.
     * 
     * @return
     *     possible object is
     *     {@link StmtDayType }
     *     
     */
    public StmtDayType getLOCStmtDay() {
        return locStmtDay;
    }

    /**
     * Sets the value of the locStmtDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtDayType }
     *     
     */
    public void setLOCStmtDay(StmtDayType value) {
        this.locStmtDay = value;
    }

    /**
     * Gets the value of the locStmtFreq property.
     * 
     * @return
     *     possible object is
     *     {@link StmtFreqType }
     *     
     */
    public StmtFreqType getLOCStmtFreq() {
        return locStmtFreq;
    }

    /**
     * Sets the value of the locStmtFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtFreqType }
     *     
     */
    public void setLOCStmtFreq(StmtFreqType value) {
        this.locStmtFreq = value;
    }

    /**
     * Gets the value of the locStmtFreqCode property.
     * 
     * @return
     *     possible object is
     *     {@link StmtFreqCodeType }
     *     
     */
    public StmtFreqCodeType getLOCStmtFreqCode() {
        return locStmtFreqCode;
    }

    /**
     * Sets the value of the locStmtFreqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtFreqCodeType }
     *     
     */
    public void setLOCStmtFreqCode(StmtFreqCodeType value) {
        this.locStmtFreqCode = value;
    }

    /**
     * Gets the value of the locStmtFreqDesc property.
     * 
     * @return
     *     possible object is
     *     {@link StmtFreqDescType }
     *     
     */
    public StmtFreqDescType getLOCStmtFreqDesc() {
        return locStmtFreqDesc;
    }

    /**
     * Sets the value of the locStmtFreqDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtFreqDescType }
     *     
     */
    public void setLOCStmtFreqDesc(StmtFreqDescType value) {
        this.locStmtFreqDesc = value;
    }

    /**
     * Gets the value of the locSemiDay1 property.
     * 
     * @return
     *     possible object is
     *     {@link SemiDay1Type }
     *     
     */
    public SemiDay1Type getLOCSemiDay1() {
        return locSemiDay1;
    }

    /**
     * Sets the value of the locSemiDay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SemiDay1Type }
     *     
     */
    public void setLOCSemiDay1(SemiDay1Type value) {
        this.locSemiDay1 = value;
    }

    /**
     * Gets the value of the locSemiDay2 property.
     * 
     * @return
     *     possible object is
     *     {@link SemiDay2Type }
     *     
     */
    public SemiDay2Type getLOCSemiDay2() {
        return locSemiDay2;
    }

    /**
     * Sets the value of the locSemiDay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SemiDay2Type }
     *     
     */
    public void setLOCSemiDay2(SemiDay2Type value) {
        this.locSemiDay2 = value;
    }

    /**
     * Gets the value of the locLastStmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastStmtDtType }
     *     
     */
    public LastStmtDtType getLOCLastStmtDt() {
        return locLastStmtDt;
    }

    /**
     * Sets the value of the locLastStmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastStmtDtType }
     *     
     */
    public void setLOCLastStmtDt(LastStmtDtType value) {
        this.locLastStmtDt = value;
    }

    /**
     * Gets the value of the locLastMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastMainDtType }
     *     
     */
    public LastMainDtType getLOCLastMainDt() {
        return locLastMainDt;
    }

    /**
     * Sets the value of the locLastMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastMainDtType }
     *     
     */
    public void setLOCLastMainDt(LastMainDtType value) {
        this.locLastMainDt = value;
    }

    /**
     * Gets the value of the locTaxRefId property.
     * 
     * @return
     *     possible object is
     *     {@link LOCTaxRefIdType }
     *     
     */
    public LOCTaxRefIdType getLOCTaxRefId() {
        return locTaxRefId;
    }

    /**
     * Sets the value of the locTaxRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCTaxRefIdType }
     *     
     */
    public void setLOCTaxRefId(LOCTaxRefIdType value) {
        this.locTaxRefId = value;
    }

    /**
     * Gets the value of the locGdnceBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceBalType }
     *     
     */
    public LOCGdnceBalType getLOCGdnceBal() {
        return locGdnceBal;
    }

    /**
     * Sets the value of the locGdnceBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceBalType }
     *     
     */
    public void setLOCGdnceBal(LOCGdnceBalType value) {
        this.locGdnceBal = value;
    }

    /**
     * Gets the value of the locGdnceAvlBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceAvlBalType }
     *     
     */
    public LOCGdnceAvlBalType getLOCGdnceAvlBal() {
        return locGdnceAvlBal;
    }

    /**
     * Sets the value of the locGdnceAvlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceAvlBalType }
     *     
     */
    public void setLOCGdnceAvlBal(LOCGdnceAvlBalType value) {
        this.locGdnceAvlBal = value;
    }

    /**
     * Gets the value of the locGdnceType property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceTypeType }
     *     
     */
    public LOCGdnceTypeType getLOCGdnceType() {
        return locGdnceType;
    }

    /**
     * Sets the value of the locGdnceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceTypeType }
     *     
     */
    public void setLOCGdnceType(LOCGdnceTypeType value) {
        this.locGdnceType = value;
    }

    /**
     * Gets the value of the locGdnceBorwAck property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceBorwAckType }
     *     
     */
    public LOCGdnceBorwAckType getLOCGdnceBorwAck() {
        return locGdnceBorwAck;
    }

    /**
     * Sets the value of the locGdnceBorwAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceBorwAckType }
     *     
     */
    public void setLOCGdnceBorwAck(LOCGdnceBorwAckType value) {
        this.locGdnceBorwAck = value;
    }

    /**
     * Gets the value of the locGdnceRedType property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceRedTypeType }
     *     
     */
    public LOCGdnceRedTypeType getLOCGdnceRedType() {
        return locGdnceRedType;
    }

    /**
     * Sets the value of the locGdnceRedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceRedTypeType }
     *     
     */
    public void setLOCGdnceRedType(LOCGdnceRedTypeType value) {
        this.locGdnceRedType = value;
    }

    /**
     * Gets the value of the locPrincRedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCPrincRedAmtType }
     *     
     */
    public LOCPrincRedAmtType getLOCPrincRedAmt() {
        return locPrincRedAmt;
    }

    /**
     * Sets the value of the locPrincRedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCPrincRedAmtType }
     *     
     */
    public void setLOCPrincRedAmt(LOCPrincRedAmtType value) {
        this.locPrincRedAmt = value;
    }

    /**
     * Gets the value of the locMasterAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link LOCMasterAcctIdType }
     *     
     */
    public LOCMasterAcctIdType getLOCMasterAcctId() {
        return locMasterAcctId;
    }

    /**
     * Sets the value of the locMasterAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCMasterAcctIdType }
     *     
     */
    public void setLOCMasterAcctId(LOCMasterAcctIdType value) {
        this.locMasterAcctId = value;
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
     * Gets the value of the locAvlCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAvlCalcTypeType }
     *     
     */
    public LOCAvlCalcTypeType getLOCAvlCalcType() {
        return locAvlCalcType;
    }

    /**
     * Sets the value of the locAvlCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAvlCalcTypeType }
     *     
     */
    public void setLOCAvlCalcType(LOCAvlCalcTypeType value) {
        this.locAvlCalcType = value;
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
     * Gets the value of the ltrOfCrLmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCLmtType }
     *     
     */
    public LOCLmtType getLtrOfCrLmt() {
        return ltrOfCrLmt;
    }

    /**
     * Sets the value of the ltrOfCrLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCLmtType }
     *     
     */
    public void setLtrOfCrLmt(LOCLmtType value) {
        this.ltrOfCrLmt = value;
    }

    /**
     * Gets the value of the ltrOfCrAvl property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAvlBalType }
     *     
     */
    public LOCAvlBalType getLtrOfCrAvl() {
        return ltrOfCrAvl;
    }

    /**
     * Sets the value of the ltrOfCrAvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAvlBalType }
     *     
     */
    public void setLtrOfCrAvl(LOCAvlBalType value) {
        this.ltrOfCrAvl = value;
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
     * Gets the value of the maxTrancheCrtCnt property.
     * 
     * @return
     *     possible object is
     *     {@link RecCntType }
     *     
     */
    public RecCntType getMaxTrancheCrtCnt() {
        return maxTrancheCrtCnt;
    }

    /**
     * Sets the value of the maxTrancheCrtCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecCntType }
     *     
     */
    public void setMaxTrancheCrtCnt(RecCntType value) {
        this.maxTrancheCrtCnt = value;
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
     * Gets the value of the mllIncCombStmt property.
     * 
     * @return
     *     possible object is
     *     {@link IncCombStmtType }
     *     
     */
    public IncCombStmtType getMLLIncCombStmt() {
        return mllIncCombStmt;
    }

    /**
     * Sets the value of the mllIncCombStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncCombStmtType }
     *     
     */
    public void setMLLIncCombStmt(IncCombStmtType value) {
        this.mllIncCombStmt = value;
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
