
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CRMEventSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMEventSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMEventType" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventType_Type"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMEventId" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMEventDt" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventCrtOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventCrtOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventCmnt" type="{http://jackhenry.com/jxchange/TPG/2008}CRMCmnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMEventRecv" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventRecv_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventPrivType" type="{http://jackhenry.com/jxchange/TPG/2008}CRMPrivType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventDueDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}EventStatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EventStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMSvcEventSrchCustom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CRMEventDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="EscltDt" type="{http://jackhenry.com/jxchange/TPG/2008}EscltDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMEventSrchRec_CType", propOrder = {
    "crmEventType",
    "accountId",
    "taxId",
    "custId",
    "crmEventId",
    "crmEventDt",
    "eventCrtOffCode",
    "eventCrtOffDesc",
    "eventOffCode",
    "eventOffDesc",
    "eventCmnt",
    "crmEventRecv",
    "eventPrivType",
    "eventDueDt",
    "eventStatCode",
    "eventStatDesc",
    "crmSvcEventSrchCustom",
    "ver1",
    "crmEventDesc",
    "escltDt",
    "ver2",
    "personName",
    "ver3",
    "any"
})
public class CRMEventSrchRecCType {

    @XmlElement(name = "CRMEventType", required = true)
    protected CRMEventTypeType crmEventType;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "CRMEventId")
    protected CRMEventIdType crmEventId;
    @XmlElement(name = "CRMEventDt")
    protected CRMEventDtType crmEventDt;
    @XmlElement(name = "EventCrtOffCode")
    protected CRMOffCodeType eventCrtOffCode;
    @XmlElement(name = "EventCrtOffDesc")
    protected CRMOffDescType eventCrtOffDesc;
    @XmlElement(name = "EventOffCode")
    protected CRMOffCodeType eventOffCode;
    @XmlElement(name = "EventOffDesc")
    protected CRMOffDescType eventOffDesc;
    @XmlElement(name = "EventCmnt")
    protected CRMCmntType eventCmnt;
    @XmlElement(name = "CRMEventRecv")
    protected CRMEventRecvType crmEventRecv;
    @XmlElement(name = "EventPrivType")
    protected CRMPrivTypeType eventPrivType;
    @XmlElement(name = "EventDueDt")
    protected CRMEventDueDtType eventDueDt;
    @XmlElement(name = "EventStatCode")
    protected EventStatCodeType eventStatCode;
    @XmlElement(name = "EventStatDesc")
    protected EventStatDescType eventStatDesc;
    @XmlElement(name = "CRMSvcEventSrchCustom")
    protected CustomCType crmSvcEventSrchCustom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CRMEventDesc")
    protected CRMEventDescType crmEventDesc;
    @XmlElement(name = "EscltDt")
    protected EscltDtType escltDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

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
     * Gets the value of the crmEventDt property.
     * 
     * @return
     *     possible object is
     *     {@link CRMEventDtType }
     *     
     */
    public CRMEventDtType getCRMEventDt() {
        return crmEventDt;
    }

    /**
     * Sets the value of the crmEventDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMEventDtType }
     *     
     */
    public void setCRMEventDt(CRMEventDtType value) {
        this.crmEventDt = value;
    }

    /**
     * Gets the value of the eventCrtOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getEventCrtOffCode() {
        return eventCrtOffCode;
    }

    /**
     * Sets the value of the eventCrtOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setEventCrtOffCode(CRMOffCodeType value) {
        this.eventCrtOffCode = value;
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
     * Gets the value of the eventOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getEventOffCode() {
        return eventOffCode;
    }

    /**
     * Sets the value of the eventOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setEventOffCode(CRMOffCodeType value) {
        this.eventOffCode = value;
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
     * Gets the value of the eventCmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CRMCmntType }
     *     
     */
    public CRMCmntType getEventCmnt() {
        return eventCmnt;
    }

    /**
     * Sets the value of the eventCmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMCmntType }
     *     
     */
    public void setEventCmnt(CRMCmntType value) {
        this.eventCmnt = value;
    }

    /**
     * Gets the value of the crmEventRecv property.
     * 
     * @return
     *     possible object is
     *     {@link CRMEventRecvType }
     *     
     */
    public CRMEventRecvType getCRMEventRecv() {
        return crmEventRecv;
    }

    /**
     * Sets the value of the crmEventRecv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMEventRecvType }
     *     
     */
    public void setCRMEventRecv(CRMEventRecvType value) {
        this.crmEventRecv = value;
    }

    /**
     * Gets the value of the eventPrivType property.
     * 
     * @return
     *     possible object is
     *     {@link CRMPrivTypeType }
     *     
     */
    public CRMPrivTypeType getEventPrivType() {
        return eventPrivType;
    }

    /**
     * Sets the value of the eventPrivType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMPrivTypeType }
     *     
     */
    public void setEventPrivType(CRMPrivTypeType value) {
        this.eventPrivType = value;
    }

    /**
     * Gets the value of the eventDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link CRMEventDueDtType }
     *     
     */
    public CRMEventDueDtType getEventDueDt() {
        return eventDueDt;
    }

    /**
     * Sets the value of the eventDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMEventDueDtType }
     *     
     */
    public void setEventDueDt(CRMEventDueDtType value) {
        this.eventDueDt = value;
    }

    /**
     * Gets the value of the eventStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link EventStatCodeType }
     *     
     */
    public EventStatCodeType getEventStatCode() {
        return eventStatCode;
    }

    /**
     * Sets the value of the eventStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatCodeType }
     *     
     */
    public void setEventStatCode(EventStatCodeType value) {
        this.eventStatCode = value;
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
     * Gets the value of the crmSvcEventSrchCustom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCRMSvcEventSrchCustom() {
        return crmSvcEventSrchCustom;
    }

    /**
     * Sets the value of the crmSvcEventSrchCustom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCRMSvcEventSrchCustom(CustomCType value) {
        this.crmSvcEventSrchCustom = value;
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
     * Gets the value of the crmEventDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMEventDescType }
     *     
     */
    public CRMEventDescType getCRMEventDesc() {
        return crmEventDesc;
    }

    /**
     * Sets the value of the crmEventDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMEventDescType }
     *     
     */
    public void setCRMEventDesc(CRMEventDescType value) {
        this.crmEventDesc = value;
    }

    /**
     * Gets the value of the escltDt property.
     * 
     * @return
     *     possible object is
     *     {@link EscltDtType }
     *     
     */
    public EscltDtType getEscltDt() {
        return escltDt;
    }

    /**
     * Sets the value of the escltDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscltDtType }
     *     
     */
    public void setEscltDt(EscltDtType value) {
        this.escltDt = value;
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

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
