
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
 * <p>Java class for PrincOwnAuthSignerRsltInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincOwnAuthSignerRsltInfoRec_CType"&gt;
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
 *         &lt;element name="AltAddrArray" type="{http://jackhenry.com/jxchange/TPG/2008}AltAddrArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="AltBirthDtArray" type="{http://jackhenry.com/jxchange/TPG/2008}AltBirthDtArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="AltDriverLicArray" type="{http://jackhenry.com/jxchange/TPG/2008}AltDriverLicArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="AltPhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}AltPhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="AltNameArray" type="{http://jackhenry.com/jxchange/TPG/2008}AltNameArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="AddrChkType" type="{http://jackhenry.com/jxchange/TPG/2008}AddrChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthDtTaxIdChkType" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDtTaxIdChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthDtChkType" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDtChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="DriverLicChkType" type="{http://jackhenry.com/jxchange/TPG/2008}DriverLicChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="MatchRecChkType" type="{http://jackhenry.com/jxchange/TPG/2008}MatchRecChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdChkOkType" type="{http://jackhenry.com/jxchange/TPG/2008}IdChkOkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Deceased" type="{http://jackhenry.com/jxchange/TPG/2008}Deceased_Type" minOccurs="0"/&gt;
 *         &lt;element name="NameChkType" type="{http://jackhenry.com/jxchange/TPG/2008}NameChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="OFACHitChkType" type="{http://jackhenry.com/jxchange/TPG/2008}OFACHitChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneChkType" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxIdChkType" type="{http://jackhenry.com/jxchange/TPG/2008}TaxIdChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocSetCode" type="{http://jackhenry.com/jxchange/TPG/2008}DocSetCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocSetArray" type="{http://jackhenry.com/jxchange/TPG/2008}DocSetArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "PrincOwnAuthSignerRsltInfoRec_CType", propOrder = {
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
    "altAddrArray",
    "altBirthDtArray",
    "altDriverLicArray",
    "altPhoneArray",
    "altNameArray",
    "addrChkType",
    "birthDtTaxIdChkType",
    "birthDtChkType",
    "driverLicChkType",
    "matchRecChkType",
    "idChkOkType",
    "deceased",
    "nameChkType",
    "ofacHitChkType",
    "phoneChkType",
    "taxIdChkType",
    "docSetCode",
    "docSetArray",
    "custom",
    "ver1",
    "any"
})
public class PrincOwnAuthSignerRsltInfoRecCType {

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
    @XmlElement(name = "AltAddrArray")
    protected AltAddrArrayAType altAddrArray;
    @XmlElement(name = "AltBirthDtArray")
    protected AltBirthDtArrayAType altBirthDtArray;
    @XmlElement(name = "AltDriverLicArray")
    protected AltDriverLicArrayAType altDriverLicArray;
    @XmlElement(name = "AltPhoneArray")
    protected AltPhoneArrayAType altPhoneArray;
    @XmlElement(name = "AltNameArray")
    protected AltNameArrayAType altNameArray;
    @XmlElement(name = "AddrChkType")
    protected AddrChkTypeType addrChkType;
    @XmlElement(name = "BirthDtTaxIdChkType")
    protected BirthDtTaxIdChkTypeType birthDtTaxIdChkType;
    @XmlElement(name = "BirthDtChkType")
    protected BirthDtChkTypeType birthDtChkType;
    @XmlElement(name = "DriverLicChkType")
    protected DriverLicChkTypeType driverLicChkType;
    @XmlElement(name = "MatchRecChkType")
    protected MatchRecChkTypeType matchRecChkType;
    @XmlElement(name = "IdChkOkType")
    protected IdChkOkTypeType idChkOkType;
    @XmlElement(name = "Deceased")
    protected DeceasedType deceased;
    @XmlElement(name = "NameChkType")
    protected NameChkTypeType nameChkType;
    @XmlElement(name = "OFACHitChkType")
    protected OFACHitChkTypeType ofacHitChkType;
    @XmlElement(name = "PhoneChkType")
    protected PhoneChkTypeType phoneChkType;
    @XmlElement(name = "TaxIdChkType")
    protected TaxIdChkTypeType taxIdChkType;
    @XmlElement(name = "DocSetCode")
    protected DocSetCodeType docSetCode;
    @XmlElement(name = "DocSetArray")
    protected DocSetArrayAType docSetArray;
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
     * Gets the value of the altAddrArray property.
     * 
     * @return
     *     possible object is
     *     {@link AltAddrArrayAType }
     *     
     */
    public AltAddrArrayAType getAltAddrArray() {
        return altAddrArray;
    }

