
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
 * <p>Java class for LOCRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LOCAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCode" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCMainLOCId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCMainLOCId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStat" type="{http://jackhenry.com/jxchange/TPG/2008}LOCStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCBrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCPrtcpCode" type="{http://jackhenry.com/jxchange/TPG/2008}LOCPrtcpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCDDAProtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCDDAProtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCFrzAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCFrzAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCTaxRefId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCTaxRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCOrigTerm" type="{http://jackhenry.com/jxchange/TPG/2008}LOCOrigTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCOrigTermUnit" type="{http://jackhenry.com/jxchange/TPG/2008}LOCOrigTermUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCOrigAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCOrigAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LOCInfo_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCPrtCnsldtStmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCPrtCnsldtStmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStmtDay" type="{http://jackhenry.com/jxchange/TPG/2008}StmtDay_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStmtFreq" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStmtFreqCode" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFreqCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCSemiDay1" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay1_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCSemiDay2" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay2_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCallRptCode" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCollatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCRiskCode" type="{http://jackhenry.com/jxchange/TPG/2008}LOCRiskCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLastStmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastStmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCTotAdvaAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCTotAdvaAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAvlBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCommBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCommBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCRegAvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCRegAvlBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCClsCode" type="{http://jackhenry.com/jxchange/TPG/2008}LOCClsCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCHighAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCHighAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLowAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLowAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAvg" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAvg_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCHighAmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCHighAmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLowAmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLowAmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCHighAmtLTD" type="{http://jackhenry.com/jxchange/TPG/2008}LOCHighAmtLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLowAmtLTD" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLowAmtLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAvgLTD" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAvgLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCBankNetTot" type="{http://jackhenry.com/jxchange/TPG/2008}LOCBankNetTot_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="LOCRedRvwFreq" type="{http://jackhenry.com/jxchange/TPG/2008}LOCRedRvwFreq_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCRedRvwFreqUnits" type="{http://jackhenry.com/jxchange/TPG/2008}LOCRedRvwFreqUnits_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCNxtRedDt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCNxtRedDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCRedPct" type="{http://jackhenry.com/jxchange/TPG/2008}LOCRedPct_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCSchedRedAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCSchedRedAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCFeeArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="LOCFeeAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCFeeAcctId_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCFeeAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}LOCFeeAcctType_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="LOCGdnceType" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceType_Type" minOccurs="0"/&gt;
 *             &lt;element name="LOCGdnceBorwAck" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceBorwAck_Type" minOccurs="0"/&gt;
 *             &lt;element name="LOCGdnceRedType" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceRedType_Type" minOccurs="0"/&gt;
 *             &lt;element name="LOCLastRedDt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLastRedDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="LOCQtrAmtInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}LOCQtrAmtInfoArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="ConstInProcArray" type="{http://jackhenry.com/jxchange/TPG/2008}ConstInProcArray_AType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="LOCAvlCalcType" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAvlCalcType_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="LtrOfCrLmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLmt_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="MaxTrancheCrtCnt" type="{http://jackhenry.com/jxchange/TPG/2008}RecCnt_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="MLLIncCombStmt" type="{http://jackhenry.com/jxchange/TPG/2008}IncCombStmt_Type" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LOCRec_CType", propOrder = {
    "locAmt",
    "locExpDt",
    "locCode",
    "locMainLOCId",
    "locStat",
    "locBrCode",
    "locOffCode",
    "locPrtcpCode",
    "locddaProtAmt",
    "locFrzAmt",
    "locTaxRefId",
    "locOrigTerm",
    "locOrigTermUnit",
    "locOrigAmt",
    "locInfo",
    "locPrtCnsldtStmt",
    "locStmtDay",
    "locStmtFreq",
    "locStmtFreqCode",
    "locSemiDay1",
    "locSemiDay2",
    "locCallRptCode",
    "locCollatCode",
    "locRiskCode",
    "locLastStmtDt",
    "locLastMainDt",
    "locCurBal",
    "locTotAdvaAmt",
    "locAvlBal",
    "locCommBal",
    "locRegAvlBal",
    "locClsCode",
    "locHighAmt",
    "locLowAmt",
    "locAvg",
    "locHighAmtDt",
    "locLowAmtDt",
    "locHighAmtLTD",
    "locLowAmtLTD",
    "locAvgLTD",
    "locBankNetTot",
    "ver1",
    "locRedRvwFreq",
    "locRedRvwFreqUnits",
    "locNxtRedDt",
    "locRedPct",
    "locSchedRedAmt",
    "locFeeArray",
    "locFeeAcctId",
    "locFeeAcctType",
    "ver2",
    "locGdnceType",
    "locGdnceBorwAck",
    "locGdnceRedType",
    "locLastRedDt",
    "userDefInfoArray",
    "locQtrAmtInfoArray",
    "ver3",
    "constInProcArray",
    "ver4",
    "locAvlCalcType",
    "ver5",
    "ltrOfCrLmt",
    "ver6",
    "maxTrancheCrtCnt",
    "ver7",
    "mllIncCombStmt",
    "ver8",
    "any"
})
public class LOCRecCType {

