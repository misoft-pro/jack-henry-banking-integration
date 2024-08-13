
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
 * <p>Java class for x_LnAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_LnAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="WatchListDesc" type="{http://jackhenry.com/jxchange/TPG/2008}WatchListDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubPrimeLnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SubPrimeLnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="StudentLnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StudentLnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PurpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PurpDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtPastDueNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtPastDueNotDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtBilNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtBilNotDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrevStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="HldMailDesc" type="{http://jackhenry.com/jxchange/TPG/2008}HldMailDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExmnrClsfDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExmnrClsfDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DeptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrRatingDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrRatingDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctClsfDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctClsfDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CurrencyDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CurrencyDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="CrScoreDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExcLndPlcyDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcLndPlcyDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="InvrInsurDesc" type="{http://jackhenry.com/jxchange/TPG/2008}InvrInsurDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="InvrPurpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}InvrPurpDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrtcpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="CrBureauRptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrBureauRptDesc_Type" minOccurs="0"/&gt;
 *             &lt;element name="FirstStmtFeeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FirstStmtFeeDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="StressRateDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StressRateDesc_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="InvrPropDesc" type="{http://jackhenry.com/jxchange/TPG/2008}InvrPropDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_LnAcctInfo_CType", propOrder = {
    "lnAcctInfo",
    "watchListDesc",
    "subPrimeLnDesc",
    "studentLnDesc",
    "purpDesc",
    "prtPastDueNotDesc",
    "prtBilNotDesc",
    "prevStatDesc",
    "prePmtPenDesc",
    "hldMailDesc",
    "exmnrClsfDesc",
    "deptDesc",
    "crRatingDesc",
    "collatDesc",
    "acctClsfDesc",
    "custom",
    "ver1",
    "currencyDesc",
    "crScoreDesc",
    "excLndPlcyDesc",
    "invrInsurDesc",
    "invrPurpDesc",
    "prtcpDesc",
    "ver2",
    "crBureauRptDesc",
    "firstStmtFeeDesc",
    "ver3",
    "stressRateDesc",
    "ver4",
    "invrPropDesc",
    "ver5",
    "any"
})
public class XLnAcctInfoCType {

