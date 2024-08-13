
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
 * <p>Java class for EscrwInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscrwInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType"/&gt;
 *         &lt;element name="x_EscrwPmtBal" type="{http://jackhenry.com/jxchange/TPG/2008}x_EscrwPmtBal_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_EscrwAnlys" type="{http://jackhenry.com/jxchange/TPG/2008}x_EscrwAnlys_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_EscrwPayeeArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_EscrwPayeeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="x_EscrwFldInsurArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_EscrwFldInsurArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ActIntent" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntent_Type" minOccurs="0"/&gt;
 *           &lt;element name="ActIntentKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type" minOccurs="0"/&gt;
 *           &lt;element name="x_EscrwFedWith" type="{http://jackhenry.com/jxchange/TPG/2008}FedWith_CType" minOccurs="0"/&gt;
 *           &lt;element name="x_EscrwStateWith" type="{http://jackhenry.com/jxchange/TPG/2008}StateWith_CType" minOccurs="0"/&gt;
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
@XmlType(name = "EscrwInqRs_MType", propOrder = {
    "msgRsHdr",
    "accountId",
    "xEscrwPmtBal",
    "xEscrwAnlys",
    "xEscrwPayeeArray",
    "xEscrwFldInsurArray",
    "custom",
    "ver1",
    "actIntent",
    "actIntentKey",
    "xEscrwFedWith",
    "xEscrwStateWith",
    "ver2",
    "any"
})
public class EscrwInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElement(name = "AccountId", required = true)
    protected AccountIdCType accountId;
    @XmlElementRef(name = "x_EscrwPmtBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XEscrwPmtBalCType> xEscrwPmtBal;
    @XmlElementRef(name = "x_EscrwAnlys", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XEscrwAnlysCType> xEscrwAnlys;
    @XmlElementRef(name = "x_EscrwPayeeArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XEscrwPayeeArrayAType> xEscrwPayeeArray;
    @XmlElementRef(name = "x_EscrwFldInsurArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XEscrwFldInsurArrayAType> xEscrwFldInsurArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "ActIntent", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentType> actIntent;
    @XmlElementRef(name = "ActIntentKey", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentKeyType> actIntentKey;
    @XmlElementRef(name = "x_EscrwFedWith", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FedWithCType> xEscrwFedWith;
    @XmlElementRef(name = "x_EscrwStateWith", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithCType> xEscrwStateWith;
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
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setAccountId(AccountIdCType value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the xEscrwPmtBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XEscrwPmtBalCType }{@code >}
     *     
     */
    public JAXBElement<XEscrwPmtBalCType> getXEscrwPmtBal() {
        return xEscrwPmtBal;
    }

    /**
     * Sets the value of the xEscrwPmtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XEscrwPmtBalCType }{@code >}
     *     
     */
    public void setXEscrwPmtBal(JAXBElement<XEscrwPmtBalCType> value) {
        this.xEscrwPmtBal = value;
    }

    /**
     * Gets the value of the xEscrwAnlys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XEscrwAnlysCType }{@code >}
     *     
     */
    public JAXBElement<XEscrwAnlysCType> getXEscrwAnlys() {
        return xEscrwAnlys;
    }

    /**
     * Sets the value of the xEscrwAnlys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XEscrwAnlysCType }{@code >}
     *     
     */
    public void setXEscrwAnlys(JAXBElement<XEscrwAnlysCType> value) {
        this.xEscrwAnlys = value;
    }

    /**
     * Gets the value of the xEscrwPayeeArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XEscrwPayeeArrayAType }{@code >}
     *     
     */
    public JAXBElement<XEscrwPayeeArrayAType> getXEscrwPayeeArray() {
        return xEscrwPayeeArray;
    }

    /**
     * Sets the value of the xEscrwPayeeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XEscrwPayeeArrayAType }{@code >}
     *     
     */
    public void setXEscrwPayeeArray(JAXBElement<XEscrwPayeeArrayAType> value) {
        this.xEscrwPayeeArray = value;
    }

    /**
     * Gets the value of the xEscrwFldInsurArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XEscrwFldInsurArrayAType }{@code >}
     *     
     */
    public JAXBElement<XEscrwFldInsurArrayAType> getXEscrwFldInsurArray() {
        return xEscrwFldInsurArray;
    }

    /**
     * Sets the value of the xEscrwFldInsurArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XEscrwFldInsurArrayAType }{@code >}
     *     
     */
    public void setXEscrwFldInsurArray(JAXBElement<XEscrwFldInsurArrayAType> value) {
        this.xEscrwFldInsurArray = value;
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
     * Gets the value of the xEscrwFedWith property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FedWithCType }{@code >}
     *     
     */
    public JAXBElement<FedWithCType> getXEscrwFedWith() {
        return xEscrwFedWith;
    }

    /**
     * Sets the value of the xEscrwFedWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FedWithCType }{@code >}
     *     
     */
    public void setXEscrwFedWith(JAXBElement<FedWithCType> value) {
        this.xEscrwFedWith = value;
    }

    /**
     * Gets the value of the xEscrwStateWith property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithCType }{@code >}
     *     
     */
    public JAXBElement<StateWithCType> getXEscrwStateWith() {
        return xEscrwStateWith;
    }

    /**
     * Sets the value of the xEscrwStateWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithCType }{@code >}
     *     
     */
    public void setXEscrwStateWith(JAXBElement<StateWithCType> value) {
        this.xEscrwStateWith = value;
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
