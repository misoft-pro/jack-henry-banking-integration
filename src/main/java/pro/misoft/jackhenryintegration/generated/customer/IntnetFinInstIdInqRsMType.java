
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for IntnetFinInstIdInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetFinInstIdInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="IntnetFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstId_Type" minOccurs="0"/&gt;
 *         &lt;element name="x_IntnetInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_IntnetInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_IntnetXferInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_IntnetXferInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_IntnetAccessInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_IntnetAccessInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_IntnetValidXferInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_IntnetValidXferInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_IntnetCashMgmtInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_IntnetCashMgmtInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="x_BilPayInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_BilPayInfoRec_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ActIntent" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntent_Type" minOccurs="0"/&gt;
 *             &lt;element name="ActIntentKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "IntnetFinInstIdInqRs_MType", propOrder = {
    "msgRsHdr",
    "intnetFinInstId",
    "xIntnetInfoRec",
    "xIntnetXferInfoRec",
    "xIntnetAccessInfoRec",
    "xIntnetValidXferInfoRec",
    "xIntnetCashMgmtInfoRec",
    "custom",
    "ver1",
    "xBilPayInfoRec",
    "ver2",
    "actIntent",
    "actIntentKey",
    "ver3",
    "any"
})
public class IntnetFinInstIdInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "IntnetFinInstId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntnetFinInstIdType> intnetFinInstId;
    @XmlElementRef(name = "x_IntnetInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XIntnetInfoRecCType> xIntnetInfoRec;
    @XmlElementRef(name = "x_IntnetXferInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XIntnetXferInfoRecCType> xIntnetXferInfoRec;
    @XmlElementRef(name = "x_IntnetAccessInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XIntnetAccessInfoRecCType> xIntnetAccessInfoRec;
    @XmlElementRef(name = "x_IntnetValidXferInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XIntnetValidXferInfoRecCType> xIntnetValidXferInfoRec;
    @XmlElementRef(name = "x_IntnetCashMgmtInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XIntnetCashMgmtInfoRecCType> xIntnetCashMgmtInfoRec;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "x_BilPayInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XBilPayInfoRecCType> xBilPayInfoRec;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "ActIntent", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentType> actIntent;
    @XmlElementRef(name = "ActIntentKey", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentKeyType> actIntentKey;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public MsgRsHdrCType getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Sets the value of the msgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public void setMsgRsHdr(MsgRsHdrCType value) {
        this.msgRsHdr = value;
    }

    /**
     * Gets the value of the intnetFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstIdType }{@code >}
     *     
     */
    public JAXBElement<IntnetFinInstIdType> getIntnetFinInstId() {
        return intnetFinInstId;
    }

    /**
     * Sets the value of the intnetFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstIdType }{@code >}
     *     
     */
    public void setIntnetFinInstId(JAXBElement<IntnetFinInstIdType> value) {
        this.intnetFinInstId = value;
    }

    /**
     * Gets the value of the xIntnetInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XIntnetInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<XIntnetInfoRecCType> getXIntnetInfoRec() {
        return xIntnetInfoRec;
    }

    /**
     * Sets the value of the xIntnetInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XIntnetInfoRecCType }{@code >}
     *     
     */
    public void setXIntnetInfoRec(JAXBElement<XIntnetInfoRecCType> value) {
        this.xIntnetInfoRec = value;
    }

    /**
     * Gets the value of the xIntnetXferInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XIntnetXferInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<XIntnetXferInfoRecCType> getXIntnetXferInfoRec() {
        return xIntnetXferInfoRec;
    }

    /**
     * Sets the value of the xIntnetXferInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XIntnetXferInfoRecCType }{@code >}
     *     
     */
    public void setXIntnetXferInfoRec(JAXBElement<XIntnetXferInfoRecCType> value) {
        this.xIntnetXferInfoRec = value;
    }

    /**
     * Gets the value of the xIntnetAccessInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XIntnetAccessInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<XIntnetAccessInfoRecCType> getXIntnetAccessInfoRec() {
        return xIntnetAccessInfoRec;
    }

    /**
     * Sets the value of the xIntnetAccessInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XIntnetAccessInfoRecCType }{@code >}
     *     
     */
    public void setXIntnetAccessInfoRec(JAXBElement<XIntnetAccessInfoRecCType> value) {
        this.xIntnetAccessInfoRec = value;
    }

    /**
     * Gets the value of the xIntnetValidXferInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XIntnetValidXferInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<XIntnetValidXferInfoRecCType> getXIntnetValidXferInfoRec() {
        return xIntnetValidXferInfoRec;
    }

    /**
     * Sets the value of the xIntnetValidXferInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XIntnetValidXferInfoRecCType }{@code >}
     *     
     */
    public void setXIntnetValidXferInfoRec(JAXBElement<XIntnetValidXferInfoRecCType> value) {
        this.xIntnetValidXferInfoRec = value;
    }

    /**
     * Gets the value of the xIntnetCashMgmtInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XIntnetCashMgmtInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<XIntnetCashMgmtInfoRecCType> getXIntnetCashMgmtInfoRec() {
        return xIntnetCashMgmtInfoRec;
    }

    /**
     * Sets the value of the xIntnetCashMgmtInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XIntnetCashMgmtInfoRecCType }{@code >}
     *     
     */
    public void setXIntnetCashMgmtInfoRec(JAXBElement<XIntnetCashMgmtInfoRecCType> value) {
        this.xIntnetCashMgmtInfoRec = value;
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
     * Gets the value of the xBilPayInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XBilPayInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<XBilPayInfoRecCType> getXBilPayInfoRec() {
        return xBilPayInfoRec;
    }

    /**
     * Sets the value of the xBilPayInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XBilPayInfoRecCType }{@code >}
     *     
     */
    public void setXBilPayInfoRec(JAXBElement<XBilPayInfoRecCType> value) {
        this.xBilPayInfoRec = value;
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
     * Gets the value of the actIntent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public JAXBElement<ActIntentType> getActIntent() {
        return actIntent;
    }

    /**
     * Sets the value of the actIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public void setActIntent(JAXBElement<ActIntentType> value) {
        this.actIntent = value;
    }

    /**
     * Gets the value of the actIntentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public JAXBElement<ActIntentKeyType> getActIntentKey() {
        return actIntentKey;
    }

    /**
     * Sets the value of the actIntentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public void setActIntentKey(JAXBElement<ActIntentKeyType> value) {
        this.actIntentKey = value;
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
