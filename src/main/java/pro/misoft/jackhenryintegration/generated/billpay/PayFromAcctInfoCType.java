
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * A package of data related to a pay from account
 * 
 * <p>Java class for PayFromAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayFromAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayFromId" type="{http://jackhenry.com/jxchange/TPG/2008}PayFromId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayFromAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayFromAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayFromAcctName" type="{http://jackhenry.com/jxchange/TPG/2008}PayFromAcctName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayFromAcctDft" type="{http://jackhenry.com/jxchange/TPG/2008}PayFromAcctDft_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="StartChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PayFromInstRtId" type="{http://jackhenry.com/jxchange/TPG/2008}InstRtId_Type" minOccurs="0"/&gt;
 *             &lt;element name="PayFromAcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}PayFromAcctStat_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="PayFromAcctOwnName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *               &lt;element name="PayFromAcctOwnAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="CardPayAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CardPayAcctInfo_CType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PayFromAcctInfo_CType", propOrder = {
    "payFromId",
    "payFromAcctId",
    "payFromAcctType",
    "payFromAcctName",
    "payFromAcctDft",
    "custom",
    "ver1",
    "startChkNum",
    "ver2",
    "payFromInstRtId",
    "payFromAcctStat",
    "ver3",
    "payFromAcctOwnName",
    "payFromAcctOwnAddr",
    "ver4",
    "cardPayAcctInfo",
    "ver5",
    "any"
})
public class PayFromAcctInfoCType {

    @XmlElement(name = "PayFromId")
    protected PayFromIdType payFromId;
    @XmlElement(name = "PayFromAcctId")
    protected AcctIdType payFromAcctId;
    @XmlElement(name = "PayFromAcctType")
    protected AcctTypeType payFromAcctType;
    @XmlElement(name = "PayFromAcctName")
    protected PayFromAcctNameType payFromAcctName;
    @XmlElement(name = "PayFromAcctDft")
    protected PayFromAcctDftType payFromAcctDft;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "StartChkNum")
    protected ChkNumType startChkNum;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PayFromInstRtId")
    protected InstRtIdType payFromInstRtId;
    @XmlElement(name = "PayFromAcctStat")
    protected PayFromAcctStatType payFromAcctStat;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "PayFromAcctOwnName")
    protected PersonNameCType payFromAcctOwnName;
    @XmlElement(name = "PayFromAcctOwnAddr")
    protected AddrCType payFromAcctOwnAddr;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "CardPayAcctInfo")
    protected CardPayAcctInfoCType cardPayAcctInfo;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the payFromId property.
     * 
     * @return
     *     possible object is
     *     {@link PayFromIdType }
     *     
     */
    public PayFromIdType getPayFromId() {
        return payFromId;
    }

    /**
     * Sets the value of the payFromId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayFromIdType }
     *     
     */
    public void setPayFromId(PayFromIdType value) {
        this.payFromId = value;
    }

    /**
     * Gets the value of the payFromAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getPayFromAcctId() {
        return payFromAcctId;
    }

    /**
     * Sets the value of the payFromAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setPayFromAcctId(AcctIdType value) {
        this.payFromAcctId = value;
    }

    /**
     * Gets the value of the payFromAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getPayFromAcctType() {
        return payFromAcctType;
    }

    /**
     * Sets the value of the payFromAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setPayFromAcctType(AcctTypeType value) {
        this.payFromAcctType = value;
    }

    /**
     * Gets the value of the payFromAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link PayFromAcctNameType }
     *     
     */
    public PayFromAcctNameType getPayFromAcctName() {
        return payFromAcctName;
    }

    /**
     * Sets the value of the payFromAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayFromAcctNameType }
     *     
     */
    public void setPayFromAcctName(PayFromAcctNameType value) {
        this.payFromAcctName = value;
    }

    /**
     * Gets the value of the payFromAcctDft property.
     * 
     * @return
     *     possible object is
     *     {@link PayFromAcctDftType }
     *     
     */
    public PayFromAcctDftType getPayFromAcctDft() {
        return payFromAcctDft;
    }

    /**
     * Sets the value of the payFromAcctDft property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayFromAcctDftType }
     *     
     */
    public void setPayFromAcctDft(PayFromAcctDftType value) {
        this.payFromAcctDft = value;
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
     * Gets the value of the startChkNum property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumType }
     *     
     */
    public ChkNumType getStartChkNum() {
        return startChkNum;
    }

    /**
     * Sets the value of the startChkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumType }
     *     
     */
    public void setStartChkNum(ChkNumType value) {
        this.startChkNum = value;
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
     * Gets the value of the payFromInstRtId property.
     * 
     * @return
     *     possible object is
     *     {@link InstRtIdType }
     *     
     */
    public InstRtIdType getPayFromInstRtId() {
        return payFromInstRtId;
    }

    /**
     * Sets the value of the payFromInstRtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstRtIdType }
     *     
     */
    public void setPayFromInstRtId(InstRtIdType value) {
        this.payFromInstRtId = value;
    }

    /**
     * Gets the value of the payFromAcctStat property.
     * 
     * @return
     *     possible object is
     *     {@link PayFromAcctStatType }
     *     
     */
    public PayFromAcctStatType getPayFromAcctStat() {
        return payFromAcctStat;
    }

    /**
     * Sets the value of the payFromAcctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayFromAcctStatType }
     *     
     */
    public void setPayFromAcctStat(PayFromAcctStatType value) {
        this.payFromAcctStat = value;
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
     * Gets the value of the payFromAcctOwnName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getPayFromAcctOwnName() {
        return payFromAcctOwnName;
    }

    /**
     * Sets the value of the payFromAcctOwnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setPayFromAcctOwnName(PersonNameCType value) {
        this.payFromAcctOwnName = value;
    }

    /**
     * Gets the value of the payFromAcctOwnAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getPayFromAcctOwnAddr() {
        return payFromAcctOwnAddr;
    }

    /**
     * Sets the value of the payFromAcctOwnAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setPayFromAcctOwnAddr(AddrCType value) {
        this.payFromAcctOwnAddr = value;
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
     * Gets the value of the cardPayAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardPayAcctInfoCType }
     *     
     */
    public CardPayAcctInfoCType getCardPayAcctInfo() {
        return cardPayAcctInfo;
    }

    /**
     * Sets the value of the cardPayAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPayAcctInfoCType }
     *     
     */
    public void setCardPayAcctInfo(CardPayAcctInfoCType value) {
        this.cardPayAcctInfo = value;
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
