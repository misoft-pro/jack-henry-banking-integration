
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
 * <p>Java class for x_DepBalDtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_DepBalDtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepBalDtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepBalDtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="YestBal" type="{http://jackhenry.com/jxchange/TPG/2008}YestBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvgColBal" type="{http://jackhenry.com/jxchange/TPG/2008}AvgColBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvgLdgrBal" type="{http://jackhenry.com/jxchange/TPG/2008}AvgLdgrBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClsAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ClsAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="NextDayMemoCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MemoCrPostAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_DepBalDtInfo_CType", propOrder = {
    "depBalDtInfo",
    "yestBal",
    "avgColBal",
    "avgLdgrBal",
    "clsAmt",
    "custom",
    "ver1",
    "nextDayMemoCrPostAmt",
    "ver2",
    "any"
})
public class XDepBalDtInfoCType {

    @XmlElement(name = "DepBalDtInfo")
    protected DepBalDtInfoCType depBalDtInfo;
    @XmlElement(name = "YestBal")
    protected YestBalType yestBal;
    @XmlElement(name = "AvgColBal")
    protected AvgColBalType avgColBal;
    @XmlElement(name = "AvgLdgrBal")
    protected AvgLdgrBalType avgLdgrBal;
    @XmlElement(name = "ClsAmt")
    protected ClsAmtType clsAmt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "NextDayMemoCrPostAmt")
    protected MemoCrPostAmtType nextDayMemoCrPostAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the depBalDtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepBalDtInfoCType }
     *     
     */
    public DepBalDtInfoCType getDepBalDtInfo() {
        return depBalDtInfo;
    }

    /**
     * Sets the value of the depBalDtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepBalDtInfoCType }
     *     
     */
    public void setDepBalDtInfo(DepBalDtInfoCType value) {
        this.depBalDtInfo = value;
    }

    /**
     * Gets the value of the yestBal property.
     * 
     * @return
     *     possible object is
     *     {@link YestBalType }
     *     
     */
    public YestBalType getYestBal() {
        return yestBal;
    }

    /**
     * Sets the value of the yestBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link YestBalType }
     *     
     */
    public void setYestBal(YestBalType value) {
        this.yestBal = value;
    }

    /**
     * Gets the value of the avgColBal property.
     * 
     * @return
     *     possible object is
     *     {@link AvgColBalType }
     *     
     */
    public AvgColBalType getAvgColBal() {
        return avgColBal;
    }

    /**
     * Sets the value of the avgColBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvgColBalType }
     *     
     */
    public void setAvgColBal(AvgColBalType value) {
        this.avgColBal = value;
    }

    /**
     * Gets the value of the avgLdgrBal property.
     * 
     * @return
     *     possible object is
     *     {@link AvgLdgrBalType }
     *     
     */
    public AvgLdgrBalType getAvgLdgrBal() {
        return avgLdgrBal;
    }

    /**
     * Sets the value of the avgLdgrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvgLdgrBalType }
     *     
     */
    public void setAvgLdgrBal(AvgLdgrBalType value) {
        this.avgLdgrBal = value;
    }

    /**
     * Gets the value of the clsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ClsAmtType }
     *     
     */
    public ClsAmtType getClsAmt() {
        return clsAmt;
    }

    /**
     * Sets the value of the clsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsAmtType }
     *     
     */
    public void setClsAmt(ClsAmtType value) {
        this.clsAmt = value;
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
     * Gets the value of the nextDayMemoCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MemoCrPostAmtType }
     *     
     */
    public MemoCrPostAmtType getNextDayMemoCrPostAmt() {
        return nextDayMemoCrPostAmt;
    }

    /**
     * Sets the value of the nextDayMemoCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoCrPostAmtType }
     *     
     */
    public void setNextDayMemoCrPostAmt(MemoCrPostAmtType value) {
        this.nextDayMemoCrPostAmt = value;
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
