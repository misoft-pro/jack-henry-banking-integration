
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
 * <p>Java class for EFTCardHistSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardHistSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardNum_Type"/&gt;
 *         &lt;element name="EFTTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnRqAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnRqAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCashTrnAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCashTrnAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCashTrnRqAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCashTrnRqAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SurChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SurChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerPartAuth" type="{http://jackhenry.com/jxchange/TPG/2008}MerPartAuth_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTExcAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTExcAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnStat" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnStatRmk" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnStatRmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRsnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRsnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnSeqId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnSeqId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnTime" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTSwchSeqId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTSwchSeqId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTSwchTrnDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTSwchTrnDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTSwchTrnTime" type="{http://jackhenry.com/jxchange/TPG/2008}EFTSwchTrnTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTXferToAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTXferToAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTXferToAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTXferToAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnActIdType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnActIdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SwchTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}SwchTrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CashDistrType" type="{http://jackhenry.com/jxchange/TPG/2008}CashDistrType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ATMTrnSttlType" type="{http://jackhenry.com/jxchange/TPG/2008}ATMTrnSttlType_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnSttlDt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnSttlDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnSttlTime" type="{http://jackhenry.com/jxchange/TPG/2008}TrnSttlTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnProcDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnProcDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppTrnGenr" type="{http://jackhenry.com/jxchange/TPG/2008}AppTrnGenr_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTOnUsTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTOnUsTrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTAtUsATMType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTAtUsATMType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnAuthBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnAuthBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnRcptBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnRcptBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PreAuthRemDays" type="{http://jackhenry.com/jxchange/TPG/2008}PreAuthRemDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTNtwkId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTNtwkId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PreAuthExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}PreAuthExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerName" type="{http://jackhenry.com/jxchange/TPG/2008}MerName_Type" minOccurs="0"/&gt;
 *         &lt;element name="StdIndustCode" type="{http://jackhenry.com/jxchange/TPG/2008}StdIndustCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StdIndustDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StdIndustDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardCapType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardCapType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AddrVerifText" type="{http://jackhenry.com/jxchange/TPG/2008}AddrVerifText_Type" minOccurs="0"/&gt;
 *         &lt;element name="AddrVerifCode" type="{http://jackhenry.com/jxchange/TPG/2008}AddrVerifCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AddrVerifDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AddrVerifDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTPrvdApprvTrn" type="{http://jackhenry.com/jxchange/TPG/2008}EFTPrvdApprvTrn_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTPrvdApprvBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTPrvdApprvBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnCorrelId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnCorrelId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EftDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}EftDesc_AType" minOccurs="0"/&gt;
 *         &lt;element name="RmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EFTCardSufxNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardSufxNum_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="RecurTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}RecurTrnType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardHistSrchRec_CType", propOrder = {
    "eftCardNum",
    "eftTrnCode",
    "eftTrnDesc",
    "eftTrnAmt",
    "eftTrnRqAmt",
    "eftCashTrnAmt",
    "eftCashTrnRqAmt",
    "serChgAmt",
    "surChgAmt",
    "merPartAuth",
    "eftExcAmt",
    "eftTrnStat",
    "eftTrnStatDesc",
    "eftTrnStatRmk",
    "excRsnCode",
    "excRsnDesc",
    "eftTrnSeqId",
    "eftTrnDt",
    "eftTrnTime",
    "eftSwchSeqId",
    "eftSwchTrnDt",
    "eftSwchTrnTime",
    "eftXferToAcctId",
    "eftXferToAcctType",
    "eftTrnActIdType",
    "swchTrnType",
    "cashDistrType",
    "atmTrnSttlType",
    "trnSttlDt",
    "trnSttlTime",
    "eftTrnProcDt",
    "appTrnGenr",
    "eftOnUsTrnType",
    "eftAtUsATMType",
    "eftTrnAuthBalAmt",
    "eftTrnRcptBalAmt",
    "preAuthRemDays",
    "eftNtwkId",
    "preAuthExpDt",
    "merName",
    "stdIndustCode",
    "stdIndustDesc",
    "eftCardCapType",
    "eftCardExpDt",
    "addrVerifText",
    "addrVerifCode",
    "addrVerifDesc",
    "eftPrvdApprvTrn",
    "eftPrvdApprvBalAmt",
    "eftTrnCorrelId",
    "eftDescArray",
    "rmkArray",
    "ver1",
    "eftCardSufxNum",
    "ver2",
    "recurTrnType",
    "ver3",
    "any"
})
public class EFTCardHistSrchRecCType {

