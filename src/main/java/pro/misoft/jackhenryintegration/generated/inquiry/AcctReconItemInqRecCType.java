
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
 * <p>Java class for AcctReconItemInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctReconItemInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctReconItemRec" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReconItemRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="TrnAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StaleDt" type="{http://jackhenry.com/jxchange/TPG/2008}StaleDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostDt" type="{http://jackhenry.com/jxchange/TPG/2008}PostDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DormantDt" type="{http://jackhenry.com/jxchange/TPG/2008}DormantDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopChkPlaceDt" type="{http://jackhenry.com/jxchange/TPG/2008}StopChkPlaceDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopChkExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctReconViolType" type="{http://jackhenry.com/jxchange/TPG/2008}PosPayViolType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcResolveType" type="{http://jackhenry.com/jxchange/TPG/2008}ExcResolveType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ItemRetDt" type="{http://jackhenry.com/jxchange/TPG/2008}ItemRetDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AcctReconItemInqRec_CType", propOrder = {
    "acctReconItemRec",
    "trnAmt",
    "effDt",
    "staleDt",
    "postDt",
    "dormantDt",
    "trnCodeCode",
    "trnCodeDesc",
    "stopChkPlaceDt",
    "stopChkExpDt",
    "acctReconViolType",
    "excResolveType",
    "custom",
    "ver1",
    "itemRetDt",
    "ver2",
    "any"
})
public class AcctReconItemInqRecCType {

    @XmlElement(name = "AcctReconItemRec")
    protected AcctReconItemRecCType acctReconItemRec;
    @XmlElement(name = "TrnAmt")
    protected TrnAmtType trnAmt;
    @XmlElement(name = "EffDt")
    protected EffDtType effDt;
    @XmlElement(name = "StaleDt")
    protected StaleDtType staleDt;
    @XmlElement(name = "PostDt")
    protected PostDtType postDt;
    @XmlElement(name = "DormantDt")
    protected DormantDtType dormantDt;
    @XmlElement(name = "TrnCodeCode")
    protected TrnCodeCodeType trnCodeCode;
    @XmlElement(name = "TrnCodeDesc")
    protected TrnCodeDescType trnCodeDesc;
    @XmlElement(name = "StopChkPlaceDt")
    protected StopChkPlaceDtType stopChkPlaceDt;
    @XmlElement(name = "StopChkExpDt")
    protected ExpDtType stopChkExpDt;
    @XmlElement(name = "AcctReconViolType")
    protected PosPayViolTypeType acctReconViolType;
    @XmlElement(name = "ExcResolveType")
    protected ExcResolveTypeType excResolveType;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ItemRetDt")
    protected ItemRetDtType itemRetDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctReconItemRec property.
     * 
     * @return
     *     possible object is
     *     {@link AcctReconItemRecCType }
     *     
     */
    public AcctReconItemRecCType getAcctReconItemRec() {
        return acctReconItemRec;
    }

    /**
     * Sets the value of the acctReconItemRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctReconItemRecCType }
     *     
     */
    public void setAcctReconItemRec(AcctReconItemRecCType value) {
        this.acctReconItemRec = value;
    }

    /**
     * Gets the value of the trnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnAmtType }
     *     
     */
    public TrnAmtType getTrnAmt() {
        return trnAmt;
    }

    /**
     * Sets the value of the trnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnAmtType }
     *     
     */
    public void setTrnAmt(TrnAmtType value) {
        this.trnAmt = value;
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
