
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
 * <p>Java class for IntnetFinInstAcctIdAddRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetFinInstAcctIdAddRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="ErrOvrRdInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ErrOvrRdInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="IntnetFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstId_Type"/&gt;
 *         &lt;element name="IntnetFinInstAcctIdInfo" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstAcctIdInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="IntnetFinInstACHXferInfo" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstACHXferInfo_CType" minOccurs="0"/&gt;
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
@XmlType(name = "IntnetFinInstAcctIdAddRq_MType", propOrder = {
    "msgRqHdr",
    "errOvrRdInfoArray",
    "intnetFinInstId",
    "intnetFinInstAcctIdInfo",
    "custom",
    "ver1",
    "intnetFinInstACHXferInfo",
    "ver2",
    "any"
})
public class IntnetFinInstAcctIdAddRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "ErrOvrRdInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrOvrRdInfoArrayAType> errOvrRdInfoArray;
    @XmlElement(name = "IntnetFinInstId", required = true)
    protected IntnetFinInstIdType intnetFinInstId;
    @XmlElementRef(name = "IntnetFinInstAcctIdInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntnetFinInstAcctIdInfoCType> intnetFinInstAcctIdInfo;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "IntnetFinInstACHXferInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntnetFinInstACHXferInfoCType> intnetFinInstACHXferInfo;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public MsgRqHdrCType getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Sets the value of the msgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public void setMsgRqHdr(MsgRqHdrCType value) {
        this.msgRqHdr = value;
    }

    /**
     * Gets the value of the errOvrRdInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}
     *     
     */
    public JAXBElement<ErrOvrRdInfoArrayAType> getErrOvrRdInfoArray() {
        return errOvrRdInfoArray;
    }

    /**
     * Sets the value of the errOvrRdInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}
     *     
     */
    public void setErrOvrRdInfoArray(JAXBElement<ErrOvrRdInfoArrayAType> value) {
        this.errOvrRdInfoArray = value;
    }

    /**
     * Gets the value of the intnetFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetFinInstIdType }
     *     
     */
    public IntnetFinInstIdType getIntnetFinInstId() {
        return intnetFinInstId;
    }

    /**
     * Sets the value of the intnetFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetFinInstIdType }
     *     
     */
    public void setIntnetFinInstId(IntnetFinInstIdType value) {
        this.intnetFinInstId = value;
    }

    /**
     * Gets the value of the intnetFinInstAcctIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstAcctIdInfoCType }{@code >}
     *     
     */
    public JAXBElement<IntnetFinInstAcctIdInfoCType> getIntnetFinInstAcctIdInfo() {
        return intnetFinInstAcctIdInfo;
    }

    /**
     * Sets the value of the intnetFinInstAcctIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstAcctIdInfoCType }{@code >}
     *     
     */
    public void setIntnetFinInstAcctIdInfo(JAXBElement<IntnetFinInstAcctIdInfoCType> value) {
        this.intnetFinInstAcctIdInfo = value;
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
     * Gets the value of the intnetFinInstACHXferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstACHXferInfoCType }{@code >}
     *     
     */
    public JAXBElement<IntnetFinInstACHXferInfoCType> getIntnetFinInstACHXferInfo() {
        return intnetFinInstACHXferInfo;
    }

    /**
     * Sets the value of the intnetFinInstACHXferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstACHXferInfoCType }{@code >}
     *     
     */
    public void setIntnetFinInstACHXferInfo(JAXBElement<IntnetFinInstACHXferInfoCType> value) {
        this.intnetFinInstACHXferInfo = value;
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
