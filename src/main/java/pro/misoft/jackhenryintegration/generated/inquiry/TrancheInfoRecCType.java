
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
 * <p>Java class for TrancheInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrancheInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Term" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="MatDt" type="{http://jackhenry.com/jxchange/TPG/2008}MatDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigBal" type="{http://jackhenry.com/jxchange/TPG/2008}OrigBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntBasis" type="{http://jackhenry.com/jxchange/TPG/2008}IntBasis_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PIAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PIAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtTerm" type="{http://jackhenry.com/jxchange/TPG/2008}PmtTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}PmtTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDayOfMonth_Type" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay1" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay1_Type" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay2" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay2_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemPmtCnt" type="{http://jackhenry.com/jxchange/TPG/2008}RemPmtCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OddDaysIntBasis" type="{http://jackhenry.com/jxchange/TPG/2008}OddDaysIntBasis_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AccrBilMthd" type="{http://jackhenry.com/jxchange/TPG/2008}AccrBilMthd_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TrancheInfoRec_CType", propOrder = {
    "custId",
    "openDt",
    "term",
    "matDt",
    "origBal",
    "intRate",
    "intBasis",
    "pmtCode",
    "pmtAmt",
    "piAmt",
    "pmtTerm",
    "pmtTermUnits",
    "pmtDayOfMonth",
    "semiDay1",
    "semiDay2",
    "acctStat",
    "remPmtCnt",
    "oddDaysIntBasis",
    "custom",
    "ver1",
    "accrBilMthd",
    "ver2",
    "any"
})
public class TrancheInfoRecCType {

    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "OpenDt")
    protected OpenDtType openDt;
    @XmlElement(name = "Term")
    protected TermCType term;
    @XmlElement(name = "MatDt")
    protected MatDtType matDt;
    @XmlElement(name = "OrigBal")
    protected OrigBalType origBal;
    @XmlElement(name = "IntRate")
    protected IntRateType intRate;
    @XmlElement(name = "IntBasis")
    protected IntBasisType intBasis;
    @XmlElement(name = "PmtCode")
    protected PmtCodeType pmtCode;
    @XmlElement(name = "PmtAmt")
    protected PmtAmtType pmtAmt;
    @XmlElement(name = "PIAmt")
    protected PIAmtType piAmt;
    @XmlElement(name = "PmtTerm")
    protected PmtTermType pmtTerm;
    @XmlElement(name = "PmtTermUnits")
    protected PmtTermUnitsType pmtTermUnits;
    @XmlElement(name = "PmtDayOfMonth")
    protected PmtDayOfMonthType pmtDayOfMonth;
    @XmlElement(name = "SemiDay1")
    protected SemiDay1Type semiDay1;
    @XmlElement(name = "SemiDay2")
    protected SemiDay2Type semiDay2;
    @XmlElement(name = "AcctStat")
    protected AcctStatType acctStat;
    @XmlElement(name = "RemPmtCnt")
    protected RemPmtCntType remPmtCnt;
    @XmlElement(name = "OddDaysIntBasis")
    protected OddDaysIntBasisType oddDaysIntBasis;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AccrBilMthd")
    protected AccrBilMthdType accrBilMthd;
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
     * Gets the value of the remPmtCnt property.
     * 
     * @return
     *     possible object is
     *     {@link RemPmtCntType }
     *     
     */
    public RemPmtCntType getRemPmtCnt() {
        return remPmtCnt;
    }

    /**
     * Sets the value of the remPmtCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemPmtCntType }
     *     
     */
    public void setRemPmtCnt(RemPmtCntType value) {
        this.remPmtCnt = value;
    }

    /**
     * Gets the value of the oddDaysIntBasis property.
     * 
     * @return
     *     possible object is
     *     {@link OddDaysIntBasisType }
     *     
     */
    public OddDaysIntBasisType getOddDaysIntBasis() {
        return oddDaysIntBasis;
    }

    /**
     * Sets the value of the oddDaysIntBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link OddDaysIntBasisType }
     *     
     */
    public void setOddDaysIntBasis(OddDaysIntBasisType value) {
        this.oddDaysIntBasis = value;
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
     * Gets the value of the accrBilMthd property.
     * 
     * @return
     *     possible object is
     *     {@link AccrBilMthdType }
     *     
     */
    public AccrBilMthdType getAccrBilMthd() {
        return accrBilMthd;
    }

    /**
     * Sets the value of the accrBilMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrBilMthdType }
     *     
     */
    public void setAccrBilMthd(AccrBilMthdType value) {
        this.accrBilMthd = value;
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
