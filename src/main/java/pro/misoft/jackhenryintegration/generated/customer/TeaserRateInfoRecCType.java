
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
 * <p>Java class for TeaserRateInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeaserRateInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TeaserRateDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="TeaserRateEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TeaserRateExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TeaserRateExpDays" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TeaserRate" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="TeaserAnnPctYield" type="{http://jackhenry.com/jxchange/TPG/2008}AnnPctYield_Type" minOccurs="0"/&gt;
 *         &lt;element name="TeaserRateTierRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateTierRecArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "TeaserRateInfoRec_CType", propOrder = {
    "teaserRateDesc",
    "teaserRateEffDt",
    "teaserRateExpDt",
    "teaserRateExpDays",
    "teaserRate",
    "teaserAnnPctYield",
    "teaserRateTierRecArray",
    "custom",
    "ver1",
    "any"
})
public class TeaserRateInfoRecCType {

    @XmlElement(name = "TeaserRateDesc")
    protected TeaserRateDescType teaserRateDesc;
    @XmlElement(name = "TeaserRateEffDt")
    protected TeaserRateEffDtType teaserRateEffDt;
    @XmlElement(name = "TeaserRateExpDt")
    protected TeaserRateExpDtType teaserRateExpDt;
    @XmlElement(name = "TeaserRateExpDays")
    protected TermCntType teaserRateExpDays;
    @XmlElement(name = "TeaserRate")
    protected TeaserRateType teaserRate;
    @XmlElement(name = "TeaserAnnPctYield")
    protected AnnPctYieldType teaserAnnPctYield;
    @XmlElementRef(name = "TeaserRateTierRecArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TeaserRateTierRecArrayAType> teaserRateTierRecArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the teaserRateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TeaserRateDescType }
     *     
     */
    public TeaserRateDescType getTeaserRateDesc() {
        return teaserRateDesc;
    }

    /**
     * Sets the value of the teaserRateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeaserRateDescType }
     *     
     */
    public void setTeaserRateDesc(TeaserRateDescType value) {
        this.teaserRateDesc = value;
    }

    /**
     * Gets the value of the teaserRateEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link TeaserRateEffDtType }
     *     
     */
    public TeaserRateEffDtType getTeaserRateEffDt() {
        return teaserRateEffDt;
    }

    /**
     * Sets the value of the teaserRateEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeaserRateEffDtType }
     *     
     */
    public void setTeaserRateEffDt(TeaserRateEffDtType value) {
        this.teaserRateEffDt = value;
    }

    /**
     * Gets the value of the teaserRateExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link TeaserRateExpDtType }
     *     
     */
    public TeaserRateExpDtType getTeaserRateExpDt() {
        return teaserRateExpDt;
    }

    /**
     * Sets the value of the teaserRateExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeaserRateExpDtType }
     *     
     */
    public void setTeaserRateExpDt(TeaserRateExpDtType value) {
        this.teaserRateExpDt = value;
    }

    /**
     * Gets the value of the teaserRateExpDays property.
     * 
     * @return
     *     possible object is
     *     {@link TermCntType }
     *     
     */
    public TermCntType getTeaserRateExpDays() {
        return teaserRateExpDays;
    }

    /**
     * Sets the value of the teaserRateExpDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCntType }
     *     
     */
    public void setTeaserRateExpDays(TermCntType value) {
        this.teaserRateExpDays = value;
    }

    /**
     * Gets the value of the teaserRate property.
     * 
     * @return
     *     possible object is
     *     {@link TeaserRateType }
     *     
     */
    public TeaserRateType getTeaserRate() {
        return teaserRate;
    }

    /**
     * Sets the value of the teaserRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeaserRateType }
     *     
     */
    public void setTeaserRate(TeaserRateType value) {
        this.teaserRate = value;
    }

    /**
     * Gets the value of the teaserAnnPctYield property.
     * 
     * @return
     *     possible object is
     *     {@link AnnPctYieldType }
     *     
     */
    public AnnPctYieldType getTeaserAnnPctYield() {
        return teaserAnnPctYield;
    }

    /**
     * Sets the value of the teaserAnnPctYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnPctYieldType }
     *     
     */
    public void setTeaserAnnPctYield(AnnPctYieldType value) {
        this.teaserAnnPctYield = value;
    }

    /**
     * Gets the value of the teaserRateTierRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateTierRecArrayAType }{@code >}
     *     
     */
    public JAXBElement<TeaserRateTierRecArrayAType> getTeaserRateTierRecArray() {
        return teaserRateTierRecArray;
    }

    /**
     * Sets the value of the teaserRateTierRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateTierRecArrayAType }{@code >}
     *     
     */
    public void setTeaserRateTierRecArray(JAXBElement<TeaserRateTierRecArrayAType> value) {
        this.teaserRateTierRecArray = value;
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
