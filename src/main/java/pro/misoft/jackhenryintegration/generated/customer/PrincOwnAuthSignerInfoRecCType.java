
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
 * <p>Java class for PrincOwnAuthSignerInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincOwnAuthSignerInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrincOwnType" type="{http://jackhenry.com/jxchange/TPG/2008}PrincOwnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="AddrTermArray" type="{http://jackhenry.com/jxchange/TPG/2008}AddrTermArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PrevAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="PrevAddrTermArray" type="{http://jackhenry.com/jxchange/TPG/2008}AddrTermArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="TINCode" type="{http://jackhenry.com/jxchange/TPG/2008}TINCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Taxid" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="IdType" type="{http://jackhenry.com/jxchange/TPG/2008}IdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdStateNum" type="{http://jackhenry.com/jxchange/TPG/2008}DriverLicId_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdStateCode" type="{http://jackhenry.com/jxchange/TPG/2008}StateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PrincOwnAuthSignerInfoRec_CType", propOrder = {
    "princOwnType",
    "name",
    "addr",
    "addrTermArray",
    "prevAddr",
    "prevAddrTermArray",
    "tinCode",
    "taxid",
    "phoneArray",
    "idType",
    "idStateNum",
    "idStateCode",
    "birthDt",
    "custom",
    "ver1",
    "any"
})
public class PrincOwnAuthSignerInfoRecCType {

    @XmlElement(name = "PrincOwnType")
    protected PrincOwnTypeType princOwnType;
    @XmlElement(name = "Name")
    protected PersonNameCType name;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "AddrTermArray")
    protected AddrTermArrayAType addrTermArray;
    @XmlElement(name = "PrevAddr")
    protected AddrCType prevAddr;
    @XmlElement(name = "PrevAddrTermArray")
    protected AddrTermArrayAType prevAddrTermArray;
    @XmlElement(name = "TINCode")
    protected TINCodeType tinCode;
    @XmlElement(name = "Taxid")
    protected TaxIdType taxid;
    @XmlElement(name = "PhoneArray")
    protected PhoneArrayAType phoneArray;
    @XmlElement(name = "IdType")
    protected IdTypeType idType;
    @XmlElement(name = "IdStateNum")
    protected DriverLicIdType idStateNum;
    @XmlElement(name = "IdStateCode")
    protected StateCodeType idStateCode;
    @XmlElement(name = "BirthDt")
    protected BirthDtType birthDt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the princOwnType property.
     * 
     * @return
     *     possible object is
     *     {@link PrincOwnTypeType }
     *     
     */
    public PrincOwnTypeType getPrincOwnType() {
        return princOwnType;
    }

    /**
     * Sets the value of the princOwnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincOwnTypeType }
     *     
     */
    public void setPrincOwnType(PrincOwnTypeType value) {
        this.princOwnType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setName(PersonNameCType value) {
        this.name = value;
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
     * Gets the value of the taxid property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getTaxid() {
        return taxid;
    }

    /**
     * Sets the value of the taxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setTaxid(TaxIdType value) {
        this.taxid = value;
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
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link IdTypeType }
     *     
     */
    public IdTypeType getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdTypeType }
     *     
     */
    public void setIdType(IdTypeType value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idStateNum property.
     * 
     * @return
     *     possible object is
     *     {@link DriverLicIdType }
     *     
     */
    public DriverLicIdType getIdStateNum() {
        return idStateNum;
    }

    /**
     * Sets the value of the idStateNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverLicIdType }
     *     
     */
    public void setIdStateNum(DriverLicIdType value) {
        this.idStateNum = value;
    }

    /**
     * Gets the value of the idStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateCodeType }
     *     
     */
    public StateCodeType getIdStateCode() {
        return idStateCode;
    }

    /**
     * Sets the value of the idStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateCodeType }
     *     
     */
    public void setIdStateCode(StateCodeType value) {
        this.idStateCode = value;
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
