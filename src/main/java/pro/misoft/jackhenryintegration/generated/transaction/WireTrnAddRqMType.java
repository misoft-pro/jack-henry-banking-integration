
package pro.misoft.jackhenryintegration.generated.transaction;

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
 * <p>Java class for WireTrnAddRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireTrnAddRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="ErrOvrRdInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ErrOvrRdInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}WireAcctId_Type"/&gt;
 *         &lt;element name="WireAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireTrnInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireTrnInfoRec_CType"/&gt;
 *         &lt;element name="WireUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}WireUsrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireVerifId" type="{http://jackhenry.com/jxchange/TPG/2008}WireVerifId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireTmpltCrt" type="{http://jackhenry.com/jxchange/TPG/2008}WireTmpltCrt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvlBalCalcCode" type="{http://jackhenry.com/jxchange/TPG/2008}AvlBalCalcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="WireCompId" type="{http://jackhenry.com/jxchange/TPG/2008}WireCompId_Type" minOccurs="0"/&gt;
 *           &lt;element name="WireCompEmplId" type="{http://jackhenry.com/jxchange/TPG/2008}EmplId_Type" minOccurs="0"/&gt;
 *           &lt;element name="WireCompEmplName" type="{http://jackhenry.com/jxchange/TPG/2008}EmplName_Type" minOccurs="0"/&gt;
 *           &lt;element name="WireCompVerifId" type="{http://jackhenry.com/jxchange/TPG/2008}WireVerifId_Type" minOccurs="0"/&gt;
 *           &lt;element name="WireCompVerifName" type="{http://jackhenry.com/jxchange/TPG/2008}EmplName_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="WireCorrelId" type="{http://jackhenry.com/jxchange/TPG/2008}WireCorrelId_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="FraudRefId" type="{http://jackhenry.com/jxchange/TPG/2008}FraudRefId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "WireTrnAddRq_MType", propOrder = {
    "msgRqHdr",
    "errOvrRdInfoArray",
    "wireAcctId",
    "wireAcctType",
    "wireTrnInfoRec",
    "wireUsrId",
    "wireVerifId",
    "wireTmpltCrt",
    "avlBalCalcCode",
    "custom",
    "ver1",
    "wireCompId",
    "wireCompEmplId",
    "wireCompEmplName",
    "wireCompVerifId",
    "wireCompVerifName",
    "ver2",
    "wireCorrelId",
    "ver3",
    "fraudRefId",
    "ver4",
    "any"
})
public class WireTrnAddRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "ErrOvrRdInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrOvrRdInfoArrayAType> errOvrRdInfoArray;
    @XmlElement(name = "WireAcctId", required = true)
    protected WireAcctIdType wireAcctId;
    @XmlElementRef(name = "WireAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctTypeType> wireAcctType;
    @XmlElement(name = "WireTrnInfoRec", required = true)
    protected WireTrnInfoRecCType wireTrnInfoRec;
    @XmlElementRef(name = "WireUsrId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireUsrIdType> wireUsrId;
    @XmlElementRef(name = "WireVerifId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireVerifIdType> wireVerifId;
    @XmlElementRef(name = "WireTmpltCrt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireTmpltCrtType> wireTmpltCrt;
    @XmlElementRef(name = "AvlBalCalcCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AvlBalCalcCodeType> avlBalCalcCode;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "WireCompId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireCompIdType> wireCompId;
    @XmlElementRef(name = "WireCompEmplId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmplIdType> wireCompEmplId;
    @XmlElementRef(name = "WireCompEmplName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmplNameType> wireCompEmplName;
    @XmlElementRef(name = "WireCompVerifId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireVerifIdType> wireCompVerifId;
    @XmlElementRef(name = "WireCompVerifName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmplNameType> wireCompVerifName;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "WireCorrelId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireCorrelIdType> wireCorrelId;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElementRef(name = "FraudRefId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FraudRefIdType> fraudRefId;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
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
     * Gets the value of the wireAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link WireAcctIdType }
     *     
     */
    public WireAcctIdType getWireAcctId() {
        return wireAcctId;
    }

    /**
     * Sets the value of the wireAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireAcctIdType }
     *     
     */
    public void setWireAcctId(WireAcctIdType value) {
        this.wireAcctId = value;
    }

    /**
     * Gets the value of the wireAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctTypeType }{@code >}
     *     
     */
    public JAXBElement<AcctTypeType> getWireAcctType() {
        return wireAcctType;
    }

    /**
     * Sets the value of the wireAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctTypeType }{@code >}
     *     
     */
    public void setWireAcctType(JAXBElement<AcctTypeType> value) {
        this.wireAcctType = value;
    }

    /**
     * Gets the value of the wireTrnInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WireTrnInfoRecCType }
     *     
     */
    public WireTrnInfoRecCType getWireTrnInfoRec() {
        return wireTrnInfoRec;
    }

    /**
     * Sets the value of the wireTrnInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTrnInfoRecCType }
     *     
     */
    public void setWireTrnInfoRec(WireTrnInfoRecCType value) {
        this.wireTrnInfoRec = value;
    }

    /**
     * Gets the value of the wireUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireUsrIdType }{@code >}
     *     
     */
    public JAXBElement<WireUsrIdType> getWireUsrId() {
        return wireUsrId;
    }

    /**
     * Sets the value of the wireUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireUsrIdType }{@code >}
     *     
     */
    public void setWireUsrId(JAXBElement<WireUsrIdType> value) {
        this.wireUsrId = value;
    }

    /**
     * Gets the value of the wireVerifId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireVerifIdType }{@code >}
     *     
     */
    public JAXBElement<WireVerifIdType> getWireVerifId() {
        return wireVerifId;
    }

    /**
     * Sets the value of the wireVerifId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireVerifIdType }{@code >}
     *     
     */
    public void setWireVerifId(JAXBElement<WireVerifIdType> value) {
        this.wireVerifId = value;
    }

    /**
     * Gets the value of the wireTmpltCrt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireTmpltCrtType }{@code >}
     *     
     */
    public JAXBElement<WireTmpltCrtType> getWireTmpltCrt() {
        return wireTmpltCrt;
    }

    /**
     * Sets the value of the wireTmpltCrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireTmpltCrtType }{@code >}
     *     
     */
    public void setWireTmpltCrt(JAXBElement<WireTmpltCrtType> value) {
        this.wireTmpltCrt = value;
    }

    /**
     * Gets the value of the avlBalCalcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AvlBalCalcCodeType }{@code >}
     *     
     */
    public JAXBElement<AvlBalCalcCodeType> getAvlBalCalcCode() {
        return avlBalCalcCode;
    }

    /**
     * Sets the value of the avlBalCalcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AvlBalCalcCodeType }{@code >}
     *     
     */
    public void setAvlBalCalcCode(JAXBElement<AvlBalCalcCodeType> value) {
        this.avlBalCalcCode = value;
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
     * Gets the value of the wireCompId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireCompIdType }{@code >}
     *     
     */
    public JAXBElement<WireCompIdType> getWireCompId() {
        return wireCompId;
    }

    /**
     * Sets the value of the wireCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireCompIdType }{@code >}
     *     
     */
    public void setWireCompId(JAXBElement<WireCompIdType> value) {
        this.wireCompId = value;
    }

    /**
     * Gets the value of the wireCompEmplId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmplIdType }{@code >}
     *     
     */
    public JAXBElement<EmplIdType> getWireCompEmplId() {
        return wireCompEmplId;
    }

    /**
     * Sets the value of the wireCompEmplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmplIdType }{@code >}
     *     
     */
    public void setWireCompEmplId(JAXBElement<EmplIdType> value) {
        this.wireCompEmplId = value;
    }

    /**
     * Gets the value of the wireCompEmplName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}
     *     
     */
    public JAXBElement<EmplNameType> getWireCompEmplName() {
        return wireCompEmplName;
    }

    /**
     * Sets the value of the wireCompEmplName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}
     *     
     */
    public void setWireCompEmplName(JAXBElement<EmplNameType> value) {
        this.wireCompEmplName = value;
    }

    /**
     * Gets the value of the wireCompVerifId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireVerifIdType }{@code >}
     *     
     */
    public JAXBElement<WireVerifIdType> getWireCompVerifId() {
        return wireCompVerifId;
    }

    /**
     * Sets the value of the wireCompVerifId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireVerifIdType }{@code >}
     *     
     */
    public void setWireCompVerifId(JAXBElement<WireVerifIdType> value) {
        this.wireCompVerifId = value;
    }

    /**
     * Gets the value of the wireCompVerifName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}
     *     
     */
    public JAXBElement<EmplNameType> getWireCompVerifName() {
        return wireCompVerifName;
    }

    /**
     * Sets the value of the wireCompVerifName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}
     *     
     */
    public void setWireCompVerifName(JAXBElement<EmplNameType> value) {
        this.wireCompVerifName = value;
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
