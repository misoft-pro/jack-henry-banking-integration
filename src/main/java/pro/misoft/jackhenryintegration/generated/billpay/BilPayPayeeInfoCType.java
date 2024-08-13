
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
 * 
 * <p>Java class for BilPayPayeeInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayPayeeInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayeeName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeNickname" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeNickname_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeAddrInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeAddrInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PayeePhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PayeeEmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PayeeEmailSharedSecret" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeEmailSharedSecret_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeClsf" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeClsf_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeFIAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}FIAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="SubMerAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}SubMerAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubMerPayerName" type="{http://jackhenry.com/jxchange/TPG/2008}SubMerPayerName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeCatName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeCatName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayFromAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PayFromAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="BilPaySvcFeeArray" type="{http://jackhenry.com/jxchange/TPG/2008}BilPaySvcFeeArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ElecBilPayeeType" type="{http://jackhenry.com/jxchange/TPG/2008}ElecBilPayeeType_Type" minOccurs="0"/&gt;
 *             &lt;element name="ElecBilAcctErrExist" type="{http://jackhenry.com/jxchange/TPG/2008}ElecBilAcctErrExist_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="PmtIntentType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtIntentType_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="PayeeP2PType" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeP2PType_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="LastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="ElecBilPayeeCatType" type="{http://jackhenry.com/jxchange/TPG/2008}ElecBilPayeeCatType_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "BilPayPayeeInfo_CType", propOrder = {
    "payeeName",
    "payeeNickname",
    "payeeAddrInfoArray",
    "payeePhoneArray",
    "payeeEmailArray",
    "payeeEmailSharedSecret",
    "payeeClsf",
    "payeeFIAcctInfo",
    "subMerAcctId",
    "subMerPayerName",
    "payeeCatName",
    "payFromAcctInfo",
    "custom",
    "ver1",
    "bilPaySvcFeeArray",
    "ver2",
    "elecBilPayeeType",
    "elecBilAcctErrExist",
    "ver3",
    "pmtIntentType",
    "ver4",
    "payeeP2PType",
    "ver5",
    "lastMainDt",
    "ver6",
    "elecBilPayeeCatType",
    "ver7",
    "any"
})
public class BilPayPayeeInfoCType {

