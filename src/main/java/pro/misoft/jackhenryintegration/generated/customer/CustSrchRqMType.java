
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
 * <p>Java class for CustSrchRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustSrchRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRqHdr_CType"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNum" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustType" type="{http://jackhenry.com/jxchange/TPG/2008}CustType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="IntnetFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="SrchAddr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchAddr_Type" minOccurs="0"/&gt;
 *             &lt;element name="SrchCity" type="{http://jackhenry.com/jxchange/TPG/2008}SrchCity_Type" minOccurs="0"/&gt;
 *             &lt;element name="AddrCat" type="{http://jackhenry.com/jxchange/TPG/2008}AddrCat_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="State" type="{http://jackhenry.com/jxchange/TPG/2008}State_Type" minOccurs="0"/&gt;
 *               &lt;element name="PostalCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostalCode_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="IncXtendElemArray" type="{http://jackhenry.com/jxchange/TPG/2008}IncXtendElem_AType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="EmailAddr" type="{http://jackhenry.com/jxchange/TPG/2008}EmailAddr_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="BrandCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrandCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CustSrchRq_MType", propOrder = {
    "srchMsgRqHdr",
    "personName",
    "phoneNum",
    "accountId",
    "taxId",
    "custType",
    "custom",
    "ver1",
    "intnetFinInstId",
    "ver2",
    "srchAddr",
    "srchCity",
    "addrCat",
    "ver3",
    "state",
    "postalCode",
    "ver4",
    "incXtendElemArray",
    "ver5",
    "emailAddr",
    "ver6",
    "brandCode",
    "ver7",
    "any"
})
public class CustSrchRqMType {

    @XmlElement(name = "SrchMsgRqHdr", required = true)
    protected SrchMsgRqHdrCType srchMsgRqHdr;
    @XmlElementRef(name = "PersonName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonNameCType> personName;
    @XmlElementRef(name = "PhoneNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneNumType> phoneNum;
    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElementRef(name = "TaxId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxIdType> taxId;
    @XmlElementRef(name = "CustType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustTypeType> custType;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "IntnetFinInstId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntnetFinInstIdType> intnetFinInstId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "SrchAddr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SrchAddrType> srchAddr;
    @XmlElementRef(name = "SrchCity", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SrchCityType> srchCity;
    @XmlElementRef(name = "AddrCat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AddrCatType> addrCat;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElementRef(name = "State", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateType> state;
    @XmlElementRef(name = "PostalCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostalCodeType> postalCode;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElementRef(name = "IncXtendElemArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IncXtendElemAType> incXtendElemArray;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElementRef(name = "EmailAddr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmailAddrType> emailAddr;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElementRef(name = "BrandCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrandCodeType> brandCode;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the srchMsgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public SrchMsgRqHdrCType getSrchMsgRqHdr() {
        return srchMsgRqHdr;
    }

    /**
     * Sets the value of the srchMsgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public void setSrchMsgRqHdr(SrchMsgRqHdrCType value) {
        this.srchMsgRqHdr = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}
     *     
     */
    public JAXBElement<PersonNameCType> getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}
     *     
     */
    public void setPersonName(JAXBElement<PersonNameCType> value) {
        this.personName = value;
    }

    /**
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhoneNumType }{@code >}
     *     
     */
    public JAXBElement<PhoneNumType> getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhoneNumType }{@code >}
     *     
     */
    public void setPhoneNum(JAXBElement<PhoneNumType> value) {
        this.phoneNum = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<AccountIdCType> value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}
     *     
     */
    public JAXBElement<TaxIdType> getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}
     *     
     */
    public void setTaxId(JAXBElement<TaxIdType> value) {
        this.taxId = value;
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
     * Gets the value of the intnetFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstIdType }{@code >}
     *     
     */
    public JAXBElement<IntnetFinInstIdType> getIntnetFinInstId() {
        return intnetFinInstId;
    }

    /**
     * Sets the value of the intnetFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstIdType }{@code >}
     *     
     */
    public void setIntnetFinInstId(JAXBElement<IntnetFinInstIdType> value) {
        this.intnetFinInstId = value;
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
     * Gets the value of the srchAddr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SrchAddrType }{@code >}
     *     
     */
    public JAXBElement<SrchAddrType> getSrchAddr() {
        return srchAddr;
    }

    /**
     * Sets the value of the srchAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SrchAddrType }{@code >}
     *     
     */
    public void setSrchAddr(JAXBElement<SrchAddrType> value) {
        this.srchAddr = value;
    }

    /**
     * Gets the value of the srchCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SrchCityType }{@code >}
     *     
     */
    public JAXBElement<SrchCityType> getSrchCity() {
        return srchCity;
    }

    /**
     * Sets the value of the srchCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SrchCityType }{@code >}
     *     
     */
    public void setSrchCity(JAXBElement<SrchCityType> value) {
        this.srchCity = value;
    }

    /**
     * Gets the value of the addrCat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddrCatType }{@code >}
     *     
     */
    public JAXBElement<AddrCatType> getAddrCat() {
        return addrCat;
    }

    /**
     * Sets the value of the addrCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddrCatType }{@code >}
     *     
     */
    public void setAddrCat(JAXBElement<AddrCatType> value) {
        this.addrCat = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateType }{@code >}
     *     
     */
    public JAXBElement<StateType> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateType }{@code >}
     *     
     */
    public void setState(JAXBElement<StateType> value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostalCodeType }{@code >}
     *     
     */
    public JAXBElement<PostalCodeType> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostalCodeType }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<PostalCodeType> value) {
        this.postalCode = value;
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
     * Gets the value of the incXtendElemArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncXtendElemAType }{@code >}
     *     
     */
    public JAXBElement<IncXtendElemAType> getIncXtendElemArray() {
        return incXtendElemArray;
    }

    /**
     * Sets the value of the incXtendElemArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncXtendElemAType }{@code >}
     *     
     */
    public void setIncXtendElemArray(JAXBElement<IncXtendElemAType> value) {
        this.incXtendElemArray = value;
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
     * Gets the value of the emailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmailAddrType }{@code >}
     *     
     */
    public JAXBElement<EmailAddrType> getEmailAddr() {
        return emailAddr;
    }

    /**
     * Sets the value of the emailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmailAddrType }{@code >}
     *     
     */
    public void setEmailAddr(JAXBElement<EmailAddrType> value) {
        this.emailAddr = value;
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
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BrandCodeType }{@code >}
     *     
     */
    public JAXBElement<BrandCodeType> getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BrandCodeType }{@code >}
     *     
     */
    public void setBrandCode(JAXBElement<BrandCodeType> value) {
        this.brandCode = value;
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
