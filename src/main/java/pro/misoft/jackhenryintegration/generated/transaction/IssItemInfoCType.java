
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for IssItemInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssItemInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IssItemId" type="{http://jackhenry.com/jxchange/TPG/2008}IssItemId_Type"/&gt;
 *         &lt;element name="AcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type"/&gt;
 *         &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IssItemType" type="{http://jackhenry.com/jxchange/TPG/2008}IssItemType_Type"/&gt;
 *         &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkDt" type="{http://jackhenry.com/jxchange/TPG/2008}ChkDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkVoidDt" type="{http://jackhenry.com/jxchange/TPG/2008}ChkVoidDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
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
@XmlType(name = "IssItemInfo_CType", propOrder = {
    "issItemId",
    "acctId",
    "acctType",
    "issItemType",
    "chkNum",
    "amt",
    "chkDt",
    "chkVoidDt",
    "payeeName",
    "payeeAddr",
    "custom",
    "ver1",
    "any"
})
public class IssItemInfoCType {

    @XmlElement(name = "IssItemId", required = true)
    protected IssItemIdType issItemId;
    @XmlElement(name = "AcctId", required = true)
    protected AcctIdType acctId;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "IssItemType", required = true)
    protected IssItemTypeType issItemType;
    @XmlElement(name = "ChkNum")
    protected ChkNumType chkNum;
    @XmlElement(name = "Amt")
    protected AmtType amt;
    @XmlElement(name = "ChkDt")
    protected ChkDtType chkDt;
    @XmlElement(name = "ChkVoidDt")
    protected ChkVoidDtType chkVoidDt;
    @XmlElement(name = "PayeeName")
    protected PayeeNameType payeeName;
    @XmlElement(name = "PayeeAddr")
    protected AddrCType payeeAddr;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the issItemId property.
     * 
     * @return
     *     possible object is
     *     {@link IssItemIdType }
     *     
     */
    public IssItemIdType getIssItemId() {
        return issItemId;
    }

    /**
     * Sets the value of the issItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssItemIdType }
     *     
     */
    public void setIssItemId(IssItemIdType value) {
        this.issItemId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAcctId(AcctIdType value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the issItemType property.
     * 
     * @return
     *     possible object is
     *     {@link IssItemTypeType }
     *     
     */
    public IssItemTypeType getIssItemType() {
        return issItemType;
    }

    /**
     * Sets the value of the issItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssItemTypeType }
     *     
     */
    public void setIssItemType(IssItemTypeType value) {
        this.issItemType = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumType }
     *     
     */
    public ChkNumType getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumType }
     *     
     */
    public void setChkNum(ChkNumType value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setAmt(AmtType value) {
        this.amt = value;
    }

    /**
     * Gets the value of the chkDt property.
     * 
     * @return
     *     possible object is
     *     {@link ChkDtType }
     *     
     */
    public ChkDtType getChkDt() {
        return chkDt;
    }

    /**
     * Sets the value of the chkDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkDtType }
     *     
     */
    public void setChkDt(ChkDtType value) {
        this.chkDt = value;
    }

    /**
     * Gets the value of the chkVoidDt property.
     * 
     * @return
     *     possible object is
     *     {@link ChkVoidDtType }
     *     
     */
    public ChkVoidDtType getChkVoidDt() {
        return chkVoidDt;
    }

    /**
     * Sets the value of the chkVoidDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkVoidDtType }
     *     
     */
    public void setChkVoidDt(ChkVoidDtType value) {
        this.chkVoidDt = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeNameType }
     *     
     */
    public PayeeNameType getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeNameType }
     *     
     */
    public void setPayeeName(PayeeNameType value) {
        this.payeeName = value;
    }

    /**
     * Gets the value of the payeeAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getPayeeAddr() {
        return payeeAddr;
    }

    /**
     * Sets the value of the payeeAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setPayeeAddr(AddrCType value) {
        this.payeeAddr = value;
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
     * {@link Element }
     * {@link Object }
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
