
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
 * <p>Java class for CustMsgInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustMsgInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Msg" type="{http://jackhenry.com/jxchange/TPG/2008}Msg_Type" minOccurs="0"/&gt;
 *         &lt;element name="MsgExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}MsgExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="MsgImpor" type="{http://jackhenry.com/jxchange/TPG/2008}MsgImpor_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}OffInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="MsgNxtRevDt" type="{http://jackhenry.com/jxchange/TPG/2008}MsgNxtRevDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="MsgPrtNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}MsgPrtNotCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CustMsgInfoRec_CType", propOrder = {
    "msg",
    "msgExpDt",
    "userDefInfoArray",
    "msgImpor",
    "offInfoArray",
    "custom",
    "ver1",
    "msgNxtRevDt",
    "msgPrtNotCode",
    "ver2",
    "any"
})
public class CustMsgInfoRecCType {

    @XmlElementRef(name = "Msg", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MsgType> msg;
    @XmlElementRef(name = "MsgExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MsgExpDtType> msgExpDt;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElementRef(name = "MsgImpor", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MsgImporType> msgImpor;
    @XmlElement(name = "OffInfoArray")
    protected OffInfoArrayAType offInfoArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "MsgNxtRevDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MsgNxtRevDtType> msgNxtRevDt;
    @XmlElementRef(name = "MsgPrtNotCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MsgPrtNotCodeType> msgPrtNotCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MsgType }{@code >}
     *     
     */
    public JAXBElement<MsgType> getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MsgType }{@code >}
     *     
     */
    public void setMsg(JAXBElement<MsgType> value) {
        this.msg = value;
    }

    /**
     * Gets the value of the msgExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MsgExpDtType }{@code >}
     *     
     */
    public JAXBElement<MsgExpDtType> getMsgExpDt() {
        return msgExpDt;
    }

    /**
     * Sets the value of the msgExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MsgExpDtType }{@code >}
     *     
     */
    public void setMsgExpDt(JAXBElement<MsgExpDtType> value) {
        this.msgExpDt = value;
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
     * Gets the value of the msgImpor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MsgImporType }{@code >}
     *     
     */
    public JAXBElement<MsgImporType> getMsgImpor() {
        return msgImpor;
    }

    /**
     * Sets the value of the msgImpor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MsgImporType }{@code >}
     *     
     */
    public void setMsgImpor(JAXBElement<MsgImporType> value) {
        this.msgImpor = value;
    }

    /**
     * Gets the value of the offInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link OffInfoArrayAType }
     *     
     */
    public OffInfoArrayAType getOffInfoArray() {
        return offInfoArray;
    }

    /**
     * Sets the value of the offInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffInfoArrayAType }
     *     
     */
    public void setOffInfoArray(OffInfoArrayAType value) {
        this.offInfoArray = value;
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
     * Gets the value of the msgNxtRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MsgNxtRevDtType }{@code >}
     *     
     */
    public JAXBElement<MsgNxtRevDtType> getMsgNxtRevDt() {
        return msgNxtRevDt;
    }

    /**
     * Sets the value of the msgNxtRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MsgNxtRevDtType }{@code >}
     *     
     */
    public void setMsgNxtRevDt(JAXBElement<MsgNxtRevDtType> value) {
        this.msgNxtRevDt = value;
    }

    /**
     * Gets the value of the msgPrtNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MsgPrtNotCodeType }{@code >}
     *     
     */
    public JAXBElement<MsgPrtNotCodeType> getMsgPrtNotCode() {
        return msgPrtNotCode;
    }

    /**
     * Sets the value of the msgPrtNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MsgPrtNotCodeType }{@code >}
     *     
     */
    public void setMsgPrtNotCode(JAXBElement<MsgPrtNotCodeType> value) {
        this.msgPrtNotCode = value;
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
