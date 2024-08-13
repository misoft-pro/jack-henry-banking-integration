
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PltfmAppSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmId" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmId_Type"/&gt;
 *         &lt;element name="ConsmSrcCode" type="{http://jackhenry.com/jxchange/TPG/2008}ConsmSrcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConsmSrcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ConsmSrcDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmAppSrcCode" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppSrcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmAppSrcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppSrcDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmAppDecCode" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppDecCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmAppDecDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppDecDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmAppTaskType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppTaskType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmAcctTypeCode" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAcctTypeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmClsfPrimType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmClsfPrimType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmCustType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmCustType_Type" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://jackhenry.com/jxchange/TPG/2008}FirstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://jackhenry.com/jxchange/TPG/2008}MiddleName_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://jackhenry.com/jxchange/TPG/2008}LastName_Type" minOccurs="0"/&gt;
 *         &lt;element name="BusName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddr" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr1_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddr" type="{http://jackhenry.com/jxchange/TPG/2008}EmailAddr_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNum" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmStat" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegionCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RegionDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RegionDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmProdCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppDt" type="{http://jackhenry.com/jxchange/TPG/2008}AppDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmAppSrchRec_CType", propOrder = {
    "pltfmId",
    "consmSrcCode",
    "consmSrcDesc",
    "pltfmAppSrcCode",
    "pltfmAppSrcDesc",
    "pltfmAppDecCode",
    "pltfmAppDecDesc",
    "pltfmAppTaskType",
    "pltfmAcctTypeCode",
    "pltfmClsfPrimType",
    "pltfmCustType",
    "firstName",
    "middleName",
    "lastName",
    "busName",
    "taxId",
    "streetAddr",
    "emailAddr",
    "phoneNum",
    "accountId",
    "custId",
    "pltfmStat",
    "pltfmStatDesc",
    "regionCode",
    "regionDesc",
    "brCode",
    "brDesc",
    "offCode",
    "offDesc",
    "pltfmProdCode",
    "pltfmProdCodeDesc",
    "appDt",
    "custom",
    "ver1",
    "any"
})
public class PltfmAppSrchRecCType {

