
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
 * <p>Java class for BilPaySubSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPaySubSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType"/&gt;
 *         &lt;element name="BilPayProd" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayProd_Type" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNum" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="SrchAddr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchAddr_Type" minOccurs="0"/&gt;
 *         &lt;element name="SrchCity" type="{http://jackhenry.com/jxchange/TPG/2008}SrchCity_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubType" type="{http://jackhenry.com/jxchange/TPG/2008}SubType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubStat" type="{http://jackhenry.com/jxchange/TPG/2008}SubStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilPaySubSrchArray" type="{http://jackhenry.com/jxchange/TPG/2008}BilPaySubSrchArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="SubId" type="{http://jackhenry.com/jxchange/TPG/2008}SubId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PayFromAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *             &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *             &lt;element name="EmailAddr" type="{http://jackhenry.com/jxchange/TPG/2008}EmailAddr_Type" minOccurs="0"/&gt;
 *             &lt;element name="PostalCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostalCode_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="EFTCardNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardNum_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BilPaySubSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "bilPayProd",
    "personName",
    "phoneNum",
    "srchAddr",
    "srchCity",
    "subType",
    "subStat",
    "bilPaySubSrchArray",
    "custom",
    "ver1",
    "subId",
    "ver2",
    "payFromAcctId",
    "taxId",
    "emailAddr",
    "postalCode",
    "ver3",
    "eftCardNum",
    "ver4",
    "any"
})
public class BilPaySubSrchRsMType {

    @XmlElement(name = "SrchMsgRsHdr", required = true)
    protected SrchMsgRsHdrCType srchMsgRsHdr;
    @XmlElementRef(name = "BilPayProd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilPayProdType> bilPayProd;
    @XmlElementRef(name = "PersonName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonNameCType> personName;
    @XmlElementRef(name = "PhoneNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneNumType> phoneNum;
    @XmlElementRef(name = "SrchAddr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SrchAddrType> srchAddr;
    @XmlElementRef(name = "SrchCity", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SrchCityType> srchCity;
    @XmlElementRef(name = "SubType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SubTypeType> subType;
    @XmlElementRef(name = "SubStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SubStatType> subStat;
    @XmlElementRef(name = "BilPaySubSrchArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilPaySubSrchArrayAType> bilPaySubSrchArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "SubId")
    protected SubIdType subId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "PayFromAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctIdType> payFromAcctId;
    @XmlElementRef(name = "TaxId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxIdType> taxId;
    @XmlElementRef(name = "EmailAddr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmailAddrType> emailAddr;
    @XmlElementRef(name = "PostalCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostalCodeType> postalCode;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "EFTCardNum")
    protected EFTCardNumType eftCardNum;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the srchMsgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SrchMsgRsHdrCType }
     *     
     */
    public SrchMsgRsHdrCType getSrchMsgRsHdr() {
        return srchMsgRsHdr;
    }

    /**
     * Sets the value of the srchMsgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrchMsgRsHdrCType }
     *     
     */
    public void setSrchMsgRsHdr(SrchMsgRsHdrCType value) {
        this.srchMsgRsHdr = value;
    }

    /**
     * Gets the value of the bilPayProd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}
     *     
     */
    public JAXBElement<BilPayProdType> getBilPayProd() {
        return bilPayProd;
    }

    /**
     * Sets the value of the bilPayProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}
     *     
     */
    public void setBilPayProd(JAXBElement<BilPayProdType> value) {
        this.bilPayProd = value;
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
     * Gets the value of the bilPaySubSrchArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilPaySubSrchArrayAType }{@code >}
     *     
     */
    public JAXBElement<BilPaySubSrchArrayAType> getBilPaySubSrchArray() {
        return bilPaySubSrchArray;
    }

    /**
     * Sets the value of the bilPaySubSrchArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilPaySubSrchArrayAType }{@code >}
     *     
     */
    public void setBilPaySubSrchArray(JAXBElement<BilPaySubSrchArrayAType> value) {
        this.bilPaySubSrchArray = value;
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
     *     {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}
     *     
     */
    public JAXBElement<AcctIdType> getPayFromAcctId() {
        return payFromAcctId;
    }

    /**
     * Sets the value of the payFromAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}
     *     
     */
    public void setPayFromAcctId(JAXBElement<AcctIdType> value) {
        this.payFromAcctId = value;
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
     * Gets the value of the eftCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardNumType }
     *     
     */
    public EFTCardNumType getEFTCardNum() {
        return eftCardNum;
    }

    /**
     * Sets the value of the eftCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardNumType }
     *     
     */
    public void setEFTCardNum(EFTCardNumType value) {
        this.eftCardNum = value;
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
