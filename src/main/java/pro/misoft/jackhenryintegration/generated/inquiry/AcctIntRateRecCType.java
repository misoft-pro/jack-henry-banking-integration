
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
 * <p>Java class for AcctIntRateRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctIntRateRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateIdxDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdxDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnnPctRate" type="{http://jackhenry.com/jxchange/TPG/2008}AnnPctRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnnPctYield" type="{http://jackhenry.com/jxchange/TPG/2008}AnnPctYield_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierBlendRate" type="{http://jackhenry.com/jxchange/TPG/2008}TierBlendRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierAnnPctRate" type="{http://jackhenry.com/jxchange/TPG/2008}TierAnnPctRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierAnnPctYield" type="{http://jackhenry.com/jxchange/TPG/2008}TierAnnPctYield_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRateTierRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}IntRateTierRecArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "AcctIntRateRec_CType", propOrder = {
    "intRate",
    "rateIdxNum",
    "rateIdxDesc",
    "annPctRate",
    "annPctYield",
    "tierBlendRate",
    "tierAnnPctRate",
    "tierAnnPctYield",
    "intRateTierRecArray",
    "ver1",
    "any"
})
public class AcctIntRateRecCType {

    @XmlElement(name = "IntRate")
    protected IntRateType intRate;
    @XmlElement(name = "RateIdxNum")
    protected RateIdxNumType rateIdxNum;
    @XmlElement(name = "RateIdxDesc")
    protected RateIdxDescType rateIdxDesc;
    @XmlElement(name = "AnnPctRate")
    protected AnnPctRateType annPctRate;
    @XmlElement(name = "AnnPctYield")
    protected AnnPctYieldType annPctYield;
    @XmlElement(name = "TierBlendRate")
    protected TierBlendRateType tierBlendRate;
    @XmlElement(name = "TierAnnPctRate")
    protected TierAnnPctRateType tierAnnPctRate;
    @XmlElement(name = "TierAnnPctYield")
    protected TierAnnPctYieldType tierAnnPctYield;
    @XmlElementRef(name = "IntRateTierRecArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntRateTierRecArrayAType> intRateTierRecArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the annPctRate property.
     * 
     * @return
     *     possible object is
     *     {@link AnnPctRateType }
     *     
     */
    public AnnPctRateType getAnnPctRate() {
        return annPctRate;
    }

    /**
     * Sets the value of the annPctRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnPctRateType }
     *     
     */
    public void setAnnPctRate(AnnPctRateType value) {
        this.annPctRate = value;
    }

    /**
     * Gets the value of the annPctYield property.
     * 
     * @return
     *     possible object is
     *     {@link AnnPctYieldType }
     *     
     */
    public AnnPctYieldType getAnnPctYield() {
        return annPctYield;
    }

    /**
     * Sets the value of the annPctYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnPctYieldType }
     *     
     */
    public void setAnnPctYield(AnnPctYieldType value) {
        this.annPctYield = value;
    }

    /**
     * Gets the value of the tierBlendRate property.
     * 
     * @return
     *     possible object is
     *     {@link TierBlendRateType }
     *     
     */
    public TierBlendRateType getTierBlendRate() {
        return tierBlendRate;
    }

    /**
     * Sets the value of the tierBlendRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierBlendRateType }
     *     
     */
    public void setTierBlendRate(TierBlendRateType value) {
        this.tierBlendRate = value;
    }

    /**
     * Gets the value of the tierAnnPctRate property.
     * 
     * @return
     *     possible object is
     *     {@link TierAnnPctRateType }
     *     
     */
    public TierAnnPctRateType getTierAnnPctRate() {
        return tierAnnPctRate;
    }

    /**
     * Sets the value of the tierAnnPctRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierAnnPctRateType }
     *     
     */
    public void setTierAnnPctRate(TierAnnPctRateType value) {
        this.tierAnnPctRate = value;
    }

    /**
     * Gets the value of the tierAnnPctYield property.
     * 
     * @return
     *     possible object is
     *     {@link TierAnnPctYieldType }
     *     
     */
    public TierAnnPctYieldType getTierAnnPctYield() {
        return tierAnnPctYield;
    }

    /**
     * Sets the value of the tierAnnPctYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierAnnPctYieldType }
     *     
     */
    public void setTierAnnPctYield(TierAnnPctYieldType value) {
        this.tierAnnPctYield = value;
    }

    /**
     * Gets the value of the intRateTierRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntRateTierRecArrayAType }{@code >}
     *     
     */
    public JAXBElement<IntRateTierRecArrayAType> getIntRateTierRecArray() {
        return intRateTierRecArray;
    }

    /**
     * Sets the value of the intRateTierRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntRateTierRecArrayAType }{@code >}
     *     
     */
    public void setIntRateTierRecArray(JAXBElement<IntRateTierRecArrayAType> value) {
        this.intRateTierRecArray = value;
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
