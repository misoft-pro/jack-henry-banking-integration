
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
 * <p>Java class for EmplAppInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmplAppInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="NonUSCitizen" type="{http://jackhenry.com/jxchange/TPG/2008}NonUSCitizen_Type" minOccurs="0"/&gt;
 *         &lt;element name="RaceCode" type="{http://jackhenry.com/jxchange/TPG/2008}RaceCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://jackhenry.com/jxchange/TPG/2008}Gender_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppEducLvlCode" type="{http://jackhenry.com/jxchange/TPG/2008}AppEducLvlCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PartTimePos" type="{http://jackhenry.com/jxchange/TPG/2008}PartTimePos_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppDisabled" type="{http://jackhenry.com/jxchange/TPG/2008}AppDisabled_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppVetCode" type="{http://jackhenry.com/jxchange/TPG/2008}AppVetCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppFelony" type="{http://jackhenry.com/jxchange/TPG/2008}AppFelony_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppCrChk" type="{http://jackhenry.com/jxchange/TPG/2008}AppCrChk_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppBackGrndChk" type="{http://jackhenry.com/jxchange/TPG/2008}AppBackGrndChk_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppDrugTest" type="{http://jackhenry.com/jxchange/TPG/2008}AppDrugTest_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayHighAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PayHighAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayLowAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PayLowAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmpRefCode" type="{http://jackhenry.com/jxchange/TPG/2008}EmpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppRecvDt" type="{http://jackhenry.com/jxchange/TPG/2008}AppRecvDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppRecvTime" type="{http://jackhenry.com/jxchange/TPG/2008}AppRecvTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppAvlDt" type="{http://jackhenry.com/jxchange/TPG/2008}AppAvlDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BnkRptcyFiled" type="{http://jackhenry.com/jxchange/TPG/2008}BnkRptcyFiled_Type" minOccurs="0"/&gt;
 *         &lt;element name="BondRefused" type="{http://jackhenry.com/jxchange/TPG/2008}BondRefused_Type" minOccurs="0"/&gt;
 *         &lt;element name="WorkPermitReq" type="{http://jackhenry.com/jxchange/TPG/2008}WorkPermitReq_Type" minOccurs="0"/&gt;
 *         &lt;element name="CallCurEmpl" type="{http://jackhenry.com/jxchange/TPG/2008}CallCurEmpl_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmplFamMbr" type="{http://jackhenry.com/jxchange/TPG/2008}EmplFamMbr_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecSigRecv" type="{http://jackhenry.com/jxchange/TPG/2008}ElecSigRecv_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobExpcArray" type="{http://jackhenry.com/jxchange/TPG/2008}JobExpcArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="JobRefArray" type="{http://jackhenry.com/jxchange/TPG/2008}JobRefArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ProfesCertifArray" type="{http://jackhenry.com/jxchange/TPG/2008}ProfesCertifArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="GenEducArray" type="{http://jackhenry.com/jxchange/TPG/2008}GenEducArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="SkillsArray" type="{http://jackhenry.com/jxchange/TPG/2008}SkillsArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="MltryCmpgnCode" type="{http://jackhenry.com/jxchange/TPG/2008}MltryCmpgnCode_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "EmplAppInfoRec_CType", propOrder = {
    "taxId",
    "personName",
    "addr",
    "nonUSCitizen",
    "raceCode",
    "gender",
    "appEducLvlCode",
    "partTimePos",
    "appDisabled",
    "appVetCode",
    "appFelony",
    "appCrChk",
    "appBackGrndChk",
    "appDrugTest",
    "brCode",
    "payHighAmt",
    "payLowAmt",
    "empRefCode",
    "appRecvDt",
    "appRecvTime",
    "appAvlDt",
    "bnkRptcyFiled",
    "bondRefused",
    "workPermitReq",
    "callCurEmpl",
    "emplFamMbr",
    "elecSigRecv",
    "jobExpcArray",
    "jobRefArray",
    "profesCertifArray",
    "phoneArray",
    "emailArray",
    "custom",
    "ver1",
    "genEducArray",
    "skillsArray",
    "mltryCmpgnCode",
    "ver2",
    "any"
})
public class EmplAppInfoRecCType {

    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "NonUSCitizen")
    protected NonUSCitizenType nonUSCitizen;
    @XmlElement(name = "RaceCode")
    protected RaceCodeType raceCode;
    @XmlElement(name = "Gender")
    protected GenderType gender;
    @XmlElement(name = "AppEducLvlCode")
    protected AppEducLvlCodeType appEducLvlCode;
    @XmlElement(name = "PartTimePos")
    protected PartTimePosType partTimePos;
    @XmlElement(name = "AppDisabled")
    protected AppDisabledType appDisabled;
    @XmlElement(name = "AppVetCode")
    protected AppVetCodeType appVetCode;
    @XmlElement(name = "AppFelony")
    protected AppFelonyType appFelony;
    @XmlElement(name = "AppCrChk")
    protected AppCrChkType appCrChk;
    @XmlElement(name = "AppBackGrndChk")
    protected AppBackGrndChkType appBackGrndChk;
    @XmlElement(name = "AppDrugTest")
    protected AppDrugTestType appDrugTest;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "PayHighAmt")
    protected PayHighAmtType payHighAmt;
    @XmlElement(name = "PayLowAmt")
    protected PayLowAmtType payLowAmt;
    @XmlElement(name = "EmpRefCode")
    protected EmpCodeType empRefCode;
    @XmlElement(name = "AppRecvDt")
    protected AppRecvDtType appRecvDt;
    @XmlElement(name = "AppRecvTime")
    protected AppRecvTimeType appRecvTime;
    @XmlElement(name = "AppAvlDt")
    protected AppAvlDtType appAvlDt;
    @XmlElement(name = "BnkRptcyFiled")
    protected BnkRptcyFiledType bnkRptcyFiled;
    @XmlElement(name = "BondRefused")
    protected BondRefusedType bondRefused;
    @XmlElement(name = "WorkPermitReq")
    protected WorkPermitReqType workPermitReq;
    @XmlElement(name = "CallCurEmpl")
    protected CallCurEmplType callCurEmpl;
    @XmlElement(name = "EmplFamMbr")
    protected EmplFamMbrType emplFamMbr;
    @XmlElement(name = "ElecSigRecv")
    protected ElecSigRecvType elecSigRecv;
    @XmlElement(name = "JobExpcArray")
    protected JobExpcArrayAType jobExpcArray;
    @XmlElement(name = "JobRefArray")
    protected JobRefArrayAType jobRefArray;
    @XmlElement(name = "ProfesCertifArray")
    protected ProfesCertifArrayAType profesCertifArray;
    @XmlElement(name = "PhoneArray")
    protected PhoneArrayAType phoneArray;
    @XmlElement(name = "EmailArray")
    protected EmailArrayAType emailArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "GenEducArray")
    protected GenEducArrayAType genEducArray;
    @XmlElement(name = "SkillsArray")
    protected SkillsArrayAType skillsArray;
    @XmlElement(name = "MltryCmpgnCode")
    protected MltryCmpgnCodeType mltryCmpgnCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the raceCode property.
     * 
     * @return
     *     possible object is
     *     {@link RaceCodeType }
     *     
     */
    public RaceCodeType getRaceCode() {
        return raceCode;
    }

    /**
     * Sets the value of the raceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RaceCodeType }
     *     
     */
    public void setRaceCode(RaceCodeType value) {
        this.raceCode = value;
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
     * Gets the value of the appEducLvlCode property.
     * 
     * @return
     *     possible object is
     *     {@link AppEducLvlCodeType }
     *     
     */
    public AppEducLvlCodeType getAppEducLvlCode() {
        return appEducLvlCode;
    }

    /**
     * Sets the value of the appEducLvlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEducLvlCodeType }
     *     
     */
    public void setAppEducLvlCode(AppEducLvlCodeType value) {
        this.appEducLvlCode = value;
    }

    /**
     * Gets the value of the partTimePos property.
     * 
     * @return
     *     possible object is
     *     {@link PartTimePosType }
     *     
     */
    public PartTimePosType getPartTimePos() {
        return partTimePos;
    }

    /**
     * Sets the value of the partTimePos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartTimePosType }
     *     
     */
    public void setPartTimePos(PartTimePosType value) {
        this.partTimePos = value;
    }

    /**
     * Gets the value of the appDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link AppDisabledType }
     *     
     */
    public AppDisabledType getAppDisabled() {
        return appDisabled;
    }

    /**
     * Sets the value of the appDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDisabledType }
     *     
     */
    public void setAppDisabled(AppDisabledType value) {
        this.appDisabled = value;
    }

    /**
     * Gets the value of the appVetCode property.
     * 
     * @return
     *     possible object is
     *     {@link AppVetCodeType }
     *     
     */
    public AppVetCodeType getAppVetCode() {
        return appVetCode;
    }

    /**
     * Sets the value of the appVetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppVetCodeType }
     *     
     */
    public void setAppVetCode(AppVetCodeType value) {
        this.appVetCode = value;
    }

    /**
     * Gets the value of the appFelony property.
     * 
     * @return
     *     possible object is
     *     {@link AppFelonyType }
     *     
     */
    public AppFelonyType getAppFelony() {
        return appFelony;
    }

    /**
     * Sets the value of the appFelony property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppFelonyType }
     *     
     */
    public void setAppFelony(AppFelonyType value) {
        this.appFelony = value;
    }

    /**
     * Gets the value of the appCrChk property.
     * 
     * @return
     *     possible object is
     *     {@link AppCrChkType }
     *     
     */
    public AppCrChkType getAppCrChk() {
        return appCrChk;
    }

    /**
     * Sets the value of the appCrChk property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppCrChkType }
     *     
     */
    public void setAppCrChk(AppCrChkType value) {
        this.appCrChk = value;
    }

    /**
     * Gets the value of the appBackGrndChk property.
     * 
     * @return
     *     possible object is
     *     {@link AppBackGrndChkType }
     *     
     */
    public AppBackGrndChkType getAppBackGrndChk() {
        return appBackGrndChk;
    }

    /**
     * Sets the value of the appBackGrndChk property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppBackGrndChkType }
     *     
     */
    public void setAppBackGrndChk(AppBackGrndChkType value) {
        this.appBackGrndChk = value;
    }

    /**
     * Gets the value of the appDrugTest property.
     * 
     * @return
     *     possible object is
     *     {@link AppDrugTestType }
     *     
     */
    public AppDrugTestType getAppDrugTest() {
        return appDrugTest;
    }

    /**
     * Sets the value of the appDrugTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDrugTestType }
     *     
     */
    public void setAppDrugTest(AppDrugTestType value) {
        this.appDrugTest = value;
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
     * Gets the value of the payHighAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PayHighAmtType }
     *     
     */
    public PayHighAmtType getPayHighAmt() {
        return payHighAmt;
    }

    /**
     * Sets the value of the payHighAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayHighAmtType }
     *     
     */
    public void setPayHighAmt(PayHighAmtType value) {
        this.payHighAmt = value;
    }

    /**
     * Gets the value of the payLowAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PayLowAmtType }
     *     
     */
    public PayLowAmtType getPayLowAmt() {
        return payLowAmt;
    }

    /**
     * Sets the value of the payLowAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayLowAmtType }
     *     
     */
    public void setPayLowAmt(PayLowAmtType value) {
        this.payLowAmt = value;
    }

    /**
     * Gets the value of the empRefCode property.
     * 
     * @return
     *     possible object is
     *     {@link EmpCodeType }
     *     
     */
    public EmpCodeType getEmpRefCode() {
        return empRefCode;
    }

    /**
     * Sets the value of the empRefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmpCodeType }
     *     
     */
    public void setEmpRefCode(EmpCodeType value) {
        this.empRefCode = value;
    }

    /**
     * Gets the value of the appRecvDt property.
     * 
     * @return
     *     possible object is
     *     {@link AppRecvDtType }
     *     
     */
    public AppRecvDtType getAppRecvDt() {
        return appRecvDt;
    }

    /**
     * Sets the value of the appRecvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppRecvDtType }
     *     
     */
    public void setAppRecvDt(AppRecvDtType value) {
        this.appRecvDt = value;
    }

    /**
     * Gets the value of the appRecvTime property.
     * 
     * @return
     *     possible object is
     *     {@link AppRecvTimeType }
     *     
     */
    public AppRecvTimeType getAppRecvTime() {
        return appRecvTime;
    }

    /**
     * Sets the value of the appRecvTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppRecvTimeType }
     *     
     */
    public void setAppRecvTime(AppRecvTimeType value) {
        this.appRecvTime = value;
    }

    /**
     * Gets the value of the appAvlDt property.
     * 
     * @return
     *     possible object is
     *     {@link AppAvlDtType }
     *     
     */
    public AppAvlDtType getAppAvlDt() {
        return appAvlDt;
    }

    /**
     * Sets the value of the appAvlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppAvlDtType }
     *     
     */
    public void setAppAvlDt(AppAvlDtType value) {
        this.appAvlDt = value;
    }

    /**
     * Gets the value of the bnkRptcyFiled property.
     * 
     * @return
     *     possible object is
     *     {@link BnkRptcyFiledType }
     *     
     */
    public BnkRptcyFiledType getBnkRptcyFiled() {
        return bnkRptcyFiled;
    }

    /**
     * Sets the value of the bnkRptcyFiled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BnkRptcyFiledType }
     *     
     */
    public void setBnkRptcyFiled(BnkRptcyFiledType value) {
        this.bnkRptcyFiled = value;
    }

    /**
     * Gets the value of the bondRefused property.
     * 
     * @return
     *     possible object is
     *     {@link BondRefusedType }
     *     
     */
    public BondRefusedType getBondRefused() {
        return bondRefused;
    }

    /**
     * Sets the value of the bondRefused property.
     * 
     * @param value
     *     allowed object is
     *     {@link BondRefusedType }
     *     
     */
    public void setBondRefused(BondRefusedType value) {
        this.bondRefused = value;
    }

    /**
     * Gets the value of the workPermitReq property.
     * 
     * @return
     *     possible object is
     *     {@link WorkPermitReqType }
     *     
     */
    public WorkPermitReqType getWorkPermitReq() {
        return workPermitReq;
    }

    /**
     * Sets the value of the workPermitReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkPermitReqType }
     *     
     */
    public void setWorkPermitReq(WorkPermitReqType value) {
        this.workPermitReq = value;
    }

    /**
     * Gets the value of the callCurEmpl property.
     * 
     * @return
     *     possible object is
     *     {@link CallCurEmplType }
     *     
     */
    public CallCurEmplType getCallCurEmpl() {
        return callCurEmpl;
    }

    /**
     * Sets the value of the callCurEmpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCurEmplType }
     *     
     */
    public void setCallCurEmpl(CallCurEmplType value) {
        this.callCurEmpl = value;
    }

    /**
     * Gets the value of the emplFamMbr property.
     * 
     * @return
     *     possible object is
     *     {@link EmplFamMbrType }
     *     
     */
    public EmplFamMbrType getEmplFamMbr() {
        return emplFamMbr;
    }

    /**
     * Sets the value of the emplFamMbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplFamMbrType }
     *     
     */
    public void setEmplFamMbr(EmplFamMbrType value) {
        this.emplFamMbr = value;
    }

    /**
     * Gets the value of the elecSigRecv property.
     * 
     * @return
     *     possible object is
     *     {@link ElecSigRecvType }
     *     
     */
    public ElecSigRecvType getElecSigRecv() {
        return elecSigRecv;
    }

    /**
     * Sets the value of the elecSigRecv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecSigRecvType }
     *     
     */
    public void setElecSigRecv(ElecSigRecvType value) {
        this.elecSigRecv = value;
    }

    /**
     * Gets the value of the jobExpcArray property.
     * 
     * @return
     *     possible object is
     *     {@link JobExpcArrayAType }
     *     
     */
    public JobExpcArrayAType getJobExpcArray() {
        return jobExpcArray;
    }

    /**
     * Sets the value of the jobExpcArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobExpcArrayAType }
     *     
     */
    public void setJobExpcArray(JobExpcArrayAType value) {
        this.jobExpcArray = value;
    }

    /**
     * Gets the value of the jobRefArray property.
     * 
     * @return
     *     possible object is
     *     {@link JobRefArrayAType }
     *     
     */
    public JobRefArrayAType getJobRefArray() {
        return jobRefArray;
    }

    /**
     * Sets the value of the jobRefArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobRefArrayAType }
     *     
     */
    public void setJobRefArray(JobRefArrayAType value) {
        this.jobRefArray = value;
    }

    /**
     * Gets the value of the profesCertifArray property.
     * 
     * @return
     *     possible object is
     *     {@link ProfesCertifArrayAType }
     *     
     */
    public ProfesCertifArrayAType getProfesCertifArray() {
        return profesCertifArray;
    }

    /**
     * Sets the value of the profesCertifArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfesCertifArrayAType }
     *     
     */
    public void setProfesCertifArray(ProfesCertifArrayAType value) {
        this.profesCertifArray = value;
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
     * Gets the value of the genEducArray property.
     * 
     * @return
     *     possible object is
     *     {@link GenEducArrayAType }
     *     
     */
    public GenEducArrayAType getGenEducArray() {
        return genEducArray;
    }

    /**
     * Sets the value of the genEducArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenEducArrayAType }
     *     
     */
    public void setGenEducArray(GenEducArrayAType value) {
        this.genEducArray = value;
    }

    /**
     * Gets the value of the skillsArray property.
     * 
     * @return
     *     possible object is
     *     {@link SkillsArrayAType }
     *     
     */
    public SkillsArrayAType getSkillsArray() {
        return skillsArray;
    }

    /**
     * Sets the value of the skillsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillsArrayAType }
     *     
     */
    public void setSkillsArray(SkillsArrayAType value) {
        this.skillsArray = value;
    }

    /**
     * Gets the value of the mltryCmpgnCode property.
     * 
     * @return
     *     possible object is
     *     {@link MltryCmpgnCodeType }
     *     
     */
    public MltryCmpgnCodeType getMltryCmpgnCode() {
        return mltryCmpgnCode;
    }

    /**
     * Sets the value of the mltryCmpgnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MltryCmpgnCodeType }
     *     
     */
    public void setMltryCmpgnCode(MltryCmpgnCodeType value) {
        this.mltryCmpgnCode = value;
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
