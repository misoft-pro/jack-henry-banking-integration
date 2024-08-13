
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
 * <p>Java class for XferSrcDestSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferSrcDestSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferSrcDestType" type="{http://jackhenry.com/jxchange/TPG/2008}XferSrcDestType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="AcctTitleArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_AType" minOccurs="0"/&gt;
 *         &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferExclu" type="{http://jackhenry.com/jxchange/TPG/2008}XferExclu_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferSrcDestSrchArray" type="{http://jackhenry.com/jxchange/TPG/2008}XferSrcDestSrchArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="XferSrcDestSrchRqArray" type="{http://jackhenry.com/jxchange/TPG/2008}XferSrcDestSrchRqArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "XferSrcDestSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "accountId",
    "custId",
    "xferSrcDestType",
    "personName",
    "acctTitleArray",
    "prodCode",
    "prodDesc",
    "xferExclu",
    "xferSrcDestSrchArray",
    "custom",
    "ver1",
    "xferSrcDestSrchRqArray",
    "ver2",
    "any"
})
public class XferSrcDestSrchRsMType {

    @XmlElement(name = "SrchMsgRsHdr", required = true)
    protected SrchMsgRsHdrCType srchMsgRsHdr;
    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElementRef(name = "CustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustIdType> custId;
    @XmlElementRef(name = "XferSrcDestType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferSrcDestTypeType> xferSrcDestType;
    @XmlElementRef(name = "PersonName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonNameCType> personName;
    @XmlElementRef(name = "AcctTitleArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctTitleAType> acctTitleArray;
    @XmlElementRef(name = "ProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProdCodeType> prodCode;
    @XmlElementRef(name = "ProdDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProdDescType> prodDesc;
    @XmlElementRef(name = "XferExclu", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferExcluType> xferExclu;
    @XmlElementRef(name = "XferSrcDestSrchArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferSrcDestSrchArrayAType> xferSrcDestSrchArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "XferSrcDestSrchRqArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferSrcDestSrchRqArrayAType> xferSrcDestSrchRqArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
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
     * Gets the value of the xferSrcDestType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferSrcDestTypeType }{@code >}
     *     
     */
    public JAXBElement<XferSrcDestTypeType> getXferSrcDestType() {
        return xferSrcDestType;
    }

    /**
     * Sets the value of the xferSrcDestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferSrcDestTypeType }{@code >}
     *     
     */
    public void setXferSrcDestType(JAXBElement<XferSrcDestTypeType> value) {
        this.xferSrcDestType = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}
     *     
     */
    public JAXBElement<PersonNameCType> getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}
     *     
     */
    public void setPersonName(JAXBElement<PersonNameCType> value) {
        this.personName = value;
    }

    /**
     * Gets the value of the acctTitleArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctTitleAType }{@code >}
     *     
     */
    public JAXBElement<AcctTitleAType> getAcctTitleArray() {
        return acctTitleArray;
    }

    /**
     * Sets the value of the acctTitleArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctTitleAType }{@code >}
     *     
     */
    public void setAcctTitleArray(JAXBElement<AcctTitleAType> value) {
        this.acctTitleArray = value;
    }

    /**
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public JAXBElement<ProdCodeType> getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public void setProdCode(JAXBElement<ProdCodeType> value) {
        this.prodCode = value;
    }

    /**
     * Gets the value of the prodDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProdDescType }{@code >}
     *     
     */
    public JAXBElement<ProdDescType> getProdDesc() {
        return prodDesc;
    }

    /**
     * Sets the value of the prodDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProdDescType }{@code >}
     *     
     */
    public void setProdDesc(JAXBElement<ProdDescType> value) {
        this.prodDesc = value;
    }

    /**
     * Gets the value of the xferExclu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferExcluType }{@code >}
     *     
     */
    public JAXBElement<XferExcluType> getXferExclu() {
        return xferExclu;
    }

    /**
     * Sets the value of the xferExclu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferExcluType }{@code >}
     *     
     */
    public void setXferExclu(JAXBElement<XferExcluType> value) {
        this.xferExclu = value;
    }

    /**
     * Gets the value of the xferSrcDestSrchArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferSrcDestSrchArrayAType }{@code >}
     *     
     */
    public JAXBElement<XferSrcDestSrchArrayAType> getXferSrcDestSrchArray() {
        return xferSrcDestSrchArray;
    }

    /**
     * Sets the value of the xferSrcDestSrchArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferSrcDestSrchArrayAType }{@code >}
     *     
     */
    public void setXferSrcDestSrchArray(JAXBElement<XferSrcDestSrchArrayAType> value) {
        this.xferSrcDestSrchArray = value;
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
     * Gets the value of the xferSrcDestSrchRqArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferSrcDestSrchRqArrayAType }{@code >}
     *     
     */
    public JAXBElement<XferSrcDestSrchRqArrayAType> getXferSrcDestSrchRqArray() {
        return xferSrcDestSrchRqArray;
    }

    /**
     * Sets the value of the xferSrcDestSrchRqArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferSrcDestSrchRqArrayAType }{@code >}
     *     
     */
    public void setXferSrcDestSrchRqArray(JAXBElement<XferSrcDestSrchRqArrayAType> value) {
        this.xferSrcDestSrchRqArray = value;
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
