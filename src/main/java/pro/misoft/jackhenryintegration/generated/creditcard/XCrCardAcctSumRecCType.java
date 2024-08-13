
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for x_CrCardAcctSumRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_CrCardAcctSumRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCardProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvailCr" type="{http://jackhenry.com/jxchange/TPG/2008}AvailCr_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MinPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastStmtBal" type="{http://jackhenry.com/jxchange/TPG/2008}LastStmtBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastStmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastStmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardRwrdArray" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardRwrdArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AuthUsrCrCardArray" type="{http://jackhenry.com/jxchange/TPG/2008}AuthUsrCrCardArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="RemMinPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RemMinPmtAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_CrCardAcctSumRec_CType", propOrder = {
    "crCardProdDesc",
    "nxtPayDt",
    "curBal",
    "acctStat",
    "acctStatDesc",
    "locLmt",
    "availCr",
    "minPmtAmt",
    "lastStmtBal",
    "lastStmtDt",
    "lastPmtAmt",
    "lastPmtDt",
    "crCardRwrdArray",
    "custom",
    "ver1",
    "authUsrCrCardArray",
    "ver2",
    "remMinPmtAmt",
    "ver3",
    "any"
})
public class XCrCardAcctSumRecCType {

    @XmlElement(name = "CrCardProdDesc")
    protected CrCardProdDescType crCardProdDesc;
    @XmlElement(name = "NxtPayDt")
    protected NxtPayDtType nxtPayDt;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "AcctStat")
    protected AcctStatType acctStat;
    @XmlElement(name = "AcctStatDesc")
    protected AcctStatDescType acctStatDesc;
    @XmlElement(name = "LOCLmt")
    protected LOCLmtType locLmt;
    @XmlElement(name = "AvailCr")
    protected AvailCrType availCr;
    @XmlElement(name = "MinPmtAmt")
    protected MinPmtAmtType minPmtAmt;
    @XmlElement(name = "LastStmtBal")
    protected LastStmtBalType lastStmtBal;
    @XmlElement(name = "LastStmtDt")
    protected LastStmtDtType lastStmtDt;
    @XmlElement(name = "LastPmtAmt")
    protected LastPmtAmtType lastPmtAmt;
    @XmlElement(name = "LastPmtDt")
    protected LastPmtDtType lastPmtDt;
    @XmlElement(name = "CrCardRwrdArray")
    protected CrCardRwrdArrayAType crCardRwrdArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AuthUsrCrCardArray")
    protected AuthUsrCrCardArrayAType authUsrCrCardArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "RemMinPmtAmt")
    protected RemMinPmtAmtType remMinPmtAmt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crCardProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardProdDescType }
     *     
     */
    public CrCardProdDescType getCrCardProdDesc() {
        return crCardProdDesc;
    }

    /**
     * Sets the value of the crCardProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardProdDescType }
     *     
     */
    public void setCrCardProdDesc(CrCardProdDescType value) {
        this.crCardProdDesc = value;
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
     * Gets the value of the locLmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCLmtType }
     *     
     */
    public LOCLmtType getLOCLmt() {
        return locLmt;
    }

    /**
     * Sets the value of the locLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCLmtType }
     *     
     */
    public void setLOCLmt(LOCLmtType value) {
        this.locLmt = value;
    }

    /**
     * Gets the value of the availCr property.
     * 
     * @return
     *     possible object is
     *     {@link AvailCrType }
     *     
     */
    public AvailCrType getAvailCr() {
        return availCr;
    }

    /**
     * Sets the value of the availCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailCrType }
     *     
     */
    public void setAvailCr(AvailCrType value) {
        this.availCr = value;
    }

    /**
     * Gets the value of the minPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MinPmtAmtType }
     *     
     */
    public MinPmtAmtType getMinPmtAmt() {
        return minPmtAmt;
    }

    /**
     * Sets the value of the minPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinPmtAmtType }
     *     
     */
    public void setMinPmtAmt(MinPmtAmtType value) {
        this.minPmtAmt = value;
    }

    /**
     * Gets the value of the lastStmtBal property.
     * 
     * @return
     *     possible object is
     *     {@link LastStmtBalType }
     *     
     */
    public LastStmtBalType getLastStmtBal() {
        return lastStmtBal;
    }

    /**
     * Sets the value of the lastStmtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastStmtBalType }
     *     
     */
    public void setLastStmtBal(LastStmtBalType value) {
        this.lastStmtBal = value;
    }

    /**
     * Gets the value of the lastStmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastStmtDtType }
     *     
     */
    public LastStmtDtType getLastStmtDt() {
        return lastStmtDt;
    }

    /**
     * Sets the value of the lastStmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastStmtDtType }
     *     
     */
    public void setLastStmtDt(LastStmtDtType value) {
        this.lastStmtDt = value;
    }

    /**
     * Gets the value of the lastPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LastPmtAmtType }
     *     
     */
    public LastPmtAmtType getLastPmtAmt() {
        return lastPmtAmt;
    }

    /**
     * Sets the value of the lastPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPmtAmtType }
     *     
     */
    public void setLastPmtAmt(LastPmtAmtType value) {
        this.lastPmtAmt = value;
    }

    /**
     * Gets the value of the lastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastPmtDtType }
     *     
     */
    public LastPmtDtType getLastPmtDt() {
        return lastPmtDt;
    }

    /**
     * Sets the value of the lastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPmtDtType }
     *     
     */
    public void setLastPmtDt(LastPmtDtType value) {
        this.lastPmtDt = value;
    }

    /**
     * Gets the value of the crCardRwrdArray property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardRwrdArrayAType }
     *     
     */
    public CrCardRwrdArrayAType getCrCardRwrdArray() {
        return crCardRwrdArray;
    }

    /**
     * Sets the value of the crCardRwrdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardRwrdArrayAType }
     *     
     */
    public void setCrCardRwrdArray(CrCardRwrdArrayAType value) {
        this.crCardRwrdArray = value;
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
     * Gets the value of the authUsrCrCardArray property.
     * 
     * @return
     *     possible object is
     *     {@link AuthUsrCrCardArrayAType }
     *     
     */
    public AuthUsrCrCardArrayAType getAuthUsrCrCardArray() {
        return authUsrCrCardArray;
    }

    /**
     * Sets the value of the authUsrCrCardArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthUsrCrCardArrayAType }
     *     
     */
    public void setAuthUsrCrCardArray(AuthUsrCrCardArrayAType value) {
        this.authUsrCrCardArray = value;
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
     * Gets the value of the remMinPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemMinPmtAmtType }
     *     
     */
    public RemMinPmtAmtType getRemMinPmtAmt() {
        return remMinPmtAmt;
    }

    /**
     * Sets the value of the remMinPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemMinPmtAmtType }
     *     
     */
    public void setRemMinPmtAmt(RemMinPmtAmtType value) {
        this.remMinPmtAmt = value;
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
     * {@link Element }
     * {@link Object }
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
