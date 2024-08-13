
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for StopChkRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopChkRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopSeq" type="{http://jackhenry.com/jxchange/TPG/2008}StopSeq_Type"/&gt;
 *         &lt;element name="StopHldType" type="{http://jackhenry.com/jxchange/TPG/2008}StopHldType_Type"/&gt;
 *         &lt;element name="StopChkPlaceDt" type="{http://jackhenry.com/jxchange/TPG/2008}StopChkPlaceDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopUserId" type="{http://jackhenry.com/jxchange/TPG/2008}StopUserId_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopWSId" type="{http://jackhenry.com/jxchange/TPG/2008}StopWSId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChngTime" type="{http://jackhenry.com/jxchange/TPG/2008}ChngTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopChkInfo" type="{http://jackhenry.com/jxchange/TPG/2008}StopChkInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustomStopChkRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="StopNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StopNotDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PostAdvDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PostAdvDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "StopChkRec_CType", propOrder = {
    "stopSeq",
    "stopHldType",
    "stopChkPlaceDt",
    "stopUserId",
    "stopWSId",
    "chngTime",
    "stopChkInfo",
    "customStopChkRec",
    "ver1",
    "stopNotDesc",
    "ver2",
    "postAdvDesc",
    "ver3",
    "offDesc",
    "ver4",
    "any"
})
public class StopChkRecCType {

    @XmlElement(name = "StopSeq", required = true)
    protected StopSeqType stopSeq;
    @XmlElement(name = "StopHldType", required = true)
    protected StopHldTypeType stopHldType;
    @XmlElement(name = "StopChkPlaceDt")
    protected StopChkPlaceDtType stopChkPlaceDt;
    @XmlElement(name = "StopUserId")
    protected StopUserIdType stopUserId;
    @XmlElement(name = "StopWSId")
    protected StopWSIdType stopWSId;
    @XmlElement(name = "ChngTime")
    protected ChngTimeType chngTime;
    @XmlElement(name = "StopChkInfo")
    protected StopChkInfoCType stopChkInfo;
    @XmlElement(name = "CustomStopChkRec")
    protected CustomCType customStopChkRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "StopNotDesc")
    protected StopNotDescType stopNotDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PostAdvDesc")
    protected PostAdvDescType postAdvDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "OffDesc")
    protected OffDescType offDesc;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the stopSeq property.
     * 
     * @return
     *     possible object is
     *     {@link StopSeqType }
     *     
     */
    public StopSeqType getStopSeq() {
        return stopSeq;
    }

    /**
     * Sets the value of the stopSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopSeqType }
     *     
     */
    public void setStopSeq(StopSeqType value) {
        this.stopSeq = value;
    }

    /**
     * Gets the value of the stopHldType property.
     * 
     * @return
     *     possible object is
     *     {@link StopHldTypeType }
     *     
     */
    public StopHldTypeType getStopHldType() {
        return stopHldType;
    }

    /**
     * Sets the value of the stopHldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopHldTypeType }
     *     
     */
    public void setStopHldType(StopHldTypeType value) {
        this.stopHldType = value;
    }

    /**
     * Gets the value of the stopChkPlaceDt property.
     * 
     * @return
     *     possible object is
     *     {@link StopChkPlaceDtType }
     *     
     */
    public StopChkPlaceDtType getStopChkPlaceDt() {
        return stopChkPlaceDt;
    }

    /**
     * Sets the value of the stopChkPlaceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopChkPlaceDtType }
     *     
     */
    public void setStopChkPlaceDt(StopChkPlaceDtType value) {
        this.stopChkPlaceDt = value;
    }

    /**
     * Gets the value of the stopUserId property.
     * 
     * @return
     *     possible object is
     *     {@link StopUserIdType }
     *     
     */
    public StopUserIdType getStopUserId() {
        return stopUserId;
    }

    /**
     * Sets the value of the stopUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopUserIdType }
     *     
     */
    public void setStopUserId(StopUserIdType value) {
        this.stopUserId = value;
    }

    /**
     * Gets the value of the stopWSId property.
     * 
     * @return
     *     possible object is
     *     {@link StopWSIdType }
     *     
     */
    public StopWSIdType getStopWSId() {
        return stopWSId;
    }

    /**
     * Sets the value of the stopWSId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopWSIdType }
     *     
     */
    public void setStopWSId(StopWSIdType value) {
        this.stopWSId = value;
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
     * Gets the value of the stopChkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StopChkInfoCType }
     *     
     */
    public StopChkInfoCType getStopChkInfo() {
        return stopChkInfo;
    }

    /**
     * Sets the value of the stopChkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopChkInfoCType }
     *     
     */
    public void setStopChkInfo(StopChkInfoCType value) {
        this.stopChkInfo = value;
    }

    /**
     * Gets the value of the customStopChkRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomStopChkRec() {
        return customStopChkRec;
    }

    /**
     * Sets the value of the customStopChkRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomStopChkRec(CustomCType value) {
        this.customStopChkRec = value;
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
     * Gets the value of the stopNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link StopNotDescType }
     *     
     */
    public StopNotDescType getStopNotDesc() {
        return stopNotDesc;
    }

    /**
     * Sets the value of the stopNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopNotDescType }
     *     
     */
    public void setStopNotDesc(StopNotDescType value) {
        this.stopNotDesc = value;
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
     * Gets the value of the postAdvDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PostAdvDescType }
     *     
     */
    public PostAdvDescType getPostAdvDesc() {
        return postAdvDesc;
    }

    /**
     * Sets the value of the postAdvDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAdvDescType }
     *     
     */
    public void setPostAdvDesc(PostAdvDescType value) {
        this.postAdvDesc = value;
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

}
