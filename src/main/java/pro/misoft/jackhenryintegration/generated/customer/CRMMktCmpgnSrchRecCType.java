
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
 * <p>Java class for CRMMktCmpgnSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMMktCmpgnSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMMktCmpgnInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CRMMktCmpgnInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="MktCmpgnId" type="{http://jackhenry.com/jxchange/TPG/2008}MktCmpgnId_Type" minOccurs="0"/&gt;
 *         &lt;element name="MktCmpgnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MktCmpgnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMMktCmpgnSrchCustom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "CRMMktCmpgnSrchRec_CType", propOrder = {
    "crmMktCmpgnInfoRec",
    "accountId",
    "taxId",
    "custId",
    "mktCmpgnId",
    "mktCmpgnDesc",
    "crmMktCmpgnSrchCustom",
    "ver1",
    "any"
})
public class CRMMktCmpgnSrchRecCType {

    @XmlElement(name = "CRMMktCmpgnInfoRec")
    protected CRMMktCmpgnInfoRecCType crmMktCmpgnInfoRec;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "MktCmpgnId")
    protected MktCmpgnIdType mktCmpgnId;
    @XmlElement(name = "MktCmpgnDesc")
    protected MktCmpgnDescType mktCmpgnDesc;
    @XmlElement(name = "CRMMktCmpgnSrchCustom")
    protected CustomCType crmMktCmpgnSrchCustom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crmMktCmpgnInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link CRMMktCmpgnInfoRecCType }
     *     
     */
    public CRMMktCmpgnInfoRecCType getCRMMktCmpgnInfoRec() {
        return crmMktCmpgnInfoRec;
    }

    /**
     * Sets the value of the crmMktCmpgnInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMMktCmpgnInfoRecCType }
     *     
     */
    public void setCRMMktCmpgnInfoRec(CRMMktCmpgnInfoRecCType value) {
        this.crmMktCmpgnInfoRec = value;
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
     * Gets the value of the mktCmpgnId property.
     * 
     * @return
     *     possible object is
     *     {@link MktCmpgnIdType }
     *     
     */
    public MktCmpgnIdType getMktCmpgnId() {
        return mktCmpgnId;
    }

    /**
     * Sets the value of the mktCmpgnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MktCmpgnIdType }
     *     
     */
    public void setMktCmpgnId(MktCmpgnIdType value) {
        this.mktCmpgnId = value;
    }

    /**
     * Gets the value of the mktCmpgnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MktCmpgnDescType }
     *     
     */
    public MktCmpgnDescType getMktCmpgnDesc() {
        return mktCmpgnDesc;
    }

    /**
     * Sets the value of the mktCmpgnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MktCmpgnDescType }
     *     
     */
    public void setMktCmpgnDesc(MktCmpgnDescType value) {
        this.mktCmpgnDesc = value;
    }

    /**
     * Gets the value of the crmMktCmpgnSrchCustom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCRMMktCmpgnSrchCustom() {
        return crmMktCmpgnSrchCustom;
    }

    /**
     * Sets the value of the crmMktCmpgnSrchCustom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCRMMktCmpgnSrchCustom(CustomCType value) {
        this.crmMktCmpgnSrchCustom = value;
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
