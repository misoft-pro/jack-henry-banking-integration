
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for AddrAddRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddrAddRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="ErrOvrRdInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ErrOvrRdInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="AddrCatUse" type="{http://jackhenry.com/jxchange/TPG/2008}AddrCatUse_Type" minOccurs="0"/&gt;
 *         &lt;element name="AddrCat2Use" type="{http://jackhenry.com/jxchange/TPG/2008}AddrCat2Use_Type" minOccurs="0"/&gt;
 *         &lt;element name="DupAddrCat2Use" type="{http://jackhenry.com/jxchange/TPG/2008}DupAddrCat2Use_Type" minOccurs="0"/&gt;
 *         &lt;element name="WithNot" type="{http://jackhenry.com/jxchange/TPG/2008}WithNot_Type" minOccurs="0"/&gt;
 *         &lt;element name="AddrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AddrInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="StmtAddrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}StmtAddrInfo_CType" minOccurs="0"/&gt;
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
@XmlType(name = "AddrAddRq_MType", propOrder = {
    "msgRqHdr",
    "errOvrRdInfoArray",
    "custId",
    "accountId",
    "addrCatUse",
    "addrCat2Use",
    "dupAddrCat2Use",
    "withNot",
    "addrInfo",
    "stmtAddrInfo",
    "custom",
    "ver1",
    "any"
})
public class AddrAddRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "ErrOvrRdInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrOvrRdInfoArrayAType> errOvrRdInfoArray;
    @XmlElementRef(name = "CustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustIdType> custId;
    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElementRef(name = "AddrCatUse", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AddrCatUseType> addrCatUse;
    @XmlElementRef(name = "AddrCat2Use", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AddrCat2UseType> addrCat2Use;
    @XmlElementRef(name = "DupAddrCat2Use", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DupAddrCat2UseType> dupAddrCat2Use;
    @XmlElementRef(name = "WithNot", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WithNotType> withNot;
    @XmlElementRef(name = "AddrInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AddrInfoCType> addrInfo;
    @XmlElementRef(name = "StmtAddrInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtAddrInfoCType> stmtAddrInfo;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
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
     * Gets the value of the addrCatUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddrCatUseType }{@code >}
     *     
     */
    public JAXBElement<AddrCatUseType> getAddrCatUse() {
        return addrCatUse;
    }

    /**
     * Sets the value of the addrCatUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddrCatUseType }{@code >}
     *     
     */
    public void setAddrCatUse(JAXBElement<AddrCatUseType> value) {
        this.addrCatUse = value;
    }

    /**
     * Gets the value of the addrCat2Use property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddrCat2UseType }{@code >}
     *     
     */
    public JAXBElement<AddrCat2UseType> getAddrCat2Use() {
        return addrCat2Use;
    }

    /**
     * Sets the value of the addrCat2Use property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddrCat2UseType }{@code >}
     *     
     */
    public void setAddrCat2Use(JAXBElement<AddrCat2UseType> value) {
        this.addrCat2Use = value;
    }

    /**
     * Gets the value of the dupAddrCat2Use property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DupAddrCat2UseType }{@code >}
     *     
     */
    public JAXBElement<DupAddrCat2UseType> getDupAddrCat2Use() {
        return dupAddrCat2Use;
    }

    /**
     * Sets the value of the dupAddrCat2Use property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DupAddrCat2UseType }{@code >}
     *     
     */
    public void setDupAddrCat2Use(JAXBElement<DupAddrCat2UseType> value) {
        this.dupAddrCat2Use = value;
    }

    /**
     * Gets the value of the withNot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WithNotType }{@code >}
     *     
     */
    public JAXBElement<WithNotType> getWithNot() {
        return withNot;
    }

    /**
     * Sets the value of the withNot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WithNotType }{@code >}
     *     
     */
    public void setWithNot(JAXBElement<WithNotType> value) {
        this.withNot = value;
    }

    /**
     * Gets the value of the addrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddrInfoCType }{@code >}
     *     
     */
    public JAXBElement<AddrInfoCType> getAddrInfo() {
        return addrInfo;
    }

    /**
     * Sets the value of the addrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddrInfoCType }{@code >}
     *     
     */
    public void setAddrInfo(JAXBElement<AddrInfoCType> value) {
        this.addrInfo = value;
    }

    /**
     * Gets the value of the stmtAddrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtAddrInfoCType }{@code >}
     *     
     */
    public JAXBElement<StmtAddrInfoCType> getStmtAddrInfo() {
        return stmtAddrInfo;
    }

    /**
     * Sets the value of the stmtAddrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtAddrInfoCType }{@code >}
     *     
     */
    public void setStmtAddrInfo(JAXBElement<StmtAddrInfoCType> value) {
        this.stmtAddrInfo = value;
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
