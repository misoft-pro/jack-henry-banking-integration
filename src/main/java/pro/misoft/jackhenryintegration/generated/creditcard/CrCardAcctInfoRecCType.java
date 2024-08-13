
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CrCardAcctInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardAcctInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCardProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}EmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdEmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}SecdEmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MinPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastStmtBal" type="{http://jackhenry.com/jxchange/TPG/2008}LastStmtBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastStmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastStmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDueAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PastDueAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLmtMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardActCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardActCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStat" type="{http://jackhenry.com/jxchange/TPG/2008}LOCStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntPaidYTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntPaidYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnnPctRate" type="{http://jackhenry.com/jxchange/TPG/2008}AnnPctRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="CashAdvAnnPctRate" type="{http://jackhenry.com/jxchange/TPG/2008}AnnPctRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastCrCardOrderDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastCrCardOrderDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardIssuedNum" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardIssuedNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrLifeCompCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrLifeCompCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtCycle" type="{http://jackhenry.com/jxchange/TPG/2008}StmtCycle_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevLOCLmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardLmtUpdCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardLmtUpdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="RemMinPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RemMinPmtAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardAcctInfoRec_CType", propOrder = {
    "crCardProdDesc",
    "nxtPayDt",
    "embosName",
    "secdEmbosName",
    "acctStat",
    "locLmt",
    "minPmtAmt",
    "lastStmtBal",
    "lastStmtDt",
    "lastPmtAmt",
    "lastPmtDt",
    "pastDueAmt",
    "locLmtMainDt",
    "crCardActCode",
    "locStat",
    "intPaidYTD",
    "annPctRate",
    "cashAdvAnnPctRate",
    "lastCrCardOrderDt",
    "crCardIssuedNum",
    "crCardExpDt",
    "crLifeCompCode",
    "stmtCycle",
    "prevLOCLmt",
    "crCardLmtUpdCode",
    "userDefInfoArray",
    "phoneArray",
    "emailArray",
    "custom",
    "ver1",
    "remMinPmtAmt",
    "ver2",
    "any"
})
public class CrCardAcctInfoRecCType {

