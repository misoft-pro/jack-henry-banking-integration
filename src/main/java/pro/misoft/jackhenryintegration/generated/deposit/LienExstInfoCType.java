
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for LienExstInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LienExstInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LienPositCode" type="{http://jackhenry.com/jxchange/TPG/2008}LienPositCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LienHolderOnUs" type="{http://jackhenry.com/jxchange/TPG/2008}CollatHolderOnUs_Type" minOccurs="0"/&gt;
 *         &lt;element name="LienHolderName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="LienHolderAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="LienAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatLienAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LienExstInfo_CType", propOrder = {
    "lienPositCode",
    "lienHolderOnUs",
    "lienHolderName",
    "lienHolderAddr",
    "accountId",
    "lienAmt",
    "custom",
    "ver1",
    "any"
})
public class LienExstInfoCType {

    @XmlElement(name = "LienPositCode")
    protected LienPositCodeType lienPositCode;
    @XmlElement(name = "LienHolderOnUs")
    protected CollatHolderOnUsType lienHolderOnUs;
    @XmlElement(name = "LienHolderName")
    protected PersonNameCType lienHolderName;
    @XmlElement(name = "LienHolderAddr")
    protected AddrCType lienHolderAddr;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "LienAmt")
    protected CollatLienAmtType lienAmt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lienPositCode property.
     * 
     * @return
     *     possible object is
     *     {@link LienPositCodeType }
     *     
     */
    public LienPositCodeType getLienPositCode() {
        return lienPositCode;
    }

    /**
     * Sets the value of the lienPositCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LienPositCodeType }
     *     
     */
    public void setLienPositCode(LienPositCodeType value) {
        this.lienPositCode = value;
    }

    /**
     * Gets the value of the lienHolderOnUs property.
     * 
     * @return
     *     possible object is
     *     {@link CollatHolderOnUsType }
     *     
     */
    public CollatHolderOnUsType getLienHolderOnUs() {
        return lienHolderOnUs;
    }

    /**
     * Sets the value of the lienHolderOnUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatHolderOnUsType }
     *     
     */
    public void setLienHolderOnUs(CollatHolderOnUsType value) {
        this.lienHolderOnUs = value;
    }

    /**
     * Gets the value of the lienHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getLienHolderName() {
        return lienHolderName;
    }

    /**
     * Sets the value of the lienHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setLienHolderName(PersonNameCType value) {
        this.lienHolderName = value;
    }

    /**
     * Gets the value of the lienHolderAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getLienHolderAddr() {
        return lienHolderAddr;
    }

    /**
     * Sets the value of the lienHolderAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setLienHolderAddr(AddrCType value) {
        this.lienHolderAddr = value;
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
     * Gets the value of the lienAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollatLienAmtType }
     *     
     */
    public CollatLienAmtType getLienAmt() {
        return lienAmt;
    }

    /**
     * Sets the value of the lienAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatLienAmtType }
     *     
     */
    public void setLienAmt(CollatLienAmtType value) {
        this.lienAmt = value;
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
