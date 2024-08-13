
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
 * <p>Java class for PltfmAppCustInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppCustInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="AcctRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustType" type="{http://jackhenry.com/jxchange/TPG/2008}CustType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://jackhenry.com/jxchange/TPG/2008}Gender_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmplName" type="{http://jackhenry.com/jxchange/TPG/2008}EmplName_Type" minOccurs="0"/&gt;
 *         &lt;element name="OccType" type="{http://jackhenry.com/jxchange/TPG/2008}OccType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="TINInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TINInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdVerifyArray" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="HldMailCode" type="{http://jackhenry.com/jxchange/TPG/2008}HldMailCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="IsPrimCustRel" type="{http://jackhenry.com/jxchange/TPG/2008}EntityPrimType_Type" minOccurs="0"/&gt;
 *           &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="PltfmAddrArray" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAddrArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="RoleCodeArray" type="{http://jackhenry.com/jxchange/TPG/2008}RoleCodeArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="FinInstNonCustType" type="{http://jackhenry.com/jxchange/TPG/2008}FinInstNonCustType_Type" minOccurs="0"/&gt;
 *             &lt;element name="CustBenfInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CustBenfInfo_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="CustClsfCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustCode_Type" minOccurs="0"/&gt;
 *               &lt;element name="TINCertType" type="{http://jackhenry.com/jxchange/TPG/2008}TINCertType_Type" minOccurs="0"/&gt;
 *               &lt;element name="NonUSCitizen" type="{http://jackhenry.com/jxchange/TPG/2008}NonUSCitizen_Type" minOccurs="0"/&gt;
 *               &lt;element name="AlienResident" type="{http://jackhenry.com/jxchange/TPG/2008}AlienResident_Type" minOccurs="0"/&gt;
 *               &lt;element name="AlienNonResidentType" type="{http://jackhenry.com/jxchange/TPG/2008}AlienNonResidentType_Type" minOccurs="0"/&gt;
 *               &lt;element name="AlienW8Type" type="{http://jackhenry.com/jxchange/TPG/2008}AlienW8Type_Type" minOccurs="0"/&gt;
 *               &lt;element name="OffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}OffInfoArray_AType" minOccurs="0"/&gt;
 *               &lt;element name="DueDilgntCmpltArray" type="{http://jackhenry.com/jxchange/TPG/2008}DueDilgntCmpltArray_AType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="NAICSCode" type="{http://jackhenry.com/jxchange/TPG/2008}NAICSCode_Type" minOccurs="0"/&gt;
 *                 &lt;element name="StdIndustCode" type="{http://jackhenry.com/jxchange/TPG/2008}StdIndustCode_Type" minOccurs="0"/&gt;
 *                 &lt;element name="ReqLegalEntityType" type="{http://jackhenry.com/jxchange/TPG/2008}ReqLegalEntityType_Type" minOccurs="0"/&gt;
 *                 &lt;element name="ExcOwnPct" type="{http://jackhenry.com/jxchange/TPG/2008}ExcOwnPct_Type" minOccurs="0"/&gt;
 *                 &lt;element name="ExcPctRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcPctRsnCode_Type" minOccurs="0"/&gt;
 *                 &lt;element name="BenflOwnExclCode" type="{http://jackhenry.com/jxchange/TPG/2008}BenflOwnExclCode_Type" minOccurs="0"/&gt;
 *                 &lt;element name="LegalEntityId" type="{http://jackhenry.com/jxchange/TPG/2008}LegalEntityId_Type" minOccurs="0"/&gt;
 *                 &lt;element name="CommAgentTitle" type="{http://jackhenry.com/jxchange/TPG/2008}EmplTitle_Type" minOccurs="0"/&gt;
 *                 &lt;element name="CommAgentAuthArray" type="{http://jackhenry.com/jxchange/TPG/2008}CommAgentAuthArray_AType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="AbbrCustDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AbbrCustDesc_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="BenflOwnIdVerifyInfo" type="{http://jackhenry.com/jxchange/TPG/2008}BenflOwnIdVerifyInfo_CType" minOccurs="0"/&gt;
 *                     &lt;element name="BenflOwnInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}BenflOwnInfoArray_AType" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="PltfmCustCode" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmCustCode_Type" minOccurs="0"/&gt;
 *                       &lt;element name="CustSvcOptArray" type="{http://jackhenry.com/jxchange/TPG/2008}CustSvcOptArray_AType" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;element name="NonPrftOrgType" type="{http://jackhenry.com/jxchange/TPG/2008}NonPrftOrgType_Type" minOccurs="0"/&gt;
 *                         &lt;element name="EntityRgtrLoc" type="{http://jackhenry.com/jxchange/TPG/2008}EntityRgtrLoc_Type" minOccurs="0"/&gt;
 *                         &lt;element name="EntityRgtrLocType" type="{http://jackhenry.com/jxchange/TPG/2008}EntityRgtrLocType_Type" minOccurs="0"/&gt;
 *                         &lt;element name="ApointCptyType" type="{http://jackhenry.com/jxchange/TPG/2008}ApointCptyType_Type" minOccurs="0"/&gt;
 *                         &lt;element name="ApointCptyDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ApointCptyDesc_Type" minOccurs="0"/&gt;
 *                         &lt;element name="DscSigType" type="{http://jackhenry.com/jxchange/TPG/2008}DscSigType_Type" minOccurs="0"/&gt;
 *                         &lt;element name="CustSubClsfCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustCode_Type" minOccurs="0"/&gt;
 *                         &lt;sequence minOccurs="0"&gt;
 *                           &lt;element name="Ver_9" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_9_CType"/&gt;
 *                           &lt;element name="EstbDt" type="{http://jackhenry.com/jxchange/TPG/2008}EstbDt_Type" minOccurs="0"/&gt;
 *                           &lt;sequence minOccurs="0"&gt;
 *                             &lt;element name="Ver_10" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_10_CType"/&gt;
 *                             &lt;element name="Alien" type="{http://jackhenry.com/jxchange/TPG/2008}Alien_CType" minOccurs="0"/&gt;
 *                             &lt;sequence minOccurs="0"&gt;
 *                               &lt;element name="Ver_11" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_10_CType"/&gt;
 *                               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/sequence&gt;
 *                       &lt;/sequence&gt;
 *                     &lt;/sequence&gt;
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
@XmlType(name = "PltfmAppCustInfo_CType", propOrder = {
    "custId",
    "personName",
    "acctRelCode",
    "addr",
    "custType",
    "gender",
    "birthDt",
    "emplName",
    "occType",
    "emailArray",
    "phoneArray",
    "tinInfo",
    "brCode",
    "idVerifyArray",
    "custom",
    "ver1",
    "hldMailCode",
    "isPrimCustRel",
    "userDefInfoArray",
    "pltfmAddrArray",
    "ver2",
    "roleCodeArray",
    "finInstNonCustType",
    "custBenfInfo",
    "ver3",
    "custClsfCode",
    "tinCertType",
    "nonUSCitizen",
    "alienResident",
    "alienNonResidentType",
    "alienW8Type",
    "offInfoArray",
    "dueDilgntCmpltArray",
    "ver4",
    "naicsCode",
    "stdIndustCode",
    "reqLegalEntityType",
    "excOwnPct",
    "excPctRsnCode",
    "benflOwnExclCode",
    "legalEntityId",
    "commAgentTitle",
    "commAgentAuthArray",
    "ver5",
    "abbrCustDesc",
    "ver6",
    "benflOwnIdVerifyInfo",
    "benflOwnInfoArray",
    "ver7",
    "pltfmCustCode",
    "custSvcOptArray",
    "ver8",
    "nonPrftOrgType",
    "entityRgtrLoc",
    "entityRgtrLocType",
    "apointCptyType",
    "apointCptyDesc",
    "dscSigType",
    "custSubClsfCode",
    "ver9",
    "estbDt",
    "ver10",
    "alien",
    "ver11",
    "any"
})
public class PltfmAppCustInfoCType {

    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "AcctRelCode")
    protected AcctRelCodeType acctRelCode;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "CustType")
    protected CustTypeType custType;
    @XmlElement(name = "Gender")
    protected GenderType gender;
    @XmlElement(name = "BirthDt")
    protected BirthDtType birthDt;
    @XmlElement(name = "EmplName")
    protected EmplNameType emplName;
    @XmlElement(name = "OccType")
    protected OccTypeType occType;
    @XmlElement(name = "EmailArray")
    protected EmailArrayAType emailArray;
    @XmlElement(name = "PhoneArray")
    protected PhoneArrayAType phoneArray;
    @XmlElement(name = "TINInfo")
    protected TINInfoCType tinInfo;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "IdVerifyArray")
    protected IdVerifyArrayAType idVerifyArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "HldMailCode")
    protected HldMailCodeType hldMailCode;
    @XmlElement(name = "IsPrimCustRel")
    protected EntityPrimTypeType isPrimCustRel;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "PltfmAddrArray")
    protected PltfmAddrArrayAType pltfmAddrArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "RoleCodeArray")
    protected RoleCodeArrayAType roleCodeArray;
    @XmlElement(name = "FinInstNonCustType")
    protected FinInstNonCustTypeType finInstNonCustType;
    @XmlElement(name = "CustBenfInfo")
    protected CustBenfInfoCType custBenfInfo;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "CustClsfCode")
    protected CustCodeType custClsfCode;
    @XmlElement(name = "TINCertType")
    protected TINCertTypeType tinCertType;
    @XmlElement(name = "NonUSCitizen")
    protected NonUSCitizenType nonUSCitizen;
    @XmlElement(name = "AlienResident")
    protected AlienResidentType alienResident;
    @XmlElement(name = "AlienNonResidentType")
    protected AlienNonResidentTypeType alienNonResidentType;
    @XmlElement(name = "AlienW8Type")
    protected AlienW8TypeType alienW8Type;
    @XmlElement(name = "OffInfoArray")
    protected OffInfoArrayAType offInfoArray;
    @XmlElement(name = "DueDilgntCmpltArray")
    protected DueDilgntCmpltArrayAType dueDilgntCmpltArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "NAICSCode")
    protected NAICSCodeType naicsCode;
    @XmlElement(name = "StdIndustCode")
    protected StdIndustCodeType stdIndustCode;
    @XmlElement(name = "ReqLegalEntityType")
    protected ReqLegalEntityTypeType reqLegalEntityType;
    @XmlElement(name = "ExcOwnPct")
    protected ExcOwnPctType excOwnPct;
    @XmlElement(name = "ExcPctRsnCode")
    protected ExcPctRsnCodeType excPctRsnCode;
    @XmlElement(name = "BenflOwnExclCode")
    protected BenflOwnExclCodeType benflOwnExclCode;
    @XmlElement(name = "LegalEntityId")
    protected LegalEntityIdType legalEntityId;
    @XmlElement(name = "CommAgentTitle")
    protected EmplTitleType commAgentTitle;
    @XmlElement(name = "CommAgentAuthArray")
    protected CommAgentAuthArrayAType commAgentAuthArray;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "AbbrCustDesc")
    protected AbbrCustDescType abbrCustDesc;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "BenflOwnIdVerifyInfo")
    protected BenflOwnIdVerifyInfoCType benflOwnIdVerifyInfo;
    @XmlElement(name = "BenflOwnInfoArray")
    protected BenflOwnInfoArrayAType benflOwnInfoArray;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "PltfmCustCode")
    protected PltfmCustCodeType pltfmCustCode;
    @XmlElement(name = "CustSvcOptArray")
    protected CustSvcOptArrayAType custSvcOptArray;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlElement(name = "NonPrftOrgType")
    protected NonPrftOrgTypeType nonPrftOrgType;
    @XmlElement(name = "EntityRgtrLoc")
    protected EntityRgtrLocType entityRgtrLoc;
    @XmlElement(name = "EntityRgtrLocType")
    protected EntityRgtrLocTypeType entityRgtrLocType;
    @XmlElement(name = "ApointCptyType")
    protected ApointCptyTypeType apointCptyType;
    @XmlElement(name = "ApointCptyDesc")
    protected ApointCptyDescType apointCptyDesc;
    @XmlElement(name = "DscSigType")
    protected DscSigTypeType dscSigType;
    @XmlElement(name = "CustSubClsfCode")
    protected CustCodeType custSubClsfCode;
    @XmlElement(name = "Ver_9")
    protected Ver9CType ver9;
    @XmlElement(name = "EstbDt")
    protected EstbDtType estbDt;
    @XmlElement(name = "Ver_10")
    protected Ver10CType ver10;
    @XmlElement(name = "Alien")
    protected AlienCType alien;
    @XmlElement(name = "Ver_11")
    protected Ver10CType ver11;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the acctRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRelCodeType }
     *     
     */
    public AcctRelCodeType getAcctRelCode() {
        return acctRelCode;
    }

    /**
     * Sets the value of the acctRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRelCodeType }
     *     
     */
    public void setAcctRelCode(AcctRelCodeType value) {
        this.acctRelCode = value;
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
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link CustTypeType }
     *     
     */
    public CustTypeType getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustTypeType }
     *     
     */
    public void setCustType(CustTypeType value) {
        this.custType = value;
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
     * Gets the value of the emplName property.
     * 
     * @return
     *     possible object is
     *     {@link EmplNameType }
     *     
     */
    public EmplNameType getEmplName() {
        return emplName;
    }

    /**
     * Sets the value of the emplName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplNameType }
     *     
     */
    public void setEmplName(EmplNameType value) {
        this.emplName = value;
    }

    /**
     * Gets the value of the occType property.
     * 
     * @return
     *     possible object is
     *     {@link OccTypeType }
     *     
     */
    public OccTypeType getOccType() {
        return occType;
    }

    /**
     * Sets the value of the occType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccTypeType }
     *     
     */
    public void setOccType(OccTypeType value) {
        this.occType = value;
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
     * Gets the value of the tinInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TINInfoCType }
     *     
     */
    public TINInfoCType getTINInfo() {
        return tinInfo;
    }

    /**
     * Sets the value of the tinInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINInfoCType }
     *     
     */
    public void setTINInfo(TINInfoCType value) {
        this.tinInfo = value;
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
     * Gets the value of the idVerifyArray property.
     * 
     * @return
     *     possible object is
     *     {@link IdVerifyArrayAType }
     *     
     */
    public IdVerifyArrayAType getIdVerifyArray() {
        return idVerifyArray;
    }

    /**
     * Sets the value of the idVerifyArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdVerifyArrayAType }
     *     
     */
    public void setIdVerifyArray(IdVerifyArrayAType value) {
        this.idVerifyArray = value;
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
     * Gets the value of the hldMailCode property.
     * 
     * @return
     *     possible object is
     *     {@link HldMailCodeType }
     *     
     */
    public HldMailCodeType getHldMailCode() {
        return hldMailCode;
    }

    /**
     * Sets the value of the hldMailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HldMailCodeType }
     *     
     */
    public void setHldMailCode(HldMailCodeType value) {
        this.hldMailCode = value;
    }

    /**
     * Gets the value of the isPrimCustRel property.
     * 
     * @return
     *     possible object is
     *     {@link EntityPrimTypeType }
     *     
     */
    public EntityPrimTypeType getIsPrimCustRel() {
        return isPrimCustRel;
    }

    /**
     * Sets the value of the isPrimCustRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityPrimTypeType }
     *     
     */
    public void setIsPrimCustRel(EntityPrimTypeType value) {
        this.isPrimCustRel = value;
    }

    /**
     * Gets the value of the userDefInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public UserDefInfoArrayAType getUserDefInfoArray() {
        return userDefInfoArray;
    }

    /**
     * Sets the value of the userDefInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public void setUserDefInfoArray(UserDefInfoArrayAType value) {
        this.userDefInfoArray = value;
    }

    /**
     * Gets the value of the pltfmAddrArray property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAddrArrayAType }
     *     
     */
    public PltfmAddrArrayAType getPltfmAddrArray() {
        return pltfmAddrArray;
    }

    /**
     * Sets the value of the pltfmAddrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAddrArrayAType }
     *     
     */
    public void setPltfmAddrArray(PltfmAddrArrayAType value) {
        this.pltfmAddrArray = value;
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
     * Gets the value of the roleCodeArray property.
     * 
     * @return
     *     possible object is
     *     {@link RoleCodeArrayAType }
     *     
     */
    public RoleCodeArrayAType getRoleCodeArray() {
        return roleCodeArray;
    }

    /**
     * Sets the value of the roleCodeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleCodeArrayAType }
     *     
     */
    public void setRoleCodeArray(RoleCodeArrayAType value) {
        this.roleCodeArray = value;
    }

    /**
     * Gets the value of the finInstNonCustType property.
     * 
     * @return
     *     possible object is
     *     {@link FinInstNonCustTypeType }
     *     
     */
    public FinInstNonCustTypeType getFinInstNonCustType() {
        return finInstNonCustType;
    }

    /**
     * Sets the value of the finInstNonCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinInstNonCustTypeType }
     *     
     */
    public void setFinInstNonCustType(FinInstNonCustTypeType value) {
        this.finInstNonCustType = value;
    }

    /**
     * Gets the value of the custBenfInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustBenfInfoCType }
     *     
     */
    public CustBenfInfoCType getCustBenfInfo() {
        return custBenfInfo;
    }

    /**
     * Sets the value of the custBenfInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustBenfInfoCType }
     *     
     */
    public void setCustBenfInfo(CustBenfInfoCType value) {
        this.custBenfInfo = value;
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
     * Gets the value of the custClsfCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustCodeType }
     *     
     */
    public CustCodeType getCustClsfCode() {
        return custClsfCode;
    }

    /**
     * Sets the value of the custClsfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustCodeType }
     *     
     */
    public void setCustClsfCode(CustCodeType value) {
        this.custClsfCode = value;
    }

    /**
     * Gets the value of the tinCertType property.
     * 
     * @return
     *     possible object is
     *     {@link TINCertTypeType }
     *     
     */
    public TINCertTypeType getTINCertType() {
        return tinCertType;
    }

    /**
     * Sets the value of the tinCertType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINCertTypeType }
     *     
     */
    public void setTINCertType(TINCertTypeType value) {
        this.tinCertType = value;
    }

    /**
     * Gets the value of the nonUSCitizen property.
     * 
     * @return
     *     possible object is
     *     {@link NonUSCitizenType }
     *     
     */
    public NonUSCitizenType getNonUSCitizen() {
        return nonUSCitizen;
    }

    /**
     * Sets the value of the nonUSCitizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonUSCitizenType }
     *     
     */
    public void setNonUSCitizen(NonUSCitizenType value) {
        this.nonUSCitizen = value;
    }

    /**
     * Gets the value of the alienResident property.
     * 
     * @return
     *     possible object is
     *     {@link AlienResidentType }
     *     
     */
    public AlienResidentType getAlienResident() {
        return alienResident;
    }

    /**
     * Sets the value of the alienResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlienResidentType }
     *     
     */
    public void setAlienResident(AlienResidentType value) {
        this.alienResident = value;
    }

    /**
     * Gets the value of the alienNonResidentType property.
     * 
     * @return
     *     possible object is
     *     {@link AlienNonResidentTypeType }
     *     
     */
    public AlienNonResidentTypeType getAlienNonResidentType() {
        return alienNonResidentType;
    }

    /**
     * Sets the value of the alienNonResidentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlienNonResidentTypeType }
     *     
     */
    public void setAlienNonResidentType(AlienNonResidentTypeType value) {
        this.alienNonResidentType = value;
    }

    /**
     * Gets the value of the alienW8Type property.
     * 
     * @return
     *     possible object is
     *     {@link AlienW8TypeType }
     *     
     */
    public AlienW8TypeType getAlienW8Type() {
        return alienW8Type;
    }

    /**
     * Sets the value of the alienW8Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlienW8TypeType }
     *     
     */
    public void setAlienW8Type(AlienW8TypeType value) {
        this.alienW8Type = value;
    }

    /**
     * Gets the value of the offInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link OffInfoArrayAType }
     *     
     */
    public OffInfoArrayAType getOffInfoArray() {
        return offInfoArray;
    }

    /**
     * Sets the value of the offInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffInfoArrayAType }
     *     
     */
    public void setOffInfoArray(OffInfoArrayAType value) {
        this.offInfoArray = value;
    }

    /**
     * Gets the value of the dueDilgntCmpltArray property.
     * 
     * @return
     *     possible object is
     *     {@link DueDilgntCmpltArrayAType }
     *     
     */
    public DueDilgntCmpltArrayAType getDueDilgntCmpltArray() {
        return dueDilgntCmpltArray;
    }

    /**
     * Sets the value of the dueDilgntCmpltArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DueDilgntCmpltArrayAType }
     *     
     */
    public void setDueDilgntCmpltArray(DueDilgntCmpltArrayAType value) {
        this.dueDilgntCmpltArray = value;
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
     * Gets the value of the naicsCode property.
     * 
     * @return
     *     possible object is
     *     {@link NAICSCodeType }
     *     
     */
    public NAICSCodeType getNAICSCode() {
        return naicsCode;
    }

    /**
     * Sets the value of the naicsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAICSCodeType }
     *     
     */
    public void setNAICSCode(NAICSCodeType value) {
        this.naicsCode = value;
    }

    /**
     * Gets the value of the stdIndustCode property.
     * 
     * @return
     *     possible object is
     *     {@link StdIndustCodeType }
     *     
     */
    public StdIndustCodeType getStdIndustCode() {
        return stdIndustCode;
    }

    /**
     * Sets the value of the stdIndustCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdIndustCodeType }
     *     
     */
    public void setStdIndustCode(StdIndustCodeType value) {
        this.stdIndustCode = value;
    }

    /**
     * Gets the value of the reqLegalEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link ReqLegalEntityTypeType }
     *     
     */
    public ReqLegalEntityTypeType getReqLegalEntityType() {
        return reqLegalEntityType;
    }

    /**
     * Sets the value of the reqLegalEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqLegalEntityTypeType }
     *     
     */
    public void setReqLegalEntityType(ReqLegalEntityTypeType value) {
        this.reqLegalEntityType = value;
    }

    /**
     * Gets the value of the excOwnPct property.
     * 
     * @return
     *     possible object is
     *     {@link ExcOwnPctType }
     *     
     */
    public ExcOwnPctType getExcOwnPct() {
        return excOwnPct;
    }

    /**
     * Sets the value of the excOwnPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcOwnPctType }
     *     
     */
    public void setExcOwnPct(ExcOwnPctType value) {
        this.excOwnPct = value;
    }

    /**
     * Gets the value of the excPctRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExcPctRsnCodeType }
     *     
     */
    public ExcPctRsnCodeType getExcPctRsnCode() {
        return excPctRsnCode;
    }

    /**
     * Sets the value of the excPctRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcPctRsnCodeType }
     *     
     */
    public void setExcPctRsnCode(ExcPctRsnCodeType value) {
        this.excPctRsnCode = value;
    }

    /**
     * Gets the value of the benflOwnExclCode property.
     * 
     * @return
     *     possible object is
     *     {@link BenflOwnExclCodeType }
     *     
     */
    public BenflOwnExclCodeType getBenflOwnExclCode() {
        return benflOwnExclCode;
    }

    /**
     * Sets the value of the benflOwnExclCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenflOwnExclCodeType }
     *     
     */
    public void setBenflOwnExclCode(BenflOwnExclCodeType value) {
        this.benflOwnExclCode = value;
    }

    /**
     * Gets the value of the legalEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityIdType }
     *     
     */
    public LegalEntityIdType getLegalEntityId() {
        return legalEntityId;
    }

    /**
     * Sets the value of the legalEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityIdType }
     *     
     */
    public void setLegalEntityId(LegalEntityIdType value) {
        this.legalEntityId = value;
    }

    /**
     * Gets the value of the commAgentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link EmplTitleType }
     *     
     */
    public EmplTitleType getCommAgentTitle() {
        return commAgentTitle;
    }

    /**
     * Sets the value of the commAgentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplTitleType }
     *     
     */
    public void setCommAgentTitle(EmplTitleType value) {
        this.commAgentTitle = value;
    }

    /**
     * Gets the value of the commAgentAuthArray property.
     * 
     * @return
     *     possible object is
     *     {@link CommAgentAuthArrayAType }
     *     
     */
    public CommAgentAuthArrayAType getCommAgentAuthArray() {
        return commAgentAuthArray;
    }

    /**
     * Sets the value of the commAgentAuthArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommAgentAuthArrayAType }
     *     
     */
    public void setCommAgentAuthArray(CommAgentAuthArrayAType value) {
        this.commAgentAuthArray = value;
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
     * Gets the value of the abbrCustDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AbbrCustDescType }
     *     
     */
    public AbbrCustDescType getAbbrCustDesc() {
        return abbrCustDesc;
    }

    /**
     * Sets the value of the abbrCustDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbbrCustDescType }
     *     
     */
    public void setAbbrCustDesc(AbbrCustDescType value) {
        this.abbrCustDesc = value;
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
     * Gets the value of the benflOwnIdVerifyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BenflOwnIdVerifyInfoCType }
     *     
     */
    public BenflOwnIdVerifyInfoCType getBenflOwnIdVerifyInfo() {
        return benflOwnIdVerifyInfo;
    }

    /**
     * Sets the value of the benflOwnIdVerifyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenflOwnIdVerifyInfoCType }
     *     
     */
    public void setBenflOwnIdVerifyInfo(BenflOwnIdVerifyInfoCType value) {
        this.benflOwnIdVerifyInfo = value;
    }

    /**
     * Gets the value of the benflOwnInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link BenflOwnInfoArrayAType }
     *     
     */
    public BenflOwnInfoArrayAType getBenflOwnInfoArray() {
        return benflOwnInfoArray;
    }

    /**
     * Sets the value of the benflOwnInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenflOwnInfoArrayAType }
     *     
     */
    public void setBenflOwnInfoArray(BenflOwnInfoArrayAType value) {
        this.benflOwnInfoArray = value;
    }

    /**
     * Gets the value of the ver7 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver7CType }
     *     
     */
    public Ver7CType getVer7() {
        return ver7;
    }

    /**
     * Sets the value of the ver7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver7CType }
     *     
     */
    public void setVer7(Ver7CType value) {
        this.ver7 = value;
    }

    /**
     * Gets the value of the pltfmCustCode property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmCustCodeType }
     *     
     */
    public PltfmCustCodeType getPltfmCustCode() {
        return pltfmCustCode;
    }

    /**
     * Sets the value of the pltfmCustCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmCustCodeType }
     *     
     */
    public void setPltfmCustCode(PltfmCustCodeType value) {
        this.pltfmCustCode = value;
    }

    /**
     * Gets the value of the custSvcOptArray property.
     * 
     * @return
     *     possible object is
     *     {@link CustSvcOptArrayAType }
     *     
     */
    public CustSvcOptArrayAType getCustSvcOptArray() {
        return custSvcOptArray;
    }

    /**
     * Sets the value of the custSvcOptArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustSvcOptArrayAType }
     *     
     */
    public void setCustSvcOptArray(CustSvcOptArrayAType value) {
        this.custSvcOptArray = value;
    }

    /**
     * Gets the value of the ver8 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver8CType }
     *     
     */
    public Ver8CType getVer8() {
        return ver8;
    }

    /**
     * Sets the value of the ver8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver8CType }
     *     
     */
    public void setVer8(Ver8CType value) {
        this.ver8 = value;
    }

    /**
     * Gets the value of the nonPrftOrgType property.
     * 
     * @return
     *     possible object is
     *     {@link NonPrftOrgTypeType }
     *     
     */
    public NonPrftOrgTypeType getNonPrftOrgType() {
        return nonPrftOrgType;
    }

    /**
     * Sets the value of the nonPrftOrgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonPrftOrgTypeType }
     *     
     */
    public void setNonPrftOrgType(NonPrftOrgTypeType value) {
        this.nonPrftOrgType = value;
    }

    /**
     * Gets the value of the entityRgtrLoc property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRgtrLocType }
     *     
     */
    public EntityRgtrLocType getEntityRgtrLoc() {
        return entityRgtrLoc;
    }

    /**
     * Sets the value of the entityRgtrLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRgtrLocType }
     *     
     */
    public void setEntityRgtrLoc(EntityRgtrLocType value) {
        this.entityRgtrLoc = value;
    }

    /**
     * Gets the value of the entityRgtrLocType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRgtrLocTypeType }
     *     
     */
    public EntityRgtrLocTypeType getEntityRgtrLocType() {
        return entityRgtrLocType;
    }

    /**
     * Sets the value of the entityRgtrLocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRgtrLocTypeType }
     *     
     */
    public void setEntityRgtrLocType(EntityRgtrLocTypeType value) {
        this.entityRgtrLocType = value;
    }

    /**
     * Gets the value of the apointCptyType property.
     * 
     * @return
     *     possible object is
     *     {@link ApointCptyTypeType }
     *     
     */
    public ApointCptyTypeType getApointCptyType() {
        return apointCptyType;
    }

    /**
     * Sets the value of the apointCptyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApointCptyTypeType }
     *     
     */
    public void setApointCptyType(ApointCptyTypeType value) {
        this.apointCptyType = value;
    }

    /**
     * Gets the value of the apointCptyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ApointCptyDescType }
     *     
     */
    public ApointCptyDescType getApointCptyDesc() {
        return apointCptyDesc;
    }

    /**
     * Sets the value of the apointCptyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApointCptyDescType }
     *     
     */
    public void setApointCptyDesc(ApointCptyDescType value) {
        this.apointCptyDesc = value;
    }

    /**
     * Gets the value of the dscSigType property.
     * 
     * @return
     *     possible object is
     *     {@link DscSigTypeType }
     *     
     */
    public DscSigTypeType getDscSigType() {
        return dscSigType;
    }

    /**
     * Sets the value of the dscSigType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DscSigTypeType }
     *     
     */
    public void setDscSigType(DscSigTypeType value) {
        this.dscSigType = value;
    }

    /**
     * Gets the value of the custSubClsfCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustCodeType }
     *     
     */
    public CustCodeType getCustSubClsfCode() {
        return custSubClsfCode;
    }

    /**
     * Sets the value of the custSubClsfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustCodeType }
     *     
     */
    public void setCustSubClsfCode(CustCodeType value) {
        this.custSubClsfCode = value;
    }

    /**
     * Gets the value of the ver9 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver9CType }
     *     
     */
    public Ver9CType getVer9() {
        return ver9;
    }

    /**
     * Sets the value of the ver9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver9CType }
     *     
     */
    public void setVer9(Ver9CType value) {
        this.ver9 = value;
    }

    /**
     * Gets the value of the estbDt property.
     * 
     * @return
     *     possible object is
     *     {@link EstbDtType }
     *     
     */
    public EstbDtType getEstbDt() {
        return estbDt;
    }

    /**
     * Sets the value of the estbDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstbDtType }
     *     
     */
    public void setEstbDt(EstbDtType value) {
        this.estbDt = value;
    }

    /**
     * Gets the value of the ver10 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver10CType }
     *     
     */
    public Ver10CType getVer10() {
        return ver10;
    }

    /**
     * Sets the value of the ver10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver10CType }
     *     
     */
    public void setVer10(Ver10CType value) {
        this.ver10 = value;
    }

    /**
     * Gets the value of the alien property.
     * 
     * @return
     *     possible object is
     *     {@link AlienCType }
     *     
     */
    public AlienCType getAlien() {
        return alien;
    }

    /**
     * Sets the value of the alien property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlienCType }
     *     
     */
    public void setAlien(AlienCType value) {
        this.alien = value;
    }

    /**
     * Gets the value of the ver11 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver10CType }
     *     
     */
    public Ver10CType getVer11() {
        return ver11;
    }

    /**
     * Sets the value of the ver11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver10CType }
     *     
     */
    public void setVer11(Ver10CType value) {
        this.ver11 = value;
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
