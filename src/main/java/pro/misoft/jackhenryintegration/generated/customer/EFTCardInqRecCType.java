
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EFTCardInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardStat" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastActDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastActDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}EmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdEmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}SecdEmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardIssue" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardIssue_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardPINIssue" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardPINIssue_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTSCCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTSCCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTSCChgWav" type="{http://jackhenry.com/jxchange/TPG/2008}EFTSCChgWav_Type" minOccurs="0"/&gt;
 *         &lt;element name="AllowMaxPIN" type="{http://jackhenry.com/jxchange/TPG/2008}AllowMaxPIN_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvalidPINAttempts" type="{http://jackhenry.com/jxchange/TPG/2008}InvalidPINAttempts_Type" minOccurs="0"/&gt;
 *         &lt;element name="ATMCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ATMCrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ATMCrPostType" type="{http://jackhenry.com/jxchange/TPG/2008}ATMCrPostType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ATMCrPostLmt" type="{http://jackhenry.com/jxchange/TPG/2008}ATMCrPostLmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ATMCrPostPct" type="{http://jackhenry.com/jxchange/TPG/2008}ATMCrPostPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="ATMCrPostLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ATMCrPostLmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AllowFornTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}AllowFornTrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AllowFornTrnExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}AllowFornTrnExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AllowGlobalMain" type="{http://jackhenry.com/jxchange/TPG/2008}AllowGlobalMain_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardChgWavCnt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardChgWavCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardChgWavAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardChgWavAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardStyleId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardStyleId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardTelePINId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardTelePINId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="RmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAcctIdArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAcctIdArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardTrnArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardTrnArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EFTCardLmtCnt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardLmtCnt_Type" minOccurs="0"/&gt;
 *           &lt;element name="EFTCardAlertUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAlertUsrId_Type" minOccurs="0"/&gt;
 *           &lt;element name="EFTHotCardTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTHotCardTimeDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="EFTCardRejArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardRejArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ImgDepMemoPostType" type="{http://jackhenry.com/jxchange/TPG/2008}ImgDepMemoPostType_Type" minOccurs="0"/&gt;
 *             &lt;element name="ImgDepMemoPostPct" type="{http://jackhenry.com/jxchange/TPG/2008}ImgDepMemoPostPct_Type" minOccurs="0"/&gt;
 *             &lt;element name="ImgDepMemoLmtType" type="{http://jackhenry.com/jxchange/TPG/2008}ImgDepMemoLmtType_Type" minOccurs="0"/&gt;
 *             &lt;element name="ImgDepMemoPostDlyMax" type="{http://jackhenry.com/jxchange/TPG/2008}ImgDepMemoPostDlyMax_Type" minOccurs="0"/&gt;
 *             &lt;element name="EFTCardCmprmType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardCmprmType_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="EFTCardExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardExpDt_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="EFTCardStatType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardStatType_Type" minOccurs="0"/&gt;
 *                 &lt;element name="EFTCardOrigIssueDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardOrigIssueDt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="EFTCardLastIssueDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardLastIssueDt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="LastEFTCardActDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastEFTCardActDt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="LastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="LastStatDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastStatDt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="EFTCardAltExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="ATMDrPostLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ATMDrPostLmtAmt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="ATMDrLmtUseAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ATMDrLmtUseAmt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="POSDrPostLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}POSDrPostLmtAmt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="POSDrLmtUseAmt" type="{http://jackhenry.com/jxchange/TPG/2008}POSDrLmtUseAmt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="EFTTrnLmtCnt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnLmtCnt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="EFTTrnLmtUseCnt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnLmtUseCnt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="ATMDrTempPostLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ATMDrTempPostLmtAmt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="ATMDrTempPostStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="ATMDrTempPostEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="POSDrTempPostLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}POSDrTempPostLmtAmt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="POSDrTempPostStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="POSDrTempPostEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="x_EFTCardTrvInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_EFTCardTrvInfo_CType" minOccurs="0"/&gt;
 *                 &lt;element name="x_EFTCardCntryArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_EFTCardCntryArray_AType" minOccurs="0"/&gt;
 *                 &lt;element name="x_EFTCardBlkTrnArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_EFTCardBlkTrnArray_AType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="x_UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_UserDefInfoArray_AType" minOccurs="0"/&gt;
 *                   &lt;element name="x_EFTCardMailAddrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_EFTCardMailAddrInfo_CType" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="ImgDepMemoPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ImgDepMemoPostAmt_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="MerNotfOptInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}MerNotfOptInfoArray_AType" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;element name="CardStatRsnType" type="{http://jackhenry.com/jxchange/TPG/2008}CardStatRsnType_Type" minOccurs="0"/&gt;
 *                         &lt;sequence minOccurs="0"&gt;
 *                           &lt;element name="Ver_9" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_9_CType"/&gt;
 *                           &lt;element name="EFTCardPINOffSetId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardPINOffSetId_Type" minOccurs="0"/&gt;
 *                           &lt;sequence minOccurs="0"&gt;
 *                             &lt;element name="Ver_10" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_10_CType"/&gt;
 *                             &lt;element name="EFTCardBINCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBINCode_Type" minOccurs="0"/&gt;
 *                             &lt;element name="EFTCardBINDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBINDesc_Type" minOccurs="0"/&gt;
 *                             &lt;sequence minOccurs="0"&gt;
 *                               &lt;element name="Ver_11" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_11_CType"/&gt;
 *                               &lt;element name="EFTCardCat" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardCat_Type" minOccurs="0"/&gt;
 *                               &lt;element name="EFTCardImgId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardImgId_Type" minOccurs="0"/&gt;
 *                               &lt;element name="EFTCardImgDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardImgDesc_Type" minOccurs="0"/&gt;
 *                               &lt;element name="AllowDigitalOnlyType" type="{http://jackhenry.com/jxchange/TPG/2008}AllowDigitalOnlyType_Type" minOccurs="0"/&gt;
 *                               &lt;element name="AllowDigitalInActType" type="{http://jackhenry.com/jxchange/TPG/2008}AllowDigitalInActType_Type" minOccurs="0"/&gt;
 *                               &lt;sequence minOccurs="0"&gt;
 *                                 &lt;element name="Ver_12" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_12_CType"/&gt;
 *                                 &lt;element name="AFTDrTempPostLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AFTDrTempPostLmtAmt_Type" minOccurs="0"/&gt;
 *                                 &lt;element name="AFTDrTempPostStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *                                 &lt;element name="AFTDrTempPostEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *                                 &lt;element name="AFTDrPostLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AFTDrPostLmtAmt_Type" minOccurs="0"/&gt;
 *                                 &lt;element name="AFTDrLmtUseAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AFTDrLmtUseAmt_Type" minOccurs="0"/&gt;
 *                                 &lt;sequence minOccurs="0"&gt;
 *                                   &lt;element name="Ver_13" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_13_CType"/&gt;
 *                                   &lt;element name="EFTCardTempExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *                                   &lt;sequence minOccurs="0"&gt;
 *                                     &lt;element name="Ver_14" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_14_CType"/&gt;
 *                                     &lt;element name="EFTCardReadType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardReadType_Type" minOccurs="0"/&gt;
 *                                     &lt;sequence minOccurs="0"&gt;
 *                                       &lt;element name="Ver_15" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_15_CType"/&gt;
 *                                       &lt;element name="EFTSwchActType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTSwchActType_Type" minOccurs="0"/&gt;
 *                                       &lt;element name="CardRushOpt" type="{http://jackhenry.com/jxchange/TPG/2008}RushOpt_Type" minOccurs="0"/&gt;
 *                                       &lt;element name="CardRushMthdCode" type="{http://jackhenry.com/jxchange/TPG/2008}CardRushMthdCode_Type" minOccurs="0"/&gt;
 *                                       &lt;element name="CardRushMthdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CardRushMthdDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardInqRec_CType", propOrder = {
    "custId",
    "eftCardStat",
    "eftCardStatDesc",
    "lastActDt",
    "embosName",
    "secdEmbosName",
    "eftCardIssue",
    "eftCardPINIssue",
    "eftscCode",
    "eftscChgWav",
    "allowMaxPIN",
    "invalidPINAttempts",
    "atmCrPostAmt",
    "atmCrPostType",
    "atmCrPostLmt",
    "atmCrPostPct",
    "atmCrPostLmtAmt",
    "allowFornTrnType",
    "allowFornTrnExpDt",
    "allowGlobalMain",
    "taxId",
    "eftCardChgWavCnt",
    "eftCardChgWavAmt",
    "eftCardStyleId",
    "eftCardTelePINId",
    "eftCardProdCode",
    "eftCardProdDesc",
    "addr",
    "rmkArray",
    "phoneArray",
    "emailArray",
    "eftCardAcctIdArray",
    "eftCardTrnArray",
    "custom",
    "ver1",
    "eftCardLmtCnt",
    "eftCardAlertUsrId",
    "eftHotCardTimeDt",
    "eftCardRejArray",
    "ver2",
    "imgDepMemoPostType",
    "imgDepMemoPostPct",
    "imgDepMemoLmtType",
    "imgDepMemoPostDlyMax",
    "eftCardCmprmType",
    "ver3",
    "eftCardExpDt",
    "ver4",
    "eftCardStatType",
    "eftCardOrigIssueDt",
    "eftCardLastIssueDt",
    "lastEFTCardActDt",
    "lastMainDt",
    "lastStatDt",
    "eftCardAltExpDt",
    "atmDrPostLmtAmt",
    "atmDrLmtUseAmt",
    "posDrPostLmtAmt",
    "posDrLmtUseAmt",
    "eftTrnLmtCnt",
    "eftTrnLmtUseCnt",
    "atmDrTempPostLmtAmt",
    "atmDrTempPostStartDt",
    "atmDrTempPostEndDt",
    "posDrTempPostLmtAmt",
    "posDrTempPostStartDt",
    "posDrTempPostEndDt",
    "xeftCardTrvInfo",
    "xeftCardCntryArray",
    "xeftCardBlkTrnArray",
    "ver5",
    "xUserDefInfoArray",
    "xeftCardMailAddrInfo",
    "ver6",
    "imgDepMemoPostAmt",
    "ver7",
    "merNotfOptInfoArray",
    "ver8",
    "cardStatRsnType",
    "ver9",
    "eftCardPINOffSetId",
    "ver10",
    "eftCardBINCode",
    "eftCardBINDesc",
    "ver11",
    "eftCardCat",
    "eftCardImgId",
    "eftCardImgDesc",
    "allowDigitalOnlyType",
    "allowDigitalInActType",
    "ver12",
    "aftDrTempPostLmtAmt",
    "aftDrTempPostStartDt",
    "aftDrTempPostEndDt",
    "aftDrPostLmtAmt",
    "aftDrLmtUseAmt",
    "ver13",
    "eftCardTempExpDt",
    "ver14",
    "eftCardReadType",
    "ver15",
    "eftSwchActType",
    "cardRushOpt",
    "cardRushMthdCode",
    "cardRushMthdDesc",
    "ver16",
    "any"
})
public class EFTCardInqRecCType {

    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "EFTCardStat")
    protected EFTCardStatType eftCardStat;
    @XmlElement(name = "EFTCardStatDesc")
    protected EFTCardStatDescType eftCardStatDesc;
    @XmlElement(name = "LastActDt")
    protected LastActDtType lastActDt;
    @XmlElement(name = "EmbosName")
    protected EmbosNameType embosName;
    @XmlElement(name = "SecdEmbosName")
    protected SecdEmbosNameType secdEmbosName;
    @XmlElement(name = "EFTCardIssue")
    protected EFTCardIssueType eftCardIssue;
    @XmlElement(name = "EFTCardPINIssue")
    protected EFTCardPINIssueType eftCardPINIssue;
    @XmlElement(name = "EFTSCCode")
    protected EFTSCCodeType eftscCode;
    @XmlElement(name = "EFTSCChgWav")
    protected EFTSCChgWavType eftscChgWav;
    @XmlElement(name = "AllowMaxPIN")
    protected AllowMaxPINType allowMaxPIN;
    @XmlElement(name = "InvalidPINAttempts")
    protected InvalidPINAttemptsType invalidPINAttempts;
    @XmlElement(name = "ATMCrPostAmt")
    protected ATMCrPostAmtType atmCrPostAmt;
    @XmlElement(name = "ATMCrPostType")
    protected ATMCrPostTypeType atmCrPostType;
    @XmlElement(name = "ATMCrPostLmt")
    protected ATMCrPostLmtType atmCrPostLmt;
    @XmlElement(name = "ATMCrPostPct")
    protected ATMCrPostPctType atmCrPostPct;
    @XmlElement(name = "ATMCrPostLmtAmt")
    protected ATMCrPostLmtAmtType atmCrPostLmtAmt;
    @XmlElement(name = "AllowFornTrnType")
    protected AllowFornTrnTypeType allowFornTrnType;
    @XmlElement(name = "AllowFornTrnExpDt")
    protected AllowFornTrnExpDtType allowFornTrnExpDt;
    @XmlElement(name = "AllowGlobalMain")
    protected AllowGlobalMainType allowGlobalMain;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "EFTCardChgWavCnt")
    protected EFTCardChgWavCntType eftCardChgWavCnt;
    @XmlElement(name = "EFTCardChgWavAmt")
    protected EFTCardChgWavAmtType eftCardChgWavAmt;
    @XmlElement(name = "EFTCardStyleId")
    protected EFTCardStyleIdType eftCardStyleId;
    @XmlElement(name = "EFTCardTelePINId")
    protected EFTCardTelePINIdType eftCardTelePINId;
    @XmlElement(name = "EFTCardProdCode")
    protected EFTCardProdCodeType eftCardProdCode;
    @XmlElement(name = "EFTCardProdDesc")
    protected EFTCardProdDescType eftCardProdDesc;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "RmkArray")
    protected RmkAType rmkArray;
    @XmlElement(name = "PhoneArray")
    protected PhoneArrayAType phoneArray;
    @XmlElement(name = "EmailArray")
    protected EmailArrayAType emailArray;
    @XmlElement(name = "EFTCardAcctIdArray")
    protected EFTCardAcctIdArrayAType eftCardAcctIdArray;
    @XmlElement(name = "EFTCardTrnArray")
    protected EFTCardTrnArrayAType eftCardTrnArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EFTCardLmtCnt")
    protected EFTCardLmtCntType eftCardLmtCnt;
    @XmlElement(name = "EFTCardAlertUsrId")
    protected EFTCardAlertUsrIdType eftCardAlertUsrId;
    @XmlElement(name = "EFTHotCardTimeDt")
    protected EFTHotCardTimeDtType eftHotCardTimeDt;
    @XmlElement(name = "EFTCardRejArray")
    protected EFTCardRejArrayAType eftCardRejArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ImgDepMemoPostType")
    protected ImgDepMemoPostTypeType imgDepMemoPostType;
    @XmlElement(name = "ImgDepMemoPostPct")
    protected ImgDepMemoPostPctType imgDepMemoPostPct;
    @XmlElement(name = "ImgDepMemoLmtType")
    protected ImgDepMemoLmtTypeType imgDepMemoLmtType;
    @XmlElement(name = "ImgDepMemoPostDlyMax")
    protected ImgDepMemoPostDlyMaxType imgDepMemoPostDlyMax;
    @XmlElement(name = "EFTCardCmprmType")
    protected EFTCardCmprmTypeType eftCardCmprmType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "EFTCardExpDt")
    protected EFTCardExpDtType eftCardExpDt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "EFTCardStatType")
    protected EFTCardStatTypeType eftCardStatType;
    @XmlElement(name = "EFTCardOrigIssueDt")
    protected EFTCardOrigIssueDtType eftCardOrigIssueDt;
    @XmlElement(name = "EFTCardLastIssueDt")
    protected EFTCardLastIssueDtType eftCardLastIssueDt;
    @XmlElement(name = "LastEFTCardActDt")
    protected LastEFTCardActDtType lastEFTCardActDt;
    @XmlElement(name = "LastMainDt")
    protected LastMainDtType lastMainDt;
    @XmlElement(name = "LastStatDt")
    protected LastStatDtType lastStatDt;
    @XmlElement(name = "EFTCardAltExpDt")
    protected ExpDtType eftCardAltExpDt;
    @XmlElement(name = "ATMDrPostLmtAmt")
    protected ATMDrPostLmtAmtType atmDrPostLmtAmt;
    @XmlElement(name = "ATMDrLmtUseAmt")
    protected ATMDrLmtUseAmtType atmDrLmtUseAmt;
    @XmlElement(name = "POSDrPostLmtAmt")
    protected POSDrPostLmtAmtType posDrPostLmtAmt;
    @XmlElement(name = "POSDrLmtUseAmt")
    protected POSDrLmtUseAmtType posDrLmtUseAmt;
    @XmlElement(name = "EFTTrnLmtCnt")
    protected EFTTrnLmtCntType eftTrnLmtCnt;
    @XmlElement(name = "EFTTrnLmtUseCnt")
    protected EFTTrnLmtUseCntType eftTrnLmtUseCnt;
    @XmlElement(name = "ATMDrTempPostLmtAmt")
    protected ATMDrTempPostLmtAmtType atmDrTempPostLmtAmt;
    @XmlElement(name = "ATMDrTempPostStartDt")
    protected StartDtType atmDrTempPostStartDt;
    @XmlElement(name = "ATMDrTempPostEndDt")
    protected EndDtType atmDrTempPostEndDt;
    @XmlElement(name = "POSDrTempPostLmtAmt")
    protected POSDrTempPostLmtAmtType posDrTempPostLmtAmt;
    @XmlElement(name = "POSDrTempPostStartDt")
    protected StartDtType posDrTempPostStartDt;
    @XmlElement(name = "POSDrTempPostEndDt")
    protected EndDtType posDrTempPostEndDt;
    @XmlElement(name = "x_EFTCardTrvInfo")
    protected XEFTCardTrvInfoCType xeftCardTrvInfo;
    @XmlElement(name = "x_EFTCardCntryArray")
    protected XEFTCardCntryArrayAType xeftCardCntryArray;
    @XmlElement(name = "x_EFTCardBlkTrnArray")
    protected XEFTCardBlkTrnArrayAType xeftCardBlkTrnArray;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "x_UserDefInfoArray")
    protected XUserDefInfoArrayAType xUserDefInfoArray;
    @XmlElement(name = "x_EFTCardMailAddrInfo")
    protected XEFTCardMailAddrInfoCType xeftCardMailAddrInfo;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "ImgDepMemoPostAmt")
    protected ImgDepMemoPostAmtType imgDepMemoPostAmt;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "MerNotfOptInfoArray")
    protected MerNotfOptInfoArrayAType merNotfOptInfoArray;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlElement(name = "CardStatRsnType")
    protected CardStatRsnTypeType cardStatRsnType;
    @XmlElement(name = "Ver_9")
    protected Ver9CType ver9;
    @XmlElement(name = "EFTCardPINOffSetId")
    protected EFTCardPINOffSetIdType eftCardPINOffSetId;
    @XmlElement(name = "Ver_10")
    protected Ver10CType ver10;
    @XmlElement(name = "EFTCardBINCode")
    protected EFTCardBINCodeType eftCardBINCode;
    @XmlElement(name = "EFTCardBINDesc")
    protected EFTCardBINDescType eftCardBINDesc;
    @XmlElement(name = "Ver_11")
    protected Ver11CType ver11;
    @XmlElement(name = "EFTCardCat")
    protected EFTCardCatType eftCardCat;
    @XmlElement(name = "EFTCardImgId")
    protected EFTCardImgIdType eftCardImgId;
    @XmlElement(name = "EFTCardImgDesc")
    protected EFTCardImgDescType eftCardImgDesc;
    @XmlElement(name = "AllowDigitalOnlyType")
    protected AllowDigitalOnlyTypeType allowDigitalOnlyType;
    @XmlElement(name = "AllowDigitalInActType")
    protected AllowDigitalInActTypeType allowDigitalInActType;
    @XmlElement(name = "Ver_12")
    protected Ver12CType ver12;
    @XmlElement(name = "AFTDrTempPostLmtAmt")
    protected AFTDrTempPostLmtAmtType aftDrTempPostLmtAmt;
    @XmlElement(name = "AFTDrTempPostStartDt")
    protected StartDtType aftDrTempPostStartDt;
    @XmlElement(name = "AFTDrTempPostEndDt")
    protected EndDtType aftDrTempPostEndDt;
    @XmlElement(name = "AFTDrPostLmtAmt")
    protected AFTDrPostLmtAmtType aftDrPostLmtAmt;
    @XmlElement(name = "AFTDrLmtUseAmt")
    protected AFTDrLmtUseAmtType aftDrLmtUseAmt;
    @XmlElement(name = "Ver_13")
    protected Ver13CType ver13;
    @XmlElement(name = "EFTCardTempExpDt")
    protected ExpDtType eftCardTempExpDt;
    @XmlElement(name = "Ver_14")
    protected Ver14CType ver14;
    @XmlElement(name = "EFTCardReadType")
    protected EFTCardReadTypeType eftCardReadType;
    @XmlElement(name = "Ver_15")
    protected Ver15CType ver15;
    @XmlElement(name = "EFTSwchActType")
    protected EFTSwchActTypeType eftSwchActType;
    @XmlElement(name = "CardRushOpt")
    protected RushOptType cardRushOpt;
    @XmlElement(name = "CardRushMthdCode")
    protected CardRushMthdCodeType cardRushMthdCode;
    @XmlElement(name = "CardRushMthdDesc")
    protected CardRushMthdDescType cardRushMthdDesc;
    @XmlElement(name = "Ver_16")
    protected Ver16CType ver16;
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
     * Gets the value of the eftCardStat property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardStatType }
     *     
     */
    public EFTCardStatType getEFTCardStat() {
        return eftCardStat;
    }

    /**
     * Sets the value of the eftCardStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardStatType }
     *     
     */
    public void setEFTCardStat(EFTCardStatType value) {
        this.eftCardStat = value;
    }

    /**
     * Gets the value of the eftCardStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardStatDescType }
     *     
     */
    public EFTCardStatDescType getEFTCardStatDesc() {
        return eftCardStatDesc;
    }

    /**
     * Sets the value of the eftCardStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardStatDescType }
     *     
     */
    public void setEFTCardStatDesc(EFTCardStatDescType value) {
        this.eftCardStatDesc = value;
    }

    /**
     * Gets the value of the lastActDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastActDtType }
     *     
     */
    public LastActDtType getLastActDt() {
        return lastActDt;
    }

    /**
     * Sets the value of the lastActDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastActDtType }
     *     
     */
    public void setLastActDt(LastActDtType value) {
        this.lastActDt = value;
    }

    /**
     * Gets the value of the embosName property.
     * 
     * @return
     *     possible object is
     *     {@link EmbosNameType }
     *     
     */
    public EmbosNameType getEmbosName() {
        return embosName;
    }

    /**
     * Sets the value of the embosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbosNameType }
     *     
     */
    public void setEmbosName(EmbosNameType value) {
        this.embosName = value;
    }

    /**
     * Gets the value of the secdEmbosName property.
     * 
     * @return
     *     possible object is
     *     {@link SecdEmbosNameType }
     *     
     */
    public SecdEmbosNameType getSecdEmbosName() {
        return secdEmbosName;
    }

    /**
     * Sets the value of the secdEmbosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecdEmbosNameType }
     *     
     */
    public void setSecdEmbosName(SecdEmbosNameType value) {
        this.secdEmbosName = value;
    }

    /**
     * Gets the value of the eftCardIssue property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardIssueType }
     *     
     */
    public EFTCardIssueType getEFTCardIssue() {
        return eftCardIssue;
    }

    /**
     * Sets the value of the eftCardIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardIssueType }
     *     
     */
    public void setEFTCardIssue(EFTCardIssueType value) {
        this.eftCardIssue = value;
    }

    /**
     * Gets the value of the eftCardPINIssue property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardPINIssueType }
     *     
     */
    public EFTCardPINIssueType getEFTCardPINIssue() {
        return eftCardPINIssue;
    }

    /**
     * Sets the value of the eftCardPINIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardPINIssueType }
     *     
     */
    public void setEFTCardPINIssue(EFTCardPINIssueType value) {
        this.eftCardPINIssue = value;
    }

    /**
     * Gets the value of the eftscCode property.
     * 
     * @return
     *     possible object is
     *     {@link EFTSCCodeType }
     *     
     */
    public EFTSCCodeType getEFTSCCode() {
        return eftscCode;
    }

    /**
     * Sets the value of the eftscCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTSCCodeType }
     *     
     */
    public void setEFTSCCode(EFTSCCodeType value) {
        this.eftscCode = value;
    }

    /**
     * Gets the value of the eftscChgWav property.
     * 
     * @return
     *     possible object is
     *     {@link EFTSCChgWavType }
     *     
     */
    public EFTSCChgWavType getEFTSCChgWav() {
        return eftscChgWav;
    }

    /**
     * Sets the value of the eftscChgWav property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTSCChgWavType }
     *     
     */
    public void setEFTSCChgWav(EFTSCChgWavType value) {
        this.eftscChgWav = value;
    }

    /**
     * Gets the value of the allowMaxPIN property.
     * 
     * @return
     *     possible object is
     *     {@link AllowMaxPINType }
     *     
     */
    public AllowMaxPINType getAllowMaxPIN() {
        return allowMaxPIN;
    }

    /**
     * Sets the value of the allowMaxPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowMaxPINType }
     *     
     */
    public void setAllowMaxPIN(AllowMaxPINType value) {
        this.allowMaxPIN = value;
    }

    /**
     * Gets the value of the invalidPINAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidPINAttemptsType }
     *     
     */
    public InvalidPINAttemptsType getInvalidPINAttempts() {
        return invalidPINAttempts;
    }

    /**
     * Sets the value of the invalidPINAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidPINAttemptsType }
     *     
     */
    public void setInvalidPINAttempts(InvalidPINAttemptsType value) {
        this.invalidPINAttempts = value;
    }

    /**
     * Gets the value of the atmCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCrPostAmtType }
     *     
     */
    public ATMCrPostAmtType getATMCrPostAmt() {
        return atmCrPostAmt;
    }

    /**
     * Sets the value of the atmCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCrPostAmtType }
     *     
     */
    public void setATMCrPostAmt(ATMCrPostAmtType value) {
        this.atmCrPostAmt = value;
    }

    /**
     * Gets the value of the atmCrPostType property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCrPostTypeType }
     *     
     */
    public ATMCrPostTypeType getATMCrPostType() {
        return atmCrPostType;
    }

    /**
     * Sets the value of the atmCrPostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCrPostTypeType }
     *     
     */
    public void setATMCrPostType(ATMCrPostTypeType value) {
        this.atmCrPostType = value;
    }

    /**
     * Gets the value of the atmCrPostLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCrPostLmtType }
     *     
     */
    public ATMCrPostLmtType getATMCrPostLmt() {
        return atmCrPostLmt;
    }

    /**
     * Sets the value of the atmCrPostLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCrPostLmtType }
     *     
     */
    public void setATMCrPostLmt(ATMCrPostLmtType value) {
        this.atmCrPostLmt = value;
    }

    /**
     * Gets the value of the atmCrPostPct property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCrPostPctType }
     *     
     */
    public ATMCrPostPctType getATMCrPostPct() {
        return atmCrPostPct;
    }

    /**
     * Sets the value of the atmCrPostPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCrPostPctType }
     *     
     */
    public void setATMCrPostPct(ATMCrPostPctType value) {
        this.atmCrPostPct = value;
    }

    /**
     * Gets the value of the atmCrPostLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCrPostLmtAmtType }
     *     
     */
    public ATMCrPostLmtAmtType getATMCrPostLmtAmt() {
        return atmCrPostLmtAmt;
    }

    /**
     * Sets the value of the atmCrPostLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCrPostLmtAmtType }
     *     
     */
    public void setATMCrPostLmtAmt(ATMCrPostLmtAmtType value) {
        this.atmCrPostLmtAmt = value;
    }

    /**
     * Gets the value of the allowFornTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link AllowFornTrnTypeType }
     *     
     */
    public AllowFornTrnTypeType getAllowFornTrnType() {
        return allowFornTrnType;
    }

    /**
     * Sets the value of the allowFornTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowFornTrnTypeType }
     *     
     */
    public void setAllowFornTrnType(AllowFornTrnTypeType value) {
        this.allowFornTrnType = value;
    }

    /**
     * Gets the value of the allowFornTrnExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link AllowFornTrnExpDtType }
     *     
     */
    public AllowFornTrnExpDtType getAllowFornTrnExpDt() {
        return allowFornTrnExpDt;
    }

    /**
     * Sets the value of the allowFornTrnExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowFornTrnExpDtType }
     *     
     */
    public void setAllowFornTrnExpDt(AllowFornTrnExpDtType value) {
        this.allowFornTrnExpDt = value;
    }

    /**
     * Gets the value of the allowGlobalMain property.
     * 
     * @return
     *     possible object is
     *     {@link AllowGlobalMainType }
     *     
     */
    public AllowGlobalMainType getAllowGlobalMain() {
        return allowGlobalMain;
    }

    /**
     * Sets the value of the allowGlobalMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowGlobalMainType }
     *     
     */
    public void setAllowGlobalMain(AllowGlobalMainType value) {
        this.allowGlobalMain = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setTaxId(TaxIdType value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the eftCardChgWavCnt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardChgWavCntType }
     *     
     */
    public EFTCardChgWavCntType getEFTCardChgWavCnt() {
        return eftCardChgWavCnt;
    }

    /**
     * Sets the value of the eftCardChgWavCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardChgWavCntType }
     *     
     */
    public void setEFTCardChgWavCnt(EFTCardChgWavCntType value) {
        this.eftCardChgWavCnt = value;
    }

    /**
     * Gets the value of the eftCardChgWavAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardChgWavAmtType }
     *     
     */
    public EFTCardChgWavAmtType getEFTCardChgWavAmt() {
        return eftCardChgWavAmt;
    }

    /**
     * Sets the value of the eftCardChgWavAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardChgWavAmtType }
     *     
     */
    public void setEFTCardChgWavAmt(EFTCardChgWavAmtType value) {
        this.eftCardChgWavAmt = value;
    }

    /**
     * Gets the value of the eftCardStyleId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardStyleIdType }
     *     
     */
    public EFTCardStyleIdType getEFTCardStyleId() {
        return eftCardStyleId;
    }

    /**
     * Sets the value of the eftCardStyleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardStyleIdType }
     *     
     */
    public void setEFTCardStyleId(EFTCardStyleIdType value) {
        this.eftCardStyleId = value;
    }

    /**
     * Gets the value of the eftCardTelePINId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardTelePINIdType }
     *     
     */
    public EFTCardTelePINIdType getEFTCardTelePINId() {
        return eftCardTelePINId;
    }

    /**
     * Sets the value of the eftCardTelePINId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardTelePINIdType }
     *     
     */
    public void setEFTCardTelePINId(EFTCardTelePINIdType value) {
        this.eftCardTelePINId = value;
    }

    /**
     * Gets the value of the eftCardProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardProdCodeType }
     *     
     */
    public EFTCardProdCodeType getEFTCardProdCode() {
        return eftCardProdCode;
    }

    /**
     * Sets the value of the eftCardProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardProdCodeType }
     *     
     */
    public void setEFTCardProdCode(EFTCardProdCodeType value) {
        this.eftCardProdCode = value;
    }

    /**
     * Gets the value of the eftCardProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardProdDescType }
     *     
     */
    public EFTCardProdDescType getEFTCardProdDesc() {
        return eftCardProdDesc;
    }

    /**
     * Sets the value of the eftCardProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardProdDescType }
     *     
     */
    public void setEFTCardProdDesc(EFTCardProdDescType value) {
        this.eftCardProdDesc = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setAddr(AddrCType value) {
        this.addr = value;
    }

    /**
     * Gets the value of the rmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getRmkArray() {
        return rmkArray;
    }

    /**
     * Sets the value of the rmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setRmkArray(RmkAType value) {
        this.rmkArray = value;
    }

    /**
     * Gets the value of the phoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getPhoneArray() {
        return phoneArray;
    }

    /**
     * Sets the value of the phoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setPhoneArray(PhoneArrayAType value) {
        this.phoneArray = value;
    }

    /**
     * Gets the value of the emailArray property.
     * 
     * @return
     *     possible object is
     *     {@link EmailArrayAType }
     *     
     */
    public EmailArrayAType getEmailArray() {
        return emailArray;
    }

    /**
     * Sets the value of the emailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailArrayAType }
     *     
     */
    public void setEmailArray(EmailArrayAType value) {
        this.emailArray = value;
    }

    /**
     * Gets the value of the eftCardAcctIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAcctIdArrayAType }
     *     
     */
    public EFTCardAcctIdArrayAType getEFTCardAcctIdArray() {
        return eftCardAcctIdArray;
    }

    /**
     * Sets the value of the eftCardAcctIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAcctIdArrayAType }
     *     
     */
    public void setEFTCardAcctIdArray(EFTCardAcctIdArrayAType value) {
        this.eftCardAcctIdArray = value;
    }

    /**
     * Gets the value of the eftCardTrnArray property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardTrnArrayAType }
     *     
     */
    public EFTCardTrnArrayAType getEFTCardTrnArray() {
        return eftCardTrnArray;
    }

    /**
     * Sets the value of the eftCardTrnArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardTrnArrayAType }
     *     
     */
    public void setEFTCardTrnArray(EFTCardTrnArrayAType value) {
        this.eftCardTrnArray = value;
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
     * Gets the value of the eftCardLmtCnt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardLmtCntType }
     *     
     */
    public EFTCardLmtCntType getEFTCardLmtCnt() {
        return eftCardLmtCnt;
    }

    /**
     * Sets the value of the eftCardLmtCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardLmtCntType }
     *     
     */
    public void setEFTCardLmtCnt(EFTCardLmtCntType value) {
        this.eftCardLmtCnt = value;
    }

    /**
     * Gets the value of the eftCardAlertUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAlertUsrIdType }
     *     
     */
    public EFTCardAlertUsrIdType getEFTCardAlertUsrId() {
        return eftCardAlertUsrId;
    }

    /**
     * Sets the value of the eftCardAlertUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAlertUsrIdType }
     *     
     */
    public void setEFTCardAlertUsrId(EFTCardAlertUsrIdType value) {
        this.eftCardAlertUsrId = value;
    }

    /**
     * Gets the value of the eftHotCardTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTHotCardTimeDtType }
     *     
     */
    public EFTHotCardTimeDtType getEFTHotCardTimeDt() {
        return eftHotCardTimeDt;
    }

    /**
     * Sets the value of the eftHotCardTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTHotCardTimeDtType }
     *     
     */
    public void setEFTHotCardTimeDt(EFTHotCardTimeDtType value) {
        this.eftHotCardTimeDt = value;
    }

    /**
     * Gets the value of the eftCardRejArray property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardRejArrayAType }
     *     
     */
    public EFTCardRejArrayAType getEFTCardRejArray() {
        return eftCardRejArray;
    }

    /**
     * Sets the value of the eftCardRejArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardRejArrayAType }
     *     
     */
    public void setEFTCardRejArray(EFTCardRejArrayAType value) {
        this.eftCardRejArray = value;
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
     * Gets the value of the imgDepMemoPostType property.
     * 
     * @return
     *     possible object is
     *     {@link ImgDepMemoPostTypeType }
     *     
     */
    public ImgDepMemoPostTypeType getImgDepMemoPostType() {
        return imgDepMemoPostType;
    }

    /**
     * Sets the value of the imgDepMemoPostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgDepMemoPostTypeType }
     *     
     */
    public void setImgDepMemoPostType(ImgDepMemoPostTypeType value) {
        this.imgDepMemoPostType = value;
    }

    /**
     * Gets the value of the imgDepMemoPostPct property.
     * 
     * @return
     *     possible object is
     *     {@link ImgDepMemoPostPctType }
     *     
     */
    public ImgDepMemoPostPctType getImgDepMemoPostPct() {
        return imgDepMemoPostPct;
    }

    /**
     * Sets the value of the imgDepMemoPostPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgDepMemoPostPctType }
     *     
     */
    public void setImgDepMemoPostPct(ImgDepMemoPostPctType value) {
        this.imgDepMemoPostPct = value;
    }

    /**
     * Gets the value of the imgDepMemoLmtType property.
     * 
     * @return
     *     possible object is
     *     {@link ImgDepMemoLmtTypeType }
     *     
     */
    public ImgDepMemoLmtTypeType getImgDepMemoLmtType() {
        return imgDepMemoLmtType;
    }

    /**
     * Sets the value of the imgDepMemoLmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgDepMemoLmtTypeType }
     *     
     */
    public void setImgDepMemoLmtType(ImgDepMemoLmtTypeType value) {
        this.imgDepMemoLmtType = value;
    }

    /**
     * Gets the value of the imgDepMemoPostDlyMax property.
     * 
     * @return
     *     possible object is
     *     {@link ImgDepMemoPostDlyMaxType }
     *     
     */
    public ImgDepMemoPostDlyMaxType getImgDepMemoPostDlyMax() {
        return imgDepMemoPostDlyMax;
    }

    /**
     * Sets the value of the imgDepMemoPostDlyMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgDepMemoPostDlyMaxType }
     *     
     */
    public void setImgDepMemoPostDlyMax(ImgDepMemoPostDlyMaxType value) {
        this.imgDepMemoPostDlyMax = value;
    }

    /**
     * Gets the value of the eftCardCmprmType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardCmprmTypeType }
     *     
     */
    public EFTCardCmprmTypeType getEFTCardCmprmType() {
        return eftCardCmprmType;
    }

    /**
     * Sets the value of the eftCardCmprmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardCmprmTypeType }
     *     
     */
    public void setEFTCardCmprmType(EFTCardCmprmTypeType value) {
        this.eftCardCmprmType = value;
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
     * Gets the value of the eftCardExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardExpDtType }
     *     
     */
    public EFTCardExpDtType getEFTCardExpDt() {
        return eftCardExpDt;
    }

    /**
     * Sets the value of the eftCardExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardExpDtType }
     *     
     */
    public void setEFTCardExpDt(EFTCardExpDtType value) {
        this.eftCardExpDt = value;
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
     * Gets the value of the eftCardStatType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardStatTypeType }
     *     
     */
    public EFTCardStatTypeType getEFTCardStatType() {
        return eftCardStatType;
    }

    /**
     * Sets the value of the eftCardStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardStatTypeType }
     *     
     */
    public void setEFTCardStatType(EFTCardStatTypeType value) {
        this.eftCardStatType = value;
    }

    /**
     * Gets the value of the eftCardOrigIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardOrigIssueDtType }
     *     
     */
    public EFTCardOrigIssueDtType getEFTCardOrigIssueDt() {
        return eftCardOrigIssueDt;
    }

    /**
     * Sets the value of the eftCardOrigIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardOrigIssueDtType }
     *     
     */
    public void setEFTCardOrigIssueDt(EFTCardOrigIssueDtType value) {
        this.eftCardOrigIssueDt = value;
    }

    /**
     * Gets the value of the eftCardLastIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardLastIssueDtType }
     *     
     */
    public EFTCardLastIssueDtType getEFTCardLastIssueDt() {
        return eftCardLastIssueDt;
    }

    /**
     * Sets the value of the eftCardLastIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardLastIssueDtType }
     *     
     */
    public void setEFTCardLastIssueDt(EFTCardLastIssueDtType value) {
        this.eftCardLastIssueDt = value;
    }

    /**
     * Gets the value of the lastEFTCardActDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastEFTCardActDtType }
     *     
     */
    public LastEFTCardActDtType getLastEFTCardActDt() {
        return lastEFTCardActDt;
    }

    /**
     * Sets the value of the lastEFTCardActDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastEFTCardActDtType }
     *     
     */
    public void setLastEFTCardActDt(LastEFTCardActDtType value) {
        this.lastEFTCardActDt = value;
    }

    /**
     * Gets the value of the lastMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastMainDtType }
     *     
     */
    public LastMainDtType getLastMainDt() {
        return lastMainDt;
    }

    /**
     * Sets the value of the lastMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastMainDtType }
     *     
     */
    public void setLastMainDt(LastMainDtType value) {
        this.lastMainDt = value;
    }

    /**
     * Gets the value of the lastStatDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastStatDtType }
     *     
     */
    public LastStatDtType getLastStatDt() {
        return lastStatDt;
    }

    /**
     * Sets the value of the lastStatDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastStatDtType }
     *     
     */
    public void setLastStatDt(LastStatDtType value) {
        this.lastStatDt = value;
    }

    /**
     * Gets the value of the eftCardAltExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getEFTCardAltExpDt() {
        return eftCardAltExpDt;
    }

    /**
     * Sets the value of the eftCardAltExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setEFTCardAltExpDt(ExpDtType value) {
        this.eftCardAltExpDt = value;
    }

    /**
     * Gets the value of the atmDrPostLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDrPostLmtAmtType }
     *     
     */
    public ATMDrPostLmtAmtType getATMDrPostLmtAmt() {
        return atmDrPostLmtAmt;
    }

    /**
     * Sets the value of the atmDrPostLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDrPostLmtAmtType }
     *     
     */
    public void setATMDrPostLmtAmt(ATMDrPostLmtAmtType value) {
        this.atmDrPostLmtAmt = value;
    }

    /**
     * Gets the value of the atmDrLmtUseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDrLmtUseAmtType }
     *     
     */
    public ATMDrLmtUseAmtType getATMDrLmtUseAmt() {
        return atmDrLmtUseAmt;
    }

    /**
     * Sets the value of the atmDrLmtUseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDrLmtUseAmtType }
     *     
     */
    public void setATMDrLmtUseAmt(ATMDrLmtUseAmtType value) {
        this.atmDrLmtUseAmt = value;
    }

    /**
     * Gets the value of the posDrPostLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link POSDrPostLmtAmtType }
     *     
     */
    public POSDrPostLmtAmtType getPOSDrPostLmtAmt() {
        return posDrPostLmtAmt;
    }

    /**
     * Sets the value of the posDrPostLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSDrPostLmtAmtType }
     *     
     */
    public void setPOSDrPostLmtAmt(POSDrPostLmtAmtType value) {
        this.posDrPostLmtAmt = value;
    }

    /**
     * Gets the value of the posDrLmtUseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link POSDrLmtUseAmtType }
     *     
     */
    public POSDrLmtUseAmtType getPOSDrLmtUseAmt() {
        return posDrLmtUseAmt;
    }

    /**
     * Sets the value of the posDrLmtUseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSDrLmtUseAmtType }
     *     
     */
    public void setPOSDrLmtUseAmt(POSDrLmtUseAmtType value) {
        this.posDrLmtUseAmt = value;
    }

    /**
     * Gets the value of the eftTrnLmtCnt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnLmtCntType }
     *     
     */
    public EFTTrnLmtCntType getEFTTrnLmtCnt() {
        return eftTrnLmtCnt;
    }

    /**
     * Sets the value of the eftTrnLmtCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnLmtCntType }
     *     
     */
    public void setEFTTrnLmtCnt(EFTTrnLmtCntType value) {
        this.eftTrnLmtCnt = value;
    }

    /**
     * Gets the value of the eftTrnLmtUseCnt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnLmtUseCntType }
     *     
     */
    public EFTTrnLmtUseCntType getEFTTrnLmtUseCnt() {
        return eftTrnLmtUseCnt;
    }

    /**
     * Sets the value of the eftTrnLmtUseCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnLmtUseCntType }
     *     
     */
    public void setEFTTrnLmtUseCnt(EFTTrnLmtUseCntType value) {
        this.eftTrnLmtUseCnt = value;
    }

    /**
     * Gets the value of the atmDrTempPostLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDrTempPostLmtAmtType }
     *     
     */
    public ATMDrTempPostLmtAmtType getATMDrTempPostLmtAmt() {
        return atmDrTempPostLmtAmt;
    }

    /**
     * Sets the value of the atmDrTempPostLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDrTempPostLmtAmtType }
     *     
     */
    public void setATMDrTempPostLmtAmt(ATMDrTempPostLmtAmtType value) {
        this.atmDrTempPostLmtAmt = value;
    }

    /**
     * Gets the value of the atmDrTempPostStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getATMDrTempPostStartDt() {
        return atmDrTempPostStartDt;
    }

    /**
     * Sets the value of the atmDrTempPostStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setATMDrTempPostStartDt(StartDtType value) {
        this.atmDrTempPostStartDt = value;
    }

    /**
     * Gets the value of the atmDrTempPostEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link EndDtType }
     *     
     */
    public EndDtType getATMDrTempPostEndDt() {
        return atmDrTempPostEndDt;
    }

    /**
     * Sets the value of the atmDrTempPostEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDtType }
     *     
     */
    public void setATMDrTempPostEndDt(EndDtType value) {
        this.atmDrTempPostEndDt = value;
    }

    /**
     * Gets the value of the posDrTempPostLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link POSDrTempPostLmtAmtType }
     *     
     */
    public POSDrTempPostLmtAmtType getPOSDrTempPostLmtAmt() {
        return posDrTempPostLmtAmt;
    }

    /**
     * Sets the value of the posDrTempPostLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSDrTempPostLmtAmtType }
     *     
     */
    public void setPOSDrTempPostLmtAmt(POSDrTempPostLmtAmtType value) {
        this.posDrTempPostLmtAmt = value;
    }

    /**
     * Gets the value of the posDrTempPostStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getPOSDrTempPostStartDt() {
        return posDrTempPostStartDt;
    }

    /**
     * Sets the value of the posDrTempPostStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setPOSDrTempPostStartDt(StartDtType value) {
        this.posDrTempPostStartDt = value;
    }

    /**
     * Gets the value of the posDrTempPostEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link EndDtType }
     *     
     */
    public EndDtType getPOSDrTempPostEndDt() {
        return posDrTempPostEndDt;
    }

    /**
     * Sets the value of the posDrTempPostEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDtType }
     *     
     */
    public void setPOSDrTempPostEndDt(EndDtType value) {
        this.posDrTempPostEndDt = value;
    }

    /**
     * Gets the value of the xeftCardTrvInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XEFTCardTrvInfoCType }
     *     
     */
    public XEFTCardTrvInfoCType getXEFTCardTrvInfo() {
        return xeftCardTrvInfo;
    }

    /**
     * Sets the value of the xeftCardTrvInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEFTCardTrvInfoCType }
     *     
     */
    public void setXEFTCardTrvInfo(XEFTCardTrvInfoCType value) {
        this.xeftCardTrvInfo = value;
    }

    /**
     * Gets the value of the xeftCardCntryArray property.
     * 
     * @return
     *     possible object is
     *     {@link XEFTCardCntryArrayAType }
     *     
     */
    public XEFTCardCntryArrayAType getXEFTCardCntryArray() {
        return xeftCardCntryArray;
    }

    /**
     * Sets the value of the xeftCardCntryArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEFTCardCntryArrayAType }
     *     
     */
    public void setXEFTCardCntryArray(XEFTCardCntryArrayAType value) {
        this.xeftCardCntryArray = value;
    }

    /**
     * Gets the value of the xeftCardBlkTrnArray property.
     * 
     * @return
     *     possible object is
     *     {@link XEFTCardBlkTrnArrayAType }
     *     
     */
    public XEFTCardBlkTrnArrayAType getXEFTCardBlkTrnArray() {
        return xeftCardBlkTrnArray;
    }

    /**
     * Sets the value of the xeftCardBlkTrnArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEFTCardBlkTrnArrayAType }
     *     
     */
    public void setXEFTCardBlkTrnArray(XEFTCardBlkTrnArrayAType value) {
        this.xeftCardBlkTrnArray = value;
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
     * Gets the value of the xUserDefInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link XUserDefInfoArrayAType }
     *     
     */
    public XUserDefInfoArrayAType getXUserDefInfoArray() {
        return xUserDefInfoArray;
    }

    /**
     * Sets the value of the xUserDefInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XUserDefInfoArrayAType }
     *     
     */
    public void setXUserDefInfoArray(XUserDefInfoArrayAType value) {
        this.xUserDefInfoArray = value;
    }

    /**
     * Gets the value of the xeftCardMailAddrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XEFTCardMailAddrInfoCType }
     *     
     */
    public XEFTCardMailAddrInfoCType getXEFTCardMailAddrInfo() {
        return xeftCardMailAddrInfo;
    }

    /**
     * Sets the value of the xeftCardMailAddrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEFTCardMailAddrInfoCType }
     *     
     */
    public void setXEFTCardMailAddrInfo(XEFTCardMailAddrInfoCType value) {
        this.xeftCardMailAddrInfo = value;
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
     * Gets the value of the imgDepMemoPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ImgDepMemoPostAmtType }
     *     
     */
    public ImgDepMemoPostAmtType getImgDepMemoPostAmt() {
        return imgDepMemoPostAmt;
    }

    /**
     * Sets the value of the imgDepMemoPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgDepMemoPostAmtType }
     *     
     */
    public void setImgDepMemoPostAmt(ImgDepMemoPostAmtType value) {
        this.imgDepMemoPostAmt = value;
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
     * Gets the value of the merNotfOptInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link MerNotfOptInfoArrayAType }
     *     
     */
    public MerNotfOptInfoArrayAType getMerNotfOptInfoArray() {
        return merNotfOptInfoArray;
    }

    /**
     * Sets the value of the merNotfOptInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerNotfOptInfoArrayAType }
     *     
     */
    public void setMerNotfOptInfoArray(MerNotfOptInfoArrayAType value) {
        this.merNotfOptInfoArray = value;
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
     * Gets the value of the cardStatRsnType property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatRsnTypeType }
     *     
     */
    public CardStatRsnTypeType getCardStatRsnType() {
        return cardStatRsnType;
    }

    /**
     * Sets the value of the cardStatRsnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatRsnTypeType }
     *     
     */
    public void setCardStatRsnType(CardStatRsnTypeType value) {
        this.cardStatRsnType = value;
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
     * Gets the value of the eftCardPINOffSetId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardPINOffSetIdType }
     *     
     */
    public EFTCardPINOffSetIdType getEFTCardPINOffSetId() {
        return eftCardPINOffSetId;
    }

    /**
     * Sets the value of the eftCardPINOffSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardPINOffSetIdType }
     *     
     */
    public void setEFTCardPINOffSetId(EFTCardPINOffSetIdType value) {
        this.eftCardPINOffSetId = value;
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
     * Gets the value of the eftCardBINCode property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardBINCodeType }
     *     
     */
    public EFTCardBINCodeType getEFTCardBINCode() {
        return eftCardBINCode;
    }

    /**
     * Sets the value of the eftCardBINCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardBINCodeType }
     *     
     */
    public void setEFTCardBINCode(EFTCardBINCodeType value) {
        this.eftCardBINCode = value;
    }

    /**
     * Gets the value of the eftCardBINDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardBINDescType }
     *     
     */
    public EFTCardBINDescType getEFTCardBINDesc() {
        return eftCardBINDesc;
    }

    /**
     * Sets the value of the eftCardBINDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardBINDescType }
     *     
     */
    public void setEFTCardBINDesc(EFTCardBINDescType value) {
        this.eftCardBINDesc = value;
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
     * Gets the value of the eftCardCat property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardCatType }
     *     
     */
    public EFTCardCatType getEFTCardCat() {
        return eftCardCat;
    }

    /**
     * Sets the value of the eftCardCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardCatType }
     *     
     */
    public void setEFTCardCat(EFTCardCatType value) {
        this.eftCardCat = value;
    }

    /**
     * Gets the value of the eftCardImgId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardImgIdType }
     *     
     */
    public EFTCardImgIdType getEFTCardImgId() {
        return eftCardImgId;
    }

    /**
     * Sets the value of the eftCardImgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardImgIdType }
     *     
     */
    public void setEFTCardImgId(EFTCardImgIdType value) {
        this.eftCardImgId = value;
    }

    /**
     * Gets the value of the eftCardImgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardImgDescType }
     *     
     */
    public EFTCardImgDescType getEFTCardImgDesc() {
        return eftCardImgDesc;
    }

    /**
     * Sets the value of the eftCardImgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardImgDescType }
     *     
     */
    public void setEFTCardImgDesc(EFTCardImgDescType value) {
        this.eftCardImgDesc = value;
    }

    /**
     * Gets the value of the allowDigitalOnlyType property.
     * 
     * @return
     *     possible object is
     *     {@link AllowDigitalOnlyTypeType }
     *     
     */
    public AllowDigitalOnlyTypeType getAllowDigitalOnlyType() {
        return allowDigitalOnlyType;
    }

    /**
     * Sets the value of the allowDigitalOnlyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowDigitalOnlyTypeType }
     *     
     */
    public void setAllowDigitalOnlyType(AllowDigitalOnlyTypeType value) {
        this.allowDigitalOnlyType = value;
    }

    /**
     * Gets the value of the allowDigitalInActType property.
     * 
     * @return
     *     possible object is
     *     {@link AllowDigitalInActTypeType }
     *     
     */
    public AllowDigitalInActTypeType getAllowDigitalInActType() {
        return allowDigitalInActType;
    }

    /**
     * Sets the value of the allowDigitalInActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowDigitalInActTypeType }
     *     
     */
    public void setAllowDigitalInActType(AllowDigitalInActTypeType value) {
        this.allowDigitalInActType = value;
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
     * Gets the value of the aftDrTempPostLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AFTDrTempPostLmtAmtType }
     *     
     */
    public AFTDrTempPostLmtAmtType getAFTDrTempPostLmtAmt() {
        return aftDrTempPostLmtAmt;
    }

    /**
     * Sets the value of the aftDrTempPostLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFTDrTempPostLmtAmtType }
     *     
     */
    public void setAFTDrTempPostLmtAmt(AFTDrTempPostLmtAmtType value) {
        this.aftDrTempPostLmtAmt = value;
    }

    /**
     * Gets the value of the aftDrTempPostStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getAFTDrTempPostStartDt() {
        return aftDrTempPostStartDt;
    }

    /**
     * Sets the value of the aftDrTempPostStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setAFTDrTempPostStartDt(StartDtType value) {
        this.aftDrTempPostStartDt = value;
    }

    /**
     * Gets the value of the aftDrTempPostEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link EndDtType }
     *     
     */
    public EndDtType getAFTDrTempPostEndDt() {
        return aftDrTempPostEndDt;
    }

    /**
     * Sets the value of the aftDrTempPostEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDtType }
     *     
     */
    public void setAFTDrTempPostEndDt(EndDtType value) {
        this.aftDrTempPostEndDt = value;
    }

    /**
     * Gets the value of the aftDrPostLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AFTDrPostLmtAmtType }
     *     
     */
    public AFTDrPostLmtAmtType getAFTDrPostLmtAmt() {
        return aftDrPostLmtAmt;
    }

    /**
     * Sets the value of the aftDrPostLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFTDrPostLmtAmtType }
     *     
     */
    public void setAFTDrPostLmtAmt(AFTDrPostLmtAmtType value) {
        this.aftDrPostLmtAmt = value;
    }

    /**
     * Gets the value of the aftDrLmtUseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AFTDrLmtUseAmtType }
     *     
     */
    public AFTDrLmtUseAmtType getAFTDrLmtUseAmt() {
        return aftDrLmtUseAmt;
    }

    /**
     * Sets the value of the aftDrLmtUseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFTDrLmtUseAmtType }
     *     
     */
    public void setAFTDrLmtUseAmt(AFTDrLmtUseAmtType value) {
        this.aftDrLmtUseAmt = value;
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
     * Gets the value of the eftCardTempExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getEFTCardTempExpDt() {
        return eftCardTempExpDt;
    }

    /**
     * Sets the value of the eftCardTempExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setEFTCardTempExpDt(ExpDtType value) {
        this.eftCardTempExpDt = value;
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
     * Gets the value of the eftCardReadType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardReadTypeType }
     *     
     */
    public EFTCardReadTypeType getEFTCardReadType() {
        return eftCardReadType;
    }

    /**
     * Sets the value of the eftCardReadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardReadTypeType }
     *     
     */
    public void setEFTCardReadType(EFTCardReadTypeType value) {
        this.eftCardReadType = value;
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
     * Gets the value of the eftSwchActType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTSwchActTypeType }
     *     
     */
    public EFTSwchActTypeType getEFTSwchActType() {
        return eftSwchActType;
    }

    /**
     * Sets the value of the eftSwchActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTSwchActTypeType }
     *     
     */
    public void setEFTSwchActType(EFTSwchActTypeType value) {
        this.eftSwchActType = value;
    }

    /**
     * Gets the value of the cardRushOpt property.
     * 
     * @return
     *     possible object is
     *     {@link RushOptType }
     *     
     */
    public RushOptType getCardRushOpt() {
        return cardRushOpt;
    }

    /**
     * Sets the value of the cardRushOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RushOptType }
     *     
     */
    public void setCardRushOpt(RushOptType value) {
        this.cardRushOpt = value;
    }

    /**
     * Gets the value of the cardRushMthdCode property.
     * 
     * @return
     *     possible object is
     *     {@link CardRushMthdCodeType }
     *     
     */
    public CardRushMthdCodeType getCardRushMthdCode() {
        return cardRushMthdCode;
    }

    /**
     * Sets the value of the cardRushMthdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardRushMthdCodeType }
     *     
     */
    public void setCardRushMthdCode(CardRushMthdCodeType value) {
        this.cardRushMthdCode = value;
    }

    /**
     * Gets the value of the cardRushMthdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CardRushMthdDescType }
     *     
     */
    public CardRushMthdDescType getCardRushMthdDesc() {
        return cardRushMthdDesc;
    }

    /**
     * Sets the value of the cardRushMthdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardRushMthdDescType }
     *     
     */
    public void setCardRushMthdDesc(CardRushMthdDescType value) {
        this.cardRushMthdDesc = value;
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
