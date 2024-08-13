
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
 * <p>Java class for SvcGtwyLogSumInqRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcGtwyLogSumInqRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="SvcDictName" type="{http://jackhenry.com/jxchange/TPG/2008}SvcDictName_Type"/&gt;
 *         &lt;element name="StartTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcGtwyMsgTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EndTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcGtwyMsgTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcGtwyMsgStat" type="{http://jackhenry.com/jxchange/TPG/2008}SvcGtwyMsgStat_Type" minOccurs="0"/&gt;
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
@XmlType(name = "SvcGtwyLogSumInqRq_MType", propOrder = {
    "msgRqHdr",
    "svcDictName",
    "startTimeDt",
    "endTimeDt",
    "svcGtwyMsgStat",
    "ver1",
    "any"
})
public class SvcGtwyLogSumInqRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElement(name = "SvcDictName", required = true)
    protected SvcDictNameType svcDictName;
    @XmlElementRef(name = "StartTimeDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcGtwyMsgTimeDtType> startTimeDt;
    @XmlElementRef(name = "EndTimeDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcGtwyMsgTimeDtType> endTimeDt;
    @XmlElementRef(name = "SvcGtwyMsgStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcGtwyMsgStatType> svcGtwyMsgStat;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
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
     * Gets the value of the svcDictName property.
     * 
     * @return
     *     possible object is
     *     {@link SvcDictNameType }
     *     
     */
    public SvcDictNameType getSvcDictName() {
        return svcDictName;
    }

    /**
     * Sets the value of the svcDictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcDictNameType }
     *     
     */
    public void setSvcDictName(SvcDictNameType value) {
        this.svcDictName = value;
    }

    /**
     * Gets the value of the startTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcGtwyMsgTimeDtType }{@code >}
     *     
     */
    public JAXBElement<SvcGtwyMsgTimeDtType> getStartTimeDt() {
        return startTimeDt;
    }

    /**
     * Sets the value of the startTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcGtwyMsgTimeDtType }{@code >}
     *     
     */
    public void setStartTimeDt(JAXBElement<SvcGtwyMsgTimeDtType> value) {
        this.startTimeDt = value;
    }

    /**
     * Gets the value of the endTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcGtwyMsgTimeDtType }{@code >}
     *     
     */
    public JAXBElement<SvcGtwyMsgTimeDtType> getEndTimeDt() {
        return endTimeDt;
    }

    /**
     * Sets the value of the endTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcGtwyMsgTimeDtType }{@code >}
     *     
     */
    public void setEndTimeDt(JAXBElement<SvcGtwyMsgTimeDtType> value) {
        this.endTimeDt = value;
    }

    /**
     * Gets the value of the svcGtwyMsgStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcGtwyMsgStatType }{@code >}
     *     
     */
    public JAXBElement<SvcGtwyMsgStatType> getSvcGtwyMsgStat() {
        return svcGtwyMsgStat;
    }

    /**
     * Sets the value of the svcGtwyMsgStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcGtwyMsgStatType }{@code >}
     *     
     */
    public void setSvcGtwyMsgStat(JAXBElement<SvcGtwyMsgStatType> value) {
        this.svcGtwyMsgStat = value;
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
