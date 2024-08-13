
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
 * <p>Java class for BilPaySchedPmtSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPaySchedPmtSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType"/&gt;
 *         &lt;element name="BilPayProd" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayProd_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubId" type="{http://jackhenry.com/jxchange/TPG/2008}SubId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtLowAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LowAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtHighAmt" type="{http://jackhenry.com/jxchange/TPG/2008}HighAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtStat" type="{http://jackhenry.com/jxchange/TPG/2008}PmtStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeId" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilPaySchedPmtSrchArray" type="{http://jackhenry.com/jxchange/TPG/2008}BilPaySchedPmtSrchArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PayeePmtMthd" type="{http://jackhenry.com/jxchange/TPG/2008}PmtMthd_Type" minOccurs="0"/&gt;
 *           &lt;element name="P2PFilter" type="{http://jackhenry.com/jxchange/TPG/2008}P2PFilter_Type" minOccurs="0"/&gt;
 *           &lt;element name="RecurFilter" type="{http://jackhenry.com/jxchange/TPG/2008}RecurFilter_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PmtIntentType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtIntentType_Type" minOccurs="0"/&gt;
 *             &lt;element name="XferFilter" type="{http://jackhenry.com/jxchange/TPG/2008}XferFilter_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="CardPayFilter" type="{http://jackhenry.com/jxchange/TPG/2008}CardPayFilter_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BilPaySchedPmtSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "bilPayProd",
    "subId",
    "pmtStartDt",
    "pmtEndDt",
    "pmtLowAmt",
    "pmtHighAmt",
    "pmtStat",
    "payeeId",
    "bilPaySchedPmtSrchArray",
    "custom",
    "ver1",
    "payeePmtMthd",
    "p2PFilter",
    "recurFilter",
    "ver2",
    "pmtIntentType",
    "xferFilter",
    "ver3",
    "cardPayFilter",
    "ver4",
    "any"
})
public class BilPaySchedPmtSrchRsMType {

