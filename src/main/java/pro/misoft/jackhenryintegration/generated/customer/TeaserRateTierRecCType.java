
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
 * <p>Java class for TeaserRateTierRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeaserRateTierRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TierRateText" type="{http://jackhenry.com/jxchange/TPG/2008}TierRateText_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierRate" type="{http://jackhenry.com/jxchange/TPG/2008}TierRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierRateBal" type="{http://jackhenry.com/jxchange/TPG/2008}TierRateBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierAnnPctYield" type="{http://jackhenry.com/jxchange/TPG/2008}TierAnnPctYield_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TeaserRateTierRec_CType", propOrder = {
    "tierRateText",
    "tierRate",
    "tierRateBal",
    "tierAnnPctYield",
    "custom",
    "ver1",
    "any"
})
public class TeaserRateTierRecCType {

    @XmlElement(name = "TierRateText")
    protected TierRateTextType tierRateText;
    @XmlElement(name = "TierRate")
    protected TierRateType tierRate;
    @XmlElement(name = "TierRateBal")
    protected TierRateBalType tierRateBal;
    @XmlElement(name = "TierAnnPctYield")
    protected TierAnnPctYieldType tierAnnPctYield;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the tierRateText property.
     * 
     * @return
     *     possible object is
     *     {@link TierRateTextType }
     *     
     */
    public TierRateTextType getTierRateText() {
        return tierRateText;
    }

    /**
     * Sets the value of the tierRateText property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRateTextType }
     *     
     */
    public void setTierRateText(TierRateTextType value) {
        this.tierRateText = value;
    }

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
