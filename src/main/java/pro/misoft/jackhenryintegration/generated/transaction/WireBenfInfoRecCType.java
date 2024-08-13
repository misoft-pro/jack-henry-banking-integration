
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
 * <p>Java class for WireBenfInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireBenfInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireIntmdFinInstIdType" type="{http://jackhenry.com/jxchange/TPG/2008}WireFinInstIdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireIntmdFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}WireIntmdFinInstId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireIntmdFinInstName" type="{http://jackhenry.com/jxchange/TPG/2008}WireIntmdFinInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireIntmdFinInstAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfId" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfIdType" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfIdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfFinInstIdType" type="{http://jackhenry.com/jxchange/TPG/2008}WireFinInstIdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfFinInstId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfFinInstName" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfFinInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfFinInstAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfName" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfRef" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfRef_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireDrFinInstIdType" type="{http://jackhenry.com/jxchange/TPG/2008}WireFinInstIdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireDrFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}WireDrFinInstId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireDrFinInstName" type="{http://jackhenry.com/jxchange/TPG/2008}WireDrFinInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireDrFinInstAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
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
@XmlType(name = "WireBenfInfoRec_CType", propOrder = {
    "wireIntmdFinInstIdType",
    "wireIntmdFinInstId",
    "wireIntmdFinInstName",
    "wireIntmdFinInstAddr",
    "wireBenfId",
    "wireBenfIdType",
    "wireBenfFinInstIdType",
    "wireBenfFinInstId",
    "wireBenfFinInstName",
    "wireBenfFinInstAddr",
    "wireBenfName",
    "wireBenfAddr",
    "wireBenfRef",
    "wireDrFinInstIdType",
    "wireDrFinInstId",
    "wireDrFinInstName",
    "wireDrFinInstAddr",
    "custom",
    "ver1",
    "any"
})
public class WireBenfInfoRecCType {

    @XmlElement(name = "WireIntmdFinInstIdType")
    protected WireFinInstIdTypeType wireIntmdFinInstIdType;
    @XmlElement(name = "WireIntmdFinInstId")
    protected WireIntmdFinInstIdType wireIntmdFinInstId;
    @XmlElement(name = "WireIntmdFinInstName")
    protected WireIntmdFinInstNameType wireIntmdFinInstName;
    @XmlElement(name = "WireIntmdFinInstAddr")
    protected AddrCType wireIntmdFinInstAddr;
    @XmlElement(name = "WireBenfId")
    protected WireBenfIdType wireBenfId;
    @XmlElement(name = "WireBenfIdType")
    protected WireBenfIdTypeType wireBenfIdType;
    @XmlElement(name = "WireBenfFinInstIdType")
    protected WireFinInstIdTypeType wireBenfFinInstIdType;
    @XmlElement(name = "WireBenfFinInstId")
    protected WireBenfFinInstIdType wireBenfFinInstId;
    @XmlElement(name = "WireBenfFinInstName")
    protected WireBenfFinInstNameType wireBenfFinInstName;
    @XmlElement(name = "WireBenfFinInstAddr")
    protected AddrCType wireBenfFinInstAddr;
    @XmlElement(name = "WireBenfName")
    protected WireBenfNameType wireBenfName;
    @XmlElement(name = "WireBenfAddr")
    protected AddrCType wireBenfAddr;
    @XmlElement(name = "WireBenfRef")
    protected WireBenfRefType wireBenfRef;
    @XmlElement(name = "WireDrFinInstIdType")
    protected WireFinInstIdTypeType wireDrFinInstIdType;
    @XmlElement(name = "WireDrFinInstId")
    protected WireDrFinInstIdType wireDrFinInstId;
    @XmlElement(name = "WireDrFinInstName")
    protected WireDrFinInstNameType wireDrFinInstName;
    @XmlElement(name = "WireDrFinInstAddr")
    protected AddrCType wireDrFinInstAddr;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the wireIntmdFinInstIdType property.
     * 
     * @return
     *     possible object is
     *     {@link WireFinInstIdTypeType }
     *     
     */
    public WireFinInstIdTypeType getWireIntmdFinInstIdType() {
        return wireIntmdFinInstIdType;
    }

    /**
     * Sets the value of the wireIntmdFinInstIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireFinInstIdTypeType }
     *     
     */
    public void setWireIntmdFinInstIdType(WireFinInstIdTypeType value) {
        this.wireIntmdFinInstIdType = value;
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
     * Gets the value of the wireIntmdFinInstAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getWireIntmdFinInstAddr() {
        return wireIntmdFinInstAddr;
    }

    /**
     * Sets the value of the wireIntmdFinInstAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setWireIntmdFinInstAddr(AddrCType value) {
        this.wireIntmdFinInstAddr = value;
    }

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
     * Gets the value of the wireBenfFinInstIdType property.
     * 
     * @return
     *     possible object is
     *     {@link WireFinInstIdTypeType }
     *     
     */
    public WireFinInstIdTypeType getWireBenfFinInstIdType() {
        return wireBenfFinInstIdType;
    }

    /**
     * Sets the value of the wireBenfFinInstIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireFinInstIdTypeType }
     *     
     */
    public void setWireBenfFinInstIdType(WireFinInstIdTypeType value) {
        this.wireBenfFinInstIdType = value;
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
     * Gets the value of the wireDrFinInstIdType property.
     * 
     * @return
     *     possible object is
     *     {@link WireFinInstIdTypeType }
     *     
     */
    public WireFinInstIdTypeType getWireDrFinInstIdType() {
        return wireDrFinInstIdType;
    }

    /**
     * Sets the value of the wireDrFinInstIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireFinInstIdTypeType }
     *     
     */
    public void setWireDrFinInstIdType(WireFinInstIdTypeType value) {
        this.wireDrFinInstIdType = value;
    }

    /**
     * Gets the value of the wireDrFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link WireDrFinInstIdType }
     *     
     */
    public WireDrFinInstIdType getWireDrFinInstId() {
        return wireDrFinInstId;
    }

    /**
     * Sets the value of the wireDrFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireDrFinInstIdType }
     *     
     */
    public void setWireDrFinInstId(WireDrFinInstIdType value) {
        this.wireDrFinInstId = value;
    }

    /**
     * Gets the value of the wireDrFinInstName property.
     * 
     * @return
     *     possible object is
     *     {@link WireDrFinInstNameType }
     *     
     */
    public WireDrFinInstNameType getWireDrFinInstName() {
        return wireDrFinInstName;
    }

    /**
     * Sets the value of the wireDrFinInstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireDrFinInstNameType }
     *     
     */
    public void setWireDrFinInstName(WireDrFinInstNameType value) {
        this.wireDrFinInstName = value;
    }

    /**
     * Gets the value of the wireDrFinInstAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getWireDrFinInstAddr() {
        return wireDrFinInstAddr;
    }

    /**
     * Sets the value of the wireDrFinInstAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setWireDrFinInstAddr(AddrCType value) {
        this.wireDrFinInstAddr = value;
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
