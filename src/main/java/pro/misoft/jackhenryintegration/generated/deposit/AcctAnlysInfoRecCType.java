
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for AcctAnlysInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctAnlysInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnlysCode" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtBilNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtBilNotCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysCycle" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysCycle_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilLeadDays" type="{http://jackhenry.com/jxchange/TPG/2008}BilLeadDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="CycleTerm" type="{http://jackhenry.com/jxchange/TPG/2008}CycleTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="CycleTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}CycleTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysLastDt" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysLastDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysNxtDt" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysNxtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgLoss" type="{http://jackhenry.com/jxchange/TPG/2008}ChgLoss_Type" minOccurs="0"/&gt;
 *         &lt;element name="WavExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}WavExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}ChgAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}ChgAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LeadAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}LeadAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtAnlysStmt" type="{http://jackhenry.com/jxchange/TPG/2008}PrtAnlysStmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtSumRpt" type="{http://jackhenry.com/jxchange/TPG/2008}PrtSumRpt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysCarryOverType" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysCarryOverType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysCarryOverTerm" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysCarryOverTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysCarryOverTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysCarryOverTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="LoanCompenBal" type="{http://jackhenry.com/jxchange/TPG/2008}LoanCompenBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysPlanType" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysPlanType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysStmtDlvryCode" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysStmtDlvryCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtAnlysLossStmt" type="{http://jackhenry.com/jxchange/TPG/2008}PrtAnlysLossStmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysSerChgPosType" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysSerChgPosType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysIntPdType" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysIntPdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysFDICType" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysFDICType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysBalType" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysBalType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtCompenBalBalType" type="{http://jackhenry.com/jxchange/TPG/2008}PrtCompenBalType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctAnlysCarryOvrBal" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysCarryOvrBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctAnlysRewType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysRewType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctAnlysAdvaUnColType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysAdvaUnColType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctAnlysPlnRenewDt" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysPlnRenewDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctAnlysPlnRenewType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysPlnRenewType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AcctAnlysInfoRec_CType", propOrder = {
    "anlysCode",
    "brCode",
    "prtBilNotCode",
    "anlysCycle",
    "bilLeadDays",
    "cycleTerm",
    "cycleTermUnits",
    "acctStat",
    "anlysLastDt",
    "anlysNxtDt",
    "offCode",
    "chgLoss",
    "wavExpDt",
    "chgAcctId",
    "chgAcctType",
    "leadAcctId",
    "prtAnlysStmt",
    "prtSumRpt",
    "anlysCarryOverType",
    "anlysCarryOverTerm",
    "anlysCarryOverTermUnits",
    "loanCompenBal",
    "anlysPlanType",
    "anlysStmtDlvryCode",
    "prtAnlysLossStmt",
    "anlysSerChgPosType",
    "anlysIntPdType",
    "anlysFDICType",
    "anlysBalType",
    "prtCompenBalBalType",
    "acctAnlysCarryOvrBal",
    "acctAnlysRewType",
    "acctAnlysAdvaUnColType",
    "acctAnlysPlnRenewDt",
    "acctAnlysPlnRenewType",
    "ver1",
    "any"
})
public class AcctAnlysInfoRecCType {