    @XmlElementRef(name = "LOCAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCAmtType> locAmt;
    @XmlElementRef(name = "LOCExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCExpDtType> locExpDt;
    @XmlElementRef(name = "LOCCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCCodeType> locCode;
    @XmlElementRef(name = "LOCMainLOCId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCMainLOCIdType> locMainLOCId;
    @XmlElementRef(name = "LOCStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCStatType> locStat;
    @XmlElementRef(name = "LOCBrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> locBrCode;
    @XmlElementRef(name = "LOCOffCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OffCodeType> locOffCode;
    @XmlElementRef(name = "LOCPrtcpCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCPrtcpCodeType> locPrtcpCode;
    @XmlElementRef(name = "LOCDDAProtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCDDAProtAmtType> locddaProtAmt;
    @XmlElementRef(name = "LOCFrzAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCFrzAmtType> locFrzAmt;
    @XmlElementRef(name = "LOCTaxRefId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCTaxRefIdType> locTaxRefId;
    @XmlElementRef(name = "LOCOrigTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCOrigTermType> locOrigTerm;
    @XmlElementRef(name = "LOCOrigTermUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCOrigTermUnitType> locOrigTermUnit;
    @XmlElementRef(name = "LOCOrigAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCOrigAmtType> locOrigAmt;
    @XmlElementRef(name = "LOCInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCInfoType> locInfo;
    @XmlElementRef(name = "LOCPrtCnsldtStmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCPrtCnsldtStmtType> locPrtCnsldtStmt;
    @XmlElementRef(name = "LOCStmtDay", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtDayType> locStmtDay;
    @XmlElementRef(name = "LOCStmtFreq", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtFreqType> locStmtFreq;
    @XmlElementRef(name = "LOCStmtFreqCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtFreqCodeType> locStmtFreqCode;
    @XmlElementRef(name = "LOCSemiDay1", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SemiDay1Type> locSemiDay1;
    @XmlElementRef(name = "LOCSemiDay2", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SemiDay2Type> locSemiDay2;
    @XmlElementRef(name = "LOCCallRptCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CallRptCodeType> locCallRptCode;
    @XmlElementRef(name = "LOCCollatCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatCodeType> locCollatCode;
    @XmlElementRef(name = "LOCRiskCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCRiskCodeType> locRiskCode;
    @XmlElementRef(name = "LOCLastStmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastStmtDtType> locLastStmtDt;
    @XmlElementRef(name = "LOCLastMainDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastMainDtType> locLastMainDt;
    @XmlElementRef(name = "LOCCurBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCCurBalType> locCurBal;
    @XmlElementRef(name = "LOCTotAdvaAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCTotAdvaAmtType> locTotAdvaAmt;
    @XmlElementRef(name = "LOCAvlBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCAvlBalType> locAvlBal;
    @XmlElementRef(name = "LOCCommBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCCommBalType> locCommBal;
    @XmlElementRef(name = "LOCRegAvlBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCRegAvlBalType> locRegAvlBal;
    @XmlElementRef(name = "LOCClsCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCClsCodeType> locClsCode;
    @XmlElementRef(name = "LOCHighAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCHighAmtType> locHighAmt;
    @XmlElementRef(name = "LOCLowAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCLowAmtType> locLowAmt;
    @XmlElementRef(name = "LOCAvg", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCAvgType> locAvg;
    @XmlElementRef(name = "LOCHighAmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCHighAmtDtType> locHighAmtDt;
    @XmlElementRef(name = "LOCLowAmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCLowAmtDtType> locLowAmtDt;
    @XmlElementRef(name = "LOCHighAmtLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCHighAmtLTDType> locHighAmtLTD;
    @XmlElementRef(name = "LOCLowAmtLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCLowAmtLTDType> locLowAmtLTD;
    @XmlElementRef(name = "LOCAvgLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCAvgLTDType> locAvgLTD;
    @XmlElementRef(name = "LOCBankNetTot", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCBankNetTotType> locBankNetTot;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "LOCRedRvwFreq", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCRedRvwFreqType> locRedRvwFreq;
    @XmlElementRef(name = "LOCRedRvwFreqUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCRedRvwFreqUnitsType> locRedRvwFreqUnits;
    @XmlElementRef(name = "LOCNxtRedDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCNxtRedDtType> locNxtRedDt;
    @XmlElementRef(name = "LOCRedPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCRedPctType> locRedPct;
    @XmlElementRef(name = "LOCSchedRedAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCSchedRedAmtType> locSchedRedAmt;
    @XmlElement(name = "LOCFeeArray")
    protected LnFeeArrayAType locFeeArray;
    @XmlElementRef(name = "LOCFeeAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCFeeAcctIdType> locFeeAcctId;
    @XmlElementRef(name = "LOCFeeAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCFeeAcctTypeType> locFeeAcctType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "LOCGdnceType")
    protected LOCGdnceTypeType locGdnceType;
    @XmlElement(name = "LOCGdnceBorwAck")
    protected LOCGdnceBorwAckType locGdnceBorwAck;
    @XmlElement(name = "LOCGdnceRedType")
    protected LOCGdnceRedTypeType locGdnceRedType;
    @XmlElement(name = "LOCLastRedDt")
    protected LOCLastRedDtType locLastRedDt;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "LOCQtrAmtInfoArray")
    protected LOCQtrAmtInfoArrayAType locQtrAmtInfoArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "ConstInProcArray")
    protected ConstInProcArrayAType constInProcArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "LOCAvlCalcType")
    protected LOCAvlCalcTypeType locAvlCalcType;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "LtrOfCrLmt")
    protected LOCLmtType ltrOfCrLmt;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "MaxTrancheCrtCnt")
    protected RecCntType maxTrancheCrtCnt;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "MLLIncCombStmt")
    protected IncCombStmtType mllIncCombStmt;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the locAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCAmtType }{@code >}
     *     
     */
    public JAXBElement<LOCAmtType> getLOCAmt() {
        return locAmt;
    }

    /**
     * Sets the value of the locAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCAmtType }{@code >}
     *     
     */
    public void setLOCAmt(JAXBElement<LOCAmtType> value) {
        this.locAmt = value;
    }

    /**
     * Gets the value of the locExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCExpDtType }{@code >}
     *     
     */
    public JAXBElement<LOCExpDtType> getLOCExpDt() {
        return locExpDt;
    }

    /**
     * Sets the value of the locExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCExpDtType }{@code >}
     *     
     */
    public void setLOCExpDt(JAXBElement<LOCExpDtType> value) {
        this.locExpDt = value;
    }

    /**
     * Gets the value of the locCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCCodeType }{@code >}
     *     
     */
    public JAXBElement<LOCCodeType> getLOCCode() {
        return locCode;
    }

    /**
     * Sets the value of the locCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCCodeType }{@code >}
     *     
     */
    public void setLOCCode(JAXBElement<LOCCodeType> value) {
        this.locCode = value;
    }

    /**
     * Gets the value of the locMainLOCId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCMainLOCIdType }{@code >}
     *     
     */
    public JAXBElement<LOCMainLOCIdType> getLOCMainLOCId() {
        return locMainLOCId;
    }

    /**
     * Sets the value of the locMainLOCId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCMainLOCIdType }{@code >}
     *     
     */
    public void setLOCMainLOCId(JAXBElement<LOCMainLOCIdType> value) {
        this.locMainLOCId = value;
    }

    /**
     * Gets the value of the locStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCStatType }{@code >}
     *     
     */
    public JAXBElement<LOCStatType> getLOCStat() {
        return locStat;
    }

    /**
     * Sets the value of the locStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCStatType }{@code >}
     *     
     */
    public void setLOCStat(JAXBElement<LOCStatType> value) {
        this.locStat = value;
    }

    /**
     * Gets the value of the locBrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public JAXBElement<BrCodeType> getLOCBrCode() {
        return locBrCode;
    }

    /**
     * Sets the value of the locBrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public void setLOCBrCode(JAXBElement<BrCodeType> value) {
        this.locBrCode = value;
    }

    /**
     * Gets the value of the locOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public JAXBElement<OffCodeType> getLOCOffCode() {
        return locOffCode;
    }

    /**
     * Sets the value of the locOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public void setLOCOffCode(JAXBElement<OffCodeType> value) {
        this.locOffCode = value;
    }

    /**
     * Gets the value of the locPrtcpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCPrtcpCodeType }{@code >}
     *     
     */
    public JAXBElement<LOCPrtcpCodeType> getLOCPrtcpCode() {
        return locPrtcpCode;
    }

    /**
     * Sets the value of the locPrtcpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCPrtcpCodeType }{@code >}
     *     
     */
    public void setLOCPrtcpCode(JAXBElement<LOCPrtcpCodeType> value) {
        this.locPrtcpCode = value;
    }

    /**
     * Gets the value of the locddaProtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCDDAProtAmtType }{@code >}
     *     
     */
    public JAXBElement<LOCDDAProtAmtType> getLOCDDAProtAmt() {
        return locddaProtAmt;
    }

    /**
     * Sets the value of the locddaProtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCDDAProtAmtType }{@code >}
     *     
     */
    public void setLOCDDAProtAmt(JAXBElement<LOCDDAProtAmtType> value) {
        this.locddaProtAmt = value;
    }

    /**
     * Gets the value of the locFrzAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCFrzAmtType }{@code >}
     *     
     */
    public JAXBElement<LOCFrzAmtType> getLOCFrzAmt() {
        return locFrzAmt;
    }

    /**
     * Sets the value of the locFrzAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCFrzAmtType }{@code >}
     *     
     */
    public void setLOCFrzAmt(JAXBElement<LOCFrzAmtType> value) {
        this.locFrzAmt = value;
    }

    /**
     * Gets the value of the locTaxRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCTaxRefIdType }{@code >}
     *     
     */
    public JAXBElement<LOCTaxRefIdType> getLOCTaxRefId() {
        return locTaxRefId;
    }

    /**
     * Sets the value of the locTaxRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCTaxRefIdType }{@code >}
     *     
     */
    public void setLOCTaxRefId(JAXBElement<LOCTaxRefIdType> value) {
        this.locTaxRefId = value;
    }

    /**
     * Gets the value of the locOrigTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCOrigTermType }{@code >}
     *     
     */
    public JAXBElement<LOCOrigTermType> getLOCOrigTerm() {
        return locOrigTerm;
    }

    /**
     * Sets the value of the locOrigTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCOrigTermType }{@code >}
     *     
     */
    public void setLOCOrigTerm(JAXBElement<LOCOrigTermType> value) {
        this.locOrigTerm = value;
    }

    /**
     * Gets the value of the locOrigTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCOrigTermUnitType }{@code >}
     *     
     */
    public JAXBElement<LOCOrigTermUnitType> getLOCOrigTermUnit() {
        return locOrigTermUnit;
    }

    /**
     * Sets the value of the locOrigTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCOrigTermUnitType }{@code >}
     *     
     */
    public void setLOCOrigTermUnit(JAXBElement<LOCOrigTermUnitType> value) {
        this.locOrigTermUnit = value;
    }

    /**
     * Gets the value of the locOrigAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCOrigAmtType }{@code >}
     *     
     */
    public JAXBElement<LOCOrigAmtType> getLOCOrigAmt() {
        return locOrigAmt;
    }

    /**
     * Sets the value of the locOrigAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCOrigAmtType }{@code >}
     *     
     */
    public void setLOCOrigAmt(JAXBElement<LOCOrigAmtType> value) {
        this.locOrigAmt = value;
    }

    /**
     * Gets the value of the locInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCInfoType }{@code >}
     *     
     */
    public JAXBElement<LOCInfoType> getLOCInfo() {
        return locInfo;
    }

    /**
     * Sets the value of the locInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCInfoType }{@code >}
     *     
     */
    public void setLOCInfo(JAXBElement<LOCInfoType> value) {
        this.locInfo = value;
    }

    /**
     * Gets the value of the locPrtCnsldtStmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCPrtCnsldtStmtType }{@code >}
     *     
     */
    public JAXBElement<LOCPrtCnsldtStmtType> getLOCPrtCnsldtStmt() {
        return locPrtCnsldtStmt;
    }

    /**
     * Sets the value of the locPrtCnsldtStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCPrtCnsldtStmtType }{@code >}
     *     
     */
    public void setLOCPrtCnsldtStmt(JAXBElement<LOCPrtCnsldtStmtType> value) {
        this.locPrtCnsldtStmt = value;
    }

    /**
     * Gets the value of the locStmtDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtDayType }{@code >}
     *     
     */
    public JAXBElement<StmtDayType> getLOCStmtDay() {
        return locStmtDay;
    }

    /**
     * Sets the value of the locStmtDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtDayType }{@code >}
     *     
     */
    public void setLOCStmtDay(JAXBElement<StmtDayType> value) {
        this.locStmtDay = value;
    }

    /**
     * Gets the value of the locStmtFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtFreqType }{@code >}
     *     
     */
    public JAXBElement<StmtFreqType> getLOCStmtFreq() {
        return locStmtFreq;
    }

    /**
     * Sets the value of the locStmtFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtFreqType }{@code >}
     *     
     */
    public void setLOCStmtFreq(JAXBElement<StmtFreqType> value) {
        this.locStmtFreq = value;
    }

    /**
     * Gets the value of the locStmtFreqCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtFreqCodeType }{@code >}
     *     
     */
    public JAXBElement<StmtFreqCodeType> getLOCStmtFreqCode() {
        return locStmtFreqCode;
    }

    /**
     * Sets the value of the locStmtFreqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtFreqCodeType }{@code >}
     *     
     */
    public void setLOCStmtFreqCode(JAXBElement<StmtFreqCodeType> value) {
        this.locStmtFreqCode = value;
    }

    /**
     * Gets the value of the locSemiDay1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}
     *     
     */
    public JAXBElement<SemiDay1Type> getLOCSemiDay1() {
        return locSemiDay1;
    }

    /**
     * Sets the value of the locSemiDay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}
     *     
     */
    public void setLOCSemiDay1(JAXBElement<SemiDay1Type> value) {
        this.locSemiDay1 = value;
    }

    /**
     * Gets the value of the locSemiDay2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}
     *     
     */
    public JAXBElement<SemiDay2Type> getLOCSemiDay2() {
        return locSemiDay2;
    }

    /**
     * Sets the value of the locSemiDay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}
     *     
     */
    public void setLOCSemiDay2(JAXBElement<SemiDay2Type> value) {
        this.locSemiDay2 = value;
    }

    /**
     * Gets the value of the locCallRptCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallRptCodeType }{@code >}
     *     
     */
    public JAXBElement<CallRptCodeType> getLOCCallRptCode() {
        return locCallRptCode;
    }

    /**
     * Sets the value of the locCallRptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallRptCodeType }{@code >}
     *     
     */
    public void setLOCCallRptCode(JAXBElement<CallRptCodeType> value) {
        this.locCallRptCode = value;
    }

    /**
     * Gets the value of the locCollatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatCodeType }{@code >}
     *     
     */
    public JAXBElement<CollatCodeType> getLOCCollatCode() {
        return locCollatCode;
    }

    /**
     * Sets the value of the locCollatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatCodeType }{@code >}
     *     
     */
    public void setLOCCollatCode(JAXBElement<CollatCodeType> value) {
        this.locCollatCode = value;
    }

    /**
     * Gets the value of the locRiskCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCRiskCodeType }{@code >}
     *     
     */
    public JAXBElement<LOCRiskCodeType> getLOCRiskCode() {
        return locRiskCode;
    }

    /**
     * Sets the value of the locRiskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCRiskCodeType }{@code >}
     *     
     */
    public void setLOCRiskCode(JAXBElement<LOCRiskCodeType> value) {
        this.locRiskCode = value;
    }

    /**
     * Gets the value of the locLastStmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastStmtDtType }{@code >}
     *     
     */
    public JAXBElement<LastStmtDtType> getLOCLastStmtDt() {
        return locLastStmtDt;
    }

    /**
     * Sets the value of the locLastStmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastStmtDtType }{@code >}
     *     
     */
    public void setLOCLastStmtDt(JAXBElement<LastStmtDtType> value) {
        this.locLastStmtDt = value;
    }

    /**
     * Gets the value of the locLastMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastMainDtType }{@code >}
     *     
     */
    public JAXBElement<LastMainDtType> getLOCLastMainDt() {
        return locLastMainDt;
    }

    /**
     * Sets the value of the locLastMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastMainDtType }{@code >}
     *     
     */
    public void setLOCLastMainDt(JAXBElement<LastMainDtType> value) {
        this.locLastMainDt = value;
    }

    /**
     * Gets the value of the locCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCCurBalType }{@code >}
     *     
     */
    public JAXBElement<LOCCurBalType> getLOCCurBal() {
        return locCurBal;
    }

    /**
     * Sets the value of the locCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCCurBalType }{@code >}
     *     
     */
    public void setLOCCurBal(JAXBElement<LOCCurBalType> value) {
        this.locCurBal = value;
    }

    /**
     * Gets the value of the locTotAdvaAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCTotAdvaAmtType }{@code >}
     *     
     */
    public JAXBElement<LOCTotAdvaAmtType> getLOCTotAdvaAmt() {
        return locTotAdvaAmt;
    }

    /**
     * Sets the value of the locTotAdvaAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCTotAdvaAmtType }{@code >}
     *     
     */
    public void setLOCTotAdvaAmt(JAXBElement<LOCTotAdvaAmtType> value) {
        this.locTotAdvaAmt = value;
    }

    /**
     * Gets the value of the locAvlBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCAvlBalType }{@code >}
     *     
     */
    public JAXBElement<LOCAvlBalType> getLOCAvlBal() {
        return locAvlBal;
    }

    /**
     * Sets the value of the locAvlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCAvlBalType }{@code >}
     *     
     */
    public void setLOCAvlBal(JAXBElement<LOCAvlBalType> value) {
        this.locAvlBal = value;
    }

    /**
     * Gets the value of the locCommBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCCommBalType }{@code >}
     *     
     */
    public JAXBElement<LOCCommBalType> getLOCCommBal() {
        return locCommBal;
    }

    /**
     * Sets the value of the locCommBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCCommBalType }{@code >}
     *     
     */
    public void setLOCCommBal(JAXBElement<LOCCommBalType> value) {
        this.locCommBal = value;
    }

    /**
     * Gets the value of the locRegAvlBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCRegAvlBalType }{@code >}
     *     
     */
    public JAXBElement<LOCRegAvlBalType> getLOCRegAvlBal() {
        return locRegAvlBal;
    }

    /**
     * Sets the value of the locRegAvlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCRegAvlBalType }{@code >}
     *     
     */
    public void setLOCRegAvlBal(JAXBElement<LOCRegAvlBalType> value) {
        this.locRegAvlBal = value;
    }

    /**
     * Gets the value of the locClsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCClsCodeType }{@code >}
     *     
     */
    public JAXBElement<LOCClsCodeType> getLOCClsCode() {
        return locClsCode;
    }

    /**
     * Sets the value of the locClsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCClsCodeType }{@code >}
     *     
     */
    public void setLOCClsCode(JAXBElement<LOCClsCodeType> value) {
        this.locClsCode = value;
    }

    /**
     * Gets the value of the locHighAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCHighAmtType }{@code >}
     *     
     */
    public JAXBElement<LOCHighAmtType> getLOCHighAmt() {
        return locHighAmt;
    }

    /**
     * Sets the value of the locHighAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCHighAmtType }{@code >}
     *     
     */
    public void setLOCHighAmt(JAXBElement<LOCHighAmtType> value) {
        this.locHighAmt = value;
    }

    /**
     * Gets the value of the locLowAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCLowAmtType }{@code >}
     *     
     */
    public JAXBElement<LOCLowAmtType> getLOCLowAmt() {
        return locLowAmt;
    }

    /**
     * Sets the value of the locLowAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCLowAmtType }{@code >}
     *     
     */
    public void setLOCLowAmt(JAXBElement<LOCLowAmtType> value) {
        this.locLowAmt = value;
    }

    /**
     * Gets the value of the locAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCAvgType }{@code >}
     *     
     */
    public JAXBElement<LOCAvgType> getLOCAvg() {
        return locAvg;
    }

    /**
     * Sets the value of the locAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCAvgType }{@code >}
     *     
     */
    public void setLOCAvg(JAXBElement<LOCAvgType> value) {
        this.locAvg = value;
    }

    /**
     * Gets the value of the locHighAmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCHighAmtDtType }{@code >}
     *     
     */
    public JAXBElement<LOCHighAmtDtType> getLOCHighAmtDt() {
        return locHighAmtDt;
    }

    /**
     * Sets the value of the locHighAmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCHighAmtDtType }{@code >}
     *     
     */
    public void setLOCHighAmtDt(JAXBElement<LOCHighAmtDtType> value) {
        this.locHighAmtDt = value;
    }

    /**
     * Gets the value of the locLowAmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCLowAmtDtType }{@code >}
     *     
     */
    public JAXBElement<LOCLowAmtDtType> getLOCLowAmtDt() {
        return locLowAmtDt;
    }

    /**
     * Sets the value of the locLowAmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCLowAmtDtType }{@code >}
     *     
     */
    public void setLOCLowAmtDt(JAXBElement<LOCLowAmtDtType> value) {
        this.locLowAmtDt = value;
    }

    /**
     * Gets the value of the locHighAmtLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCHighAmtLTDType }{@code >}
     *     
     */
    public JAXBElement<LOCHighAmtLTDType> getLOCHighAmtLTD() {
        return locHighAmtLTD;
    }

    /**
     * Sets the value of the locHighAmtLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCHighAmtLTDType }{@code >}
     *     
     */
    public void setLOCHighAmtLTD(JAXBElement<LOCHighAmtLTDType> value) {
        this.locHighAmtLTD = value;
    }

    /**
     * Gets the value of the locLowAmtLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCLowAmtLTDType }{@code >}
     *     
     */
    public JAXBElement<LOCLowAmtLTDType> getLOCLowAmtLTD() {
        return locLowAmtLTD;
    }

    /**
     * Sets the value of the locLowAmtLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCLowAmtLTDType }{@code >}
     *     
     */
    public void setLOCLowAmtLTD(JAXBElement<LOCLowAmtLTDType> value) {
        this.locLowAmtLTD = value;
    }

    /**
     * Gets the value of the locAvgLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCAvgLTDType }{@code >}
     *     
     */
    public JAXBElement<LOCAvgLTDType> getLOCAvgLTD() {
        return locAvgLTD;
    }

    /**
     * Sets the value of the locAvgLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCAvgLTDType }{@code >}
     *     
     */
    public void setLOCAvgLTD(JAXBElement<LOCAvgLTDType> value) {
        this.locAvgLTD = value;
    }

    /**
     * Gets the value of the locBankNetTot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCBankNetTotType }{@code >}
     *     
     */
    public JAXBElement<LOCBankNetTotType> getLOCBankNetTot() {
        return locBankNetTot;
    }

    /**
     * Sets the value of the locBankNetTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCBankNetTotType }{@code >}
     *     
     */
    public void setLOCBankNetTot(JAXBElement<LOCBankNetTotType> value) {
        this.locBankNetTot = value;
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
     * Gets the value of the locRedRvwFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCRedRvwFreqType }{@code >}
     *     
     */
    public JAXBElement<LOCRedRvwFreqType> getLOCRedRvwFreq() {
        return locRedRvwFreq;
    }

    /**
     * Sets the value of the locRedRvwFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCRedRvwFreqType }{@code >}
     *     
     */
    public void setLOCRedRvwFreq(JAXBElement<LOCRedRvwFreqType> value) {
        this.locRedRvwFreq = value;
    }

    /**
     * Gets the value of the locRedRvwFreqUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCRedRvwFreqUnitsType }{@code >}
     *     
     */
    public JAXBElement<LOCRedRvwFreqUnitsType> getLOCRedRvwFreqUnits() {
        return locRedRvwFreqUnits;
    }

    /**
     * Sets the value of the locRedRvwFreqUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCRedRvwFreqUnitsType }{@code >}
     *     
     */
    public void setLOCRedRvwFreqUnits(JAXBElement<LOCRedRvwFreqUnitsType> value) {
        this.locRedRvwFreqUnits = value;
    }

    /**
     * Gets the value of the locNxtRedDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCNxtRedDtType }{@code >}
     *     
     */
    public JAXBElement<LOCNxtRedDtType> getLOCNxtRedDt() {
        return locNxtRedDt;
    }

    /**
     * Sets the value of the locNxtRedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCNxtRedDtType }{@code >}
     *     
     */
    public void setLOCNxtRedDt(JAXBElement<LOCNxtRedDtType> value) {
        this.locNxtRedDt = value;
    }

    /**
     * Gets the value of the locRedPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCRedPctType }{@code >}
     *     
     */
    public JAXBElement<LOCRedPctType> getLOCRedPct() {
        return locRedPct;
    }

    /**
     * Sets the value of the locRedPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCRedPctType }{@code >}
     *     
     */
    public void setLOCRedPct(JAXBElement<LOCRedPctType> value) {
        this.locRedPct = value;
    }

    /**
     * Gets the value of the locSchedRedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCSchedRedAmtType }{@code >}
     *     
     */
    public JAXBElement<LOCSchedRedAmtType> getLOCSchedRedAmt() {
        return locSchedRedAmt;
    }

    /**
     * Sets the value of the locSchedRedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCSchedRedAmtType }{@code >}
     *     
     */
    public void setLOCSchedRedAmt(JAXBElement<LOCSchedRedAmtType> value) {
        this.locSchedRedAmt = value;
    }

    /**
     * Gets the value of the locFeeArray property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeArrayAType }
     *     
     */
    public LnFeeArrayAType getLOCFeeArray() {
        return locFeeArray;
    }

    /**
     * Sets the value of the locFeeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeArrayAType }
     *     
     */
    public void setLOCFeeArray(LnFeeArrayAType value) {
        this.locFeeArray = value;
    }

    /**
     * Gets the value of the locFeeAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCFeeAcctIdType }{@code >}
     *     
     */
    public JAXBElement<LOCFeeAcctIdType> getLOCFeeAcctId() {
        return locFeeAcctId;
    }

    /**
     * Sets the value of the locFeeAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCFeeAcctIdType }{@code >}
     *     
     */
    public void setLOCFeeAcctId(JAXBElement<LOCFeeAcctIdType> value) {
        this.locFeeAcctId = value;
    }

    /**
     * Gets the value of the locFeeAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCFeeAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<LOCFeeAcctTypeType> getLOCFeeAcctType() {
        return locFeeAcctType;
    }

    /**
     * Sets the value of the locFeeAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCFeeAcctTypeType }{@code >}
     *     
     */
    public void setLOCFeeAcctType(JAXBElement<LOCFeeAcctTypeType> value) {
        this.locFeeAcctType = value;
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
     * Gets the value of the locGdnceType property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceTypeType }
     *     
     */
    public LOCGdnceTypeType getLOCGdnceType() {
        return locGdnceType;
    }

    /**
     * Sets the value of the locGdnceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceTypeType }
     *     
     */
    public void setLOCGdnceType(LOCGdnceTypeType value) {
        this.locGdnceType = value;
    }

    /**
     * Gets the value of the locGdnceBorwAck property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceBorwAckType }
     *     
     */
    public LOCGdnceBorwAckType getLOCGdnceBorwAck() {
        return locGdnceBorwAck;
    }

    /**
     * Sets the value of the locGdnceBorwAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceBorwAckType }
     *     
     */
    public void setLOCGdnceBorwAck(LOCGdnceBorwAckType value) {
        this.locGdnceBorwAck = value;
    }

    /**
     * Gets the value of the locGdnceRedType property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceRedTypeType }
     *     
     */
    public LOCGdnceRedTypeType getLOCGdnceRedType() {
        return locGdnceRedType;
    }

    /**
     * Sets the value of the locGdnceRedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceRedTypeType }
     *     
     */
    public void setLOCGdnceRedType(LOCGdnceRedTypeType value) {
        this.locGdnceRedType = value;
    }

    /**
     * Gets the value of the locLastRedDt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCLastRedDtType }
     *     
     */
    public LOCLastRedDtType getLOCLastRedDt() {
        return locLastRedDt;
    }

    /**
     * Sets the value of the locLastRedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCLastRedDtType }
     *     
     */
    public void setLOCLastRedDt(LOCLastRedDtType value) {
        this.locLastRedDt = value;
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
     * Gets the value of the locQtrAmtInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link LOCQtrAmtInfoArrayAType }
     *     
     */
    public LOCQtrAmtInfoArrayAType getLOCQtrAmtInfoArray() {
        return locQtrAmtInfoArray;
    }

    /**
     * Sets the value of the locQtrAmtInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCQtrAmtInfoArrayAType }
     *     
     */
    public void setLOCQtrAmtInfoArray(LOCQtrAmtInfoArrayAType value) {
        this.locQtrAmtInfoArray = value;
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
     * Gets the value of the constInProcArray property.
     * 
     * @return
     *     possible object is
     *     {@link ConstInProcArrayAType }
     *     
     */
    public ConstInProcArrayAType getConstInProcArray() {
        return constInProcArray;
    }

    /**
     * Sets the value of the constInProcArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstInProcArrayAType }
     *     
     */
    public void setConstInProcArray(ConstInProcArrayAType value) {
        this.constInProcArray = value;
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
     * Gets the value of the locAvlCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAvlCalcTypeType }
     *     
     */
    public LOCAvlCalcTypeType getLOCAvlCalcType() {
        return locAvlCalcType;
    }

    /**
     * Sets the value of the locAvlCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAvlCalcTypeType }
     *     
     */
    public void setLOCAvlCalcType(LOCAvlCalcTypeType value) {
        this.locAvlCalcType = value;
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
     * Gets the value of the ltrOfCrLmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCLmtType }
     *     
     */
    public LOCLmtType getLtrOfCrLmt() {
        return ltrOfCrLmt;
    }

    /**
     * Sets the value of the ltrOfCrLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCLmtType }
     *     
     */
    public void setLtrOfCrLmt(LOCLmtType value) {
        this.ltrOfCrLmt = value;
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
     * Gets the value of the maxTrancheCrtCnt property.
     * 
     * @return
     *     possible object is
     *     {@link RecCntType }
     *     
     */
    public RecCntType getMaxTrancheCrtCnt() {
        return maxTrancheCrtCnt;
    }

    /**
     * Sets the value of the maxTrancheCrtCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecCntType }
     *     
     */
    public void setMaxTrancheCrtCnt(RecCntType value) {
        this.maxTrancheCrtCnt = value;
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
     * Gets the value of the mllIncCombStmt property.
     * 
     * @return
     *     possible object is
     *     {@link IncCombStmtType }
     *     
     */
    public IncCombStmtType getMLLIncCombStmt() {
        return mllIncCombStmt;
    }

    /**
     * Sets the value of the mllIncCombStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncCombStmtType }
     *     
     */
    public void setMLLIncCombStmt(IncCombStmtType value) {
        this.mllIncCombStmt = value;
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
