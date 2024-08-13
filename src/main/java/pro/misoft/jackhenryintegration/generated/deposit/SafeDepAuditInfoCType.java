
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
 * <p>Java class for SafeDepAuditInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafeDepAuditInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuditTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}AuditTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="EmpName" type="{http://jackhenry.com/jxchange/TPG/2008}EmpName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SafeDepSigVerifyCode" type="{http://jackhenry.com/jxchange/TPG/2008}SigVerifyCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
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
@XmlType(name = "SafeDepAuditInfo_CType", propOrder = {
    "auditTimeDt",
    "personName",
    "empName",
    "safeDepSigVerifyCode",
    "rmkArray",
    "ver1",
    "any"
})
public class SafeDepAuditInfoCType {

    @XmlElement(name = "AuditTimeDt")
    protected AuditTimeDtType auditTimeDt;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "EmpName")
    protected EmpNameType empName;
    @XmlElement(name = "SafeDepSigVerifyCode")
    protected SigVerifyCodeType safeDepSigVerifyCode;
    @XmlElement(name = "RmkArray")
    protected RmkAType rmkArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the auditTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link AuditTimeDtType }
     *     
     */
    public AuditTimeDtType getAuditTimeDt() {
        return auditTimeDt;
    }

    /**
     * Sets the value of the auditTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditTimeDtType }
     *     
     */
    public void setAuditTimeDt(AuditTimeDtType value) {
        this.auditTimeDt = value;
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
     * Gets the value of the empName property.
     * 
     * @return
     *     possible object is
     *     {@link EmpNameType }
     *     
     */
    public EmpNameType getEmpName() {
        return empName;
    }

    /**
     * Sets the value of the empName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmpNameType }
     *     
     */
    public void setEmpName(EmpNameType value) {
        this.empName = value;
    }

    /**
     * Gets the value of the safeDepSigVerifyCode property.
     * 
     * @return
     *     possible object is
     *     {@link SigVerifyCodeType }
     *     
     */
    public SigVerifyCodeType getSafeDepSigVerifyCode() {
        return safeDepSigVerifyCode;
    }

    /**
     * Sets the value of the safeDepSigVerifyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigVerifyCodeType }
     *     
     */
    public void setSafeDepSigVerifyCode(SigVerifyCodeType value) {
        this.safeDepSigVerifyCode = value;
    }

    /**
     * Gets the value of the rmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getRmkArray() {
        return rmkArray;
    }

    /**
     * Sets the value of the rmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setRmkArray(RmkAType value) {
        this.rmkArray = value;
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
