
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
 * <p>Java class for SafeDepHistSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafeDepHistSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SafeDepAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
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
 *         &lt;element name="MemoPost" type="{http://jackhenry.com/jxchange/TPG/2008}MemoPost_CType" minOccurs="0"/&gt;
 *         &lt;element name="TellerNum" type="{http://jackhenry.com/jxchange/TPG/2008}TellerNum_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PmtDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDueDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="TrnUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnUsrId_Type" minOccurs="0"/&gt;
 *             &lt;element name="TrnWsId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnWsId_Type" minOccurs="0"/&gt;
 *             &lt;element name="AffCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AffCodeDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="x_StmtDataHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_StmtDataHistSrchRec_CType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="HistRecId" type="{http://jackhenry.com/jxchange/TPG/2008}HistRecId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "SafeDepHistSrchRec_CType", propOrder = {
    "safeDepAcctId",
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
    "memoPost",
    "tellerNum",
    "ver1",
    "pmtDueDt",
    "ver2",
    "trnUsrId",
    "trnWsId",
    "affCodeDesc",
    "ver3",
    "xStmtDataHistSrchRec",
    "ver4",
    "histRecId",
    "ver5",
    "any"
})
public class SafeDepHistSrchRecCType {

    @XmlElement(name = "SafeDepAcctId")
    protected AccountIdCType safeDepAcctId;
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
    @XmlElement(name = "MemoPost")
    protected MemoPostCType memoPost;
    @XmlElement(name = "TellerNum")
    protected TellerNumType tellerNum;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PmtDueDt")
    protected PmtDueDtType pmtDueDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "TrnUsrId")
    protected TrnUsrIdType trnUsrId;
    @XmlElement(name = "TrnWsId")
    protected TrnWsIdType trnWsId;
    @XmlElement(name = "AffCodeDesc")
    protected AffCodeDescType affCodeDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "x_StmtDataHistSrchRec")
    protected XStmtDataHistSrchRecCType xStmtDataHistSrchRec;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "HistRecId")
    protected HistRecIdType histRecId;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the safeDepAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getSafeDepAcctId() {
        return safeDepAcctId;
    }

    /**
     * Sets the value of the safeDepAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setSafeDepAcctId(AccountIdCType value) {
        this.safeDepAcctId = value;
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
     * Gets the value of the pmtDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtDueDtType }
     *     
     */
    public PmtDueDtType getPmtDueDt() {
        return pmtDueDt;
    }

    /**
     * Sets the value of the pmtDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtDueDtType }
     *     
     */
    public void setPmtDueDt(PmtDueDtType value) {
        this.pmtDueDt = value;
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