    @XmlElement(name = "CrCardProdDesc")
    protected CrCardProdDescType crCardProdDesc;
    @XmlElement(name = "NxtPayDt")
    protected NxtPayDtType nxtPayDt;
    @XmlElement(name = "EmbosName")
    protected EmbosNameType embosName;
    @XmlElement(name = "SecdEmbosName")
    protected SecdEmbosNameType secdEmbosName;
    @XmlElement(name = "AcctStat")
    protected AcctStatType acctStat;
    @XmlElement(name = "LOCLmt")
    protected LOCLmtType locLmt;
    @XmlElement(name = "MinPmtAmt")
    protected MinPmtAmtType minPmtAmt;
    @XmlElement(name = "LastStmtBal")
    protected LastStmtBalType lastStmtBal;
    @XmlElement(name = "LastStmtDt")
    protected LastStmtDtType lastStmtDt;
    @XmlElement(name = "LastPmtAmt")
    protected LastPmtAmtType lastPmtAmt;
    @XmlElement(name = "LastPmtDt")
    protected LastPmtDtType lastPmtDt;
    @XmlElement(name = "PastDueAmt")
    protected PastDueAmtType pastDueAmt;
    @XmlElement(name = "LOCLmtMainDt")
    protected LastMainDtType locLmtMainDt;
    @XmlElement(name = "CrCardActCode")
    protected CrCardActCodeType crCardActCode;
    @XmlElement(name = "LOCStat")
    protected LOCStatType locStat;
    @XmlElement(name = "IntPaidYTD")
    protected IntPaidYTDType intPaidYTD;
    @XmlElement(name = "AnnPctRate")
    protected AnnPctRateType annPctRate;
    @XmlElement(name = "CashAdvAnnPctRate")
    protected AnnPctRateType cashAdvAnnPctRate;
    @XmlElement(name = "LastCrCardOrderDt")
    protected LastCrCardOrderDtType lastCrCardOrderDt;
    @XmlElement(name = "CrCardIssuedNum")
    protected CrCardIssuedNumType crCardIssuedNum;
    @XmlElement(name = "CrCardExpDt")
    protected ExpDtType crCardExpDt;
    @XmlElement(name = "CrLifeCompCode")
    protected CrLifeCompCodeType crLifeCompCode;
    @XmlElement(name = "StmtCycle")
    protected StmtCycleType stmtCycle;
    @XmlElement(name = "PrevLOCLmt")
    protected LOCLmtType prevLOCLmt;
    @XmlElement(name = "CrCardLmtUpdCode")
    protected CrCardLmtUpdCodeType crCardLmtUpdCode;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "PhoneArray")
    protected PhoneArrayAType phoneArray;
    @XmlElement(name = "EmailArray")
    protected EmailArrayAType emailArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "RemMinPmtAmt")
    protected RemMinPmtAmtType remMinPmtAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crCardProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardProdDescType }
     *     
     */
    public CrCardProdDescType getCrCardProdDesc() {
        return crCardProdDesc;
    }

    /**
     * Sets the value of the crCardProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardProdDescType }
     *     
     */
    public void setCrCardProdDesc(CrCardProdDescType value) {
        this.crCardProdDesc = value;
    }

    /**
     * Gets the value of the nxtPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link NxtPayDtType }
     *     
     */
    public NxtPayDtType getNxtPayDt() {
        return nxtPayDt;
    }

    /**
     * Sets the value of the nxtPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NxtPayDtType }
     *     
     */
    public void setNxtPayDt(NxtPayDtType value) {
        this.nxtPayDt = value;
    }

    /**
     * Gets the value of the embosName property.
     * 
     * @return
     *     possible object is
     *     {@link EmbosNameType }
     *     
     */
    public EmbosNameType getEmbosName() {
        return embosName;
    }

    /**
     * Sets the value of the embosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbosNameType }
     *     
     */
    public void setEmbosName(EmbosNameType value) {
        this.embosName = value;
    }

    /**
     * Gets the value of the secdEmbosName property.
     * 
     * @return
     *     possible object is
     *     {@link SecdEmbosNameType }
     *     
     */
    public SecdEmbosNameType getSecdEmbosName() {
        return secdEmbosName;
    }

    /**
     * Sets the value of the secdEmbosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecdEmbosNameType }
     *     
     */
    public void setSecdEmbosName(SecdEmbosNameType value) {
        this.secdEmbosName = value;
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
     * Gets the value of the locLmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCLmtType }
     *     
     */
    public LOCLmtType getLOCLmt() {
        return locLmt;
    }

    /**
     * Sets the value of the locLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCLmtType }
     *     
     */
    public void setLOCLmt(LOCLmtType value) {
        this.locLmt = value;
    }

    /**
     * Gets the value of the minPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MinPmtAmtType }
     *     
     */
    public MinPmtAmtType getMinPmtAmt() {
        return minPmtAmt;
    }

    /**
     * Sets the value of the minPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinPmtAmtType }
     *     
     */
    public void setMinPmtAmt(MinPmtAmtType value) {
        this.minPmtAmt = value;
    }

    /**
     * Gets the value of the lastStmtBal property.
     * 
     * @return
     *     possible object is
     *     {@link LastStmtBalType }
     *     
     */
    public LastStmtBalType getLastStmtBal() {
        return lastStmtBal;
    }

    /**
     * Sets the value of the lastStmtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastStmtBalType }
     *     
     */
    public void setLastStmtBal(LastStmtBalType value) {
        this.lastStmtBal = value;
    }

    /**
     * Gets the value of the lastStmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastStmtDtType }
     *     
     */
    public LastStmtDtType getLastStmtDt() {
        return lastStmtDt;
    }

    /**
     * Sets the value of the lastStmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastStmtDtType }
     *     
     */
    public void setLastStmtDt(LastStmtDtType value) {
        this.lastStmtDt = value;
    }

    /**
     * Gets the value of the lastPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LastPmtAmtType }
     *     
     */
    public LastPmtAmtType getLastPmtAmt() {
        return lastPmtAmt;
    }

    /**
     * Sets the value of the lastPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPmtAmtType }
     *     
     */
    public void setLastPmtAmt(LastPmtAmtType value) {
        this.lastPmtAmt = value;
    }

    /**
     * Gets the value of the lastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastPmtDtType }
     *     
     */
    public LastPmtDtType getLastPmtDt() {
        return lastPmtDt;
    }

    /**
     * Sets the value of the lastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPmtDtType }
     *     
     */
    public void setLastPmtDt(LastPmtDtType value) {
        this.lastPmtDt = value;
    }

    /**
     * Gets the value of the pastDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PastDueAmtType }
     *     
     */
    public PastDueAmtType getPastDueAmt() {
        return pastDueAmt;
    }

    /**
     * Sets the value of the pastDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDueAmtType }
     *     
     */
    public void setPastDueAmt(PastDueAmtType value) {
        this.pastDueAmt = value;
    }

    /**
     * Gets the value of the locLmtMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastMainDtType }
     *     
     */
    public LastMainDtType getLOCLmtMainDt() {
        return locLmtMainDt;
    }

    /**
     * Sets the value of the locLmtMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastMainDtType }
     *     
     */
    public void setLOCLmtMainDt(LastMainDtType value) {
        this.locLmtMainDt = value;
    }

    /**
     * Gets the value of the crCardActCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardActCodeType }
     *     
     */
    public CrCardActCodeType getCrCardActCode() {
        return crCardActCode;
    }

    /**
     * Sets the value of the crCardActCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardActCodeType }
     *     
     */
    public void setCrCardActCode(CrCardActCodeType value) {
        this.crCardActCode = value;
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
     * Gets the value of the intPaidYTD property.
     * 
     * @return
     *     possible object is
     *     {@link IntPaidYTDType }
     *     
     */
    public IntPaidYTDType getIntPaidYTD() {
        return intPaidYTD;
    }

    /**
     * Sets the value of the intPaidYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntPaidYTDType }
     *     
     */
    public void setIntPaidYTD(IntPaidYTDType value) {
        this.intPaidYTD = value;
    }

    /**
     * Gets the value of the annPctRate property.
     * 
     * @return
     *     possible object is
     *     {@link AnnPctRateType }
     *     
     */
    public AnnPctRateType getAnnPctRate() {
        return annPctRate;
    }

    /**
     * Sets the value of the annPctRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnPctRateType }
     *     
     */
    public void setAnnPctRate(AnnPctRateType value) {
        this.annPctRate = value;
    }

    /**
     * Gets the value of the cashAdvAnnPctRate property.
     * 
     * @return
     *     possible object is
     *     {@link AnnPctRateType }
     *     
     */
    public AnnPctRateType getCashAdvAnnPctRate() {
        return cashAdvAnnPctRate;
    }

    /**
     * Sets the value of the cashAdvAnnPctRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnPctRateType }
     *     
     */
    public void setCashAdvAnnPctRate(AnnPctRateType value) {
        this.cashAdvAnnPctRate = value;
    }

    /**
     * Gets the value of the lastCrCardOrderDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastCrCardOrderDtType }
     *     
     */
    public LastCrCardOrderDtType getLastCrCardOrderDt() {
        return lastCrCardOrderDt;
    }

    /**
     * Sets the value of the lastCrCardOrderDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastCrCardOrderDtType }
     *     
     */
    public void setLastCrCardOrderDt(LastCrCardOrderDtType value) {
        this.lastCrCardOrderDt = value;
    }

    /**
     * Gets the value of the crCardIssuedNum property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardIssuedNumType }
     *     
     */
    public CrCardIssuedNumType getCrCardIssuedNum() {
        return crCardIssuedNum;
    }

    /**
     * Sets the value of the crCardIssuedNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardIssuedNumType }
     *     
     */
    public void setCrCardIssuedNum(CrCardIssuedNumType value) {
        this.crCardIssuedNum = value;
    }

    /**
     * Gets the value of the crCardExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getCrCardExpDt() {
        return crCardExpDt;
    }

    /**
     * Sets the value of the crCardExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setCrCardExpDt(ExpDtType value) {
        this.crCardExpDt = value;
    }

    /**
     * Gets the value of the crLifeCompCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrLifeCompCodeType }
     *     
     */
    public CrLifeCompCodeType getCrLifeCompCode() {
        return crLifeCompCode;
    }

    /**
     * Sets the value of the crLifeCompCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrLifeCompCodeType }
     *     
     */
    public void setCrLifeCompCode(CrLifeCompCodeType value) {
        this.crLifeCompCode = value;
    }

    /**
     * Gets the value of the stmtCycle property.
     * 
     * @return
     *     possible object is
     *     {@link StmtCycleType }
     *     
     */
    public StmtCycleType getStmtCycle() {
        return stmtCycle;
    }

    /**
     * Sets the value of the stmtCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtCycleType }
     *     
     */
    public void setStmtCycle(StmtCycleType value) {
        this.stmtCycle = value;
    }

    /**
     * Gets the value of the prevLOCLmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCLmtType }
     *     
     */
    public LOCLmtType getPrevLOCLmt() {
        return prevLOCLmt;
    }

    /**
     * Sets the value of the prevLOCLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCLmtType }
     *     
     */
    public void setPrevLOCLmt(LOCLmtType value) {
        this.prevLOCLmt = value;
    }

    /**
     * Gets the value of the crCardLmtUpdCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardLmtUpdCodeType }
     *     
     */
    public CrCardLmtUpdCodeType getCrCardLmtUpdCode() {
        return crCardLmtUpdCode;
    }

    /**
     * Sets the value of the crCardLmtUpdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardLmtUpdCodeType }
     *     
     */
    public void setCrCardLmtUpdCode(CrCardLmtUpdCodeType value) {
        this.crCardLmtUpdCode = value;
    }

    /**
     * Gets the value of the userDefInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public UserDefInfoArrayAType getUserDefInfoArray() {
        return userDefInfoArray;
    }

    /**
     * Sets the value of the userDefInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public void setUserDefInfoArray(UserDefInfoArrayAType value) {
        this.userDefInfoArray = value;
    }

    /**
     * Gets the value of the phoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getPhoneArray() {
        return phoneArray;
    }

    /**
     * Sets the value of the phoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setPhoneArray(PhoneArrayAType value) {
        this.phoneArray = value;
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
     * Gets the value of the remMinPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemMinPmtAmtType }
     *     
     */
    public RemMinPmtAmtType getRemMinPmtAmt() {
        return remMinPmtAmt;
    }

    /**
     * Sets the value of the remMinPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemMinPmtAmtType }
     *     
     */
    public void setRemMinPmtAmt(RemMinPmtAmtType value) {
        this.remMinPmtAmt = value;
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
     * {@link Element }
     * {@link Object }
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
