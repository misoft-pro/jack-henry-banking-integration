
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
 * A package of data related to a bill pay
 *                 subscriber
 * 
 * <p>Java class for BilPaySubInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPaySubInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="EmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SecdPersonArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_AType" minOccurs="0"/&gt;
 *         &lt;element name="PayFromAcctInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}PayFromAcctInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SubType" type="{http://jackhenry.com/jxchange/TPG/2008}SubType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubComId" type="{http://jackhenry.com/jxchange/TPG/2008}SubComId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubConsmCustId" type="{http://jackhenry.com/jxchange/TPG/2008}SubConsmCustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *           &lt;element name="MktgOptInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}MktgOptInfoArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="TempPswd" type="{http://jackhenry.com/jxchange/TPG/2008}TempPswd_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PmtApprvReq" type="{http://jackhenry.com/jxchange/TPG/2008}PmtApprvReq_Type" minOccurs="0"/&gt;
 *             &lt;element name="PswdChgFreq" type="{http://jackhenry.com/jxchange/TPG/2008}PswdChgFreq_Type" minOccurs="0"/&gt;
 *             &lt;element name="SubAssocUsrInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}SubAssocUsrInfoArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="BirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="SubStat" type="{http://jackhenry.com/jxchange/TPG/2008}SubStat_Type" minOccurs="0"/&gt;
 *                 &lt;element name="SubInActRsnType" type="{http://jackhenry.com/jxchange/TPG/2008}SubInActRsnType_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="SubConsmCapArray" type="{http://jackhenry.com/jxchange/TPG/2008}SubConsmCapArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "BilPaySubInfo_CType", propOrder = {
    "personName",
    "addr",
    "emailArray",
    "phoneArray",
    "secdPersonArray",
    "payFromAcctInfoArray",
    "subType",
    "subComId",
    "subConsmCustId",
    "custom",
    "ver1",
    "taxId",
    "mktgOptInfoArray",
    "tempPswd",
    "ver2",
    "pmtApprvReq",
    "pswdChgFreq",
    "subAssocUsrInfoArray",
    "ver3",
    "birthDt",
    "ver4",
    "subStat",
    "subInActRsnType",
    "ver5",
    "subConsmCapArray",
    "ver6",
    "any"
})
public class BilPaySubInfoCType {

    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "EmailArray")
    protected EmailArrayAType emailArray;
    @XmlElement(name = "PhoneArray")
    protected PhoneArrayAType phoneArray;
    @XmlElement(name = "SecdPersonArray")
    protected AcctTitleAType secdPersonArray;
    @XmlElement(name = "PayFromAcctInfoArray")
    protected PayFromAcctInfoArrayAType payFromAcctInfoArray;
    @XmlElement(name = "SubType")
    protected SubTypeType subType;
    @XmlElement(name = "SubComId")
    protected SubComIdType subComId;
    @XmlElement(name = "SubConsmCustId")
    protected SubConsmCustIdType subConsmCustId;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "MktgOptInfoArray")
    protected MktgOptInfoArrayAType mktgOptInfoArray;
    @XmlElement(name = "TempPswd")
    protected TempPswdType tempPswd;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PmtApprvReq")
    protected PmtApprvReqType pmtApprvReq;
    @XmlElement(name = "PswdChgFreq")
    protected PswdChgFreqType pswdChgFreq;
    @XmlElement(name = "SubAssocUsrInfoArray")
    protected SubAssocUsrInfoArrayAType subAssocUsrInfoArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "BirthDt")
    protected BirthDtType birthDt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "SubStat")
    protected SubStatType subStat;
    @XmlElement(name = "SubInActRsnType")
    protected SubInActRsnTypeType subInActRsnType;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "SubConsmCapArray")
    protected SubConsmCapArrayAType subConsmCapArray;
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
     * Gets the value of the payFromAcctInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link PayFromAcctInfoArrayAType }
     *     
     */
    public PayFromAcctInfoArrayAType getPayFromAcctInfoArray() {
        return payFromAcctInfoArray;
    }

    /**
     * Sets the value of the payFromAcctInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayFromAcctInfoArrayAType }
     *     
     */
    public void setPayFromAcctInfoArray(PayFromAcctInfoArrayAType value) {
        this.payFromAcctInfoArray = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link SubTypeType }
     *     
     */
    public SubTypeType getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubTypeType }
     *     
     */
    public void setSubType(SubTypeType value) {
        this.subType = value;
    }

    /**
     * Gets the value of the subComId property.
     * 
     * @return
     *     possible object is
     *     {@link SubComIdType }
     *     
     */
    public SubComIdType getSubComId() {
        return subComId;
    }

    /**
     * Sets the value of the subComId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubComIdType }
     *     
     */
    public void setSubComId(SubComIdType value) {
        this.subComId = value;
    }

    /**
     * Gets the value of the subConsmCustId property.
     * 
     * @return
     *     possible object is
     *     {@link SubConsmCustIdType }
     *     
     */
    public SubConsmCustIdType getSubConsmCustId() {
        return subConsmCustId;
    }

    /**
     * Sets the value of the subConsmCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubConsmCustIdType }
     *     
     */
    public void setSubConsmCustId(SubConsmCustIdType value) {
        this.subConsmCustId = value;
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
     * Gets the value of the mktgOptInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link MktgOptInfoArrayAType }
     *     
     */
    public MktgOptInfoArrayAType getMktgOptInfoArray() {
        return mktgOptInfoArray;
    }

    /**
     * Sets the value of the mktgOptInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link MktgOptInfoArrayAType }
     *     
     */
    public void setMktgOptInfoArray(MktgOptInfoArrayAType value) {
        this.mktgOptInfoArray = value;
    }

    /**
     * Gets the value of the tempPswd property.
     * 
     * @return
     *     possible object is
     *     {@link TempPswdType }
     *     
     */
    public TempPswdType getTempPswd() {
        return tempPswd;
    }

    /**
     * Sets the value of the tempPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TempPswdType }
     *     
     */
    public void setTempPswd(TempPswdType value) {
        this.tempPswd = value;
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
     * Gets the value of the pmtApprvReq property.
     * 
     * @return
     *     possible object is
     *     {@link PmtApprvReqType }
     *     
     */
    public PmtApprvReqType getPmtApprvReq() {
        return pmtApprvReq;
    }

    /**
     * Sets the value of the pmtApprvReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtApprvReqType }
     *     
     */
    public void setPmtApprvReq(PmtApprvReqType value) {
        this.pmtApprvReq = value;
    }

    /**
     * Gets the value of the pswdChgFreq property.
     * 
     * @return
     *     possible object is
     *     {@link PswdChgFreqType }
     *     
     */
    public PswdChgFreqType getPswdChgFreq() {
        return pswdChgFreq;
    }

    /**
     * Sets the value of the pswdChgFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PswdChgFreqType }
     *     
     */
    public void setPswdChgFreq(PswdChgFreqType value) {
        this.pswdChgFreq = value;
    }

    /**
     * Gets the value of the subAssocUsrInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link SubAssocUsrInfoArrayAType }
     *     
     */
    public SubAssocUsrInfoArrayAType getSubAssocUsrInfoArray() {
        return subAssocUsrInfoArray;
    }

    /**
     * Sets the value of the subAssocUsrInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAssocUsrInfoArrayAType }
     *     
     */
    public void setSubAssocUsrInfoArray(SubAssocUsrInfoArrayAType value) {
        this.subAssocUsrInfoArray = value;
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
     * Gets the value of the subStat property.
     * 
     * @return
     *     possible object is
     *     {@link SubStatType }
     *     
     */
    public SubStatType getSubStat() {
        return subStat;
    }

    /**
     * Sets the value of the subStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubStatType }
     *     
     */
    public void setSubStat(SubStatType value) {
        this.subStat = value;
    }

    /**
     * Gets the value of the subInActRsnType property.
     * 
     * @return
     *     possible object is
     *     {@link SubInActRsnTypeType }
     *     
     */
    public SubInActRsnTypeType getSubInActRsnType() {
        return subInActRsnType;
    }

    /**
     * Sets the value of the subInActRsnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubInActRsnTypeType }
     *     
     */
    public void setSubInActRsnType(SubInActRsnTypeType value) {
        this.subInActRsnType = value;
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
     * Gets the value of the subConsmCapArray property.
     * 
     * @return
     *     possible object is
     *     {@link SubConsmCapArrayAType }
     *     
     */
    public SubConsmCapArrayAType getSubConsmCapArray() {
        return subConsmCapArray;
    }

    /**
     * Sets the value of the subConsmCapArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubConsmCapArrayAType }
     *     
     */
    public void setSubConsmCapArray(SubConsmCapArrayAType value) {
        this.subConsmCapArray = value;
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
