
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * A package of data related to a rush option 
 * 
 * <p>Java class for RushOptInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RushOptInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RushOpt" type="{http://jackhenry.com/jxchange/TPG/2008}RushOpt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RushOptFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RushOptFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RushOptSurChg" type="{http://jackhenry.com/jxchange/TPG/2008}RushOptSurChg_Type" minOccurs="0"/&gt;
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
@XmlType(name = "RushOptInfo_CType", propOrder = {
    "rushOpt",
    "rushOptFeeAmt",
    "rushOptSurChg",
    "custom",
    "ver1",
    "any"
})
public class RushOptInfoCType {

    @XmlElement(name = "RushOpt")
    protected RushOptType rushOpt;
    @XmlElement(name = "RushOptFeeAmt")
    protected RushOptFeeAmtType rushOptFeeAmt;
    @XmlElement(name = "RushOptSurChg")
    protected RushOptSurChgType rushOptSurChg;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the rushOpt property.
     * 
     * @return
     *     possible object is
     *     {@link RushOptType }
     *     
     */
    public RushOptType getRushOpt() {
        return rushOpt;
    }

    /**
     * Sets the value of the rushOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RushOptType }
     *     
     */
    public void setRushOpt(RushOptType value) {
        this.rushOpt = value;
    }

    /**
     * Gets the value of the rushOptFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RushOptFeeAmtType }
     *     
     */
    public RushOptFeeAmtType getRushOptFeeAmt() {
        return rushOptFeeAmt;
    }

    /**
     * Sets the value of the rushOptFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RushOptFeeAmtType }
     *     
     */
    public void setRushOptFeeAmt(RushOptFeeAmtType value) {
        this.rushOptFeeAmt = value;
    }

    /**
     * Gets the value of the rushOptSurChg property.
     * 
     * @return
     *     possible object is
     *     {@link RushOptSurChgType }
     *     
     */
    public RushOptSurChgType getRushOptSurChg() {
        return rushOptSurChg;
    }

    /**
     * Sets the value of the rushOptSurChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RushOptSurChgType }
     *     
     */
    public void setRushOptSurChg(RushOptSurChgType value) {
        this.rushOptSurChg = value;
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
     * {@link Element }
     * {@link Object }
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
