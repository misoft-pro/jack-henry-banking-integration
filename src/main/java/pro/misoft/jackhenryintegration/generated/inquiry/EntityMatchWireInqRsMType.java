
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
 * <p>Java class for EntityMatchWireInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityMatchWireInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="EntityMatchTotCnt" type="{http://jackhenry.com/jxchange/TPG/2008}EntityMatchCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireCorrelId" type="{http://jackhenry.com/jxchange/TPG/2008}WireCorrelId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSeqId" type="{http://jackhenry.com/jxchange/TPG/2008}WireSeqId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireTmpltId" type="{http://jackhenry.com/jxchange/TPG/2008}WireTmpltId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireEntityMatchArray" type="{http://jackhenry.com/jxchange/TPG/2008}WireEntityMatchArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "EntityMatchWireInqRs_MType", propOrder = {
    "msgRsHdr",
    "entityMatchTotCnt",
    "wireCorrelId",
    "trnRcptId",
    "wireSeqId",
    "wireTmpltId",
    "wireEntityMatchArray",
    "custom",
    "ver1",
    "any"
})
public class EntityMatchWireInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "EntityMatchTotCnt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityMatchCntType> entityMatchTotCnt;
    @XmlElementRef(name = "WireCorrelId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireCorrelIdType> wireCorrelId;
    @XmlElementRef(name = "TrnRcptId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnRcptIdType> trnRcptId;
    @XmlElementRef(name = "WireSeqId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireSeqIdType> wireSeqId;
    @XmlElementRef(name = "WireTmpltId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireTmpltIdType> wireTmpltId;
    @XmlElementRef(name = "WireEntityMatchArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireEntityMatchArrayAType> wireEntityMatchArray;
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
     * Gets the value of the entityMatchTotCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityMatchCntType }{@code >}
     *     
     */
    public JAXBElement<EntityMatchCntType> getEntityMatchTotCnt() {
        return entityMatchTotCnt;
    }

    /**
     * Sets the value of the entityMatchTotCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityMatchCntType }{@code >}
     *     
     */
    public void setEntityMatchTotCnt(JAXBElement<EntityMatchCntType> value) {
        this.entityMatchTotCnt = value;
    }

    /**
     * Gets the value of the wireCorrelId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireCorrelIdType }{@code >}
     *     
     */
    public JAXBElement<WireCorrelIdType> getWireCorrelId() {
        return wireCorrelId;
    }

    /**
     * Sets the value of the wireCorrelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireCorrelIdType }{@code >}
     *     
     */
    public void setWireCorrelId(JAXBElement<WireCorrelIdType> value) {
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
     *     {@link JAXBElement }{@code <}{@link WireSeqIdType }{@code >}
     *     
     */
    public JAXBElement<WireSeqIdType> getWireSeqId() {
        return wireSeqId;
    }

    /**
     * Sets the value of the wireSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireSeqIdType }{@code >}
     *     
     */
    public void setWireSeqId(JAXBElement<WireSeqIdType> value) {
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
     * Gets the value of the wireEntityMatchArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireEntityMatchArrayAType }{@code >}
     *     
     */
    public JAXBElement<WireEntityMatchArrayAType> getWireEntityMatchArray() {
        return wireEntityMatchArray;
    }

    /**
     * Sets the value of the wireEntityMatchArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireEntityMatchArrayAType }{@code >}
     *     
     */
    public void setWireEntityMatchArray(JAXBElement<WireEntityMatchArrayAType> value) {
        this.wireEntityMatchArray = value;
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
