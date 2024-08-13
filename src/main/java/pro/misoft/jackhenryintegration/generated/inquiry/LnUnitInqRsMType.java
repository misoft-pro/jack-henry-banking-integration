
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
 * <p>Java class for LnUnitInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnUnitInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="InAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnUnitId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnUnitDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="x_LnUnitInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnUnitInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnUnitAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnUnitAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnUnitBalDtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnUnitBalDtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnUnitPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnUnitPmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnUnitProtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnUnitProtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnUnitRateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnUnitRateInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnUnitRenExtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnUnitRenExtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="LOCCode" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LOCDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="x_LnUnitRealEstateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnUnitRealEstateInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="x_LnUnitRegRptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnUnitRegRptInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="ActIntent" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntent_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnUnitInqRs_MType", propOrder = {
    "msgRsHdr",
    "inAcctId",
    "lnUnitId",
    "lnUnitDesc",
    "xLnUnitInfoRec",
    "xLnUnitAcctInfo",
    "xLnUnitBalDtInfo",
    "xLnUnitPmtInfo",
    "xLnUnitProtInfo",
    "xLnUnitRateInfo",
    "xLnUnitRenExtInfo",
    "custom",
    "ver1",
    "locCode",
    "locDesc",
    "xLnUnitRealEstateInfo",
    "xLnUnitRegRptInfo",
    "actIntent",
    "actIntentKey",
    "ver2",
    "any"
})
public class LnUnitInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "InAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> inAcctId;
    @XmlElementRef(name = "LnUnitId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnUnitIdType> lnUnitId;
    @XmlElementRef(name = "LnUnitDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnUnitDescType> lnUnitDesc;
    @XmlElementRef(name = "x_LnUnitInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnUnitInfoRecCType> xLnUnitInfoRec;
    @XmlElementRef(name = "x_LnUnitAcctInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnUnitAcctInfoCType> xLnUnitAcctInfo;
    @XmlElementRef(name = "x_LnUnitBalDtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnUnitBalDtInfoCType> xLnUnitBalDtInfo;
    @XmlElementRef(name = "x_LnUnitPmtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnUnitPmtInfoCType> xLnUnitPmtInfo;
    @XmlElementRef(name = "x_LnUnitProtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnUnitProtInfoCType> xLnUnitProtInfo;
    @XmlElementRef(name = "x_LnUnitRateInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnUnitRateInfoCType> xLnUnitRateInfo;
    @XmlElementRef(name = "x_LnUnitRenExtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnUnitRenExtInfoCType> xLnUnitRenExtInfo;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "LOCCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCCodeType> locCode;
    @XmlElementRef(name = "LOCDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCDescType> locDesc;
    @XmlElementRef(name = "x_LnUnitRealEstateInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnUnitRealEstateInfoCType> xLnUnitRealEstateInfo;
    @XmlElementRef(name = "x_LnUnitRegRptInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnUnitRegRptInfoCType> xLnUnitRegRptInfo;
    @XmlElementRef(name = "ActIntent", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentType> actIntent;
    @XmlElementRef(name = "ActIntentKey", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentKeyType> actIntentKey;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
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
     * Gets the value of the inAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getInAcctId() {
        return inAcctId;
    }

    /**
     * Sets the value of the inAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setInAcctId(JAXBElement<AccountIdCType> value) {
        this.inAcctId = value;
    }

    /**
     * Gets the value of the lnUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnUnitIdType }{@code >}
     *     
     */
    public JAXBElement<LnUnitIdType> getLnUnitId() {
        return lnUnitId;
    }

    /**
     * Sets the value of the lnUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnUnitIdType }{@code >}
     *     
     */
    public void setLnUnitId(JAXBElement<LnUnitIdType> value) {
        this.lnUnitId = value;
    }

    /**
     * Gets the value of the lnUnitDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnUnitDescType }{@code >}
     *     
     */
    public JAXBElement<LnUnitDescType> getLnUnitDesc() {
        return lnUnitDesc;
    }

    /**
     * Sets the value of the lnUnitDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnUnitDescType }{@code >}
     *     
     */
    public void setLnUnitDesc(JAXBElement<LnUnitDescType> value) {
        this.lnUnitDesc = value;
    }

    /**
     * Gets the value of the xLnUnitInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<XLnUnitInfoRecCType> getXLnUnitInfoRec() {
        return xLnUnitInfoRec;
    }

    /**
     * Sets the value of the xLnUnitInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitInfoRecCType }{@code >}
     *     
     */
    public void setXLnUnitInfoRec(JAXBElement<XLnUnitInfoRecCType> value) {
        this.xLnUnitInfoRec = value;
    }

    /**
     * Gets the value of the xLnUnitAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitAcctInfoCType }{@code >}
     *     
     */
    public JAXBElement<XLnUnitAcctInfoCType> getXLnUnitAcctInfo() {
        return xLnUnitAcctInfo;
    }

    /**
     * Sets the value of the xLnUnitAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitAcctInfoCType }{@code >}
     *     
     */
    public void setXLnUnitAcctInfo(JAXBElement<XLnUnitAcctInfoCType> value) {
        this.xLnUnitAcctInfo = value;
    }

    /**
     * Gets the value of the xLnUnitBalDtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitBalDtInfoCType }{@code >}
     *     
     */
    public JAXBElement<XLnUnitBalDtInfoCType> getXLnUnitBalDtInfo() {
        return xLnUnitBalDtInfo;
    }

    /**
     * Sets the value of the xLnUnitBalDtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitBalDtInfoCType }{@code >}
     *     
     */
    public void setXLnUnitBalDtInfo(JAXBElement<XLnUnitBalDtInfoCType> value) {
        this.xLnUnitBalDtInfo = value;
    }

    /**
     * Gets the value of the xLnUnitPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitPmtInfoCType }{@code >}
     *     
     */
    public JAXBElement<XLnUnitPmtInfoCType> getXLnUnitPmtInfo() {
        return xLnUnitPmtInfo;
    }

    /**
     * Sets the value of the xLnUnitPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitPmtInfoCType }{@code >}
     *     
     */
    public void setXLnUnitPmtInfo(JAXBElement<XLnUnitPmtInfoCType> value) {
        this.xLnUnitPmtInfo = value;
    }

    /**
     * Gets the value of the xLnUnitProtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitProtInfoCType }{@code >}
     *     
     */
    public JAXBElement<XLnUnitProtInfoCType> getXLnUnitProtInfo() {
        return xLnUnitProtInfo;
    }

    /**
     * Sets the value of the xLnUnitProtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitProtInfoCType }{@code >}
     *     
     */
    public void setXLnUnitProtInfo(JAXBElement<XLnUnitProtInfoCType> value) {
        this.xLnUnitProtInfo = value;
    }

    /**
     * Gets the value of the xLnUnitRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitRateInfoCType }{@code >}
     *     
     */
    public JAXBElement<XLnUnitRateInfoCType> getXLnUnitRateInfo() {
        return xLnUnitRateInfo;
    }

    /**
     * Sets the value of the xLnUnitRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitRateInfoCType }{@code >}
     *     
     */
    public void setXLnUnitRateInfo(JAXBElement<XLnUnitRateInfoCType> value) {
        this.xLnUnitRateInfo = value;
    }

    /**
     * Gets the value of the xLnUnitRenExtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitRenExtInfoCType }{@code >}
     *     
     */
    public JAXBElement<XLnUnitRenExtInfoCType> getXLnUnitRenExtInfo() {
        return xLnUnitRenExtInfo;
    }

    /**
     * Sets the value of the xLnUnitRenExtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitRenExtInfoCType }{@code >}
     *     
     */
    public void setXLnUnitRenExtInfo(JAXBElement<XLnUnitRenExtInfoCType> value) {
        this.xLnUnitRenExtInfo = value;
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
     * Gets the value of the locCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCCodeType }{@code >}
     *     
     */
    public JAXBElement<LOCCodeType> getLOCCode() {
        return locCode;
    }

    /**
     * Sets the value of the locCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCCodeType }{@code >}
     *     
     */
    public void setLOCCode(JAXBElement<LOCCodeType> value) {
        this.locCode = value;
    }

    /**
     * Gets the value of the locDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCDescType }{@code >}
     *     
     */
    public JAXBElement<LOCDescType> getLOCDesc() {
        return locDesc;
    }

    /**
     * Sets the value of the locDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCDescType }{@code >}
     *     
     */
    public void setLOCDesc(JAXBElement<LOCDescType> value) {
        this.locDesc = value;
    }

    /**
     * Gets the value of the xLnUnitRealEstateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitRealEstateInfoCType }{@code >}
     *     
     */
    public JAXBElement<XLnUnitRealEstateInfoCType> getXLnUnitRealEstateInfo() {
        return xLnUnitRealEstateInfo;
    }

    /**
     * Sets the value of the xLnUnitRealEstateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitRealEstateInfoCType }{@code >}
     *     
     */
    public void setXLnUnitRealEstateInfo(JAXBElement<XLnUnitRealEstateInfoCType> value) {
        this.xLnUnitRealEstateInfo = value;
    }

    /**
     * Gets the value of the xLnUnitRegRptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitRegRptInfoCType }{@code >}
     *     
     */
    public JAXBElement<XLnUnitRegRptInfoCType> getXLnUnitRegRptInfo() {
        return xLnUnitRegRptInfo;
    }

    /**
     * Sets the value of the xLnUnitRegRptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnUnitRegRptInfoCType }{@code >}
     *     
     */
    public void setXLnUnitRegRptInfo(JAXBElement<XLnUnitRegRptInfoCType> value) {
        this.xLnUnitRegRptInfo = value;
    }

    /**
     * Gets the value of the actIntent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public JAXBElement<ActIntentType> getActIntent() {
        return actIntent;
    }

    /**
     * Sets the value of the actIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public void setActIntent(JAXBElement<ActIntentType> value) {
        this.actIntent = value;
    }

    /**
     * Gets the value of the actIntentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public JAXBElement<ActIntentKeyType> getActIntentKey() {
        return actIntentKey;
    }

    /**
     * Sets the value of the actIntentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public void setActIntentKey(JAXBElement<ActIntentKeyType> value) {
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
