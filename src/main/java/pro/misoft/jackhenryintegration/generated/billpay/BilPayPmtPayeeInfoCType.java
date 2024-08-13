
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * A package of data related to a bill pay payee of a
 *                 payment
 * 
 * <p>Java class for BilPayPmtPayeeInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayPmtPayeeInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayeeId" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeNickname" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeNickname_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeAddrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeAddrInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PayeePhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PayeeEmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PayeeClsf" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeClsf_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeePmtMthd" type="{http://jackhenry.com/jxchange/TPG/2008}PmtMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubMerAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}SubMerAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubMerPayerName" type="{http://jackhenry.com/jxchange/TPG/2008}SubMerPayerName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeCatName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeCatName_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PmtIntentType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtIntentType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BilPayPmtPayeeInfo_CType", propOrder = {
    "payeeId",
    "payeeName",
    "payeeNickname",
    "payeeAddrInfo",
    "payeePhoneArray",
    "payeeEmailArray",
    "payeeClsf",
    "payeePmtMthd",
    "subMerAcctId",
    "subMerPayerName",
    "payeeCatName",
    "custom",
    "ver1",
    "pmtIntentType",
    "ver2",
    "any"
})
public class BilPayPmtPayeeInfoCType {

    @XmlElement(name = "PayeeId")
    protected PayeeIdType payeeId;
    @XmlElement(name = "PayeeName")
    protected PayeeNameType payeeName;
    @XmlElement(name = "PayeeNickname")
    protected PayeeNicknameType payeeNickname;
    @XmlElement(name = "PayeeAddrInfo")
    protected PayeeAddrInfoCType payeeAddrInfo;
    @XmlElement(name = "PayeePhoneArray")
    protected PhoneArrayAType payeePhoneArray;
    @XmlElement(name = "PayeeEmailArray")
    protected EmailArrayAType payeeEmailArray;
    @XmlElement(name = "PayeeClsf")
    protected PayeeClsfType payeeClsf;
    @XmlElement(name = "PayeePmtMthd")
    protected PmtMthdType payeePmtMthd;
    @XmlElement(name = "SubMerAcctId")
    protected SubMerAcctIdType subMerAcctId;
    @XmlElement(name = "SubMerPayerName")
    protected SubMerPayerNameType subMerPayerName;
    @XmlElement(name = "PayeeCatName")
    protected PayeeCatNameType payeeCatName;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PmtIntentType")
    protected PmtIntentTypeType pmtIntentType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
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
     * Gets the value of the payeeAddrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeAddrInfoCType }
     *     
     */
    public PayeeAddrInfoCType getPayeeAddrInfo() {
        return payeeAddrInfo;
    }

    /**
     * Sets the value of the payeeAddrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeAddrInfoCType }
     *     
     */
    public void setPayeeAddrInfo(PayeeAddrInfoCType value) {
        this.payeeAddrInfo = value;
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
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
