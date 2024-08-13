
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
 * <p>Java class for WireCompInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireCompInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireCompName" type="{http://jackhenry.com/jxchange/TPG/2008}WireCompName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOutgoingLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireOutgoingLmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOutgoingDlyLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireOutgoingDlyLmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAcctIdArray" type="{http://jackhenry.com/jxchange/TPG/2008}WireAcctIdArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="WireCompType" type="{http://jackhenry.com/jxchange/TPG/2008}WireCompType_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="WireBalType" type="{http://jackhenry.com/jxchange/TPG/2008}WireBalType_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="MemoPostWireType" type="{http://jackhenry.com/jxchange/TPG/2008}MemoPostWireType_Type" minOccurs="0"/&gt;
 *               &lt;element name="MemoPostNxtDayWireToday" type="{http://jackhenry.com/jxchange/TPG/2008}MemoPostWireType_Type" minOccurs="0"/&gt;
 *               &lt;element name="AutoPostOutgoingWireAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AutoPostWireAmt_Type" minOccurs="0"/&gt;
 *               &lt;element name="WireNotType" type="{http://jackhenry.com/jxchange/TPG/2008}WireNotType_Type" minOccurs="0"/&gt;
 *               &lt;element name="NotReqType" type="{http://jackhenry.com/jxchange/TPG/2008}NotReqType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "WireCompInfoRec_CType", propOrder = {
    "custId",
    "wireCompName",
    "wireOutgoingLmtAmt",
    "wireOutgoingDlyLmtAmt",
    "wireAcctIdArray",
    "custom",
    "ver1",
    "wireCompType",
    "ver2",
    "wireBalType",
    "ver3",
    "memoPostWireType",
    "memoPostNxtDayWireToday",
    "autoPostOutgoingWireAmt",
    "wireNotType",
    "notReqType",
    "wireFeeArray",
    "ver4",
    "any"
})
public class WireCompInfoRecCType {

    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "WireCompName")
    protected WireCompNameType wireCompName;
    @XmlElement(name = "WireOutgoingLmtAmt")
    protected WireOutgoingLmtAmtType wireOutgoingLmtAmt;
    @XmlElement(name = "WireOutgoingDlyLmtAmt")
    protected WireOutgoingDlyLmtAmtType wireOutgoingDlyLmtAmt;
    @XmlElement(name = "WireAcctIdArray")
    protected WireAcctIdArrayAType wireAcctIdArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "WireCompType")
    protected WireCompTypeType wireCompType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "WireBalType")
    protected WireBalTypeType wireBalType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "MemoPostWireType")
    protected MemoPostWireTypeType memoPostWireType;
    @XmlElement(name = "MemoPostNxtDayWireToday")
    protected MemoPostWireTypeType memoPostNxtDayWireToday;
    @XmlElement(name = "AutoPostOutgoingWireAmt")
    protected AutoPostWireAmtType autoPostOutgoingWireAmt;
    @XmlElement(name = "WireNotType")
    protected WireNotTypeType wireNotType;
    @XmlElement(name = "NotReqType")
    protected NotReqTypeType notReqType;
    @XmlElement(name = "WireFeeArray")
    protected WireFeeArrayAType wireFeeArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
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
     * Gets the value of the wireCompName property.
     * 
     * @return
     *     possible object is
     *     {@link WireCompNameType }
     *     
     */
    public WireCompNameType getWireCompName() {
        return wireCompName;
    }

    /**
     * Sets the value of the wireCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireCompNameType }
     *     
     */
    public void setWireCompName(WireCompNameType value) {
        this.wireCompName = value;
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
     * Gets the value of the wireAcctIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link WireAcctIdArrayAType }
     *     
     */
    public WireAcctIdArrayAType getWireAcctIdArray() {
        return wireAcctIdArray;
    }

    /**
     * Sets the value of the wireAcctIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireAcctIdArrayAType }
     *     
     */
    public void setWireAcctIdArray(WireAcctIdArrayAType value) {
        this.wireAcctIdArray = value;
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
     * Gets the value of the wireCompType property.
     * 
     * @return
     *     possible object is
     *     {@link WireCompTypeType }
     *     
     */
    public WireCompTypeType getWireCompType() {
        return wireCompType;
    }

    /**
     * Sets the value of the wireCompType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireCompTypeType }
     *     
     */
    public void setWireCompType(WireCompTypeType value) {
        this.wireCompType = value;
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
     * Gets the value of the memoPostWireType property.
     * 
     * @return
     *     possible object is
     *     {@link MemoPostWireTypeType }
     *     
     */
    public MemoPostWireTypeType getMemoPostWireType() {
        return memoPostWireType;
    }

    /**
     * Sets the value of the memoPostWireType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoPostWireTypeType }
     *     
     */
    public void setMemoPostWireType(MemoPostWireTypeType value) {
        this.memoPostWireType = value;
    }

    /**
     * Gets the value of the memoPostNxtDayWireToday property.
     * 
     * @return
     *     possible object is
     *     {@link MemoPostWireTypeType }
     *     
     */
    public MemoPostWireTypeType getMemoPostNxtDayWireToday() {
        return memoPostNxtDayWireToday;
    }

    /**
     * Sets the value of the memoPostNxtDayWireToday property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoPostWireTypeType }
     *     
     */
    public void setMemoPostNxtDayWireToday(MemoPostWireTypeType value) {
        this.memoPostNxtDayWireToday = value;
    }

    /**
     * Gets the value of the autoPostOutgoingWireAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AutoPostWireAmtType }
     *     
     */
    public AutoPostWireAmtType getAutoPostOutgoingWireAmt() {
        return autoPostOutgoingWireAmt;
    }

    /**
     * Sets the value of the autoPostOutgoingWireAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoPostWireAmtType }
     *     
     */
    public void setAutoPostOutgoingWireAmt(AutoPostWireAmtType value) {
        this.autoPostOutgoingWireAmt = value;
    }

    /**
     * Gets the value of the wireNotType property.
     * 
     * @return
     *     possible object is
     *     {@link WireNotTypeType }
     *     
     */
    public WireNotTypeType getWireNotType() {
        return wireNotType;
    }

    /**
     * Sets the value of the wireNotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireNotTypeType }
     *     
     */
    public void setWireNotType(WireNotTypeType value) {
        this.wireNotType = value;
    }

    /**
     * Gets the value of the notReqType property.
     * 
     * @return
     *     possible object is
     *     {@link NotReqTypeType }
     *     
     */
    public NotReqTypeType getNotReqType() {
        return notReqType;
    }

    /**
     * Sets the value of the notReqType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotReqTypeType }
     *     
     */
    public void setNotReqType(NotReqTypeType value) {
        this.notReqType = value;
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
