
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
 *                 Co-borrowers entity
 * 
 * <p>Java class for PltfmAppCoBorwInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppCoBorwInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoBorwName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwTaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwPhoneInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}CoBorwBirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwYrEduc" type="{http://jackhenry.com/jxchange/TPG/2008}YrEduc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwMartialStatType" type="{http://jackhenry.com/jxchange/TPG/2008}MartialStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwDepdentNum" type="{http://jackhenry.com/jxchange/TPG/2008}DepdentNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwDepdentArray" type="{http://jackhenry.com/jxchange/TPG/2008}DepdentArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwHousingDispType" type="{http://jackhenry.com/jxchange/TPG/2008}HousingDispType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwHousingTerm" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwMailAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwPrevAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwPrevHousingDispType" type="{http://jackhenry.com/jxchange/TPG/2008}HousingDispType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwPrevHousingTerm" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwDriverLicId" type="{http://jackhenry.com/jxchange/TPG/2008}DriverLicId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwEmplInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EmplInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwIncmInfo" type="{http://jackhenry.com/jxchange/TPG/2008}IncmInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwPrevEmplArray" type="{http://jackhenry.com/jxchange/TPG/2008}BorwPrevEmplArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwDeclAppInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DeclAppInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwEthnicType" type="{http://jackhenry.com/jxchange/TPG/2008}EthnicType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwRaceCode" type="{http://jackhenry.com/jxchange/TPG/2008}CoBorwRaceCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwGender" type="{http://jackhenry.com/jxchange/TPG/2008}CoBorwGender_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwAlimonyOthMainType" type="{http://jackhenry.com/jxchange/TPG/2008}AlimonyOthMainType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwIncmRed" type="{http://jackhenry.com/jxchange/TPG/2008}IncmRed_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwIncmRedRsn" type="{http://jackhenry.com/jxchange/TPG/2008}IncmRedRsn_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwPrevCrRecv" type="{http://jackhenry.com/jxchange/TPG/2008}PrevCrRecv_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwPrevCrRecvDt" type="{http://jackhenry.com/jxchange/TPG/2008}PrevCrRecvDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwNearRelName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwNearRelAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwNearRelPhone" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwNearRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}NearRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwMltryStat" type="{http://jackhenry.com/jxchange/TPG/2008}MltryStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwMltryBr" type="{http://jackhenry.com/jxchange/TPG/2008}MltryBr_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwAppAssetLiabInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppAssetLiabInfo_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="IdIssueDt" type="{http://jackhenry.com/jxchange/TPG/2008}IdIssueDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="IdIssueExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}IdIssueExpDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="IdStatetIssue" type="{http://jackhenry.com/jxchange/TPG/2008}State_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctRelDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="IdVerifyArray" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="CoBorwEmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="CoBorwEmplArray" type="{http://jackhenry.com/jxchange/TPG/2008}BorwEmplArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmAppCoBorwInfoRec_CType", propOrder = {
    "coBorwName",
    "coBorwAddr",
    "coBorwTaxId",
    "coBorwPhoneInfoArray",
    "coBorwBirthDt",
    "coBorwYrEduc",
    "coBorwMartialStatType",
    "coBorwDepdentNum",
    "coBorwDepdentArray",
    "coBorwHousingDispType",
    "coBorwHousingTerm",
    "coBorwMailAddr",
    "coBorwPrevAddr",
    "coBorwPrevHousingDispType",
    "coBorwPrevHousingTerm",
    "coBorwDriverLicId",
    "coBorwEmplInfo",
    "coBorwIncmInfo",
    "coBorwPrevEmplArray",
    "coBorwDeclAppInfo",
    "coBorwEthnicType",
    "coBorwRaceCode",
    "coBorwGender",
    "coBorwAlimonyOthMainType",
    "coBorwIncmRed",
    "coBorwIncmRedRsn",
    "coBorwPrevCrRecv",
    "coBorwPrevCrRecvDt",
    "coBorwNearRelName",
    "coBorwNearRelAddr",
    "coBorwNearRelPhone",
    "coBorwNearRelCode",
    "coBorwMltryStat",
    "coBorwMltryBr",
    "coBorwAppAssetLiabInfo",
    "ver1",
    "idIssueDt",
    "idIssueExpDt",
    "idStatetIssue",
    "acctRelCode",
    "acctRelDesc",
    "custId",
    "ver2",
    "idVerifyArray",
    "coBorwEmailArray",
    "coBorwEmplArray",
    "dueDilgntCmpltArray",
    "ver3",
    "abbrCustDesc",
    "ver4",
    "any"
})
public class PltfmAppCoBorwInfoRecCType {

