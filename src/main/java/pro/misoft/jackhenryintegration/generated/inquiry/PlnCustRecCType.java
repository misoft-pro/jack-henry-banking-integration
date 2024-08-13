
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PlnCustRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlnCustRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlnCust" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCust_CType" minOccurs="0"/&gt;
 *         &lt;element name="PlnAddrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PlnAddrInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PlnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PlnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfDistDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BenfDistDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnFeeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFeeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SpousPlnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SpousPlnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustAgeAtEOY" type="{http://jackhenry.com/jxchange/TPG/2008}CustAgeAtEOY_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeceasedDt" type="{http://jackhenry.com/jxchange/TPG/2008}DeceasedDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnAvgRate" type="{http://jackhenry.com/jxchange/TPG/2008}PlnAvgRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnYTDInt" type="{http://jackhenry.com/jxchange/TPG/2008}PlnYTDInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnType" type="{http://jackhenry.com/jxchange/TPG/2008}PlnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CondNotfArray" type="{http://jackhenry.com/jxchange/TPG/2008}CondNotfArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "PlnCustRec_CType", propOrder = {
    "plnCust",
    "plnAddrInfo",
    "plnDesc",
    "benfDistDesc",
    "plnFeeDesc",
    "spousPlnDesc",
    "custAgeAtEOY",
    "birthDt",
    "deceasedDt",
    "plnAvgRate",
    "plnCurBal",
    "plnYTDInt",
    "plnType",
    "condNotfArray",
    "custom",
    "ver1",
    "any"
})
public class PlnCustRecCType {

    @XmlElement(name = "PlnCust")
    protected PlnCustCType plnCust;
    @XmlElement(name = "PlnAddrInfo")
    protected PlnAddrInfoCType plnAddrInfo;
    @XmlElement(name = "PlnDesc")
    protected PlnDescType plnDesc;
    @XmlElement(name = "BenfDistDesc")
    protected BenfDistDescType benfDistDesc;
    @XmlElement(name = "PlnFeeDesc")
    protected PlnFeeDescType plnFeeDesc;
    @XmlElement(name = "SpousPlnDesc")
    protected SpousPlnDescType spousPlnDesc;
    @XmlElement(name = "CustAgeAtEOY")
    protected CustAgeAtEOYType custAgeAtEOY;
    @XmlElement(name = "BirthDt")
    protected BirthDtType birthDt;
    @XmlElement(name = "DeceasedDt")
    protected DeceasedDtType deceasedDt;
    @XmlElement(name = "PlnAvgRate")
    protected PlnAvgRateType plnAvgRate;
    @XmlElement(name = "PlnCurBal")
    protected PlnCurBalType plnCurBal;
    @XmlElement(name = "PlnYTDInt")
    protected PlnYTDIntType plnYTDInt;
    @XmlElement(name = "PlnType")
    protected PlnTypeType plnType;
    @XmlElement(name = "CondNotfArray")
    protected CondNotfArrayAType condNotfArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the plnCust property.
     * 
     * @return
     *     possible object is
     *     {@link PlnCustCType }
     *     
     */
    public PlnCustCType getPlnCust() {
        return plnCust;
    }

    /**
     * Sets the value of the plnCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnCustCType }
     *     
     */
    public void setPlnCust(PlnCustCType value) {
        this.plnCust = value;
    }

    /**
     * Gets the value of the plnAddrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PlnAddrInfoCType }
     *     
     */
    public PlnAddrInfoCType getPlnAddrInfo() {
        return plnAddrInfo;
    }

    /**
     * Sets the value of the plnAddrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnAddrInfoCType }
     *     
     */
    public void setPlnAddrInfo(PlnAddrInfoCType value) {
        this.plnAddrInfo = value;
    }

    /**
     * Gets the value of the plnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PlnDescType }
     *     
     */
    public PlnDescType getPlnDesc() {
        return plnDesc;
    }

    /**
     * Sets the value of the plnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnDescType }
     *     
     */
    public void setPlnDesc(PlnDescType value) {
        this.plnDesc = value;
    }

    /**
     * Gets the value of the benfDistDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BenfDistDescType }
     *     
     */
    public BenfDistDescType getBenfDistDesc() {
        return benfDistDesc;
    }

