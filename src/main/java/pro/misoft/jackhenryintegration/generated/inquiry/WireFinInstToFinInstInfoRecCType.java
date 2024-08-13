
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
 * <p>Java class for WireFinInstToFinInstInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireFinInstToFinInstInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WirePmtMthd" type="{http://jackhenry.com/jxchange/TPG/2008}WirePmtMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireRecvFinInstRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireDrwDwnDrRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireIntmdFinInstRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireIntmdFinInstAdviceRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfFinInstRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfAdviceRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfIPmtMthdRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireFinInstToFinInstRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfFinInstAdviceRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
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
@XmlType(name = "WireFinInstToFinInstInfoRec_CType", propOrder = {
    "wirePmtMthd",
    "wireRecvFinInstRmkArray",
    "wireDrwDwnDrRmkArray",
    "wireIntmdFinInstRmkArray",
    "wireIntmdFinInstAdviceRmkArray",
    "wireBenfRmkArray",
    "wireBenfFinInstRmkArray",
    "wireBenfAdviceRmkArray",
    "wireBenfIPmtMthdRmkArray",
    "wireFinInstToFinInstRmkArray",
    "wireBenfFinInstAdviceRmkArray",
    "custom",
    "ver1",
    "any"
})
public class WireFinInstToFinInstInfoRecCType {

    @XmlElement(name = "WirePmtMthd")
    protected WirePmtMthdType wirePmtMthd;
    @XmlElement(name = "WireRecvFinInstRmkArray")
    protected RmkAType wireRecvFinInstRmkArray;
    @XmlElement(name = "WireDrwDwnDrRmkArray")
    protected RmkAType wireDrwDwnDrRmkArray;
    @XmlElement(name = "WireIntmdFinInstRmkArray")
    protected RmkAType wireIntmdFinInstRmkArray;
    @XmlElement(name = "WireIntmdFinInstAdviceRmkArray")
    protected RmkAType wireIntmdFinInstAdviceRmkArray;
    @XmlElement(name = "WireBenfRmkArray")
    protected RmkAType wireBenfRmkArray;
    @XmlElement(name = "WireBenfFinInstRmkArray")
    protected RmkAType wireBenfFinInstRmkArray;
    @XmlElement(name = "WireBenfAdviceRmkArray")
    protected RmkAType wireBenfAdviceRmkArray;
    @XmlElement(name = "WireBenfIPmtMthdRmkArray")
    protected RmkAType wireBenfIPmtMthdRmkArray;
    @XmlElement(name = "WireFinInstToFinInstRmkArray")
    protected RmkAType wireFinInstToFinInstRmkArray;
    @XmlElement(name = "WireBenfFinInstAdviceRmkArray")
    protected RmkAType wireBenfFinInstAdviceRmkArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the wirePmtMthd property.
     * 
     * @return
     *     possible object is
     *     {@link WirePmtMthdType }
     *     
     */
    public WirePmtMthdType getWirePmtMthd() {
        return wirePmtMthd;
    }

    /**
     * Sets the value of the wirePmtMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WirePmtMthdType }
     *     
     */
    public void setWirePmtMthd(WirePmtMthdType value) {
        this.wirePmtMthd = value;
    }

    /**
     * Gets the value of the wireRecvFinInstRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireRecvFinInstRmkArray() {
        return wireRecvFinInstRmkArray;
    }

    /**
     * Sets the value of the wireRecvFinInstRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireRecvFinInstRmkArray(RmkAType value) {
        this.wireRecvFinInstRmkArray = value;
    }

    /**
     * Gets the value of the wireDrwDwnDrRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireDrwDwnDrRmkArray() {
        return wireDrwDwnDrRmkArray;
    }

    /**
     * Sets the value of the wireDrwDwnDrRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireDrwDwnDrRmkArray(RmkAType value) {
        this.wireDrwDwnDrRmkArray = value;
    }

    /**
     * Gets the value of the wireIntmdFinInstRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireIntmdFinInstRmkArray() {
        return wireIntmdFinInstRmkArray;
    }

    /**
     * Sets the value of the wireIntmdFinInstRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireIntmdFinInstRmkArray(RmkAType value) {
        this.wireIntmdFinInstRmkArray = value;
    }

    /**
     * Gets the value of the wireIntmdFinInstAdviceRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireIntmdFinInstAdviceRmkArray() {
        return wireIntmdFinInstAdviceRmkArray;
    }

    /**
     * Sets the value of the wireIntmdFinInstAdviceRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireIntmdFinInstAdviceRmkArray(RmkAType value) {
        this.wireIntmdFinInstAdviceRmkArray = value;
    }

    /**
     * Gets the value of the wireBenfRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireBenfRmkArray() {
        return wireBenfRmkArray;
    }

    /**
     * Sets the value of the wireBenfRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireBenfRmkArray(RmkAType value) {
        this.wireBenfRmkArray = value;
    }

    /**
     * Gets the value of the wireBenfFinInstRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireBenfFinInstRmkArray() {
        return wireBenfFinInstRmkArray;
    }

    /**
     * Sets the value of the wireBenfFinInstRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireBenfFinInstRmkArray(RmkAType value) {
        this.wireBenfFinInstRmkArray = value;
    }

    /**
     * Gets the value of the wireBenfAdviceRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireBenfAdviceRmkArray() {
        return wireBenfAdviceRmkArray;
    }

    /**
     * Sets the value of the wireBenfAdviceRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireBenfAdviceRmkArray(RmkAType value) {
        this.wireBenfAdviceRmkArray = value;
    }

    /**
     * Gets the value of the wireBenfIPmtMthdRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireBenfIPmtMthdRmkArray() {
        return wireBenfIPmtMthdRmkArray;
    }

    /**
     * Sets the value of the wireBenfIPmtMthdRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireBenfIPmtMthdRmkArray(RmkAType value) {
        this.wireBenfIPmtMthdRmkArray = value;
    }

    /**
     * Gets the value of the wireFinInstToFinInstRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireFinInstToFinInstRmkArray() {
        return wireFinInstToFinInstRmkArray;
    }

    /**
     * Sets the value of the wireFinInstToFinInstRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireFinInstToFinInstRmkArray(RmkAType value) {
        this.wireFinInstToFinInstRmkArray = value;
    }

    /**
     * Gets the value of the wireBenfFinInstAdviceRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireBenfFinInstAdviceRmkArray() {
        return wireBenfFinInstAdviceRmkArray;
    }

    /**
     * Sets the value of the wireBenfFinInstAdviceRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireBenfFinInstAdviceRmkArray(RmkAType value) {
        this.wireBenfFinInstAdviceRmkArray = value;
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