    @XmlElement(name = "PayeeName")
    protected PayeeNameType payeeName;
    @XmlElement(name = "PayeeNickname")
    protected PayeeNicknameType payeeNickname;
    @XmlElement(name = "PayeeAddrInfoArray")
    protected PayeeAddrInfoArrayAType payeeAddrInfoArray;
    @XmlElement(name = "PayeePhoneArray")
    protected PhoneArrayAType payeePhoneArray;
    @XmlElement(name = "PayeeEmailArray")
    protected EmailArrayAType payeeEmailArray;
    @XmlElement(name = "PayeeEmailSharedSecret")
    protected PayeeEmailSharedSecretType payeeEmailSharedSecret;
    @XmlElement(name = "PayeeClsf")
    protected PayeeClsfType payeeClsf;
    @XmlElement(name = "PayeeFIAcctInfo")
    protected FIAcctInfoCType payeeFIAcctInfo;
    @XmlElement(name = "SubMerAcctId")
    protected SubMerAcctIdType subMerAcctId;
    @XmlElement(name = "SubMerPayerName")
    protected SubMerPayerNameType subMerPayerName;
    @XmlElement(name = "PayeeCatName")
    protected PayeeCatNameType payeeCatName;
    @XmlElement(name = "PayFromAcctInfo")
    protected PayFromAcctInfoCType payFromAcctInfo;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "BilPaySvcFeeArray")
    protected BilPaySvcFeeArrayAType bilPaySvcFeeArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ElecBilPayeeType")
    protected ElecBilPayeeTypeType elecBilPayeeType;
    @XmlElement(name = "ElecBilAcctErrExist")
    protected ElecBilAcctErrExistType elecBilAcctErrExist;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "PmtIntentType")
    protected PmtIntentTypeType pmtIntentType;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "PayeeP2PType")
    protected PayeeP2PTypeType payeeP2PType;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "LastMainDt")
    protected LastMainDtType lastMainDt;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "ElecBilPayeeCatType")
    protected ElecBilPayeeCatTypeType elecBilPayeeCatType;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the payeeAddrInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeAddrInfoArrayAType }
     *     
     */
    public PayeeAddrInfoArrayAType getPayeeAddrInfoArray() {
        return payeeAddrInfoArray;
    }

    /**
     * Sets the value of the payeeAddrInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeAddrInfoArrayAType }
     *     
     */
    public void setPayeeAddrInfoArray(PayeeAddrInfoArrayAType value) {
        this.payeeAddrInfoArray = value;
    }

    /**
     * Gets the value of the payeePhoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getPayeePhoneArray() {
        return payeePhoneArray;
    }

    /**
     * Sets the value of the payeePhoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setPayeePhoneArray(PhoneArrayAType value) {
        this.payeePhoneArray = value;
    }

    /**
     * Gets the value of the payeeEmailArray property.
     * 
     * @return
     *     possible object is
     *     {@link EmailArrayAType }
     *     
     */
    public EmailArrayAType getPayeeEmailArray() {
        return payeeEmailArray;
    }

    /**
     * Sets the value of the payeeEmailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailArrayAType }
     *     
     */
    public void setPayeeEmailArray(EmailArrayAType value) {
        this.payeeEmailArray = value;
    }

    /**
     * Gets the value of the payeeEmailSharedSecret property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeEmailSharedSecretType }
     *     
     */
    public PayeeEmailSharedSecretType getPayeeEmailSharedSecret() {
        return payeeEmailSharedSecret;
    }

    /**
     * Sets the value of the payeeEmailSharedSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeEmailSharedSecretType }
     *     
     */
    public void setPayeeEmailSharedSecret(PayeeEmailSharedSecretType value) {
        this.payeeEmailSharedSecret = value;
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
     * Gets the value of the payeeFIAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FIAcctInfoCType }
     *     
     */
    public FIAcctInfoCType getPayeeFIAcctInfo() {
        return payeeFIAcctInfo;
    }

    /**
     * Sets the value of the payeeFIAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIAcctInfoCType }
     *     
     */
    public void setPayeeFIAcctInfo(FIAcctInfoCType value) {
        this.payeeFIAcctInfo = value;
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
     * Gets the value of the subMerPayerName property.
     * 
     * @return
     *     possible object is
     *     {@link SubMerPayerNameType }
     *     
     */
    public SubMerPayerNameType getSubMerPayerName() {
        return subMerPayerName;
    }

    /**
     * Sets the value of the subMerPayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMerPayerNameType }
     *     
     */
    public void setSubMerPayerName(SubMerPayerNameType value) {
        this.subMerPayerName = value;
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
     * Gets the value of the bilPaySvcFeeArray property.
     * 
     * @return
     *     possible object is
     *     {@link BilPaySvcFeeArrayAType }
     *     
     */
    public BilPaySvcFeeArrayAType getBilPaySvcFeeArray() {
        return bilPaySvcFeeArray;
    }

    /**
     * Sets the value of the bilPaySvcFeeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilPaySvcFeeArrayAType }
     *     
     */
    public void setBilPaySvcFeeArray(BilPaySvcFeeArrayAType value) {
        this.bilPaySvcFeeArray = value;
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
     * Gets the value of the payeeP2PType property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeP2PTypeType }
     *     
     */
    public PayeeP2PTypeType getPayeeP2PType() {
        return payeeP2PType;
    }

    /**
     * Sets the value of the payeeP2PType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeP2PTypeType }
     *     
     */
    public void setPayeeP2PType(PayeeP2PTypeType value) {
        this.payeeP2PType = value;
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