    @XmlElement(name = "PltfmId", required = true)
    protected PltfmIdType pltfmId;
    @XmlElement(name = "ConsmSrcCode")
    protected ConsmSrcCodeType consmSrcCode;
    @XmlElement(name = "ConsmSrcDesc")
    protected ConsmSrcDescType consmSrcDesc;
    @XmlElement(name = "PltfmAppSrcCode")
    protected PltfmAppSrcCodeType pltfmAppSrcCode;
    @XmlElement(name = "PltfmAppSrcDesc")
    protected PltfmAppSrcDescType pltfmAppSrcDesc;
    @XmlElement(name = "PltfmAppDecCode")
    protected PltfmAppDecCodeType pltfmAppDecCode;
    @XmlElement(name = "PltfmAppDecDesc")
    protected PltfmAppDecDescType pltfmAppDecDesc;
    @XmlElement(name = "PltfmAppTaskType")
    protected PltfmAppTaskTypeType pltfmAppTaskType;
    @XmlElement(name = "PltfmAcctTypeCode")
    protected PltfmAcctTypeCodeType pltfmAcctTypeCode;
    @XmlElement(name = "PltfmClsfPrimType")
    protected PltfmClsfPrimTypeType pltfmClsfPrimType;
    @XmlElement(name = "PltfmCustType")
    protected PltfmCustTypeType pltfmCustType;
    @XmlElement(name = "FirstName")
    protected FirstNameType firstName;
    @XmlElement(name = "MiddleName")
    protected MiddleNameType middleName;
    @XmlElement(name = "LastName")
    protected LastNameType lastName;
    @XmlElement(name = "BusName")
    protected ComNameType busName;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "StreetAddr")
    protected StreetAddr1Type streetAddr;
    @XmlElement(name = "EmailAddr")
    protected EmailAddrType emailAddr;
    @XmlElement(name = "PhoneNum")
    protected PhoneNumType phoneNum;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "PltfmStat")
    protected PltfmStatType pltfmStat;
    @XmlElement(name = "PltfmStatDesc")
    protected PltfmStatDescType pltfmStatDesc;
    @XmlElement(name = "RegionCode")
    protected RegionCodeType regionCode;
    @XmlElement(name = "RegionDesc")
    protected RegionDescType regionDesc;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "OffCode")
    protected OffCodeType offCode;
    @XmlElement(name = "OffDesc")
    protected OffDescType offDesc;
    @XmlElement(name = "PltfmProdCode")
    protected ProdCodeType pltfmProdCode;
    @XmlElement(name = "PltfmProdCodeDesc")
    protected ProdDescType pltfmProdCodeDesc;
    @XmlElement(name = "AppDt")
    protected AppDtType appDt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pltfmId property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmIdType }
     *     
     */
    public PltfmIdType getPltfmId() {
        return pltfmId;
    }

    /**
     * Sets the value of the pltfmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmIdType }
     *     
     */
    public void setPltfmId(PltfmIdType value) {
        this.pltfmId = value;
    }

    /**
     * Gets the value of the consmSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConsmSrcCodeType }
     *     
     */
    public ConsmSrcCodeType getConsmSrcCode() {
        return consmSrcCode;
    }

    /**
     * Sets the value of the consmSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsmSrcCodeType }
     *     
     */
    public void setConsmSrcCode(ConsmSrcCodeType value) {
        this.consmSrcCode = value;
    }

    /**
     * Gets the value of the consmSrcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ConsmSrcDescType }
     *     
     */
    public ConsmSrcDescType getConsmSrcDesc() {
        return consmSrcDesc;
    }

    /**
     * Sets the value of the consmSrcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsmSrcDescType }
     *     
     */
    public void setConsmSrcDesc(ConsmSrcDescType value) {
        this.consmSrcDesc = value;
    }

    /**
     * Gets the value of the pltfmAppSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppSrcCodeType }
     *     
     */
    public PltfmAppSrcCodeType getPltfmAppSrcCode() {
        return pltfmAppSrcCode;
    }

    /**
     * Sets the value of the pltfmAppSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppSrcCodeType }
     *     
     */
    public void setPltfmAppSrcCode(PltfmAppSrcCodeType value) {
        this.pltfmAppSrcCode = value;
    }

    /**
     * Gets the value of the pltfmAppSrcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppSrcDescType }
     *     
     */
    public PltfmAppSrcDescType getPltfmAppSrcDesc() {
        return pltfmAppSrcDesc;
    }

    /**
     * Sets the value of the pltfmAppSrcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppSrcDescType }
     *     
     */
    public void setPltfmAppSrcDesc(PltfmAppSrcDescType value) {
        this.pltfmAppSrcDesc = value;
    }

    /**
     * Gets the value of the pltfmAppDecCode property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppDecCodeType }
     *     
     */
    public PltfmAppDecCodeType getPltfmAppDecCode() {
        return pltfmAppDecCode;
    }

    /**
     * Sets the value of the pltfmAppDecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppDecCodeType }
     *     
     */
    public void setPltfmAppDecCode(PltfmAppDecCodeType value) {
        this.pltfmAppDecCode = value;
    }

    /**
     * Gets the value of the pltfmAppDecDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppDecDescType }
     *     
     */
    public PltfmAppDecDescType getPltfmAppDecDesc() {
        return pltfmAppDecDesc;
    }

    /**
     * Sets the value of the pltfmAppDecDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppDecDescType }
     *     
     */
    public void setPltfmAppDecDesc(PltfmAppDecDescType value) {
        this.pltfmAppDecDesc = value;
    }

    /**
     * Gets the value of the pltfmAppTaskType property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppTaskTypeType }
     *     
     */
    public PltfmAppTaskTypeType getPltfmAppTaskType() {
        return pltfmAppTaskType;
    }

    /**
     * Sets the value of the pltfmAppTaskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppTaskTypeType }
     *     
     */
    public void setPltfmAppTaskType(PltfmAppTaskTypeType value) {
        this.pltfmAppTaskType = value;
    }

    /**
     * Gets the value of the pltfmAcctTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAcctTypeCodeType }
     *     
     */
    public PltfmAcctTypeCodeType getPltfmAcctTypeCode() {
        return pltfmAcctTypeCode;
    }

    /**
     * Sets the value of the pltfmAcctTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAcctTypeCodeType }
     *     
     */
    public void setPltfmAcctTypeCode(PltfmAcctTypeCodeType value) {
        this.pltfmAcctTypeCode = value;
    }

    /**
     * Gets the value of the pltfmClsfPrimType property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmClsfPrimTypeType }
     *     
     */
    public PltfmClsfPrimTypeType getPltfmClsfPrimType() {
        return pltfmClsfPrimType;
    }

    /**
     * Sets the value of the pltfmClsfPrimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmClsfPrimTypeType }
     *     
     */
    public void setPltfmClsfPrimType(PltfmClsfPrimTypeType value) {
        this.pltfmClsfPrimType = value;
    }

    /**
     * Gets the value of the pltfmCustType property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmCustTypeType }
     *     
     */
    public PltfmCustTypeType getPltfmCustType() {
        return pltfmCustType;
    }

    /**
     * Sets the value of the pltfmCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmCustTypeType }
     *     
     */
    public void setPltfmCustType(PltfmCustTypeType value) {
        this.pltfmCustType = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link FirstNameType }
     *     
     */
    public FirstNameType getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstNameType }
     *     
     */
    public void setFirstName(FirstNameType value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link MiddleNameType }
     *     
     */
    public MiddleNameType getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiddleNameType }
     *     
     */
    public void setMiddleName(MiddleNameType value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link LastNameType }
     *     
     */
    public LastNameType getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastNameType }
     *     
     */
    public void setLastName(LastNameType value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the busName property.
     * 
     * @return
     *     possible object is
     *     {@link ComNameType }
     *     
     */
    public ComNameType getBusName() {
        return busName;
    }

    /**
     * Sets the value of the busName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComNameType }
     *     
     */
    public void setBusName(ComNameType value) {
        this.busName = value;
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
     * Gets the value of the streetAddr property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddr1Type }
     *     
     */
    public StreetAddr1Type getStreetAddr() {
        return streetAddr;
    }

    /**
     * Sets the value of the streetAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddr1Type }
     *     
     */
    public void setStreetAddr(StreetAddr1Type value) {
        this.streetAddr = value;
    }

    /**
     * Gets the value of the emailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddrType }
     *     
     */
    public EmailAddrType getEmailAddr() {
        return emailAddr;
    }

    /**
     * Sets the value of the emailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddrType }
     *     
     */
    public void setEmailAddr(EmailAddrType value) {
        this.emailAddr = value;
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
     * Gets the value of the pltfmStat property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmStatType }
     *     
     */
    public PltfmStatType getPltfmStat() {
        return pltfmStat;
    }

    /**
     * Sets the value of the pltfmStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmStatType }
     *     
     */
    public void setPltfmStat(PltfmStatType value) {
        this.pltfmStat = value;
    }

    /**
     * Gets the value of the pltfmStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmStatDescType }
     *     
     */
    public PltfmStatDescType getPltfmStatDesc() {
        return pltfmStatDesc;
    }

    /**
     * Sets the value of the pltfmStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmStatDescType }
     *     
     */
    public void setPltfmStatDesc(PltfmStatDescType value) {
        this.pltfmStatDesc = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCodeType }
     *     
     */
    public RegionCodeType getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCodeType }
     *     
     */
    public void setRegionCode(RegionCodeType value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the regionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RegionDescType }
     *     
     */
    public RegionDescType getRegionDesc() {
        return regionDesc;
    }

    /**
     * Sets the value of the regionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionDescType }
     *     
     */
    public void setRegionDesc(RegionDescType value) {
        this.regionDesc = value;
    }

    /**
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setBrCode(BrCodeType value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the brDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getBrDesc() {
        return brDesc;
    }

    /**
     * Sets the value of the brDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setBrDesc(BrDescType value) {
        this.brDesc = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setOffCode(OffCodeType value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the offDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getOffDesc() {
        return offDesc;
    }

    /**
     * Sets the value of the offDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setOffDesc(OffDescType value) {
        this.offDesc = value;
    }

    /**
     * Gets the value of the pltfmProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCodeType }
     *     
     */
    public ProdCodeType getPltfmProdCode() {
        return pltfmProdCode;
    }

    /**
     * Sets the value of the pltfmProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCodeType }
     *     
     */
    public void setPltfmProdCode(ProdCodeType value) {
        this.pltfmProdCode = value;
    }

    /**
     * Gets the value of the pltfmProdCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ProdDescType }
     *     
     */
    public ProdDescType getPltfmProdCodeDesc() {
        return pltfmProdCodeDesc;
    }

    /**
     * Sets the value of the pltfmProdCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdDescType }
     *     
     */
    public void setPltfmProdCodeDesc(ProdDescType value) {
        this.pltfmProdCodeDesc = value;
    }

    /**
     * Gets the value of the appDt property.
     * 
     * @return
     *     possible object is
     *     {@link AppDtType }
     *     
     */
    public AppDtType getAppDt() {
        return appDt;
    }

    /**
     * Sets the value of the appDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDtType }
     *     
     */
    public void setAppDt(AppDtType value) {
        this.appDt = value;
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
