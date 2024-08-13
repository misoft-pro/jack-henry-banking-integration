
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
 * <p>Java class for x_LnInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_LnInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}LnInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="LoanAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtPayOffAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayOffAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntBasisDesc" type="{http://jackhenry.com/jxchange/TPG/2008}IntBasisDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DailyAccrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}DailyAccrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurPayOff" type="{http://jackhenry.com/jxchange/TPG/2008}CurPayOff_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="AcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}AccrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CondNotfArray" type="{http://jackhenry.com/jxchange/TPG/2008}CondNotfArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AcctLvlSecDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctLvlSecDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ShortPmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ShortPmtDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="SalesPersonDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SalesPersonDesc_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="AdvaFeesCycleAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AdvaFeesCycleAmt_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="BrandDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrandDesc_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "x_LnInfoRec_CType", propOrder = {
    "lnInfoRec",
    "loanAcctId",
    "personName",
    "offDesc",
    "nxtPayOffAmt",
    "pmtCodeDesc",
    "intBasisDesc",
    "dailyAccrAmt",
    "curPayOff",
    "curBal",
    "brDesc",
    "addr",
    "acctStatDesc",
    "accrInt",
    "prodDesc",
    "condNotfArray",
    "custom",
    "ver1",
    "acctLvlSecDesc",
    "ver2",
    "shortPmtDesc",
    "ver3",
    "salesPersonDesc",
    "ver4",
    "advaFeesCycleAmt",
    "ver5",
    "brandDesc",
    "ver6",
    "any"
})
public class XLnInfoRecCType {

