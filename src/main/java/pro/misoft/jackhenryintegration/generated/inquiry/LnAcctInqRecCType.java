
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for LnAcctInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnAcctInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="x_LnInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnBalDtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnBalDtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnDlrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnDlrInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnPastDueInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnPastDueInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnPmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnProtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnProtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnRateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnRateInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnRealEstateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnRealEstateInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnRenExtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnRenExtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_LnRegRptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnRegRptInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="x_LnMtgInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnMtgInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="x_LnStopInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_LnStopInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="x_IdVerify" type="{http://jackhenry.com/jxchange/TPG/2008}x_IdVerify_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="x_ACHPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_ACHPmtInfo_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="x_PromoInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_PromoInfo_CType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LnAcctInqRec_CType", propOrder = {
    "xLnInfoRec",
    "xLnAcctInfo",
    "xLnBalDtInfo",
    "xLnDlrInfo",
    "xLnPastDueInfo",
    "xLnPmtInfo",
    "xLnProtInfo",
    "xLnRateInfo",
    "xLnRealEstateInfo",
    "xLnRenExtInfo",
    "xLnRegRptInfo",
    "custom",
    "ver1",
    "xLnMtgInfo",
    "xLnStopInfo",
    "xIdVerify",
    "ver2",
    "xachPmtInfo",
    "ver3",
    "xPromoInfo",
    "ver4",
    "any"
})
public class LnAcctInqRecCType {

