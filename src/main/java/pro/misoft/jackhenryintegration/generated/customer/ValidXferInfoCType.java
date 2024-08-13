
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
 * <p>Java class for ValidXferInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidXferInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XferActType" type="{http://jackhenry.com/jxchange/TPG/2008}XferActType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctRelDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Rmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ValidXferInfo_CType", propOrder = {
    "xferActType",
    "accountId",
    "prodCode",
    "prodDesc",
    "acctRelCode",
    "acctRelDesc",
    "rmk",
    "ver1",
    "any"
})
public class ValidXferInfoCType {

    @XmlElement(name = "XferActType")
    protected XferActTypeType xferActType;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "ProdCode")
    protected ProdCodeType prodCode;
    @XmlElement(name = "ProdDesc")
    protected ProdDescType prodDesc;
    @XmlElement(name = "AcctRelCode")
    protected AcctRelCodeType acctRelCode;
    @XmlElement(name = "AcctRelDesc")
    protected AcctRelDescType acctRelDesc;
    @XmlElement(name = "Rmk")
    protected RmkType rmk;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the xferActType property.
     * 
     * @return
     *     possible object is
     *     {@link XferActTypeType }
     *     
     */
    public XferActTypeType getXferActType() {
        return xferActType;
    }

    /**
     * Sets the value of the xferActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferActTypeType }
     *     
     */
    public void setXferActType(XferActTypeType value) {
        this.xferActType = value;
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
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCodeType }
     *     
     */
    public ProdCodeType getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCodeType }
     *     
     */
    public void setProdCode(ProdCodeType value) {
        this.prodCode = value;
    }

    /**
     * Gets the value of the prodDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ProdDescType }
     *     
     */
    public ProdDescType getProdDesc() {
        return prodDesc;
    }

    /**
     * Sets the value of the prodDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdDescType }
     *     
     */
    public void setProdDesc(ProdDescType value) {
        this.prodDesc = value;
    }

    /**
     * Gets the value of the acctRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRelCodeType }
     *     
     */
    public AcctRelCodeType getAcctRelCode() {
        return acctRelCode;
    }

    /**
     * Sets the value of the acctRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRelCodeType }
     *     
     */
    public void setAcctRelCode(AcctRelCodeType value) {
        this.acctRelCode = value;
    }

    /**
     * Gets the value of the acctRelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRelDescType }
     *     
     */
    public AcctRelDescType getAcctRelDesc() {
        return acctRelDesc;
    }

    /**
     * Sets the value of the acctRelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRelDescType }
     *     
     */
    public void setAcctRelDesc(AcctRelDescType value) {
        this.acctRelDesc = value;
    }

    /**
     * Gets the value of the rmk property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getRmk() {
        return rmk;
    }

    /**
     * Sets the value of the rmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setRmk(RmkType value) {
        this.rmk = value;
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
