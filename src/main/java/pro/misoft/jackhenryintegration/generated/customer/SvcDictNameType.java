
package pro.misoft.jackhenryintegration.generated.customer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Jx xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ElemDesc&gt;The name of the service to obtain data dictionary
 *                         definitions&lt;/ElemDesc&gt;&lt;CanonicalVal&gt;&lt;TPG&gt;CustInq,CustSrch,CustMsgSrch,CustAdd,AddrSrch,AddrMod,AddrAdd,CustRelAdd,CustRelMod,CustMod,IdVerifyAdd,IdVerifyMod,AcctIdGen,CustMsgAdd,CustMsgMod,IntYieldInq,IntRateSrch,TaxPlnAdd,TaxPlnMod,TaxPlnBenfAdd,TaxPlnBenfMod,AcctMod,AcctAdd,AcctBenfAdd,                            
 *                             AcctBenfMod,AcctSweepAdd,AcctSweepMod,AcctCombStmtAdd,AcctCombStmtMod,AcctProdOvrrdAdd,AcctProdOvrrdMod,TimeDepRenOvrrd,AcctInq,AcctHistSrch,StopChkSrch,AcctSrch,TaxPlnSrch,TaxPlnAcctSrch,TaxPlnBenfSrch,TaxPlnInq,XferSrch,CollatTrackSrch,
 *                             RealEstatePropSrch,LOCSrch,LOCAcctSrch,LOCAcctInq,EscrwInq,FASB91Srch,LnAppRgtrSrch,CRBurInfoInq,LnPmtSchedInq,ACHPndSrch,AcctIntRateInq,UsrOperInq,AcctSweepInq,AcctCombStmtInq,NSFHistSrch,AcctProtInq,XferSrcDestSrch,AcctProdOvrrdInq,AcctMemoPostSrch,
 *                             SafeDepBoxSrch,ODPrvlgHistSrch,TimeDepRenOvrrdInq,CollatTrackAdd,CollatTrackMod,RealEstatePropAdd,RealEstatePropMod,LOCAdd,LOCMod,EscrwAdd,EscrwMod,FASB91Add,FASB91Mod,LnAcctAdd,LnAcctMod,LnAppRgtrAdd,LnAppRgtrMod,LnPmtExt,LnRen,
 *                             CurBurInfoAdd,CrBurInfoMod,LnPmtSchedAdd,LnPmtSchedMod,StopChkAdd,XferAdd,StopChkCan,TrnAdd,XferMod,TrnMod,LnRateSchedSrch,LnRateSchedInq,LnRateSchedMod,LtrOfCrInq,DocImgAdd,DocImgSrch,DocImgMod,OFACSrch,BilPayPayeeSrch,BilPayPayeeInq,
 *                             BilPayPayeeAdd,BilPayPayeeMod,BilPaySchedPmtSrch,BilPaySchedPmtInq,BilPaySchedPmtAdd,BilPaySchedPmtMod,BilPaySchedPmtApprv,BilPayPmtHistSrch,BilPayPmtHistInq,BilPaySubSrch,BilPaySubInq,BilPaySubAdd,BilPaySubMod,BilPaySubConsmCustInq,BilPayChanInq,
 *                             AddrInq,CustMsgInq,AcctBenfInq,TaxPlnBenfInq,ChkImgSrch,GLAcctInq,AcctExcTrnSrch,AcctExcTrnInq,AcctNSFTrnInq,AcctNSFTrnMod,EFTCardInq,EFTCardMod,IntnetFinInstIdInq,IntnetFinInstIdMod,IntnetFinInstIdUsrInq,IntnetFinInstIdUsrMod,TrnAddQuote,TrnAddQuoteCan,
 *                             TrnAddQuoteComm,GLHistSrch,GLMsgSrch,AcctRelSrch,CRMCustSrch,CRMReferSrch,CRMMktCmpgnSrch,CRMPotSaleSrch,CRMEventSrch,CRMActSrch,EFTActFraudInq,SvcDft,ParmValSrch,EFTCardAdd,EFTCardAcctIdAdd,IntnetFinInstIdAdd,IntnetFinInstAcctIdAdd,UsrEnrollInq,
 *                             EFTCardAddValidate,IntnetFinInstIdAddValidate,IntnetFinInstAcctIdAddValidate,EmplAppAdd,EFTCardSrch,SvcDictSrch,CustCollatSrch,EFTCardUsrAuthInq,CRMProspInq,PltfmAppAdd,PltfmStatInq,AcctAddValidate,TaxPlnAddValidate,TaxPlnBenfAddValidate,PltfmStatMod,CredPolInq,
 *                             MFAQnAPolInq,MFAWaterMarkSrch,UsrConsmCredAdd,MFAUsrQnAAdd,ODISvcCred,EmplJobSrch,EmplJobInq,TrnSetItemSrch,GLAcctSrch,CollatTrackItemInq,BrdCstSrch,LnPltfmAppAdd,PltfmStatInq,LnAcctAddValidate,EscrwAddValidate,FASB91AddValidate,LnAppRgtrAddValidate,
 *                             LnPmtSchedAddValidate,LOCAddValidate,CrBurInfoAddValidate,CollatTrackAddValidate,RelaEstatePropAddValidate,ChkImgInq,ChkImgStmtSrch,ChkImgStmtGen,ChkImgStmtGenInq,XferAddValidate,TrnAddValidate,StopChkAddValidate,ChkRiskInq,LnRegLTVInq,SafeDepPmtAdd,
 *                             SafeDepPmtMod,PersonNameMod,UsrConsmCredMod,MFAUsrQnAMod,LnFeeAdd,LnFeeMod,LnFeeInq,EFTCardOrderAdd,EFTCardPINOffSetMod,TrnSrch,TrnInq,BilPayElecBilSchedSrch,BilPayElecBilSchedInq,BilPayElecBilSchedMod,CRMEventInq,CRMEventAdd,CRMEventMod,
 *                             CRMReferInq,CRMReferAdd,CRMReferMod,CRMActInq,CRMActMod,FileMainSrch,TrnFraudRuleSrch,TrnFraudSusSrch,IntRateInq,IntRateAdd,IntRateMod,CRMActAdd,LobbyQueAdd,LobbyQueMod,LobbyQueInq,LobbyQueSrch,PltfmProdSrch,CRMProspAdd,CRMProspMod,LnFeeSrch,
 *                             ACHTrnAdd,ACHTrnMod,ACHTrnInq,ACHTrnAddendaAdd,ACHBatchMod,ACHBatchInq,ACHBatchSrch,ACHFileAdd,ACHFileMod,ACHFileInq,NotSndAdd,NotRecipAdd,NotRecipMod,NotRecipInq,NotRecipSrch,NotRecipSubAdd,NotRecipSubMod,NotRecipSubInq,NotRecipSubSrch,
 *                             PosPayItemSrch,PosPayItemInq,PosPayItemMod,SavBondTrnAdd,SavBondTrnMod,SavBondTrnInq,SavBondTrnSrch,AcctAnlysTrnAdd,AcctAnlysTrnMod,AcctAnlysInq,TellerTrnAdd,TellerTrnMod,TellerTrnInq,TellerTrnSrch,PltfmProdInq,EFTCardTrnHistSrch,IntnetFinInstIdAcctAccessInq,
 *                             TellerCurrTrnAdd,TellerCurrTrnMod,TellerCurrTrnInq,TellerCurrTrnSrch,LnPltfmProdSrch,LnPltfmProdInq,DocImgPktSrch,TellerNonCustAdd,TellerNonCustMod,TellerNonCustInq,TellerCustSrch,TellerDrwSrch,TellerDrwMod,TellerDrwTrnsitnSrch,NotDistGroupAdd,NotDistGroupMod,
 *                             NotDistGroupInq,NotDistGroupSrch,NotExplDataAdd,NotActSrch,NotSMSKeyWordAdd,NotSMSKeyWordMod,NotSMSKeyWordInq,NotSMSKeyWordSrch,EFTCardPINModInit,EFTCardPINMod,NSFProcStateSrch,WireTrnMod,SafeDepAuditAdd,SafeDepAuditInq,IntlWireTrnAdd,
 *                             AcctReconBatchSrch,AcctReconItemSrch,PmtHubUsrDirAdd,PmtHubUsrDirMod,PmtHubUsrDirInq,PmtHubCrXferAdd,PmtHubISO20022Add,PmtHubCrXferStatInq,NotEmailAlrtAdd,VRAcctInq,VRChanInq,VRPINMod,LnUnvIdGen,ACHTrnSrch,ACHTrnAddeSrch,AcctReconItemInq,
 *                             AcctReconItemMod,BilPayAlrtInq,BilPayAlrtMod,XferExpSrch,RecipConOptInInq,CrCardAct,CrCardRptLostAdd,CrCardStmtMod,CrCardStmtInq,CrCardTrnHistSrch,CrCardAcctInq,CrCardRwrdInq,CrCardAcctSrch,CrCardTrnAdd,SvcFeeTrnAdd,SvcFeeTrnMod,XferExpSrch,PltfmDocInq,
 *                             PltfmDocStatInq,PltfmEntityValidate,PmtHubCrXferAdd,PmtHubCrXferMod,PmtHubUsrDirAdd,PmtHubUsrDirMod,PmtHubUsrDirInq,CrCardAct,CrCardRptLostAdd,CrCardStmtSrch,CrCardStmtGen,,CardAlrtSubAdd,CardAlrtSubMod,CardalrtSubInq,CardAlrtMod,BenflOwnSrch,PmtHubUsrActSrch,
 *                             CrCardAcctSrch,EscrwTrnHistSrch,MLLRelSrch,MLLMasterRelInq,MLLTrancheRelInq,MLLMasterRelAdd,MLLTrancheRelAdd,MLLMasterRelMod,MLLTrancheRelMod,ACHCompMod,CrCardStmtMod,CrCardStmtInq,CardAlrtNotfInq,PmtHubPmtRqAdd,PmtHubPmtRqMod,AcctAnlysAdd,
 *                             AcctAnlysMod,EFTCardAddrSrch,EFTCardMsgSrch,EFTCardMsgAdd,EFTCardMsgMod,ElecDocInq,IntnetFinInstIdFileMainSrch,LnSvcInq,EDPPPersonSrch,EDPPPersonProdDictInq,EDPPPersonProdMod,EntityMatchSrch,EntityMatchBatchInq,EntityACHBatchInq,EntityMatchBatchStatInq,
 *                             PltfmBusEntityValidate,OOBValidate,MFATokenUsrAdd,MFATokenUsrMod,MFATokenUsrInq,MFATokenAdd,MFATokenMod,MFATokenInq,MFATokenValidate,MFATokenTempPswdInq,MFATokenPINMod,MFAActRiskInq,MFActAdd,MFAUsrQnAInq,MFAUsrQnAValidate,MFAOOBValidate,
 *                             PmtHubUsrActInq,CustRelInq,CrCardTrnMod,IdVerifCmntAdd,CrCardOrderAdd,CrCardAutoPayAdd,CrCardAutoPayMod,CrCardAutoPayInq,ACHRetNOCSrch,ACHRetNOCInq,LnBilSrch,LnLiabInq,LnPayoffInq,LnPrtcpInq,LnUnitSrch,LnUnitInq,SvcFeeSrch,SvcFeeTrnInq,GLInfoMsgInq,
 *                             EFTCardFileMainSrch,CustInfoMsgInq,CustIncmInq,AcctBalInq,ACHFltrAdd,ACHFltrMod,ACHFltrInq,ACHFltrSrch,LnBilAdd,LnBilInq,ACHCompMultiInq,AcctExcTrnMod,LnBilMod,TeaserRateAdd,TeaserRateSrch,TeaserRateInq,TeaserRateMod,ItemCapAdd,ItemCapItemInq,ItemCapTrnSetMod,
 *                             ItemCapStatAdd,ItemCapTrnSetInq,ACHActFraudInq,ACHActFraudStatInq,StopChkMod,InstDefFldSrch,InstDefFldInq,InstDefFldMod,EscrwAgentDistrSrch,EscrwAgentDistrInq,EscrwAgentDistrAdd,EscrwAgentDistrMod,FaxSndAdd,FaxStatInq,LnRateSwapInq,LnRateSwapAdd,
 *                             LnRateSwapMod,LOCConstInProcSrch,LOCConstInProcInq,LOCConstInProcAdd,LOCConstInProcMod,CRMClientRelDataInq,CRMClientRelDataMod,EFTCardAwardsAdd,EFTCardHouseHoldSrch,EFTCardAwardsInq,EFTCardAwardsMod,CrCardHolderInq,DocImgAttachInq,LnShdwInq,
 *                             LnShdwMod,WireActFraudInq,WireActFraudStatInq,DocImgCrossIdxAdd,LnUnitAdd,LnUnitAddValidate,LnUnitMod,PmtHubDevConAdd,PmtHubDevConInq,LnFeePrtcpSrch,LnFeePrtcpInq,LnFeePrtcpAdd,LnFeePrtcpMod,DocElecSigAssigneeMod,EntityMatchWireInq,CrCardPendTrnInq,
 *                             CardCVVInq,CardTempExpDtMod,ColQueSrch,ColQueInq,ColQueMod,CRMRmndSrch,CRMRmndMultiInq,CRMRmndMod,CustIdRelAdd,CustIdRelSrch,CustIdRelInq,CustIdRelMod,EFTCardBlkTrnSrch,EFTCardBlkTrnInq,EFTCardImgIdAdd,EFTCardImgIdMod,EFTCardImgIdSrch,ColAdd,ColSrch,
 *                             ColInq,ColMod,PromoXferAdd,PromoXferSrch,PromoXferInq,PromoXferMod,PltfmAppSrch,LnPltfmAppSrch,PltfmAppInq,LnPltfmAppInq,WireTrnAddValidate,MLLLnBilSrch,LnPltfmDocInq,LnPltfmDocStatInq,NewAcctSrch,AcctCommAdd,AcctReconRptInq&lt;/TPG&gt;&lt;/CanonicalVal&gt;&lt;/Jx&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SvcDictName_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcDictName_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://jackhenry.com/jxchange/TPG/2008&gt;ClosedEnum_Type"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcDictName_Type", propOrder = {
    "value"
})
public class SvcDictNameType {

    @XmlValue
    protected String value;

    /**
     * Defines a string type which is Enum and has set values
     *             
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
