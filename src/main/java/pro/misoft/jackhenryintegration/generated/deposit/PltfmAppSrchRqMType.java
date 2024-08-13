
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * <p>Java class for PltfmAppSrchRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppSrchRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRqHdr_CType"/&gt;
 *         &lt;element name="ConsmSrcCode" type="{http://jackhenry.com/jxchange/TPG/2008}ConsmSrcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmAppSrcCode" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppSrcCode_Type" minOccurs="0"/&gt;
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
 *         &lt;element name="PltfmId" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegionCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppRecvStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppRecvEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmAppSrchRq_MType", propOrder = {
    "srchMsgRqHdr",
    "consmSrcCode",
    "pltfmAppSrcCode",
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
    "pltfmId",
    "accountId",
    "custId",
    "regionCode",
    "brCode",
    "offCode",
    "appRecvStartDt",
    "appRecvEndDt",
    "custom",
    "ver1",
    "any"
})
public class PltfmAppSrchRqMType {

    @XmlElement(name = "SrchMsgRqHdr", required = true)
    protected SrchMsgRqHdrCType srchMsgRqHdr;
    @XmlElementRef(name = "ConsmSrcCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsmSrcCodeType> consmSrcCode;
    @XmlElementRef(name = "PltfmAppSrcCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmAppSrcCodeType> pltfmAppSrcCode;
    @XmlElementRef(name = "PltfmAcctTypeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmAcctTypeCodeType> pltfmAcctTypeCode;
    @XmlElementRef(name = "PltfmClsfPrimType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmClsfPrimTypeType> pltfmClsfPrimType;
    @XmlElementRef(name = "PltfmCustType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmCustTypeType> pltfmCustType;
    @XmlElementRef(name = "FirstName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FirstNameType> firstName;
    @XmlElementRef(name = "MiddleName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MiddleNameType> middleName;
    @XmlElementRef(name = "LastName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastNameType> lastName;
    @XmlElementRef(name = "BusName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ComNameType> busName;
    @XmlElementRef(name = "TaxId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxIdType> taxId;
    @XmlElementRef(name = "StreetAddr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StreetAddr1Type> streetAddr;
    @XmlElementRef(name = "EmailAddr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmailAddrType> emailAddr;
    @XmlElementRef(name = "PhoneNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneNumType> phoneNum;
    @XmlElementRef(name = "PltfmId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmIdType> pltfmId;
    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElementRef(name = "CustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustIdType> custId;
    @XmlElementRef(name = "RegionCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionCodeType> regionCode;
    @XmlElementRef(name = "BrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> brCode;
    @XmlElementRef(name = "OffCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OffCodeType> offCode;
    @XmlElementRef(name = "AppRecvStartDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StartDtType> appRecvStartDt;
    @XmlElementRef(name = "AppRecvEndDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EndDtType> appRecvEndDt;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the srchMsgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public SrchMsgRqHdrCType getSrchMsgRqHdr() {
        return srchMsgRqHdr;
    }

    /**
     * Sets the value of the srchMsgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public void setSrchMsgRqHdr(SrchMsgRqHdrCType value) {
        this.srchMsgRqHdr = value;
    }

    /**
     * Gets the value of the consmSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsmSrcCodeType }{@code >}
     *     
     */
    public JAXBElement<ConsmSrcCodeType> getConsmSrcCode() {
        return consmSrcCode;
    }

    /**
     * Sets the value of the consmSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsmSrcCodeType }{@code >}
     *     
     */
    public void setConsmSrcCode(JAXBElement<ConsmSrcCodeType> value) {
        this.consmSrcCode = value;
    }

    /**
     * Gets the value of the pltfmAppSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmAppSrcCodeType }{@code >}
     *     
     */
    public JAXBElement<PltfmAppSrcCodeType> getPltfmAppSrcCode() {
        return pltfmAppSrcCode;
    }

    /**
     * Sets the value of the pltfmAppSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmAppSrcCodeType }{@code >}
     *     
     */
    public void setPltfmAppSrcCode(JAXBElement<PltfmAppSrcCodeType> value) {
        this.pltfmAppSrcCode = value;
    }

    /**
     * Gets the value of the pltfmAcctTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmAcctTypeCodeType }{@code >}
     *     
     */
    public JAXBElement<PltfmAcctTypeCodeType> getPltfmAcctTypeCode() {
        return pltfmAcctTypeCode;
    }

    /**
     * Sets the value of the pltfmAcctTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmAcctTypeCodeType }{@code >}
     *     
     */
    public void setPltfmAcctTypeCode(JAXBElement<PltfmAcctTypeCodeType> value) {
        this.pltfmAcctTypeCode = value;
    }

    /**
     * Gets the value of the pltfmClsfPrimType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmClsfPrimTypeType }{@code >}
     *     
     */
    public JAXBElement<PltfmClsfPrimTypeType> getPltfmClsfPrimType() {
        return pltfmClsfPrimType;
    }

    /**
     * Sets the value of the pltfmClsfPrimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmClsfPrimTypeType }{@code >}
     *     
     */
    public void setPltfmClsfPrimType(JAXBElement<PltfmClsfPrimTypeType> value) {
        this.pltfmClsfPrimType = value;
    }

    /**
     * Gets the value of the pltfmCustType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmCustTypeType }{@code >}
     *     
     */
    public JAXBElement<PltfmCustTypeType> getPltfmCustType() {
        return pltfmCustType;
    }

    /**
     * Sets the value of the pltfmCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmCustTypeType }{@code >}
     *     
     */
    public void setPltfmCustType(JAXBElement<PltfmCustTypeType> value) {
        this.pltfmCustType = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FirstNameType }{@code >}
     *     
     */
    public JAXBElement<FirstNameType> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FirstNameType }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<FirstNameType> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MiddleNameType }{@code >}
     *     
     */
    public JAXBElement<MiddleNameType> getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MiddleNameType }{@code >}
     *     
     */
    public void setMiddleName(JAXBElement<MiddleNameType> value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastNameType }{@code >}
     *     
     */
    public JAXBElement<LastNameType> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastNameType }{@code >}
     *     
     */
    public void setLastName(JAXBElement<LastNameType> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the busName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComNameType }{@code >}
     *     
     */
    public JAXBElement<ComNameType> getBusName() {
        return busName;
    }

    /**
     * Sets the value of the busName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComNameType }{@code >}
     *     
     */
    public void setBusName(JAXBElement<ComNameType> value) {
        this.busName = value;
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
     * Gets the value of the streetAddr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr1Type }{@code >}
     *     
     */
    public JAXBElement<StreetAddr1Type> getStreetAddr() {
        return streetAddr;
    }

    /**
     * Sets the value of the streetAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr1Type }{@code >}
     *     
     */
    public void setStreetAddr(JAXBElement<StreetAddr1Type> value) {
        this.streetAddr = value;
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
     * Gets the value of the pltfmId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmIdType }{@code >}
     *     
     */
    public JAXBElement<PltfmIdType> getPltfmId() {
        return pltfmId;
    }

    /**
     * Sets the value of the pltfmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmIdType }{@code >}
     *     
     */
    public void setPltfmId(JAXBElement<PltfmIdType> value) {
        this.pltfmId = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<AccountIdCType> value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustIdType }{@code >}
     *     
     */
    public JAXBElement<CustIdType> getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustIdType }{@code >}
     *     
     */
    public void setCustId(JAXBElement<CustIdType> value) {
        this.custId = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionCodeType }{@code >}
     *     
     */
    public JAXBElement<RegionCodeType> getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionCodeType }{@code >}
     *     
     */
    public void setRegionCode(JAXBElement<RegionCodeType> value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public JAXBElement<BrCodeType> getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public void setBrCode(JAXBElement<BrCodeType> value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public JAXBElement<OffCodeType> getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public void setOffCode(JAXBElement<OffCodeType> value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the appRecvStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public JAXBElement<StartDtType> getAppRecvStartDt() {
        return appRecvStartDt;
    }

    /**
     * Sets the value of the appRecvStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public void setAppRecvStartDt(JAXBElement<StartDtType> value) {
        this.appRecvStartDt = value;
    }

    /**
     * Gets the value of the appRecvEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public JAXBElement<EndDtType> getAppRecvEndDt() {
        return appRecvEndDt;
    }

    /**
     * Sets the value of the appRecvEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public void setAppRecvEndDt(JAXBElement<EndDtType> value) {
        this.appRecvEndDt = value;
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
