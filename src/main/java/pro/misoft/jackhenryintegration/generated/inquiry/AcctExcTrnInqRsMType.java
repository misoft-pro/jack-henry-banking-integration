
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
 * <p>Java class for AcctExcTrnInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctExcTrnInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="InAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="ExcItemId" type="{http://jackhenry.com/jxchange/TPG/2008}ExcItemId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcTrnRec" type="{http://jackhenry.com/jxchange/TPG/2008}ExcTrnRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="SeqNum" type="{http://jackhenry.com/jxchange/TPG/2008}SeqNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="BatchNum" type="{http://jackhenry.com/jxchange/TPG/2008}BatchNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRetSrcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRetSrcDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}AuditUsrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcAuditWsId" type="{http://jackhenry.com/jxchange/TPG/2008}AuditWsId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostDt" type="{http://jackhenry.com/jxchange/TPG/2008}PostDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChngTime" type="{http://jackhenry.com/jxchange/TPG/2008}ChngTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="UpdTrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcDispDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcDispDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRetRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRetRsnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcActnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcActnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcResolveType" type="{http://jackhenry.com/jxchange/TPG/2008}ExcResolveType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRsnRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRsnRecArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="x_ACHHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_ACHHistSrchRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="ActIntent" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntent_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActIntentKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="TrnAuthBalType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnAuthBalType_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="GLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *             &lt;element name="GLProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="TrnDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *             &lt;element name="RefDescCode" type="{http://jackhenry.com/jxchange/TPG/2008}RefDescCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="LnUnitId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AcctExcTrnInqRs_MType", propOrder = {
    "msgRsHdr",
    "inAcctId",
    "excItemId",
    "excTrnRec",
    "seqNum",
    "batchNum",
    "chkNum",
    "amt",
    "excRetSrcDesc",
    "excUsrId",
    "excAuditWsId",
    "trnCodeCode",
    "trnCodeDesc",
    "postDt",
    "chngTime",
    "updTrnCodeDesc",
    "excDispDesc",
    "excRetRsnDesc",
    "excActnDesc",
    "excResolveType",
    "excRsnRecArray",
    "xachHistSrchRec",
    "actIntent",
    "actIntentKey",
    "custom",
    "ver1",
    "trnAuthBalType",
    "ver2",
    "brCode",
    "glCostCtr",
    "glProdCode",
    "trnDescArray",
    "refDescCode",
    "lnUnitId",
    "ver3",
    "any"
})
public class AcctExcTrnInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "InAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> inAcctId;
    @XmlElementRef(name = "ExcItemId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExcItemIdType> excItemId;
    @XmlElementRef(name = "ExcTrnRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExcTrnRecCType> excTrnRec;
    @XmlElementRef(name = "SeqNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SeqNumType> seqNum;
    @XmlElementRef(name = "BatchNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BatchNumType> batchNum;
    @XmlElementRef(name = "ChkNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChkNumType> chkNum;
    @XmlElementRef(name = "Amt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AmtType> amt;
    @XmlElementRef(name = "ExcRetSrcDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExcRetSrcDescType> excRetSrcDesc;
    @XmlElementRef(name = "ExcUsrId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AuditUsrIdType> excUsrId;
    @XmlElementRef(name = "ExcAuditWsId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AuditWsIdType> excAuditWsId;
    @XmlElementRef(name = "TrnCodeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnCodeCodeType> trnCodeCode;
    @XmlElementRef(name = "TrnCodeDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnCodeDescType> trnCodeDesc;
    @XmlElementRef(name = "PostDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostDtType> postDt;
    @XmlElementRef(name = "ChngTime", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChngTimeType> chngTime;
    @XmlElementRef(name = "UpdTrnCodeDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnCodeDescType> updTrnCodeDesc;
    @XmlElementRef(name = "ExcDispDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExcDispDescType> excDispDesc;
    @XmlElementRef(name = "ExcRetRsnDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExcRetRsnDescType> excRetRsnDesc;
    @XmlElementRef(name = "ExcActnDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExcActnDescType> excActnDesc;
    @XmlElementRef(name = "ExcResolveType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExcResolveTypeType> excResolveType;
    @XmlElementRef(name = "ExcRsnRecArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExcRsnRecArrayAType> excRsnRecArray;
    @XmlElementRef(name = "x_ACHHistSrchRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XACHHistSrchRecCType> xachHistSrchRec;
    @XmlElementRef(name = "ActIntent", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentType> actIntent;
    @XmlElementRef(name = "ActIntentKey", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentKeyType> actIntentKey;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "TrnAuthBalType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnAuthBalTypeType> trnAuthBalType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "BrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> brCode;
    @XmlElementRef(name = "GLCostCtr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GLCostCtrType> glCostCtr;
    @XmlElementRef(name = "GLProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GLProdCodeType> glProdCode;
    @XmlElementRef(name = "TrnDescArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RmkAType> trnDescArray;
    @XmlElementRef(name = "RefDescCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RefDescCodeType> refDescCode;
    @XmlElementRef(name = "LnUnitId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnUnitIdType> lnUnitId;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
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
     * Gets the value of the inAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getInAcctId() {
        return inAcctId;
    }

    /**
     * Sets the value of the inAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setInAcctId(JAXBElement<AccountIdCType> value) {
        this.inAcctId = value;
    }

    /**
     * Gets the value of the excItemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExcItemIdType }{@code >}
     *     
     */
    public JAXBElement<ExcItemIdType> getExcItemId() {
        return excItemId;
    }

    /**
     * Sets the value of the excItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExcItemIdType }{@code >}
     *     
     */
    public void setExcItemId(JAXBElement<ExcItemIdType> value) {
        this.excItemId = value;
    }

    /**
     * Gets the value of the excTrnRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExcTrnRecCType }{@code >}
     *     
     */
    public JAXBElement<ExcTrnRecCType> getExcTrnRec() {
        return excTrnRec;
    }

    /**
     * Sets the value of the excTrnRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExcTrnRecCType }{@code >}
     *     
     */
    public void setExcTrnRec(JAXBElement<ExcTrnRecCType> value) {
        this.excTrnRec = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SeqNumType }{@code >}
     *     
     */
    public JAXBElement<SeqNumType> getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SeqNumType }{@code >}
     *     
     */
    public void setSeqNum(JAXBElement<SeqNumType> value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the batchNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}
     *     
     */
    public JAXBElement<BatchNumType> getBatchNum() {
        return batchNum;
    }

    /**
     * Sets the value of the batchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}
     *     
     */
    public void setBatchNum(JAXBElement<BatchNumType> value) {
        this.batchNum = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChkNumType }{@code >}
     *     
     */
    public JAXBElement<ChkNumType> getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChkNumType }{@code >}
     *     
     */
    public void setChkNum(JAXBElement<ChkNumType> value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmtType }{@code >}
     *     
     */
    public JAXBElement<AmtType> getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmtType }{@code >}
     *     
     */
    public void setAmt(JAXBElement<AmtType> value) {
        this.amt = value;
    }

    /**
     * Gets the value of the excRetSrcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExcRetSrcDescType }{@code >}
     *     
     */
    public JAXBElement<ExcRetSrcDescType> getExcRetSrcDesc() {
        return excRetSrcDesc;
    }

    /**
     * Sets the value of the excRetSrcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExcRetSrcDescType }{@code >}
     *     
     */
    public void setExcRetSrcDesc(JAXBElement<ExcRetSrcDescType> value) {
        this.excRetSrcDesc = value;
    }

    /**
     * Gets the value of the excUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuditUsrIdType }{@code >}
     *     
     */
    public JAXBElement<AuditUsrIdType> getExcUsrId() {
        return excUsrId;
    }

    /**
     * Sets the value of the excUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuditUsrIdType }{@code >}
     *     
     */
    public void setExcUsrId(JAXBElement<AuditUsrIdType> value) {
        this.excUsrId = value;
    }

    /**
     * Gets the value of the excAuditWsId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuditWsIdType }{@code >}
     *     
     */
    public JAXBElement<AuditWsIdType> getExcAuditWsId() {
        return excAuditWsId;
    }

    /**
     * Sets the value of the excAuditWsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuditWsIdType }{@code >}
     *     
     */
    public void setExcAuditWsId(JAXBElement<AuditWsIdType> value) {
        this.excAuditWsId = value;
    }

    /**
     * Gets the value of the trnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnCodeCodeType }{@code >}
     *     
     */
    public JAXBElement<TrnCodeCodeType> getTrnCodeCode() {
        return trnCodeCode;
    }

    /**
     * Sets the value of the trnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnCodeCodeType }{@code >}
     *     
     */
    public void setTrnCodeCode(JAXBElement<TrnCodeCodeType> value) {
        this.trnCodeCode = value;
    }

    /**
     * Gets the value of the trnCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnCodeDescType }{@code >}
     *     
     */
    public JAXBElement<TrnCodeDescType> getTrnCodeDesc() {
        return trnCodeDesc;
    }

    /**
     * Sets the value of the trnCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnCodeDescType }{@code >}
     *     
     */
    public void setTrnCodeDesc(JAXBElement<TrnCodeDescType> value) {
        this.trnCodeDesc = value;
    }

    /**
     * Gets the value of the postDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostDtType }{@code >}
     *     
     */
    public JAXBElement<PostDtType> getPostDt() {
        return postDt;
    }

    /**
     * Sets the value of the postDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostDtType }{@code >}
     *     
     */
    public void setPostDt(JAXBElement<PostDtType> value) {
        this.postDt = value;
    }

    /**
     * Gets the value of the chngTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChngTimeType }{@code >}
     *     
     */
    public JAXBElement<ChngTimeType> getChngTime() {
        return chngTime;
    }

    /**
     * Sets the value of the chngTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChngTimeType }{@code >}
     *     
     */
    public void setChngTime(JAXBElement<ChngTimeType> value) {
        this.chngTime = value;
    }

    /**
     * Gets the value of the updTrnCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnCodeDescType }{@code >}
     *     
     */
    public JAXBElement<TrnCodeDescType> getUpdTrnCodeDesc() {
        return updTrnCodeDesc;
    }

    /**
     * Sets the value of the updTrnCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnCodeDescType }{@code >}
     *     
     */
    public void setUpdTrnCodeDesc(JAXBElement<TrnCodeDescType> value) {
        this.updTrnCodeDesc = value;
    }

    /**
     * Gets the value of the excDispDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExcDispDescType }{@code >}
     *     
     */
    public JAXBElement<ExcDispDescType> getExcDispDesc() {
        return excDispDesc;
    }

    /**
     * Sets the value of the excDispDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExcDispDescType }{@code >}
     *     
     */
    public void setExcDispDesc(JAXBElement<ExcDispDescType> value) {
        this.excDispDesc = value;
    }

    /**
     * Gets the value of the excRetRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExcRetRsnDescType }{@code >}
     *     
     */
    public JAXBElement<ExcRetRsnDescType> getExcRetRsnDesc() {
        return excRetRsnDesc;
    }

    /**
     * Sets the value of the excRetRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExcRetRsnDescType }{@code >}
     *     
     */
    public void setExcRetRsnDesc(JAXBElement<ExcRetRsnDescType> value) {
        this.excRetRsnDesc = value;
    }

    /**
     * Gets the value of the excActnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExcActnDescType }{@code >}
     *     
     */
    public JAXBElement<ExcActnDescType> getExcActnDesc() {
        return excActnDesc;
    }

    /**
     * Sets the value of the excActnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExcActnDescType }{@code >}
     *     
     */
    public void setExcActnDesc(JAXBElement<ExcActnDescType> value) {
        this.excActnDesc = value;
    }

    /**
     * Gets the value of the excResolveType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExcResolveTypeType }{@code >}
     *     
     */
    public JAXBElement<ExcResolveTypeType> getExcResolveType() {
        return excResolveType;
    }

    /**
     * Sets the value of the excResolveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExcResolveTypeType }{@code >}
     *     
     */
    public void setExcResolveType(JAXBElement<ExcResolveTypeType> value) {
        this.excResolveType = value;
    }

    /**
     * Gets the value of the excRsnRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExcRsnRecArrayAType }{@code >}
     *     
     */
    public JAXBElement<ExcRsnRecArrayAType> getExcRsnRecArray() {
        return excRsnRecArray;
    }

    /**
     * Sets the value of the excRsnRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExcRsnRecArrayAType }{@code >}
     *     
     */
    public void setExcRsnRecArray(JAXBElement<ExcRsnRecArrayAType> value) {
        this.excRsnRecArray = value;
    }

    /**
     * Gets the value of the xachHistSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XACHHistSrchRecCType }{@code >}
     *     
     */
    public JAXBElement<XACHHistSrchRecCType> getXACHHistSrchRec() {
        return xachHistSrchRec;
    }

    /**
     * Sets the value of the xachHistSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XACHHistSrchRecCType }{@code >}
     *     
     */
    public void setXACHHistSrchRec(JAXBElement<XACHHistSrchRecCType> value) {
        this.xachHistSrchRec = value;
    }

    /**
     * Gets the value of the actIntent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public JAXBElement<ActIntentType> getActIntent() {
        return actIntent;
    }

    /**
     * Sets the value of the actIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public void setActIntent(JAXBElement<ActIntentType> value) {
        this.actIntent = value;
    }

    /**
     * Gets the value of the actIntentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public JAXBElement<ActIntentKeyType> getActIntentKey() {
        return actIntentKey;
    }

    /**
     * Sets the value of the actIntentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public void setActIntentKey(JAXBElement<ActIntentKeyType> value) {
        this.actIntentKey = value;
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
     * Gets the value of the trnAuthBalType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnAuthBalTypeType }{@code >}
     *     
     */
    public JAXBElement<TrnAuthBalTypeType> getTrnAuthBalType() {
        return trnAuthBalType;
    }

    /**
     * Sets the value of the trnAuthBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnAuthBalTypeType }{@code >}
     *     
     */
    public void setTrnAuthBalType(JAXBElement<TrnAuthBalTypeType> value) {
        this.trnAuthBalType = value;
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
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public JAXBElement<BrCodeType> getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public void setBrCode(JAXBElement<BrCodeType> value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the glCostCtr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GLCostCtrType }{@code >}
     *     
     */
    public JAXBElement<GLCostCtrType> getGLCostCtr() {
        return glCostCtr;
    }

    /**
     * Sets the value of the glCostCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GLCostCtrType }{@code >}
     *     
     */
    public void setGLCostCtr(JAXBElement<GLCostCtrType> value) {
        this.glCostCtr = value;
    }

    /**
     * Gets the value of the glProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GLProdCodeType }{@code >}
     *     
     */
    public JAXBElement<GLProdCodeType> getGLProdCode() {
        return glProdCode;
    }

    /**
     * Sets the value of the glProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GLProdCodeType }{@code >}
     *     
     */
    public void setGLProdCode(JAXBElement<GLProdCodeType> value) {
        this.glProdCode = value;
    }

    /**
     * Gets the value of the trnDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RmkAType }{@code >}
     *     
     */
    public JAXBElement<RmkAType> getTrnDescArray() {
        return trnDescArray;
    }

    /**
     * Sets the value of the trnDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RmkAType }{@code >}
     *     
     */
    public void setTrnDescArray(JAXBElement<RmkAType> value) {
        this.trnDescArray = value;
    }

    /**
     * Gets the value of the refDescCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RefDescCodeType }{@code >}
     *     
     */
    public JAXBElement<RefDescCodeType> getRefDescCode() {
        return refDescCode;
    }

    /**
     * Sets the value of the refDescCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RefDescCodeType }{@code >}
     *     
     */
    public void setRefDescCode(JAXBElement<RefDescCodeType> value) {
        this.refDescCode = value;
    }

    /**
     * Gets the value of the lnUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnUnitIdType }{@code >}
     *     
     */
    public JAXBElement<LnUnitIdType> getLnUnitId() {
        return lnUnitId;
    }

    /**
     * Sets the value of the lnUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnUnitIdType }{@code >}
     *     
     */
    public void setLnUnitId(JAXBElement<LnUnitIdType> value) {
        this.lnUnitId = value;
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