    /**
     * Sets the value of the benfDistDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfDistDescType }
     *     
     */
    public void setBenfDistDesc(BenfDistDescType value) {
        this.benfDistDesc = value;
    }

    /**
     * Gets the value of the plnFeeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PlnFeeDescType }
     *     
     */
    public PlnFeeDescType getPlnFeeDesc() {
        return plnFeeDesc;
    }

    /**
     * Sets the value of the plnFeeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnFeeDescType }
     *     
     */
    public void setPlnFeeDesc(PlnFeeDescType value) {
        this.plnFeeDesc = value;
    }

    /**
     * Gets the value of the spousPlnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SpousPlnDescType }
     *     
     */
    public SpousPlnDescType getSpousPlnDesc() {
        return spousPlnDesc;
    }

    /**
     * Sets the value of the spousPlnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpousPlnDescType }
     *     
     */
    public void setSpousPlnDesc(SpousPlnDescType value) {
        this.spousPlnDesc = value;
    }

    /**
     * Gets the value of the custAgeAtEOY property.
     * 
     * @return
     *     possible object is
     *     {@link CustAgeAtEOYType }
     *     
     */
    public CustAgeAtEOYType getCustAgeAtEOY() {
        return custAgeAtEOY;
    }

    /**
     * Sets the value of the custAgeAtEOY property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAgeAtEOYType }
     *     
     */
    public void setCustAgeAtEOY(CustAgeAtEOYType value) {
        this.custAgeAtEOY = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDtType }
     *     
     */
    public BirthDtType getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDtType }
     *     
     */
    public void setBirthDt(BirthDtType value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the deceasedDt property.
     * 
     * @return
     *     possible object is
     *     {@link DeceasedDtType }
     *     
     */
    public DeceasedDtType getDeceasedDt() {
        return deceasedDt;
    }

    /**
     * Sets the value of the deceasedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeceasedDtType }
     *     
     */
    public void setDeceasedDt(DeceasedDtType value) {
        this.deceasedDt = value;
    }

    /**
     * Gets the value of the plnAvgRate property.
     * 
     * @return
     *     possible object is
     *     {@link PlnAvgRateType }
     *     
     */
    public PlnAvgRateType getPlnAvgRate() {
        return plnAvgRate;
    }

    /**
     * Sets the value of the plnAvgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnAvgRateType }
     *     
     */
    public void setPlnAvgRate(PlnAvgRateType value) {
        this.plnAvgRate = value;
    }

    /**
     * Gets the value of the plnCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link PlnCurBalType }
     *     
     */
    public PlnCurBalType getPlnCurBal() {
        return plnCurBal;
    }

    /**
     * Sets the value of the plnCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnCurBalType }
     *     
     */
    public void setPlnCurBal(PlnCurBalType value) {
        this.plnCurBal = value;
    }

    /**
     * Gets the value of the plnYTDInt property.
     * 
     * @return
     *     possible object is
     *     {@link PlnYTDIntType }
     *     
     */
    public PlnYTDIntType getPlnYTDInt() {
        return plnYTDInt;
    }

    /**
     * Sets the value of the plnYTDInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnYTDIntType }
     *     
     */
    public void setPlnYTDInt(PlnYTDIntType value) {
        this.plnYTDInt = value;
    }

    /**
     * Gets the value of the plnType property.
     * 
     * @return
     *     possible object is
     *     {@link PlnTypeType }
     *     
     */
    public PlnTypeType getPlnType() {
        return plnType;
    }

    /**
     * Sets the value of the plnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnTypeType }
     *     
     */
    public void setPlnType(PlnTypeType value) {
        this.plnType = value;
    }

    /**
     * Gets the value of the condNotfArray property.
     * 
     * @return
     *     possible object is
     *     {@link CondNotfArrayAType }
     *     
     */
    public CondNotfArrayAType getCondNotfArray() {
        return condNotfArray;
    }

    /**
     * Sets the value of the condNotfArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CondNotfArrayAType }
     *     
     */
    public void setCondNotfArray(CondNotfArrayAType value) {
        this.condNotfArray = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
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
