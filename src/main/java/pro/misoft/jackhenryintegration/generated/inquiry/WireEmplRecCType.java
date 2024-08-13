
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
 * <p>Java class for WireEmplRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireEmplRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmplId" type="{http://jackhenry.com/jxchange/TPG/2008}EmplId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmplName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType"/&gt;
 *         &lt;element name="EmplTitle" type="{http://jackhenry.com/jxchange/TPG/2008}EmplTitle_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireActAlwType" type="{http://jackhenry.com/jxchange/TPG/2008}WireActAlwType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOutgoingLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireOutgoingLmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOutgoingDlyLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireOutgoingDlyLmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireDlyAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireDlyAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireDualCtrlReqType" type="{http://jackhenry.com/jxchange/TPG/2008}WireDualCtrlReqType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireDualCtrlAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireDualCtrlAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAlwActArray" type="{http://jackhenry.com/jxchange/TPG/2008}WireAlwActArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EmplPhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EmplEmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="RmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
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
@XmlType(name = "WireEmplRec_CType", propOrder = {
    "emplId",
    "emplName",
    "emplTitle",
    "wireActAlwType",
    "wireOutgoingLmtAmt",
    "wireOutgoingDlyLmtAmt",
    "wireDlyAmt",
    "wireDualCtrlReqType",
    "wireDualCtrlAmt",
    "wireAlwActArray",
    "emplPhoneArray",
    "emplEmailArray",
    "rmkArray",
    "custom",
    "ver1",
    "any"
})
public class WireEmplRecCType {

    @XmlElement(name = "EmplId")
    protected EmplIdType emplId;
    @XmlElement(name = "EmplName", required = true)
    protected PersonNameCType emplName;
    @XmlElement(name = "EmplTitle")
    protected EmplTitleType emplTitle;
    @XmlElement(name = "WireActAlwType")
    protected WireActAlwTypeType wireActAlwType;
    @XmlElement(name = "WireOutgoingLmtAmt")
    protected WireOutgoingLmtAmtType wireOutgoingLmtAmt;
    @XmlElement(name = "WireOutgoingDlyLmtAmt")
    protected WireOutgoingDlyLmtAmtType wireOutgoingDlyLmtAmt;
    @XmlElement(name = "WireDlyAmt")
    protected WireDlyAmtType wireDlyAmt;
    @XmlElement(name = "WireDualCtrlReqType")
    protected WireDualCtrlReqTypeType wireDualCtrlReqType;
    @XmlElement(name = "WireDualCtrlAmt")
    protected WireDualCtrlAmtType wireDualCtrlAmt;
    @XmlElement(name = "WireAlwActArray")
    protected WireAlwActArrayAType wireAlwActArray;
    @XmlElement(name = "EmplPhoneArray")
    protected PhoneArrayAType emplPhoneArray;
    @XmlElement(name = "EmplEmailArray")
    protected EmailArrayAType emplEmailArray;
    @XmlElement(name = "RmkArray")
    protected RmkAType rmkArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the emplId property.
     * 
     * @return
     *     possible object is
     *     {@link EmplIdType }
     *     
     */
    public EmplIdType getEmplId() {
        return emplId;
    }

    /**
     * Sets the value of the emplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplIdType }
     *     
     */
    public void setEmplId(EmplIdType value) {
        this.emplId = value;
    }

    /**
     * Gets the value of the emplName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getEmplName() {
        return emplName;
    }

    /**
     * Sets the value of the emplName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setEmplName(PersonNameCType value) {
        this.emplName = value;
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
     * Gets the value of the wireActAlwType property.
     * 
     * @return
     *     possible object is
     *     {@link WireActAlwTypeType }
     *     
     */
    public WireActAlwTypeType getWireActAlwType() {
        return wireActAlwType;
    }

    /**
     * Sets the value of the wireActAlwType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireActAlwTypeType }
     *     
     */
    public void setWireActAlwType(WireActAlwTypeType value) {
        this.wireActAlwType = value;
    }

    /**
     * Gets the value of the wireOutgoingLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WireOutgoingLmtAmtType }
     *     
     */
    public WireOutgoingLmtAmtType getWireOutgoingLmtAmt() {
        return wireOutgoingLmtAmt;
    }

    /**
     * Sets the value of the wireOutgoingLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireOutgoingLmtAmtType }
     *     
     */
    public void setWireOutgoingLmtAmt(WireOutgoingLmtAmtType value) {
        this.wireOutgoingLmtAmt = value;
    }

    /**
     * Gets the value of the wireOutgoingDlyLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WireOutgoingDlyLmtAmtType }
     *     
     */
    public WireOutgoingDlyLmtAmtType getWireOutgoingDlyLmtAmt() {
        return wireOutgoingDlyLmtAmt;
    }

    /**
     * Sets the value of the wireOutgoingDlyLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireOutgoingDlyLmtAmtType }
     *     
     */
    public void setWireOutgoingDlyLmtAmt(WireOutgoingDlyLmtAmtType value) {
        this.wireOutgoingDlyLmtAmt = value;
    }

    /**
     * Gets the value of the wireDlyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WireDlyAmtType }
     *     
     */
    public WireDlyAmtType getWireDlyAmt() {
        return wireDlyAmt;
    }

    /**
     * Sets the value of the wireDlyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireDlyAmtType }
     *     
     */
    public void setWireDlyAmt(WireDlyAmtType value) {
        this.wireDlyAmt = value;
    }

    /**
     * Gets the value of the wireDualCtrlReqType property.
     * 
     * @return
     *     possible object is
     *     {@link WireDualCtrlReqTypeType }
     *     
     */
    public WireDualCtrlReqTypeType getWireDualCtrlReqType() {
        return wireDualCtrlReqType;
    }

    /**
     * Sets the value of the wireDualCtrlReqType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireDualCtrlReqTypeType }
     *     
     */
    public void setWireDualCtrlReqType(WireDualCtrlReqTypeType value) {
        this.wireDualCtrlReqType = value;
    }

    /**
     * Gets the value of the wireDualCtrlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WireDualCtrlAmtType }
     *     
     */
    public WireDualCtrlAmtType getWireDualCtrlAmt() {
        return wireDualCtrlAmt;
    }

    /**
     * Sets the value of the wireDualCtrlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireDualCtrlAmtType }
     *     
     */
    public void setWireDualCtrlAmt(WireDualCtrlAmtType value) {
        this.wireDualCtrlAmt = value;
    }

    /**
     * Gets the value of the wireAlwActArray property.
     * 
     * @return
     *     possible object is
     *     {@link WireAlwActArrayAType }
     *     
     */
    public WireAlwActArrayAType getWireAlwActArray() {
        return wireAlwActArray;
    }

    /**
     * Sets the value of the wireAlwActArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireAlwActArrayAType }
     *     
     */
    public void setWireAlwActArray(WireAlwActArrayAType value) {
        this.wireAlwActArray = value;
    }

    /**
     * Gets the value of the emplPhoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getEmplPhoneArray() {
        return emplPhoneArray;
    }

    /**
     * Sets the value of the emplPhoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setEmplPhoneArray(PhoneArrayAType value) {
        this.emplPhoneArray = value;
    }

    /**
     * Gets the value of the emplEmailArray property.
     * 
     * @return
     *     possible object is
     *     {@link EmailArrayAType }
     *     
     */
    public EmailArrayAType getEmplEmailArray() {
        return emplEmailArray;
    }

    /**
     * Sets the value of the emplEmailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailArrayAType }
     *     
     */
    public void setEmplEmailArray(EmailArrayAType value) {
        this.emplEmailArray = value;
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
