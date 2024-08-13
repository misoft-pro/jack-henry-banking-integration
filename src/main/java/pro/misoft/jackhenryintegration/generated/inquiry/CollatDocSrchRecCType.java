
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
 * <p>Java class for CollatDocSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollatDocSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollatDocRec" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatItemKey" type="{http://jackhenry.com/jxchange/TPG/2008}CollatItemKey_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocKey" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocKey_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocBrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocLocDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocLocDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocPrvStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocPrvStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomCollatDocSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CollatDocInstDefKey" type="{http://jackhenry.com/jxchange/TPG/2008}InstDefKey_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CollatDocSrchRec_CType", propOrder = {
    "collatDocRec",
    "accountId",
    "custId",
    "collatItemKey",
    "collatDocKey",
    "collatDocBrDesc",
    "collatDocDesc",
    "collatDocLocDesc",
    "collatDocPrvStatDesc",
    "collatDocStatDesc",
    "collatDocOffDesc",
    "customCollatDocSrchRec",
    "ver1",
    "collatDocInstDefKey",
    "ver2",
    "any"
})
public class CollatDocSrchRecCType {

    @XmlElement(name = "CollatDocRec")
    protected CollatDocRecCType collatDocRec;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "CollatItemKey")
    protected CollatItemKeyType collatItemKey;
    @XmlElement(name = "CollatDocKey")
    protected CollatDocKeyType collatDocKey;
    @XmlElement(name = "CollatDocBrDesc")
    protected BrDescType collatDocBrDesc;
    @XmlElement(name = "CollatDocDesc")
    protected CollatDocDescType collatDocDesc;
    @XmlElement(name = "CollatDocLocDesc")
    protected CollatDocLocDescType collatDocLocDesc;
    @XmlElement(name = "CollatDocPrvStatDesc")
    protected CollatDocPrvStatDescType collatDocPrvStatDesc;
    @XmlElement(name = "CollatDocStatDesc")
    protected CollatDocStatDescType collatDocStatDesc;
    @XmlElement(name = "CollatDocOffDesc")
    protected OffDescType collatDocOffDesc;
    @XmlElement(name = "CustomCollatDocSrchRec")
    protected CustomCType customCollatDocSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CollatDocInstDefKey")
    protected InstDefKeyType collatDocInstDefKey;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the collatDocRec property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDocRecCType }
     *     
     */
    public CollatDocRecCType getCollatDocRec() {
        return collatDocRec;
    }

    /**
     * Sets the value of the collatDocRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDocRecCType }
     *     
     */
    public void setCollatDocRec(CollatDocRecCType value) {
        this.collatDocRec = value;
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
     * Gets the value of the collatItemKey property.
     * 
     * @return
     *     possible object is
     *     {@link CollatItemKeyType }
     *     
     */
    public CollatItemKeyType getCollatItemKey() {
        return collatItemKey;
    }

    /**
     * Sets the value of the collatItemKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatItemKeyType }
     *     
     */
    public void setCollatItemKey(CollatItemKeyType value) {
        this.collatItemKey = value;
    }

    /**
     * Gets the value of the collatDocKey property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDocKeyType }
     *     
     */
    public CollatDocKeyType getCollatDocKey() {
        return collatDocKey;
    }

    /**
     * Sets the value of the collatDocKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDocKeyType }
     *     
     */
    public void setCollatDocKey(CollatDocKeyType value) {
        this.collatDocKey = value;
    }

    /**
     * Gets the value of the collatDocBrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getCollatDocBrDesc() {
        return collatDocBrDesc;
    }

    /**
     * Sets the value of the collatDocBrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setCollatDocBrDesc(BrDescType value) {
        this.collatDocBrDesc = value;
    }

    /**
     * Gets the value of the collatDocDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDocDescType }
     *     
     */
    public CollatDocDescType getCollatDocDesc() {
        return collatDocDesc;
    }

    /**
     * Sets the value of the collatDocDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDocDescType }
     *     
     */
    public void setCollatDocDesc(CollatDocDescType value) {
        this.collatDocDesc = value;
    }

    /**
     * Gets the value of the collatDocLocDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDocLocDescType }
     *     
     */
    public CollatDocLocDescType getCollatDocLocDesc() {
        return collatDocLocDesc;
    }

    /**
     * Sets the value of the collatDocLocDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDocLocDescType }
     *     
     */
    public void setCollatDocLocDesc(CollatDocLocDescType value) {
        this.collatDocLocDesc = value;
    }

    /**
     * Gets the value of the collatDocPrvStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDocPrvStatDescType }
     *     
     */
    public CollatDocPrvStatDescType getCollatDocPrvStatDesc() {
        return collatDocPrvStatDesc;
    }

    /**
     * Sets the value of the collatDocPrvStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDocPrvStatDescType }
     *     
     */
    public void setCollatDocPrvStatDesc(CollatDocPrvStatDescType value) {
        this.collatDocPrvStatDesc = value;
    }

    /**
     * Gets the value of the collatDocStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDocStatDescType }
     *     
     */
    public CollatDocStatDescType getCollatDocStatDesc() {
        return collatDocStatDesc;
    }

    /**
     * Sets the value of the collatDocStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDocStatDescType }
     *     
     */
    public void setCollatDocStatDesc(CollatDocStatDescType value) {
        this.collatDocStatDesc = value;
    }

    /**
     * Gets the value of the collatDocOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getCollatDocOffDesc() {
        return collatDocOffDesc;
    }

    /**
     * Sets the value of the collatDocOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setCollatDocOffDesc(OffDescType value) {
        this.collatDocOffDesc = value;
    }

    /**
     * Gets the value of the customCollatDocSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomCollatDocSrchRec() {
        return customCollatDocSrchRec;
    }

    /**
     * Sets the value of the customCollatDocSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomCollatDocSrchRec(CustomCType value) {
        this.customCollatDocSrchRec = value;
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
     * Gets the value of the collatDocInstDefKey property.
     * 
     * @return
     *     possible object is
     *     {@link InstDefKeyType }
     *     
     */
    public InstDefKeyType getCollatDocInstDefKey() {
        return collatDocInstDefKey;
    }

    /**
     * Sets the value of the collatDocInstDefKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstDefKeyType }
     *     
     */
    public void setCollatDocInstDefKey(InstDefKeyType value) {
        this.collatDocInstDefKey = value;
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
