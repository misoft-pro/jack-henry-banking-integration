
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for WireIntlTrnInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireIntlTrnInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireNotType" type="{http://jackhenry.com/jxchange/TPG/2008}WireNotType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSrc" type="{http://jackhenry.com/jxchange/TPG/2008}WireSrc_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurrType" type="{http://jackhenry.com/jxchange/TPG/2008}CurrType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Cntry" type="{http://jackhenry.com/jxchange/TPG/2008}CntryType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireIntlBenfInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireIntlBenfInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignToBenfInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireOrignToBenfInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireRecvFinInstRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
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
@XmlType(name = "WireIntlTrnInfoRec_CType", propOrder = {
    "wireNotType",
    "wireSrc",
    "wireAmt",
    "currType",
    "cntry",
    "wireIntlBenfInfoRec",
    "wireOrignToBenfInfoRec",
    "wireRecvFinInstRmkArray",
    "custom",
    "ver1",
    "any"
})
public class WireIntlTrnInfoRecCType {

    @XmlElement(name = "WireNotType")
    protected WireNotTypeType wireNotType;
    @XmlElement(name = "WireSrc")
    protected WireSrcType wireSrc;
    @XmlElement(name = "WireAmt")
    protected WireAmtType wireAmt;
    @XmlElement(name = "CurrType")
    protected CurrTypeType currType;
    @XmlElement(name = "Cntry")
    protected CntryTypeType cntry;
    @XmlElement(name = "WireIntlBenfInfoRec")
    protected WireIntlBenfInfoRecCType wireIntlBenfInfoRec;
    @XmlElement(name = "WireOrignToBenfInfoRec")
    protected WireOrignToBenfInfoRecCType wireOrignToBenfInfoRec;
    @XmlElement(name = "WireRecvFinInstRmkArray")
    protected RmkAType wireRecvFinInstRmkArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the wireNotType property.
     * 
     * @return
     *     possible object is
     *     {@link WireNotTypeType }
     *     
     */
    public WireNotTypeType getWireNotType() {
        return wireNotType;
    }

    /**
     * Sets the value of the wireNotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireNotTypeType }
     *     
     */
    public void setWireNotType(WireNotTypeType value) {
        this.wireNotType = value;
    }

    /**
     * Gets the value of the wireSrc property.
     * 
     * @return
     *     possible object is
     *     {@link WireSrcType }
     *     
     */
    public WireSrcType getWireSrc() {
        return wireSrc;
    }

    /**
     * Sets the value of the wireSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireSrcType }
     *     
     */
    public void setWireSrc(WireSrcType value) {
        this.wireSrc = value;
    }

    /**
     * Gets the value of the wireAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WireAmtType }
     *     
     */
    public WireAmtType getWireAmt() {
        return wireAmt;
    }

    /**
     * Sets the value of the wireAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireAmtType }
     *     
     */
    public void setWireAmt(WireAmtType value) {
        this.wireAmt = value;
    }

    /**
     * Gets the value of the currType property.
     * 
     * @return
     *     possible object is
     *     {@link CurrTypeType }
     *     
     */
    public CurrTypeType getCurrType() {
        return currType;
    }

    /**
     * Sets the value of the currType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrTypeType }
     *     
     */
    public void setCurrType(CurrTypeType value) {
        this.currType = value;
    }

    /**
     * Gets the value of the cntry property.
     * 
     * @return
     *     possible object is
     *     {@link CntryTypeType }
     *     
     */
    public CntryTypeType getCntry() {
        return cntry;
    }

    /**
     * Sets the value of the cntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryTypeType }
     *     
     */
    public void setCntry(CntryTypeType value) {
        this.cntry = value;
    }

    /**
     * Gets the value of the wireIntlBenfInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WireIntlBenfInfoRecCType }
     *     
     */
    public WireIntlBenfInfoRecCType getWireIntlBenfInfoRec() {
        return wireIntlBenfInfoRec;
    }

    /**
     * Sets the value of the wireIntlBenfInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireIntlBenfInfoRecCType }
     *     
     */
    public void setWireIntlBenfInfoRec(WireIntlBenfInfoRecCType value) {
        this.wireIntlBenfInfoRec = value;
    }

    /**
     * Gets the value of the wireOrignToBenfInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WireOrignToBenfInfoRecCType }
     *     
     */
    public WireOrignToBenfInfoRecCType getWireOrignToBenfInfoRec() {
        return wireOrignToBenfInfoRec;
    }

    /**
     * Sets the value of the wireOrignToBenfInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireOrignToBenfInfoRecCType }
     *     
     */
    public void setWireOrignToBenfInfoRec(WireOrignToBenfInfoRecCType value) {
        this.wireOrignToBenfInfoRec = value;
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
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
