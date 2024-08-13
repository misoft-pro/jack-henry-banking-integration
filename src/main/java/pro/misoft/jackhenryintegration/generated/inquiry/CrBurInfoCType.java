
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
 * The Credit Bureau suite of services was based on Metro 2
 *                 format
 * 
 * <p>Java class for CrBurInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrBurInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ECOACode" type="{http://jackhenry.com/jxchange/TPG/2008}ECOACode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BnkRptcyFileCode" type="{http://jackhenry.com/jxchange/TPG/2008}BnkRptcyFileCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurAddrRptCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurAddrRptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurOccupCode" type="{http://jackhenry.com/jxchange/TPG/2008}OccupCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NameSuffix" type="{http://jackhenry.com/jxchange/TPG/2008}NameSuffix_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurTranCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurTranCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurCplCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurCplCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurStatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurAcctClsfCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurAcctClsfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrClsfCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrClsfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurActnCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurActnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CntryType" type="{http://jackhenry.com/jxchange/TPG/2008}CntryType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurSpecCmntCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurSpecCmntCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurId" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurId_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigCrBurId" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurId_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}OrigAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgdOffAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ChgdOffAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LiabInstName" type="{http://jackhenry.com/jxchange/TPG/2008}LiabInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlqDt" type="{http://jackhenry.com/jxchange/TPG/2008}DlqDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurPrtcpCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpCompName" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpCompName_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmplName" type="{http://jackhenry.com/jxchange/TPG/2008}EmplName_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmplAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="OccType" type="{http://jackhenry.com/jxchange/TPG/2008}OccType_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ODLmt" type="{http://jackhenry.com/jxchange/TPG/2008}ODLmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="ODHighBal" type="{http://jackhenry.com/jxchange/TPG/2008}ODHighBal_Type" minOccurs="0"/&gt;
 *           &lt;element name="PastDueAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PastDueAmt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="DebtorName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *             &lt;element name="DebtorAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *             &lt;element name="DebtorBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="DebtorPhoneNum" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneNum_Type" minOccurs="0"/&gt;
 *             &lt;element name="CrBurCorrType" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurCorrType_Type" minOccurs="0"/&gt;
 *             &lt;element name="DebtorTaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *             &lt;element name="CrBurRptTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurRptTimeDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="CrBurCycleId" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurCycleId_Type" minOccurs="0"/&gt;
 *             &lt;element name="CrBurLnType" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurLnType_Type" minOccurs="0"/&gt;
 *             &lt;element name="CrBurPmtRateCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurPmtRateCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="CrBurTermType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtFreqUnits_Type" minOccurs="0"/&gt;
 *             &lt;element name="CrBurTermFreqType" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurTermFreqType_Type" minOccurs="0"/&gt;
 *             &lt;element name="OpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *             &lt;element name="LastPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="PmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *             &lt;element name="BilDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}BilDueDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="PmtAmtTot" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmtTot_Type" minOccurs="0"/&gt;
 *             &lt;element name="ClsDt" type="{http://jackhenry.com/jxchange/TPG/2008}ClsDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="SecdMktAgencyType" type="{http://jackhenry.com/jxchange/TPG/2008}SecdMktAgencyType_Type" minOccurs="0"/&gt;
 *             &lt;element name="PrtcpAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpAcctId_Type" minOccurs="0"/&gt;
 *             &lt;element name="MERSId" type="{http://jackhenry.com/jxchange/TPG/2008}MERSId_Type" minOccurs="0"/&gt;
 *             &lt;element name="PmtExcpCode" type="{http://jackhenry.com/jxchange/TPG/2008}PmtExcpCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="PmtExcpStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDueDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="PmtExcpDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDueDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="CrBurFileMainCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurFileMainCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="NonCrBurRptRsn" type="{http://jackhenry.com/jxchange/TPG/2008}NonCrBurRptRsn_Type" minOccurs="0"/&gt;
 *             &lt;element name="PmtHistArray" type="{http://jackhenry.com/jxchange/TPG/2008}PmtHistArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="HouseHoldDebtorArray" type="{http://jackhenry.com/jxchange/TPG/2008}HouseHoldDebtorArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="NonHouseHoldDebtorArray" type="{http://jackhenry.com/jxchange/TPG/2008}NonHouseHoldDebtorArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="DefRptType" type="{http://jackhenry.com/jxchange/TPG/2008}DefRptType_Type" minOccurs="0"/&gt;
 *               &lt;element name="DefPmtStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}DefPmtStartDt_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="OvrrdCrBurStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurStatCode_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CrBurInfo_CType", propOrder = {
    "ecoaCode",
    "bnkRptcyFileCode",
    "crBurAddrRptCode",
    "crBurOccupCode",
    "nameSuffix",
    "crBurTranCode",
    "crBurCplCode",
    "crBurStatCode",
    "crBurAcctClsfCode",
    "crClsfCode",
    "crBurActnCode",
    "cntryType",
    "crBurSpecCmntCode",
    "crBurId",
    "origCrBurId",
    "origAcctId",
    "chgdOffAmt",
    "liabInstName",
    "dlqDt",
    "crBurPrtcpCode",
    "prtcpCompName",
    "emplName",
    "emplAddr",
    "occType",
    "ver1",
    "odLmt",
    "odHighBal",
    "pastDueAmt",
    "ver2",
    "debtorName",
    "debtorAddr",
    "debtorBirthDt",
    "debtorPhoneNum",
    "crBurCorrType",
    "debtorTaxId",
    "crBurRptTimeDt",
    "crBurCycleId",
    "crBurLnType",
    "crBurPmtRateCode",
    "crBurTermType",
    "crBurTermFreqType",
    "openDt",
    "curBal",
    "lastPmtDt",
    "pmtAmt",
    "bilDueDt",
    "pmtAmtTot",
    "clsDt",
    "secdMktAgencyType",
    "prtcpAcctId",
    "mersId",
    "pmtExcpCode",
    "pmtExcpStartDt",
    "pmtExcpDueDt",
    "crBurFileMainCode",
    "nonCrBurRptRsn",
    "pmtHistArray",
    "houseHoldDebtorArray",
    "nonHouseHoldDebtorArray",
    "ver3",
    "defRptType",
    "defPmtStartDt",
    "ver4",
    "ovrrdCrBurStatCode",
    "ver5",
    "any"
})
public class CrBurInfoCType {

