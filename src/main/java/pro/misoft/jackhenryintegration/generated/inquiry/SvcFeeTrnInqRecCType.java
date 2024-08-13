
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
 * <p>Java class for SvcFeeTrnInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcFeeTrnInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcFeeTrnInfo" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeTrnInfo_CType"/&gt;
 *         &lt;element name="SeqNum" type="{http://jackhenry.com/jxchange/TPG/2008}SeqNum_Type"/&gt;
 *         &lt;element name="SvcFeeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnUsrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnWsd" type="{http://jackhenry.com/jxchange/TPG/2008}AuditWsId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChngTime" type="{http://jackhenry.com/jxchange/TPG/2008}ChngTime_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ApprvOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "SvcFeeTrnInqRec_CType", propOrder = {
    "svcFeeTrnInfo",
    "seqNum",
    "svcFeeDesc",
    "trnUsrId",
    "trnWsd",
    "chngTime",
    "ver1",
    "apprvOffDesc",
    "ver2",
    "any"
})
public class SvcFeeTrnInqRecCType {

    @XmlElement(name = "SvcFeeTrnInfo", required = true)
    protected SvcFeeTrnInfoCType svcFeeTrnInfo;
    @XmlElement(name = "SeqNum", required = true)
    protected SeqNumType seqNum;
    @XmlElement(name = "SvcFeeDesc")
    protected SvcFeeDescType svcFeeDesc;
    @XmlElement(name = "TrnUsrId")
    protected TrnUsrIdType trnUsrId;
    @XmlElement(name = "TrnWsd")
    protected AuditWsIdType trnWsd;
    @XmlElement(name = "ChngTime")
    protected ChngTimeType chngTime;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ApprvOffDesc")
    protected OffDescType apprvOffDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the svcFeeTrnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeTrnInfoCType }
     *     
     */
    public SvcFeeTrnInfoCType getSvcFeeTrnInfo() {
        return svcFeeTrnInfo;
    }

    /**
     * Sets the value of the svcFeeTrnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeTrnInfoCType }
     *     
     */
    public void setSvcFeeTrnInfo(SvcFeeTrnInfoCType value) {
        this.svcFeeTrnInfo = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link SeqNumType }
     *     
     */
    public SeqNumType getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeqNumType }
     *     
     */
    public void setSeqNum(SeqNumType value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the svcFeeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeDescType }
     *     
     */
    public SvcFeeDescType getSvcFeeDesc() {
        return svcFeeDesc;
    }

    /**
     * Sets the value of the svcFeeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeDescType }
     *     
     */
    public void setSvcFeeDesc(SvcFeeDescType value) {
        this.svcFeeDesc = value;
    }

    /**
     * Gets the value of the trnUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link TrnUsrIdType }
     *     
     */
    public TrnUsrIdType getTrnUsrId() {
        return trnUsrId;
    }

    /**
     * Sets the value of the trnUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnUsrIdType }
     *     
     */
    public void setTrnUsrId(TrnUsrIdType value) {
        this.trnUsrId = value;
    }

    /**
     * Gets the value of the trnWsd property.
     * 
     * @return
     *     possible object is
     *     {@link AuditWsIdType }
     *     
     */
    public AuditWsIdType getTrnWsd() {
        return trnWsd;
    }

    /**
     * Sets the value of the trnWsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditWsIdType }
     *     
     */
    public void setTrnWsd(AuditWsIdType value) {
        this.trnWsd = value;
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
     * Gets the value of the apprvOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getApprvOffDesc() {
        return apprvOffDesc;
    }

    /**
     * Sets the value of the apprvOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setApprvOffDesc(OffDescType value) {
        this.apprvOffDesc = value;
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
