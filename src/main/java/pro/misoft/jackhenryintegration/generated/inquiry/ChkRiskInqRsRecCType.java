
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
 * <p>Java class for ChkRiskInqRsRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkRiskInqRsRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnRiskStatArray" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskStatArray_AType"/&gt;
 *         &lt;element name="IdRiskMatchArray" type="{http://jackhenry.com/jxchange/TPG/2008}IdRiskMatchArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="IdRiskMatchScore" type="{http://jackhenry.com/jxchange/TPG/2008}IdRiskMatchScore_Type" minOccurs="0"/&gt;
 *         &lt;element name="RetTrnCnt" type="{http://jackhenry.com/jxchange/TPG/2008}RetTrnCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastRetTrnMoYr" type="{http://jackhenry.com/jxchange/TPG/2008}LastRetTrnMoYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="RetRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}RetRsnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RetRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RetRsnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopChkAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNumStart" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNumStart_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNumEnd" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNumEnd_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopChkExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastRiskRptDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastRiskRptDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClsDt" type="{http://jackhenry.com/jxchange/TPG/2008}ClsDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnDsptPend" type="{http://jackhenry.com/jxchange/TPG/2008}TrnDsptPend_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnRiskRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskRcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkRiskAbbCode" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskAbbCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkRiskAbbDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskAbbDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkHasAlerts" type="{http://jackhenry.com/jxchange/TPG/2008}ChkHasAlerts_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkHoldDays" type="{http://jackhenry.com/jxchange/TPG/2008}ChkHoldDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkHoldAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ChkHoldAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkRiskActDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskActDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ChkRiskPrvdType" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskPrvdType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ChkRiskInqRsRec_CType", propOrder = {
    "trnRiskStatArray",
    "idRiskMatchArray",
    "idRiskMatchScore",
    "retTrnCnt",
    "lastRetTrnMoYr",
    "retRsnCode",
    "retRsnDesc",
    "stopChkAmt",
    "chkNumStart",
    "chkNumEnd",
    "stopChkExpDt",
    "lastRiskRptDt",
    "openDt",
    "clsDt",
    "trnDsptPend",
    "trnRiskRcptId",
    "chkRiskAbbCode",
    "chkRiskAbbDesc",
    "chkHasAlerts",
    "chkHoldDays",
    "chkHoldAmt",
    "chkRiskActDesc",
    "ver1",
    "chkRiskPrvdType",
    "ver2",
    "any"
})
public class ChkRiskInqRsRecCType {

    @XmlElement(name = "TrnRiskStatArray", required = true)
    protected TrnRiskStatArrayAType trnRiskStatArray;
    @XmlElement(name = "IdRiskMatchArray")
    protected IdRiskMatchArrayAType idRiskMatchArray;
    @XmlElement(name = "IdRiskMatchScore")
    protected IdRiskMatchScoreType idRiskMatchScore;
    @XmlElement(name = "RetTrnCnt")
    protected RetTrnCntType retTrnCnt;
    @XmlElement(name = "LastRetTrnMoYr")
    protected LastRetTrnMoYrType lastRetTrnMoYr;
    @XmlElement(name = "RetRsnCode")
    protected RetRsnCodeType retRsnCode;
    @XmlElement(name = "RetRsnDesc")
    protected RetRsnDescType retRsnDesc;
    @XmlElement(name = "StopChkAmt")
    protected AmtType stopChkAmt;
    @XmlElement(name = "ChkNumStart")
    protected ChkNumStartType chkNumStart;
    @XmlElement(name = "ChkNumEnd")
    protected ChkNumEndType chkNumEnd;
    @XmlElement(name = "StopChkExpDt")
    protected ExpDtType stopChkExpDt;
    @XmlElement(name = "LastRiskRptDt")
    protected LastRiskRptDtType lastRiskRptDt;
    @XmlElement(name = "OpenDt")
    protected OpenDtType openDt;
    @XmlElement(name = "ClsDt")
    protected ClsDtType clsDt;
    @XmlElement(name = "TrnDsptPend")
    protected TrnDsptPendType trnDsptPend;
    @XmlElement(name = "TrnRiskRcptId")
    protected TrnRiskRcptIdType trnRiskRcptId;
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
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ChkRiskPrvdType")
    protected ChkRiskPrvdTypeType chkRiskPrvdType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the idRiskMatchArray property.
     * 
     * @return
     *     possible object is
     *     {@link IdRiskMatchArrayAType }
     *     
     */
    public IdRiskMatchArrayAType getIdRiskMatchArray() {
        return idRiskMatchArray;
    }

