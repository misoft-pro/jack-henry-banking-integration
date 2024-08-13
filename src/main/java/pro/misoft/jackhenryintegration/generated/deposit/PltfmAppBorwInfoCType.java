
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
 * The complex for submission of a loan application for a non-commercial
 *                 borrowers entity
 * 
 * <p>Java class for PltfmAppBorwInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppBorwInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BorwName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwTaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwPhoneInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="BorwBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BorwBirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwYrEduc" type="{http://jackhenry.com/jxchange/TPG/2008}YrEduc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwMartialStatType" type="{http://jackhenry.com/jxchange/TPG/2008}MartialStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwDepdentNum" type="{http://jackhenry.com/jxchange/TPG/2008}DepdentNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwDepdentArray" type="{http://jackhenry.com/jxchange/TPG/2008}DepdentArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="BorwHousingDispType" type="{http://jackhenry.com/jxchange/TPG/2008}HousingDispType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwHousingTerm" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwMailAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwPrevAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwPrevHousingDispType" type="{http://jackhenry.com/jxchange/TPG/2008}HousingDispType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwPrevHousingTerm" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwDriverLicId" type="{http://jackhenry.com/jxchange/TPG/2008}DriverLicId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwEmplInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EmplInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwIncmInfo" type="{http://jackhenry.com/jxchange/TPG/2008}IncmInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwPrevEmplArray" type="{http://jackhenry.com/jxchange/TPG/2008}BorwPrevEmplArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="BorwDeclAppInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DeclAppInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwEthnicType" type="{http://jackhenry.com/jxchange/TPG/2008}EthnicType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwRaceCode" type="{http://jackhenry.com/jxchange/TPG/2008}BorwRaceCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwGender" type="{http://jackhenry.com/jxchange/TPG/2008}BorwGender_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwAlimonyOthMainType" type="{http://jackhenry.com/jxchange/TPG/2008}AlimonyOthMainType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwIncmRed" type="{http://jackhenry.com/jxchange/TPG/2008}IncmRed_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwIncmRedRsn" type="{http://jackhenry.com/jxchange/TPG/2008}IncmRedRsn_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwPrevCrRecv" type="{http://jackhenry.com/jxchange/TPG/2008}PrevCrRecv_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwPrevCrRecvDt" type="{http://jackhenry.com/jxchange/TPG/2008}PrevCrRecvDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwNearRelName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwNearRelAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwNearRelPhone" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwNearRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}NearRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwMltryStat" type="{http://jackhenry.com/jxchange/TPG/2008}MltryStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwMltryBr" type="{http://jackhenry.com/jxchange/TPG/2008}MltryBr_Type" minOccurs="0"/&gt;
 *         &lt;element name="AssetLiabJoint" type="{http://jackhenry.com/jxchange/TPG/2008}AssetLiabJoint_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwAppAssetLiabInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppAssetLiabInfo_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="IdIssueDt" type="{http://jackhenry.com/jxchange/TPG/2008}IdIssueDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="IdIssueExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}IdIssueExpDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="IdStateIssue" type="{http://jackhenry.com/jxchange/TPG/2008}State_Type" minOccurs="0"/&gt;
 *           &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctRelDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="IdVerifyArray" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="BorwEmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="BorwEmplArray" type="{http://jackhenry.com/jxchange/TPG/2008}BorwEmplArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="DueDilgntCmpltArray" type="{http://jackhenry.com/jxchange/TPG/2008}DueDilgntCmpltArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="AbbrCustDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AbbrCustDesc_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmAppBorwInfo_CType", propOrder = {
    "borwName",
    "borwAddr",
    "borwTaxId",
    "borwPhoneInfoArray",
    "borwBirthDt",
    "borwYrEduc",
    "borwMartialStatType",
    "borwDepdentNum",
    "borwDepdentArray",
    "borwHousingDispType",
    "borwHousingTerm",
    "borwMailAddr",
    "borwPrevAddr",
    "borwPrevHousingDispType",
    "borwPrevHousingTerm",
    "borwDriverLicId",
    "borwEmplInfo",
    "borwIncmInfo",
    "borwPrevEmplArray",
    "borwDeclAppInfo",
    "borwEthnicType",
    "borwRaceCode",
    "borwGender",
    "borwAlimonyOthMainType",
    "borwIncmRed",
    "borwIncmRedRsn",
    "borwPrevCrRecv",
    "borwPrevCrRecvDt",
    "borwNearRelName",
    "borwNearRelAddr",
    "borwNearRelPhone",
    "borwNearRelCode",
    "borwMltryStat",
    "borwMltryBr",
    "assetLiabJoint",
    "borwAppAssetLiabInfo",
    "ver1",
    "idIssueDt",
    "idIssueExpDt",
    "idStateIssue",
    "custId",
    "acctRelCode",
    "acctRelDesc",
    "ver2",
    "idVerifyArray",
    "borwEmailArray",
    "borwEmplArray",
    "dueDilgntCmpltArray",
    "ver3",
    "abbrCustDesc",
    "ver4",
    "any"
})
public class PltfmAppBorwInfoCType {

    @XmlElement(name = "BorwName")
    protected PersonNameCType borwName;
    @XmlElement(name = "BorwAddr")
    protected AddrCType borwAddr;
    @XmlElement(name = "BorwTaxId")
    protected TaxIdType borwTaxId;
    @XmlElement(name = "BorwPhoneInfoArray")
    protected PhoneArrayAType borwPhoneInfoArray;
    @XmlElement(name = "BorwBirthDt")
    protected BorwBirthDtType borwBirthDt;
    @XmlElement(name = "BorwYrEduc")
    protected YrEducType borwYrEduc;
    @XmlElement(name = "BorwMartialStatType")
    protected MartialStatTypeType borwMartialStatType;
    @XmlElement(name = "BorwDepdentNum")
    protected DepdentNumType borwDepdentNum;
    @XmlElement(name = "BorwDepdentArray")
    protected DepdentArrayAType borwDepdentArray;
    @XmlElement(name = "BorwHousingDispType")
    protected HousingDispTypeType borwHousingDispType;
    @XmlElement(name = "BorwHousingTerm")
    protected TermCType borwHousingTerm;
    @XmlElement(name = "BorwMailAddr")
    protected AddrCType borwMailAddr;
    @XmlElement(name = "BorwPrevAddr")
    protected AddrCType borwPrevAddr;
    @XmlElement(name = "BorwPrevHousingDispType")
    protected HousingDispTypeType borwPrevHousingDispType;
    @XmlElement(name = "BorwPrevHousingTerm")
    protected TermCType borwPrevHousingTerm;
    @XmlElement(name = "BorwDriverLicId")
    protected DriverLicIdType borwDriverLicId;
    @XmlElement(name = "BorwEmplInfo")
    protected EmplInfoCType borwEmplInfo;
    @XmlElement(name = "BorwIncmInfo")
    protected IncmInfoCType borwIncmInfo;
    @XmlElement(name = "BorwPrevEmplArray")
    protected BorwPrevEmplArrayAType borwPrevEmplArray;
    @XmlElement(name = "BorwDeclAppInfo")
    protected DeclAppInfoCType borwDeclAppInfo;
    @XmlElement(name = "BorwEthnicType")
    protected EthnicTypeType borwEthnicType;
    @XmlElement(name = "BorwRaceCode")
    protected BorwRaceCodeType borwRaceCode;
    @XmlElement(name = "BorwGender")
    protected BorwGenderType borwGender;
    @XmlElement(name = "BorwAlimonyOthMainType")
    protected AlimonyOthMainTypeType borwAlimonyOthMainType;
    @XmlElement(name = "BorwIncmRed")
    protected IncmRedType borwIncmRed;
    @XmlElement(name = "BorwIncmRedRsn")
    protected IncmRedRsnType borwIncmRedRsn;
    @XmlElement(name = "BorwPrevCrRecv")
    protected PrevCrRecvType borwPrevCrRecv;
    @XmlElement(name = "BorwPrevCrRecvDt")
    protected PrevCrRecvDtType borwPrevCrRecvDt;
    @XmlElement(name = "BorwNearRelName")
    protected PersonNameCType borwNearRelName;
    @XmlElement(name = "BorwNearRelAddr")
    protected AddrCType borwNearRelAddr;
    @XmlElement(name = "BorwNearRelPhone")
    protected PhoneInfoCType borwNearRelPhone;
    @XmlElement(name = "BorwNearRelCode")
    protected NearRelCodeType borwNearRelCode;
    @XmlElement(name = "BorwMltryStat")
    protected MltryStatType borwMltryStat;
    @XmlElement(name = "BorwMltryBr")
    protected MltryBrType borwMltryBr;
    @XmlElement(name = "AssetLiabJoint")
    protected AssetLiabJointType assetLiabJoint;
    @XmlElement(name = "BorwAppAssetLiabInfo")
    protected PltfmAppAssetLiabInfoCType borwAppAssetLiabInfo;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "IdIssueDt")
    protected IdIssueDtType idIssueDt;
    @XmlElement(name = "IdIssueExpDt")
    protected IdIssueExpDtType idIssueExpDt;
    @XmlElement(name = "IdStateIssue")
    protected StateType idStateIssue;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "AcctRelCode")
    protected AcctRelCodeType acctRelCode;
    @XmlElement(name = "AcctRelDesc")
    protected AcctRelDescType acctRelDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "IdVerifyArray")
    protected IdVerifyArrayAType idVerifyArray;
    @XmlElement(name = "BorwEmailArray")
    protected EmailArrayAType borwEmailArray;
    @XmlElement(name = "BorwEmplArray")
    protected BorwEmplArrayAType borwEmplArray;
    @XmlElement(name = "DueDilgntCmpltArray")
    protected DueDilgntCmpltArrayAType dueDilgntCmpltArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "AbbrCustDesc")
    protected AbbrCustDescType abbrCustDesc;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the borwName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getBorwName() {
        return borwName;
    }

    /**
     * Sets the value of the borwName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setBorwName(PersonNameCType value) {
        this.borwName = value;
    }

    /**
     * Gets the value of the borwAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getBorwAddr() {
        return borwAddr;
    }

    /**
     * Sets the value of the borwAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setBorwAddr(AddrCType value) {
        this.borwAddr = value;
    }

    /**
     * Gets the value of the borwTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getBorwTaxId() {
        return borwTaxId;
    }

    /**
     * Sets the value of the borwTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setBorwTaxId(TaxIdType value) {
        this.borwTaxId = value;
    }

    /**
     * Gets the value of the borwPhoneInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getBorwPhoneInfoArray() {
        return borwPhoneInfoArray;
    }

    /**
     * Sets the value of the borwPhoneInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setBorwPhoneInfoArray(PhoneArrayAType value) {
        this.borwPhoneInfoArray = value;
    }

    /**
     * Gets the value of the borwBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link BorwBirthDtType }
     *     
     */
    public BorwBirthDtType getBorwBirthDt() {
        return borwBirthDt;
    }

    /**
     * Sets the value of the borwBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwBirthDtType }
     *     
     */
    public void setBorwBirthDt(BorwBirthDtType value) {
        this.borwBirthDt = value;
    }

    /**
     * Gets the value of the borwYrEduc property.
     * 
     * @return
     *     possible object is
     *     {@link YrEducType }
     *     
     */
    public YrEducType getBorwYrEduc() {
        return borwYrEduc;
    }

    /**
     * Sets the value of the borwYrEduc property.
     * 
     * @param value
     *     allowed object is
     *     {@link YrEducType }
     *     
     */
    public void setBorwYrEduc(YrEducType value) {
        this.borwYrEduc = value;
    }

    /**
     * Gets the value of the borwMartialStatType property.
     * 
     * @return
     *     possible object is
     *     {@link MartialStatTypeType }
     *     
     */
    public MartialStatTypeType getBorwMartialStatType() {
        return borwMartialStatType;
    }

    /**
     * Sets the value of the borwMartialStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MartialStatTypeType }
     *     
     */
    public void setBorwMartialStatType(MartialStatTypeType value) {
        this.borwMartialStatType = value;
    }

    /**
     * Gets the value of the borwDepdentNum property.
     * 
     * @return
     *     possible object is
     *     {@link DepdentNumType }
     *     
     */
    public DepdentNumType getBorwDepdentNum() {
        return borwDepdentNum;
    }

    /**
     * Sets the value of the borwDepdentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepdentNumType }
     *     
     */
    public void setBorwDepdentNum(DepdentNumType value) {
        this.borwDepdentNum = value;
    }

    /**
     * Gets the value of the borwDepdentArray property.
     * 
     * @return
     *     possible object is
     *     {@link DepdentArrayAType }
     *     
     */
    public DepdentArrayAType getBorwDepdentArray() {
        return borwDepdentArray;
    }

    /**
     * Sets the value of the borwDepdentArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepdentArrayAType }
     *     
     */
    public void setBorwDepdentArray(DepdentArrayAType value) {
        this.borwDepdentArray = value;
    }

    /**
     * Gets the value of the borwHousingDispType property.
     * 
     * @return
     *     possible object is
     *     {@link HousingDispTypeType }
     *     
     */
    public HousingDispTypeType getBorwHousingDispType() {
        return borwHousingDispType;
    }

    /**
     * Sets the value of the borwHousingDispType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HousingDispTypeType }
     *     
     */
    public void setBorwHousingDispType(HousingDispTypeType value) {
        this.borwHousingDispType = value;
    }

    /**
     * Gets the value of the borwHousingTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermCType }
     *     
     */
    public TermCType getBorwHousingTerm() {
        return borwHousingTerm;
    }

    /**
     * Sets the value of the borwHousingTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCType }
     *     
     */
    public void setBorwHousingTerm(TermCType value) {
        this.borwHousingTerm = value;
    }

    /**
     * Gets the value of the borwMailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getBorwMailAddr() {
        return borwMailAddr;
    }

    /**
     * Sets the value of the borwMailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setBorwMailAddr(AddrCType value) {
        this.borwMailAddr = value;
    }

    /**
     * Gets the value of the borwPrevAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getBorwPrevAddr() {
        return borwPrevAddr;
    }

    /**
     * Sets the value of the borwPrevAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setBorwPrevAddr(AddrCType value) {
        this.borwPrevAddr = value;
    }

    /**
     * Gets the value of the borwPrevHousingDispType property.
     * 
     * @return
     *     possible object is
     *     {@link HousingDispTypeType }
     *     
     */
    public HousingDispTypeType getBorwPrevHousingDispType() {
        return borwPrevHousingDispType;
    }

    /**
     * Sets the value of the borwPrevHousingDispType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HousingDispTypeType }
     *     
     */
    public void setBorwPrevHousingDispType(HousingDispTypeType value) {
        this.borwPrevHousingDispType = value;
    }

    /**
     * Gets the value of the borwPrevHousingTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermCType }
     *     
     */
    public TermCType getBorwPrevHousingTerm() {
        return borwPrevHousingTerm;
    }

    /**
     * Sets the value of the borwPrevHousingTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCType }
     *     
     */
    public void setBorwPrevHousingTerm(TermCType value) {
        this.borwPrevHousingTerm = value;
    }

    /**
     * Gets the value of the borwDriverLicId property.
     * 
     * @return
     *     possible object is
     *     {@link DriverLicIdType }
     *     
     */
    public DriverLicIdType getBorwDriverLicId() {
        return borwDriverLicId;
    }

    /**
     * Sets the value of the borwDriverLicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverLicIdType }
     *     
     */
    public void setBorwDriverLicId(DriverLicIdType value) {
        this.borwDriverLicId = value;
    }

    /**
     * Gets the value of the borwEmplInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EmplInfoCType }
     *     
     */
    public EmplInfoCType getBorwEmplInfo() {
        return borwEmplInfo;
    }

    /**
     * Sets the value of the borwEmplInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplInfoCType }
     *     
     */
    public void setBorwEmplInfo(EmplInfoCType value) {
        this.borwEmplInfo = value;
    }

    /**
     * Gets the value of the borwIncmInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IncmInfoCType }
     *     
     */
    public IncmInfoCType getBorwIncmInfo() {
        return borwIncmInfo;
    }

    /**
     * Sets the value of the borwIncmInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncmInfoCType }
     *     
     */
    public void setBorwIncmInfo(IncmInfoCType value) {
        this.borwIncmInfo = value;
    }

    /**
     * Gets the value of the borwPrevEmplArray property.
     * 
     * @return
     *     possible object is
     *     {@link BorwPrevEmplArrayAType }
     *     
     */
    public BorwPrevEmplArrayAType getBorwPrevEmplArray() {
        return borwPrevEmplArray;
    }

    /**
     * Sets the value of the borwPrevEmplArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwPrevEmplArrayAType }
     *     
     */
    public void setBorwPrevEmplArray(BorwPrevEmplArrayAType value) {
        this.borwPrevEmplArray = value;
    }

    /**
     * Gets the value of the borwDeclAppInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeclAppInfoCType }
     *     
     */
    public DeclAppInfoCType getBorwDeclAppInfo() {
        return borwDeclAppInfo;
    }

    /**
     * Sets the value of the borwDeclAppInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclAppInfoCType }
     *     
     */
    public void setBorwDeclAppInfo(DeclAppInfoCType value) {
        this.borwDeclAppInfo = value;
    }

    /**
     * Gets the value of the borwEthnicType property.
     * 
     * @return
     *     possible object is
     *     {@link EthnicTypeType }
     *     
     */
    public EthnicTypeType getBorwEthnicType() {
        return borwEthnicType;
    }

    /**
     * Sets the value of the borwEthnicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicTypeType }
     *     
     */
    public void setBorwEthnicType(EthnicTypeType value) {
        this.borwEthnicType = value;
    }

    /**
     * Gets the value of the borwRaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BorwRaceCodeType }
     *     
     */
    public BorwRaceCodeType getBorwRaceCode() {
        return borwRaceCode;
    }

    /**
     * Sets the value of the borwRaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwRaceCodeType }
     *     
     */
    public void setBorwRaceCode(BorwRaceCodeType value) {
        this.borwRaceCode = value;
    }

    /**
     * Gets the value of the borwGender property.
     * 
     * @return
     *     possible object is
     *     {@link BorwGenderType }
     *     
     */
    public BorwGenderType getBorwGender() {
        return borwGender;
    }

    /**
     * Sets the value of the borwGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwGenderType }
     *     
     */
    public void setBorwGender(BorwGenderType value) {
        this.borwGender = value;
    }

    /**
     * Gets the value of the borwAlimonyOthMainType property.
     * 
     * @return
     *     possible object is
     *     {@link AlimonyOthMainTypeType }
     *     
     */
    public AlimonyOthMainTypeType getBorwAlimonyOthMainType() {
        return borwAlimonyOthMainType;
    }

    /**
     * Sets the value of the borwAlimonyOthMainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlimonyOthMainTypeType }
     *     
     */
    public void setBorwAlimonyOthMainType(AlimonyOthMainTypeType value) {
        this.borwAlimonyOthMainType = value;
    }

    /**
     * Gets the value of the borwIncmRed property.
     * 
     * @return
     *     possible object is
     *     {@link IncmRedType }
     *     
     */
    public IncmRedType getBorwIncmRed() {
        return borwIncmRed;
    }

    /**
     * Sets the value of the borwIncmRed property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncmRedType }
     *     
     */
    public void setBorwIncmRed(IncmRedType value) {
        this.borwIncmRed = value;
    }

    /**
     * Gets the value of the borwIncmRedRsn property.
     * 
     * @return
     *     possible object is
     *     {@link IncmRedRsnType }
     *     
     */
    public IncmRedRsnType getBorwIncmRedRsn() {
        return borwIncmRedRsn;
    }

    /**
     * Sets the value of the borwIncmRedRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncmRedRsnType }
     *     
     */
    public void setBorwIncmRedRsn(IncmRedRsnType value) {
        this.borwIncmRedRsn = value;
    }

    /**
     * Gets the value of the borwPrevCrRecv property.
     * 
     * @return
     *     possible object is
     *     {@link PrevCrRecvType }
     *     
     */
    public PrevCrRecvType getBorwPrevCrRecv() {
        return borwPrevCrRecv;
    }

    /**
     * Sets the value of the borwPrevCrRecv property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevCrRecvType }
     *     
     */
    public void setBorwPrevCrRecv(PrevCrRecvType value) {
        this.borwPrevCrRecv = value;
    }

    /**
     * Gets the value of the borwPrevCrRecvDt property.
     * 
     * @return
     *     possible object is
     *     {@link PrevCrRecvDtType }
     *     
     */
    public PrevCrRecvDtType getBorwPrevCrRecvDt() {
        return borwPrevCrRecvDt;
    }

    /**
     * Sets the value of the borwPrevCrRecvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevCrRecvDtType }
     *     
     */
    public void setBorwPrevCrRecvDt(PrevCrRecvDtType value) {
        this.borwPrevCrRecvDt = value;
    }

    /**
     * Gets the value of the borwNearRelName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getBorwNearRelName() {
        return borwNearRelName;
    }

    /**
     * Sets the value of the borwNearRelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setBorwNearRelName(PersonNameCType value) {
        this.borwNearRelName = value;
    }

    /**
     * Gets the value of the borwNearRelAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getBorwNearRelAddr() {
        return borwNearRelAddr;
    }

    /**
     * Sets the value of the borwNearRelAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setBorwNearRelAddr(AddrCType value) {
        this.borwNearRelAddr = value;
    }

    /**
     * Gets the value of the borwNearRelPhone property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneInfoCType }
     *     
     */
    public PhoneInfoCType getBorwNearRelPhone() {
        return borwNearRelPhone;
    }

    /**
     * Sets the value of the borwNearRelPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneInfoCType }
     *     
     */
    public void setBorwNearRelPhone(PhoneInfoCType value) {
        this.borwNearRelPhone = value;
    }

    /**
     * Gets the value of the borwNearRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link NearRelCodeType }
     *     
     */
    public NearRelCodeType getBorwNearRelCode() {
        return borwNearRelCode;
    }

    /**
     * Sets the value of the borwNearRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NearRelCodeType }
     *     
     */
    public void setBorwNearRelCode(NearRelCodeType value) {
        this.borwNearRelCode = value;
    }

    /**
     * Gets the value of the borwMltryStat property.
     * 
     * @return
     *     possible object is
     *     {@link MltryStatType }
     *     
     */
    public MltryStatType getBorwMltryStat() {
        return borwMltryStat;
    }

    /**
     * Sets the value of the borwMltryStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link MltryStatType }
     *     
     */
    public void setBorwMltryStat(MltryStatType value) {
        this.borwMltryStat = value;
    }

    /**
     * Gets the value of the borwMltryBr property.
     * 
     * @return
     *     possible object is
     *     {@link MltryBrType }
     *     
     */
    public MltryBrType getBorwMltryBr() {
        return borwMltryBr;
    }

    /**
     * Sets the value of the borwMltryBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MltryBrType }
     *     
     */
    public void setBorwMltryBr(MltryBrType value) {
        this.borwMltryBr = value;
    }

    /**
     * Gets the value of the assetLiabJoint property.
     * 
     * @return
     *     possible object is
     *     {@link AssetLiabJointType }
     *     
     */
    public AssetLiabJointType getAssetLiabJoint() {
        return assetLiabJoint;
    }

    /**
     * Sets the value of the assetLiabJoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetLiabJointType }
     *     
     */
    public void setAssetLiabJoint(AssetLiabJointType value) {
        this.assetLiabJoint = value;
    }

    /**
     * Gets the value of the borwAppAssetLiabInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppAssetLiabInfoCType }
     *     
     */
    public PltfmAppAssetLiabInfoCType getBorwAppAssetLiabInfo() {
        return borwAppAssetLiabInfo;
    }

    /**
     * Sets the value of the borwAppAssetLiabInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppAssetLiabInfoCType }
     *     
     */
    public void setBorwAppAssetLiabInfo(PltfmAppAssetLiabInfoCType value) {
        this.borwAppAssetLiabInfo = value;
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
     * Gets the value of the idIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link IdIssueDtType }
     *     
     */
    public IdIssueDtType getIdIssueDt() {
        return idIssueDt;
    }

    /**
     * Sets the value of the idIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdIssueDtType }
     *     
     */
    public void setIdIssueDt(IdIssueDtType value) {
        this.idIssueDt = value;
    }

    /**
     * Gets the value of the idIssueExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link IdIssueExpDtType }
     *     
     */
    public IdIssueExpDtType getIdIssueExpDt() {
        return idIssueExpDt;
    }

    /**
     * Sets the value of the idIssueExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdIssueExpDtType }
     *     
     */
    public void setIdIssueExpDt(IdIssueExpDtType value) {
        this.idIssueExpDt = value;
    }

    /**
     * Gets the value of the idStateIssue property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getIdStateIssue() {
        return idStateIssue;
    }

    /**
     * Sets the value of the idStateIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setIdStateIssue(StateType value) {
        this.idStateIssue = value;
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
     * Gets the value of the acctRelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRelDescType }
     *     
     */
    public AcctRelDescType getAcctRelDesc() {
        return acctRelDesc;
    }

    /**
     * Sets the value of the acctRelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRelDescType }
     *     
     */
    public void setAcctRelDesc(AcctRelDescType value) {
        this.acctRelDesc = value;
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
     * Gets the value of the borwEmailArray property.
     * 
     * @return
     *     possible object is
     *     {@link EmailArrayAType }
     *     
     */
    public EmailArrayAType getBorwEmailArray() {
        return borwEmailArray;
    }

    /**
     * Sets the value of the borwEmailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailArrayAType }
     *     
     */
    public void setBorwEmailArray(EmailArrayAType value) {
        this.borwEmailArray = value;
    }

    /**
     * Gets the value of the borwEmplArray property.
     * 
     * @return
     *     possible object is
     *     {@link BorwEmplArrayAType }
     *     
     */
    public BorwEmplArrayAType getBorwEmplArray() {
        return borwEmplArray;
    }

    /**
     * Sets the value of the borwEmplArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwEmplArrayAType }
     *     
     */
    public void setBorwEmplArray(BorwEmplArrayAType value) {
        this.borwEmplArray = value;
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
