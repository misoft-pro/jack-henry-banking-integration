
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
 * <p>Java class for LnUnitInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnUnitInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctTitleArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_AType" minOccurs="0"/&gt;
 *         &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvailCr" type="{http://jackhenry.com/jxchange/TPG/2008}AvailCr_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}OffInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="OrigBal" type="{http://jackhenry.com/jxchange/TPG/2008}OrigBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Term" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="LateChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MatDt" type="{http://jackhenry.com/jxchange/TPG/2008}MatDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayoffGoodThruDt" type="{http://jackhenry.com/jxchange/TPG/2008}PayoffGoodThruDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtSchedPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtSchedPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PartPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PartPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntBasis" type="{http://jackhenry.com/jxchange/TPG/2008}IntBasis_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtTerm" type="{http://jackhenry.com/jxchange/TPG/2008}PmtTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}PmtTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay1" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay1_Type" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay2" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay2_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccrBal" type="{http://jackhenry.com/jxchange/TPG/2008}AccrBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDueAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PastDueAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnUnitRptMthd" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitRptMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnUnitMaster" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitMaster_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PIAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PIAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="PmtDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDayOfMonth_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnUnitInfoRec_CType", propOrder = {
    "custId",
    "acctTitleArray",
    "prodCode",
    "availCr",
    "offInfoArray",
    "origBal",
    "openDt",
    "term",
    "lateChgAmt",
    "matDt",
    "nxtPayDt",
    "payoffGoodThruDt",
    "nxtSchedPmtDt",
    "partPmtAmt",
    "pmtAmt",
    "intBasis",
    "pmtCode",
    "pmtTerm",
    "pmtTermUnits",
    "intRate",
    "semiDay1",
    "semiDay2",
    "lastPmtDt",
    "accrBal",
    "pastDueAmt",
    "acctStat",
    "lnUnitRptMthd",
    "lnUnitMaster",
    "ver1",
    "piAmt",
    "pmtDayOfMonth",
    "ver2",
    "any"
})
public class LnUnitInfoRecCType {

    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "AcctTitleArray")
    protected AcctTitleAType acctTitleArray;
    @XmlElement(name = "ProdCode")
    protected ProdCodeType prodCode;
    @XmlElement(name = "AvailCr")
    protected AvailCrType availCr;
    @XmlElement(name = "OffInfoArray")
    protected OffInfoArrayAType offInfoArray;
    @XmlElement(name = "OrigBal")
    protected OrigBalType origBal;
    @XmlElement(name = "OpenDt")
    protected OpenDtType openDt;
    @XmlElement(name = "Term")
    protected TermCType term;
    @XmlElement(name = "LateChgAmt")
    protected LateChgAmtType lateChgAmt;
    @XmlElement(name = "MatDt")
    protected MatDtType matDt;
    @XmlElement(name = "NxtPayDt")
    protected NxtPayDtType nxtPayDt;
    @XmlElement(name = "PayoffGoodThruDt")
    protected PayoffGoodThruDtType payoffGoodThruDt;
    @XmlElement(name = "NxtSchedPmtDt")
    protected NxtSchedPmtDtType nxtSchedPmtDt;
    @XmlElement(name = "PartPmtAmt")
    protected PartPmtAmtType partPmtAmt;
    @XmlElement(name = "PmtAmt")
    protected PmtAmtType pmtAmt;
    @XmlElement(name = "IntBasis")
    protected IntBasisType intBasis;
    @XmlElement(name = "PmtCode")
    protected PmtCodeType pmtCode;
    @XmlElement(name = "PmtTerm")
    protected PmtTermType pmtTerm;
    @XmlElement(name = "PmtTermUnits")
    protected PmtTermUnitsType pmtTermUnits;
    @XmlElement(name = "IntRate")
    protected IntRateType intRate;
    @XmlElement(name = "SemiDay1")
    protected SemiDay1Type semiDay1;
    @XmlElement(name = "SemiDay2")
    protected SemiDay2Type semiDay2;
    @XmlElement(name = "LastPmtDt")
    protected LastPmtDtType lastPmtDt;
    @XmlElement(name = "AccrBal")
    protected AccrBalType accrBal;
    @XmlElement(name = "PastDueAmt")
    protected PastDueAmtType pastDueAmt;
    @XmlElement(name = "AcctStat")
    protected AcctStatType acctStat;
    @XmlElement(name = "LnUnitRptMthd")
    protected LnUnitRptMthdType lnUnitRptMthd;
    @XmlElement(name = "LnUnitMaster")
    protected LnUnitMasterType lnUnitMaster;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PIAmt")
    protected PIAmtType piAmt;
    @XmlElement(name = "PmtDayOfMonth")
    protected PmtDayOfMonthType pmtDayOfMonth;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
    }

    /**
     * Gets the value of the acctTitleArray property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTitleAType }
     *     
     */
    public AcctTitleAType getAcctTitleArray() {
        return acctTitleArray;
    }

    /**
     * Sets the value of the acctTitleArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTitleAType }
     *     
     */
    public void setAcctTitleArray(AcctTitleAType value) {
        this.acctTitleArray = value;
    }

    /**
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCodeType }
     *     
     */
    public ProdCodeType getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCodeType }
     *     
     */
    public void setProdCode(ProdCodeType value) {
        this.prodCode = value;
    }

    /**
     * Gets the value of the availCr property.
     * 
     * @return
     *     possible object is
     *     {@link AvailCrType }
     *     
     */
    public AvailCrType getAvailCr() {
        return availCr;
    }

    /**
     * Sets the value of the availCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailCrType }
     *     
     */
    public void setAvailCr(AvailCrType value) {
        this.availCr = value;
    }

    /**
     * Gets the value of the offInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link OffInfoArrayAType }
     *     
     */
    public OffInfoArrayAType getOffInfoArray() {
        return offInfoArray;
    }

    /**
     * Sets the value of the offInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffInfoArrayAType }
     *     
     */
    public void setOffInfoArray(OffInfoArrayAType value) {
        this.offInfoArray = value;
    }

    /**
     * Gets the value of the origBal property.
     * 
     * @return
     *     possible object is
     *     {@link OrigBalType }
     *     
     */
    public OrigBalType getOrigBal() {
        return origBal;
    }

    /**
     * Sets the value of the origBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigBalType }
     *     
     */
    public void setOrigBal(OrigBalType value) {
        this.origBal = value;
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
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link TermCType }
     *     
     */
    public TermCType getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCType }
     *     
     */
    public void setTerm(TermCType value) {
        this.term = value;
    }

    /**
     * Gets the value of the lateChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LateChgAmtType }
     *     
     */
    public LateChgAmtType getLateChgAmt() {
        return lateChgAmt;
    }

    /**
     * Sets the value of the lateChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LateChgAmtType }
     *     
     */
    public void setLateChgAmt(LateChgAmtType value) {
        this.lateChgAmt = value;
    }

    /**
     * Gets the value of the matDt property.
     * 
     * @return
     *     possible object is
     *     {@link MatDtType }
     *     
     */
    public MatDtType getMatDt() {
        return matDt;
    }

    /**
     * Sets the value of the matDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatDtType }
     *     
     */
    public void setMatDt(MatDtType value) {
        this.matDt = value;
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
     * Gets the value of the payoffGoodThruDt property.
     * 
     * @return
     *     possible object is
     *     {@link PayoffGoodThruDtType }
     *     
     */
    public PayoffGoodThruDtType getPayoffGoodThruDt() {
        return payoffGoodThruDt;
    }

    /**
     * Sets the value of the payoffGoodThruDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoffGoodThruDtType }
     *     
     */
    public void setPayoffGoodThruDt(PayoffGoodThruDtType value) {
        this.payoffGoodThruDt = value;
    }

    /**
     * Gets the value of the nxtSchedPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link NxtSchedPmtDtType }
     *     
     */
    public NxtSchedPmtDtType getNxtSchedPmtDt() {
        return nxtSchedPmtDt;
    }

    /**
     * Sets the value of the nxtSchedPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NxtSchedPmtDtType }
     *     
     */
    public void setNxtSchedPmtDt(NxtSchedPmtDtType value) {
        this.nxtSchedPmtDt = value;
    }

    /**
     * Gets the value of the partPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartPmtAmtType }
     *     
     */
    public PartPmtAmtType getPartPmtAmt() {
        return partPmtAmt;
    }

    /**
     * Sets the value of the partPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartPmtAmtType }
     *     
     */
    public void setPartPmtAmt(PartPmtAmtType value) {
        this.partPmtAmt = value;
    }

    /**
     * Gets the value of the pmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAmtType }
     *     
     */
    public PmtAmtType getPmtAmt() {
        return pmtAmt;
    }

    /**
     * Sets the value of the pmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAmtType }
     *     
     */
    public void setPmtAmt(PmtAmtType value) {
        this.pmtAmt = value;
    }

    /**
     * Gets the value of the intBasis property.
     * 
     * @return
     *     possible object is
     *     {@link IntBasisType }
     *     
     */
    public IntBasisType getIntBasis() {
        return intBasis;
    }

    /**
     * Sets the value of the intBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntBasisType }
     *     
     */
    public void setIntBasis(IntBasisType value) {
        this.intBasis = value;
    }

    /**
     * Gets the value of the pmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link PmtCodeType }
     *     
     */
    public PmtCodeType getPmtCode() {
        return pmtCode;
    }

    /**
     * Sets the value of the pmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtCodeType }
     *     
     */
    public void setPmtCode(PmtCodeType value) {
        this.pmtCode = value;
    }

    /**
     * Gets the value of the pmtTerm property.
     * 
     * @return
     *     possible object is
     *     {@link PmtTermType }
     *     
     */
    public PmtTermType getPmtTerm() {
        return pmtTerm;
    }

    /**
     * Sets the value of the pmtTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtTermType }
     *     
     */
    public void setPmtTerm(PmtTermType value) {
        this.pmtTerm = value;
    }

    /**
     * Gets the value of the pmtTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link PmtTermUnitsType }
     *     
     */
    public PmtTermUnitsType getPmtTermUnits() {
        return pmtTermUnits;
    }

    /**
     * Sets the value of the pmtTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtTermUnitsType }
     *     
     */
    public void setPmtTermUnits(PmtTermUnitsType value) {
        this.pmtTermUnits = value;
    }

    /**
     * Gets the value of the intRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getIntRate() {
        return intRate;
    }

    /**
     * Sets the value of the intRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setIntRate(IntRateType value) {
        this.intRate = value;
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
     * Gets the value of the accrBal property.
     * 
     * @return
     *     possible object is
     *     {@link AccrBalType }
     *     
     */
    public AccrBalType getAccrBal() {
        return accrBal;
    }

    /**
     * Sets the value of the accrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrBalType }
     *     
     */
    public void setAccrBal(AccrBalType value) {
        this.accrBal = value;
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
     * Gets the value of the lnUnitRptMthd property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitRptMthdType }
     *     
     */
    public LnUnitRptMthdType getLnUnitRptMthd() {
        return lnUnitRptMthd;
    }

    /**
     * Sets the value of the lnUnitRptMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitRptMthdType }
     *     
     */
    public void setLnUnitRptMthd(LnUnitRptMthdType value) {
        this.lnUnitRptMthd = value;
    }

    /**
     * Gets the value of the lnUnitMaster property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitMasterType }
     *     
     */
    public LnUnitMasterType getLnUnitMaster() {
        return lnUnitMaster;
    }

    /**
     * Sets the value of the lnUnitMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitMasterType }
     *     
     */
    public void setLnUnitMaster(LnUnitMasterType value) {
        this.lnUnitMaster = value;
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
     * Gets the value of the piAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PIAmtType }
     *     
     */
    public PIAmtType getPIAmt() {
        return piAmt;
    }

    /**
     * Sets the value of the piAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIAmtType }
     *     
     */
    public void setPIAmt(PIAmtType value) {
        this.piAmt = value;
    }

    /**
     * Gets the value of the pmtDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link PmtDayOfMonthType }
     *     
     */
    public PmtDayOfMonthType getPmtDayOfMonth() {
        return pmtDayOfMonth;
    }

    /**
     * Sets the value of the pmtDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtDayOfMonthType }
     *     
     */
    public void setPmtDayOfMonth(PmtDayOfMonthType value) {
        this.pmtDayOfMonth = value;
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
