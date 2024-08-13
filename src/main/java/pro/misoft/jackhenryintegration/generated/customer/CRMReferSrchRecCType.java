
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
 * <p>Java class for CRMReferSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMReferSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMReferInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CRMReferInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferId" type="{http://jackhenry.com/jxchange/TPG/2008}ReferId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferCrtOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ReferStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMReferSrchCustom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CRMReferSrchRec_CType", propOrder = {
    "crmReferInfoRec",
    "accountId",
    "taxId",
    "custId",
    "referId",
    "referCrtOffDesc",
    "referOffDesc",
    "referStatDesc",
    "crmReferSrchCustom",
    "ver1",
    "personName",
    "ver2",
    "any"
})
public class CRMReferSrchRecCType {

    @XmlElement(name = "CRMReferInfoRec")
    protected CRMReferInfoRecCType crmReferInfoRec;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "ReferId")
    protected ReferIdType referId;
    @XmlElement(name = "ReferCrtOffDesc")
    protected CRMOffDescType referCrtOffDesc;
    @XmlElement(name = "ReferOffDesc")
    protected CRMOffDescType referOffDesc;
    @XmlElement(name = "ReferStatDesc")
    protected ReferStatDescType referStatDesc;
    @XmlElement(name = "CRMReferSrchCustom")
    protected CustomCType crmReferSrchCustom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the crmReferInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link CRMReferInfoRecCType }
     *     
     */
    public CRMReferInfoRecCType getCRMReferInfoRec() {
        return crmReferInfoRec;
    }

    /**
     * Sets the value of the crmReferInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMReferInfoRecCType }
     *     
     */
    public void setCRMReferInfoRec(CRMReferInfoRecCType value) {
        this.crmReferInfoRec = value;
    }

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
     * Gets the value of the referId property.
     * 
     * @return
     *     possible object is
     *     {@link ReferIdType }
     *     
     */
    public ReferIdType getReferId() {
        return referId;
    }

    /**
     * Sets the value of the referId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferIdType }
     *     
     */
    public void setReferId(ReferIdType value) {
        this.referId = value;
    }

    /**
     * Gets the value of the referCrtOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getReferCrtOffDesc() {
        return referCrtOffDesc;
    }

    /**
     * Sets the value of the referCrtOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setReferCrtOffDesc(CRMOffDescType value) {
        this.referCrtOffDesc = value;
    }

    /**
     * Gets the value of the referOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getReferOffDesc() {
        return referOffDesc;
    }

    /**
     * Sets the value of the referOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setReferOffDesc(CRMOffDescType value) {
        this.referOffDesc = value;
    }

    /**
     * Gets the value of the referStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ReferStatDescType }
     *     
     */
    public ReferStatDescType getReferStatDesc() {
        return referStatDesc;
    }

    /**
     * Sets the value of the referStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferStatDescType }
     *     
     */
    public void setReferStatDesc(ReferStatDescType value) {
        this.referStatDesc = value;
    }

    /**
     * Gets the value of the crmReferSrchCustom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCRMReferSrchCustom() {
        return crmReferSrchCustom;
    }

    /**
     * Sets the value of the crmReferSrchCustom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCRMReferSrchCustom(CustomCType value) {
        this.crmReferSrchCustom = value;
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
