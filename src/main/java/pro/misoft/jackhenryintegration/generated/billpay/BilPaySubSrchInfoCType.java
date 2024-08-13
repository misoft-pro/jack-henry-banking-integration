
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
 * A package of data related to a bill pay subscriber
 *     search
 * 
 * <p>Java class for BilPaySubSrchInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPaySubSrchInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubId" type="{http://jackhenry.com/jxchange/TPG/2008}SubId_Type"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SecdPersonArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_AType" minOccurs="0"/&gt;
 *         &lt;element name="EnrollDt" type="{http://jackhenry.com/jxchange/TPG/2008}EnrollDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubType" type="{http://jackhenry.com/jxchange/TPG/2008}SubType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubStat" type="{http://jackhenry.com/jxchange/TPG/2008}SubStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="SubAssocUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}SubAssocUsrId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PayFromAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *             &lt;element name="PayFromAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *             &lt;element name="PayFromInstRtId" type="{http://jackhenry.com/jxchange/TPG/2008}InstRtId_Type" minOccurs="0"/&gt;
 *             &lt;element name="PayFromAcctOwnName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *             &lt;element name="PayFromAcctOwnAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *             &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *             &lt;element name="EmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="BirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BilPaySubSrchInfo_CType", propOrder = {
    "subId",
    "personName",
    "addr",
    "phoneArray",
    "secdPersonArray",
    "enrollDt",
    "subType",
    "subStat",
    "custom",
    "ver1",
    "subAssocUsrId",
    "ver2",
    "payFromAcctId",
    "payFromAcctType",
    "payFromInstRtId",
    "payFromAcctOwnName",
    "payFromAcctOwnAddr",
    "taxId",
    "emailArray",
    "birthDt",
    "ver3",
    "any"
})
public class BilPaySubSrchInfoCType {

    @XmlElement(name = "SubId", required = true)
    protected SubIdType subId;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "PhoneArray")
    protected PhoneArrayAType phoneArray;
    @XmlElement(name = "SecdPersonArray")
    protected AcctTitleAType secdPersonArray;
    @XmlElement(name = "EnrollDt")
    protected EnrollDtType enrollDt;
    @XmlElementRef(name = "SubType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SubTypeType> subType;
    @XmlElementRef(name = "SubStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SubStatType> subStat;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "SubAssocUsrId")
    protected SubAssocUsrIdType subAssocUsrId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PayFromAcctId")
    protected AcctIdType payFromAcctId;
    @XmlElement(name = "PayFromAcctType")
    protected AcctTypeType payFromAcctType;
    @XmlElement(name = "PayFromInstRtId")
    protected InstRtIdType payFromInstRtId;
    @XmlElement(name = "PayFromAcctOwnName")
    protected PersonNameCType payFromAcctOwnName;
    @XmlElement(name = "PayFromAcctOwnAddr")
    protected AddrCType payFromAcctOwnAddr;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "EmailArray")
    protected EmailArrayAType emailArray;
    @XmlElement(name = "BirthDt")
    protected BirthDtType birthDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the subId property.
     * 
     * @return
     *     possible object is
     *     {@link SubIdType }
     *     
     */
    public SubIdType getSubId() {
        return subId;
    }

    /**
     * Sets the value of the subId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubIdType }
     *     
     */
    public void setSubId(SubIdType value) {
        this.subId = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setPersonName(PersonNameCType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setAddr(AddrCType value) {
        this.addr = value;
    }

    /**
     * Gets the value of the phoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getPhoneArray() {
        return phoneArray;
    }

    /**
     * Sets the value of the phoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setPhoneArray(PhoneArrayAType value) {
        this.phoneArray = value;
    }

    /**
     * Gets the value of the secdPersonArray property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTitleAType }
     *     
     */
    public AcctTitleAType getSecdPersonArray() {
        return secdPersonArray;
    }

    /**
     * Sets the value of the secdPersonArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTitleAType }
     *     
     */
    public void setSecdPersonArray(AcctTitleAType value) {
        this.secdPersonArray = value;
    }

    /**
     * Gets the value of the enrollDt property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollDtType }
     *     
     */
    public EnrollDtType getEnrollDt() {
        return enrollDt;
    }

    /**
     * Sets the value of the enrollDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollDtType }
     *     
     */
    public void setEnrollDt(EnrollDtType value) {
        this.enrollDt = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubTypeType }{@code >}
     *     
     */
    public JAXBElement<SubTypeType> getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubTypeType }{@code >}
     *     
     */
    public void setSubType(JAXBElement<SubTypeType> value) {
        this.subType = value;
    }

    /**
     * Gets the value of the subStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubStatType }{@code >}
     *     
     */
    public JAXBElement<SubStatType> getSubStat() {
        return subStat;
    }

    /**
     * Sets the value of the subStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubStatType }{@code >}
     *     
     */
    public void setSubStat(JAXBElement<SubStatType> value) {
        this.subStat = value;
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
     * Gets the value of the subAssocUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link SubAssocUsrIdType }
     *     
     */
    public SubAssocUsrIdType getSubAssocUsrId() {
        return subAssocUsrId;
    }

    /**
     * Sets the value of the subAssocUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAssocUsrIdType }
     *     
     */
    public void setSubAssocUsrId(SubAssocUsrIdType value) {
        this.subAssocUsrId = value;
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
     * Gets the value of the payFromAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getPayFromAcctId() {
        return payFromAcctId;
    }

    /**
     * Sets the value of the payFromAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setPayFromAcctId(AcctIdType value) {
        this.payFromAcctId = value;
    }

    /**
     * Gets the value of the payFromAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getPayFromAcctType() {
        return payFromAcctType;
    }

    /**
     * Sets the value of the payFromAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setPayFromAcctType(AcctTypeType value) {
        this.payFromAcctType = value;
    }

    /**
     * Gets the value of the payFromInstRtId property.
     * 
     * @return
     *     possible object is
     *     {@link InstRtIdType }
     *     
     */
    public InstRtIdType getPayFromInstRtId() {
        return payFromInstRtId;
    }

    /**
     * Sets the value of the payFromInstRtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstRtIdType }
     *     
     */
    public void setPayFromInstRtId(InstRtIdType value) {
        this.payFromInstRtId = value;
    }

    /**
     * Gets the value of the payFromAcctOwnName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getPayFromAcctOwnName() {
        return payFromAcctOwnName;
    }

    /**
     * Sets the value of the payFromAcctOwnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setPayFromAcctOwnName(PersonNameCType value) {
        this.payFromAcctOwnName = value;
    }

    /**
     * Gets the value of the payFromAcctOwnAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getPayFromAcctOwnAddr() {
        return payFromAcctOwnAddr;
    }

    /**
     * Sets the value of the payFromAcctOwnAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setPayFromAcctOwnAddr(AddrCType value) {
        this.payFromAcctOwnAddr = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setTaxId(TaxIdType value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the emailArray property.
     * 
     * @return
     *     possible object is
     *     {@link EmailArrayAType }
     *     
     */
    public EmailArrayAType getEmailArray() {
        return emailArray;
    }

    /**
     * Sets the value of the emailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailArrayAType }
     *     
     */
    public void setEmailArray(EmailArrayAType value) {
        this.emailArray = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDtType }
     *     
     */
    public BirthDtType getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDtType }
     *     
     */
    public void setBirthDt(BirthDtType value) {
        this.birthDt = value;
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
