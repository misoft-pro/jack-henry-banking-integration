
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * a package of data related to the messages on a
 *                 Card
 * 
 * <p>Java class for EFTCardMsgInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardMsgInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Msg" type="{http://jackhenry.com/jxchange/TPG/2008}Msg_Type" minOccurs="0"/&gt;
 *         &lt;element name="MsgExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}MsgExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MsgPlacedDt" type="{http://jackhenry.com/jxchange/TPG/2008}MsgPlacedDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardMsgInfoRec_CType", propOrder = {
    "msg",
    "msgExpDt",
    "msgPlacedDt",
    "custom",
    "ver1",
    "any"
})
public class EFTCardMsgInfoRecCType {

    @XmlElement(name = "Msg")
    protected MsgType msg;
    @XmlElement(name = "MsgExpDt")
    protected MsgExpDtType msgExpDt;
    @XmlElement(name = "MsgPlacedDt")
    protected MsgPlacedDtType msgPlacedDt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link MsgType }
     *     
     */
    public MsgType getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgType }
     *     
     */
    public void setMsg(MsgType value) {
        this.msg = value;
    }

    /**
     * Gets the value of the msgExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link MsgExpDtType }
     *     
     */
    public MsgExpDtType getMsgExpDt() {
        return msgExpDt;
    }

    /**
     * Sets the value of the msgExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgExpDtType }
     *     
     */
    public void setMsgExpDt(MsgExpDtType value) {
        this.msgExpDt = value;
    }

    /**
     * Gets the value of the msgPlacedDt property.
     * 
     * @return
     *     possible object is
     *     {@link MsgPlacedDtType }
     *     
     */
    public MsgPlacedDtType getMsgPlacedDt() {
        return msgPlacedDt;
    }

    /**
     * Sets the value of the msgPlacedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgPlacedDtType }
     *     
     */
    public void setMsgPlacedDt(MsgPlacedDtType value) {
        this.msgPlacedDt = value;
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
