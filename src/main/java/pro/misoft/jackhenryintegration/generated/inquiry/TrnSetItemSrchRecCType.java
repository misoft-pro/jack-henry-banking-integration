
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
 * <p>Java class for TrnSetItemSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnSetItemSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImgNum" type="{http://jackhenry.com/jxchange/TPG/2008}ImgNum_Type"/&gt;
 *         &lt;element name="PostDt" type="{http://jackhenry.com/jxchange/TPG/2008}PostDt_Type"/&gt;
 *         &lt;element name="RunNum" type="{http://jackhenry.com/jxchange/TPG/2008}RunNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="BatchNum" type="{http://jackhenry.com/jxchange/TPG/2008}BatchNum_Type"/&gt;
 *         &lt;element name="SeqNum" type="{http://jackhenry.com/jxchange/TPG/2008}SeqNum_Type"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type"/&gt;
 *         &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ItemProcEndor" type="{http://jackhenry.com/jxchange/TPG/2008}ItemProcEndor_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="RtNum" type="{http://jackhenry.com/jxchange/TPG/2008}RtNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="PriorSysImgId" type="{http://jackhenry.com/jxchange/TPG/2008}PriorSysImgId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TrnSetItemSrchRec_CType", propOrder = {
    "imgNum",
    "postDt",
    "runNum",
    "batchNum",
    "seqNum",
    "accountId",
    "amt",
    "chkNum",
    "itemProcEndor",
    "trnCodeCode",
    "trnType",
    "rtNum",
    "priorSysImgId",
    "ver1",
    "any"
})
public class TrnSetItemSrchRecCType {

    @XmlElement(name = "ImgNum", required = true)
    protected ImgNumType imgNum;
    @XmlElement(name = "PostDt", required = true)
    protected PostDtType postDt;
    @XmlElement(name = "RunNum")
    protected RunNumType runNum;
    @XmlElement(name = "BatchNum", required = true)
    protected BatchNumType batchNum;
    @XmlElement(name = "SeqNum", required = true)
    protected SeqNumType seqNum;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "Amt", required = true)
    protected AmtType amt;
    @XmlElement(name = "ChkNum")
    protected ChkNumType chkNum;
    @XmlElement(name = "ItemProcEndor")
    protected ItemProcEndorType itemProcEndor;
    @XmlElement(name = "TrnCodeCode")
    protected TrnCodeCodeType trnCodeCode;
    @XmlElement(name = "TrnType")
    protected TrnTypeType trnType;
    @XmlElement(name = "RtNum")
    protected RtNumType rtNum;
    @XmlElement(name = "PriorSysImgId")
    protected PriorSysImgIdType priorSysImgId;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setAccountId(AccountIdCType value) {
        this.accountId = value;
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
     * Gets the value of the itemProcEndor property.
     * 
     * @return
     *     possible object is
     *     {@link ItemProcEndorType }
     *     
     */
    public ItemProcEndorType getItemProcEndor() {
        return itemProcEndor;
    }

    /**
     * Sets the value of the itemProcEndor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemProcEndorType }
     *     
     */
    public void setItemProcEndor(ItemProcEndorType value) {
        this.itemProcEndor = value;
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
     * Gets the value of the priorSysImgId property.
     * 
     * @return
     *     possible object is
     *     {@link PriorSysImgIdType }
     *     
     */
    public PriorSysImgIdType getPriorSysImgId() {
        return priorSysImgId;
    }

    /**
     * Sets the value of the priorSysImgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorSysImgIdType }
     *     
     */
    public void setPriorSysImgId(PriorSysImgIdType value) {
        this.priorSysImgId = value;
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