    /**
     * Sets the value of the idRiskMatchArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRiskMatchArrayAType }
     *     
     */
    public void setIdRiskMatchArray(IdRiskMatchArrayAType value) {
        this.idRiskMatchArray = value;
    }

    /**
     * Gets the value of the idRiskMatchScore property.
     * 
     * @return
     *     possible object is
     *     {@link IdRiskMatchScoreType }
     *     
     */
    public IdRiskMatchScoreType getIdRiskMatchScore() {
        return idRiskMatchScore;
    }

    /**
     * Sets the value of the idRiskMatchScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRiskMatchScoreType }
     *     
     */
    public void setIdRiskMatchScore(IdRiskMatchScoreType value) {
        this.idRiskMatchScore = value;
    }

    /**
     * Gets the value of the retTrnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link RetTrnCntType }
     *     
     */
    public RetTrnCntType getRetTrnCnt() {
        return retTrnCnt;
    }

    /**
     * Sets the value of the retTrnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetTrnCntType }
     *     
     */
    public void setRetTrnCnt(RetTrnCntType value) {
        this.retTrnCnt = value;
    }

    /**
     * Gets the value of the lastRetTrnMoYr property.
     * 
     * @return
     *     possible object is
     *     {@link LastRetTrnMoYrType }
     *     
     */
    public LastRetTrnMoYrType getLastRetTrnMoYr() {
        return lastRetTrnMoYr;
    }

    /**
     * Sets the value of the lastRetTrnMoYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastRetTrnMoYrType }
     *     
     */
    public void setLastRetTrnMoYr(LastRetTrnMoYrType value) {
        this.lastRetTrnMoYr = value;
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
     * Gets the value of the stopChkAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getStopChkAmt() {
        return stopChkAmt;
    }

    /**
     * Sets the value of the stopChkAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setStopChkAmt(AmtType value) {
        this.stopChkAmt = value;
    }

    /**
     * Gets the value of the chkNumStart property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumStartType }
     *     
     */
    public ChkNumStartType getChkNumStart() {
        return chkNumStart;
    }

    /**
     * Sets the value of the chkNumStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumStartType }
     *     
     */
    public void setChkNumStart(ChkNumStartType value) {
        this.chkNumStart = value;
    }

    /**
     * Gets the value of the chkNumEnd property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumEndType }
     *     
     */
    public ChkNumEndType getChkNumEnd() {
        return chkNumEnd;
    }

    /**
     * Sets the value of the chkNumEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumEndType }
     *     
     */
    public void setChkNumEnd(ChkNumEndType value) {
        this.chkNumEnd = value;
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
     * Gets the value of the lastRiskRptDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastRiskRptDtType }
     *     
     */
    public LastRiskRptDtType getLastRiskRptDt() {
        return lastRiskRptDt;
    }

    /**
     * Sets the value of the lastRiskRptDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastRiskRptDtType }
     *     
     */
    public void setLastRiskRptDt(LastRiskRptDtType value) {
        this.lastRiskRptDt = value;
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
     * Gets the value of the trnDsptPend property.
     * 
     * @return
     *     possible object is
     *     {@link TrnDsptPendType }
     *     
     */
    public TrnDsptPendType getTrnDsptPend() {
        return trnDsptPend;
    }

    /**
     * Sets the value of the trnDsptPend property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnDsptPendType }
     *     
     */
    public void setTrnDsptPend(TrnDsptPendType value) {
        this.trnDsptPend = value;
    }

    /**
     * Gets the value of the trnRiskRcptId property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRiskRcptIdType }
     *     
     */
    public TrnRiskRcptIdType getTrnRiskRcptId() {
        return trnRiskRcptId;
    }

    /**
     * Sets the value of the trnRiskRcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRiskRcptIdType }
     *     
     */
    public void setTrnRiskRcptId(TrnRiskRcptIdType value) {
        this.trnRiskRcptId = value;
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
