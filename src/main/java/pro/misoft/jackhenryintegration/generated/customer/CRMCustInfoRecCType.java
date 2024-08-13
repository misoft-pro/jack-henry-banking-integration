
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CRMCustInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMCustInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="BirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustProfCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustProfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="HouseHoldProfCode" type="{http://jackhenry.com/jxchange/TPG/2008}HouseHoldProfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustSatfCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustSatfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CRMAddrArray" type="{http://jackhenry.com/jxchange/TPG/2008}CRMAddrArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMCustInfoRec_CType", propOrder = {
    "personName",
    "birthDt",
    "custProfCode",
    "houseHoldProfCode",
    "custSatfCode",
    "crmOffCode",
    "phoneArray",
    "crmAddrArray",
    "userDefInfoArray",
    "custom",
    "ver1",
    "any"
})
public class CRMCustInfoRecCType {

    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "BirthDt")
    protected BirthDtType birthDt;
    @XmlElement(name = "CustProfCode")
    protected CustProfCodeType custProfCode;
    @XmlElement(name = "HouseHoldProfCode")
    protected HouseHoldProfCodeType houseHoldProfCode;
    @XmlElement(name = "CustSatfCode")
    protected CustSatfCodeType custSatfCode;
    @XmlElement(name = "CRMOffCode")
    protected CRMOffCodeType crmOffCode;
    @XmlElement(name = "PhoneArray")
    protected PhoneArrayAType phoneArray;
    @XmlElement(name = "CRMAddrArray")
    protected CRMAddrArrayAType crmAddrArray;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

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
     * Gets the value of the custProfCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustProfCodeType }
     *     
     */
    public CustProfCodeType getCustProfCode() {
        return custProfCode;
    }

    /**
     * Sets the value of the custProfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustProfCodeType }
     *     
     */
    public void setCustProfCode(CustProfCodeType value) {
        this.custProfCode = value;
    }

    /**
     * Gets the value of the houseHoldProfCode property.
     * 
     * @return
     *     possible object is
     *     {@link HouseHoldProfCodeType }
     *     
     */
    public HouseHoldProfCodeType getHouseHoldProfCode() {
        return houseHoldProfCode;
    }

    /**
     * Sets the value of the houseHoldProfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseHoldProfCodeType }
     *     
     */
    public void setHouseHoldProfCode(HouseHoldProfCodeType value) {
        this.houseHoldProfCode = value;
    }

    /**
     * Gets the value of the custSatfCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustSatfCodeType }
     *     
     */
    public CustSatfCodeType getCustSatfCode() {
        return custSatfCode;
    }

    /**
     * Sets the value of the custSatfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustSatfCodeType }
     *     
     */
    public void setCustSatfCode(CustSatfCodeType value) {
        this.custSatfCode = value;
    }

    /**
     * Gets the value of the crmOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getCRMOffCode() {
        return crmOffCode;
    }

    /**
     * Sets the value of the crmOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setCRMOffCode(CRMOffCodeType value) {
        this.crmOffCode = value;
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
     * Gets the value of the crmAddrArray property.
     * 
     * @return
     *     possible object is
     *     {@link CRMAddrArrayAType }
     *     
     */
    public CRMAddrArrayAType getCRMAddrArray() {
        return crmAddrArray;
    }

    /**
     * Sets the value of the crmAddrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMAddrArrayAType }
     *     
     */
    public void setCRMAddrArray(CRMAddrArrayAType value) {
        this.crmAddrArray = value;
    }

    /**
     * Gets the value of the userDefInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public UserDefInfoArrayAType getUserDefInfoArray() {
        return userDefInfoArray;
    }

    /**
     * Sets the value of the userDefInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public void setUserDefInfoArray(UserDefInfoArrayAType value) {
        this.userDefInfoArray = value;
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

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