    @XmlElement(name = "CoBorwName")
    protected PersonNameCType coBorwName;
    @XmlElement(name = "CoBorwAddr")
    protected AddrCType coBorwAddr;
    @XmlElement(name = "CoBorwTaxId")
    protected TaxIdType coBorwTaxId;
    @XmlElement(name = "CoBorwPhoneInfoArray")
    protected PhoneArrayAType coBorwPhoneInfoArray;
    @XmlElement(name = "CoBorwBirthDt")
    protected CoBorwBirthDtType coBorwBirthDt;
    @XmlElement(name = "CoBorwYrEduc")
    protected YrEducType coBorwYrEduc;
    @XmlElement(name = "CoBorwMartialStatType")
    protected MartialStatTypeType coBorwMartialStatType;
    @XmlElement(name = "CoBorwDepdentNum")
    protected DepdentNumType coBorwDepdentNum;
    @XmlElement(name = "CoBorwDepdentArray")
    protected DepdentArrayAType coBorwDepdentArray;
    @XmlElement(name = "CoBorwHousingDispType")
    protected HousingDispTypeType coBorwHousingDispType;
    @XmlElement(name = "CoBorwHousingTerm")
    protected TermCType coBorwHousingTerm;
    @XmlElement(name = "CoBorwMailAddr")
    protected AddrCType coBorwMailAddr;
    @XmlElement(name = "CoBorwPrevAddr")
    protected AddrCType coBorwPrevAddr;
    @XmlElement(name = "CoBorwPrevHousingDispType")
    protected HousingDispTypeType coBorwPrevHousingDispType;
    @XmlElement(name = "CoBorwPrevHousingTerm")
    protected TermCType coBorwPrevHousingTerm;
    @XmlElement(name = "CoBorwDriverLicId")
    protected DriverLicIdType coBorwDriverLicId;
    @XmlElement(name = "CoBorwEmplInfo")
    protected EmplInfoCType coBorwEmplInfo;
    @XmlElement(name = "CoBorwIncmInfo")
    protected IncmInfoCType coBorwIncmInfo;
    @XmlElement(name = "CoBorwPrevEmplArray")
    protected BorwPrevEmplArrayAType coBorwPrevEmplArray;
    @XmlElement(name = "CoBorwDeclAppInfo")
    protected DeclAppInfoCType coBorwDeclAppInfo;
    @XmlElement(name = "CoBorwEthnicType")
    protected EthnicTypeType coBorwEthnicType;
    @XmlElement(name = "CoBorwRaceCode")
    protected CoBorwRaceCodeType coBorwRaceCode;
    @XmlElement(name = "CoBorwGender")
    protected CoBorwGenderType coBorwGender;
    @XmlElement(name = "CoBorwAlimonyOthMainType")
    protected AlimonyOthMainTypeType coBorwAlimonyOthMainType;
    @XmlElement(name = "CoBorwIncmRed")
    protected IncmRedType coBorwIncmRed;
    @XmlElement(name = "CoBorwIncmRedRsn")
    protected IncmRedRsnType coBorwIncmRedRsn;
    @XmlElement(name = "CoBorwPrevCrRecv")
    protected PrevCrRecvType coBorwPrevCrRecv;
    @XmlElement(name = "CoBorwPrevCrRecvDt")
    protected PrevCrRecvDtType coBorwPrevCrRecvDt;
    @XmlElement(name = "CoBorwNearRelName")
    protected PersonNameCType coBorwNearRelName;
    @XmlElement(name = "CoBorwNearRelAddr")
    protected AddrCType coBorwNearRelAddr;
    @XmlElement(name = "CoBorwNearRelPhone")
    protected PhoneInfoCType coBorwNearRelPhone;
    @XmlElement(name = "CoBorwNearRelCode")
    protected NearRelCodeType coBorwNearRelCode;
    @XmlElement(name = "CoBorwMltryStat")
    protected MltryStatType coBorwMltryStat;
    @XmlElement(name = "CoBorwMltryBr")
    protected MltryBrType coBorwMltryBr;
    @XmlElement(name = "CoBorwAppAssetLiabInfo")
    protected PltfmAppAssetLiabInfoCType coBorwAppAssetLiabInfo;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "IdIssueDt")
    protected IdIssueDtType idIssueDt;
    @XmlElement(name = "IdIssueExpDt")
    protected IdIssueExpDtType idIssueExpDt;
    @XmlElement(name = "IdStatetIssue")
    protected StateType idStatetIssue;
    @XmlElement(name = "AcctRelCode")
    protected AcctRelCodeType acctRelCode;
    @XmlElement(name = "AcctRelDesc")
    protected AcctRelDescType acctRelDesc;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "IdVerifyArray")
    protected IdVerifyArrayAType idVerifyArray;
    @XmlElement(name = "CoBorwEmailArray")
    protected EmailArrayAType coBorwEmailArray;
    @XmlElement(name = "CoBorwEmplArray")
    protected BorwEmplArrayAType coBorwEmplArray;
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
     * Gets the value of the coBorwName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getCoBorwName() {
        return coBorwName;
    }

    /**
     * Sets the value of the coBorwName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setCoBorwName(PersonNameCType value) {
        this.coBorwName = value;
    }

    /**
     * Gets the value of the coBorwAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getCoBorwAddr() {
        return coBorwAddr;
    }

    /**
     * Sets the value of the coBorwAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setCoBorwAddr(AddrCType value) {
        this.coBorwAddr = value;
    }

    /**
     * Gets the value of the coBorwTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getCoBorwTaxId() {
        return coBorwTaxId;
    }

    /**
     * Sets the value of the coBorwTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setCoBorwTaxId(TaxIdType value) {
        this.coBorwTaxId = value;
    }

    /**
     * Gets the value of the coBorwPhoneInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getCoBorwPhoneInfoArray() {
        return coBorwPhoneInfoArray;
    }

    /**
     * Sets the value of the coBorwPhoneInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setCoBorwPhoneInfoArray(PhoneArrayAType value) {
        this.coBorwPhoneInfoArray = value;
    }

    /**
     * Gets the value of the coBorwBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link CoBorwBirthDtType }
     *     
     */
    public CoBorwBirthDtType getCoBorwBirthDt() {
        return coBorwBirthDt;
    }

    /**
     * Sets the value of the coBorwBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoBorwBirthDtType }
     *     
     */
    public void setCoBorwBirthDt(CoBorwBirthDtType value) {
        this.coBorwBirthDt = value;
    }

    /**
     * Gets the value of the coBorwYrEduc property.
     * 
     * @return
     *     possible object is
     *     {@link YrEducType }
     *     
     */
    public YrEducType getCoBorwYrEduc() {
        return coBorwYrEduc;
    }

    /**
     * Sets the value of the coBorwYrEduc property.
     * 
     * @param value
     *     allowed object is
     *     {@link YrEducType }
     *     
     */
    public void setCoBorwYrEduc(YrEducType value) {
        this.coBorwYrEduc = value;
    }

    /**
     * Gets the value of the coBorwMartialStatType property.
     * 
     * @return
     *     possible object is
     *     {@link MartialStatTypeType }
     *     
     */
    public MartialStatTypeType getCoBorwMartialStatType() {
        return coBorwMartialStatType;
    }

    /**
     * Sets the value of the coBorwMartialStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MartialStatTypeType }
     *     
     */
    public void setCoBorwMartialStatType(MartialStatTypeType value) {
        this.coBorwMartialStatType = value;
    }

    /**
     * Gets the value of the coBorwDepdentNum property.
     * 
     * @return
     *     possible object is
     *     {@link DepdentNumType }
     *     
     */
    public DepdentNumType getCoBorwDepdentNum() {
        return coBorwDepdentNum;
    }

    /**
     * Sets the value of the coBorwDepdentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepdentNumType }
     *     
     */
    public void setCoBorwDepdentNum(DepdentNumType value) {
        this.coBorwDepdentNum = value;
    }

    /**
     * Gets the value of the coBorwDepdentArray property.
     * 
     * @return
     *     possible object is
     *     {@link DepdentArrayAType }
     *     
     */
    public DepdentArrayAType getCoBorwDepdentArray() {
        return coBorwDepdentArray;
    }

    /**
     * Sets the value of the coBorwDepdentArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepdentArrayAType }
     *     
     */
    public void setCoBorwDepdentArray(DepdentArrayAType value) {
        this.coBorwDepdentArray = value;
    }

    /**
     * Gets the value of the coBorwHousingDispType property.
     * 
     * @return
     *     possible object is
     *     {@link HousingDispTypeType }
     *     
     */
    public HousingDispTypeType getCoBorwHousingDispType() {
        return coBorwHousingDispType;
    }

    /**
     * Sets the value of the coBorwHousingDispType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HousingDispTypeType }
     *     
     */
    public void setCoBorwHousingDispType(HousingDispTypeType value) {
        this.coBorwHousingDispType = value;
    }

    /**
     * Gets the value of the coBorwHousingTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermCType }
     *     
     */
    public TermCType getCoBorwHousingTerm() {
        return coBorwHousingTerm;
    }

    /**
     * Sets the value of the coBorwHousingTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCType }
     *     
     */
    public void setCoBorwHousingTerm(TermCType value) {
        this.coBorwHousingTerm = value;
    }

    /**
     * Gets the value of the coBorwMailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getCoBorwMailAddr() {
        return coBorwMailAddr;
    }

    /**
     * Sets the value of the coBorwMailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setCoBorwMailAddr(AddrCType value) {
        this.coBorwMailAddr = value;
    }

    /**
     * Gets the value of the coBorwPrevAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getCoBorwPrevAddr() {
        return coBorwPrevAddr;
    }

    /**
     * Sets the value of the coBorwPrevAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setCoBorwPrevAddr(AddrCType value) {
        this.coBorwPrevAddr = value;
    }

    /**
     * Gets the value of the coBorwPrevHousingDispType property.
     * 
     * @return
     *     possible object is
     *     {@link HousingDispTypeType }
     *     
     */
    public HousingDispTypeType getCoBorwPrevHousingDispType() {
        return coBorwPrevHousingDispType;
    }

    /**
     * Sets the value of the coBorwPrevHousingDispType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HousingDispTypeType }
     *     
     */
    public void setCoBorwPrevHousingDispType(HousingDispTypeType value) {
        this.coBorwPrevHousingDispType = value;
    }

    /**
     * Gets the value of the coBorwPrevHousingTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermCType }
     *     
     */
    public TermCType getCoBorwPrevHousingTerm() {
        return coBorwPrevHousingTerm;
    }

    /**
     * Sets the value of the coBorwPrevHousingTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCType }
     *     
     */
    public void setCoBorwPrevHousingTerm(TermCType value) {
        this.coBorwPrevHousingTerm = value;
    }

    /**
     * Gets the value of the coBorwDriverLicId property.
     * 
     * @return
     *     possible object is
     *     {@link DriverLicIdType }
     *     
     */
    public DriverLicIdType getCoBorwDriverLicId() {
        return coBorwDriverLicId;
    }

    /**
     * Sets the value of the coBorwDriverLicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverLicIdType }
     *     
     */
    public void setCoBorwDriverLicId(DriverLicIdType value) {
        this.coBorwDriverLicId = value;
    }

    /**
     * Gets the value of the coBorwEmplInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EmplInfoCType }
     *     
     */
    public EmplInfoCType getCoBorwEmplInfo() {
        return coBorwEmplInfo;
    }

    /**
     * Sets the value of the coBorwEmplInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplInfoCType }
     *     
     */
    public void setCoBorwEmplInfo(EmplInfoCType value) {
        this.coBorwEmplInfo = value;
    }

    /**
     * Gets the value of the coBorwIncmInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IncmInfoCType }
     *     
     */
    public IncmInfoCType getCoBorwIncmInfo() {
        return coBorwIncmInfo;
    }

    /**
     * Sets the value of the coBorwIncmInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncmInfoCType }
     *     
     */
    public void setCoBorwIncmInfo(IncmInfoCType value) {
        this.coBorwIncmInfo = value;
    }

    /**
     * Gets the value of the coBorwPrevEmplArray property.
     * 
     * @return
     *     possible object is
     *     {@link BorwPrevEmplArrayAType }
     *     
     */
    public BorwPrevEmplArrayAType getCoBorwPrevEmplArray() {
        return coBorwPrevEmplArray;
    }

    /**
     * Sets the value of the coBorwPrevEmplArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwPrevEmplArrayAType }
     *     
     */
    public void setCoBorwPrevEmplArray(BorwPrevEmplArrayAType value) {
        this.coBorwPrevEmplArray = value;
    }

    /**
     * Gets the value of the coBorwDeclAppInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeclAppInfoCType }
     *     
     */
    public DeclAppInfoCType getCoBorwDeclAppInfo() {
        return coBorwDeclAppInfo;
    }

    /**
     * Sets the value of the coBorwDeclAppInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclAppInfoCType }
     *     
     */
    public void setCoBorwDeclAppInfo(DeclAppInfoCType value) {
        this.coBorwDeclAppInfo = value;
    }

    /**
     * Gets the value of the coBorwEthnicType property.
     * 
     * @return
     *     possible object is
     *     {@link EthnicTypeType }
     *     
     */
    public EthnicTypeType getCoBorwEthnicType() {
        return coBorwEthnicType;
    }

    /**
     * Sets the value of the coBorwEthnicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicTypeType }
     *     
     */
    public void setCoBorwEthnicType(EthnicTypeType value) {
        this.coBorwEthnicType = value;
    }

    /**
     * Gets the value of the coBorwRaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link CoBorwRaceCodeType }
     *     
     */
    public CoBorwRaceCodeType getCoBorwRaceCode() {
        return coBorwRaceCode;
    }

    /**
     * Sets the value of the coBorwRaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoBorwRaceCodeType }
     *     
     */
    public void setCoBorwRaceCode(CoBorwRaceCodeType value) {
        this.coBorwRaceCode = value;
    }

    /**
     * Gets the value of the coBorwGender property.
     * 
     * @return
     *     possible object is
     *     {@link CoBorwGenderType }
     *     
     */
    public CoBorwGenderType getCoBorwGender() {
        return coBorwGender;
    }

    /**
     * Sets the value of the coBorwGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoBorwGenderType }
     *     
     */
    public void setCoBorwGender(CoBorwGenderType value) {
        this.coBorwGender = value;
    }

    /**
     * Gets the value of the coBorwAlimonyOthMainType property.
     * 
     * @return
     *     possible object is
     *     {@link AlimonyOthMainTypeType }
     *     
     */
    public AlimonyOthMainTypeType getCoBorwAlimonyOthMainType() {
        return coBorwAlimonyOthMainType;
    }

    /**
     * Sets the value of the coBorwAlimonyOthMainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlimonyOthMainTypeType }
     *     
     */
    public void setCoBorwAlimonyOthMainType(AlimonyOthMainTypeType value) {
        this.coBorwAlimonyOthMainType = value;
    }

    /**
     * Gets the value of the coBorwIncmRed property.
     * 
     * @return
     *     possible object is
     *     {@link IncmRedType }
     *     
     */
    public IncmRedType getCoBorwIncmRed() {
        return coBorwIncmRed;
    }

    /**
     * Sets the value of the coBorwIncmRed property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncmRedType }
     *     
     */
    public void setCoBorwIncmRed(IncmRedType value) {
        this.coBorwIncmRed = value;
    }

    /**
     * Gets the value of the coBorwIncmRedRsn property.
     * 
     * @return
     *     possible object is
     *     {@link IncmRedRsnType }
     *     
     */
    public IncmRedRsnType getCoBorwIncmRedRsn() {
        return coBorwIncmRedRsn;
    }

    /**
     * Sets the value of the coBorwIncmRedRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncmRedRsnType }
     *     
     */
    public void setCoBorwIncmRedRsn(IncmRedRsnType value) {
        this.coBorwIncmRedRsn = value;
    }

    /**
     * Gets the value of the coBorwPrevCrRecv property.
     * 
     * @return
     *     possible object is
     *     {@link PrevCrRecvType }
     *     
     */
    public PrevCrRecvType getCoBorwPrevCrRecv() {
        return coBorwPrevCrRecv;
    }

    /**
     * Sets the value of the coBorwPrevCrRecv property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevCrRecvType }
     *     
     */
    public void setCoBorwPrevCrRecv(PrevCrRecvType value) {
        this.coBorwPrevCrRecv = value;
    }

    /**
     * Gets the value of the coBorwPrevCrRecvDt property.
     * 
     * @return
     *     possible object is
     *     {@link PrevCrRecvDtType }
     *     
     */
    public PrevCrRecvDtType getCoBorwPrevCrRecvDt() {
        return coBorwPrevCrRecvDt;
    }

    /**
     * Sets the value of the coBorwPrevCrRecvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevCrRecvDtType }
     *     
     */
    public void setCoBorwPrevCrRecvDt(PrevCrRecvDtType value) {
        this.coBorwPrevCrRecvDt = value;
    }

    /**
     * Gets the value of the coBorwNearRelName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getCoBorwNearRelName() {
        return coBorwNearRelName;
    }

    /**
     * Sets the value of the coBorwNearRelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setCoBorwNearRelName(PersonNameCType value) {
        this.coBorwNearRelName = value;
    }

    /**
     * Gets the value of the coBorwNearRelAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getCoBorwNearRelAddr() {
        return coBorwNearRelAddr;
    }

    /**
     * Sets the value of the coBorwNearRelAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setCoBorwNearRelAddr(AddrCType value) {
        this.coBorwNearRelAddr = value;
    }

    /**
     * Gets the value of the coBorwNearRelPhone property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneInfoCType }
     *     
     */
    public PhoneInfoCType getCoBorwNearRelPhone() {
        return coBorwNearRelPhone;
    }

    /**
     * Sets the value of the coBorwNearRelPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneInfoCType }
     *     
     */
    public void setCoBorwNearRelPhone(PhoneInfoCType value) {
        this.coBorwNearRelPhone = value;
    }

    /**
     * Gets the value of the coBorwNearRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link NearRelCodeType }
     *     
     */
    public NearRelCodeType getCoBorwNearRelCode() {
        return coBorwNearRelCode;
    }

    /**
     * Sets the value of the coBorwNearRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NearRelCodeType }
     *     
     */
    public void setCoBorwNearRelCode(NearRelCodeType value) {
        this.coBorwNearRelCode = value;
    }

    /**
     * Gets the value of the coBorwMltryStat property.
     * 
     * @return
     *     possible object is
     *     {@link MltryStatType }
     *     
     */
    public MltryStatType getCoBorwMltryStat() {
        return coBorwMltryStat;
    }

    /**
     * Sets the value of the coBorwMltryStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link MltryStatType }
     *     
     */
    public void setCoBorwMltryStat(MltryStatType value) {
        this.coBorwMltryStat = value;
    }

    /**
     * Gets the value of the coBorwMltryBr property.
     * 
     * @return
     *     possible object is
     *     {@link MltryBrType }
     *     
     */
    public MltryBrType getCoBorwMltryBr() {
        return coBorwMltryBr;
    }

    /**
     * Sets the value of the coBorwMltryBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MltryBrType }
     *     
     */
    public void setCoBorwMltryBr(MltryBrType value) {
        this.coBorwMltryBr = value;
    }

    /**
     * Gets the value of the coBorwAppAssetLiabInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppAssetLiabInfoCType }
     *     
     */
    public PltfmAppAssetLiabInfoCType getCoBorwAppAssetLiabInfo() {
        return coBorwAppAssetLiabInfo;
    }

    /**
     * Sets the value of the coBorwAppAssetLiabInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppAssetLiabInfoCType }
     *     
     */
    public void setCoBorwAppAssetLiabInfo(PltfmAppAssetLiabInfoCType value) {
        this.coBorwAppAssetLiabInfo = value;
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
     * Gets the value of the idStatetIssue property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getIdStatetIssue() {
        return idStatetIssue;
    }

    /**
     * Sets the value of the idStatetIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setIdStatetIssue(StateType value) {
        this.idStatetIssue = value;
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
     * Gets the value of the coBorwEmailArray property.
     * 
     * @return
     *     possible object is
     *     {@link EmailArrayAType }
     *     
     */
    public EmailArrayAType getCoBorwEmailArray() {
        return coBorwEmailArray;
    }

    /**
     * Sets the value of the coBorwEmailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailArrayAType }
     *     
     */
    public void setCoBorwEmailArray(EmailArrayAType value) {
        this.coBorwEmailArray = value;
    }

    /**
     * Gets the value of the coBorwEmplArray property.
     * 
     * @return
     *     possible object is
     *     {@link BorwEmplArrayAType }
     *     
     */
    public BorwEmplArrayAType getCoBorwEmplArray() {
        return coBorwEmplArray;
    }

    /**
     * Sets the value of the coBorwEmplArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwEmplArrayAType }
     *     
     */
    public void setCoBorwEmplArray(BorwEmplArrayAType value) {
        this.coBorwEmplArray = value;
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
