
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * <p>Java class for AcctAnlysModRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctAnlysModRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="ErrOvrRdInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ErrOvrRdInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType"/&gt;
 *         &lt;element name="LeadAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}LeadAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctAnlysInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="AcctAnlysRateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysRateInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="AcctAnlysCntInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysCntInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="AcctAnlysHistArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysHistArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Dlt" type="{http://jackhenry.com/jxchange/TPG/2008}Dlt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActIntenKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type"/&gt;
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
@XmlType(name = "AcctAnlysModRq_MType", propOrder = {
    "msgRqHdr",
    "errOvrRdInfoArray",
    "accountId",
    "leadAcctType",
    "acctAnlysInfoRec",
    "acctAnlysRateInfo",
    "acctAnlysCntInfo",
    "acctAnlysHistArray",
    "dlt",
    "actIntenKey",
    "custom",
    "ver1",
    "any"
})
public class AcctAnlysModRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "ErrOvrRdInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrOvrRdInfoArrayAType> errOvrRdInfoArray;
    @XmlElement(name = "AccountId", required = true)
    protected AccountIdCType accountId;
    @XmlElementRef(name = "LeadAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LeadAcctTypeType> leadAcctType;
    @XmlElementRef(name = "AcctAnlysInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctAnlysInfoRecCType> acctAnlysInfoRec;
    @XmlElementRef(name = "AcctAnlysRateInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctAnlysRateInfoCType> acctAnlysRateInfo;
    @XmlElementRef(name = "AcctAnlysCntInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctAnlysCntInfoCType> acctAnlysCntInfo;
    @XmlElementRef(name = "AcctAnlysHistArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctAnlysHistArrayAType> acctAnlysHistArray;
    @XmlElementRef(name = "Dlt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DltType> dlt;
    @XmlElement(name = "ActIntenKey", required = true)
    protected ActIntentKeyType actIntenKey;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public MsgRqHdrCType getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Sets the value of the msgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public void setMsgRqHdr(MsgRqHdrCType value) {
        this.msgRqHdr = value;
    }

    /**
     * Gets the value of the errOvrRdInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}
     *     
     */
    public JAXBElement<ErrOvrRdInfoArrayAType> getErrOvrRdInfoArray() {
        return errOvrRdInfoArray;
    }

    /**
     * Sets the value of the errOvrRdInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}
     *     
     */
    public void setErrOvrRdInfoArray(JAXBElement<ErrOvrRdInfoArrayAType> value) {
        this.errOvrRdInfoArray = value;
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
     * Gets the value of the acctAnlysInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctAnlysInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<AcctAnlysInfoRecCType> getAcctAnlysInfoRec() {
        return acctAnlysInfoRec;
    }

    /**
     * Sets the value of the acctAnlysInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctAnlysInfoRecCType }{@code >}
     *     
     */
    public void setAcctAnlysInfoRec(JAXBElement<AcctAnlysInfoRecCType> value) {
        this.acctAnlysInfoRec = value;
    }

    /**
     * Gets the value of the acctAnlysRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctAnlysRateInfoCType }{@code >}
     *     
     */
    public JAXBElement<AcctAnlysRateInfoCType> getAcctAnlysRateInfo() {
        return acctAnlysRateInfo;
    }

    /**
     * Sets the value of the acctAnlysRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctAnlysRateInfoCType }{@code >}
     *     
     */
    public void setAcctAnlysRateInfo(JAXBElement<AcctAnlysRateInfoCType> value) {
        this.acctAnlysRateInfo = value;
    }

    /**
     * Gets the value of the acctAnlysCntInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctAnlysCntInfoCType }{@code >}
     *     
     */
    public JAXBElement<AcctAnlysCntInfoCType> getAcctAnlysCntInfo() {
        return acctAnlysCntInfo;
    }

    /**
     * Sets the value of the acctAnlysCntInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctAnlysCntInfoCType }{@code >}
     *     
     */
    public void setAcctAnlysCntInfo(JAXBElement<AcctAnlysCntInfoCType> value) {
        this.acctAnlysCntInfo = value;
    }

    /**
     * Gets the value of the acctAnlysHistArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctAnlysHistArrayAType }{@code >}
     *     
     */
    public JAXBElement<AcctAnlysHistArrayAType> getAcctAnlysHistArray() {
        return acctAnlysHistArray;
    }

    /**
     * Sets the value of the acctAnlysHistArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctAnlysHistArrayAType }{@code >}
     *     
     */
    public void setAcctAnlysHistArray(JAXBElement<AcctAnlysHistArrayAType> value) {
        this.acctAnlysHistArray = value;
    }

    /**
     * Gets the value of the dlt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DltType }{@code >}
     *     
     */
    public JAXBElement<DltType> getDlt() {
        return dlt;
    }

    /**
     * Sets the value of the dlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DltType }{@code >}
     *     
     */
    public void setDlt(JAXBElement<DltType> value) {
        this.dlt = value;
    }

    /**
     * Gets the value of the actIntenKey property.
     * 
     * @return
     *     possible object is
     *     {@link ActIntentKeyType }
     *     
     */
    public ActIntentKeyType getActIntenKey() {
        return actIntenKey;
    }

    /**
     * Sets the value of the actIntenKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActIntentKeyType }
     *     
     */
    public void setActIntenKey(ActIntentKeyType value) {
        this.actIntenKey = value;
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