    /**
     * Sets the value of the altAddrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltAddrArrayAType }
     *     
     */
    public void setAltAddrArray(AltAddrArrayAType value) {
        this.altAddrArray = value;
    }

    /**
     * Gets the value of the altBirthDtArray property.
     * 
     * @return
     *     possible object is
     *     {@link AltBirthDtArrayAType }
     *     
     */
    public AltBirthDtArrayAType getAltBirthDtArray() {
        return altBirthDtArray;
    }

    /**
     * Sets the value of the altBirthDtArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltBirthDtArrayAType }
     *     
     */
    public void setAltBirthDtArray(AltBirthDtArrayAType value) {
        this.altBirthDtArray = value;
    }

    /**
     * Gets the value of the altDriverLicArray property.
     * 
     * @return
     *     possible object is
     *     {@link AltDriverLicArrayAType }
     *     
     */
    public AltDriverLicArrayAType getAltDriverLicArray() {
        return altDriverLicArray;
    }

    /**
     * Sets the value of the altDriverLicArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltDriverLicArrayAType }
     *     
     */
    public void setAltDriverLicArray(AltDriverLicArrayAType value) {
        this.altDriverLicArray = value;
    }

    /**
     * Gets the value of the altPhoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link AltPhoneArrayAType }
     *     
     */
    public AltPhoneArrayAType getAltPhoneArray() {
        return altPhoneArray;
    }

    /**
     * Sets the value of the altPhoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltPhoneArrayAType }
     *     
     */
    public void setAltPhoneArray(AltPhoneArrayAType value) {
        this.altPhoneArray = value;
    }

    /**
     * Gets the value of the altNameArray property.
     * 
     * @return
     *     possible object is
     *     {@link AltNameArrayAType }
     *     
     */
    public AltNameArrayAType getAltNameArray() {
        return altNameArray;
    }

    /**
     * Sets the value of the altNameArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltNameArrayAType }
     *     
     */
    public void setAltNameArray(AltNameArrayAType value) {
        this.altNameArray = value;
    }

    /**
     * Gets the value of the addrChkType property.
     * 
     * @return
     *     possible object is
     *     {@link AddrChkTypeType }
     *     
     */
    public AddrChkTypeType getAddrChkType() {
        return addrChkType;
    }

    /**
     * Sets the value of the addrChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrChkTypeType }
     *     
     */
    public void setAddrChkType(AddrChkTypeType value) {
        this.addrChkType = value;
    }

    /**
     * Gets the value of the birthDtTaxIdChkType property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDtTaxIdChkTypeType }
     *     
     */
    public BirthDtTaxIdChkTypeType getBirthDtTaxIdChkType() {
        return birthDtTaxIdChkType;
    }

    /**
     * Sets the value of the birthDtTaxIdChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDtTaxIdChkTypeType }
     *     
     */
    public void setBirthDtTaxIdChkType(BirthDtTaxIdChkTypeType value) {
        this.birthDtTaxIdChkType = value;
    }

    /**
     * Gets the value of the birthDtChkType property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDtChkTypeType }
     *     
     */
    public BirthDtChkTypeType getBirthDtChkType() {
        return birthDtChkType;
    }

    /**
     * Sets the value of the birthDtChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDtChkTypeType }
     *     
     */
    public void setBirthDtChkType(BirthDtChkTypeType value) {
        this.birthDtChkType = value;
    }

