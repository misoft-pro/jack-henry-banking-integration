
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
 * <p>Java class for ACHXferRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHXferRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHDrName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrRtNum" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrRtNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrBrCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrBrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrTrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrTrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrRtNum" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrRtNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrBrCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrBrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrTrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrTrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHXferAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHXferAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHXferAmtLTD" type="{http://jackhenry.com/jxchange/TPG/2008}ACHXferAmtLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeAmtLTD" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeAmtLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHSendPreNoteCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHSendPreNoteCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHOneTime" type="{http://jackhenry.com/jxchange/TPG/2008}ACHOneTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHUseLnDtCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHUseLnDtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHUseLnAmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHUseLnAmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHNSFCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHNSFCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTermCnt" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDayAdv" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDayAdv_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHSemiDay1" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay1_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHSemiDay2" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay2_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHOpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHLastXferDt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHLastXferDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHNextXferDay" type="{http://jackhenry.com/jxchange/TPG/2008}ACHNextXferDay_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHNextXferDt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHNextXferDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHXferExpireDt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHXferExpireDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompDiscrData" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompDiscrData_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompEntryDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompEntryDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHStdEntryClass" type="{http://jackhenry.com/jxchange/TPG/2008}ACHStdEntryClass_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeDrRtNum" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeDrRtNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeDrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeDrAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeDrAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeDrAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeDrBrCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeDrBrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeDrTrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeDrTrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeCrRtNum" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeCrRtNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeCrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeCrAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeCrAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeCrAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeCrBrCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeCrBrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeCrTrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeCrTrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHAcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHLastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ACHIndvId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHIndvId_Type" minOccurs="0"/&gt;
 *           &lt;element name="ACHAltCompName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHAltCompName_Type" minOccurs="0"/&gt;
 *           &lt;element name="ACHAddendaArray" type="{http://jackhenry.com/jxchange/TPG/2008}ACHAddendaArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ACHIntlInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ACHIntlInfoRec_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="XferBalType" type="{http://jackhenry.com/jxchange/TPG/2008}XferBalType_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="RedPrinc" type="{http://jackhenry.com/jxchange/TPG/2008}RedPrinc_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="ACHXferMatPmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHXferMatPmtCode_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="EftDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}EftDesc_AType" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="XferSrcType" type="{http://jackhenry.com/jxchange/TPG/2008}XferSrcType_Type" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;element name="LnUnitId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ACHXferRec_CType", propOrder = {
    "achDrName",
    "achDrRtNum",
    "achDrAcctId",
    "achDrAcctType",
    "achDrBrCode",
    "achDrTrnCodeCode",
    "achCrName",
    "achCrRtNum",
    "achCrAcctId",
    "achCrAcctType",
    "achCrBrCode",
    "achCrTrnCodeCode",
    "achXferAmt",
    "achXferAmtLTD",
    "achFeeAmt",
    "achFeeAmtLTD",
    "achSendPreNoteCode",
    "achOneTime",
    "achUseLnDtCode",
    "achUseLnAmtCode",
    "achnsfCode",
    "achTermCnt",
    "achTermUnits",
    "achDayAdv",
    "achSemiDay1",
    "achSemiDay2",
    "achOpenDt",
    "achLastXferDt",
    "achNextXferDay",
    "achNextXferDt",
    "achXferExpireDt",
    "achCompDiscrData",
    "achCompEntryDesc",
    "achCompId",
    "achCompName",
    "achStdEntryClass",
    "achFeeDrRtNum",
    "achFeeDrAcctId",
    "achFeeDrAcctType",
    "achFeeDrBrCode",
    "achFeeDrTrnCodeCode",
    "achFeeCrRtNum",
    "achFeeCrAcctId",
    "achFeeCrAcctType",
    "achFeeCrBrCode",
    "achFeeCrTrnCodeCode",
    "achAcctStat",
    "achLastMainDt",
    "ver1",
    "achIndvId",
    "achAltCompName",
    "achAddendaArray",
    "ver2",
    "achIntlInfoRec",
    "ver3",
    "xferBalType",
    "ver4",
    "redPrinc",
    "ver5",
    "achXferMatPmtCode",
    "ver6",
    "eftDescArray",
    "ver7",
    "xferSrcType",
    "ver8",
    "lnUnitId",
    "ver9",
    "any"
})
public class ACHXferRecCType {

