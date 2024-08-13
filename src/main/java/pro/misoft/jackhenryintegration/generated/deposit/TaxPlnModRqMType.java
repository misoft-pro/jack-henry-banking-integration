
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * <p>Java class for TaxPlnModRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxPlnModRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="ErrOvrRdInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ErrOvrRdInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnType" type="{http://jackhenry.com/jxchange/TPG/2008}PlnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnCode" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Dlt" type="{http://jackhenry.com/jxchange/TPG/2008}Dlt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnCust" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCust_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxPlnDist" type="{http://jackhenry.com/jxchange/TPG/2008}TaxPlnDist_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxPlnTaxInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TaxPlnTaxInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
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
@XmlType(name = "TaxPlnModRq_MType", propOrder = {
    "msgRqHdr",
    "errOvrRdInfoArray",
    "custId",
    "plnType",
    "plnCode",
    "dlt",
    "plnCust",
    "taxPlnDist",
    "taxPlnTaxInfo",
    "custom",
    "ver1",
    "accountId",
    "ver2",
    "actIntentKey",
    "ver3",
    "any"
})
public class TaxPlnModRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "ErrOvrRdInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrOvrRdInfoArrayAType> errOvrRdInfoArray;
    @XmlElementRef(name = "CustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustIdType> custId;
    @XmlElementRef(name = "PlnType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnTypeType> plnType;
    @XmlElementRef(name = "PlnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnCodeType> plnCode;
    @XmlElementRef(name = "Dlt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DltType> dlt;
    @XmlElementRef(name = "PlnCust", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnCustCType> plnCust;
    @XmlElementRef(name = "TaxPlnDist", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxPlnDistCType> taxPlnDist;
    @XmlElementRef(name = "TaxPlnTaxInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxPlnTaxInfoCType> taxPlnTaxInfo;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "ActIntentKey", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentKeyType> actIntentKey;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public MsgRqHdrCType getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Sets the value of the msgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public void setMsgRqHdr(MsgRqHdrCType value) {
        this.msgRqHdr = value;
    }

    /**
     * Gets the value of the errOvrRdInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}
     *     
     */
    public JAXBElement<ErrOvrRdInfoArrayAType> getErrOvrRdInfoArray() {
        return errOvrRdInfoArray;
    }

    /**
     * Sets the value of the errOvrRdInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}
     *     
     */
    public void setErrOvrRdInfoArray(JAXBElement<ErrOvrRdInfoArrayAType> value) {
        this.errOvrRdInfoArray = value;
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
     * Gets the value of the plnType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnTypeType }{@code >}
     *     
     */
    public JAXBElement<PlnTypeType> getPlnType() {
        return plnType;
    }

    /**
     * Sets the value of the plnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnTypeType }{@code >}
     *     
     */
    public void setPlnType(JAXBElement<PlnTypeType> value) {
        this.plnType = value;
    }

    /**
     * Gets the value of the plnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnCodeType }{@code >}
     *     
     */
    public JAXBElement<PlnCodeType> getPlnCode() {
        return plnCode;
    }

    /**
     * Sets the value of the plnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnCodeType }{@code >}
     *     
     */
    public void setPlnCode(JAXBElement<PlnCodeType> value) {
        this.plnCode = value;
    }

    /**
     * Gets the value of the dlt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DltType }{@code >}
     *     
     */
    public JAXBElement<DltType> getDlt() {
        return dlt;
    }

    /**
     * Sets the value of the dlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DltType }{@code >}
     *     
     */
    public void setDlt(JAXBElement<DltType> value) {
        this.dlt = value;
    }

    /**
     * Gets the value of the plnCust property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnCustCType }{@code >}
     *     
     */
    public JAXBElement<PlnCustCType> getPlnCust() {
        return plnCust;
    }

    /**
     * Sets the value of the plnCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnCustCType }{@code >}
     *     
     */
    public void setPlnCust(JAXBElement<PlnCustCType> value) {
        this.plnCust = value;
    }

    /**
     * Gets the value of the taxPlnDist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxPlnDistCType }{@code >}
     *     
     */
    public JAXBElement<TaxPlnDistCType> getTaxPlnDist() {
        return taxPlnDist;
    }

    /**
     * Sets the value of the taxPlnDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxPlnDistCType }{@code >}
     *     
     */
    public void setTaxPlnDist(JAXBElement<TaxPlnDistCType> value) {
        this.taxPlnDist = value;
    }

    /**
     * Gets the value of the taxPlnTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxPlnTaxInfoCType }{@code >}
     *     
     */
    public JAXBElement<TaxPlnTaxInfoCType> getTaxPlnTaxInfo() {
        return taxPlnTaxInfo;
    }

    /**
     * Sets the value of the taxPlnTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxPlnTaxInfoCType }{@code >}
     *     
     */
    public void setTaxPlnTaxInfo(JAXBElement<TaxPlnTaxInfoCType> value) {
        this.taxPlnTaxInfo = value;
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
