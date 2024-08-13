
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
 * <p>Java class for LnTierRateInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnTierRateInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnTierRateText" type="{http://jackhenry.com/jxchange/TPG/2008}LnTierRateText_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnTierRateIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}LnTierRateIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnTierRate" type="{http://jackhenry.com/jxchange/TPG/2008}LnTierRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnTierRateBal" type="{http://jackhenry.com/jxchange/TPG/2008}LnTierRateBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccrMeth" type="{http://jackhenry.com/jxchange/TPG/2008}AccrMeth_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnTierRateInfoRec_CType", propOrder = {
    "lnTierRateText",
    "lnTierRateIdxNum",
    "lnTierRate",
    "lnTierRateBal",
    "accrMeth",
    "ver1",
    "any"
})
public class LnTierRateInfoRecCType {

    @XmlElementRef(name = "LnTierRateText", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnTierRateTextType> lnTierRateText;
    @XmlElementRef(name = "LnTierRateIdxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnTierRateIdxNumType> lnTierRateIdxNum;
    @XmlElementRef(name = "LnTierRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnTierRateType> lnTierRate;
    @XmlElementRef(name = "LnTierRateBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnTierRateBalType> lnTierRateBal;
    @XmlElementRef(name = "AccrMeth", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccrMethType> accrMeth;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnTierRateText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnTierRateTextType }{@code >}
     *     
     */
    public JAXBElement<LnTierRateTextType> getLnTierRateText() {
        return lnTierRateText;
    }

    /**
     * Sets the value of the lnTierRateText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnTierRateTextType }{@code >}
     *     
     */
    public void setLnTierRateText(JAXBElement<LnTierRateTextType> value) {
        this.lnTierRateText = value;
    }

    /**
     * Gets the value of the lnTierRateIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnTierRateIdxNumType }{@code >}
     *     
     */
    public JAXBElement<LnTierRateIdxNumType> getLnTierRateIdxNum() {
        return lnTierRateIdxNum;
    }

    /**
     * Sets the value of the lnTierRateIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnTierRateIdxNumType }{@code >}
     *     
     */
    public void setLnTierRateIdxNum(JAXBElement<LnTierRateIdxNumType> value) {
        this.lnTierRateIdxNum = value;
    }

    /**
     * Gets the value of the lnTierRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnTierRateType }{@code >}
     *     
     */
    public JAXBElement<LnTierRateType> getLnTierRate() {
        return lnTierRate;
    }

    /**
     * Sets the value of the lnTierRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnTierRateType }{@code >}
     *     
     */
    public void setLnTierRate(JAXBElement<LnTierRateType> value) {
        this.lnTierRate = value;
    }

    /**
     * Gets the value of the lnTierRateBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnTierRateBalType }{@code >}
     *     
     */
    public JAXBElement<LnTierRateBalType> getLnTierRateBal() {
        return lnTierRateBal;
    }

    /**
     * Sets the value of the lnTierRateBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnTierRateBalType }{@code >}
     *     
     */
    public void setLnTierRateBal(JAXBElement<LnTierRateBalType> value) {
        this.lnTierRateBal = value;
    }

    /**
     * Gets the value of the accrMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccrMethType }{@code >}
     *     
     */
    public JAXBElement<AccrMethType> getAccrMeth() {
        return accrMeth;
    }

    /**
     * Sets the value of the accrMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccrMethType }{@code >}
     *     
     */
    public void setAccrMeth(JAXBElement<AccrMethType> value) {
        this.accrMeth = value;
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
