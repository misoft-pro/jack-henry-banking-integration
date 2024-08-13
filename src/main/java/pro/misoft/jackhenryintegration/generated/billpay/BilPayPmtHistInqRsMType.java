
package pro.misoft.jackhenryintegration.generated.billpay;

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
 * <p>Java class for BilPayPmtHistInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayPmtHistInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="BilPayProd" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayProd_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubId" type="{http://jackhenry.com/jxchange/TPG/2008}SubId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtId" type="{http://jackhenry.com/jxchange/TPG/2008}PmtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="IncChkImg" type="{http://jackhenry.com/jxchange/TPG/2008}IncChkImg_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilPayPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayPmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PmtCrtDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCrtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtStat" type="{http://jackhenry.com/jxchange/TPG/2008}PmtStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtMthd" type="{http://jackhenry.com/jxchange/TPG/2008}PmtMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="x_PmtStatHistArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_PmtStatHistArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="x_PmtChkStatHistArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_PmtChkStatHistArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="x_PmtChkTrakInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_PmtChkTrakInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PmtChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtChkStat" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtChkImgInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkImgInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="x_ElecBilPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_ElecBilPmtInfo_CType" minOccurs="0"/&gt;
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
@XmlType(name = "BilPayPmtHistInqRs_MType", propOrder = {
    "msgRsHdr",
    "bilPayProd",
    "subId",
    "pmtId",
    "incChkImg",
    "bilPayPmtInfo",
    "pmtCrtDt",
    "pmtStat",
    "pmtMthd",
    "xPmtStatHistArray",
    "xPmtChkStatHistArray",
    "xPmtChkTrakInfo",
    "pmtChkNum",
    "pmtChkStat",
    "pmtChkImgInfo",
    "custom",
    "ver1",
    "xElecBilPmtInfo",
    "ver2",
    "any"
})
public class BilPayPmtHistInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "BilPayProd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilPayProdType> bilPayProd;
    @XmlElementRef(name = "SubId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SubIdType> subId;
    @XmlElementRef(name = "PmtId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtIdType> pmtId;
    @XmlElementRef(name = "IncChkImg", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IncChkImgType> incChkImg;
    @XmlElementRef(name = "BilPayPmtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilPayPmtInfoCType> bilPayPmtInfo;
    @XmlElementRef(name = "PmtCrtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtCrtDtType> pmtCrtDt;
    @XmlElementRef(name = "PmtStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtStatType> pmtStat;
    @XmlElementRef(name = "PmtMthd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtMthdType> pmtMthd;
    @XmlElementRef(name = "x_PmtStatHistArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XPmtStatHistArrayAType> xPmtStatHistArray;
    @XmlElementRef(name = "x_PmtChkStatHistArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XPmtChkStatHistArrayAType> xPmtChkStatHistArray;
    @XmlElementRef(name = "x_PmtChkTrakInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XPmtChkTrakInfoCType> xPmtChkTrakInfo;
    @XmlElementRef(name = "PmtChkNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtChkNumType> pmtChkNum;
    @XmlElementRef(name = "PmtChkStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtChkStatType> pmtChkStat;
    @XmlElementRef(name = "PmtChkImgInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtChkImgInfoCType> pmtChkImgInfo;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "x_ElecBilPmtInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XElecBilPmtInfoCType> xElecBilPmtInfo;
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
     * Gets the value of the bilPayProd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}
     *     
     */
    public JAXBElement<BilPayProdType> getBilPayProd() {
        return bilPayProd;
    }

    /**
     * Sets the value of the bilPayProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}
     *     
     */
    public void setBilPayProd(JAXBElement<BilPayProdType> value) {
        this.bilPayProd = value;
    }

    /**
     * Gets the value of the subId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubIdType }{@code >}
     *     
     */
    public JAXBElement<SubIdType> getSubId() {
        return subId;
    }

    /**
     * Sets the value of the subId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubIdType }{@code >}
     *     
     */
    public void setSubId(JAXBElement<SubIdType> value) {
        this.subId = value;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtIdType }{@code >}
     *     
     */
    public JAXBElement<PmtIdType> getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtIdType }{@code >}
     *     
     */
    public void setPmtId(JAXBElement<PmtIdType> value) {
        this.pmtId = value;
    }

    /**
     * Gets the value of the incChkImg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncChkImgType }{@code >}
     *     
     */
    public JAXBElement<IncChkImgType> getIncChkImg() {
        return incChkImg;
    }

    /**
     * Sets the value of the incChkImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncChkImgType }{@code >}
     *     
     */
    public void setIncChkImg(JAXBElement<IncChkImgType> value) {
        this.incChkImg = value;
    }

    /**
     * Gets the value of the bilPayPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilPayPmtInfoCType }{@code >}
     *     
     */
    public JAXBElement<BilPayPmtInfoCType> getBilPayPmtInfo() {
        return bilPayPmtInfo;
    }

    /**
     * Sets the value of the bilPayPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilPayPmtInfoCType }{@code >}
     *     
     */
    public void setBilPayPmtInfo(JAXBElement<BilPayPmtInfoCType> value) {
        this.bilPayPmtInfo = value;
    }

    /**
     * Gets the value of the pmtCrtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtCrtDtType }{@code >}
     *     
     */
    public JAXBElement<PmtCrtDtType> getPmtCrtDt() {
        return pmtCrtDt;
    }

    /**
     * Sets the value of the pmtCrtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtCrtDtType }{@code >}
     *     
     */
    public void setPmtCrtDt(JAXBElement<PmtCrtDtType> value) {
        this.pmtCrtDt = value;
    }

    /**
     * Gets the value of the pmtStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtStatType }{@code >}
     *     
     */
    public JAXBElement<PmtStatType> getPmtStat() {
        return pmtStat;
    }

    /**
     * Sets the value of the pmtStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtStatType }{@code >}
     *     
     */
    public void setPmtStat(JAXBElement<PmtStatType> value) {
        this.pmtStat = value;
    }

    /**
     * Gets the value of the pmtMthd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtMthdType }{@code >}
     *     
     */
    public JAXBElement<PmtMthdType> getPmtMthd() {
        return pmtMthd;
    }

    /**
     * Sets the value of the pmtMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtMthdType }{@code >}
     *     
     */
    public void setPmtMthd(JAXBElement<PmtMthdType> value) {
        this.pmtMthd = value;
    }

    /**
     * Gets the value of the xPmtStatHistArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XPmtStatHistArrayAType }{@code >}
     *     
     */
    public JAXBElement<XPmtStatHistArrayAType> getXPmtStatHistArray() {
        return xPmtStatHistArray;
    }

    /**
     * Sets the value of the xPmtStatHistArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XPmtStatHistArrayAType }{@code >}
     *     
     */
    public void setXPmtStatHistArray(JAXBElement<XPmtStatHistArrayAType> value) {
        this.xPmtStatHistArray = value;
    }

    /**
     * Gets the value of the xPmtChkStatHistArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XPmtChkStatHistArrayAType }{@code >}
     *     
     */
    public JAXBElement<XPmtChkStatHistArrayAType> getXPmtChkStatHistArray() {
        return xPmtChkStatHistArray;
    }

    /**
     * Sets the value of the xPmtChkStatHistArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XPmtChkStatHistArrayAType }{@code >}
     *     
     */
    public void setXPmtChkStatHistArray(JAXBElement<XPmtChkStatHistArrayAType> value) {
        this.xPmtChkStatHistArray = value;
    }

    /**
     * Gets the value of the xPmtChkTrakInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XPmtChkTrakInfoCType }{@code >}
     *     
     */
    public JAXBElement<XPmtChkTrakInfoCType> getXPmtChkTrakInfo() {
        return xPmtChkTrakInfo;
    }

    /**
     * Sets the value of the xPmtChkTrakInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XPmtChkTrakInfoCType }{@code >}
     *     
     */
    public void setXPmtChkTrakInfo(JAXBElement<XPmtChkTrakInfoCType> value) {
        this.xPmtChkTrakInfo = value;
    }

    /**
     * Gets the value of the pmtChkNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtChkNumType }{@code >}
     *     
     */
    public JAXBElement<PmtChkNumType> getPmtChkNum() {
        return pmtChkNum;
    }

    /**
     * Sets the value of the pmtChkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtChkNumType }{@code >}
     *     
     */
    public void setPmtChkNum(JAXBElement<PmtChkNumType> value) {
        this.pmtChkNum = value;
    }

    /**
     * Gets the value of the pmtChkStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtChkStatType }{@code >}
     *     
     */
    public JAXBElement<PmtChkStatType> getPmtChkStat() {
        return pmtChkStat;
    }

    /**
     * Sets the value of the pmtChkStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtChkStatType }{@code >}
     *     
     */
    public void setPmtChkStat(JAXBElement<PmtChkStatType> value) {
        this.pmtChkStat = value;
    }

    /**
     * Gets the value of the pmtChkImgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtChkImgInfoCType }{@code >}
     *     
     */
    public JAXBElement<PmtChkImgInfoCType> getPmtChkImgInfo() {
        return pmtChkImgInfo;
    }

    /**
     * Sets the value of the pmtChkImgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtChkImgInfoCType }{@code >}
     *     
     */
    public void setPmtChkImgInfo(JAXBElement<PmtChkImgInfoCType> value) {
        this.pmtChkImgInfo = value;
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
     * Gets the value of the xElecBilPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XElecBilPmtInfoCType }{@code >}
     *     
     */
    public JAXBElement<XElecBilPmtInfoCType> getXElecBilPmtInfo() {
        return xElecBilPmtInfo;
    }

    /**
     * Sets the value of the xElecBilPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XElecBilPmtInfoCType }{@code >}
     *     
     */
    public void setXElecBilPmtInfo(JAXBElement<XElecBilPmtInfoCType> value) {
        this.xElecBilPmtInfo = value;
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
