
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RealEstatePropSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstatePropSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="RealEstatePropRec" type="{http://jackhenry.com/jxchange/TPG/2008}RealEstatePropRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="PropCode" type="{http://jackhenry.com/jxchange/TPG/2008}PropCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropKey" type="{http://jackhenry.com/jxchange/TPG/2008}PropKey_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PropDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrossCollatLnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrossCollatLnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomRealEstatePropSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "RealEstatePropSrchRec_CType", propOrder = {
    "personName",
    "accountId",
    "custId",
    "taxId",
    "realEstatePropRec",
    "propCode",
    "propKey",
    "propDesc",
    "crossCollatLnDesc",
    "customRealEstatePropSrchRec",
    "ver1",
    "any"
})
public class RealEstatePropSrchRecCType {

    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "RealEstatePropRec")
    protected RealEstatePropRecCType realEstatePropRec;
    @XmlElement(name = "PropCode")
    protected PropCodeType propCode;
    @XmlElement(name = "PropKey")
    protected PropKeyType propKey;
    @XmlElement(name = "PropDesc")
    protected PropDescType propDesc;
    @XmlElement(name = "CrossCollatLnDesc")
    protected CrossCollatLnDescType crossCollatLnDesc;
    @XmlElement(name = "CustomRealEstatePropSrchRec")
    protected CustomCType customRealEstatePropSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
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
     * Gets the value of the realEstatePropRec property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstatePropRecCType }
     *     
     */
    public RealEstatePropRecCType getRealEstatePropRec() {
        return realEstatePropRec;
    }

    /**
     * Sets the value of the realEstatePropRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstatePropRecCType }
     *     
     */
    public void setRealEstatePropRec(RealEstatePropRecCType value) {
        this.realEstatePropRec = value;
    }

    /**
     * Gets the value of the propCode property.
     * 
     * @return
     *     possible object is
     *     {@link PropCodeType }
     *     
     */
    public PropCodeType getPropCode() {
        return propCode;
    }

    /**
     * Sets the value of the propCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropCodeType }
     *     
     */
    public void setPropCode(PropCodeType value) {
        this.propCode = value;
    }

    /**
     * Gets the value of the propKey property.
     * 
     * @return
     *     possible object is
     *     {@link PropKeyType }
     *     
     */
    public PropKeyType getPropKey() {
        return propKey;
    }

    /**
     * Sets the value of the propKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropKeyType }
     *     
     */
    public void setPropKey(PropKeyType value) {
        this.propKey = value;
    }

    /**
     * Gets the value of the propDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PropDescType }
     *     
     */
    public PropDescType getPropDesc() {
        return propDesc;
    }

    /**
     * Sets the value of the propDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropDescType }
     *     
     */
    public void setPropDesc(PropDescType value) {
        this.propDesc = value;
    }

    /**
     * Gets the value of the crossCollatLnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrossCollatLnDescType }
     *     
     */
    public CrossCollatLnDescType getCrossCollatLnDesc() {
        return crossCollatLnDesc;
    }

    /**
     * Sets the value of the crossCollatLnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossCollatLnDescType }
     *     
     */
    public void setCrossCollatLnDesc(CrossCollatLnDescType value) {
        this.crossCollatLnDesc = value;
    }

    /**
     * Gets the value of the customRealEstatePropSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomRealEstatePropSrchRec() {
        return customRealEstatePropSrchRec;
    }

    /**
     * Sets the value of the customRealEstatePropSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomRealEstatePropSrchRec(CustomCType value) {
        this.customRealEstatePropSrchRec = value;
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

}
