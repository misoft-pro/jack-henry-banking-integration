
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
 * <p>Java class for WireAcctIdRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireAcctIdRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType"/&gt;
 *         &lt;element name="WireActAlwType" type="{http://jackhenry.com/jxchange/TPG/2008}WireActAlwType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOutgoingLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireOutgoingLmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOutgoingDlyLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireOutgoingDlyLmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireDlyAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireDlyAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="WireEmplArray" type="{http://jackhenry.com/jxchange/TPG/2008}WireEmplArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="WireBalType" type="{http://jackhenry.com/jxchange/TPG/2008}WireBalType_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="WireAlwProcType" type="{http://jackhenry.com/jxchange/TPG/2008}WireAlwProcType_Type" minOccurs="0"/&gt;
 *               &lt;element name="ChgFeeAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *               &lt;element name="WireFeeArray" type="{http://jackhenry.com/jxchange/TPG/2008}WireFeeArray_AType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *             &lt;/sequence&gt;
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
@XmlType(name = "WireAcctIdRec_CType", propOrder = {
    "accountId",
    "wireActAlwType",
    "wireOutgoingLmtAmt",
    "wireOutgoingDlyLmtAmt",
    "wireDlyAmt",
    "custom",
    "ver1",
    "wireEmplArray",
    "ver2",
    "wireBalType",
    "ver3",
    "wireAlwProcType",
    "chgFeeAcctId",
    "wireFeeArray",
    "ver4",
    "any"
})
public class WireAcctIdRecCType {

    @XmlElement(name = "AccountId", required = true)
    protected AccountIdCType accountId;
    @XmlElement(name = "WireActAlwType")
    protected WireActAlwTypeType wireActAlwType;
    @XmlElement(name = "WireOutgoingLmtAmt")
    protected WireOutgoingLmtAmtType wireOutgoingLmtAmt;
    @XmlElement(name = "WireOutgoingDlyLmtAmt")
    protected WireOutgoingDlyLmtAmtType wireOutgoingDlyLmtAmt;
    @XmlElement(name = "WireDlyAmt")
    protected WireDlyAmtType wireDlyAmt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "WireEmplArray")
    protected WireEmplArrayAType wireEmplArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "WireBalType")
    protected WireBalTypeType wireBalType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "WireAlwProcType")
    protected WireAlwProcTypeType wireAlwProcType;
    @XmlElement(name = "ChgFeeAcctId")
    protected AccountIdCType chgFeeAcctId;
    @XmlElement(name = "WireFeeArray")
    protected WireFeeArrayAType wireFeeArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setAccountId(AccountIdCType value) {
        this.accountId = value;
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
     * Gets the value of the wireEmplArray property.
     * 
     * @return
     *     possible object is
     *     {@link WireEmplArrayAType }
     *     
     */
    public WireEmplArrayAType getWireEmplArray() {
        return wireEmplArray;
    }

    /**
     * Sets the value of the wireEmplArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireEmplArrayAType }
     *     
     */
    public void setWireEmplArray(WireEmplArrayAType value) {
        this.wireEmplArray = value;
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
     * Gets the value of the wireBalType property.
     * 
     * @return
     *     possible object is
     *     {@link WireBalTypeType }
     *     
     */
    public WireBalTypeType getWireBalType() {
        return wireBalType;
    }

    /**
     * Sets the value of the wireBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBalTypeType }
     *     
     */
    public void setWireBalType(WireBalTypeType value) {
        this.wireBalType = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
    }

    /**
     * Gets the value of the wireAlwProcType property.
     * 
     * @return
     *     possible object is
     *     {@link WireAlwProcTypeType }
     *     
     */
    public WireAlwProcTypeType getWireAlwProcType() {
        return wireAlwProcType;
    }

    /**
     * Sets the value of the wireAlwProcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireAlwProcTypeType }
     *     
     */
    public void setWireAlwProcType(WireAlwProcTypeType value) {
        this.wireAlwProcType = value;
    }

    /**
     * Gets the value of the chgFeeAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getChgFeeAcctId() {
        return chgFeeAcctId;
    }

    /**
     * Sets the value of the chgFeeAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setChgFeeAcctId(AccountIdCType value) {
        this.chgFeeAcctId = value;
    }

    /**
     * Gets the value of the wireFeeArray property.
     * 
     * @return
     *     possible object is
     *     {@link WireFeeArrayAType }
     *     
     */
    public WireFeeArrayAType getWireFeeArray() {
        return wireFeeArray;
    }

    /**
     * Sets the value of the wireFeeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireFeeArrayAType }
     *     
     */
    public void setWireFeeArray(WireFeeArrayAType value) {
        this.wireFeeArray = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
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
