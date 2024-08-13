
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * <p>Java class for LnAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WatchListCode" type="{http://jackhenry.com/jxchange/TPG/2008}WatchListCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="VehicleId" type="{http://jackhenry.com/jxchange/TPG/2008}VehicleId_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="TitleNeeded" type="{http://jackhenry.com/jxchange/TPG/2008}TitleNeeded_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubPrimeLnCode" type="{http://jackhenry.com/jxchange/TPG/2008}SubPrimeLnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StudentLnCode" type="{http://jackhenry.com/jxchange/TPG/2008}StudentLnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://jackhenry.com/jxchange/TPG/2008}State_Type" minOccurs="0"/&gt;
 *         &lt;element name="RstrAdvaOvrLmt" type="{http://jackhenry.com/jxchange/TPG/2008}RstrAdvaOvrLmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RstrAdva" type="{http://jackhenry.com/jxchange/TPG/2008}RstrAdva_Type" minOccurs="0"/&gt;
 *         &lt;element name="RewriteToLnAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}RewriteToLnAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="RestructuredDr" type="{http://jackhenry.com/jxchange/TPG/2008}RestructuredDr_Type" minOccurs="0"/&gt;
 *         &lt;element name="RelAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}RelAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="RelAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}RelAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PurpCode" type="{http://jackhenry.com/jxchange/TPG/2008}PurpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PtPaid" type="{http://jackhenry.com/jxchange/TPG/2008}PtPaid_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtRcpt" type="{http://jackhenry.com/jxchange/TPG/2008}PrtRcpt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtPastDueNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtPastDueNotCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtCouponBook" type="{http://jackhenry.com/jxchange/TPG/2008}PrtCouponBook_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtBilNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtBilNotCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevStat" type="{http://jackhenry.com/jxchange/TPG/2008}PrevStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayoffPend" type="{http://jackhenry.com/jxchange/TPG/2008}PayoffPend_Type" minOccurs="0"/&gt;
 *         &lt;element name="PartIdNum" type="{http://jackhenry.com/jxchange/TPG/2008}PartIdNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigPartPct" type="{http://jackhenry.com/jxchange/TPG/2008}OrigPartPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigLnToValRatio" type="{http://jackhenry.com/jxchange/TPG/2008}OrigLnToValRatio_Type" minOccurs="0"/&gt;
 *         &lt;element name="LateChgCode" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IncCombStmt" type="{http://jackhenry.com/jxchange/TPG/2008}IncCombStmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="HldMailCode" type="{http://jackhenry.com/jxchange/TPG/2008}HldMailCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="HighRiskCust" type="{http://jackhenry.com/jxchange/TPG/2008}HighRiskCust_Type" minOccurs="0"/&gt;
 *         &lt;element name="ForcedPlaceInsur" type="{http://jackhenry.com/jxchange/TPG/2008}ForcedPlaceInsur_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExmnrClsfCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExmnrClsfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExclAutoNonAccr" type="{http://jackhenry.com/jxchange/TPG/2008}ExclAutoNonAccr_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeptCode" type="{http://jackhenry.com/jxchange/TPG/2008}DeptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurLnToValRatio" type="{http://jackhenry.com/jxchange/TPG/2008}CurLnToValRatio_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrRatingCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrRatingCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CouponBookTerm" type="{http://jackhenry.com/jxchange/TPG/2008}CouponBookTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClsOnZeroBal" type="{http://jackhenry.com/jxchange/TPG/2008}ClsOnZeroBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="CalcPartPct" type="{http://jackhenry.com/jxchange/TPG/2008}CalcPartPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="BadChkRecv" type="{http://jackhenry.com/jxchange/TPG/2008}BadChkRecv_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnnIncmAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AnnIncmAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctClsfCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctClsfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="HldAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}HldAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="HldAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}HldAcctId_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="BorwInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}BorwInfoArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="LnClsInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnClsInfoArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="LOCAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAcctId_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCCustId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCustId_Type" minOccurs="0"/&gt;
 *           &lt;element name="CombLTV" type="{http://jackhenry.com/jxchange/TPG/2008}CombLTV_Type" minOccurs="0"/&gt;
 *           &lt;element name="CurrencyCode" type="{http://jackhenry.com/jxchange/TPG/2008}CurrencyCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="CrScoreId" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreId_Type" minOccurs="0"/&gt;
 *           &lt;element name="CrScoreCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="TotDownPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TotDownPmtAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExcLndPlcyCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcLndPlcyCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="LnPmtToIncmPct" type="{http://jackhenry.com/jxchange/TPG/2008}LnPmtToIncmPct_Type" minOccurs="0"/&gt;
 *           &lt;element name="InvrInsurCode" type="{http://jackhenry.com/jxchange/TPG/2008}InvrInsurCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="InvrPurpCode" type="{http://jackhenry.com/jxchange/TPG/2008}InvrPurpCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="ATMCard" type="{http://jackhenry.com/jxchange/TPG/2008}ATMCard_Type" minOccurs="0"/&gt;
 *           &lt;element name="MoDebtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MoDebtAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="MinBilAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MinBilAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="MoIncmAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MoIncmAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="NumBorw" type="{http://jackhenry.com/jxchange/TPG/2008}NumBorw_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrtcpCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrtcpAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpAcctId_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrtcpAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpAcctType_Type" minOccurs="0"/&gt;
 *           &lt;element name="TotDebtPct" type="{http://jackhenry.com/jxchange/TPG/2008}TotDebtPct_Type" minOccurs="0"/&gt;
 *           &lt;element name="TotOtherDebtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TotOtherDebtAmt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="EndorNum" type="{http://jackhenry.com/jxchange/TPG/2008}EndorNum_Type" minOccurs="0"/&gt;
 *             &lt;element name="CrBureauRptCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrBureauRptCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="FirstStmtFeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}FirstStmtFeeCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="FirstStmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstStmtDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="PrePmtPenInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenInfoRec_CType" minOccurs="0"/&gt;
 *             &lt;element name="LnGuarArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnGuarArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="AllowTrnActArray" type="{http://jackhenry.com/jxchange/TPG/2008}AllowTrnActArray_AType" minOccurs="0"/&gt;
 *               &lt;element name="LangType" type="{http://jackhenry.com/jxchange/TPG/2008}LangType_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="BorwDebtIncmPct" type="{http://jackhenry.com/jxchange/TPG/2008}BorwDebtIncmPct_Type" minOccurs="0"/&gt;
 *                 &lt;element name="CoBorwDebtIncmPct" type="{http://jackhenry.com/jxchange/TPG/2008}CoBorwDebtIncmPct_Type" minOccurs="0"/&gt;
 *                 &lt;element name="BorwLiqAssetAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BorwLiqAssetAmt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="NetWorth" type="{http://jackhenry.com/jxchange/TPG/2008}NetWorth_Type" minOccurs="0"/&gt;
 *                 &lt;element name="StressRateCode" type="{http://jackhenry.com/jxchange/TPG/2008}StressRateCode_Type" minOccurs="0"/&gt;
 *                 &lt;element name="StressRateDt" type="{http://jackhenry.com/jxchange/TPG/2008}StressRateDt_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="SecdCrScoreId" type="{http://jackhenry.com/jxchange/TPG/2008}SecdCrScoreId_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="CurApprLTVRatio" type="{http://jackhenry.com/jxchange/TPG/2008}CurApprLTVRatio_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="PrePmtPenBillDt" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenBillDt_Type" minOccurs="0"/&gt;
 *                       &lt;element name="PrePmtPenDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenDueDt_Type" minOccurs="0"/&gt;
 *                       &lt;element name="InvrPropType" type="{http://jackhenry.com/jxchange/TPG/2008}InvrPropType_Type" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;element name="NetWorthAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NetWorthAmt_Type" minOccurs="0"/&gt;
 *                         &lt;sequence minOccurs="0"&gt;
 *                           &lt;element name="Ver_9" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_9_CType"/&gt;
 *                           &lt;element name="NumProp" type="{http://jackhenry.com/jxchange/TPG/2008}NumProp_Type" minOccurs="0"/&gt;
 *                           &lt;sequence minOccurs="0"&gt;
 *                             &lt;element name="Ver_10" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_10_CType"/&gt;
 *                             &lt;element name="EstbPersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *                             &lt;element name="EstbPersonTitle" type="{http://jackhenry.com/jxchange/TPG/2008}EmplTitle_Type" minOccurs="0"/&gt;
 *                             &lt;sequence minOccurs="0"&gt;
 *                               &lt;element name="Ver_11" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_11_CType"/&gt;
 *                               &lt;element name="RestructuredDt" type="{http://jackhenry.com/jxchange/TPG/2008}RestructuredDt_Type" minOccurs="0"/&gt;
 *                               &lt;element name="TotDebtPctV2" type="{http://jackhenry.com/jxchange/TPG/2008}TotDebtPct_Type" minOccurs="0"/&gt;
 *                               &lt;sequence minOccurs="0"&gt;
 *                                 &lt;element name="Ver_12" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_12_CType"/&gt;
 *                                 &lt;element name="LnPmtToIncmPctV2" type="{http://jackhenry.com/jxchange/TPG/2008}LnPmtToIncmPct_Type" minOccurs="0"/&gt;
 *                                 &lt;sequence minOccurs="0"&gt;
 *                                   &lt;element name="Ver_13" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_13_CType"/&gt;
 *                                   &lt;element name="CrRatingInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}CrRatingInfoArray_AType" minOccurs="0"/&gt;
 *                                   &lt;sequence minOccurs="0"&gt;
 *                                     &lt;element name="Ver_14" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_14_CType"/&gt;
 *                                     &lt;element name="CurDebtSvcRatio" type="{http://jackhenry.com/jxchange/TPG/2008}CurDebtSvcRatio_Type" minOccurs="0"/&gt;
 *                                     &lt;sequence minOccurs="0"&gt;
 *                                       &lt;element name="Ver_15" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_15_CType"/&gt;
 *                                       &lt;element name="OrigDebtSvcRatio" type="{http://jackhenry.com/jxchange/TPG/2008}OrigDebtSvcRatio_Type" minOccurs="0"/&gt;
 *                                       &lt;element name="OrigBorwDebtIncmPct" type="{http://jackhenry.com/jxchange/TPG/2008}BorwDebtIncmPct_Type" minOccurs="0"/&gt;
 *                                       &lt;element name="OrigCoBorwDebtIncmPct" type="{http://jackhenry.com/jxchange/TPG/2008}CoBorwDebtIncmPct_Type" minOccurs="0"/&gt;
 *                                       &lt;sequence minOccurs="0"&gt;
 *                                         &lt;element name="Ver_16" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_16_CType"/&gt;
 *                                         &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/sequence&gt;
 *                                 &lt;/sequence&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/sequence&gt;
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
@XmlType(name = "LnAcctInfo_CType", propOrder = {
    "watchListCode",
    "vehicleId",
    "userDefInfoArray",
    "titleNeeded",
    "subPrimeLnCode",
    "studentLnCode",
    "state",
    "rstrAdvaOvrLmt",
    "rstrAdva",
    "rewriteToLnAcctId",
    "restructuredDr",
    "relAcctType",
    "relAcctId",
    "purpCode",
    "ptPaid",
    "prtRcpt",
    "prtPastDueNotCode",
    "prtCouponBook",
    "prtBilNotCode",
    "prevStat",
    "prePmtPenCode",
    "payoffPend",
    "partIdNum",
    "origPartPct",
    "origLnToValRatio",
    "lateChgCode",
    "incCombStmt",
    "hldMailCode",
    "highRiskCust",
    "forcedPlaceInsur",
    "exmnrClsfCode",
    "exclAutoNonAccr",
    "deptCode",
    "curLnToValRatio",
    "crRatingCode",
    "couponBookTerm",
    "collatCode",
    "clsOnZeroBal",
    "calcPartPct",
    "badChkRecv",
    "annIncmAmt",
    "acctClsfCode",
    "hldAcctType",
    "hldAcctId",
    "ver1",
    "borwInfoArray",
    "lnClsInfoArray",
    "locAcctId",
    "locCustId",
    "combLTV",
    "currencyCode",
    "crScoreId",
    "crScoreCode",
    "totDownPmtAmt",
    "excLndPlcyCode",
    "lnPmtToIncmPct",
    "invrInsurCode",
    "invrPurpCode",
    "atmCard",
    "moDebtAmt",
    "minBilAmt",
    "moIncmAmt",
    "numBorw",
    "prtcpCode",
    "prtcpAcctId",
    "prtcpAcctType",
    "totDebtPct",
    "totOtherDebtAmt",
    "ver2",
    "endorNum",
    "crBureauRptCode",
    "firstStmtFeeCode",
    "firstStmtDt",
    "prePmtPenInfoRec",
    "lnGuarArray",
    "ver3",
    "allowTrnActArray",
    "langType",
    "ver4",
    "borwDebtIncmPct",
    "coBorwDebtIncmPct",
    "borwLiqAssetAmt",
    "netWorth",
    "stressRateCode",
    "stressRateDt",
    "ver5",
    "secdCrScoreId",
    "ver6",
    "curApprLTVRatio",
    "ver7",
    "prePmtPenBillDt",
    "prePmtPenDueDt",
    "invrPropType",
    "ver8",
    "netWorthAmt",
    "ver9",
    "numProp",
    "ver10",
    "estbPersonName",
    "estbPersonTitle",
    "ver11",
    "restructuredDt",
    "totDebtPctV2",
    "ver12",
    "lnPmtToIncmPctV2",
    "ver13",
    "crRatingInfoArray",
    "ver14",
    "curDebtSvcRatio",
    "ver15",
    "origDebtSvcRatio",
    "origBorwDebtIncmPct",
    "origCoBorwDebtIncmPct",
    "ver16",
    "any"
})
public class LnAcctInfoCType {

    @XmlElementRef(name = "WatchListCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WatchListCodeType> watchListCode;
    @XmlElementRef(name = "VehicleId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<VehicleIdType> vehicleId;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElementRef(name = "TitleNeeded", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TitleNeededType> titleNeeded;
    @XmlElementRef(name = "SubPrimeLnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SubPrimeLnCodeType> subPrimeLnCode;
    @XmlElementRef(name = "StudentLnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentLnCodeType> studentLnCode;
    @XmlElementRef(name = "State", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateType> state;
    @XmlElementRef(name = "RstrAdvaOvrLmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RstrAdvaOvrLmtType> rstrAdvaOvrLmt;
    @XmlElementRef(name = "RstrAdva", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RstrAdvaType> rstrAdva;
    @XmlElementRef(name = "RewriteToLnAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RewriteToLnAcctIdType> rewriteToLnAcctId;
    @XmlElementRef(name = "RestructuredDr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RestructuredDrType> restructuredDr;
    @XmlElementRef(name = "RelAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RelAcctTypeType> relAcctType;
    @XmlElementRef(name = "RelAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RelAcctIdType> relAcctId;
    @XmlElementRef(name = "PurpCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PurpCodeType> purpCode;
    @XmlElementRef(name = "PtPaid", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PtPaidType> ptPaid;
    @XmlElementRef(name = "PrtRcpt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtRcptType> prtRcpt;
    @XmlElementRef(name = "PrtPastDueNotCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtPastDueNotCodeType> prtPastDueNotCode;
    @XmlElementRef(name = "PrtCouponBook", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtCouponBookType> prtCouponBook;
    @XmlElementRef(name = "PrtBilNotCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtBilNotCodeType> prtBilNotCode;
    @XmlElementRef(name = "PrevStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrevStatType> prevStat;
    @XmlElementRef(name = "PrePmtPenCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePmtPenCodeType> prePmtPenCode;
    @XmlElementRef(name = "PayoffPend", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PayoffPendType> payoffPend;
    @XmlElementRef(name = "PartIdNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PartIdNumType> partIdNum;
    @XmlElementRef(name = "OrigPartPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigPartPctType> origPartPct;
    @XmlElementRef(name = "OrigLnToValRatio", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigLnToValRatioType> origLnToValRatio;
    @XmlElementRef(name = "LateChgCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LateChgCodeType> lateChgCode;
    @XmlElementRef(name = "IncCombStmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IncCombStmtType> incCombStmt;
    @XmlElementRef(name = "HldMailCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HldMailCodeType> hldMailCode;
    @XmlElementRef(name = "HighRiskCust", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HighRiskCustType> highRiskCust;
    @XmlElementRef(name = "ForcedPlaceInsur", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ForcedPlaceInsurType> forcedPlaceInsur;
    @XmlElementRef(name = "ExmnrClsfCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExmnrClsfCodeType> exmnrClsfCode;
    @XmlElementRef(name = "ExclAutoNonAccr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclAutoNonAccrType> exclAutoNonAccr;
    @XmlElementRef(name = "DeptCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DeptCodeType> deptCode;
    @XmlElementRef(name = "CurLnToValRatio", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurLnToValRatioType> curLnToValRatio;
    @XmlElementRef(name = "CrRatingCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrRatingCodeType> crRatingCode;
    @XmlElementRef(name = "CouponBookTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CouponBookTermType> couponBookTerm;
    @XmlElementRef(name = "CollatCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatCodeType> collatCode;
    @XmlElementRef(name = "ClsOnZeroBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ClsOnZeroBalType> clsOnZeroBal;
    @XmlElementRef(name = "CalcPartPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CalcPartPctType> calcPartPct;
    @XmlElementRef(name = "BadChkRecv", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BadChkRecvType> badChkRecv;
    @XmlElementRef(name = "AnnIncmAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AnnIncmAmtType> annIncmAmt;
    @XmlElementRef(name = "AcctClsfCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctClsfCodeType> acctClsfCode;
    @XmlElementRef(name = "HldAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HldAcctTypeType> hldAcctType;
    @XmlElementRef(name = "HldAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HldAcctIdType> hldAcctId;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "BorwInfoArray")
    protected BorwInfoArrayAType borwInfoArray;
    @XmlElement(name = "LnClsInfoArray")
    protected LnClsInfoArrayAType lnClsInfoArray;
    @XmlElementRef(name = "LOCAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCAcctIdType> locAcctId;
    @XmlElementRef(name = "LOCCustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCCustIdType> locCustId;
    @XmlElementRef(name = "CombLTV", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CombLTVType> combLTV;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurrencyCodeType> currencyCode;
    @XmlElementRef(name = "CrScoreId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrScoreIdType> crScoreId;
    @XmlElementRef(name = "CrScoreCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrScoreCodeType> crScoreCode;
    @XmlElementRef(name = "TotDownPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TotDownPmtAmtType> totDownPmtAmt;
    @XmlElementRef(name = "ExcLndPlcyCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExcLndPlcyCodeType> excLndPlcyCode;
    @XmlElementRef(name = "LnPmtToIncmPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnPmtToIncmPctType> lnPmtToIncmPct;
    @XmlElementRef(name = "InvrInsurCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InvrInsurCodeType> invrInsurCode;
    @XmlElementRef(name = "InvrPurpCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InvrPurpCodeType> invrPurpCode;
    @XmlElementRef(name = "ATMCard", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ATMCardType> atmCard;
    @XmlElementRef(name = "MoDebtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MoDebtAmtType> moDebtAmt;
    @XmlElementRef(name = "MinBilAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MinBilAmtType> minBilAmt;
    @XmlElementRef(name = "MoIncmAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MoIncmAmtType> moIncmAmt;
    @XmlElementRef(name = "NumBorw", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NumBorwType> numBorw;
    @XmlElementRef(name = "PrtcpCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtcpCodeType> prtcpCode;
    @XmlElementRef(name = "PrtcpAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtcpAcctIdType> prtcpAcctId;
    @XmlElementRef(name = "PrtcpAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtcpAcctTypeType> prtcpAcctType;
    @XmlElementRef(name = "TotDebtPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TotDebtPctType> totDebtPct;
    @XmlElementRef(name = "TotOtherDebtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TotOtherDebtAmtType> totOtherDebtAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "EndorNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EndorNumType> endorNum;
    @XmlElementRef(name = "CrBureauRptCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrBureauRptCodeType> crBureauRptCode;
    @XmlElementRef(name = "FirstStmtFeeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FirstStmtFeeCodeType> firstStmtFeeCode;
    @XmlElementRef(name = "FirstStmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FirstStmtDtType> firstStmtDt;
    @XmlElement(name = "PrePmtPenInfoRec")
    protected PrePmtPenInfoRecCType prePmtPenInfoRec;
    @XmlElement(name = "LnGuarArray")
    protected LnGuarArrayAType lnGuarArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "AllowTrnActArray")
    protected AllowTrnActArrayAType allowTrnActArray;
    @XmlElementRef(name = "LangType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LangTypeType> langType;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "BorwDebtIncmPct")
    protected BorwDebtIncmPctType borwDebtIncmPct;
    @XmlElement(name = "CoBorwDebtIncmPct")
    protected CoBorwDebtIncmPctType coBorwDebtIncmPct;
    @XmlElement(name = "BorwLiqAssetAmt")
    protected BorwLiqAssetAmtType borwLiqAssetAmt;
    @XmlElement(name = "NetWorth")
    protected NetWorthType netWorth;
    @XmlElement(name = "StressRateCode")
    protected StressRateCodeType stressRateCode;
    @XmlElement(name = "StressRateDt")
    protected StressRateDtType stressRateDt;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "SecdCrScoreId")
    protected SecdCrScoreIdType secdCrScoreId;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "CurApprLTVRatio")
    protected CurApprLTVRatioType curApprLTVRatio;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "PrePmtPenBillDt")
    protected PrePmtPenBillDtType prePmtPenBillDt;
    @XmlElement(name = "PrePmtPenDueDt")
    protected PrePmtPenDueDtType prePmtPenDueDt;
    @XmlElement(name = "InvrPropType")
    protected InvrPropTypeType invrPropType;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlElement(name = "NetWorthAmt")
    protected NetWorthAmtType netWorthAmt;
    @XmlElement(name = "Ver_9")
    protected Ver9CType ver9;
    @XmlElement(name = "NumProp")
    protected NumPropType numProp;
    @XmlElement(name = "Ver_10")
    protected Ver10CType ver10;
    @XmlElement(name = "EstbPersonName")
    protected PersonNameCType estbPersonName;
    @XmlElement(name = "EstbPersonTitle")
    protected EmplTitleType estbPersonTitle;
    @XmlElement(name = "Ver_11")
    protected Ver11CType ver11;
    @XmlElement(name = "RestructuredDt")
    protected RestructuredDtType restructuredDt;
    @XmlElement(name = "TotDebtPctV2")
    protected TotDebtPctType totDebtPctV2;
    @XmlElement(name = "Ver_12")
    protected Ver12CType ver12;
    @XmlElement(name = "LnPmtToIncmPctV2")
    protected LnPmtToIncmPctType lnPmtToIncmPctV2;
    @XmlElement(name = "Ver_13")
    protected Ver13CType ver13;
    @XmlElement(name = "CrRatingInfoArray")
    protected CrRatingInfoArrayAType crRatingInfoArray;
    @XmlElement(name = "Ver_14")
    protected Ver14CType ver14;
    @XmlElement(name = "CurDebtSvcRatio")
    protected CurDebtSvcRatioType curDebtSvcRatio;
    @XmlElement(name = "Ver_15")
    protected Ver15CType ver15;
    @XmlElement(name = "OrigDebtSvcRatio")
    protected OrigDebtSvcRatioType origDebtSvcRatio;
    @XmlElement(name = "OrigBorwDebtIncmPct")
    protected BorwDebtIncmPctType origBorwDebtIncmPct;
    @XmlElement(name = "OrigCoBorwDebtIncmPct")
    protected CoBorwDebtIncmPctType origCoBorwDebtIncmPct;
    @XmlElement(name = "Ver_16")
    protected Ver16CType ver16;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the watchListCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WatchListCodeType }{@code >}
     *     
     */
    public JAXBElement<WatchListCodeType> getWatchListCode() {
        return watchListCode;
    }

    /**
     * Sets the value of the watchListCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WatchListCodeType }{@code >}
     *     
     */
    public void setWatchListCode(JAXBElement<WatchListCodeType> value) {
        this.watchListCode = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehicleIdType }{@code >}
     *     
     */
    public JAXBElement<VehicleIdType> getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehicleIdType }{@code >}
     *     
     */
    public void setVehicleId(JAXBElement<VehicleIdType> value) {
        this.vehicleId = value;
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
     * Gets the value of the titleNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TitleNeededType }{@code >}
     *     
     */
    public JAXBElement<TitleNeededType> getTitleNeeded() {
        return titleNeeded;
    }

    /**
     * Sets the value of the titleNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TitleNeededType }{@code >}
     *     
     */
    public void setTitleNeeded(JAXBElement<TitleNeededType> value) {
        this.titleNeeded = value;
    }

    /**
     * Gets the value of the subPrimeLnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubPrimeLnCodeType }{@code >}
     *     
     */
    public JAXBElement<SubPrimeLnCodeType> getSubPrimeLnCode() {
        return subPrimeLnCode;
    }

    /**
     * Sets the value of the subPrimeLnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubPrimeLnCodeType }{@code >}
     *     
     */
    public void setSubPrimeLnCode(JAXBElement<SubPrimeLnCodeType> value) {
        this.subPrimeLnCode = value;
    }

    /**
     * Gets the value of the studentLnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentLnCodeType }{@code >}
     *     
     */
    public JAXBElement<StudentLnCodeType> getStudentLnCode() {
        return studentLnCode;
    }

    /**
     * Sets the value of the studentLnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentLnCodeType }{@code >}
     *     
     */
    public void setStudentLnCode(JAXBElement<StudentLnCodeType> value) {
        this.studentLnCode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateType }{@code >}
     *     
     */
    public JAXBElement<StateType> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateType }{@code >}
     *     
     */
    public void setState(JAXBElement<StateType> value) {
        this.state = value;
    }

    /**
     * Gets the value of the rstrAdvaOvrLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RstrAdvaOvrLmtType }{@code >}
     *     
     */
    public JAXBElement<RstrAdvaOvrLmtType> getRstrAdvaOvrLmt() {
        return rstrAdvaOvrLmt;
    }

    /**
     * Sets the value of the rstrAdvaOvrLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RstrAdvaOvrLmtType }{@code >}
     *     
     */
    public void setRstrAdvaOvrLmt(JAXBElement<RstrAdvaOvrLmtType> value) {
        this.rstrAdvaOvrLmt = value;
    }

    /**
     * Gets the value of the rstrAdva property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RstrAdvaType }{@code >}
     *     
     */
    public JAXBElement<RstrAdvaType> getRstrAdva() {
        return rstrAdva;
    }

    /**
     * Sets the value of the rstrAdva property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RstrAdvaType }{@code >}
     *     
     */
    public void setRstrAdva(JAXBElement<RstrAdvaType> value) {
        this.rstrAdva = value;
    }

    /**
     * Gets the value of the rewriteToLnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RewriteToLnAcctIdType }{@code >}
     *     
     */
    public JAXBElement<RewriteToLnAcctIdType> getRewriteToLnAcctId() {
        return rewriteToLnAcctId;
    }

    /**
     * Sets the value of the rewriteToLnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RewriteToLnAcctIdType }{@code >}
     *     
     */
    public void setRewriteToLnAcctId(JAXBElement<RewriteToLnAcctIdType> value) {
        this.rewriteToLnAcctId = value;
    }

    /**
     * Gets the value of the restructuredDr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RestructuredDrType }{@code >}
     *     
     */
    public JAXBElement<RestructuredDrType> getRestructuredDr() {
        return restructuredDr;
    }

    /**
     * Sets the value of the restructuredDr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RestructuredDrType }{@code >}
     *     
     */
    public void setRestructuredDr(JAXBElement<RestructuredDrType> value) {
        this.restructuredDr = value;
    }

    /**
     * Gets the value of the relAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<RelAcctTypeType> getRelAcctType() {
        return relAcctType;
    }

    /**
     * Sets the value of the relAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelAcctTypeType }{@code >}
     *     
     */
    public void setRelAcctType(JAXBElement<RelAcctTypeType> value) {
        this.relAcctType = value;
    }

    /**
     * Gets the value of the relAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelAcctIdType }{@code >}
     *     
     */
    public JAXBElement<RelAcctIdType> getRelAcctId() {
        return relAcctId;
    }

    /**
     * Sets the value of the relAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelAcctIdType }{@code >}
     *     
     */
    public void setRelAcctId(JAXBElement<RelAcctIdType> value) {
        this.relAcctId = value;
    }

    /**
     * Gets the value of the purpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PurpCodeType }{@code >}
     *     
     */
    public JAXBElement<PurpCodeType> getPurpCode() {
        return purpCode;
    }

    /**
     * Sets the value of the purpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PurpCodeType }{@code >}
     *     
     */
    public void setPurpCode(JAXBElement<PurpCodeType> value) {
        this.purpCode = value;
    }

    /**
     * Gets the value of the ptPaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PtPaidType }{@code >}
     *     
     */
    public JAXBElement<PtPaidType> getPtPaid() {
        return ptPaid;
    }

    /**
     * Sets the value of the ptPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PtPaidType }{@code >}
     *     
     */
    public void setPtPaid(JAXBElement<PtPaidType> value) {
        this.ptPaid = value;
    }

    /**
     * Gets the value of the prtRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtRcptType }{@code >}
     *     
     */
    public JAXBElement<PrtRcptType> getPrtRcpt() {
        return prtRcpt;
    }

    /**
     * Sets the value of the prtRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtRcptType }{@code >}
     *     
     */
    public void setPrtRcpt(JAXBElement<PrtRcptType> value) {
        this.prtRcpt = value;
    }

    /**
     * Gets the value of the prtPastDueNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtPastDueNotCodeType }{@code >}
     *     
     */
    public JAXBElement<PrtPastDueNotCodeType> getPrtPastDueNotCode() {
        return prtPastDueNotCode;
    }

    /**
     * Sets the value of the prtPastDueNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtPastDueNotCodeType }{@code >}
     *     
     */
    public void setPrtPastDueNotCode(JAXBElement<PrtPastDueNotCodeType> value) {
        this.prtPastDueNotCode = value;
    }

    /**
     * Gets the value of the prtCouponBook property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtCouponBookType }{@code >}
     *     
     */
    public JAXBElement<PrtCouponBookType> getPrtCouponBook() {
        return prtCouponBook;
    }

    /**
     * Sets the value of the prtCouponBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtCouponBookType }{@code >}
     *     
     */
    public void setPrtCouponBook(JAXBElement<PrtCouponBookType> value) {
        this.prtCouponBook = value;
    }

    /**
     * Gets the value of the prtBilNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtBilNotCodeType }{@code >}
     *     
     */
    public JAXBElement<PrtBilNotCodeType> getPrtBilNotCode() {
        return prtBilNotCode;
    }

    /**
     * Sets the value of the prtBilNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtBilNotCodeType }{@code >}
     *     
     */
    public void setPrtBilNotCode(JAXBElement<PrtBilNotCodeType> value) {
        this.prtBilNotCode = value;
    }

    /**
     * Gets the value of the prevStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrevStatType }{@code >}
     *     
     */
    public JAXBElement<PrevStatType> getPrevStat() {
        return prevStat;
    }

    /**
     * Sets the value of the prevStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrevStatType }{@code >}
     *     
     */
    public void setPrevStat(JAXBElement<PrevStatType> value) {
        this.prevStat = value;
    }

    /**
     * Gets the value of the prePmtPenCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenCodeType }{@code >}
     *     
     */
    public JAXBElement<PrePmtPenCodeType> getPrePmtPenCode() {
        return prePmtPenCode;
    }

    /**
     * Sets the value of the prePmtPenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenCodeType }{@code >}
     *     
     */
    public void setPrePmtPenCode(JAXBElement<PrePmtPenCodeType> value) {
        this.prePmtPenCode = value;
    }

    /**
     * Gets the value of the payoffPend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PayoffPendType }{@code >}
     *     
     */
    public JAXBElement<PayoffPendType> getPayoffPend() {
        return payoffPend;
    }

    /**
     * Sets the value of the payoffPend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PayoffPendType }{@code >}
     *     
     */
    public void setPayoffPend(JAXBElement<PayoffPendType> value) {
        this.payoffPend = value;
    }

    /**
     * Gets the value of the partIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PartIdNumType }{@code >}
     *     
     */
    public JAXBElement<PartIdNumType> getPartIdNum() {
        return partIdNum;
    }

    /**
     * Sets the value of the partIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PartIdNumType }{@code >}
     *     
     */
    public void setPartIdNum(JAXBElement<PartIdNumType> value) {
        this.partIdNum = value;
    }

    /**
     * Gets the value of the origPartPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigPartPctType }{@code >}
     *     
     */
    public JAXBElement<OrigPartPctType> getOrigPartPct() {
        return origPartPct;
    }

    /**
     * Sets the value of the origPartPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigPartPctType }{@code >}
     *     
     */
    public void setOrigPartPct(JAXBElement<OrigPartPctType> value) {
        this.origPartPct = value;
    }

    /**
     * Gets the value of the origLnToValRatio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigLnToValRatioType }{@code >}
     *     
     */
    public JAXBElement<OrigLnToValRatioType> getOrigLnToValRatio() {
        return origLnToValRatio;
    }

    /**
     * Sets the value of the origLnToValRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigLnToValRatioType }{@code >}
     *     
     */
    public void setOrigLnToValRatio(JAXBElement<OrigLnToValRatioType> value) {
        this.origLnToValRatio = value;
    }

    /**
     * Gets the value of the lateChgCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LateChgCodeType }{@code >}
     *     
     */
    public JAXBElement<LateChgCodeType> getLateChgCode() {
        return lateChgCode;
    }

    /**
     * Sets the value of the lateChgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LateChgCodeType }{@code >}
     *     
     */
    public void setLateChgCode(JAXBElement<LateChgCodeType> value) {
        this.lateChgCode = value;
    }

    /**
     * Gets the value of the incCombStmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncCombStmtType }{@code >}
     *     
     */
    public JAXBElement<IncCombStmtType> getIncCombStmt() {
        return incCombStmt;
    }

    /**
     * Sets the value of the incCombStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncCombStmtType }{@code >}
     *     
     */
    public void setIncCombStmt(JAXBElement<IncCombStmtType> value) {
        this.incCombStmt = value;
    }

    /**
     * Gets the value of the hldMailCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HldMailCodeType }{@code >}
     *     
     */
    public JAXBElement<HldMailCodeType> getHldMailCode() {
        return hldMailCode;
    }

    /**
     * Sets the value of the hldMailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HldMailCodeType }{@code >}
     *     
     */
    public void setHldMailCode(JAXBElement<HldMailCodeType> value) {
        this.hldMailCode = value;
    }

    /**
     * Gets the value of the highRiskCust property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HighRiskCustType }{@code >}
     *     
     */
    public JAXBElement<HighRiskCustType> getHighRiskCust() {
        return highRiskCust;
    }

    /**
     * Sets the value of the highRiskCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HighRiskCustType }{@code >}
     *     
     */
    public void setHighRiskCust(JAXBElement<HighRiskCustType> value) {
        this.highRiskCust = value;
    }

    /**
     * Gets the value of the forcedPlaceInsur property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ForcedPlaceInsurType }{@code >}
     *     
     */
    public JAXBElement<ForcedPlaceInsurType> getForcedPlaceInsur() {
        return forcedPlaceInsur;
    }

    /**
     * Sets the value of the forcedPlaceInsur property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ForcedPlaceInsurType }{@code >}
     *     
     */
    public void setForcedPlaceInsur(JAXBElement<ForcedPlaceInsurType> value) {
        this.forcedPlaceInsur = value;
    }

    /**
     * Gets the value of the exmnrClsfCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExmnrClsfCodeType }{@code >}
     *     
     */
    public JAXBElement<ExmnrClsfCodeType> getExmnrClsfCode() {
        return exmnrClsfCode;
    }

    /**
     * Sets the value of the exmnrClsfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExmnrClsfCodeType }{@code >}
     *     
     */
    public void setExmnrClsfCode(JAXBElement<ExmnrClsfCodeType> value) {
        this.exmnrClsfCode = value;
    }

    /**
     * Gets the value of the exclAutoNonAccr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclAutoNonAccrType }{@code >}
     *     
     */
    public JAXBElement<ExclAutoNonAccrType> getExclAutoNonAccr() {
        return exclAutoNonAccr;
    }

    /**
     * Sets the value of the exclAutoNonAccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclAutoNonAccrType }{@code >}
     *     
     */
    public void setExclAutoNonAccr(JAXBElement<ExclAutoNonAccrType> value) {
        this.exclAutoNonAccr = value;
    }

    /**
     * Gets the value of the deptCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeptCodeType }{@code >}
     *     
     */
    public JAXBElement<DeptCodeType> getDeptCode() {
        return deptCode;
    }

    /**
     * Sets the value of the deptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeptCodeType }{@code >}
     *     
     */
    public void setDeptCode(JAXBElement<DeptCodeType> value) {
        this.deptCode = value;
    }

    /**
     * Gets the value of the curLnToValRatio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurLnToValRatioType }{@code >}
     *     
     */
    public JAXBElement<CurLnToValRatioType> getCurLnToValRatio() {
        return curLnToValRatio;
    }

    /**
     * Sets the value of the curLnToValRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurLnToValRatioType }{@code >}
     *     
     */
    public void setCurLnToValRatio(JAXBElement<CurLnToValRatioType> value) {
        this.curLnToValRatio = value;
    }

    /**
     * Gets the value of the crRatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrRatingCodeType }{@code >}
     *     
     */
    public JAXBElement<CrRatingCodeType> getCrRatingCode() {
        return crRatingCode;
    }

    /**
     * Sets the value of the crRatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrRatingCodeType }{@code >}
     *     
     */
    public void setCrRatingCode(JAXBElement<CrRatingCodeType> value) {
        this.crRatingCode = value;
    }

    /**
     * Gets the value of the couponBookTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CouponBookTermType }{@code >}
     *     
     */
    public JAXBElement<CouponBookTermType> getCouponBookTerm() {
        return couponBookTerm;
    }

    /**
     * Sets the value of the couponBookTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CouponBookTermType }{@code >}
     *     
     */
    public void setCouponBookTerm(JAXBElement<CouponBookTermType> value) {
        this.couponBookTerm = value;
    }

    /**
     * Gets the value of the collatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatCodeType }{@code >}
     *     
     */
    public JAXBElement<CollatCodeType> getCollatCode() {
        return collatCode;
    }

    /**
     * Sets the value of the collatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatCodeType }{@code >}
     *     
     */
    public void setCollatCode(JAXBElement<CollatCodeType> value) {
        this.collatCode = value;
    }

    /**
     * Gets the value of the clsOnZeroBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClsOnZeroBalType }{@code >}
     *     
     */
    public JAXBElement<ClsOnZeroBalType> getClsOnZeroBal() {
        return clsOnZeroBal;
    }

    /**
     * Sets the value of the clsOnZeroBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClsOnZeroBalType }{@code >}
     *     
     */
    public void setClsOnZeroBal(JAXBElement<ClsOnZeroBalType> value) {
        this.clsOnZeroBal = value;
    }

    /**
     * Gets the value of the calcPartPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CalcPartPctType }{@code >}
     *     
     */
    public JAXBElement<CalcPartPctType> getCalcPartPct() {
        return calcPartPct;
    }

    /**
     * Sets the value of the calcPartPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CalcPartPctType }{@code >}
     *     
     */
    public void setCalcPartPct(JAXBElement<CalcPartPctType> value) {
        this.calcPartPct = value;
    }

    /**
     * Gets the value of the badChkRecv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BadChkRecvType }{@code >}
     *     
     */
    public JAXBElement<BadChkRecvType> getBadChkRecv() {
        return badChkRecv;
    }

    /**
     * Sets the value of the badChkRecv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BadChkRecvType }{@code >}
     *     
     */
    public void setBadChkRecv(JAXBElement<BadChkRecvType> value) {
        this.badChkRecv = value;
    }

    /**
     * Gets the value of the annIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnnIncmAmtType }{@code >}
     *     
     */
    public JAXBElement<AnnIncmAmtType> getAnnIncmAmt() {
        return annIncmAmt;
    }

    /**
     * Sets the value of the annIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnnIncmAmtType }{@code >}
     *     
     */
    public void setAnnIncmAmt(JAXBElement<AnnIncmAmtType> value) {
        this.annIncmAmt = value;
    }

    /**
     * Gets the value of the acctClsfCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctClsfCodeType }{@code >}
     *     
     */
    public JAXBElement<AcctClsfCodeType> getAcctClsfCode() {
        return acctClsfCode;
    }

    /**
     * Sets the value of the acctClsfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctClsfCodeType }{@code >}
     *     
     */
    public void setAcctClsfCode(JAXBElement<AcctClsfCodeType> value) {
        this.acctClsfCode = value;
    }

    /**
     * Gets the value of the hldAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HldAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<HldAcctTypeType> getHldAcctType() {
        return hldAcctType;
    }

    /**
     * Sets the value of the hldAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HldAcctTypeType }{@code >}
     *     
     */
    public void setHldAcctType(JAXBElement<HldAcctTypeType> value) {
        this.hldAcctType = value;
    }

    /**
     * Gets the value of the hldAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HldAcctIdType }{@code >}
     *     
     */
    public JAXBElement<HldAcctIdType> getHldAcctId() {
        return hldAcctId;
    }

    /**
     * Sets the value of the hldAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HldAcctIdType }{@code >}
     *     
     */
    public void setHldAcctId(JAXBElement<HldAcctIdType> value) {
        this.hldAcctId = value;
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
     * Gets the value of the borwInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link BorwInfoArrayAType }
     *     
     */
    public BorwInfoArrayAType getBorwInfoArray() {
        return borwInfoArray;
    }

    /**
     * Sets the value of the borwInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwInfoArrayAType }
     *     
     */
    public void setBorwInfoArray(BorwInfoArrayAType value) {
        this.borwInfoArray = value;
    }

    /**
     * Gets the value of the lnClsInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link LnClsInfoArrayAType }
     *     
     */
    public LnClsInfoArrayAType getLnClsInfoArray() {
        return lnClsInfoArray;
    }

    /**
     * Sets the value of the lnClsInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnClsInfoArrayAType }
     *     
     */
    public void setLnClsInfoArray(LnClsInfoArrayAType value) {
        this.lnClsInfoArray = value;
    }

    /**
     * Gets the value of the locAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCAcctIdType }{@code >}
     *     
     */
    public JAXBElement<LOCAcctIdType> getLOCAcctId() {
        return locAcctId;
    }

    /**
     * Sets the value of the locAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCAcctIdType }{@code >}
     *     
     */
    public void setLOCAcctId(JAXBElement<LOCAcctIdType> value) {
        this.locAcctId = value;
    }

    /**
     * Gets the value of the locCustId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCCustIdType }{@code >}
     *     
     */
    public JAXBElement<LOCCustIdType> getLOCCustId() {
        return locCustId;
    }

    /**
     * Sets the value of the locCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCCustIdType }{@code >}
     *     
     */
    public void setLOCCustId(JAXBElement<LOCCustIdType> value) {
        this.locCustId = value;
    }

    /**
     * Gets the value of the combLTV property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CombLTVType }{@code >}
     *     
     */
    public JAXBElement<CombLTVType> getCombLTV() {
        return combLTV;
    }

    /**
     * Sets the value of the combLTV property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CombLTVType }{@code >}
     *     
     */
    public void setCombLTV(JAXBElement<CombLTVType> value) {
        this.combLTV = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurrencyCodeType }{@code >}
     *     
     */
    public JAXBElement<CurrencyCodeType> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurrencyCodeType }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<CurrencyCodeType> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the crScoreId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrScoreIdType }{@code >}
     *     
     */
    public JAXBElement<CrScoreIdType> getCrScoreId() {
        return crScoreId;
    }

    /**
     * Sets the value of the crScoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrScoreIdType }{@code >}
     *     
     */
    public void setCrScoreId(JAXBElement<CrScoreIdType> value) {
        this.crScoreId = value;
    }

    /**
     * Gets the value of the crScoreCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrScoreCodeType }{@code >}
     *     
     */
    public JAXBElement<CrScoreCodeType> getCrScoreCode() {
        return crScoreCode;
    }

    /**
     * Sets the value of the crScoreCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrScoreCodeType }{@code >}
     *     
     */
    public void setCrScoreCode(JAXBElement<CrScoreCodeType> value) {
        this.crScoreCode = value;
    }

    /**
     * Gets the value of the totDownPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TotDownPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<TotDownPmtAmtType> getTotDownPmtAmt() {
        return totDownPmtAmt;
    }

    /**
     * Sets the value of the totDownPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TotDownPmtAmtType }{@code >}
     *     
     */
    public void setTotDownPmtAmt(JAXBElement<TotDownPmtAmtType> value) {
        this.totDownPmtAmt = value;
    }

    /**
     * Gets the value of the excLndPlcyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExcLndPlcyCodeType }{@code >}
     *     
     */
    public JAXBElement<ExcLndPlcyCodeType> getExcLndPlcyCode() {
        return excLndPlcyCode;
    }

    /**
     * Sets the value of the excLndPlcyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExcLndPlcyCodeType }{@code >}
     *     
     */
    public void setExcLndPlcyCode(JAXBElement<ExcLndPlcyCodeType> value) {
        this.excLndPlcyCode = value;
    }

    /**
     * Gets the value of the lnPmtToIncmPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnPmtToIncmPctType }{@code >}
     *     
     */
    public JAXBElement<LnPmtToIncmPctType> getLnPmtToIncmPct() {
        return lnPmtToIncmPct;
    }

    /**
     * Sets the value of the lnPmtToIncmPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnPmtToIncmPctType }{@code >}
     *     
     */
    public void setLnPmtToIncmPct(JAXBElement<LnPmtToIncmPctType> value) {
        this.lnPmtToIncmPct = value;
    }

    /**
     * Gets the value of the invrInsurCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvrInsurCodeType }{@code >}
     *     
     */
    public JAXBElement<InvrInsurCodeType> getInvrInsurCode() {
        return invrInsurCode;
    }

    /**
     * Sets the value of the invrInsurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvrInsurCodeType }{@code >}
     *     
     */
    public void setInvrInsurCode(JAXBElement<InvrInsurCodeType> value) {
        this.invrInsurCode = value;
    }

    /**
     * Gets the value of the invrPurpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvrPurpCodeType }{@code >}
     *     
     */
    public JAXBElement<InvrPurpCodeType> getInvrPurpCode() {
        return invrPurpCode;
    }

    /**
     * Sets the value of the invrPurpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvrPurpCodeType }{@code >}
     *     
     */
    public void setInvrPurpCode(JAXBElement<InvrPurpCodeType> value) {
        this.invrPurpCode = value;
    }

    /**
     * Gets the value of the atmCard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ATMCardType }{@code >}
     *     
     */
    public JAXBElement<ATMCardType> getATMCard() {
        return atmCard;
    }

    /**
     * Sets the value of the atmCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ATMCardType }{@code >}
     *     
     */
    public void setATMCard(JAXBElement<ATMCardType> value) {
        this.atmCard = value;
    }

    /**
     * Gets the value of the moDebtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoDebtAmtType }{@code >}
     *     
     */
    public JAXBElement<MoDebtAmtType> getMoDebtAmt() {
        return moDebtAmt;
    }

    /**
     * Sets the value of the moDebtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoDebtAmtType }{@code >}
     *     
     */
    public void setMoDebtAmt(JAXBElement<MoDebtAmtType> value) {
        this.moDebtAmt = value;
    }

    /**
     * Gets the value of the minBilAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MinBilAmtType }{@code >}
     *     
     */
    public JAXBElement<MinBilAmtType> getMinBilAmt() {
        return minBilAmt;
    }

    /**
     * Sets the value of the minBilAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MinBilAmtType }{@code >}
     *     
     */
    public void setMinBilAmt(JAXBElement<MinBilAmtType> value) {
        this.minBilAmt = value;
    }

    /**
     * Gets the value of the moIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoIncmAmtType }{@code >}
     *     
     */
    public JAXBElement<MoIncmAmtType> getMoIncmAmt() {
        return moIncmAmt;
    }

    /**
     * Sets the value of the moIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoIncmAmtType }{@code >}
     *     
     */
    public void setMoIncmAmt(JAXBElement<MoIncmAmtType> value) {
        this.moIncmAmt = value;
    }

    /**
     * Gets the value of the numBorw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NumBorwType }{@code >}
     *     
     */
    public JAXBElement<NumBorwType> getNumBorw() {
        return numBorw;
    }

    /**
     * Sets the value of the numBorw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NumBorwType }{@code >}
     *     
     */
    public void setNumBorw(JAXBElement<NumBorwType> value) {
        this.numBorw = value;
    }

    /**
     * Gets the value of the prtcpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtcpCodeType }{@code >}
     *     
     */
    public JAXBElement<PrtcpCodeType> getPrtcpCode() {
        return prtcpCode;
    }

    /**
     * Sets the value of the prtcpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtcpCodeType }{@code >}
     *     
     */
    public void setPrtcpCode(JAXBElement<PrtcpCodeType> value) {
        this.prtcpCode = value;
    }

    /**
     * Gets the value of the prtcpAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtcpAcctIdType }{@code >}
     *     
     */
    public JAXBElement<PrtcpAcctIdType> getPrtcpAcctId() {
        return prtcpAcctId;
    }

    /**
     * Sets the value of the prtcpAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtcpAcctIdType }{@code >}
     *     
     */
    public void setPrtcpAcctId(JAXBElement<PrtcpAcctIdType> value) {
        this.prtcpAcctId = value;
    }

    /**
     * Gets the value of the prtcpAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtcpAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<PrtcpAcctTypeType> getPrtcpAcctType() {
        return prtcpAcctType;
    }

    /**
     * Sets the value of the prtcpAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtcpAcctTypeType }{@code >}
     *     
     */
    public void setPrtcpAcctType(JAXBElement<PrtcpAcctTypeType> value) {
        this.prtcpAcctType = value;
    }

    /**
     * Gets the value of the totDebtPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TotDebtPctType }{@code >}
     *     
     */
    public JAXBElement<TotDebtPctType> getTotDebtPct() {
        return totDebtPct;
    }

    /**
     * Sets the value of the totDebtPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TotDebtPctType }{@code >}
     *     
     */
    public void setTotDebtPct(JAXBElement<TotDebtPctType> value) {
        this.totDebtPct = value;
    }

    /**
     * Gets the value of the totOtherDebtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TotOtherDebtAmtType }{@code >}
     *     
     */
    public JAXBElement<TotOtherDebtAmtType> getTotOtherDebtAmt() {
        return totOtherDebtAmt;
    }

    /**
     * Sets the value of the totOtherDebtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TotOtherDebtAmtType }{@code >}
     *     
     */
    public void setTotOtherDebtAmt(JAXBElement<TotOtherDebtAmtType> value) {
        this.totOtherDebtAmt = value;
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
     * Gets the value of the endorNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EndorNumType }{@code >}
     *     
     */
    public JAXBElement<EndorNumType> getEndorNum() {
        return endorNum;
    }

    /**
     * Sets the value of the endorNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EndorNumType }{@code >}
     *     
     */
    public void setEndorNum(JAXBElement<EndorNumType> value) {
        this.endorNum = value;
    }

    /**
     * Gets the value of the crBureauRptCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrBureauRptCodeType }{@code >}
     *     
     */
    public JAXBElement<CrBureauRptCodeType> getCrBureauRptCode() {
        return crBureauRptCode;
    }

    /**
     * Sets the value of the crBureauRptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrBureauRptCodeType }{@code >}
     *     
     */
    public void setCrBureauRptCode(JAXBElement<CrBureauRptCodeType> value) {
        this.crBureauRptCode = value;
    }

    /**
     * Gets the value of the firstStmtFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FirstStmtFeeCodeType }{@code >}
     *     
     */
    public JAXBElement<FirstStmtFeeCodeType> getFirstStmtFeeCode() {
        return firstStmtFeeCode;
    }

    /**
     * Sets the value of the firstStmtFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FirstStmtFeeCodeType }{@code >}
     *     
     */
    public void setFirstStmtFeeCode(JAXBElement<FirstStmtFeeCodeType> value) {
        this.firstStmtFeeCode = value;
    }

    /**
     * Gets the value of the firstStmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FirstStmtDtType }{@code >}
     *     
     */
    public JAXBElement<FirstStmtDtType> getFirstStmtDt() {
        return firstStmtDt;
    }

    /**
     * Sets the value of the firstStmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FirstStmtDtType }{@code >}
     *     
     */
    public void setFirstStmtDt(JAXBElement<FirstStmtDtType> value) {
        this.firstStmtDt = value;
    }

    /**
     * Gets the value of the prePmtPenInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link PrePmtPenInfoRecCType }
     *     
     */
    public PrePmtPenInfoRecCType getPrePmtPenInfoRec() {
        return prePmtPenInfoRec;
    }

    /**
     * Sets the value of the prePmtPenInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePmtPenInfoRecCType }
     *     
     */
    public void setPrePmtPenInfoRec(PrePmtPenInfoRecCType value) {
        this.prePmtPenInfoRec = value;
    }

    /**
     * Gets the value of the lnGuarArray property.
     * 
     * @return
     *     possible object is
     *     {@link LnGuarArrayAType }
     *     
     */
    public LnGuarArrayAType getLnGuarArray() {
        return lnGuarArray;
    }

    /**
     * Sets the value of the lnGuarArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnGuarArrayAType }
     *     
     */
    public void setLnGuarArray(LnGuarArrayAType value) {
        this.lnGuarArray = value;
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
     * Gets the value of the allowTrnActArray property.
     * 
     * @return
     *     possible object is
     *     {@link AllowTrnActArrayAType }
     *     
     */
    public AllowTrnActArrayAType getAllowTrnActArray() {
        return allowTrnActArray;
    }

    /**
     * Sets the value of the allowTrnActArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowTrnActArrayAType }
     *     
     */
    public void setAllowTrnActArray(AllowTrnActArrayAType value) {
        this.allowTrnActArray = value;
    }

    /**
     * Gets the value of the langType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LangTypeType }{@code >}
     *     
     */
    public JAXBElement<LangTypeType> getLangType() {
        return langType;
    }

    /**
     * Sets the value of the langType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LangTypeType }{@code >}
     *     
     */
    public void setLangType(JAXBElement<LangTypeType> value) {
        this.langType = value;
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
     * Gets the value of the borwDebtIncmPct property.
     * 
     * @return
     *     possible object is
     *     {@link BorwDebtIncmPctType }
     *     
     */
    public BorwDebtIncmPctType getBorwDebtIncmPct() {
        return borwDebtIncmPct;
    }

    /**
     * Sets the value of the borwDebtIncmPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwDebtIncmPctType }
     *     
     */
    public void setBorwDebtIncmPct(BorwDebtIncmPctType value) {
        this.borwDebtIncmPct = value;
    }

    /**
     * Gets the value of the coBorwDebtIncmPct property.
     * 
     * @return
     *     possible object is
     *     {@link CoBorwDebtIncmPctType }
     *     
     */
    public CoBorwDebtIncmPctType getCoBorwDebtIncmPct() {
        return coBorwDebtIncmPct;
    }

    /**
     * Sets the value of the coBorwDebtIncmPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoBorwDebtIncmPctType }
     *     
     */
    public void setCoBorwDebtIncmPct(CoBorwDebtIncmPctType value) {
        this.coBorwDebtIncmPct = value;
    }

    /**
     * Gets the value of the borwLiqAssetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BorwLiqAssetAmtType }
     *     
     */
    public BorwLiqAssetAmtType getBorwLiqAssetAmt() {
        return borwLiqAssetAmt;
    }

    /**
     * Sets the value of the borwLiqAssetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwLiqAssetAmtType }
     *     
     */
    public void setBorwLiqAssetAmt(BorwLiqAssetAmtType value) {
        this.borwLiqAssetAmt = value;
    }

    /**
     * Gets the value of the netWorth property.
     * 
     * @return
     *     possible object is
     *     {@link NetWorthType }
     *     
     */
    public NetWorthType getNetWorth() {
        return netWorth;
    }

    /**
     * Sets the value of the netWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetWorthType }
     *     
     */
    public void setNetWorth(NetWorthType value) {
        this.netWorth = value;
    }

    /**
     * Gets the value of the stressRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StressRateCodeType }
     *     
     */
    public StressRateCodeType getStressRateCode() {
        return stressRateCode;
    }

    /**
     * Sets the value of the stressRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressRateCodeType }
     *     
     */
    public void setStressRateCode(StressRateCodeType value) {
        this.stressRateCode = value;
    }

    /**
     * Gets the value of the stressRateDt property.
     * 
     * @return
     *     possible object is
     *     {@link StressRateDtType }
     *     
     */
    public StressRateDtType getStressRateDt() {
        return stressRateDt;
    }

    /**
     * Sets the value of the stressRateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressRateDtType }
     *     
     */
    public void setStressRateDt(StressRateDtType value) {
        this.stressRateDt = value;
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
     * Gets the value of the secdCrScoreId property.
     * 
     * @return
     *     possible object is
     *     {@link SecdCrScoreIdType }
     *     
     */
    public SecdCrScoreIdType getSecdCrScoreId() {
        return secdCrScoreId;
    }

    /**
     * Sets the value of the secdCrScoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecdCrScoreIdType }
     *     
     */
    public void setSecdCrScoreId(SecdCrScoreIdType value) {
        this.secdCrScoreId = value;
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
     * Gets the value of the curApprLTVRatio property.
     * 
     * @return
     *     possible object is
     *     {@link CurApprLTVRatioType }
     *     
     */
    public CurApprLTVRatioType getCurApprLTVRatio() {
        return curApprLTVRatio;
    }

    /**
     * Sets the value of the curApprLTVRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurApprLTVRatioType }
     *     
     */
    public void setCurApprLTVRatio(CurApprLTVRatioType value) {
        this.curApprLTVRatio = value;
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
     * Gets the value of the prePmtPenBillDt property.
     * 
     * @return
     *     possible object is
     *     {@link PrePmtPenBillDtType }
     *     
     */
    public PrePmtPenBillDtType getPrePmtPenBillDt() {
        return prePmtPenBillDt;
    }

    /**
     * Sets the value of the prePmtPenBillDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePmtPenBillDtType }
     *     
     */
    public void setPrePmtPenBillDt(PrePmtPenBillDtType value) {
        this.prePmtPenBillDt = value;
    }

    /**
     * Gets the value of the prePmtPenDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link PrePmtPenDueDtType }
     *     
     */
    public PrePmtPenDueDtType getPrePmtPenDueDt() {
        return prePmtPenDueDt;
    }

    /**
     * Sets the value of the prePmtPenDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePmtPenDueDtType }
     *     
     */
    public void setPrePmtPenDueDt(PrePmtPenDueDtType value) {
        this.prePmtPenDueDt = value;
    }

    /**
     * Gets the value of the invrPropType property.
     * 
     * @return
     *     possible object is
     *     {@link InvrPropTypeType }
     *     
     */
    public InvrPropTypeType getInvrPropType() {
        return invrPropType;
    }

    /**
     * Sets the value of the invrPropType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvrPropTypeType }
     *     
     */
    public void setInvrPropType(InvrPropTypeType value) {
        this.invrPropType = value;
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
     * Gets the value of the netWorthAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NetWorthAmtType }
     *     
     */
    public NetWorthAmtType getNetWorthAmt() {
        return netWorthAmt;
    }

    /**
     * Sets the value of the netWorthAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetWorthAmtType }
     *     
     */
    public void setNetWorthAmt(NetWorthAmtType value) {
        this.netWorthAmt = value;
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
     * Gets the value of the numProp property.
     * 
     * @return
     *     possible object is
     *     {@link NumPropType }
     *     
     */
    public NumPropType getNumProp() {
        return numProp;
    }

    /**
     * Sets the value of the numProp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumPropType }
     *     
     */
    public void setNumProp(NumPropType value) {
        this.numProp = value;
    }

    /**
     * Gets the value of the ver10 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver10CType }
     *     
     */
    public Ver10CType getVer10() {
        return ver10;
    }

    /**
     * Sets the value of the ver10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver10CType }
     *     
     */
    public void setVer10(Ver10CType value) {
        this.ver10 = value;
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
     * Gets the value of the ver11 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver11CType }
     *     
     */
    public Ver11CType getVer11() {
        return ver11;
    }

    /**
     * Sets the value of the ver11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver11CType }
     *     
     */
    public void setVer11(Ver11CType value) {
        this.ver11 = value;
    }

    /**
     * Gets the value of the restructuredDt property.
     * 
     * @return
     *     possible object is
     *     {@link RestructuredDtType }
     *     
     */
    public RestructuredDtType getRestructuredDt() {
        return restructuredDt;
    }

    /**
     * Sets the value of the restructuredDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestructuredDtType }
     *     
     */
    public void setRestructuredDt(RestructuredDtType value) {
        this.restructuredDt = value;
    }

    /**
     * Gets the value of the totDebtPctV2 property.
     * 
     * @return
     *     possible object is
     *     {@link TotDebtPctType }
     *     
     */
    public TotDebtPctType getTotDebtPctV2() {
        return totDebtPctV2;
    }

    /**
     * Sets the value of the totDebtPctV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotDebtPctType }
     *     
     */
    public void setTotDebtPctV2(TotDebtPctType value) {
        this.totDebtPctV2 = value;
    }

    /**
     * Gets the value of the ver12 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver12CType }
     *     
     */
    public Ver12CType getVer12() {
        return ver12;
    }

    /**
     * Sets the value of the ver12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver12CType }
     *     
     */
    public void setVer12(Ver12CType value) {
        this.ver12 = value;
    }

    /**
     * Gets the value of the lnPmtToIncmPctV2 property.
     * 
     * @return
     *     possible object is
     *     {@link LnPmtToIncmPctType }
     *     
     */
    public LnPmtToIncmPctType getLnPmtToIncmPctV2() {
        return lnPmtToIncmPctV2;
    }

    /**
     * Sets the value of the lnPmtToIncmPctV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnPmtToIncmPctType }
     *     
     */
    public void setLnPmtToIncmPctV2(LnPmtToIncmPctType value) {
        this.lnPmtToIncmPctV2 = value;
    }

    /**
     * Gets the value of the ver13 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver13CType }
     *     
     */
    public Ver13CType getVer13() {
        return ver13;
    }

    /**
     * Sets the value of the ver13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver13CType }
     *     
     */
    public void setVer13(Ver13CType value) {
        this.ver13 = value;
    }

    /**
     * Gets the value of the crRatingInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link CrRatingInfoArrayAType }
     *     
     */
    public CrRatingInfoArrayAType getCrRatingInfoArray() {
        return crRatingInfoArray;
    }

    /**
     * Sets the value of the crRatingInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrRatingInfoArrayAType }
     *     
     */
    public void setCrRatingInfoArray(CrRatingInfoArrayAType value) {
        this.crRatingInfoArray = value;
    }

    /**
     * Gets the value of the ver14 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver14CType }
     *     
     */
    public Ver14CType getVer14() {
        return ver14;
    }

    /**
     * Sets the value of the ver14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver14CType }
     *     
     */
    public void setVer14(Ver14CType value) {
        this.ver14 = value;
    }

    /**
     * Gets the value of the curDebtSvcRatio property.
     * 
     * @return
     *     possible object is
     *     {@link CurDebtSvcRatioType }
     *     
     */
    public CurDebtSvcRatioType getCurDebtSvcRatio() {
        return curDebtSvcRatio;
    }

    /**
     * Sets the value of the curDebtSvcRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurDebtSvcRatioType }
     *     
     */
    public void setCurDebtSvcRatio(CurDebtSvcRatioType value) {
        this.curDebtSvcRatio = value;
    }

    /**
     * Gets the value of the ver15 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver15CType }
     *     
     */
    public Ver15CType getVer15() {
        return ver15;
    }

    /**
     * Sets the value of the ver15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver15CType }
     *     
     */
    public void setVer15(Ver15CType value) {
        this.ver15 = value;
    }

    /**
     * Gets the value of the origDebtSvcRatio property.
     * 
     * @return
     *     possible object is
     *     {@link OrigDebtSvcRatioType }
     *     
     */
    public OrigDebtSvcRatioType getOrigDebtSvcRatio() {
        return origDebtSvcRatio;
    }

    /**
     * Sets the value of the origDebtSvcRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigDebtSvcRatioType }
     *     
     */
    public void setOrigDebtSvcRatio(OrigDebtSvcRatioType value) {
        this.origDebtSvcRatio = value;
    }

    /**
     * Gets the value of the origBorwDebtIncmPct property.
     * 
     * @return
     *     possible object is
     *     {@link BorwDebtIncmPctType }
     *     
     */
    public BorwDebtIncmPctType getOrigBorwDebtIncmPct() {
        return origBorwDebtIncmPct;
    }

    /**
     * Sets the value of the origBorwDebtIncmPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwDebtIncmPctType }
     *     
     */
    public void setOrigBorwDebtIncmPct(BorwDebtIncmPctType value) {
        this.origBorwDebtIncmPct = value;
    }

    /**
     * Gets the value of the origCoBorwDebtIncmPct property.
     * 
     * @return
     *     possible object is
     *     {@link CoBorwDebtIncmPctType }
     *     
     */
    public CoBorwDebtIncmPctType getOrigCoBorwDebtIncmPct() {
        return origCoBorwDebtIncmPct;
    }

    /**
     * Sets the value of the origCoBorwDebtIncmPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoBorwDebtIncmPctType }
     *     
     */
    public void setOrigCoBorwDebtIncmPct(CoBorwDebtIncmPctType value) {
        this.origCoBorwDebtIncmPct = value;
    }

    /**
     * Gets the value of the ver16 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver16CType }
     *     
     */
    public Ver16CType getVer16() {
        return ver16;
    }

    /**
     * Sets the value of the ver16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver16CType }
     *     
     */
    public void setVer16(Ver16CType value) {
        this.ver16 = value;
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
