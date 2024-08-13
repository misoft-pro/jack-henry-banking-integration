
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
 * <p>Java class for SafeDepInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafeDepInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PastDueAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PastDueAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurDueAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CurDueAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LateChgDueAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgDueAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RentAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RentAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctClsfCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctClsfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPayDt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ARGOProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ARGOProdCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctTitleArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_AType" minOccurs="0"/&gt;
 *           &lt;element name="SafeDepBoxRef" type="{http://jackhenry.com/jxchange/TPG/2008}SafeDepBoxRef_Type" minOccurs="0"/&gt;
 *           &lt;element name="SalesTaxDueAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SalesTaxDueAmt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AliasCustName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="BrandCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrandCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "SafeDepInfoRec_CType", propOrder = {
    "pastDueAmt",
    "curDueAmt",
    "lateChgDueAmt",
    "rentAmt",
    "brCode",
    "prodCode",
    "acctStat",
    "offCode",
    "acctClsfCode",
    "nxtPayDt",
    "lastPayDt",
    "ver1",
    "argoProdCode",
    "custId",
    "acctTitleArray",
    "safeDepBoxRef",
    "salesTaxDueAmt",
    "ver2",
    "aliasCustName",
    "ver3",
    "brandCode",
    "ver4",
    "any"
})
public class SafeDepInfoRecCType {

    @XmlElement(name = "PastDueAmt")
    protected PastDueAmtType pastDueAmt;
    @XmlElement(name = "CurDueAmt")
    protected CurDueAmtType curDueAmt;
    @XmlElement(name = "LateChgDueAmt")
    protected LateChgDueAmtType lateChgDueAmt;
    @XmlElement(name = "RentAmt")
    protected RentAmtType rentAmt;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "ProdCode")
    protected ProdCodeType prodCode;
    @XmlElement(name = "AcctStat")
    protected AcctStatType acctStat;
    @XmlElement(name = "OffCode")
    protected OffCodeType offCode;
    @XmlElement(name = "AcctClsfCode")
    protected AcctClsfCodeType acctClsfCode;
    @XmlElement(name = "NxtPayDt")
    protected NxtPayDtType nxtPayDt;
    @XmlElement(name = "LastPayDt")
    protected LastPayDtType lastPayDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ARGOProdCode")
    protected ARGOProdCodeType argoProdCode;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "AcctTitleArray")
    protected AcctTitleAType acctTitleArray;
    @XmlElement(name = "SafeDepBoxRef")
    protected SafeDepBoxRefType safeDepBoxRef;
    @XmlElement(name = "SalesTaxDueAmt")
    protected SalesTaxDueAmtType salesTaxDueAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "AliasCustName")
    protected PersonNameCType aliasCustName;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "BrandCode")
    protected BrandCodeType brandCode;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pastDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PastDueAmtType }
     *     
     */
    public PastDueAmtType getPastDueAmt() {
        return pastDueAmt;
    }

    /**
     * Sets the value of the pastDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDueAmtType }
     *     
     */
    public void setPastDueAmt(PastDueAmtType value) {
        this.pastDueAmt = value;
    }

    /**
     * Gets the value of the curDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurDueAmtType }
     *     
     */
    public CurDueAmtType getCurDueAmt() {
        return curDueAmt;
    }

    /**
     * Sets the value of the curDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurDueAmtType }
     *     
     */
    public void setCurDueAmt(CurDueAmtType value) {
        this.curDueAmt = value;
    }

    /**
     * Gets the value of the lateChgDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LateChgDueAmtType }
     *     
     */
    public LateChgDueAmtType getLateChgDueAmt() {
        return lateChgDueAmt;
    }

    /**
     * Sets the value of the lateChgDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LateChgDueAmtType }
     *     
     */
    public void setLateChgDueAmt(LateChgDueAmtType value) {
        this.lateChgDueAmt = value;
    }

    /**
     * Gets the value of the rentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RentAmtType }
     *     
     */
    public RentAmtType getRentAmt() {
        return rentAmt;
    }

    /**
     * Sets the value of the rentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentAmtType }
     *     
     */
    public void setRentAmt(RentAmtType value) {
        this.rentAmt = value;
    }

    /**
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setBrCode(BrCodeType value) {
        this.brCode = value;
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
     * Gets the value of the acctStat property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatType }
     *     
     */
    public AcctStatType getAcctStat() {
        return acctStat;
    }

    /**
     * Sets the value of the acctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatType }
     *     
     */
    public void setAcctStat(AcctStatType value) {
        this.acctStat = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setOffCode(OffCodeType value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the acctClsfCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctClsfCodeType }
     *     
     */
    public AcctClsfCodeType getAcctClsfCode() {
        return acctClsfCode;
    }

    /**
     * Sets the value of the acctClsfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctClsfCodeType }
     *     
     */
    public void setAcctClsfCode(AcctClsfCodeType value) {
        this.acctClsfCode = value;
    }

    /**
     * Gets the value of the nxtPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link NxtPayDtType }
     *     
     */
    public NxtPayDtType getNxtPayDt() {
        return nxtPayDt;
    }

    /**
     * Sets the value of the nxtPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NxtPayDtType }
     *     
     */
    public void setNxtPayDt(NxtPayDtType value) {
        this.nxtPayDt = value;
    }

    /**
     * Gets the value of the lastPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastPayDtType }
     *     
     */
    public LastPayDtType getLastPayDt() {
        return lastPayDt;
    }

    /**
     * Sets the value of the lastPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPayDtType }
     *     
     */
    public void setLastPayDt(LastPayDtType value) {
        this.lastPayDt = value;
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
     * Gets the value of the argoProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link ARGOProdCodeType }
     *     
     */
    public ARGOProdCodeType getARGOProdCode() {
        return argoProdCode;
    }

    /**
     * Sets the value of the argoProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARGOProdCodeType }
     *     
     */
    public void setARGOProdCode(ARGOProdCodeType value) {
        this.argoProdCode = value;
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
     * Gets the value of the safeDepBoxRef property.
     * 
     * @return
     *     possible object is
     *     {@link SafeDepBoxRefType }
     *     
     */
    public SafeDepBoxRefType getSafeDepBoxRef() {
        return safeDepBoxRef;
    }

    /**
     * Sets the value of the safeDepBoxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeDepBoxRefType }
     *     
     */
    public void setSafeDepBoxRef(SafeDepBoxRefType value) {
        this.safeDepBoxRef = value;
    }

    /**
     * Gets the value of the salesTaxDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxDueAmtType }
     *     
     */
    public SalesTaxDueAmtType getSalesTaxDueAmt() {
        return salesTaxDueAmt;
    }

    /**
     * Sets the value of the salesTaxDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxDueAmtType }
     *     
     */
    public void setSalesTaxDueAmt(SalesTaxDueAmtType value) {
        this.salesTaxDueAmt = value;
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
     * Gets the value of the aliasCustName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getAliasCustName() {
        return aliasCustName;
    }

    /**
     * Sets the value of the aliasCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setAliasCustName(PersonNameCType value) {
        this.aliasCustName = value;
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
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrandCodeType }
     *     
     */
    public BrandCodeType getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandCodeType }
     *     
     */
    public void setBrandCode(BrandCodeType value) {
        this.brandCode = value;
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
