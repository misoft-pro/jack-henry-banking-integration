
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
 * Activity Intention and Activity Intention Key behavior will only be
 *     allowed on search services when the response set is part of an subset For example,
 *     Account Reconciliation Item Search requires the Account Identifier element thereby
 *     making the account reconciliation items in the return response limited to a specific
 *     account identifier 
 * 
 * <p>Java class for AcctReconItemSrchRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctReconItemSrchRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRqHdr_CType"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType"/&gt;
 *         &lt;element name="AcctReconBatchId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReconBatchId_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="IssAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *           &lt;element name="IssItemCrtDt" type="{http://jackhenry.com/jxchange/TPG/2008}IssItemCrtDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *           &lt;element name="PayeeName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeName_Type" minOccurs="0"/&gt;
 *           &lt;element name="ActIntent" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntent_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AcctReconItemSrchRq_MType", propOrder = {
    "srchMsgRqHdr",
    "accountId",
    "acctReconBatchId",
    "custom",
    "ver1",
    "issAmt",
    "issItemCrtDt",
    "chkNum",
    "payeeName",
    "actIntent",
    "ver2",
    "any"
})
public class AcctReconItemSrchRqMType {

    @XmlElement(name = "SrchMsgRqHdr", required = true)
    protected SrchMsgRqHdrCType srchMsgRqHdr;
    @XmlElement(name = "AccountId", required = true)
    protected AccountIdCType accountId;
    @XmlElementRef(name = "AcctReconBatchId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctReconBatchIdType> acctReconBatchId;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "IssAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AmtType> issAmt;
    @XmlElementRef(name = "IssItemCrtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IssItemCrtDtType> issItemCrtDt;
    @XmlElementRef(name = "ChkNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChkNumType> chkNum;
    @XmlElementRef(name = "PayeeName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PayeeNameType> payeeName;
    @XmlElementRef(name = "ActIntent", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentType> actIntent;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the srchMsgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public SrchMsgRqHdrCType getSrchMsgRqHdr() {
        return srchMsgRqHdr;
    }

    /**
     * Sets the value of the srchMsgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public void setSrchMsgRqHdr(SrchMsgRqHdrCType value) {
        this.srchMsgRqHdr = value;
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
     * Gets the value of the acctReconBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctReconBatchIdType }{@code >}
     *     
     */
    public JAXBElement<AcctReconBatchIdType> getAcctReconBatchId() {
        return acctReconBatchId;
    }

    /**
     * Sets the value of the acctReconBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctReconBatchIdType }{@code >}
     *     
     */
    public void setAcctReconBatchId(JAXBElement<AcctReconBatchIdType> value) {
        this.acctReconBatchId = value;
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
     * Gets the value of the issAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmtType }{@code >}
     *     
     */
    public JAXBElement<AmtType> getIssAmt() {
        return issAmt;
    }

    /**
     * Sets the value of the issAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmtType }{@code >}
     *     
     */
    public void setIssAmt(JAXBElement<AmtType> value) {
        this.issAmt = value;
    }

    /**
     * Gets the value of the issItemCrtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IssItemCrtDtType }{@code >}
     *     
     */
    public JAXBElement<IssItemCrtDtType> getIssItemCrtDt() {
        return issItemCrtDt;
    }

    /**
     * Sets the value of the issItemCrtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IssItemCrtDtType }{@code >}
     *     
     */
    public void setIssItemCrtDt(JAXBElement<IssItemCrtDtType> value) {
        this.issItemCrtDt = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChkNumType }{@code >}
     *     
     */
    public JAXBElement<ChkNumType> getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChkNumType }{@code >}
     *     
     */
    public void setChkNum(JAXBElement<ChkNumType> value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PayeeNameType }{@code >}
     *     
     */
    public JAXBElement<PayeeNameType> getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PayeeNameType }{@code >}
     *     
     */
    public void setPayeeName(JAXBElement<PayeeNameType> value) {
        this.payeeName = value;
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
