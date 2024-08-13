
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
 * <p>Java class for CardAlrtNotfInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAlrtNotfInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtMsg" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtMsg_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtCatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtCatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtCode" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FinInstName" type="{http://jackhenry.com/jxchange/TPG/2008}FinInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurrType" type="{http://jackhenry.com/jxchange/TPG/2008}CurrType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurrTypeSymb" type="{http://jackhenry.com/jxchange/TPG/2008}CurrTypeSymb_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardMaskNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctIdMask" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnStat" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnChanDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnChanDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnChanCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnChanCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerBusCatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MerBusCatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerBusCatCode" type="{http://jackhenry.com/jxchange/TPG/2008}MerBusCatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerName" type="{http://jackhenry.com/jxchange/TPG/2008}MerName_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerCity" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTMerStateProv" type="{http://jackhenry.com/jxchange/TPG/2008}StateProv_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTMerStateCode" type="{http://jackhenry.com/jxchange/TPG/2008}StateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTMerCntry" type="{http://jackhenry.com/jxchange/TPG/2008}Cntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerCntryType" type="{http://jackhenry.com/jxchange/TPG/2008}CntryType_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerPostalCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnProcTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnRevTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnRevAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddr" type="{http://jackhenry.com/jxchange/TPG/2008}EmailAddr_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNum" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTMerId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTMerId_Type" minOccurs="0"/&gt;
 *         &lt;element name="StdIndustCode" type="{http://jackhenry.com/jxchange/TPG/2008}StdIndustCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnTimeCat" type="{http://jackhenry.com/jxchange/TPG/2008}TrnTimeCat_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRsnCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CardAlrtNotfInqRec_CType", propOrder = {
    "custId",
    "cardAlrtMsg",
    "cardAlrtCatDesc",
    "cardAlrtCode",
    "finInstName",
    "currType",
    "currTypeSymb",
    "eftCardMaskNum",
    "eftCardType",
    "acctIdMask",
    "acctType",
    "eftTrnStatDesc",
    "eftTrnStat",
    "eftTrnChanDesc",
    "eftTrnChanCode",
    "eftTrnAmt",
    "merBusCatDesc",
    "merBusCatCode",
    "merName",
    "merCity",
    "eftMerStateProv",
    "eftMerStateCode",
    "eftMerCntry",
    "merCntryType",
    "merPostalCode",
    "eftTrnTimeDt",
    "eftTrnProcTimeDt",
    "eftTrnRevTimeDt",
    "eftTrnRevAmt",
    "eftTrnDesc",
    "eftTrnCode",
    "emailAddr",
    "phoneNum",
    "eftMerId",
    "stdIndustCode",
    "trnTimeCat",
    "excRsnCode",
    "ver1",
    "any"
})
public class CardAlrtNotfInqRecCType {

    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "CardAlrtMsg")
    protected CardAlrtMsgType cardAlrtMsg;
    @XmlElement(name = "CardAlrtCatDesc")
    protected CardAlrtCatDescType cardAlrtCatDesc;
    @XmlElement(name = "CardAlrtCode")
    protected CardAlrtCodeType cardAlrtCode;
    @XmlElement(name = "FinInstName")
    protected FinInstNameType finInstName;
    @XmlElement(name = "CurrType")
    protected CurrTypeType currType;
    @XmlElement(name = "CurrTypeSymb")
    protected CurrTypeSymbType currTypeSymb;
    @XmlElement(name = "EFTCardMaskNum")
    protected EFTCardNumType eftCardMaskNum;
    @XmlElement(name = "EFTCardType")
    protected EFTCardTypeType eftCardType;
    @XmlElement(name = "AcctIdMask")
    protected AcctIdType acctIdMask;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "EFTTrnStatDesc")
    protected EFTTrnStatDescType eftTrnStatDesc;
    @XmlElement(name = "EFTTrnStat")
    protected EFTTrnStatType eftTrnStat;
    @XmlElement(name = "EFTTrnChanDesc")
    protected EFTTrnChanDescType eftTrnChanDesc;
    @XmlElement(name = "EFTTrnChanCode")
    protected EFTTrnChanCodeType eftTrnChanCode;
    @XmlElement(name = "EFTTrnAmt")
    protected EFTTrnAmtType eftTrnAmt;
    @XmlElement(name = "MerBusCatDesc")
    protected MerBusCatDescType merBusCatDesc;
    @XmlElement(name = "MerBusCatCode")
    protected MerBusCatCodeType merBusCatCode;
    @XmlElement(name = "MerName")
    protected MerNameType merName;
    @XmlElement(name = "MerCity")
    protected CityType merCity;
    @XmlElement(name = "EFTMerStateProv")
    protected StateProvType eftMerStateProv;
    @XmlElement(name = "EFTMerStateCode")
    protected StateCodeType eftMerStateCode;
    @XmlElement(name = "EFTMerCntry")
    protected CntryType eftMerCntry;
    @XmlElement(name = "MerCntryType")
    protected CntryTypeType merCntryType;
    @XmlElement(name = "MerPostalCode")
    protected PostalCodeType merPostalCode;
    @XmlElement(name = "EFTTrnTimeDt")
    protected EFTTrnTimeDtType eftTrnTimeDt;
    @XmlElement(name = "EFTTrnProcTimeDt")
    protected EFTTrnTimeDtType eftTrnProcTimeDt;
    @XmlElement(name = "EFTTrnRevTimeDt")
    protected EFTTrnTimeDtType eftTrnRevTimeDt;
    @XmlElement(name = "EFTTrnRevAmt")
    protected EFTTrnAmtType eftTrnRevAmt;
    @XmlElement(name = "EFTTrnDesc")
    protected EFTTrnDescType eftTrnDesc;
    @XmlElement(name = "EFTTrnCode")
    protected EFTTrnCodeType eftTrnCode;
    @XmlElement(name = "EmailAddr")
    protected EmailAddrType emailAddr;
    @XmlElement(name = "PhoneNum")
    protected PhoneNumType phoneNum;
    @XmlElement(name = "EFTMerId")
    protected EFTMerIdType eftMerId;
    @XmlElement(name = "StdIndustCode")
    protected StdIndustCodeType stdIndustCode;
    @XmlElement(name = "TrnTimeCat")
    protected TrnTimeCatType trnTimeCat;
    @XmlElement(name = "ExcRsnCode")
    protected ExcRsnCodeType excRsnCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
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
     * Gets the value of the cardAlrtMsg property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtMsgType }
     *     
     */
    public CardAlrtMsgType getCardAlrtMsg() {
        return cardAlrtMsg;
    }

    /**
     * Sets the value of the cardAlrtMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtMsgType }
     *     
     */
    public void setCardAlrtMsg(CardAlrtMsgType value) {
        this.cardAlrtMsg = value;
    }

    /**
     * Gets the value of the cardAlrtCatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtCatDescType }
     *     
     */
    public CardAlrtCatDescType getCardAlrtCatDesc() {
        return cardAlrtCatDesc;
    }

    /**
     * Sets the value of the cardAlrtCatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtCatDescType }
     *     
     */
    public void setCardAlrtCatDesc(CardAlrtCatDescType value) {
        this.cardAlrtCatDesc = value;
    }

    /**
     * Gets the value of the cardAlrtCode property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtCodeType }
     *     
     */
    public CardAlrtCodeType getCardAlrtCode() {
        return cardAlrtCode;
    }

    /**
     * Sets the value of the cardAlrtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtCodeType }
     *     
     */
    public void setCardAlrtCode(CardAlrtCodeType value) {
        this.cardAlrtCode = value;
    }

    /**
     * Gets the value of the finInstName property.
     * 
     * @return
     *     possible object is
     *     {@link FinInstNameType }
     *     
     */
    public FinInstNameType getFinInstName() {
        return finInstName;
    }

    /**
     * Sets the value of the finInstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinInstNameType }
     *     
     */
    public void setFinInstName(FinInstNameType value) {
        this.finInstName = value;
    }

    /**
     * Gets the value of the currType property.
     * 
     * @return
     *     possible object is
     *     {@link CurrTypeType }
     *     
     */
    public CurrTypeType getCurrType() {
        return currType;
    }

    /**
     * Sets the value of the currType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrTypeType }
     *     
     */
    public void setCurrType(CurrTypeType value) {
        this.currType = value;
    }

    /**
     * Gets the value of the currTypeSymb property.
     * 
     * @return
     *     possible object is
     *     {@link CurrTypeSymbType }
     *     
     */
    public CurrTypeSymbType getCurrTypeSymb() {
        return currTypeSymb;
    }

    /**
     * Sets the value of the currTypeSymb property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrTypeSymbType }
     *     
     */
    public void setCurrTypeSymb(CurrTypeSymbType value) {
        this.currTypeSymb = value;
    }

    /**
     * Gets the value of the eftCardMaskNum property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardNumType }
     *     
     */
    public EFTCardNumType getEFTCardMaskNum() {
        return eftCardMaskNum;
    }

    /**
     * Sets the value of the eftCardMaskNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardNumType }
     *     
     */
    public void setEFTCardMaskNum(EFTCardNumType value) {
        this.eftCardMaskNum = value;
    }

    /**
     * Gets the value of the eftCardType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardTypeType }
     *     
     */
    public EFTCardTypeType getEFTCardType() {
        return eftCardType;
    }

    /**
     * Sets the value of the eftCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardTypeType }
     *     
     */
    public void setEFTCardType(EFTCardTypeType value) {
        this.eftCardType = value;
    }

    /**
     * Gets the value of the acctIdMask property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAcctIdMask() {
        return acctIdMask;
    }

    /**
     * Sets the value of the acctIdMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAcctIdMask(AcctIdType value) {
        this.acctIdMask = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
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
     * Gets the value of the eftTrnChanDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnChanDescType }
     *     
     */
    public EFTTrnChanDescType getEFTTrnChanDesc() {
        return eftTrnChanDesc;
    }

    /**
     * Sets the value of the eftTrnChanDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnChanDescType }
     *     
     */
    public void setEFTTrnChanDesc(EFTTrnChanDescType value) {
        this.eftTrnChanDesc = value;
    }

    /**
     * Gets the value of the eftTrnChanCode property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnChanCodeType }
     *     
     */
    public EFTTrnChanCodeType getEFTTrnChanCode() {
        return eftTrnChanCode;
    }

    /**
     * Sets the value of the eftTrnChanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnChanCodeType }
     *     
     */
    public void setEFTTrnChanCode(EFTTrnChanCodeType value) {
        this.eftTrnChanCode = value;
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
     * Gets the value of the merBusCatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MerBusCatDescType }
     *     
     */
    public MerBusCatDescType getMerBusCatDesc() {
        return merBusCatDesc;
    }

    /**
     * Sets the value of the merBusCatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerBusCatDescType }
     *     
     */
    public void setMerBusCatDesc(MerBusCatDescType value) {
        this.merBusCatDesc = value;
    }

    /**
     * Gets the value of the merBusCatCode property.
     * 
     * @return
     *     possible object is
     *     {@link MerBusCatCodeType }
     *     
     */
    public MerBusCatCodeType getMerBusCatCode() {
        return merBusCatCode;
    }

    /**
     * Sets the value of the merBusCatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerBusCatCodeType }
     *     
     */
    public void setMerBusCatCode(MerBusCatCodeType value) {
        this.merBusCatCode = value;
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
     * Gets the value of the merCity property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getMerCity() {
        return merCity;
    }

    /**
     * Sets the value of the merCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setMerCity(CityType value) {
        this.merCity = value;
    }

    /**
     * Gets the value of the eftMerStateProv property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvType }
     *     
     */
    public StateProvType getEFTMerStateProv() {
        return eftMerStateProv;
    }

    /**
     * Sets the value of the eftMerStateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvType }
     *     
     */
    public void setEFTMerStateProv(StateProvType value) {
        this.eftMerStateProv = value;
    }

    /**
     * Gets the value of the eftMerStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateCodeType }
     *     
     */
    public StateCodeType getEFTMerStateCode() {
        return eftMerStateCode;
    }

    /**
     * Sets the value of the eftMerStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateCodeType }
     *     
     */
    public void setEFTMerStateCode(StateCodeType value) {
        this.eftMerStateCode = value;
    }

    /**
     * Gets the value of the eftMerCntry property.
     * 
     * @return
     *     possible object is
     *     {@link CntryType }
     *     
     */
    public CntryType getEFTMerCntry() {
        return eftMerCntry;
    }

    /**
     * Sets the value of the eftMerCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryType }
     *     
     */
    public void setEFTMerCntry(CntryType value) {
        this.eftMerCntry = value;
    }

    /**
     * Gets the value of the merCntryType property.
     * 
     * @return
     *     possible object is
     *     {@link CntryTypeType }
     *     
     */
    public CntryTypeType getMerCntryType() {
        return merCntryType;
    }

    /**
     * Sets the value of the merCntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryTypeType }
     *     
     */
    public void setMerCntryType(CntryTypeType value) {
        this.merCntryType = value;
    }

    /**
     * Gets the value of the merPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link PostalCodeType }
     *     
     */
    public PostalCodeType getMerPostalCode() {
        return merPostalCode;
    }

    /**
     * Sets the value of the merPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCodeType }
     *     
     */
    public void setMerPostalCode(PostalCodeType value) {
        this.merPostalCode = value;
    }

    /**
     * Gets the value of the eftTrnTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnTimeDtType }
     *     
     */
    public EFTTrnTimeDtType getEFTTrnTimeDt() {
        return eftTrnTimeDt;
    }

    /**
     * Sets the value of the eftTrnTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnTimeDtType }
     *     
     */
    public void setEFTTrnTimeDt(EFTTrnTimeDtType value) {
        this.eftTrnTimeDt = value;
    }

    /**
     * Gets the value of the eftTrnProcTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnTimeDtType }
     *     
     */
    public EFTTrnTimeDtType getEFTTrnProcTimeDt() {
        return eftTrnProcTimeDt;
    }

    /**
     * Sets the value of the eftTrnProcTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnTimeDtType }
     *     
     */
    public void setEFTTrnProcTimeDt(EFTTrnTimeDtType value) {
        this.eftTrnProcTimeDt = value;
    }

    /**
     * Gets the value of the eftTrnRevTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnTimeDtType }
     *     
     */
    public EFTTrnTimeDtType getEFTTrnRevTimeDt() {
        return eftTrnRevTimeDt;
    }

    /**
     * Sets the value of the eftTrnRevTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnTimeDtType }
     *     
     */
    public void setEFTTrnRevTimeDt(EFTTrnTimeDtType value) {
        this.eftTrnRevTimeDt = value;
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
     * Gets the value of the emailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddrType }
     *     
     */
    public EmailAddrType getEmailAddr() {
        return emailAddr;
    }

    /**
     * Sets the value of the emailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddrType }
     *     
     */
    public void setEmailAddr(EmailAddrType value) {
        this.emailAddr = value;
    }

    /**
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumType }
     *     
     */
    public PhoneNumType getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumType }
     *     
     */
    public void setPhoneNum(PhoneNumType value) {
        this.phoneNum = value;
    }

    /**
     * Gets the value of the eftMerId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTMerIdType }
     *     
     */
    public EFTMerIdType getEFTMerId() {
        return eftMerId;
    }

    /**
     * Sets the value of the eftMerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTMerIdType }
     *     
     */
    public void setEFTMerId(EFTMerIdType value) {
        this.eftMerId = value;
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
     * Gets the value of the trnTimeCat property.
     * 
     * @return
     *     possible object is
     *     {@link TrnTimeCatType }
     *     
     */
    public TrnTimeCatType getTrnTimeCat() {
        return trnTimeCat;
    }

    /**
     * Sets the value of the trnTimeCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnTimeCatType }
     *     
     */
    public void setTrnTimeCat(TrnTimeCatType value) {
        this.trnTimeCat = value;
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
