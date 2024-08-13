
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CustMsgSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustMsgSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Msg" type="{http://jackhenry.com/jxchange/TPG/2008}Msg_Type" minOccurs="0"/&gt;
 *         &lt;element name="StartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="MsgCat" type="{http://jackhenry.com/jxchange/TPG/2008}MsgCat_Type" minOccurs="0"/&gt;
 *         &lt;element name="MsgType" type="{http://jackhenry.com/jxchange/TPG/2008}MsgType_Type" minOccurs="0"/&gt;
 *         &lt;element name="MsgImpor" type="{http://jackhenry.com/jxchange/TPG/2008}MsgImpor_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="MsgSeq" type="{http://jackhenry.com/jxchange/TPG/2008}MsgSeq_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomCustMsgSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="MsgExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}MsgExpDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="MsgNxtRevDt" type="{http://jackhenry.com/jxchange/TPG/2008}MsgNxtRevDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="MsgPrtNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}MsgPrtNotCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="MsgPrtNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MsgPrtNotDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="ChngTime" type="{http://jackhenry.com/jxchange/TPG/2008}ChngTime_Type" minOccurs="0"/&gt;
 *               &lt;element name="MsgAuditUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}AuditUsrId_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustMsgSrchRec_CType", propOrder = {
    "msg",
    "startDt",
    "endDt",
    "userDefInfoArray",
    "msgCat",
    "msgType",
    "msgImpor",
    "custId",
    "accountId",
    "offCode",
    "offDesc",
    "msgSeq",
    "customCustMsgSrchRec",
    "ver1",
    "msgExpDt",
    "ver2",
    "msgNxtRevDt",
    "msgPrtNotCode",
    "msgPrtNotDesc",
    "ver3",
    "chngTime",
    "msgAuditUsrId",
    "ver4",
    "any"
})
public class CustMsgSrchRecCType {

    @XmlElement(name = "Msg")
    protected MsgType msg;
    @XmlElement(name = "StartDt")
    protected StartDtType startDt;
    @XmlElement(name = "EndDt")
    protected EndDtType endDt;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "MsgCat")
    protected MsgCatType msgCat;
    @XmlElement(name = "MsgType")
    protected MsgTypeType msgType;
    @XmlElement(name = "MsgImpor")
    protected MsgImporType msgImpor;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "OffCode")
    protected OffCodeType offCode;
    @XmlElement(name = "OffDesc")
    protected OffDescType offDesc;
    @XmlElement(name = "MsgSeq")
    protected MsgSeqType msgSeq;
    @XmlElement(name = "CustomCustMsgSrchRec")
    protected CustomCType customCustMsgSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "MsgExpDt")
    protected MsgExpDtType msgExpDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "MsgNxtRevDt")
    protected MsgNxtRevDtType msgNxtRevDt;
    @XmlElement(name = "MsgPrtNotCode")
    protected MsgPrtNotCodeType msgPrtNotCode;
    @XmlElement(name = "MsgPrtNotDesc")
    protected MsgPrtNotDescType msgPrtNotDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "ChngTime")
    protected ChngTimeType chngTime;
    @XmlElement(name = "MsgAuditUsrId")
    protected AuditUsrIdType msgAuditUsrId;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

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
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setStartDt(StartDtType value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link EndDtType }
     *     
     */
    public EndDtType getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDtType }
     *     
     */
    public void setEndDt(EndDtType value) {
        this.endDt = value;
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
     * Gets the value of the msgImpor property.
     * 
     * @return
     *     possible object is
     *     {@link MsgImporType }
     *     
     */
    public MsgImporType getMsgImpor() {
        return msgImpor;
    }

    /**
     * Sets the value of the msgImpor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgImporType }
     *     
     */
    public void setMsgImpor(MsgImporType value) {
        this.msgImpor = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setAccountId(AccountIdCType value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setOffCode(OffCodeType value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the offDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getOffDesc() {
        return offDesc;
    }

    /**
     * Sets the value of the offDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setOffDesc(OffDescType value) {
        this.offDesc = value;
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
     * Gets the value of the customCustMsgSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomCustMsgSrchRec() {
        return customCustMsgSrchRec;
    }

    /**
     * Sets the value of the customCustMsgSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomCustMsgSrchRec(CustomCType value) {
        this.customCustMsgSrchRec = value;
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
     * Gets the value of the msgNxtRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link MsgNxtRevDtType }
     *     
     */
    public MsgNxtRevDtType getMsgNxtRevDt() {
        return msgNxtRevDt;
    }

    /**
     * Sets the value of the msgNxtRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgNxtRevDtType }
     *     
     */
    public void setMsgNxtRevDt(MsgNxtRevDtType value) {
        this.msgNxtRevDt = value;
    }

    /**
     * Gets the value of the msgPrtNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link MsgPrtNotCodeType }
     *     
     */
    public MsgPrtNotCodeType getMsgPrtNotCode() {
        return msgPrtNotCode;
    }

    /**
     * Sets the value of the msgPrtNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgPrtNotCodeType }
     *     
     */
    public void setMsgPrtNotCode(MsgPrtNotCodeType value) {
        this.msgPrtNotCode = value;
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
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
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

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