    @XmlElement(name = "EFTCardNum", required = true)
    protected EFTCardNumType eftCardNum;
    @XmlElement(name = "EFTTrnCode")
    protected EFTTrnCodeType eftTrnCode;
    @XmlElement(name = "EFTTrnDesc")
    protected EFTTrnDescType eftTrnDesc;
    @XmlElement(name = "EFTTrnAmt")
    protected EFTTrnAmtType eftTrnAmt;
    @XmlElement(name = "EFTTrnRqAmt")
    protected EFTTrnRqAmtType eftTrnRqAmt;
    @XmlElement(name = "EFTCashTrnAmt")
    protected EFTCashTrnAmtType eftCashTrnAmt;
    @XmlElement(name = "EFTCashTrnRqAmt")
    protected EFTCashTrnRqAmtType eftCashTrnRqAmt;
    @XmlElement(name = "SerChgAmt")
    protected SerChgAmtType serChgAmt;
    @XmlElement(name = "SurChgAmt")
    protected SurChgAmtType surChgAmt;
    @XmlElement(name = "MerPartAuth")
    protected MerPartAuthType merPartAuth;
    @XmlElement(name = "EFTExcAmt")
    protected EFTExcAmtType eftExcAmt;
    @XmlElement(name = "EFTTrnStat")
    protected EFTTrnStatType eftTrnStat;
    @XmlElement(name = "EFTTrnStatDesc")
    protected EFTTrnStatDescType eftTrnStatDesc;
    @XmlElement(name = "EFTTrnStatRmk")
    protected EFTTrnStatRmkType eftTrnStatRmk;
    @XmlElement(name = "ExcRsnCode")
    protected ExcRsnCodeType excRsnCode;
    @XmlElement(name = "ExcRsnDesc")
    protected ExcRsnDescType excRsnDesc;
    @XmlElement(name = "EFTTrnSeqId")
    protected EFTTrnSeqIdType eftTrnSeqId;
    @XmlElement(name = "EFTTrnDt")
    protected EFTTrnDtType eftTrnDt;
    @XmlElement(name = "EFTTrnTime")
    protected EFTTrnTimeType eftTrnTime;
    @XmlElement(name = "EFTSwchSeqId")
    protected EFTSwchSeqIdType eftSwchSeqId;
    @XmlElement(name = "EFTSwchTrnDt")
    protected EFTSwchTrnDtType eftSwchTrnDt;
    @XmlElement(name = "EFTSwchTrnTime")
    protected EFTSwchTrnTimeType eftSwchTrnTime;
    @XmlElement(name = "EFTXferToAcctId")
    protected EFTXferToAcctIdType eftXferToAcctId;
    @XmlElement(name = "EFTXferToAcctType")
    protected EFTXferToAcctTypeType eftXferToAcctType;
    @XmlElement(name = "EFTTrnActIdType")
    protected EFTTrnActIdTypeType eftTrnActIdType;
    @XmlElement(name = "SwchTrnType")
    protected SwchTrnTypeType swchTrnType;
    @XmlElement(name = "CashDistrType")
    protected CashDistrTypeType cashDistrType;
    @XmlElement(name = "ATMTrnSttlType")
    protected ATMTrnSttlTypeType atmTrnSttlType;
    @XmlElement(name = "TrnSttlDt")
    protected TrnSttlDtType trnSttlDt;
    @XmlElement(name = "TrnSttlTime")
    protected TrnSttlTimeType trnSttlTime;
    @XmlElement(name = "EFTTrnProcDt")
    protected EFTTrnProcDtType eftTrnProcDt;
    @XmlElement(name = "AppTrnGenr")
    protected AppTrnGenrType appTrnGenr;
    @XmlElement(name = "EFTOnUsTrnType")
    protected EFTOnUsTrnTypeType eftOnUsTrnType;
    @XmlElement(name = "EFTAtUsATMType")
    protected EFTAtUsATMTypeType eftAtUsATMType;
    @XmlElement(name = "EFTTrnAuthBalAmt")
    protected EFTTrnAuthBalAmtType eftTrnAuthBalAmt;
    @XmlElement(name = "EFTTrnRcptBalAmt")
    protected EFTTrnRcptBalAmtType eftTrnRcptBalAmt;
    @XmlElement(name = "PreAuthRemDays")
    protected PreAuthRemDaysType preAuthRemDays;
    @XmlElement(name = "EFTNtwkId")
    protected EFTNtwkIdType eftNtwkId;
    @XmlElement(name = "PreAuthExpDt")
    protected PreAuthExpDtType preAuthExpDt;
    @XmlElement(name = "MerName")
    protected MerNameType merName;
    @XmlElement(name = "StdIndustCode")
    protected StdIndustCodeType stdIndustCode;
    @XmlElement(name = "StdIndustDesc")
    protected StdIndustDescType stdIndustDesc;
    @XmlElement(name = "EFTCardCapType")
    protected EFTCardCapTypeType eftCardCapType;
    @XmlElement(name = "EFTCardExpDt")
    protected EFTCardExpDtType eftCardExpDt;
    @XmlElement(name = "AddrVerifText")
    protected AddrVerifTextType addrVerifText;
    @XmlElement(name = "AddrVerifCode")
    protected AddrVerifCodeType addrVerifCode;
    @XmlElement(name = "AddrVerifDesc")
    protected AddrVerifDescType addrVerifDesc;
    @XmlElement(name = "EFTPrvdApprvTrn")
    protected EFTPrvdApprvTrnType eftPrvdApprvTrn;
    @XmlElement(name = "EFTPrvdApprvBalAmt")
    protected EFTPrvdApprvBalAmtType eftPrvdApprvBalAmt;
    @XmlElement(name = "EFTTrnCorrelId")
    protected EFTTrnCorrelIdType eftTrnCorrelId;
    @XmlElement(name = "EftDescArray")
    protected EftDescAType eftDescArray;
    @XmlElement(name = "RmkArray")
    protected RmkAType rmkArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EFTCardSufxNum")
    protected EFTCardSufxNumType eftCardSufxNum;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "RecurTrnType")
    protected RecurTrnTypeType recurTrnType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
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
     * Gets the value of the eftTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnCodeType }
     *     
     */
    public EFTTrnCodeType getEFTTrnCode() {
        return eftTrnCode;
    }

    /**
     * Sets the value of the eftTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnCodeType }
     *     
     */
    public void setEFTTrnCode(EFTTrnCodeType value) {
        this.eftTrnCode = value;
    }

    /**
     * Gets the value of the eftTrnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnDescType }
     *     
     */
    public EFTTrnDescType getEFTTrnDesc() {
        return eftTrnDesc;
    }

    /**
     * Sets the value of the eftTrnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnDescType }
     *     
     */
    public void setEFTTrnDesc(EFTTrnDescType value) {
        this.eftTrnDesc = value;
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
     * Gets the value of the eftCashTrnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCashTrnAmtType }
     *     
     */
    public EFTCashTrnAmtType getEFTCashTrnAmt() {
        return eftCashTrnAmt;
    }

    /**
     * Sets the value of the eftCashTrnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCashTrnAmtType }
     *     
     */
    public void setEFTCashTrnAmt(EFTCashTrnAmtType value) {
        this.eftCashTrnAmt = value;
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
     * Gets the value of the merPartAuth property.
     * 
     * @return
     *     possible object is
     *     {@link MerPartAuthType }
     *     
     */
    public MerPartAuthType getMerPartAuth() {
        return merPartAuth;
    }

    /**
     * Sets the value of the merPartAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerPartAuthType }
     *     
     */
    public void setMerPartAuth(MerPartAuthType value) {
        this.merPartAuth = value;
    }

    /**
     * Gets the value of the eftExcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTExcAmtType }
     *     
     */
    public EFTExcAmtType getEFTExcAmt() {
        return eftExcAmt;
    }

    /**
     * Sets the value of the eftExcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTExcAmtType }
     *     
     */
    public void setEFTExcAmt(EFTExcAmtType value) {
        this.eftExcAmt = value;
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
     * Gets the value of the eftTrnStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnStatDescType }
     *     
     */
    public EFTTrnStatDescType getEFTTrnStatDesc() {
        return eftTrnStatDesc;
    }

    /**
     * Sets the value of the eftTrnStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnStatDescType }
     *     
     */
    public void setEFTTrnStatDesc(EFTTrnStatDescType value) {
        this.eftTrnStatDesc = value;
    }

    /**
     * Gets the value of the eftTrnStatRmk property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnStatRmkType }
     *     
     */
    public EFTTrnStatRmkType getEFTTrnStatRmk() {
        return eftTrnStatRmk;
    }

    /**
     * Sets the value of the eftTrnStatRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnStatRmkType }
     *     
     */
    public void setEFTTrnStatRmk(EFTTrnStatRmkType value) {
        this.eftTrnStatRmk = value;
    }

    /**
     * Gets the value of the excRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExcRsnCodeType }
     *     
     */
    public ExcRsnCodeType getExcRsnCode() {
        return excRsnCode;
    }

    /**
     * Sets the value of the excRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcRsnCodeType }
     *     
     */
    public void setExcRsnCode(ExcRsnCodeType value) {
        this.excRsnCode = value;
    }

    /**
     * Gets the value of the excRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ExcRsnDescType }
     *     
     */
    public ExcRsnDescType getExcRsnDesc() {
        return excRsnDesc;
    }

    /**
     * Sets the value of the excRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcRsnDescType }
     *     
     */
    public void setExcRsnDesc(ExcRsnDescType value) {
        this.excRsnDesc = value;
    }

    /**
     * Gets the value of the eftTrnSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnSeqIdType }
     *     
     */
    public EFTTrnSeqIdType getEFTTrnSeqId() {
        return eftTrnSeqId;
    }

    /**
     * Sets the value of the eftTrnSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnSeqIdType }
     *     
     */
    public void setEFTTrnSeqId(EFTTrnSeqIdType value) {
        this.eftTrnSeqId = value;
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
     * Gets the value of the eftXferToAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTXferToAcctIdType }
     *     
     */
    public EFTXferToAcctIdType getEFTXferToAcctId() {
        return eftXferToAcctId;
    }

    /**
     * Sets the value of the eftXferToAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTXferToAcctIdType }
     *     
     */
    public void setEFTXferToAcctId(EFTXferToAcctIdType value) {
        this.eftXferToAcctId = value;
    }

    /**
     * Gets the value of the eftXferToAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTXferToAcctTypeType }
     *     
     */
    public EFTXferToAcctTypeType getEFTXferToAcctType() {
        return eftXferToAcctType;
    }

    /**
     * Sets the value of the eftXferToAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTXferToAcctTypeType }
     *     
     */
    public void setEFTXferToAcctType(EFTXferToAcctTypeType value) {
        this.eftXferToAcctType = value;
    }

    /**
     * Gets the value of the eftTrnActIdType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnActIdTypeType }
     *     
     */
    public EFTTrnActIdTypeType getEFTTrnActIdType() {
        return eftTrnActIdType;
    }

    /**
     * Sets the value of the eftTrnActIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnActIdTypeType }
     *     
     */
    public void setEFTTrnActIdType(EFTTrnActIdTypeType value) {
        this.eftTrnActIdType = value;
    }

    /**
     * Gets the value of the swchTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link SwchTrnTypeType }
     *     
     */
    public SwchTrnTypeType getSwchTrnType() {
        return swchTrnType;
    }

    /**
     * Sets the value of the swchTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwchTrnTypeType }
     *     
     */
    public void setSwchTrnType(SwchTrnTypeType value) {
        this.swchTrnType = value;
    }

    /**
     * Gets the value of the cashDistrType property.
     * 
     * @return
     *     possible object is
     *     {@link CashDistrTypeType }
     *     
     */
    public CashDistrTypeType getCashDistrType() {
        return cashDistrType;
    }

    /**
     * Sets the value of the cashDistrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashDistrTypeType }
     *     
     */
    public void setCashDistrType(CashDistrTypeType value) {
        this.cashDistrType = value;
    }

    /**
     * Gets the value of the atmTrnSttlType property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTrnSttlTypeType }
     *     
     */
    public ATMTrnSttlTypeType getATMTrnSttlType() {
        return atmTrnSttlType;
    }

    /**
     * Sets the value of the atmTrnSttlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTrnSttlTypeType }
     *     
     */
    public void setATMTrnSttlType(ATMTrnSttlTypeType value) {
        this.atmTrnSttlType = value;
    }

    /**
     * Gets the value of the trnSttlDt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnSttlDtType }
     *     
     */
    public TrnSttlDtType getTrnSttlDt() {
        return trnSttlDt;
    }

    /**
     * Sets the value of the trnSttlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnSttlDtType }
     *     
     */
    public void setTrnSttlDt(TrnSttlDtType value) {
        this.trnSttlDt = value;
    }

    /**
     * Gets the value of the trnSttlTime property.
     * 
     * @return
     *     possible object is
     *     {@link TrnSttlTimeType }
     *     
     */
    public TrnSttlTimeType getTrnSttlTime() {
        return trnSttlTime;
    }

    /**
     * Sets the value of the trnSttlTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnSttlTimeType }
     *     
     */
    public void setTrnSttlTime(TrnSttlTimeType value) {
        this.trnSttlTime = value;
    }

    /**
     * Gets the value of the eftTrnProcDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnProcDtType }
     *     
     */
    public EFTTrnProcDtType getEFTTrnProcDt() {
        return eftTrnProcDt;
    }

    /**
     * Sets the value of the eftTrnProcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnProcDtType }
     *     
     */
    public void setEFTTrnProcDt(EFTTrnProcDtType value) {
        this.eftTrnProcDt = value;
    }

    /**
     * Gets the value of the appTrnGenr property.
     * 
     * @return
     *     possible object is
     *     {@link AppTrnGenrType }
     *     
     */
    public AppTrnGenrType getAppTrnGenr() {
        return appTrnGenr;
    }

    /**
     * Sets the value of the appTrnGenr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppTrnGenrType }
     *     
     */
    public void setAppTrnGenr(AppTrnGenrType value) {
        this.appTrnGenr = value;
    }

    /**
     * Gets the value of the eftOnUsTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTOnUsTrnTypeType }
     *     
     */
    public EFTOnUsTrnTypeType getEFTOnUsTrnType() {
        return eftOnUsTrnType;
    }

    /**
     * Sets the value of the eftOnUsTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTOnUsTrnTypeType }
     *     
     */
    public void setEFTOnUsTrnType(EFTOnUsTrnTypeType value) {
        this.eftOnUsTrnType = value;
    }

    /**
     * Gets the value of the eftAtUsATMType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTAtUsATMTypeType }
     *     
     */
    public EFTAtUsATMTypeType getEFTAtUsATMType() {
        return eftAtUsATMType;
    }

    /**
     * Sets the value of the eftAtUsATMType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTAtUsATMTypeType }
     *     
     */
    public void setEFTAtUsATMType(EFTAtUsATMTypeType value) {
        this.eftAtUsATMType = value;
    }

    /**
     * Gets the value of the eftTrnAuthBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnAuthBalAmtType }
     *     
     */
    public EFTTrnAuthBalAmtType getEFTTrnAuthBalAmt() {
        return eftTrnAuthBalAmt;
    }

    /**
     * Sets the value of the eftTrnAuthBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnAuthBalAmtType }
     *     
     */
    public void setEFTTrnAuthBalAmt(EFTTrnAuthBalAmtType value) {
        this.eftTrnAuthBalAmt = value;
    }

    /**
     * Gets the value of the eftTrnRcptBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnRcptBalAmtType }
     *     
     */
    public EFTTrnRcptBalAmtType getEFTTrnRcptBalAmt() {
        return eftTrnRcptBalAmt;
    }

    /**
     * Sets the value of the eftTrnRcptBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnRcptBalAmtType }
     *     
     */
    public void setEFTTrnRcptBalAmt(EFTTrnRcptBalAmtType value) {
        this.eftTrnRcptBalAmt = value;
    }

    /**
     * Gets the value of the preAuthRemDays property.
     * 
     * @return
     *     possible object is
     *     {@link PreAuthRemDaysType }
     *     
     */
    public PreAuthRemDaysType getPreAuthRemDays() {
        return preAuthRemDays;
    }

    /**
     * Sets the value of the preAuthRemDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreAuthRemDaysType }
     *     
     */
    public void setPreAuthRemDays(PreAuthRemDaysType value) {
        this.preAuthRemDays = value;
    }

    /**
     * Gets the value of the eftNtwkId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTNtwkIdType }
     *     
     */
    public EFTNtwkIdType getEFTNtwkId() {
        return eftNtwkId;
    }

    /**
     * Sets the value of the eftNtwkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTNtwkIdType }
     *     
     */
    public void setEFTNtwkId(EFTNtwkIdType value) {
        this.eftNtwkId = value;
    }

    /**
     * Gets the value of the preAuthExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link PreAuthExpDtType }
     *     
     */
    public PreAuthExpDtType getPreAuthExpDt() {
        return preAuthExpDt;
    }

    /**
     * Sets the value of the preAuthExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreAuthExpDtType }
     *     
     */
    public void setPreAuthExpDt(PreAuthExpDtType value) {
        this.preAuthExpDt = value;
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
     * Gets the value of the stdIndustDesc property.
     * 
     * @return
     *     possible object is
     *     {@link StdIndustDescType }
     *     
     */
    public StdIndustDescType getStdIndustDesc() {
        return stdIndustDesc;
    }

    /**
     * Sets the value of the stdIndustDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdIndustDescType }
     *     
     */
    public void setStdIndustDesc(StdIndustDescType value) {
        this.stdIndustDesc = value;
    }

    /**
     * Gets the value of the eftCardCapType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardCapTypeType }
     *     
     */
    public EFTCardCapTypeType getEFTCardCapType() {
        return eftCardCapType;
    }

    /**
     * Sets the value of the eftCardCapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardCapTypeType }
     *     
     */
    public void setEFTCardCapType(EFTCardCapTypeType value) {
        this.eftCardCapType = value;
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
     * Gets the value of the addrVerifText property.
     * 
     * @return
     *     possible object is
     *     {@link AddrVerifTextType }
     *     
     */
    public AddrVerifTextType getAddrVerifText() {
        return addrVerifText;
    }

    /**
     * Sets the value of the addrVerifText property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrVerifTextType }
     *     
     */
    public void setAddrVerifText(AddrVerifTextType value) {
        this.addrVerifText = value;
    }

    /**
     * Gets the value of the addrVerifCode property.
     * 
     * @return
     *     possible object is
     *     {@link AddrVerifCodeType }
     *     
     */
    public AddrVerifCodeType getAddrVerifCode() {
        return addrVerifCode;
    }

    /**
     * Sets the value of the addrVerifCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrVerifCodeType }
     *     
     */
    public void setAddrVerifCode(AddrVerifCodeType value) {
        this.addrVerifCode = value;
    }

    /**
     * Gets the value of the addrVerifDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AddrVerifDescType }
     *     
     */
    public AddrVerifDescType getAddrVerifDesc() {
        return addrVerifDesc;
    }

    /**
     * Sets the value of the addrVerifDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrVerifDescType }
     *     
     */
    public void setAddrVerifDesc(AddrVerifDescType value) {
        this.addrVerifDesc = value;
    }

    /**
     * Gets the value of the eftPrvdApprvTrn property.
     * 
     * @return
     *     possible object is
     *     {@link EFTPrvdApprvTrnType }
     *     
     */
    public EFTPrvdApprvTrnType getEFTPrvdApprvTrn() {
        return eftPrvdApprvTrn;
    }

    /**
     * Sets the value of the eftPrvdApprvTrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTPrvdApprvTrnType }
     *     
     */
    public void setEFTPrvdApprvTrn(EFTPrvdApprvTrnType value) {
        this.eftPrvdApprvTrn = value;
    }

    /**
     * Gets the value of the eftPrvdApprvBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTPrvdApprvBalAmtType }
     *     
     */
    public EFTPrvdApprvBalAmtType getEFTPrvdApprvBalAmt() {
        return eftPrvdApprvBalAmt;
    }

    /**
     * Sets the value of the eftPrvdApprvBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTPrvdApprvBalAmtType }
     *     
     */
    public void setEFTPrvdApprvBalAmt(EFTPrvdApprvBalAmtType value) {
        this.eftPrvdApprvBalAmt = value;
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
     * Gets the value of the eftCardSufxNum property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardSufxNumType }
     *     
     */
    public EFTCardSufxNumType getEFTCardSufxNum() {
        return eftCardSufxNum;
    }

    /**
     * Sets the value of the eftCardSufxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardSufxNumType }
     *     
     */
    public void setEFTCardSufxNum(EFTCardSufxNumType value) {
        this.eftCardSufxNum = value;
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
     * Gets the value of the recurTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link RecurTrnTypeType }
     *     
     */
    public RecurTrnTypeType getRecurTrnType() {
        return recurTrnType;
    }

    /**
     * Sets the value of the recurTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurTrnTypeType }
     *     
     */
    public void setRecurTrnType(RecurTrnTypeType value) {
        this.recurTrnType = value;
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
