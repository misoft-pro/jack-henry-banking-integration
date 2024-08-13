
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
 * <p>Java class for EmplJobInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmplJobInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmplJobInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}EmplJobInfoRec_CType"/&gt;
 *         &lt;element name="JobTitleDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobTitleDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DeptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobLocDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobLocDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobSupvDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobSupvDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobClassDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobClassDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayGradeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PayGradeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobDivDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobDivDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobCenDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobCenDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobEEOCDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobEEOCDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EmplJobInqRec_CType", propOrder = {
    "emplJobInfoRec",
    "jobTitleDesc",
    "brDesc",
    "deptDesc",
    "jobLocDesc",
    "jobSupvDesc",
    "jobClassDesc",
    "payGradeDesc",
    "jobDivDesc",
    "jobCenDesc",
    "jobEEOCDesc",
    "custom",
    "ver1",
    "any"
})
public class EmplJobInqRecCType {

    @XmlElement(name = "EmplJobInfoRec", required = true)
    protected EmplJobInfoRecCType emplJobInfoRec;
    @XmlElement(name = "JobTitleDesc")
    protected JobTitleDescType jobTitleDesc;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "DeptDesc")
    protected DeptDescType deptDesc;
    @XmlElement(name = "JobLocDesc")
    protected JobLocDescType jobLocDesc;
    @XmlElement(name = "JobSupvDesc")
    protected JobSupvDescType jobSupvDesc;
    @XmlElement(name = "JobClassDesc")
    protected JobClassDescType jobClassDesc;
    @XmlElement(name = "PayGradeDesc")
    protected PayGradeDescType payGradeDesc;
    @XmlElement(name = "JobDivDesc")
    protected JobDivDescType jobDivDesc;
    @XmlElement(name = "JobCenDesc")
    protected JobCenDescType jobCenDesc;
    @XmlElement(name = "JobEEOCDesc")
    protected JobEEOCDescType jobEEOCDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the emplJobInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link EmplJobInfoRecCType }
     *     
     */
    public EmplJobInfoRecCType getEmplJobInfoRec() {
        return emplJobInfoRec;
    }

    /**
     * Sets the value of the emplJobInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplJobInfoRecCType }
     *     
     */
    public void setEmplJobInfoRec(EmplJobInfoRecCType value) {
        this.emplJobInfoRec = value;
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
     * Gets the value of the jobClassDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JobClassDescType }
     *     
     */
    public JobClassDescType getJobClassDesc() {
        return jobClassDesc;
    }

    /**
     * Sets the value of the jobClassDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobClassDescType }
     *     
     */
    public void setJobClassDesc(JobClassDescType value) {
        this.jobClassDesc = value;
    }

    /**
     * Gets the value of the payGradeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PayGradeDescType }
     *     
     */
    public PayGradeDescType getPayGradeDesc() {
        return payGradeDesc;
    }

    /**
     * Sets the value of the payGradeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayGradeDescType }
     *     
     */
    public void setPayGradeDesc(PayGradeDescType value) {
        this.payGradeDesc = value;
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
     * Gets the value of the jobCenDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JobCenDescType }
     *     
     */
    public JobCenDescType getJobCenDesc() {
        return jobCenDesc;
    }

    /**
     * Sets the value of the jobCenDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobCenDescType }
     *     
     */
    public void setJobCenDesc(JobCenDescType value) {
        this.jobCenDesc = value;
    }

    /**
     * Gets the value of the jobEEOCDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JobEEOCDescType }
     *     
     */
    public JobEEOCDescType getJobEEOCDesc() {
        return jobEEOCDesc;
    }

    /**
     * Sets the value of the jobEEOCDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobEEOCDescType }
     *     
     */
    public void setJobEEOCDesc(JobEEOCDescType value) {
        this.jobEEOCDesc = value;
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
