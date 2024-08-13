
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
 * <p>Java class for AddrSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddrSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="AddrKeyInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AddrKeyInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="AddrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AddrInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="StmtAddrInfoSrch" type="{http://jackhenry.com/jxchange/TPG/2008}StmtAddrInfoSrch_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustomAddrSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "AddrSrchRec_CType", propOrder = {
    "custId",
    "accountId",
    "addrKeyInfo",
    "addrInfo",
    "stmtAddrInfoSrch",
    "customAddrSrchRec",
    "ver1",
    "any"
})
public class AddrSrchRecCType {

    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "AddrKeyInfo")
    protected AddrKeyInfoCType addrKeyInfo;
    @XmlElement(name = "AddrInfo")
    protected AddrInfoCType addrInfo;
    @XmlElement(name = "StmtAddrInfoSrch")
    protected StmtAddrInfoSrchCType stmtAddrInfoSrch;
    @XmlElement(name = "CustomAddrSrchRec")
    protected CustomCType customAddrSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
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
     * Gets the value of the addrKeyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddrKeyInfoCType }
     *     
     */
    public AddrKeyInfoCType getAddrKeyInfo() {
        return addrKeyInfo;
    }

    /**
     * Sets the value of the addrKeyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrKeyInfoCType }
     *     
     */
    public void setAddrKeyInfo(AddrKeyInfoCType value) {
        this.addrKeyInfo = value;
    }

    /**
     * Gets the value of the addrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddrInfoCType }
     *     
     */
    public AddrInfoCType getAddrInfo() {
        return addrInfo;
    }

    /**
     * Sets the value of the addrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrInfoCType }
     *     
     */
    public void setAddrInfo(AddrInfoCType value) {
        this.addrInfo = value;
    }

    /**
     * Gets the value of the stmtAddrInfoSrch property.
     * 
     * @return
     *     possible object is
     *     {@link StmtAddrInfoSrchCType }
     *     
     */
    public StmtAddrInfoSrchCType getStmtAddrInfoSrch() {
        return stmtAddrInfoSrch;
    }

    /**
     * Sets the value of the stmtAddrInfoSrch property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtAddrInfoSrchCType }
     *     
     */
    public void setStmtAddrInfoSrch(StmtAddrInfoSrchCType value) {
        this.stmtAddrInfoSrch = value;
    }

    /**
     * Gets the value of the customAddrSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomAddrSrchRec() {
        return customAddrSrchRec;
    }

    /**
     * Sets the value of the customAddrSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomAddrSrchRec(CustomCType value) {
        this.customAddrSrchRec = value;
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
