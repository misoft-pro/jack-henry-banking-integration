
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
 * <p>Java class for EmplJobSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmplJobSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobId" type="{http://jackhenry.com/jxchange/TPG/2008}JobId_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobTitleCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobTitleCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobTitleDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobTitleDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeptCode" type="{http://jackhenry.com/jxchange/TPG/2008}DeptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DeptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PartTimePos" type="{http://jackhenry.com/jxchange/TPG/2008}PartTimePos_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobLocCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobLocCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobLocDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobLocDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobStatType" type="{http://jackhenry.com/jxchange/TPG/2008}JobStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobPostType" type="{http://jackhenry.com/jxchange/TPG/2008}JobPostType_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobSupvCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobSupvCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobSupvDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobSupvDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobDivCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobDivCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobDivDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobDivDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomEmplJobSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "EmplJobSrchRec_CType", propOrder = {
    "jobId",
    "jobTitleCode",
    "jobTitleDesc",
    "brCode",
    "brDesc",
    "deptCode",
    "deptDesc",
    "partTimePos",
    "jobLocCode",
    "jobLocDesc",
    "jobStatType",
    "jobPostType",
    "jobSupvCode",
    "jobSupvDesc",
    "jobDivCode",
    "jobDivDesc",
    "customEmplJobSrchRec",
    "ver1",
    "any"
})
public class EmplJobSrchRecCType {

    @XmlElement(name = "JobId")
    protected JobIdType jobId;
    @XmlElement(name = "JobTitleCode")
    protected JobTitleCodeType jobTitleCode;
    @XmlElement(name = "JobTitleDesc")
    protected JobTitleDescType jobTitleDesc;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "DeptCode")
    protected DeptCodeType deptCode;
    @XmlElement(name = "DeptDesc")
    protected DeptDescType deptDesc;
    @XmlElement(name = "PartTimePos")
    protected PartTimePosType partTimePos;
    @XmlElement(name = "JobLocCode")
    protected JobLocCodeType jobLocCode;
    @XmlElement(name = "JobLocDesc")
    protected JobLocDescType jobLocDesc;
    @XmlElement(name = "JobStatType")
    protected JobStatTypeType jobStatType;
    @XmlElement(name = "JobPostType")
    protected JobPostTypeType jobPostType;
    @XmlElement(name = "JobSupvCode")
    protected JobSupvCodeType jobSupvCode;
    @XmlElement(name = "JobSupvDesc")
    protected JobSupvDescType jobSupvDesc;
    @XmlElement(name = "JobDivCode")
    protected JobDivCodeType jobDivCode;
    @XmlElement(name = "JobDivDesc")
    protected JobDivDescType jobDivDesc;
    @XmlElement(name = "CustomEmplJobSrchRec")
    protected CustomCType customEmplJobSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link JobIdType }
     *     
     */
    public JobIdType getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobIdType }
     *     
     */
    public void setJobId(JobIdType value) {
        this.jobId = value;
    }

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
     * Gets the value of the jobTitleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JobTitleDescType }
     *     
     */
    public JobTitleDescType getJobTitleDesc() {
        return jobTitleDesc;
    }

    /**
     * Sets the value of the jobTitleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobTitleDescType }
     *     
     */
    public void setJobTitleDesc(JobTitleDescType value) {
        this.jobTitleDesc = value;
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
     * Gets the value of the deptCode property.
     * 
     * @return
     *     possible object is
     *     {@link DeptCodeType }
     *     
     */
    public DeptCodeType getDeptCode() {
        return deptCode;
    }

    /**
     * Sets the value of the deptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeptCodeType }
     *     
     */
    public void setDeptCode(DeptCodeType value) {
        this.deptCode = value;
    }

    /**
     * Gets the value of the deptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DeptDescType }
     *     
     */
    public DeptDescType getDeptDesc() {
        return deptDesc;
    }

    /**
     * Sets the value of the deptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeptDescType }
     *     
     */
    public void setDeptDesc(DeptDescType value) {
        this.deptDesc = value;
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
     * Gets the value of the jobLocDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JobLocDescType }
     *     
     */
    public JobLocDescType getJobLocDesc() {
        return jobLocDesc;
    }

    /**
     * Sets the value of the jobLocDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobLocDescType }
     *     
     */
    public void setJobLocDesc(JobLocDescType value) {
        this.jobLocDesc = value;
    }

    /**
     * Gets the value of the jobStatType property.
     * 
     * @return
     *     possible object is
     *     {@link JobStatTypeType }
     *     
     */
    public JobStatTypeType getJobStatType() {
        return jobStatType;
    }

    /**
     * Sets the value of the jobStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStatTypeType }
     *     
     */
    public void setJobStatType(JobStatTypeType value) {
        this.jobStatType = value;
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
     * Gets the value of the jobSupvDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JobSupvDescType }
     *     
     */
    public JobSupvDescType getJobSupvDesc() {
        return jobSupvDesc;
    }

    /**
     * Sets the value of the jobSupvDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSupvDescType }
     *     
     */
    public void setJobSupvDesc(JobSupvDescType value) {
        this.jobSupvDesc = value;
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
     * Gets the value of the jobDivDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JobDivDescType }
     *     
     */
    public JobDivDescType getJobDivDesc() {
        return jobDivDesc;
    }

    /**
     * Sets the value of the jobDivDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobDivDescType }
     *     
     */
    public void setJobDivDesc(JobDivDescType value) {
        this.jobDivDesc = value;
    }

    /**
     * Gets the value of the customEmplJobSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomEmplJobSrchRec() {
        return customEmplJobSrchRec;
    }

    /**
     * Sets the value of the customEmplJobSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomEmplJobSrchRec(CustomCType value) {
        this.customEmplJobSrchRec = value;
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
