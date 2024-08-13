
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
 * <p>Java class for LnPmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnPmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="YrFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}YrFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="UsePmtSusp" type="{http://jackhenry.com/jxchange/TPG/2008}UsePmtSusp_Type" minOccurs="0"/&gt;
 *         &lt;element name="UnusedCrPerDiem" type="{http://jackhenry.com/jxchange/TPG/2008}UnusedCrPerDiem_Type" minOccurs="0"/&gt;
 *         &lt;element name="UnusedCrIntBase" type="{http://jackhenry.com/jxchange/TPG/2008}UnusedCrIntBase_Type" minOccurs="0"/&gt;
 *         &lt;element name="UnusedCrAccrRate" type="{http://jackhenry.com/jxchange/TPG/2008}UnusedCrAccrRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="UnusedCrAccrIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}UnusedCrAccrIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="UnpaidChgs" type="{http://jackhenry.com/jxchange/TPG/2008}UnpaidChgs_Type" minOccurs="0"/&gt;
 *         &lt;element name="UEInsurPerDiem" type="{http://jackhenry.com/jxchange/TPG/2008}UEInsurPerDiem_Type" minOccurs="0"/&gt;
 *         &lt;element name="UEInsurIdxRate" type="{http://jackhenry.com/jxchange/TPG/2008}UEInsurIdxRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="UEInsurAccrRate" type="{http://jackhenry.com/jxchange/TPG/2008}UEInsurAccrRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="UEInsurAccrBase" type="{http://jackhenry.com/jxchange/TPG/2008}UEInsurAccrBase_Type" minOccurs="0"/&gt;
 *         &lt;element name="SplitPmtAsBil" type="{http://jackhenry.com/jxchange/TPG/2008}SplitPmtAsBil_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdAccr" type="{http://jackhenry.com/jxchange/TPG/2008}SecdAccr_Type" minOccurs="0"/&gt;
 *         &lt;element name="RstrAutoPmt" type="{http://jackhenry.com/jxchange/TPG/2008}RstrAutoPmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReAmrtzPmt" type="{http://jackhenry.com/jxchange/TPG/2008}ReAmrtzPmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PrevPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenYTD" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenPYTD" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenPYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenLTD" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostShortPmts" type="{http://jackhenry.com/jxchange/TPG/2008}PostShortPmts_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostSeq5Code" type="{http://jackhenry.com/jxchange/TPG/2008}PostSeq5Code_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostSeq4Code" type="{http://jackhenry.com/jxchange/TPG/2008}PostSeq4Code_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostSeq3Code" type="{http://jackhenry.com/jxchange/TPG/2008}PostSeq3Code_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostSeq2Code" type="{http://jackhenry.com/jxchange/TPG/2008}PostSeq2Code_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostSeq1Code" type="{http://jackhenry.com/jxchange/TPG/2008}PostSeq1Code_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtTotAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtTotAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtSuspPostCode" type="{http://jackhenry.com/jxchange/TPG/2008}PmtSuspPostCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtReAmrtzPeriodCode" type="{http://jackhenry.com/jxchange/TPG/2008}PmtReAmrtzPeriodCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtReAmrtzPeriod" type="{http://jackhenry.com/jxchange/TPG/2008}PmtReAmrtzPeriod_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtReAmrtzDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtReAmrtzDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtReAmrtzCap" type="{http://jackhenry.com/jxchange/TPG/2008}PmtReAmrtzCap_Type" minOccurs="0"/&gt;
 *         &lt;element name="PctBalReAmrtz" type="{http://jackhenry.com/jxchange/TPG/2008}PctBalReAmrtz_Type" minOccurs="0"/&gt;
 *         &lt;element name="OvrLineFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}OvrLineFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OvrLineFeeAddNxtBil" type="{http://jackhenry.com/jxchange/TPG/2008}OvrLineFeeAddNxtBil_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NSFFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewPrinIntPmtEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}NewPrinIntPmtEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewPrinIntPmt" type="{http://jackhenry.com/jxchange/TPG/2008}NewPrinIntPmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NewPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NegAmrtzCapPct" type="{http://jackhenry.com/jxchange/TPG/2008}NegAmrtzCapPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinChkTolr" type="{http://jackhenry.com/jxchange/TPG/2008}MinChkTolr_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinChkAdva" type="{http://jackhenry.com/jxchange/TPG/2008}MinChkAdva_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IgnrLateChgMulti" type="{http://jackhenry.com/jxchange/TPG/2008}IgnrLateChgMulti_Type" minOccurs="0"/&gt;
 *         &lt;element name="DefrIntPaidTo" type="{http://jackhenry.com/jxchange/TPG/2008}DefrIntPaidTo_Type" minOccurs="0"/&gt;
 *         &lt;element name="DefrInt" type="{http://jackhenry.com/jxchange/TPG/2008}DefrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrLifeInsurPerDiem" type="{http://jackhenry.com/jxchange/TPG/2008}CrLifeInsurPerDiem_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrLifeInsurIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}CrLifeInsurIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrLifeInsurAccrRate" type="{http://jackhenry.com/jxchange/TPG/2008}CrLifeInsurAccrRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrLifeInsurAccrBase" type="{http://jackhenry.com/jxchange/TPG/2008}CrLifeInsurAccrBase_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilPrincAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilPrincAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilOtherChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilOtherChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilLeadDays" type="{http://jackhenry.com/jxchange/TPG/2008}BilLeadDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilLateChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilLateChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilIntAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilIntAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilEsrcwAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilEscrwAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BallPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BallPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AmrtzPmtSusp" type="{http://jackhenry.com/jxchange/TPG/2008}AmrtzPmtSusp_Type" minOccurs="0"/&gt;
 *         &lt;element name="AmrtzInt" type="{http://jackhenry.com/jxchange/TPG/2008}AmrtzInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AHInsurPerDiem" type="{http://jackhenry.com/jxchange/TPG/2008}AHInsurPerDiem_Type" minOccurs="0"/&gt;
 *         &lt;element name="AHInsurIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}AHInsurIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="AHInsurAccrRate" type="{http://jackhenry.com/jxchange/TPG/2008}AHInsurAccrRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="AHInsurAccrBase" type="{http://jackhenry.com/jxchange/TPG/2008}AHInsurAccrBase_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PostPmtPastDueCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostPmtPastDueCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="PostPmtPrePaidCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostPmtPrePaidCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="FundPct" type="{http://jackhenry.com/jxchange/TPG/2008}FundPct_Type" minOccurs="0"/&gt;
 *           &lt;element name="FundSeqId" type="{http://jackhenry.com/jxchange/TPG/2008}FundSeqId_Type" minOccurs="0"/&gt;
 *           &lt;element name="GradPmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}GradPmtCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="PostPmtPastDueDay" type="{http://jackhenry.com/jxchange/TPG/2008}PostPmtPastDueDay_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrePaidAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PrePaidAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrePaidPct" type="{http://jackhenry.com/jxchange/TPG/2008}PrePaidPct_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrePaidNum" type="{http://jackhenry.com/jxchange/TPG/2008}PrePaidNum_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrePaidAmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrePaidAmtCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="PostPrincCurtCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostPrincCurtCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrtcpFirstPmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpFirstPmtCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrtcpPmtSplitCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpPmtSplitCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrtcpSeqId" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpSeqId_Type" minOccurs="0"/&gt;
 *           &lt;element name="YrPmtIncrPct" type="{http://jackhenry.com/jxchange/TPG/2008}YrPmtIncrPct_Type" minOccurs="0"/&gt;
 *           &lt;element name="CrLifeCompCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrLifeCompCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="AHInsurCompCode" type="{http://jackhenry.com/jxchange/TPG/2008}AHInsurCompCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="UEInsurCompCode" type="{http://jackhenry.com/jxchange/TPG/2008}UEInsurCompCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrtcpPrincPmtPct" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpPrincPmtPct_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrtcpIntPmtPct" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpIntPmtPct_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="CrLifeInsurStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}CrLifeInsurStartDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="CrLifeInsurTerm" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *             &lt;element name="CrLifeInsurTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
 *             &lt;element name="AHInsurStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}AHInsurStartDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="AHInsurTerm" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *             &lt;element name="AHInsurTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
 *             &lt;element name="IntPmtPostCode" type="{http://jackhenry.com/jxchange/TPG/2008}IntPmtPostCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="PmtReAmrtzDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}PmtReAmrtzDayOfMonth_Type" minOccurs="0"/&gt;
 *             &lt;element name="PmtReAmrtzFreq" type="{http://jackhenry.com/jxchange/TPG/2008}PmtReAmrtzFreq_Type" minOccurs="0"/&gt;
 *             &lt;element name="PmtReAmrtzFreqCode" type="{http://jackhenry.com/jxchange/TPG/2008}PmtReAmrtzFreqCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="PmtGraceDays" type="{http://jackhenry.com/jxchange/TPG/2008}PmtGraceDays_Type" minOccurs="0"/&gt;
 *             &lt;element name="ChgYrFeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}ChgYrFeeCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="LnFeeArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="OthInsurArray" type="{http://jackhenry.com/jxchange/TPG/2008}OthInsurArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="LastIntPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastIntPmtDt_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="AnnDebtPmt" type="{http://jackhenry.com/jxchange/TPG/2008}AnnDebtPmt_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="NegAmrtzOrignBal" type="{http://jackhenry.com/jxchange/TPG/2008}NegAmrtzOrignBal_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="OthChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}OthChgAmt_Type" minOccurs="0"/&gt;
 *                     &lt;element name="BilCrLifeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilCrLifeAmt_Type" minOccurs="0"/&gt;
 *                     &lt;element name="BilAHAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilAHAmt_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="CrtBilDOM" type="{http://jackhenry.com/jxchange/TPG/2008}CrtBilDOM_Type" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;element name="PenIncmAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PenIncmAmt_Type" minOccurs="0"/&gt;
 *                         &lt;element name="NonPenIncmAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NonPenIncmAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnPmtInfo_CType", propOrder = {
    "yrFeeAmt",
    "usePmtSusp",
    "unusedCrPerDiem",
    "unusedCrIntBase",
    "unusedCrAccrRate",
    "unusedCrAccrIdxNum",
    "unpaidChgs",
    "ueInsurPerDiem",
    "ueInsurIdxRate",
    "ueInsurAccrRate",
    "ueInsurAccrBase",
    "splitPmtAsBil",
    "secdAccr",
    "rstrAutoPmt",
    "reAmrtzPmt",
    "prevPmtAmt",
    "prePmtPenYTD",
    "prePmtPenPYTD",
    "prePmtPenLTD",
    "postShortPmts",
    "postSeq5Code",
    "postSeq4Code",
    "postSeq3Code",
    "postSeq2Code",
    "postSeq1Code",
    "pmtTotAmt",
    "pmtSuspPostCode",
    "pmtReAmrtzPeriodCode",
    "pmtReAmrtzPeriod",
    "pmtReAmrtzDt",
    "pmtReAmrtzCap",
    "pctBalReAmrtz",
    "ovrLineFeeAmt",
    "ovrLineFeeAddNxtBil",
    "nsfFeeAmt",
    "newPrinIntPmtEffDt",
    "newPrinIntPmt",
    "newPmtAmt",
    "negAmrtzCapPct",
    "minChkTolr",
    "minChkAdva",
    "lastPmtAmt",
    "ignrLateChgMulti",
    "defrIntPaidTo",
    "defrInt",
    "crLifeInsurPerDiem",
    "crLifeInsurIdxNum",
    "crLifeInsurAccrRate",
    "crLifeInsurAccrBase",
    "bilPrincAmt",
    "bilOtherChgAmt",
    "bilLeadDays",
    "bilLateChgAmt",
    "bilIntAmt",
    "bilEsrcwAmt",
    "ballPmtAmt",
    "amrtzPmtSusp",
    "amrtzInt",
    "ahInsurPerDiem",
    "ahInsurIdxNum",
    "ahInsurAccrRate",
    "ahInsurAccrBase",
    "ver1",
    "postPmtPastDueCode",
    "postPmtPrePaidCode",
    "fundPct",
    "fundSeqId",
    "gradPmtCode",
    "postPmtPastDueDay",
    "prePaidAmt",
    "prePaidPct",
    "prePaidNum",
    "prePaidAmtCode",
    "postPrincCurtCode",
    "prtcpFirstPmtCode",
    "prtcpPmtSplitCode",
    "prtcpSeqId",
    "yrPmtIncrPct",
    "crLifeCompCode",
    "ahInsurCompCode",
    "ueInsurCompCode",
    "prtcpPrincPmtPct",
    "prtcpIntPmtPct",
    "ver2",
    "crLifeInsurStartDt",
    "crLifeInsurTerm",
    "crLifeInsurTermUnits",
    "ahInsurStartDt",
    "ahInsurTerm",
    "ahInsurTermUnits",
    "intPmtPostCode",
    "pmtReAmrtzDayOfMonth",
    "pmtReAmrtzFreq",
    "pmtReAmrtzFreqCode",
    "pmtGraceDays",
    "chgYrFeeCode",
    "lnFeeArray",
    "othInsurArray",
    "ver3",
    "lastIntPmtDt",
    "ver4",
    "annDebtPmt",
    "ver5",
    "negAmrtzOrignBal",
    "ver6",
    "othChgAmt",
    "bilCrLifeAmt",
    "bilAHAmt",
    "ver7",
    "crtBilDOM",
    "ver8",
    "penIncmAmt",
    "nonPenIncmAmt",
    "ver9",
    "any"
})
public class LnPmtInfoCType {

    @XmlElementRef(name = "YrFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<YrFeeAmtType> yrFeeAmt;
    @XmlElementRef(name = "UsePmtSusp", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UsePmtSuspType> usePmtSusp;
    @XmlElementRef(name = "UnusedCrPerDiem", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UnusedCrPerDiemType> unusedCrPerDiem;
    @XmlElementRef(name = "UnusedCrIntBase", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UnusedCrIntBaseType> unusedCrIntBase;
    @XmlElementRef(name = "UnusedCrAccrRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UnusedCrAccrRateType> unusedCrAccrRate;
    @XmlElementRef(name = "UnusedCrAccrIdxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UnusedCrAccrIdxNumType> unusedCrAccrIdxNum;
    @XmlElementRef(name = "UnpaidChgs", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UnpaidChgsType> unpaidChgs;
    @XmlElementRef(name = "UEInsurPerDiem", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UEInsurPerDiemType> ueInsurPerDiem;
    @XmlElementRef(name = "UEInsurIdxRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UEInsurIdxRateType> ueInsurIdxRate;
    @XmlElementRef(name = "UEInsurAccrRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UEInsurAccrRateType> ueInsurAccrRate;
    @XmlElementRef(name = "UEInsurAccrBase", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UEInsurAccrBaseType> ueInsurAccrBase;
    @XmlElementRef(name = "SplitPmtAsBil", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SplitPmtAsBilType> splitPmtAsBil;
    @XmlElementRef(name = "SecdAccr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SecdAccrType> secdAccr;
    @XmlElementRef(name = "RstrAutoPmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RstrAutoPmtType> rstrAutoPmt;
    @XmlElementRef(name = "ReAmrtzPmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ReAmrtzPmtType> reAmrtzPmt;
    @XmlElementRef(name = "PrevPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrevPmtAmtType> prevPmtAmt;
    @XmlElementRef(name = "PrePmtPenYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePmtPenYTDType> prePmtPenYTD;
    @XmlElementRef(name = "PrePmtPenPYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePmtPenPYTDType> prePmtPenPYTD;
    @XmlElementRef(name = "PrePmtPenLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePmtPenLTDType> prePmtPenLTD;
    @XmlElementRef(name = "PostShortPmts", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostShortPmtsType> postShortPmts;
    @XmlElementRef(name = "PostSeq5Code", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostSeq5CodeType> postSeq5Code;
    @XmlElementRef(name = "PostSeq4Code", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostSeq4CodeType> postSeq4Code;
    @XmlElementRef(name = "PostSeq3Code", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostSeq3CodeType> postSeq3Code;
    @XmlElementRef(name = "PostSeq2Code", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostSeq2CodeType> postSeq2Code;
    @XmlElementRef(name = "PostSeq1Code", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostSeq1CodeType> postSeq1Code;
    @XmlElementRef(name = "PmtTotAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtTotAmtType> pmtTotAmt;
    @XmlElementRef(name = "PmtSuspPostCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtSuspPostCodeType> pmtSuspPostCode;
    @XmlElementRef(name = "PmtReAmrtzPeriodCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtReAmrtzPeriodCodeType> pmtReAmrtzPeriodCode;
    @XmlElementRef(name = "PmtReAmrtzPeriod", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtReAmrtzPeriodType> pmtReAmrtzPeriod;
    @XmlElementRef(name = "PmtReAmrtzDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtReAmrtzDtType> pmtReAmrtzDt;
    @XmlElementRef(name = "PmtReAmrtzCap", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtReAmrtzCapType> pmtReAmrtzCap;
    @XmlElementRef(name = "PctBalReAmrtz", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PctBalReAmrtzType> pctBalReAmrtz;
    @XmlElementRef(name = "OvrLineFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OvrLineFeeAmtType> ovrLineFeeAmt;
    @XmlElementRef(name = "OvrLineFeeAddNxtBil", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OvrLineFeeAddNxtBilType> ovrLineFeeAddNxtBil;
    @XmlElementRef(name = "NSFFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NSFFeeAmtType> nsfFeeAmt;
    @XmlElementRef(name = "NewPrinIntPmtEffDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NewPrinIntPmtEffDtType> newPrinIntPmtEffDt;
    @XmlElementRef(name = "NewPrinIntPmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NewPrinIntPmtType> newPrinIntPmt;
    @XmlElementRef(name = "NewPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NewPmtAmtType> newPmtAmt;
    @XmlElementRef(name = "NegAmrtzCapPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NegAmrtzCapPctType> negAmrtzCapPct;
    @XmlElementRef(name = "MinChkTolr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MinChkTolrType> minChkTolr;
    @XmlElementRef(name = "MinChkAdva", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MinChkAdvaType> minChkAdva;
    @XmlElementRef(name = "LastPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastPmtAmtType> lastPmtAmt;
    @XmlElementRef(name = "IgnrLateChgMulti", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IgnrLateChgMultiType> ignrLateChgMulti;
    @XmlElementRef(name = "DefrIntPaidTo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DefrIntPaidToType> defrIntPaidTo;
    @XmlElementRef(name = "DefrInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DefrIntType> defrInt;
    @XmlElementRef(name = "CrLifeInsurPerDiem", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrLifeInsurPerDiemType> crLifeInsurPerDiem;
    @XmlElementRef(name = "CrLifeInsurIdxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrLifeInsurIdxNumType> crLifeInsurIdxNum;
    @XmlElementRef(name = "CrLifeInsurAccrRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrLifeInsurAccrRateType> crLifeInsurAccrRate;
    @XmlElementRef(name = "CrLifeInsurAccrBase", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrLifeInsurAccrBaseType> crLifeInsurAccrBase;
    @XmlElementRef(name = "BilPrincAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilPrincAmtType> bilPrincAmt;
    @XmlElementRef(name = "BilOtherChgAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilOtherChgAmtType> bilOtherChgAmt;
    @XmlElementRef(name = "BilLeadDays", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilLeadDaysType> bilLeadDays;
    @XmlElementRef(name = "BilLateChgAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilLateChgAmtType> bilLateChgAmt;
    @XmlElementRef(name = "BilIntAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilIntAmtType> bilIntAmt;
    @XmlElementRef(name = "BilEsrcwAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilEscrwAmtType> bilEsrcwAmt;
    @XmlElementRef(name = "BallPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BallPmtAmtType> ballPmtAmt;
    @XmlElementRef(name = "AmrtzPmtSusp", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AmrtzPmtSuspType> amrtzPmtSusp;
    @XmlElementRef(name = "AmrtzInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AmrtzIntType> amrtzInt;
    @XmlElementRef(name = "AHInsurPerDiem", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AHInsurPerDiemType> ahInsurPerDiem;
    @XmlElementRef(name = "AHInsurIdxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AHInsurIdxNumType> ahInsurIdxNum;
    @XmlElementRef(name = "AHInsurAccrRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AHInsurAccrRateType> ahInsurAccrRate;
    @XmlElementRef(name = "AHInsurAccrBase", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AHInsurAccrBaseType> ahInsurAccrBase;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "PostPmtPastDueCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostPmtPastDueCodeType> postPmtPastDueCode;
    @XmlElementRef(name = "PostPmtPrePaidCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostPmtPrePaidCodeType> postPmtPrePaidCode;
    @XmlElementRef(name = "FundPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FundPctType> fundPct;
    @XmlElementRef(name = "FundSeqId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FundSeqIdType> fundSeqId;
    @XmlElementRef(name = "GradPmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GradPmtCodeType> gradPmtCode;
    @XmlElementRef(name = "PostPmtPastDueDay", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostPmtPastDueDayType> postPmtPastDueDay;
    @XmlElementRef(name = "PrePaidAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePaidAmtType> prePaidAmt;
    @XmlElementRef(name = "PrePaidPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePaidPctType> prePaidPct;
    @XmlElementRef(name = "PrePaidNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePaidNumType> prePaidNum;
    @XmlElementRef(name = "PrePaidAmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePaidAmtCodeType> prePaidAmtCode;
    @XmlElementRef(name = "PostPrincCurtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostPrincCurtCodeType> postPrincCurtCode;
    @XmlElementRef(name = "PrtcpFirstPmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtcpFirstPmtCodeType> prtcpFirstPmtCode;
    @XmlElementRef(name = "PrtcpPmtSplitCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtcpPmtSplitCodeType> prtcpPmtSplitCode;
    @XmlElementRef(name = "PrtcpSeqId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtcpSeqIdType> prtcpSeqId;
    @XmlElementRef(name = "YrPmtIncrPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<YrPmtIncrPctType> yrPmtIncrPct;
    @XmlElementRef(name = "CrLifeCompCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrLifeCompCodeType> crLifeCompCode;
    @XmlElementRef(name = "AHInsurCompCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AHInsurCompCodeType> ahInsurCompCode;
    @XmlElementRef(name = "UEInsurCompCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UEInsurCompCodeType> ueInsurCompCode;
    @XmlElementRef(name = "PrtcpPrincPmtPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtcpPrincPmtPctType> prtcpPrincPmtPct;
    @XmlElementRef(name = "PrtcpIntPmtPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtcpIntPmtPctType> prtcpIntPmtPct;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "CrLifeInsurStartDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrLifeInsurStartDtType> crLifeInsurStartDt;
    @XmlElementRef(name = "CrLifeInsurTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermCntType> crLifeInsurTerm;
    @XmlElementRef(name = "CrLifeInsurTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermUnitsType> crLifeInsurTermUnits;
    @XmlElementRef(name = "AHInsurStartDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AHInsurStartDtType> ahInsurStartDt;
    @XmlElementRef(name = "AHInsurTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermCntType> ahInsurTerm;
    @XmlElementRef(name = "AHInsurTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermUnitsType> ahInsurTermUnits;
    @XmlElementRef(name = "IntPmtPostCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntPmtPostCodeType> intPmtPostCode;
    @XmlElementRef(name = "PmtReAmrtzDayOfMonth", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtReAmrtzDayOfMonthType> pmtReAmrtzDayOfMonth;
    @XmlElementRef(name = "PmtReAmrtzFreq", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtReAmrtzFreqType> pmtReAmrtzFreq;
    @XmlElementRef(name = "PmtReAmrtzFreqCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtReAmrtzFreqCodeType> pmtReAmrtzFreqCode;
    @XmlElementRef(name = "PmtGraceDays", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtGraceDaysType> pmtGraceDays;
    @XmlElementRef(name = "ChgYrFeeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChgYrFeeCodeType> chgYrFeeCode;
    @XmlElement(name = "LnFeeArray")
    protected LnFeeArrayAType lnFeeArray;
    @XmlElement(name = "OthInsurArray")
    protected OthInsurArrayAType othInsurArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElementRef(name = "LastIntPmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastIntPmtDtType> lastIntPmtDt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "AnnDebtPmt")
    protected AnnDebtPmtType annDebtPmt;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "NegAmrtzOrignBal")
    protected NegAmrtzOrignBalType negAmrtzOrignBal;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "OthChgAmt")
    protected OthChgAmtType othChgAmt;
    @XmlElement(name = "BilCrLifeAmt")
    protected BilCrLifeAmtType bilCrLifeAmt;
    @XmlElement(name = "BilAHAmt")
    protected BilAHAmtType bilAHAmt;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "CrtBilDOM")
    protected CrtBilDOMType crtBilDOM;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlElement(name = "PenIncmAmt")
    protected PenIncmAmtType penIncmAmt;
    @XmlElement(name = "NonPenIncmAmt")
    protected NonPenIncmAmtType nonPenIncmAmt;
    @XmlElement(name = "Ver_9")
    protected Ver9CType ver9;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the yrFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YrFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<YrFeeAmtType> getYrFeeAmt() {
        return yrFeeAmt;
    }

    /**
     * Sets the value of the yrFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YrFeeAmtType }{@code >}
     *     
     */
    public void setYrFeeAmt(JAXBElement<YrFeeAmtType> value) {
        this.yrFeeAmt = value;
    }

    /**
     * Gets the value of the usePmtSusp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UsePmtSuspType }{@code >}
     *     
     */
    public JAXBElement<UsePmtSuspType> getUsePmtSusp() {
        return usePmtSusp;
    }

    /**
     * Sets the value of the usePmtSusp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UsePmtSuspType }{@code >}
     *     
     */
    public void setUsePmtSusp(JAXBElement<UsePmtSuspType> value) {
        this.usePmtSusp = value;
    }

    /**
     * Gets the value of the unusedCrPerDiem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnusedCrPerDiemType }{@code >}
     *     
     */
    public JAXBElement<UnusedCrPerDiemType> getUnusedCrPerDiem() {
        return unusedCrPerDiem;
    }

    /**
     * Sets the value of the unusedCrPerDiem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnusedCrPerDiemType }{@code >}
     *     
     */
    public void setUnusedCrPerDiem(JAXBElement<UnusedCrPerDiemType> value) {
        this.unusedCrPerDiem = value;
    }

    /**
     * Gets the value of the unusedCrIntBase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnusedCrIntBaseType }{@code >}
     *     
     */
    public JAXBElement<UnusedCrIntBaseType> getUnusedCrIntBase() {
        return unusedCrIntBase;
    }

    /**
     * Sets the value of the unusedCrIntBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnusedCrIntBaseType }{@code >}
     *     
     */
    public void setUnusedCrIntBase(JAXBElement<UnusedCrIntBaseType> value) {
        this.unusedCrIntBase = value;
    }

    /**
     * Gets the value of the unusedCrAccrRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnusedCrAccrRateType }{@code >}
     *     
     */
    public JAXBElement<UnusedCrAccrRateType> getUnusedCrAccrRate() {
        return unusedCrAccrRate;
    }

    /**
     * Sets the value of the unusedCrAccrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnusedCrAccrRateType }{@code >}
     *     
     */
    public void setUnusedCrAccrRate(JAXBElement<UnusedCrAccrRateType> value) {
        this.unusedCrAccrRate = value;
    }

    /**
     * Gets the value of the unusedCrAccrIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnusedCrAccrIdxNumType }{@code >}
     *     
     */
    public JAXBElement<UnusedCrAccrIdxNumType> getUnusedCrAccrIdxNum() {
        return unusedCrAccrIdxNum;
    }

    /**
     * Sets the value of the unusedCrAccrIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnusedCrAccrIdxNumType }{@code >}
     *     
     */
    public void setUnusedCrAccrIdxNum(JAXBElement<UnusedCrAccrIdxNumType> value) {
        this.unusedCrAccrIdxNum = value;
    }

    /**
     * Gets the value of the unpaidChgs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnpaidChgsType }{@code >}
     *     
     */
    public JAXBElement<UnpaidChgsType> getUnpaidChgs() {
        return unpaidChgs;
    }

    /**
     * Sets the value of the unpaidChgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnpaidChgsType }{@code >}
     *     
     */
    public void setUnpaidChgs(JAXBElement<UnpaidChgsType> value) {
        this.unpaidChgs = value;
    }

    /**
     * Gets the value of the ueInsurPerDiem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UEInsurPerDiemType }{@code >}
     *     
     */
    public JAXBElement<UEInsurPerDiemType> getUEInsurPerDiem() {
        return ueInsurPerDiem;
    }

    /**
     * Sets the value of the ueInsurPerDiem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UEInsurPerDiemType }{@code >}
     *     
     */
    public void setUEInsurPerDiem(JAXBElement<UEInsurPerDiemType> value) {
        this.ueInsurPerDiem = value;
    }

    /**
     * Gets the value of the ueInsurIdxRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UEInsurIdxRateType }{@code >}
     *     
     */
    public JAXBElement<UEInsurIdxRateType> getUEInsurIdxRate() {
        return ueInsurIdxRate;
    }

    /**
     * Sets the value of the ueInsurIdxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UEInsurIdxRateType }{@code >}
     *     
     */
    public void setUEInsurIdxRate(JAXBElement<UEInsurIdxRateType> value) {
        this.ueInsurIdxRate = value;
    }

    /**
     * Gets the value of the ueInsurAccrRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UEInsurAccrRateType }{@code >}
     *     
     */
    public JAXBElement<UEInsurAccrRateType> getUEInsurAccrRate() {
        return ueInsurAccrRate;
    }

    /**
     * Sets the value of the ueInsurAccrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UEInsurAccrRateType }{@code >}
     *     
     */
    public void setUEInsurAccrRate(JAXBElement<UEInsurAccrRateType> value) {
        this.ueInsurAccrRate = value;
    }

    /**
     * Gets the value of the ueInsurAccrBase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UEInsurAccrBaseType }{@code >}
     *     
     */
    public JAXBElement<UEInsurAccrBaseType> getUEInsurAccrBase() {
        return ueInsurAccrBase;
    }

    /**
     * Sets the value of the ueInsurAccrBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UEInsurAccrBaseType }{@code >}
     *     
     */
    public void setUEInsurAccrBase(JAXBElement<UEInsurAccrBaseType> value) {
        this.ueInsurAccrBase = value;
    }

    /**
     * Gets the value of the splitPmtAsBil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SplitPmtAsBilType }{@code >}
     *     
     */
    public JAXBElement<SplitPmtAsBilType> getSplitPmtAsBil() {
        return splitPmtAsBil;
    }

    /**
     * Sets the value of the splitPmtAsBil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SplitPmtAsBilType }{@code >}
     *     
     */
    public void setSplitPmtAsBil(JAXBElement<SplitPmtAsBilType> value) {
        this.splitPmtAsBil = value;
    }

    /**
     * Gets the value of the secdAccr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecdAccrType }{@code >}
     *     
     */
    public JAXBElement<SecdAccrType> getSecdAccr() {
        return secdAccr;
    }

    /**
     * Sets the value of the secdAccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecdAccrType }{@code >}
     *     
     */
    public void setSecdAccr(JAXBElement<SecdAccrType> value) {
        this.secdAccr = value;
    }

    /**
     * Gets the value of the rstrAutoPmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RstrAutoPmtType }{@code >}
     *     
     */
    public JAXBElement<RstrAutoPmtType> getRstrAutoPmt() {
        return rstrAutoPmt;
    }

    /**
     * Sets the value of the rstrAutoPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RstrAutoPmtType }{@code >}
     *     
     */
    public void setRstrAutoPmt(JAXBElement<RstrAutoPmtType> value) {
        this.rstrAutoPmt = value;
    }

    /**
     * Gets the value of the reAmrtzPmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReAmrtzPmtType }{@code >}
     *     
     */
    public JAXBElement<ReAmrtzPmtType> getReAmrtzPmt() {
        return reAmrtzPmt;
    }

    /**
     * Sets the value of the reAmrtzPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReAmrtzPmtType }{@code >}
     *     
     */
    public void setReAmrtzPmt(JAXBElement<ReAmrtzPmtType> value) {
        this.reAmrtzPmt = value;
    }

    /**
     * Gets the value of the prevPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrevPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<PrevPmtAmtType> getPrevPmtAmt() {
        return prevPmtAmt;
    }

    /**
     * Sets the value of the prevPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrevPmtAmtType }{@code >}
     *     
     */
    public void setPrevPmtAmt(JAXBElement<PrevPmtAmtType> value) {
        this.prevPmtAmt = value;
    }

    /**
     * Gets the value of the prePmtPenYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenYTDType }{@code >}
     *     
     */
    public JAXBElement<PrePmtPenYTDType> getPrePmtPenYTD() {
        return prePmtPenYTD;
    }

    /**
     * Sets the value of the prePmtPenYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenYTDType }{@code >}
     *     
     */
    public void setPrePmtPenYTD(JAXBElement<PrePmtPenYTDType> value) {
        this.prePmtPenYTD = value;
    }

    /**
     * Gets the value of the prePmtPenPYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenPYTDType }{@code >}
     *     
     */
    public JAXBElement<PrePmtPenPYTDType> getPrePmtPenPYTD() {
        return prePmtPenPYTD;
    }

    /**
     * Sets the value of the prePmtPenPYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenPYTDType }{@code >}
     *     
     */
    public void setPrePmtPenPYTD(JAXBElement<PrePmtPenPYTDType> value) {
        this.prePmtPenPYTD = value;
    }

    /**
     * Gets the value of the prePmtPenLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenLTDType }{@code >}
     *     
     */
    public JAXBElement<PrePmtPenLTDType> getPrePmtPenLTD() {
        return prePmtPenLTD;
    }

    /**
     * Sets the value of the prePmtPenLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenLTDType }{@code >}
     *     
     */
    public void setPrePmtPenLTD(JAXBElement<PrePmtPenLTDType> value) {
        this.prePmtPenLTD = value;
    }

    /**
     * Gets the value of the postShortPmts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostShortPmtsType }{@code >}
     *     
     */
    public JAXBElement<PostShortPmtsType> getPostShortPmts() {
        return postShortPmts;
    }

    /**
     * Sets the value of the postShortPmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostShortPmtsType }{@code >}
     *     
     */
    public void setPostShortPmts(JAXBElement<PostShortPmtsType> value) {
        this.postShortPmts = value;
    }

    /**
     * Gets the value of the postSeq5Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostSeq5CodeType }{@code >}
     *     
     */
    public JAXBElement<PostSeq5CodeType> getPostSeq5Code() {
        return postSeq5Code;
    }

    /**
     * Sets the value of the postSeq5Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostSeq5CodeType }{@code >}
     *     
     */
    public void setPostSeq5Code(JAXBElement<PostSeq5CodeType> value) {
        this.postSeq5Code = value;
    }

    /**
     * Gets the value of the postSeq4Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostSeq4CodeType }{@code >}
     *     
     */
    public JAXBElement<PostSeq4CodeType> getPostSeq4Code() {
        return postSeq4Code;
    }

    /**
     * Sets the value of the postSeq4Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostSeq4CodeType }{@code >}
     *     
     */
    public void setPostSeq4Code(JAXBElement<PostSeq4CodeType> value) {
        this.postSeq4Code = value;
    }

    /**
     * Gets the value of the postSeq3Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostSeq3CodeType }{@code >}
     *     
     */
    public JAXBElement<PostSeq3CodeType> getPostSeq3Code() {
        return postSeq3Code;
    }

    /**
     * Sets the value of the postSeq3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostSeq3CodeType }{@code >}
     *     
     */
    public void setPostSeq3Code(JAXBElement<PostSeq3CodeType> value) {
        this.postSeq3Code = value;
    }

    /**
     * Gets the value of the postSeq2Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostSeq2CodeType }{@code >}
     *     
     */
    public JAXBElement<PostSeq2CodeType> getPostSeq2Code() {
        return postSeq2Code;
    }

    /**
     * Sets the value of the postSeq2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostSeq2CodeType }{@code >}
     *     
     */
    public void setPostSeq2Code(JAXBElement<PostSeq2CodeType> value) {
        this.postSeq2Code = value;
    }

    /**
     * Gets the value of the postSeq1Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostSeq1CodeType }{@code >}
     *     
     */
    public JAXBElement<PostSeq1CodeType> getPostSeq1Code() {
        return postSeq1Code;
    }

    /**
     * Sets the value of the postSeq1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostSeq1CodeType }{@code >}
     *     
     */
    public void setPostSeq1Code(JAXBElement<PostSeq1CodeType> value) {
        this.postSeq1Code = value;
    }

    /**
     * Gets the value of the pmtTotAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtTotAmtType }{@code >}
     *     
     */
    public JAXBElement<PmtTotAmtType> getPmtTotAmt() {
        return pmtTotAmt;
    }

    /**
     * Sets the value of the pmtTotAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtTotAmtType }{@code >}
     *     
     */
    public void setPmtTotAmt(JAXBElement<PmtTotAmtType> value) {
        this.pmtTotAmt = value;
    }

    /**
     * Gets the value of the pmtSuspPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtSuspPostCodeType }{@code >}
     *     
     */
    public JAXBElement<PmtSuspPostCodeType> getPmtSuspPostCode() {
        return pmtSuspPostCode;
    }

    /**
     * Sets the value of the pmtSuspPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtSuspPostCodeType }{@code >}
     *     
     */
    public void setPmtSuspPostCode(JAXBElement<PmtSuspPostCodeType> value) {
        this.pmtSuspPostCode = value;
    }

    /**
     * Gets the value of the pmtReAmrtzPeriodCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzPeriodCodeType }{@code >}
     *     
     */
    public JAXBElement<PmtReAmrtzPeriodCodeType> getPmtReAmrtzPeriodCode() {
        return pmtReAmrtzPeriodCode;
    }

    /**
     * Sets the value of the pmtReAmrtzPeriodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzPeriodCodeType }{@code >}
     *     
     */
    public void setPmtReAmrtzPeriodCode(JAXBElement<PmtReAmrtzPeriodCodeType> value) {
        this.pmtReAmrtzPeriodCode = value;
    }

    /**
     * Gets the value of the pmtReAmrtzPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzPeriodType }{@code >}
     *     
     */
    public JAXBElement<PmtReAmrtzPeriodType> getPmtReAmrtzPeriod() {
        return pmtReAmrtzPeriod;
    }

    /**
     * Sets the value of the pmtReAmrtzPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzPeriodType }{@code >}
     *     
     */
    public void setPmtReAmrtzPeriod(JAXBElement<PmtReAmrtzPeriodType> value) {
        this.pmtReAmrtzPeriod = value;
    }

    /**
     * Gets the value of the pmtReAmrtzDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzDtType }{@code >}
     *     
     */
    public JAXBElement<PmtReAmrtzDtType> getPmtReAmrtzDt() {
        return pmtReAmrtzDt;
    }

    /**
     * Sets the value of the pmtReAmrtzDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzDtType }{@code >}
     *     
     */
    public void setPmtReAmrtzDt(JAXBElement<PmtReAmrtzDtType> value) {
        this.pmtReAmrtzDt = value;
    }

    /**
     * Gets the value of the pmtReAmrtzCap property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzCapType }{@code >}
     *     
     */
    public JAXBElement<PmtReAmrtzCapType> getPmtReAmrtzCap() {
        return pmtReAmrtzCap;
    }

    /**
     * Sets the value of the pmtReAmrtzCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzCapType }{@code >}
     *     
     */
    public void setPmtReAmrtzCap(JAXBElement<PmtReAmrtzCapType> value) {
        this.pmtReAmrtzCap = value;
    }

    /**
     * Gets the value of the pctBalReAmrtz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PctBalReAmrtzType }{@code >}
     *     
     */
    public JAXBElement<PctBalReAmrtzType> getPctBalReAmrtz() {
        return pctBalReAmrtz;
    }

    /**
     * Sets the value of the pctBalReAmrtz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PctBalReAmrtzType }{@code >}
     *     
     */
    public void setPctBalReAmrtz(JAXBElement<PctBalReAmrtzType> value) {
        this.pctBalReAmrtz = value;
    }

    /**
     * Gets the value of the ovrLineFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OvrLineFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<OvrLineFeeAmtType> getOvrLineFeeAmt() {
        return ovrLineFeeAmt;
    }

    /**
     * Sets the value of the ovrLineFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OvrLineFeeAmtType }{@code >}
     *     
     */
    public void setOvrLineFeeAmt(JAXBElement<OvrLineFeeAmtType> value) {
        this.ovrLineFeeAmt = value;
    }

    /**
     * Gets the value of the ovrLineFeeAddNxtBil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OvrLineFeeAddNxtBilType }{@code >}
     *     
     */
    public JAXBElement<OvrLineFeeAddNxtBilType> getOvrLineFeeAddNxtBil() {
        return ovrLineFeeAddNxtBil;
    }

    /**
     * Sets the value of the ovrLineFeeAddNxtBil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OvrLineFeeAddNxtBilType }{@code >}
     *     
     */
    public void setOvrLineFeeAddNxtBil(JAXBElement<OvrLineFeeAddNxtBilType> value) {
        this.ovrLineFeeAddNxtBil = value;
    }

    /**
     * Gets the value of the nsfFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NSFFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<NSFFeeAmtType> getNSFFeeAmt() {
        return nsfFeeAmt;
    }

    /**
     * Sets the value of the nsfFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NSFFeeAmtType }{@code >}
     *     
     */
    public void setNSFFeeAmt(JAXBElement<NSFFeeAmtType> value) {
        this.nsfFeeAmt = value;
    }

    /**
     * Gets the value of the newPrinIntPmtEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NewPrinIntPmtEffDtType }{@code >}
     *     
     */
    public JAXBElement<NewPrinIntPmtEffDtType> getNewPrinIntPmtEffDt() {
        return newPrinIntPmtEffDt;
    }

    /**
     * Sets the value of the newPrinIntPmtEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NewPrinIntPmtEffDtType }{@code >}
     *     
     */
    public void setNewPrinIntPmtEffDt(JAXBElement<NewPrinIntPmtEffDtType> value) {
        this.newPrinIntPmtEffDt = value;
    }

    /**
     * Gets the value of the newPrinIntPmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NewPrinIntPmtType }{@code >}
     *     
     */
    public JAXBElement<NewPrinIntPmtType> getNewPrinIntPmt() {
        return newPrinIntPmt;
    }

    /**
     * Sets the value of the newPrinIntPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NewPrinIntPmtType }{@code >}
     *     
     */
    public void setNewPrinIntPmt(JAXBElement<NewPrinIntPmtType> value) {
        this.newPrinIntPmt = value;
    }

    /**
     * Gets the value of the newPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NewPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<NewPmtAmtType> getNewPmtAmt() {
        return newPmtAmt;
    }

    /**
     * Sets the value of the newPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NewPmtAmtType }{@code >}
     *     
     */
    public void setNewPmtAmt(JAXBElement<NewPmtAmtType> value) {
        this.newPmtAmt = value;
    }

    /**
     * Gets the value of the negAmrtzCapPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NegAmrtzCapPctType }{@code >}
     *     
     */
    public JAXBElement<NegAmrtzCapPctType> getNegAmrtzCapPct() {
        return negAmrtzCapPct;
    }

    /**
     * Sets the value of the negAmrtzCapPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NegAmrtzCapPctType }{@code >}
     *     
     */
    public void setNegAmrtzCapPct(JAXBElement<NegAmrtzCapPctType> value) {
        this.negAmrtzCapPct = value;
    }

    /**
     * Gets the value of the minChkTolr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MinChkTolrType }{@code >}
     *     
     */
    public JAXBElement<MinChkTolrType> getMinChkTolr() {
        return minChkTolr;
    }

    /**
     * Sets the value of the minChkTolr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MinChkTolrType }{@code >}
     *     
     */
    public void setMinChkTolr(JAXBElement<MinChkTolrType> value) {
        this.minChkTolr = value;
    }

    /**
     * Gets the value of the minChkAdva property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MinChkAdvaType }{@code >}
     *     
     */
    public JAXBElement<MinChkAdvaType> getMinChkAdva() {
        return minChkAdva;
    }

    /**
     * Sets the value of the minChkAdva property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MinChkAdvaType }{@code >}
     *     
     */
    public void setMinChkAdva(JAXBElement<MinChkAdvaType> value) {
        this.minChkAdva = value;
    }

    /**
     * Gets the value of the lastPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<LastPmtAmtType> getLastPmtAmt() {
        return lastPmtAmt;
    }

    /**
     * Sets the value of the lastPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastPmtAmtType }{@code >}
     *     
     */
    public void setLastPmtAmt(JAXBElement<LastPmtAmtType> value) {
        this.lastPmtAmt = value;
    }

    /**
     * Gets the value of the ignrLateChgMulti property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IgnrLateChgMultiType }{@code >}
     *     
     */
    public JAXBElement<IgnrLateChgMultiType> getIgnrLateChgMulti() {
        return ignrLateChgMulti;
    }

    /**
     * Sets the value of the ignrLateChgMulti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IgnrLateChgMultiType }{@code >}
     *     
     */
    public void setIgnrLateChgMulti(JAXBElement<IgnrLateChgMultiType> value) {
        this.ignrLateChgMulti = value;
    }

    /**
     * Gets the value of the defrIntPaidTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DefrIntPaidToType }{@code >}
     *     
     */
    public JAXBElement<DefrIntPaidToType> getDefrIntPaidTo() {
        return defrIntPaidTo;
    }

    /**
     * Sets the value of the defrIntPaidTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DefrIntPaidToType }{@code >}
     *     
     */
    public void setDefrIntPaidTo(JAXBElement<DefrIntPaidToType> value) {
        this.defrIntPaidTo = value;
    }

    /**
     * Gets the value of the defrInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DefrIntType }{@code >}
     *     
     */
    public JAXBElement<DefrIntType> getDefrInt() {
        return defrInt;
    }

    /**
     * Sets the value of the defrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DefrIntType }{@code >}
     *     
     */
    public void setDefrInt(JAXBElement<DefrIntType> value) {
        this.defrInt = value;
    }

    /**
     * Gets the value of the crLifeInsurPerDiem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrLifeInsurPerDiemType }{@code >}
     *     
     */
    public JAXBElement<CrLifeInsurPerDiemType> getCrLifeInsurPerDiem() {
        return crLifeInsurPerDiem;
    }

    /**
     * Sets the value of the crLifeInsurPerDiem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrLifeInsurPerDiemType }{@code >}
     *     
     */
    public void setCrLifeInsurPerDiem(JAXBElement<CrLifeInsurPerDiemType> value) {
        this.crLifeInsurPerDiem = value;
    }

    /**
     * Gets the value of the crLifeInsurIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrLifeInsurIdxNumType }{@code >}
     *     
     */
    public JAXBElement<CrLifeInsurIdxNumType> getCrLifeInsurIdxNum() {
        return crLifeInsurIdxNum;
    }

    /**
     * Sets the value of the crLifeInsurIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrLifeInsurIdxNumType }{@code >}
     *     
     */
    public void setCrLifeInsurIdxNum(JAXBElement<CrLifeInsurIdxNumType> value) {
        this.crLifeInsurIdxNum = value;
    }

    /**
     * Gets the value of the crLifeInsurAccrRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrLifeInsurAccrRateType }{@code >}
     *     
     */
    public JAXBElement<CrLifeInsurAccrRateType> getCrLifeInsurAccrRate() {
        return crLifeInsurAccrRate;
    }

    /**
     * Sets the value of the crLifeInsurAccrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrLifeInsurAccrRateType }{@code >}
     *     
     */
    public void setCrLifeInsurAccrRate(JAXBElement<CrLifeInsurAccrRateType> value) {
        this.crLifeInsurAccrRate = value;
    }

    /**
     * Gets the value of the crLifeInsurAccrBase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrLifeInsurAccrBaseType }{@code >}
     *     
     */
    public JAXBElement<CrLifeInsurAccrBaseType> getCrLifeInsurAccrBase() {
        return crLifeInsurAccrBase;
    }

    /**
     * Sets the value of the crLifeInsurAccrBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrLifeInsurAccrBaseType }{@code >}
     *     
     */
    public void setCrLifeInsurAccrBase(JAXBElement<CrLifeInsurAccrBaseType> value) {
        this.crLifeInsurAccrBase = value;
    }

    /**
     * Gets the value of the bilPrincAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilPrincAmtType }{@code >}
     *     
     */
    public JAXBElement<BilPrincAmtType> getBilPrincAmt() {
        return bilPrincAmt;
    }

    /**
     * Sets the value of the bilPrincAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilPrincAmtType }{@code >}
     *     
     */
    public void setBilPrincAmt(JAXBElement<BilPrincAmtType> value) {
        this.bilPrincAmt = value;
    }

    /**
     * Gets the value of the bilOtherChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilOtherChgAmtType }{@code >}
     *     
     */
    public JAXBElement<BilOtherChgAmtType> getBilOtherChgAmt() {
        return bilOtherChgAmt;
    }

    /**
     * Sets the value of the bilOtherChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilOtherChgAmtType }{@code >}
     *     
     */
    public void setBilOtherChgAmt(JAXBElement<BilOtherChgAmtType> value) {
        this.bilOtherChgAmt = value;
    }

    /**
     * Gets the value of the bilLeadDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilLeadDaysType }{@code >}
     *     
     */
    public JAXBElement<BilLeadDaysType> getBilLeadDays() {
        return bilLeadDays;
    }

    /**
     * Sets the value of the bilLeadDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilLeadDaysType }{@code >}
     *     
     */
    public void setBilLeadDays(JAXBElement<BilLeadDaysType> value) {
        this.bilLeadDays = value;
    }

    /**
     * Gets the value of the bilLateChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilLateChgAmtType }{@code >}
     *     
     */
    public JAXBElement<BilLateChgAmtType> getBilLateChgAmt() {
        return bilLateChgAmt;
    }

    /**
     * Sets the value of the bilLateChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilLateChgAmtType }{@code >}
     *     
     */
    public void setBilLateChgAmt(JAXBElement<BilLateChgAmtType> value) {
        this.bilLateChgAmt = value;
    }

    /**
     * Gets the value of the bilIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilIntAmtType }{@code >}
     *     
     */
    public JAXBElement<BilIntAmtType> getBilIntAmt() {
        return bilIntAmt;
    }

    /**
     * Sets the value of the bilIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilIntAmtType }{@code >}
     *     
     */
    public void setBilIntAmt(JAXBElement<BilIntAmtType> value) {
        this.bilIntAmt = value;
    }

    /**
     * Gets the value of the bilEsrcwAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilEscrwAmtType }{@code >}
     *     
     */
    public JAXBElement<BilEscrwAmtType> getBilEsrcwAmt() {
        return bilEsrcwAmt;
    }

    /**
     * Sets the value of the bilEsrcwAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilEscrwAmtType }{@code >}
     *     
     */
    public void setBilEsrcwAmt(JAXBElement<BilEscrwAmtType> value) {
        this.bilEsrcwAmt = value;
    }

    /**
     * Gets the value of the ballPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BallPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<BallPmtAmtType> getBallPmtAmt() {
        return ballPmtAmt;
    }

    /**
     * Sets the value of the ballPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BallPmtAmtType }{@code >}
     *     
     */
    public void setBallPmtAmt(JAXBElement<BallPmtAmtType> value) {
        this.ballPmtAmt = value;
    }

    /**
     * Gets the value of the amrtzPmtSusp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmrtzPmtSuspType }{@code >}
     *     
     */
    public JAXBElement<AmrtzPmtSuspType> getAmrtzPmtSusp() {
        return amrtzPmtSusp;
    }

    /**
     * Sets the value of the amrtzPmtSusp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmrtzPmtSuspType }{@code >}
     *     
     */
    public void setAmrtzPmtSusp(JAXBElement<AmrtzPmtSuspType> value) {
        this.amrtzPmtSusp = value;
    }

    /**
     * Gets the value of the amrtzInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmrtzIntType }{@code >}
     *     
     */
    public JAXBElement<AmrtzIntType> getAmrtzInt() {
        return amrtzInt;
    }

    /**
     * Sets the value of the amrtzInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmrtzIntType }{@code >}
     *     
     */
    public void setAmrtzInt(JAXBElement<AmrtzIntType> value) {
        this.amrtzInt = value;
    }

    /**
     * Gets the value of the ahInsurPerDiem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AHInsurPerDiemType }{@code >}
     *     
     */
    public JAXBElement<AHInsurPerDiemType> getAHInsurPerDiem() {
        return ahInsurPerDiem;
    }

    /**
     * Sets the value of the ahInsurPerDiem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AHInsurPerDiemType }{@code >}
     *     
     */
    public void setAHInsurPerDiem(JAXBElement<AHInsurPerDiemType> value) {
        this.ahInsurPerDiem = value;
    }

    /**
     * Gets the value of the ahInsurIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AHInsurIdxNumType }{@code >}
     *     
     */
    public JAXBElement<AHInsurIdxNumType> getAHInsurIdxNum() {
        return ahInsurIdxNum;
    }

    /**
     * Sets the value of the ahInsurIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AHInsurIdxNumType }{@code >}
     *     
     */
    public void setAHInsurIdxNum(JAXBElement<AHInsurIdxNumType> value) {
        this.ahInsurIdxNum = value;
    }

    /**
     * Gets the value of the ahInsurAccrRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AHInsurAccrRateType }{@code >}
     *     
     */
    public JAXBElement<AHInsurAccrRateType> getAHInsurAccrRate() {
        return ahInsurAccrRate;
    }

    /**
     * Sets the value of the ahInsurAccrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AHInsurAccrRateType }{@code >}
     *     
     */
    public void setAHInsurAccrRate(JAXBElement<AHInsurAccrRateType> value) {
        this.ahInsurAccrRate = value;
    }

    /**
     * Gets the value of the ahInsurAccrBase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AHInsurAccrBaseType }{@code >}
     *     
     */
    public JAXBElement<AHInsurAccrBaseType> getAHInsurAccrBase() {
        return ahInsurAccrBase;
    }

    /**
     * Sets the value of the ahInsurAccrBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AHInsurAccrBaseType }{@code >}
     *     
     */
    public void setAHInsurAccrBase(JAXBElement<AHInsurAccrBaseType> value) {
        this.ahInsurAccrBase = value;
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
     * Gets the value of the postPmtPastDueCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostPmtPastDueCodeType }{@code >}
     *     
     */
    public JAXBElement<PostPmtPastDueCodeType> getPostPmtPastDueCode() {
        return postPmtPastDueCode;
    }

    /**
     * Sets the value of the postPmtPastDueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostPmtPastDueCodeType }{@code >}
     *     
     */
    public void setPostPmtPastDueCode(JAXBElement<PostPmtPastDueCodeType> value) {
        this.postPmtPastDueCode = value;
    }

    /**
     * Gets the value of the postPmtPrePaidCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostPmtPrePaidCodeType }{@code >}
     *     
     */
    public JAXBElement<PostPmtPrePaidCodeType> getPostPmtPrePaidCode() {
        return postPmtPrePaidCode;
    }

    /**
     * Sets the value of the postPmtPrePaidCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostPmtPrePaidCodeType }{@code >}
     *     
     */
    public void setPostPmtPrePaidCode(JAXBElement<PostPmtPrePaidCodeType> value) {
        this.postPmtPrePaidCode = value;
    }

    /**
     * Gets the value of the fundPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FundPctType }{@code >}
     *     
     */
    public JAXBElement<FundPctType> getFundPct() {
        return fundPct;
    }

    /**
     * Sets the value of the fundPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FundPctType }{@code >}
     *     
     */
    public void setFundPct(JAXBElement<FundPctType> value) {
        this.fundPct = value;
    }

    /**
     * Gets the value of the fundSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FundSeqIdType }{@code >}
     *     
     */
    public JAXBElement<FundSeqIdType> getFundSeqId() {
        return fundSeqId;
    }

    /**
     * Sets the value of the fundSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FundSeqIdType }{@code >}
     *     
     */
    public void setFundSeqId(JAXBElement<FundSeqIdType> value) {
        this.fundSeqId = value;
    }

    /**
     * Gets the value of the gradPmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GradPmtCodeType }{@code >}
     *     
     */
    public JAXBElement<GradPmtCodeType> getGradPmtCode() {
        return gradPmtCode;
    }

    /**
     * Sets the value of the gradPmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GradPmtCodeType }{@code >}
     *     
     */
    public void setGradPmtCode(JAXBElement<GradPmtCodeType> value) {
        this.gradPmtCode = value;
    }

    /**
     * Gets the value of the postPmtPastDueDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostPmtPastDueDayType }{@code >}
     *     
     */
    public JAXBElement<PostPmtPastDueDayType> getPostPmtPastDueDay() {
        return postPmtPastDueDay;
    }

    /**
     * Sets the value of the postPmtPastDueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostPmtPastDueDayType }{@code >}
     *     
     */
    public void setPostPmtPastDueDay(JAXBElement<PostPmtPastDueDayType> value) {
        this.postPmtPastDueDay = value;
    }

    /**
     * Gets the value of the prePaidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePaidAmtType }{@code >}
     *     
     */
    public JAXBElement<PrePaidAmtType> getPrePaidAmt() {
        return prePaidAmt;
    }

    /**
     * Sets the value of the prePaidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePaidAmtType }{@code >}
     *     
     */
    public void setPrePaidAmt(JAXBElement<PrePaidAmtType> value) {
        this.prePaidAmt = value;
    }

    /**
     * Gets the value of the prePaidPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePaidPctType }{@code >}
     *     
     */
    public JAXBElement<PrePaidPctType> getPrePaidPct() {
        return prePaidPct;
    }

    /**
     * Sets the value of the prePaidPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePaidPctType }{@code >}
     *     
     */
    public void setPrePaidPct(JAXBElement<PrePaidPctType> value) {
        this.prePaidPct = value;
    }

    /**
     * Gets the value of the prePaidNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePaidNumType }{@code >}
     *     
     */
    public JAXBElement<PrePaidNumType> getPrePaidNum() {
        return prePaidNum;
    }

    /**
     * Sets the value of the prePaidNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePaidNumType }{@code >}
     *     
     */
    public void setPrePaidNum(JAXBElement<PrePaidNumType> value) {
        this.prePaidNum = value;
    }

    /**
     * Gets the value of the prePaidAmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePaidAmtCodeType }{@code >}
     *     
     */
    public JAXBElement<PrePaidAmtCodeType> getPrePaidAmtCode() {
        return prePaidAmtCode;
    }

    /**
     * Sets the value of the prePaidAmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePaidAmtCodeType }{@code >}
     *     
     */
    public void setPrePaidAmtCode(JAXBElement<PrePaidAmtCodeType> value) {
        this.prePaidAmtCode = value;
    }

    /**
     * Gets the value of the postPrincCurtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostPrincCurtCodeType }{@code >}
     *     
     */
    public JAXBElement<PostPrincCurtCodeType> getPostPrincCurtCode() {
        return postPrincCurtCode;
    }

    /**
     * Sets the value of the postPrincCurtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostPrincCurtCodeType }{@code >}
     *     
     */
    public void setPostPrincCurtCode(JAXBElement<PostPrincCurtCodeType> value) {
        this.postPrincCurtCode = value;
    }

    /**
     * Gets the value of the prtcpFirstPmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtcpFirstPmtCodeType }{@code >}
     *     
     */
    public JAXBElement<PrtcpFirstPmtCodeType> getPrtcpFirstPmtCode() {
        return prtcpFirstPmtCode;
    }

    /**
     * Sets the value of the prtcpFirstPmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtcpFirstPmtCodeType }{@code >}
     *     
     */
    public void setPrtcpFirstPmtCode(JAXBElement<PrtcpFirstPmtCodeType> value) {
        this.prtcpFirstPmtCode = value;
    }

    /**
     * Gets the value of the prtcpPmtSplitCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtcpPmtSplitCodeType }{@code >}
     *     
     */
    public JAXBElement<PrtcpPmtSplitCodeType> getPrtcpPmtSplitCode() {
        return prtcpPmtSplitCode;
    }

    /**
     * Sets the value of the prtcpPmtSplitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtcpPmtSplitCodeType }{@code >}
     *     
     */
    public void setPrtcpPmtSplitCode(JAXBElement<PrtcpPmtSplitCodeType> value) {
        this.prtcpPmtSplitCode = value;
    }

    /**
     * Gets the value of the prtcpSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtcpSeqIdType }{@code >}
     *     
     */
    public JAXBElement<PrtcpSeqIdType> getPrtcpSeqId() {
        return prtcpSeqId;
    }

    /**
     * Sets the value of the prtcpSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtcpSeqIdType }{@code >}
     *     
     */
    public void setPrtcpSeqId(JAXBElement<PrtcpSeqIdType> value) {
        this.prtcpSeqId = value;
    }

    /**
     * Gets the value of the yrPmtIncrPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YrPmtIncrPctType }{@code >}
     *     
     */
    public JAXBElement<YrPmtIncrPctType> getYrPmtIncrPct() {
        return yrPmtIncrPct;
    }

    /**
     * Sets the value of the yrPmtIncrPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YrPmtIncrPctType }{@code >}
     *     
     */
    public void setYrPmtIncrPct(JAXBElement<YrPmtIncrPctType> value) {
        this.yrPmtIncrPct = value;
    }

    /**
     * Gets the value of the crLifeCompCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrLifeCompCodeType }{@code >}
     *     
     */
    public JAXBElement<CrLifeCompCodeType> getCrLifeCompCode() {
        return crLifeCompCode;
    }

    /**
     * Sets the value of the crLifeCompCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrLifeCompCodeType }{@code >}
     *     
     */
    public void setCrLifeCompCode(JAXBElement<CrLifeCompCodeType> value) {
        this.crLifeCompCode = value;
    }

    /**
     * Gets the value of the ahInsurCompCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AHInsurCompCodeType }{@code >}
     *     
     */
    public JAXBElement<AHInsurCompCodeType> getAHInsurCompCode() {
        return ahInsurCompCode;
    }

    /**
     * Sets the value of the ahInsurCompCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AHInsurCompCodeType }{@code >}
     *     
     */
    public void setAHInsurCompCode(JAXBElement<AHInsurCompCodeType> value) {
        this.ahInsurCompCode = value;
    }

    /**
     * Gets the value of the ueInsurCompCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UEInsurCompCodeType }{@code >}
     *     
     */
    public JAXBElement<UEInsurCompCodeType> getUEInsurCompCode() {
        return ueInsurCompCode;
    }

    /**
     * Sets the value of the ueInsurCompCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UEInsurCompCodeType }{@code >}
     *     
     */
    public void setUEInsurCompCode(JAXBElement<UEInsurCompCodeType> value) {
        this.ueInsurCompCode = value;
    }

    /**
     * Gets the value of the prtcpPrincPmtPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtcpPrincPmtPctType }{@code >}
     *     
     */
    public JAXBElement<PrtcpPrincPmtPctType> getPrtcpPrincPmtPct() {
        return prtcpPrincPmtPct;
    }

    /**
     * Sets the value of the prtcpPrincPmtPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtcpPrincPmtPctType }{@code >}
     *     
     */
    public void setPrtcpPrincPmtPct(JAXBElement<PrtcpPrincPmtPctType> value) {
        this.prtcpPrincPmtPct = value;
    }

    /**
     * Gets the value of the prtcpIntPmtPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtcpIntPmtPctType }{@code >}
     *     
     */
    public JAXBElement<PrtcpIntPmtPctType> getPrtcpIntPmtPct() {
        return prtcpIntPmtPct;
    }

    /**
     * Sets the value of the prtcpIntPmtPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtcpIntPmtPctType }{@code >}
     *     
     */
    public void setPrtcpIntPmtPct(JAXBElement<PrtcpIntPmtPctType> value) {
        this.prtcpIntPmtPct = value;
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
     * Gets the value of the crLifeInsurStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrLifeInsurStartDtType }{@code >}
     *     
     */
    public JAXBElement<CrLifeInsurStartDtType> getCrLifeInsurStartDt() {
        return crLifeInsurStartDt;
    }

    /**
     * Sets the value of the crLifeInsurStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrLifeInsurStartDtType }{@code >}
     *     
     */
    public void setCrLifeInsurStartDt(JAXBElement<CrLifeInsurStartDtType> value) {
        this.crLifeInsurStartDt = value;
    }

    /**
     * Gets the value of the crLifeInsurTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public JAXBElement<TermCntType> getCrLifeInsurTerm() {
        return crLifeInsurTerm;
    }

    /**
     * Sets the value of the crLifeInsurTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public void setCrLifeInsurTerm(JAXBElement<TermCntType> value) {
        this.crLifeInsurTerm = value;
    }

    /**
     * Gets the value of the crLifeInsurTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public JAXBElement<TermUnitsType> getCrLifeInsurTermUnits() {
        return crLifeInsurTermUnits;
    }

    /**
     * Sets the value of the crLifeInsurTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public void setCrLifeInsurTermUnits(JAXBElement<TermUnitsType> value) {
        this.crLifeInsurTermUnits = value;
    }

    /**
     * Gets the value of the ahInsurStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AHInsurStartDtType }{@code >}
     *     
     */
    public JAXBElement<AHInsurStartDtType> getAHInsurStartDt() {
        return ahInsurStartDt;
    }

    /**
     * Sets the value of the ahInsurStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AHInsurStartDtType }{@code >}
     *     
     */
    public void setAHInsurStartDt(JAXBElement<AHInsurStartDtType> value) {
        this.ahInsurStartDt = value;
    }

    /**
     * Gets the value of the ahInsurTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public JAXBElement<TermCntType> getAHInsurTerm() {
        return ahInsurTerm;
    }

    /**
     * Sets the value of the ahInsurTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public void setAHInsurTerm(JAXBElement<TermCntType> value) {
        this.ahInsurTerm = value;
    }

    /**
     * Gets the value of the ahInsurTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public JAXBElement<TermUnitsType> getAHInsurTermUnits() {
        return ahInsurTermUnits;
    }

    /**
     * Sets the value of the ahInsurTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public void setAHInsurTermUnits(JAXBElement<TermUnitsType> value) {
        this.ahInsurTermUnits = value;
    }

    /**
     * Gets the value of the intPmtPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntPmtPostCodeType }{@code >}
     *     
     */
    public JAXBElement<IntPmtPostCodeType> getIntPmtPostCode() {
        return intPmtPostCode;
    }

    /**
     * Sets the value of the intPmtPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntPmtPostCodeType }{@code >}
     *     
     */
    public void setIntPmtPostCode(JAXBElement<IntPmtPostCodeType> value) {
        this.intPmtPostCode = value;
    }

    /**
     * Gets the value of the pmtReAmrtzDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzDayOfMonthType }{@code >}
     *     
     */
    public JAXBElement<PmtReAmrtzDayOfMonthType> getPmtReAmrtzDayOfMonth() {
        return pmtReAmrtzDayOfMonth;
    }

    /**
     * Sets the value of the pmtReAmrtzDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzDayOfMonthType }{@code >}
     *     
     */
    public void setPmtReAmrtzDayOfMonth(JAXBElement<PmtReAmrtzDayOfMonthType> value) {
        this.pmtReAmrtzDayOfMonth = value;
    }

    /**
     * Gets the value of the pmtReAmrtzFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzFreqType }{@code >}
     *     
     */
    public JAXBElement<PmtReAmrtzFreqType> getPmtReAmrtzFreq() {
        return pmtReAmrtzFreq;
    }

    /**
     * Sets the value of the pmtReAmrtzFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzFreqType }{@code >}
     *     
     */
    public void setPmtReAmrtzFreq(JAXBElement<PmtReAmrtzFreqType> value) {
        this.pmtReAmrtzFreq = value;
    }

    /**
     * Gets the value of the pmtReAmrtzFreqCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzFreqCodeType }{@code >}
     *     
     */
    public JAXBElement<PmtReAmrtzFreqCodeType> getPmtReAmrtzFreqCode() {
        return pmtReAmrtzFreqCode;
    }

    /**
     * Sets the value of the pmtReAmrtzFreqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtReAmrtzFreqCodeType }{@code >}
     *     
     */
    public void setPmtReAmrtzFreqCode(JAXBElement<PmtReAmrtzFreqCodeType> value) {
        this.pmtReAmrtzFreqCode = value;
    }

    /**
     * Gets the value of the pmtGraceDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtGraceDaysType }{@code >}
     *     
     */
    public JAXBElement<PmtGraceDaysType> getPmtGraceDays() {
        return pmtGraceDays;
    }

    /**
     * Sets the value of the pmtGraceDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtGraceDaysType }{@code >}
     *     
     */
    public void setPmtGraceDays(JAXBElement<PmtGraceDaysType> value) {
        this.pmtGraceDays = value;
    }

    /**
     * Gets the value of the chgYrFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChgYrFeeCodeType }{@code >}
     *     
     */
    public JAXBElement<ChgYrFeeCodeType> getChgYrFeeCode() {
        return chgYrFeeCode;
    }

    /**
     * Sets the value of the chgYrFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChgYrFeeCodeType }{@code >}
     *     
     */
    public void setChgYrFeeCode(JAXBElement<ChgYrFeeCodeType> value) {
        this.chgYrFeeCode = value;
    }

    /**
     * Gets the value of the lnFeeArray property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeArrayAType }
     *     
     */
    public LnFeeArrayAType getLnFeeArray() {
        return lnFeeArray;
    }

    /**
     * Sets the value of the lnFeeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeArrayAType }
     *     
     */
    public void setLnFeeArray(LnFeeArrayAType value) {
        this.lnFeeArray = value;
    }

    /**
     * Gets the value of the othInsurArray property.
     * 
     * @return
     *     possible object is
     *     {@link OthInsurArrayAType }
     *     
     */
    public OthInsurArrayAType getOthInsurArray() {
        return othInsurArray;
    }

    /**
     * Sets the value of the othInsurArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthInsurArrayAType }
     *     
     */
    public void setOthInsurArray(OthInsurArrayAType value) {
        this.othInsurArray = value;
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
     * Gets the value of the lastIntPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastIntPmtDtType }{@code >}
     *     
     */
    public JAXBElement<LastIntPmtDtType> getLastIntPmtDt() {
        return lastIntPmtDt;
    }

    /**
     * Sets the value of the lastIntPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastIntPmtDtType }{@code >}
     *     
     */
    public void setLastIntPmtDt(JAXBElement<LastIntPmtDtType> value) {
        this.lastIntPmtDt = value;
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
     * Gets the value of the annDebtPmt property.
     * 
     * @return
     *     possible object is
     *     {@link AnnDebtPmtType }
     *     
     */
    public AnnDebtPmtType getAnnDebtPmt() {
        return annDebtPmt;
    }

    /**
     * Sets the value of the annDebtPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnDebtPmtType }
     *     
     */
    public void setAnnDebtPmt(AnnDebtPmtType value) {
        this.annDebtPmt = value;
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
     * Gets the value of the negAmrtzOrignBal property.
     * 
     * @return
     *     possible object is
     *     {@link NegAmrtzOrignBalType }
     *     
     */
    public NegAmrtzOrignBalType getNegAmrtzOrignBal() {
        return negAmrtzOrignBal;
    }

    /**
     * Sets the value of the negAmrtzOrignBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegAmrtzOrignBalType }
     *     
     */
    public void setNegAmrtzOrignBal(NegAmrtzOrignBalType value) {
        this.negAmrtzOrignBal = value;
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
     * Gets the value of the othChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OthChgAmtType }
     *     
     */
    public OthChgAmtType getOthChgAmt() {
        return othChgAmt;
    }

    /**
     * Sets the value of the othChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthChgAmtType }
     *     
     */
    public void setOthChgAmt(OthChgAmtType value) {
        this.othChgAmt = value;
    }

    /**
     * Gets the value of the bilCrLifeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilCrLifeAmtType }
     *     
     */
    public BilCrLifeAmtType getBilCrLifeAmt() {
        return bilCrLifeAmt;
    }

    /**
     * Sets the value of the bilCrLifeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilCrLifeAmtType }
     *     
     */
    public void setBilCrLifeAmt(BilCrLifeAmtType value) {
        this.bilCrLifeAmt = value;
    }

    /**
     * Gets the value of the bilAHAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilAHAmtType }
     *     
     */
    public BilAHAmtType getBilAHAmt() {
        return bilAHAmt;
    }

    /**
     * Sets the value of the bilAHAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilAHAmtType }
     *     
     */
    public void setBilAHAmt(BilAHAmtType value) {
        this.bilAHAmt = value;
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
     * Gets the value of the crtBilDOM property.
     * 
     * @return
     *     possible object is
     *     {@link CrtBilDOMType }
     *     
     */
    public CrtBilDOMType getCrtBilDOM() {
        return crtBilDOM;
    }

    /**
     * Sets the value of the crtBilDOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrtBilDOMType }
     *     
     */
    public void setCrtBilDOM(CrtBilDOMType value) {
        this.crtBilDOM = value;
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
     * Gets the value of the penIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PenIncmAmtType }
     *     
     */
    public PenIncmAmtType getPenIncmAmt() {
        return penIncmAmt;
    }

    /**
     * Sets the value of the penIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenIncmAmtType }
     *     
     */
    public void setPenIncmAmt(PenIncmAmtType value) {
        this.penIncmAmt = value;
    }

    /**
     * Gets the value of the nonPenIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NonPenIncmAmtType }
     *     
     */
    public NonPenIncmAmtType getNonPenIncmAmt() {
        return nonPenIncmAmt;
    }

    /**
     * Sets the value of the nonPenIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonPenIncmAmtType }
     *     
     */
    public void setNonPenIncmAmt(NonPenIncmAmtType value) {
        this.nonPenIncmAmt = value;
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
