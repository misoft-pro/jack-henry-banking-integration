
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
 * <p>Java class for x_TimeDepInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_TimeDepInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeDepInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}AccrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PenAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PenAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctClsfDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctClsfDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastActDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastActDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PlnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="CondNotfArray" type="{http://jackhenry.com/jxchange/TPG/2008}CondNotfArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="SalesPersonDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SalesPersonDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ClsRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ClsRsnDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="BrandDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrandDesc_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
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
@XmlType(name = "x_TimeDepInfoRec_CType", propOrder = {
    "timeDepInfoRec",
    "timeDepAcctId",
    "personName",
    "curBal",
    "accrInt",
    "penAmt",
    "brDesc",
    "prodDesc",
    "acctStatDesc",
    "offDesc",
    "acctClsfDesc",
    "lastActDt",
    "plnDesc",
    "addr",
    "condNotfArray",
    "custom",
    "ver1",
    "salesPersonDesc",
    "ver2",
    "clsRsnDesc",
    "ver3",
    "brandDesc",
    "ver4",
    "any"
})
public class XTimeDepInfoRecCType {

    @XmlElement(name = "TimeDepInfoRec")
    protected TimeDepInfoRecCType timeDepInfoRec;
    @XmlElement(name = "TimeDepAcctId")
    protected AccountIdCType timeDepAcctId;
    @XmlElement(name = "PersonName", required = true)
    protected PersonNameCType personName;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "AccrInt")
    protected AccrIntType accrInt;
    @XmlElement(name = "PenAmt")
    protected PenAmtType penAmt;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "ProdDesc")
    protected ProdDescType prodDesc;
    @XmlElement(name = "AcctStatDesc")
    protected AcctStatDescType acctStatDesc;
    @XmlElement(name = "OffDesc")
    protected OffDescType offDesc;
    @XmlElement(name = "AcctClsfDesc")
    protected AcctClsfDescType acctClsfDesc;
    @XmlElement(name = "LastActDt")
    protected LastActDtType lastActDt;
    @XmlElement(name = "PlnDesc")
    protected PlnDescType plnDesc;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "CondNotfArray")
    protected CondNotfArrayAType condNotfArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "SalesPersonDesc")
    protected SalesPersonDescType salesPersonDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ClsRsnDesc")
    protected ClsRsnDescType clsRsnDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "BrandDesc")
    protected BrandDescType brandDesc;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the timeDepInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepInfoRecCType }
     *     
     */
    public TimeDepInfoRecCType getTimeDepInfoRec() {
        return timeDepInfoRec;
    }

    /**
     * Sets the value of the timeDepInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepInfoRecCType }
     *     
     */
    public void setTimeDepInfoRec(TimeDepInfoRecCType value) {
        this.timeDepInfoRec = value;
    }

    /**
     * Gets the value of the timeDepAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getTimeDepAcctId() {
        return timeDepAcctId;
    }

    /**
     * Sets the value of the timeDepAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setTimeDepAcctId(AccountIdCType value) {
        this.timeDepAcctId = value;
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
     * Gets the value of the accrInt property.
     * 
     * @return
     *     possible object is
     *     {@link AccrIntType }
     *     
     */
    public AccrIntType getAccrInt() {
        return accrInt;
    }

    /**
     * Sets the value of the accrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrIntType }
     *     
     */
    public void setAccrInt(AccrIntType value) {
        this.accrInt = value;
    }

    /**
     * Gets the value of the penAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PenAmtType }
     *     
     */
    public PenAmtType getPenAmt() {
        return penAmt;
    }

    /**
     * Sets the value of the penAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenAmtType }
     *     
     */
    public void setPenAmt(PenAmtType value) {
        this.penAmt = value;
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
     * Gets the value of the lastActDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastActDtType }
     *     
     */
    public LastActDtType getLastActDt() {
        return lastActDt;
    }

    /**
     * Sets the value of the lastActDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastActDtType }
     *     
     */
    public void setLastActDt(LastActDtType value) {
        this.lastActDt = value;
    }

    /**
     * Gets the value of the plnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PlnDescType }
     *     
     */
    public PlnDescType getPlnDesc() {
        return plnDesc;
    }

    /**
     * Sets the value of the plnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnDescType }
     *     
     */
    public void setPlnDesc(PlnDescType value) {
        this.plnDesc = value;
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
     * Gets the value of the salesPersonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SalesPersonDescType }
     *     
     */
    public SalesPersonDescType getSalesPersonDesc() {
        return salesPersonDesc;
    }

    /**
     * Sets the value of the salesPersonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesPersonDescType }
     *     
     */
    public void setSalesPersonDesc(SalesPersonDescType value) {
        this.salesPersonDesc = value;
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
     * Gets the value of the clsRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ClsRsnDescType }
     *     
     */
    public ClsRsnDescType getClsRsnDesc() {
        return clsRsnDesc;
    }

    /**
     * Sets the value of the clsRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsRsnDescType }
     *     
     */
    public void setClsRsnDesc(ClsRsnDescType value) {
        this.clsRsnDesc = value;
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
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
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
