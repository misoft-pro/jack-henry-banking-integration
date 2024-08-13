
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
 * <p>Java class for x_SafeDepInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_SafeDepInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SafeDepInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}SafeDepInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="SafeDepAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctTitleArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_AType" minOccurs="0"/&gt;
 *         &lt;element name="ProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctClsfDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctClsfDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="CondNotfArray" type="{http://jackhenry.com/jxchange/TPG/2008}CondNotfArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ARGOProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ARGOProdDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="BrandDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrandDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
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
@XmlType(name = "x_SafeDepInfoRec_CType", propOrder = {
    "safeDepInfoRec",
    "safeDepAcctId",
    "personName",
    "brDesc",
    "acctTitleArray",
    "prodDesc",
    "acctStatDesc",
    "offDesc",
    "acctClsfDesc",
    "addr",
    "condNotfArray",
    "custom",
    "ver1",
    "argoProdDesc",
    "ver2",
    "brandDesc",
    "ver3",
    "any"
})
public class XSafeDepInfoRecCType {

    @XmlElement(name = "SafeDepInfoRec")
    protected SafeDepInfoRecCType safeDepInfoRec;
    @XmlElement(name = "SafeDepAcctId")
    protected AccountIdCType safeDepAcctId;
    @XmlElement(name = "PersonName", required = true)
    protected PersonNameCType personName;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "AcctTitleArray")
    protected AcctTitleAType acctTitleArray;
    @XmlElement(name = "ProdDesc")
    protected ProdDescType prodDesc;
    @XmlElement(name = "AcctStatDesc")
    protected AcctStatDescType acctStatDesc;
    @XmlElement(name = "OffDesc")
    protected OffDescType offDesc;
    @XmlElement(name = "AcctClsfDesc")
    protected AcctClsfDescType acctClsfDesc;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "CondNotfArray")
    protected CondNotfArrayAType condNotfArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ARGOProdDesc")
    protected ARGOProdDescType argoProdDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "BrandDesc")
    protected BrandDescType brandDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the safeDepInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link SafeDepInfoRecCType }
     *     
     */
    public SafeDepInfoRecCType getSafeDepInfoRec() {
        return safeDepInfoRec;
    }

    /**
     * Sets the value of the safeDepInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeDepInfoRecCType }
     *     
     */
    public void setSafeDepInfoRec(SafeDepInfoRecCType value) {
        this.safeDepInfoRec = value;
    }

    /**
     * Gets the value of the safeDepAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getSafeDepAcctId() {
        return safeDepAcctId;
    }

    /**
     * Sets the value of the safeDepAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setSafeDepAcctId(AccountIdCType value) {
        this.safeDepAcctId = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setPersonName(PersonNameCType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the brDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getBrDesc() {
        return brDesc;
    }

    /**
     * Sets the value of the brDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setBrDesc(BrDescType value) {
        this.brDesc = value;
    }

    /**
     * Gets the value of the acctTitleArray property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTitleAType }
     *     
     */
    public AcctTitleAType getAcctTitleArray() {
        return acctTitleArray;
    }

    /**
     * Sets the value of the acctTitleArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTitleAType }
     *     
     */
    public void setAcctTitleArray(AcctTitleAType value) {
        this.acctTitleArray = value;
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
     * Gets the value of the acctClsfDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctClsfDescType }
     *     
     */
    public AcctClsfDescType getAcctClsfDesc() {
        return acctClsfDesc;
    }

    /**
     * Sets the value of the acctClsfDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctClsfDescType }
     *     
     */
    public void setAcctClsfDesc(AcctClsfDescType value) {
        this.acctClsfDesc = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setAddr(AddrCType value) {
        this.addr = value;
    }

    /**
     * Gets the value of the condNotfArray property.
     * 
     * @return
     *     possible object is
     *     {@link CondNotfArrayAType }
     *     
     */
    public CondNotfArrayAType getCondNotfArray() {
        return condNotfArray;
    }

    /**
     * Sets the value of the condNotfArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CondNotfArrayAType }
     *     
     */
    public void setCondNotfArray(CondNotfArrayAType value) {
        this.condNotfArray = value;
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
     * Gets the value of the argoProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ARGOProdDescType }
     *     
     */
    public ARGOProdDescType getARGOProdDesc() {
        return argoProdDesc;
    }

    /**
     * Sets the value of the argoProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARGOProdDescType }
     *     
     */
    public void setARGOProdDesc(ARGOProdDescType value) {
        this.argoProdDesc = value;
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
     * Gets the value of the brandDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrandDescType }
     *     
     */
    public BrandDescType getBrandDesc() {
        return brandDesc;
    }

    /**
     * Sets the value of the brandDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandDescType }
     *     
     */
    public void setBrandDesc(BrandDescType value) {
        this.brandDesc = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
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
