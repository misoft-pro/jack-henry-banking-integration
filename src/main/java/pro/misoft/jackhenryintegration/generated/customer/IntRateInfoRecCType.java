
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for IntRateInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntRateInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateIdxDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdxDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateVar" type="{http://jackhenry.com/jxchange/TPG/2008}RateVar_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateVarCode" type="{http://jackhenry.com/jxchange/TPG/2008}RateVarCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegionCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateIdxSrcName" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdxSrcName_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateIdxSrcFreqDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdxSrcFreqDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateIdxStatType" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdxStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CurFactorIdx" type="{http://jackhenry.com/jxchange/TPG/2008}FactorIdx_Type" minOccurs="0"/&gt;
 *           &lt;element name="AltCalCode" type="{http://jackhenry.com/jxchange/TPG/2008}AltCalCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "IntRateInfoRec_CType", propOrder = {
    "rateIdxDesc",
    "intRate",
    "rateVar",
    "rateVarCode",
    "effDt",
    "rateIdxNum",
    "regionCode",
    "rateIdxSrcName",
    "rateIdxSrcFreqDesc",
    "rateIdxStatType",
    "custom",
    "ver1",
    "curFactorIdx",
    "altCalCode",
    "ver2",
    "any"
})
public class IntRateInfoRecCType {

    @XmlElement(name = "RateIdxDesc")
    protected RateIdxDescType rateIdxDesc;
    @XmlElement(name = "IntRate")
    protected IntRateType intRate;
    @XmlElement(name = "RateVar")
    protected RateVarType rateVar;
    @XmlElement(name = "RateVarCode")
    protected RateVarCodeType rateVarCode;
    @XmlElement(name = "EffDt")
    protected EffDtType effDt;
    @XmlElement(name = "RateIdxNum")
    protected RateIdxNumType rateIdxNum;
    @XmlElement(name = "RegionCode")
    protected RegionCodeType regionCode;
    @XmlElement(name = "RateIdxSrcName")
    protected RateIdxSrcNameType rateIdxSrcName;
    @XmlElement(name = "RateIdxSrcFreqDesc")
    protected RateIdxSrcFreqDescType rateIdxSrcFreqDesc;
    @XmlElement(name = "RateIdxStatType")
    protected RateIdxStatTypeType rateIdxStatType;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CurFactorIdx")
    protected FactorIdxType curFactorIdx;
    @XmlElement(name = "AltCalCode")
    protected AltCalCodeType altCalCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the rateIdxDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RateIdxDescType }
     *     
     */
    public RateIdxDescType getRateIdxDesc() {
        return rateIdxDesc;
    }

    /**
     * Sets the value of the rateIdxDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIdxDescType }
     *     
     */
    public void setRateIdxDesc(RateIdxDescType value) {
        this.rateIdxDesc = value;
    }

    /**
     * Gets the value of the intRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getIntRate() {
        return intRate;
    }

    /**
     * Sets the value of the intRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setIntRate(IntRateType value) {
        this.intRate = value;
    }

    /**
     * Gets the value of the rateVar property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarType }
     *     
     */
    public RateVarType getRateVar() {
        return rateVar;
    }

    /**
     * Sets the value of the rateVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarType }
     *     
     */
    public void setRateVar(RateVarType value) {
        this.rateVar = value;
    }

    /**
     * Gets the value of the rateVarCode property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarCodeType }
     *     
     */
    public RateVarCodeType getRateVarCode() {
        return rateVarCode;
    }

    /**
     * Sets the value of the rateVarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarCodeType }
     *     
     */
    public void setRateVarCode(RateVarCodeType value) {
        this.rateVarCode = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link EffDtType }
     *     
     */
    public EffDtType getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffDtType }
     *     
     */
    public void setEffDt(EffDtType value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the rateIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link RateIdxNumType }
     *     
     */
    public RateIdxNumType getRateIdxNum() {
        return rateIdxNum;
    }

    /**
     * Sets the value of the rateIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIdxNumType }
     *     
     */
    public void setRateIdxNum(RateIdxNumType value) {
        this.rateIdxNum = value;
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
     * Gets the value of the rateIdxSrcName property.
     * 
     * @return
     *     possible object is
     *     {@link RateIdxSrcNameType }
     *     
     */
    public RateIdxSrcNameType getRateIdxSrcName() {
        return rateIdxSrcName;
    }

    /**
     * Sets the value of the rateIdxSrcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIdxSrcNameType }
     *     
     */
    public void setRateIdxSrcName(RateIdxSrcNameType value) {
        this.rateIdxSrcName = value;
    }

    /**
     * Gets the value of the rateIdxSrcFreqDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RateIdxSrcFreqDescType }
     *     
     */
    public RateIdxSrcFreqDescType getRateIdxSrcFreqDesc() {
        return rateIdxSrcFreqDesc;
    }

    /**
     * Sets the value of the rateIdxSrcFreqDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIdxSrcFreqDescType }
     *     
     */
    public void setRateIdxSrcFreqDesc(RateIdxSrcFreqDescType value) {
        this.rateIdxSrcFreqDesc = value;
    }

    /**
     * Gets the value of the rateIdxStatType property.
     * 
     * @return
     *     possible object is
     *     {@link RateIdxStatTypeType }
     *     
     */
    public RateIdxStatTypeType getRateIdxStatType() {
        return rateIdxStatType;
    }

    /**
     * Sets the value of the rateIdxStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIdxStatTypeType }
     *     
     */
    public void setRateIdxStatType(RateIdxStatTypeType value) {
        this.rateIdxStatType = value;
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
     * Gets the value of the curFactorIdx property.
     * 
     * @return
     *     possible object is
     *     {@link FactorIdxType }
     *     
     */
    public FactorIdxType getCurFactorIdx() {
        return curFactorIdx;
    }

    /**
     * Sets the value of the curFactorIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactorIdxType }
     *     
     */
    public void setCurFactorIdx(FactorIdxType value) {
        this.curFactorIdx = value;
    }

    /**
     * Gets the value of the altCalCode property.
     * 
     * @return
     *     possible object is
     *     {@link AltCalCodeType }
     *     
     */
    public AltCalCodeType getAltCalCode() {
        return altCalCode;
    }

    /**
     * Sets the value of the altCalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltCalCodeType }
     *     
     */
    public void setAltCalCode(AltCalCodeType value) {
        this.altCalCode = value;
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
