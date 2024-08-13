
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
 * <p>Java class for WireOrignInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireOrignInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireOrignFinInstIdType" type="{http://jackhenry.com/jxchange/TPG/2008}WireFinInstIdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}WireOrignFinInstId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignFinInstName" type="{http://jackhenry.com/jxchange/TPG/2008}WireOrignFinInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignFinInstAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireInstrFinInstIdType" type="{http://jackhenry.com/jxchange/TPG/2008}WireFinInstIdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireInstrFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}WireInstrFinInstId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireInstrFinInstName" type="{http://jackhenry.com/jxchange/TPG/2008}WireInstrFinInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireInstrFinInstAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireDrwDwnCrFinInstAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}WireDrwDwnCrFinInstAcctId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "WireOrignInfoRec_CType", propOrder = {
    "wireOrignFinInstIdType",
    "wireOrignFinInstId",
    "wireOrignFinInstName",
    "wireOrignFinInstAddr",
    "wireInstrFinInstIdType",
    "wireInstrFinInstId",
    "wireInstrFinInstName",
    "wireInstrFinInstAddr",
    "wireDrwDwnCrFinInstAcctId",
    "custom",
    "ver1",
    "any"
})
public class WireOrignInfoRecCType {

    @XmlElement(name = "WireOrignFinInstIdType")
    protected WireFinInstIdTypeType wireOrignFinInstIdType;
    @XmlElement(name = "WireOrignFinInstId")
    protected WireOrignFinInstIdType wireOrignFinInstId;
    @XmlElement(name = "WireOrignFinInstName")
    protected WireOrignFinInstNameType wireOrignFinInstName;
    @XmlElement(name = "WireOrignFinInstAddr")
    protected AddrCType wireOrignFinInstAddr;
    @XmlElement(name = "WireInstrFinInstIdType")
    protected WireFinInstIdTypeType wireInstrFinInstIdType;
    @XmlElement(name = "WireInstrFinInstId")
    protected WireInstrFinInstIdType wireInstrFinInstId;
    @XmlElement(name = "WireInstrFinInstName")
    protected WireInstrFinInstNameType wireInstrFinInstName;
    @XmlElement(name = "WireInstrFinInstAddr")
    protected AddrCType wireInstrFinInstAddr;
    @XmlElement(name = "WireDrwDwnCrFinInstAcctId")
    protected WireDrwDwnCrFinInstAcctIdType wireDrwDwnCrFinInstAcctId;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the wireOrignFinInstIdType property.
     * 
     * @return
     *     possible object is
     *     {@link WireFinInstIdTypeType }
     *     
     */
    public WireFinInstIdTypeType getWireOrignFinInstIdType() {
        return wireOrignFinInstIdType;
    }

    /**
     * Sets the value of the wireOrignFinInstIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireFinInstIdTypeType }
     *     
     */
    public void setWireOrignFinInstIdType(WireFinInstIdTypeType value) {
        this.wireOrignFinInstIdType = value;
    }

    /**
     * Gets the value of the wireOrignFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link WireOrignFinInstIdType }
     *     
     */
    public WireOrignFinInstIdType getWireOrignFinInstId() {
        return wireOrignFinInstId;
    }

    /**
     * Sets the value of the wireOrignFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireOrignFinInstIdType }
     *     
     */
    public void setWireOrignFinInstId(WireOrignFinInstIdType value) {
        this.wireOrignFinInstId = value;
    }

    /**
     * Gets the value of the wireOrignFinInstName property.
     * 
     * @return
     *     possible object is
     *     {@link WireOrignFinInstNameType }
     *     
     */
    public WireOrignFinInstNameType getWireOrignFinInstName() {
        return wireOrignFinInstName;
    }

    /**
     * Sets the value of the wireOrignFinInstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireOrignFinInstNameType }
     *     
     */
    public void setWireOrignFinInstName(WireOrignFinInstNameType value) {
        this.wireOrignFinInstName = value;
    }

    /**
     * Gets the value of the wireOrignFinInstAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getWireOrignFinInstAddr() {
        return wireOrignFinInstAddr;
    }

    /**
     * Sets the value of the wireOrignFinInstAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setWireOrignFinInstAddr(AddrCType value) {
        this.wireOrignFinInstAddr = value;
    }

    /**
     * Gets the value of the wireInstrFinInstIdType property.
     * 
     * @return
     *     possible object is
     *     {@link WireFinInstIdTypeType }
     *     
     */
    public WireFinInstIdTypeType getWireInstrFinInstIdType() {
        return wireInstrFinInstIdType;
    }

    /**
     * Sets the value of the wireInstrFinInstIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireFinInstIdTypeType }
     *     
     */
    public void setWireInstrFinInstIdType(WireFinInstIdTypeType value) {
        this.wireInstrFinInstIdType = value;
    }

    /**
     * Gets the value of the wireInstrFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link WireInstrFinInstIdType }
     *     
     */
    public WireInstrFinInstIdType getWireInstrFinInstId() {
        return wireInstrFinInstId;
    }

    /**
     * Sets the value of the wireInstrFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireInstrFinInstIdType }
     *     
     */
    public void setWireInstrFinInstId(WireInstrFinInstIdType value) {
        this.wireInstrFinInstId = value;
    }

    /**
     * Gets the value of the wireInstrFinInstName property.
     * 
     * @return
     *     possible object is
     *     {@link WireInstrFinInstNameType }
     *     
     */
    public WireInstrFinInstNameType getWireInstrFinInstName() {
        return wireInstrFinInstName;
    }

    /**
     * Sets the value of the wireInstrFinInstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireInstrFinInstNameType }
     *     
     */
    public void setWireInstrFinInstName(WireInstrFinInstNameType value) {
        this.wireInstrFinInstName = value;
    }

    /**
     * Gets the value of the wireInstrFinInstAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getWireInstrFinInstAddr() {
        return wireInstrFinInstAddr;
    }

    /**
     * Sets the value of the wireInstrFinInstAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setWireInstrFinInstAddr(AddrCType value) {
        this.wireInstrFinInstAddr = value;
    }

    /**
     * Gets the value of the wireDrwDwnCrFinInstAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link WireDrwDwnCrFinInstAcctIdType }
     *     
     */
    public WireDrwDwnCrFinInstAcctIdType getWireDrwDwnCrFinInstAcctId() {
        return wireDrwDwnCrFinInstAcctId;
    }

    /**
     * Sets the value of the wireDrwDwnCrFinInstAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireDrwDwnCrFinInstAcctIdType }
     *     
     */
    public void setWireDrwDwnCrFinInstAcctId(WireDrwDwnCrFinInstAcctIdType value) {
        this.wireDrwDwnCrFinInstAcctId = value;
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

}
