
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
 * <p>Java class for ColSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="InstDefKey" type="{http://jackhenry.com/jxchange/TPG/2008}InstDefKey_Type" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColQueCode" type="{http://jackhenry.com/jxchange/TPG/2008}ColQueCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctInColType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctInColType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ManualAddType" type="{http://jackhenry.com/jxchange/TPG/2008}ManualAddType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDueDays" type="{http://jackhenry.com/jxchange/TPG/2008}PastDueDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="OvrDrftProt" type="{http://jackhenry.com/jxchange/TPG/2008}OvrDrftProt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColAcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}ColAcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColAcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ColAcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColWorkStatType" type="{http://jackhenry.com/jxchange/TPG/2008}ColWorkStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "ColSrchRec_CType", propOrder = {
    "accountId",
    "instDefKey",
    "personName",
    "custId",
    "colQueCode",
    "acctInColType",
    "manualAddType",
    "pastDueDays",
    "ovrDrftProt",
    "colAcctStat",
    "colAcctStatDesc",
    "acctStat",
    "acctStatDesc",
    "curBal",
    "colExpDt",
    "colWorkStatType",
    "custom",
    "ver1",
    "any"
})
public class ColSrchRecCType {

    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "InstDefKey")
    protected InstDefKeyType instDefKey;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "ColQueCode")
    protected ColQueCodeType colQueCode;
    @XmlElement(name = "AcctInColType")
    protected AcctInColTypeType acctInColType;
    @XmlElement(name = "ManualAddType")
    protected ManualAddTypeType manualAddType;
    @XmlElement(name = "PastDueDays")
    protected PastDueDaysType pastDueDays;
    @XmlElement(name = "OvrDrftProt")
    protected OvrDrftProtType ovrDrftProt;
    @XmlElement(name = "ColAcctStat")
    protected ColAcctStatType colAcctStat;
    @XmlElement(name = "ColAcctStatDesc")
    protected ColAcctStatDescType colAcctStatDesc;
    @XmlElement(name = "AcctStat")
    protected AcctStatType acctStat;
    @XmlElement(name = "AcctStatDesc")
    protected AcctStatDescType acctStatDesc;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "ColExpDt")
    protected ExpDtType colExpDt;
    @XmlElement(name = "ColWorkStatType")
    protected ColWorkStatTypeType colWorkStatType;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

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
     * Gets the value of the instDefKey property.
     * 
     * @return
     *     possible object is
     *     {@link InstDefKeyType }
     *     
     */
    public InstDefKeyType getInstDefKey() {
        return instDefKey;
    }

    /**
     * Sets the value of the instDefKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstDefKeyType }
     *     
     */
    public void setInstDefKey(InstDefKeyType value) {
        this.instDefKey = value;
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
     * Gets the value of the colQueCode property.
     * 
     * @return
     *     possible object is
     *     {@link ColQueCodeType }
     *     
     */
    public ColQueCodeType getColQueCode() {
        return colQueCode;
    }

    /**
     * Sets the value of the colQueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColQueCodeType }
     *     
     */
    public void setColQueCode(ColQueCodeType value) {
        this.colQueCode = value;
    }

    /**
     * Gets the value of the acctInColType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctInColTypeType }
     *     
     */
    public AcctInColTypeType getAcctInColType() {
        return acctInColType;
    }

    /**
     * Sets the value of the acctInColType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctInColTypeType }
     *     
     */
    public void setAcctInColType(AcctInColTypeType value) {
        this.acctInColType = value;
    }

    /**
     * Gets the value of the manualAddType property.
     * 
     * @return
     *     possible object is
     *     {@link ManualAddTypeType }
     *     
     */
    public ManualAddTypeType getManualAddType() {
        return manualAddType;
    }

    /**
     * Sets the value of the manualAddType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualAddTypeType }
     *     
     */
    public void setManualAddType(ManualAddTypeType value) {
        this.manualAddType = value;
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
     * Gets the value of the ovrDrftProt property.
     * 
     * @return
     *     possible object is
     *     {@link OvrDrftProtType }
     *     
     */
    public OvrDrftProtType getOvrDrftProt() {
        return ovrDrftProt;
    }

    /**
     * Sets the value of the ovrDrftProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OvrDrftProtType }
     *     
     */
    public void setOvrDrftProt(OvrDrftProtType value) {
        this.ovrDrftProt = value;
    }

    /**
     * Gets the value of the colAcctStat property.
     * 
     * @return
     *     possible object is
     *     {@link ColAcctStatType }
     *     
     */
    public ColAcctStatType getColAcctStat() {
        return colAcctStat;
    }

    /**
     * Sets the value of the colAcctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColAcctStatType }
     *     
     */
    public void setColAcctStat(ColAcctStatType value) {
        this.colAcctStat = value;
    }

    /**
     * Gets the value of the colAcctStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ColAcctStatDescType }
     *     
     */
    public ColAcctStatDescType getColAcctStatDesc() {
        return colAcctStatDesc;
    }

    /**
     * Sets the value of the colAcctStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColAcctStatDescType }
     *     
     */
    public void setColAcctStatDesc(ColAcctStatDescType value) {
        this.colAcctStatDesc = value;
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
     * Gets the value of the colExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getColExpDt() {
        return colExpDt;
    }

    /**
     * Sets the value of the colExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setColExpDt(ExpDtType value) {
        this.colExpDt = value;
    }

    /**
     * Gets the value of the colWorkStatType property.
     * 
     * @return
     *     possible object is
     *     {@link ColWorkStatTypeType }
     *     
     */
    public ColWorkStatTypeType getColWorkStatType() {
        return colWorkStatType;
    }

    /**
     * Sets the value of the colWorkStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColWorkStatTypeType }
     *     
     */
    public void setColWorkStatType(ColWorkStatTypeType value) {
        this.colWorkStatType = value;
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
