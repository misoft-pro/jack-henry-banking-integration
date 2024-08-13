
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for BusEntityValidateInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusEntityValidateInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityType" type="{http://jackhenry.com/jxchange/TPG/2008}EntityType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="AcctClsfCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctClsfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TINCode" type="{http://jackhenry.com/jxchange/TPG/2008}TINCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BusStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNum" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneType" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="AddrTermArray" type="{http://jackhenry.com/jxchange/TPG/2008}AddrTermArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PrevAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="PrevAddrTermArray" type="{http://jackhenry.com/jxchange/TPG/2008}AddrTermArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PrincOwnAuthSignerArray" type="{http://jackhenry.com/jxchange/TPG/2008}PrincOwnAuthSignerArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "BusEntityValidateInfoRec_CType", propOrder = {
    "entityType",
    "entityName",
    "acctClsfCode",
    "tinCode",
    "taxId",
    "busStartDt",
    "phoneNum",
    "phoneType",
    "addr",
    "addrTermArray",
    "prevAddr",
    "prevAddrTermArray",
    "princOwnAuthSignerArray",
    "custom",
    "ver1",
    "any"
})
public class BusEntityValidateInfoRecCType {

    @XmlElement(name = "EntityType")
    protected EntityTypeType entityType;
    @XmlElement(name = "EntityName")
    protected PersonNameCType entityName;
    @XmlElement(name = "AcctClsfCode")
    protected AcctClsfCodeType acctClsfCode;
    @XmlElement(name = "TINCode")
    protected TINCodeType tinCode;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "BusStartDt")
    protected StartDtType busStartDt;
    @XmlElement(name = "PhoneNum")
    protected PhoneNumType phoneNum;
    @XmlElement(name = "PhoneType")
    protected PhoneTypeType phoneType;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "AddrTermArray")
    protected AddrTermArrayAType addrTermArray;
    @XmlElement(name = "PrevAddr")
    protected AddrCType prevAddr;
    @XmlElement(name = "PrevAddrTermArray")
    protected AddrTermArrayAType prevAddrTermArray;
    @XmlElement(name = "PrincOwnAuthSignerArray")
    protected PrincOwnAuthSignerArrayAType princOwnAuthSignerArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeType }
     *     
     */
    public EntityTypeType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeType }
     *     
     */
    public void setEntityType(EntityTypeType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setEntityName(PersonNameCType value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the acctClsfCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctClsfCodeType }
     *     
     */
    public AcctClsfCodeType getAcctClsfCode() {
        return acctClsfCode;
    }

    /**
     * Sets the value of the acctClsfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctClsfCodeType }
     *     
     */
    public void setAcctClsfCode(AcctClsfCodeType value) {
        this.acctClsfCode = value;
    }

    /**
     * Gets the value of the tinCode property.
     * 
     * @return
     *     possible object is
     *     {@link TINCodeType }
     *     
     */
    public TINCodeType getTINCode() {
        return tinCode;
    }

    /**
     * Sets the value of the tinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINCodeType }
     *     
     */
    public void setTINCode(TINCodeType value) {
        this.tinCode = value;
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
     * Gets the value of the busStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getBusStartDt() {
        return busStartDt;
    }

    /**
     * Sets the value of the busStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setBusStartDt(StartDtType value) {
        this.busStartDt = value;
    }

    /**
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumType }
     *     
     */
    public PhoneNumType getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumType }
     *     
     */
    public void setPhoneNum(PhoneNumType value) {
        this.phoneNum = value;
    }

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneTypeType }
     *     
     */
    public PhoneTypeType getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneTypeType }
     *     
     */
    public void setPhoneType(PhoneTypeType value) {
        this.phoneType = value;
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
     * Gets the value of the addrTermArray property.
     * 
     * @return
     *     possible object is
     *     {@link AddrTermArrayAType }
     *     
     */
    public AddrTermArrayAType getAddrTermArray() {
        return addrTermArray;
    }

    /**
     * Sets the value of the addrTermArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrTermArrayAType }
     *     
     */
    public void setAddrTermArray(AddrTermArrayAType value) {
        this.addrTermArray = value;
    }

    /**
     * Gets the value of the prevAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getPrevAddr() {
        return prevAddr;
    }

    /**
     * Sets the value of the prevAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setPrevAddr(AddrCType value) {
        this.prevAddr = value;
    }

    /**
     * Gets the value of the prevAddrTermArray property.
     * 
     * @return
     *     possible object is
     *     {@link AddrTermArrayAType }
     *     
     */
    public AddrTermArrayAType getPrevAddrTermArray() {
        return prevAddrTermArray;
    }

    /**
     * Sets the value of the prevAddrTermArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrTermArrayAType }
     *     
     */
    public void setPrevAddrTermArray(AddrTermArrayAType value) {
        this.prevAddrTermArray = value;
    }

    /**
     * Gets the value of the princOwnAuthSignerArray property.
     * 
     * @return
     *     possible object is
     *     {@link PrincOwnAuthSignerArrayAType }
     *     
     */
    public PrincOwnAuthSignerArrayAType getPrincOwnAuthSignerArray() {
        return princOwnAuthSignerArray;
    }

    /**
     * Sets the value of the princOwnAuthSignerArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincOwnAuthSignerArrayAType }
     *     
     */
    public void setPrincOwnAuthSignerArray(PrincOwnAuthSignerArrayAType value) {
        this.princOwnAuthSignerArray = value;
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

}