    @XmlElementRef(name = "ACHDrName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHDrNameType> achDrName;
    @XmlElementRef(name = "ACHDrRtNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHDrRtNumType> achDrRtNum;
    @XmlElementRef(name = "ACHDrAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHDrAcctIdType> achDrAcctId;
    @XmlElementRef(name = "ACHDrAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHDrAcctTypeType> achDrAcctType;
    @XmlElementRef(name = "ACHDrBrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHDrBrCodeType> achDrBrCode;
    @XmlElementRef(name = "ACHDrTrnCodeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHDrTrnCodeCodeType> achDrTrnCodeCode;
    @XmlElementRef(name = "ACHCrName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCrNameType> achCrName;
    @XmlElementRef(name = "ACHCrRtNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCrRtNumType> achCrRtNum;
    @XmlElementRef(name = "ACHCrAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCrAcctIdType> achCrAcctId;
    @XmlElementRef(name = "ACHCrAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCrAcctTypeType> achCrAcctType;
    @XmlElementRef(name = "ACHCrBrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCrBrCodeType> achCrBrCode;
    @XmlElementRef(name = "ACHCrTrnCodeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCrTrnCodeCodeType> achCrTrnCodeCode;
    @XmlElementRef(name = "ACHXferAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHXferAmtType> achXferAmt;
    @XmlElementRef(name = "ACHXferAmtLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHXferAmtLTDType> achXferAmtLTD;
    @XmlElementRef(name = "ACHFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFeeAmtType> achFeeAmt;
    @XmlElementRef(name = "ACHFeeAmtLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFeeAmtLTDType> achFeeAmtLTD;
    @XmlElementRef(name = "ACHSendPreNoteCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHSendPreNoteCodeType> achSendPreNoteCode;
    @XmlElementRef(name = "ACHOneTime", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHOneTimeType> achOneTime;
    @XmlElementRef(name = "ACHUseLnDtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHUseLnDtCodeType> achUseLnDtCode;
    @XmlElementRef(name = "ACHUseLnAmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHUseLnAmtCodeType> achUseLnAmtCode;
    @XmlElementRef(name = "ACHNSFCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHNSFCodeType> achnsfCode;
    @XmlElementRef(name = "ACHTermCnt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermCntType> achTermCnt;
    @XmlElementRef(name = "ACHTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermUnitsType> achTermUnits;
    @XmlElementRef(name = "ACHDayAdv", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHDayAdvType> achDayAdv;
    @XmlElementRef(name = "ACHSemiDay1", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SemiDay1Type> achSemiDay1;
    @XmlElementRef(name = "ACHSemiDay2", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SemiDay2Type> achSemiDay2;
    @XmlElementRef(name = "ACHOpenDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenDtType> achOpenDt;
    @XmlElementRef(name = "ACHLastXferDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHLastXferDtType> achLastXferDt;
    @XmlElementRef(name = "ACHNextXferDay", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHNextXferDayType> achNextXferDay;
    @XmlElementRef(name = "ACHNextXferDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHNextXferDtType> achNextXferDt;
    @XmlElementRef(name = "ACHXferExpireDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHXferExpireDtType> achXferExpireDt;
    @XmlElementRef(name = "ACHCompDiscrData", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCompDiscrDataType> achCompDiscrData;
    @XmlElementRef(name = "ACHCompEntryDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCompEntryDescType> achCompEntryDesc;
    @XmlElementRef(name = "ACHCompId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCompIdType> achCompId;
    @XmlElementRef(name = "ACHCompName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCompNameType> achCompName;
    @XmlElementRef(name = "ACHStdEntryClass", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHStdEntryClassType> achStdEntryClass;
    @XmlElementRef(name = "ACHFeeDrRtNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFeeDrRtNumType> achFeeDrRtNum;
    @XmlElementRef(name = "ACHFeeDrAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFeeDrAcctIdType> achFeeDrAcctId;
    @XmlElementRef(name = "ACHFeeDrAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFeeDrAcctTypeType> achFeeDrAcctType;
    @XmlElementRef(name = "ACHFeeDrBrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFeeDrBrCodeType> achFeeDrBrCode;
    @XmlElementRef(name = "ACHFeeDrTrnCodeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFeeDrTrnCodeCodeType> achFeeDrTrnCodeCode;
    @XmlElementRef(name = "ACHFeeCrRtNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFeeCrRtNumType> achFeeCrRtNum;
    @XmlElementRef(name = "ACHFeeCrAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFeeCrAcctIdType> achFeeCrAcctId;
    @XmlElementRef(name = "ACHFeeCrAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFeeCrAcctTypeType> achFeeCrAcctType;
    @XmlElementRef(name = "ACHFeeCrBrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFeeCrBrCodeType> achFeeCrBrCode;
    @XmlElementRef(name = "ACHFeeCrTrnCodeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFeeCrTrnCodeCodeType> achFeeCrTrnCodeCode;
    @XmlElementRef(name = "ACHAcctStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctStatType> achAcctStat;
    @XmlElementRef(name = "ACHLastMainDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastMainDtType> achLastMainDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "ACHIndvId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHIndvIdType> achIndvId;
    @XmlElementRef(name = "ACHAltCompName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHAltCompNameType> achAltCompName;
    @XmlElement(name = "ACHAddendaArray")
    protected ACHAddendaArrayAType achAddendaArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ACHIntlInfoRec")
    protected ACHIntlInfoRecCType achIntlInfoRec;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "XferBalType")
    protected XferBalTypeType xferBalType;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "RedPrinc")
    protected RedPrincType redPrinc;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "ACHXferMatPmtCode")
    protected ACHXferMatPmtCodeType achXferMatPmtCode;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "EftDescArray")
    protected EftDescAType eftDescArray;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "XferSrcType")
    protected XferSrcTypeType xferSrcType;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlElement(name = "LnUnitId")
    protected LnUnitIdType lnUnitId;
    @XmlElement(name = "Ver_9")
    protected Ver9CType ver9;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achDrName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHDrNameType }{@code >}
     *     
     */
    public JAXBElement<ACHDrNameType> getACHDrName() {
        return achDrName;
    }

    /**
     * Sets the value of the achDrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHDrNameType }{@code >}
     *     
     */
    public void setACHDrName(JAXBElement<ACHDrNameType> value) {
        this.achDrName = value;
    }

    /**
     * Gets the value of the achDrRtNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHDrRtNumType }{@code >}
     *     
     */
    public JAXBElement<ACHDrRtNumType> getACHDrRtNum() {
        return achDrRtNum;
    }

    /**
     * Sets the value of the achDrRtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHDrRtNumType }{@code >}
     *     
     */
    public void setACHDrRtNum(JAXBElement<ACHDrRtNumType> value) {
        this.achDrRtNum = value;
    }

    /**
     * Gets the value of the achDrAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHDrAcctIdType }{@code >}
     *     
     */
    public JAXBElement<ACHDrAcctIdType> getACHDrAcctId() {
        return achDrAcctId;
    }

    /**
     * Sets the value of the achDrAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHDrAcctIdType }{@code >}
     *     
     */
    public void setACHDrAcctId(JAXBElement<ACHDrAcctIdType> value) {
        this.achDrAcctId = value;
    }

    /**
     * Gets the value of the achDrAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHDrAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<ACHDrAcctTypeType> getACHDrAcctType() {
        return achDrAcctType;
    }

    /**
     * Sets the value of the achDrAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHDrAcctTypeType }{@code >}
     *     
     */
    public void setACHDrAcctType(JAXBElement<ACHDrAcctTypeType> value) {
        this.achDrAcctType = value;
    }

    /**
     * Gets the value of the achDrBrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHDrBrCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHDrBrCodeType> getACHDrBrCode() {
        return achDrBrCode;
    }

    /**
     * Sets the value of the achDrBrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHDrBrCodeType }{@code >}
     *     
     */
    public void setACHDrBrCode(JAXBElement<ACHDrBrCodeType> value) {
        this.achDrBrCode = value;
    }

    /**
     * Gets the value of the achDrTrnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHDrTrnCodeCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHDrTrnCodeCodeType> getACHDrTrnCodeCode() {
        return achDrTrnCodeCode;
    }

    /**
     * Sets the value of the achDrTrnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHDrTrnCodeCodeType }{@code >}
     *     
     */
    public void setACHDrTrnCodeCode(JAXBElement<ACHDrTrnCodeCodeType> value) {
        this.achDrTrnCodeCode = value;
    }

    /**
     * Gets the value of the achCrName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCrNameType }{@code >}
     *     
     */
    public JAXBElement<ACHCrNameType> getACHCrName() {
        return achCrName;
    }

    /**
     * Sets the value of the achCrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCrNameType }{@code >}
     *     
     */
    public void setACHCrName(JAXBElement<ACHCrNameType> value) {
        this.achCrName = value;
    }

    /**
     * Gets the value of the achCrRtNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCrRtNumType }{@code >}
     *     
     */
    public JAXBElement<ACHCrRtNumType> getACHCrRtNum() {
        return achCrRtNum;
    }

    /**
     * Sets the value of the achCrRtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCrRtNumType }{@code >}
     *     
     */
    public void setACHCrRtNum(JAXBElement<ACHCrRtNumType> value) {
        this.achCrRtNum = value;
    }

    /**
     * Gets the value of the achCrAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCrAcctIdType }{@code >}
     *     
     */
    public JAXBElement<ACHCrAcctIdType> getACHCrAcctId() {
        return achCrAcctId;
    }

    /**
     * Sets the value of the achCrAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCrAcctIdType }{@code >}
     *     
     */
    public void setACHCrAcctId(JAXBElement<ACHCrAcctIdType> value) {
        this.achCrAcctId = value;
    }

    /**
     * Gets the value of the achCrAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCrAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<ACHCrAcctTypeType> getACHCrAcctType() {
        return achCrAcctType;
    }

    /**
     * Sets the value of the achCrAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCrAcctTypeType }{@code >}
     *     
     */
    public void setACHCrAcctType(JAXBElement<ACHCrAcctTypeType> value) {
        this.achCrAcctType = value;
    }

    /**
     * Gets the value of the achCrBrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCrBrCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHCrBrCodeType> getACHCrBrCode() {
        return achCrBrCode;
    }

    /**
     * Sets the value of the achCrBrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCrBrCodeType }{@code >}
     *     
     */
    public void setACHCrBrCode(JAXBElement<ACHCrBrCodeType> value) {
        this.achCrBrCode = value;
    }

    /**
     * Gets the value of the achCrTrnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCrTrnCodeCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHCrTrnCodeCodeType> getACHCrTrnCodeCode() {
        return achCrTrnCodeCode;
    }

    /**
     * Sets the value of the achCrTrnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCrTrnCodeCodeType }{@code >}
     *     
     */
    public void setACHCrTrnCodeCode(JAXBElement<ACHCrTrnCodeCodeType> value) {
        this.achCrTrnCodeCode = value;
    }

    /**
     * Gets the value of the achXferAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHXferAmtType }{@code >}
     *     
     */
    public JAXBElement<ACHXferAmtType> getACHXferAmt() {
        return achXferAmt;
    }

    /**
     * Sets the value of the achXferAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHXferAmtType }{@code >}
     *     
     */
    public void setACHXferAmt(JAXBElement<ACHXferAmtType> value) {
        this.achXferAmt = value;
    }

    /**
     * Gets the value of the achXferAmtLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHXferAmtLTDType }{@code >}
     *     
     */
    public JAXBElement<ACHXferAmtLTDType> getACHXferAmtLTD() {
        return achXferAmtLTD;
    }

    /**
     * Sets the value of the achXferAmtLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHXferAmtLTDType }{@code >}
     *     
     */
    public void setACHXferAmtLTD(JAXBElement<ACHXferAmtLTDType> value) {
        this.achXferAmtLTD = value;
    }

    /**
     * Gets the value of the achFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<ACHFeeAmtType> getACHFeeAmt() {
        return achFeeAmt;
    }

    /**
     * Sets the value of the achFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeAmtType }{@code >}
     *     
     */
    public void setACHFeeAmt(JAXBElement<ACHFeeAmtType> value) {
        this.achFeeAmt = value;
    }

    /**
     * Gets the value of the achFeeAmtLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeAmtLTDType }{@code >}
     *     
     */
    public JAXBElement<ACHFeeAmtLTDType> getACHFeeAmtLTD() {
        return achFeeAmtLTD;
    }

    /**
     * Sets the value of the achFeeAmtLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeAmtLTDType }{@code >}
     *     
     */
    public void setACHFeeAmtLTD(JAXBElement<ACHFeeAmtLTDType> value) {
        this.achFeeAmtLTD = value;
    }

    /**
     * Gets the value of the achSendPreNoteCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHSendPreNoteCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHSendPreNoteCodeType> getACHSendPreNoteCode() {
        return achSendPreNoteCode;
    }

    /**
     * Sets the value of the achSendPreNoteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHSendPreNoteCodeType }{@code >}
     *     
     */
    public void setACHSendPreNoteCode(JAXBElement<ACHSendPreNoteCodeType> value) {
        this.achSendPreNoteCode = value;
    }

    /**
     * Gets the value of the achOneTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHOneTimeType }{@code >}
     *     
     */
    public JAXBElement<ACHOneTimeType> getACHOneTime() {
        return achOneTime;
    }

    /**
     * Sets the value of the achOneTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHOneTimeType }{@code >}
     *     
     */
    public void setACHOneTime(JAXBElement<ACHOneTimeType> value) {
        this.achOneTime = value;
    }

    /**
     * Gets the value of the achUseLnDtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHUseLnDtCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHUseLnDtCodeType> getACHUseLnDtCode() {
        return achUseLnDtCode;
    }

    /**
     * Sets the value of the achUseLnDtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHUseLnDtCodeType }{@code >}
     *     
     */
    public void setACHUseLnDtCode(JAXBElement<ACHUseLnDtCodeType> value) {
        this.achUseLnDtCode = value;
    }

    /**
     * Gets the value of the achUseLnAmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHUseLnAmtCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHUseLnAmtCodeType> getACHUseLnAmtCode() {
        return achUseLnAmtCode;
    }

    /**
     * Sets the value of the achUseLnAmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHUseLnAmtCodeType }{@code >}
     *     
     */
    public void setACHUseLnAmtCode(JAXBElement<ACHUseLnAmtCodeType> value) {
        this.achUseLnAmtCode = value;
    }

    /**
     * Gets the value of the achnsfCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHNSFCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHNSFCodeType> getACHNSFCode() {
        return achnsfCode;
    }

    /**
     * Sets the value of the achnsfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHNSFCodeType }{@code >}
     *     
     */
    public void setACHNSFCode(JAXBElement<ACHNSFCodeType> value) {
        this.achnsfCode = value;
    }

    /**
     * Gets the value of the achTermCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public JAXBElement<TermCntType> getACHTermCnt() {
        return achTermCnt;
    }

    /**
     * Sets the value of the achTermCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public void setACHTermCnt(JAXBElement<TermCntType> value) {
        this.achTermCnt = value;
    }

    /**
     * Gets the value of the achTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public JAXBElement<TermUnitsType> getACHTermUnits() {
        return achTermUnits;
    }

    /**
     * Sets the value of the achTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public void setACHTermUnits(JAXBElement<TermUnitsType> value) {
        this.achTermUnits = value;
    }

    /**
     * Gets the value of the achDayAdv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHDayAdvType }{@code >}
     *     
     */
    public JAXBElement<ACHDayAdvType> getACHDayAdv() {
        return achDayAdv;
    }

    /**
     * Sets the value of the achDayAdv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHDayAdvType }{@code >}
     *     
     */
    public void setACHDayAdv(JAXBElement<ACHDayAdvType> value) {
        this.achDayAdv = value;
    }

    /**
     * Gets the value of the achSemiDay1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}
     *     
     */
    public JAXBElement<SemiDay1Type> getACHSemiDay1() {
        return achSemiDay1;
    }

    /**
     * Sets the value of the achSemiDay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}
     *     
     */
    public void setACHSemiDay1(JAXBElement<SemiDay1Type> value) {
        this.achSemiDay1 = value;
    }

    /**
     * Gets the value of the achSemiDay2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}
     *     
     */
    public JAXBElement<SemiDay2Type> getACHSemiDay2() {
        return achSemiDay2;
    }

    /**
     * Sets the value of the achSemiDay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}
     *     
     */
    public void setACHSemiDay2(JAXBElement<SemiDay2Type> value) {
        this.achSemiDay2 = value;
    }

    /**
     * Gets the value of the achOpenDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenDtType }{@code >}
     *     
     */
    public JAXBElement<OpenDtType> getACHOpenDt() {
        return achOpenDt;
    }

    /**
     * Sets the value of the achOpenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenDtType }{@code >}
     *     
     */
    public void setACHOpenDt(JAXBElement<OpenDtType> value) {
        this.achOpenDt = value;
    }

    /**
     * Gets the value of the achLastXferDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHLastXferDtType }{@code >}
     *     
     */
    public JAXBElement<ACHLastXferDtType> getACHLastXferDt() {
        return achLastXferDt;
    }

    /**
     * Sets the value of the achLastXferDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHLastXferDtType }{@code >}
     *     
     */
    public void setACHLastXferDt(JAXBElement<ACHLastXferDtType> value) {
        this.achLastXferDt = value;
    }

    /**
     * Gets the value of the achNextXferDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHNextXferDayType }{@code >}
     *     
     */
    public JAXBElement<ACHNextXferDayType> getACHNextXferDay() {
        return achNextXferDay;
    }

    /**
     * Sets the value of the achNextXferDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHNextXferDayType }{@code >}
     *     
     */
    public void setACHNextXferDay(JAXBElement<ACHNextXferDayType> value) {
        this.achNextXferDay = value;
    }

    /**
     * Gets the value of the achNextXferDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHNextXferDtType }{@code >}
     *     
     */
    public JAXBElement<ACHNextXferDtType> getACHNextXferDt() {
        return achNextXferDt;
    }

    /**
     * Sets the value of the achNextXferDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHNextXferDtType }{@code >}
     *     
     */
    public void setACHNextXferDt(JAXBElement<ACHNextXferDtType> value) {
        this.achNextXferDt = value;
    }

    /**
     * Gets the value of the achXferExpireDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHXferExpireDtType }{@code >}
     *     
     */
    public JAXBElement<ACHXferExpireDtType> getACHXferExpireDt() {
        return achXferExpireDt;
    }

    /**
     * Sets the value of the achXferExpireDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHXferExpireDtType }{@code >}
     *     
     */
    public void setACHXferExpireDt(JAXBElement<ACHXferExpireDtType> value) {
        this.achXferExpireDt = value;
    }

    /**
     * Gets the value of the achCompDiscrData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCompDiscrDataType }{@code >}
     *     
     */
    public JAXBElement<ACHCompDiscrDataType> getACHCompDiscrData() {
        return achCompDiscrData;
    }

    /**
     * Sets the value of the achCompDiscrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCompDiscrDataType }{@code >}
     *     
     */
    public void setACHCompDiscrData(JAXBElement<ACHCompDiscrDataType> value) {
        this.achCompDiscrData = value;
    }

    /**
     * Gets the value of the achCompEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCompEntryDescType }{@code >}
     *     
     */
    public JAXBElement<ACHCompEntryDescType> getACHCompEntryDesc() {
        return achCompEntryDesc;
    }

    /**
     * Sets the value of the achCompEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCompEntryDescType }{@code >}
     *     
     */
    public void setACHCompEntryDesc(JAXBElement<ACHCompEntryDescType> value) {
        this.achCompEntryDesc = value;
    }

    /**
     * Gets the value of the achCompId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCompIdType }{@code >}
     *     
     */
    public JAXBElement<ACHCompIdType> getACHCompId() {
        return achCompId;
    }

    /**
     * Sets the value of the achCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCompIdType }{@code >}
     *     
     */
    public void setACHCompId(JAXBElement<ACHCompIdType> value) {
        this.achCompId = value;
    }

    /**
     * Gets the value of the achCompName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCompNameType }{@code >}
     *     
     */
    public JAXBElement<ACHCompNameType> getACHCompName() {
        return achCompName;
    }

    /**
     * Sets the value of the achCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCompNameType }{@code >}
     *     
     */
    public void setACHCompName(JAXBElement<ACHCompNameType> value) {
        this.achCompName = value;
    }

    /**
     * Gets the value of the achStdEntryClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHStdEntryClassType }{@code >}
     *     
     */
    public JAXBElement<ACHStdEntryClassType> getACHStdEntryClass() {
        return achStdEntryClass;
    }

    /**
     * Sets the value of the achStdEntryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHStdEntryClassType }{@code >}
     *     
     */
    public void setACHStdEntryClass(JAXBElement<ACHStdEntryClassType> value) {
        this.achStdEntryClass = value;
    }

    /**
     * Gets the value of the achFeeDrRtNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeDrRtNumType }{@code >}
     *     
     */
    public JAXBElement<ACHFeeDrRtNumType> getACHFeeDrRtNum() {
        return achFeeDrRtNum;
    }

    /**
     * Sets the value of the achFeeDrRtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeDrRtNumType }{@code >}
     *     
     */
    public void setACHFeeDrRtNum(JAXBElement<ACHFeeDrRtNumType> value) {
        this.achFeeDrRtNum = value;
    }

    /**
     * Gets the value of the achFeeDrAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeDrAcctIdType }{@code >}
     *     
     */
    public JAXBElement<ACHFeeDrAcctIdType> getACHFeeDrAcctId() {
        return achFeeDrAcctId;
    }

    /**
     * Sets the value of the achFeeDrAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeDrAcctIdType }{@code >}
     *     
     */
    public void setACHFeeDrAcctId(JAXBElement<ACHFeeDrAcctIdType> value) {
        this.achFeeDrAcctId = value;
    }

    /**
     * Gets the value of the achFeeDrAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeDrAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<ACHFeeDrAcctTypeType> getACHFeeDrAcctType() {
        return achFeeDrAcctType;
    }

    /**
     * Sets the value of the achFeeDrAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeDrAcctTypeType }{@code >}
     *     
     */
    public void setACHFeeDrAcctType(JAXBElement<ACHFeeDrAcctTypeType> value) {
        this.achFeeDrAcctType = value;
    }

    /**
     * Gets the value of the achFeeDrBrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeDrBrCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHFeeDrBrCodeType> getACHFeeDrBrCode() {
        return achFeeDrBrCode;
    }

    /**
     * Sets the value of the achFeeDrBrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeDrBrCodeType }{@code >}
     *     
     */
    public void setACHFeeDrBrCode(JAXBElement<ACHFeeDrBrCodeType> value) {
        this.achFeeDrBrCode = value;
    }

    /**
     * Gets the value of the achFeeDrTrnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeDrTrnCodeCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHFeeDrTrnCodeCodeType> getACHFeeDrTrnCodeCode() {
        return achFeeDrTrnCodeCode;
    }

    /**
     * Sets the value of the achFeeDrTrnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeDrTrnCodeCodeType }{@code >}
     *     
     */
    public void setACHFeeDrTrnCodeCode(JAXBElement<ACHFeeDrTrnCodeCodeType> value) {
        this.achFeeDrTrnCodeCode = value;
    }

    /**
     * Gets the value of the achFeeCrRtNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeCrRtNumType }{@code >}
     *     
     */
    public JAXBElement<ACHFeeCrRtNumType> getACHFeeCrRtNum() {
        return achFeeCrRtNum;
    }

    /**
     * Sets the value of the achFeeCrRtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeCrRtNumType }{@code >}
     *     
     */
    public void setACHFeeCrRtNum(JAXBElement<ACHFeeCrRtNumType> value) {
        this.achFeeCrRtNum = value;
    }

    /**
     * Gets the value of the achFeeCrAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeCrAcctIdType }{@code >}
     *     
     */
    public JAXBElement<ACHFeeCrAcctIdType> getACHFeeCrAcctId() {
        return achFeeCrAcctId;
    }

    /**
     * Sets the value of the achFeeCrAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeCrAcctIdType }{@code >}
     *     
     */
    public void setACHFeeCrAcctId(JAXBElement<ACHFeeCrAcctIdType> value) {
        this.achFeeCrAcctId = value;
    }

    /**
     * Gets the value of the achFeeCrAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeCrAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<ACHFeeCrAcctTypeType> getACHFeeCrAcctType() {
        return achFeeCrAcctType;
    }

    /**
     * Sets the value of the achFeeCrAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeCrAcctTypeType }{@code >}
     *     
     */
    public void setACHFeeCrAcctType(JAXBElement<ACHFeeCrAcctTypeType> value) {
        this.achFeeCrAcctType = value;
    }

    /**
     * Gets the value of the achFeeCrBrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeCrBrCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHFeeCrBrCodeType> getACHFeeCrBrCode() {
        return achFeeCrBrCode;
    }

    /**
     * Sets the value of the achFeeCrBrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeCrBrCodeType }{@code >}
     *     
     */
    public void setACHFeeCrBrCode(JAXBElement<ACHFeeCrBrCodeType> value) {
        this.achFeeCrBrCode = value;
    }

    /**
     * Gets the value of the achFeeCrTrnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeCrTrnCodeCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHFeeCrTrnCodeCodeType> getACHFeeCrTrnCodeCode() {
        return achFeeCrTrnCodeCode;
    }

    /**
     * Sets the value of the achFeeCrTrnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFeeCrTrnCodeCodeType }{@code >}
     *     
     */
    public void setACHFeeCrTrnCodeCode(JAXBElement<ACHFeeCrTrnCodeCodeType> value) {
        this.achFeeCrTrnCodeCode = value;
    }

    /**
     * Gets the value of the achAcctStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctStatType }{@code >}
     *     
     */
    public JAXBElement<AcctStatType> getACHAcctStat() {
        return achAcctStat;
    }

    /**
     * Sets the value of the achAcctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctStatType }{@code >}
     *     
     */
    public void setACHAcctStat(JAXBElement<AcctStatType> value) {
        this.achAcctStat = value;
    }

    /**
     * Gets the value of the achLastMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastMainDtType }{@code >}
     *     
     */
    public JAXBElement<LastMainDtType> getACHLastMainDt() {
        return achLastMainDt;
    }

    /**
     * Sets the value of the achLastMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastMainDtType }{@code >}
     *     
     */
    public void setACHLastMainDt(JAXBElement<LastMainDtType> value) {
        this.achLastMainDt = value;
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
     * Gets the value of the achIndvId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHIndvIdType }{@code >}
     *     
     */
    public JAXBElement<ACHIndvIdType> getACHIndvId() {
        return achIndvId;
    }

    /**
     * Sets the value of the achIndvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHIndvIdType }{@code >}
     *     
     */
    public void setACHIndvId(JAXBElement<ACHIndvIdType> value) {
        this.achIndvId = value;
    }

    /**
     * Gets the value of the achAltCompName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHAltCompNameType }{@code >}
     *     
     */
    public JAXBElement<ACHAltCompNameType> getACHAltCompName() {
        return achAltCompName;
    }

    /**
     * Sets the value of the achAltCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHAltCompNameType }{@code >}
     *     
     */
    public void setACHAltCompName(JAXBElement<ACHAltCompNameType> value) {
        this.achAltCompName = value;
    }

    /**
     * Gets the value of the achAddendaArray property.
     * 
     * @return
     *     possible object is
     *     {@link ACHAddendaArrayAType }
     *     
     */
    public ACHAddendaArrayAType getACHAddendaArray() {
        return achAddendaArray;
    }

    /**
     * Sets the value of the achAddendaArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHAddendaArrayAType }
     *     
     */
    public void setACHAddendaArray(ACHAddendaArrayAType value) {
        this.achAddendaArray = value;
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
     * Gets the value of the achIntlInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link ACHIntlInfoRecCType }
     *     
     */
    public ACHIntlInfoRecCType getACHIntlInfoRec() {
        return achIntlInfoRec;
    }

    /**
     * Sets the value of the achIntlInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHIntlInfoRecCType }
     *     
     */
    public void setACHIntlInfoRec(ACHIntlInfoRecCType value) {
        this.achIntlInfoRec = value;
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
     * Gets the value of the xferBalType property.
     * 
     * @return
     *     possible object is
     *     {@link XferBalTypeType }
     *     
     */
    public XferBalTypeType getXferBalType() {
        return xferBalType;
    }

    /**
     * Sets the value of the xferBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferBalTypeType }
     *     
     */
    public void setXferBalType(XferBalTypeType value) {
        this.xferBalType = value;
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
     * Gets the value of the redPrinc property.
     * 
     * @return
     *     possible object is
     *     {@link RedPrincType }
     *     
     */
    public RedPrincType getRedPrinc() {
        return redPrinc;
    }

    /**
     * Sets the value of the redPrinc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedPrincType }
     *     
     */
    public void setRedPrinc(RedPrincType value) {
        this.redPrinc = value;
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
     * Gets the value of the achXferMatPmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link ACHXferMatPmtCodeType }
     *     
     */
    public ACHXferMatPmtCodeType getACHXferMatPmtCode() {
        return achXferMatPmtCode;
    }

    /**
     * Sets the value of the achXferMatPmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHXferMatPmtCodeType }
     *     
     */
    public void setACHXferMatPmtCode(ACHXferMatPmtCodeType value) {
        this.achXferMatPmtCode = value;
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
     * Gets the value of the eftDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link EftDescAType }
     *     
     */
    public EftDescAType getEftDescArray() {
        return eftDescArray;
    }

    /**
     * Sets the value of the eftDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EftDescAType }
     *     
     */
    public void setEftDescArray(EftDescAType value) {
        this.eftDescArray = value;
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
     * Gets the value of the xferSrcType property.
     * 
     * @return
     *     possible object is
     *     {@link XferSrcTypeType }
     *     
     */
    public XferSrcTypeType getXferSrcType() {
        return xferSrcType;
    }

    /**
     * Sets the value of the xferSrcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferSrcTypeType }
     *     
     */
    public void setXferSrcType(XferSrcTypeType value) {
        this.xferSrcType = value;
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
     * Gets the value of the lnUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitIdType }
     *     
     */
    public LnUnitIdType getLnUnitId() {
        return lnUnitId;
    }

    /**
     * Sets the value of the lnUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitIdType }
     *     
     */
    public void setLnUnitId(LnUnitIdType value) {
        this.lnUnitId = value;
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
