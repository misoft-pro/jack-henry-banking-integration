
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
 * <p>Java class for ResLnAppRgtrInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResLnAppRgtrInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DecOffc" type="{http://jackhenry.com/jxchange/TPG/2008}DecOffc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppDt" type="{http://jackhenry.com/jxchange/TPG/2008}AppDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}AppEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ApprDt" type="{http://jackhenry.com/jxchange/TPG/2008}ApprDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppDecDt" type="{http://jackhenry.com/jxchange/TPG/2008}AppDecDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrAppCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrAppCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProceedAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ProceedAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnTerm" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="PurpCode" type="{http://jackhenry.com/jxchange/TPG/2008}PurpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropLegalInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PropLegalInfo_Type" minOccurs="0"/&gt;
 *         &lt;element name="YrBuilt" type="{http://jackhenry.com/jxchange/TPG/2008}YrBuilt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropCode" type="{http://jackhenry.com/jxchange/TPG/2008}PropCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropPostalCode" type="{http://jackhenry.com/jxchange/TPG/2008}PropPostalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}OffInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ClsCost" type="{http://jackhenry.com/jxchange/TPG/2008}ClsCost_Type" minOccurs="0"/&gt;
 *         &lt;element name="OccupCode" type="{http://jackhenry.com/jxchange/TPG/2008}OccupCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="HMDARpt" type="{http://jackhenry.com/jxchange/TPG/2008}HMDARpt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}AppStatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropState" type="{http://jackhenry.com/jxchange/TPG/2008}PropState_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRACenTract" type="{http://jackhenry.com/jxchange/TPG/2008}CRACenTract_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRASMSACode" type="{http://jackhenry.com/jxchange/TPG/2008}CRASMSACode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRACountyCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRACountyCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdMtgCode" type="{http://jackhenry.com/jxchange/TPG/2008}SecdMtgCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ApprVal" type="{http://jackhenry.com/jxchange/TPG/2008}ApprVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropPurchaseAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PropPurchaseAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurLnToValRatio" type="{http://jackhenry.com/jxchange/TPG/2008}CurLnToValRatio_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateSpread" type="{http://jackhenry.com/jxchange/TPG/2008}RateSpread_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnnPctRate" type="{http://jackhenry.com/jxchange/TPG/2008}AnnPctRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}LnAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PIAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PIAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="HOEPAStat" type="{http://jackhenry.com/jxchange/TPG/2008}HOEPAStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="LienStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}LienStatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EstClsDt" type="{http://jackhenry.com/jxchange/TPG/2008}EstClsDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropSMSALoc" type="{http://jackhenry.com/jxchange/TPG/2008}PropSMSALoc_Type" minOccurs="0"/&gt;
 *         &lt;element name="HMDANoRptRsn" type="{http://jackhenry.com/jxchange/TPG/2008}HMDANoRptRsn_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRADelinCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRADelinCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHLBPropCode" type="{http://jackhenry.com/jxchange/TPG/2008}FHLBPropCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DenialRsnArray" type="{http://jackhenry.com/jxchange/TPG/2008}DenialRsnArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PreApprvAppCode" type="{http://jackhenry.com/jxchange/TPG/2008}PreApprvAppCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnPurpCode" type="{http://jackhenry.com/jxchange/TPG/2008}PurpCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="RateLockInDt" type="{http://jackhenry.com/jxchange/TPG/2008}RateLockInDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="StreetAddr1" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr1_Type" minOccurs="0"/&gt;
 *             &lt;element name="City" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *             &lt;element name="PrePmtPenTerm" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *             &lt;element name="TotDebtPct" type="{http://jackhenry.com/jxchange/TPG/2008}TotDebtPct_Type" minOccurs="0"/&gt;
 *             &lt;element name="CombLTV" type="{http://jackhenry.com/jxchange/TPG/2008}CombLTV_Type" minOccurs="0"/&gt;
 *             &lt;element name="TeaserRatePeriod" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *             &lt;element name="BallPmtType" type="{http://jackhenry.com/jxchange/TPG/2008}BallPmtType_Type" minOccurs="0"/&gt;
 *             &lt;element name="IntOnlyType" type="{http://jackhenry.com/jxchange/TPG/2008}IntOnlyType_Type" minOccurs="0"/&gt;
 *             &lt;element name="NegAmrtzType" type="{http://jackhenry.com/jxchange/TPG/2008}NegAmrtzType_Type" minOccurs="0"/&gt;
 *             &lt;element name="NonFullAmrtzType" type="{http://jackhenry.com/jxchange/TPG/2008}NonFullAmrtzType_Type" minOccurs="0"/&gt;
 *             &lt;element name="PropEstVal" type="{http://jackhenry.com/jxchange/TPG/2008}PropEstVal_Type" minOccurs="0"/&gt;
 *             &lt;element name="MHSecuredPropCode" type="{http://jackhenry.com/jxchange/TPG/2008}MHSecuredPropCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="MHLandPropIntCode" type="{http://jackhenry.com/jxchange/TPG/2008}MHLandPropIntCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="TotUnit" type="{http://jackhenry.com/jxchange/TPG/2008}NumUnit_Type" minOccurs="0"/&gt;
 *             &lt;element name="MultiAffrdUnit" type="{http://jackhenry.com/jxchange/TPG/2008}NumUnit_Type" minOccurs="0"/&gt;
 *             &lt;element name="SbmAppType" type="{http://jackhenry.com/jxchange/TPG/2008}SbmAppType_Type" minOccurs="0"/&gt;
 *             &lt;element name="InitialPayInstType" type="{http://jackhenry.com/jxchange/TPG/2008}InitialPayInstType_Type" minOccurs="0"/&gt;
 *             &lt;element name="LnOrignId" type="{http://jackhenry.com/jxchange/TPG/2008}LnOrignId_Type" minOccurs="0"/&gt;
 *             &lt;element name="LnOrignCompId" type="{http://jackhenry.com/jxchange/TPG/2008}LnOrignCompId_Type" minOccurs="0"/&gt;
 *             &lt;element name="LnUnvId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnvId_Type" minOccurs="0"/&gt;
 *             &lt;element name="RvrMtgType" type="{http://jackhenry.com/jxchange/TPG/2008}RvrMtgType_Type" minOccurs="0"/&gt;
 *             &lt;element name="OpenEndLOCType" type="{http://jackhenry.com/jxchange/TPG/2008}OpenEndLOCType_Type" minOccurs="0"/&gt;
 *             &lt;element name="BusCommType" type="{http://jackhenry.com/jxchange/TPG/2008}BusCommType_Type" minOccurs="0"/&gt;
 *             &lt;element name="AutoUndrwrtArray" type="{http://jackhenry.com/jxchange/TPG/2008}AutoUndrwrtArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ResLnAppRgtrInfo_CType", propOrder = {
    "decOffc",
    "appDt",
    "appEffDt",
    "apprDt",
    "appDecDt",
    "crAppCode",
    "proceedAmt",
    "intRate",
    "lnTerm",
    "purpCode",
    "propLegalInfo",
    "yrBuilt",
    "propCode",
    "propPostalCode",
    "offInfoArray",
    "clsCost",
    "occupCode",
    "lnFeeArray",
    "hmdaRpt",
    "appStatCode",
    "propState",
    "craCenTract",
    "crasmsaCode",
    "craCountyCode",
    "secdMtgCode",
    "apprVal",
    "propPurchaseAmt",
    "curLnToValRatio",
    "rateSpread",
    "annPctRate",
    "lnAcctId",
    "piAmt",
    "hoepaStat",
    "lienStatCode",
    "estClsDt",
    "propSMSALoc",
    "hmdaNoRptRsn",
    "craDelinCode",
    "fhlbPropCode",
    "denialRsnArray",
    "preApprvAppCode",
    "lnPurpCode",
    "ver1",
    "rateLockInDt",
    "ver2",
    "streetAddr1",
    "city",
    "prePmtPenTerm",
    "totDebtPct",
    "combLTV",
    "teaserRatePeriod",
    "ballPmtType",
    "intOnlyType",
    "negAmrtzType",
    "nonFullAmrtzType",
    "propEstVal",
    "mhSecuredPropCode",
    "mhLandPropIntCode",
    "totUnit",
    "multiAffrdUnit",
    "sbmAppType",
    "initialPayInstType",
    "lnOrignId",
    "lnOrignCompId",
    "lnUnvId",
    "rvrMtgType",
    "openEndLOCType",
    "busCommType",
    "autoUndrwrtArray",
    "ver3",
    "any"
})
public class ResLnAppRgtrInfoCType {

    @XmlElementRef(name = "DecOffc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DecOffcType> decOffc;
    @XmlElementRef(name = "AppDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AppDtType> appDt;
    @XmlElementRef(name = "AppEffDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AppEffDtType> appEffDt;
    @XmlElementRef(name = "ApprDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ApprDtType> apprDt;
    @XmlElementRef(name = "AppDecDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AppDecDtType> appDecDt;
    @XmlElementRef(name = "CrAppCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrAppCodeType> crAppCode;
    @XmlElementRef(name = "ProceedAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProceedAmtType> proceedAmt;
    @XmlElementRef(name = "IntRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntRateType> intRate;
    @XmlElement(name = "LnTerm")
    protected TermCType lnTerm;
    @XmlElementRef(name = "PurpCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PurpCodeType> purpCode;
    @XmlElementRef(name = "PropLegalInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropLegalInfoType> propLegalInfo;
    @XmlElementRef(name = "YrBuilt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<YrBuiltType> yrBuilt;
    @XmlElementRef(name = "PropCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropCodeType> propCode;
    @XmlElementRef(name = "PropPostalCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropPostalCodeType> propPostalCode;
    @XmlElement(name = "OffInfoArray")
    protected OffInfoArrayAType offInfoArray;
    @XmlElementRef(name = "ClsCost", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ClsCostType> clsCost;
    @XmlElementRef(name = "OccupCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OccupCodeType> occupCode;
    @XmlElement(name = "LnFeeArray")
    protected LnFeeArrayAType lnFeeArray;
    @XmlElementRef(name = "HMDARpt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HMDARptType> hmdaRpt;
    @XmlElementRef(name = "AppStatCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AppStatCodeType> appStatCode;
    @XmlElementRef(name = "PropState", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropStateType> propState;
    @XmlElementRef(name = "CRACenTract", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRACenTractType> craCenTract;
    @XmlElementRef(name = "CRASMSACode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRASMSACodeType> crasmsaCode;
    @XmlElementRef(name = "CRACountyCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRACountyCodeType> craCountyCode;
    @XmlElementRef(name = "SecdMtgCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SecdMtgCodeType> secdMtgCode;
    @XmlElementRef(name = "ApprVal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ApprValType> apprVal;
    @XmlElementRef(name = "PropPurchaseAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropPurchaseAmtType> propPurchaseAmt;
    @XmlElementRef(name = "CurLnToValRatio", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurLnToValRatioType> curLnToValRatio;
    @XmlElementRef(name = "RateSpread", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateSpreadType> rateSpread;
    @XmlElementRef(name = "AnnPctRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AnnPctRateType> annPctRate;
    @XmlElementRef(name = "LnAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnAcctIdType> lnAcctId;
    @XmlElementRef(name = "PIAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PIAmtType> piAmt;
    @XmlElementRef(name = "HOEPAStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HOEPAStatType> hoepaStat;
    @XmlElementRef(name = "LienStatCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LienStatCodeType> lienStatCode;
    @XmlElementRef(name = "EstClsDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EstClsDtType> estClsDt;
    @XmlElementRef(name = "PropSMSALoc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropSMSALocType> propSMSALoc;
    @XmlElementRef(name = "HMDANoRptRsn", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HMDANoRptRsnType> hmdaNoRptRsn;
    @XmlElementRef(name = "CRADelinCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRADelinCodeType> craDelinCode;
    @XmlElementRef(name = "FHLBPropCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FHLBPropCodeType> fhlbPropCode;
    @XmlElement(name = "DenialRsnArray")
    protected DenialRsnArrayAType denialRsnArray;
    @XmlElementRef(name = "PreApprvAppCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PreApprvAppCodeType> preApprvAppCode;
    @XmlElementRef(name = "LnPurpCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PurpCodeType> lnPurpCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "RateLockInDt")
    protected RateLockInDtType rateLockInDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "StreetAddr1")
    protected StreetAddr1Type streetAddr1;
    @XmlElement(name = "City")
    protected CityType city;
    @XmlElement(name = "PrePmtPenTerm")
    protected TermCntType prePmtPenTerm;
    @XmlElement(name = "TotDebtPct")
    protected TotDebtPctType totDebtPct;
    @XmlElement(name = "CombLTV")
    protected CombLTVType combLTV;
    @XmlElement(name = "TeaserRatePeriod")
    protected TermCntType teaserRatePeriod;
    @XmlElement(name = "BallPmtType")
    protected BallPmtTypeType ballPmtType;
    @XmlElement(name = "IntOnlyType")
    protected IntOnlyTypeType intOnlyType;
    @XmlElement(name = "NegAmrtzType")
    protected NegAmrtzTypeType negAmrtzType;
    @XmlElement(name = "NonFullAmrtzType")
    protected NonFullAmrtzTypeType nonFullAmrtzType;
    @XmlElement(name = "PropEstVal")
    protected PropEstValType propEstVal;
    @XmlElement(name = "MHSecuredPropCode")
    protected MHSecuredPropCodeType mhSecuredPropCode;
    @XmlElement(name = "MHLandPropIntCode")
    protected MHLandPropIntCodeType mhLandPropIntCode;
    @XmlElement(name = "TotUnit")
    protected NumUnitType totUnit;
    @XmlElement(name = "MultiAffrdUnit")
    protected NumUnitType multiAffrdUnit;
    @XmlElement(name = "SbmAppType")
    protected SbmAppTypeType sbmAppType;
    @XmlElement(name = "InitialPayInstType")
    protected InitialPayInstTypeType initialPayInstType;
    @XmlElement(name = "LnOrignId")
    protected LnOrignIdType lnOrignId;
    @XmlElement(name = "LnOrignCompId")
    protected LnOrignCompIdType lnOrignCompId;
    @XmlElement(name = "LnUnvId")
    protected LnUnvIdType lnUnvId;
    @XmlElement(name = "RvrMtgType")
    protected RvrMtgTypeType rvrMtgType;
    @XmlElement(name = "OpenEndLOCType")
    protected OpenEndLOCTypeType openEndLOCType;
    @XmlElement(name = "BusCommType")
    protected BusCommTypeType busCommType;
    @XmlElement(name = "AutoUndrwrtArray")
    protected AutoUndrwrtArrayAType autoUndrwrtArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the decOffc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DecOffcType }{@code >}
     *     
     */
    public JAXBElement<DecOffcType> getDecOffc() {
        return decOffc;
    }

    /**
     * Sets the value of the decOffc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DecOffcType }{@code >}
     *     
     */
    public void setDecOffc(JAXBElement<DecOffcType> value) {
        this.decOffc = value;
    }

    /**
     * Gets the value of the appDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppDtType }{@code >}
     *     
     */
    public JAXBElement<AppDtType> getAppDt() {
        return appDt;
    }

    /**
     * Sets the value of the appDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppDtType }{@code >}
     *     
     */
    public void setAppDt(JAXBElement<AppDtType> value) {
        this.appDt = value;
    }

    /**
     * Gets the value of the appEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppEffDtType }{@code >}
     *     
     */
    public JAXBElement<AppEffDtType> getAppEffDt() {
        return appEffDt;
    }

    /**
     * Sets the value of the appEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppEffDtType }{@code >}
     *     
     */
    public void setAppEffDt(JAXBElement<AppEffDtType> value) {
        this.appEffDt = value;
    }

    /**
     * Gets the value of the apprDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApprDtType }{@code >}
     *     
     */
    public JAXBElement<ApprDtType> getApprDt() {
        return apprDt;
    }

    /**
     * Sets the value of the apprDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApprDtType }{@code >}
     *     
     */
    public void setApprDt(JAXBElement<ApprDtType> value) {
        this.apprDt = value;
    }

    /**
     * Gets the value of the appDecDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppDecDtType }{@code >}
     *     
     */
    public JAXBElement<AppDecDtType> getAppDecDt() {
        return appDecDt;
    }

    /**
     * Sets the value of the appDecDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppDecDtType }{@code >}
     *     
     */
    public void setAppDecDt(JAXBElement<AppDecDtType> value) {
        this.appDecDt = value;
    }

    /**
     * Gets the value of the crAppCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrAppCodeType }{@code >}
     *     
     */
    public JAXBElement<CrAppCodeType> getCrAppCode() {
        return crAppCode;
    }

    /**
     * Sets the value of the crAppCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrAppCodeType }{@code >}
     *     
     */
    public void setCrAppCode(JAXBElement<CrAppCodeType> value) {
        this.crAppCode = value;
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
     * Gets the value of the lnTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermCType }
     *     
     */
    public TermCType getLnTerm() {
        return lnTerm;
    }

    /**
     * Sets the value of the lnTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCType }
     *     
     */
    public void setLnTerm(TermCType value) {
        this.lnTerm = value;
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
     * Gets the value of the propLegalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropLegalInfoType }{@code >}
     *     
     */
    public JAXBElement<PropLegalInfoType> getPropLegalInfo() {
        return propLegalInfo;
    }

    /**
     * Sets the value of the propLegalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropLegalInfoType }{@code >}
     *     
     */
    public void setPropLegalInfo(JAXBElement<PropLegalInfoType> value) {
        this.propLegalInfo = value;
    }

    /**
     * Gets the value of the yrBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YrBuiltType }{@code >}
     *     
     */
    public JAXBElement<YrBuiltType> getYrBuilt() {
        return yrBuilt;
    }

    /**
     * Sets the value of the yrBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YrBuiltType }{@code >}
     *     
     */
    public void setYrBuilt(JAXBElement<YrBuiltType> value) {
        this.yrBuilt = value;
    }

    /**
     * Gets the value of the propCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropCodeType }{@code >}
     *     
     */
    public JAXBElement<PropCodeType> getPropCode() {
        return propCode;
    }

    /**
     * Sets the value of the propCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropCodeType }{@code >}
     *     
     */
    public void setPropCode(JAXBElement<PropCodeType> value) {
        this.propCode = value;
    }

    /**
     * Gets the value of the propPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropPostalCodeType }{@code >}
     *     
     */
    public JAXBElement<PropPostalCodeType> getPropPostalCode() {
        return propPostalCode;
    }

    /**
     * Sets the value of the propPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropPostalCodeType }{@code >}
     *     
     */
    public void setPropPostalCode(JAXBElement<PropPostalCodeType> value) {
        this.propPostalCode = value;
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
     * Gets the value of the clsCost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClsCostType }{@code >}
     *     
     */
    public JAXBElement<ClsCostType> getClsCost() {
        return clsCost;
    }

    /**
     * Sets the value of the clsCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClsCostType }{@code >}
     *     
     */
    public void setClsCost(JAXBElement<ClsCostType> value) {
        this.clsCost = value;
    }

    /**
     * Gets the value of the occupCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OccupCodeType }{@code >}
     *     
     */
    public JAXBElement<OccupCodeType> getOccupCode() {
        return occupCode;
    }

    /**
     * Sets the value of the occupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OccupCodeType }{@code >}
     *     
     */
    public void setOccupCode(JAXBElement<OccupCodeType> value) {
        this.occupCode = value;
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
     * Gets the value of the hmdaRpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HMDARptType }{@code >}
     *     
     */
    public JAXBElement<HMDARptType> getHMDARpt() {
        return hmdaRpt;
    }

    /**
     * Sets the value of the hmdaRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HMDARptType }{@code >}
     *     
     */
    public void setHMDARpt(JAXBElement<HMDARptType> value) {
        this.hmdaRpt = value;
    }

    /**
     * Gets the value of the appStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppStatCodeType }{@code >}
     *     
     */
    public JAXBElement<AppStatCodeType> getAppStatCode() {
        return appStatCode;
    }

    /**
     * Sets the value of the appStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppStatCodeType }{@code >}
     *     
     */
    public void setAppStatCode(JAXBElement<AppStatCodeType> value) {
        this.appStatCode = value;
    }

    /**
     * Gets the value of the propState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropStateType }{@code >}
     *     
     */
    public JAXBElement<PropStateType> getPropState() {
        return propState;
    }

    /**
     * Sets the value of the propState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropStateType }{@code >}
     *     
     */
    public void setPropState(JAXBElement<PropStateType> value) {
        this.propState = value;
    }

    /**
     * Gets the value of the craCenTract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRACenTractType }{@code >}
     *     
     */
    public JAXBElement<CRACenTractType> getCRACenTract() {
        return craCenTract;
    }

    /**
     * Sets the value of the craCenTract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRACenTractType }{@code >}
     *     
     */
    public void setCRACenTract(JAXBElement<CRACenTractType> value) {
        this.craCenTract = value;
    }

    /**
     * Gets the value of the crasmsaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRASMSACodeType }{@code >}
     *     
     */
    public JAXBElement<CRASMSACodeType> getCRASMSACode() {
        return crasmsaCode;
    }

    /**
     * Sets the value of the crasmsaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRASMSACodeType }{@code >}
     *     
     */
    public void setCRASMSACode(JAXBElement<CRASMSACodeType> value) {
        this.crasmsaCode = value;
    }

    /**
     * Gets the value of the craCountyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRACountyCodeType }{@code >}
     *     
     */
    public JAXBElement<CRACountyCodeType> getCRACountyCode() {
        return craCountyCode;
    }

    /**
     * Sets the value of the craCountyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRACountyCodeType }{@code >}
     *     
     */
    public void setCRACountyCode(JAXBElement<CRACountyCodeType> value) {
        this.craCountyCode = value;
    }

    /**
     * Gets the value of the secdMtgCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecdMtgCodeType }{@code >}
     *     
     */
    public JAXBElement<SecdMtgCodeType> getSecdMtgCode() {
        return secdMtgCode;
    }

    /**
     * Sets the value of the secdMtgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecdMtgCodeType }{@code >}
     *     
     */
    public void setSecdMtgCode(JAXBElement<SecdMtgCodeType> value) {
        this.secdMtgCode = value;
    }

    /**
     * Gets the value of the apprVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApprValType }{@code >}
     *     
     */
    public JAXBElement<ApprValType> getApprVal() {
        return apprVal;
    }

    /**
     * Sets the value of the apprVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApprValType }{@code >}
     *     
     */
    public void setApprVal(JAXBElement<ApprValType> value) {
        this.apprVal = value;
    }

    /**
     * Gets the value of the propPurchaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropPurchaseAmtType }{@code >}
     *     
     */
    public JAXBElement<PropPurchaseAmtType> getPropPurchaseAmt() {
        return propPurchaseAmt;
    }

    /**
     * Sets the value of the propPurchaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropPurchaseAmtType }{@code >}
     *     
     */
    public void setPropPurchaseAmt(JAXBElement<PropPurchaseAmtType> value) {
        this.propPurchaseAmt = value;
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
     * Gets the value of the rateSpread property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateSpreadType }{@code >}
     *     
     */
    public JAXBElement<RateSpreadType> getRateSpread() {
        return rateSpread;
    }

    /**
     * Sets the value of the rateSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateSpreadType }{@code >}
     *     
     */
    public void setRateSpread(JAXBElement<RateSpreadType> value) {
        this.rateSpread = value;
    }

    /**
     * Gets the value of the annPctRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnnPctRateType }{@code >}
     *     
     */
    public JAXBElement<AnnPctRateType> getAnnPctRate() {
        return annPctRate;
    }

    /**
     * Sets the value of the annPctRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnnPctRateType }{@code >}
     *     
     */
    public void setAnnPctRate(JAXBElement<AnnPctRateType> value) {
        this.annPctRate = value;
    }

    /**
     * Gets the value of the lnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnAcctIdType }{@code >}
     *     
     */
    public JAXBElement<LnAcctIdType> getLnAcctId() {
        return lnAcctId;
    }

    /**
     * Sets the value of the lnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnAcctIdType }{@code >}
     *     
     */
    public void setLnAcctId(JAXBElement<LnAcctIdType> value) {
        this.lnAcctId = value;
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
     * Gets the value of the hoepaStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HOEPAStatType }{@code >}
     *     
     */
    public JAXBElement<HOEPAStatType> getHOEPAStat() {
        return hoepaStat;
    }

    /**
     * Sets the value of the hoepaStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HOEPAStatType }{@code >}
     *     
     */
    public void setHOEPAStat(JAXBElement<HOEPAStatType> value) {
        this.hoepaStat = value;
    }

    /**
     * Gets the value of the lienStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LienStatCodeType }{@code >}
     *     
     */
    public JAXBElement<LienStatCodeType> getLienStatCode() {
        return lienStatCode;
    }

    /**
     * Sets the value of the lienStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LienStatCodeType }{@code >}
     *     
     */
    public void setLienStatCode(JAXBElement<LienStatCodeType> value) {
        this.lienStatCode = value;
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
     * Gets the value of the propSMSALoc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropSMSALocType }{@code >}
     *     
     */
    public JAXBElement<PropSMSALocType> getPropSMSALoc() {
        return propSMSALoc;
    }

    /**
     * Sets the value of the propSMSALoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropSMSALocType }{@code >}
     *     
     */
    public void setPropSMSALoc(JAXBElement<PropSMSALocType> value) {
        this.propSMSALoc = value;
    }

    /**
     * Gets the value of the hmdaNoRptRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HMDANoRptRsnType }{@code >}
     *     
     */
    public JAXBElement<HMDANoRptRsnType> getHMDANoRptRsn() {
        return hmdaNoRptRsn;
    }

    /**
     * Sets the value of the hmdaNoRptRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HMDANoRptRsnType }{@code >}
     *     
     */
    public void setHMDANoRptRsn(JAXBElement<HMDANoRptRsnType> value) {
        this.hmdaNoRptRsn = value;
    }

    /**
     * Gets the value of the craDelinCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRADelinCodeType }{@code >}
     *     
     */
    public JAXBElement<CRADelinCodeType> getCRADelinCode() {
        return craDelinCode;
    }

    /**
     * Sets the value of the craDelinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRADelinCodeType }{@code >}
     *     
     */
    public void setCRADelinCode(JAXBElement<CRADelinCodeType> value) {
        this.craDelinCode = value;
    }

    /**
     * Gets the value of the fhlbPropCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FHLBPropCodeType }{@code >}
     *     
     */
    public JAXBElement<FHLBPropCodeType> getFHLBPropCode() {
        return fhlbPropCode;
    }

    /**
     * Sets the value of the fhlbPropCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FHLBPropCodeType }{@code >}
     *     
     */
    public void setFHLBPropCode(JAXBElement<FHLBPropCodeType> value) {
        this.fhlbPropCode = value;
    }

    /**
     * Gets the value of the denialRsnArray property.
     * 
     * @return
     *     possible object is
     *     {@link DenialRsnArrayAType }
     *     
     */
    public DenialRsnArrayAType getDenialRsnArray() {
        return denialRsnArray;
    }

    /**
     * Sets the value of the denialRsnArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DenialRsnArrayAType }
     *     
     */
    public void setDenialRsnArray(DenialRsnArrayAType value) {
        this.denialRsnArray = value;
    }

    /**
     * Gets the value of the preApprvAppCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PreApprvAppCodeType }{@code >}
     *     
     */
    public JAXBElement<PreApprvAppCodeType> getPreApprvAppCode() {
        return preApprvAppCode;
    }

    /**
     * Sets the value of the preApprvAppCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PreApprvAppCodeType }{@code >}
     *     
     */
    public void setPreApprvAppCode(JAXBElement<PreApprvAppCodeType> value) {
        this.preApprvAppCode = value;
    }

    /**
     * Gets the value of the lnPurpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PurpCodeType }{@code >}
     *     
     */
    public JAXBElement<PurpCodeType> getLnPurpCode() {
        return lnPurpCode;
    }

    /**
     * Sets the value of the lnPurpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PurpCodeType }{@code >}
     *     
     */
    public void setLnPurpCode(JAXBElement<PurpCodeType> value) {
        this.lnPurpCode = value;
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
     * Gets the value of the rateLockInDt property.
     * 
     * @return
     *     possible object is
     *     {@link RateLockInDtType }
     *     
     */
    public RateLockInDtType getRateLockInDt() {
        return rateLockInDt;
    }

    /**
     * Sets the value of the rateLockInDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateLockInDtType }
     *     
     */
    public void setRateLockInDt(RateLockInDtType value) {
        this.rateLockInDt = value;
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
     * Gets the value of the streetAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddr1Type }
     *     
     */
    public StreetAddr1Type getStreetAddr1() {
        return streetAddr1;
    }

    /**
     * Sets the value of the streetAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddr1Type }
     *     
     */
    public void setStreetAddr1(StreetAddr1Type value) {
        this.streetAddr1 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setCity(CityType value) {
        this.city = value;
    }

    /**
     * Gets the value of the prePmtPenTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermCntType }
     *     
     */
    public TermCntType getPrePmtPenTerm() {
        return prePmtPenTerm;
    }

    /**
     * Sets the value of the prePmtPenTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCntType }
     *     
     */
    public void setPrePmtPenTerm(TermCntType value) {
        this.prePmtPenTerm = value;
    }

    /**
     * Gets the value of the totDebtPct property.
     * 
     * @return
     *     possible object is
     *     {@link TotDebtPctType }
     *     
     */
    public TotDebtPctType getTotDebtPct() {
        return totDebtPct;
    }

    /**
     * Sets the value of the totDebtPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotDebtPctType }
     *     
     */
    public void setTotDebtPct(TotDebtPctType value) {
        this.totDebtPct = value;
    }

    /**
     * Gets the value of the combLTV property.
     * 
     * @return
     *     possible object is
     *     {@link CombLTVType }
     *     
     */
    public CombLTVType getCombLTV() {
        return combLTV;
    }

    /**
     * Sets the value of the combLTV property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombLTVType }
     *     
     */
    public void setCombLTV(CombLTVType value) {
        this.combLTV = value;
    }

    /**
     * Gets the value of the teaserRatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TermCntType }
     *     
     */
    public TermCntType getTeaserRatePeriod() {
        return teaserRatePeriod;
    }

    /**
     * Sets the value of the teaserRatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCntType }
     *     
     */
    public void setTeaserRatePeriod(TermCntType value) {
        this.teaserRatePeriod = value;
    }

    /**
     * Gets the value of the ballPmtType property.
     * 
     * @return
     *     possible object is
     *     {@link BallPmtTypeType }
     *     
     */
    public BallPmtTypeType getBallPmtType() {
        return ballPmtType;
    }

    /**
     * Sets the value of the ballPmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BallPmtTypeType }
     *     
     */
    public void setBallPmtType(BallPmtTypeType value) {
        this.ballPmtType = value;
    }

    /**
     * Gets the value of the intOnlyType property.
     * 
     * @return
     *     possible object is
     *     {@link IntOnlyTypeType }
     *     
     */
    public IntOnlyTypeType getIntOnlyType() {
        return intOnlyType;
    }

    /**
     * Sets the value of the intOnlyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOnlyTypeType }
     *     
     */
    public void setIntOnlyType(IntOnlyTypeType value) {
        this.intOnlyType = value;
    }

    /**
     * Gets the value of the negAmrtzType property.
     * 
     * @return
     *     possible object is
     *     {@link NegAmrtzTypeType }
     *     
     */
    public NegAmrtzTypeType getNegAmrtzType() {
        return negAmrtzType;
    }

    /**
     * Sets the value of the negAmrtzType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegAmrtzTypeType }
     *     
     */
    public void setNegAmrtzType(NegAmrtzTypeType value) {
        this.negAmrtzType = value;
    }

    /**
     * Gets the value of the nonFullAmrtzType property.
     * 
     * @return
     *     possible object is
     *     {@link NonFullAmrtzTypeType }
     *     
     */
    public NonFullAmrtzTypeType getNonFullAmrtzType() {
        return nonFullAmrtzType;
    }

    /**
     * Sets the value of the nonFullAmrtzType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFullAmrtzTypeType }
     *     
     */
    public void setNonFullAmrtzType(NonFullAmrtzTypeType value) {
        this.nonFullAmrtzType = value;
    }

    /**
     * Gets the value of the propEstVal property.
     * 
     * @return
     *     possible object is
     *     {@link PropEstValType }
     *     
     */
    public PropEstValType getPropEstVal() {
        return propEstVal;
    }

    /**
     * Sets the value of the propEstVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEstValType }
     *     
     */
    public void setPropEstVal(PropEstValType value) {
        this.propEstVal = value;
    }

    /**
     * Gets the value of the mhSecuredPropCode property.
     * 
     * @return
     *     possible object is
     *     {@link MHSecuredPropCodeType }
     *     
     */
    public MHSecuredPropCodeType getMHSecuredPropCode() {
        return mhSecuredPropCode;
    }

    /**
     * Sets the value of the mhSecuredPropCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MHSecuredPropCodeType }
     *     
     */
    public void setMHSecuredPropCode(MHSecuredPropCodeType value) {
        this.mhSecuredPropCode = value;
    }

    /**
     * Gets the value of the mhLandPropIntCode property.
     * 
     * @return
     *     possible object is
     *     {@link MHLandPropIntCodeType }
     *     
     */
    public MHLandPropIntCodeType getMHLandPropIntCode() {
        return mhLandPropIntCode;
    }

    /**
     * Sets the value of the mhLandPropIntCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MHLandPropIntCodeType }
     *     
     */
    public void setMHLandPropIntCode(MHLandPropIntCodeType value) {
        this.mhLandPropIntCode = value;
    }

    /**
     * Gets the value of the totUnit property.
     * 
     * @return
     *     possible object is
     *     {@link NumUnitType }
     *     
     */
    public NumUnitType getTotUnit() {
        return totUnit;
    }

    /**
     * Sets the value of the totUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumUnitType }
     *     
     */
    public void setTotUnit(NumUnitType value) {
        this.totUnit = value;
    }

    /**
     * Gets the value of the multiAffrdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link NumUnitType }
     *     
     */
    public NumUnitType getMultiAffrdUnit() {
        return multiAffrdUnit;
    }

    /**
     * Sets the value of the multiAffrdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumUnitType }
     *     
     */
    public void setMultiAffrdUnit(NumUnitType value) {
        this.multiAffrdUnit = value;
    }

    /**
     * Gets the value of the sbmAppType property.
     * 
     * @return
     *     possible object is
     *     {@link SbmAppTypeType }
     *     
     */
    public SbmAppTypeType getSbmAppType() {
        return sbmAppType;
    }

    /**
     * Sets the value of the sbmAppType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SbmAppTypeType }
     *     
     */
    public void setSbmAppType(SbmAppTypeType value) {
        this.sbmAppType = value;
    }

    /**
     * Gets the value of the initialPayInstType property.
     * 
     * @return
     *     possible object is
     *     {@link InitialPayInstTypeType }
     *     
     */
    public InitialPayInstTypeType getInitialPayInstType() {
        return initialPayInstType;
    }

    /**
     * Sets the value of the initialPayInstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialPayInstTypeType }
     *     
     */
    public void setInitialPayInstType(InitialPayInstTypeType value) {
        this.initialPayInstType = value;
    }

    /**
     * Gets the value of the lnOrignId property.
     * 
     * @return
     *     possible object is
     *     {@link LnOrignIdType }
     *     
     */
    public LnOrignIdType getLnOrignId() {
        return lnOrignId;
    }

    /**
     * Sets the value of the lnOrignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnOrignIdType }
     *     
     */
    public void setLnOrignId(LnOrignIdType value) {
        this.lnOrignId = value;
    }

    /**
     * Gets the value of the lnOrignCompId property.
     * 
     * @return
     *     possible object is
     *     {@link LnOrignCompIdType }
     *     
     */
    public LnOrignCompIdType getLnOrignCompId() {
        return lnOrignCompId;
    }

    /**
     * Sets the value of the lnOrignCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnOrignCompIdType }
     *     
     */
    public void setLnOrignCompId(LnOrignCompIdType value) {
        this.lnOrignCompId = value;
    }

    /**
     * Gets the value of the lnUnvId property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnvIdType }
     *     
     */
    public LnUnvIdType getLnUnvId() {
        return lnUnvId;
    }

    /**
     * Sets the value of the lnUnvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnvIdType }
     *     
     */
    public void setLnUnvId(LnUnvIdType value) {
        this.lnUnvId = value;
    }

    /**
     * Gets the value of the rvrMtgType property.
     * 
     * @return
     *     possible object is
     *     {@link RvrMtgTypeType }
     *     
     */
    public RvrMtgTypeType getRvrMtgType() {
        return rvrMtgType;
    }

    /**
     * Sets the value of the rvrMtgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RvrMtgTypeType }
     *     
     */
    public void setRvrMtgType(RvrMtgTypeType value) {
        this.rvrMtgType = value;
    }

    /**
     * Gets the value of the openEndLOCType property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEndLOCTypeType }
     *     
     */
    public OpenEndLOCTypeType getOpenEndLOCType() {
        return openEndLOCType;
    }

    /**
     * Sets the value of the openEndLOCType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEndLOCTypeType }
     *     
     */
    public void setOpenEndLOCType(OpenEndLOCTypeType value) {
        this.openEndLOCType = value;
    }

    /**
     * Gets the value of the busCommType property.
     * 
     * @return
     *     possible object is
     *     {@link BusCommTypeType }
     *     
     */
    public BusCommTypeType getBusCommType() {
        return busCommType;
    }

    /**
     * Sets the value of the busCommType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusCommTypeType }
     *     
     */
    public void setBusCommType(BusCommTypeType value) {
        this.busCommType = value;
    }

    /**
     * Gets the value of the autoUndrwrtArray property.
     * 
     * @return
     *     possible object is
     *     {@link AutoUndrwrtArrayAType }
     *     
     */
    public AutoUndrwrtArrayAType getAutoUndrwrtArray() {
        return autoUndrwrtArray;
    }

    /**
     * Sets the value of the autoUndrwrtArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoUndrwrtArrayAType }
     *     
     */
    public void setAutoUndrwrtArray(AutoUndrwrtArrayAType value) {
        this.autoUndrwrtArray = value;
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
