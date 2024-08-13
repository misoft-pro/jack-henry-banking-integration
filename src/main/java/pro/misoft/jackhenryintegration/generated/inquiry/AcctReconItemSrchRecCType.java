
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
 * <p>Java class for AcctReconItemSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctReconItemSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BatchNum" type="{http://jackhenry.com/jxchange/TPG/2008}BatchNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="SeqNum" type="{http://jackhenry.com/jxchange/TPG/2008}SeqNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="IssAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostDt" type="{http://jackhenry.com/jxchange/TPG/2008}PostDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="ChkDt" type="{http://jackhenry.com/jxchange/TPG/2008}ChkDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkVoidDt" type="{http://jackhenry.com/jxchange/TPG/2008}ChkVoidDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctReconTrnItemArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReconTrnItemArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EftDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}EftDesc_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="IssItemCrtDt" type="{http://jackhenry.com/jxchange/TPG/2008}IssItemCrtDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="StaleDt" type="{http://jackhenry.com/jxchange/TPG/2008}StaleDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="DormantDt" type="{http://jackhenry.com/jxchange/TPG/2008}DormantDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="StopChkPlaceDt" type="{http://jackhenry.com/jxchange/TPG/2008}StopChkPlaceDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="StopChkExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="AcctReconViolType" type="{http://jackhenry.com/jxchange/TPG/2008}PosPayViolType_Type" minOccurs="0"/&gt;
 *             &lt;element name="ExcResolveType" type="{http://jackhenry.com/jxchange/TPG/2008}ExcResolveType_Type" minOccurs="0"/&gt;
 *             &lt;element name="ItemRetDt" type="{http://jackhenry.com/jxchange/TPG/2008}ItemRetDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="ActIntentKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AcctReconItemSrchRec_CType", propOrder = {
    "batchNum",
    "seqNum",
    "chkNum",
    "issAmt",
    "trnAmt",
    "trnCodeCode",
    "trnCodeDesc",
    "postDt",
    "trnType",
    "payeeName",
    "payeeAddr",
    "chkDt",
    "chkVoidDt",
    "acctReconTrnItemArray",
    "eftDescArray",
    "custom",
    "ver1",
    "issItemCrtDt",
    "ver2",
    "staleDt",
    "dormantDt",
    "stopChkPlaceDt",
    "stopChkExpDt",
    "acctReconViolType",
    "excResolveType",
    "itemRetDt",
    "actIntentKey",
    "ver3",
    "any"
})
public class AcctReconItemSrchRecCType {

