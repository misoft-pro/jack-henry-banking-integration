
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
 * <p>Java class for BilPayPayeeInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayPayeeInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="BilPayProd" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayProd_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubId" type="{http://jackhenry.com/jxchange/TPG/2008}SubId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeId" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActIntent" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntent_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilPayPayeeInfo" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayPayeeInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PayeePmtMthd" type="{http://jackhenry.com/jxchange/TPG/2008}PmtMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeLastPdAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeLastPdAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeLastPdDt" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeLastPdDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FirstAvlProcDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstAvlProcDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FirstAvlEstArvDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstAvlEstArvDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EstArvDay" type="{http://jackhenry.com/jxchange/TPG/2008}EstArvDay_Type" minOccurs="0"/&gt;
 *         &lt;element name="RushOptArray" type="{http://jackhenry.com/jxchange/TPG/2008}RushOptArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PayeeStat" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActIntentKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="SubModMerAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}SubModMerAcctId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="x_ElecMerPayeeInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_ElecMerPayeeInfo_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="AlwCardFundedType" type="{http://jackhenry.com/jxchange/TPG/2008}AlwCardFundedType_Type" minOccurs="0"/&gt;
 *               &lt;element name="x_CardFundedPayeeArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_CardFundedPayeeArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "BilPayPayeeInqRs_MType", propOrder = {
    "msgRsHdr",
    "bilPayProd",
    "subId",
    "payeeId",
    "actIntent",
    "bilPayPayeeInfo",
    "payeePmtMthd",
    "payeeLastPdAmt",
    "payeeLastPdDt",
    "firstAvlProcDt",
    "firstAvlEstArvDt",
    "estArvDay",
    "rushOptArray",
    "payeeStat",
    "actIntentKey",
    "custom",
    "ver1",
    "subModMerAcctId",
    "ver2",
    "xElecMerPayeeInfo",
    "ver3",
    "alwCardFundedType",
    "xCardFundedPayeeArray",
    "ver4",
    "any"
})
public class BilPayPayeeInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "BilPayProd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilPayProdType> bilPayProd;
    @XmlElementRef(name = "SubId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SubIdType> subId;
    @XmlElementRef(name = "PayeeId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PayeeIdType> payeeId;
    @XmlElementRef(name = "ActIntent", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentType> actIntent;
    @XmlElementRef(name = "BilPayPayeeInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BilPayPayeeInfoCType> bilPayPayeeInfo;
    @XmlElement(name = "PayeePmtMthd")
    protected PmtMthdType payeePmtMthd;
    @XmlElement(name = "PayeeLastPdAmt")
    protected PayeeLastPdAmtType payeeLastPdAmt;
    @XmlElement(name = "PayeeLastPdDt")
    protected PayeeLastPdDtType payeeLastPdDt;
    @XmlElement(name = "FirstAvlProcDt")
    protected FirstAvlProcDtType firstAvlProcDt;
    @XmlElement(name = "FirstAvlEstArvDt")
    protected FirstAvlEstArvDtType firstAvlEstArvDt;
    @XmlElement(name = "EstArvDay")
    protected Integer estArvDay;
    @XmlElement(name = "RushOptArray")
    protected RushOptArrayAType rushOptArray;
    @XmlElement(name = "PayeeStat")
    protected PayeeStatType payeeStat;
    @XmlElement(name = "ActIntentKey")
    protected ActIntentKeyType actIntentKey;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "SubModMerAcctId")
    protected SubModMerAcctIdType subModMerAcctId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "x_ElecMerPayeeInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XElecMerPayeeInfoCType> xElecMerPayeeInfo;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElementRef(name = "AlwCardFundedType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AlwCardFundedTypeType> alwCardFundedType;
    @XmlElementRef(name = "x_CardFundedPayeeArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XCardFundedPayeeArrayAType> xCardFundedPayeeArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
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
     * Gets the value of the bilPayPayeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilPayPayeeInfoCType }{@code >}
     *     
     */
    public JAXBElement<BilPayPayeeInfoCType> getBilPayPayeeInfo() {
        return bilPayPayeeInfo;
    }

    /**
     * Sets the value of the bilPayPayeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilPayPayeeInfoCType }{@code >}
     *     
     */
    public void setBilPayPayeeInfo(JAXBElement<BilPayPayeeInfoCType> value) {
        this.bilPayPayeeInfo = value;
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
     * Gets the value of the payeeLastPdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeLastPdAmtType }
     *     
     */
    public PayeeLastPdAmtType getPayeeLastPdAmt() {
        return payeeLastPdAmt;
    }

    /**
     * Sets the value of the payeeLastPdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeLastPdAmtType }
     *     
     */
    public void setPayeeLastPdAmt(PayeeLastPdAmtType value) {
        this.payeeLastPdAmt = value;
    }

    /**
     * Gets the value of the payeeLastPdDt property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeLastPdDtType }
     *     
     */
    public PayeeLastPdDtType getPayeeLastPdDt() {
        return payeeLastPdDt;
    }

    /**
     * Sets the value of the payeeLastPdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeLastPdDtType }
     *     
     */
    public void setPayeeLastPdDt(PayeeLastPdDtType value) {
        this.payeeLastPdDt = value;
    }

    /**
     * Gets the value of the firstAvlProcDt property.
     * 
     * @return
     *     possible object is
     *     {@link FirstAvlProcDtType }
     *     
     */
    public FirstAvlProcDtType getFirstAvlProcDt() {
        return firstAvlProcDt;
    }

    /**
     * Sets the value of the firstAvlProcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstAvlProcDtType }
     *     
     */
    public void setFirstAvlProcDt(FirstAvlProcDtType value) {
        this.firstAvlProcDt = value;
    }

    /**
     * Gets the value of the firstAvlEstArvDt property.
     * 
     * @return
     *     possible object is
     *     {@link FirstAvlEstArvDtType }
     *     
     */
    public FirstAvlEstArvDtType getFirstAvlEstArvDt() {
        return firstAvlEstArvDt;
    }

    /**
     * Sets the value of the firstAvlEstArvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstAvlEstArvDtType }
     *     
     */
    public void setFirstAvlEstArvDt(FirstAvlEstArvDtType value) {
        this.firstAvlEstArvDt = value;
    }

    /**
     * Gets the value of the estArvDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstArvDay() {
        return estArvDay;
    }

    /**
     * Sets the value of the estArvDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstArvDay(Integer value) {
        this.estArvDay = value;
    }

    /**
     * Gets the value of the rushOptArray property.
     * 
     * @return
     *     possible object is
     *     {@link RushOptArrayAType }
     *     
     */
    public RushOptArrayAType getRushOptArray() {
        return rushOptArray;
    }

    /**
     * Sets the value of the rushOptArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RushOptArrayAType }
     *     
     */
    public void setRushOptArray(RushOptArrayAType value) {
        this.rushOptArray = value;
    }

    /**
     * Gets the value of the payeeStat property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeStatType }
     *     
     */
    public PayeeStatType getPayeeStat() {
        return payeeStat;
    }

    /**
     * Sets the value of the payeeStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeStatType }
     *     
     */
    public void setPayeeStat(PayeeStatType value) {
        this.payeeStat = value;
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
     * Gets the value of the subModMerAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link SubModMerAcctIdType }
     *     
     */
    public SubModMerAcctIdType getSubModMerAcctId() {
        return subModMerAcctId;
    }

    /**
     * Sets the value of the subModMerAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubModMerAcctIdType }
     *     
     */
    public void setSubModMerAcctId(SubModMerAcctIdType value) {
        this.subModMerAcctId = value;
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
     * Gets the value of the xElecMerPayeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XElecMerPayeeInfoCType }{@code >}
     *     
     */
    public JAXBElement<XElecMerPayeeInfoCType> getXElecMerPayeeInfo() {
        return xElecMerPayeeInfo;
    }

    /**
     * Sets the value of the xElecMerPayeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XElecMerPayeeInfoCType }{@code >}
     *     
     */
    public void setXElecMerPayeeInfo(JAXBElement<XElecMerPayeeInfoCType> value) {
        this.xElecMerPayeeInfo = value;
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
     * Gets the value of the alwCardFundedType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlwCardFundedTypeType }{@code >}
     *     
     */
    public JAXBElement<AlwCardFundedTypeType> getAlwCardFundedType() {
        return alwCardFundedType;
    }

    /**
     * Sets the value of the alwCardFundedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlwCardFundedTypeType }{@code >}
     *     
     */
    public void setAlwCardFundedType(JAXBElement<AlwCardFundedTypeType> value) {
        this.alwCardFundedType = value;
    }

    /**
     * Gets the value of the xCardFundedPayeeArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XCardFundedPayeeArrayAType }{@code >}
     *     
     */
    public JAXBElement<XCardFundedPayeeArrayAType> getXCardFundedPayeeArray() {
        return xCardFundedPayeeArray;
    }

    /**
     * Sets the value of the xCardFundedPayeeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XCardFundedPayeeArrayAType }{@code >}
     *     
     */
    public void setXCardFundedPayeeArray(JAXBElement<XCardFundedPayeeArrayAType> value) {
        this.xCardFundedPayeeArray = value;
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
