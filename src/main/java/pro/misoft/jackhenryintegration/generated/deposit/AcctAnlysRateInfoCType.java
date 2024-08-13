
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for AcctAnlysRateInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctAnlysRateInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EarnCrRate" type="{http://jackhenry.com/jxchange/TPG/2008}EarnCrRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="EarnCrRateIdx" type="{http://jackhenry.com/jxchange/TPG/2008}EarnCrRateIdx_Type" minOccurs="0"/&gt;
 *         &lt;element name="EarnCrRateVar" type="{http://jackhenry.com/jxchange/TPG/2008}RateVar_Type" minOccurs="0"/&gt;
 *         &lt;element name="EarnCrRateVarCode" type="{http://jackhenry.com/jxchange/TPG/2008}RateVarCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EarnCrRateFlr" type="{http://jackhenry.com/jxchange/TPG/2008}RateFlr_Type" minOccurs="0"/&gt;
 *         &lt;element name="EarnCrRateCeil" type="{http://jackhenry.com/jxchange/TPG/2008}RateCeil_Type" minOccurs="0"/&gt;
 *         &lt;element name="NegCrRate" type="{http://jackhenry.com/jxchange/TPG/2008}NegCrRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="NegCrRateIdx" type="{http://jackhenry.com/jxchange/TPG/2008}NegCrRateIdx_Type" minOccurs="0"/&gt;
 *         &lt;element name="NegCrRateVar" type="{http://jackhenry.com/jxchange/TPG/2008}RateVar_Type" minOccurs="0"/&gt;
 *         &lt;element name="NegCrRateVarCode" type="{http://jackhenry.com/jxchange/TPG/2008}RateVarCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NegCrRateFlr" type="{http://jackhenry.com/jxchange/TPG/2008}RateFlr_Type" minOccurs="0"/&gt;
 *         &lt;element name="NegCrRateCeil" type="{http://jackhenry.com/jxchange/TPG/2008}RateCeil_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctAnlysRateArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysRateArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "AcctAnlysRateInfo_CType", propOrder = {
    "earnCrRate",
    "earnCrRateIdx",
    "earnCrRateVar",
    "earnCrRateVarCode",
    "earnCrRateFlr",
    "earnCrRateCeil",
    "negCrRate",
    "negCrRateIdx",
    "negCrRateVar",
    "negCrRateVarCode",
    "negCrRateFlr",
    "negCrRateCeil",
    "acctAnlysRateArray",
    "ver1",
    "any"
})
public class AcctAnlysRateInfoCType {

    @XmlElement(name = "EarnCrRate")
    protected EarnCrRateType earnCrRate;
    @XmlElement(name = "EarnCrRateIdx")
    protected EarnCrRateIdxType earnCrRateIdx;
    @XmlElement(name = "EarnCrRateVar")
    protected RateVarType earnCrRateVar;
    @XmlElement(name = "EarnCrRateVarCode")
    protected RateVarCodeType earnCrRateVarCode;
    @XmlElement(name = "EarnCrRateFlr")
    protected RateFlrType earnCrRateFlr;
    @XmlElement(name = "EarnCrRateCeil")
    protected RateCeilType earnCrRateCeil;
    @XmlElement(name = "NegCrRate")
    protected NegCrRateType negCrRate;
    @XmlElement(name = "NegCrRateIdx")
    protected NegCrRateIdxType negCrRateIdx;
    @XmlElement(name = "NegCrRateVar")
    protected RateVarType negCrRateVar;
    @XmlElement(name = "NegCrRateVarCode")
    protected RateVarCodeType negCrRateVarCode;
    @XmlElement(name = "NegCrRateFlr")
    protected RateFlrType negCrRateFlr;
    @XmlElement(name = "NegCrRateCeil")
    protected RateCeilType negCrRateCeil;
    @XmlElement(name = "AcctAnlysRateArray")
    protected AcctAnlysRateArrayAType acctAnlysRateArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the earnCrRate property.
     * 
     * @return
     *     possible object is
     *     {@link EarnCrRateType }
     *     
     */
    public EarnCrRateType getEarnCrRate() {
        return earnCrRate;
    }

    /**
     * Sets the value of the earnCrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarnCrRateType }
     *     
     */
    public void setEarnCrRate(EarnCrRateType value) {
        this.earnCrRate = value;
    }

    /**
     * Gets the value of the earnCrRateIdx property.
     * 
     * @return
     *     possible object is
     *     {@link EarnCrRateIdxType }
     *     
     */
    public EarnCrRateIdxType getEarnCrRateIdx() {
        return earnCrRateIdx;
    }

