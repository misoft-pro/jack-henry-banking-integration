
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EFTTrnISORec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTTrnISORec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardNum_Type"/&gt;
 *         &lt;element name="EFTTrnAffId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnAffId_Type"/&gt;
 *         &lt;element name="EFTTrnRqAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnRqAmt_Type"/&gt;
 *         &lt;element name="EFTSwchTrnDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTSwchTrnDt_Type"/&gt;
 *         &lt;element name="EFTSwchTrnTime" type="{http://jackhenry.com/jxchange/TPG/2008}EFTSwchTrnTime_Type"/&gt;
 *         &lt;element name="EFTSwchSeqId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTSwchSeqId_Type"/&gt;
 *         &lt;element name="EFTTrnTime" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnTime_Type"/&gt;
 *         &lt;element name="EFTTrnDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnDt_Type"/&gt;
 *         &lt;element name="EFTTrnId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnId_Type"/&gt;
 *         &lt;element name="EFTTrnStat" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnStat_Type"/&gt;
 *         &lt;element name="EFTTrmlId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrmlId_Type"/&gt;
 *         &lt;element name="FinInstAcqId" type="{http://jackhenry.com/jxchange/TPG/2008}FinInstAcqId_Type"/&gt;
 *         &lt;element name="EFTTrnAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StdIndustCode" type="{http://jackhenry.com/jxchange/TPG/2008}StdIndustCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcqFinInstCntry" type="{http://jackhenry.com/jxchange/TPG/2008}Cntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="POSEntryCode" type="{http://jackhenry.com/jxchange/TPG/2008}POSEntryCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="POSEntryDesc" type="{http://jackhenry.com/jxchange/TPG/2008}POSEntryDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SurChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SurChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrimAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardTrak2Val" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardTrak2Val_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnCorrelId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnCorrelId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnAcptId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnAcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrmlStreetAddr" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr1_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrmlCity" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrmlState" type="{http://jackhenry.com/jxchange/TPG/2008}State_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrmlCntry" type="{http://jackhenry.com/jxchange/TPG/2008}Cntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnRsRmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerName" type="{http://jackhenry.com/jxchange/TPG/2008}MerName_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCashTrnRqAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCashTrnRqAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnPreAuthExpTime" type="{http://jackhenry.com/jxchange/TPG/2008}TrnPreAuthExpTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnPreAuthExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnPreAuthExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NatPOSCondId" type="{http://jackhenry.com/jxchange/TPG/2008}NatPOSCondId_Type" minOccurs="0"/&gt;
 *         &lt;element name="NatPOSState" type="{http://jackhenry.com/jxchange/TPG/2008}State_Type" minOccurs="0"/&gt;
 *         &lt;element name="NatPOSCounty" type="{http://jackhenry.com/jxchange/TPG/2008}County_Type" minOccurs="0"/&gt;
 *         &lt;element name="NatPOSCntry" type="{http://jackhenry.com/jxchange/TPG/2008}Cntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="NatPOSPostalCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnRevCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnRevCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnRevDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnRevDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnRevAdvCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnRevAdvCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnRevAdvDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnRevAdvDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnRqRevAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnRqAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnRevAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SurChgRevAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SurChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgRevAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTXferToAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTXferToAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnBilId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnBilId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnNtwkRmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcqVerfId" type="{http://jackhenry.com/jxchange/TPG/2008}AcqVerfId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnSttlMonthYr" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnSttlMonthYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "EFTTrnISORec_CType", propOrder = {
    "eftCardNum",
    "eftTrnAffId",
    "eftTrnRqAmt",
    "eftSwchTrnDt",
    "eftSwchTrnTime",
    "eftSwchSeqId",
    "eftTrnTime",
    "eftTrnDt",
    "eftTrnId",
    "eftTrnStat",
    "eftTrmlId",
    "finInstAcqId",
    "eftTrnAmt",
    "eftCardExpDt",
    "stdIndustCode",
    "acqFinInstCntry",
    "posEntryCode",
    "posEntryDesc",
    "surChgAmt",
    "serChgAmt",
    "primAcctId",
    "eftCardTrak2Val",
    "eftTrnCorrelId",
    "eftTrnAcptId",
    "eftTrmlStreetAddr",
    "eftTrmlCity",
    "eftTrmlState",
    "eftTrmlCntry",
    "eftTrnRsRmk",
    "merName",
    "eftCashTrnRqAmt",
    "trnPreAuthExpTime",
    "trnPreAuthExpDt",
    "natPOSCondId",
    "natPOSState",
    "natPOSCounty",
    "natPOSCntry",
    "natPOSPostalCode",
    "eftTrnRevCode",
    "eftTrnRevDesc",
    "eftTrnRevAdvCode",
    "eftTrnRevAdvDesc",
    "eftTrnRqRevAmt",
    "eftTrnRevAmt",
    "surChgRevAmt",
    "serChgRevAmt",
    "acctId",
    "eftXferToAcctId",
    "eftXferToAcctType",
    "eftTrnBilId",
    "eftTrnNtwkRmk",
    "acqVerfId",
    "eftTrnSttlMonthYr",
    "custom",
    "ver1",
    "any"
})
public class EFTTrnISORecCType {

