
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CRMCustSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMCustSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="BirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMRelDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustProfCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustProfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustProfDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CustProfDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="HouseHoldProfCode" type="{http://jackhenry.com/jxchange/TPG/2008}HouseHoldProfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="HouseHoldProfDesc" type="{http://jackhenry.com/jxchange/TPG/2008}HouseHoldProfDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustSatfCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustSatfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustSatfDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CustSatfDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMCustSrchCustom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CRMOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="CRMClientId" type="{http://jackhenry.com/jxchange/TPG/2008}CRMClientId_CType" minOccurs="0"/&gt;
 *             &lt;element name="x_CRMAddrArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_CRMAddrArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "CRMCustSrchRec_CType", propOrder = {
    "accountId",
    "taxId",
    "custId",
    "personName",
    "birthDt",
    "crmRelCode",
    "crmRelDesc",
    "custProfCode",
    "custProfDesc",
    "houseHoldProfCode",
    "houseHoldProfDesc",
    "custSatfCode",
    "custSatfDesc",
    "crmCustSrchCustom",
    "ver1",
    "crmOffCode",
    "ver2",
    "crmClientId",
    "xcrmAddrArray",
    "ver3",
    "any"
})
public class CRMCustSrchRecCType {

    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "BirthDt")
    protected BirthDtType birthDt;
    @XmlElement(name = "CRMRelCode")
    protected AcctRelCodeType crmRelCode;
    @XmlElement(name = "CRMRelDesc")
    protected AcctRelDescType crmRelDesc;
    @XmlElement(name = "CustProfCode")
    protected CustProfCodeType custProfCode;
    @XmlElement(name = "CustProfDesc")
    protected CustProfDescType custProfDesc;
    @XmlElement(name = "HouseHoldProfCode")
    protected HouseHoldProfCodeType houseHoldProfCode;
    @XmlElement(name = "HouseHoldProfDesc")
    protected HouseHoldProfDescType houseHoldProfDesc;
    @XmlElement(name = "CustSatfCode")
    protected CustSatfCodeType custSatfCode;
    @XmlElement(name = "CustSatfDesc")
    protected CustSatfDescType custSatfDesc;
    @XmlElement(name = "CRMCustSrchCustom")
    protected CustomCType crmCustSrchCustom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CRMOffCode")
    protected CRMOffCodeType crmOffCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "CRMClientId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRMClientIdCType> crmClientId;
    @XmlElement(name = "x_CRMAddrArray")
    protected XCRMAddrArrayAType xcrmAddrArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setAccountId(AccountIdCType value) {
        this.accountId = value;
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
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
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
     * Gets the value of the crmRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRelCodeType }
     *     
     */
    public AcctRelCodeType getCRMRelCode() {
        return crmRelCode;
    }

    /**
     * Sets the value of the crmRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRelCodeType }
     *     
     */
    public void setCRMRelCode(AcctRelCodeType value) {
        this.crmRelCode = value;
    }

    /**
     * Gets the value of the crmRelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRelDescType }
     *     
     */
    public AcctRelDescType getCRMRelDesc() {
        return crmRelDesc;
    }

    /**
     * Sets the value of the crmRelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRelDescType }
     *     
     */
    public void setCRMRelDesc(AcctRelDescType value) {
        this.crmRelDesc = value;
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
     * Gets the value of the custProfDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CustProfDescType }
     *     
     */
    public CustProfDescType getCustProfDesc() {
        return custProfDesc;
    }

    /**
     * Sets the value of the custProfDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustProfDescType }
     *     
     */
    public void setCustProfDesc(CustProfDescType value) {
        this.custProfDesc = value;
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
     * Gets the value of the houseHoldProfDesc property.
     * 
     * @return
     *     possible object is
     *     {@link HouseHoldProfDescType }
     *     
     */
    public HouseHoldProfDescType getHouseHoldProfDesc() {
        return houseHoldProfDesc;
    }

    /**
     * Sets the value of the houseHoldProfDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseHoldProfDescType }
     *     
     */
    public void setHouseHoldProfDesc(HouseHoldProfDescType value) {
        this.houseHoldProfDesc = value;
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
     * Gets the value of the custSatfDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CustSatfDescType }
     *     
     */
    public CustSatfDescType getCustSatfDesc() {
        return custSatfDesc;
    }

    /**
     * Sets the value of the custSatfDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustSatfDescType }
     *     
     */
    public void setCustSatfDesc(CustSatfDescType value) {
        this.custSatfDesc = value;
    }

    /**
     * Gets the value of the crmCustSrchCustom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCRMCustSrchCustom() {
        return crmCustSrchCustom;
    }

    /**
     * Sets the value of the crmCustSrchCustom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCRMCustSrchCustom(CustomCType value) {
        this.crmCustSrchCustom = value;
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
     * Gets the value of the crmClientId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRMClientIdCType }{@code >}
     *     
     */
    public JAXBElement<CRMClientIdCType> getCRMClientId() {
        return crmClientId;
    }

    /**
     * Sets the value of the crmClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRMClientIdCType }{@code >}
     *     
     */
    public void setCRMClientId(JAXBElement<CRMClientIdCType> value) {
        this.crmClientId = value;
    }

    /**
     * Gets the value of the xcrmAddrArray property.
     * 
     * @return
     *     possible object is
     *     {@link XCRMAddrArrayAType }
     *     
     */
    public XCRMAddrArrayAType getXCRMAddrArray() {
        return xcrmAddrArray;
    }

    /**
     * Sets the value of the xcrmAddrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCRMAddrArrayAType }
     *     
     */
    public void setXCRMAddrArray(XCRMAddrArrayAType value) {
        this.xcrmAddrArray = value;
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
