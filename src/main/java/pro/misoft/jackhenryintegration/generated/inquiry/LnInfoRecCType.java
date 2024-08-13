
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
 * <p>Java class for LnInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnusedCrAccr" type="{http://jackhenry.com/jxchange/TPG/2008}UnusedCrAccr_Type" minOccurs="0"/&gt;
 *         &lt;element name="UEInsurAccr" type="{http://jackhenry.com/jxchange/TPG/2008}UEInsurAccr_Type" minOccurs="0"/&gt;
 *         &lt;element name="Term" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay2" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay2_Type" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay1" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay1_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemPmtCnt" type="{http://jackhenry.com/jxchange/TPG/2008}RemPmtCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}PmtTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtTerm" type="{http://jackhenry.com/jxchange/TPG/2008}PmtTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDayOfMonth_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtAmtDue" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmtDue_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PIAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PIAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayoffGoodThruDt" type="{http://jackhenry.com/jxchange/TPG/2008}PayoffGoodThruDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDueAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PastDueAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PartPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PartPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigBal" type="{http://jackhenry.com/jxchange/TPG/2008}OrigBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtSchedPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtSchedPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MatDt" type="{http://jackhenry.com/jxchange/TPG/2008}MatDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LateChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntBasis" type="{http://jackhenry.com/jxchange/TPG/2008}IntBasis_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrLifeInsurAccr" type="{http://jackhenry.com/jxchange/TPG/2008}CrLifeInsurAccr_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvailCr" type="{http://jackhenry.com/jxchange/TPG/2008}AvailCr_Type" minOccurs="0"/&gt;
 *         &lt;element name="AHInsurAccr" type="{http://jackhenry.com/jxchange/TPG/2008}AHInsurAccr_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctTitleArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_AType" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccrBal" type="{http://jackhenry.com/jxchange/TPG/2008}AccrBal_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *           &lt;element name="SalesPerson" type="{http://jackhenry.com/jxchange/TPG/2008}SalesPerson_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctLvlSecCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctLvlSecCode_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="OddDaysIntBasis" type="{http://jackhenry.com/jxchange/TPG/2008}OddDaysIntBasis_Type" minOccurs="0"/&gt;
 *             &lt;element name="ShortPmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}ShortPmtCode_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="BatchNum" type="{http://jackhenry.com/jxchange/TPG/2008}BatchNum_Type" minOccurs="0"/&gt;
 *               &lt;element name="OffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}OffInfoArray_AType" minOccurs="0"/&gt;
 *               &lt;element name="TINInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TINInfo_CType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="MICRAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}MICRAcctId_Type" minOccurs="0"/&gt;
 *                 &lt;element name="AliasAcctName" type="{http://jackhenry.com/jxchange/TPG/2008}AliasAcctName_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="AliasCustName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="BrandCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrandCode_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="LnUnitDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitDesc_Type" minOccurs="0"/&gt;
 *                       &lt;element name="LnUnitRptMthd" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitRptMthd_Type" minOccurs="0"/&gt;
 *                       &lt;element name="SpecLndType" type="{http://jackhenry.com/jxchange/TPG/2008}SpecLndType_Type" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;element name="AccrBilMthd" type="{http://jackhenry.com/jxchange/TPG/2008}AccrBilMthd_Type" minOccurs="0"/&gt;
 *                         &lt;sequence minOccurs="0"&gt;
 *                           &lt;element name="Ver_9" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_9_CType"/&gt;
 *                           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                         &lt;/sequence&gt;
 *                       &lt;/sequence&gt;
 *                     &lt;/sequence&gt;
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
@XmlType(name = "LnInfoRec_CType", propOrder = {
    "unusedCrAccr",
    "ueInsurAccr",
    "term",
    "semiDay2",
    "semiDay1",
    "remPmtCnt",
    "pmtTermUnits",
    "pmtTerm",
    "pmtDayOfMonth",
    "pmtCode",
    "pmtAmtDue",
    "pmtAmt",
    "piAmt",
    "payoffGoodThruDt",
    "pastDueAmt",
    "partPmtAmt",
    "origBal",
    "openDt",
    "offCode",
    "nxtSchedPmtDt",
    "nxtPayDt",
    "matDt",
    "lateChgAmt",
    "lastPmtDt",
    "intRate",
    "intBasis",
    "crLifeInsurAccr",
    "brCode",
    "prodCode",
    "availCr",
    "ahInsurAccr",
    "acctTitleArray",
    "acctStat",
    "accrBal",
    "ver1",
    "custId",
    "salesPerson",
    "acctLvlSecCode",
    "ver2",
    "oddDaysIntBasis",
    "shortPmtCode",
    "ver3",
    "batchNum",
    "offInfoArray",
    "tinInfo",
    "ver4",
    "micrAcctId",
    "aliasAcctName",
    "ver5",
    "aliasCustName",
    "ver6",
    "brandCode",
    "ver7",
    "lnUnitDesc",
    "lnUnitRptMthd",
    "specLndType",
    "ver8",
    "accrBilMthd",
    "ver9",
    "any"
})
public class LnInfoRecCType {

    @XmlElementRef(name = "UnusedCrAccr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UnusedCrAccrType> unusedCrAccr;
    @XmlElementRef(name = "UEInsurAccr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UEInsurAccrType> ueInsurAccr;
    @XmlElement(name = "Term")
    protected TermCType term;
    @XmlElementRef(name = "SemiDay2", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SemiDay2Type> semiDay2;
    @XmlElementRef(name = "SemiDay1", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SemiDay1Type> semiDay1;
    @XmlElementRef(name = "RemPmtCnt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RemPmtCntType> remPmtCnt;
    @XmlElementRef(name = "PmtTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtTermUnitsType> pmtTermUnits;
    @XmlElementRef(name = "PmtTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtTermType> pmtTerm;
    @XmlElementRef(name = "PmtDayOfMonth", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtDayOfMonthType> pmtDayOfMonth;
    @XmlElementRef(name = "PmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtCodeType> pmtCode;
    @XmlElementRef(name = "PmtAmtDue", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtAmtDueType> pmtAmtDue;
    @XmlElementRef(name = "PmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtAmtType> pmtAmt;
    @XmlElementRef(name = "PIAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PIAmtType> piAmt;
    @XmlElementRef(name = "PayoffGoodThruDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PayoffGoodThruDtType> payoffGoodThruDt;
    @XmlElementRef(name = "PastDueAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDueAmtType> pastDueAmt;
    @XmlElementRef(name = "PartPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PartPmtAmtType> partPmtAmt;
    @XmlElementRef(name = "OrigBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigBalType> origBal;
    @XmlElementRef(name = "OpenDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenDtType> openDt;
    @XmlElementRef(name = "OffCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OffCodeType> offCode;
    @XmlElementRef(name = "NxtSchedPmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NxtSchedPmtDtType> nxtSchedPmtDt;
    @XmlElementRef(name = "NxtPayDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NxtPayDtType> nxtPayDt;
    @XmlElementRef(name = "MatDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MatDtType> matDt;
    @XmlElementRef(name = "LateChgAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LateChgAmtType> lateChgAmt;
    @XmlElementRef(name = "LastPmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastPmtDtType> lastPmtDt;
    @XmlElementRef(name = "IntRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntRateType> intRate;
    @XmlElementRef(name = "IntBasis", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntBasisType> intBasis;
    @XmlElementRef(name = "CrLifeInsurAccr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrLifeInsurAccrType> crLifeInsurAccr;
    @XmlElementRef(name = "BrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> brCode;
    @XmlElementRef(name = "ProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProdCodeType> prodCode;
    @XmlElementRef(name = "AvailCr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AvailCrType> availCr;
    @XmlElementRef(name = "AHInsurAccr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AHInsurAccrType> ahInsurAccr;
    @XmlElement(name = "AcctTitleArray")
    protected AcctTitleAType acctTitleArray;
    @XmlElementRef(name = "AcctStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctStatType> acctStat;
    @XmlElementRef(name = "AccrBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccrBalType> accrBal;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "CustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustIdType> custId;
    @XmlElementRef(name = "SalesPerson", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SalesPersonType> salesPerson;
    @XmlElementRef(name = "AcctLvlSecCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctLvlSecCodeType> acctLvlSecCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "OddDaysIntBasis", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OddDaysIntBasisType> oddDaysIntBasis;
    @XmlElementRef(name = "ShortPmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ShortPmtCodeType> shortPmtCode;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElementRef(name = "BatchNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BatchNumType> batchNum;
    @XmlElement(name = "OffInfoArray")
    protected OffInfoArrayAType offInfoArray;
    @XmlElement(name = "TINInfo")
    protected TINInfoCType tinInfo;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElementRef(name = "MICRAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MICRAcctIdType> micrAcctId;
    @XmlElementRef(name = "AliasAcctName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AliasAcctNameType> aliasAcctName;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "AliasCustName")
    protected PersonNameCType aliasCustName;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "BrandCode")
    protected BrandCodeType brandCode;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "LnUnitDesc")
    protected LnUnitDescType lnUnitDesc;
    @XmlElement(name = "LnUnitRptMthd")
    protected LnUnitRptMthdType lnUnitRptMthd;
    @XmlElement(name = "SpecLndType")
    protected SpecLndTypeType specLndType;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlElement(name = "AccrBilMthd")
    protected AccrBilMthdType accrBilMthd;
    @XmlElement(name = "Ver_9")
    protected Ver9CType ver9;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the unusedCrAccr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnusedCrAccrType }{@code >}
     *     
     */
    public JAXBElement<UnusedCrAccrType> getUnusedCrAccr() {
        return unusedCrAccr;
    }

    /**
     * Sets the value of the unusedCrAccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnusedCrAccrType }{@code >}
     *     
     */
    public void setUnusedCrAccr(JAXBElement<UnusedCrAccrType> value) {
        this.unusedCrAccr = value;
    }

    /**
     * Gets the value of the ueInsurAccr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UEInsurAccrType }{@code >}
     *     
     */
    public JAXBElement<UEInsurAccrType> getUEInsurAccr() {
        return ueInsurAccr;
    }

    /**
     * Sets the value of the ueInsurAccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UEInsurAccrType }{@code >}
     *     
     */
    public void setUEInsurAccr(JAXBElement<UEInsurAccrType> value) {
        this.ueInsurAccr = value;
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
     * Gets the value of the semiDay2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}
     *     
     */
    public JAXBElement<SemiDay2Type> getSemiDay2() {
        return semiDay2;
    }

    /**
     * Sets the value of the semiDay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}
     *     
     */
    public void setSemiDay2(JAXBElement<SemiDay2Type> value) {
        this.semiDay2 = value;
    }

    /**
     * Gets the value of the semiDay1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}
     *     
     */
    public JAXBElement<SemiDay1Type> getSemiDay1() {
        return semiDay1;
    }

    /**
     * Sets the value of the semiDay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}
     *     
     */
    public void setSemiDay1(JAXBElement<SemiDay1Type> value) {
        this.semiDay1 = value;
    }

    /**
     * Gets the value of the remPmtCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemPmtCntType }{@code >}
     *     
     */
    public JAXBElement<RemPmtCntType> getRemPmtCnt() {
        return remPmtCnt;
    }

    /**
     * Sets the value of the remPmtCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemPmtCntType }{@code >}
     *     
     */
    public void setRemPmtCnt(JAXBElement<RemPmtCntType> value) {
        this.remPmtCnt = value;
    }

    /**
     * Gets the value of the pmtTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtTermUnitsType }{@code >}
     *     
     */
    public JAXBElement<PmtTermUnitsType> getPmtTermUnits() {
        return pmtTermUnits;
    }

    /**
     * Sets the value of the pmtTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtTermUnitsType }{@code >}
     *     
     */
    public void setPmtTermUnits(JAXBElement<PmtTermUnitsType> value) {
        this.pmtTermUnits = value;
    }

    /**
     * Gets the value of the pmtTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtTermType }{@code >}
     *     
     */
    public JAXBElement<PmtTermType> getPmtTerm() {
        return pmtTerm;
    }

    /**
     * Sets the value of the pmtTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtTermType }{@code >}
     *     
     */
    public void setPmtTerm(JAXBElement<PmtTermType> value) {
        this.pmtTerm = value;
    }

    /**
     * Gets the value of the pmtDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtDayOfMonthType }{@code >}
     *     
     */
    public JAXBElement<PmtDayOfMonthType> getPmtDayOfMonth() {
        return pmtDayOfMonth;
    }

    /**
     * Sets the value of the pmtDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtDayOfMonthType }{@code >}
     *     
     */
    public void setPmtDayOfMonth(JAXBElement<PmtDayOfMonthType> value) {
        this.pmtDayOfMonth = value;
    }

    /**
     * Gets the value of the pmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtCodeType }{@code >}
     *     
     */
    public JAXBElement<PmtCodeType> getPmtCode() {
        return pmtCode;
    }

    /**
     * Sets the value of the pmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtCodeType }{@code >}
     *     
     */
    public void setPmtCode(JAXBElement<PmtCodeType> value) {
        this.pmtCode = value;
    }

    /**
     * Gets the value of the pmtAmtDue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtAmtDueType }{@code >}
     *     
     */
    public JAXBElement<PmtAmtDueType> getPmtAmtDue() {
        return pmtAmtDue;
    }

    /**
     * Sets the value of the pmtAmtDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtAmtDueType }{@code >}
     *     
     */
    public void setPmtAmtDue(JAXBElement<PmtAmtDueType> value) {
        this.pmtAmtDue = value;
    }

    /**
     * Gets the value of the pmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtAmtType }{@code >}
     *     
     */
    public JAXBElement<PmtAmtType> getPmtAmt() {
        return pmtAmt;
    }

    /**
     * Sets the value of the pmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtAmtType }{@code >}
     *     
     */
    public void setPmtAmt(JAXBElement<PmtAmtType> value) {
        this.pmtAmt = value;
    }

    /**
     * Gets the value of the piAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PIAmtType }{@code >}
     *     
     */
    public JAXBElement<PIAmtType> getPIAmt() {
        return piAmt;
    }

    /**
     * Sets the value of the piAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PIAmtType }{@code >}
     *     
     */
    public void setPIAmt(JAXBElement<PIAmtType> value) {
        this.piAmt = value;
    }

    /**
     * Gets the value of the payoffGoodThruDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PayoffGoodThruDtType }{@code >}
     *     
     */
    public JAXBElement<PayoffGoodThruDtType> getPayoffGoodThruDt() {
        return payoffGoodThruDt;
    }

    /**
     * Sets the value of the payoffGoodThruDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PayoffGoodThruDtType }{@code >}
     *     
     */
    public void setPayoffGoodThruDt(JAXBElement<PayoffGoodThruDtType> value) {
        this.payoffGoodThruDt = value;
    }

    /**
     * Gets the value of the pastDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDueAmtType }{@code >}
     *     
     */
    public JAXBElement<PastDueAmtType> getPastDueAmt() {
        return pastDueAmt;
    }

    /**
     * Sets the value of the pastDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDueAmtType }{@code >}
     *     
     */
    public void setPastDueAmt(JAXBElement<PastDueAmtType> value) {
        this.pastDueAmt = value;
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
     * Gets the value of the origBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigBalType }{@code >}
     *     
     */
    public JAXBElement<OrigBalType> getOrigBal() {
        return origBal;
    }

    /**
     * Sets the value of the origBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigBalType }{@code >}
     *     
     */
    public void setOrigBal(JAXBElement<OrigBalType> value) {
        this.origBal = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenDtType }{@code >}
     *     
     */
    public JAXBElement<OpenDtType> getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenDtType }{@code >}
     *     
     */
    public void setOpenDt(JAXBElement<OpenDtType> value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public JAXBElement<OffCodeType> getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public void setOffCode(JAXBElement<OffCodeType> value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the nxtSchedPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NxtSchedPmtDtType }{@code >}
     *     
     */
    public JAXBElement<NxtSchedPmtDtType> getNxtSchedPmtDt() {
        return nxtSchedPmtDt;
    }

    /**
     * Sets the value of the nxtSchedPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NxtSchedPmtDtType }{@code >}
     *     
     */
    public void setNxtSchedPmtDt(JAXBElement<NxtSchedPmtDtType> value) {
        this.nxtSchedPmtDt = value;
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
     * Gets the value of the matDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MatDtType }{@code >}
     *     
     */
    public JAXBElement<MatDtType> getMatDt() {
        return matDt;
    }

    /**
     * Sets the value of the matDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MatDtType }{@code >}
     *     
     */
    public void setMatDt(JAXBElement<MatDtType> value) {
        this.matDt = value;
    }

    /**
     * Gets the value of the lateChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LateChgAmtType }{@code >}
     *     
     */
    public JAXBElement<LateChgAmtType> getLateChgAmt() {
        return lateChgAmt;
    }

    /**
     * Sets the value of the lateChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LateChgAmtType }{@code >}
     *     
     */
    public void setLateChgAmt(JAXBElement<LateChgAmtType> value) {
        this.lateChgAmt = value;
    }

    /**
     * Gets the value of the lastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastPmtDtType }{@code >}
     *     
     */
    public JAXBElement<LastPmtDtType> getLastPmtDt() {
        return lastPmtDt;
    }

    /**
     * Sets the value of the lastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastPmtDtType }{@code >}
     *     
     */
    public void setLastPmtDt(JAXBElement<LastPmtDtType> value) {
        this.lastPmtDt = value;
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
     * Gets the value of the intBasis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntBasisType }{@code >}
     *     
     */
    public JAXBElement<IntBasisType> getIntBasis() {
        return intBasis;
    }

    /**
     * Sets the value of the intBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntBasisType }{@code >}
     *     
     */
    public void setIntBasis(JAXBElement<IntBasisType> value) {
        this.intBasis = value;
    }

    /**
     * Gets the value of the crLifeInsurAccr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrLifeInsurAccrType }{@code >}
     *     
     */
    public JAXBElement<CrLifeInsurAccrType> getCrLifeInsurAccr() {
        return crLifeInsurAccr;
    }

    /**
     * Sets the value of the crLifeInsurAccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrLifeInsurAccrType }{@code >}
     *     
     */
    public void setCrLifeInsurAccr(JAXBElement<CrLifeInsurAccrType> value) {
        this.crLifeInsurAccr = value;
    }

    /**
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public JAXBElement<BrCodeType> getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public void setBrCode(JAXBElement<BrCodeType> value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public JAXBElement<ProdCodeType> getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public void setProdCode(JAXBElement<ProdCodeType> value) {
        this.prodCode = value;
    }

    /**
     * Gets the value of the availCr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AvailCrType }{@code >}
     *     
     */
    public JAXBElement<AvailCrType> getAvailCr() {
        return availCr;
    }

    /**
     * Sets the value of the availCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AvailCrType }{@code >}
     *     
     */
    public void setAvailCr(JAXBElement<AvailCrType> value) {
        this.availCr = value;
    }

    /**
     * Gets the value of the ahInsurAccr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AHInsurAccrType }{@code >}
     *     
     */
    public JAXBElement<AHInsurAccrType> getAHInsurAccr() {
        return ahInsurAccr;
    }

    /**
     * Sets the value of the ahInsurAccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AHInsurAccrType }{@code >}
     *     
     */
    public void setAHInsurAccr(JAXBElement<AHInsurAccrType> value) {
        this.ahInsurAccr = value;
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
     * Gets the value of the acctStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctStatType }{@code >}
     *     
     */
    public JAXBElement<AcctStatType> getAcctStat() {
        return acctStat;
    }

    /**
     * Sets the value of the acctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctStatType }{@code >}
     *     
     */
    public void setAcctStat(JAXBElement<AcctStatType> value) {
        this.acctStat = value;
    }

    /**
     * Gets the value of the accrBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccrBalType }{@code >}
     *     
     */
    public JAXBElement<AccrBalType> getAccrBal() {
        return accrBal;
    }

    /**
     * Sets the value of the accrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccrBalType }{@code >}
     *     
     */
    public void setAccrBal(JAXBElement<AccrBalType> value) {
        this.accrBal = value;
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
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustIdType }{@code >}
     *     
     */
    public JAXBElement<CustIdType> getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustIdType }{@code >}
     *     
     */
    public void setCustId(JAXBElement<CustIdType> value) {
        this.custId = value;
    }

    /**
     * Gets the value of the salesPerson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SalesPersonType }{@code >}
     *     
     */
    public JAXBElement<SalesPersonType> getSalesPerson() {
        return salesPerson;
    }

    /**
     * Sets the value of the salesPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SalesPersonType }{@code >}
     *     
     */
    public void setSalesPerson(JAXBElement<SalesPersonType> value) {
        this.salesPerson = value;
    }

    /**
     * Gets the value of the acctLvlSecCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctLvlSecCodeType }{@code >}
     *     
     */
    public JAXBElement<AcctLvlSecCodeType> getAcctLvlSecCode() {
        return acctLvlSecCode;
    }

    /**
     * Sets the value of the acctLvlSecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctLvlSecCodeType }{@code >}
     *     
     */
    public void setAcctLvlSecCode(JAXBElement<AcctLvlSecCodeType> value) {
        this.acctLvlSecCode = value;
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
     * Gets the value of the oddDaysIntBasis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OddDaysIntBasisType }{@code >}
     *     
     */
    public JAXBElement<OddDaysIntBasisType> getOddDaysIntBasis() {
        return oddDaysIntBasis;
    }

    /**
     * Sets the value of the oddDaysIntBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OddDaysIntBasisType }{@code >}
     *     
     */
    public void setOddDaysIntBasis(JAXBElement<OddDaysIntBasisType> value) {
        this.oddDaysIntBasis = value;
    }

    /**
     * Gets the value of the shortPmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShortPmtCodeType }{@code >}
     *     
     */
    public JAXBElement<ShortPmtCodeType> getShortPmtCode() {
        return shortPmtCode;
    }

    /**
     * Sets the value of the shortPmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShortPmtCodeType }{@code >}
     *     
     */
    public void setShortPmtCode(JAXBElement<ShortPmtCodeType> value) {
        this.shortPmtCode = value;
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
     * Gets the value of the batchNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}
     *     
     */
    public JAXBElement<BatchNumType> getBatchNum() {
        return batchNum;
    }

    /**
     * Sets the value of the batchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}
     *     
     */
    public void setBatchNum(JAXBElement<BatchNumType> value) {
        this.batchNum = value;
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
     * Gets the value of the tinInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TINInfoCType }
     *     
     */
    public TINInfoCType getTINInfo() {
        return tinInfo;
    }

    /**
     * Sets the value of the tinInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINInfoCType }
     *     
     */
    public void setTINInfo(TINInfoCType value) {
        this.tinInfo = value;
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
     * Gets the value of the micrAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MICRAcctIdType }{@code >}
     *     
     */
    public JAXBElement<MICRAcctIdType> getMICRAcctId() {
        return micrAcctId;
    }

    /**
     * Sets the value of the micrAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MICRAcctIdType }{@code >}
     *     
     */
    public void setMICRAcctId(JAXBElement<MICRAcctIdType> value) {
        this.micrAcctId = value;
    }

    /**
     * Gets the value of the aliasAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AliasAcctNameType }{@code >}
     *     
     */
    public JAXBElement<AliasAcctNameType> getAliasAcctName() {
        return aliasAcctName;
    }

    /**
     * Sets the value of the aliasAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AliasAcctNameType }{@code >}
     *     
     */
    public void setAliasAcctName(JAXBElement<AliasAcctNameType> value) {
        this.aliasAcctName = value;
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
     * Gets the value of the aliasCustName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getAliasCustName() {
        return aliasCustName;
    }

    /**
     * Sets the value of the aliasCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setAliasCustName(PersonNameCType value) {
        this.aliasCustName = value;
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
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrandCodeType }
     *     
     */
    public BrandCodeType getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandCodeType }
     *     
     */
    public void setBrandCode(BrandCodeType value) {
        this.brandCode = value;
    }

    /**
     * Gets the value of the ver7 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver7CType }
     *     
     */
    public Ver7CType getVer7() {
        return ver7;
    }

    /**
     * Sets the value of the ver7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver7CType }
     *     
     */
    public void setVer7(Ver7CType value) {
        this.ver7 = value;
    }

    /**
     * Gets the value of the lnUnitDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitDescType }
     *     
     */
    public LnUnitDescType getLnUnitDesc() {
        return lnUnitDesc;
    }

    /**
     * Sets the value of the lnUnitDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitDescType }
     *     
     */
    public void setLnUnitDesc(LnUnitDescType value) {
        this.lnUnitDesc = value;
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
     * Gets the value of the specLndType property.
     * 
     * @return
     *     possible object is
     *     {@link SpecLndTypeType }
     *     
     */
    public SpecLndTypeType getSpecLndType() {
        return specLndType;
    }

    /**
     * Sets the value of the specLndType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecLndTypeType }
     *     
     */
    public void setSpecLndType(SpecLndTypeType value) {
        this.specLndType = value;
    }

    /**
     * Gets the value of the ver8 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver8CType }
     *     
     */
    public Ver8CType getVer8() {
        return ver8;
    }

    /**
     * Sets the value of the ver8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver8CType }
     *     
     */
    public void setVer8(Ver8CType value) {
        this.ver8 = value;
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
     * Gets the value of the ver9 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver9CType }
     *     
     */
    public Ver9CType getVer9() {
        return ver9;
    }

    /**
     * Sets the value of the ver9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver9CType }
     *     
     */
    public void setVer9(Ver9CType value) {
        this.ver9 = value;
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
