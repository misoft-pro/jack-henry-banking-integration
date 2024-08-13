
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
 * <p>Java class for SafeDepAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafeDepAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyDepAmt" type="{http://jackhenry.com/jxchange/TPG/2008}KeyDepAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DiscAmt" type="{http://jackhenry.com/jxchange/TPG/2008}DiscAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClsDt" type="{http://jackhenry.com/jxchange/TPG/2008}ClsDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IncCombStmt" type="{http://jackhenry.com/jxchange/TPG/2008}IncCombStmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="HldMailCode" type="{http://jackhenry.com/jxchange/TPG/2008}HldMailCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DiscPct" type="{http://jackhenry.com/jxchange/TPG/2008}DiscPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="RentalRateIdx" type="{http://jackhenry.com/jxchange/TPG/2008}RentalRateIdx_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgMthd" type="{http://jackhenry.com/jxchange/TPG/2008}ChgMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}ChgAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}ChgAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LateChgCode" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SigVerifyCode" type="{http://jackhenry.com/jxchange/TPG/2008}SigVerifyCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RstrEntryCode" type="{http://jackhenry.com/jxchange/TPG/2008}RstrEntryCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AcctLvlSecCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctLvlSecCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="SalesPerson" type="{http://jackhenry.com/jxchange/TPG/2008}SalesPerson_Type" minOccurs="0"/&gt;
 *           &lt;element name="LangType" type="{http://jackhenry.com/jxchange/TPG/2008}LangType_Type" minOccurs="0"/&gt;
 *           &lt;element name="SalesTaxExmp" type="{http://jackhenry.com/jxchange/TPG/2008}SalesTaxExmp_Type" minOccurs="0"/&gt;
 *           &lt;element name="AutoChgRateIdx" type="{http://jackhenry.com/jxchange/TPG/2008}AutoChgRateIdx_Type" minOccurs="0"/&gt;
 *           &lt;element name="RentalTerm" type="{http://jackhenry.com/jxchange/TPG/2008}RentalTerm_Type" minOccurs="0"/&gt;
 *           &lt;element name="RentalTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
 *           &lt;element name="RentPaidToDt" type="{http://jackhenry.com/jxchange/TPG/2008}RentPaidToDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="SalesTaxRate" type="{http://jackhenry.com/jxchange/TPG/2008}SalesTaxRate_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="EstbPersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *               &lt;element name="EstbPersonTitle" type="{http://jackhenry.com/jxchange/TPG/2008}EmplTitle_Type" minOccurs="0"/&gt;
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
@XmlType(name = "SafeDepAcctInfo_CType", propOrder = {
    "keyDepAmt",
    "discAmt",
    "lastMainDt",
    "openDt",
    "clsDt",
    "glCostCtr",
    "glProdCode",
    "incCombStmt",
    "hldMailCode",
    "discPct",
    "rentalRateIdx",
    "chgMthd",
    "chgAcctId",
    "chgAcctType",
    "lateChgCode",
    "sigVerifyCode",
    "rstrEntryCode",
    "userDefInfoArray",
    "ver1",
    "acctLvlSecCode",
    "salesPerson",
    "langType",
    "salesTaxExmp",
    "autoChgRateIdx",
    "rentalTerm",
    "rentalTermUnits",
    "rentPaidToDt",
    "ver2",
    "salesTaxRate",
    "ver3",
    "estbPersonName",
    "estbPersonTitle",
    "ver4",
    "any"
})
public class SafeDepAcctInfoCType {

    @XmlElement(name = "KeyDepAmt")
    protected KeyDepAmtType keyDepAmt;
    @XmlElement(name = "DiscAmt")
    protected DiscAmtType discAmt;
    @XmlElement(name = "LastMainDt")
    protected LastMainDtType lastMainDt;
    @XmlElement(name = "OpenDt")
    protected OpenDtType openDt;
    @XmlElement(name = "ClsDt")
    protected ClsDtType clsDt;
    @XmlElement(name = "GLCostCtr")
    protected GLCostCtrType glCostCtr;
    @XmlElement(name = "GLProdCode")
    protected GLProdCodeType glProdCode;
    @XmlElement(name = "IncCombStmt")
    protected IncCombStmtType incCombStmt;
    @XmlElement(name = "HldMailCode")
    protected HldMailCodeType hldMailCode;
    @XmlElement(name = "DiscPct")
    protected DiscPctType discPct;
    @XmlElement(name = "RentalRateIdx")
    protected RentalRateIdxType rentalRateIdx;
    @XmlElement(name = "ChgMthd")
    protected ChgMthdType chgMthd;
    @XmlElement(name = "ChgAcctId")
    protected ChgAcctIdType chgAcctId;
    @XmlElement(name = "ChgAcctType")
    protected ChgAcctTypeType chgAcctType;
    @XmlElement(name = "LateChgCode")
    protected LateChgCodeType lateChgCode;
    @XmlElement(name = "SigVerifyCode")
    protected SigVerifyCodeType sigVerifyCode;
    @XmlElement(name = "RstrEntryCode")
    protected RstrEntryCodeType rstrEntryCode;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AcctLvlSecCode")
    protected AcctLvlSecCodeType acctLvlSecCode;
    @XmlElement(name = "SalesPerson")
    protected SalesPersonType salesPerson;
    @XmlElement(name = "LangType")
    protected LangTypeType langType;
    @XmlElement(name = "SalesTaxExmp")
    protected SalesTaxExmpType salesTaxExmp;
    @XmlElement(name = "AutoChgRateIdx")
    protected AutoChgRateIdxType autoChgRateIdx;
    @XmlElement(name = "RentalTerm")
    protected RentalTermType rentalTerm;
    @XmlElement(name = "RentalTermUnits")
    protected TermUnitsType rentalTermUnits;
    @XmlElement(name = "RentPaidToDt")
    protected RentPaidToDtType rentPaidToDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "SalesTaxRate")
    protected SalesTaxRateType salesTaxRate;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "EstbPersonName")
    protected PersonNameCType estbPersonName;
    @XmlElement(name = "EstbPersonTitle")
    protected EmplTitleType estbPersonTitle;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the keyDepAmt property.
     * 
     * @return
     *     possible object is
     *     {@link KeyDepAmtType }
     *     
     */
    public KeyDepAmtType getKeyDepAmt() {
        return keyDepAmt;
    }

    /**
     * Sets the value of the keyDepAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyDepAmtType }
     *     
     */
    public void setKeyDepAmt(KeyDepAmtType value) {
        this.keyDepAmt = value;
    }

    /**
     * Gets the value of the discAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DiscAmtType }
     *     
     */
    public DiscAmtType getDiscAmt() {
        return discAmt;
    }

    /**
     * Sets the value of the discAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscAmtType }
     *     
     */
    public void setDiscAmt(DiscAmtType value) {
        this.discAmt = value;
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
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link OpenDtType }
     *     
     */
    public OpenDtType getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenDtType }
     *     
     */
    public void setOpenDt(OpenDtType value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the clsDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClsDtType }
     *     
     */
    public ClsDtType getClsDt() {
        return clsDt;
    }

    /**
     * Sets the value of the clsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsDtType }
     *     
     */
    public void setClsDt(ClsDtType value) {
        this.clsDt = value;
    }

    /**
     * Gets the value of the glCostCtr property.
     * 
     * @return
     *     possible object is
     *     {@link GLCostCtrType }
     *     
     */
    public GLCostCtrType getGLCostCtr() {
        return glCostCtr;
    }

    /**
     * Sets the value of the glCostCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLCostCtrType }
     *     
     */
    public void setGLCostCtr(GLCostCtrType value) {
        this.glCostCtr = value;
    }

    /**
     * Gets the value of the glProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLProdCodeType }
     *     
     */
    public GLProdCodeType getGLProdCode() {
        return glProdCode;
    }

    /**
     * Sets the value of the glProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLProdCodeType }
     *     
     */
    public void setGLProdCode(GLProdCodeType value) {
        this.glProdCode = value;
    }

    /**
     * Gets the value of the incCombStmt property.
     * 
     * @return
     *     possible object is
     *     {@link IncCombStmtType }
     *     
     */
    public IncCombStmtType getIncCombStmt() {
        return incCombStmt;
    }

    /**
     * Sets the value of the incCombStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncCombStmtType }
     *     
     */
    public void setIncCombStmt(IncCombStmtType value) {
        this.incCombStmt = value;
    }

    /**
     * Gets the value of the hldMailCode property.
     * 
     * @return
     *     possible object is
     *     {@link HldMailCodeType }
     *     
     */
    public HldMailCodeType getHldMailCode() {
        return hldMailCode;
    }

    /**
     * Sets the value of the hldMailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HldMailCodeType }
     *     
     */
    public void setHldMailCode(HldMailCodeType value) {
        this.hldMailCode = value;
    }

    /**
     * Gets the value of the discPct property.
     * 
     * @return
     *     possible object is
     *     {@link DiscPctType }
     *     
     */
    public DiscPctType getDiscPct() {
        return discPct;
    }

    /**
     * Sets the value of the discPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscPctType }
     *     
     */
    public void setDiscPct(DiscPctType value) {
        this.discPct = value;
    }

    /**
     * Gets the value of the rentalRateIdx property.
     * 
     * @return
     *     possible object is
     *     {@link RentalRateIdxType }
     *     
     */
    public RentalRateIdxType getRentalRateIdx() {
        return rentalRateIdx;
    }

    /**
     * Sets the value of the rentalRateIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalRateIdxType }
     *     
     */
    public void setRentalRateIdx(RentalRateIdxType value) {
        this.rentalRateIdx = value;
    }

    /**
     * Gets the value of the chgMthd property.
     * 
     * @return
     *     possible object is
     *     {@link ChgMthdType }
     *     
     */
    public ChgMthdType getChgMthd() {
        return chgMthd;
    }

    /**
     * Sets the value of the chgMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgMthdType }
     *     
     */
    public void setChgMthd(ChgMthdType value) {
        this.chgMthd = value;
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
     * Gets the value of the lateChgCode property.
     * 
     * @return
     *     possible object is
     *     {@link LateChgCodeType }
     *     
     */
    public LateChgCodeType getLateChgCode() {
        return lateChgCode;
    }

    /**
     * Sets the value of the lateChgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LateChgCodeType }
     *     
     */
    public void setLateChgCode(LateChgCodeType value) {
        this.lateChgCode = value;
    }

    /**
     * Gets the value of the sigVerifyCode property.
     * 
     * @return
     *     possible object is
     *     {@link SigVerifyCodeType }
     *     
     */
    public SigVerifyCodeType getSigVerifyCode() {
        return sigVerifyCode;
    }

    /**
     * Sets the value of the sigVerifyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigVerifyCodeType }
     *     
     */
    public void setSigVerifyCode(SigVerifyCodeType value) {
        this.sigVerifyCode = value;
    }

    /**
     * Gets the value of the rstrEntryCode property.
     * 
     * @return
     *     possible object is
     *     {@link RstrEntryCodeType }
     *     
     */
    public RstrEntryCodeType getRstrEntryCode() {
        return rstrEntryCode;
    }

    /**
     * Sets the value of the rstrEntryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RstrEntryCodeType }
     *     
     */
    public void setRstrEntryCode(RstrEntryCodeType value) {
        this.rstrEntryCode = value;
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
     * Gets the value of the acctLvlSecCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctLvlSecCodeType }
     *     
     */
    public AcctLvlSecCodeType getAcctLvlSecCode() {
        return acctLvlSecCode;
    }

    /**
     * Sets the value of the acctLvlSecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctLvlSecCodeType }
     *     
     */
    public void setAcctLvlSecCode(AcctLvlSecCodeType value) {
        this.acctLvlSecCode = value;
    }

    /**
     * Gets the value of the salesPerson property.
     * 
     * @return
     *     possible object is
     *     {@link SalesPersonType }
     *     
     */
    public SalesPersonType getSalesPerson() {
        return salesPerson;
    }

    /**
     * Sets the value of the salesPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesPersonType }
     *     
     */
    public void setSalesPerson(SalesPersonType value) {
        this.salesPerson = value;
    }

    /**
     * Gets the value of the langType property.
     * 
     * @return
     *     possible object is
     *     {@link LangTypeType }
     *     
     */
    public LangTypeType getLangType() {
        return langType;
    }

    /**
     * Sets the value of the langType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangTypeType }
     *     
     */
    public void setLangType(LangTypeType value) {
        this.langType = value;
    }

    /**
     * Gets the value of the salesTaxExmp property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxExmpType }
     *     
     */
    public SalesTaxExmpType getSalesTaxExmp() {
        return salesTaxExmp;
    }

    /**
     * Sets the value of the salesTaxExmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxExmpType }
     *     
     */
    public void setSalesTaxExmp(SalesTaxExmpType value) {
        this.salesTaxExmp = value;
    }

    /**
     * Gets the value of the autoChgRateIdx property.
     * 
     * @return
     *     possible object is
     *     {@link AutoChgRateIdxType }
     *     
     */
    public AutoChgRateIdxType getAutoChgRateIdx() {
        return autoChgRateIdx;
    }

    /**
     * Sets the value of the autoChgRateIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoChgRateIdxType }
     *     
     */
    public void setAutoChgRateIdx(AutoChgRateIdxType value) {
        this.autoChgRateIdx = value;
    }

    /**
     * Gets the value of the rentalTerm property.
     * 
     * @return
     *     possible object is
     *     {@link RentalTermType }
     *     
     */
    public RentalTermType getRentalTerm() {
        return rentalTerm;
    }

    /**
     * Sets the value of the rentalTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalTermType }
     *     
     */
    public void setRentalTerm(RentalTermType value) {
        this.rentalTerm = value;
    }

    /**
     * Gets the value of the rentalTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TermUnitsType }
     *     
     */
    public TermUnitsType getRentalTermUnits() {
        return rentalTermUnits;
    }

    /**
     * Sets the value of the rentalTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermUnitsType }
     *     
     */
    public void setRentalTermUnits(TermUnitsType value) {
        this.rentalTermUnits = value;
    }

    /**
     * Gets the value of the rentPaidToDt property.
     * 
     * @return
     *     possible object is
     *     {@link RentPaidToDtType }
     *     
     */
    public RentPaidToDtType getRentPaidToDt() {
        return rentPaidToDt;
    }

    /**
     * Sets the value of the rentPaidToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentPaidToDtType }
     *     
     */
    public void setRentPaidToDt(RentPaidToDtType value) {
        this.rentPaidToDt = value;
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
     * Gets the value of the salesTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxRateType }
     *     
     */
    public SalesTaxRateType getSalesTaxRate() {
        return salesTaxRate;
    }

    /**
     * Sets the value of the salesTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxRateType }
     *     
     */
    public void setSalesTaxRate(SalesTaxRateType value) {
        this.salesTaxRate = value;
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
     * Gets the value of the estbPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getEstbPersonName() {
        return estbPersonName;
    }

    /**
     * Sets the value of the estbPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setEstbPersonName(PersonNameCType value) {
        this.estbPersonName = value;
    }

    /**
     * Gets the value of the estbPersonTitle property.
     * 
     * @return
     *     possible object is
     *     {@link EmplTitleType }
     *     
     */
    public EmplTitleType getEstbPersonTitle() {
        return estbPersonTitle;
    }

    /**
     * Sets the value of the estbPersonTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplTitleType }
     *     
     */
    public void setEstbPersonTitle(EmplTitleType value) {
        this.estbPersonTitle = value;
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
