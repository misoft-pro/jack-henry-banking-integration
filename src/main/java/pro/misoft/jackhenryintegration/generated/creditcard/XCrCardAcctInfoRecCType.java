
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
 * <p>Java class for x_CrCardAcctInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_CrCardAcctInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCardAcctInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardAcctInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvailCr" type="{http://jackhenry.com/jxchange/TPG/2008}AvailCr_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardActDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardActDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LOCStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrLifeCompDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrLifeCompDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardLmtUpdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardLmtUpdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastLmtUpdDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastLmtUpdDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDueDays" type="{http://jackhenry.com/jxchange/TPG/2008}PastDueDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardRwrdArray" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardRwrdArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AuthUsrCrCardArray" type="{http://jackhenry.com/jxchange/TPG/2008}AuthUsrCrCardArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ReIssueCrCardAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *             &lt;element name="OrgIssueCrCardAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="CrCardPgmName" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardPgmName_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_CrCardAcctInfoRec_CType", propOrder = {
    "crCardAcctInfoRec",
    "curBal",
    "acctStatDesc",
    "availCr",
    "openDt",
    "crCardActDesc",
    "locStatDesc",
    "crLifeCompDesc",
    "crCardLmtUpdDesc",
    "lastLmtUpdDt",
    "pastDueDays",
    "crCardRwrdArray",
    "custom",
    "ver1",
    "authUsrCrCardArray",
    "ver2",
    "reIssueCrCardAcctId",
    "orgIssueCrCardAcctId",
    "ver3",
    "crCardPgmName",
    "ver4",
    "any"
})
public class XCrCardAcctInfoRecCType {

    @XmlElement(name = "CrCardAcctInfoRec")
    protected CrCardAcctInfoRecCType crCardAcctInfoRec;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "AcctStatDesc")
    protected AcctStatDescType acctStatDesc;
    @XmlElement(name = "AvailCr")
    protected AvailCrType availCr;
    @XmlElement(name = "OpenDt")
    protected OpenDtType openDt;
    @XmlElement(name = "CrCardActDesc")
    protected CrCardActDescType crCardActDesc;
    @XmlElement(name = "LOCStatDesc")
    protected LOCStatDescType locStatDesc;
    @XmlElement(name = "CrLifeCompDesc")
    protected CrLifeCompDescType crLifeCompDesc;
    @XmlElement(name = "CrCardLmtUpdDesc")
    protected CrCardLmtUpdDescType crCardLmtUpdDesc;
    @XmlElement(name = "LastLmtUpdDt")
    protected LastLmtUpdDtType lastLmtUpdDt;
    @XmlElement(name = "PastDueDays")
    protected PastDueDaysType pastDueDays;
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
    @XmlElement(name = "ReIssueCrCardAcctId")
    protected AcctIdType reIssueCrCardAcctId;
    @XmlElement(name = "OrgIssueCrCardAcctId")
    protected AcctIdType orgIssueCrCardAcctId;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "CrCardPgmName")
    protected CrCardPgmNameType crCardPgmName;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crCardAcctInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardAcctInfoRecCType }
     *     
     */
    public CrCardAcctInfoRecCType getCrCardAcctInfoRec() {
        return crCardAcctInfoRec;
    }

    /**
     * Sets the value of the crCardAcctInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardAcctInfoRecCType }
     *     
     */
    public void setCrCardAcctInfoRec(CrCardAcctInfoRecCType value) {
        this.crCardAcctInfoRec = value;
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
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link OpenDtType }
     *     
     */
    public OpenDtType getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenDtType }
     *     
     */
    public void setOpenDt(OpenDtType value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the crCardActDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardActDescType }
     *     
     */
    public CrCardActDescType getCrCardActDesc() {
        return crCardActDesc;
    }

    /**
     * Sets the value of the crCardActDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardActDescType }
     *     
     */
    public void setCrCardActDesc(CrCardActDescType value) {
        this.crCardActDesc = value;
    }

    /**
     * Gets the value of the locStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LOCStatDescType }
     *     
     */
    public LOCStatDescType getLOCStatDesc() {
        return locStatDesc;
    }

    /**
     * Sets the value of the locStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCStatDescType }
     *     
     */
    public void setLOCStatDesc(LOCStatDescType value) {
        this.locStatDesc = value;
    }

    /**
     * Gets the value of the crLifeCompDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrLifeCompDescType }
     *     
     */
    public CrLifeCompDescType getCrLifeCompDesc() {
        return crLifeCompDesc;
    }

    /**
     * Sets the value of the crLifeCompDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrLifeCompDescType }
     *     
     */
    public void setCrLifeCompDesc(CrLifeCompDescType value) {
        this.crLifeCompDesc = value;
    }

    /**
     * Gets the value of the crCardLmtUpdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardLmtUpdDescType }
     *     
     */
    public CrCardLmtUpdDescType getCrCardLmtUpdDesc() {
        return crCardLmtUpdDesc;
    }

    /**
     * Sets the value of the crCardLmtUpdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardLmtUpdDescType }
     *     
     */
    public void setCrCardLmtUpdDesc(CrCardLmtUpdDescType value) {
        this.crCardLmtUpdDesc = value;
    }

    /**
     * Gets the value of the lastLmtUpdDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastLmtUpdDtType }
     *     
     */
    public LastLmtUpdDtType getLastLmtUpdDt() {
        return lastLmtUpdDt;
    }

    /**
     * Sets the value of the lastLmtUpdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastLmtUpdDtType }
     *     
     */
    public void setLastLmtUpdDt(LastLmtUpdDtType value) {
        this.lastLmtUpdDt = value;
    }

    /**
     * Gets the value of the pastDueDays property.
     * 
     * @return
     *     possible object is
     *     {@link PastDueDaysType }
     *     
     */
    public PastDueDaysType getPastDueDays() {
        return pastDueDays;
    }

    /**
     * Sets the value of the pastDueDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDueDaysType }
     *     
     */
    public void setPastDueDays(PastDueDaysType value) {
        this.pastDueDays = value;
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
     * Gets the value of the reIssueCrCardAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getReIssueCrCardAcctId() {
        return reIssueCrCardAcctId;
    }

    /**
     * Sets the value of the reIssueCrCardAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setReIssueCrCardAcctId(AcctIdType value) {
        this.reIssueCrCardAcctId = value;
    }

    /**
     * Gets the value of the orgIssueCrCardAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getOrgIssueCrCardAcctId() {
        return orgIssueCrCardAcctId;
    }

    /**
     * Sets the value of the orgIssueCrCardAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setOrgIssueCrCardAcctId(AcctIdType value) {
        this.orgIssueCrCardAcctId = value;
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
     * Gets the value of the crCardPgmName property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardPgmNameType }
     *     
     */
    public CrCardPgmNameType getCrCardPgmName() {
        return crCardPgmName;
    }

    /**
     * Sets the value of the crCardPgmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardPgmNameType }
     *     
     */
    public void setCrCardPgmName(CrCardPgmNameType value) {
        this.crCardPgmName = value;
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