    @XmlElement(name = "LnInfoRec")
    protected LnInfoRecCType lnInfoRec;
    @XmlElement(name = "LoanAcctId")
    protected AccountIdCType loanAcctId;
    @XmlElement(name = "PersonName", required = true)
    protected PersonNameCType personName;
    @XmlElement(name = "OffDesc")
    protected OffDescType offDesc;
    @XmlElement(name = "NxtPayOffAmt")
    protected NxtPayOffAmtType nxtPayOffAmt;
    @XmlElement(name = "PmtCodeDesc")
    protected PmtCodeDescType pmtCodeDesc;
    @XmlElement(name = "IntBasisDesc")
    protected IntBasisDescType intBasisDesc;
    @XmlElement(name = "DailyAccrAmt")
    protected DailyAccrAmtType dailyAccrAmt;
    @XmlElement(name = "CurPayOff")
    protected CurPayOffType curPayOff;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "AcctStatDesc")
    protected AcctStatDescType acctStatDesc;
    @XmlElement(name = "AccrInt")
    protected AccrIntType accrInt;
    @XmlElement(name = "ProdDesc")
    protected ProdDescType prodDesc;
    @XmlElement(name = "CondNotfArray")
    protected CondNotfArrayAType condNotfArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AcctLvlSecDesc")
    protected AcctLvlSecDescType acctLvlSecDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ShortPmtDesc")
    protected ShortPmtDescType shortPmtDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "SalesPersonDesc")
    protected SalesPersonDescType salesPersonDesc;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "AdvaFeesCycleAmt")
    protected AdvaFeesCycleAmtType advaFeesCycleAmt;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "BrandDesc")
    protected BrandDescType brandDesc;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link LnInfoRecCType }
     *     
     */
    public LnInfoRecCType getLnInfoRec() {
        return lnInfoRec;
    }

    /**
     * Sets the value of the lnInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnInfoRecCType }
     *     
     */
    public void setLnInfoRec(LnInfoRecCType value) {
        this.lnInfoRec = value;
    }

    /**
     * Gets the value of the loanAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getLoanAcctId() {
        return loanAcctId;
    }

    /**
     * Sets the value of the loanAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setLoanAcctId(AccountIdCType value) {
        this.loanAcctId = value;
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
     * Gets the value of the nxtPayOffAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NxtPayOffAmtType }
     *     
     */
    public NxtPayOffAmtType getNxtPayOffAmt() {
        return nxtPayOffAmt;
    }

    /**
     * Sets the value of the nxtPayOffAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NxtPayOffAmtType }
     *     
     */
    public void setNxtPayOffAmt(NxtPayOffAmtType value) {
        this.nxtPayOffAmt = value;
    }

    /**
     * Gets the value of the pmtCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PmtCodeDescType }
     *     
     */
    public PmtCodeDescType getPmtCodeDesc() {
        return pmtCodeDesc;
    }

    /**
     * Sets the value of the pmtCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtCodeDescType }
     *     
     */
    public void setPmtCodeDesc(PmtCodeDescType value) {
        this.pmtCodeDesc = value;
    }

    /**
     * Gets the value of the intBasisDesc property.
     * 
     * @return
     *     possible object is
     *     {@link IntBasisDescType }
     *     
     */
    public IntBasisDescType getIntBasisDesc() {
        return intBasisDesc;
    }

    /**
     * Sets the value of the intBasisDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntBasisDescType }
     *     
     */
    public void setIntBasisDesc(IntBasisDescType value) {
        this.intBasisDesc = value;
    }

    /**
     * Gets the value of the dailyAccrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DailyAccrAmtType }
     *     
     */
    public DailyAccrAmtType getDailyAccrAmt() {
        return dailyAccrAmt;
    }

    /**
     * Sets the value of the dailyAccrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyAccrAmtType }
     *     
     */
    public void setDailyAccrAmt(DailyAccrAmtType value) {
        this.dailyAccrAmt = value;
    }

    /**
     * Gets the value of the curPayOff property.
     * 
     * @return
     *     possible object is
     *     {@link CurPayOffType }
     *     
     */
    public CurPayOffType getCurPayOff() {
        return curPayOff;
    }

    /**
     * Sets the value of the curPayOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurPayOffType }
     *     
     */
    public void setCurPayOff(CurPayOffType value) {
        this.curPayOff = value;
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
     * Gets the value of the acctLvlSecDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctLvlSecDescType }
     *     
     */
    public AcctLvlSecDescType getAcctLvlSecDesc() {
        return acctLvlSecDesc;
    }

    /**
     * Sets the value of the acctLvlSecDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctLvlSecDescType }
     *     
     */
    public void setAcctLvlSecDesc(AcctLvlSecDescType value) {
        this.acctLvlSecDesc = value;
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
     * Gets the value of the shortPmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ShortPmtDescType }
     *     
     */
    public ShortPmtDescType getShortPmtDesc() {
        return shortPmtDesc;
    }

    /**
     * Sets the value of the shortPmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortPmtDescType }
     *     
     */
    public void setShortPmtDesc(ShortPmtDescType value) {
        this.shortPmtDesc = value;
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
     * Gets the value of the advaFeesCycleAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AdvaFeesCycleAmtType }
     *     
     */
    public AdvaFeesCycleAmtType getAdvaFeesCycleAmt() {
        return advaFeesCycleAmt;
    }

    /**
     * Sets the value of the advaFeesCycleAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvaFeesCycleAmtType }
     *     
     */
    public void setAdvaFeesCycleAmt(AdvaFeesCycleAmtType value) {
        this.advaFeesCycleAmt = value;
    }

    /**
     * Gets the value of the ver5 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver5CType }
     *     
     */
    public Ver5CType getVer5() {
        return ver5;
    }

    /**
     * Sets the value of the ver5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver5CType }
     *     
     */
    public void setVer5(Ver5CType value) {
        this.ver5 = value;
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
     * Gets the value of the ver6 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver6CType }
     *     
     */
    public Ver6CType getVer6() {
        return ver6;
    }

    /**
     * Sets the value of the ver6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver6CType }
     *     
     */
    public void setVer6(Ver6CType value) {
        this.ver6 = value;
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
