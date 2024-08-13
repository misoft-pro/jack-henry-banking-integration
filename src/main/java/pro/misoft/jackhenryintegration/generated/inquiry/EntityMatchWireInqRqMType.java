
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
 * <p>Java class for EntityMatchWireInqRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityMatchWireInqRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="EntityListCodeArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityListCodeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EntityConfdScore" type="{http://jackhenry.com/jxchange/TPG/2008}EntityConfdScore_Type" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddr1" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr1_Type" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddr2" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr2_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireCorrelId" type="{http://jackhenry.com/jxchange/TPG/2008}WireCorrelId_Type"/&gt;
 *         &lt;element name="TrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSeqId" type="{http://jackhenry.com/jxchange/TPG/2008}WireSeqId_Type"/&gt;
 *         &lt;element name="WireTmpltId" type="{http://jackhenry.com/jxchange/TPG/2008}WireTmpltId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}WireTrnType_Type"/&gt;
 *         &lt;element name="FedWirePkg" type="{http://jackhenry.com/jxchange/TPG/2008}FedWirePkg_Type"/&gt;
 *         &lt;element name="WireTagArray" type="{http://jackhenry.com/jxchange/TPG/2008}WireTagArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "EntityMatchWireInqRq_MType", propOrder = {
    "msgRqHdr",
    "entityListCodeArray",
    "entityConfdScore",
    "streetAddr1",
    "streetAddr2",
    "wireCorrelId",
    "trnRcptId",
    "wireSeqId",
    "wireTmpltId",
    "wireTrnType",
    "fedWirePkg",
    "wireTagArray",
    "custom",
    "ver1",
    "any"
})
public class EntityMatchWireInqRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "EntityListCodeArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityListCodeArrayAType> entityListCodeArray;
    @XmlElementRef(name = "EntityConfdScore", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityConfdScoreType> entityConfdScore;
    @XmlElementRef(name = "StreetAddr1", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StreetAddr1Type> streetAddr1;
    @XmlElementRef(name = "StreetAddr2", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StreetAddr2Type> streetAddr2;
    @XmlElement(name = "WireCorrelId", required = true)
    protected WireCorrelIdType wireCorrelId;
    @XmlElementRef(name = "TrnRcptId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnRcptIdType> trnRcptId;
    @XmlElement(name = "WireSeqId", required = true)
    protected WireSeqIdType wireSeqId;
    @XmlElementRef(name = "WireTmpltId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireTmpltIdType> wireTmpltId;
    @XmlElement(name = "WireTrnType", required = true)
    protected WireTrnTypeType wireTrnType;
    @XmlElement(name = "FedWirePkg", required = true)
    protected FedWirePkgType fedWirePkg;
    @XmlElementRef(name = "WireTagArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireTagArrayAType> wireTagArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
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
     * Gets the value of the entityListCodeArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityListCodeArrayAType }{@code >}
     *     
     */
    public JAXBElement<EntityListCodeArrayAType> getEntityListCodeArray() {
        return entityListCodeArray;
    }

    /**
     * Sets the value of the entityListCodeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityListCodeArrayAType }{@code >}
     *     
     */
    public void setEntityListCodeArray(JAXBElement<EntityListCodeArrayAType> value) {
        this.entityListCodeArray = value;
    }

    /**
     * Gets the value of the entityConfdScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityConfdScoreType }{@code >}
     *     
     */
    public JAXBElement<EntityConfdScoreType> getEntityConfdScore() {
        return entityConfdScore;
    }

    /**
     * Sets the value of the entityConfdScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityConfdScoreType }{@code >}
     *     
     */
    public void setEntityConfdScore(JAXBElement<EntityConfdScoreType> value) {
        this.entityConfdScore = value;
    }

    /**
     * Gets the value of the streetAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr1Type }{@code >}
     *     
     */
    public JAXBElement<StreetAddr1Type> getStreetAddr1() {
        return streetAddr1;
    }

    /**
     * Sets the value of the streetAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr1Type }{@code >}
     *     
     */
    public void setStreetAddr1(JAXBElement<StreetAddr1Type> value) {
        this.streetAddr1 = value;
    }

    /**
     * Gets the value of the streetAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr2Type }{@code >}
     *     
     */
    public JAXBElement<StreetAddr2Type> getStreetAddr2() {
        return streetAddr2;
    }

    /**
     * Sets the value of the streetAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr2Type }{@code >}
     *     
     */
    public void setStreetAddr2(JAXBElement<StreetAddr2Type> value) {
        this.streetAddr2 = value;
    }

    /**
     * Gets the value of the wireCorrelId property.
     * 
     * @return
     *     possible object is
     *     {@link WireCorrelIdType }
     *     
     */
    public WireCorrelIdType getWireCorrelId() {
        return wireCorrelId;
    }

    /**
     * Sets the value of the wireCorrelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireCorrelIdType }
     *     
     */
    public void setWireCorrelId(WireCorrelIdType value) {
        this.wireCorrelId = value;
    }

    /**
     * Gets the value of the trnRcptId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}
     *     
     */
    public JAXBElement<TrnRcptIdType> getTrnRcptId() {
        return trnRcptId;
    }

    /**
     * Sets the value of the trnRcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}
     *     
     */
    public void setTrnRcptId(JAXBElement<TrnRcptIdType> value) {
        this.trnRcptId = value;
    }

    /**
     * Gets the value of the wireSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link WireSeqIdType }
     *     
     */
    public WireSeqIdType getWireSeqId() {
        return wireSeqId;
    }

    /**
     * Sets the value of the wireSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireSeqIdType }
     *     
     */
    public void setWireSeqId(WireSeqIdType value) {
        this.wireSeqId = value;
    }

    /**
     * Gets the value of the wireTmpltId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireTmpltIdType }{@code >}
     *     
     */
    public JAXBElement<WireTmpltIdType> getWireTmpltId() {
        return wireTmpltId;
    }

    /**
     * Sets the value of the wireTmpltId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireTmpltIdType }{@code >}
     *     
     */
    public void setWireTmpltId(JAXBElement<WireTmpltIdType> value) {
        this.wireTmpltId = value;
    }

    /**
     * Gets the value of the wireTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link WireTrnTypeType }
     *     
     */
    public WireTrnTypeType getWireTrnType() {
        return wireTrnType;
    }

    /**
     * Sets the value of the wireTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTrnTypeType }
     *     
     */
    public void setWireTrnType(WireTrnTypeType value) {
        this.wireTrnType = value;
    }

    /**
     * Gets the value of the fedWirePkg property.
     * 
     * @return
     *     possible object is
     *     {@link FedWirePkgType }
     *     
     */
    public FedWirePkgType getFedWirePkg() {
        return fedWirePkg;
    }

    /**
     * Sets the value of the fedWirePkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FedWirePkgType }
     *     
     */
    public void setFedWirePkg(FedWirePkgType value) {
        this.fedWirePkg = value;
    }

    /**
     * Gets the value of the wireTagArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireTagArrayAType }{@code >}
     *     
     */
    public JAXBElement<WireTagArrayAType> getWireTagArray() {
        return wireTagArray;
    }

    /**
     * Sets the value of the wireTagArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireTagArrayAType }{@code >}
     *     
     */
    public void setWireTagArray(JAXBElement<WireTagArrayAType> value) {
        this.wireTagArray = value;
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