    @XmlElement(name = "SrchMsgRsHdr", required = true)
    protected SrchMsgRsHdrCType srchMsgRsHdr;
    @XmlElementRef(name = "BilPayProd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilPayProdType> bilPayProd;
    @XmlElementRef(name = "SubId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SubIdType> subId;
    @XmlElementRef(name = "PmtStartDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StartDtType> pmtStartDt;
    @XmlElementRef(name = "PmtEndDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EndDtType> pmtEndDt;
    @XmlElementRef(name = "PmtLowAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LowAmtType> pmtLowAmt;
    @XmlElementRef(name = "PmtHighAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HighAmtType> pmtHighAmt;
    @XmlElementRef(name = "PmtStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtStatType> pmtStat;
    @XmlElementRef(name = "PayeeId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PayeeIdType> payeeId;
    @XmlElementRef(name = "BilPaySchedPmtSrchArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilPaySchedPmtSrchArrayAType> bilPaySchedPmtSrchArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PayeePmtMthd")
    protected PmtMthdType payeePmtMthd;
    @XmlElement(name = "P2PFilter")
    protected P2PFilterType p2PFilter;
    @XmlElement(name = "RecurFilter")
    protected RecurFilterType recurFilter;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PmtIntentType")
    protected PmtIntentTypeType pmtIntentType;
    @XmlElement(name = "XferFilter")
    protected XferFilterType xferFilter;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElementRef(name = "CardPayFilter", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CardPayFilterType> cardPayFilter;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
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
     * Gets the value of the pmtStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public JAXBElement<StartDtType> getPmtStartDt() {
        return pmtStartDt;
    }

    /**
     * Sets the value of the pmtStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public void setPmtStartDt(JAXBElement<StartDtType> value) {
        this.pmtStartDt = value;
    }

    /**
     * Gets the value of the pmtEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public JAXBElement<EndDtType> getPmtEndDt() {
        return pmtEndDt;
    }

    /**
     * Sets the value of the pmtEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public void setPmtEndDt(JAXBElement<EndDtType> value) {
        this.pmtEndDt = value;
    }

    /**
     * Gets the value of the pmtLowAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LowAmtType }{@code >}
     *     
     */
    public JAXBElement<LowAmtType> getPmtLowAmt() {
        return pmtLowAmt;
    }

    /**
     * Sets the value of the pmtLowAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LowAmtType }{@code >}
     *     
     */
    public void setPmtLowAmt(JAXBElement<LowAmtType> value) {
        this.pmtLowAmt = value;
    }

    /**
     * Gets the value of the pmtHighAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HighAmtType }{@code >}
     *     
     */
    public JAXBElement<HighAmtType> getPmtHighAmt() {
        return pmtHighAmt;
    }

    /**
     * Sets the value of the pmtHighAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HighAmtType }{@code >}
     *     
     */
    public void setPmtHighAmt(JAXBElement<HighAmtType> value) {
        this.pmtHighAmt = value;
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
     * Gets the value of the payeeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PayeeIdType }{@code >}
     *     
     */
    public JAXBElement<PayeeIdType> getPayeeId() {
        return payeeId;
    }

    /**
     * Sets the value of the payeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PayeeIdType }{@code >}
     *     
     */
    public void setPayeeId(JAXBElement<PayeeIdType> value) {
        this.payeeId = value;
    }

    /**
     * Gets the value of the bilPaySchedPmtSrchArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilPaySchedPmtSrchArrayAType }{@code >}
     *     
     */
    public JAXBElement<BilPaySchedPmtSrchArrayAType> getBilPaySchedPmtSrchArray() {
        return bilPaySchedPmtSrchArray;
    }

    /**
     * Sets the value of the bilPaySchedPmtSrchArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilPaySchedPmtSrchArrayAType }{@code >}
     *     
     */
    public void setBilPaySchedPmtSrchArray(JAXBElement<BilPaySchedPmtSrchArrayAType> value) {
        this.bilPaySchedPmtSrchArray = value;
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
     * Gets the value of the payeePmtMthd property.
     * 
     * @return
     *     possible object is
     *     {@link PmtMthdType }
     *     
     */
    public PmtMthdType getPayeePmtMthd() {
        return payeePmtMthd;
    }

    /**
     * Sets the value of the payeePmtMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtMthdType }
     *     
     */
    public void setPayeePmtMthd(PmtMthdType value) {
        this.payeePmtMthd = value;
    }

    /**
     * Gets the value of the p2PFilter property.
     * 
     * @return
     *     possible object is
     *     {@link P2PFilterType }
     *     
     */
    public P2PFilterType getP2PFilter() {
        return p2PFilter;
    }

    /**
     * Sets the value of the p2PFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link P2PFilterType }
     *     
     */
    public void setP2PFilter(P2PFilterType value) {
        this.p2PFilter = value;
    }

    /**
     * Gets the value of the recurFilter property.
     * 
     * @return
     *     possible object is
     *     {@link RecurFilterType }
     *     
     */
    public RecurFilterType getRecurFilter() {
        return recurFilter;
    }

    /**
     * Sets the value of the recurFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurFilterType }
     *     
     */
    public void setRecurFilter(RecurFilterType value) {
        this.recurFilter = value;
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
     * Gets the value of the pmtIntentType property.
     * 
     * @return
     *     possible object is
     *     {@link PmtIntentTypeType }
     *     
     */
    public PmtIntentTypeType getPmtIntentType() {
        return pmtIntentType;
    }

    /**
     * Sets the value of the pmtIntentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtIntentTypeType }
     *     
     */
    public void setPmtIntentType(PmtIntentTypeType value) {
        this.pmtIntentType = value;
    }

    /**
     * Gets the value of the xferFilter property.
     * 
     * @return
     *     possible object is
     *     {@link XferFilterType }
     *     
     */
    public XferFilterType getXferFilter() {
        return xferFilter;
    }

    /**
     * Sets the value of the xferFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferFilterType }
     *     
     */
    public void setXferFilter(XferFilterType value) {
        this.xferFilter = value;
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
     * Gets the value of the cardPayFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CardPayFilterType }{@code >}
     *     
     */
    public JAXBElement<CardPayFilterType> getCardPayFilter() {
        return cardPayFilter;
    }

    /**
     * Sets the value of the cardPayFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CardPayFilterType }{@code >}
     *     
     */
    public void setCardPayFilter(JAXBElement<CardPayFilterType> value) {
        this.cardPayFilter = value;
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