    @XmlElement(name = "AnlysCode")
    protected AnlysCodeType anlysCode;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "PrtBilNotCode")
    protected PrtBilNotCodeType prtBilNotCode;
    @XmlElement(name = "AnlysCycle")
    protected AnlysCycleType anlysCycle;
    @XmlElement(name = "BilLeadDays")
    protected BilLeadDaysType bilLeadDays;
    @XmlElement(name = "CycleTerm")
    protected CycleTermType cycleTerm;
    @XmlElement(name = "CycleTermUnits")
    protected CycleTermUnitsType cycleTermUnits;
    @XmlElement(name = "AcctStat")
    protected AcctStatType acctStat;
    @XmlElement(name = "AnlysLastDt")
    protected AnlysLastDtType anlysLastDt;
    @XmlElement(name = "AnlysNxtDt")
    protected AnlysNxtDtType anlysNxtDt;
    @XmlElement(name = "OffCode")
    protected OffCodeType offCode;
    @XmlElement(name = "ChgLoss")
    protected ChgLossType chgLoss;
    @XmlElement(name = "WavExpDt")
    protected WavExpDtType wavExpDt;
    @XmlElement(name = "ChgAcctId")
    protected ChgAcctIdType chgAcctId;
    @XmlElement(name = "ChgAcctType")
    protected ChgAcctTypeType chgAcctType;
    @XmlElement(name = "LeadAcctId")
    protected LeadAcctIdType leadAcctId;
    @XmlElement(name = "PrtAnlysStmt")
    protected PrtAnlysStmtType prtAnlysStmt;
    @XmlElement(name = "PrtSumRpt")
    protected PrtSumRptType prtSumRpt;
    @XmlElement(name = "AnlysCarryOverType")
    protected AnlysCarryOverTypeType anlysCarryOverType;
    @XmlElement(name = "AnlysCarryOverTerm")
    protected AnlysCarryOverTermType anlysCarryOverTerm;
    @XmlElement(name = "AnlysCarryOverTermUnits")
    protected AnlysCarryOverTermUnitsType anlysCarryOverTermUnits;
    @XmlElement(name = "LoanCompenBal")
    protected LoanCompenBalType loanCompenBal;
    @XmlElement(name = "AnlysPlanType")
    protected AnlysPlanTypeType anlysPlanType;
    @XmlElement(name = "AnlysStmtDlvryCode")
    protected AnlysStmtDlvryCodeType anlysStmtDlvryCode;
    @XmlElement(name = "PrtAnlysLossStmt")
    protected PrtAnlysLossStmtType prtAnlysLossStmt;
    @XmlElement(name = "AnlysSerChgPosType")
    protected AnlysSerChgPosTypeType anlysSerChgPosType;
    @XmlElement(name = "AnlysIntPdType")
    protected AnlysIntPdTypeType anlysIntPdType;
    @XmlElement(name = "AnlysFDICType")
    protected AnlysFDICTypeType anlysFDICType;
    @XmlElement(name = "AnlysBalType")
    protected AnlysBalTypeType anlysBalType;
    @XmlElement(name = "PrtCompenBalBalType")
    protected PrtCompenBalTypeType prtCompenBalBalType;
    @XmlElement(name = "AcctAnlysCarryOvrBal")
    protected AcctAnlysCarryOvrBalType acctAnlysCarryOvrBal;
    @XmlElement(name = "AcctAnlysRewType")
    protected AcctAnlysRewTypeType acctAnlysRewType;
    @XmlElement(name = "AcctAnlysAdvaUnColType")
    protected AcctAnlysAdvaUnColTypeType acctAnlysAdvaUnColType;
    @XmlElement(name = "AcctAnlysPlnRenewDt")
    protected AcctAnlysPlnRenewDtType acctAnlysPlnRenewDt;
    @XmlElement(name = "AcctAnlysPlnRenewType")
    protected AcctAnlysPlnRenewTypeType acctAnlysPlnRenewType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the anlysCode property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysCodeType }
     *     
     */
    public AnlysCodeType getAnlysCode() {
        return anlysCode;
    }

    /**
     * Sets the value of the anlysCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysCodeType }
     *     
     */
    public void setAnlysCode(AnlysCodeType value) {
        this.anlysCode = value;
    }

    /**
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setBrCode(BrCodeType value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the prtBilNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrtBilNotCodeType }
     *     
     */
    public PrtBilNotCodeType getPrtBilNotCode() {
        return prtBilNotCode;
    }

    /**
     * Sets the value of the prtBilNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtBilNotCodeType }
     *     
     */
    public void setPrtBilNotCode(PrtBilNotCodeType value) {
        this.prtBilNotCode = value;
    }

    /**
     * Gets the value of the anlysCycle property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysCycleType }
     *     
     */
    public AnlysCycleType getAnlysCycle() {
        return anlysCycle;
    }

    /**
     * Sets the value of the anlysCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysCycleType }
     *     
     */
    public void setAnlysCycle(AnlysCycleType value) {
        this.anlysCycle = value;
    }

    /**
     * Gets the value of the bilLeadDays property.
     * 
     * @return
     *     possible object is
     *     {@link BilLeadDaysType }
     *     
     */
    public BilLeadDaysType getBilLeadDays() {
        return bilLeadDays;
    }

    /**
     * Sets the value of the bilLeadDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilLeadDaysType }
     *     
     */
    public void setBilLeadDays(BilLeadDaysType value) {
        this.bilLeadDays = value;
    }

    /**
     * Gets the value of the cycleTerm property.
     * 
     * @return
     *     possible object is
     *     {@link CycleTermType }
     *     
     */
    public CycleTermType getCycleTerm() {
        return cycleTerm;
    }

    /**
     * Sets the value of the cycleTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleTermType }
     *     
     */
    public void setCycleTerm(CycleTermType value) {
        this.cycleTerm = value;
    }

    /**
     * Gets the value of the cycleTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link CycleTermUnitsType }
     *     
     */
    public CycleTermUnitsType getCycleTermUnits() {
        return cycleTermUnits;
    }

    /**
     * Sets the value of the cycleTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleTermUnitsType }
     *     
     */
    public void setCycleTermUnits(CycleTermUnitsType value) {
        this.cycleTermUnits = value;
    }

    /**
     * Gets the value of the acctStat property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatType }
     *     
     */
    public AcctStatType getAcctStat() {
        return acctStat;
    }

    /**
     * Sets the value of the acctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatType }
     *     
     */
    public void setAcctStat(AcctStatType value) {
        this.acctStat = value;
    }

    /**
     * Gets the value of the anlysLastDt property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysLastDtType }
     *     
     */
    public AnlysLastDtType getAnlysLastDt() {
        return anlysLastDt;
    }

    /**
     * Sets the value of the anlysLastDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysLastDtType }
     *     
     */
    public void setAnlysLastDt(AnlysLastDtType value) {
        this.anlysLastDt = value;
    }

    /**
     * Gets the value of the anlysNxtDt property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysNxtDtType }
     *     
     */
    public AnlysNxtDtType getAnlysNxtDt() {
        return anlysNxtDt;
    }

    /**
     * Sets the value of the anlysNxtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysNxtDtType }
     *     
     */
    public void setAnlysNxtDt(AnlysNxtDtType value) {
        this.anlysNxtDt = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setOffCode(OffCodeType value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the chgLoss property.
     * 
     * @return
     *     possible object is
     *     {@link ChgLossType }
     *     
     */
    public ChgLossType getChgLoss() {
        return chgLoss;
    }

    /**
     * Sets the value of the chgLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgLossType }
     *     
     */
    public void setChgLoss(ChgLossType value) {
        this.chgLoss = value;
    }

    /**
     * Gets the value of the wavExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link WavExpDtType }
     *     
     */
    public WavExpDtType getWavExpDt() {
        return wavExpDt;
    }

    /**
     * Sets the value of the wavExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WavExpDtType }
     *     
     */
    public void setWavExpDt(WavExpDtType value) {
        this.wavExpDt = value;
    }

    /**
     * Gets the value of the chgAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link ChgAcctIdType }
     *     
     */
    public ChgAcctIdType getChgAcctId() {
        return chgAcctId;
    }

    /**
     * Sets the value of the chgAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgAcctIdType }
     *     
     */
    public void setChgAcctId(ChgAcctIdType value) {
        this.chgAcctId = value;
    }

    /**
     * Gets the value of the chgAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link ChgAcctTypeType }
     *     
     */
    public ChgAcctTypeType getChgAcctType() {
        return chgAcctType;
    }

    /**
     * Sets the value of the chgAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgAcctTypeType }
     *     
     */
    public void setChgAcctType(ChgAcctTypeType value) {
        this.chgAcctType = value;
    }

    /**
     * Gets the value of the leadAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link LeadAcctIdType }
     *     
     */
    public LeadAcctIdType getLeadAcctId() {
        return leadAcctId;
    }

    /**
     * Sets the value of the leadAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadAcctIdType }
     *     
     */
    public void setLeadAcctId(LeadAcctIdType value) {
        this.leadAcctId = value;
    }

    /**
     * Gets the value of the prtAnlysStmt property.
     * 
     * @return
     *     possible object is
     *     {@link PrtAnlysStmtType }
     *     
     */
    public PrtAnlysStmtType getPrtAnlysStmt() {
        return prtAnlysStmt;
    }

    /**
     * Sets the value of the prtAnlysStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtAnlysStmtType }
     *     
     */
    public void setPrtAnlysStmt(PrtAnlysStmtType value) {
        this.prtAnlysStmt = value;
    }

    /**
     * Gets the value of the prtSumRpt property.
     * 
     * @return
     *     possible object is
     *     {@link PrtSumRptType }
     *     
     */
    public PrtSumRptType getPrtSumRpt() {
        return prtSumRpt;
    }

    /**
     * Sets the value of the prtSumRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtSumRptType }
     *     
     */
    public void setPrtSumRpt(PrtSumRptType value) {
        this.prtSumRpt = value;
    }

    /**
     * Gets the value of the anlysCarryOverType property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysCarryOverTypeType }
     *     
     */
    public AnlysCarryOverTypeType getAnlysCarryOverType() {
        return anlysCarryOverType;
    }

    /**
     * Sets the value of the anlysCarryOverType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysCarryOverTypeType }
     *     
     */
    public void setAnlysCarryOverType(AnlysCarryOverTypeType value) {
        this.anlysCarryOverType = value;
    }

    /**
     * Gets the value of the anlysCarryOverTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysCarryOverTermType }
     *     
     */
    public AnlysCarryOverTermType getAnlysCarryOverTerm() {
        return anlysCarryOverTerm;
    }

    /**
     * Sets the value of the anlysCarryOverTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysCarryOverTermType }
     *     
     */
    public void setAnlysCarryOverTerm(AnlysCarryOverTermType value) {
        this.anlysCarryOverTerm = value;
    }

    /**
     * Gets the value of the anlysCarryOverTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysCarryOverTermUnitsType }
     *     
     */
    public AnlysCarryOverTermUnitsType getAnlysCarryOverTermUnits() {
        return anlysCarryOverTermUnits;
    }

    /**
     * Sets the value of the anlysCarryOverTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysCarryOverTermUnitsType }
     *     
     */
    public void setAnlysCarryOverTermUnits(AnlysCarryOverTermUnitsType value) {
        this.anlysCarryOverTermUnits = value;
    }

    /**
     * Gets the value of the loanCompenBal property.
     * 
     * @return
     *     possible object is
     *     {@link LoanCompenBalType }
     *     
     */
    public LoanCompenBalType getLoanCompenBal() {
        return loanCompenBal;
    }

    /**
     * Sets the value of the loanCompenBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanCompenBalType }
     *     
     */
    public void setLoanCompenBal(LoanCompenBalType value) {
        this.loanCompenBal = value;
    }

    /**
     * Gets the value of the anlysPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysPlanTypeType }
     *     
     */
    public AnlysPlanTypeType getAnlysPlanType() {
        return anlysPlanType;
    }

    /**
     * Sets the value of the anlysPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysPlanTypeType }
     *     
     */
    public void setAnlysPlanType(AnlysPlanTypeType value) {
        this.anlysPlanType = value;
    }

    /**
     * Gets the value of the anlysStmtDlvryCode property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysStmtDlvryCodeType }
     *     
     */
    public AnlysStmtDlvryCodeType getAnlysStmtDlvryCode() {
        return anlysStmtDlvryCode;
    }

    /**
     * Sets the value of the anlysStmtDlvryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysStmtDlvryCodeType }
     *     
     */
    public void setAnlysStmtDlvryCode(AnlysStmtDlvryCodeType value) {
        this.anlysStmtDlvryCode = value;
    }

    /**
     * Gets the value of the prtAnlysLossStmt property.
     * 
     * @return
     *     possible object is
     *     {@link PrtAnlysLossStmtType }
     *     
     */
    public PrtAnlysLossStmtType getPrtAnlysLossStmt() {
        return prtAnlysLossStmt;
    }

    /**
     * Sets the value of the prtAnlysLossStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtAnlysLossStmtType }
     *     
     */
    public void setPrtAnlysLossStmt(PrtAnlysLossStmtType value) {
        this.prtAnlysLossStmt = value;
    }

    /**
     * Gets the value of the anlysSerChgPosType property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysSerChgPosTypeType }
     *     
     */
    public AnlysSerChgPosTypeType getAnlysSerChgPosType() {
        return anlysSerChgPosType;
    }

    /**
     * Sets the value of the anlysSerChgPosType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysSerChgPosTypeType }
     *     
     */
    public void setAnlysSerChgPosType(AnlysSerChgPosTypeType value) {
        this.anlysSerChgPosType = value;
    }

    /**
     * Gets the value of the anlysIntPdType property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysIntPdTypeType }
     *     
     */
    public AnlysIntPdTypeType getAnlysIntPdType() {
        return anlysIntPdType;
    }

    /**
     * Sets the value of the anlysIntPdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysIntPdTypeType }
     *     
     */
    public void setAnlysIntPdType(AnlysIntPdTypeType value) {
        this.anlysIntPdType = value;
    }

    /**
     * Gets the value of the anlysFDICType property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysFDICTypeType }
     *     
     */
    public AnlysFDICTypeType getAnlysFDICType() {
        return anlysFDICType;
    }

    /**
     * Sets the value of the anlysFDICType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysFDICTypeType }
     *     
     */
    public void setAnlysFDICType(AnlysFDICTypeType value) {
        this.anlysFDICType = value;
    }

    /**
     * Gets the value of the anlysBalType property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysBalTypeType }
     *     
     */
    public AnlysBalTypeType getAnlysBalType() {
        return anlysBalType;
    }

    /**
     * Sets the value of the anlysBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysBalTypeType }
     *     
     */
    public void setAnlysBalType(AnlysBalTypeType value) {
        this.anlysBalType = value;
    }

    /**
     * Gets the value of the prtCompenBalBalType property.
     * 
     * @return
     *     possible object is
     *     {@link PrtCompenBalTypeType }
     *     
     */
    public PrtCompenBalTypeType getPrtCompenBalBalType() {
        return prtCompenBalBalType;
    }

    /**
     * Sets the value of the prtCompenBalBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtCompenBalTypeType }
     *     
     */
    public void setPrtCompenBalBalType(PrtCompenBalTypeType value) {
        this.prtCompenBalBalType = value;
    }

    /**
     * Gets the value of the acctAnlysCarryOvrBal property.
     * 
     * @return
     *     possible object is
     *     {@link AcctAnlysCarryOvrBalType }
     *     
     */
    public AcctAnlysCarryOvrBalType getAcctAnlysCarryOvrBal() {
        return acctAnlysCarryOvrBal;
    }

    /**
     * Sets the value of the acctAnlysCarryOvrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAnlysCarryOvrBalType }
     *     
     */
    public void setAcctAnlysCarryOvrBal(AcctAnlysCarryOvrBalType value) {
        this.acctAnlysCarryOvrBal = value;
    }

    /**
     * Gets the value of the acctAnlysRewType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctAnlysRewTypeType }
     *     
     */
    public AcctAnlysRewTypeType getAcctAnlysRewType() {
        return acctAnlysRewType;
    }

    /**
     * Sets the value of the acctAnlysRewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAnlysRewTypeType }
     *     
     */
    public void setAcctAnlysRewType(AcctAnlysRewTypeType value) {
        this.acctAnlysRewType = value;
    }

    /**
     * Gets the value of the acctAnlysAdvaUnColType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctAnlysAdvaUnColTypeType }
     *     
     */
    public AcctAnlysAdvaUnColTypeType getAcctAnlysAdvaUnColType() {
        return acctAnlysAdvaUnColType;
    }

    /**
     * Sets the value of the acctAnlysAdvaUnColType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAnlysAdvaUnColTypeType }
     *     
     */
    public void setAcctAnlysAdvaUnColType(AcctAnlysAdvaUnColTypeType value) {
        this.acctAnlysAdvaUnColType = value;
    }

    /**
     * Gets the value of the acctAnlysPlnRenewDt property.
     * 
     * @return
     *     possible object is
     *     {@link AcctAnlysPlnRenewDtType }
     *     
     */
    public AcctAnlysPlnRenewDtType getAcctAnlysPlnRenewDt() {
        return acctAnlysPlnRenewDt;
    }

    /**
     * Sets the value of the acctAnlysPlnRenewDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAnlysPlnRenewDtType }
     *     
     */
    public void setAcctAnlysPlnRenewDt(AcctAnlysPlnRenewDtType value) {
        this.acctAnlysPlnRenewDt = value;
    }

    /**
     * Gets the value of the acctAnlysPlnRenewType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctAnlysPlnRenewTypeType }
     *     
     */
    public AcctAnlysPlnRenewTypeType getAcctAnlysPlnRenewType() {
        return acctAnlysPlnRenewType;
    }

    /**
     * Sets the value of the acctAnlysPlnRenewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAnlysPlnRenewTypeType }
     *     
     */
    public void setAcctAnlysPlnRenewType(AcctAnlysPlnRenewTypeType value) {
        this.acctAnlysPlnRenewType = value;
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
