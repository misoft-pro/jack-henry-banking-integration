
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * A package for an associated subscriber user
 * 
 * <p>Java class for SubAssocUsrInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubAssocUsrInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubAssocUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}SubAssocUsrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubAssocUsrName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="SubAssocUsrRole" type="{http://jackhenry.com/jxchange/TPG/2008}SubAssocUsrRole_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubAssocUsrComId" type="{http://jackhenry.com/jxchange/TPG/2008}SubComId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubAssocUsrConsmCustId" type="{http://jackhenry.com/jxchange/TPG/2008}SubConsmCustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubAssocUsrTempPswd" type="{http://jackhenry.com/jxchange/TPG/2008}TempPswd_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubAssocUsrEmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SubAssocUsrPhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SubAssocUsrCmnt" type="{http://jackhenry.com/jxchange/TPG/2008}SubAssocUsrCmnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubAssocUsrMktgOptInInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}MktgOptInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SubAssocUsrPerInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}SubAssocUsrPerInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SubAssocUsrCapInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}SubAssocUsrCapInfoArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "SubAssocUsrInfo_CType", propOrder = {
    "subAssocUsrId",
    "subAssocUsrName",
    "subAssocUsrRole",
    "subAssocUsrComId",
    "subAssocUsrConsmCustId",
    "subAssocUsrTempPswd",
    "subAssocUsrEmailArray",
    "subAssocUsrPhoneArray",
    "subAssocUsrCmnt",
    "subAssocUsrMktgOptInInfoArray",
    "subAssocUsrPerInfoArray",
    "subAssocUsrCapInfoArray",
    "custom",
    "ver1",
    "any"
})
public class SubAssocUsrInfoCType {

