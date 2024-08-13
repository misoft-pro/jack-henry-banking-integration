
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
 * A package of data related to a payment search
 * 
 * <p>Java class for BilPaySchedPmtSrchInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPaySchedPmtSrchInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtId" type="{http://jackhenry.com/jxchange/TPG/2008}PmtId_Type"/&gt;
 *         &lt;element name="PayeeId" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeNickname" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeNickname_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtProcDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtProcDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtEstArvDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtEstArvDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayFromAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PayFromAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PmtStat" type="{http://jackhenry.com/jxchange/TPG/2008}PmtStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtMthd" type="{http://jackhenry.com/jxchange/TPG/2008}PmtMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PmtFreqUnits" type="{http://jackhenry.com/jxchange/TPG/2008}PmtFreqUnits_Type" minOccurs="0"/&gt;
 *           &lt;element name="P2PType" type="{http://jackhenry.com/jxchange/TPG/2008}P2PType_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ElecMerBilPmt" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerBilPmt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="PmtIntentType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtIntentType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BilPaySchedPmtSrchInfo_CType", propOrder = {
    "pmtId",
    "payeeId",
    "payeeName",
    "payeeNickname",
    "pmtProcDt",
    "pmtEstArvDt",
    "pmtAmt",
    "payFromAcctInfo",
    "pmtStat",
    "pmtMthd",
    "custom",
    "ver1",
    "pmtFreqUnits",
    "p2PType",
    "ver2",
    "elecMerBilPmt",
    "ver3",
    "pmtIntentType",
    "ver4",
    "any"
})
public class BilPaySchedPmtSrchInfoCType {

