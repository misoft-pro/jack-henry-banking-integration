
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
 * <p>Java class for LOCAcctSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCAcctSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="LOCAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigBal" type="{http://jackhenry.com/jxchange/TPG/2008}OrigBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCPctUse" type="{http://jackhenry.com/jxchange/TPG/2008}LOCPctUse_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomLOCAcctSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="LOCGdnceOrder" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceOrder_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LOCAcctSrchRec_CType", propOrder = {
    "accountId",
    "locAcctId",
    "locAcctType",
    "locCustId",
    "curBal",
    "origBal",
    "acctStat",
    "acctStatDesc",
    "locPctUse",
    "offCode",
    "offDesc",
    "customLOCAcctSrchRec",
    "ver1",
    "locGdnceOrder",
    "ver2",
    "any"
})
public class LOCAcctSrchRecCType {

    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "LOCAcctId")
    protected AcctIdType locAcctId;
    @XmlElement(name = "LOCAcctType")
    protected AcctTypeType locAcctType;
    @XmlElement(name = "LOCCustId")
    protected CustIdType locCustId;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "OrigBal")
    protected OrigBalType origBal;
    @XmlElement(name = "AcctStat")
    protected AcctStatType acctStat;
    @XmlElement(name = "AcctStatDesc")
    protected AcctStatDescType acctStatDesc;
    @XmlElement(name = "LOCPctUse")
    protected LOCPctUseType locPctUse;
    @XmlElement(name = "OffCode")
    protected OffCodeType offCode;
    @XmlElement(name = "OffDesc")
    protected OffDescType offDesc;
    @XmlElement(name = "CustomLOCAcctSrchRec")
    protected CustomCType customLOCAcctSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "LOCGdnceOrder")
    protected LOCGdnceOrderType locGdnceOrder;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
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
     * Gets the value of the locAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getLOCAcctId() {
        return locAcctId;
    }

    /**
     * Sets the value of the locAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setLOCAcctId(AcctIdType value) {
        this.locAcctId = value;
    }

    /**
     * Gets the value of the locAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getLOCAcctType() {
        return locAcctType;
    }

    /**
     * Sets the value of the locAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setLOCAcctType(AcctTypeType value) {
        this.locAcctType = value;
    }

    /**
     * Gets the value of the locCustId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getLOCCustId() {
        return locCustId;
    }

    /**
     * Sets the value of the locCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setLOCCustId(CustIdType value) {
        this.locCustId = value;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurBalType }
     *     
     */
    public CurBalType getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurBalType }
     *     
     */
    public void setCurBal(CurBalType value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the origBal property.
     * 
     * @return
     *     possible object is
     *     {@link OrigBalType }
     *     
     */
    public OrigBalType getOrigBal() {
        return origBal;
    }

    /**
     * Sets the value of the origBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigBalType }
     *     
     */
    public void setOrigBal(OrigBalType value) {
        this.origBal = value;
    }

    /**
     * Gets the value of the acctStat property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatType }
     *     
     */
    public AcctStatType getAcctStat() {
        return acctStat;
    }

    /**
     * Sets the value of the acctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatType }
     *     
     */
    public void setAcctStat(AcctStatType value) {
        this.acctStat = value;
    }

    /**
     * Gets the value of the acctStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatDescType }
     *     
     */
    public AcctStatDescType getAcctStatDesc() {
        return acctStatDesc;
    }

    /**
     * Sets the value of the acctStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatDescType }
     *     
     */
    public void setAcctStatDesc(AcctStatDescType value) {
        this.acctStatDesc = value;
    }

    /**
     * Gets the value of the locPctUse property.
     * 
     * @return
     *     possible object is
     *     {@link LOCPctUseType }
     *     
     */
    public LOCPctUseType getLOCPctUse() {
        return locPctUse;
    }

    /**
     * Sets the value of the locPctUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCPctUseType }
     *     
     */
    public void setLOCPctUse(LOCPctUseType value) {
        this.locPctUse = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setOffCode(OffCodeType value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the offDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getOffDesc() {
        return offDesc;
    }

    /**
     * Sets the value of the offDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setOffDesc(OffDescType value) {
        this.offDesc = value;
    }

    /**
     * Gets the value of the customLOCAcctSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomLOCAcctSrchRec() {
        return customLOCAcctSrchRec;
    }

    /**
     * Sets the value of the customLOCAcctSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomLOCAcctSrchRec(CustomCType value) {
        this.customLOCAcctSrchRec = value;
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
     * Gets the value of the locGdnceOrder property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceOrderType }
     *     
     */
    public LOCGdnceOrderType getLOCGdnceOrder() {
        return locGdnceOrder;
    }

    /**
     * Sets the value of the locGdnceOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceOrderType }
     *     
     */
    public void setLOCGdnceOrder(LOCGdnceOrderType value) {
        this.locGdnceOrder = value;
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
