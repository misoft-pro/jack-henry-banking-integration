
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
 * <p>Java class for LnAppRgtrSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnAppRgtrSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType"/&gt;
 *         &lt;element name="LnAppRgtrSrchRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnAppRgtrSrchRecArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AppStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}AppStatCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="LnAppId" type="{http://jackhenry.com/jxchange/TPG/2008}LnAppId_Type" minOccurs="0"/&gt;
 *           &lt;element name="StartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="EndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="InclNAAppDtType" type="{http://jackhenry.com/jxchange/TPG/2008}InclNAAppDtType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnAppRgtrSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "lnAppRgtrSrchRecArray",
    "custom",
    "ver1",
    "appStatCode",
    "lnAppId",
    "startDt",
    "endDt",
    "inclNAAppDtType",
    "ver2",
    "any"
})
public class LnAppRgtrSrchRsMType {

    @XmlElement(name = "SrchMsgRsHdr", required = true)
    protected SrchMsgRsHdrCType srchMsgRsHdr;
    @XmlElementRef(name = "LnAppRgtrSrchRecArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnAppRgtrSrchRecArrayAType> lnAppRgtrSrchRecArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "AppStatCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AppStatCodeType> appStatCode;
    @XmlElementRef(name = "LnAppId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnAppIdType> lnAppId;
    @XmlElementRef(name = "StartDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StartDtType> startDt;
    @XmlElementRef(name = "EndDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EndDtType> endDt;
    @XmlElementRef(name = "InclNAAppDtType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InclNAAppDtTypeType> inclNAAppDtType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the srchMsgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SrchMsgRsHdrCType }
     *     
     */
    public SrchMsgRsHdrCType getSrchMsgRsHdr() {
        return srchMsgRsHdr;
    }

    /**
     * Sets the value of the srchMsgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrchMsgRsHdrCType }
     *     
     */
    public void setSrchMsgRsHdr(SrchMsgRsHdrCType value) {
        this.srchMsgRsHdr = value;
    }

    /**
     * Gets the value of the lnAppRgtrSrchRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnAppRgtrSrchRecArrayAType }{@code >}
     *     
     */
    public JAXBElement<LnAppRgtrSrchRecArrayAType> getLnAppRgtrSrchRecArray() {
        return lnAppRgtrSrchRecArray;
    }

    /**
     * Sets the value of the lnAppRgtrSrchRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnAppRgtrSrchRecArrayAType }{@code >}
     *     
     */
    public void setLnAppRgtrSrchRecArray(JAXBElement<LnAppRgtrSrchRecArrayAType> value) {
        this.lnAppRgtrSrchRecArray = value;
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
     * Gets the value of the appStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppStatCodeType }{@code >}
     *     
     */
    public JAXBElement<AppStatCodeType> getAppStatCode() {
        return appStatCode;
    }

    /**
     * Sets the value of the appStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppStatCodeType }{@code >}
     *     
     */
    public void setAppStatCode(JAXBElement<AppStatCodeType> value) {
        this.appStatCode = value;
    }

    /**
     * Gets the value of the lnAppId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnAppIdType }{@code >}
     *     
     */
    public JAXBElement<LnAppIdType> getLnAppId() {
        return lnAppId;
    }

    /**
     * Sets the value of the lnAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnAppIdType }{@code >}
     *     
     */
    public void setLnAppId(JAXBElement<LnAppIdType> value) {
        this.lnAppId = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public JAXBElement<StartDtType> getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public void setStartDt(JAXBElement<StartDtType> value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public JAXBElement<EndDtType> getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public void setEndDt(JAXBElement<EndDtType> value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the inclNAAppDtType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InclNAAppDtTypeType }{@code >}
     *     
     */
    public JAXBElement<InclNAAppDtTypeType> getInclNAAppDtType() {
        return inclNAAppDtType;
    }

    /**
     * Sets the value of the inclNAAppDtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InclNAAppDtTypeType }{@code >}
     *     
     */
    public void setInclNAAppDtType(JAXBElement<InclNAAppDtTypeType> value) {
        this.inclNAAppDtType = value;
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