    @XmlElement(name = "x_LnInfoRec")
    protected XLnInfoRecCType xLnInfoRec;
    @XmlElement(name = "x_LnAcctInfo")
    protected XLnAcctInfoCType xLnAcctInfo;
    @XmlElement(name = "x_LnBalDtInfo")
    protected XLnBalDtInfoCType xLnBalDtInfo;
    @XmlElement(name = "x_LnDlrInfo")
    protected XLnDlrInfoCType xLnDlrInfo;
    @XmlElement(name = "x_LnPastDueInfo")
    protected XLnPastDueInfoCType xLnPastDueInfo;
    @XmlElement(name = "x_LnPmtInfo")
    protected XLnPmtInfoCType xLnPmtInfo;
    @XmlElement(name = "x_LnProtInfo")
    protected XLnProtInfoCType xLnProtInfo;
    @XmlElement(name = "x_LnRateInfo")
    protected XLnRateInfoCType xLnRateInfo;
    @XmlElement(name = "x_LnRealEstateInfo")
    protected XLnRealEstateInfoCType xLnRealEstateInfo;
    @XmlElement(name = "x_LnRenExtInfo")
    protected XLnRenExtInfoCType xLnRenExtInfo;
    @XmlElement(name = "x_LnRegRptInfo")
    protected XLnRegRptInfoCType xLnRegRptInfo;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "x_LnMtgInfo")
    protected XLnMtgInfoCType xLnMtgInfo;
    @XmlElement(name = "x_LnStopInfo")
    protected XLnStopInfoCType xLnStopInfo;
    @XmlElement(name = "x_IdVerify")
    protected XIdVerifyCType xIdVerify;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "x_ACHPmtInfo")
    protected XACHPmtInfoCType xachPmtInfo;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "x_PromoInfo")
    protected XPromoInfoCType xPromoInfo;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the xLnInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link XLnInfoRecCType }
     *     
     */
    public XLnInfoRecCType getXLnInfoRec() {
        return xLnInfoRec;
    }

    /**
     * Sets the value of the xLnInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLnInfoRecCType }
     *     
     */
    public void setXLnInfoRec(XLnInfoRecCType value) {
        this.xLnInfoRec = value;
    }

    /**
     * Gets the value of the xLnAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XLnAcctInfoCType }
     *     
     */
    public XLnAcctInfoCType getXLnAcctInfo() {
        return xLnAcctInfo;
    }

    /**
     * Sets the value of the xLnAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLnAcctInfoCType }
     *     
     */
    public void setXLnAcctInfo(XLnAcctInfoCType value) {
        this.xLnAcctInfo = value;
    }

    /**
     * Gets the value of the xLnBalDtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XLnBalDtInfoCType }
     *     
     */
    public XLnBalDtInfoCType getXLnBalDtInfo() {
        return xLnBalDtInfo;
    }

    /**
     * Sets the value of the xLnBalDtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLnBalDtInfoCType }
     *     
     */
    public void setXLnBalDtInfo(XLnBalDtInfoCType value) {
        this.xLnBalDtInfo = value;
    }

    /**
     * Gets the value of the xLnDlrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XLnDlrInfoCType }
     *     
     */
    public XLnDlrInfoCType getXLnDlrInfo() {
        return xLnDlrInfo;
    }

    /**
     * Sets the value of the xLnDlrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLnDlrInfoCType }
     *     
     */
    public void setXLnDlrInfo(XLnDlrInfoCType value) {
        this.xLnDlrInfo = value;
    }

    /**
     * Gets the value of the xLnPastDueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XLnPastDueInfoCType }
     *     
     */
    public XLnPastDueInfoCType getXLnPastDueInfo() {
        return xLnPastDueInfo;
    }

    /**
     * Sets the value of the xLnPastDueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLnPastDueInfoCType }
     *     
     */
    public void setXLnPastDueInfo(XLnPastDueInfoCType value) {
        this.xLnPastDueInfo = value;
    }

    /**
     * Gets the value of the xLnPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XLnPmtInfoCType }
     *     
     */
    public XLnPmtInfoCType getXLnPmtInfo() {
        return xLnPmtInfo;
    }

    /**
     * Sets the value of the xLnPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLnPmtInfoCType }
     *     
     */
    public void setXLnPmtInfo(XLnPmtInfoCType value) {
        this.xLnPmtInfo = value;
    }

    /**
     * Gets the value of the xLnProtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XLnProtInfoCType }
     *     
     */
    public XLnProtInfoCType getXLnProtInfo() {
        return xLnProtInfo;
    }

    /**
     * Sets the value of the xLnProtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLnProtInfoCType }
     *     
     */
    public void setXLnProtInfo(XLnProtInfoCType value) {
        this.xLnProtInfo = value;
    }

    /**
     * Gets the value of the xLnRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XLnRateInfoCType }
     *     
     */
    public XLnRateInfoCType getXLnRateInfo() {
        return xLnRateInfo;
    }

    /**
     * Sets the value of the xLnRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLnRateInfoCType }
     *     
     */
    public void setXLnRateInfo(XLnRateInfoCType value) {
        this.xLnRateInfo = value;
    }

    /**
     * Gets the value of the xLnRealEstateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XLnRealEstateInfoCType }
     *     
     */
    public XLnRealEstateInfoCType getXLnRealEstateInfo() {
        return xLnRealEstateInfo;
    }

    /**
     * Sets the value of the xLnRealEstateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLnRealEstateInfoCType }
     *     
     */
    public void setXLnRealEstateInfo(XLnRealEstateInfoCType value) {
        this.xLnRealEstateInfo = value;
    }

    /**
     * Gets the value of the xLnRenExtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XLnRenExtInfoCType }
     *     
     */
    public XLnRenExtInfoCType getXLnRenExtInfo() {
        return xLnRenExtInfo;
    }

    /**
     * Sets the value of the xLnRenExtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLnRenExtInfoCType }
     *     
     */
    public void setXLnRenExtInfo(XLnRenExtInfoCType value) {
        this.xLnRenExtInfo = value;
    }

    /**
     * Gets the value of the xLnRegRptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XLnRegRptInfoCType }
     *     
     */
    public XLnRegRptInfoCType getXLnRegRptInfo() {
        return xLnRegRptInfo;
    }

    /**
     * Sets the value of the xLnRegRptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLnRegRptInfoCType }
     *     
     */
    public void setXLnRegRptInfo(XLnRegRptInfoCType value) {
        this.xLnRegRptInfo = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
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
     * Gets the value of the xLnMtgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XLnMtgInfoCType }
     *     
     */
    public XLnMtgInfoCType getXLnMtgInfo() {
        return xLnMtgInfo;
    }

    /**
     * Sets the value of the xLnMtgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLnMtgInfoCType }
     *     
     */
    public void setXLnMtgInfo(XLnMtgInfoCType value) {
        this.xLnMtgInfo = value;
    }

    /**
     * Gets the value of the xLnStopInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XLnStopInfoCType }
     *     
     */
    public XLnStopInfoCType getXLnStopInfo() {
        return xLnStopInfo;
    }

    /**
     * Sets the value of the xLnStopInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLnStopInfoCType }
     *     
     */
    public void setXLnStopInfo(XLnStopInfoCType value) {
        this.xLnStopInfo = value;
    }

    /**
     * Gets the value of the xIdVerify property.
     * 
     * @return
     *     possible object is
     *     {@link XIdVerifyCType }
     *     
     */
    public XIdVerifyCType getXIdVerify() {
        return xIdVerify;
    }

    /**
     * Sets the value of the xIdVerify property.
     * 
     * @param value
     *     allowed object is
     *     {@link XIdVerifyCType }
     *     
     */
    public void setXIdVerify(XIdVerifyCType value) {
        this.xIdVerify = value;
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
     * Gets the value of the xachPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XACHPmtInfoCType }
     *     
     */
    public XACHPmtInfoCType getXACHPmtInfo() {
        return xachPmtInfo;
    }

    /**
     * Sets the value of the xachPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XACHPmtInfoCType }
     *     
     */
    public void setXACHPmtInfo(XACHPmtInfoCType value) {
        this.xachPmtInfo = value;
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
     * Gets the value of the xPromoInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XPromoInfoCType }
     *     
     */
    public XPromoInfoCType getXPromoInfo() {
        return xPromoInfo;
    }

    /**
     * Sets the value of the xPromoInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPromoInfoCType }
     *     
     */
    public void setXPromoInfo(XPromoInfoCType value) {
        this.xPromoInfo = value;
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

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
