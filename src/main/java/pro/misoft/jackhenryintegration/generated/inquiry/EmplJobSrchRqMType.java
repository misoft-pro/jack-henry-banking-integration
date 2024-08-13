
package pro.misoft.jackhenryintegration.generated.inquiry;

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
 * <p>Java class for EmplJobSrchRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmplJobSrchRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRqHdr_CType"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobLocCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobLocCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExclPartTime" type="{http://jackhenry.com/jxchange/TPG/2008}ExclPartTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobStatType" type="{http://jackhenry.com/jxchange/TPG/2008}JobStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobPostType" type="{http://jackhenry.com/jxchange/TPG/2008}JobPostType_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobSupvCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobSupvCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobDivCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobDivCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EmplJobSrchRq_MType", propOrder = {
    "srchMsgRqHdr",
    "brCode",
    "jobLocCode",
    "exclPartTime",
    "jobStatType",
    "jobPostType",
    "jobSupvCode",
    "jobDivCode",
    "custom",
    "ver1",
    "any"
})
public class EmplJobSrchRqMType {

    @XmlElement(name = "SrchMsgRqHdr", required = true)
    protected SrchMsgRqHdrCType srchMsgRqHdr;
    @XmlElementRef(name = "BrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> brCode;
    @XmlElementRef(name = "JobLocCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<JobLocCodeType> jobLocCode;
    @XmlElementRef(name = "ExclPartTime", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclPartTimeType> exclPartTime;
    @XmlElementRef(name = "JobStatType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<JobStatTypeType> jobStatType;
    @XmlElementRef(name = "JobPostType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<JobPostTypeType> jobPostType;
    @XmlElementRef(name = "JobSupvCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<JobSupvCodeType> jobSupvCode;
    @XmlElementRef(name = "JobDivCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<JobDivCodeType> jobDivCode;
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
     * Gets the value of the jobLocCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JobLocCodeType }{@code >}
     *     
     */
    public JAXBElement<JobLocCodeType> getJobLocCode() {
        return jobLocCode;
    }

    /**
     * Sets the value of the jobLocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JobLocCodeType }{@code >}
     *     
     */
    public void setJobLocCode(JAXBElement<JobLocCodeType> value) {
        this.jobLocCode = value;
    }

    /**
     * Gets the value of the exclPartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclPartTimeType }{@code >}
     *     
     */
    public JAXBElement<ExclPartTimeType> getExclPartTime() {
        return exclPartTime;
    }

    /**
     * Sets the value of the exclPartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclPartTimeType }{@code >}
     *     
     */
    public void setExclPartTime(JAXBElement<ExclPartTimeType> value) {
        this.exclPartTime = value;
    }

    /**
     * Gets the value of the jobStatType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JobStatTypeType }{@code >}
     *     
     */
    public JAXBElement<JobStatTypeType> getJobStatType() {
        return jobStatType;
    }

    /**
     * Sets the value of the jobStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JobStatTypeType }{@code >}
     *     
     */
    public void setJobStatType(JAXBElement<JobStatTypeType> value) {
        this.jobStatType = value;
    }

    /**
     * Gets the value of the jobPostType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JobPostTypeType }{@code >}
     *     
     */
    public JAXBElement<JobPostTypeType> getJobPostType() {
        return jobPostType;
    }

    /**
     * Sets the value of the jobPostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JobPostTypeType }{@code >}
     *     
     */
    public void setJobPostType(JAXBElement<JobPostTypeType> value) {
        this.jobPostType = value;
    }

    /**
     * Gets the value of the jobSupvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JobSupvCodeType }{@code >}
     *     
     */
    public JAXBElement<JobSupvCodeType> getJobSupvCode() {
        return jobSupvCode;
    }

    /**
     * Sets the value of the jobSupvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JobSupvCodeType }{@code >}
     *     
     */
    public void setJobSupvCode(JAXBElement<JobSupvCodeType> value) {
        this.jobSupvCode = value;
    }

    /**
     * Gets the value of the jobDivCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JobDivCodeType }{@code >}
     *     
     */
    public JAXBElement<JobDivCodeType> getJobDivCode() {
        return jobDivCode;
    }

    /**
     * Sets the value of the jobDivCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JobDivCodeType }{@code >}
     *     
     */
    public void setJobDivCode(JAXBElement<JobDivCodeType> value) {
        this.jobDivCode = value;
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
