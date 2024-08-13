
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
 * <p>Java class for IntRateTierRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntRateTierRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TierRate" type="{http://jackhenry.com/jxchange/TPG/2008}TierRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnnPctRate" type="{http://jackhenry.com/jxchange/TPG/2008}AnnPctRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnnPctYield" type="{http://jackhenry.com/jxchange/TPG/2008}AnnPctYield_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierRateIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}TierRateIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierRateIdxDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TierRateIdxDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierRateBal" type="{http://jackhenry.com/jxchange/TPG/2008}TierRateBal_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="TierRateCeilBal" type="{http://jackhenry.com/jxchange/TPG/2008}TierRateBal_Type" minOccurs="0"/&gt;
 *           &lt;element name="AnnPctYieldFlr" type="{http://jackhenry.com/jxchange/TPG/2008}AnnPctYield_Type" minOccurs="0"/&gt;
 *           &lt;element name="TierRateOrder" type="{http://jackhenry.com/jxchange/TPG/2008}TierRateOrder_Type" minOccurs="0"/&gt;
 *           &lt;element name="TierRateType" type="{http://jackhenry.com/jxchange/TPG/2008}TierRateType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "IntRateTierRec_CType", propOrder = {
    "tierRate",
    "annPctRate",
    "annPctYield",
    "tierRateIdxNum",
    "tierRateIdxDesc",
    "tierRateBal",
    "ver1",
    "tierRateCeilBal",
    "annPctYieldFlr",
    "tierRateOrder",
    "tierRateType",
    "ver2",
    "any"
})
public class IntRateTierRecCType {

    @XmlElement(name = "TierRate")
    protected TierRateType tierRate;
    @XmlElement(name = "AnnPctRate")
    protected AnnPctRateType annPctRate;
    @XmlElement(name = "AnnPctYield")
    protected AnnPctYieldType annPctYield;
    @XmlElement(name = "TierRateIdxNum")
    protected TierRateIdxNumType tierRateIdxNum;
    @XmlElement(name = "TierRateIdxDesc")
    protected TierRateIdxDescType tierRateIdxDesc;
    @XmlElement(name = "TierRateBal")
    protected TierRateBalType tierRateBal;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "TierRateCeilBal")
    protected TierRateBalType tierRateCeilBal;
    @XmlElement(name = "AnnPctYieldFlr")
    protected AnnPctYieldType annPctYieldFlr;
    @XmlElement(name = "TierRateOrder")
    protected TierRateOrderType tierRateOrder;
    @XmlElement(name = "TierRateType")
    protected TierRateTypeType tierRateType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the tierRate property.
     * 
     * @return
     *     possible object is
     *     {@link TierRateType }
     *     
     */
    public TierRateType getTierRate() {
        return tierRate;
    }

    /**
     * Sets the value of the tierRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRateType }
     *     
     */
    public void setTierRate(TierRateType value) {
        this.tierRate = value;
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
     * Gets the value of the tierRateIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link TierRateIdxNumType }
     *     
     */
    public TierRateIdxNumType getTierRateIdxNum() {
        return tierRateIdxNum;
    }

    /**
     * Sets the value of the tierRateIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRateIdxNumType }
     *     
     */
    public void setTierRateIdxNum(TierRateIdxNumType value) {
        this.tierRateIdxNum = value;
    }

    /**
     * Gets the value of the tierRateIdxDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TierRateIdxDescType }
     *     
     */
    public TierRateIdxDescType getTierRateIdxDesc() {
        return tierRateIdxDesc;
    }

    /**
     * Sets the value of the tierRateIdxDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRateIdxDescType }
     *     
     */
    public void setTierRateIdxDesc(TierRateIdxDescType value) {
        this.tierRateIdxDesc = value;
    }

    /**
     * Gets the value of the tierRateBal property.
     * 
     * @return
     *     possible object is
     *     {@link TierRateBalType }
     *     
     */
    public TierRateBalType getTierRateBal() {
        return tierRateBal;
    }

    /**
     * Sets the value of the tierRateBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRateBalType }
     *     
     */
    public void setTierRateBal(TierRateBalType value) {
        this.tierRateBal = value;
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
     * Gets the value of the tierRateCeilBal property.
     * 
     * @return
     *     possible object is
     *     {@link TierRateBalType }
     *     
     */
    public TierRateBalType getTierRateCeilBal() {
        return tierRateCeilBal;
    }

    /**
     * Sets the value of the tierRateCeilBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRateBalType }
     *     
     */
    public void setTierRateCeilBal(TierRateBalType value) {
        this.tierRateCeilBal = value;
    }

    /**
     * Gets the value of the annPctYieldFlr property.
     * 
     * @return
     *     possible object is
     *     {@link AnnPctYieldType }
     *     
     */
    public AnnPctYieldType getAnnPctYieldFlr() {
        return annPctYieldFlr;
    }

    /**
     * Sets the value of the annPctYieldFlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnPctYieldType }
     *     
     */
    public void setAnnPctYieldFlr(AnnPctYieldType value) {
        this.annPctYieldFlr = value;
    }

    /**
     * Gets the value of the tierRateOrder property.
     * 
     * @return
     *     possible object is
     *     {@link TierRateOrderType }
     *     
     */
    public TierRateOrderType getTierRateOrder() {
        return tierRateOrder;
    }

    /**
     * Sets the value of the tierRateOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRateOrderType }
     *     
     */
    public void setTierRateOrder(TierRateOrderType value) {
        this.tierRateOrder = value;
    }

    /**
     * Gets the value of the tierRateType property.
     * 
     * @return
     *     possible object is
     *     {@link TierRateTypeType }
     *     
     */
    public TierRateTypeType getTierRateType() {
        return tierRateType;
    }

    /**
     * Sets the value of the tierRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRateTypeType }
     *     
     */
    public void setTierRateType(TierRateTypeType value) {
        this.tierRateType = value;
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
