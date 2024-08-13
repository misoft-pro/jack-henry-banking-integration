
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
 * <p>Java class for x_DepInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_DepInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}DepInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType"/&gt;
 *         &lt;element name="AvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}AvlBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColBal" type="{http://jackhenry.com/jxchange/TPG/2008}ColBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctClsfDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctClsfDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastActDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastActDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntBearAcct" type="{http://jackhenry.com/jxchange/TPG/2008}IntBearAcct_Type" minOccurs="0"/&gt;
 *         &lt;element name="TellerSICDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TellerSICDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SigVerifyDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SigVerifyDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="CondNotfArray" type="{http://jackhenry.com/jxchange/TPG/2008}CondNotfArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="SerChgWavRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgWavRsnDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AvlBalCalcCode" type="{http://jackhenry.com/jxchange/TPG/2008}AvlBalCalcCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="AvlBalCalcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AvlBalCalcDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="SalesPersonDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SalesPersonDesc_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="AvlCashBal" type="{http://jackhenry.com/jxchange/TPG/2008}AvlCashBal_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="ClsRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ClsRsnDesc_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="BrandDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrandDesc_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                     &lt;/sequence&gt;
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
@XmlType(name = "x_DepInfoRec_CType", propOrder = {
    "depInfoRec",
    "depAcctId",
    "personName",
    "avlBal",
    "curBal",
    "colBal",
    "brDesc",
    "prodDesc",
    "acctStatDesc",
    "offDesc",
    "acctClsfDesc",
    "lastActDt",
    "intBearAcct",
    "tellerSICDesc",
    "sigVerifyDesc",
    "addr",
    "condNotfArray",
    "custom",
    "ver1",
    "serChgWavRsnDesc",
    "ver2",
    "avlBalCalcCode",
    "avlBalCalcDesc",
    "ver3",
    "salesPersonDesc",
    "ver4",
    "avlCashBal",
    "ver5",
    "clsRsnDesc",
    "ver6",
    "brandDesc",
    "ver7",
    "any"
})
public class XDepInfoRecCType {

    @XmlElement(name = "DepInfoRec")
    protected DepInfoRecCType depInfoRec;
    @XmlElement(name = "DepAcctId")
    protected AccountIdCType depAcctId;
    @XmlElement(name = "PersonName", required = true)
    protected PersonNameCType personName;
    @XmlElement(name = "AvlBal")
    protected AvlBalType avlBal;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "ColBal")
    protected ColBalType colBal;
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
    @XmlElement(name = "IntBearAcct")
    protected IntBearAcctType intBearAcct;
    @XmlElement(name = "TellerSICDesc")
    protected TellerSICDescType tellerSICDesc;
    @XmlElement(name = "SigVerifyDesc")
    protected SigVerifyDescType sigVerifyDesc;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "CondNotfArray")
    protected CondNotfArrayAType condNotfArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "SerChgWavRsnDesc")
    protected SerChgWavRsnDescType serChgWavRsnDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "AvlBalCalcCode")
    protected AvlBalCalcCodeType avlBalCalcCode;
    @XmlElement(name = "AvlBalCalcDesc")
    protected AvlBalCalcDescType avlBalCalcDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "SalesPersonDesc")
    protected SalesPersonDescType salesPersonDesc;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "AvlCashBal")
    protected AvlCashBalType avlCashBal;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "ClsRsnDesc")
    protected ClsRsnDescType clsRsnDesc;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "BrandDesc")
    protected BrandDescType brandDesc;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the depInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link DepInfoRecCType }
     *     
     */
    public DepInfoRecCType getDepInfoRec() {
        return depInfoRec;
    }

    /**
     * Sets the value of the depInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepInfoRecCType }
     *     
     */
    public void setDepInfoRec(DepInfoRecCType value) {
        this.depInfoRec = value;
    }

    /**
     * Gets the value of the depAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getDepAcctId() {
        return depAcctId;
    }

    /**
     * Sets the value of the depAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setDepAcctId(AccountIdCType value) {
        this.depAcctId = value;
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
     * Gets the value of the avlBal property.
     * 
     * @return
     *     possible object is
     *     {@link AvlBalType }
     *     
     */
    public AvlBalType getAvlBal() {
        return avlBal;
    }

    /**
     * Sets the value of the avlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvlBalType }
     *     
     */
    public void setAvlBal(AvlBalType value) {
        this.avlBal = value;
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
     * Gets the value of the colBal property.
     * 
     * @return
     *     possible object is
     *     {@link ColBalType }
     *     
     */
    public ColBalType getColBal() {
        return colBal;
    }

    /**
     * Sets the value of the colBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColBalType }
     *     
     */
    public void setColBal(ColBalType value) {
        this.colBal = value;
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
     * Gets the value of the intBearAcct property.
     * 
     * @return
     *     possible object is
     *     {@link IntBearAcctType }
     *     
     */
    public IntBearAcctType getIntBearAcct() {
        return intBearAcct;
    }

    /**
     * Sets the value of the intBearAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntBearAcctType }
     *     
     */
    public void setIntBearAcct(IntBearAcctType value) {
        this.intBearAcct = value;
    }

    /**
     * Gets the value of the tellerSICDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TellerSICDescType }
     *     
     */
    public TellerSICDescType getTellerSICDesc() {
        return tellerSICDesc;
    }

    /**
     * Sets the value of the tellerSICDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TellerSICDescType }
     *     
     */
    public void setTellerSICDesc(TellerSICDescType value) {
        this.tellerSICDesc = value;
    }

    /**
     * Gets the value of the sigVerifyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SigVerifyDescType }
     *     
     */
    public SigVerifyDescType getSigVerifyDesc() {
        return sigVerifyDesc;
    }

    /**
     * Sets the value of the sigVerifyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigVerifyDescType }
     *     
     */
    public void setSigVerifyDesc(SigVerifyDescType value) {
        this.sigVerifyDesc = value;
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
     * Gets the value of the serChgWavRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgWavRsnDescType }
     *     
     */
    public SerChgWavRsnDescType getSerChgWavRsnDesc() {
        return serChgWavRsnDesc;
    }

    /**
     * Sets the value of the serChgWavRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgWavRsnDescType }
     *     
     */
    public void setSerChgWavRsnDesc(SerChgWavRsnDescType value) {
        this.serChgWavRsnDesc = value;
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
     * Gets the value of the avlBalCalcCode property.
     * 
     * @return
     *     possible object is
     *     {@link AvlBalCalcCodeType }
     *     
     */
    public AvlBalCalcCodeType getAvlBalCalcCode() {
        return avlBalCalcCode;
    }

    /**
     * Sets the value of the avlBalCalcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvlBalCalcCodeType }
     *     
     */
    public void setAvlBalCalcCode(AvlBalCalcCodeType value) {
        this.avlBalCalcCode = value;
    }

    /**
     * Gets the value of the avlBalCalcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AvlBalCalcDescType }
     *     
     */
    public AvlBalCalcDescType getAvlBalCalcDesc() {
        return avlBalCalcDesc;
    }

    /**
     * Sets the value of the avlBalCalcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvlBalCalcDescType }
     *     
     */
    public void setAvlBalCalcDesc(AvlBalCalcDescType value) {
        this.avlBalCalcDesc = value;
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
     * Gets the value of the avlCashBal property.
     * 
     * @return
     *     possible object is
     *     {@link AvlCashBalType }
     *     
     */
    public AvlCashBalType getAvlCashBal() {
        return avlCashBal;
    }

    /**
     * Sets the value of the avlCashBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvlCashBalType }
     *     
     */
    public void setAvlCashBal(AvlCashBalType value) {
        this.avlCashBal = value;
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
     * Gets the value of the ver7 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver7CType }
     *     
     */
    public Ver7CType getVer7() {
        return ver7;
    }

    /**
     * Sets the value of the ver7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver7CType }
     *     
     */
    public void setVer7(Ver7CType value) {
        this.ver7 = value;
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
