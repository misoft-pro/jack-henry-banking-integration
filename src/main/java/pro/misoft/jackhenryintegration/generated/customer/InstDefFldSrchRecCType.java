
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
 * <p>Java class for InstDefFldSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstDefFldSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="InstDefKey" type="{http://jackhenry.com/jxchange/TPG/2008}InstDefKey_Type" minOccurs="0"/&gt;
 *         &lt;element name="FldId" type="{http://jackhenry.com/jxchange/TPG/2008}FldId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FldText" type="{http://jackhenry.com/jxchange/TPG/2008}FldText_Type" minOccurs="0"/&gt;
 *         &lt;element name="FldVal" type="{http://jackhenry.com/jxchange/TPG/2008}FldVal_Type" minOccurs="0"/&gt;
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
@XmlType(name = "InstDefFldSrchRec_CType", propOrder = {
    "custId",
    "accountId",
    "instDefKey",
    "fldId",
    "fldText",
    "fldVal",
    "ver1",
    "any"
})
public class InstDefFldSrchRecCType {

    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "InstDefKey")
    protected InstDefKeyType instDefKey;
    @XmlElement(name = "FldId")
    protected FldIdType fldId;
    @XmlElement(name = "FldText")
    protected FldTextType fldText;
    @XmlElement(name = "FldVal")
    protected FldValType fldVal;
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
     * Gets the value of the instDefKey property.
     * 
     * @return
     *     possible object is
     *     {@link InstDefKeyType }
     *     
     */
    public InstDefKeyType getInstDefKey() {
        return instDefKey;
    }

    /**
     * Sets the value of the instDefKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstDefKeyType }
     *     
     */
    public void setInstDefKey(InstDefKeyType value) {
        this.instDefKey = value;
    }

    /**
     * Gets the value of the fldId property.
     * 
     * @return
     *     possible object is
     *     {@link FldIdType }
     *     
     */
    public FldIdType getFldId() {
        return fldId;
    }

    /**
     * Sets the value of the fldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FldIdType }
     *     
     */
    public void setFldId(FldIdType value) {
        this.fldId = value;
    }

    /**
     * Gets the value of the fldText property.
     * 
     * @return
     *     possible object is
     *     {@link FldTextType }
     *     
     */
    public FldTextType getFldText() {
        return fldText;
    }

    /**
     * Sets the value of the fldText property.
     * 
     * @param value
     *     allowed object is
     *     {@link FldTextType }
     *     
     */
    public void setFldText(FldTextType value) {
        this.fldText = value;
    }

    /**
     * Gets the value of the fldVal property.
     * 
     * @return
     *     possible object is
     *     {@link FldValType }
     *     
     */
    public FldValType getFldVal() {
        return fldVal;
    }

    /**
     * Sets the value of the fldVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FldValType }
     *     
     */
    public void setFldVal(FldValType value) {
        this.fldVal = value;
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
