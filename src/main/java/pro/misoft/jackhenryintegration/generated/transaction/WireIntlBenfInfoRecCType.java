
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for WireIntlBenfInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireIntlBenfInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireBenfId" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfIdType" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfIdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfName" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfEmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfFinInstId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfFinInstName" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfFinInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfFinInstAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfRef" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfRef_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeFinInstRtId" type="{http://jackhenry.com/jxchange/TPG/2008}FinInstRtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireIntmdFinInstName" type="{http://jackhenry.com/jxchange/TPG/2008}WireIntmdFinInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireIntmdFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}WireIntmdFinInstId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireIntmdBankId" type="{http://jackhenry.com/jxchange/TPG/2008}WireIntmdFinInstId_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntmdFinInstStreetAddr1" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr1_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntmdFinInstStreetAddr2" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr2_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntmdFinInstCity" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntmdFinInstPostalCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntmdFinInstStateProv" type="{http://jackhenry.com/jxchange/TPG/2008}StateProv_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntmdFinInstCntryType" type="{http://jackhenry.com/jxchange/TPG/2008}CntryType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "WireIntlBenfInfoRec_CType", propOrder = {
    "wireBenfId",
    "wireBenfIdType",
    "wireBenfName",
    "wireBenfAddr",
    "wireBenfEmailArray",
    "wireBenfFinInstId",
    "wireBenfFinInstName",
    "wireBenfFinInstAddr",
    "wireBenfRef",
    "payeeFinInstRtId",
    "wireIntmdFinInstName",
    "wireIntmdFinInstId",
    "wireIntmdBankId",
    "intmdFinInstStreetAddr1",
    "intmdFinInstStreetAddr2",
    "intmdFinInstCity",
    "intmdFinInstPostalCode",
    "intmdFinInstStateProv",
    "intmdFinInstCntryType",
    "custom",
    "ver1",
    "any"
})
public class WireIntlBenfInfoRecCType {

    @XmlElement(name = "WireBenfId")
    protected WireBenfIdType wireBenfId;
    @XmlElement(name = "WireBenfIdType")
    protected WireBenfIdTypeType wireBenfIdType;
    @XmlElement(name = "WireBenfName")
    protected WireBenfNameType wireBenfName;
    @XmlElement(name = "WireBenfAddr")
    protected AddrCType wireBenfAddr;
    @XmlElement(name = "WireBenfEmailArray")
    protected EmailArrayAType wireBenfEmailArray;
    @XmlElement(name = "WireBenfFinInstId")
    protected WireBenfFinInstIdType wireBenfFinInstId;
    @XmlElement(name = "WireBenfFinInstName")
    protected WireBenfFinInstNameType wireBenfFinInstName;
    @XmlElement(name = "WireBenfFinInstAddr")
    protected AddrCType wireBenfFinInstAddr;
    @XmlElement(name = "WireBenfRef")
    protected WireBenfRefType wireBenfRef;
    @XmlElement(name = "PayeeFinInstRtId")
    protected FinInstRtIdType payeeFinInstRtId;
    @XmlElement(name = "WireIntmdFinInstName")
    protected WireIntmdFinInstNameType wireIntmdFinInstName;
    @XmlElement(name = "WireIntmdFinInstId")
    protected WireIntmdFinInstIdType wireIntmdFinInstId;
    @XmlElement(name = "WireIntmdBankId")
    protected WireIntmdFinInstIdType wireIntmdBankId;
    @XmlElement(name = "IntmdFinInstStreetAddr1")
    protected StreetAddr1Type intmdFinInstStreetAddr1;
    @XmlElement(name = "IntmdFinInstStreetAddr2")
    protected StreetAddr2Type intmdFinInstStreetAddr2;
    @XmlElement(name = "IntmdFinInstCity")
    protected CityType intmdFinInstCity;
    @XmlElement(name = "IntmdFinInstPostalCode")
    protected PostalCodeType intmdFinInstPostalCode;
    @XmlElement(name = "IntmdFinInstStateProv")
    protected StateProvType intmdFinInstStateProv;
    @XmlElement(name = "IntmdFinInstCntryType")
    protected CntryTypeType intmdFinInstCntryType;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the wireBenfId property.
     * 
     * @return
     *     possible object is
     *     {@link WireBenfIdType }
     *     
     */
    public WireBenfIdType getWireBenfId() {
        return wireBenfId;
    }

