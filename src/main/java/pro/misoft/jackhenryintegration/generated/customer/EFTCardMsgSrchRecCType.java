
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
 * <p>Java class for EFTCardMsgSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardMsgSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardSufxNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardSufxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="MsgSeq" type="{http://jackhenry.com/jxchange/TPG/2008}MsgSeq_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardMsgInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardMsgInfoRec_CType" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardMsgSrchRec_CType", propOrder = {
    "eftCardSufxNum",
    "msgSeq",
    "eftCardMsgInfoRec",
    "custom",
    "ver1",
    "any"
})
public class EFTCardMsgSrchRecCType {

    @XmlElement(name = "EFTCardSufxNum")
    protected EFTCardSufxNumType eftCardSufxNum;
    @XmlElement(name = "MsgSeq")
    protected MsgSeqType msgSeq;
    @XmlElement(name = "EFTCardMsgInfoRec")
    protected EFTCardMsgInfoRecCType eftCardMsgInfoRec;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftCardSufxNum property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardSufxNumType }
     *     
     */
    public EFTCardSufxNumType getEFTCardSufxNum() {
        return eftCardSufxNum;
    }

    /**
     * Sets the value of the eftCardSufxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardSufxNumType }
     *     
     */
    public void setEFTCardSufxNum(EFTCardSufxNumType value) {
        this.eftCardSufxNum = value;
    }

    /**
     * Gets the value of the msgSeq property.
     * 
     * @return
     *     possible object is
     *     {@link MsgSeqType }
     *     
     */
    public MsgSeqType getMsgSeq() {
        return msgSeq;
    }

    /**
     * Sets the value of the msgSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgSeqType }
     *     
     */
    public void setMsgSeq(MsgSeqType value) {
        this.msgSeq = value;
    }

    /**
     * Gets the value of the eftCardMsgInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardMsgInfoRecCType }
     *     
     */
    public EFTCardMsgInfoRecCType getEFTCardMsgInfoRec() {
        return eftCardMsgInfoRec;
    }

    /**
     * Sets the value of the eftCardMsgInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardMsgInfoRecCType }
     *     
     */
    public void setEFTCardMsgInfoRec(EFTCardMsgInfoRecCType value) {
        this.eftCardMsgInfoRec = value;
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
