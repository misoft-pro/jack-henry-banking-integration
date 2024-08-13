
package pro.misoft.jackhenryintegration.generated.inquiry;

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
 * <p>Java class for ACHActFraudStatInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHActFraudStatInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="FraudRefId" type="{http://jackhenry.com/jxchange/TPG/2008}FraudRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHBatchNum" type="{http://jackhenry.com/jxchange/TPG/2008}BatchNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudBatchStat" type="{http://jackhenry.com/jxchange/TPG/2008}FraudBatchStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="RecCnt" type="{http://jackhenry.com/jxchange/TPG/2008}RecCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SusRecCnt" type="{http://jackhenry.com/jxchange/TPG/2008}SusRecCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CmpltTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}CmpltTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFileCrtDt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFileCrtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFileCrtTime" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFileCrtTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFraudRsArray" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFraudRsArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "ACHActFraudStatInqRs_MType", propOrder = {
    "msgRsHdr",
    "fraudRefId",
    "achBatchNum",
    "fraudBatchStat",
    "recCnt",
    "susRecCnt",
    "cmpltTimeDt",
    "achFileCrtDt",
    "achFileCrtTime",
    "achFraudRsArray",
    "custom",
    "ver1",
    "any"
})
public class ACHActFraudStatInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "FraudRefId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FraudRefIdType> fraudRefId;
    @XmlElementRef(name = "ACHBatchNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BatchNumType> achBatchNum;
    @XmlElementRef(name = "FraudBatchStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FraudBatchStatType> fraudBatchStat;
    @XmlElementRef(name = "RecCnt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RecCntType> recCnt;
    @XmlElementRef(name = "SusRecCnt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SusRecCntType> susRecCnt;
    @XmlElementRef(name = "CmpltTimeDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CmpltTimeDtType> cmpltTimeDt;
    @XmlElementRef(name = "ACHFileCrtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFileCrtDtType> achFileCrtDt;
    @XmlElementRef(name = "ACHFileCrtTime", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFileCrtTimeType> achFileCrtTime;
    @XmlElementRef(name = "ACHFraudRsArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFraudRsArrayAType> achFraudRsArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public MsgRsHdrCType getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Sets the value of the msgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public void setMsgRsHdr(MsgRsHdrCType value) {
        this.msgRsHdr = value;
    }

    /**
     * Gets the value of the fraudRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FraudRefIdType }{@code >}
     *     
     */
    public JAXBElement<FraudRefIdType> getFraudRefId() {
        return fraudRefId;
    }

    /**
     * Sets the value of the fraudRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FraudRefIdType }{@code >}
     *     
     */
    public void setFraudRefId(JAXBElement<FraudRefIdType> value) {
        this.fraudRefId = value;
    }

    /**
     * Gets the value of the achBatchNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}
     *     
     */
    public JAXBElement<BatchNumType> getACHBatchNum() {
        return achBatchNum;
    }

    /**
     * Sets the value of the achBatchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}
     *     
     */
    public void setACHBatchNum(JAXBElement<BatchNumType> value) {
        this.achBatchNum = value;
    }

    /**
     * Gets the value of the fraudBatchStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FraudBatchStatType }{@code >}
     *     
     */
    public JAXBElement<FraudBatchStatType> getFraudBatchStat() {
        return fraudBatchStat;
    }

    /**
     * Sets the value of the fraudBatchStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FraudBatchStatType }{@code >}
     *     
     */
    public void setFraudBatchStat(JAXBElement<FraudBatchStatType> value) {
        this.fraudBatchStat = value;
    }

    /**
     * Gets the value of the recCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecCntType }{@code >}
     *     
     */
    public JAXBElement<RecCntType> getRecCnt() {
        return recCnt;
    }

    /**
     * Sets the value of the recCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecCntType }{@code >}
     *     
     */
    public void setRecCnt(JAXBElement<RecCntType> value) {
        this.recCnt = value;
    }

    /**
     * Gets the value of the susRecCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SusRecCntType }{@code >}
     *     
     */
    public JAXBElement<SusRecCntType> getSusRecCnt() {
        return susRecCnt;
    }

    /**
     * Sets the value of the susRecCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SusRecCntType }{@code >}
     *     
     */
    public void setSusRecCnt(JAXBElement<SusRecCntType> value) {
        this.susRecCnt = value;
    }

    /**
     * Gets the value of the cmpltTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CmpltTimeDtType }{@code >}
     *     
     */
    public JAXBElement<CmpltTimeDtType> getCmpltTimeDt() {
        return cmpltTimeDt;
    }

    /**
     * Sets the value of the cmpltTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CmpltTimeDtType }{@code >}
     *     
     */
    public void setCmpltTimeDt(JAXBElement<CmpltTimeDtType> value) {
        this.cmpltTimeDt = value;
    }

    /**
     * Gets the value of the achFileCrtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFileCrtDtType }{@code >}
     *     
     */
    public JAXBElement<ACHFileCrtDtType> getACHFileCrtDt() {
        return achFileCrtDt;
    }

    /**
     * Sets the value of the achFileCrtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFileCrtDtType }{@code >}
     *     
     */
    public void setACHFileCrtDt(JAXBElement<ACHFileCrtDtType> value) {
        this.achFileCrtDt = value;
    }

    /**
     * Gets the value of the achFileCrtTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFileCrtTimeType }{@code >}
     *     
     */
    public JAXBElement<ACHFileCrtTimeType> getACHFileCrtTime() {
        return achFileCrtTime;
    }

    /**
     * Sets the value of the achFileCrtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFileCrtTimeType }{@code >}
     *     
     */
    public void setACHFileCrtTime(JAXBElement<ACHFileCrtTimeType> value) {
        this.achFileCrtTime = value;
    }

    /**
     * Gets the value of the achFraudRsArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFraudRsArrayAType }{@code >}
     *     
     */
    public JAXBElement<ACHFraudRsArrayAType> getACHFraudRsArray() {
        return achFraudRsArray;
    }

    /**
     * Sets the value of the achFraudRsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFraudRsArrayAType }{@code >}
     *     
     */
    public void setACHFraudRsArray(JAXBElement<ACHFraudRsArrayAType> value) {
        this.achFraudRsArray = value;
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
