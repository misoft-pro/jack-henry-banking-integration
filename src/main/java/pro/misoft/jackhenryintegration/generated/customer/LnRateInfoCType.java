
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
 * <p>Java class for LnRateInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnRateInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UseRateCarryOvrs" type="{http://jackhenry.com/jxchange/TPG/2008}UseRateCarryOvrs_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateVarCode" type="{http://jackhenry.com/jxchange/TPG/2008}RateVarCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateVar" type="{http://jackhenry.com/jxchange/TPG/2008}RateVar_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRoundToPct" type="{http://jackhenry.com/jxchange/TPG/2008}RateRoundToPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRoundMthd" type="{http://jackhenry.com/jxchange/TPG/2008}RateRoundMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevTerm" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevDt" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateFlr" type="{http://jackhenry.com/jxchange/TPG/2008}RateFlr_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateCeil" type="{http://jackhenry.com/jxchange/TPG/2008}RateCeil_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateCapUp" type="{http://jackhenry.com/jxchange/TPG/2008}RateCapUp_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateCapRevTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}RateCapRevTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateCapRevTerm" type="{http://jackhenry.com/jxchange/TPG/2008}RateCapRevTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateCapRevDt" type="{http://jackhenry.com/jxchange/TPG/2008}RateCapRevDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateCapDown" type="{http://jackhenry.com/jxchange/TPG/2008}RateCapDown_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateBegCapPeriod" type="{http://jackhenry.com/jxchange/TPG/2008}RateBegCapPeriod_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateBeforeDlq" type="{http://jackhenry.com/jxchange/TPG/2008}RateBeforeDlq_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevIdxVal" type="{http://jackhenry.com/jxchange/TPG/2008}PrevIdxVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevCarryOvrSign" type="{http://jackhenry.com/jxchange/TPG/2008}PrevCarryOvrSign_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevCarryOvr" type="{http://jackhenry.com/jxchange/TPG/2008}PrevCarryOvr_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigRate" type="{http://jackhenry.com/jxchange/TPG/2008}OrigRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigIdxVal" type="{http://jackhenry.com/jxchange/TPG/2008}OrigIdxVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewPrevRateChgDt" type="{http://jackhenry.com/jxchange/TPG/2008}NewPrevRateChgDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewPrevRate" type="{http://jackhenry.com/jxchange/TPG/2008}NewPrevRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewIdxVal" type="{http://jackhenry.com/jxchange/TPG/2008}NewIdxVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewCarryOvrSign" type="{http://jackhenry.com/jxchange/TPG/2008}NewCarryOvrSign_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewCarryOvr" type="{http://jackhenry.com/jxchange/TPG/2008}NewCarryOvr_Type" minOccurs="0"/&gt;
 *         &lt;element name="MatRate" type="{http://jackhenry.com/jxchange/TPG/2008}MatRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="MatGraceDays" type="{http://jackhenry.com/jxchange/TPG/2008}MatGraceDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlqRateMarginSign" type="{http://jackhenry.com/jxchange/TPG/2008}DlqRateMarginSign_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlqRateMargin" type="{http://jackhenry.com/jxchange/TPG/2008}DlqRateMargin_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlqRateIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}DlqRateIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlqRateDays" type="{http://jackhenry.com/jxchange/TPG/2008}DlqRateDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlqRate" type="{http://jackhenry.com/jxchange/TPG/2008}DlqRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="DaysBeforeRateChg" type="{http://jackhenry.com/jxchange/TPG/2008}DaysBeforeRateChg_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurIdx" type="{http://jackhenry.com/jxchange/TPG/2008}CurIdx_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurCarryOvrSign" type="{http://jackhenry.com/jxchange/TPG/2008}CurCarryOvrSign_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurCarryOvr" type="{http://jackhenry.com/jxchange/TPG/2008}CurCarryOvr_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConvVarCode" type="{http://jackhenry.com/jxchange/TPG/2008}ConvVarCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConvVar" type="{http://jackhenry.com/jxchange/TPG/2008}ConvVar_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConvIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}ConvIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConvARMExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ConvARMExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConvARMCode" type="{http://jackhenry.com/jxchange/TPG/2008}ConvARMCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="RateSpread" type="{http://jackhenry.com/jxchange/TPG/2008}RateSpread_Type" minOccurs="0"/&gt;
 *           &lt;element name="TeaserRateCode" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateCode_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="RateRevDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevDayOfMonth_Type" minOccurs="0"/&gt;
 *             &lt;element name="LnTierRateArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnTierRateArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="ConvFixRateExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ConvFixRateExpDt_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="PenAnnPctIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}PenAnnPctIdxNum_Type" minOccurs="0"/&gt;
 *                 &lt;element name="PenAnnPctRate" type="{http://jackhenry.com/jxchange/TPG/2008}PenAnnPctRate_Type" minOccurs="0"/&gt;
 *                 &lt;element name="PenNotDays" type="{http://jackhenry.com/jxchange/TPG/2008}PenNotDays_Type" minOccurs="0"/&gt;
 *                 &lt;element name="PenEffDays" type="{http://jackhenry.com/jxchange/TPG/2008}PenEffDays_Type" minOccurs="0"/&gt;
 *                 &lt;element name="PenRevTerm" type="{http://jackhenry.com/jxchange/TPG/2008}PenRevTerm_Type" minOccurs="0"/&gt;
 *                 &lt;element name="PenRevTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}PenRevTermUnits_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="LnCapRate" type="{http://jackhenry.com/jxchange/TPG/2008}LnCapRate_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="PrtRateChgNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtRateChgNotCode_Type" minOccurs="0"/&gt;
 *                     &lt;element name="InitARMNotType" type="{http://jackhenry.com/jxchange/TPG/2008}InitARMNotType_Type" minOccurs="0"/&gt;
 *                     &lt;element name="DaysInitARMNot" type="{http://jackhenry.com/jxchange/TPG/2008}DaysInitARMNot_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="LastRePriceDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastRePriceDt_Type" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;element name="BusDayRateRevType" type="{http://jackhenry.com/jxchange/TPG/2008}BusDayRateRevType_Type" minOccurs="0"/&gt;
 *                         &lt;element name="NonBusDayRateRevType" type="{http://jackhenry.com/jxchange/TPG/2008}NonBusDayRateRevType_Type" minOccurs="0"/&gt;
 *                         &lt;sequence minOccurs="0"&gt;
 *                           &lt;element name="Ver_9" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_9_CType"/&gt;
 *                           &lt;element name="InitARMFixPeriodCnt" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *                           &lt;element name="InitARMFixPeriodUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
 *                           &lt;sequence minOccurs="0"&gt;
 *                             &lt;element name="Ver_10" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_10_CType"/&gt;
 *                             &lt;element name="RateLookbackDays" type="{http://jackhenry.com/jxchange/TPG/2008}RateLookbackDays_Type" minOccurs="0"/&gt;
 *                             &lt;element name="RateLookbackType" type="{http://jackhenry.com/jxchange/TPG/2008}BusCalDayType_Type" minOccurs="0"/&gt;
 *                             &lt;sequence minOccurs="0"&gt;
 *                               &lt;element name="Ver_11" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_11_CType"/&gt;
 *                               &lt;element name="BackdateRateChngType" type="{http://jackhenry.com/jxchange/TPG/2008}BackdateRateChngType_Type" minOccurs="0"/&gt;
 *                               &lt;element name="BegFactorIdx" type="{http://jackhenry.com/jxchange/TPG/2008}FactorIdx_Type" minOccurs="0"/&gt;
 *                               &lt;element name="BegFactorIdxDt" type="{http://jackhenry.com/jxchange/TPG/2008}BegFactorIdxDt_Type" minOccurs="0"/&gt;
 *                               &lt;element name="RateIdxType" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdxType_Type" minOccurs="0"/&gt;
 *                               &lt;sequence minOccurs="0"&gt;
 *                                 &lt;element name="Ver_12" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_12_CType"/&gt;
 *                                 &lt;element name="PermRateCapUp" type="{http://jackhenry.com/jxchange/TPG/2008}PermRateCapUp_Type" minOccurs="0"/&gt;
 *                                 &lt;sequence minOccurs="0"&gt;
 *                                   &lt;element name="Ver_13" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_13_CType"/&gt;
 *                                   &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LnRateInfo_CType", propOrder = {
    "useRateCarryOvrs",
    "rateVarCode",
    "rateVar",
    "rateRoundToPct",
    "rateRoundMthd",
    "rateRevTermUnits",
    "rateRevTerm",
    "rateRevDt",
    "rateIdxNum",
    "rateFlr",
    "rateCeil",
    "rateCapUp",
    "rateCapRevTermUnits",
    "rateCapRevTerm",
    "rateCapRevDt",
    "rateCapDown",
    "rateBegCapPeriod",
    "rateBeforeDlq",
    "prevIdxVal",
    "prevCarryOvrSign",
    "prevCarryOvr",
    "origRate",
    "origIdxVal",
    "newPrevRateChgDt",
    "newPrevRate",
    "newIdxVal",
    "newCarryOvrSign",
    "newCarryOvr",
    "matRate",
    "matGraceDays",
    "dlqRateMarginSign",
    "dlqRateMargin",
    "dlqRateIdxNum",
    "dlqRateDays",
    "dlqRate",
    "daysBeforeRateChg",
    "curIdx",
    "curCarryOvrSign",
    "curCarryOvr",
    "convVarCode",
    "convVar",
    "convIdxNum",
    "convARMExpDt",
    "convARMCode",
    "ver1",
    "rateSpread",
    "teaserRateCode",
    "ver2",
    "rateRevDayOfMonth",
    "lnTierRateArray",
    "ver3",
    "convFixRateExpDt",
    "ver4",
    "penAnnPctIdxNum",
    "penAnnPctRate",
    "penNotDays",
    "penEffDays",
    "penRevTerm",
    "penRevTermUnits",
    "ver5",
    "lnCapRate",
    "ver6",
    "prtRateChgNotCode",
    "initARMNotType",
    "daysInitARMNot",
    "ver7",
    "lastRePriceDt",
    "ver8",
    "busDayRateRevType",
    "nonBusDayRateRevType",
    "ver9",
    "initARMFixPeriodCnt",
    "initARMFixPeriodUnits",
    "ver10",
    "rateLookbackDays",
    "rateLookbackType",
    "ver11",
    "backdateRateChngType",
    "begFactorIdx",
    "begFactorIdxDt",
    "rateIdxType",
    "ver12",
    "permRateCapUp",
    "ver13",
    "any"
})
public class LnRateInfoCType {

    @XmlElementRef(name = "UseRateCarryOvrs", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UseRateCarryOvrsType> useRateCarryOvrs;
    @XmlElementRef(name = "RateVarCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateVarCodeType> rateVarCode;
    @XmlElementRef(name = "RateVar", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateVarType> rateVar;
    @XmlElementRef(name = "RateRoundToPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateRoundToPctType> rateRoundToPct;
    @XmlElementRef(name = "RateRoundMthd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateRoundMthdType> rateRoundMthd;
    @XmlElementRef(name = "RateRevTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateRevTermUnitsType> rateRevTermUnits;
    @XmlElementRef(name = "RateRevTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateRevTermType> rateRevTerm;
    @XmlElementRef(name = "RateRevDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateRevDtType> rateRevDt;
    @XmlElementRef(name = "RateIdxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateIdxNumType> rateIdxNum;
    @XmlElementRef(name = "RateFlr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateFlrType> rateFlr;
    @XmlElementRef(name = "RateCeil", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateCeilType> rateCeil;
    @XmlElementRef(name = "RateCapUp", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateCapUpType> rateCapUp;
    @XmlElementRef(name = "RateCapRevTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateCapRevTermUnitsType> rateCapRevTermUnits;
    @XmlElementRef(name = "RateCapRevTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateCapRevTermType> rateCapRevTerm;
    @XmlElementRef(name = "RateCapRevDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateCapRevDtType> rateCapRevDt;
    @XmlElementRef(name = "RateCapDown", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateCapDownType> rateCapDown;
    @XmlElementRef(name = "RateBegCapPeriod", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateBegCapPeriodType> rateBegCapPeriod;
    @XmlElementRef(name = "RateBeforeDlq", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateBeforeDlqType> rateBeforeDlq;
    @XmlElementRef(name = "PrevIdxVal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrevIdxValType> prevIdxVal;
    @XmlElementRef(name = "PrevCarryOvrSign", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrevCarryOvrSignType> prevCarryOvrSign;
    @XmlElementRef(name = "PrevCarryOvr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrevCarryOvrType> prevCarryOvr;
    @XmlElementRef(name = "OrigRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigRateType> origRate;
    @XmlElementRef(name = "OrigIdxVal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigIdxValType> origIdxVal;
    @XmlElementRef(name = "NewPrevRateChgDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NewPrevRateChgDtType> newPrevRateChgDt;
    @XmlElementRef(name = "NewPrevRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NewPrevRateType> newPrevRate;
    @XmlElementRef(name = "NewIdxVal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NewIdxValType> newIdxVal;
    @XmlElementRef(name = "NewCarryOvrSign", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NewCarryOvrSignType> newCarryOvrSign;
    @XmlElementRef(name = "NewCarryOvr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NewCarryOvrType> newCarryOvr;
    @XmlElementRef(name = "MatRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MatRateType> matRate;
    @XmlElementRef(name = "MatGraceDays", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MatGraceDaysType> matGraceDays;
    @XmlElementRef(name = "DlqRateMarginSign", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlqRateMarginSignType> dlqRateMarginSign;
    @XmlElementRef(name = "DlqRateMargin", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlqRateMarginType> dlqRateMargin;
    @XmlElementRef(name = "DlqRateIdxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlqRateIdxNumType> dlqRateIdxNum;
    @XmlElementRef(name = "DlqRateDays", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlqRateDaysType> dlqRateDays;
    @XmlElementRef(name = "DlqRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlqRateType> dlqRate;
    @XmlElementRef(name = "DaysBeforeRateChg", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DaysBeforeRateChgType> daysBeforeRateChg;
    @XmlElementRef(name = "CurIdx", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurIdxType> curIdx;
    @XmlElementRef(name = "CurCarryOvrSign", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurCarryOvrSignType> curCarryOvrSign;
    @XmlElementRef(name = "CurCarryOvr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurCarryOvrType> curCarryOvr;
    @XmlElementRef(name = "ConvVarCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ConvVarCodeType> convVarCode;
    @XmlElementRef(name = "ConvVar", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ConvVarType> convVar;
    @XmlElementRef(name = "ConvIdxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ConvIdxNumType> convIdxNum;
    @XmlElementRef(name = "ConvARMExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ConvARMExpDtType> convARMExpDt;
    @XmlElementRef(name = "ConvARMCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ConvARMCodeType> convARMCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "RateSpread", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateSpreadType> rateSpread;
    @XmlElementRef(name = "TeaserRateCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TeaserRateCodeType> teaserRateCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "RateRevDayOfMonth", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateRevDayOfMonthType> rateRevDayOfMonth;
    @XmlElement(name = "LnTierRateArray")
    protected LnTierRateArrayAType lnTierRateArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElementRef(name = "ConvFixRateExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ConvFixRateExpDtType> convFixRateExpDt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElementRef(name = "PenAnnPctIdxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PenAnnPctIdxNumType> penAnnPctIdxNum;
    @XmlElementRef(name = "PenAnnPctRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PenAnnPctRateType> penAnnPctRate;
    @XmlElementRef(name = "PenNotDays", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PenNotDaysType> penNotDays;
    @XmlElementRef(name = "PenEffDays", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PenEffDaysType> penEffDays;
    @XmlElementRef(name = "PenRevTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PenRevTermType> penRevTerm;
    @XmlElementRef(name = "PenRevTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PenRevTermUnitsType> penRevTermUnits;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "LnCapRate")
    protected LnCapRateType lnCapRate;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "PrtRateChgNotCode")
    protected PrtRateChgNotCodeType prtRateChgNotCode;
    @XmlElement(name = "InitARMNotType")
    protected InitARMNotTypeType initARMNotType;
    @XmlElement(name = "DaysInitARMNot")
    protected DaysInitARMNotType daysInitARMNot;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "LastRePriceDt")
    protected LastRePriceDtType lastRePriceDt;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlElement(name = "BusDayRateRevType")
    protected BusDayRateRevTypeType busDayRateRevType;
    @XmlElement(name = "NonBusDayRateRevType")
    protected NonBusDayRateRevTypeType nonBusDayRateRevType;
    @XmlElement(name = "Ver_9")
    protected Ver9CType ver9;
    @XmlElement(name = "InitARMFixPeriodCnt")
    protected TermCntType initARMFixPeriodCnt;
    @XmlElement(name = "InitARMFixPeriodUnits")
    protected TermUnitsType initARMFixPeriodUnits;
    @XmlElement(name = "Ver_10")
    protected Ver10CType ver10;
    @XmlElement(name = "RateLookbackDays")
    protected RateLookbackDaysType rateLookbackDays;
    @XmlElement(name = "RateLookbackType")
    protected BusCalDayTypeType rateLookbackType;
    @XmlElement(name = "Ver_11")
    protected Ver11CType ver11;
    @XmlElement(name = "BackdateRateChngType")
    protected BackdateRateChngTypeType backdateRateChngType;
    @XmlElement(name = "BegFactorIdx")
    protected FactorIdxType begFactorIdx;
    @XmlElement(name = "BegFactorIdxDt")
    protected BegFactorIdxDtType begFactorIdxDt;
    @XmlElement(name = "RateIdxType")
    protected RateIdxTypeType rateIdxType;
    @XmlElement(name = "Ver_12")
    protected Ver12CType ver12;
    @XmlElement(name = "PermRateCapUp")
    protected PermRateCapUpType permRateCapUp;
    @XmlElement(name = "Ver_13")
    protected Ver13CType ver13;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the useRateCarryOvrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UseRateCarryOvrsType }{@code >}
     *     
     */
    public JAXBElement<UseRateCarryOvrsType> getUseRateCarryOvrs() {
        return useRateCarryOvrs;
    }

    /**
     * Sets the value of the useRateCarryOvrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UseRateCarryOvrsType }{@code >}
     *     
     */
    public void setUseRateCarryOvrs(JAXBElement<UseRateCarryOvrsType> value) {
        this.useRateCarryOvrs = value;
    }

    /**
     * Gets the value of the rateVarCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateVarCodeType }{@code >}
     *     
     */
    public JAXBElement<RateVarCodeType> getRateVarCode() {
        return rateVarCode;
    }

    /**
     * Sets the value of the rateVarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateVarCodeType }{@code >}
     *     
     */
    public void setRateVarCode(JAXBElement<RateVarCodeType> value) {
        this.rateVarCode = value;
    }

    /**
     * Gets the value of the rateVar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateVarType }{@code >}
     *     
     */
    public JAXBElement<RateVarType> getRateVar() {
        return rateVar;
    }

    /**
     * Sets the value of the rateVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateVarType }{@code >}
     *     
     */
    public void setRateVar(JAXBElement<RateVarType> value) {
        this.rateVar = value;
    }

    /**
     * Gets the value of the rateRoundToPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateRoundToPctType }{@code >}
     *     
     */
    public JAXBElement<RateRoundToPctType> getRateRoundToPct() {
        return rateRoundToPct;
    }

    /**
     * Sets the value of the rateRoundToPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateRoundToPctType }{@code >}
     *     
     */
    public void setRateRoundToPct(JAXBElement<RateRoundToPctType> value) {
        this.rateRoundToPct = value;
    }

    /**
     * Gets the value of the rateRoundMthd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateRoundMthdType }{@code >}
     *     
     */
    public JAXBElement<RateRoundMthdType> getRateRoundMthd() {
        return rateRoundMthd;
    }

    /**
     * Sets the value of the rateRoundMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateRoundMthdType }{@code >}
     *     
     */
    public void setRateRoundMthd(JAXBElement<RateRoundMthdType> value) {
        this.rateRoundMthd = value;
    }

    /**
     * Gets the value of the rateRevTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateRevTermUnitsType }{@code >}
     *     
     */
    public JAXBElement<RateRevTermUnitsType> getRateRevTermUnits() {
        return rateRevTermUnits;
    }

    /**
     * Sets the value of the rateRevTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateRevTermUnitsType }{@code >}
     *     
     */
    public void setRateRevTermUnits(JAXBElement<RateRevTermUnitsType> value) {
        this.rateRevTermUnits = value;
    }

    /**
     * Gets the value of the rateRevTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateRevTermType }{@code >}
     *     
     */
    public JAXBElement<RateRevTermType> getRateRevTerm() {
        return rateRevTerm;
    }

    /**
     * Sets the value of the rateRevTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateRevTermType }{@code >}
     *     
     */
    public void setRateRevTerm(JAXBElement<RateRevTermType> value) {
        this.rateRevTerm = value;
    }

    /**
     * Gets the value of the rateRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateRevDtType }{@code >}
     *     
     */
    public JAXBElement<RateRevDtType> getRateRevDt() {
        return rateRevDt;
    }

    /**
     * Sets the value of the rateRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateRevDtType }{@code >}
     *     
     */
    public void setRateRevDt(JAXBElement<RateRevDtType> value) {
        this.rateRevDt = value;
    }

    /**
     * Gets the value of the rateIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateIdxNumType }{@code >}
     *     
     */
    public JAXBElement<RateIdxNumType> getRateIdxNum() {
        return rateIdxNum;
    }

    /**
     * Sets the value of the rateIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateIdxNumType }{@code >}
     *     
     */
    public void setRateIdxNum(JAXBElement<RateIdxNumType> value) {
        this.rateIdxNum = value;
    }

    /**
     * Gets the value of the rateFlr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateFlrType }{@code >}
     *     
     */
    public JAXBElement<RateFlrType> getRateFlr() {
        return rateFlr;
    }

    /**
     * Sets the value of the rateFlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateFlrType }{@code >}
     *     
     */
    public void setRateFlr(JAXBElement<RateFlrType> value) {
        this.rateFlr = value;
    }

    /**
     * Gets the value of the rateCeil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateCeilType }{@code >}
     *     
     */
    public JAXBElement<RateCeilType> getRateCeil() {
        return rateCeil;
    }

    /**
     * Sets the value of the rateCeil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateCeilType }{@code >}
     *     
     */
    public void setRateCeil(JAXBElement<RateCeilType> value) {
        this.rateCeil = value;
    }

    /**
     * Gets the value of the rateCapUp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateCapUpType }{@code >}
     *     
     */
    public JAXBElement<RateCapUpType> getRateCapUp() {
        return rateCapUp;
    }

    /**
     * Sets the value of the rateCapUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateCapUpType }{@code >}
     *     
     */
    public void setRateCapUp(JAXBElement<RateCapUpType> value) {
        this.rateCapUp = value;
    }

    /**
     * Gets the value of the rateCapRevTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateCapRevTermUnitsType }{@code >}
     *     
     */
    public JAXBElement<RateCapRevTermUnitsType> getRateCapRevTermUnits() {
        return rateCapRevTermUnits;
    }

    /**
     * Sets the value of the rateCapRevTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateCapRevTermUnitsType }{@code >}
     *     
     */
    public void setRateCapRevTermUnits(JAXBElement<RateCapRevTermUnitsType> value) {
        this.rateCapRevTermUnits = value;
    }

    /**
     * Gets the value of the rateCapRevTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateCapRevTermType }{@code >}
     *     
     */
    public JAXBElement<RateCapRevTermType> getRateCapRevTerm() {
        return rateCapRevTerm;
    }

    /**
     * Sets the value of the rateCapRevTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateCapRevTermType }{@code >}
     *     
     */
    public void setRateCapRevTerm(JAXBElement<RateCapRevTermType> value) {
        this.rateCapRevTerm = value;
    }

    /**
     * Gets the value of the rateCapRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateCapRevDtType }{@code >}
     *     
     */
    public JAXBElement<RateCapRevDtType> getRateCapRevDt() {
        return rateCapRevDt;
    }

    /**
     * Sets the value of the rateCapRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateCapRevDtType }{@code >}
     *     
     */
    public void setRateCapRevDt(JAXBElement<RateCapRevDtType> value) {
        this.rateCapRevDt = value;
    }

    /**
     * Gets the value of the rateCapDown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateCapDownType }{@code >}
     *     
     */
    public JAXBElement<RateCapDownType> getRateCapDown() {
        return rateCapDown;
    }

    /**
     * Sets the value of the rateCapDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateCapDownType }{@code >}
     *     
     */
    public void setRateCapDown(JAXBElement<RateCapDownType> value) {
        this.rateCapDown = value;
    }

    /**
     * Gets the value of the rateBegCapPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateBegCapPeriodType }{@code >}
     *     
     */
    public JAXBElement<RateBegCapPeriodType> getRateBegCapPeriod() {
        return rateBegCapPeriod;
    }

    /**
     * Sets the value of the rateBegCapPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateBegCapPeriodType }{@code >}
     *     
     */
    public void setRateBegCapPeriod(JAXBElement<RateBegCapPeriodType> value) {
        this.rateBegCapPeriod = value;
    }

    /**
     * Gets the value of the rateBeforeDlq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateBeforeDlqType }{@code >}
     *     
     */
    public JAXBElement<RateBeforeDlqType> getRateBeforeDlq() {
        return rateBeforeDlq;
    }

    /**
     * Sets the value of the rateBeforeDlq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateBeforeDlqType }{@code >}
     *     
     */
    public void setRateBeforeDlq(JAXBElement<RateBeforeDlqType> value) {
        this.rateBeforeDlq = value;
    }

    /**
     * Gets the value of the prevIdxVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrevIdxValType }{@code >}
     *     
     */
    public JAXBElement<PrevIdxValType> getPrevIdxVal() {
        return prevIdxVal;
    }

    /**
     * Sets the value of the prevIdxVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrevIdxValType }{@code >}
     *     
     */
    public void setPrevIdxVal(JAXBElement<PrevIdxValType> value) {
        this.prevIdxVal = value;
    }

    /**
     * Gets the value of the prevCarryOvrSign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrevCarryOvrSignType }{@code >}
     *     
     */
    public JAXBElement<PrevCarryOvrSignType> getPrevCarryOvrSign() {
        return prevCarryOvrSign;
    }

    /**
     * Sets the value of the prevCarryOvrSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrevCarryOvrSignType }{@code >}
     *     
     */
    public void setPrevCarryOvrSign(JAXBElement<PrevCarryOvrSignType> value) {
        this.prevCarryOvrSign = value;
    }

    /**
     * Gets the value of the prevCarryOvr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrevCarryOvrType }{@code >}
     *     
     */
    public JAXBElement<PrevCarryOvrType> getPrevCarryOvr() {
        return prevCarryOvr;
    }

    /**
     * Sets the value of the prevCarryOvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrevCarryOvrType }{@code >}
     *     
     */
    public void setPrevCarryOvr(JAXBElement<PrevCarryOvrType> value) {
        this.prevCarryOvr = value;
    }

    /**
     * Gets the value of the origRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigRateType }{@code >}
     *     
     */
    public JAXBElement<OrigRateType> getOrigRate() {
        return origRate;
    }

    /**
     * Sets the value of the origRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigRateType }{@code >}
     *     
     */
    public void setOrigRate(JAXBElement<OrigRateType> value) {
        this.origRate = value;
    }

    /**
     * Gets the value of the origIdxVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigIdxValType }{@code >}
     *     
     */
    public JAXBElement<OrigIdxValType> getOrigIdxVal() {
        return origIdxVal;
    }

    /**
     * Sets the value of the origIdxVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigIdxValType }{@code >}
     *     
     */
    public void setOrigIdxVal(JAXBElement<OrigIdxValType> value) {
        this.origIdxVal = value;
    }

    /**
     * Gets the value of the newPrevRateChgDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NewPrevRateChgDtType }{@code >}
     *     
     */
    public JAXBElement<NewPrevRateChgDtType> getNewPrevRateChgDt() {
        return newPrevRateChgDt;
    }

    /**
     * Sets the value of the newPrevRateChgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NewPrevRateChgDtType }{@code >}
     *     
     */
    public void setNewPrevRateChgDt(JAXBElement<NewPrevRateChgDtType> value) {
        this.newPrevRateChgDt = value;
    }

    /**
     * Gets the value of the newPrevRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NewPrevRateType }{@code >}
     *     
     */
    public JAXBElement<NewPrevRateType> getNewPrevRate() {
        return newPrevRate;
    }

    /**
     * Sets the value of the newPrevRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NewPrevRateType }{@code >}
     *     
     */
    public void setNewPrevRate(JAXBElement<NewPrevRateType> value) {
        this.newPrevRate = value;
    }

    /**
     * Gets the value of the newIdxVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NewIdxValType }{@code >}
     *     
     */
    public JAXBElement<NewIdxValType> getNewIdxVal() {
        return newIdxVal;
    }

    /**
     * Sets the value of the newIdxVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NewIdxValType }{@code >}
     *     
     */
    public void setNewIdxVal(JAXBElement<NewIdxValType> value) {
        this.newIdxVal = value;
    }

    /**
     * Gets the value of the newCarryOvrSign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NewCarryOvrSignType }{@code >}
     *     
     */
    public JAXBElement<NewCarryOvrSignType> getNewCarryOvrSign() {
        return newCarryOvrSign;
    }

    /**
     * Sets the value of the newCarryOvrSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NewCarryOvrSignType }{@code >}
     *     
     */
    public void setNewCarryOvrSign(JAXBElement<NewCarryOvrSignType> value) {
        this.newCarryOvrSign = value;
    }

    /**
     * Gets the value of the newCarryOvr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NewCarryOvrType }{@code >}
     *     
     */
    public JAXBElement<NewCarryOvrType> getNewCarryOvr() {
        return newCarryOvr;
    }

    /**
     * Sets the value of the newCarryOvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NewCarryOvrType }{@code >}
     *     
     */
    public void setNewCarryOvr(JAXBElement<NewCarryOvrType> value) {
        this.newCarryOvr = value;
    }

    /**
     * Gets the value of the matRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MatRateType }{@code >}
     *     
     */
    public JAXBElement<MatRateType> getMatRate() {
        return matRate;
    }

    /**
     * Sets the value of the matRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MatRateType }{@code >}
     *     
     */
    public void setMatRate(JAXBElement<MatRateType> value) {
        this.matRate = value;
    }

    /**
     * Gets the value of the matGraceDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MatGraceDaysType }{@code >}
     *     
     */
    public JAXBElement<MatGraceDaysType> getMatGraceDays() {
        return matGraceDays;
    }

    /**
     * Sets the value of the matGraceDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MatGraceDaysType }{@code >}
     *     
     */
    public void setMatGraceDays(JAXBElement<MatGraceDaysType> value) {
        this.matGraceDays = value;
    }

    /**
     * Gets the value of the dlqRateMarginSign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlqRateMarginSignType }{@code >}
     *     
     */
    public JAXBElement<DlqRateMarginSignType> getDlqRateMarginSign() {
        return dlqRateMarginSign;
    }

    /**
     * Sets the value of the dlqRateMarginSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlqRateMarginSignType }{@code >}
     *     
     */
    public void setDlqRateMarginSign(JAXBElement<DlqRateMarginSignType> value) {
        this.dlqRateMarginSign = value;
    }

    /**
     * Gets the value of the dlqRateMargin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlqRateMarginType }{@code >}
     *     
     */
    public JAXBElement<DlqRateMarginType> getDlqRateMargin() {
        return dlqRateMargin;
    }

    /**
     * Sets the value of the dlqRateMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlqRateMarginType }{@code >}
     *     
     */
    public void setDlqRateMargin(JAXBElement<DlqRateMarginType> value) {
        this.dlqRateMargin = value;
    }

    /**
     * Gets the value of the dlqRateIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlqRateIdxNumType }{@code >}
     *     
     */
    public JAXBElement<DlqRateIdxNumType> getDlqRateIdxNum() {
        return dlqRateIdxNum;
    }

    /**
     * Sets the value of the dlqRateIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlqRateIdxNumType }{@code >}
     *     
     */
    public void setDlqRateIdxNum(JAXBElement<DlqRateIdxNumType> value) {
        this.dlqRateIdxNum = value;
    }

    /**
     * Gets the value of the dlqRateDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlqRateDaysType }{@code >}
     *     
     */
    public JAXBElement<DlqRateDaysType> getDlqRateDays() {
        return dlqRateDays;
    }

    /**
     * Sets the value of the dlqRateDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlqRateDaysType }{@code >}
     *     
     */
    public void setDlqRateDays(JAXBElement<DlqRateDaysType> value) {
        this.dlqRateDays = value;
    }

    /**
     * Gets the value of the dlqRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlqRateType }{@code >}
     *     
     */
    public JAXBElement<DlqRateType> getDlqRate() {
        return dlqRate;
    }

    /**
     * Sets the value of the dlqRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlqRateType }{@code >}
     *     
     */
    public void setDlqRate(JAXBElement<DlqRateType> value) {
        this.dlqRate = value;
    }

    /**
     * Gets the value of the daysBeforeRateChg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DaysBeforeRateChgType }{@code >}
     *     
     */
    public JAXBElement<DaysBeforeRateChgType> getDaysBeforeRateChg() {
        return daysBeforeRateChg;
    }

    /**
     * Sets the value of the daysBeforeRateChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DaysBeforeRateChgType }{@code >}
     *     
     */
    public void setDaysBeforeRateChg(JAXBElement<DaysBeforeRateChgType> value) {
        this.daysBeforeRateChg = value;
    }

    /**
     * Gets the value of the curIdx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurIdxType }{@code >}
     *     
     */
    public JAXBElement<CurIdxType> getCurIdx() {
        return curIdx;
    }

    /**
     * Sets the value of the curIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurIdxType }{@code >}
     *     
     */
    public void setCurIdx(JAXBElement<CurIdxType> value) {
        this.curIdx = value;
    }

    /**
     * Gets the value of the curCarryOvrSign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurCarryOvrSignType }{@code >}
     *     
     */
    public JAXBElement<CurCarryOvrSignType> getCurCarryOvrSign() {
        return curCarryOvrSign;
    }

    /**
     * Sets the value of the curCarryOvrSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurCarryOvrSignType }{@code >}
     *     
     */
    public void setCurCarryOvrSign(JAXBElement<CurCarryOvrSignType> value) {
        this.curCarryOvrSign = value;
    }

    /**
     * Gets the value of the curCarryOvr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurCarryOvrType }{@code >}
     *     
     */
    public JAXBElement<CurCarryOvrType> getCurCarryOvr() {
        return curCarryOvr;
    }

    /**
     * Sets the value of the curCarryOvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurCarryOvrType }{@code >}
     *     
     */
    public void setCurCarryOvr(JAXBElement<CurCarryOvrType> value) {
        this.curCarryOvr = value;
    }

    /**
     * Gets the value of the convVarCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConvVarCodeType }{@code >}
     *     
     */
    public JAXBElement<ConvVarCodeType> getConvVarCode() {
        return convVarCode;
    }

    /**
     * Sets the value of the convVarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConvVarCodeType }{@code >}
     *     
     */
    public void setConvVarCode(JAXBElement<ConvVarCodeType> value) {
        this.convVarCode = value;
    }

    /**
     * Gets the value of the convVar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConvVarType }{@code >}
     *     
     */
    public JAXBElement<ConvVarType> getConvVar() {
        return convVar;
    }

    /**
     * Sets the value of the convVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConvVarType }{@code >}
     *     
     */
    public void setConvVar(JAXBElement<ConvVarType> value) {
        this.convVar = value;
    }

    /**
     * Gets the value of the convIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConvIdxNumType }{@code >}
     *     
     */
    public JAXBElement<ConvIdxNumType> getConvIdxNum() {
        return convIdxNum;
    }

    /**
     * Sets the value of the convIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConvIdxNumType }{@code >}
     *     
     */
    public void setConvIdxNum(JAXBElement<ConvIdxNumType> value) {
        this.convIdxNum = value;
    }

    /**
     * Gets the value of the convARMExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConvARMExpDtType }{@code >}
     *     
     */
    public JAXBElement<ConvARMExpDtType> getConvARMExpDt() {
        return convARMExpDt;
    }

    /**
     * Sets the value of the convARMExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConvARMExpDtType }{@code >}
     *     
     */
    public void setConvARMExpDt(JAXBElement<ConvARMExpDtType> value) {
        this.convARMExpDt = value;
    }

    /**
     * Gets the value of the convARMCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConvARMCodeType }{@code >}
     *     
     */
    public JAXBElement<ConvARMCodeType> getConvARMCode() {
        return convARMCode;
    }

    /**
     * Sets the value of the convARMCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConvARMCodeType }{@code >}
     *     
     */
    public void setConvARMCode(JAXBElement<ConvARMCodeType> value) {
        this.convARMCode = value;
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
     * Gets the value of the teaserRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateCodeType }{@code >}
     *     
     */
    public JAXBElement<TeaserRateCodeType> getTeaserRateCode() {
        return teaserRateCode;
    }

    /**
     * Sets the value of the teaserRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateCodeType }{@code >}
     *     
     */
    public void setTeaserRateCode(JAXBElement<TeaserRateCodeType> value) {
        this.teaserRateCode = value;
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
     * Gets the value of the rateRevDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateRevDayOfMonthType }{@code >}
     *     
     */
    public JAXBElement<RateRevDayOfMonthType> getRateRevDayOfMonth() {
        return rateRevDayOfMonth;
    }

    /**
     * Sets the value of the rateRevDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateRevDayOfMonthType }{@code >}
     *     
     */
    public void setRateRevDayOfMonth(JAXBElement<RateRevDayOfMonthType> value) {
        this.rateRevDayOfMonth = value;
    }

    /**
     * Gets the value of the lnTierRateArray property.
     * 
     * @return
     *     possible object is
     *     {@link LnTierRateArrayAType }
     *     
     */
    public LnTierRateArrayAType getLnTierRateArray() {
        return lnTierRateArray;
    }

    /**
     * Sets the value of the lnTierRateArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnTierRateArrayAType }
     *     
     */
    public void setLnTierRateArray(LnTierRateArrayAType value) {
        this.lnTierRateArray = value;
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
     * Gets the value of the convFixRateExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConvFixRateExpDtType }{@code >}
     *     
     */
    public JAXBElement<ConvFixRateExpDtType> getConvFixRateExpDt() {
        return convFixRateExpDt;
    }

    /**
     * Sets the value of the convFixRateExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConvFixRateExpDtType }{@code >}
     *     
     */
    public void setConvFixRateExpDt(JAXBElement<ConvFixRateExpDtType> value) {
        this.convFixRateExpDt = value;
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
     * Gets the value of the penAnnPctIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PenAnnPctIdxNumType }{@code >}
     *     
     */
    public JAXBElement<PenAnnPctIdxNumType> getPenAnnPctIdxNum() {
        return penAnnPctIdxNum;
    }

    /**
     * Sets the value of the penAnnPctIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PenAnnPctIdxNumType }{@code >}
     *     
     */
    public void setPenAnnPctIdxNum(JAXBElement<PenAnnPctIdxNumType> value) {
        this.penAnnPctIdxNum = value;
    }

    /**
     * Gets the value of the penAnnPctRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PenAnnPctRateType }{@code >}
     *     
     */
    public JAXBElement<PenAnnPctRateType> getPenAnnPctRate() {
        return penAnnPctRate;
    }

    /**
     * Sets the value of the penAnnPctRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PenAnnPctRateType }{@code >}
     *     
     */
    public void setPenAnnPctRate(JAXBElement<PenAnnPctRateType> value) {
        this.penAnnPctRate = value;
    }

    /**
     * Gets the value of the penNotDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PenNotDaysType }{@code >}
     *     
     */
    public JAXBElement<PenNotDaysType> getPenNotDays() {
        return penNotDays;
    }

    /**
     * Sets the value of the penNotDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PenNotDaysType }{@code >}
     *     
     */
    public void setPenNotDays(JAXBElement<PenNotDaysType> value) {
        this.penNotDays = value;
    }

    /**
     * Gets the value of the penEffDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PenEffDaysType }{@code >}
     *     
     */
    public JAXBElement<PenEffDaysType> getPenEffDays() {
        return penEffDays;
    }

    /**
     * Sets the value of the penEffDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PenEffDaysType }{@code >}
     *     
     */
    public void setPenEffDays(JAXBElement<PenEffDaysType> value) {
        this.penEffDays = value;
    }

    /**
     * Gets the value of the penRevTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PenRevTermType }{@code >}
     *     
     */
    public JAXBElement<PenRevTermType> getPenRevTerm() {
        return penRevTerm;
    }

    /**
     * Sets the value of the penRevTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PenRevTermType }{@code >}
     *     
     */
    public void setPenRevTerm(JAXBElement<PenRevTermType> value) {
        this.penRevTerm = value;
    }

    /**
     * Gets the value of the penRevTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PenRevTermUnitsType }{@code >}
     *     
     */
    public JAXBElement<PenRevTermUnitsType> getPenRevTermUnits() {
        return penRevTermUnits;
    }

    /**
     * Sets the value of the penRevTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PenRevTermUnitsType }{@code >}
     *     
     */
    public void setPenRevTermUnits(JAXBElement<PenRevTermUnitsType> value) {
        this.penRevTermUnits = value;
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
     * Gets the value of the lnCapRate property.
     * 
     * @return
     *     possible object is
     *     {@link LnCapRateType }
     *     
     */
    public LnCapRateType getLnCapRate() {
        return lnCapRate;
    }

    /**
     * Sets the value of the lnCapRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnCapRateType }
     *     
     */
    public void setLnCapRate(LnCapRateType value) {
        this.lnCapRate = value;
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
     * Gets the value of the prtRateChgNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrtRateChgNotCodeType }
     *     
     */
    public PrtRateChgNotCodeType getPrtRateChgNotCode() {
        return prtRateChgNotCode;
    }

    /**
     * Sets the value of the prtRateChgNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtRateChgNotCodeType }
     *     
     */
    public void setPrtRateChgNotCode(PrtRateChgNotCodeType value) {
        this.prtRateChgNotCode = value;
    }

    /**
     * Gets the value of the initARMNotType property.
     * 
     * @return
     *     possible object is
     *     {@link InitARMNotTypeType }
     *     
     */
    public InitARMNotTypeType getInitARMNotType() {
        return initARMNotType;
    }

    /**
     * Sets the value of the initARMNotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitARMNotTypeType }
     *     
     */
    public void setInitARMNotType(InitARMNotTypeType value) {
        this.initARMNotType = value;
    }

    /**
     * Gets the value of the daysInitARMNot property.
     * 
     * @return
     *     possible object is
     *     {@link DaysInitARMNotType }
     *     
     */
    public DaysInitARMNotType getDaysInitARMNot() {
        return daysInitARMNot;
    }

    /**
     * Sets the value of the daysInitARMNot property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysInitARMNotType }
     *     
     */
    public void setDaysInitARMNot(DaysInitARMNotType value) {
        this.daysInitARMNot = value;
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
     * Gets the value of the lastRePriceDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastRePriceDtType }
     *     
     */
    public LastRePriceDtType getLastRePriceDt() {
        return lastRePriceDt;
    }

    /**
     * Sets the value of the lastRePriceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastRePriceDtType }
     *     
     */
    public void setLastRePriceDt(LastRePriceDtType value) {
        this.lastRePriceDt = value;
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
     * Gets the value of the busDayRateRevType property.
     * 
     * @return
     *     possible object is
     *     {@link BusDayRateRevTypeType }
     *     
     */
    public BusDayRateRevTypeType getBusDayRateRevType() {
        return busDayRateRevType;
    }

    /**
     * Sets the value of the busDayRateRevType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusDayRateRevTypeType }
     *     
     */
    public void setBusDayRateRevType(BusDayRateRevTypeType value) {
        this.busDayRateRevType = value;
    }

    /**
     * Gets the value of the nonBusDayRateRevType property.
     * 
     * @return
     *     possible object is
     *     {@link NonBusDayRateRevTypeType }
     *     
     */
    public NonBusDayRateRevTypeType getNonBusDayRateRevType() {
        return nonBusDayRateRevType;
    }

    /**
     * Sets the value of the nonBusDayRateRevType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonBusDayRateRevTypeType }
     *     
     */
    public void setNonBusDayRateRevType(NonBusDayRateRevTypeType value) {
        this.nonBusDayRateRevType = value;
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
     * Gets the value of the initARMFixPeriodCnt property.
     * 
     * @return
     *     possible object is
     *     {@link TermCntType }
     *     
     */
    public TermCntType getInitARMFixPeriodCnt() {
        return initARMFixPeriodCnt;
    }

    /**
     * Sets the value of the initARMFixPeriodCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCntType }
     *     
     */
    public void setInitARMFixPeriodCnt(TermCntType value) {
        this.initARMFixPeriodCnt = value;
    }

    /**
     * Gets the value of the initARMFixPeriodUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TermUnitsType }
     *     
     */
    public TermUnitsType getInitARMFixPeriodUnits() {
        return initARMFixPeriodUnits;
    }

    /**
     * Sets the value of the initARMFixPeriodUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermUnitsType }
     *     
     */
    public void setInitARMFixPeriodUnits(TermUnitsType value) {
        this.initARMFixPeriodUnits = value;
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
     * Gets the value of the rateLookbackDays property.
     * 
     * @return
     *     possible object is
     *     {@link RateLookbackDaysType }
     *     
     */
    public RateLookbackDaysType getRateLookbackDays() {
        return rateLookbackDays;
    }

    /**
     * Sets the value of the rateLookbackDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateLookbackDaysType }
     *     
     */
    public void setRateLookbackDays(RateLookbackDaysType value) {
        this.rateLookbackDays = value;
    }

    /**
     * Gets the value of the rateLookbackType property.
     * 
     * @return
     *     possible object is
     *     {@link BusCalDayTypeType }
     *     
     */
    public BusCalDayTypeType getRateLookbackType() {
        return rateLookbackType;
    }

    /**
     * Sets the value of the rateLookbackType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusCalDayTypeType }
     *     
     */
    public void setRateLookbackType(BusCalDayTypeType value) {
        this.rateLookbackType = value;
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
     * Gets the value of the backdateRateChngType property.
     * 
     * @return
     *     possible object is
     *     {@link BackdateRateChngTypeType }
     *     
     */
    public BackdateRateChngTypeType getBackdateRateChngType() {
        return backdateRateChngType;
    }

    /**
     * Sets the value of the backdateRateChngType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackdateRateChngTypeType }
     *     
     */
    public void setBackdateRateChngType(BackdateRateChngTypeType value) {
        this.backdateRateChngType = value;
    }

    /**
     * Gets the value of the begFactorIdx property.
     * 
     * @return
     *     possible object is
     *     {@link FactorIdxType }
     *     
     */
    public FactorIdxType getBegFactorIdx() {
        return begFactorIdx;
    }

    /**
     * Sets the value of the begFactorIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactorIdxType }
     *     
     */
    public void setBegFactorIdx(FactorIdxType value) {
        this.begFactorIdx = value;
    }

    /**
     * Gets the value of the begFactorIdxDt property.
     * 
     * @return
     *     possible object is
     *     {@link BegFactorIdxDtType }
     *     
     */
    public BegFactorIdxDtType getBegFactorIdxDt() {
        return begFactorIdxDt;
    }

    /**
     * Sets the value of the begFactorIdxDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BegFactorIdxDtType }
     *     
     */
    public void setBegFactorIdxDt(BegFactorIdxDtType value) {
        this.begFactorIdxDt = value;
    }

    /**
     * Gets the value of the rateIdxType property.
     * 
     * @return
     *     possible object is
     *     {@link RateIdxTypeType }
     *     
     */
    public RateIdxTypeType getRateIdxType() {
        return rateIdxType;
    }

    /**
     * Sets the value of the rateIdxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIdxTypeType }
     *     
     */
    public void setRateIdxType(RateIdxTypeType value) {
        this.rateIdxType = value;
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
     * Gets the value of the permRateCapUp property.
     * 
     * @return
     *     possible object is
     *     {@link PermRateCapUpType }
     *     
     */
    public PermRateCapUpType getPermRateCapUp() {
        return permRateCapUp;
    }

    /**
     * Sets the value of the permRateCapUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermRateCapUpType }
     *     
     */
    public void setPermRateCapUp(PermRateCapUpType value) {
        this.permRateCapUp = value;
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
