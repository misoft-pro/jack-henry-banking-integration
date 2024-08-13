
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
 * A package of data related to a bill pay payee
 *     search
 * 
 * <p>Java class for BilPayPayeeSrchInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayPayeeSrchInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayeeId" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeId_Type"/&gt;
 *         &lt;element name="PayeeName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeNickname" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeNickname_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeCatName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeCatName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeClsf" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeClsf_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeePmtMthd" type="{http://jackhenry.com/jxchange/TPG/2008}PmtMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeLastPdAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeLastPdAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeLastPdDt" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeLastPdDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CanRush" type="{http://jackhenry.com/jxchange/TPG/2008}CanRush_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayFromAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PayFromAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PayeeStat" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ElecBilPayeeType" type="{http://jackhenry.com/jxchange/TPG/2008}ElecBilPayeeType_Type" minOccurs="0"/&gt;
 *           &lt;element name="ElecBilAcctErrExist" type="{http://jackhenry.com/jxchange/TPG/2008}ElecBilAcctErrExist_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="FirstAvlProcDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstAvlProcDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="FirstAvlEstArvDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstAvlEstArvDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="EstArvDay" type="{http://jackhenry.com/jxchange/TPG/2008}EstArvDay_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="PmtIntentType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtIntentType_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="SubMerAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}SubMerAcctId_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="RushOptArray" type="{http://jackhenry.com/jxchange/TPG/2008}RushOptArray_AType" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="LastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="ElecBilPayeeCatType" type="{http://jackhenry.com/jxchange/TPG/2008}ElecBilPayeeCatType_Type" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                       &lt;/sequence&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/sequence&gt;
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
@XmlType(name = "BilPayPayeeSrchInfo_CType", propOrder = {
    "payeeId",
    "payeeName",
    "payeeNickname",
    "payeeCatName",
    "payeeClsf",
    "payeePmtMthd",
    "payeeLastPdAmt",
    "payeeLastPdDt",
    "canRush",
    "payFromAcctInfo",
    "payeeStat",
    "custom",
    "ver1",
    "elecBilPayeeType",
    "elecBilAcctErrExist",
    "ver2",
    "firstAvlProcDt",
    "firstAvlEstArvDt",
    "estArvDay",
    "ver3",
    "pmtIntentType",
    "ver4",
    "subMerAcctId",
    "ver5",
    "rushOptArray",
    "ver6",
    "lastMainDt",
    "ver7",
    "elecBilPayeeCatType",
    "ver8",
    "any"
})
public class BilPayPayeeSrchInfoCType {

    @XmlElement(name = "PayeeId", required = true)
    protected PayeeIdType payeeId;
    @XmlElement(name = "PayeeName")
    protected PayeeNameType payeeName;
    @XmlElement(name = "PayeeNickname")
    protected PayeeNicknameType payeeNickname;
    @XmlElement(name = "PayeeCatName")
    protected PayeeCatNameType payeeCatName;
    @XmlElement(name = "PayeeClsf")
    protected PayeeClsfType payeeClsf;
    @XmlElement(name = "PayeePmtMthd")
    protected PmtMthdType payeePmtMthd;
    @XmlElement(name = "PayeeLastPdAmt")
    protected PayeeLastPdAmtType payeeLastPdAmt;
    @XmlElement(name = "PayeeLastPdDt")
    protected PayeeLastPdDtType payeeLastPdDt;
    @XmlElement(name = "CanRush")
    protected CanRushType canRush;
    @XmlElement(name = "PayFromAcctInfo")
    protected PayFromAcctInfoCType payFromAcctInfo;
    @XmlElement(name = "PayeeStat")
    protected PayeeStatType payeeStat;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ElecBilPayeeType")
    protected ElecBilPayeeTypeType elecBilPayeeType;
    @XmlElement(name = "ElecBilAcctErrExist")
    protected ElecBilAcctErrExistType elecBilAcctErrExist;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "FirstAvlProcDt")
    protected FirstAvlProcDtType firstAvlProcDt;
    @XmlElement(name = "FirstAvlEstArvDt")
    protected FirstAvlEstArvDtType firstAvlEstArvDt;
    @XmlElement(name = "EstArvDay")
    protected Integer estArvDay;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "PmtIntentType")
    protected PmtIntentTypeType pmtIntentType;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "SubMerAcctId")
    protected SubMerAcctIdType subMerAcctId;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "RushOptArray")
    protected RushOptArrayAType rushOptArray;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "LastMainDt")
    protected LastMainDtType lastMainDt;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "ElecBilPayeeCatType")
    protected ElecBilPayeeCatTypeType elecBilPayeeCatType;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the payeeCatName property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeCatNameType }
     *     
     */
    public PayeeCatNameType getPayeeCatName() {
        return payeeCatName;
    }

    /**
     * Sets the value of the payeeCatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeCatNameType }
     *     
     */
    public void setPayeeCatName(PayeeCatNameType value) {
        this.payeeCatName = value;
    }

    /**
     * Gets the value of the payeeClsf property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeClsfType }
     *     
     */
    public PayeeClsfType getPayeeClsf() {
        return payeeClsf;
    }

    /**
     * Sets the value of the payeeClsf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeClsfType }
     *     
     */
    public void setPayeeClsf(PayeeClsfType value) {
        this.payeeClsf = value;
    }

    /**
     * Gets the value of the payeePmtMthd property.
     * 
     * @return
     *     possible object is
     *     {@link PmtMthdType }
     *     
     */
    public PmtMthdType getPayeePmtMthd() {
        return payeePmtMthd;
    }

    /**
     * Sets the value of the payeePmtMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtMthdType }
     *     
     */
    public void setPayeePmtMthd(PmtMthdType value) {
        this.payeePmtMthd = value;
    }

    /**
     * Gets the value of the payeeLastPdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeLastPdAmtType }
     *     
     */
    public PayeeLastPdAmtType getPayeeLastPdAmt() {
        return payeeLastPdAmt;
    }

    /**
     * Sets the value of the payeeLastPdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeLastPdAmtType }
     *     
     */
    public void setPayeeLastPdAmt(PayeeLastPdAmtType value) {
        this.payeeLastPdAmt = value;
    }

    /**
     * Gets the value of the payeeLastPdDt property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeLastPdDtType }
     *     
     */
    public PayeeLastPdDtType getPayeeLastPdDt() {
        return payeeLastPdDt;
    }

    /**
     * Sets the value of the payeeLastPdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeLastPdDtType }
     *     
     */
    public void setPayeeLastPdDt(PayeeLastPdDtType value) {
        this.payeeLastPdDt = value;
    }

    /**
     * Gets the value of the canRush property.
     * 
     * @return
     *     possible object is
     *     {@link CanRushType }
     *     
     */
    public CanRushType getCanRush() {
        return canRush;
    }

    /**
     * Sets the value of the canRush property.
     * 
     * @param value
     *     allowed object is
     *     {@link CanRushType }
     *     
     */
    public void setCanRush(CanRushType value) {
        this.canRush = value;
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
     * Gets the value of the payeeStat property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeStatType }
     *     
     */
    public PayeeStatType getPayeeStat() {
        return payeeStat;
    }

    /**
     * Sets the value of the payeeStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeStatType }
     *     
     */
    public void setPayeeStat(PayeeStatType value) {
        this.payeeStat = value;
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
     * Gets the value of the elecBilPayeeType property.
     * 
     * @return
     *     possible object is
     *     {@link ElecBilPayeeTypeType }
     *     
     */
    public ElecBilPayeeTypeType getElecBilPayeeType() {
        return elecBilPayeeType;
    }

    /**
     * Sets the value of the elecBilPayeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecBilPayeeTypeType }
     *     
     */
    public void setElecBilPayeeType(ElecBilPayeeTypeType value) {
        this.elecBilPayeeType = value;
    }

    /**
     * Gets the value of the elecBilAcctErrExist property.
     * 
     * @return
     *     possible object is
     *     {@link ElecBilAcctErrExistType }
     *     
     */
    public ElecBilAcctErrExistType getElecBilAcctErrExist() {
        return elecBilAcctErrExist;
    }

    /**
     * Sets the value of the elecBilAcctErrExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecBilAcctErrExistType }
     *     
     */
    public void setElecBilAcctErrExist(ElecBilAcctErrExistType value) {
        this.elecBilAcctErrExist = value;
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
     * Gets the value of the firstAvlProcDt property.
     * 
     * @return
     *     possible object is
     *     {@link FirstAvlProcDtType }
     *     
     */
    public FirstAvlProcDtType getFirstAvlProcDt() {
        return firstAvlProcDt;
    }

    /**
     * Sets the value of the firstAvlProcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstAvlProcDtType }
     *     
     */
    public void setFirstAvlProcDt(FirstAvlProcDtType value) {
        this.firstAvlProcDt = value;
    }

    /**
     * Gets the value of the firstAvlEstArvDt property.
     * 
     * @return
     *     possible object is
     *     {@link FirstAvlEstArvDtType }
     *     
     */
    public FirstAvlEstArvDtType getFirstAvlEstArvDt() {
        return firstAvlEstArvDt;
    }

    /**
     * Sets the value of the firstAvlEstArvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstAvlEstArvDtType }
     *     
     */
    public void setFirstAvlEstArvDt(FirstAvlEstArvDtType value) {
        this.firstAvlEstArvDt = value;
    }

    /**
     * Gets the value of the estArvDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstArvDay() {
        return estArvDay;
    }

    /**
     * Sets the value of the estArvDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstArvDay(Integer value) {
        this.estArvDay = value;
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
     * Gets the value of the subMerAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link SubMerAcctIdType }
     *     
     */
    public SubMerAcctIdType getSubMerAcctId() {
        return subMerAcctId;
    }

    /**
     * Sets the value of the subMerAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMerAcctIdType }
     *     
     */
    public void setSubMerAcctId(SubMerAcctIdType value) {
        this.subMerAcctId = value;
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
     * Gets the value of the rushOptArray property.
     * 
     * @return
     *     possible object is
     *     {@link RushOptArrayAType }
     *     
     */
    public RushOptArrayAType getRushOptArray() {
        return rushOptArray;
    }

    /**
     * Sets the value of the rushOptArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RushOptArrayAType }
     *     
     */
    public void setRushOptArray(RushOptArrayAType value) {
        this.rushOptArray = value;
    }

    /**
     * Gets the value of the ver6 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver6CType }
     *     
     */
    public Ver6CType getVer6() {
        return ver6;
    }

    /**
     * Sets the value of the ver6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver6CType }
     *     
     */
    public void setVer6(Ver6CType value) {
        this.ver6 = value;
    }

    /**
     * Gets the value of the lastMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastMainDtType }
     *     
     */
    public LastMainDtType getLastMainDt() {
        return lastMainDt;
    }

    /**
     * Sets the value of the lastMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastMainDtType }
     *     
     */
    public void setLastMainDt(LastMainDtType value) {
        this.lastMainDt = value;
    }

    /**
     * Gets the value of the ver7 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver7CType }
     *     
     */
    public Ver7CType getVer7() {
        return ver7;
    }

    /**
     * Sets the value of the ver7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver7CType }
     *     
     */
    public void setVer7(Ver7CType value) {
        this.ver7 = value;
    }

    /**
     * Gets the value of the elecBilPayeeCatType property.
     * 
     * @return
     *     possible object is
     *     {@link ElecBilPayeeCatTypeType }
     *     
     */
    public ElecBilPayeeCatTypeType getElecBilPayeeCatType() {
        return elecBilPayeeCatType;
    }

    /**
     * Sets the value of the elecBilPayeeCatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecBilPayeeCatTypeType }
     *     
     */
    public void setElecBilPayeeCatType(ElecBilPayeeCatTypeType value) {
        this.elecBilPayeeCatType = value;
    }

    /**
     * Gets the value of the ver8 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver8CType }
     *     
     */
    public Ver8CType getVer8() {
        return ver8;
    }

    /**
     * Sets the value of the ver8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver8CType }
     *     
     */
    public void setVer8(Ver8CType value) {
        this.ver8 = value;
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
