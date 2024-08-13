
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
 * <p>Java class for BilPayPayeeSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayPayeeSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType"/&gt;
 *         &lt;element name="BilPayProd" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayProd_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubId" type="{http://jackhenry.com/jxchange/TPG/2008}SubId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeCatName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeCatName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExclNonAct" type="{http://jackhenry.com/jxchange/TPG/2008}ExclNonAct_Type" minOccurs="0"/&gt;
 *         &lt;element name="IncDlt" type="{http://jackhenry.com/jxchange/TPG/2008}IncDlt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilPayPayeeSrchArray" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayPayeeSrchArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ElecMerPayeeOnly" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerPayeeOnly_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="LastMainStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="LastMainEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BilPayPayeeSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "bilPayProd",
    "subId",
    "payeeCatName",
    "exclNonAct",
    "incDlt",
    "bilPayPayeeSrchArray",
    "custom",
    "ver1",
    "elecMerPayeeOnly",
    "ver2",
    "lastMainStartDt",
    "lastMainEndDt",
    "ver3",
    "cardPayFilter",
    "ver4",
    "any"
})
public class BilPayPayeeSrchRsMType {

    @XmlElement(name = "SrchMsgRsHdr", required = true)
    protected SrchMsgRsHdrCType srchMsgRsHdr;
    @XmlElementRef(name = "BilPayProd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilPayProdType> bilPayProd;
    @XmlElementRef(name = "SubId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SubIdType> subId;
    @XmlElementRef(name = "PayeeCatName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PayeeCatNameType> payeeCatName;
    @XmlElementRef(name = "ExclNonAct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclNonActType> exclNonAct;
    @XmlElementRef(name = "IncDlt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IncDltType> incDlt;
    @XmlElementRef(name = "BilPayPayeeSrchArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilPayPayeeSrchArrayAType> bilPayPayeeSrchArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "ElecMerPayeeOnly", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ElecMerPayeeOnlyType> elecMerPayeeOnly;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "LastMainStartDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StartDtType> lastMainStartDt;
    @XmlElementRef(name = "LastMainEndDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EndDtType> lastMainEndDt;
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
     * Gets the value of the payeeCatName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PayeeCatNameType }{@code >}
     *     
     */
    public JAXBElement<PayeeCatNameType> getPayeeCatName() {
        return payeeCatName;
    }

    /**
     * Sets the value of the payeeCatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PayeeCatNameType }{@code >}
     *     
     */
    public void setPayeeCatName(JAXBElement<PayeeCatNameType> value) {
        this.payeeCatName = value;
    }

    /**
     * Gets the value of the exclNonAct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclNonActType }{@code >}
     *     
     */
    public JAXBElement<ExclNonActType> getExclNonAct() {
        return exclNonAct;
    }

    /**
     * Sets the value of the exclNonAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclNonActType }{@code >}
     *     
     */
    public void setExclNonAct(JAXBElement<ExclNonActType> value) {
        this.exclNonAct = value;
    }

    /**
     * Gets the value of the incDlt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncDltType }{@code >}
     *     
     */
    public JAXBElement<IncDltType> getIncDlt() {
        return incDlt;
    }

    /**
     * Sets the value of the incDlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncDltType }{@code >}
     *     
     */
    public void setIncDlt(JAXBElement<IncDltType> value) {
        this.incDlt = value;
    }

    /**
     * Gets the value of the bilPayPayeeSrchArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilPayPayeeSrchArrayAType }{@code >}
     *     
     */
    public JAXBElement<BilPayPayeeSrchArrayAType> getBilPayPayeeSrchArray() {
        return bilPayPayeeSrchArray;
    }

    /**
     * Sets the value of the bilPayPayeeSrchArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilPayPayeeSrchArrayAType }{@code >}
     *     
     */
    public void setBilPayPayeeSrchArray(JAXBElement<BilPayPayeeSrchArrayAType> value) {
        this.bilPayPayeeSrchArray = value;
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
     * Gets the value of the elecMerPayeeOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElecMerPayeeOnlyType }{@code >}
     *     
     */
    public JAXBElement<ElecMerPayeeOnlyType> getElecMerPayeeOnly() {
        return elecMerPayeeOnly;
    }

    /**
     * Sets the value of the elecMerPayeeOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElecMerPayeeOnlyType }{@code >}
     *     
     */
    public void setElecMerPayeeOnly(JAXBElement<ElecMerPayeeOnlyType> value) {
        this.elecMerPayeeOnly = value;
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
     * Gets the value of the lastMainStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public JAXBElement<StartDtType> getLastMainStartDt() {
        return lastMainStartDt;
    }

    /**
     * Sets the value of the lastMainStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public void setLastMainStartDt(JAXBElement<StartDtType> value) {
        this.lastMainStartDt = value;
    }

    /**
     * Gets the value of the lastMainEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public JAXBElement<EndDtType> getLastMainEndDt() {
        return lastMainEndDt;
    }

    /**
     * Sets the value of the lastMainEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public void setLastMainEndDt(JAXBElement<EndDtType> value) {
        this.lastMainEndDt = value;
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
