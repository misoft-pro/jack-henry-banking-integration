
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for TrnModInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnModInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type"/&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type"/&gt;
 *         &lt;element name="EftType" type="{http://jackhenry.com/jxchange/TPG/2008}EftType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SrcCode" type="{http://jackhenry.com/jxchange/TPG/2008}SrcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrCr" type="{http://jackhenry.com/jxchange/TPG/2008}DrCr_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="RefDescCode" type="{http://jackhenry.com/jxchange/TPG/2008}RefDescCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLInterfaceCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLInterfaceCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RunNum" type="{http://jackhenry.com/jxchange/TPG/2008}RunNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="RtNum" type="{http://jackhenry.com/jxchange/TPG/2008}RtNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="FltSchedCode" type="{http://jackhenry.com/jxchange/TPG/2008}FltSchedCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FltDays" type="{http://jackhenry.com/jxchange/TPG/2008}FltDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgNum" type="{http://jackhenry.com/jxchange/TPG/2008}ImgNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ColBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvlBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AvlBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LdgrBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LdgrBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SrcFundsCode" type="{http://jackhenry.com/jxchange/TPG/2008}SrcFundsCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="MemoPostHldOvr" type="{http://jackhenry.com/jxchange/TPG/2008}MemoPostHldOvr_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="EFTTrnId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnId_Type" minOccurs="0"/&gt;
 *             &lt;element name="TrnAcptTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnAcptTimeDt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="LnSvcTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}LnSvcTrnCode_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="LnUnitId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TrnModInfo_CType", propOrder = {
    "amt",
    "trnCodeCode",
    "eftType",
    "effDt",
    "srcCode",
    "chkNum",
    "drCr",
    "trnDesc",
    "refDescCode",
    "offCode",
    "brCode",
    "glCostCtr",
    "glProdCode",
    "glInterfaceCode",
    "runNum",
    "rtNum",
    "fltSchedCode",
    "fltDays",
    "imgNum",
    "colBalAmt",
    "avlBalAmt",
    "ldgrBalAmt",
    "srcFundsCode",
    "ver1",
    "memoPostHldOvr",
    "ver2",
    "eftTrnId",
    "trnAcptTimeDt",
    "ver3",
    "lnSvcTrnCode",
    "ver4",
    "lnUnitId",
    "ver5",
    "any"
})
public class TrnModInfoCType {