    @XmlElement(name = "LnAcctInfo")
    protected LnAcctInfoCType lnAcctInfo;
    @XmlElement(name = "WatchListDesc")
    protected WatchListDescType watchListDesc;
    @XmlElement(name = "SubPrimeLnDesc")
    protected SubPrimeLnDescType subPrimeLnDesc;
    @XmlElement(name = "StudentLnDesc")
    protected StudentLnDescType studentLnDesc;
    @XmlElement(name = "PurpDesc")
    protected PurpDescType purpDesc;
    @XmlElement(name = "PrtPastDueNotDesc")
    protected PrtPastDueNotDescType prtPastDueNotDesc;
    @XmlElement(name = "PrtBilNotDesc")
    protected PrtBilNotDescType prtBilNotDesc;
    @XmlElement(name = "PrevStatDesc")
    protected PrevStatDescType prevStatDesc;
    @XmlElement(name = "PrePmtPenDesc")
    protected PrePmtPenDescType prePmtPenDesc;
    @XmlElement(name = "HldMailDesc")
    protected HldMailDescType hldMailDesc;
    @XmlElement(name = "ExmnrClsfDesc")
    protected ExmnrClsfDescType exmnrClsfDesc;
    @XmlElement(name = "DeptDesc")
    protected DeptDescType deptDesc;
    @XmlElement(name = "CrRatingDesc")
    protected CrRatingDescType crRatingDesc;
    @XmlElement(name = "CollatDesc")
    protected CollatDescType collatDesc;
    @XmlElement(name = "AcctClsfDesc")
    protected AcctClsfDescType acctClsfDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CurrencyDesc")
    protected CurrencyDescType currencyDesc;
    @XmlElement(name = "CrScoreDesc")
    protected CrScoreDescType crScoreDesc;
    @XmlElement(name = "ExcLndPlcyDesc")
    protected ExcLndPlcyDescType excLndPlcyDesc;
    @XmlElement(name = "InvrInsurDesc")
    protected InvrInsurDescType invrInsurDesc;
    @XmlElement(name = "InvrPurpDesc")
    protected InvrPurpDescType invrPurpDesc;
    @XmlElement(name = "PrtcpDesc")
    protected PrtcpDescType prtcpDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "CrBureauRptDesc")
    protected CrBureauRptDescType crBureauRptDesc;
    @XmlElement(name = "FirstStmtFeeDesc")
    protected FirstStmtFeeDescType firstStmtFeeDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "StressRateDesc")
    protected StressRateDescType stressRateDesc;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "InvrPropDesc")
    protected InvrPropDescType invrPropDesc;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnAcctInfoCType }
     *     
     */
    public LnAcctInfoCType getLnAcctInfo() {
        return lnAcctInfo;
    }

    /**
     * Sets the value of the lnAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnAcctInfoCType }
     *     
     */
    public void setLnAcctInfo(LnAcctInfoCType value) {
        this.lnAcctInfo = value;
    }

    /**
     * Gets the value of the watchListDesc property.
     * 
     * @return
     *     possible object is
     *     {@link WatchListDescType }
     *     
     */
    public WatchListDescType getWatchListDesc() {
        return watchListDesc;
    }

    /**
     * Sets the value of the watchListDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WatchListDescType }
     *     
     */
    public void setWatchListDesc(WatchListDescType value) {
        this.watchListDesc = value;
    }

    /**
     * Gets the value of the subPrimeLnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SubPrimeLnDescType }
     *     
     */
    public SubPrimeLnDescType getSubPrimeLnDesc() {
        return subPrimeLnDesc;
    }

    /**
     * Sets the value of the subPrimeLnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubPrimeLnDescType }
     *     
     */
    public void setSubPrimeLnDesc(SubPrimeLnDescType value) {
        this.subPrimeLnDesc = value;
    }

    /**
     * Gets the value of the studentLnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link StudentLnDescType }
     *     
     */
    public StudentLnDescType getStudentLnDesc() {
        return studentLnDesc;
    }

    /**
     * Sets the value of the studentLnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentLnDescType }
     *     
     */
    public void setStudentLnDesc(StudentLnDescType value) {
        this.studentLnDesc = value;
    }

    /**
     * Gets the value of the purpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PurpDescType }
     *     
     */
    public PurpDescType getPurpDesc() {
        return purpDesc;
    }

    /**
     * Sets the value of the purpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurpDescType }
     *     
     */
    public void setPurpDesc(PurpDescType value) {
        this.purpDesc = value;
    }

    /**
     * Gets the value of the prtPastDueNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtPastDueNotDescType }
     *     
     */
    public PrtPastDueNotDescType getPrtPastDueNotDesc() {
        return prtPastDueNotDesc;
    }

    /**
     * Sets the value of the prtPastDueNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtPastDueNotDescType }
     *     
     */
    public void setPrtPastDueNotDesc(PrtPastDueNotDescType value) {
        this.prtPastDueNotDesc = value;
    }

    /**
     * Gets the value of the prtBilNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtBilNotDescType }
     *     
     */
    public PrtBilNotDescType getPrtBilNotDesc() {
        return prtBilNotDesc;
    }

    /**
     * Sets the value of the prtBilNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtBilNotDescType }
     *     
     */
    public void setPrtBilNotDesc(PrtBilNotDescType value) {
        this.prtBilNotDesc = value;
    }

    /**
     * Gets the value of the prevStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrevStatDescType }
     *     
     */
    public PrevStatDescType getPrevStatDesc() {
        return prevStatDesc;
    }

    /**
     * Sets the value of the prevStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevStatDescType }
     *     
     */
    public void setPrevStatDesc(PrevStatDescType value) {
        this.prevStatDesc = value;
    }

    /**
     * Gets the value of the prePmtPenDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrePmtPenDescType }
     *     
     */
    public PrePmtPenDescType getPrePmtPenDesc() {
        return prePmtPenDesc;
    }

    /**
     * Sets the value of the prePmtPenDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePmtPenDescType }
     *     
     */
    public void setPrePmtPenDesc(PrePmtPenDescType value) {
        this.prePmtPenDesc = value;
    }

    /**
     * Gets the value of the hldMailDesc property.
     * 
     * @return
     *     possible object is
     *     {@link HldMailDescType }
     *     
     */
    public HldMailDescType getHldMailDesc() {
        return hldMailDesc;
    }

    /**
     * Sets the value of the hldMailDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link HldMailDescType }
     *     
     */
    public void setHldMailDesc(HldMailDescType value) {
        this.hldMailDesc = value;
    }

    /**
     * Gets the value of the exmnrClsfDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ExmnrClsfDescType }
     *     
     */
    public ExmnrClsfDescType getExmnrClsfDesc() {
        return exmnrClsfDesc;
    }

    /**
     * Sets the value of the exmnrClsfDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExmnrClsfDescType }
     *     
     */
    public void setExmnrClsfDesc(ExmnrClsfDescType value) {
        this.exmnrClsfDesc = value;
    }

    /**
     * Gets the value of the deptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DeptDescType }
     *     
     */
    public DeptDescType getDeptDesc() {
        return deptDesc;
    }

    /**
     * Sets the value of the deptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeptDescType }
     *     
     */
    public void setDeptDesc(DeptDescType value) {
        this.deptDesc = value;
    }

    /**
     * Gets the value of the crRatingDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrRatingDescType }
     *     
     */
    public CrRatingDescType getCrRatingDesc() {
        return crRatingDesc;
    }

    /**
     * Sets the value of the crRatingDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrRatingDescType }
     *     
     */
    public void setCrRatingDesc(CrRatingDescType value) {
        this.crRatingDesc = value;
    }

    /**
     * Gets the value of the collatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDescType }
     *     
     */
    public CollatDescType getCollatDesc() {
        return collatDesc;
    }

    /**
     * Sets the value of the collatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDescType }
     *     
     */
    public void setCollatDesc(CollatDescType value) {
        this.collatDesc = value;
    }

    /**
     * Gets the value of the acctClsfDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctClsfDescType }
     *     
     */
    public AcctClsfDescType getAcctClsfDesc() {
        return acctClsfDesc;
    }

    /**
     * Sets the value of the acctClsfDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctClsfDescType }
     *     
     */
    public void setAcctClsfDesc(AcctClsfDescType value) {
        this.acctClsfDesc = value;
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
     * Gets the value of the currencyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDescType }
     *     
     */
    public CurrencyDescType getCurrencyDesc() {
        return currencyDesc;
    }

    /**
     * Sets the value of the currencyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDescType }
     *     
     */
    public void setCurrencyDesc(CurrencyDescType value) {
        this.currencyDesc = value;
    }

    /**
     * Gets the value of the crScoreDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrScoreDescType }
     *     
     */
    public CrScoreDescType getCrScoreDesc() {
        return crScoreDesc;
    }

    /**
     * Sets the value of the crScoreDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrScoreDescType }
     *     
     */
    public void setCrScoreDesc(CrScoreDescType value) {
        this.crScoreDesc = value;
    }

    /**
     * Gets the value of the excLndPlcyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ExcLndPlcyDescType }
     *     
     */
    public ExcLndPlcyDescType getExcLndPlcyDesc() {
        return excLndPlcyDesc;
    }

    /**
     * Sets the value of the excLndPlcyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcLndPlcyDescType }
     *     
     */
    public void setExcLndPlcyDesc(ExcLndPlcyDescType value) {
        this.excLndPlcyDesc = value;
    }

    /**
     * Gets the value of the invrInsurDesc property.
     * 
     * @return
     *     possible object is
     *     {@link InvrInsurDescType }
     *     
     */
    public InvrInsurDescType getInvrInsurDesc() {
        return invrInsurDesc;
    }

    /**
     * Sets the value of the invrInsurDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvrInsurDescType }
     *     
     */
    public void setInvrInsurDesc(InvrInsurDescType value) {
        this.invrInsurDesc = value;
    }

    /**
     * Gets the value of the invrPurpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link InvrPurpDescType }
     *     
     */
    public InvrPurpDescType getInvrPurpDesc() {
        return invrPurpDesc;
    }

    /**
     * Sets the value of the invrPurpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvrPurpDescType }
     *     
     */
    public void setInvrPurpDesc(InvrPurpDescType value) {
        this.invrPurpDesc = value;
    }

    /**
     * Gets the value of the prtcpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpDescType }
     *     
     */
    public PrtcpDescType getPrtcpDesc() {
        return prtcpDesc;
    }

    /**
     * Sets the value of the prtcpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpDescType }
     *     
     */
    public void setPrtcpDesc(PrtcpDescType value) {
        this.prtcpDesc = value;
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
     * Gets the value of the crBureauRptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrBureauRptDescType }
     *     
     */
    public CrBureauRptDescType getCrBureauRptDesc() {
        return crBureauRptDesc;
    }

    /**
     * Sets the value of the crBureauRptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBureauRptDescType }
     *     
     */
    public void setCrBureauRptDesc(CrBureauRptDescType value) {
        this.crBureauRptDesc = value;
    }

    /**
     * Gets the value of the firstStmtFeeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FirstStmtFeeDescType }
     *     
     */
    public FirstStmtFeeDescType getFirstStmtFeeDesc() {
        return firstStmtFeeDesc;
    }

    /**
     * Sets the value of the firstStmtFeeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstStmtFeeDescType }
     *     
     */
    public void setFirstStmtFeeDesc(FirstStmtFeeDescType value) {
        this.firstStmtFeeDesc = value;
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
     * Gets the value of the stressRateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link StressRateDescType }
     *     
     */
    public StressRateDescType getStressRateDesc() {
        return stressRateDesc;
    }

    /**
     * Sets the value of the stressRateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressRateDescType }
     *     
     */
    public void setStressRateDesc(StressRateDescType value) {
        this.stressRateDesc = value;
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
     * Gets the value of the invrPropDesc property.
     * 
     * @return
     *     possible object is
     *     {@link InvrPropDescType }
     *     
     */
    public InvrPropDescType getInvrPropDesc() {
        return invrPropDesc;
    }

    /**
     * Sets the value of the invrPropDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvrPropDescType }
     *     
     */
    public void setInvrPropDesc(InvrPropDescType value) {
        this.invrPropDesc = value;
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
