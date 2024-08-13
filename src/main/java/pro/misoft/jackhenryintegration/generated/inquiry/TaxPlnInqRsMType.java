
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
 * <p>Java class for TaxPlnInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxPlnInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlanCode" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnCustRec" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCustRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_TaxPlnDist" type="{http://jackhenry.com/jxchange/TPG/2008}x_TaxPlnDist_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_PlnTaxInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_PlnTaxInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ActIntent" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntent_Type" minOccurs="0"/&gt;
 *             &lt;element name="ActIntentKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TaxPlnInqRs_MType", propOrder = {
    "msgRsHdr",
    "custId",
    "planCode",
    "plnCustRec",
    "xTaxPlnDist",
    "xPlnTaxInfo",
    "custom",
    "ver1",
    "accountId",
    "ver2",
    "actIntent",
    "actIntentKey",
    "ver3",
    "any"
})
public class TaxPlnInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "CustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustIdType> custId;
    @XmlElementRef(name = "PlanCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnCodeType> planCode;
    @XmlElementRef(name = "PlnCustRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnCustRecCType> plnCustRec;
    @XmlElementRef(name = "x_TaxPlnDist", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XTaxPlnDistCType> xTaxPlnDist;
    @XmlElementRef(name = "x_PlnTaxInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XPlnTaxInfoCType> xPlnTaxInfo;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "ActIntent", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentType> actIntent;
    @XmlElementRef(name = "ActIntentKey", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentKeyType> actIntentKey;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
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
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustIdType }{@code >}
     *     
     */
    public JAXBElement<CustIdType> getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustIdType }{@code >}
     *     
     */
    public void setCustId(JAXBElement<CustIdType> value) {
        this.custId = value;
    }

    /**
     * Gets the value of the planCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnCodeType }{@code >}
     *     
     */
    public JAXBElement<PlnCodeType> getPlanCode() {
        return planCode;
    }

    /**
     * Sets the value of the planCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnCodeType }{@code >}
     *     
     */
    public void setPlanCode(JAXBElement<PlnCodeType> value) {
        this.planCode = value;
    }

    /**
     * Gets the value of the plnCustRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnCustRecCType }{@code >}
     *     
     */
    public JAXBElement<PlnCustRecCType> getPlnCustRec() {
        return plnCustRec;
    }

    /**
     * Sets the value of the plnCustRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnCustRecCType }{@code >}
     *     
     */
    public void setPlnCustRec(JAXBElement<PlnCustRecCType> value) {
        this.plnCustRec = value;
    }

    /**
     * Gets the value of the xTaxPlnDist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XTaxPlnDistCType }{@code >}
     *     
     */
    public JAXBElement<XTaxPlnDistCType> getXTaxPlnDist() {
        return xTaxPlnDist;
    }

    /**
     * Sets the value of the xTaxPlnDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XTaxPlnDistCType }{@code >}
     *     
     */
    public void setXTaxPlnDist(JAXBElement<XTaxPlnDistCType> value) {
        this.xTaxPlnDist = value;
    }

    /**
     * Gets the value of the xPlnTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XPlnTaxInfoCType }{@code >}
     *     
     */
    public JAXBElement<XPlnTaxInfoCType> getXPlnTaxInfo() {
        return xPlnTaxInfo;
    }

    /**
     * Sets the value of the xPlnTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XPlnTaxInfoCType }{@code >}
     *     
     */
    public void setXPlnTaxInfo(JAXBElement<XPlnTaxInfoCType> value) {
        this.xPlnTaxInfo = value;
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
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<AccountIdCType> value) {
        this.accountId = value;
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
