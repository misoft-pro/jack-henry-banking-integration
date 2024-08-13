
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
 * <p>Java class for WireTrnInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireTrnInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireTrnInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireTrnInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}WireAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}WireStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="WireIMAD" type="{http://jackhenry.com/jxchange/TPG/2008}WireIMAD_Type" minOccurs="0"/&gt;
 *           &lt;element name="WireOMAD" type="{http://jackhenry.com/jxchange/TPG/2008}WireOMAD_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "WireTrnInqRec_CType", propOrder = {
    "wireTrnInfoRec",
    "wireAcctId",
    "wireAcctType",
    "wireStatDesc",
    "custom",
    "ver1",
    "wireIMAD",
    "wireOMAD",
    "ver2",
    "any"
})
public class WireTrnInqRecCType {

    @XmlElement(name = "WireTrnInfoRec")
    protected WireTrnInfoRecCType wireTrnInfoRec;
    @XmlElement(name = "WireAcctId")
    protected WireAcctIdType wireAcctId;
    @XmlElement(name = "WireAcctType")
    protected AcctTypeType wireAcctType;
    @XmlElement(name = "WireStatDesc")
    protected WireStatDescType wireStatDesc;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "WireIMAD")
    protected WireIMADType wireIMAD;
    @XmlElement(name = "WireOMAD")
    protected WireOMADType wireOMAD;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the wireTrnInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WireTrnInfoRecCType }
     *     
     */
    public WireTrnInfoRecCType getWireTrnInfoRec() {
        return wireTrnInfoRec;
    }

    /**
     * Sets the value of the wireTrnInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTrnInfoRecCType }
     *     
     */
    public void setWireTrnInfoRec(WireTrnInfoRecCType value) {
        this.wireTrnInfoRec = value;
    }

    /**
     * Gets the value of the wireAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link WireAcctIdType }
     *     
     */
    public WireAcctIdType getWireAcctId() {
        return wireAcctId;
    }

    /**
     * Sets the value of the wireAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireAcctIdType }
     *     
     */
    public void setWireAcctId(WireAcctIdType value) {
        this.wireAcctId = value;
    }

    /**
     * Gets the value of the wireAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getWireAcctType() {
        return wireAcctType;
    }

    /**
     * Sets the value of the wireAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setWireAcctType(AcctTypeType value) {
        this.wireAcctType = value;
    }

    /**
     * Gets the value of the wireStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link WireStatDescType }
     *     
     */
    public WireStatDescType getWireStatDesc() {
        return wireStatDesc;
    }

    /**
     * Sets the value of the wireStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireStatDescType }
     *     
     */
    public void setWireStatDesc(WireStatDescType value) {
        this.wireStatDesc = value;
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
     * Gets the value of the wireIMAD property.
     * 
     * @return
     *     possible object is
     *     {@link WireIMADType }
     *     
     */
    public WireIMADType getWireIMAD() {
        return wireIMAD;
    }

    /**
     * Sets the value of the wireIMAD property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireIMADType }
     *     
     */
    public void setWireIMAD(WireIMADType value) {
        this.wireIMAD = value;
    }

    /**
     * Gets the value of the wireOMAD property.
     * 
     * @return
     *     possible object is
     *     {@link WireOMADType }
     *     
     */
    public WireOMADType getWireOMAD() {
        return wireOMAD;
    }

    /**
     * Sets the value of the wireOMAD property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireOMADType }
     *     
     */
    public void setWireOMAD(WireOMADType value) {
        this.wireOMAD = value;
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
