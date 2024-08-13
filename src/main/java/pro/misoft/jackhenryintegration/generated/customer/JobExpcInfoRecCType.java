
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
 * <p>Java class for JobExpcInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobExpcInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobExpcCode" type="{http://jackhenry.com/jxchange/TPG/2008}JobExpcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobExpcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobExpcDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://jackhenry.com/jxchange/TPG/2008}StateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmplTitle" type="{http://jackhenry.com/jxchange/TPG/2008}EmplTitle_Type" minOccurs="0"/&gt;
 *         &lt;element name="JobDesc" type="{http://jackhenry.com/jxchange/TPG/2008}JobDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SalaryAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SalaryAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SalaryTermType" type="{http://jackhenry.com/jxchange/TPG/2008}SalaryTermType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SupvName" type="{http://jackhenry.com/jxchange/TPG/2008}SupvName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="EmplStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}EmplStartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmplEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EmplEndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddr" type="{http://jackhenry.com/jxchange/TPG/2008}EmailAddr_Type" minOccurs="0"/&gt;
 *         &lt;element name="RsnDepartCode" type="{http://jackhenry.com/jxchange/TPG/2008}RsnDepartCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RsnDepartDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RsnDepartDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CallEmpl" type="{http://jackhenry.com/jxchange/TPG/2008}CallEmpl_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EmplName" type="{http://jackhenry.com/jxchange/TPG/2008}EmplName_Type" minOccurs="0"/&gt;
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
@XmlType(name = "JobExpcInfoRec_CType", propOrder = {
    "jobExpcCode",
    "jobExpcDesc",
    "city",
    "state",
    "emplTitle",
    "jobDesc",
    "salaryAmt",
    "salaryTermType",
    "supvName",
    "phoneInfo",
    "emplStartDt",
    "emplEndDt",
    "emailAddr",
    "rsnDepartCode",
    "rsnDepartDesc",
    "callEmpl",
    "ver1",
    "emplName",
    "ver2",
    "any"
})
public class JobExpcInfoRecCType {

    @XmlElement(name = "JobExpcCode")
    protected JobExpcCodeType jobExpcCode;
    @XmlElement(name = "JobExpcDesc")
    protected JobExpcDescType jobExpcDesc;
    @XmlElement(name = "City")
    protected CityType city;
    @XmlElement(name = "State")
    protected StateCodeType state;
    @XmlElement(name = "EmplTitle")
    protected EmplTitleType emplTitle;
    @XmlElement(name = "JobDesc")
    protected JobDescType jobDesc;
    @XmlElement(name = "SalaryAmt")
    protected SalaryAmtType salaryAmt;
    @XmlElement(name = "SalaryTermType")
    protected SalaryTermTypeType salaryTermType;
    @XmlElement(name = "SupvName")
    protected SupvNameType supvName;
    @XmlElement(name = "PhoneInfo")
    protected PhoneInfoCType phoneInfo;
    @XmlElement(name = "EmplStartDt")
    protected EmplStartDtType emplStartDt;
    @XmlElement(name = "EmplEndDt")
    protected EmplEndDtType emplEndDt;
    @XmlElement(name = "EmailAddr")
    protected EmailAddrType emailAddr;
    @XmlElement(name = "RsnDepartCode")
    protected RsnDepartCodeType rsnDepartCode;
    @XmlElement(name = "RsnDepartDesc")
    protected RsnDepartDescType rsnDepartDesc;
    @XmlElement(name = "CallEmpl")
    protected CallEmplType callEmpl;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EmplName")
    protected EmplNameType emplName;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the jobExpcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JobExpcCodeType }
     *     
     */
    public JobExpcCodeType getJobExpcCode() {
        return jobExpcCode;
    }

    /**
     * Sets the value of the jobExpcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobExpcCodeType }
     *     
     */
    public void setJobExpcCode(JobExpcCodeType value) {
        this.jobExpcCode = value;
    }

    /**
     * Gets the value of the jobExpcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JobExpcDescType }
     *     
     */
    public JobExpcDescType getJobExpcDesc() {
        return jobExpcDesc;
    }

    /**
     * Sets the value of the jobExpcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobExpcDescType }
     *     
     */
    public void setJobExpcDesc(JobExpcDescType value) {
        this.jobExpcDesc = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setCity(CityType value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateCodeType }
     *     
     */
    public StateCodeType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateCodeType }
     *     
     */
    public void setState(StateCodeType value) {
        this.state = value;
    }

    /**
     * Gets the value of the emplTitle property.
     * 
     * @return
     *     possible object is
     *     {@link EmplTitleType }
     *     
     */
    public EmplTitleType getEmplTitle() {
        return emplTitle;
    }

    /**
     * Sets the value of the emplTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplTitleType }
     *     
     */
    public void setEmplTitle(EmplTitleType value) {
        this.emplTitle = value;
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
     * Gets the value of the salaryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SalaryAmtType }
     *     
     */
    public SalaryAmtType getSalaryAmt() {
        return salaryAmt;
    }

    /**
     * Sets the value of the salaryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryAmtType }
     *     
     */
    public void setSalaryAmt(SalaryAmtType value) {
        this.salaryAmt = value;
    }

    /**
     * Gets the value of the salaryTermType property.
     * 
     * @return
     *     possible object is
     *     {@link SalaryTermTypeType }
     *     
     */
    public SalaryTermTypeType getSalaryTermType() {
        return salaryTermType;
    }

    /**
     * Sets the value of the salaryTermType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryTermTypeType }
     *     
     */
    public void setSalaryTermType(SalaryTermTypeType value) {
        this.salaryTermType = value;
    }

    /**
     * Gets the value of the supvName property.
     * 
     * @return
     *     possible object is
     *     {@link SupvNameType }
     *     
     */
    public SupvNameType getSupvName() {
        return supvName;
    }

    /**
     * Sets the value of the supvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupvNameType }
     *     
     */
    public void setSupvName(SupvNameType value) {
        this.supvName = value;
    }

    /**
     * Gets the value of the phoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneInfoCType }
     *     
     */
    public PhoneInfoCType getPhoneInfo() {
        return phoneInfo;
    }

    /**
     * Sets the value of the phoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneInfoCType }
     *     
     */
    public void setPhoneInfo(PhoneInfoCType value) {
        this.phoneInfo = value;
    }

    /**
     * Gets the value of the emplStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link EmplStartDtType }
     *     
     */
    public EmplStartDtType getEmplStartDt() {
        return emplStartDt;
    }

    /**
     * Sets the value of the emplStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplStartDtType }
     *     
     */
    public void setEmplStartDt(EmplStartDtType value) {
        this.emplStartDt = value;
    }

    /**
     * Gets the value of the emplEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link EmplEndDtType }
     *     
     */
    public EmplEndDtType getEmplEndDt() {
        return emplEndDt;
    }

    /**
     * Sets the value of the emplEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplEndDtType }
     *     
     */
    public void setEmplEndDt(EmplEndDtType value) {
        this.emplEndDt = value;
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
     * Gets the value of the rsnDepartCode property.
     * 
     * @return
     *     possible object is
     *     {@link RsnDepartCodeType }
     *     
     */
    public RsnDepartCodeType getRsnDepartCode() {
        return rsnDepartCode;
    }

    /**
     * Sets the value of the rsnDepartCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsnDepartCodeType }
     *     
     */
    public void setRsnDepartCode(RsnDepartCodeType value) {
        this.rsnDepartCode = value;
    }

    /**
     * Gets the value of the rsnDepartDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RsnDepartDescType }
     *     
     */
    public RsnDepartDescType getRsnDepartDesc() {
        return rsnDepartDesc;
    }

    /**
     * Sets the value of the rsnDepartDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsnDepartDescType }
     *     
     */
    public void setRsnDepartDesc(RsnDepartDescType value) {
        this.rsnDepartDesc = value;
    }

    /**
     * Gets the value of the callEmpl property.
     * 
     * @return
     *     possible object is
     *     {@link CallEmplType }
     *     
     */
    public CallEmplType getCallEmpl() {
        return callEmpl;
    }

    /**
     * Sets the value of the callEmpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallEmplType }
     *     
     */
    public void setCallEmpl(CallEmplType value) {
        this.callEmpl = value;
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