    @XmlElement(name = "SubAssocUsrId")
    protected SubAssocUsrIdType subAssocUsrId;
    @XmlElement(name = "SubAssocUsrName")
    protected PersonNameCType subAssocUsrName;
    @XmlElement(name = "SubAssocUsrRole")
    protected SubAssocUsrRoleType subAssocUsrRole;
    @XmlElement(name = "SubAssocUsrComId")
    protected SubComIdType subAssocUsrComId;
    @XmlElement(name = "SubAssocUsrConsmCustId")
    protected SubConsmCustIdType subAssocUsrConsmCustId;
    @XmlElement(name = "SubAssocUsrTempPswd")
    protected TempPswdType subAssocUsrTempPswd;
    @XmlElement(name = "SubAssocUsrEmailArray")
    protected EmailArrayAType subAssocUsrEmailArray;
    @XmlElement(name = "SubAssocUsrPhoneArray")
    protected PhoneArrayAType subAssocUsrPhoneArray;
    @XmlElement(name = "SubAssocUsrCmnt")
    protected SubAssocUsrCmntType subAssocUsrCmnt;
    @XmlElement(name = "SubAssocUsrMktgOptInInfoArray")
    protected MktgOptInfoArrayAType subAssocUsrMktgOptInInfoArray;
    @XmlElement(name = "SubAssocUsrPerInfoArray")
    protected SubAssocUsrPerInfoArrayAType subAssocUsrPerInfoArray;
    @XmlElement(name = "SubAssocUsrCapInfoArray")
    protected SubAssocUsrCapInfoArrayAType subAssocUsrCapInfoArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the subAssocUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link SubAssocUsrIdType }
     *     
     */
    public SubAssocUsrIdType getSubAssocUsrId() {
        return subAssocUsrId;
    }

    /**
     * Sets the value of the subAssocUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAssocUsrIdType }
     *     
     */
    public void setSubAssocUsrId(SubAssocUsrIdType value) {
        this.subAssocUsrId = value;
    }

    /**
     * Gets the value of the subAssocUsrName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getSubAssocUsrName() {
        return subAssocUsrName;
    }

    /**
     * Sets the value of the subAssocUsrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setSubAssocUsrName(PersonNameCType value) {
        this.subAssocUsrName = value;
    }

    /**
     * Gets the value of the subAssocUsrRole property.
     * 
     * @return
     *     possible object is
     *     {@link SubAssocUsrRoleType }
     *     
     */
    public SubAssocUsrRoleType getSubAssocUsrRole() {
        return subAssocUsrRole;
    }

    /**
     * Sets the value of the subAssocUsrRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAssocUsrRoleType }
     *     
     */
    public void setSubAssocUsrRole(SubAssocUsrRoleType value) {
        this.subAssocUsrRole = value;
    }

    /**
     * Gets the value of the subAssocUsrComId property.
     * 
     * @return
     *     possible object is
     *     {@link SubComIdType }
     *     
     */
    public SubComIdType getSubAssocUsrComId() {
        return subAssocUsrComId;
    }

    /**
     * Sets the value of the subAssocUsrComId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubComIdType }
     *     
     */
    public void setSubAssocUsrComId(SubComIdType value) {
        this.subAssocUsrComId = value;
    }

    /**
     * Gets the value of the subAssocUsrConsmCustId property.
     * 
     * @return
     *     possible object is
     *     {@link SubConsmCustIdType }
     *     
     */
    public SubConsmCustIdType getSubAssocUsrConsmCustId() {
        return subAssocUsrConsmCustId;
    }

    /**
     * Sets the value of the subAssocUsrConsmCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubConsmCustIdType }
     *     
     */
    public void setSubAssocUsrConsmCustId(SubConsmCustIdType value) {
        this.subAssocUsrConsmCustId = value;
    }

    /**
     * Gets the value of the subAssocUsrTempPswd property.
     * 
     * @return
     *     possible object is
     *     {@link TempPswdType }
     *     
     */
    public TempPswdType getSubAssocUsrTempPswd() {
        return subAssocUsrTempPswd;
    }

    /**
     * Sets the value of the subAssocUsrTempPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TempPswdType }
     *     
     */
    public void setSubAssocUsrTempPswd(TempPswdType value) {
        this.subAssocUsrTempPswd = value;
    }

    /**
     * Gets the value of the subAssocUsrEmailArray property.
     * 
     * @return
     *     possible object is
     *     {@link EmailArrayAType }
     *     
     */
    public EmailArrayAType getSubAssocUsrEmailArray() {
        return subAssocUsrEmailArray;
    }

    /**
     * Sets the value of the subAssocUsrEmailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailArrayAType }
     *     
     */
    public void setSubAssocUsrEmailArray(EmailArrayAType value) {
        this.subAssocUsrEmailArray = value;
    }

    /**
     * Gets the value of the subAssocUsrPhoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getSubAssocUsrPhoneArray() {
        return subAssocUsrPhoneArray;
    }

    /**
     * Sets the value of the subAssocUsrPhoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setSubAssocUsrPhoneArray(PhoneArrayAType value) {
        this.subAssocUsrPhoneArray = value;
    }

    /**
     * Gets the value of the subAssocUsrCmnt property.
     * 
     * @return
     *     possible object is
     *     {@link SubAssocUsrCmntType }
     *     
     */
    public SubAssocUsrCmntType getSubAssocUsrCmnt() {
        return subAssocUsrCmnt;
    }

    /**
     * Sets the value of the subAssocUsrCmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAssocUsrCmntType }
     *     
     */
    public void setSubAssocUsrCmnt(SubAssocUsrCmntType value) {
        this.subAssocUsrCmnt = value;
    }

    /**
     * Gets the value of the subAssocUsrMktgOptInInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link MktgOptInfoArrayAType }
     *     
     */
    public MktgOptInfoArrayAType getSubAssocUsrMktgOptInInfoArray() {
        return subAssocUsrMktgOptInInfoArray;
    }

    /**
     * Sets the value of the subAssocUsrMktgOptInInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link MktgOptInfoArrayAType }
     *     
     */
    public void setSubAssocUsrMktgOptInInfoArray(MktgOptInfoArrayAType value) {
        this.subAssocUsrMktgOptInInfoArray = value;
    }

    /**
     * Gets the value of the subAssocUsrPerInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link SubAssocUsrPerInfoArrayAType }
     *     
     */
    public SubAssocUsrPerInfoArrayAType getSubAssocUsrPerInfoArray() {
        return subAssocUsrPerInfoArray;
    }

    /**
     * Sets the value of the subAssocUsrPerInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAssocUsrPerInfoArrayAType }
     *     
     */
    public void setSubAssocUsrPerInfoArray(SubAssocUsrPerInfoArrayAType value) {
        this.subAssocUsrPerInfoArray = value;
    }

    /**
     * Gets the value of the subAssocUsrCapInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link SubAssocUsrCapInfoArrayAType }
     *     
     */
    public SubAssocUsrCapInfoArrayAType getSubAssocUsrCapInfoArray() {
        return subAssocUsrCapInfoArray;
    }

    /**
     * Sets the value of the subAssocUsrCapInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAssocUsrCapInfoArrayAType }
     *     
     */
    public void setSubAssocUsrCapInfoArray(SubAssocUsrCapInfoArrayAType value) {
        this.subAssocUsrCapInfoArray = value;
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
     * {@link Element }
     * {@link Object }
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
