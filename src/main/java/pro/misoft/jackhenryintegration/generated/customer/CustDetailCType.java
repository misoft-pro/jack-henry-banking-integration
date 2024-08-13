
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for CustDetail_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustDetail_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustType" type="{http://jackhenry.com/jxchange/TPG/2008}CustType_Type" minOccurs="0"/&gt;
 *         &lt;element name="NAICSCode" type="{http://jackhenry.com/jxchange/TPG/2008}NAICSCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StdIndustCode" type="{http://jackhenry.com/jxchange/TPG/2008}StdIndustCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://jackhenry.com/jxchange/TPG/2008}Gender_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmplName" type="{http://jackhenry.com/jxchange/TPG/2008}EmplName_Type" minOccurs="0"/&gt;
 *         &lt;element name="OccType" type="{http://jackhenry.com/jxchange/TPG/2008}OccType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustOrgDt" type="{http://jackhenry.com/jxchange/TPG/2008}CustOrgDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Deceased" type="{http://jackhenry.com/jxchange/TPG/2008}Deceased_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeceasedDt" type="{http://jackhenry.com/jxchange/TPG/2008}DeceasedDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="HouseHoldNum" type="{http://jackhenry.com/jxchange/TPG/2008}HouseHoldNum_Type" minOccurs="0"/&gt;
 *           &lt;element name="HouseHoldName" type="{http://jackhenry.com/jxchange/TPG/2008}HouseHoldName_Type" minOccurs="0"/&gt;
 *           &lt;element name="SpouseName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="EmplTitle" type="{http://jackhenry.com/jxchange/TPG/2008}EmplTitle_Type" minOccurs="0"/&gt;
 *             &lt;element name="AnnIncmAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AnnIncmAmt_Type" minOccurs="0"/&gt;
 *             &lt;element name="AssetTotAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AssetTotAmt_Type" minOccurs="0"/&gt;
 *             &lt;element name="EducLvl" type="{http://jackhenry.com/jxchange/TPG/2008}EducLvl_Type" minOccurs="0"/&gt;
 *             &lt;element name="HouseHoldMbrArray" type="{http://jackhenry.com/jxchange/TPG/2008}HouseHoldMbrArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="CustCrtRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustCrtRsnCode_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="CrScoreArray" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreArray_AType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="WithNot" type="{http://jackhenry.com/jxchange/TPG/2008}WithNot_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CustDetail_CType", propOrder = {
    "personName",
    "addr",
    "custType",
    "naicsCode",
    "stdIndustCode",
    "gender",
    "birthDt",
    "emplName",
    "occType",
    "custOrgDt",
    "lastMainDt",
    "deceased",
    "deceasedDt",
    "emailArray",
    "phoneArray",
    "custom",
    "ver1",
    "houseHoldNum",
    "houseHoldName",
    "spouseName",
    "ver2",
    "emplTitle",
    "annIncmAmt",
    "assetTotAmt",
    "educLvl",
    "houseHoldMbrArray",
    "ver3",
    "custCrtRsnCode",
    "ver4",
    "crScoreArray",
    "ver5",
    "withNot",
    "ver6",
    "any"
})
public class CustDetailCType {

    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElementRef(name = "CustType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustTypeType> custType;
    @XmlElementRef(name = "NAICSCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NAICSCodeType> naicsCode;
    @XmlElementRef(name = "StdIndustCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StdIndustCodeType> stdIndustCode;
    @XmlElementRef(name = "Gender", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GenderType> gender;
    @XmlElementRef(name = "BirthDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BirthDtType> birthDt;
    @XmlElementRef(name = "EmplName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmplNameType> emplName;
    @XmlElementRef(name = "OccType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OccTypeType> occType;
    @XmlElementRef(name = "CustOrgDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustOrgDtType> custOrgDt;
    @XmlElementRef(name = "LastMainDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastMainDtType> lastMainDt;
    @XmlElementRef(name = "Deceased", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DeceasedType> deceased;
    @XmlElementRef(name = "DeceasedDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DeceasedDtType> deceasedDt;
    @XmlElement(name = "EmailArray")
    protected EmailArrayAType emailArray;
    @XmlElement(name = "PhoneArray")
    protected PhoneArrayAType phoneArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "HouseHoldNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HouseHoldNumType> houseHoldNum;
    @XmlElementRef(name = "HouseHoldName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HouseHoldNameType> houseHoldName;
    @XmlElementRef(name = "SpouseName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonNameCType> spouseName;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "EmplTitle", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmplTitleType> emplTitle;
    @XmlElementRef(name = "AnnIncmAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AnnIncmAmtType> annIncmAmt;
    @XmlElementRef(name = "AssetTotAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AssetTotAmtType> assetTotAmt;
    @XmlElementRef(name = "EducLvl", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EducLvlType> educLvl;
    @XmlElement(name = "HouseHoldMbrArray")
    protected HouseHoldMbrArrayAType houseHoldMbrArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "CustCrtRsnCode")
    protected CustCrtRsnCodeType custCrtRsnCode;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "CrScoreArray")
    protected CrScoreArrayAType crScoreArray;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "WithNot")
    protected WithNotType withNot;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustTypeType }{@code >}
     *     
     */
    public JAXBElement<CustTypeType> getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustTypeType }{@code >}
     *     
     */
    public void setCustType(JAXBElement<CustTypeType> value) {
        this.custType = value;
    }

    /**
     * Gets the value of the naicsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NAICSCodeType }{@code >}
     *     
     */
    public JAXBElement<NAICSCodeType> getNAICSCode() {
        return naicsCode;
    }

    /**
     * Sets the value of the naicsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NAICSCodeType }{@code >}
     *     
     */
    public void setNAICSCode(JAXBElement<NAICSCodeType> value) {
        this.naicsCode = value;
    }

    /**
     * Gets the value of the stdIndustCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StdIndustCodeType }{@code >}
     *     
     */
    public JAXBElement<StdIndustCodeType> getStdIndustCode() {
        return stdIndustCode;
    }

    /**
     * Sets the value of the stdIndustCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StdIndustCodeType }{@code >}
     *     
     */
    public void setStdIndustCode(JAXBElement<StdIndustCodeType> value) {
        this.stdIndustCode = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GenderType }{@code >}
     *     
     */
    public JAXBElement<GenderType> getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GenderType }{@code >}
     *     
     */
    public void setGender(JAXBElement<GenderType> value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BirthDtType }{@code >}
     *     
     */
    public JAXBElement<BirthDtType> getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BirthDtType }{@code >}
     *     
     */
    public void setBirthDt(JAXBElement<BirthDtType> value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the emplName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}
     *     
     */
    public JAXBElement<EmplNameType> getEmplName() {
        return emplName;
    }

    /**
     * Sets the value of the emplName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}
     *     
     */
    public void setEmplName(JAXBElement<EmplNameType> value) {
        this.emplName = value;
    }

    /**
     * Gets the value of the occType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OccTypeType }{@code >}
     *     
     */
    public JAXBElement<OccTypeType> getOccType() {
        return occType;
    }

    /**
     * Sets the value of the occType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OccTypeType }{@code >}
     *     
     */
    public void setOccType(JAXBElement<OccTypeType> value) {
        this.occType = value;
    }

    /**
     * Gets the value of the custOrgDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustOrgDtType }{@code >}
     *     
     */
    public JAXBElement<CustOrgDtType> getCustOrgDt() {
        return custOrgDt;
    }

    /**
     * Sets the value of the custOrgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustOrgDtType }{@code >}
     *     
     */
    public void setCustOrgDt(JAXBElement<CustOrgDtType> value) {
        this.custOrgDt = value;
    }

    /**
     * Gets the value of the lastMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastMainDtType }{@code >}
     *     
     */
    public JAXBElement<LastMainDtType> getLastMainDt() {
        return lastMainDt;
    }

    /**
     * Sets the value of the lastMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastMainDtType }{@code >}
     *     
     */
    public void setLastMainDt(JAXBElement<LastMainDtType> value) {
        this.lastMainDt = value;
    }

    /**
     * Gets the value of the deceased property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeceasedType }{@code >}
     *     
     */
    public JAXBElement<DeceasedType> getDeceased() {
        return deceased;
    }

    /**
     * Sets the value of the deceased property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeceasedType }{@code >}
     *     
     */
    public void setDeceased(JAXBElement<DeceasedType> value) {
        this.deceased = value;
    }

    /**
     * Gets the value of the deceasedDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeceasedDtType }{@code >}
     *     
     */
    public JAXBElement<DeceasedDtType> getDeceasedDt() {
        return deceasedDt;
    }

    /**
     * Sets the value of the deceasedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeceasedDtType }{@code >}
     *     
     */
    public void setDeceasedDt(JAXBElement<DeceasedDtType> value) {
        this.deceasedDt = value;
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
     * Gets the value of the houseHoldNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HouseHoldNumType }{@code >}
     *     
     */
    public JAXBElement<HouseHoldNumType> getHouseHoldNum() {
        return houseHoldNum;
    }

    /**
     * Sets the value of the houseHoldNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HouseHoldNumType }{@code >}
     *     
     */
    public void setHouseHoldNum(JAXBElement<HouseHoldNumType> value) {
        this.houseHoldNum = value;
    }

    /**
     * Gets the value of the houseHoldName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HouseHoldNameType }{@code >}
     *     
     */
    public JAXBElement<HouseHoldNameType> getHouseHoldName() {
        return houseHoldName;
    }

    /**
     * Sets the value of the houseHoldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HouseHoldNameType }{@code >}
     *     
     */
    public void setHouseHoldName(JAXBElement<HouseHoldNameType> value) {
        this.houseHoldName = value;
    }

    /**
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}
     *     
     */
    public JAXBElement<PersonNameCType> getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}
     *     
     */
    public void setSpouseName(JAXBElement<PersonNameCType> value) {
        this.spouseName = value;
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
     * Gets the value of the emplTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmplTitleType }{@code >}
     *     
     */
    public JAXBElement<EmplTitleType> getEmplTitle() {
        return emplTitle;
    }

    /**
     * Sets the value of the emplTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmplTitleType }{@code >}
     *     
     */
    public void setEmplTitle(JAXBElement<EmplTitleType> value) {
        this.emplTitle = value;
    }

    /**
     * Gets the value of the annIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnnIncmAmtType }{@code >}
     *     
     */
    public JAXBElement<AnnIncmAmtType> getAnnIncmAmt() {
        return annIncmAmt;
    }

    /**
     * Sets the value of the annIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnnIncmAmtType }{@code >}
     *     
     */
    public void setAnnIncmAmt(JAXBElement<AnnIncmAmtType> value) {
        this.annIncmAmt = value;
    }

    /**
     * Gets the value of the assetTotAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssetTotAmtType }{@code >}
     *     
     */
    public JAXBElement<AssetTotAmtType> getAssetTotAmt() {
        return assetTotAmt;
    }

    /**
     * Sets the value of the assetTotAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssetTotAmtType }{@code >}
     *     
     */
    public void setAssetTotAmt(JAXBElement<AssetTotAmtType> value) {
        this.assetTotAmt = value;
    }

    /**
     * Gets the value of the educLvl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EducLvlType }{@code >}
     *     
     */
    public JAXBElement<EducLvlType> getEducLvl() {
        return educLvl;
    }

    /**
     * Sets the value of the educLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EducLvlType }{@code >}
     *     
     */
    public void setEducLvl(JAXBElement<EducLvlType> value) {
        this.educLvl = value;
    }

    /**
     * Gets the value of the houseHoldMbrArray property.
     * 
     * @return
     *     possible object is
     *     {@link HouseHoldMbrArrayAType }
     *     
     */
    public HouseHoldMbrArrayAType getHouseHoldMbrArray() {
        return houseHoldMbrArray;
    }

    /**
     * Sets the value of the houseHoldMbrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseHoldMbrArrayAType }
     *     
     */
    public void setHouseHoldMbrArray(HouseHoldMbrArrayAType value) {
        this.houseHoldMbrArray = value;
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
     * Gets the value of the custCrtRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustCrtRsnCodeType }
     *     
     */
    public CustCrtRsnCodeType getCustCrtRsnCode() {
        return custCrtRsnCode;
    }

    /**
     * Sets the value of the custCrtRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustCrtRsnCodeType }
     *     
     */
    public void setCustCrtRsnCode(CustCrtRsnCodeType value) {
        this.custCrtRsnCode = value;
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
     * Gets the value of the crScoreArray property.
     * 
     * @return
     *     possible object is
     *     {@link CrScoreArrayAType }
     *     
     */
    public CrScoreArrayAType getCrScoreArray() {
        return crScoreArray;
    }

    /**
     * Sets the value of the crScoreArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrScoreArrayAType }
     *     
     */
    public void setCrScoreArray(CrScoreArrayAType value) {
        this.crScoreArray = value;
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
     * Gets the value of the withNot property.
     * 
     * @return
     *     possible object is
     *     {@link WithNotType }
     *     
     */
    public WithNotType getWithNot() {
        return withNot;
    }

    /**
     * Sets the value of the withNot property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithNotType }
     *     
     */
    public void setWithNot(WithNotType value) {
        this.withNot = value;
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
