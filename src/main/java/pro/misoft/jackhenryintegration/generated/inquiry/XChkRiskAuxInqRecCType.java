
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
 * <p>Java class for x_ChkRiskAuxInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_ChkRiskAuxInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClsDt" type="{http://jackhenry.com/jxchange/TPG/2008}ClsDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastStatTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastStatTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrtStatTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}CrtStatTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkRiskAbbCode" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskAbbCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkRiskAbbDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskAbbDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkHasAlerts" type="{http://jackhenry.com/jxchange/TPG/2008}ChkHasAlerts_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkHoldDays" type="{http://jackhenry.com/jxchange/TPG/2008}ChkHoldDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkHoldAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ChkHoldAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkRiskActDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskActDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkRiskPrvdType" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskPrvdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnRiskStatArray" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskStatArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ChkRiskAlertArray" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskAlertArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "x_ChkRiskAuxInqRec_CType", propOrder = {
    "clsDt",
    "openDt",
    "acctStat",
    "lastStatTimeDt",
    "crtStatTimeDt",
    "chkRiskAbbCode",
    "chkRiskAbbDesc",
    "chkHasAlerts",
    "chkHoldDays",
    "chkHoldAmt",
    "chkRiskActDesc",
    "trnRcptId",
    "chkRiskPrvdType",
    "trnRiskStatArray",
    "chkRiskAlertArray",
    "ver1",
    "any"
})
public class XChkRiskAuxInqRecCType {

