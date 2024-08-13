
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
 * <p>Java class for AcctAnlysInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctAnlysInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="LeadAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}LeadAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActIntent" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntent_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActIntenKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctAnlysInqInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysInqInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_AcctAnlysRateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_AcctAnlysRateInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_AcctAnlysCntInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_AcctAnlysCntInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_AcctAnlysHistInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_AcctAnlysHistInfo_CType" minOccurs="0"/&gt;
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
@XmlType(name = "AcctAnlysInqRs_MType", propOrder = {
    "msgRsHdr",
    "accountId",
    "leadAcctType",
    "actIntent",
    "actIntenKey",
    "acctAnlysInqInfo",
    "xAcctAnlysRateInfo",
    "xAcctAnlysCntInfo",
    "xAcctAnlysHistInfo",
    "custom",
    "ver1",
    "any"
})
public class AcctAnlysInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElementRef(name = "LeadAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LeadAcctTypeType> leadAcctType;
    @XmlElementRef(name = "ActIntent", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentType> actIntent;
    @XmlElementRef(name = "ActIntenKey", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentKeyType> actIntenKey;
    @XmlElementRef(name = "AcctAnlysInqInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctAnlysInqInfoCType> acctAnlysInqInfo;
    @XmlElementRef(name = "x_AcctAnlysRateInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XAcctAnlysRateInfoCType> xAcctAnlysRateInfo;
    @XmlElementRef(name = "x_AcctAnlysCntInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XAcctAnlysCntInfoCType> xAcctAnlysCntInfo;
    @XmlElementRef(name = "x_AcctAnlysHistInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XAcctAnlysHistInfoCType> xAcctAnlysHistInfo;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public MsgRsHdrCType getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Sets the value of the msgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public void setMsgRsHdr(MsgRsHdrCType value) {
        this.msgRsHdr = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<AccountIdCType> value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the leadAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LeadAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<LeadAcctTypeType> getLeadAcctType() {
        return leadAcctType;
    }

    /**
     * Sets the value of the leadAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LeadAcctTypeType }{@code >}
     *     
     */
    public void setLeadAcctType(JAXBElement<LeadAcctTypeType> value) {
        this.leadAcctType = value;
    }

    /**
     * Gets the value of the actIntent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public JAXBElement<ActIntentType> getActIntent() {
        return actIntent;
    }

    /**
     * Sets the value of the actIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public void setActIntent(JAXBElement<ActIntentType> value) {
        this.actIntent = value;
    }

    /**
     * Gets the value of the actIntenKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public JAXBElement<ActIntentKeyType> getActIntenKey() {
        return actIntenKey;
    }

    /**
     * Sets the value of the actIntenKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public void setActIntenKey(JAXBElement<ActIntentKeyType> value) {
        this.actIntenKey = value;
    }

    /**
     * Gets the value of the acctAnlysInqInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctAnlysInqInfoCType }{@code >}
     *     
     */
    public JAXBElement<AcctAnlysInqInfoCType> getAcctAnlysInqInfo() {
        return acctAnlysInqInfo;
    }

    /**
     * Sets the value of the acctAnlysInqInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctAnlysInqInfoCType }{@code >}
     *     
     */
    public void setAcctAnlysInqInfo(JAXBElement<AcctAnlysInqInfoCType> value) {
        this.acctAnlysInqInfo = value;
    }

    /**
     * Gets the value of the xAcctAnlysRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XAcctAnlysRateInfoCType }{@code >}
     *     
     */
    public JAXBElement<XAcctAnlysRateInfoCType> getXAcctAnlysRateInfo() {
        return xAcctAnlysRateInfo;
    }

    /**
     * Sets the value of the xAcctAnlysRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XAcctAnlysRateInfoCType }{@code >}
     *     
     */
    public void setXAcctAnlysRateInfo(JAXBElement<XAcctAnlysRateInfoCType> value) {
        this.xAcctAnlysRateInfo = value;
    }

    /**
     * Gets the value of the xAcctAnlysCntInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XAcctAnlysCntInfoCType }{@code >}
     *     
     */
    public JAXBElement<XAcctAnlysCntInfoCType> getXAcctAnlysCntInfo() {
        return xAcctAnlysCntInfo;
    }

    /**
     * Sets the value of the xAcctAnlysCntInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XAcctAnlysCntInfoCType }{@code >}
     *     
     */
    public void setXAcctAnlysCntInfo(JAXBElement<XAcctAnlysCntInfoCType> value) {
        this.xAcctAnlysCntInfo = value;
    }

    /**
     * Gets the value of the xAcctAnlysHistInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XAcctAnlysHistInfoCType }{@code >}
     *     
     */
    public JAXBElement<XAcctAnlysHistInfoCType> getXAcctAnlysHistInfo() {
        return xAcctAnlysHistInfo;
    }

    /**
     * Sets the value of the xAcctAnlysHistInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XAcctAnlysHistInfoCType }{@code >}
     *     
     */
    public void setXAcctAnlysHistInfo(JAXBElement<XAcctAnlysHistInfoCType> value) {
        this.xAcctAnlysHistInfo = value;
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
