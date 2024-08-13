
package pro.misoft.jackhenryintegration.generated.customer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 *  The jX element name. 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Jx xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;CanonicalVal&gt;AcctClsfCode,AcctRelCode,ACHStdEntryCode,ACHTrnCode,BrCode,CallRptCode,ClubPln,CntryType,CollatCode,CollatDocCode,CollatDocExcLtrId,
 *                         CollatDocRcptLtrId,CollatSrcValCode,CollatStat,ConvIdxNum,CRACenTract,CRAIncmLvl,CRACountyCode,CRASMSACode,CRAStateCode,CrRatingCode,CurrencyCode,CusipId,
 *                         CustCycleCode,DistTrnCode,DlqRateIdxNum,DlrCode,EscrwCompCode,EscrwPmtAgentCode,EcsrwRateIdx,EscrwTypeCode,FinStmtWavCode,FedWithCode,GlCostCtr,GLProdCode,
 *                         GroupCode,HldMailCode,IdVerifyCode,IntCycle,IRSExmpCode,IRSRecipCode,LateChgCode,LOCCallRptCode,LOCCollatCode,NAICSCode,OffCode,OvrrdRenRateNum,PartIdNum,
 *                         PenCode,PlnCode,PrePmtPenCode,PrimeRateIdx,ProdCode,PurpCode,RateIdxNum,RepoBlkId,ResStateProv,RiskRateByCode,RiskRateCode,SerChgCycle,SrcFundsCode,
 *                         StateWithCode,StdIndustCode,StmtCycle,TINCode,TranCodeCode,UserDefCode,LnStopCode,UserDefInfo1,CopyRelCustMail,StopNotCode,ShortPmtCode,OddDaysIntBasis,
 *                         SerChgWavRsnCode,PrtACHNotCode,AcctReOpenCode,EFTSCCode,PrtIntNotCode,SecdOffCode,AlienTypeCode,BnkRptcyFileCode,BnkRptcyChapCode,AlienW8Stat,
 *                         SCRANotCode,PMIHOEPANotCode,FutXferLateChgCode,FutXferNSFCode,FutXferUseLnAmtCode,FutXferUseLnDtCode,LnTierRateIdxNum,FirstStmtFeeCode,PmtReAmrtzFreqCode,
 *                         IntPmtPostCode,PrePmtPenBillCode,CrBureauRptCode,LnFeeChgCode,OthInsurIdxNum,LnFeeCode,ECOACode,CrBurAddrRptCode,CrBurTranCode,CrBurCplCode,CrBurStatCode,
 *                         CrBurAcctClsfCode,CrClsfCode,CrBurActnCode,CrBurSpecCmntCode,SuspPmtSchedCode,EFTCardProdCode,PostAdvCode,DocName,DocImgIdxType,DocImgFormat,EFTCardStat,AvlBalCalcCode,CustType,CRALoc,CRAMilitaryCode,UnusedCrIntBase,CrLifeInsurAccrBase,AHInsurAccrBase,UEInsurAccrBase,OthInsurAccrBase,
 *                         CurtPenCode,RegionCode,SweepClassCode,SweepChgCode,SweepNotCode,SweepRstrCode,SweepPayoffCode,SweepFltXferCode,SweepResetCode,RetRsnCode,HouseHoldMbrText,AflOptOutExcptCode,ACHStdEntryClass,InsiderCode,FASB91TypeCode,ODProtPmtCode,PenAnnPctIdxNum,DlrId,MsgPrtNotCode,AcctType,JobLocCode,JobSupvCode,
 *                         JobDivCode,RaceCode,AppEducLvlCode,AppVetCode,JobExpcCode,DeptCode,ChgMthd,ARGOProdCode,RentalRateIdx,SigVerifyCode,RstrEntryCode,AcctLvlSecCode,AutoChgRateIdx,AppVetCmpgnCode,
 *                         RsnDepartCode,ProfCertifCode,ODPrvlgConCode,TeaserRateCode,ChgdOffAutoCode,SalesPerson,StressRateCode,,ExclRealEstateRptCode,ExcLndPlcyCode,AHInsurCompCode,CrLifeCompCode,
 *                         ExclHldXferCode,CRADelinCode,OthInsurCompCode,LOCCode,LOCStat,LOCPrtcpCode,FutXferMatPmtCode,ExcDispCode,ExcRetRsnCode,ExcActnCode,NSFChgWavRsnCode,BillPayProdCode,IntnetIdStat,
 *                         AcctViewAvlBalCode,TrnXferAvlBalCode,XferAvlBalCode,BillPayAvlBalCode,BilPayCrCompCode,EFTBlkTrnCode,EFTCardPINEntryCode,QualMtgCode,QualResMtgCode&lt;/CanonicalVal&gt;&lt;/Jx&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ParmName_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParmName_Type"&gt;
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
@XmlType(name = "ParmName_Type", propOrder = {
    "value"
})
public class ParmNameType {

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