    @XmlElement(name = "ClsDt")
    protected ClsDtType clsDt;
    @XmlElement(name = "OpenDt")
    protected OpenDtType openDt;
    @XmlElement(name = "AcctStat")
    protected AcctStatType acctStat;
    @XmlElement(name = "LastStatTimeDt")
    protected LastStatTimeDtType lastStatTimeDt;
    @XmlElement(name = "CrtStatTimeDt")
    protected CrtStatTimeDtType crtStatTimeDt;
    @XmlElement(name = "ChkRiskAbbCode")
    protected ChkRiskAbbCodeType chkRiskAbbCode;
    @XmlElement(name = "ChkRiskAbbDesc")
    protected ChkRiskAbbDescType chkRiskAbbDesc;
    @XmlElement(name = "ChkHasAlerts")
    protected ChkHasAlertsType chkHasAlerts;
    @XmlElement(name = "ChkHoldDays")
    protected ChkHoldDaysType chkHoldDays;
    @XmlElement(name = "ChkHoldAmt")
    protected ChkHoldAmtType chkHoldAmt;
    @XmlElement(name = "ChkRiskActDesc")
    protected ChkRiskActDescType chkRiskActDesc;
    @XmlElement(name = "TrnRcptId")
    protected TrnRcptIdType trnRcptId;
    @XmlElement(name = "ChkRiskPrvdType")
    protected ChkRiskPrvdTypeType chkRiskPrvdType;
    @XmlElement(name = "TrnRiskStatArray")
    protected TrnRiskStatArrayAType trnRiskStatArray;
    @XmlElement(name = "ChkRiskAlertArray")
    protected ChkRiskAlertArrayAType chkRiskAlertArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the clsDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClsDtType }
     *     
     */
    public ClsDtType getClsDt() {
        return clsDt;
    }

    /**
     * Sets the value of the clsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsDtType }
     *     
     */
    public void setClsDt(ClsDtType value) {
        this.clsDt = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link OpenDtType }
     *     
     */
    public OpenDtType getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenDtType }
     *     
     */
    public void setOpenDt(OpenDtType value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the acctStat property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatType }
     *     
     */
    public AcctStatType getAcctStat() {
        return acctStat;
    }

    /**
     * Sets the value of the acctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatType }
     *     
     */
    public void setAcctStat(AcctStatType value) {
        this.acctStat = value;
    }

    /**
     * Gets the value of the lastStatTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastStatTimeDtType }
     *     
     */
    public LastStatTimeDtType getLastStatTimeDt() {
        return lastStatTimeDt;
    }

    /**
     * Sets the value of the lastStatTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastStatTimeDtType }
     *     
     */
    public void setLastStatTimeDt(LastStatTimeDtType value) {
        this.lastStatTimeDt = value;
    }

    /**
     * Gets the value of the crtStatTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link CrtStatTimeDtType }
     *     
     */
    public CrtStatTimeDtType getCrtStatTimeDt() {
        return crtStatTimeDt;
    }

    /**
     * Sets the value of the crtStatTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrtStatTimeDtType }
     *     
     */
    public void setCrtStatTimeDt(CrtStatTimeDtType value) {
        this.crtStatTimeDt = value;
    }

    /**
     * Gets the value of the chkRiskAbbCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChkRiskAbbCodeType }
     *     
     */
    public ChkRiskAbbCodeType getChkRiskAbbCode() {
        return chkRiskAbbCode;
    }

    /**
     * Sets the value of the chkRiskAbbCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkRiskAbbCodeType }
     *     
     */
    public void setChkRiskAbbCode(ChkRiskAbbCodeType value) {
        this.chkRiskAbbCode = value;
    }

    /**
     * Gets the value of the chkRiskAbbDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ChkRiskAbbDescType }
     *     
     */
    public ChkRiskAbbDescType getChkRiskAbbDesc() {
        return chkRiskAbbDesc;
    }

    /**
     * Sets the value of the chkRiskAbbDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkRiskAbbDescType }
     *     
     */
    public void setChkRiskAbbDesc(ChkRiskAbbDescType value) {
        this.chkRiskAbbDesc = value;
    }

    /**
     * Gets the value of the chkHasAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link ChkHasAlertsType }
     *     
     */
    public ChkHasAlertsType getChkHasAlerts() {
        return chkHasAlerts;
    }

    /**
     * Sets the value of the chkHasAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkHasAlertsType }
     *     
     */
    public void setChkHasAlerts(ChkHasAlertsType value) {
        this.chkHasAlerts = value;
    }

    /**
     * Gets the value of the chkHoldDays property.
     * 
     * @return
     *     possible object is
     *     {@link ChkHoldDaysType }
     *     
     */
    public ChkHoldDaysType getChkHoldDays() {
        return chkHoldDays;
    }

    /**
     * Sets the value of the chkHoldDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkHoldDaysType }
     *     
     */
    public void setChkHoldDays(ChkHoldDaysType value) {
        this.chkHoldDays = value;
    }

    /**
     * Gets the value of the chkHoldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ChkHoldAmtType }
     *     
     */
    public ChkHoldAmtType getChkHoldAmt() {
        return chkHoldAmt;
    }

    /**
     * Sets the value of the chkHoldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkHoldAmtType }
     *     
     */
    public void setChkHoldAmt(ChkHoldAmtType value) {
        this.chkHoldAmt = value;
    }

    /**
     * Gets the value of the chkRiskActDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ChkRiskActDescType }
     *     
     */
    public ChkRiskActDescType getChkRiskActDesc() {
        return chkRiskActDesc;
    }

    /**
     * Sets the value of the chkRiskActDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkRiskActDescType }
     *     
     */
    public void setChkRiskActDesc(ChkRiskActDescType value) {
        this.chkRiskActDesc = value;
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
     * Gets the value of the chkRiskPrvdType property.
     * 
     * @return
     *     possible object is
     *     {@link ChkRiskPrvdTypeType }
     *     
     */
    public ChkRiskPrvdTypeType getChkRiskPrvdType() {
        return chkRiskPrvdType;
    }

    /**
     * Sets the value of the chkRiskPrvdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkRiskPrvdTypeType }
     *     
     */
    public void setChkRiskPrvdType(ChkRiskPrvdTypeType value) {
        this.chkRiskPrvdType = value;
    }

    /**
     * Gets the value of the trnRiskStatArray property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRiskStatArrayAType }
     *     
     */
    public TrnRiskStatArrayAType getTrnRiskStatArray() {
        return trnRiskStatArray;
    }

    /**
     * Sets the value of the trnRiskStatArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRiskStatArrayAType }
     *     
     */
    public void setTrnRiskStatArray(TrnRiskStatArrayAType value) {
        this.trnRiskStatArray = value;
    }

    /**
     * Gets the value of the chkRiskAlertArray property.
     * 
     * @return
     *     possible object is
     *     {@link ChkRiskAlertArrayAType }
     *     
     */
    public ChkRiskAlertArrayAType getChkRiskAlertArray() {
        return chkRiskAlertArray;
    }

    /**
     * Sets the value of the chkRiskAlertArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkRiskAlertArrayAType }
     *     
     */
    public void setChkRiskAlertArray(ChkRiskAlertArrayAType value) {
        this.chkRiskAlertArray = value;
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
