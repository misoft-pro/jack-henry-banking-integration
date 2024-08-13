
package pro.misoft.jackhenryintegration.generated.transaction;

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
 * <p>Java class for XferAddRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferAddRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="ErrOvrRdInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ErrOvrRdInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="AcctIdFrom" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdFrom_CType"/&gt;
 *         &lt;element name="AcctIdTo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdTo_CType" minOccurs="0"/&gt;
 *         &lt;element name="XferRec" type="{http://jackhenry.com/jxchange/TPG/2008}XferRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="XferType" type="{http://jackhenry.com/jxchange/TPG/2008}XferType_Type" minOccurs="0"/&gt;
 *           &lt;element name="ACHXferRec" type="{http://jackhenry.com/jxchange/TPG/2008}ACHXferRec_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="FutXferRec" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferRec_CType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
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
@XmlType(name = "XferAddRq_MType", propOrder = {
    "msgRqHdr",
    "errOvrRdInfoArray",
    "acctIdFrom",
    "acctIdTo",
    "xferRec",
    "custom",
    "ver1",
    "xferType",
    "achXferRec",
    "ver2",
    "futXferRec",
    "ver3",
    "any"
})
public class XferAddRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "ErrOvrRdInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrOvrRdInfoArrayAType> errOvrRdInfoArray;
    @XmlElement(name = "AcctIdFrom", required = true)
    protected AcctIdFromCType acctIdFrom;
    @XmlElementRef(name = "AcctIdTo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctIdToCType> acctIdTo;
    @XmlElementRef(name = "XferRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferRecCType> xferRec;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "XferType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferTypeType> xferType;
    @XmlElementRef(name = "ACHXferRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHXferRecCType> achXferRec;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "FutXferRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferRecCType> futXferRec;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
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
     * Gets the value of the acctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdFromCType }
     *     
     */
    public AcctIdFromCType getAcctIdFrom() {
        return acctIdFrom;
    }

    /**
     * Sets the value of the acctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdFromCType }
     *     
     */
    public void setAcctIdFrom(AcctIdFromCType value) {
        this.acctIdFrom = value;
    }

    /**
     * Gets the value of the acctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctIdToCType }{@code >}
     *     
     */
    public JAXBElement<AcctIdToCType> getAcctIdTo() {
        return acctIdTo;
    }

    /**
     * Sets the value of the acctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctIdToCType }{@code >}
     *     
     */
    public void setAcctIdTo(JAXBElement<AcctIdToCType> value) {
        this.acctIdTo = value;
    }

    /**
     * Gets the value of the xferRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferRecCType }{@code >}
     *     
     */
    public JAXBElement<XferRecCType> getXferRec() {
        return xferRec;
    }

    /**
     * Sets the value of the xferRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferRecCType }{@code >}
     *     
     */
    public void setXferRec(JAXBElement<XferRecCType> value) {
        this.xferRec = value;
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
     * Gets the value of the xferType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferTypeType }{@code >}
     *     
     */
    public JAXBElement<XferTypeType> getXferType() {
        return xferType;
    }

    /**
     * Sets the value of the xferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferTypeType }{@code >}
     *     
     */
    public void setXferType(JAXBElement<XferTypeType> value) {
        this.xferType = value;
    }

    /**
     * Gets the value of the achXferRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHXferRecCType }{@code >}
     *     
     */
    public JAXBElement<ACHXferRecCType> getACHXferRec() {
        return achXferRec;
    }

    /**
     * Sets the value of the achXferRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHXferRecCType }{@code >}
     *     
     */
    public void setACHXferRec(JAXBElement<ACHXferRecCType> value) {
        this.achXferRec = value;
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
     * Gets the value of the futXferRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferRecCType }{@code >}
     *     
     */
    public JAXBElement<FutXferRecCType> getFutXferRec() {
        return futXferRec;
    }

    /**
     * Sets the value of the futXferRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferRecCType }{@code >}
     *     
     */
    public void setFutXferRec(JAXBElement<FutXferRecCType> value) {
        this.futXferRec = value;
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
