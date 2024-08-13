
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
 * <p>Java class for CustMsgInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustMsgInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustMsgInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CustMsgInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="MsgCat" type="{http://jackhenry.com/jxchange/TPG/2008}MsgCat_Type" minOccurs="0"/&gt;
 *         &lt;element name="MsgType" type="{http://jackhenry.com/jxchange/TPG/2008}MsgType_Type" minOccurs="0"/&gt;
 *         &lt;element name="MsgPrtNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MsgPrtNotDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChngTime" type="{http://jackhenry.com/jxchange/TPG/2008}ChngTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="MsgAuditUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}AuditUsrId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CustMsgInqRec_CType", propOrder = {
    "custMsgInfoRec",
    "msgCat",
    "msgType",
    "msgPrtNotDesc",
    "chngTime",
    "msgAuditUsrId",
    "custom",
    "ver1",
    "any"
})
public class CustMsgInqRecCType {

    @XmlElement(name = "CustMsgInfoRec")
    protected CustMsgInfoRecCType custMsgInfoRec;
    @XmlElement(name = "MsgCat")
    protected MsgCatType msgCat;
    @XmlElement(name = "MsgType")
    protected MsgTypeType msgType;
    @XmlElement(name = "MsgPrtNotDesc")
    protected MsgPrtNotDescType msgPrtNotDesc;
    @XmlElement(name = "ChngTime")
    protected ChngTimeType chngTime;
    @XmlElement(name = "MsgAuditUsrId")
    protected AuditUsrIdType msgAuditUsrId;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the custMsgInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustMsgInfoRecCType }
     *     
     */
    public CustMsgInfoRecCType getCustMsgInfoRec() {
        return custMsgInfoRec;
    }

    /**
     * Sets the value of the custMsgInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustMsgInfoRecCType }
     *     
     */
    public void setCustMsgInfoRec(CustMsgInfoRecCType value) {
        this.custMsgInfoRec = value;
    }

    /**
     * Gets the value of the msgCat property.
     * 
     * @return
     *     possible object is
     *     {@link MsgCatType }
     *     
     */
    public MsgCatType getMsgCat() {
        return msgCat;
    }

    /**
     * Sets the value of the msgCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgCatType }
     *     
     */
    public void setMsgCat(MsgCatType value) {
        this.msgCat = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link MsgTypeType }
     *     
     */
    public MsgTypeType getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgTypeType }
     *     
     */
    public void setMsgType(MsgTypeType value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the msgPrtNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MsgPrtNotDescType }
     *     
     */
    public MsgPrtNotDescType getMsgPrtNotDesc() {
        return msgPrtNotDesc;
    }

    /**
     * Sets the value of the msgPrtNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgPrtNotDescType }
     *     
     */
    public void setMsgPrtNotDesc(MsgPrtNotDescType value) {
        this.msgPrtNotDesc = value;
    }

    /**
     * Gets the value of the chngTime property.
     * 
     * @return
     *     possible object is
     *     {@link ChngTimeType }
     *     
     */
    public ChngTimeType getChngTime() {
        return chngTime;
    }

    /**
     * Sets the value of the chngTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChngTimeType }
     *     
     */
    public void setChngTime(ChngTimeType value) {
        this.chngTime = value;
    }

    /**
     * Gets the value of the msgAuditUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link AuditUsrIdType }
     *     
     */
    public AuditUsrIdType getMsgAuditUsrId() {
        return msgAuditUsrId;
    }

    /**
     * Sets the value of the msgAuditUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditUsrIdType }
     *     
     */
    public void setMsgAuditUsrId(AuditUsrIdType value) {
        this.msgAuditUsrId = value;
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