    /**
     * Sets the value of the wireBenfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBenfIdType }
     *     
     */
    public void setWireBenfId(WireBenfIdType value) {
        this.wireBenfId = value;
    }

    /**
     * Gets the value of the wireBenfIdType property.
     * 
     * @return
     *     possible object is
     *     {@link WireBenfIdTypeType }
     *     
     */
    public WireBenfIdTypeType getWireBenfIdType() {
        return wireBenfIdType;
    }

    /**
     * Sets the value of the wireBenfIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBenfIdTypeType }
     *     
     */
    public void setWireBenfIdType(WireBenfIdTypeType value) {
        this.wireBenfIdType = value;
    }

    /**
     * Gets the value of the wireBenfName property.
     * 
     * @return
     *     possible object is
     *     {@link WireBenfNameType }
     *     
     */
    public WireBenfNameType getWireBenfName() {
        return wireBenfName;
    }

    /**
     * Sets the value of the wireBenfName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBenfNameType }
     *     
     */
    public void setWireBenfName(WireBenfNameType value) {
        this.wireBenfName = value;
    }

    /**
     * Gets the value of the wireBenfAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getWireBenfAddr() {
        return wireBenfAddr;
    }

    /**
     * Sets the value of the wireBenfAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setWireBenfAddr(AddrCType value) {
        this.wireBenfAddr = value;
    }

    /**
     * Gets the value of the wireBenfEmailArray property.
     * 
     * @return
     *     possible object is
     *     {@link EmailArrayAType }
     *     
     */
    public EmailArrayAType getWireBenfEmailArray() {
        return wireBenfEmailArray;
    }

    /**
     * Sets the value of the wireBenfEmailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailArrayAType }
     *     
     */
    public void setWireBenfEmailArray(EmailArrayAType value) {
        this.wireBenfEmailArray = value;
    }

    /**
     * Gets the value of the wireBenfFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link WireBenfFinInstIdType }
     *     
     */
    public WireBenfFinInstIdType getWireBenfFinInstId() {
        return wireBenfFinInstId;
    }

    /**
     * Sets the value of the wireBenfFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBenfFinInstIdType }
     *     
     */
    public void setWireBenfFinInstId(WireBenfFinInstIdType value) {
        this.wireBenfFinInstId = value;
    }

    /**
     * Gets the value of the wireBenfFinInstName property.
     * 
     * @return
     *     possible object is
     *     {@link WireBenfFinInstNameType }
     *     
     */
    public WireBenfFinInstNameType getWireBenfFinInstName() {
        return wireBenfFinInstName;
    }

    /**
     * Sets the value of the wireBenfFinInstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBenfFinInstNameType }
     *     
     */
    public void setWireBenfFinInstName(WireBenfFinInstNameType value) {
        this.wireBenfFinInstName = value;
    }

    /**
     * Gets the value of the wireBenfFinInstAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getWireBenfFinInstAddr() {
        return wireBenfFinInstAddr;
    }

    /**
     * Sets the value of the wireBenfFinInstAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setWireBenfFinInstAddr(AddrCType value) {
        this.wireBenfFinInstAddr = value;
    }

    /**
     * Gets the value of the wireBenfRef property.
     * 
     * @return
     *     possible object is
     *     {@link WireBenfRefType }
     *     
     */
    public WireBenfRefType getWireBenfRef() {
        return wireBenfRef;
    }

    /**
     * Sets the value of the wireBenfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBenfRefType }
     *     
     */
    public void setWireBenfRef(WireBenfRefType value) {
        this.wireBenfRef = value;
    }

    /**
     * Gets the value of the payeeFinInstRtId property.
     * 
     * @return
     *     possible object is
     *     {@link FinInstRtIdType }
     *     
     */
    public FinInstRtIdType getPayeeFinInstRtId() {
        return payeeFinInstRtId;
    }

    /**
     * Sets the value of the payeeFinInstRtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinInstRtIdType }
     *     
     */
    public void setPayeeFinInstRtId(FinInstRtIdType value) {
        this.payeeFinInstRtId = value;
    }

