
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * <p>Java class for AcctSweepModRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctSweepModRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="ErrOvrRdInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ErrOvrRdInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="MasterAccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType"/&gt;
 *         &lt;element name="SweepAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}SweepAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}SweepAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="MasterAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}MasterAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="SweepAcctModInfo" type="{http://jackhenry.com/jxchange/TPG/2008}SweepAcctModInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Dlt" type="{http://jackhenry.com/jxchange/TPG/2008}Dlt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ActIntentKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AcctSweepModRq_MType", propOrder = {
    "msgRqHdr",
    "errOvrRdInfoArray",
    "masterAccountId",
    "sweepAcctId",
    "sweepAcctType",
    "masterAcctInfo",
    "sweepAcctModInfo",
    "dlt",
    "custom",
    "ver1",
    "actIntentKey",
    "ver2",
    "any"
})
public class AcctSweepModRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "ErrOvrRdInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrOvrRdInfoArrayAType> errOvrRdInfoArray;
    @XmlElement(name = "MasterAccountId", required = true)
    protected AccountIdCType masterAccountId;
    @XmlElementRef(name = "SweepAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepAcctIdType> sweepAcctId;
    @XmlElementRef(name = "SweepAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepAcctTypeType> sweepAcctType;
    @XmlElementRef(name = "MasterAcctInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MasterAcctInfoCType> masterAcctInfo;
    @XmlElementRef(name = "SweepAcctModInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepAcctModInfoCType> sweepAcctModInfo;
    @XmlElementRef(name = "Dlt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DltType> dlt;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ActIntentKey")
    protected ActIntentKeyType actIntentKey;
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
     * Gets the value of the masterAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getMasterAccountId() {
        return masterAccountId;
    }

    /**
     * Sets the value of the masterAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setMasterAccountId(AccountIdCType value) {
        this.masterAccountId = value;
    }

    /**
     * Gets the value of the sweepAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepAcctIdType }{@code >}
     *     
     */
    public JAXBElement<SweepAcctIdType> getSweepAcctId() {
        return sweepAcctId;
    }

    /**
     * Sets the value of the sweepAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepAcctIdType }{@code >}
     *     
     */
    public void setSweepAcctId(JAXBElement<SweepAcctIdType> value) {
        this.sweepAcctId = value;
    }

    /**
     * Gets the value of the sweepAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<SweepAcctTypeType> getSweepAcctType() {
        return sweepAcctType;
    }

    /**
     * Sets the value of the sweepAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepAcctTypeType }{@code >}
     *     
     */
    public void setSweepAcctType(JAXBElement<SweepAcctTypeType> value) {
        this.sweepAcctType = value;
    }

    /**
     * Gets the value of the masterAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MasterAcctInfoCType }{@code >}
     *     
     */
    public JAXBElement<MasterAcctInfoCType> getMasterAcctInfo() {
        return masterAcctInfo;
    }

    /**
     * Sets the value of the masterAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MasterAcctInfoCType }{@code >}
     *     
     */
    public void setMasterAcctInfo(JAXBElement<MasterAcctInfoCType> value) {
        this.masterAcctInfo = value;
    }

    /**
     * Gets the value of the sweepAcctModInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepAcctModInfoCType }{@code >}
     *     
     */
    public JAXBElement<SweepAcctModInfoCType> getSweepAcctModInfo() {
        return sweepAcctModInfo;
    }

    /**
     * Sets the value of the sweepAcctModInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepAcctModInfoCType }{@code >}
     *     
     */
    public void setSweepAcctModInfo(JAXBElement<SweepAcctModInfoCType> value) {
        this.sweepAcctModInfo = value;
    }

    /**
     * Gets the value of the dlt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DltType }{@code >}
     *     
     */
    public JAXBElement<DltType> getDlt() {
        return dlt;
    }

    /**
     * Sets the value of the dlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DltType }{@code >}
     *     
     */
    public void setDlt(JAXBElement<DltType> value) {
        this.dlt = value;
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
     * Gets the value of the actIntentKey property.
     * 
     * @return
     *     possible object is
     *     {@link ActIntentKeyType }
     *     
     */
    public ActIntentKeyType getActIntentKey() {
        return actIntentKey;
    }

    /**
     * Sets the value of the actIntentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActIntentKeyType }
     *     
     */
    public void setActIntentKey(ActIntentKeyType value) {
        this.actIntentKey = value;
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