    @XmlElement(name = "PmtId", required = true)
    protected PmtIdType pmtId;
    @XmlElement(name = "PayeeId")
    protected PayeeIdType payeeId;
    @XmlElement(name = "PayeeName")
    protected PayeeNameType payeeName;
    @XmlElement(name = "PayeeNickname")
    protected PayeeNicknameType payeeNickname;
    @XmlElement(name = "PmtProcDt")
    protected PmtProcDtType pmtProcDt;
    @XmlElement(name = "PmtEstArvDt")
    protected PmtEstArvDtType pmtEstArvDt;
    @XmlElement(name = "PmtAmt")
    protected PmtAmtType pmtAmt;
    @XmlElement(name = "PayFromAcctInfo")
    protected PayFromAcctInfoCType payFromAcctInfo;
    @XmlElement(name = "PmtStat")
    protected PmtStatType pmtStat;
    @XmlElement(name = "PmtMthd")
    protected PmtMthdType pmtMthd;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PmtFreqUnits")
    protected PmtFreqUnitsType pmtFreqUnits;
    @XmlElement(name = "P2PType")
    protected P2PTypeType p2PType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ElecMerBilPmt")
    protected ElecMerBilPmtType elecMerBilPmt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "PmtIntentType")
    protected PmtIntentTypeType pmtIntentType;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PmtIdType }
     *     
     */
    public PmtIdType getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtIdType }
     *     
     */
    public void setPmtId(PmtIdType value) {
        this.pmtId = value;
    }

    /**
     * Gets the value of the payeeId property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeIdType }
     *     
     */
    public PayeeIdType getPayeeId() {
        return payeeId;
    }

    /**
     * Sets the value of the payeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeIdType }
     *     
     */
    public void setPayeeId(PayeeIdType value) {
        this.payeeId = value;
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
     * Gets the value of the payeeNickname property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeNicknameType }
     *     
     */
    public PayeeNicknameType getPayeeNickname() {
        return payeeNickname;
    }

    /**
     * Sets the value of the payeeNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeNicknameType }
     *     
     */
    public void setPayeeNickname(PayeeNicknameType value) {
        this.payeeNickname = value;
    }

    /**
     * Gets the value of the pmtProcDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtProcDtType }
     *     
     */
    public PmtProcDtType getPmtProcDt() {
        return pmtProcDt;
    }

    /**
     * Sets the value of the pmtProcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtProcDtType }
     *     
     */
    public void setPmtProcDt(PmtProcDtType value) {
        this.pmtProcDt = value;
    }

    /**
     * Gets the value of the pmtEstArvDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEstArvDtType }
     *     
     */
    public PmtEstArvDtType getPmtEstArvDt() {
        return pmtEstArvDt;
    }

    /**
     * Sets the value of the pmtEstArvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEstArvDtType }
     *     
     */
    public void setPmtEstArvDt(PmtEstArvDtType value) {
        this.pmtEstArvDt = value;
    }

    /**
     * Gets the value of the pmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAmtType }
     *     
     */
    public PmtAmtType getPmtAmt() {
        return pmtAmt;
    }

    /**
     * Sets the value of the pmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAmtType }
     *     
     */
    public void setPmtAmt(PmtAmtType value) {
        this.pmtAmt = value;
    }

    /**
     * Gets the value of the payFromAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PayFromAcctInfoCType }
     *     
     */
    public PayFromAcctInfoCType getPayFromAcctInfo() {
        return payFromAcctInfo;
    }

    /**
     * Sets the value of the payFromAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayFromAcctInfoCType }
     *     
     */
    public void setPayFromAcctInfo(PayFromAcctInfoCType value) {
        this.payFromAcctInfo = value;
    }

    /**
     * Gets the value of the pmtStat property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatType }
     *     
     */
    public PmtStatType getPmtStat() {
        return pmtStat;
    }

    /**
     * Sets the value of the pmtStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatType }
     *     
     */
    public void setPmtStat(PmtStatType value) {
        this.pmtStat = value;
    }

    /**
     * Gets the value of the pmtMthd property.
     * 
     * @return
     *     possible object is
     *     {@link PmtMthdType }
     *     
     */
    public PmtMthdType getPmtMthd() {
        return pmtMthd;
    }

    /**
     * Sets the value of the pmtMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtMthdType }
     *     
     */
    public void setPmtMthd(PmtMthdType value) {
        this.pmtMthd = value;
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
     * Gets the value of the pmtFreqUnits property.
     * 
     * @return
     *     possible object is
     *     {@link PmtFreqUnitsType }
     *     
     */
    public PmtFreqUnitsType getPmtFreqUnits() {
        return pmtFreqUnits;
    }

    /**
     * Sets the value of the pmtFreqUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtFreqUnitsType }
     *     
     */
    public void setPmtFreqUnits(PmtFreqUnitsType value) {
        this.pmtFreqUnits = value;
    }

    /**
     * Gets the value of the p2PType property.
     * 
     * @return
     *     possible object is
     *     {@link P2PTypeType }
     *     
     */
    public P2PTypeType getP2PType() {
        return p2PType;
    }

    /**
     * Sets the value of the p2PType property.
     * 
     * @param value
     *     allowed object is
     *     {@link P2PTypeType }
     *     
     */
    public void setP2PType(P2PTypeType value) {
        this.p2PType = value;
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
     * Gets the value of the elecMerBilPmt property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerBilPmtType }
     *     
     */
    public ElecMerBilPmtType getElecMerBilPmt() {
        return elecMerBilPmt;
    }

    /**
     * Sets the value of the elecMerBilPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerBilPmtType }
     *     
     */
    public void setElecMerBilPmt(ElecMerBilPmtType value) {
        this.elecMerBilPmt = value;
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
     * Gets the value of the pmtIntentType property.
     * 
     * @return
     *     possible object is
     *     {@link PmtIntentTypeType }
     *     
     */
    public PmtIntentTypeType getPmtIntentType() {
        return pmtIntentType;
    }

    /**
     * Sets the value of the pmtIntentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtIntentTypeType }
     *     
     */
    public void setPmtIntentType(PmtIntentTypeType value) {
        this.pmtIntentType = value;
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
