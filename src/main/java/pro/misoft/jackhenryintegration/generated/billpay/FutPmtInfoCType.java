
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * A package of data related to a future scheduled
 *                 payment
 * 
 * <p>Java class for FutPmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FutPmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FutPmtId" type="{http://jackhenry.com/jxchange/TPG/2008}PmtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutPmtStat" type="{http://jackhenry.com/jxchange/TPG/2008}PmtStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutPmtOrigProcDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutPmtOrigProcDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutPmtActualProcDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtProcDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutPmtPayFromAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PayFromAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="FutPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutPmtCmnt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCmnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutPmtChkMemo" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkMemo_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutPmtModUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}FutPmtModUsrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutPmtLastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="SubCmntToPayee" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
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
@XmlType(name = "FutPmtInfo_CType", propOrder = {
    "futPmtId",
    "futPmtStat",
    "futPmtOrigProcDt",
    "futPmtActualProcDt",
    "futPmtPayFromAcctInfo",
    "futPmtAmt",
    "futPmtCmnt",
    "futPmtChkMemo",
    "futPmtModUsrId",
    "futPmtLastMainDt",
    "custom",
    "ver1",
    "subCmntToPayee",
    "ver2",
    "any"
})
public class FutPmtInfoCType {

    @XmlElement(name = "FutPmtId")
    protected PmtIdType futPmtId;
    @XmlElement(name = "FutPmtStat")
    protected PmtStatType futPmtStat;
    @XmlElement(name = "FutPmtOrigProcDt")
    protected FutPmtOrigProcDtType futPmtOrigProcDt;
    @XmlElement(name = "FutPmtActualProcDt")
    protected PmtProcDtType futPmtActualProcDt;
    @XmlElement(name = "FutPmtPayFromAcctInfo")
    protected PayFromAcctInfoCType futPmtPayFromAcctInfo;
    @XmlElement(name = "FutPmtAmt")
    protected PmtAmtType futPmtAmt;
    @XmlElement(name = "FutPmtCmnt")
    protected PmtCmntType futPmtCmnt;
    @XmlElement(name = "FutPmtChkMemo")
    protected PmtChkMemoType futPmtChkMemo;
    @XmlElement(name = "FutPmtModUsrId")
    protected FutPmtModUsrIdType futPmtModUsrId;
    @XmlElement(name = "FutPmtLastMainDt")
    protected LastMainDtType futPmtLastMainDt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "SubCmntToPayee")
    protected RmkType subCmntToPayee;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the futPmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PmtIdType }
     *     
     */
    public PmtIdType getFutPmtId() {
        return futPmtId;
    }

    /**
     * Sets the value of the futPmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtIdType }
     *     
     */
    public void setFutPmtId(PmtIdType value) {
        this.futPmtId = value;
    }

    /**
     * Gets the value of the futPmtStat property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatType }
     *     
     */
    public PmtStatType getFutPmtStat() {
        return futPmtStat;
    }

    /**
     * Sets the value of the futPmtStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatType }
     *     
     */
    public void setFutPmtStat(PmtStatType value) {
        this.futPmtStat = value;
    }

    /**
     * Gets the value of the futPmtOrigProcDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutPmtOrigProcDtType }
     *     
     */
    public FutPmtOrigProcDtType getFutPmtOrigProcDt() {
        return futPmtOrigProcDt;
    }

    /**
     * Sets the value of the futPmtOrigProcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutPmtOrigProcDtType }
     *     
     */
    public void setFutPmtOrigProcDt(FutPmtOrigProcDtType value) {
        this.futPmtOrigProcDt = value;
    }

    /**
     * Gets the value of the futPmtActualProcDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtProcDtType }
     *     
     */
    public PmtProcDtType getFutPmtActualProcDt() {
        return futPmtActualProcDt;
    }

    /**
     * Sets the value of the futPmtActualProcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtProcDtType }
     *     
     */
    public void setFutPmtActualProcDt(PmtProcDtType value) {
        this.futPmtActualProcDt = value;
    }

    /**
     * Gets the value of the futPmtPayFromAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PayFromAcctInfoCType }
     *     
     */
    public PayFromAcctInfoCType getFutPmtPayFromAcctInfo() {
        return futPmtPayFromAcctInfo;
    }

    /**
     * Sets the value of the futPmtPayFromAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayFromAcctInfoCType }
     *     
     */
    public void setFutPmtPayFromAcctInfo(PayFromAcctInfoCType value) {
        this.futPmtPayFromAcctInfo = value;
    }

    /**
     * Gets the value of the futPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAmtType }
     *     
     */
    public PmtAmtType getFutPmtAmt() {
        return futPmtAmt;
    }

    /**
     * Sets the value of the futPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAmtType }
     *     
     */
    public void setFutPmtAmt(PmtAmtType value) {
        this.futPmtAmt = value;
    }

    /**
     * Gets the value of the futPmtCmnt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtCmntType }
     *     
     */
    public PmtCmntType getFutPmtCmnt() {
        return futPmtCmnt;
    }

    /**
     * Sets the value of the futPmtCmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtCmntType }
     *     
     */
    public void setFutPmtCmnt(PmtCmntType value) {
        this.futPmtCmnt = value;
    }

    /**
     * Gets the value of the futPmtChkMemo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtChkMemoType }
     *     
     */
    public PmtChkMemoType getFutPmtChkMemo() {
        return futPmtChkMemo;
    }

    /**
     * Sets the value of the futPmtChkMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtChkMemoType }
     *     
     */
    public void setFutPmtChkMemo(PmtChkMemoType value) {
        this.futPmtChkMemo = value;
    }

    /**
     * Gets the value of the futPmtModUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link FutPmtModUsrIdType }
     *     
     */
    public FutPmtModUsrIdType getFutPmtModUsrId() {
        return futPmtModUsrId;
    }

    /**
     * Sets the value of the futPmtModUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutPmtModUsrIdType }
     *     
     */
    public void setFutPmtModUsrId(FutPmtModUsrIdType value) {
        this.futPmtModUsrId = value;
    }

    /**
     * Gets the value of the futPmtLastMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastMainDtType }
     *     
     */
    public LastMainDtType getFutPmtLastMainDt() {
        return futPmtLastMainDt;
    }

    /**
     * Sets the value of the futPmtLastMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastMainDtType }
     *     
     */
    public void setFutPmtLastMainDt(LastMainDtType value) {
        this.futPmtLastMainDt = value;
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
     * Gets the value of the subCmntToPayee property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getSubCmntToPayee() {
        return subCmntToPayee;
    }

    /**
     * Sets the value of the subCmntToPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setSubCmntToPayee(RmkType value) {
        this.subCmntToPayee = value;
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
