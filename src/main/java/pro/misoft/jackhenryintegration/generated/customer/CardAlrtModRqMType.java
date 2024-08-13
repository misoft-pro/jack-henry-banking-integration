
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for CardAlrtModRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAlrtModRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="ErrOvrRdInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ErrOvrRdInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type"/&gt;
 *         &lt;element name="EFTCardNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardNum_Type"/&gt;
 *         &lt;element name="CardAlrtCode" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtCode_Type"/&gt;
 *         &lt;element name="AlrtActType" type="{http://jackhenry.com/jxchange/TPG/2008}AlrtActType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtUsrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtUsrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtRegionUsrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtRegionUsrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtRegionLat" type="{http://jackhenry.com/jxchange/TPG/2008}GeoLat_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtRegionLong" type="{http://jackhenry.com/jxchange/TPG/2008}GeoLong_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtRegionRadius" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtRegionRadius_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtThldCode" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtThldCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtThldVal" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtThldVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActIntentKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type"/&gt;
 *         &lt;element name="Dlt" type="{http://jackhenry.com/jxchange/TPG/2008}Dlt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CardAlrtRegionId" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtRegionId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CardAlrtModRq_MType", propOrder = {
    "msgRqHdr",
    "errOvrRdInfoArray",
    "custId",
    "eftCardNum",
    "cardAlrtCode",
    "alrtActType",
    "cardAlrtUsrDesc",
    "cardAlrtRegionUsrDesc",
    "cardAlrtRegionLat",
    "cardAlrtRegionLong",
    "cardAlrtRegionRadius",
    "cardAlrtThldCode",
    "cardAlrtThldVal",
    "actIntentKey",
    "dlt",
    "custom",
    "ver1",
    "cardAlrtRegionId",
    "ver2",
    "any"
})
public class CardAlrtModRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "ErrOvrRdInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrOvrRdInfoArrayAType> errOvrRdInfoArray;
    @XmlElement(name = "CustId", required = true)
    protected CustIdType custId;
    @XmlElement(name = "EFTCardNum", required = true)
    protected EFTCardNumType eftCardNum;
    @XmlElement(name = "CardAlrtCode", required = true)
    protected CardAlrtCodeType cardAlrtCode;
    @XmlElementRef(name = "AlrtActType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AlrtActTypeType> alrtActType;
    @XmlElementRef(name = "CardAlrtUsrDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CardAlrtUsrDescType> cardAlrtUsrDesc;
    @XmlElementRef(name = "CardAlrtRegionUsrDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CardAlrtRegionUsrDescType> cardAlrtRegionUsrDesc;
    @XmlElementRef(name = "CardAlrtRegionLat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoLatType> cardAlrtRegionLat;
    @XmlElementRef(name = "CardAlrtRegionLong", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GeoLongType> cardAlrtRegionLong;
    @XmlElementRef(name = "CardAlrtRegionRadius", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CardAlrtRegionRadiusType> cardAlrtRegionRadius;
    @XmlElementRef(name = "CardAlrtThldCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CardAlrtThldCodeType> cardAlrtThldCode;
    @XmlElementRef(name = "CardAlrtThldVal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CardAlrtThldValType> cardAlrtThldVal;
    @XmlElement(name = "ActIntentKey", required = true)
    protected ActIntentKeyType actIntentKey;
    @XmlElementRef(name = "Dlt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DltType> dlt;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "CardAlrtRegionId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CardAlrtRegionIdType> cardAlrtRegionId;
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
     * Gets the value of the eftCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardNumType }
     *     
     */
    public EFTCardNumType getEFTCardNum() {
        return eftCardNum;
    }

    /**
     * Sets the value of the eftCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardNumType }
     *     
     */
    public void setEFTCardNum(EFTCardNumType value) {
        this.eftCardNum = value;
    }

    /**
     * Gets the value of the cardAlrtCode property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtCodeType }
     *     
     */
    public CardAlrtCodeType getCardAlrtCode() {
        return cardAlrtCode;
    }

    /**
     * Sets the value of the cardAlrtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtCodeType }
     *     
     */
    public void setCardAlrtCode(CardAlrtCodeType value) {
        this.cardAlrtCode = value;
    }

    /**
     * Gets the value of the alrtActType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlrtActTypeType }{@code >}
     *     
     */
    public JAXBElement<AlrtActTypeType> getAlrtActType() {
        return alrtActType;
    }

    /**
     * Sets the value of the alrtActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlrtActTypeType }{@code >}
     *     
     */
    public void setAlrtActType(JAXBElement<AlrtActTypeType> value) {
        this.alrtActType = value;
    }

    /**
     * Gets the value of the cardAlrtUsrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CardAlrtUsrDescType }{@code >}
     *     
     */
    public JAXBElement<CardAlrtUsrDescType> getCardAlrtUsrDesc() {
        return cardAlrtUsrDesc;
    }

    /**
     * Sets the value of the cardAlrtUsrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CardAlrtUsrDescType }{@code >}
     *     
     */
    public void setCardAlrtUsrDesc(JAXBElement<CardAlrtUsrDescType> value) {
        this.cardAlrtUsrDesc = value;
    }

    /**
     * Gets the value of the cardAlrtRegionUsrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CardAlrtRegionUsrDescType }{@code >}
     *     
     */
    public JAXBElement<CardAlrtRegionUsrDescType> getCardAlrtRegionUsrDesc() {
        return cardAlrtRegionUsrDesc;
    }

    /**
     * Sets the value of the cardAlrtRegionUsrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CardAlrtRegionUsrDescType }{@code >}
     *     
     */
    public void setCardAlrtRegionUsrDesc(JAXBElement<CardAlrtRegionUsrDescType> value) {
        this.cardAlrtRegionUsrDesc = value;
    }

    /**
     * Gets the value of the cardAlrtRegionLat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoLatType }{@code >}
     *     
     */
    public JAXBElement<GeoLatType> getCardAlrtRegionLat() {
        return cardAlrtRegionLat;
    }

    /**
     * Sets the value of the cardAlrtRegionLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoLatType }{@code >}
     *     
     */
    public void setCardAlrtRegionLat(JAXBElement<GeoLatType> value) {
        this.cardAlrtRegionLat = value;
    }

    /**
     * Gets the value of the cardAlrtRegionLong property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoLongType }{@code >}
     *     
     */
    public JAXBElement<GeoLongType> getCardAlrtRegionLong() {
        return cardAlrtRegionLong;
    }

    /**
     * Sets the value of the cardAlrtRegionLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoLongType }{@code >}
     *     
     */
    public void setCardAlrtRegionLong(JAXBElement<GeoLongType> value) {
        this.cardAlrtRegionLong = value;
    }

    /**
     * Gets the value of the cardAlrtRegionRadius property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CardAlrtRegionRadiusType }{@code >}
     *     
     */
    public JAXBElement<CardAlrtRegionRadiusType> getCardAlrtRegionRadius() {
        return cardAlrtRegionRadius;
    }

    /**
     * Sets the value of the cardAlrtRegionRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CardAlrtRegionRadiusType }{@code >}
     *     
     */
    public void setCardAlrtRegionRadius(JAXBElement<CardAlrtRegionRadiusType> value) {
        this.cardAlrtRegionRadius = value;
    }

    /**
     * Gets the value of the cardAlrtThldCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CardAlrtThldCodeType }{@code >}
     *     
     */
    public JAXBElement<CardAlrtThldCodeType> getCardAlrtThldCode() {
        return cardAlrtThldCode;
    }

    /**
     * Sets the value of the cardAlrtThldCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CardAlrtThldCodeType }{@code >}
     *     
     */
    public void setCardAlrtThldCode(JAXBElement<CardAlrtThldCodeType> value) {
        this.cardAlrtThldCode = value;
    }

    /**
     * Gets the value of the cardAlrtThldVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CardAlrtThldValType }{@code >}
     *     
     */
    public JAXBElement<CardAlrtThldValType> getCardAlrtThldVal() {
        return cardAlrtThldVal;
    }

    /**
     * Sets the value of the cardAlrtThldVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CardAlrtThldValType }{@code >}
     *     
     */
    public void setCardAlrtThldVal(JAXBElement<CardAlrtThldValType> value) {
        this.cardAlrtThldVal = value;
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
     * Gets the value of the cardAlrtRegionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CardAlrtRegionIdType }{@code >}
     *     
     */
    public JAXBElement<CardAlrtRegionIdType> getCardAlrtRegionId() {
        return cardAlrtRegionId;
    }

    /**
     * Sets the value of the cardAlrtRegionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CardAlrtRegionIdType }{@code >}
     *     
     */
    public void setCardAlrtRegionId(JAXBElement<CardAlrtRegionIdType> value) {
        this.cardAlrtRegionId = value;
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
