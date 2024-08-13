
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EmplJobInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmplJobInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobTitleCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobTitleCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobLocCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobLocCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobPostType" type="{http://jackhenry.com/jxchange/TPG/2008}JobPostType_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobPost" type="{http://jackhenry.com/jxchange/TPG/2008}JobPost_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobSupvCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobSupvCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobClassCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobClassCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayGradeCode" type="{http://jackhenry.com/jxchange/TPG/2008}PayGradeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobDivCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobDivCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}JobEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PartTimePos" type="{http://jackhenry.com/jxchange/TPG/2008}PartTimePos_Type" minOccurs="0"/&gt;
 *         &lt;element name="PosAppStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}PosAppStartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PosAppEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}PosAppEndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PosAppEndTime" type="{http://jackhenry.com/jxchange/TPG/2008}PosAppEndTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppRecipName" type="{http://jackhenry.com/jxchange/TPG/2008}AppRecipName_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobCenCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobCenCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobEEOCCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobEEOCCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobOverview" type="{http://jackhenry.com/jxchange/TPG/2008}JobOverview_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobQualReq" type="{http://jackhenry.com/jxchange/TPG/2008}JobQualReq_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayHighAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PayHighAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayLowAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PayLowAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PayType" type="{http://jackhenry.com/jxchange/TPG/2008}PayType_Type" minOccurs="0"/&gt;
 *           &lt;element name="JobRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
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
@XmlType(name = "EmplJobInfoRec_CType", propOrder = {
    "jobTitleCode",
    "brCode",
    "jobLocCode",
    "jobPostType",
    "jobPost",
    "jobSupvCode",
    "jobClassCode",
    "payGradeCode",
    "jobDivCode",
    "jobEffDt",
    "partTimePos",
    "posAppStartDt",
    "posAppEndDt",
    "posAppEndTime",
    "appRecipName",
    "jobCenCode",
    "jobEEOCCode",
    "jobOverview",
    "jobQualReq",
    "jobDesc",
    "payHighAmt",
    "payLowAmt",
    "custom",
    "ver1",
    "payType",
    "jobRmkArray",
    "ver2",
    "any"
})
public class EmplJobInfoRecCType {

    @XmlElement(name = "JobTitleCode")
    protected JobTitleCodeType jobTitleCode;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "JobLocCode")
    protected JobLocCodeType jobLocCode;
    @XmlElement(name = "JobPostType")
    protected JobPostTypeType jobPostType;
    @XmlElement(name = "JobPost")
    protected JobPostType jobPost;
    @XmlElement(name = "JobSupvCode")
    protected JobSupvCodeType jobSupvCode;
    @XmlElement(name = "JobClassCode")
    protected JobClassCodeType jobClassCode;
    @XmlElement(name = "PayGradeCode")
    protected PayGradeCodeType payGradeCode;
    @XmlElement(name = "JobDivCode")
    protected JobDivCodeType jobDivCode;
    @XmlElement(name = "JobEffDt")
    protected JobEffDtType jobEffDt;
    @XmlElement(name = "PartTimePos")
    protected PartTimePosType partTimePos;
    @XmlElement(name = "PosAppStartDt")
    protected PosAppStartDtType posAppStartDt;
    @XmlElement(name = "PosAppEndDt")
    protected PosAppEndDtType posAppEndDt;
    @XmlElement(name = "PosAppEndTime")
    protected PosAppEndTimeType posAppEndTime;
    @XmlElement(name = "AppRecipName")
    protected AppRecipNameType appRecipName;
    @XmlElement(name = "JobCenCode")
    protected JobCenCodeType jobCenCode;
    @XmlElement(name = "JobEEOCCode")
    protected JobEEOCCodeType jobEEOCCode;
    @XmlElement(name = "JobOverview")
    protected JobOverviewType jobOverview;
    @XmlElement(name = "JobQualReq")
    protected JobQualReqType jobQualReq;
    @XmlElement(name = "JobDesc")
    protected JobDescType jobDesc;
    @XmlElement(name = "PayHighAmt")
    protected PayHighAmtType payHighAmt;
    @XmlElement(name = "PayLowAmt")
    protected PayLowAmtType payLowAmt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PayType")
    protected PayTypeType payType;
    @XmlElement(name = "JobRmkArray")
    protected RmkAType jobRmkArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the jobTitleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JobTitleCodeType }
     *     
     */
    public JobTitleCodeType getJobTitleCode() {
        return jobTitleCode;
    }

    /**
     * Sets the value of the jobTitleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobTitleCodeType }
     *     
     */
    public void setJobTitleCode(JobTitleCodeType value) {
        this.jobTitleCode = value;
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
     * Gets the value of the jobLocCode property.
     * 
     * @return
     *     possible object is
     *     {@link JobLocCodeType }
     *     
     */
    public JobLocCodeType getJobLocCode() {
        return jobLocCode;
    }

    /**
     * Sets the value of the jobLocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobLocCodeType }
     *     
     */
    public void setJobLocCode(JobLocCodeType value) {
        this.jobLocCode = value;
    }

    /**
     * Gets the value of the jobPostType property.
     * 
     * @return
     *     possible object is
     *     {@link JobPostTypeType }
     *     
     */
    public JobPostTypeType getJobPostType() {
        return jobPostType;
    }

    /**
     * Sets the value of the jobPostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobPostTypeType }
     *     
     */
    public void setJobPostType(JobPostTypeType value) {
        this.jobPostType = value;
    }

    /**
     * Gets the value of the jobPost property.
     * 
     * @return
     *     possible object is
     *     {@link JobPostType }
     *     
     */
    public JobPostType getJobPost() {
        return jobPost;
    }

    /**
     * Sets the value of the jobPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobPostType }
     *     
     */
    public void setJobPost(JobPostType value) {
        this.jobPost = value;
    }

    /**
     * Gets the value of the jobSupvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JobSupvCodeType }
     *     
     */
    public JobSupvCodeType getJobSupvCode() {
        return jobSupvCode;
    }

    /**
     * Sets the value of the jobSupvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSupvCodeType }
     *     
     */
    public void setJobSupvCode(JobSupvCodeType value) {
        this.jobSupvCode = value;
    }

    /**
     * Gets the value of the jobClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link JobClassCodeType }
     *     
     */
    public JobClassCodeType getJobClassCode() {
        return jobClassCode;
    }

    /**
     * Sets the value of the jobClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobClassCodeType }
     *     
     */
    public void setJobClassCode(JobClassCodeType value) {
        this.jobClassCode = value;
    }

    /**
     * Gets the value of the payGradeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PayGradeCodeType }
     *     
     */
    public PayGradeCodeType getPayGradeCode() {
        return payGradeCode;
    }

    /**
     * Sets the value of the payGradeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayGradeCodeType }
     *     
     */
    public void setPayGradeCode(PayGradeCodeType value) {
        this.payGradeCode = value;
    }

    /**
     * Gets the value of the jobDivCode property.
     * 
     * @return
     *     possible object is
     *     {@link JobDivCodeType }
     *     
     */
    public JobDivCodeType getJobDivCode() {
        return jobDivCode;
    }

    /**
     * Sets the value of the jobDivCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobDivCodeType }
     *     
     */
    public void setJobDivCode(JobDivCodeType value) {
        this.jobDivCode = value;
    }

    /**
     * Gets the value of the jobEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link JobEffDtType }
     *     
     */
    public JobEffDtType getJobEffDt() {
        return jobEffDt;
    }

    /**
     * Sets the value of the jobEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobEffDtType }
     *     
     */
    public void setJobEffDt(JobEffDtType value) {
        this.jobEffDt = value;
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
     * Gets the value of the posAppStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link PosAppStartDtType }
     *     
     */
    public PosAppStartDtType getPosAppStartDt() {
        return posAppStartDt;
    }

    /**
     * Sets the value of the posAppStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosAppStartDtType }
     *     
     */
    public void setPosAppStartDt(PosAppStartDtType value) {
        this.posAppStartDt = value;
    }

    /**
     * Gets the value of the posAppEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link PosAppEndDtType }
     *     
     */
    public PosAppEndDtType getPosAppEndDt() {
        return posAppEndDt;
    }

    /**
     * Sets the value of the posAppEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosAppEndDtType }
     *     
     */
    public void setPosAppEndDt(PosAppEndDtType value) {
        this.posAppEndDt = value;
    }

    /**
     * Gets the value of the posAppEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link PosAppEndTimeType }
     *     
     */
    public PosAppEndTimeType getPosAppEndTime() {
        return posAppEndTime;
    }

    /**
     * Sets the value of the posAppEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosAppEndTimeType }
     *     
     */
    public void setPosAppEndTime(PosAppEndTimeType value) {
        this.posAppEndTime = value;
    }

    /**
     * Gets the value of the appRecipName property.
     * 
     * @return
     *     possible object is
     *     {@link AppRecipNameType }
     *     
     */
    public AppRecipNameType getAppRecipName() {
        return appRecipName;
    }

    /**
     * Sets the value of the appRecipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppRecipNameType }
     *     
     */
    public void setAppRecipName(AppRecipNameType value) {
        this.appRecipName = value;
    }

    /**
     * Gets the value of the jobCenCode property.
     * 
     * @return
     *     possible object is
     *     {@link JobCenCodeType }
     *     
     */
    public JobCenCodeType getJobCenCode() {
        return jobCenCode;
    }

    /**
     * Sets the value of the jobCenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobCenCodeType }
     *     
     */
    public void setJobCenCode(JobCenCodeType value) {
        this.jobCenCode = value;
    }

    /**
     * Gets the value of the jobEEOCCode property.
     * 
     * @return
     *     possible object is
     *     {@link JobEEOCCodeType }
     *     
     */
    public JobEEOCCodeType getJobEEOCCode() {
        return jobEEOCCode;
    }

    /**
     * Sets the value of the jobEEOCCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobEEOCCodeType }
     *     
     */
    public void setJobEEOCCode(JobEEOCCodeType value) {
        this.jobEEOCCode = value;
    }

    /**
     * Gets the value of the jobOverview property.
     * 
     * @return
     *     possible object is
     *     {@link JobOverviewType }
     *     
     */
    public JobOverviewType getJobOverview() {
        return jobOverview;
    }

    /**
     * Sets the value of the jobOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobOverviewType }
     *     
     */
    public void setJobOverview(JobOverviewType value) {
        this.jobOverview = value;
    }

    /**
     * Gets the value of the jobQualReq property.
     * 
     * @return
     *     possible object is
     *     {@link JobQualReqType }
     *     
     */
    public JobQualReqType getJobQualReq() {
        return jobQualReq;
    }

    /**
     * Sets the value of the jobQualReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobQualReqType }
     *     
     */
    public void setJobQualReq(JobQualReqType value) {
        this.jobQualReq = value;
    }

    /**
     * Gets the value of the jobDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JobDescType }
     *     
     */
    public JobDescType getJobDesc() {
        return jobDesc;
    }

    /**
     * Sets the value of the jobDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobDescType }
     *     
     */
    public void setJobDesc(JobDescType value) {
        this.jobDesc = value;
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
     * Gets the value of the payType property.
     * 
     * @return
     *     possible object is
     *     {@link PayTypeType }
     *     
     */
    public PayTypeType getPayType() {
        return payType;
    }

    /**
     * Sets the value of the payType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayTypeType }
     *     
     */
    public void setPayType(PayTypeType value) {
        this.payType = value;
    }

    /**
     * Gets the value of the jobRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getJobRmkArray() {
        return jobRmkArray;
    }

    /**
     * Sets the value of the jobRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setJobRmkArray(RmkAType value) {
        this.jobRmkArray = value;
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
