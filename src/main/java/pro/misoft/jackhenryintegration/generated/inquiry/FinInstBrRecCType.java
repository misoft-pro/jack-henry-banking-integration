
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
 * <p>Java class for FinInstBrRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinInstBrRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegionCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CustNum" type="{http://jackhenry.com/jxchange/TPG/2008}CustNum_Type" minOccurs="0"/&gt;
 *           &lt;element name="DepAcctNum" type="{http://jackhenry.com/jxchange/TPG/2008}DepAcctNum_Type" minOccurs="0"/&gt;
 *           &lt;element name="LnAcctNum" type="{http://jackhenry.com/jxchange/TPG/2008}LnAcctNum_Type" minOccurs="0"/&gt;
 *           &lt;element name="FinInstAssetAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FinInstAssetAmt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="BrandInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}BrandInfoRec_CType" minOccurs="0"/&gt;
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
@XmlType(name = "FinInstBrRec_CType", propOrder = {
    "brCode",
    "brName",
    "brAddr",
    "regionCode",
    "phoneArray",
    "custom",
    "ver1",
    "custNum",
    "depAcctNum",
    "lnAcctNum",
    "finInstAssetAmt",
    "ver2",
    "brandInfoRec",
    "ver3",
    "any"
})
public class FinInstBrRecCType {

    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "BrName")
    protected ComNameType brName;
    @XmlElement(name = "BrAddr")
    protected AddrCType brAddr;
    @XmlElement(name = "RegionCode")
    protected RegionCodeType regionCode;
    @XmlElement(name = "PhoneArray")
    protected PhoneArrayAType phoneArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CustNum")
    protected CustNumType custNum;
    @XmlElement(name = "DepAcctNum")
    protected DepAcctNumType depAcctNum;
    @XmlElement(name = "LnAcctNum")
    protected LnAcctNumType lnAcctNum;
    @XmlElement(name = "FinInstAssetAmt")
    protected FinInstAssetAmtType finInstAssetAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "BrandInfoRec")
    protected BrandInfoRecCType brandInfoRec;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setBrCode(BrCodeType value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the brName property.
     * 
     * @return
     *     possible object is
     *     {@link ComNameType }
     *     
     */
    public ComNameType getBrName() {
        return brName;
    }

    /**
     * Sets the value of the brName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComNameType }
     *     
     */
    public void setBrName(ComNameType value) {
        this.brName = value;
    }

    /**
     * Gets the value of the brAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getBrAddr() {
        return brAddr;
    }

    /**
     * Sets the value of the brAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setBrAddr(AddrCType value) {
        this.brAddr = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCodeType }
     *     
     */
    public RegionCodeType getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCodeType }
     *     
     */
    public void setRegionCode(RegionCodeType value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the phoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getPhoneArray() {
        return phoneArray;
    }

    /**
     * Sets the value of the phoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setPhoneArray(PhoneArrayAType value) {
        this.phoneArray = value;
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
     * Gets the value of the custNum property.
     * 
     * @return
     *     possible object is
     *     {@link CustNumType }
     *     
     */
    public CustNumType getCustNum() {
        return custNum;
    }

    /**
     * Sets the value of the custNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustNumType }
     *     
     */
    public void setCustNum(CustNumType value) {
        this.custNum = value;
    }

    /**
     * Gets the value of the depAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctNumType }
     *     
     */
    public DepAcctNumType getDepAcctNum() {
        return depAcctNum;
    }

    /**
     * Sets the value of the depAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctNumType }
     *     
     */
    public void setDepAcctNum(DepAcctNumType value) {
        this.depAcctNum = value;
    }

    /**
     * Gets the value of the lnAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link LnAcctNumType }
     *     
     */
    public LnAcctNumType getLnAcctNum() {
        return lnAcctNum;
    }

    /**
     * Sets the value of the lnAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnAcctNumType }
     *     
     */
    public void setLnAcctNum(LnAcctNumType value) {
        this.lnAcctNum = value;
    }

    /**
     * Gets the value of the finInstAssetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinInstAssetAmtType }
     *     
     */
    public FinInstAssetAmtType getFinInstAssetAmt() {
        return finInstAssetAmt;
    }

    /**
     * Sets the value of the finInstAssetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinInstAssetAmtType }
     *     
     */
    public void setFinInstAssetAmt(FinInstAssetAmtType value) {
        this.finInstAssetAmt = value;
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
     * Gets the value of the brandInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link BrandInfoRecCType }
     *     
     */
    public BrandInfoRecCType getBrandInfoRec() {
        return brandInfoRec;
    }

    /**
     * Sets the value of the brandInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandInfoRecCType }
     *     
     */
    public void setBrandInfoRec(BrandInfoRecCType value) {
        this.brandInfoRec = value;
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
