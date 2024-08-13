
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
 * <p>Java class for AcctNSFTrnRecInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctNSFTrnRecInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NSFItemTrnRec" type="{http://jackhenry.com/jxchange/TPG/2008}NSFItemTrnRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="NSFItemId" type="{http://jackhenry.com/jxchange/TPG/2008}NSFItemId_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFStat" type="{http://jackhenry.com/jxchange/TPG/2008}NSFStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostDt" type="{http://jackhenry.com/jxchange/TPG/2008}PostDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgNum" type="{http://jackhenry.com/jxchange/TPG/2008}ImgNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NSFFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFChgWav" type="{http://jackhenry.com/jxchange/TPG/2008}NSFChgWav_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgWavOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFFeeAdjAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NSFFeeAdjAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFPdUnCol" type="{http://jackhenry.com/jxchange/TPG/2008}NSFPdUnCol_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFChgWavRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}NSFChgWavRsnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BatchNum" type="{http://jackhenry.com/jxchange/TPG/2008}BatchNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="SeqNum" type="{http://jackhenry.com/jxchange/TPG/2008}SeqNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcDispDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcDispDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRetRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRetRsnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcActnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcActnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}AuditUsrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcAuditWsId" type="{http://jackhenry.com/jxchange/TPG/2008}AuditWsId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChngTime" type="{http://jackhenry.com/jxchange/TPG/2008}ChngTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFAutoWorkExcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}NSFAutoWorkExcDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFODType" type="{http://jackhenry.com/jxchange/TPG/2008}NSFODType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActIntentKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type" minOccurs="0"/&gt;
 *         &lt;element name="EftDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}EftDesc_AType" minOccurs="0"/&gt;
 *         &lt;element name="x_ACHHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_ACHHistSrchRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="x_EFTCardHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_EFTCardHistSrchRec_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="TrnAuthBalType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnAuthBalType_Type" minOccurs="0"/&gt;
 *               &lt;element name="TrnAuthBalDetRec" type="{http://jackhenry.com/jxchange/TPG/2008}TrnAuthBalDetRec_CType" minOccurs="0"/&gt;
 *               &lt;element name="TrnAuthExcRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRsnCode_Type" minOccurs="0"/&gt;
 *               &lt;element name="TrnAuthExcRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRsnDesc_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AcctNSFTrnRecInfo_CType", propOrder = {
    "nsfItemTrnRec",
    "nsfItemId",
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
    "chgWavOffDesc",
    "nsfFeeAdjAmt",
    "nsfPdUnCol",
    "nsfChgWavRsnDesc",
    "batchNum",
    "seqNum",
    "excDispDesc",
    "excRetRsnDesc",
    "excActnDesc",
    "excUsrId",
    "excAuditWsId",
    "chngTime",
    "nsfAutoWorkExcDesc",
    "nsfodType",
    "actIntentKey",
    "eftDescArray",
    "xachHistSrchRec",
    "custom",
    "ver1",
    "effDt",
    "ver2",
    "xeftCardHistSrchRec",
    "ver3",
    "trnAuthBalType",
    "trnAuthBalDetRec",
    "trnAuthExcRsnCode",
    "trnAuthExcRsnDesc",
    "ver4",
    "any"
})
public class AcctNSFTrnRecInfoCType {