    @XmlElement(name = "Amt", required = true)
    protected AmtType amt;
    @XmlElement(name = "TrnCodeCode", required = true)
    protected TrnCodeCodeType trnCodeCode;
    @XmlElement(name = "EftType")
    protected EftTypeType eftType;
    @XmlElement(name = "EffDt")
    protected EffDtType effDt;
    @XmlElement(name = "SrcCode")
    protected SrcCodeType srcCode;
    @XmlElement(name = "ChkNum")
    protected ChkNumType chkNum;
    @XmlElement(name = "DrCr")
    protected DrCrType drCr;
    @XmlElement(name = "TrnDesc")
    protected RmkAType trnDesc;
    @XmlElement(name = "RefDescCode")
    protected RefDescCodeType refDescCode;
    @XmlElement(name = "OffCode")
    protected OffCodeType offCode;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "GLCostCtr")
    protected GLCostCtrType glCostCtr;
    @XmlElement(name = "GLProdCode")
    protected GLProdCodeType glProdCode;
    @XmlElement(name = "GLInterfaceCode")
    protected GLInterfaceCodeType glInterfaceCode;
    @XmlElement(name = "RunNum")
    protected RunNumType runNum;
    @XmlElement(name = "RtNum")
    protected RtNumType rtNum;
    @XmlElement(name = "FltSchedCode")
    protected FltSchedCodeType fltSchedCode;
    @XmlElement(name = "FltDays")
    protected FltDaysType fltDays;
    @XmlElement(name = "ImgNum")
    protected ImgNumType imgNum;
    @XmlElement(name = "ColBalAmt")
    protected ColBalAmtType colBalAmt;
    @XmlElement(name = "AvlBalAmt")
    protected AvlBalAmtType avlBalAmt;
    @XmlElement(name = "LdgrBalAmt")
    protected LdgrBalAmtType ldgrBalAmt;
    @XmlElement(name = "SrcFundsCode")
    protected SrcFundsCodeType srcFundsCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "MemoPostHldOvr")
    protected MemoPostHldOvrType memoPostHldOvr;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "EFTTrnId")
    protected EFTTrnIdType eftTrnId;
    @XmlElement(name = "TrnAcptTimeDt")
    protected TrnAcptTimeDtType trnAcptTimeDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "LnSvcTrnCode")
    protected LnSvcTrnCodeType lnSvcTrnCode;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "LnUnitId")
    protected LnUnitIdType lnUnitId;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the eftType property.
     * 
     * @return
     *     possible object is
     *     {@link EftTypeType }
     *     
     */
    public EftTypeType getEftType() {
        return eftType;
    }

    /**
     * Sets the value of the eftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EftTypeType }
     *     
     */
    public void setEftType(EftTypeType value) {
        this.eftType = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link EffDtType }
     *     
     */
    public EffDtType getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffDtType }
     *     
     */
    public void setEffDt(EffDtType value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the srcCode property.
     * 
     * @return
     *     possible object is
     *     {@link SrcCodeType }
     *     
     */
    public SrcCodeType getSrcCode() {
        return srcCode;
    }

    /**
     * Sets the value of the srcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrcCodeType }
     *     
     */
    public void setSrcCode(SrcCodeType value) {
        this.srcCode = value;
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
     * Gets the value of the drCr property.
     * 
     * @return
     *     possible object is
     *     {@link DrCrType }
     *     
     */
    public DrCrType getDrCr() {
        return drCr;
    }

    /**
     * Sets the value of the drCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrCrType }
     *     
     */
    public void setDrCr(DrCrType value) {
        this.drCr = value;
    }

    /**
     * Gets the value of the trnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getTrnDesc() {
        return trnDesc;
    }

    /**
     * Sets the value of the trnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setTrnDesc(RmkAType value) {
        this.trnDesc = value;
    }

    /**
     * Gets the value of the refDescCode property.
     * 
     * @return
     *     possible object is
     *     {@link RefDescCodeType }
     *     
     */
    public RefDescCodeType getRefDescCode() {
        return refDescCode;
    }

    /**
     * Sets the value of the refDescCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefDescCodeType }
     *     
     */
    public void setRefDescCode(RefDescCodeType value) {
        this.refDescCode = value;
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
     * Gets the value of the glCostCtr property.
     * 
     * @return
     *     possible object is
     *     {@link GLCostCtrType }
     *     
     */
    public GLCostCtrType getGLCostCtr() {
        return glCostCtr;
    }

    /**
     * Sets the value of the glCostCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLCostCtrType }
     *     
     */
    public void setGLCostCtr(GLCostCtrType value) {
        this.glCostCtr = value;
    }

    /**
     * Gets the value of the glProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLProdCodeType }
     *     
     */
    public GLProdCodeType getGLProdCode() {
        return glProdCode;
    }

    /**
     * Sets the value of the glProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLProdCodeType }
     *     
     */
    public void setGLProdCode(GLProdCodeType value) {
        this.glProdCode = value;
    }

    /**
     * Gets the value of the glInterfaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLInterfaceCodeType }
     *     
     */
    public GLInterfaceCodeType getGLInterfaceCode() {
        return glInterfaceCode;
    }

    /**
     * Sets the value of the glInterfaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLInterfaceCodeType }
     *     
     */
    public void setGLInterfaceCode(GLInterfaceCodeType value) {
        this.glInterfaceCode = value;
    }

    /**
     * Gets the value of the runNum property.
     * 
     * @return
     *     possible object is
     *     {@link RunNumType }
     *     
     */
    public RunNumType getRunNum() {
        return runNum;
    }

    /**
     * Sets the value of the runNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunNumType }
     *     
     */
    public void setRunNum(RunNumType value) {
        this.runNum = value;
    }

    /**
     * Gets the value of the rtNum property.
     * 
     * @return
     *     possible object is
     *     {@link RtNumType }
     *     
     */
    public RtNumType getRtNum() {
        return rtNum;
    }

    /**
     * Sets the value of the rtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RtNumType }
     *     
     */
    public void setRtNum(RtNumType value) {
        this.rtNum = value;
    }

    /**
     * Gets the value of the fltSchedCode property.
     * 
     * @return
     *     possible object is
     *     {@link FltSchedCodeType }
     *     
     */
    public FltSchedCodeType getFltSchedCode() {
        return fltSchedCode;
    }

    /**
     * Sets the value of the fltSchedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltSchedCodeType }
     *     
     */
    public void setFltSchedCode(FltSchedCodeType value) {
        this.fltSchedCode = value;
    }

    /**
     * Gets the value of the fltDays property.
     * 
     * @return
     *     possible object is
     *     {@link FltDaysType }
     *     
     */
    public FltDaysType getFltDays() {
        return fltDays;
    }

    /**
     * Sets the value of the fltDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltDaysType }
     *     
     */
    public void setFltDays(FltDaysType value) {
        this.fltDays = value;
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
     * Gets the value of the colBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ColBalAmtType }
     *     
     */
    public ColBalAmtType getColBalAmt() {
        return colBalAmt;
    }

    /**
     * Sets the value of the colBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColBalAmtType }
     *     
     */
    public void setColBalAmt(ColBalAmtType value) {
        this.colBalAmt = value;
    }

    /**
     * Gets the value of the avlBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AvlBalAmtType }
     *     
     */
    public AvlBalAmtType getAvlBalAmt() {
        return avlBalAmt;
    }

    /**
     * Sets the value of the avlBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvlBalAmtType }
     *     
     */
    public void setAvlBalAmt(AvlBalAmtType value) {
        this.avlBalAmt = value;
    }

    /**
     * Gets the value of the ldgrBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LdgrBalAmtType }
     *     
     */
    public LdgrBalAmtType getLdgrBalAmt() {
        return ldgrBalAmt;
    }

    /**
     * Sets the value of the ldgrBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdgrBalAmtType }
     *     
     */
    public void setLdgrBalAmt(LdgrBalAmtType value) {
        this.ldgrBalAmt = value;
    }

    /**
     * Gets the value of the srcFundsCode property.
     * 
     * @return
     *     possible object is
     *     {@link SrcFundsCodeType }
     *     
     */
    public SrcFundsCodeType getSrcFundsCode() {
        return srcFundsCode;
    }

    /**
     * Sets the value of the srcFundsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrcFundsCodeType }
     *     
     */
    public void setSrcFundsCode(SrcFundsCodeType value) {
        this.srcFundsCode = value;
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
     * Gets the value of the memoPostHldOvr property.
     * 
     * @return
     *     possible object is
     *     {@link MemoPostHldOvrType }
     *     
     */
    public MemoPostHldOvrType getMemoPostHldOvr() {
        return memoPostHldOvr;
    }

    /**
     * Sets the value of the memoPostHldOvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoPostHldOvrType }
     *     
     */
    public void setMemoPostHldOvr(MemoPostHldOvrType value) {
        this.memoPostHldOvr = value;
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
     * Gets the value of the trnAcptTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnAcptTimeDtType }
     *     
     */
    public TrnAcptTimeDtType getTrnAcptTimeDt() {
        return trnAcptTimeDt;
    }

    /**
     * Sets the value of the trnAcptTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnAcptTimeDtType }
     *     
     */
    public void setTrnAcptTimeDt(TrnAcptTimeDtType value) {
        this.trnAcptTimeDt = value;
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
     * Gets the value of the lnSvcTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link LnSvcTrnCodeType }
     *     
     */
    public LnSvcTrnCodeType getLnSvcTrnCode() {
        return lnSvcTrnCode;
    }

    /**
     * Sets the value of the lnSvcTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnSvcTrnCodeType }
     *     
     */
    public void setLnSvcTrnCode(LnSvcTrnCodeType value) {
        this.lnSvcTrnCode = value;
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
     * {@link Element }
     * {@link Object }
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