    @XmlElement(name = "EFTCardNum", required = true)
    protected EFTCardNumType eftCardNum;
    @XmlElement(name = "EFTTrnAffId", required = true)
    protected EFTTrnAffIdType eftTrnAffId;
    @XmlElement(name = "EFTTrnRqAmt", required = true)
    protected EFTTrnRqAmtType eftTrnRqAmt;
    @XmlElement(name = "EFTSwchTrnDt", required = true)
    protected EFTSwchTrnDtType eftSwchTrnDt;
    @XmlElement(name = "EFTSwchTrnTime", required = true)
    protected EFTSwchTrnTimeType eftSwchTrnTime;
    @XmlElement(name = "EFTSwchSeqId", required = true)
    protected EFTSwchSeqIdType eftSwchSeqId;
    @XmlElement(name = "EFTTrnTime", required = true)
    protected EFTTrnTimeType eftTrnTime;
    @XmlElement(name = "EFTTrnDt", required = true)
    protected EFTTrnDtType eftTrnDt;
    @XmlElement(name = "EFTTrnId", required = true)
    protected EFTTrnIdType eftTrnId;
    @XmlElement(name = "EFTTrnStat", required = true)
    protected EFTTrnStatType eftTrnStat;
    @XmlElement(name = "EFTTrmlId", required = true)
    protected EFTTrmlIdType eftTrmlId;
    @XmlElement(name = "FinInstAcqId", required = true)
    protected FinInstAcqIdType finInstAcqId;
    @XmlElement(name = "EFTTrnAmt")
    protected EFTTrnAmtType eftTrnAmt;
    @XmlElement(name = "EFTCardExpDt")
    protected EFTCardExpDtType eftCardExpDt;
    @XmlElement(name = "StdIndustCode")
    protected StdIndustCodeType stdIndustCode;
    @XmlElement(name = "AcqFinInstCntry")
    protected CntryType acqFinInstCntry;
    @XmlElement(name = "POSEntryCode")
    protected POSEntryCodeType posEntryCode;
    @XmlElement(name = "POSEntryDesc")
    protected POSEntryDescType posEntryDesc;
    @XmlElement(name = "SurChgAmt")
    protected SurChgAmtType surChgAmt;
    @XmlElement(name = "SerChgAmt")
    protected SerChgAmtType serChgAmt;
    @XmlElement(name = "PrimAcctId")
    protected AcctIdType primAcctId;
    @XmlElement(name = "EFTCardTrak2Val")
    protected EFTCardTrak2ValType eftCardTrak2Val;
    @XmlElement(name = "EFTTrnCorrelId")
    protected EFTTrnCorrelIdType eftTrnCorrelId;
    @XmlElement(name = "EFTTrnAcptId")
    protected EFTTrnAcptIdType eftTrnAcptId;
    @XmlElement(name = "EFTTrmlStreetAddr")
    protected StreetAddr1Type eftTrmlStreetAddr;
    @XmlElement(name = "EFTTrmlCity")
    protected CityType eftTrmlCity;
    @XmlElement(name = "EFTTrmlState")
    protected StateType eftTrmlState;
    @XmlElement(name = "EFTTrmlCntry")
    protected CntryType eftTrmlCntry;
    @XmlElement(name = "EFTTrnRsRmk")
    protected RmkType eftTrnRsRmk;
    @XmlElement(name = "MerName")
    protected MerNameType merName;
    @XmlElement(name = "EFTCashTrnRqAmt")
    protected EFTCashTrnRqAmtType eftCashTrnRqAmt;
    @XmlElement(name = "TrnPreAuthExpTime")
    protected TrnPreAuthExpTimeType trnPreAuthExpTime;
    @XmlElement(name = "TrnPreAuthExpDt")
    protected TrnPreAuthExpDtType trnPreAuthExpDt;
    @XmlElement(name = "NatPOSCondId")
    protected NatPOSCondIdType natPOSCondId;
    @XmlElement(name = "NatPOSState")
    protected StateType natPOSState;
    @XmlElement(name = "NatPOSCounty")
    protected CountyType natPOSCounty;
    @XmlElement(name = "NatPOSCntry")
    protected CntryType natPOSCntry;
    @XmlElement(name = "NatPOSPostalCode")
    protected PostalCodeType natPOSPostalCode;
    @XmlElement(name = "EFTTrnRevCode")
    protected EFTTrnRevCodeType eftTrnRevCode;
    @XmlElement(name = "EFTTrnRevDesc")
    protected EFTTrnRevDescType eftTrnRevDesc;
    @XmlElement(name = "EFTTrnRevAdvCode")
    protected EFTTrnRevAdvCodeType eftTrnRevAdvCode;
    @XmlElement(name = "EFTTrnRevAdvDesc")
    protected EFTTrnRevAdvDescType eftTrnRevAdvDesc;
    @XmlElement(name = "EFTTrnRqRevAmt")
    protected EFTTrnRqAmtType eftTrnRqRevAmt;
    @XmlElement(name = "EFTTrnRevAmt")
    protected EFTTrnAmtType eftTrnRevAmt;
    @XmlElement(name = "SurChgRevAmt")
    protected SurChgAmtType surChgRevAmt;
    @XmlElement(name = "SerChgRevAmt")
    protected SerChgAmtType serChgRevAmt;
    @XmlElement(name = "AcctId")
    protected AcctIdType acctId;
    @XmlElement(name = "EFTXferToAcctId")
    protected AcctIdType eftXferToAcctId;
    @XmlElement(name = "EFTXferToAcctType")
    protected AcctTypeType eftXferToAcctType;
    @XmlElement(name = "EFTTrnBilId")
    protected EFTTrnBilIdType eftTrnBilId;
    @XmlElement(name = "EFTTrnNtwkRmk")
    protected RmkType eftTrnNtwkRmk;
    @XmlElement(name = "AcqVerfId")
    protected AcqVerfIdType acqVerfId;
    @XmlElement(name = "EFTTrnSttlMonthYr")
    protected EFTTrnSttlMonthYrType eftTrnSttlMonthYr;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardNumType }
     *     
     */
    public EFTCardNumType getEFTCardNum() {
        return eftCardNum;
    }

    /**
     * Sets the value of the eftCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardNumType }
     *     
     */
    public void setEFTCardNum(EFTCardNumType value) {
        this.eftCardNum = value;
    }

    /**
     * Gets the value of the eftTrnAffId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnAffIdType }
     *     
     */
    public EFTTrnAffIdType getEFTTrnAffId() {
        return eftTrnAffId;
    }

    /**
     * Sets the value of the eftTrnAffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnAffIdType }
     *     
     */
    public void setEFTTrnAffId(EFTTrnAffIdType value) {
        this.eftTrnAffId = value;
    }

    /**
     * Gets the value of the eftTrnRqAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnRqAmtType }
     *     
     */
    public EFTTrnRqAmtType getEFTTrnRqAmt() {
        return eftTrnRqAmt;
    }

    /**
     * Sets the value of the eftTrnRqAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnRqAmtType }
     *     
     */
    public void setEFTTrnRqAmt(EFTTrnRqAmtType value) {
        this.eftTrnRqAmt = value;
    }

    /**
     * Gets the value of the eftSwchTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTSwchTrnDtType }
     *     
     */
    public EFTSwchTrnDtType getEFTSwchTrnDt() {
        return eftSwchTrnDt;
    }

    /**
     * Sets the value of the eftSwchTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTSwchTrnDtType }
     *     
     */
    public void setEFTSwchTrnDt(EFTSwchTrnDtType value) {
        this.eftSwchTrnDt = value;
    }

    /**
     * Gets the value of the eftSwchTrnTime property.
     * 
     * @return
     *     possible object is
     *     {@link EFTSwchTrnTimeType }
     *     
     */
    public EFTSwchTrnTimeType getEFTSwchTrnTime() {
        return eftSwchTrnTime;
    }

    /**
     * Sets the value of the eftSwchTrnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTSwchTrnTimeType }
     *     
     */
    public void setEFTSwchTrnTime(EFTSwchTrnTimeType value) {
        this.eftSwchTrnTime = value;
    }

    /**
     * Gets the value of the eftSwchSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTSwchSeqIdType }
     *     
     */
    public EFTSwchSeqIdType getEFTSwchSeqId() {
        return eftSwchSeqId;
    }

    /**
     * Sets the value of the eftSwchSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTSwchSeqIdType }
     *     
     */
    public void setEFTSwchSeqId(EFTSwchSeqIdType value) {
        this.eftSwchSeqId = value;
    }

    /**
     * Gets the value of the eftTrnTime property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnTimeType }
     *     
     */
    public EFTTrnTimeType getEFTTrnTime() {
        return eftTrnTime;
    }

    /**
     * Sets the value of the eftTrnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnTimeType }
     *     
     */
    public void setEFTTrnTime(EFTTrnTimeType value) {
        this.eftTrnTime = value;
    }

    /**
     * Gets the value of the eftTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnDtType }
     *     
     */
    public EFTTrnDtType getEFTTrnDt() {
        return eftTrnDt;
    }

    /**
     * Sets the value of the eftTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnDtType }
     *     
     */
    public void setEFTTrnDt(EFTTrnDtType value) {
        this.eftTrnDt = value;
    }

    /**
     * Gets the value of the eftTrnId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnIdType }
     *     
     */
    public EFTTrnIdType getEFTTrnId() {
        return eftTrnId;
    }

    /**
     * Sets the value of the eftTrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnIdType }
     *     
     */
    public void setEFTTrnId(EFTTrnIdType value) {
        this.eftTrnId = value;
    }

    /**
     * Gets the value of the eftTrnStat property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnStatType }
     *     
     */
    public EFTTrnStatType getEFTTrnStat() {
        return eftTrnStat;
    }

    /**
     * Sets the value of the eftTrnStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnStatType }
     *     
     */
    public void setEFTTrnStat(EFTTrnStatType value) {
        this.eftTrnStat = value;
    }

    /**
     * Gets the value of the eftTrmlId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrmlIdType }
     *     
     */
    public EFTTrmlIdType getEFTTrmlId() {
        return eftTrmlId;
    }

    /**
     * Sets the value of the eftTrmlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrmlIdType }
     *     
     */
    public void setEFTTrmlId(EFTTrmlIdType value) {
        this.eftTrmlId = value;
    }

    /**
     * Gets the value of the finInstAcqId property.
     * 
     * @return
     *     possible object is
     *     {@link FinInstAcqIdType }
     *     
     */
    public FinInstAcqIdType getFinInstAcqId() {
        return finInstAcqId;
    }

    /**
     * Sets the value of the finInstAcqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinInstAcqIdType }
     *     
     */
    public void setFinInstAcqId(FinInstAcqIdType value) {
        this.finInstAcqId = value;
    }

    /**
     * Gets the value of the eftTrnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnAmtType }
     *     
     */
    public EFTTrnAmtType getEFTTrnAmt() {
        return eftTrnAmt;
    }

    /**
     * Sets the value of the eftTrnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnAmtType }
     *     
     */
    public void setEFTTrnAmt(EFTTrnAmtType value) {
        this.eftTrnAmt = value;
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
     * Gets the value of the stdIndustCode property.
     * 
     * @return
     *     possible object is
     *     {@link StdIndustCodeType }
     *     
     */
    public StdIndustCodeType getStdIndustCode() {
        return stdIndustCode;
    }

    /**
     * Sets the value of the stdIndustCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdIndustCodeType }
     *     
     */
    public void setStdIndustCode(StdIndustCodeType value) {
        this.stdIndustCode = value;
    }

    /**
     * Gets the value of the acqFinInstCntry property.
     * 
     * @return
     *     possible object is
     *     {@link CntryType }
     *     
     */
    public CntryType getAcqFinInstCntry() {
        return acqFinInstCntry;
    }

    /**
     * Sets the value of the acqFinInstCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryType }
     *     
     */
    public void setAcqFinInstCntry(CntryType value) {
        this.acqFinInstCntry = value;
    }

    /**
     * Gets the value of the posEntryCode property.
     * 
     * @return
     *     possible object is
     *     {@link POSEntryCodeType }
     *     
     */
    public POSEntryCodeType getPOSEntryCode() {
        return posEntryCode;
    }

    /**
     * Sets the value of the posEntryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSEntryCodeType }
     *     
     */
    public void setPOSEntryCode(POSEntryCodeType value) {
        this.posEntryCode = value;
    }

    /**
     * Gets the value of the posEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link POSEntryDescType }
     *     
     */
    public POSEntryDescType getPOSEntryDesc() {
        return posEntryDesc;
    }

    /**
     * Sets the value of the posEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSEntryDescType }
     *     
     */
    public void setPOSEntryDesc(POSEntryDescType value) {
        this.posEntryDesc = value;
    }

    /**
     * Gets the value of the surChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SurChgAmtType }
     *     
     */
    public SurChgAmtType getSurChgAmt() {
        return surChgAmt;
    }

    /**
     * Sets the value of the surChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurChgAmtType }
     *     
     */
    public void setSurChgAmt(SurChgAmtType value) {
        this.surChgAmt = value;
    }

    /**
     * Gets the value of the serChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgAmtType }
     *     
     */
    public SerChgAmtType getSerChgAmt() {
        return serChgAmt;
    }

    /**
     * Sets the value of the serChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgAmtType }
     *     
     */
    public void setSerChgAmt(SerChgAmtType value) {
        this.serChgAmt = value;
    }

    /**
     * Gets the value of the primAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getPrimAcctId() {
        return primAcctId;
    }

    /**
     * Sets the value of the primAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setPrimAcctId(AcctIdType value) {
        this.primAcctId = value;
    }

    /**
     * Gets the value of the eftCardTrak2Val property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardTrak2ValType }
     *     
     */
    public EFTCardTrak2ValType getEFTCardTrak2Val() {
        return eftCardTrak2Val;
    }

    /**
     * Sets the value of the eftCardTrak2Val property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardTrak2ValType }
     *     
     */
    public void setEFTCardTrak2Val(EFTCardTrak2ValType value) {
        this.eftCardTrak2Val = value;
    }

    /**
     * Gets the value of the eftTrnCorrelId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnCorrelIdType }
     *     
     */
    public EFTTrnCorrelIdType getEFTTrnCorrelId() {
        return eftTrnCorrelId;
    }

    /**
     * Sets the value of the eftTrnCorrelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnCorrelIdType }
     *     
     */
    public void setEFTTrnCorrelId(EFTTrnCorrelIdType value) {
        this.eftTrnCorrelId = value;
    }

    /**
     * Gets the value of the eftTrnAcptId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnAcptIdType }
     *     
     */
    public EFTTrnAcptIdType getEFTTrnAcptId() {
        return eftTrnAcptId;
    }

    /**
     * Sets the value of the eftTrnAcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnAcptIdType }
     *     
     */
    public void setEFTTrnAcptId(EFTTrnAcptIdType value) {
        this.eftTrnAcptId = value;
    }

    /**
     * Gets the value of the eftTrmlStreetAddr property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddr1Type }
     *     
     */
    public StreetAddr1Type getEFTTrmlStreetAddr() {
        return eftTrmlStreetAddr;
    }

    /**
     * Sets the value of the eftTrmlStreetAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddr1Type }
     *     
     */
    public void setEFTTrmlStreetAddr(StreetAddr1Type value) {
        this.eftTrmlStreetAddr = value;
    }

    /**
     * Gets the value of the eftTrmlCity property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getEFTTrmlCity() {
        return eftTrmlCity;
    }

    /**
     * Sets the value of the eftTrmlCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setEFTTrmlCity(CityType value) {
        this.eftTrmlCity = value;
    }

    /**
     * Gets the value of the eftTrmlState property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getEFTTrmlState() {
        return eftTrmlState;
    }

    /**
     * Sets the value of the eftTrmlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setEFTTrmlState(StateType value) {
        this.eftTrmlState = value;
    }

    /**
     * Gets the value of the eftTrmlCntry property.
     * 
     * @return
     *     possible object is
     *     {@link CntryType }
     *     
     */
    public CntryType getEFTTrmlCntry() {
        return eftTrmlCntry;
    }

    /**
     * Sets the value of the eftTrmlCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryType }
     *     
     */
    public void setEFTTrmlCntry(CntryType value) {
        this.eftTrmlCntry = value;
    }

    /**
     * Gets the value of the eftTrnRsRmk property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getEFTTrnRsRmk() {
        return eftTrnRsRmk;
    }

    /**
     * Sets the value of the eftTrnRsRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setEFTTrnRsRmk(RmkType value) {
        this.eftTrnRsRmk = value;
    }

    /**
     * Gets the value of the merName property.
     * 
     * @return
     *     possible object is
     *     {@link MerNameType }
     *     
     */
    public MerNameType getMerName() {
        return merName;
    }

    /**
     * Sets the value of the merName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerNameType }
     *     
     */
    public void setMerName(MerNameType value) {
        this.merName = value;
    }

    /**
     * Gets the value of the eftCashTrnRqAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCashTrnRqAmtType }
     *     
     */
    public EFTCashTrnRqAmtType getEFTCashTrnRqAmt() {
        return eftCashTrnRqAmt;
    }

    /**
     * Sets the value of the eftCashTrnRqAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCashTrnRqAmtType }
     *     
     */
    public void setEFTCashTrnRqAmt(EFTCashTrnRqAmtType value) {
        this.eftCashTrnRqAmt = value;
    }

    /**
     * Gets the value of the trnPreAuthExpTime property.
     * 
     * @return
     *     possible object is
     *     {@link TrnPreAuthExpTimeType }
     *     
     */
    public TrnPreAuthExpTimeType getTrnPreAuthExpTime() {
        return trnPreAuthExpTime;
    }

    /**
     * Sets the value of the trnPreAuthExpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnPreAuthExpTimeType }
     *     
     */
    public void setTrnPreAuthExpTime(TrnPreAuthExpTimeType value) {
        this.trnPreAuthExpTime = value;
    }

    /**
     * Gets the value of the trnPreAuthExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnPreAuthExpDtType }
     *     
     */
    public TrnPreAuthExpDtType getTrnPreAuthExpDt() {
        return trnPreAuthExpDt;
    }

    /**
     * Sets the value of the trnPreAuthExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnPreAuthExpDtType }
     *     
     */
    public void setTrnPreAuthExpDt(TrnPreAuthExpDtType value) {
        this.trnPreAuthExpDt = value;
    }

    /**
     * Gets the value of the natPOSCondId property.
     * 
     * @return
     *     possible object is
     *     {@link NatPOSCondIdType }
     *     
     */
    public NatPOSCondIdType getNatPOSCondId() {
        return natPOSCondId;
    }

    /**
     * Sets the value of the natPOSCondId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatPOSCondIdType }
     *     
     */
    public void setNatPOSCondId(NatPOSCondIdType value) {
        this.natPOSCondId = value;
    }

    /**
     * Gets the value of the natPOSState property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getNatPOSState() {
        return natPOSState;
    }

    /**
     * Sets the value of the natPOSState property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setNatPOSState(StateType value) {
        this.natPOSState = value;
    }

    /**
     * Gets the value of the natPOSCounty property.
     * 
     * @return
     *     possible object is
     *     {@link CountyType }
     *     
     */
    public CountyType getNatPOSCounty() {
        return natPOSCounty;
    }

    /**
     * Sets the value of the natPOSCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountyType }
     *     
     */
    public void setNatPOSCounty(CountyType value) {
        this.natPOSCounty = value;
    }

    /**
     * Gets the value of the natPOSCntry property.
     * 
     * @return
     *     possible object is
     *     {@link CntryType }
     *     
     */
    public CntryType getNatPOSCntry() {
        return natPOSCntry;
    }

    /**
     * Sets the value of the natPOSCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryType }
     *     
     */
    public void setNatPOSCntry(CntryType value) {
        this.natPOSCntry = value;
    }

    /**
     * Gets the value of the natPOSPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link PostalCodeType }
     *     
     */
    public PostalCodeType getNatPOSPostalCode() {
        return natPOSPostalCode;
    }

    /**
     * Sets the value of the natPOSPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCodeType }
     *     
     */
    public void setNatPOSPostalCode(PostalCodeType value) {
        this.natPOSPostalCode = value;
    }

    /**
     * Gets the value of the eftTrnRevCode property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnRevCodeType }
     *     
     */
    public EFTTrnRevCodeType getEFTTrnRevCode() {
        return eftTrnRevCode;
    }

    /**
     * Sets the value of the eftTrnRevCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnRevCodeType }
     *     
     */
    public void setEFTTrnRevCode(EFTTrnRevCodeType value) {
        this.eftTrnRevCode = value;
    }

    /**
     * Gets the value of the eftTrnRevDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnRevDescType }
     *     
     */
    public EFTTrnRevDescType getEFTTrnRevDesc() {
        return eftTrnRevDesc;
    }

    /**
     * Sets the value of the eftTrnRevDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnRevDescType }
     *     
     */
    public void setEFTTrnRevDesc(EFTTrnRevDescType value) {
        this.eftTrnRevDesc = value;
    }

    /**
     * Gets the value of the eftTrnRevAdvCode property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnRevAdvCodeType }
     *     
     */
    public EFTTrnRevAdvCodeType getEFTTrnRevAdvCode() {
        return eftTrnRevAdvCode;
    }

    /**
     * Sets the value of the eftTrnRevAdvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnRevAdvCodeType }
     *     
     */
    public void setEFTTrnRevAdvCode(EFTTrnRevAdvCodeType value) {
        this.eftTrnRevAdvCode = value;
    }

    /**
     * Gets the value of the eftTrnRevAdvDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnRevAdvDescType }
     *     
     */
    public EFTTrnRevAdvDescType getEFTTrnRevAdvDesc() {
        return eftTrnRevAdvDesc;
    }

    /**
     * Sets the value of the eftTrnRevAdvDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnRevAdvDescType }
     *     
     */
    public void setEFTTrnRevAdvDesc(EFTTrnRevAdvDescType value) {
        this.eftTrnRevAdvDesc = value;
    }

    /**
     * Gets the value of the eftTrnRqRevAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnRqAmtType }
     *     
     */
    public EFTTrnRqAmtType getEFTTrnRqRevAmt() {
        return eftTrnRqRevAmt;
    }

    /**
     * Sets the value of the eftTrnRqRevAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnRqAmtType }
     *     
     */
    public void setEFTTrnRqRevAmt(EFTTrnRqAmtType value) {
        this.eftTrnRqRevAmt = value;
    }

    /**
     * Gets the value of the eftTrnRevAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnAmtType }
     *     
     */
    public EFTTrnAmtType getEFTTrnRevAmt() {
        return eftTrnRevAmt;
    }

    /**
     * Sets the value of the eftTrnRevAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnAmtType }
     *     
     */
    public void setEFTTrnRevAmt(EFTTrnAmtType value) {
        this.eftTrnRevAmt = value;
    }

    /**
     * Gets the value of the surChgRevAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SurChgAmtType }
     *     
     */
    public SurChgAmtType getSurChgRevAmt() {
        return surChgRevAmt;
    }

    /**
     * Sets the value of the surChgRevAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurChgAmtType }
     *     
     */
    public void setSurChgRevAmt(SurChgAmtType value) {
        this.surChgRevAmt = value;
    }

    /**
     * Gets the value of the serChgRevAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgAmtType }
     *     
     */
    public SerChgAmtType getSerChgRevAmt() {
        return serChgRevAmt;
    }

    /**
     * Sets the value of the serChgRevAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgAmtType }
     *     
     */
    public void setSerChgRevAmt(SerChgAmtType value) {
        this.serChgRevAmt = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAcctId(AcctIdType value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the eftXferToAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getEFTXferToAcctId() {
        return eftXferToAcctId;
    }

    /**
     * Sets the value of the eftXferToAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setEFTXferToAcctId(AcctIdType value) {
        this.eftXferToAcctId = value;
    }

    /**
     * Gets the value of the eftXferToAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getEFTXferToAcctType() {
        return eftXferToAcctType;
    }

    /**
     * Sets the value of the eftXferToAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setEFTXferToAcctType(AcctTypeType value) {
        this.eftXferToAcctType = value;
    }

    /**
     * Gets the value of the eftTrnBilId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnBilIdType }
     *     
     */
    public EFTTrnBilIdType getEFTTrnBilId() {
        return eftTrnBilId;
    }

    /**
     * Sets the value of the eftTrnBilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnBilIdType }
     *     
     */
    public void setEFTTrnBilId(EFTTrnBilIdType value) {
        this.eftTrnBilId = value;
    }

    /**
     * Gets the value of the eftTrnNtwkRmk property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getEFTTrnNtwkRmk() {
        return eftTrnNtwkRmk;
    }

    /**
     * Sets the value of the eftTrnNtwkRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setEFTTrnNtwkRmk(RmkType value) {
        this.eftTrnNtwkRmk = value;
    }

    /**
     * Gets the value of the acqVerfId property.
     * 
     * @return
     *     possible object is
     *     {@link AcqVerfIdType }
     *     
     */
    public AcqVerfIdType getAcqVerfId() {
        return acqVerfId;
    }

    /**
     * Sets the value of the acqVerfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcqVerfIdType }
     *     
     */
    public void setAcqVerfId(AcqVerfIdType value) {
        this.acqVerfId = value;
    }

    /**
     * Gets the value of the eftTrnSttlMonthYr property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnSttlMonthYrType }
     *     
     */
    public EFTTrnSttlMonthYrType getEFTTrnSttlMonthYr() {
        return eftTrnSttlMonthYr;
    }

    /**
     * Sets the value of the eftTrnSttlMonthYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnSttlMonthYrType }
     *     
     */
    public void setEFTTrnSttlMonthYr(EFTTrnSttlMonthYrType value) {
        this.eftTrnSttlMonthYr = value;
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