    /**
     * Gets the value of the driverLicChkType property.
     * 
     * @return
     *     possible object is
     *     {@link DriverLicChkTypeType }
     *     
     */
    public DriverLicChkTypeType getDriverLicChkType() {
        return driverLicChkType;
    }

    /**
     * Sets the value of the driverLicChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverLicChkTypeType }
     *     
     */
    public void setDriverLicChkType(DriverLicChkTypeType value) {
        this.driverLicChkType = value;
    }

    /**
     * Gets the value of the matchRecChkType property.
     * 
     * @return
     *     possible object is
     *     {@link MatchRecChkTypeType }
     *     
     */
    public MatchRecChkTypeType getMatchRecChkType() {
        return matchRecChkType;
    }

    /**
     * Sets the value of the matchRecChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchRecChkTypeType }
     *     
     */
    public void setMatchRecChkType(MatchRecChkTypeType value) {
        this.matchRecChkType = value;
    }

    /**
     * Gets the value of the idChkOkType property.
     * 
     * @return
     *     possible object is
     *     {@link IdChkOkTypeType }
     *     
     */
    public IdChkOkTypeType getIdChkOkType() {
        return idChkOkType;
    }

    /**
     * Sets the value of the idChkOkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdChkOkTypeType }
     *     
     */
    public void setIdChkOkType(IdChkOkTypeType value) {
        this.idChkOkType = value;
    }

    /**
     * Gets the value of the deceased property.
     * 
     * @return
     *     possible object is
     *     {@link DeceasedType }
     *     
     */
    public DeceasedType getDeceased() {
        return deceased;
    }

    /**
     * Sets the value of the deceased property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeceasedType }
     *     
     */
    public void setDeceased(DeceasedType value) {
        this.deceased = value;
    }

    /**
     * Gets the value of the nameChkType property.
     * 
     * @return
     *     possible object is
     *     {@link NameChkTypeType }
     *     
     */
    public NameChkTypeType getNameChkType() {
        return nameChkType;
    }

    /**
     * Sets the value of the nameChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameChkTypeType }
     *     
     */
    public void setNameChkType(NameChkTypeType value) {
        this.nameChkType = value;
    }

    /**
     * Gets the value of the ofacHitChkType property.
     * 
     * @return
     *     possible object is
     *     {@link OFACHitChkTypeType }
     *     
     */
    public OFACHitChkTypeType getOFACHitChkType() {
        return ofacHitChkType;
    }

    /**
     * Sets the value of the ofacHitChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFACHitChkTypeType }
     *     
     */
    public void setOFACHitChkType(OFACHitChkTypeType value) {
        this.ofacHitChkType = value;
    }

    /**
     * Gets the value of the phoneChkType property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneChkTypeType }
     *     
     */
    public PhoneChkTypeType getPhoneChkType() {
        return phoneChkType;
    }

    /**
     * Sets the value of the phoneChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneChkTypeType }
     *     
     */
    public void setPhoneChkType(PhoneChkTypeType value) {
        this.phoneChkType = value;
    }

    /**
     * Gets the value of the taxIdChkType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdChkTypeType }
     *     
     */
    public TaxIdChkTypeType getTaxIdChkType() {
        return taxIdChkType;
    }

    /**
     * Sets the value of the taxIdChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdChkTypeType }
     *     
     */
    public void setTaxIdChkType(TaxIdChkTypeType value) {
        this.taxIdChkType = value;
    }

    /**
     * Gets the value of the docSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocSetCodeType }
     *     
     */
    public DocSetCodeType getDocSetCode() {
        return docSetCode;
    }

    /**
     * Sets the value of the docSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocSetCodeType }
     *     
     */
    public void setDocSetCode(DocSetCodeType value) {
        this.docSetCode = value;
    }

    /**
     * Gets the value of the docSetArray property.
     * 
     * @return
     *     possible object is
     *     {@link DocSetArrayAType }
     *     
     */
    public DocSetArrayAType getDocSetArray() {
        return docSetArray;
    }

    /**
     * Sets the value of the docSetArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocSetArrayAType }
     *     
     */
    public void setDocSetArray(DocSetArrayAType value) {
        this.docSetArray = value;
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
