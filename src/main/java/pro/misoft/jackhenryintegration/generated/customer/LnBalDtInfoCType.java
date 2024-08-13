
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for LnBalDtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnBalDtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SoldBal" type="{http://jackhenry.com/jxchange/TPG/2008}SoldBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PtPaidByOwner" type="{http://jackhenry.com/jxchange/TPG/2008}PtPaidByOwner_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigFeesYTD" type="{http://jackhenry.com/jxchange/TPG/2008}OrigFeesYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigFeesPYTD" type="{http://jackhenry.com/jxchange/TPG/2008}OrigFeesPYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigFeesLTD" type="{http://jackhenry.com/jxchange/TPG/2008}OrigFeesLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinInt" type="{http://jackhenry.com/jxchange/TPG/2008}MinInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntResrvBal" type="{http://jackhenry.com/jxchange/TPG/2008}IntResrvBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntPaidYTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntPaidYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntPaidPYTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntPaidPYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntPaidLTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntPaidLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntPaidAtAssumYTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntPaidAtAssumYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntPaidAtAssumLastYr" type="{http://jackhenry.com/jxchange/TPG/2008}IntPaidAtAssumLastYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgdOffAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ChgdOffAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WatchListDt" type="{http://jackhenry.com/jxchange/TPG/2008}WatchListDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="UCCExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}UCCExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RightToCureDt" type="{http://jackhenry.com/jxchange/TPG/2008}RightToCureDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReAmrtzThruDt" type="{http://jackhenry.com/jxchange/TPG/2008}ReAmrtzThruDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigMatDt" type="{http://jackhenry.com/jxchange/TPG/2008}OrigMatDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtRvwDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtRvwDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NonAccrDt" type="{http://jackhenry.com/jxchange/TPG/2008}NonAccrDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnSetupDt" type="{http://jackhenry.com/jxchange/TPG/2008}LnSetupDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastCouponReOrderDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastCouponReOrderDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntPaidToDt" type="{http://jackhenry.com/jxchange/TPG/2008}IntPaidToDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FirstPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExmnrClsfDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExmnrClsfDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CouponReOrderDt" type="{http://jackhenry.com/jxchange/TPG/2008}CouponReOrderDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatInsurExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatInsurExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClsDt" type="{http://jackhenry.com/jxchange/TPG/2008}ClsDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgdOffDt" type="{http://jackhenry.com/jxchange/TPG/2008}ChgdOffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BalDueAtMat" type="{http://jackhenry.com/jxchange/TPG/2008}BalDueAtMat_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="BallCallDt" type="{http://jackhenry.com/jxchange/TPG/2008}BallCallDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="EstClsDt" type="{http://jackhenry.com/jxchange/TPG/2008}EstClsDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="FundLmt" type="{http://jackhenry.com/jxchange/TPG/2008}FundLmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="LnConvDt" type="{http://jackhenry.com/jxchange/TPG/2008}LnConvDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntOnlyExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}IntOnlyExpDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="CrLifeMatDt" type="{http://jackhenry.com/jxchange/TPG/2008}CrLifeMatDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="AHInsurMatDt" type="{http://jackhenry.com/jxchange/TPG/2008}AHInsurMatDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="UEInsurMatDt" type="{http://jackhenry.com/jxchange/TPG/2008}UEInsurMatDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="NewLnFundAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NewLnFundAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="ProceedAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ProceedAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="ReAmrtzPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}ReAmrtzPmtDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="ReAmrtzDOM" type="{http://jackhenry.com/jxchange/TPG/2008}ReAmrtzDOM_Type" minOccurs="0"/&gt;
 *           &lt;element name="TotIntAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TotIntAmt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="CouponStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}CouponStartDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="CouponReOrderTerm" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *             &lt;element name="CouponReOrderTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
 *             &lt;element name="YrFeeChgDt" type="{http://jackhenry.com/jxchange/TPG/2008}YrFeeChgDt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="LnApprvDt" type="{http://jackhenry.com/jxchange/TPG/2008}LnApprvDt_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="NetMemoPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NetMemoPostAmt_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="PrincPaidYTD" type="{http://jackhenry.com/jxchange/TPG/2008}PrincPaidYTD_Type" minOccurs="0"/&gt;
 *                   &lt;element name="PrincPaidPYTD" type="{http://jackhenry.com/jxchange/TPG/2008}PrincPaidPYTD_Type" minOccurs="0"/&gt;
 *                   &lt;element name="FeePaidYTD" type="{http://jackhenry.com/jxchange/TPG/2008}FeePaidYTD_Type" minOccurs="0"/&gt;
 *                   &lt;element name="FeePaidPYTD" type="{http://jackhenry.com/jxchange/TPG/2008}FeePaidPYTD_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="FeeChgdYTD" type="{http://jackhenry.com/jxchange/TPG/2008}FeeChgdYTD_Type" minOccurs="0"/&gt;
 *                     &lt;element name="FeeChgdPYTD" type="{http://jackhenry.com/jxchange/TPG/2008}FeeChgdPYTD_Type" minOccurs="0"/&gt;
 *                     &lt;element name="IntChgdYTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntChgdYTD_Type" minOccurs="0"/&gt;
 *                     &lt;element name="IntChgdPYTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntChgdPYTD_Type" minOccurs="0"/&gt;
 *                     &lt;element name="ForeClosureDt" type="{http://jackhenry.com/jxchange/TPG/2008}ForeClosureDt_Type" minOccurs="0"/&gt;
 *                     &lt;element name="LateChgPaidMTD" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgPaidMTD_Type" minOccurs="0"/&gt;
 *                     &lt;element name="LateChgPaidYTD" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgPaidYTD_Type" minOccurs="0"/&gt;
 *                     &lt;element name="LateChgPaidPrevYTD" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgPaidPrevYTD_Type" minOccurs="0"/&gt;
 *                     &lt;element name="LateChgPaidLTD" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgPaidLTD_Type" minOccurs="0"/&gt;
 *                     &lt;element name="AdvaMTDAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AdvaMTDAmt_Type" minOccurs="0"/&gt;
 *                     &lt;element name="AdvaYTDAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AdvaYTDAmt_Type" minOccurs="0"/&gt;
 *                     &lt;element name="FeePaidMTD" type="{http://jackhenry.com/jxchange/TPG/2008}FeePaidMTD_Type" minOccurs="0"/&gt;
 *                     &lt;element name="FeePaidLTD" type="{http://jackhenry.com/jxchange/TPG/2008}FeePaidLTD_Type" minOccurs="0"/&gt;
 *                     &lt;element name="MTDAccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}MTDAccrInt_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LnBalDtInfo_CType", propOrder = {
    "soldBal",
    "ptPaidByOwner",
    "origFeesYTD",
    "origFeesPYTD",
    "origFeesLTD",
    "minInt",
    "intResrvBal",
    "intPaidYTD",
    "intPaidPYTD",
    "intPaidLTD",
    "intPaidAtAssumYTD",
    "intPaidAtAssumLastYr",
    "chgdOffAmt",
    "watchListDt",
    "uccExpDt",
    "rightToCureDt",
    "reAmrtzThruDt",
    "origMatDt",
    "nxtRvwDt",
    "nonAccrDt",
    "lnSetupDt",
    "lastMainDt",
    "lastCouponReOrderDt",
    "intPaidToDt",
    "firstPmtDt",
    "exmnrClsfDt",
    "couponReOrderDt",
    "collatInsurExpDt",
    "clsDt",
    "chgdOffDt",
    "balDueAtMat",
    "ver1",
    "ballCallDt",
    "estClsDt",
    "fundLmt",
    "lnConvDt",
    "intOnlyExpDt",
    "crLifeMatDt",
    "ahInsurMatDt",
    "ueInsurMatDt",
    "newLnFundAmt",
    "proceedAmt",
    "reAmrtzPmtDt",
    "reAmrtzDOM",
    "totIntAmt",
    "ver2",
    "couponStartDt",
    "couponReOrderTerm",
    "couponReOrderTermUnits",
    "yrFeeChgDt",
    "ver3",
    "lnApprvDt",
    "ver4",
    "netMemoPostAmt",
    "ver5",
    "princPaidYTD",
    "princPaidPYTD",
    "feePaidYTD",
    "feePaidPYTD",
    "ver6",
    "feeChgdYTD",
    "feeChgdPYTD",
    "intChgdYTD",
    "intChgdPYTD",
    "foreClosureDt",
    "lateChgPaidMTD",
    "lateChgPaidYTD",
    "lateChgPaidPrevYTD",
    "lateChgPaidLTD",
    "advaMTDAmt",
    "advaYTDAmt",
    "feePaidMTD",
    "feePaidLTD",
    "mtdAccrInt",
    "ver7",
    "any"
})
public class LnBalDtInfoCType {

    @XmlElementRef(name = "SoldBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SoldBalType> soldBal;
    @XmlElementRef(name = "PtPaidByOwner", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PtPaidByOwnerType> ptPaidByOwner;
    @XmlElementRef(name = "OrigFeesYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigFeesYTDType> origFeesYTD;
    @XmlElementRef(name = "OrigFeesPYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigFeesPYTDType> origFeesPYTD;
    @XmlElementRef(name = "OrigFeesLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigFeesLTDType> origFeesLTD;
    @XmlElementRef(name = "MinInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MinIntType> minInt;
    @XmlElementRef(name = "IntResrvBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntResrvBalType> intResrvBal;
    @XmlElementRef(name = "IntPaidYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntPaidYTDType> intPaidYTD;
    @XmlElementRef(name = "IntPaidPYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntPaidPYTDType> intPaidPYTD;
    @XmlElementRef(name = "IntPaidLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntPaidLTDType> intPaidLTD;
    @XmlElementRef(name = "IntPaidAtAssumYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntPaidAtAssumYTDType> intPaidAtAssumYTD;
    @XmlElementRef(name = "IntPaidAtAssumLastYr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntPaidAtAssumLastYrType> intPaidAtAssumLastYr;
    @XmlElementRef(name = "ChgdOffAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChgdOffAmtType> chgdOffAmt;
    @XmlElementRef(name = "WatchListDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WatchListDtType> watchListDt;
    @XmlElementRef(name = "UCCExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UCCExpDtType> uccExpDt;
    @XmlElementRef(name = "RightToCureDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RightToCureDtType> rightToCureDt;
    @XmlElementRef(name = "ReAmrtzThruDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ReAmrtzThruDtType> reAmrtzThruDt;
    @XmlElementRef(name = "OrigMatDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigMatDtType> origMatDt;
    @XmlElementRef(name = "NxtRvwDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NxtRvwDtType> nxtRvwDt;
    @XmlElementRef(name = "NonAccrDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NonAccrDtType> nonAccrDt;
    @XmlElementRef(name = "LnSetupDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnSetupDtType> lnSetupDt;
    @XmlElementRef(name = "LastMainDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastMainDtType> lastMainDt;
    @XmlElementRef(name = "LastCouponReOrderDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastCouponReOrderDtType> lastCouponReOrderDt;
    @XmlElementRef(name = "IntPaidToDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntPaidToDtType> intPaidToDt;
    @XmlElementRef(name = "FirstPmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FirstPmtDtType> firstPmtDt;
    @XmlElementRef(name = "ExmnrClsfDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExmnrClsfDtType> exmnrClsfDt;
    @XmlElementRef(name = "CouponReOrderDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CouponReOrderDtType> couponReOrderDt;
    @XmlElementRef(name = "CollatInsurExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatInsurExpDtType> collatInsurExpDt;
    @XmlElementRef(name = "ClsDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ClsDtType> clsDt;
    @XmlElementRef(name = "ChgdOffDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChgdOffDtType> chgdOffDt;
    @XmlElementRef(name = "BalDueAtMat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BalDueAtMatType> balDueAtMat;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "BallCallDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BallCallDtType> ballCallDt;
    @XmlElementRef(name = "EstClsDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EstClsDtType> estClsDt;
    @XmlElementRef(name = "FundLmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FundLmtType> fundLmt;
    @XmlElementRef(name = "LnConvDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnConvDtType> lnConvDt;
    @XmlElementRef(name = "IntOnlyExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntOnlyExpDtType> intOnlyExpDt;
    @XmlElementRef(name = "CrLifeMatDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrLifeMatDtType> crLifeMatDt;
    @XmlElementRef(name = "AHInsurMatDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AHInsurMatDtType> ahInsurMatDt;
    @XmlElementRef(name = "UEInsurMatDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UEInsurMatDtType> ueInsurMatDt;
    @XmlElementRef(name = "NewLnFundAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NewLnFundAmtType> newLnFundAmt;
    @XmlElementRef(name = "ProceedAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProceedAmtType> proceedAmt;
    @XmlElementRef(name = "ReAmrtzPmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ReAmrtzPmtDtType> reAmrtzPmtDt;
    @XmlElementRef(name = "ReAmrtzDOM", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ReAmrtzDOMType> reAmrtzDOM;
    @XmlElementRef(name = "TotIntAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TotIntAmtType> totIntAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "CouponStartDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CouponStartDtType> couponStartDt;
    @XmlElementRef(name = "CouponReOrderTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermCntType> couponReOrderTerm;
    @XmlElementRef(name = "CouponReOrderTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermUnitsType> couponReOrderTermUnits;
    @XmlElementRef(name = "YrFeeChgDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<YrFeeChgDtType> yrFeeChgDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "LnApprvDt")
    protected LnApprvDtType lnApprvDt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "NetMemoPostAmt")
    protected NetMemoPostAmtType netMemoPostAmt;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "PrincPaidYTD")
    protected PrincPaidYTDType princPaidYTD;
    @XmlElement(name = "PrincPaidPYTD")
    protected PrincPaidPYTDType princPaidPYTD;
    @XmlElement(name = "FeePaidYTD")
    protected FeePaidYTDType feePaidYTD;
    @XmlElement(name = "FeePaidPYTD")
    protected FeePaidPYTDType feePaidPYTD;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "FeeChgdYTD")
    protected FeeChgdYTDType feeChgdYTD;
    @XmlElement(name = "FeeChgdPYTD")
    protected FeeChgdPYTDType feeChgdPYTD;
    @XmlElement(name = "IntChgdYTD")
    protected IntChgdYTDType intChgdYTD;
    @XmlElement(name = "IntChgdPYTD")
    protected IntChgdPYTDType intChgdPYTD;
    @XmlElement(name = "ForeClosureDt")
    protected ForeClosureDtType foreClosureDt;
    @XmlElement(name = "LateChgPaidMTD")
    protected LateChgPaidMTDType lateChgPaidMTD;
    @XmlElement(name = "LateChgPaidYTD")
    protected LateChgPaidYTDType lateChgPaidYTD;
    @XmlElement(name = "LateChgPaidPrevYTD")
    protected LateChgPaidPrevYTDType lateChgPaidPrevYTD;
    @XmlElement(name = "LateChgPaidLTD")
    protected LateChgPaidLTDType lateChgPaidLTD;
    @XmlElement(name = "AdvaMTDAmt")
    protected AdvaMTDAmtType advaMTDAmt;
    @XmlElement(name = "AdvaYTDAmt")
    protected AdvaYTDAmtType advaYTDAmt;
    @XmlElement(name = "FeePaidMTD")
    protected FeePaidMTDType feePaidMTD;
    @XmlElement(name = "FeePaidLTD")
    protected FeePaidLTDType feePaidLTD;
    @XmlElement(name = "MTDAccrInt")
    protected MTDAccrIntType mtdAccrInt;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the soldBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SoldBalType }{@code >}
     *     
     */
    public JAXBElement<SoldBalType> getSoldBal() {
        return soldBal;
    }

    /**
     * Sets the value of the soldBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SoldBalType }{@code >}
     *     
     */
    public void setSoldBal(JAXBElement<SoldBalType> value) {
        this.soldBal = value;
    }

    /**
     * Gets the value of the ptPaidByOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PtPaidByOwnerType }{@code >}
     *     
     */
    public JAXBElement<PtPaidByOwnerType> getPtPaidByOwner() {
        return ptPaidByOwner;
    }

    /**
     * Sets the value of the ptPaidByOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PtPaidByOwnerType }{@code >}
     *     
     */
    public void setPtPaidByOwner(JAXBElement<PtPaidByOwnerType> value) {
        this.ptPaidByOwner = value;
    }

    /**
     * Gets the value of the origFeesYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigFeesYTDType }{@code >}
     *     
     */
    public JAXBElement<OrigFeesYTDType> getOrigFeesYTD() {
        return origFeesYTD;
    }

    /**
     * Sets the value of the origFeesYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigFeesYTDType }{@code >}
     *     
     */
    public void setOrigFeesYTD(JAXBElement<OrigFeesYTDType> value) {
        this.origFeesYTD = value;
    }

    /**
     * Gets the value of the origFeesPYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigFeesPYTDType }{@code >}
     *     
     */
    public JAXBElement<OrigFeesPYTDType> getOrigFeesPYTD() {
        return origFeesPYTD;
    }

    /**
     * Sets the value of the origFeesPYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigFeesPYTDType }{@code >}
     *     
     */
    public void setOrigFeesPYTD(JAXBElement<OrigFeesPYTDType> value) {
        this.origFeesPYTD = value;
    }

    /**
     * Gets the value of the origFeesLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigFeesLTDType }{@code >}
     *     
     */
    public JAXBElement<OrigFeesLTDType> getOrigFeesLTD() {
        return origFeesLTD;
    }

    /**
     * Sets the value of the origFeesLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigFeesLTDType }{@code >}
     *     
     */
    public void setOrigFeesLTD(JAXBElement<OrigFeesLTDType> value) {
        this.origFeesLTD = value;
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
     * Gets the value of the intResrvBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntResrvBalType }{@code >}
     *     
     */
    public JAXBElement<IntResrvBalType> getIntResrvBal() {
        return intResrvBal;
    }

    /**
     * Sets the value of the intResrvBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntResrvBalType }{@code >}
     *     
     */
    public void setIntResrvBal(JAXBElement<IntResrvBalType> value) {
        this.intResrvBal = value;
    }

    /**
     * Gets the value of the intPaidYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntPaidYTDType }{@code >}
     *     
     */
    public JAXBElement<IntPaidYTDType> getIntPaidYTD() {
        return intPaidYTD;
    }

    /**
     * Sets the value of the intPaidYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntPaidYTDType }{@code >}
     *     
     */
    public void setIntPaidYTD(JAXBElement<IntPaidYTDType> value) {
        this.intPaidYTD = value;
    }

    /**
     * Gets the value of the intPaidPYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntPaidPYTDType }{@code >}
     *     
     */
    public JAXBElement<IntPaidPYTDType> getIntPaidPYTD() {
        return intPaidPYTD;
    }

    /**
     * Sets the value of the intPaidPYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntPaidPYTDType }{@code >}
     *     
     */
    public void setIntPaidPYTD(JAXBElement<IntPaidPYTDType> value) {
        this.intPaidPYTD = value;
    }

    /**
     * Gets the value of the intPaidLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntPaidLTDType }{@code >}
     *     
     */
    public JAXBElement<IntPaidLTDType> getIntPaidLTD() {
        return intPaidLTD;
    }

    /**
     * Sets the value of the intPaidLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntPaidLTDType }{@code >}
     *     
     */
    public void setIntPaidLTD(JAXBElement<IntPaidLTDType> value) {
        this.intPaidLTD = value;
    }

    /**
     * Gets the value of the intPaidAtAssumYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntPaidAtAssumYTDType }{@code >}
     *     
     */
    public JAXBElement<IntPaidAtAssumYTDType> getIntPaidAtAssumYTD() {
        return intPaidAtAssumYTD;
    }

    /**
     * Sets the value of the intPaidAtAssumYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntPaidAtAssumYTDType }{@code >}
     *     
     */
    public void setIntPaidAtAssumYTD(JAXBElement<IntPaidAtAssumYTDType> value) {
        this.intPaidAtAssumYTD = value;
    }

    /**
     * Gets the value of the intPaidAtAssumLastYr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntPaidAtAssumLastYrType }{@code >}
     *     
     */
    public JAXBElement<IntPaidAtAssumLastYrType> getIntPaidAtAssumLastYr() {
        return intPaidAtAssumLastYr;
    }

    /**
     * Sets the value of the intPaidAtAssumLastYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntPaidAtAssumLastYrType }{@code >}
     *     
     */
    public void setIntPaidAtAssumLastYr(JAXBElement<IntPaidAtAssumLastYrType> value) {
        this.intPaidAtAssumLastYr = value;
    }

    /**
     * Gets the value of the chgdOffAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChgdOffAmtType }{@code >}
     *     
     */
    public JAXBElement<ChgdOffAmtType> getChgdOffAmt() {
        return chgdOffAmt;
    }

    /**
     * Sets the value of the chgdOffAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChgdOffAmtType }{@code >}
     *     
     */
    public void setChgdOffAmt(JAXBElement<ChgdOffAmtType> value) {
        this.chgdOffAmt = value;
    }

    /**
     * Gets the value of the watchListDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WatchListDtType }{@code >}
     *     
     */
    public JAXBElement<WatchListDtType> getWatchListDt() {
        return watchListDt;
    }

    /**
     * Sets the value of the watchListDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WatchListDtType }{@code >}
     *     
     */
    public void setWatchListDt(JAXBElement<WatchListDtType> value) {
        this.watchListDt = value;
    }

    /**
     * Gets the value of the uccExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UCCExpDtType }{@code >}
     *     
     */
    public JAXBElement<UCCExpDtType> getUCCExpDt() {
        return uccExpDt;
    }

    /**
     * Sets the value of the uccExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UCCExpDtType }{@code >}
     *     
     */
    public void setUCCExpDt(JAXBElement<UCCExpDtType> value) {
        this.uccExpDt = value;
    }

    /**
     * Gets the value of the rightToCureDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RightToCureDtType }{@code >}
     *     
     */
    public JAXBElement<RightToCureDtType> getRightToCureDt() {
        return rightToCureDt;
    }

    /**
     * Sets the value of the rightToCureDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RightToCureDtType }{@code >}
     *     
     */
    public void setRightToCureDt(JAXBElement<RightToCureDtType> value) {
        this.rightToCureDt = value;
    }

    /**
     * Gets the value of the reAmrtzThruDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReAmrtzThruDtType }{@code >}
     *     
     */
    public JAXBElement<ReAmrtzThruDtType> getReAmrtzThruDt() {
        return reAmrtzThruDt;
    }

    /**
     * Sets the value of the reAmrtzThruDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReAmrtzThruDtType }{@code >}
     *     
     */
    public void setReAmrtzThruDt(JAXBElement<ReAmrtzThruDtType> value) {
        this.reAmrtzThruDt = value;
    }

    /**
     * Gets the value of the origMatDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigMatDtType }{@code >}
     *     
     */
    public JAXBElement<OrigMatDtType> getOrigMatDt() {
        return origMatDt;
    }

    /**
     * Sets the value of the origMatDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigMatDtType }{@code >}
     *     
     */
    public void setOrigMatDt(JAXBElement<OrigMatDtType> value) {
        this.origMatDt = value;
    }

    /**
     * Gets the value of the nxtRvwDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NxtRvwDtType }{@code >}
     *     
     */
    public JAXBElement<NxtRvwDtType> getNxtRvwDt() {
        return nxtRvwDt;
    }

    /**
     * Sets the value of the nxtRvwDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NxtRvwDtType }{@code >}
     *     
     */
    public void setNxtRvwDt(JAXBElement<NxtRvwDtType> value) {
        this.nxtRvwDt = value;
    }

    /**
     * Gets the value of the nonAccrDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NonAccrDtType }{@code >}
     *     
     */
    public JAXBElement<NonAccrDtType> getNonAccrDt() {
        return nonAccrDt;
    }

    /**
     * Sets the value of the nonAccrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NonAccrDtType }{@code >}
     *     
     */
    public void setNonAccrDt(JAXBElement<NonAccrDtType> value) {
        this.nonAccrDt = value;
    }

    /**
     * Gets the value of the lnSetupDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnSetupDtType }{@code >}
     *     
     */
    public JAXBElement<LnSetupDtType> getLnSetupDt() {
        return lnSetupDt;
    }

    /**
     * Sets the value of the lnSetupDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnSetupDtType }{@code >}
     *     
     */
    public void setLnSetupDt(JAXBElement<LnSetupDtType> value) {
        this.lnSetupDt = value;
    }

    /**
     * Gets the value of the lastMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastMainDtType }{@code >}
     *     
     */
    public JAXBElement<LastMainDtType> getLastMainDt() {
        return lastMainDt;
    }

    /**
     * Sets the value of the lastMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastMainDtType }{@code >}
     *     
     */
    public void setLastMainDt(JAXBElement<LastMainDtType> value) {
        this.lastMainDt = value;
    }

    /**
     * Gets the value of the lastCouponReOrderDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastCouponReOrderDtType }{@code >}
     *     
     */
    public JAXBElement<LastCouponReOrderDtType> getLastCouponReOrderDt() {
        return lastCouponReOrderDt;
    }

    /**
     * Sets the value of the lastCouponReOrderDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastCouponReOrderDtType }{@code >}
     *     
     */
    public void setLastCouponReOrderDt(JAXBElement<LastCouponReOrderDtType> value) {
        this.lastCouponReOrderDt = value;
    }

    /**
     * Gets the value of the intPaidToDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntPaidToDtType }{@code >}
     *     
     */
    public JAXBElement<IntPaidToDtType> getIntPaidToDt() {
        return intPaidToDt;
    }

    /**
     * Sets the value of the intPaidToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntPaidToDtType }{@code >}
     *     
     */
    public void setIntPaidToDt(JAXBElement<IntPaidToDtType> value) {
        this.intPaidToDt = value;
    }

    /**
     * Gets the value of the firstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FirstPmtDtType }{@code >}
     *     
     */
    public JAXBElement<FirstPmtDtType> getFirstPmtDt() {
        return firstPmtDt;
    }

    /**
     * Sets the value of the firstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FirstPmtDtType }{@code >}
     *     
     */
    public void setFirstPmtDt(JAXBElement<FirstPmtDtType> value) {
        this.firstPmtDt = value;
    }

    /**
     * Gets the value of the exmnrClsfDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExmnrClsfDtType }{@code >}
     *     
     */
    public JAXBElement<ExmnrClsfDtType> getExmnrClsfDt() {
        return exmnrClsfDt;
    }

    /**
     * Sets the value of the exmnrClsfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExmnrClsfDtType }{@code >}
     *     
     */
    public void setExmnrClsfDt(JAXBElement<ExmnrClsfDtType> value) {
        this.exmnrClsfDt = value;
    }

    /**
     * Gets the value of the couponReOrderDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CouponReOrderDtType }{@code >}
     *     
     */
    public JAXBElement<CouponReOrderDtType> getCouponReOrderDt() {
        return couponReOrderDt;
    }

    /**
     * Sets the value of the couponReOrderDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CouponReOrderDtType }{@code >}
     *     
     */
    public void setCouponReOrderDt(JAXBElement<CouponReOrderDtType> value) {
        this.couponReOrderDt = value;
    }

    /**
     * Gets the value of the collatInsurExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatInsurExpDtType }{@code >}
     *     
     */
    public JAXBElement<CollatInsurExpDtType> getCollatInsurExpDt() {
        return collatInsurExpDt;
    }

    /**
     * Sets the value of the collatInsurExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatInsurExpDtType }{@code >}
     *     
     */
    public void setCollatInsurExpDt(JAXBElement<CollatInsurExpDtType> value) {
        this.collatInsurExpDt = value;
    }

    /**
     * Gets the value of the clsDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClsDtType }{@code >}
     *     
     */
    public JAXBElement<ClsDtType> getClsDt() {
        return clsDt;
    }

    /**
     * Sets the value of the clsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClsDtType }{@code >}
     *     
     */
    public void setClsDt(JAXBElement<ClsDtType> value) {
        this.clsDt = value;
    }

    /**
     * Gets the value of the chgdOffDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChgdOffDtType }{@code >}
     *     
     */
    public JAXBElement<ChgdOffDtType> getChgdOffDt() {
        return chgdOffDt;
    }

    /**
     * Sets the value of the chgdOffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChgdOffDtType }{@code >}
     *     
     */
    public void setChgdOffDt(JAXBElement<ChgdOffDtType> value) {
        this.chgdOffDt = value;
    }

    /**
     * Gets the value of the balDueAtMat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BalDueAtMatType }{@code >}
     *     
     */
    public JAXBElement<BalDueAtMatType> getBalDueAtMat() {
        return balDueAtMat;
    }

    /**
     * Sets the value of the balDueAtMat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BalDueAtMatType }{@code >}
     *     
     */
    public void setBalDueAtMat(JAXBElement<BalDueAtMatType> value) {
        this.balDueAtMat = value;
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
     * Gets the value of the ballCallDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BallCallDtType }{@code >}
     *     
     */
    public JAXBElement<BallCallDtType> getBallCallDt() {
        return ballCallDt;
    }

    /**
     * Sets the value of the ballCallDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BallCallDtType }{@code >}
     *     
     */
    public void setBallCallDt(JAXBElement<BallCallDtType> value) {
        this.ballCallDt = value;
    }

    /**
     * Gets the value of the estClsDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EstClsDtType }{@code >}
     *     
     */
    public JAXBElement<EstClsDtType> getEstClsDt() {
        return estClsDt;
    }

    /**
     * Sets the value of the estClsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EstClsDtType }{@code >}
     *     
     */
    public void setEstClsDt(JAXBElement<EstClsDtType> value) {
        this.estClsDt = value;
    }

    /**
     * Gets the value of the fundLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FundLmtType }{@code >}
     *     
     */
    public JAXBElement<FundLmtType> getFundLmt() {
        return fundLmt;
    }

    /**
     * Sets the value of the fundLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FundLmtType }{@code >}
     *     
     */
    public void setFundLmt(JAXBElement<FundLmtType> value) {
        this.fundLmt = value;
    }

    /**
     * Gets the value of the lnConvDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnConvDtType }{@code >}
     *     
     */
    public JAXBElement<LnConvDtType> getLnConvDt() {
        return lnConvDt;
    }

    /**
     * Sets the value of the lnConvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnConvDtType }{@code >}
     *     
     */
    public void setLnConvDt(JAXBElement<LnConvDtType> value) {
        this.lnConvDt = value;
    }

    /**
     * Gets the value of the intOnlyExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntOnlyExpDtType }{@code >}
     *     
     */
    public JAXBElement<IntOnlyExpDtType> getIntOnlyExpDt() {
        return intOnlyExpDt;
    }

    /**
     * Sets the value of the intOnlyExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntOnlyExpDtType }{@code >}
     *     
     */
    public void setIntOnlyExpDt(JAXBElement<IntOnlyExpDtType> value) {
        this.intOnlyExpDt = value;
    }

    /**
     * Gets the value of the crLifeMatDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrLifeMatDtType }{@code >}
     *     
     */
    public JAXBElement<CrLifeMatDtType> getCrLifeMatDt() {
        return crLifeMatDt;
    }

    /**
     * Sets the value of the crLifeMatDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrLifeMatDtType }{@code >}
     *     
     */
    public void setCrLifeMatDt(JAXBElement<CrLifeMatDtType> value) {
        this.crLifeMatDt = value;
    }

    /**
     * Gets the value of the ahInsurMatDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AHInsurMatDtType }{@code >}
     *     
     */
    public JAXBElement<AHInsurMatDtType> getAHInsurMatDt() {
        return ahInsurMatDt;
    }

    /**
     * Sets the value of the ahInsurMatDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AHInsurMatDtType }{@code >}
     *     
     */
    public void setAHInsurMatDt(JAXBElement<AHInsurMatDtType> value) {
        this.ahInsurMatDt = value;
    }

    /**
     * Gets the value of the ueInsurMatDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UEInsurMatDtType }{@code >}
     *     
     */
    public JAXBElement<UEInsurMatDtType> getUEInsurMatDt() {
        return ueInsurMatDt;
    }

    /**
     * Sets the value of the ueInsurMatDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UEInsurMatDtType }{@code >}
     *     
     */
    public void setUEInsurMatDt(JAXBElement<UEInsurMatDtType> value) {
        this.ueInsurMatDt = value;
    }

    /**
     * Gets the value of the newLnFundAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NewLnFundAmtType }{@code >}
     *     
     */
    public JAXBElement<NewLnFundAmtType> getNewLnFundAmt() {
        return newLnFundAmt;
    }

    /**
     * Sets the value of the newLnFundAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NewLnFundAmtType }{@code >}
     *     
     */
    public void setNewLnFundAmt(JAXBElement<NewLnFundAmtType> value) {
        this.newLnFundAmt = value;
    }

    /**
     * Gets the value of the proceedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProceedAmtType }{@code >}
     *     
     */
    public JAXBElement<ProceedAmtType> getProceedAmt() {
        return proceedAmt;
    }

    /**
     * Sets the value of the proceedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProceedAmtType }{@code >}
     *     
     */
    public void setProceedAmt(JAXBElement<ProceedAmtType> value) {
        this.proceedAmt = value;
    }

    /**
     * Gets the value of the reAmrtzPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReAmrtzPmtDtType }{@code >}
     *     
     */
    public JAXBElement<ReAmrtzPmtDtType> getReAmrtzPmtDt() {
        return reAmrtzPmtDt;
    }

    /**
     * Sets the value of the reAmrtzPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReAmrtzPmtDtType }{@code >}
     *     
     */
    public void setReAmrtzPmtDt(JAXBElement<ReAmrtzPmtDtType> value) {
        this.reAmrtzPmtDt = value;
    }

    /**
     * Gets the value of the reAmrtzDOM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReAmrtzDOMType }{@code >}
     *     
     */
    public JAXBElement<ReAmrtzDOMType> getReAmrtzDOM() {
        return reAmrtzDOM;
    }

    /**
     * Sets the value of the reAmrtzDOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReAmrtzDOMType }{@code >}
     *     
     */
    public void setReAmrtzDOM(JAXBElement<ReAmrtzDOMType> value) {
        this.reAmrtzDOM = value;
    }

    /**
     * Gets the value of the totIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TotIntAmtType }{@code >}
     *     
     */
    public JAXBElement<TotIntAmtType> getTotIntAmt() {
        return totIntAmt;
    }

    /**
     * Sets the value of the totIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TotIntAmtType }{@code >}
     *     
     */
    public void setTotIntAmt(JAXBElement<TotIntAmtType> value) {
        this.totIntAmt = value;
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
     * Gets the value of the couponStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CouponStartDtType }{@code >}
     *     
     */
    public JAXBElement<CouponStartDtType> getCouponStartDt() {
        return couponStartDt;
    }

    /**
     * Sets the value of the couponStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CouponStartDtType }{@code >}
     *     
     */
    public void setCouponStartDt(JAXBElement<CouponStartDtType> value) {
        this.couponStartDt = value;
    }

    /**
     * Gets the value of the couponReOrderTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public JAXBElement<TermCntType> getCouponReOrderTerm() {
        return couponReOrderTerm;
    }

    /**
     * Sets the value of the couponReOrderTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public void setCouponReOrderTerm(JAXBElement<TermCntType> value) {
        this.couponReOrderTerm = value;
    }

    /**
     * Gets the value of the couponReOrderTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public JAXBElement<TermUnitsType> getCouponReOrderTermUnits() {
        return couponReOrderTermUnits;
    }

    /**
     * Sets the value of the couponReOrderTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public void setCouponReOrderTermUnits(JAXBElement<TermUnitsType> value) {
        this.couponReOrderTermUnits = value;
    }

    /**
     * Gets the value of the yrFeeChgDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YrFeeChgDtType }{@code >}
     *     
     */
    public JAXBElement<YrFeeChgDtType> getYrFeeChgDt() {
        return yrFeeChgDt;
    }

    /**
     * Sets the value of the yrFeeChgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YrFeeChgDtType }{@code >}
     *     
     */
    public void setYrFeeChgDt(JAXBElement<YrFeeChgDtType> value) {
        this.yrFeeChgDt = value;
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
     * Gets the value of the lnApprvDt property.
     * 
     * @return
     *     possible object is
     *     {@link LnApprvDtType }
     *     
     */
    public LnApprvDtType getLnApprvDt() {
        return lnApprvDt;
    }

    /**
     * Sets the value of the lnApprvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnApprvDtType }
     *     
     */
    public void setLnApprvDt(LnApprvDtType value) {
        this.lnApprvDt = value;
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
     * Gets the value of the netMemoPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NetMemoPostAmtType }
     *     
     */
    public NetMemoPostAmtType getNetMemoPostAmt() {
        return netMemoPostAmt;
    }

    /**
     * Sets the value of the netMemoPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetMemoPostAmtType }
     *     
     */
    public void setNetMemoPostAmt(NetMemoPostAmtType value) {
        this.netMemoPostAmt = value;
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
     * Gets the value of the princPaidYTD property.
     * 
     * @return
     *     possible object is
     *     {@link PrincPaidYTDType }
     *     
     */
    public PrincPaidYTDType getPrincPaidYTD() {
        return princPaidYTD;
    }

    /**
     * Sets the value of the princPaidYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincPaidYTDType }
     *     
     */
    public void setPrincPaidYTD(PrincPaidYTDType value) {
        this.princPaidYTD = value;
    }

    /**
     * Gets the value of the princPaidPYTD property.
     * 
     * @return
     *     possible object is
     *     {@link PrincPaidPYTDType }
     *     
     */
    public PrincPaidPYTDType getPrincPaidPYTD() {
        return princPaidPYTD;
    }

    /**
     * Sets the value of the princPaidPYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincPaidPYTDType }
     *     
     */
    public void setPrincPaidPYTD(PrincPaidPYTDType value) {
        this.princPaidPYTD = value;
    }

    /**
     * Gets the value of the feePaidYTD property.
     * 
     * @return
     *     possible object is
     *     {@link FeePaidYTDType }
     *     
     */
    public FeePaidYTDType getFeePaidYTD() {
        return feePaidYTD;
    }

    /**
     * Sets the value of the feePaidYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeePaidYTDType }
     *     
     */
    public void setFeePaidYTD(FeePaidYTDType value) {
        this.feePaidYTD = value;
    }

    /**
     * Gets the value of the feePaidPYTD property.
     * 
     * @return
     *     possible object is
     *     {@link FeePaidPYTDType }
     *     
     */
    public FeePaidPYTDType getFeePaidPYTD() {
        return feePaidPYTD;
    }

    /**
     * Sets the value of the feePaidPYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeePaidPYTDType }
     *     
     */
    public void setFeePaidPYTD(FeePaidPYTDType value) {
        this.feePaidPYTD = value;
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
     * Gets the value of the feeChgdYTD property.
     * 
     * @return
     *     possible object is
     *     {@link FeeChgdYTDType }
     *     
     */
    public FeeChgdYTDType getFeeChgdYTD() {
        return feeChgdYTD;
    }

    /**
     * Sets the value of the feeChgdYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeChgdYTDType }
     *     
     */
    public void setFeeChgdYTD(FeeChgdYTDType value) {
        this.feeChgdYTD = value;
    }

    /**
     * Gets the value of the feeChgdPYTD property.
     * 
     * @return
     *     possible object is
     *     {@link FeeChgdPYTDType }
     *     
     */
    public FeeChgdPYTDType getFeeChgdPYTD() {
        return feeChgdPYTD;
    }

    /**
     * Sets the value of the feeChgdPYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeChgdPYTDType }
     *     
     */
    public void setFeeChgdPYTD(FeeChgdPYTDType value) {
        this.feeChgdPYTD = value;
    }

    /**
     * Gets the value of the intChgdYTD property.
     * 
     * @return
     *     possible object is
     *     {@link IntChgdYTDType }
     *     
     */
    public IntChgdYTDType getIntChgdYTD() {
        return intChgdYTD;
    }

    /**
     * Sets the value of the intChgdYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntChgdYTDType }
     *     
     */
    public void setIntChgdYTD(IntChgdYTDType value) {
        this.intChgdYTD = value;
    }

    /**
     * Gets the value of the intChgdPYTD property.
     * 
     * @return
     *     possible object is
     *     {@link IntChgdPYTDType }
     *     
     */
    public IntChgdPYTDType getIntChgdPYTD() {
        return intChgdPYTD;
    }

    /**
     * Sets the value of the intChgdPYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntChgdPYTDType }
     *     
     */
    public void setIntChgdPYTD(IntChgdPYTDType value) {
        this.intChgdPYTD = value;
    }

    /**
     * Gets the value of the foreClosureDt property.
     * 
     * @return
     *     possible object is
     *     {@link ForeClosureDtType }
     *     
     */
    public ForeClosureDtType getForeClosureDt() {
        return foreClosureDt;
    }

    /**
     * Sets the value of the foreClosureDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeClosureDtType }
     *     
     */
    public void setForeClosureDt(ForeClosureDtType value) {
        this.foreClosureDt = value;
    }

    /**
     * Gets the value of the lateChgPaidMTD property.
     * 
     * @return
     *     possible object is
     *     {@link LateChgPaidMTDType }
     *     
     */
    public LateChgPaidMTDType getLateChgPaidMTD() {
        return lateChgPaidMTD;
    }

    /**
     * Sets the value of the lateChgPaidMTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link LateChgPaidMTDType }
     *     
     */
    public void setLateChgPaidMTD(LateChgPaidMTDType value) {
        this.lateChgPaidMTD = value;
    }

    /**
     * Gets the value of the lateChgPaidYTD property.
     * 
     * @return
     *     possible object is
     *     {@link LateChgPaidYTDType }
     *     
     */
    public LateChgPaidYTDType getLateChgPaidYTD() {
        return lateChgPaidYTD;
    }

    /**
     * Sets the value of the lateChgPaidYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link LateChgPaidYTDType }
     *     
     */
    public void setLateChgPaidYTD(LateChgPaidYTDType value) {
        this.lateChgPaidYTD = value;
    }

    /**
     * Gets the value of the lateChgPaidPrevYTD property.
     * 
     * @return
     *     possible object is
     *     {@link LateChgPaidPrevYTDType }
     *     
     */
    public LateChgPaidPrevYTDType getLateChgPaidPrevYTD() {
        return lateChgPaidPrevYTD;
    }

    /**
     * Sets the value of the lateChgPaidPrevYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link LateChgPaidPrevYTDType }
     *     
     */
    public void setLateChgPaidPrevYTD(LateChgPaidPrevYTDType value) {
        this.lateChgPaidPrevYTD = value;
    }

    /**
     * Gets the value of the lateChgPaidLTD property.
     * 
     * @return
     *     possible object is
     *     {@link LateChgPaidLTDType }
     *     
     */
    public LateChgPaidLTDType getLateChgPaidLTD() {
        return lateChgPaidLTD;
    }

    /**
     * Sets the value of the lateChgPaidLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link LateChgPaidLTDType }
     *     
     */
    public void setLateChgPaidLTD(LateChgPaidLTDType value) {
        this.lateChgPaidLTD = value;
    }

    /**
     * Gets the value of the advaMTDAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AdvaMTDAmtType }
     *     
     */
    public AdvaMTDAmtType getAdvaMTDAmt() {
        return advaMTDAmt;
    }

    /**
     * Sets the value of the advaMTDAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvaMTDAmtType }
     *     
     */
    public void setAdvaMTDAmt(AdvaMTDAmtType value) {
        this.advaMTDAmt = value;
    }

    /**
     * Gets the value of the advaYTDAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AdvaYTDAmtType }
     *     
     */
    public AdvaYTDAmtType getAdvaYTDAmt() {
        return advaYTDAmt;
    }

    /**
     * Sets the value of the advaYTDAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvaYTDAmtType }
     *     
     */
    public void setAdvaYTDAmt(AdvaYTDAmtType value) {
        this.advaYTDAmt = value;
    }

    /**
     * Gets the value of the feePaidMTD property.
     * 
     * @return
     *     possible object is
     *     {@link FeePaidMTDType }
     *     
     */
    public FeePaidMTDType getFeePaidMTD() {
        return feePaidMTD;
    }

    /**
     * Sets the value of the feePaidMTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeePaidMTDType }
     *     
     */
    public void setFeePaidMTD(FeePaidMTDType value) {
        this.feePaidMTD = value;
    }

    /**
     * Gets the value of the feePaidLTD property.
     * 
     * @return
     *     possible object is
     *     {@link FeePaidLTDType }
     *     
     */
    public FeePaidLTDType getFeePaidLTD() {
        return feePaidLTD;
    }

    /**
     * Sets the value of the feePaidLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeePaidLTDType }
     *     
     */
    public void setFeePaidLTD(FeePaidLTDType value) {
        this.feePaidLTD = value;
    }

    /**
     * Gets the value of the mtdAccrInt property.
     * 
     * @return
     *     possible object is
     *     {@link MTDAccrIntType }
     *     
     */
    public MTDAccrIntType getMTDAccrInt() {
        return mtdAccrInt;
    }

    /**
     * Sets the value of the mtdAccrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MTDAccrIntType }
     *     
     */
    public void setMTDAccrInt(MTDAccrIntType value) {
        this.mtdAccrInt = value;
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
