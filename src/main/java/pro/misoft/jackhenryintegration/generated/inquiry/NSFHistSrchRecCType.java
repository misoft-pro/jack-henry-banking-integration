
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
 * <p>Java class for NSFHistSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NSFHistSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NSFStat" type="{http://jackhenry.com/jxchange/TPG/2008}NSFStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostDt" type="{http://jackhenry.com/jxchange/TPG/2008}PostDt_Type"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type"/&gt;
 *         &lt;element name="ImgNum" type="{http://jackhenry.com/jxchange/TPG/2008}ImgNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NSFFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFChgWav" type="{http://jackhenry.com/jxchange/TPG/2008}NSFChgWav_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RetRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}RetRsnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RetRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RetRsnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EftDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}EftDesc_AType" minOccurs="0"/&gt;
 *         &lt;element name="CustomNSFHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AccountId_CType" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *           &lt;element name="NSFItemId" type="{http://jackhenry.com/jxchange/TPG/2008}NSFItemId_Type" minOccurs="0"/&gt;
 *           &lt;element name="NSFPdUnCol" type="{http://jackhenry.com/jxchange/TPG/2008}NSFPdUnCol_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExcDispCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcDispCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExcDispDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcDispDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExcResolveType" type="{http://jackhenry.com/jxchange/TPG/2008}ExcResolveType_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *             &lt;element name="ComName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="x_EFTCardHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_EFTCardHistSrchRec_CType" minOccurs="0"/&gt;
 *               &lt;element name="x_ACHHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_ACHHistSrchRec_CType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="TrnAuthBalType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnAuthBalType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "NSFHistSrchRec_CType", propOrder = {
    "nsfStat",
    "trnCodeCode",
    "trnCodeDesc",
    "postDt",
    "amt",
    "imgNum",
    "chkNum",
    "nsfFeeAmt",
    "nsfChgWav",
    "offCode",
    "offDesc",
    "retRsnCode",
    "retRsnDesc",
    "eftDescArray",
    "customNSFHistSrchRec",
    "ver1",
    "accountIdCType",
    "nsfItemId",
    "nsfPdUnCol",
    "excDispCode",
    "excDispDesc",
    "brCode",
    "brDesc",
    "excResolveType",
    "ver2",
    "custId",
    "comName",
    "ver3",
    "xeftCardHistSrchRec",
    "xachHistSrchRec",
    "ver4",
    "trnAuthBalType",
    "ver5",
    "any"
})
public class NSFHistSrchRecCType {

