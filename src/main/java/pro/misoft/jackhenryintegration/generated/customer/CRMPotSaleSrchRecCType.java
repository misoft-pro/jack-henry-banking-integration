
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CRMPotSaleSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMPotSaleSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMPotSaleInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CRMPotSaleInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PotSaleId" type="{http://jackhenry.com/jxchange/TPG/2008}PotSaleId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PotSaleDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PotSaleDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMPotSaleSrchCustom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMPotSaleSrchRec_CType", propOrder = {
    "crmPotSaleInfoRec",
    "accountId",
    "taxId",
    "custId",
    "potSaleId",
    "potSaleDesc",
    "crmPotSaleSrchCustom",
    "ver1",
    "any"
})
public class CRMPotSaleSrchRecCType {

    @XmlElement(name = "CRMPotSaleInfoRec")
    protected CRMPotSaleInfoRecCType crmPotSaleInfoRec;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "PotSaleId")
    protected PotSaleIdType potSaleId;
    @XmlElement(name = "PotSaleDesc")
    protected PotSaleDescType potSaleDesc;
    @XmlElement(name = "CRMPotSaleSrchCustom")
    protected CustomCType crmPotSaleSrchCustom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the crmPotSaleInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link CRMPotSaleInfoRecCType }
     *     
     */
    public CRMPotSaleInfoRecCType getCRMPotSaleInfoRec() {
        return crmPotSaleInfoRec;
    }

    /**
     * Sets the value of the crmPotSaleInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMPotSaleInfoRecCType }
     *     
     */
    public void setCRMPotSaleInfoRec(CRMPotSaleInfoRecCType value) {
        this.crmPotSaleInfoRec = value;
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
     * Gets the value of the potSaleId property.
     * 
     * @return
     *     possible object is
     *     {@link PotSaleIdType }
     *     
     */
    public PotSaleIdType getPotSaleId() {
        return potSaleId;
    }

    /**
     * Sets the value of the potSaleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotSaleIdType }
     *     
     */
    public void setPotSaleId(PotSaleIdType value) {
        this.potSaleId = value;
    }

    /**
     * Gets the value of the potSaleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PotSaleDescType }
     *     
     */
    public PotSaleDescType getPotSaleDesc() {
        return potSaleDesc;
    }

    /**
     * Sets the value of the potSaleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotSaleDescType }
     *     
     */
    public void setPotSaleDesc(PotSaleDescType value) {
        this.potSaleDesc = value;
    }

    /**
     * Gets the value of the crmPotSaleSrchCustom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCRMPotSaleSrchCustom() {
        return crmPotSaleSrchCustom;
    }

    /**
     * Sets the value of the crmPotSaleSrchCustom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCRMPotSaleSrchCustom(CustomCType value) {
        this.crmPotSaleSrchCustom = value;
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

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
