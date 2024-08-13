
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for LnAdd_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnAdd_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}LnInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnBalDtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnBalDtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnDlrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnDlrInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnPastDueInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnPastDueInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnPmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnProtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnProtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnRateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnRateInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnRealEstateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnRealEstateInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnRenExtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnRenExtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnRegRptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnRegRptInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnMtgInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnMtgInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnStopInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnStopInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ACHPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ACHPmtInfo_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PromoInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PromoInfo_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LnAdd_CType", propOrder = {
    "lnInfoRec",
    "lnAcctInfo",
    "lnBalDtInfo",
    "lnDlrInfo",
    "lnPastDueInfo",
    "lnPmtInfo",
    "lnProtInfo",
    "lnRateInfo",
    "lnRealEstateInfo",
    "lnRenExtInfo",
    "lnRegRptInfo",
    "lnMtgInfo",
    "lnStopInfo",
    "custom",
    "ver1",
    "achPmtInfo",
    "ver2",
    "promoInfo",
    "ver3",
    "any"
})
public class LnAddCType {

    @XmlElement(name = "LnInfoRec")
    protected LnInfoRecCType lnInfoRec;
    @XmlElement(name = "LnAcctInfo")
    protected LnAcctInfoCType lnAcctInfo;
    @XmlElement(name = "LnBalDtInfo")
    protected LnBalDtInfoCType lnBalDtInfo;
    @XmlElement(name = "LnDlrInfo")
    protected LnDlrInfoCType lnDlrInfo;
    @XmlElement(name = "LnPastDueInfo")
    protected LnPastDueInfoCType lnPastDueInfo;
    @XmlElement(name = "LnPmtInfo")
    protected LnPmtInfoCType lnPmtInfo;
    @XmlElement(name = "LnProtInfo")
    protected LnProtInfoCType lnProtInfo;
    @XmlElement(name = "LnRateInfo")
    protected LnRateInfoCType lnRateInfo;
    @XmlElement(name = "LnRealEstateInfo")
    protected LnRealEstateInfoCType lnRealEstateInfo;
    @XmlElement(name = "LnRenExtInfo")
    protected LnRenExtInfoCType lnRenExtInfo;
    @XmlElement(name = "LnRegRptInfo")
    protected LnRegRptInfoCType lnRegRptInfo;
    @XmlElement(name = "LnMtgInfo")
    protected LnMtgInfoCType lnMtgInfo;
    @XmlElement(name = "LnStopInfo")
    protected LnStopInfoCType lnStopInfo;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ACHPmtInfo")
    protected ACHPmtInfoCType achPmtInfo;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PromoInfo")
    protected PromoInfoCType promoInfo;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link LnInfoRecCType }
     *     
     */
    public LnInfoRecCType getLnInfoRec() {
        return lnInfoRec;
    }

    /**
     * Sets the value of the lnInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnInfoRecCType }
     *     
     */
    public void setLnInfoRec(LnInfoRecCType value) {
        this.lnInfoRec = value;
    }

    /**
     * Gets the value of the lnAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnAcctInfoCType }
     *     
     */
    public LnAcctInfoCType getLnAcctInfo() {
        return lnAcctInfo;
    }

    /**
     * Sets the value of the lnAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnAcctInfoCType }
     *     
     */
    public void setLnAcctInfo(LnAcctInfoCType value) {
        this.lnAcctInfo = value;
    }

    /**
     * Gets the value of the lnBalDtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnBalDtInfoCType }
     *     
     */
    public LnBalDtInfoCType getLnBalDtInfo() {
        return lnBalDtInfo;
    }

    /**
     * Sets the value of the lnBalDtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnBalDtInfoCType }
     *     
     */
    public void setLnBalDtInfo(LnBalDtInfoCType value) {
        this.lnBalDtInfo = value;
    }

    /**
     * Gets the value of the lnDlrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnDlrInfoCType }
     *     
     */
    public LnDlrInfoCType getLnDlrInfo() {
        return lnDlrInfo;
    }

    /**
     * Sets the value of the lnDlrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnDlrInfoCType }
     *     
     */
    public void setLnDlrInfo(LnDlrInfoCType value) {
        this.lnDlrInfo = value;
    }

    /**
     * Gets the value of the lnPastDueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnPastDueInfoCType }
     *     
     */
    public LnPastDueInfoCType getLnPastDueInfo() {
        return lnPastDueInfo;
    }

    /**
     * Sets the value of the lnPastDueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnPastDueInfoCType }
     *     
     */
    public void setLnPastDueInfo(LnPastDueInfoCType value) {
        this.lnPastDueInfo = value;
    }

    /**
     * Gets the value of the lnPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnPmtInfoCType }
     *     
     */
    public LnPmtInfoCType getLnPmtInfo() {
        return lnPmtInfo;
    }

    /**
     * Sets the value of the lnPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnPmtInfoCType }
     *     
     */
    public void setLnPmtInfo(LnPmtInfoCType value) {
        this.lnPmtInfo = value;
    }

    /**
     * Gets the value of the lnProtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnProtInfoCType }
     *     
     */
    public LnProtInfoCType getLnProtInfo() {
        return lnProtInfo;
    }

    /**
     * Sets the value of the lnProtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnProtInfoCType }
     *     
     */
    public void setLnProtInfo(LnProtInfoCType value) {
        this.lnProtInfo = value;
    }

    /**
     * Gets the value of the lnRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnRateInfoCType }
     *     
     */
    public LnRateInfoCType getLnRateInfo() {
        return lnRateInfo;
    }

    /**
     * Sets the value of the lnRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnRateInfoCType }
     *     
     */
    public void setLnRateInfo(LnRateInfoCType value) {
        this.lnRateInfo = value;
    }

    /**
     * Gets the value of the lnRealEstateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnRealEstateInfoCType }
     *     
     */
    public LnRealEstateInfoCType getLnRealEstateInfo() {
        return lnRealEstateInfo;
    }

    /**
     * Sets the value of the lnRealEstateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnRealEstateInfoCType }
     *     
     */
    public void setLnRealEstateInfo(LnRealEstateInfoCType value) {
        this.lnRealEstateInfo = value;
    }

    /**
     * Gets the value of the lnRenExtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnRenExtInfoCType }
     *     
     */
    public LnRenExtInfoCType getLnRenExtInfo() {
        return lnRenExtInfo;
    }

    /**
     * Sets the value of the lnRenExtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnRenExtInfoCType }
     *     
     */
    public void setLnRenExtInfo(LnRenExtInfoCType value) {
        this.lnRenExtInfo = value;
    }

    /**
     * Gets the value of the lnRegRptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnRegRptInfoCType }
     *     
     */
    public LnRegRptInfoCType getLnRegRptInfo() {
        return lnRegRptInfo;
    }

    /**
     * Sets the value of the lnRegRptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnRegRptInfoCType }
     *     
     */
    public void setLnRegRptInfo(LnRegRptInfoCType value) {
        this.lnRegRptInfo = value;
    }

    /**
     * Gets the value of the lnMtgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnMtgInfoCType }
     *     
     */
    public LnMtgInfoCType getLnMtgInfo() {
        return lnMtgInfo;
    }

    /**
     * Sets the value of the lnMtgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnMtgInfoCType }
     *     
     */
    public void setLnMtgInfo(LnMtgInfoCType value) {
        this.lnMtgInfo = value;
    }

    /**
     * Gets the value of the lnStopInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnStopInfoCType }
     *     
     */
    public LnStopInfoCType getLnStopInfo() {
        return lnStopInfo;
    }

    /**
     * Sets the value of the lnStopInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnStopInfoCType }
     *     
     */
    public void setLnStopInfo(LnStopInfoCType value) {
        this.lnStopInfo = value;
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
     * Gets the value of the achPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ACHPmtInfoCType }
     *     
     */
    public ACHPmtInfoCType getACHPmtInfo() {
        return achPmtInfo;
    }

    /**
     * Sets the value of the achPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHPmtInfoCType }
     *     
     */
    public void setACHPmtInfo(ACHPmtInfoCType value) {
        this.achPmtInfo = value;
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
     * Gets the value of the promoInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PromoInfoCType }
     *     
     */
    public PromoInfoCType getPromoInfo() {
        return promoInfo;
    }

    /**
     * Sets the value of the promoInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromoInfoCType }
     *     
     */
    public void setPromoInfo(PromoInfoCType value) {
        this.promoInfo = value;
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
