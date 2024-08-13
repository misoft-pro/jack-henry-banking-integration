
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
 * <p>Java class for DepHistSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepHistSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="TrnStat" type="{http://jackhenry.com/jxchange/TPG/2008}TrnStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type"/&gt;
 *         &lt;element name="TrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeDesc_Type"/&gt;
 *         &lt;element name="PostDt" type="{http://jackhenry.com/jxchange/TPG/2008}PostDt_Type"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type"/&gt;
 *         &lt;element name="BatchNum" type="{http://jackhenry.com/jxchange/TPG/2008}BatchNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="SeqNum" type="{http://jackhenry.com/jxchange/TPG/2008}SeqNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="SrcCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SrcCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnType_Type"/&gt;
 *         &lt;element name="AffCode" type="{http://jackhenry.com/jxchange/TPG/2008}AffCode_Type"/&gt;
 *         &lt;element name="ImgNum" type="{http://jackhenry.com/jxchange/TPG/2008}ImgNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="EffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtPasCode" type="{http://jackhenry.com/jxchange/TPG/2008}StmtPasCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OldRate" type="{http://jackhenry.com/jxchange/TPG/2008}OldRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="EftDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}EftDesc_AType" minOccurs="0"/&gt;
 *         &lt;element name="MemoPost" type="{http://jackhenry.com/jxchange/TPG/2008}MemoPost_CType" minOccurs="0"/&gt;
 *         &lt;element name="TellerNum" type="{http://jackhenry.com/jxchange/TPG/2008}TellerNum_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="XferKey" type="{http://jackhenry.com/jxchange/TPG/2008}XferKey_Type" minOccurs="0"/&gt;
 *           &lt;element name="PayeeName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeName_Type" minOccurs="0"/&gt;
 *           &lt;element name="TrnUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnUsrId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="MemoPostHldOvr" type="{http://jackhenry.com/jxchange/TPG/2008}MemoPostHldOvr_Type" minOccurs="0"/&gt;
 *             &lt;element name="x_EFTCardHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_EFTCardHistSrchRec_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="ODPrvlgTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgTrnType_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="x_ACHHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_ACHHistSrchRec_CType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="TrnWsId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnWsId_Type" minOccurs="0"/&gt;
 *                   &lt;element name="TrnAcptTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnAcptTimeDt_Type" minOccurs="0"/&gt;
 *                   &lt;element name="AffCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AffCodeDesc_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="x_StmtDataHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_StmtDataHistSrchRec_CType" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="TrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;element name="TrnHistBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnHistBalAmt_Type" minOccurs="0"/&gt;
 *                         &lt;sequence minOccurs="0"&gt;
 *                           &lt;element name="Ver_9" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_9_CType"/&gt;
 *                           &lt;element name="EFTTrnId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnId_Type" minOccurs="0"/&gt;
 *                           &lt;sequence minOccurs="0"&gt;
 *                             &lt;element name="Ver_10" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_10_CType"/&gt;
 *                             &lt;element name="HistRecId" type="{http://jackhenry.com/jxchange/TPG/2008}HistRecId_Type" minOccurs="0"/&gt;
 *                             &lt;sequence minOccurs="0"&gt;
 *                               &lt;element name="Ver_11" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_11_CType"/&gt;
 *                               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/sequence&gt;
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
@XmlType(name = "DepHistSrchRec_CType", propOrder = {
    "depAcctId",
    "trnStat",
    "trnCodeCode",
    "trnCodeDesc",
    "postDt",
    "amt",
    "batchNum",
    "seqNum",
    "srcCodeDesc",
    "trnType",
    "affCode",
    "imgNum",
    "effDt",
    "chkNum",
    "stmtPasCode",
    "oldRate",
    "eftDescArray",
    "memoPost",
    "tellerNum",
    "ver1",
    "xferKey",
    "payeeName",
    "trnUsrId",
    "ver2",
    "memoPostHldOvr",
    "xeftCardHistSrchRec",
    "ver3",
    "odPrvlgTrnType",
    "ver4",
    "xachHistSrchRec",
    "ver5",
    "trnWsId",
    "trnAcptTimeDt",
    "affCodeDesc",
    "ver6",
    "xStmtDataHistSrchRec",
    "ver7",
    "trnRcptId",
    "ver8",
    "trnHistBalAmt",
    "ver9",
    "eftTrnId",
    "ver10",
    "histRecId",
    "ver11",
    "any"
})
public class DepHistSrchRecCType {

    @XmlElement(name = "DepAcctId")
    protected AccountIdCType depAcctId;
    @XmlElement(name = "TrnStat")
    protected TrnStatType trnStat;
    @XmlElement(name = "TrnCodeCode", required = true)
    protected TrnCodeCodeType trnCodeCode;
    @XmlElement(name = "TrnCodeDesc", required = true)
    protected TrnCodeDescType trnCodeDesc;
    @XmlElement(name = "PostDt", required = true)
    protected PostDtType postDt;
    @XmlElement(name = "Amt", required = true)
    protected AmtType amt;
    @XmlElement(name = "BatchNum")
    protected BatchNumType batchNum;
    @XmlElement(name = "SeqNum")
    protected SeqNumType seqNum;
    @XmlElement(name = "SrcCodeDesc")
    protected SrcCodeDescType srcCodeDesc;
    @XmlElement(name = "TrnType", required = true)
    protected TrnTypeType trnType;
    @XmlElement(name = "AffCode", required = true)
    protected AffCodeType affCode;
    @XmlElement(name = "ImgNum")
    protected ImgNumType imgNum;
    @XmlElement(name = "EffDt")
    protected EffDtType effDt;
    @XmlElement(name = "ChkNum")
    protected ChkNumType chkNum;
    @XmlElement(name = "StmtPasCode")
    protected StmtPasCodeType stmtPasCode;
    @XmlElement(name = "OldRate")
    protected OldRateType oldRate;
    @XmlElement(name = "EftDescArray")
    protected EftDescAType eftDescArray;
    @XmlElement(name = "MemoPost")
    protected MemoPostCType memoPost;
    @XmlElement(name = "TellerNum")
    protected TellerNumType tellerNum;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "XferKey")
    protected XferKeyType xferKey;
    @XmlElement(name = "PayeeName")
    protected PayeeNameType payeeName;
    @XmlElement(name = "TrnUsrId")
    protected TrnUsrIdType trnUsrId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "MemoPostHldOvr")
    protected MemoPostHldOvrType memoPostHldOvr;
    @XmlElement(name = "x_EFTCardHistSrchRec")
    protected XEFTCardHistSrchRecCType xeftCardHistSrchRec;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "ODPrvlgTrnType")
    protected ODPrvlgTrnTypeType odPrvlgTrnType;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "x_ACHHistSrchRec")
    protected XACHHistSrchRecCType xachHistSrchRec;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "TrnWsId")
    protected TrnWsIdType trnWsId;
    @XmlElement(name = "TrnAcptTimeDt")
    protected TrnAcptTimeDtType trnAcptTimeDt;
    @XmlElement(name = "AffCodeDesc")
    protected AffCodeDescType affCodeDesc;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "x_StmtDataHistSrchRec")
    protected XStmtDataHistSrchRecCType xStmtDataHistSrchRec;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "TrnRcptId")
    protected TrnRcptIdType trnRcptId;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlElement(name = "TrnHistBalAmt")
    protected TrnHistBalAmtType trnHistBalAmt;
    @XmlElement(name = "Ver_9")
    protected Ver9CType ver9;
    @XmlElement(name = "EFTTrnId")
    protected EFTTrnIdType eftTrnId;
    @XmlElement(name = "Ver_10")
    protected Ver10CType ver10;
    @XmlElement(name = "HistRecId")
    protected HistRecIdType histRecId;
    @XmlElement(name = "Ver_11")
    protected Ver11CType ver11;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the depAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getDepAcctId() {
        return depAcctId;
    }

    /**
     * Sets the value of the depAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setDepAcctId(AccountIdCType value) {
        this.depAcctId = value;
    }

    /**
     * Gets the value of the trnStat property.
     * 
     * @return
     *     possible object is
     *     {@link TrnStatType }
     *     
     */
    public TrnStatType getTrnStat() {
        return trnStat;
    }

    /**
     * Sets the value of the trnStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnStatType }
     *     
     */
    public void setTrnStat(TrnStatType value) {
        this.trnStat = value;
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
     * Gets the value of the batchNum property.
     * 
     * @return
     *     possible object is
     *     {@link BatchNumType }
     *     
     */
    public BatchNumType getBatchNum() {
        return batchNum;
    }

    /**
     * Sets the value of the batchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchNumType }
     *     
     */
    public void setBatchNum(BatchNumType value) {
        this.batchNum = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link SeqNumType }
     *     
     */
    public SeqNumType getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeqNumType }
     *     
     */
    public void setSeqNum(SeqNumType value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the srcCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SrcCodeDescType }
     *     
     */
    public SrcCodeDescType getSrcCodeDesc() {
        return srcCodeDesc;
    }

    /**
     * Sets the value of the srcCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrcCodeDescType }
     *     
     */
    public void setSrcCodeDesc(SrcCodeDescType value) {
        this.srcCodeDesc = value;
    }

    /**
     * Gets the value of the trnType property.
     * 
     * @return
     *     possible object is
     *     {@link TrnTypeType }
     *     
     */
    public TrnTypeType getTrnType() {
        return trnType;
    }

    /**
     * Sets the value of the trnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnTypeType }
     *     
     */
    public void setTrnType(TrnTypeType value) {
        this.trnType = value;
    }

    /**
     * Gets the value of the affCode property.
     * 
     * @return
     *     possible object is
     *     {@link AffCodeType }
     *     
     */
    public AffCodeType getAffCode() {
        return affCode;
    }

    /**
     * Sets the value of the affCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffCodeType }
     *     
     */
    public void setAffCode(AffCodeType value) {
        this.affCode = value;
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
     * Gets the value of the stmtPasCode property.
     * 
     * @return
     *     possible object is
     *     {@link StmtPasCodeType }
     *     
     */
    public StmtPasCodeType getStmtPasCode() {
        return stmtPasCode;
    }

    /**
     * Sets the value of the stmtPasCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtPasCodeType }
     *     
     */
    public void setStmtPasCode(StmtPasCodeType value) {
        this.stmtPasCode = value;
    }

    /**
     * Gets the value of the oldRate property.
     * 
     * @return
     *     possible object is
     *     {@link OldRateType }
     *     
     */
    public OldRateType getOldRate() {
        return oldRate;
    }

    /**
     * Sets the value of the oldRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldRateType }
     *     
     */
    public void setOldRate(OldRateType value) {
        this.oldRate = value;
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
     * Gets the value of the memoPost property.
     * 
     * @return
     *     possible object is
     *     {@link MemoPostCType }
     *     
     */
    public MemoPostCType getMemoPost() {
        return memoPost;
    }

    /**
     * Sets the value of the memoPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoPostCType }
     *     
     */
    public void setMemoPost(MemoPostCType value) {
        this.memoPost = value;
    }

    /**
     * Gets the value of the tellerNum property.
     * 
     * @return
     *     possible object is
     *     {@link TellerNumType }
     *     
     */
    public TellerNumType getTellerNum() {
        return tellerNum;
    }

    /**
     * Sets the value of the tellerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TellerNumType }
     *     
     */
    public void setTellerNum(TellerNumType value) {
        this.tellerNum = value;
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
     * Gets the value of the xferKey property.
     * 
     * @return
     *     possible object is
     *     {@link XferKeyType }
     *     
     */
    public XferKeyType getXferKey() {
        return xferKey;
    }

    /**
     * Sets the value of the xferKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferKeyType }
     *     
     */
    public void setXferKey(XferKeyType value) {
        this.xferKey = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeNameType }
     *     
     */
    public PayeeNameType getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeNameType }
     *     
     */
    public void setPayeeName(PayeeNameType value) {
        this.payeeName = value;
    }

    /**
     * Gets the value of the trnUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link TrnUsrIdType }
     *     
     */
    public TrnUsrIdType getTrnUsrId() {
        return trnUsrId;
    }

    /**
     * Sets the value of the trnUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnUsrIdType }
     *     
     */
    public void setTrnUsrId(TrnUsrIdType value) {
        this.trnUsrId = value;
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
     * Gets the value of the odPrvlgTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgTrnTypeType }
     *     
     */
    public ODPrvlgTrnTypeType getODPrvlgTrnType() {
        return odPrvlgTrnType;
    }

    /**
     * Sets the value of the odPrvlgTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgTrnTypeType }
     *     
     */
    public void setODPrvlgTrnType(ODPrvlgTrnTypeType value) {
        this.odPrvlgTrnType = value;
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
     * Gets the value of the trnWsId property.
     * 
     * @return
     *     possible object is
     *     {@link TrnWsIdType }
     *     
     */
    public TrnWsIdType getTrnWsId() {
        return trnWsId;
    }

    /**
     * Sets the value of the trnWsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnWsIdType }
     *     
     */
    public void setTrnWsId(TrnWsIdType value) {
        this.trnWsId = value;
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
     * Gets the value of the affCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AffCodeDescType }
     *     
     */
    public AffCodeDescType getAffCodeDesc() {
        return affCodeDesc;
    }

    /**
     * Sets the value of the affCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffCodeDescType }
     *     
     */
    public void setAffCodeDesc(AffCodeDescType value) {
        this.affCodeDesc = value;
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
     * Gets the value of the xStmtDataHistSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link XStmtDataHistSrchRecCType }
     *     
     */
    public XStmtDataHistSrchRecCType getXStmtDataHistSrchRec() {
        return xStmtDataHistSrchRec;
    }

    /**
     * Sets the value of the xStmtDataHistSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link XStmtDataHistSrchRecCType }
     *     
     */
    public void setXStmtDataHistSrchRec(XStmtDataHistSrchRecCType value) {
        this.xStmtDataHistSrchRec = value;
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
     * Gets the value of the trnRcptId property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRcptIdType }
     *     
     */
    public TrnRcptIdType getTrnRcptId() {
        return trnRcptId;
    }

    /**
     * Sets the value of the trnRcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRcptIdType }
     *     
     */
    public void setTrnRcptId(TrnRcptIdType value) {
        this.trnRcptId = value;
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
     * Gets the value of the trnHistBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnHistBalAmtType }
     *     
     */
    public TrnHistBalAmtType getTrnHistBalAmt() {
        return trnHistBalAmt;
    }

    /**
     * Sets the value of the trnHistBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnHistBalAmtType }
     *     
     */
    public void setTrnHistBalAmt(TrnHistBalAmtType value) {
        this.trnHistBalAmt = value;
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
     * Gets the value of the ver10 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver10CType }
     *     
     */
    public Ver10CType getVer10() {
        return ver10;
    }

    /**
     * Sets the value of the ver10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver10CType }
     *     
     */
    public void setVer10(Ver10CType value) {
        this.ver10 = value;
    }

    /**
     * Gets the value of the histRecId property.
     * 
     * @return
     *     possible object is
     *     {@link HistRecIdType }
     *     
     */
    public HistRecIdType getHistRecId() {
        return histRecId;
    }

    /**
     * Sets the value of the histRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistRecIdType }
     *     
     */
    public void setHistRecId(HistRecIdType value) {
        this.histRecId = value;
    }

    /**
     * Gets the value of the ver11 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver11CType }
     *     
     */
    public Ver11CType getVer11() {
        return ver11;
    }

    /**
     * Sets the value of the ver11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver11CType }
     *     
     */
    public void setVer11(Ver11CType value) {
        this.ver11 = value;
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
