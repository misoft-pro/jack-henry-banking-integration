
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
 * <p>Java class for LobbyQueSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LobbyQueSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LobbyQueId" type="{http://jackhenry.com/jxchange/TPG/2008}LobbyQueId_Type"/&gt;
 *         &lt;element name="Name" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="NewCustType" type="{http://jackhenry.com/jxchange/TPG/2008}NewCustType_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustType" type="{http://jackhenry.com/jxchange/TPG/2008}CustType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LobbyQueStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}LobbyQueStatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LobbyQueStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LobbyQueStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="QueEntryTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}QueEntryTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "LobbyQueSrchRec_CType", propOrder = {
    "lobbyQueId",
    "name",
    "addr",
    "newCustType",
    "taxId",
    "custId",
    "custType",
    "brCode",
    "brDesc",
    "eventOffCode",
    "eventOffDesc",
    "lobbyQueStatCode",
    "lobbyQueStatDesc",
    "queEntryTimeDt",
    "userDefInfoArray",
    "custom",
    "ver1",
    "any"
})
public class LobbyQueSrchRecCType {

    @XmlElement(name = "LobbyQueId", required = true)
    protected LobbyQueIdType lobbyQueId;
    @XmlElement(name = "Name")
    protected PersonNameCType name;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "NewCustType")
    protected NewCustTypeType newCustType;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "CustType")
    protected CustTypeType custType;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "EventOffCode")
    protected CRMOffCodeType eventOffCode;
    @XmlElement(name = "EventOffDesc")
    protected CRMOffDescType eventOffDesc;
    @XmlElement(name = "LobbyQueStatCode")
    protected LobbyQueStatCodeType lobbyQueStatCode;
    @XmlElement(name = "LobbyQueStatDesc")
    protected LobbyQueStatDescType lobbyQueStatDesc;
    @XmlElement(name = "QueEntryTimeDt")
    protected QueEntryTimeDtType queEntryTimeDt;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the lobbyQueId property.
     * 
     * @return
     *     possible object is
     *     {@link LobbyQueIdType }
     *     
     */
    public LobbyQueIdType getLobbyQueId() {
        return lobbyQueId;
    }

    /**
     * Sets the value of the lobbyQueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LobbyQueIdType }
     *     
     */
    public void setLobbyQueId(LobbyQueIdType value) {
        this.lobbyQueId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setName(PersonNameCType value) {
        this.name = value;
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
     * Gets the value of the newCustType property.
     * 
     * @return
     *     possible object is
     *     {@link NewCustTypeType }
     *     
     */
    public NewCustTypeType getNewCustType() {
        return newCustType;
    }

    /**
     * Sets the value of the newCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewCustTypeType }
     *     
     */
    public void setNewCustType(NewCustTypeType value) {
        this.newCustType = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setTaxId(TaxIdType value) {
        this.taxId = value;
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
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link CustTypeType }
     *     
     */
    public CustTypeType getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustTypeType }
     *     
     */
    public void setCustType(CustTypeType value) {
        this.custType = value;
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
     * Gets the value of the eventOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getEventOffCode() {
        return eventOffCode;
    }

    /**
     * Sets the value of the eventOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setEventOffCode(CRMOffCodeType value) {
        this.eventOffCode = value;
    }

    /**
     * Gets the value of the eventOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getEventOffDesc() {
        return eventOffDesc;
    }

    /**
     * Sets the value of the eventOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setEventOffDesc(CRMOffDescType value) {
        this.eventOffDesc = value;
    }

    /**
     * Gets the value of the lobbyQueStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link LobbyQueStatCodeType }
     *     
     */
    public LobbyQueStatCodeType getLobbyQueStatCode() {
        return lobbyQueStatCode;
    }

    /**
     * Sets the value of the lobbyQueStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LobbyQueStatCodeType }
     *     
     */
    public void setLobbyQueStatCode(LobbyQueStatCodeType value) {
        this.lobbyQueStatCode = value;
    }

    /**
     * Gets the value of the lobbyQueStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LobbyQueStatDescType }
     *     
     */
    public LobbyQueStatDescType getLobbyQueStatDesc() {
        return lobbyQueStatDesc;
    }

    /**
     * Sets the value of the lobbyQueStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LobbyQueStatDescType }
     *     
     */
    public void setLobbyQueStatDesc(LobbyQueStatDescType value) {
        this.lobbyQueStatDesc = value;
    }

    /**
     * Gets the value of the queEntryTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link QueEntryTimeDtType }
     *     
     */
    public QueEntryTimeDtType getQueEntryTimeDt() {
        return queEntryTimeDt;
    }

    /**
     * Sets the value of the queEntryTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueEntryTimeDtType }
     *     
     */
    public void setQueEntryTimeDt(QueEntryTimeDtType value) {
        this.queEntryTimeDt = value;
    }

    /**
     * Gets the value of the userDefInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public UserDefInfoArrayAType getUserDefInfoArray() {
        return userDefInfoArray;
    }

    /**
     * Sets the value of the userDefInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public void setUserDefInfoArray(UserDefInfoArrayAType value) {
        this.userDefInfoArray = value;
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