    @XmlElement(name = "NSFItemTrnRec")
    protected NSFItemTrnRecCType nsfItemTrnRec;
    @XmlElement(name = "NSFItemId")
    protected NSFItemIdType nsfItemId;
    @XmlElement(name = "NSFStat")
    protected NSFStatType nsfStat;
    @XmlElement(name = "TrnCodeCode")
    protected TrnCodeCodeType trnCodeCode;
    @XmlElement(name = "TrnCodeDesc")
    protected TrnCodeDescType trnCodeDesc;
    @XmlElement(name = "PostDt")
    protected PostDtType postDt;
    @XmlElement(name = "Amt")
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
    @XmlElement(name = "ChgWavOffDesc")
    protected OffDescType chgWavOffDesc;
    @XmlElement(name = "NSFFeeAdjAmt")
    protected NSFFeeAdjAmtType nsfFeeAdjAmt;
    @XmlElement(name = "NSFPdUnCol")
    protected NSFPdUnColType nsfPdUnCol;
    @XmlElement(name = "NSFChgWavRsnDesc")
    protected NSFChgWavRsnDescType nsfChgWavRsnDesc;
    @XmlElement(name = "BatchNum")
    protected BatchNumType batchNum;
    @XmlElement(name = "SeqNum")
    protected SeqNumType seqNum;
    @XmlElement(name = "ExcDispDesc")
    protected ExcDispDescType excDispDesc;
    @XmlElement(name = "ExcRetRsnDesc")
    protected ExcRetRsnDescType excRetRsnDesc;
    @XmlElement(name = "ExcActnDesc")
    protected ExcActnDescType excActnDesc;
    @XmlElement(name = "ExcUsrId")
    protected AuditUsrIdType excUsrId;
    @XmlElement(name = "ExcAuditWsId")
    protected AuditWsIdType excAuditWsId;
    @XmlElement(name = "ChngTime")
    protected ChngTimeType chngTime;
    @XmlElement(name = "NSFAutoWorkExcDesc")
    protected NSFAutoWorkExcDescType nsfAutoWorkExcDesc;
    @XmlElement(name = "NSFODType")
    protected NSFODTypeType nsfodType;
    @XmlElement(name = "ActIntentKey")
    protected ActIntentKeyType actIntentKey;
    @XmlElement(name = "EftDescArray")
    protected EftDescAType eftDescArray;
    @XmlElement(name = "x_ACHHistSrchRec")
    protected XACHHistSrchRecCType xachHistSrchRec;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EffDt")
    protected EffDtType effDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "x_EFTCardHistSrchRec")
    protected XEFTCardHistSrchRecCType xeftCardHistSrchRec;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "TrnAuthBalType")
    protected TrnAuthBalTypeType trnAuthBalType;
    @XmlElement(name = "TrnAuthBalDetRec")
    protected TrnAuthBalDetRecCType trnAuthBalDetRec;
    @XmlElement(name = "TrnAuthExcRsnCode")
    protected ExcRsnCodeType trnAuthExcRsnCode;
    @XmlElement(name = "TrnAuthExcRsnDesc")
    protected ExcRsnDescType trnAuthExcRsnDesc;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the nsfItemTrnRec property.
     * 
     * @return
     *     possible object is
     *     {@link NSFItemTrnRecCType }
     *     
     */
    public NSFItemTrnRecCType getNSFItemTrnRec() {
        return nsfItemTrnRec;
    }

    /**
     * Sets the value of the nsfItemTrnRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFItemTrnRecCType }
     *     
     */
    public void setNSFItemTrnRec(NSFItemTrnRecCType value) {
        this.nsfItemTrnRec = value;
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
     * Gets the value of the chgWavOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getChgWavOffDesc() {
        return chgWavOffDesc;
    }

    /**
     * Sets the value of the chgWavOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setChgWavOffDesc(OffDescType value) {
        this.chgWavOffDesc = value;
    }

    /**
     * Gets the value of the nsfFeeAdjAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NSFFeeAdjAmtType }
     *     
     */
    public NSFFeeAdjAmtType getNSFFeeAdjAmt() {
        return nsfFeeAdjAmt;
    }

    /**
     * Sets the value of the nsfFeeAdjAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFFeeAdjAmtType }
     *     
     */
    public void setNSFFeeAdjAmt(NSFFeeAdjAmtType value) {
        this.nsfFeeAdjAmt = value;
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
     * Gets the value of the nsfChgWavRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link NSFChgWavRsnDescType }
     *     
     */
    public NSFChgWavRsnDescType getNSFChgWavRsnDesc() {
        return nsfChgWavRsnDesc;
    }

    /**
     * Sets the value of the nsfChgWavRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFChgWavRsnDescType }
     *     
     */
    public void setNSFChgWavRsnDesc(NSFChgWavRsnDescType value) {
        this.nsfChgWavRsnDesc = value;
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
     * Gets the value of the excRetRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ExcRetRsnDescType }
     *     
     */
    public ExcRetRsnDescType getExcRetRsnDesc() {
        return excRetRsnDesc;
    }

    /**
     * Sets the value of the excRetRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcRetRsnDescType }
     *     
     */
    public void setExcRetRsnDesc(ExcRetRsnDescType value) {
        this.excRetRsnDesc = value;
    }

    /**
     * Gets the value of the excActnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ExcActnDescType }
     *     
     */
    public ExcActnDescType getExcActnDesc() {
        return excActnDesc;
    }

    /**
     * Sets the value of the excActnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcActnDescType }
     *     
     */
    public void setExcActnDesc(ExcActnDescType value) {
        this.excActnDesc = value;
    }

    /**
     * Gets the value of the excUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link AuditUsrIdType }
     *     
     */
    public AuditUsrIdType getExcUsrId() {
        return excUsrId;
    }

    /**
     * Sets the value of the excUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditUsrIdType }
     *     
     */
    public void setExcUsrId(AuditUsrIdType value) {
        this.excUsrId = value;
    }

    /**
     * Gets the value of the excAuditWsId property.
     * 
     * @return
     *     possible object is
     *     {@link AuditWsIdType }
     *     
     */
    public AuditWsIdType getExcAuditWsId() {
        return excAuditWsId;
    }

    /**
     * Sets the value of the excAuditWsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditWsIdType }
     *     
     */
    public void setExcAuditWsId(AuditWsIdType value) {
        this.excAuditWsId = value;
    }

    /**
     * Gets the value of the chngTime property.
     * 
     * @return
     *     possible object is
     *     {@link ChngTimeType }
     *     
     */
    public ChngTimeType getChngTime() {
        return chngTime;
    }

    /**
     * Sets the value of the chngTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChngTimeType }
     *     
     */
    public void setChngTime(ChngTimeType value) {
        this.chngTime = value;
    }

    /**
     * Gets the value of the nsfAutoWorkExcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link NSFAutoWorkExcDescType }
     *     
     */
    public NSFAutoWorkExcDescType getNSFAutoWorkExcDesc() {
        return nsfAutoWorkExcDesc;
    }

    /**
     * Sets the value of the nsfAutoWorkExcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFAutoWorkExcDescType }
     *     
     */
    public void setNSFAutoWorkExcDesc(NSFAutoWorkExcDescType value) {
        this.nsfAutoWorkExcDesc = value;
    }

    /**
     * Gets the value of the nsfodType property.
     * 
     * @return
     *     possible object is
     *     {@link NSFODTypeType }
     *     
     */
    public NSFODTypeType getNSFODType() {
        return nsfodType;
    }

    /**
     * Sets the value of the nsfodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFODTypeType }
     *     
     */
    public void setNSFODType(NSFODTypeType value) {
        this.nsfodType = value;
    }

    /**
     * Gets the value of the actIntentKey property.
     * 
     * @return
     *     possible object is
     *     {@link ActIntentKeyType }
     *     
     */
    public ActIntentKeyType getActIntentKey() {
        return actIntentKey;
    }

    /**
     * Sets the value of the actIntentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActIntentKeyType }
     *     
     */
    public void setActIntentKey(ActIntentKeyType value) {
        this.actIntentKey = value;
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
     * Gets the value of the trnAuthBalDetRec property.
     * 
     * @return
     *     possible object is
     *     {@link TrnAuthBalDetRecCType }
     *     
     */
    public TrnAuthBalDetRecCType getTrnAuthBalDetRec() {
        return trnAuthBalDetRec;
    }

    /**
     * Sets the value of the trnAuthBalDetRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnAuthBalDetRecCType }
     *     
     */
    public void setTrnAuthBalDetRec(TrnAuthBalDetRecCType value) {
        this.trnAuthBalDetRec = value;
    }

    /**
     * Gets the value of the trnAuthExcRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExcRsnCodeType }
     *     
     */
    public ExcRsnCodeType getTrnAuthExcRsnCode() {
        return trnAuthExcRsnCode;
    }

    /**
     * Sets the value of the trnAuthExcRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcRsnCodeType }
     *     
     */
    public void setTrnAuthExcRsnCode(ExcRsnCodeType value) {
        this.trnAuthExcRsnCode = value;
    }

    /**
     * Gets the value of the trnAuthExcRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ExcRsnDescType }
     *     
     */
    public ExcRsnDescType getTrnAuthExcRsnDesc() {
        return trnAuthExcRsnDesc;
    }

    /**
     * Sets the value of the trnAuthExcRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcRsnDescType }
     *     
     */
    public void setTrnAuthExcRsnDesc(ExcRsnDescType value) {
        this.trnAuthExcRsnDesc = value;
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