    @XmlElement(name = "BatchNum")
    protected BatchNumType batchNum;
    @XmlElement(name = "SeqNum")
    protected SeqNumType seqNum;
    @XmlElement(name = "ChkNum")
    protected ChkNumType chkNum;
    @XmlElement(name = "IssAmt")
    protected AmtType issAmt;
    @XmlElement(name = "TrnAmt")
    protected AmtType trnAmt;
    @XmlElement(name = "TrnCodeCode")
    protected TrnCodeCodeType trnCodeCode;
    @XmlElement(name = "TrnCodeDesc")
    protected TrnCodeDescType trnCodeDesc;
    @XmlElement(name = "PostDt")
    protected PostDtType postDt;
    @XmlElement(name = "TrnType")
    protected TrnTypeType trnType;
    @XmlElement(name = "PayeeName")
    protected PayeeNameType payeeName;
    @XmlElement(name = "PayeeAddr")
    protected AddrCType payeeAddr;
    @XmlElement(name = "ChkDt")
    protected ChkDtType chkDt;
    @XmlElement(name = "ChkVoidDt")
    protected ChkVoidDtType chkVoidDt;
    @XmlElement(name = "AcctReconTrnItemArray")
    protected AcctReconTrnItemArrayAType acctReconTrnItemArray;
    @XmlElement(name = "EftDescArray")
    protected EftDescAType eftDescArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "IssItemCrtDt")
    protected IssItemCrtDtType issItemCrtDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "StaleDt")
    protected StaleDtType staleDt;
    @XmlElement(name = "DormantDt")
    protected DormantDtType dormantDt;
    @XmlElement(name = "StopChkPlaceDt")
    protected StopChkPlaceDtType stopChkPlaceDt;
    @XmlElement(name = "StopChkExpDt")
    protected ExpDtType stopChkExpDt;
    @XmlElement(name = "AcctReconViolType")
    protected PosPayViolTypeType acctReconViolType;
    @XmlElement(name = "ExcResolveType")
    protected ExcResolveTypeType excResolveType;
    @XmlElement(name = "ItemRetDt")
    protected ItemRetDtType itemRetDt;
    @XmlElement(name = "ActIntentKey")
    protected ActIntentKeyType actIntentKey;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the issAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getIssAmt() {
        return issAmt;
    }

    /**
     * Sets the value of the issAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setIssAmt(AmtType value) {
        this.issAmt = value;
    }

    /**
     * Gets the value of the trnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getTrnAmt() {
        return trnAmt;
    }

    /**
     * Sets the value of the trnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setTrnAmt(AmtType value) {
        this.trnAmt = value;
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
     * Gets the value of the payeeAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getPayeeAddr() {
        return payeeAddr;
    }

    /**
     * Sets the value of the payeeAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setPayeeAddr(AddrCType value) {
        this.payeeAddr = value;
    }

    /**
     * Gets the value of the chkDt property.
     * 
     * @return
     *     possible object is
     *     {@link ChkDtType }
     *     
     */
    public ChkDtType getChkDt() {
        return chkDt;
    }

    /**
     * Sets the value of the chkDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkDtType }
     *     
     */
    public void setChkDt(ChkDtType value) {
        this.chkDt = value;
    }

    /**
     * Gets the value of the chkVoidDt property.
     * 
     * @return
     *     possible object is
     *     {@link ChkVoidDtType }
     *     
     */
    public ChkVoidDtType getChkVoidDt() {
        return chkVoidDt;
    }

    /**
     * Sets the value of the chkVoidDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkVoidDtType }
     *     
     */
    public void setChkVoidDt(ChkVoidDtType value) {
        this.chkVoidDt = value;
    }

    /**
     * Gets the value of the acctReconTrnItemArray property.
     * 
     * @return
     *     possible object is
     *     {@link AcctReconTrnItemArrayAType }
     *     
     */
    public AcctReconTrnItemArrayAType getAcctReconTrnItemArray() {
        return acctReconTrnItemArray;
    }

    /**
     * Sets the value of the acctReconTrnItemArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctReconTrnItemArrayAType }
     *     
     */
    public void setAcctReconTrnItemArray(AcctReconTrnItemArrayAType value) {
        this.acctReconTrnItemArray = value;
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
     * Gets the value of the issItemCrtDt property.
     * 
     * @return
     *     possible object is
     *     {@link IssItemCrtDtType }
     *     
     */
    public IssItemCrtDtType getIssItemCrtDt() {
        return issItemCrtDt;
    }

    /**
     * Sets the value of the issItemCrtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssItemCrtDtType }
     *     
     */
    public void setIssItemCrtDt(IssItemCrtDtType value) {
        this.issItemCrtDt = value;
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
     * Gets the value of the staleDt property.
     * 
     * @return
     *     possible object is
     *     {@link StaleDtType }
     *     
     */
    public StaleDtType getStaleDt() {
        return staleDt;
    }

    /**
     * Sets the value of the staleDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaleDtType }
     *     
     */
    public void setStaleDt(StaleDtType value) {
        this.staleDt = value;
    }

    /**
     * Gets the value of the dormantDt property.
     * 
     * @return
     *     possible object is
     *     {@link DormantDtType }
     *     
     */
    public DormantDtType getDormantDt() {
        return dormantDt;
    }

    /**
     * Sets the value of the dormantDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DormantDtType }
     *     
     */
    public void setDormantDt(DormantDtType value) {
        this.dormantDt = value;
    }

    /**
     * Gets the value of the stopChkPlaceDt property.
     * 
     * @return
     *     possible object is
     *     {@link StopChkPlaceDtType }
     *     
     */
    public StopChkPlaceDtType getStopChkPlaceDt() {
        return stopChkPlaceDt;
    }

    /**
     * Sets the value of the stopChkPlaceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopChkPlaceDtType }
     *     
     */
    public void setStopChkPlaceDt(StopChkPlaceDtType value) {
        this.stopChkPlaceDt = value;
    }

    /**
     * Gets the value of the stopChkExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getStopChkExpDt() {
        return stopChkExpDt;
    }

    /**
     * Sets the value of the stopChkExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setStopChkExpDt(ExpDtType value) {
        this.stopChkExpDt = value;
    }

    /**
     * Gets the value of the acctReconViolType property.
     * 
     * @return
     *     possible object is
     *     {@link PosPayViolTypeType }
     *     
     */
    public PosPayViolTypeType getAcctReconViolType() {
        return acctReconViolType;
    }

    /**
     * Sets the value of the acctReconViolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosPayViolTypeType }
     *     
     */
    public void setAcctReconViolType(PosPayViolTypeType value) {
        this.acctReconViolType = value;
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
     * Gets the value of the itemRetDt property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRetDtType }
     *     
     */
    public ItemRetDtType getItemRetDt() {
        return itemRetDt;
    }

    /**
     * Sets the value of the itemRetDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRetDtType }
     *     
     */
    public void setItemRetDt(ItemRetDtType value) {
        this.itemRetDt = value;
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