    @XmlElement(name = "NSFStat")
    protected NSFStatType nsfStat;
    @XmlElement(name = "TrnCodeCode")
    protected TrnCodeCodeType trnCodeCode;
    @XmlElement(name = "TrnCodeDesc")
    protected TrnCodeDescType trnCodeDesc;
    @XmlElement(name = "PostDt", required = true)
    protected PostDtType postDt;
    @XmlElement(name = "Amt", required = true)
    protected AmtType amt;
    @XmlElement(name = "ImgNum")
    protected ImgNumType imgNum;
    @XmlElement(name = "ChkNum")
    protected ChkNumType chkNum;
    @XmlElement(name = "NSFFeeAmt")
    protected NSFFeeAmtType nsfFeeAmt;
    @XmlElement(name = "NSFChgWav")
    protected NSFChgWavType nsfChgWav;
    @XmlElement(name = "OffCode")
    protected OffCodeType offCode;
    @XmlElement(name = "OffDesc")
    protected OffDescType offDesc;
    @XmlElement(name = "RetRsnCode")
    protected RetRsnCodeType retRsnCode;
    @XmlElement(name = "RetRsnDesc")
    protected RetRsnDescType retRsnDesc;
    @XmlElement(name = "EftDescArray")
    protected EftDescAType eftDescArray;
    @XmlElement(name = "CustomNSFHistSrchRec")
    protected CustomCType customNSFHistSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AccountId_CType")
    protected AccountIdCType accountIdCType;
    @XmlElement(name = "NSFItemId")
    protected NSFItemIdType nsfItemId;
    @XmlElement(name = "NSFPdUnCol")
    protected NSFPdUnColType nsfPdUnCol;
    @XmlElement(name = "ExcDispCode")
    protected ExcDispCodeType excDispCode;
    @XmlElement(name = "ExcDispDesc")
    protected ExcDispDescType excDispDesc;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "ExcResolveType")
    protected ExcResolveTypeType excResolveType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "ComName")
    protected ComNameType comName;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "x_EFTCardHistSrchRec")
    protected XEFTCardHistSrchRecCType xeftCardHistSrchRec;
    @XmlElement(name = "x_ACHHistSrchRec")
    protected XACHHistSrchRecCType xachHistSrchRec;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "TrnAuthBalType")
    protected TrnAuthBalTypeType trnAuthBalType;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the nsfStat property.
     * 
     * @return
     *     possible object is
     *     {@link NSFStatType }
     *     
     */
    public NSFStatType getNSFStat() {
        return nsfStat;
    }

    /**
     * Sets the value of the nsfStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFStatType }
     *     
     */
    public void setNSFStat(NSFStatType value) {
        this.nsfStat = value;
    }

    /**
     * Gets the value of the trnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public TrnCodeCodeType getTrnCodeCode() {
        return trnCodeCode;
    }

    /**
     * Sets the value of the trnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public void setTrnCodeCode(TrnCodeCodeType value) {
        this.trnCodeCode = value;
    }

    /**
     * Gets the value of the trnCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCodeDescType }
     *     
     */
    public TrnCodeDescType getTrnCodeDesc() {
        return trnCodeDesc;
    }

    /**
     * Sets the value of the trnCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCodeDescType }
     *     
     */
    public void setTrnCodeDesc(TrnCodeDescType value) {
        this.trnCodeDesc = value;
    }

    /**
     * Gets the value of the postDt property.
     * 
     * @return
     *     possible object is
     *     {@link PostDtType }
     *     
     */
    public PostDtType getPostDt() {
        return postDt;
    }

    /**
     * Sets the value of the postDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostDtType }
     *     
     */
    public void setPostDt(PostDtType value) {
        this.postDt = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setAmt(AmtType value) {
        this.amt = value;
    }

    /**
     * Gets the value of the imgNum property.
     * 
     * @return
     *     possible object is
     *     {@link ImgNumType }
     *     
     */
    public ImgNumType getImgNum() {
        return imgNum;
    }

    /**
     * Sets the value of the imgNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgNumType }
     *     
     */
    public void setImgNum(ImgNumType value) {
        this.imgNum = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumType }
     *     
     */
    public ChkNumType getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumType }
     *     
     */
    public void setChkNum(ChkNumType value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the nsfFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NSFFeeAmtType }
     *     
     */
    public NSFFeeAmtType getNSFFeeAmt() {
        return nsfFeeAmt;
    }

    /**
     * Sets the value of the nsfFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFFeeAmtType }
     *     
     */
    public void setNSFFeeAmt(NSFFeeAmtType value) {
        this.nsfFeeAmt = value;
    }

    /**
     * Gets the value of the nsfChgWav property.
     * 
     * @return
     *     possible object is
     *     {@link NSFChgWavType }
     *     
     */
    public NSFChgWavType getNSFChgWav() {
        return nsfChgWav;
    }

    /**
     * Sets the value of the nsfChgWav property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFChgWavType }
     *     
     */
    public void setNSFChgWav(NSFChgWavType value) {
        this.nsfChgWav = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setOffCode(OffCodeType value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the offDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getOffDesc() {
        return offDesc;
    }

    /**
     * Sets the value of the offDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setOffDesc(OffDescType value) {
        this.offDesc = value;
    }

    /**
     * Gets the value of the retRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link RetRsnCodeType }
     *     
     */
    public RetRsnCodeType getRetRsnCode() {
        return retRsnCode;
    }

    /**
     * Sets the value of the retRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetRsnCodeType }
     *     
     */
    public void setRetRsnCode(RetRsnCodeType value) {
        this.retRsnCode = value;
    }

    /**
     * Gets the value of the retRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RetRsnDescType }
     *     
     */
    public RetRsnDescType getRetRsnDesc() {
        return retRsnDesc;
    }

    /**
     * Sets the value of the retRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetRsnDescType }
     *     
     */
    public void setRetRsnDesc(RetRsnDescType value) {
        this.retRsnDesc = value;
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
     * Gets the value of the customNSFHistSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomNSFHistSrchRec() {
        return customNSFHistSrchRec;
    }

    /**
     * Sets the value of the customNSFHistSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomNSFHistSrchRec(CustomCType value) {
        this.customNSFHistSrchRec = value;
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
     * Gets the value of the accountIdCType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getAccountIdCType() {
        return accountIdCType;
    }

    /**
     * Sets the value of the accountIdCType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setAccountIdCType(AccountIdCType value) {
        this.accountIdCType = value;
    }

    /**
     * Gets the value of the nsfItemId property.
     * 
     * @return
     *     possible object is
     *     {@link NSFItemIdType }
     *     
     */
    public NSFItemIdType getNSFItemId() {
        return nsfItemId;
    }

    /**
     * Sets the value of the nsfItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFItemIdType }
     *     
     */
    public void setNSFItemId(NSFItemIdType value) {
        this.nsfItemId = value;
    }

    /**
     * Gets the value of the nsfPdUnCol property.
     * 
     * @return
     *     possible object is
     *     {@link NSFPdUnColType }
     *     
     */
    public NSFPdUnColType getNSFPdUnCol() {
        return nsfPdUnCol;
    }

    /**
     * Sets the value of the nsfPdUnCol property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFPdUnColType }
     *     
     */
    public void setNSFPdUnCol(NSFPdUnColType value) {
        this.nsfPdUnCol = value;
    }

    /**
     * Gets the value of the excDispCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExcDispCodeType }
     *     
     */
    public ExcDispCodeType getExcDispCode() {
        return excDispCode;
    }

    /**
     * Sets the value of the excDispCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcDispCodeType }
     *     
     */
    public void setExcDispCode(ExcDispCodeType value) {
        this.excDispCode = value;
    }

    /**
     * Gets the value of the excDispDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ExcDispDescType }
     *     
     */
    public ExcDispDescType getExcDispDesc() {
        return excDispDesc;
    }

    /**
     * Sets the value of the excDispDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcDispDescType }
     *     
     */
    public void setExcDispDesc(ExcDispDescType value) {
        this.excDispDesc = value;
    }

    /**
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setBrCode(BrCodeType value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the brDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getBrDesc() {
        return brDesc;
    }

    /**
     * Sets the value of the brDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setBrDesc(BrDescType value) {
        this.brDesc = value;
    }

    /**
     * Gets the value of the excResolveType property.
     * 
     * @return
     *     possible object is
     *     {@link ExcResolveTypeType }
     *     
     */
    public ExcResolveTypeType getExcResolveType() {
        return excResolveType;
    }

    /**
     * Sets the value of the excResolveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcResolveTypeType }
     *     
     */
    public void setExcResolveType(ExcResolveTypeType value) {
        this.excResolveType = value;
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
     * Gets the value of the comName property.
     * 
     * @return
     *     possible object is
     *     {@link ComNameType }
     *     
     */
    public ComNameType getComName() {
        return comName;
    }

    /**
     * Sets the value of the comName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComNameType }
     *     
     */
    public void setComName(ComNameType value) {
        this.comName = value;
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
     * Gets the value of the xeftCardHistSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link XEFTCardHistSrchRecCType }
     *     
     */
    public XEFTCardHistSrchRecCType getXEFTCardHistSrchRec() {
        return xeftCardHistSrchRec;
    }

    /**
     * Sets the value of the xeftCardHistSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEFTCardHistSrchRecCType }
     *     
     */
    public void setXEFTCardHistSrchRec(XEFTCardHistSrchRecCType value) {
        this.xeftCardHistSrchRec = value;
    }

    /**
     * Gets the value of the xachHistSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link XACHHistSrchRecCType }
     *     
     */
    public XACHHistSrchRecCType getXACHHistSrchRec() {
        return xachHistSrchRec;
    }

    /**
     * Sets the value of the xachHistSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link XACHHistSrchRecCType }
     *     
     */
    public void setXACHHistSrchRec(XACHHistSrchRecCType value) {
        this.xachHistSrchRec = value;
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
     * Gets the value of the trnAuthBalType property.
     * 
     * @return
     *     possible object is
     *     {@link TrnAuthBalTypeType }
     *     
     */
    public TrnAuthBalTypeType getTrnAuthBalType() {
        return trnAuthBalType;
    }

    /**
     * Sets the value of the trnAuthBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnAuthBalTypeType }
     *     
     */
    public void setTrnAuthBalType(TrnAuthBalTypeType value) {
        this.trnAuthBalType = value;
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
