
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
 * <p>Java class for EntityValidateInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityValidateInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityType" type="{http://jackhenry.com/jxchange/TPG/2008}EntityType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://jackhenry.com/jxchange/TPG/2008}Gender_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdType" type="{http://jackhenry.com/jxchange/TPG/2008}IdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdStateNum" type="{http://jackhenry.com/jxchange/TPG/2008}DriverLicId_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdStateCode" type="{http://jackhenry.com/jxchange/TPG/2008}StateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdCntryCode" type="{http://jackhenry.com/jxchange/TPG/2008}CntryType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="AddrTermArray" type="{http://jackhenry.com/jxchange/TPG/2008}AddrTermArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PrevAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNum" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneType" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="AcctClsfCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctClsfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DepAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EntityValidateInfoRec_CType", propOrder = {
    "entityType",
    "entityRelCode",
    "entityName",
    "gender",
    "birthDt",
    "taxId",
    "idType",
    "idStateNum",
    "idStateCode",
    "idCntryCode",
    "idExpDt",
    "addr",
    "addrTermArray",
    "prevAddr",
    "phoneNum",
    "phoneType",
    "accountId",
    "acctClsfCode",
    "depAmt",
    "custom",
    "ver1",
    "any"
})
public class EntityValidateInfoRecCType {

    @XmlElement(name = "EntityType")
    protected EntityTypeType entityType;
    @XmlElement(name = "EntityRelCode")
    protected CustRelCodeType entityRelCode;
    @XmlElement(name = "EntityName")
    protected PersonNameCType entityName;
    @XmlElement(name = "Gender")
    protected GenderType gender;
    @XmlElement(name = "BirthDt")
    protected BirthDtType birthDt;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "IdType")
    protected IdTypeType idType;
    @XmlElement(name = "IdStateNum")
    protected DriverLicIdType idStateNum;
    @XmlElement(name = "IdStateCode")
    protected StateCodeType idStateCode;
    @XmlElement(name = "IdCntryCode")
    protected CntryTypeType idCntryCode;
    @XmlElement(name = "IdExpDt")
    protected ExpDtType idExpDt;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "AddrTermArray")
    protected AddrTermArrayAType addrTermArray;
    @XmlElement(name = "PrevAddr")
    protected AddrCType prevAddr;
    @XmlElement(name = "PhoneNum")
    protected PhoneNumType phoneNum;
    @XmlElement(name = "PhoneType")
    protected PhoneTypeType phoneType;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "AcctClsfCode")
    protected AcctClsfCodeType acctClsfCode;
    @XmlElement(name = "DepAmt")
    protected AmtType depAmt;
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
     * Gets the value of the entityRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustRelCodeType }
     *     
     */
    public CustRelCodeType getEntityRelCode() {
        return entityRelCode;
    }

    /**
     * Sets the value of the entityRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustRelCodeType }
     *     
     */
    public void setEntityRelCode(CustRelCodeType value) {
        this.entityRelCode = value;
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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
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
     * Gets the value of the idCntryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CntryTypeType }
     *     
     */
    public CntryTypeType getIdCntryCode() {
        return idCntryCode;
    }

    /**
     * Sets the value of the idCntryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryTypeType }
     *     
     */
    public void setIdCntryCode(CntryTypeType value) {
        this.idCntryCode = value;
    }

    /**
     * Gets the value of the idExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getIdExpDt() {
        return idExpDt;
    }

    /**
     * Sets the value of the idExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setIdExpDt(ExpDtType value) {
        this.idExpDt = value;
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
     * Gets the value of the depAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getDepAmt() {
        return depAmt;
    }

    /**
     * Sets the value of the depAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setDepAmt(AmtType value) {
        this.depAmt = value;
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
