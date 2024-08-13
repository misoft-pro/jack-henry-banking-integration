
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
 * <p>Java class for LnSvcInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnSvcInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="x_LnSvcInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnSvcInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnSvcAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnSvcAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnSvcBalInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnSvcBalInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnSvcPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnSvcPmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnSvcRateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnSvcRateInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnSvcTaxInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnSvcTaxInfo_CType" minOccurs="0"/&gt;
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
@XmlType(name = "LnSvcInqRs_MType", propOrder = {
    "msgRsHdr",
    "xLnSvcInfoRec",
    "xLnSvcAcctInfo",
    "xLnSvcBalInfo",
    "xLnSvcPmtInfo",
    "xLnSvcRateInfo",
    "xLnSvcTaxInfo",
    "custom",
    "ver1",
    "any"
})
public class LnSvcInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "x_LnSvcInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnSvcInfoRecCType> xLnSvcInfoRec;
    @XmlElementRef(name = "x_LnSvcAcctInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnSvcAcctInfoCType> xLnSvcAcctInfo;
    @XmlElementRef(name = "x_LnSvcBalInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnSvcBalInfoCType> xLnSvcBalInfo;
    @XmlElementRef(name = "x_LnSvcPmtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnSvcPmtInfoCType> xLnSvcPmtInfo;
    @XmlElementRef(name = "x_LnSvcRateInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnSvcRateInfoCType> xLnSvcRateInfo;
    @XmlElementRef(name = "x_LnSvcTaxInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XLnSvcTaxInfoCType> xLnSvcTaxInfo;
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
     * Gets the value of the xLnSvcInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnSvcInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<XLnSvcInfoRecCType> getXLnSvcInfoRec() {
        return xLnSvcInfoRec;
    }

    /**
     * Sets the value of the xLnSvcInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnSvcInfoRecCType }{@code >}
     *     
     */
    public void setXLnSvcInfoRec(JAXBElement<XLnSvcInfoRecCType> value) {
        this.xLnSvcInfoRec = value;
    }

    /**
     * Gets the value of the xLnSvcAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnSvcAcctInfoCType }{@code >}
     *     
     */
    public JAXBElement<XLnSvcAcctInfoCType> getXLnSvcAcctInfo() {
        return xLnSvcAcctInfo;
    }

    /**
     * Sets the value of the xLnSvcAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnSvcAcctInfoCType }{@code >}
     *     
     */
    public void setXLnSvcAcctInfo(JAXBElement<XLnSvcAcctInfoCType> value) {
        this.xLnSvcAcctInfo = value;
    }

    /**
     * Gets the value of the xLnSvcBalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnSvcBalInfoCType }{@code >}
     *     
     */
    public JAXBElement<XLnSvcBalInfoCType> getXLnSvcBalInfo() {
        return xLnSvcBalInfo;
    }

    /**
     * Sets the value of the xLnSvcBalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnSvcBalInfoCType }{@code >}
     *     
     */
    public void setXLnSvcBalInfo(JAXBElement<XLnSvcBalInfoCType> value) {
        this.xLnSvcBalInfo = value;
    }

    /**
     * Gets the value of the xLnSvcPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnSvcPmtInfoCType }{@code >}
     *     
     */
    public JAXBElement<XLnSvcPmtInfoCType> getXLnSvcPmtInfo() {
        return xLnSvcPmtInfo;
    }

    /**
     * Sets the value of the xLnSvcPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnSvcPmtInfoCType }{@code >}
     *     
     */
    public void setXLnSvcPmtInfo(JAXBElement<XLnSvcPmtInfoCType> value) {
        this.xLnSvcPmtInfo = value;
    }

    /**
     * Gets the value of the xLnSvcRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnSvcRateInfoCType }{@code >}
     *     
     */
    public JAXBElement<XLnSvcRateInfoCType> getXLnSvcRateInfo() {
        return xLnSvcRateInfo;
    }

    /**
     * Sets the value of the xLnSvcRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnSvcRateInfoCType }{@code >}
     *     
     */
    public void setXLnSvcRateInfo(JAXBElement<XLnSvcRateInfoCType> value) {
        this.xLnSvcRateInfo = value;
    }

    /**
     * Gets the value of the xLnSvcTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLnSvcTaxInfoCType }{@code >}
     *     
     */
    public JAXBElement<XLnSvcTaxInfoCType> getXLnSvcTaxInfo() {
        return xLnSvcTaxInfo;
    }

    /**
     * Sets the value of the xLnSvcTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLnSvcTaxInfoCType }{@code >}
     *     
     */
    public void setXLnSvcTaxInfo(JAXBElement<XLnSvcTaxInfoCType> value) {
        this.xLnSvcTaxInfo = value;
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