    /**
     * Gets the value of the wireIntmdFinInstName property.
     * 
     * @return
     *     possible object is
     *     {@link WireIntmdFinInstNameType }
     *     
     */
    public WireIntmdFinInstNameType getWireIntmdFinInstName() {
        return wireIntmdFinInstName;
    }

    /**
     * Sets the value of the wireIntmdFinInstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireIntmdFinInstNameType }
     *     
     */
    public void setWireIntmdFinInstName(WireIntmdFinInstNameType value) {
        this.wireIntmdFinInstName = value;
    }

    /**
     * Gets the value of the wireIntmdFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link WireIntmdFinInstIdType }
     *     
     */
    public WireIntmdFinInstIdType getWireIntmdFinInstId() {
        return wireIntmdFinInstId;
    }

    /**
     * Sets the value of the wireIntmdFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireIntmdFinInstIdType }
     *     
     */
    public void setWireIntmdFinInstId(WireIntmdFinInstIdType value) {
        this.wireIntmdFinInstId = value;
    }

    /**
     * Gets the value of the wireIntmdBankId property.
     * 
     * @return
     *     possible object is
     *     {@link WireIntmdFinInstIdType }
     *     
     */
    public WireIntmdFinInstIdType getWireIntmdBankId() {
        return wireIntmdBankId;
    }

    /**
     * Sets the value of the wireIntmdBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireIntmdFinInstIdType }
     *     
     */
    public void setWireIntmdBankId(WireIntmdFinInstIdType value) {
        this.wireIntmdBankId = value;
    }

    /**
     * Gets the value of the intmdFinInstStreetAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddr1Type }
     *     
     */
    public StreetAddr1Type getIntmdFinInstStreetAddr1() {
        return intmdFinInstStreetAddr1;
    }

    /**
     * Sets the value of the intmdFinInstStreetAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddr1Type }
     *     
     */
    public void setIntmdFinInstStreetAddr1(StreetAddr1Type value) {
        this.intmdFinInstStreetAddr1 = value;
    }

    /**
     * Gets the value of the intmdFinInstStreetAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddr2Type }
     *     
     */
    public StreetAddr2Type getIntmdFinInstStreetAddr2() {
        return intmdFinInstStreetAddr2;
    }

    /**
     * Sets the value of the intmdFinInstStreetAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddr2Type }
     *     
     */
    public void setIntmdFinInstStreetAddr2(StreetAddr2Type value) {
        this.intmdFinInstStreetAddr2 = value;
    }

    /**
     * Gets the value of the intmdFinInstCity property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getIntmdFinInstCity() {
        return intmdFinInstCity;
    }

    /**
     * Sets the value of the intmdFinInstCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setIntmdFinInstCity(CityType value) {
        this.intmdFinInstCity = value;
    }

    /**
     * Gets the value of the intmdFinInstPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link PostalCodeType }
     *     
     */
    public PostalCodeType getIntmdFinInstPostalCode() {
        return intmdFinInstPostalCode;
    }

    /**
     * Sets the value of the intmdFinInstPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCodeType }
     *     
     */
    public void setIntmdFinInstPostalCode(PostalCodeType value) {
        this.intmdFinInstPostalCode = value;
    }

    /**
     * Gets the value of the intmdFinInstStateProv property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvType }
     *     
     */
    public StateProvType getIntmdFinInstStateProv() {
        return intmdFinInstStateProv;
    }

    /**
     * Sets the value of the intmdFinInstStateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvType }
     *     
     */
    public void setIntmdFinInstStateProv(StateProvType value) {
        this.intmdFinInstStateProv = value;
    }

    /**
     * Gets the value of the intmdFinInstCntryType property.
     * 
     * @return
     *     possible object is
     *     {@link CntryTypeType }
     *     
     */
    public CntryTypeType getIntmdFinInstCntryType() {
        return intmdFinInstCntryType;
    }

    /**
     * Sets the value of the intmdFinInstCntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryTypeType }
     *     
     */
    public void setIntmdFinInstCntryType(CntryTypeType value) {
        this.intmdFinInstCntryType = value;
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