    /**
     * Sets the value of the earnCrRateIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarnCrRateIdxType }
     *     
     */
    public void setEarnCrRateIdx(EarnCrRateIdxType value) {
        this.earnCrRateIdx = value;
    }

    /**
     * Gets the value of the earnCrRateVar property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarType }
     *     
     */
    public RateVarType getEarnCrRateVar() {
        return earnCrRateVar;
    }

    /**
     * Sets the value of the earnCrRateVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarType }
     *     
     */
    public void setEarnCrRateVar(RateVarType value) {
        this.earnCrRateVar = value;
    }

    /**
     * Gets the value of the earnCrRateVarCode property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarCodeType }
     *     
     */
    public RateVarCodeType getEarnCrRateVarCode() {
        return earnCrRateVarCode;
    }

    /**
     * Sets the value of the earnCrRateVarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarCodeType }
     *     
     */
    public void setEarnCrRateVarCode(RateVarCodeType value) {
        this.earnCrRateVarCode = value;
    }

    /**
     * Gets the value of the earnCrRateFlr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFlrType }
     *     
     */
    public RateFlrType getEarnCrRateFlr() {
        return earnCrRateFlr;
    }

    /**
     * Sets the value of the earnCrRateFlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFlrType }
     *     
     */
    public void setEarnCrRateFlr(RateFlrType value) {
        this.earnCrRateFlr = value;
    }

    /**
     * Gets the value of the earnCrRateCeil property.
     * 
     * @return
     *     possible object is
     *     {@link RateCeilType }
     *     
     */
    public RateCeilType getEarnCrRateCeil() {
        return earnCrRateCeil;
    }

    /**
     * Sets the value of the earnCrRateCeil property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCeilType }
     *     
     */
    public void setEarnCrRateCeil(RateCeilType value) {
        this.earnCrRateCeil = value;
    }

    /**
     * Gets the value of the negCrRate property.
     * 
     * @return
     *     possible object is
     *     {@link NegCrRateType }
     *     
     */
    public NegCrRateType getNegCrRate() {
        return negCrRate;
    }

    /**
     * Sets the value of the negCrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegCrRateType }
     *     
     */
    public void setNegCrRate(NegCrRateType value) {
        this.negCrRate = value;
    }

    /**
     * Gets the value of the negCrRateIdx property.
     * 
     * @return
     *     possible object is
     *     {@link NegCrRateIdxType }
     *     
     */
    public NegCrRateIdxType getNegCrRateIdx() {
        return negCrRateIdx;
    }

    /**
     * Sets the value of the negCrRateIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegCrRateIdxType }
     *     
     */
    public void setNegCrRateIdx(NegCrRateIdxType value) {
        this.negCrRateIdx = value;
    }

    /**
     * Gets the value of the negCrRateVar property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarType }
     *     
     */
    public RateVarType getNegCrRateVar() {
        return negCrRateVar;
    }

    /**
     * Sets the value of the negCrRateVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarType }
     *     
     */
    public void setNegCrRateVar(RateVarType value) {
        this.negCrRateVar = value;
    }

    /**
     * Gets the value of the negCrRateVarCode property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarCodeType }
     *     
     */
    public RateVarCodeType getNegCrRateVarCode() {
        return negCrRateVarCode;
    }

    /**
     * Sets the value of the negCrRateVarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarCodeType }
     *     
     */
    public void setNegCrRateVarCode(RateVarCodeType value) {
        this.negCrRateVarCode = value;
    }

    /**
     * Gets the value of the negCrRateFlr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFlrType }
     *     
     */
    public RateFlrType getNegCrRateFlr() {
        return negCrRateFlr;
    }

    /**
     * Sets the value of the negCrRateFlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFlrType }
     *     
     */
    public void setNegCrRateFlr(RateFlrType value) {
        this.negCrRateFlr = value;
    }

    /**
     * Gets the value of the negCrRateCeil property.
     * 
     * @return
     *     possible object is
     *     {@link RateCeilType }
     *     
     */
    public RateCeilType getNegCrRateCeil() {
        return negCrRateCeil;
    }

    /**
     * Sets the value of the negCrRateCeil property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCeilType }
     *     
     */
    public void setNegCrRateCeil(RateCeilType value) {
        this.negCrRateCeil = value;
    }

    /**
     * Gets the value of the acctAnlysRateArray property.
     * 
     * @return
     *     possible object is
     *     {@link AcctAnlysRateArrayAType }
     *     
     */
    public AcctAnlysRateArrayAType getAcctAnlysRateArray() {
        return acctAnlysRateArray;
    }

    /**
     * Sets the value of the acctAnlysRateArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAnlysRateArrayAType }
     *     
     */
    public void setAcctAnlysRateArray(AcctAnlysRateArrayAType value) {
        this.acctAnlysRateArray = value;
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
