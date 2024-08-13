
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
 * <p>Java class for CRMEventInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMEventInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMEventInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventInfoRec_CType"/&gt;
 *         &lt;element name="CRMEventId" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventId_Type"/&gt;
 *         &lt;element name="CRMEventType" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventType_Type"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventCrtOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EventStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventCatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EventCatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="x_CRMRelActArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_CRMRelActArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="x_MktCmpgnInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_MktCmpgnInfoArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="x_CRMRelReferArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_CRMRelReferArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "CRMEventInqRec_CType", propOrder = {
    "crmEventInfoRec",
    "crmEventId",
    "crmEventType",
    "custId",
    "crmRelCode",
    "taxId",
    "eventCrtOffDesc",
    "eventOffDesc",
    "eventStatDesc",
    "eventCatDesc",
    "custom",
    "ver1",
    "xcrmRelActArray",
    "ver2",
    "xMktCmpgnInfoArray",
    "ver3",
    "xcrmRelReferArray",
    "ver4",
    "any"
})
public class CRMEventInqRecCType {

    @XmlElement(name = "CRMEventInfoRec", required = true)
    protected CRMEventInfoRecCType crmEventInfoRec;
    @XmlElement(name = "CRMEventId", required = true)
    protected CRMEventIdType crmEventId;
    @XmlElement(name = "CRMEventType", required = true)
    protected CRMEventTypeType crmEventType;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "CRMRelCode")
    protected AcctRelCodeType crmRelCode;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "EventCrtOffDesc")
    protected CRMOffDescType eventCrtOffDesc;
    @XmlElement(name = "EventOffDesc")
    protected CRMOffDescType eventOffDesc;
    @XmlElement(name = "EventStatDesc")
    protected EventStatDescType eventStatDesc;
    @XmlElement(name = "EventCatDesc")
    protected EventCatDescType eventCatDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "x_CRMRelActArray")
    protected XCRMRelActArrayAType xcrmRelActArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "x_MktCmpgnInfoArray")
    protected XMktCmpgnInfoArrayAType xMktCmpgnInfoArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "x_CRMRelReferArray")
    protected XCRMRelReferArrayAType xcrmRelReferArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crmEventInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link CRMEventInfoRecCType }
     *     
     */
    public CRMEventInfoRecCType getCRMEventInfoRec() {
        return crmEventInfoRec;
    }

    /**
     * Sets the value of the crmEventInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMEventInfoRecCType }
     *     
     */
    public void setCRMEventInfoRec(CRMEventInfoRecCType value) {
        this.crmEventInfoRec = value;
    }

    /**
     * Gets the value of the crmEventId property.
     * 
     * @return
     *     possible object is
     *     {@link CRMEventIdType }
     *     
     */
    public CRMEventIdType getCRMEventId() {
        return crmEventId;
    }

    /**
     * Sets the value of the crmEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMEventIdType }
     *     
     */
    public void setCRMEventId(CRMEventIdType value) {
        this.crmEventId = value;
    }

    /**
     * Gets the value of the crmEventType property.
     * 
     * @return
     *     possible object is
     *     {@link CRMEventTypeType }
     *     
     */
    public CRMEventTypeType getCRMEventType() {
        return crmEventType;
    }

    /**
     * Sets the value of the crmEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMEventTypeType }
     *     
     */
    public void setCRMEventType(CRMEventTypeType value) {
        this.crmEventType = value;
    }

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
     * Gets the value of the crmRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRelCodeType }
     *     
     */
    public AcctRelCodeType getCRMRelCode() {
        return crmRelCode;
    }

    /**
     * Sets the value of the crmRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRelCodeType }
     *     
     */
    public void setCRMRelCode(AcctRelCodeType value) {
        this.crmRelCode = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setTaxId(TaxIdType value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the eventCrtOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getEventCrtOffDesc() {
        return eventCrtOffDesc;
    }

    /**
     * Sets the value of the eventCrtOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setEventCrtOffDesc(CRMOffDescType value) {
        this.eventCrtOffDesc = value;
    }

    /**
     * Gets the value of the eventOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getEventOffDesc() {
        return eventOffDesc;
    }

    /**
     * Sets the value of the eventOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setEventOffDesc(CRMOffDescType value) {
        this.eventOffDesc = value;
    }

    /**
     * Gets the value of the eventStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EventStatDescType }
     *     
     */
    public EventStatDescType getEventStatDesc() {
        return eventStatDesc;
    }

    /**
     * Sets the value of the eventStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatDescType }
     *     
     */
    public void setEventStatDesc(EventStatDescType value) {
        this.eventStatDesc = value;
    }

    /**
     * Gets the value of the eventCatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EventCatDescType }
     *     
     */
    public EventCatDescType getEventCatDesc() {
        return eventCatDesc;
    }

    /**
     * Sets the value of the eventCatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCatDescType }
     *     
     */
    public void setEventCatDesc(EventCatDescType value) {
        this.eventCatDesc = value;
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
     * Gets the value of the xcrmRelActArray property.
     * 
     * @return
     *     possible object is
     *     {@link XCRMRelActArrayAType }
     *     
     */
    public XCRMRelActArrayAType getXCRMRelActArray() {
        return xcrmRelActArray;
    }

    /**
     * Sets the value of the xcrmRelActArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCRMRelActArrayAType }
     *     
     */
    public void setXCRMRelActArray(XCRMRelActArrayAType value) {
        this.xcrmRelActArray = value;
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
     * Gets the value of the xMktCmpgnInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link XMktCmpgnInfoArrayAType }
     *     
     */
    public XMktCmpgnInfoArrayAType getXMktCmpgnInfoArray() {
        return xMktCmpgnInfoArray;
    }

    /**
     * Sets the value of the xMktCmpgnInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMktCmpgnInfoArrayAType }
     *     
     */
    public void setXMktCmpgnInfoArray(XMktCmpgnInfoArrayAType value) {
        this.xMktCmpgnInfoArray = value;
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
     * Gets the value of the xcrmRelReferArray property.
     * 
     * @return
     *     possible object is
     *     {@link XCRMRelReferArrayAType }
     *     
     */
    public XCRMRelReferArrayAType getXCRMRelReferArray() {
        return xcrmRelReferArray;
    }

    /**
     * Sets the value of the xcrmRelReferArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCRMRelReferArrayAType }
     *     
     */
    public void setXCRMRelReferArray(XCRMRelReferArrayAType value) {
        this.xcrmRelReferArray = value;
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
