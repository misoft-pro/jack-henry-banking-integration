
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
 * <p>Java class for AcctSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType"/&gt;
 *         &lt;element name="AcctSrchRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctSrchRecArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *           &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *           &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AvlBalCalcCode" type="{http://jackhenry.com/jxchange/TPG/2008}AvlBalCalcCode_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="BrandCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrandCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AcctSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "acctSrchRecArray",
    "custom",
    "ver1",
    "custId",
    "acctType",
    "personName",
    "taxId",
    "ver2",
    "avlBalCalcCode",
    "ver3",
    "brandCode",
    "ver4",
    "any"
})
public class AcctSrchRsMType {

    @XmlElement(name = "SrchMsgRsHdr", required = true)
    protected SrchMsgRsHdrCType srchMsgRsHdr;
    @XmlElementRef(name = "AcctSrchRecArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctSrchRecArrayAType> acctSrchRecArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "CustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustIdType> custId;
    @XmlElementRef(name = "AcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctTypeType> acctType;
    @XmlElementRef(name = "PersonName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonNameCType> personName;
    @XmlElementRef(name = "TaxId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxIdType> taxId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "AvlBalCalcCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AvlBalCalcCodeType> avlBalCalcCode;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElementRef(name = "BrandCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrandCodeType> brandCode;
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
     * Gets the value of the acctSrchRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctSrchRecArrayAType }{@code >}
     *     
     */
    public JAXBElement<AcctSrchRecArrayAType> getAcctSrchRecArray() {
        return acctSrchRecArray;
    }

    /**
     * Sets the value of the acctSrchRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctSrchRecArrayAType }{@code >}
     *     
     */
    public void setAcctSrchRecArray(JAXBElement<AcctSrchRecArrayAType> value) {
        this.acctSrchRecArray = value;
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
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctTypeType }{@code >}
     *     
     */
    public JAXBElement<AcctTypeType> getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctTypeType }{@code >}
     *     
     */
    public void setAcctType(JAXBElement<AcctTypeType> value) {
        this.acctType = value;
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
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}
     *     
     */
    public JAXBElement<TaxIdType> getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}
     *     
     */
    public void setTaxId(JAXBElement<TaxIdType> value) {
        this.taxId = value;
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
     * Gets the value of the avlBalCalcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AvlBalCalcCodeType }{@code >}
     *     
     */
    public JAXBElement<AvlBalCalcCodeType> getAvlBalCalcCode() {
        return avlBalCalcCode;
    }

    /**
     * Sets the value of the avlBalCalcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AvlBalCalcCodeType }{@code >}
     *     
     */
    public void setAvlBalCalcCode(JAXBElement<AvlBalCalcCodeType> value) {
        this.avlBalCalcCode = value;
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
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BrandCodeType }{@code >}
     *     
     */
    public JAXBElement<BrandCodeType> getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BrandCodeType }{@code >}
     *     
     */
    public void setBrandCode(JAXBElement<BrandCodeType> value) {
        this.brandCode = value;
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
