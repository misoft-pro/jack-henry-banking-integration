
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
 * <p>Java class for SvcDftRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcDftRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="CustDetail" type="{http://jackhenry.com/jxchange/TPG/2008}CustDetail_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxDetail" type="{http://jackhenry.com/jxchange/TPG/2008}TaxDetail_CType" minOccurs="0"/&gt;
 *         &lt;element name="BusDetail" type="{http://jackhenry.com/jxchange/TPG/2008}BusDetail_CType" minOccurs="0"/&gt;
 *         &lt;element name="RegDetail" type="{http://jackhenry.com/jxchange/TPG/2008}RegDetail_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustRelRec" type="{http://jackhenry.com/jxchange/TPG/2008}CustRelRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="XferRec" type="{http://jackhenry.com/jxchange/TPG/2008}XferRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="PlnCust" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCust_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxPlnDist" type="{http://jackhenry.com/jxchange/TPG/2008}TaxPlnDist_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxPlnTaxInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TaxPlnTaxInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Benf" type="{http://jackhenry.com/jxchange/TPG/2008}Benf_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}DepInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepBalDtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepBalDtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepNSFODInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepNSFODInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepRateIntInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepRateIntInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepRegRptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepRegRptInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepStmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepStmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepTaxInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepTaxInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepBalDtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepBalDtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepRenInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepRenInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepRateIntInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepRateIntInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepRegRptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepRegRptInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepStmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepStmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepTaxInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepTaxInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="ACHPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ACHPmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TrnInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TrnInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="StopChkInfo" type="{http://jackhenry.com/jxchange/TPG/2008}StopChkInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CollatItem" type="{http://jackhenry.com/jxchange/TPG/2008}CollatItemRec_CType" minOccurs="0"/&gt;
 *           &lt;element name="CollatDoc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocRec_CType" minOccurs="0"/&gt;
 *           &lt;element name="RealEstateProp" type="{http://jackhenry.com/jxchange/TPG/2008}RealEstatePropRec_CType" minOccurs="0"/&gt;
 *           &lt;element name="LOC" type="{http://jackhenry.com/jxchange/TPG/2008}LOCRec_CType" minOccurs="0"/&gt;
 *           &lt;element name="EscrwInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwInfoRec_CType" minOccurs="0"/&gt;
 *           &lt;element name="FldInsurInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}FldInsurInfoRec_CType" minOccurs="0"/&gt;
 *           &lt;element name="EscrwPmtBalInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtBalInfoRec_CType" minOccurs="0"/&gt;
 *           &lt;element name="EscrwAnlysInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwAnlysInfoRec_CType" minOccurs="0"/&gt;
 *           &lt;element name="EscrwFedWith" type="{http://jackhenry.com/jxchange/TPG/2008}FedWith_CType" minOccurs="0"/&gt;
 *           &lt;element name="EscrwStateWith" type="{http://jackhenry.com/jxchange/TPG/2008}StateWith_CType" minOccurs="0"/&gt;
 *           &lt;element name="FASB9InfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91InfoRec_CType" minOccurs="0"/&gt;
 *           &lt;element name="LnInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}LnInfoRec_CType" minOccurs="0"/&gt;
 *           &lt;element name="LnAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnAcctInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="LnBalDtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnBalDtInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="LnDlrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnDlrInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="LnPastDueInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnPastDueInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="LnPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnPmtInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="LnProtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnProtInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="LnRateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnRateInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="LnRealEstateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnRealEstateInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="LnRenExtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnRenExtInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="LnRegRptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnRegRptInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="LnMtgInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnMtgInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="LnStopInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnStopInfo_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ACHXferRec" type="{http://jackhenry.com/jxchange/TPG/2008}ACHXferRec_CType" minOccurs="0"/&gt;
 *             &lt;element name="FutXferRec" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferRec_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="LnPmtSchedInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnPmtSchedInfo_CType" minOccurs="0"/&gt;
 *               &lt;element name="CrBurInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurInfo_CType" minOccurs="0"/&gt;
 *               &lt;element name="CustMsgInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CustMsgInfoRec_CType" minOccurs="0"/&gt;
 *               &lt;element name="ResLnAppRgtrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ResLnAppRgtrInfo_CType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="TrckAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TrckAcctInfo_CType" minOccurs="0"/&gt;
 *                 &lt;element name="AcctBenf" type="{http://jackhenry.com/jxchange/TPG/2008}AcctBenf_CType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="SweepAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}SweepAcctInfo_CType" minOccurs="0"/&gt;
 *                   &lt;element name="AcctCombStmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctCombStmtInfo_CType" minOccurs="0"/&gt;
 *                   &lt;element name="AcctProdOvrrdInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}AcctProdOvrrdInfoRec_CType" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="EmplAppInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}EmplAppInfoRec_CType" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="SafeDepInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}SafeDepInfoRec_CType" minOccurs="0"/&gt;
 *                       &lt;element name="SafeDepAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}SafeDepAcctInfo_CType" minOccurs="0"/&gt;
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
@XmlType(name = "SvcDftRs_MType", propOrder = {
    "msgRsHdr",
    "custDetail",
    "taxDetail",
    "busDetail",
    "regDetail",
    "custRelRec",
    "xferRec",
    "plnCust",
    "taxPlnDist",
    "taxPlnTaxInfo",
    "benf",
    "depInfoRec",
    "depAcctInfo",
    "depBalDtInfo",
    "depNSFODInfo",
    "depRateIntInfo",
    "depRegRptInfo",
    "depStmtInfo",
    "depTaxInfo",
    "timeDepInfoRec",
    "timeDepAcctInfo",
    "timeDepBalDtInfo",
    "timeDepRenInfo",
    "timeDepRateIntInfo",
    "timeDepRegRptInfo",
    "timeDepStmtInfo",
    "timeDepTaxInfo",
    "achPmtInfo",
    "trnInfo",
    "stopChkInfo",
    "custom",
    "ver1",
    "collatItem",
    "collatDoc",
    "realEstateProp",
    "loc",
    "escrwInfoRec",
    "fldInsurInfoRec",
    "escrwPmtBalInfoRec",
    "escrwAnlysInfoRec",
    "escrwFedWith",
    "escrwStateWith",
    "fasb9InfoRec",
    "lnInfoRec",
    "lnAcctInfo",
    "lnBalDtInfo",
    "lnDlrInfo",
    "lnPastDueInfo",
    "lnPmtInfo",
    "lnProtInfo",
    "lnRateInfo",
    "lnRealEstateInfo",
    "lnRenExtInfo",
    "lnRegRptInfo",
    "lnMtgInfo",
    "lnStopInfo",
    "ver2",
    "achXferRec",
    "futXferRec",
    "ver3",
    "lnPmtSchedInfo",
    "crBurInfo",
    "custMsgInfoRec",
    "resLnAppRgtrInfo",
    "ver4",
    "trckAcctInfo",
    "acctBenf",
    "ver5",
    "sweepAcctInfo",
    "acctCombStmtInfo",
    "acctProdOvrrdInfoRec",
    "ver6",
    "emplAppInfoRec",
    "ver7",
    "safeDepInfoRec",
    "safeDepAcctInfo",
    "ver8",
    "any"
})
public class SvcDftRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "CustDetail", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustDetailCType> custDetail;
    @XmlElementRef(name = "TaxDetail", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxDetailCType> taxDetail;
    @XmlElementRef(name = "BusDetail", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BusDetailCType> busDetail;
    @XmlElementRef(name = "RegDetail", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RegDetailCType> regDetail;
    @XmlElementRef(name = "CustRelRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustRelRecCType> custRelRec;
    @XmlElementRef(name = "XferRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferRecCType> xferRec;
    @XmlElementRef(name = "PlnCust", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnCustCType> plnCust;
    @XmlElementRef(name = "TaxPlnDist", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxPlnDistCType> taxPlnDist;
    @XmlElementRef(name = "TaxPlnTaxInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxPlnTaxInfoCType> taxPlnTaxInfo;
    @XmlElementRef(name = "Benf", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfCType> benf;
    @XmlElementRef(name = "DepInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DepInfoRecCType> depInfoRec;
    @XmlElementRef(name = "DepAcctInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DepAcctInfoCType> depAcctInfo;
    @XmlElementRef(name = "DepBalDtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DepBalDtInfoCType> depBalDtInfo;
    @XmlElementRef(name = "DepNSFODInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DepNSFODInfoCType> depNSFODInfo;
    @XmlElementRef(name = "DepRateIntInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DepRateIntInfoCType> depRateIntInfo;
    @XmlElementRef(name = "DepRegRptInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DepRegRptInfoCType> depRegRptInfo;
    @XmlElementRef(name = "DepStmtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DepStmtInfoCType> depStmtInfo;
    @XmlElementRef(name = "DepTaxInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DepTaxInfoCType> depTaxInfo;
    @XmlElementRef(name = "TimeDepInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeDepInfoRecCType> timeDepInfoRec;
    @XmlElementRef(name = "TimeDepAcctInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeDepAcctInfoCType> timeDepAcctInfo;
    @XmlElementRef(name = "TimeDepBalDtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeDepBalDtInfoCType> timeDepBalDtInfo;
    @XmlElementRef(name = "TimeDepRenInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeDepRenInfoCType> timeDepRenInfo;
    @XmlElementRef(name = "TimeDepRateIntInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeDepRateIntInfoCType> timeDepRateIntInfo;
    @XmlElementRef(name = "TimeDepRegRptInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeDepRegRptInfoCType> timeDepRegRptInfo;
    @XmlElementRef(name = "TimeDepStmtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeDepStmtInfoCType> timeDepStmtInfo;
    @XmlElementRef(name = "TimeDepTaxInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeDepTaxInfoCType> timeDepTaxInfo;
    @XmlElementRef(name = "ACHPmtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHPmtInfoCType> achPmtInfo;
    @XmlElementRef(name = "TrnInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnInfoCType> trnInfo;
    @XmlElementRef(name = "StopChkInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StopChkInfoCType> stopChkInfo;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "CollatItem", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatItemRecCType> collatItem;
    @XmlElementRef(name = "CollatDoc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocRecCType> collatDoc;
    @XmlElementRef(name = "RealEstateProp", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RealEstatePropRecCType> realEstateProp;
    @XmlElementRef(name = "LOC", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCRecCType> loc;
    @XmlElementRef(name = "EscrwInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwInfoRecCType> escrwInfoRec;
    @XmlElementRef(name = "FldInsurInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FldInsurInfoRecCType> fldInsurInfoRec;
    @XmlElementRef(name = "EscrwPmtBalInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPmtBalInfoRecCType> escrwPmtBalInfoRec;
    @XmlElementRef(name = "EscrwAnlysInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwAnlysInfoRecCType> escrwAnlysInfoRec;
    @XmlElementRef(name = "EscrwFedWith", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FedWithCType> escrwFedWith;
    @XmlElementRef(name = "EscrwStateWith", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithCType> escrwStateWith;
    @XmlElementRef(name = "FASB9InfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91InfoRecCType> fasb9InfoRec;
    @XmlElementRef(name = "LnInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnInfoRecCType> lnInfoRec;
    @XmlElementRef(name = "LnAcctInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnAcctInfoCType> lnAcctInfo;
    @XmlElementRef(name = "LnBalDtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnBalDtInfoCType> lnBalDtInfo;
    @XmlElementRef(name = "LnDlrInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnDlrInfoCType> lnDlrInfo;
    @XmlElementRef(name = "LnPastDueInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnPastDueInfoCType> lnPastDueInfo;
    @XmlElementRef(name = "LnPmtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnPmtInfoCType> lnPmtInfo;
    @XmlElementRef(name = "LnProtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnProtInfoCType> lnProtInfo;
    @XmlElementRef(name = "LnRateInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnRateInfoCType> lnRateInfo;
    @XmlElementRef(name = "LnRealEstateInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnRealEstateInfoCType> lnRealEstateInfo;
    @XmlElementRef(name = "LnRenExtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnRenExtInfoCType> lnRenExtInfo;
    @XmlElementRef(name = "LnRegRptInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnRegRptInfoCType> lnRegRptInfo;
    @XmlElementRef(name = "LnMtgInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnMtgInfoCType> lnMtgInfo;
    @XmlElementRef(name = "LnStopInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnStopInfoCType> lnStopInfo;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "ACHXferRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHXferRecCType> achXferRec;
    @XmlElementRef(name = "FutXferRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferRecCType> futXferRec;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElementRef(name = "LnPmtSchedInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnPmtSchedInfoCType> lnPmtSchedInfo;
    @XmlElementRef(name = "CrBurInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrBurInfoCType> crBurInfo;
    @XmlElementRef(name = "CustMsgInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustMsgInfoRecCType> custMsgInfoRec;
    @XmlElementRef(name = "ResLnAppRgtrInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ResLnAppRgtrInfoCType> resLnAppRgtrInfo;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElementRef(name = "TrckAcctInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrckAcctInfoCType> trckAcctInfo;
    @XmlElementRef(name = "AcctBenf", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctBenfCType> acctBenf;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElementRef(name = "SweepAcctInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepAcctInfoCType> sweepAcctInfo;
    @XmlElementRef(name = "AcctCombStmtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctCombStmtInfoCType> acctCombStmtInfo;
    @XmlElementRef(name = "AcctProdOvrrdInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctProdOvrrdInfoRecCType> acctProdOvrrdInfoRec;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElementRef(name = "EmplAppInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmplAppInfoRecCType> emplAppInfoRec;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElementRef(name = "SafeDepInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SafeDepInfoRecCType> safeDepInfoRec;
    @XmlElementRef(name = "SafeDepAcctInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SafeDepAcctInfoCType> safeDepAcctInfo;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public MsgRsHdrCType getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Sets the value of the msgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public void setMsgRsHdr(MsgRsHdrCType value) {
        this.msgRsHdr = value;
    }

    /**
     * Gets the value of the custDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustDetailCType }{@code >}
     *     
     */
    public JAXBElement<CustDetailCType> getCustDetail() {
        return custDetail;
    }

    /**
     * Sets the value of the custDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustDetailCType }{@code >}
     *     
     */
    public void setCustDetail(JAXBElement<CustDetailCType> value) {
        this.custDetail = value;
    }

    /**
     * Gets the value of the taxDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxDetailCType }{@code >}
     *     
     */
    public JAXBElement<TaxDetailCType> getTaxDetail() {
        return taxDetail;
    }

    /**
     * Sets the value of the taxDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxDetailCType }{@code >}
     *     
     */
    public void setTaxDetail(JAXBElement<TaxDetailCType> value) {
        this.taxDetail = value;
    }

    /**
     * Gets the value of the busDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BusDetailCType }{@code >}
     *     
     */
    public JAXBElement<BusDetailCType> getBusDetail() {
        return busDetail;
    }

    /**
     * Sets the value of the busDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BusDetailCType }{@code >}
     *     
     */
    public void setBusDetail(JAXBElement<BusDetailCType> value) {
        this.busDetail = value;
    }

    /**
     * Gets the value of the regDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegDetailCType }{@code >}
     *     
     */
    public JAXBElement<RegDetailCType> getRegDetail() {
        return regDetail;
    }

    /**
     * Sets the value of the regDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegDetailCType }{@code >}
     *     
     */
    public void setRegDetail(JAXBElement<RegDetailCType> value) {
        this.regDetail = value;
    }

    /**
     * Gets the value of the custRelRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustRelRecCType }{@code >}
     *     
     */
    public JAXBElement<CustRelRecCType> getCustRelRec() {
        return custRelRec;
    }

    /**
     * Sets the value of the custRelRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustRelRecCType }{@code >}
     *     
     */
    public void setCustRelRec(JAXBElement<CustRelRecCType> value) {
        this.custRelRec = value;
    }

    /**
     * Gets the value of the xferRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferRecCType }{@code >}
     *     
     */
    public JAXBElement<XferRecCType> getXferRec() {
        return xferRec;
    }

    /**
     * Sets the value of the xferRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferRecCType }{@code >}
     *     
     */
    public void setXferRec(JAXBElement<XferRecCType> value) {
        this.xferRec = value;
    }

    /**
     * Gets the value of the plnCust property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnCustCType }{@code >}
     *     
     */
    public JAXBElement<PlnCustCType> getPlnCust() {
        return plnCust;
    }

    /**
     * Sets the value of the plnCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnCustCType }{@code >}
     *     
     */
    public void setPlnCust(JAXBElement<PlnCustCType> value) {
        this.plnCust = value;
    }

    /**
     * Gets the value of the taxPlnDist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxPlnDistCType }{@code >}
     *     
     */
    public JAXBElement<TaxPlnDistCType> getTaxPlnDist() {
        return taxPlnDist;
    }

    /**
     * Sets the value of the taxPlnDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxPlnDistCType }{@code >}
     *     
     */
    public void setTaxPlnDist(JAXBElement<TaxPlnDistCType> value) {
        this.taxPlnDist = value;
    }

    /**
     * Gets the value of the taxPlnTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxPlnTaxInfoCType }{@code >}
     *     
     */
    public JAXBElement<TaxPlnTaxInfoCType> getTaxPlnTaxInfo() {
        return taxPlnTaxInfo;
    }

    /**
     * Sets the value of the taxPlnTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxPlnTaxInfoCType }{@code >}
     *     
     */
    public void setTaxPlnTaxInfo(JAXBElement<TaxPlnTaxInfoCType> value) {
        this.taxPlnTaxInfo = value;
    }

    /**
     * Gets the value of the benf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfCType }{@code >}
     *     
     */
    public JAXBElement<BenfCType> getBenf() {
        return benf;
    }

    /**
     * Sets the value of the benf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfCType }{@code >}
     *     
     */
    public void setBenf(JAXBElement<BenfCType> value) {
        this.benf = value;
    }

    /**
     * Gets the value of the depInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DepInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<DepInfoRecCType> getDepInfoRec() {
        return depInfoRec;
    }

    /**
     * Sets the value of the depInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DepInfoRecCType }{@code >}
     *     
     */
    public void setDepInfoRec(JAXBElement<DepInfoRecCType> value) {
        this.depInfoRec = value;
    }

    /**
     * Gets the value of the depAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DepAcctInfoCType }{@code >}
     *     
     */
    public JAXBElement<DepAcctInfoCType> getDepAcctInfo() {
        return depAcctInfo;
    }

    /**
     * Sets the value of the depAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DepAcctInfoCType }{@code >}
     *     
     */
    public void setDepAcctInfo(JAXBElement<DepAcctInfoCType> value) {
        this.depAcctInfo = value;
    }

    /**
     * Gets the value of the depBalDtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DepBalDtInfoCType }{@code >}
     *     
     */
    public JAXBElement<DepBalDtInfoCType> getDepBalDtInfo() {
        return depBalDtInfo;
    }

    /**
     * Sets the value of the depBalDtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DepBalDtInfoCType }{@code >}
     *     
     */
    public void setDepBalDtInfo(JAXBElement<DepBalDtInfoCType> value) {
        this.depBalDtInfo = value;
    }

    /**
     * Gets the value of the depNSFODInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DepNSFODInfoCType }{@code >}
     *     
     */
    public JAXBElement<DepNSFODInfoCType> getDepNSFODInfo() {
        return depNSFODInfo;
    }

    /**
     * Sets the value of the depNSFODInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DepNSFODInfoCType }{@code >}
     *     
     */
    public void setDepNSFODInfo(JAXBElement<DepNSFODInfoCType> value) {
        this.depNSFODInfo = value;
    }

    /**
     * Gets the value of the depRateIntInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DepRateIntInfoCType }{@code >}
     *     
     */
    public JAXBElement<DepRateIntInfoCType> getDepRateIntInfo() {
        return depRateIntInfo;
    }

    /**
     * Sets the value of the depRateIntInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DepRateIntInfoCType }{@code >}
     *     
     */
    public void setDepRateIntInfo(JAXBElement<DepRateIntInfoCType> value) {
        this.depRateIntInfo = value;
    }

    /**
     * Gets the value of the depRegRptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DepRegRptInfoCType }{@code >}
     *     
     */
    public JAXBElement<DepRegRptInfoCType> getDepRegRptInfo() {
        return depRegRptInfo;
    }

    /**
     * Sets the value of the depRegRptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DepRegRptInfoCType }{@code >}
     *     
     */
    public void setDepRegRptInfo(JAXBElement<DepRegRptInfoCType> value) {
        this.depRegRptInfo = value;
    }

    /**
     * Gets the value of the depStmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DepStmtInfoCType }{@code >}
     *     
     */
    public JAXBElement<DepStmtInfoCType> getDepStmtInfo() {
        return depStmtInfo;
    }

    /**
     * Sets the value of the depStmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DepStmtInfoCType }{@code >}
     *     
     */
    public void setDepStmtInfo(JAXBElement<DepStmtInfoCType> value) {
        this.depStmtInfo = value;
    }

    /**
     * Gets the value of the depTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DepTaxInfoCType }{@code >}
     *     
     */
    public JAXBElement<DepTaxInfoCType> getDepTaxInfo() {
        return depTaxInfo;
    }

    /**
     * Sets the value of the depTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DepTaxInfoCType }{@code >}
     *     
     */
    public void setDepTaxInfo(JAXBElement<DepTaxInfoCType> value) {
        this.depTaxInfo = value;
    }

    /**
     * Gets the value of the timeDepInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeDepInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<TimeDepInfoRecCType> getTimeDepInfoRec() {
        return timeDepInfoRec;
    }

    /**
     * Sets the value of the timeDepInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeDepInfoRecCType }{@code >}
     *     
     */
    public void setTimeDepInfoRec(JAXBElement<TimeDepInfoRecCType> value) {
        this.timeDepInfoRec = value;
    }

    /**
     * Gets the value of the timeDepAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeDepAcctInfoCType }{@code >}
     *     
     */
    public JAXBElement<TimeDepAcctInfoCType> getTimeDepAcctInfo() {
        return timeDepAcctInfo;
    }

    /**
     * Sets the value of the timeDepAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeDepAcctInfoCType }{@code >}
     *     
     */
    public void setTimeDepAcctInfo(JAXBElement<TimeDepAcctInfoCType> value) {
        this.timeDepAcctInfo = value;
    }

    /**
     * Gets the value of the timeDepBalDtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeDepBalDtInfoCType }{@code >}
     *     
     */
    public JAXBElement<TimeDepBalDtInfoCType> getTimeDepBalDtInfo() {
        return timeDepBalDtInfo;
    }

    /**
     * Sets the value of the timeDepBalDtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeDepBalDtInfoCType }{@code >}
     *     
     */
    public void setTimeDepBalDtInfo(JAXBElement<TimeDepBalDtInfoCType> value) {
        this.timeDepBalDtInfo = value;
    }

    /**
     * Gets the value of the timeDepRenInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeDepRenInfoCType }{@code >}
     *     
     */
    public JAXBElement<TimeDepRenInfoCType> getTimeDepRenInfo() {
        return timeDepRenInfo;
    }

    /**
     * Sets the value of the timeDepRenInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeDepRenInfoCType }{@code >}
     *     
     */
    public void setTimeDepRenInfo(JAXBElement<TimeDepRenInfoCType> value) {
        this.timeDepRenInfo = value;
    }

    /**
     * Gets the value of the timeDepRateIntInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeDepRateIntInfoCType }{@code >}
     *     
     */
    public JAXBElement<TimeDepRateIntInfoCType> getTimeDepRateIntInfo() {
        return timeDepRateIntInfo;
    }

    /**
     * Sets the value of the timeDepRateIntInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeDepRateIntInfoCType }{@code >}
     *     
     */
    public void setTimeDepRateIntInfo(JAXBElement<TimeDepRateIntInfoCType> value) {
        this.timeDepRateIntInfo = value;
    }

    /**
     * Gets the value of the timeDepRegRptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeDepRegRptInfoCType }{@code >}
     *     
     */
    public JAXBElement<TimeDepRegRptInfoCType> getTimeDepRegRptInfo() {
        return timeDepRegRptInfo;
    }

    /**
     * Sets the value of the timeDepRegRptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeDepRegRptInfoCType }{@code >}
     *     
     */
    public void setTimeDepRegRptInfo(JAXBElement<TimeDepRegRptInfoCType> value) {
        this.timeDepRegRptInfo = value;
    }

    /**
     * Gets the value of the timeDepStmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeDepStmtInfoCType }{@code >}
     *     
     */
    public JAXBElement<TimeDepStmtInfoCType> getTimeDepStmtInfo() {
        return timeDepStmtInfo;
    }

    /**
     * Sets the value of the timeDepStmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeDepStmtInfoCType }{@code >}
     *     
     */
    public void setTimeDepStmtInfo(JAXBElement<TimeDepStmtInfoCType> value) {
        this.timeDepStmtInfo = value;
    }

    /**
     * Gets the value of the timeDepTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeDepTaxInfoCType }{@code >}
     *     
     */
    public JAXBElement<TimeDepTaxInfoCType> getTimeDepTaxInfo() {
        return timeDepTaxInfo;
    }

    /**
     * Sets the value of the timeDepTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeDepTaxInfoCType }{@code >}
     *     
     */
    public void setTimeDepTaxInfo(JAXBElement<TimeDepTaxInfoCType> value) {
        this.timeDepTaxInfo = value;
    }

    /**
     * Gets the value of the achPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHPmtInfoCType }{@code >}
     *     
     */
    public JAXBElement<ACHPmtInfoCType> getACHPmtInfo() {
        return achPmtInfo;
    }

    /**
     * Sets the value of the achPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHPmtInfoCType }{@code >}
     *     
     */
    public void setACHPmtInfo(JAXBElement<ACHPmtInfoCType> value) {
        this.achPmtInfo = value;
    }

    /**
     * Gets the value of the trnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnInfoCType }{@code >}
     *     
     */
    public JAXBElement<TrnInfoCType> getTrnInfo() {
        return trnInfo;
    }

    /**
     * Sets the value of the trnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnInfoCType }{@code >}
     *     
     */
    public void setTrnInfo(JAXBElement<TrnInfoCType> value) {
        this.trnInfo = value;
    }

    /**
     * Gets the value of the stopChkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopChkInfoCType }{@code >}
     *     
     */
    public JAXBElement<StopChkInfoCType> getStopChkInfo() {
        return stopChkInfo;
    }

    /**
     * Sets the value of the stopChkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopChkInfoCType }{@code >}
     *     
     */
    public void setStopChkInfo(JAXBElement<StopChkInfoCType> value) {
        this.stopChkInfo = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
     * Gets the value of the collatItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatItemRecCType }{@code >}
     *     
     */
    public JAXBElement<CollatItemRecCType> getCollatItem() {
        return collatItem;
    }

    /**
     * Sets the value of the collatItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatItemRecCType }{@code >}
     *     
     */
    public void setCollatItem(JAXBElement<CollatItemRecCType> value) {
        this.collatItem = value;
    }

    /**
     * Gets the value of the collatDoc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocRecCType }{@code >}
     *     
     */
    public JAXBElement<CollatDocRecCType> getCollatDoc() {
        return collatDoc;
    }

    /**
     * Sets the value of the collatDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocRecCType }{@code >}
     *     
     */
    public void setCollatDoc(JAXBElement<CollatDocRecCType> value) {
        this.collatDoc = value;
    }

    /**
     * Gets the value of the realEstateProp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RealEstatePropRecCType }{@code >}
     *     
     */
    public JAXBElement<RealEstatePropRecCType> getRealEstateProp() {
        return realEstateProp;
    }

    /**
     * Sets the value of the realEstateProp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RealEstatePropRecCType }{@code >}
     *     
     */
    public void setRealEstateProp(JAXBElement<RealEstatePropRecCType> value) {
        this.realEstateProp = value;
    }

    /**
     * Gets the value of the loc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCRecCType }{@code >}
     *     
     */
    public JAXBElement<LOCRecCType> getLOC() {
        return loc;
    }

    /**
     * Sets the value of the loc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCRecCType }{@code >}
     *     
     */
    public void setLOC(JAXBElement<LOCRecCType> value) {
        this.loc = value;
    }

    /**
     * Gets the value of the escrwInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<EscrwInfoRecCType> getEscrwInfoRec() {
        return escrwInfoRec;
    }

    /**
     * Sets the value of the escrwInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwInfoRecCType }{@code >}
     *     
     */
    public void setEscrwInfoRec(JAXBElement<EscrwInfoRecCType> value) {
        this.escrwInfoRec = value;
    }

    /**
     * Gets the value of the fldInsurInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FldInsurInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<FldInsurInfoRecCType> getFldInsurInfoRec() {
        return fldInsurInfoRec;
    }

    /**
     * Sets the value of the fldInsurInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FldInsurInfoRecCType }{@code >}
     *     
     */
    public void setFldInsurInfoRec(JAXBElement<FldInsurInfoRecCType> value) {
        this.fldInsurInfoRec = value;
    }

    /**
     * Gets the value of the escrwPmtBalInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtBalInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<EscrwPmtBalInfoRecCType> getEscrwPmtBalInfoRec() {
        return escrwPmtBalInfoRec;
    }

    /**
     * Sets the value of the escrwPmtBalInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtBalInfoRecCType }{@code >}
     *     
     */
    public void setEscrwPmtBalInfoRec(JAXBElement<EscrwPmtBalInfoRecCType> value) {
        this.escrwPmtBalInfoRec = value;
    }

    /**
     * Gets the value of the escrwAnlysInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwAnlysInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<EscrwAnlysInfoRecCType> getEscrwAnlysInfoRec() {
        return escrwAnlysInfoRec;
    }

    /**
     * Sets the value of the escrwAnlysInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwAnlysInfoRecCType }{@code >}
     *     
     */
    public void setEscrwAnlysInfoRec(JAXBElement<EscrwAnlysInfoRecCType> value) {
        this.escrwAnlysInfoRec = value;
    }

    /**
     * Gets the value of the escrwFedWith property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FedWithCType }{@code >}
     *     
     */
    public JAXBElement<FedWithCType> getEscrwFedWith() {
        return escrwFedWith;
    }

    /**
     * Sets the value of the escrwFedWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FedWithCType }{@code >}
     *     
     */
    public void setEscrwFedWith(JAXBElement<FedWithCType> value) {
        this.escrwFedWith = value;
    }

    /**
     * Gets the value of the escrwStateWith property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithCType }{@code >}
     *     
     */
    public JAXBElement<StateWithCType> getEscrwStateWith() {
        return escrwStateWith;
    }

    /**
     * Sets the value of the escrwStateWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithCType }{@code >}
     *     
     */
    public void setEscrwStateWith(JAXBElement<StateWithCType> value) {
        this.escrwStateWith = value;
    }

    /**
     * Gets the value of the fasb9InfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91InfoRecCType }{@code >}
     *     
     */
    public JAXBElement<FASB91InfoRecCType> getFASB9InfoRec() {
        return fasb9InfoRec;
    }

    /**
     * Sets the value of the fasb9InfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91InfoRecCType }{@code >}
     *     
     */
    public void setFASB9InfoRec(JAXBElement<FASB91InfoRecCType> value) {
        this.fasb9InfoRec = value;
    }

    /**
     * Gets the value of the lnInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<LnInfoRecCType> getLnInfoRec() {
        return lnInfoRec;
    }

    /**
     * Sets the value of the lnInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnInfoRecCType }{@code >}
     *     
     */
    public void setLnInfoRec(JAXBElement<LnInfoRecCType> value) {
        this.lnInfoRec = value;
    }

    /**
     * Gets the value of the lnAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnAcctInfoCType }{@code >}
     *     
     */
    public JAXBElement<LnAcctInfoCType> getLnAcctInfo() {
        return lnAcctInfo;
    }

    /**
     * Sets the value of the lnAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnAcctInfoCType }{@code >}
     *     
     */
    public void setLnAcctInfo(JAXBElement<LnAcctInfoCType> value) {
        this.lnAcctInfo = value;
    }

    /**
     * Gets the value of the lnBalDtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnBalDtInfoCType }{@code >}
     *     
     */
    public JAXBElement<LnBalDtInfoCType> getLnBalDtInfo() {
        return lnBalDtInfo;
    }

    /**
     * Sets the value of the lnBalDtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnBalDtInfoCType }{@code >}
     *     
     */
    public void setLnBalDtInfo(JAXBElement<LnBalDtInfoCType> value) {
        this.lnBalDtInfo = value;
    }

    /**
     * Gets the value of the lnDlrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnDlrInfoCType }{@code >}
     *     
     */
    public JAXBElement<LnDlrInfoCType> getLnDlrInfo() {
        return lnDlrInfo;
    }

    /**
     * Sets the value of the lnDlrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnDlrInfoCType }{@code >}
     *     
     */
    public void setLnDlrInfo(JAXBElement<LnDlrInfoCType> value) {
        this.lnDlrInfo = value;
    }

    /**
     * Gets the value of the lnPastDueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnPastDueInfoCType }{@code >}
     *     
     */
    public JAXBElement<LnPastDueInfoCType> getLnPastDueInfo() {
        return lnPastDueInfo;
    }

    /**
     * Sets the value of the lnPastDueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnPastDueInfoCType }{@code >}
     *     
     */
    public void setLnPastDueInfo(JAXBElement<LnPastDueInfoCType> value) {
        this.lnPastDueInfo = value;
    }

    /**
     * Gets the value of the lnPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnPmtInfoCType }{@code >}
     *     
     */
    public JAXBElement<LnPmtInfoCType> getLnPmtInfo() {
        return lnPmtInfo;
    }

    /**
     * Sets the value of the lnPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnPmtInfoCType }{@code >}
     *     
     */
    public void setLnPmtInfo(JAXBElement<LnPmtInfoCType> value) {
        this.lnPmtInfo = value;
    }

    /**
     * Gets the value of the lnProtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnProtInfoCType }{@code >}
     *     
     */
    public JAXBElement<LnProtInfoCType> getLnProtInfo() {
        return lnProtInfo;
    }

    /**
     * Sets the value of the lnProtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnProtInfoCType }{@code >}
     *     
     */
    public void setLnProtInfo(JAXBElement<LnProtInfoCType> value) {
        this.lnProtInfo = value;
    }

    /**
     * Gets the value of the lnRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnRateInfoCType }{@code >}
     *     
     */
    public JAXBElement<LnRateInfoCType> getLnRateInfo() {
        return lnRateInfo;
    }

    /**
     * Sets the value of the lnRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnRateInfoCType }{@code >}
     *     
     */
    public void setLnRateInfo(JAXBElement<LnRateInfoCType> value) {
        this.lnRateInfo = value;
    }

    /**
     * Gets the value of the lnRealEstateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnRealEstateInfoCType }{@code >}
     *     
     */
    public JAXBElement<LnRealEstateInfoCType> getLnRealEstateInfo() {
        return lnRealEstateInfo;
    }

    /**
     * Sets the value of the lnRealEstateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnRealEstateInfoCType }{@code >}
     *     
     */
    public void setLnRealEstateInfo(JAXBElement<LnRealEstateInfoCType> value) {
        this.lnRealEstateInfo = value;
    }

    /**
     * Gets the value of the lnRenExtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnRenExtInfoCType }{@code >}
     *     
     */
    public JAXBElement<LnRenExtInfoCType> getLnRenExtInfo() {
        return lnRenExtInfo;
    }

    /**
     * Sets the value of the lnRenExtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnRenExtInfoCType }{@code >}
     *     
     */
    public void setLnRenExtInfo(JAXBElement<LnRenExtInfoCType> value) {
        this.lnRenExtInfo = value;
    }

    /**
     * Gets the value of the lnRegRptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnRegRptInfoCType }{@code >}
     *     
     */
    public JAXBElement<LnRegRptInfoCType> getLnRegRptInfo() {
        return lnRegRptInfo;
    }

    /**
     * Sets the value of the lnRegRptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnRegRptInfoCType }{@code >}
     *     
     */
    public void setLnRegRptInfo(JAXBElement<LnRegRptInfoCType> value) {
        this.lnRegRptInfo = value;
    }

    /**
     * Gets the value of the lnMtgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnMtgInfoCType }{@code >}
     *     
     */
    public JAXBElement<LnMtgInfoCType> getLnMtgInfo() {
        return lnMtgInfo;
    }

    /**
     * Sets the value of the lnMtgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnMtgInfoCType }{@code >}
     *     
     */
    public void setLnMtgInfo(JAXBElement<LnMtgInfoCType> value) {
        this.lnMtgInfo = value;
    }

    /**
     * Gets the value of the lnStopInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnStopInfoCType }{@code >}
     *     
     */
    public JAXBElement<LnStopInfoCType> getLnStopInfo() {
        return lnStopInfo;
    }

    /**
     * Sets the value of the lnStopInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnStopInfoCType }{@code >}
     *     
     */
    public void setLnStopInfo(JAXBElement<LnStopInfoCType> value) {
        this.lnStopInfo = value;
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
     * Gets the value of the achXferRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHXferRecCType }{@code >}
     *     
     */
    public JAXBElement<ACHXferRecCType> getACHXferRec() {
        return achXferRec;
    }

    /**
     * Sets the value of the achXferRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHXferRecCType }{@code >}
     *     
     */
    public void setACHXferRec(JAXBElement<ACHXferRecCType> value) {
        this.achXferRec = value;
    }

    /**
     * Gets the value of the futXferRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferRecCType }{@code >}
     *     
     */
    public JAXBElement<FutXferRecCType> getFutXferRec() {
        return futXferRec;
    }

    /**
     * Sets the value of the futXferRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferRecCType }{@code >}
     *     
     */
    public void setFutXferRec(JAXBElement<FutXferRecCType> value) {
        this.futXferRec = value;
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
     * Gets the value of the lnPmtSchedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnPmtSchedInfoCType }{@code >}
     *     
     */
    public JAXBElement<LnPmtSchedInfoCType> getLnPmtSchedInfo() {
        return lnPmtSchedInfo;
    }

    /**
     * Sets the value of the lnPmtSchedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnPmtSchedInfoCType }{@code >}
     *     
     */
    public void setLnPmtSchedInfo(JAXBElement<LnPmtSchedInfoCType> value) {
        this.lnPmtSchedInfo = value;
    }

    /**
     * Gets the value of the crBurInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrBurInfoCType }{@code >}
     *     
     */
    public JAXBElement<CrBurInfoCType> getCrBurInfo() {
        return crBurInfo;
    }

    /**
     * Sets the value of the crBurInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrBurInfoCType }{@code >}
     *     
     */
    public void setCrBurInfo(JAXBElement<CrBurInfoCType> value) {
        this.crBurInfo = value;
    }

    /**
     * Gets the value of the custMsgInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustMsgInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<CustMsgInfoRecCType> getCustMsgInfoRec() {
        return custMsgInfoRec;
    }

    /**
     * Sets the value of the custMsgInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustMsgInfoRecCType }{@code >}
     *     
     */
    public void setCustMsgInfoRec(JAXBElement<CustMsgInfoRecCType> value) {
        this.custMsgInfoRec = value;
    }

    /**
     * Gets the value of the resLnAppRgtrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResLnAppRgtrInfoCType }{@code >}
     *     
     */
    public JAXBElement<ResLnAppRgtrInfoCType> getResLnAppRgtrInfo() {
        return resLnAppRgtrInfo;
    }

    /**
     * Sets the value of the resLnAppRgtrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResLnAppRgtrInfoCType }{@code >}
     *     
     */
    public void setResLnAppRgtrInfo(JAXBElement<ResLnAppRgtrInfoCType> value) {
        this.resLnAppRgtrInfo = value;
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
     * Gets the value of the trckAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrckAcctInfoCType }{@code >}
     *     
     */
    public JAXBElement<TrckAcctInfoCType> getTrckAcctInfo() {
        return trckAcctInfo;
    }

    /**
     * Sets the value of the trckAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrckAcctInfoCType }{@code >}
     *     
     */
    public void setTrckAcctInfo(JAXBElement<TrckAcctInfoCType> value) {
        this.trckAcctInfo = value;
    }

    /**
     * Gets the value of the acctBenf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctBenfCType }{@code >}
     *     
     */
    public JAXBElement<AcctBenfCType> getAcctBenf() {
        return acctBenf;
    }

    /**
     * Sets the value of the acctBenf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctBenfCType }{@code >}
     *     
     */
    public void setAcctBenf(JAXBElement<AcctBenfCType> value) {
        this.acctBenf = value;
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
     * Gets the value of the sweepAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepAcctInfoCType }{@code >}
     *     
     */
    public JAXBElement<SweepAcctInfoCType> getSweepAcctInfo() {
        return sweepAcctInfo;
    }

    /**
     * Sets the value of the sweepAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepAcctInfoCType }{@code >}
     *     
     */
    public void setSweepAcctInfo(JAXBElement<SweepAcctInfoCType> value) {
        this.sweepAcctInfo = value;
    }

    /**
     * Gets the value of the acctCombStmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctCombStmtInfoCType }{@code >}
     *     
     */
    public JAXBElement<AcctCombStmtInfoCType> getAcctCombStmtInfo() {
        return acctCombStmtInfo;
    }

    /**
     * Sets the value of the acctCombStmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctCombStmtInfoCType }{@code >}
     *     
     */
    public void setAcctCombStmtInfo(JAXBElement<AcctCombStmtInfoCType> value) {
        this.acctCombStmtInfo = value;
    }

    /**
     * Gets the value of the acctProdOvrrdInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctProdOvrrdInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<AcctProdOvrrdInfoRecCType> getAcctProdOvrrdInfoRec() {
        return acctProdOvrrdInfoRec;
    }

    /**
     * Sets the value of the acctProdOvrrdInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctProdOvrrdInfoRecCType }{@code >}
     *     
     */
    public void setAcctProdOvrrdInfoRec(JAXBElement<AcctProdOvrrdInfoRecCType> value) {
        this.acctProdOvrrdInfoRec = value;
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
     * Gets the value of the emplAppInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmplAppInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<EmplAppInfoRecCType> getEmplAppInfoRec() {
        return emplAppInfoRec;
    }

    /**
     * Sets the value of the emplAppInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmplAppInfoRecCType }{@code >}
     *     
     */
    public void setEmplAppInfoRec(JAXBElement<EmplAppInfoRecCType> value) {
        this.emplAppInfoRec = value;
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
     * Gets the value of the safeDepInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SafeDepInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<SafeDepInfoRecCType> getSafeDepInfoRec() {
        return safeDepInfoRec;
    }

    /**
     * Sets the value of the safeDepInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SafeDepInfoRecCType }{@code >}
     *     
     */
    public void setSafeDepInfoRec(JAXBElement<SafeDepInfoRecCType> value) {
        this.safeDepInfoRec = value;
    }

    /**
     * Gets the value of the safeDepAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SafeDepAcctInfoCType }{@code >}
     *     
     */
    public JAXBElement<SafeDepAcctInfoCType> getSafeDepAcctInfo() {
        return safeDepAcctInfo;
    }

    /**
     * Sets the value of the safeDepAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SafeDepAcctInfoCType }{@code >}
     *     
     */
    public void setSafeDepAcctInfo(JAXBElement<SafeDepAcctInfoCType> value) {
        this.safeDepAcctInfo = value;
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