    @XmlElementRef(name = "ECOACode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ECOACodeType> ecoaCode;
    @XmlElementRef(name = "BnkRptcyFileCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BnkRptcyFileCodeType> bnkRptcyFileCode;
    @XmlElementRef(name = "CrBurAddrRptCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrBurAddrRptCodeType> crBurAddrRptCode;
    @XmlElementRef(name = "CrBurOccupCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OccupCodeType> crBurOccupCode;
    @XmlElementRef(name = "NameSuffix", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NameSuffixType> nameSuffix;
    @XmlElementRef(name = "CrBurTranCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrBurTranCodeType> crBurTranCode;
    @XmlElementRef(name = "CrBurCplCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrBurCplCodeType> crBurCplCode;
    @XmlElementRef(name = "CrBurStatCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrBurStatCodeType> crBurStatCode;
    @XmlElementRef(name = "CrBurAcctClsfCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrBurAcctClsfCodeType> crBurAcctClsfCode;
    @XmlElementRef(name = "CrClsfCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrClsfCodeType> crClsfCode;
    @XmlElementRef(name = "CrBurActnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrBurActnCodeType> crBurActnCode;
    @XmlElementRef(name = "CntryType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CntryTypeType> cntryType;
    @XmlElementRef(name = "CrBurSpecCmntCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrBurSpecCmntCodeType> crBurSpecCmntCode;
    @XmlElementRef(name = "CrBurId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrBurIdType> crBurId;
    @XmlElementRef(name = "OrigCrBurId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrBurIdType> origCrBurId;
    @XmlElementRef(name = "OrigAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigAcctIdType> origAcctId;
    @XmlElementRef(name = "ChgdOffAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChgdOffAmtType> chgdOffAmt;
    @XmlElementRef(name = "LiabInstName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LiabInstNameType> liabInstName;
    @XmlElementRef(name = "DlqDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlqDtType> dlqDt;
    @XmlElementRef(name = "CrBurPrtcpCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtcpCodeType> crBurPrtcpCode;
    @XmlElementRef(name = "PrtcpCompName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtcpCompNameType> prtcpCompName;
    @XmlElementRef(name = "EmplName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmplNameType> emplName;
    @XmlElement(name = "EmplAddr")
    protected AddrCType emplAddr;
    @XmlElementRef(name = "OccType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OccTypeType> occType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ODLmt")
    protected ODLmtType odLmt;
    @XmlElement(name = "ODHighBal")
    protected ODHighBalType odHighBal;
    @XmlElement(name = "PastDueAmt")
    protected PastDueAmtType pastDueAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "DebtorName")
    protected PersonNameCType debtorName;
    @XmlElement(name = "DebtorAddr")
    protected AddrCType debtorAddr;
    @XmlElement(name = "DebtorBirthDt")
    protected BirthDtType debtorBirthDt;
    @XmlElement(name = "DebtorPhoneNum")
    protected PhoneNumType debtorPhoneNum;
    @XmlElement(name = "CrBurCorrType")
    protected CrBurCorrTypeType crBurCorrType;
    @XmlElement(name = "DebtorTaxId")
    protected TaxIdType debtorTaxId;
    @XmlElement(name = "CrBurRptTimeDt")
    protected CrBurRptTimeDtType crBurRptTimeDt;
    @XmlElement(name = "CrBurCycleId")
    protected CrBurCycleIdType crBurCycleId;
    @XmlElement(name = "CrBurLnType")
    protected CrBurLnTypeType crBurLnType;
    @XmlElement(name = "CrBurPmtRateCode")
    protected CrBurPmtRateCodeType crBurPmtRateCode;
    @XmlElement(name = "CrBurTermType")
    protected PmtFreqUnitsType crBurTermType;
    @XmlElement(name = "CrBurTermFreqType")
    protected CrBurTermFreqTypeType crBurTermFreqType;
    @XmlElement(name = "OpenDt")
    protected OpenDtType openDt;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "LastPmtDt")
    protected LastPmtDtType lastPmtDt;
    @XmlElement(name = "PmtAmt")
    protected PmtAmtType pmtAmt;
    @XmlElement(name = "BilDueDt")
    protected BilDueDtType bilDueDt;
    @XmlElement(name = "PmtAmtTot")
    protected PmtAmtTotType pmtAmtTot;
    @XmlElement(name = "ClsDt")
    protected ClsDtType clsDt;
    @XmlElement(name = "SecdMktAgencyType")
    protected SecdMktAgencyTypeType secdMktAgencyType;
    @XmlElement(name = "PrtcpAcctId")
    protected PrtcpAcctIdType prtcpAcctId;
    @XmlElement(name = "MERSId")
    protected MERSIdType mersId;
    @XmlElement(name = "PmtExcpCode")
    protected PmtExcpCodeType pmtExcpCode;
    @XmlElement(name = "PmtExcpStartDt")
    protected PmtDueDtType pmtExcpStartDt;
    @XmlElement(name = "PmtExcpDueDt")
    protected PmtDueDtType pmtExcpDueDt;
    @XmlElement(name = "CrBurFileMainCode")
    protected CrBurFileMainCodeType crBurFileMainCode;
    @XmlElement(name = "NonCrBurRptRsn")
    protected NonCrBurRptRsnType nonCrBurRptRsn;
    @XmlElement(name = "PmtHistArray")
    protected PmtHistArrayAType pmtHistArray;
    @XmlElement(name = "HouseHoldDebtorArray")
    protected HouseHoldDebtorArrayAType houseHoldDebtorArray;
    @XmlElement(name = "NonHouseHoldDebtorArray")
    protected NonHouseHoldDebtorArrayAType nonHouseHoldDebtorArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "DefRptType")
    protected DefRptTypeType defRptType;
    @XmlElement(name = "DefPmtStartDt")
    protected DefPmtStartDtType defPmtStartDt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "OvrrdCrBurStatCode")
    protected CrBurStatCodeType ovrrdCrBurStatCode;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the ecoaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ECOACodeType }{@code >}
     *     
     */
    public JAXBElement<ECOACodeType> getECOACode() {
        return ecoaCode;
    }

    /**
     * Sets the value of the ecoaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ECOACodeType }{@code >}
     *     
     */
    public void setECOACode(JAXBElement<ECOACodeType> value) {
        this.ecoaCode = value;
    }

    /**
     * Gets the value of the bnkRptcyFileCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyFileCodeType }{@code >}
     *     
     */
    public JAXBElement<BnkRptcyFileCodeType> getBnkRptcyFileCode() {
        return bnkRptcyFileCode;
    }

    /**
     * Sets the value of the bnkRptcyFileCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyFileCodeType }{@code >}
     *     
     */
    public void setBnkRptcyFileCode(JAXBElement<BnkRptcyFileCodeType> value) {
        this.bnkRptcyFileCode = value;
    }

    /**
     * Gets the value of the crBurAddrRptCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrBurAddrRptCodeType }{@code >}
     *     
     */
    public JAXBElement<CrBurAddrRptCodeType> getCrBurAddrRptCode() {
        return crBurAddrRptCode;
    }

    /**
     * Sets the value of the crBurAddrRptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrBurAddrRptCodeType }{@code >}
     *     
     */
    public void setCrBurAddrRptCode(JAXBElement<CrBurAddrRptCodeType> value) {
        this.crBurAddrRptCode = value;
    }

    /**
     * Gets the value of the crBurOccupCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OccupCodeType }{@code >}
     *     
     */
    public JAXBElement<OccupCodeType> getCrBurOccupCode() {
        return crBurOccupCode;
    }

    /**
     * Sets the value of the crBurOccupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OccupCodeType }{@code >}
     *     
     */
    public void setCrBurOccupCode(JAXBElement<OccupCodeType> value) {
        this.crBurOccupCode = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NameSuffixType }{@code >}
     *     
     */
    public JAXBElement<NameSuffixType> getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NameSuffixType }{@code >}
     *     
     */
    public void setNameSuffix(JAXBElement<NameSuffixType> value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the crBurTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrBurTranCodeType }{@code >}
     *     
     */
    public JAXBElement<CrBurTranCodeType> getCrBurTranCode() {
        return crBurTranCode;
    }

    /**
     * Sets the value of the crBurTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrBurTranCodeType }{@code >}
     *     
     */
    public void setCrBurTranCode(JAXBElement<CrBurTranCodeType> value) {
        this.crBurTranCode = value;
    }

    /**
     * Gets the value of the crBurCplCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrBurCplCodeType }{@code >}
     *     
     */
    public JAXBElement<CrBurCplCodeType> getCrBurCplCode() {
        return crBurCplCode;
    }

    /**
     * Sets the value of the crBurCplCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrBurCplCodeType }{@code >}
     *     
     */
    public void setCrBurCplCode(JAXBElement<CrBurCplCodeType> value) {
        this.crBurCplCode = value;
    }

    /**
     * Gets the value of the crBurStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrBurStatCodeType }{@code >}
     *     
     */
    public JAXBElement<CrBurStatCodeType> getCrBurStatCode() {
        return crBurStatCode;
    }

    /**
     * Sets the value of the crBurStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrBurStatCodeType }{@code >}
     *     
     */
    public void setCrBurStatCode(JAXBElement<CrBurStatCodeType> value) {
        this.crBurStatCode = value;
    }

    /**
     * Gets the value of the crBurAcctClsfCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrBurAcctClsfCodeType }{@code >}
     *     
     */
    public JAXBElement<CrBurAcctClsfCodeType> getCrBurAcctClsfCode() {
        return crBurAcctClsfCode;
    }

    /**
     * Sets the value of the crBurAcctClsfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrBurAcctClsfCodeType }{@code >}
     *     
     */
    public void setCrBurAcctClsfCode(JAXBElement<CrBurAcctClsfCodeType> value) {
        this.crBurAcctClsfCode = value;
    }

    /**
     * Gets the value of the crClsfCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrClsfCodeType }{@code >}
     *     
     */
    public JAXBElement<CrClsfCodeType> getCrClsfCode() {
        return crClsfCode;
    }

    /**
     * Sets the value of the crClsfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrClsfCodeType }{@code >}
     *     
     */
    public void setCrClsfCode(JAXBElement<CrClsfCodeType> value) {
        this.crClsfCode = value;
    }

    /**
     * Gets the value of the crBurActnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrBurActnCodeType }{@code >}
     *     
     */
    public JAXBElement<CrBurActnCodeType> getCrBurActnCode() {
        return crBurActnCode;
    }

    /**
     * Sets the value of the crBurActnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrBurActnCodeType }{@code >}
     *     
     */
    public void setCrBurActnCode(JAXBElement<CrBurActnCodeType> value) {
        this.crBurActnCode = value;
    }

    /**
     * Gets the value of the cntryType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CntryTypeType }{@code >}
     *     
     */
    public JAXBElement<CntryTypeType> getCntryType() {
        return cntryType;
    }

    /**
     * Sets the value of the cntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CntryTypeType }{@code >}
     *     
     */
    public void setCntryType(JAXBElement<CntryTypeType> value) {
        this.cntryType = value;
    }

    /**
     * Gets the value of the crBurSpecCmntCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrBurSpecCmntCodeType }{@code >}
     *     
     */
    public JAXBElement<CrBurSpecCmntCodeType> getCrBurSpecCmntCode() {
        return crBurSpecCmntCode;
    }

    /**
     * Sets the value of the crBurSpecCmntCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrBurSpecCmntCodeType }{@code >}
     *     
     */
    public void setCrBurSpecCmntCode(JAXBElement<CrBurSpecCmntCodeType> value) {
        this.crBurSpecCmntCode = value;
    }

    /**
     * Gets the value of the crBurId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrBurIdType }{@code >}
     *     
     */
    public JAXBElement<CrBurIdType> getCrBurId() {
        return crBurId;
    }

    /**
     * Sets the value of the crBurId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrBurIdType }{@code >}
     *     
     */
    public void setCrBurId(JAXBElement<CrBurIdType> value) {
        this.crBurId = value;
    }

    /**
     * Gets the value of the origCrBurId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrBurIdType }{@code >}
     *     
     */
    public JAXBElement<CrBurIdType> getOrigCrBurId() {
        return origCrBurId;
    }

    /**
     * Sets the value of the origCrBurId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrBurIdType }{@code >}
     *     
     */
    public void setOrigCrBurId(JAXBElement<CrBurIdType> value) {
        this.origCrBurId = value;
    }

    /**
     * Gets the value of the origAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigAcctIdType }{@code >}
     *     
     */
    public JAXBElement<OrigAcctIdType> getOrigAcctId() {
        return origAcctId;
    }

    /**
     * Sets the value of the origAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigAcctIdType }{@code >}
     *     
     */
    public void setOrigAcctId(JAXBElement<OrigAcctIdType> value) {
        this.origAcctId = value;
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
     * Gets the value of the liabInstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiabInstNameType }{@code >}
     *     
     */
    public JAXBElement<LiabInstNameType> getLiabInstName() {
        return liabInstName;
    }

    /**
     * Sets the value of the liabInstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiabInstNameType }{@code >}
     *     
     */
    public void setLiabInstName(JAXBElement<LiabInstNameType> value) {
        this.liabInstName = value;
    }

    /**
     * Gets the value of the dlqDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlqDtType }{@code >}
     *     
     */
    public JAXBElement<DlqDtType> getDlqDt() {
        return dlqDt;
    }

    /**
     * Sets the value of the dlqDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlqDtType }{@code >}
     *     
     */
    public void setDlqDt(JAXBElement<DlqDtType> value) {
        this.dlqDt = value;
    }

    /**
     * Gets the value of the crBurPrtcpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtcpCodeType }{@code >}
     *     
     */
    public JAXBElement<PrtcpCodeType> getCrBurPrtcpCode() {
        return crBurPrtcpCode;
    }

    /**
     * Sets the value of the crBurPrtcpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtcpCodeType }{@code >}
     *     
     */
    public void setCrBurPrtcpCode(JAXBElement<PrtcpCodeType> value) {
        this.crBurPrtcpCode = value;
    }

    /**
     * Gets the value of the prtcpCompName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtcpCompNameType }{@code >}
     *     
     */
    public JAXBElement<PrtcpCompNameType> getPrtcpCompName() {
        return prtcpCompName;
    }

    /**
     * Sets the value of the prtcpCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtcpCompNameType }{@code >}
     *     
     */
    public void setPrtcpCompName(JAXBElement<PrtcpCompNameType> value) {
        this.prtcpCompName = value;
    }

    /**
     * Gets the value of the emplName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}
     *     
     */
    public JAXBElement<EmplNameType> getEmplName() {
        return emplName;
    }

    /**
     * Sets the value of the emplName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}
     *     
     */
    public void setEmplName(JAXBElement<EmplNameType> value) {
        this.emplName = value;
    }

    /**
     * Gets the value of the emplAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getEmplAddr() {
        return emplAddr;
    }

    /**
     * Sets the value of the emplAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setEmplAddr(AddrCType value) {
        this.emplAddr = value;
    }

    /**
     * Gets the value of the occType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OccTypeType }{@code >}
     *     
     */
    public JAXBElement<OccTypeType> getOccType() {
        return occType;
    }

    /**
     * Sets the value of the occType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OccTypeType }{@code >}
     *     
     */
    public void setOccType(JAXBElement<OccTypeType> value) {
        this.occType = value;
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
     * Gets the value of the odLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ODLmtType }
     *     
     */
    public ODLmtType getODLmt() {
        return odLmt;
    }

    /**
     * Sets the value of the odLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODLmtType }
     *     
     */
    public void setODLmt(ODLmtType value) {
        this.odLmt = value;
    }

    /**
     * Gets the value of the odHighBal property.
     * 
     * @return
     *     possible object is
     *     {@link ODHighBalType }
     *     
     */
    public ODHighBalType getODHighBal() {
        return odHighBal;
    }

    /**
     * Sets the value of the odHighBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODHighBalType }
     *     
     */
    public void setODHighBal(ODHighBalType value) {
        this.odHighBal = value;
    }

    /**
     * Gets the value of the pastDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PastDueAmtType }
     *     
     */
    public PastDueAmtType getPastDueAmt() {
        return pastDueAmt;
    }

    /**
     * Sets the value of the pastDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDueAmtType }
     *     
     */
    public void setPastDueAmt(PastDueAmtType value) {
        this.pastDueAmt = value;
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
     * Gets the value of the debtorName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getDebtorName() {
        return debtorName;
    }

    /**
     * Sets the value of the debtorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setDebtorName(PersonNameCType value) {
        this.debtorName = value;
    }

    /**
     * Gets the value of the debtorAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getDebtorAddr() {
        return debtorAddr;
    }

    /**
     * Sets the value of the debtorAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setDebtorAddr(AddrCType value) {
        this.debtorAddr = value;
    }

    /**
     * Gets the value of the debtorBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDtType }
     *     
     */
    public BirthDtType getDebtorBirthDt() {
        return debtorBirthDt;
    }

    /**
     * Sets the value of the debtorBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDtType }
     *     
     */
    public void setDebtorBirthDt(BirthDtType value) {
        this.debtorBirthDt = value;
    }

    /**
     * Gets the value of the debtorPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumType }
     *     
     */
    public PhoneNumType getDebtorPhoneNum() {
        return debtorPhoneNum;
    }

    /**
     * Sets the value of the debtorPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumType }
     *     
     */
    public void setDebtorPhoneNum(PhoneNumType value) {
        this.debtorPhoneNum = value;
    }

    /**
     * Gets the value of the crBurCorrType property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurCorrTypeType }
     *     
     */
    public CrBurCorrTypeType getCrBurCorrType() {
        return crBurCorrType;
    }

    /**
     * Sets the value of the crBurCorrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurCorrTypeType }
     *     
     */
    public void setCrBurCorrType(CrBurCorrTypeType value) {
        this.crBurCorrType = value;
    }

    /**
     * Gets the value of the debtorTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getDebtorTaxId() {
        return debtorTaxId;
    }

    /**
     * Sets the value of the debtorTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setDebtorTaxId(TaxIdType value) {
        this.debtorTaxId = value;
    }

    /**
     * Gets the value of the crBurRptTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurRptTimeDtType }
     *     
     */
    public CrBurRptTimeDtType getCrBurRptTimeDt() {
        return crBurRptTimeDt;
    }

    /**
     * Sets the value of the crBurRptTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurRptTimeDtType }
     *     
     */
    public void setCrBurRptTimeDt(CrBurRptTimeDtType value) {
        this.crBurRptTimeDt = value;
    }

    /**
     * Gets the value of the crBurCycleId property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurCycleIdType }
     *     
     */
    public CrBurCycleIdType getCrBurCycleId() {
        return crBurCycleId;
    }

    /**
     * Sets the value of the crBurCycleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurCycleIdType }
     *     
     */
    public void setCrBurCycleId(CrBurCycleIdType value) {
        this.crBurCycleId = value;
    }

    /**
     * Gets the value of the crBurLnType property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurLnTypeType }
     *     
     */
    public CrBurLnTypeType getCrBurLnType() {
        return crBurLnType;
    }

    /**
     * Sets the value of the crBurLnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurLnTypeType }
     *     
     */
    public void setCrBurLnType(CrBurLnTypeType value) {
        this.crBurLnType = value;
    }

    /**
     * Gets the value of the crBurPmtRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurPmtRateCodeType }
     *     
     */
    public CrBurPmtRateCodeType getCrBurPmtRateCode() {
        return crBurPmtRateCode;
    }

    /**
     * Sets the value of the crBurPmtRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurPmtRateCodeType }
     *     
     */
    public void setCrBurPmtRateCode(CrBurPmtRateCodeType value) {
        this.crBurPmtRateCode = value;
    }

    /**
     * Gets the value of the crBurTermType property.
     * 
     * @return
     *     possible object is
     *     {@link PmtFreqUnitsType }
     *     
     */
    public PmtFreqUnitsType getCrBurTermType() {
        return crBurTermType;
    }

    /**
     * Sets the value of the crBurTermType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtFreqUnitsType }
     *     
     */
    public void setCrBurTermType(PmtFreqUnitsType value) {
        this.crBurTermType = value;
    }

    /**
     * Gets the value of the crBurTermFreqType property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurTermFreqTypeType }
     *     
     */
    public CrBurTermFreqTypeType getCrBurTermFreqType() {
        return crBurTermFreqType;
    }

    /**
     * Sets the value of the crBurTermFreqType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurTermFreqTypeType }
     *     
     */
    public void setCrBurTermFreqType(CrBurTermFreqTypeType value) {
        this.crBurTermFreqType = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link OpenDtType }
     *     
     */
    public OpenDtType getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenDtType }
     *     
     */
    public void setOpenDt(OpenDtType value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurBalType }
     *     
     */
    public CurBalType getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurBalType }
     *     
     */
    public void setCurBal(CurBalType value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the lastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastPmtDtType }
     *     
     */
    public LastPmtDtType getLastPmtDt() {
        return lastPmtDt;
    }

    /**
     * Sets the value of the lastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPmtDtType }
     *     
     */
    public void setLastPmtDt(LastPmtDtType value) {
        this.lastPmtDt = value;
    }

    /**
     * Gets the value of the pmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAmtType }
     *     
     */
    public PmtAmtType getPmtAmt() {
        return pmtAmt;
    }

    /**
     * Sets the value of the pmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAmtType }
     *     
     */
    public void setPmtAmt(PmtAmtType value) {
        this.pmtAmt = value;
    }

    /**
     * Gets the value of the bilDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link BilDueDtType }
     *     
     */
    public BilDueDtType getBilDueDt() {
        return bilDueDt;
    }

    /**
     * Sets the value of the bilDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilDueDtType }
     *     
     */
    public void setBilDueDt(BilDueDtType value) {
        this.bilDueDt = value;
    }

    /**
     * Gets the value of the pmtAmtTot property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAmtTotType }
     *     
     */
    public PmtAmtTotType getPmtAmtTot() {
        return pmtAmtTot;
    }

    /**
     * Sets the value of the pmtAmtTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAmtTotType }
     *     
     */
    public void setPmtAmtTot(PmtAmtTotType value) {
        this.pmtAmtTot = value;
    }

    /**
     * Gets the value of the clsDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClsDtType }
     *     
     */
    public ClsDtType getClsDt() {
        return clsDt;
    }

    /**
     * Sets the value of the clsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsDtType }
     *     
     */
    public void setClsDt(ClsDtType value) {
        this.clsDt = value;
    }

    /**
     * Gets the value of the secdMktAgencyType property.
     * 
     * @return
     *     possible object is
     *     {@link SecdMktAgencyTypeType }
     *     
     */
    public SecdMktAgencyTypeType getSecdMktAgencyType() {
        return secdMktAgencyType;
    }

    /**
     * Sets the value of the secdMktAgencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecdMktAgencyTypeType }
     *     
     */
    public void setSecdMktAgencyType(SecdMktAgencyTypeType value) {
        this.secdMktAgencyType = value;
    }

    /**
     * Gets the value of the prtcpAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpAcctIdType }
     *     
     */
    public PrtcpAcctIdType getPrtcpAcctId() {
        return prtcpAcctId;
    }

    /**
     * Sets the value of the prtcpAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpAcctIdType }
     *     
     */
    public void setPrtcpAcctId(PrtcpAcctIdType value) {
        this.prtcpAcctId = value;
    }

    /**
     * Gets the value of the mersId property.
     * 
     * @return
     *     possible object is
     *     {@link MERSIdType }
     *     
     */
    public MERSIdType getMERSId() {
        return mersId;
    }

    /**
     * Sets the value of the mersId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MERSIdType }
     *     
     */
    public void setMERSId(MERSIdType value) {
        this.mersId = value;
    }

    /**
     * Gets the value of the pmtExcpCode property.
     * 
     * @return
     *     possible object is
     *     {@link PmtExcpCodeType }
     *     
     */
    public PmtExcpCodeType getPmtExcpCode() {
        return pmtExcpCode;
    }

    /**
     * Sets the value of the pmtExcpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtExcpCodeType }
     *     
     */
    public void setPmtExcpCode(PmtExcpCodeType value) {
        this.pmtExcpCode = value;
    }

    /**
     * Gets the value of the pmtExcpStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtDueDtType }
     *     
     */
    public PmtDueDtType getPmtExcpStartDt() {
        return pmtExcpStartDt;
    }

    /**
     * Sets the value of the pmtExcpStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtDueDtType }
     *     
     */
    public void setPmtExcpStartDt(PmtDueDtType value) {
        this.pmtExcpStartDt = value;
    }

    /**
     * Gets the value of the pmtExcpDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtDueDtType }
     *     
     */
    public PmtDueDtType getPmtExcpDueDt() {
        return pmtExcpDueDt;
    }

    /**
     * Sets the value of the pmtExcpDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtDueDtType }
     *     
     */
    public void setPmtExcpDueDt(PmtDueDtType value) {
        this.pmtExcpDueDt = value;
    }

    /**
     * Gets the value of the crBurFileMainCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurFileMainCodeType }
     *     
     */
    public CrBurFileMainCodeType getCrBurFileMainCode() {
        return crBurFileMainCode;
    }

    /**
     * Sets the value of the crBurFileMainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurFileMainCodeType }
     *     
     */
    public void setCrBurFileMainCode(CrBurFileMainCodeType value) {
        this.crBurFileMainCode = value;
    }

    /**
     * Gets the value of the nonCrBurRptRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NonCrBurRptRsnType }
     *     
     */
    public NonCrBurRptRsnType getNonCrBurRptRsn() {
        return nonCrBurRptRsn;
    }

    /**
     * Sets the value of the nonCrBurRptRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonCrBurRptRsnType }
     *     
     */
    public void setNonCrBurRptRsn(NonCrBurRptRsnType value) {
        this.nonCrBurRptRsn = value;
    }

    /**
     * Gets the value of the pmtHistArray property.
     * 
     * @return
     *     possible object is
     *     {@link PmtHistArrayAType }
     *     
     */
    public PmtHistArrayAType getPmtHistArray() {
        return pmtHistArray;
    }

    /**
     * Sets the value of the pmtHistArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtHistArrayAType }
     *     
     */
    public void setPmtHistArray(PmtHistArrayAType value) {
        this.pmtHistArray = value;
    }

    /**
     * Gets the value of the houseHoldDebtorArray property.
     * 
     * @return
     *     possible object is
     *     {@link HouseHoldDebtorArrayAType }
     *     
     */
    public HouseHoldDebtorArrayAType getHouseHoldDebtorArray() {
        return houseHoldDebtorArray;
    }

    /**
     * Sets the value of the houseHoldDebtorArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseHoldDebtorArrayAType }
     *     
     */
    public void setHouseHoldDebtorArray(HouseHoldDebtorArrayAType value) {
        this.houseHoldDebtorArray = value;
    }

    /**
     * Gets the value of the nonHouseHoldDebtorArray property.
     * 
     * @return
     *     possible object is
     *     {@link NonHouseHoldDebtorArrayAType }
     *     
     */
    public NonHouseHoldDebtorArrayAType getNonHouseHoldDebtorArray() {
        return nonHouseHoldDebtorArray;
    }

    /**
     * Sets the value of the nonHouseHoldDebtorArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonHouseHoldDebtorArrayAType }
     *     
     */
    public void setNonHouseHoldDebtorArray(NonHouseHoldDebtorArrayAType value) {
        this.nonHouseHoldDebtorArray = value;
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
     * Gets the value of the defRptType property.
     * 
     * @return
     *     possible object is
     *     {@link DefRptTypeType }
     *     
     */
    public DefRptTypeType getDefRptType() {
        return defRptType;
    }

    /**
     * Sets the value of the defRptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefRptTypeType }
     *     
     */
    public void setDefRptType(DefRptTypeType value) {
        this.defRptType = value;
    }

    /**
     * Gets the value of the defPmtStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link DefPmtStartDtType }
     *     
     */
    public DefPmtStartDtType getDefPmtStartDt() {
        return defPmtStartDt;
    }

    /**
     * Sets the value of the defPmtStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefPmtStartDtType }
     *     
     */
    public void setDefPmtStartDt(DefPmtStartDtType value) {
        this.defPmtStartDt = value;
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
     * Gets the value of the ovrrdCrBurStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurStatCodeType }
     *     
     */
    public CrBurStatCodeType getOvrrdCrBurStatCode() {
        return ovrrdCrBurStatCode;
    }

    /**
     * Sets the value of the ovrrdCrBurStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurStatCodeType }
     *     
     */
    public void setOvrrdCrBurStatCode(CrBurStatCodeType value) {
        this.ovrrdCrBurStatCode = value;
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
