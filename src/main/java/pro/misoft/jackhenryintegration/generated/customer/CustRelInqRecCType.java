
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
 * <p>Java class for CustRelInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustRelInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="TINInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TINInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustRelDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CustRelDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="GroupCode" type="{http://jackhenry.com/jxchange/TPG/2008}GroupCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomCustRelInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "CustRelInqRec_CType", propOrder = {
    "custId",
    "personName",
    "tinInfo",
    "custRelCode",
    "custRelDesc",
    "groupCode",
    "customCustRelInqRec",
    "ver1",
    "any"
})
public class CustRelInqRecCType {

    @XmlElement(name = "CustId", required = true)
    protected CustIdType custId;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "TINInfo")
    protected TINInfoCType tinInfo;
    @XmlElement(name = "CustRelCode")
    protected CustRelCodeType custRelCode;
    @XmlElement(name = "CustRelDesc")
    protected CustRelDescType custRelDesc;
    @XmlElement(name = "GroupCode")
    protected GroupCodeType groupCode;
    @XmlElement(name = "CustomCustRelInqRec")
    protected CustomCType customCustRelInqRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the tinInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TINInfoCType }
     *     
     */
    public TINInfoCType getTINInfo() {
        return tinInfo;
    }

    /**
     * Sets the value of the tinInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINInfoCType }
     *     
     */
    public void setTINInfo(TINInfoCType value) {
        this.tinInfo = value;
    }

    /**
     * Gets the value of the custRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustRelCodeType }
     *     
     */
    public CustRelCodeType getCustRelCode() {
        return custRelCode;
    }

    /**
     * Sets the value of the custRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustRelCodeType }
     *     
     */
    public void setCustRelCode(CustRelCodeType value) {
        this.custRelCode = value;
    }

    /**
     * Gets the value of the custRelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CustRelDescType }
     *     
     */
    public CustRelDescType getCustRelDesc() {
        return custRelDesc;
    }

    /**
     * Sets the value of the custRelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustRelDescType }
     *     
     */
    public void setCustRelDesc(CustRelDescType value) {
        this.custRelDesc = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link GroupCodeType }
     *     
     */
    public GroupCodeType getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupCodeType }
     *     
     */
    public void setGroupCode(GroupCodeType value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the customCustRelInqRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomCustRelInqRec() {
        return customCustRelInqRec;
    }

    /**
     * Sets the value of the customCustRelInqRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomCustRelInqRec(CustomCType value) {
        this.customCustRelInqRec = value;
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
