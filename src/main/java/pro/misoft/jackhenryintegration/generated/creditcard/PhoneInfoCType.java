
package pro.misoft.jackhenryintegration.generated.creditcard;

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
 * <p>Java class for PhoneInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PhoneNum" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneType" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneTime" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneExt" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneExt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ConStartTime" type="{http://jackhenry.com/jxchange/TPG/2008}ConStartTime_Type" minOccurs="0"/&gt;
 *           &lt;element name="ConEndTime" type="{http://jackhenry.com/jxchange/TPG/2008}ConEndTime_Type" minOccurs="0"/&gt;
 *           &lt;element name="MobPhoneInfo" type="{http://jackhenry.com/jxchange/TPG/2008}MobPhoneInfo_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PrioritySeq" type="{http://jackhenry.com/jxchange/TPG/2008}PrioritySeq_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="PhoneNumDsp" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneNumDsp_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
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
@XmlType(name = "PhoneInfo_CType", propOrder = {
    "phoneNum",
    "phoneType",
    "phoneTime",
    "phoneExt",
    "ver1",
    "conStartTime",
    "conEndTime",
    "mobPhoneInfo",
    "ver2",
    "prioritySeq",
    "ver3",
    "phoneNumDsp",
    "ver4",
    "any"
})
public class PhoneInfoCType {

    @XmlElementRef(name = "PhoneNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneNumType> phoneNum;
    @XmlElementRef(name = "PhoneType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneTypeType> phoneType;
    @XmlElementRef(name = "PhoneTime", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneTimeType> phoneTime;
    @XmlElementRef(name = "PhoneExt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneExtType> phoneExt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ConStartTime")
    protected ConStartTimeType conStartTime;
    @XmlElement(name = "ConEndTime")
    protected ConEndTimeType conEndTime;
    @XmlElement(name = "MobPhoneInfo")
    protected MobPhoneInfoCType mobPhoneInfo;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PrioritySeq")
    protected PrioritySeqType prioritySeq;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "PhoneNumDsp")
    protected PhoneNumDspType phoneNumDsp;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhoneNumType }{@code >}
     *     
     */
    public JAXBElement<PhoneNumType> getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhoneNumType }{@code >}
     *     
     */
    public void setPhoneNum(JAXBElement<PhoneNumType> value) {
        this.phoneNum = value;
    }

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhoneTypeType }{@code >}
     *     
     */
    public JAXBElement<PhoneTypeType> getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhoneTypeType }{@code >}
     *     
     */
    public void setPhoneType(JAXBElement<PhoneTypeType> value) {
        this.phoneType = value;
    }

    /**
     * Gets the value of the phoneTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhoneTimeType }{@code >}
     *     
     */
    public JAXBElement<PhoneTimeType> getPhoneTime() {
        return phoneTime;
    }

    /**
     * Sets the value of the phoneTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhoneTimeType }{@code >}
     *     
     */
    public void setPhoneTime(JAXBElement<PhoneTimeType> value) {
        this.phoneTime = value;
    }

    /**
     * Gets the value of the phoneExt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhoneExtType }{@code >}
     *     
     */
    public JAXBElement<PhoneExtType> getPhoneExt() {
        return phoneExt;
    }

    /**
     * Sets the value of the phoneExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhoneExtType }{@code >}
     *     
     */
    public void setPhoneExt(JAXBElement<PhoneExtType> value) {
        this.phoneExt = value;
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
     * Gets the value of the conStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link ConStartTimeType }
     *     
     */
    public ConStartTimeType getConStartTime() {
        return conStartTime;
    }

    /**
     * Sets the value of the conStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConStartTimeType }
     *     
     */
    public void setConStartTime(ConStartTimeType value) {
        this.conStartTime = value;
    }

    /**
     * Gets the value of the conEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link ConEndTimeType }
     *     
     */
    public ConEndTimeType getConEndTime() {
        return conEndTime;
    }

    /**
     * Sets the value of the conEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConEndTimeType }
     *     
     */
    public void setConEndTime(ConEndTimeType value) {
        this.conEndTime = value;
    }

    /**
     * Gets the value of the mobPhoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MobPhoneInfoCType }
     *     
     */
    public MobPhoneInfoCType getMobPhoneInfo() {
        return mobPhoneInfo;
    }

    /**
     * Sets the value of the mobPhoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobPhoneInfoCType }
     *     
     */
    public void setMobPhoneInfo(MobPhoneInfoCType value) {
        this.mobPhoneInfo = value;
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
     * Gets the value of the prioritySeq property.
     * 
     * @return
     *     possible object is
     *     {@link PrioritySeqType }
     *     
     */
    public PrioritySeqType getPrioritySeq() {
        return prioritySeq;
    }

    /**
     * Sets the value of the prioritySeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrioritySeqType }
     *     
     */
    public void setPrioritySeq(PrioritySeqType value) {
        this.prioritySeq = value;
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
     * Gets the value of the phoneNumDsp property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumDspType }
     *     
     */
    public PhoneNumDspType getPhoneNumDsp() {
        return phoneNumDsp;
    }

    /**
     * Sets the value of the phoneNumDsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumDspType }
     *     
     */
    public void setPhoneNumDsp(PhoneNumDspType value) {
        this.phoneNumDsp = value;
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
