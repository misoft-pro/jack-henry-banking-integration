
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
 * <p>Java class for AcctHistSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctHistSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}DepHistSrchRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}LnHistSrchRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepHistSrchRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="SafeDepHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}SafeDepHistSrchRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustomAcctHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "AcctHistSrchRec_CType", propOrder = {
    "depHistSrchRec",
    "lnHistSrchRec",
    "timeDepHistSrchRec",
    "safeDepHistSrchRec",
    "customAcctHistSrchRec",
    "ver1",
    "any"
})
public class AcctHistSrchRecCType {

    @XmlElement(name = "DepHistSrchRec")
    protected DepHistSrchRecCType depHistSrchRec;
    @XmlElement(name = "LnHistSrchRec")
    protected LnHistSrchRecCType lnHistSrchRec;
    @XmlElement(name = "TimeDepHistSrchRec")
    protected TimeDepHistSrchRecCType timeDepHistSrchRec;
    @XmlElement(name = "SafeDepHistSrchRec")
    protected SafeDepHistSrchRecCType safeDepHistSrchRec;
    @XmlElement(name = "CustomAcctHistSrchRec")
    protected CustomCType customAcctHistSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the depHistSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link DepHistSrchRecCType }
     *     
     */
    public DepHistSrchRecCType getDepHistSrchRec() {
        return depHistSrchRec;
    }

    /**
     * Sets the value of the depHistSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepHistSrchRecCType }
     *     
     */
    public void setDepHistSrchRec(DepHistSrchRecCType value) {
        this.depHistSrchRec = value;
    }

    /**
     * Gets the value of the lnHistSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link LnHistSrchRecCType }
     *     
     */
    public LnHistSrchRecCType getLnHistSrchRec() {
        return lnHistSrchRec;
    }

    /**
     * Sets the value of the lnHistSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnHistSrchRecCType }
     *     
     */
    public void setLnHistSrchRec(LnHistSrchRecCType value) {
        this.lnHistSrchRec = value;
    }

    /**
     * Gets the value of the timeDepHistSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepHistSrchRecCType }
     *     
     */
    public TimeDepHistSrchRecCType getTimeDepHistSrchRec() {
        return timeDepHistSrchRec;
    }

    /**
     * Sets the value of the timeDepHistSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepHistSrchRecCType }
     *     
     */
    public void setTimeDepHistSrchRec(TimeDepHistSrchRecCType value) {
        this.timeDepHistSrchRec = value;
    }

    /**
     * Gets the value of the safeDepHistSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link SafeDepHistSrchRecCType }
     *     
     */
    public SafeDepHistSrchRecCType getSafeDepHistSrchRec() {
        return safeDepHistSrchRec;
    }

    /**
     * Sets the value of the safeDepHistSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeDepHistSrchRecCType }
     *     
     */
    public void setSafeDepHistSrchRec(SafeDepHistSrchRecCType value) {
        this.safeDepHistSrchRec = value;
    }

    /**
     * Gets the value of the customAcctHistSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomAcctHistSrchRec() {
        return customAcctHistSrchRec;
    }

    /**
     * Sets the value of the customAcctHistSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomAcctHistSrchRec(CustomCType value) {
        this.customAcctHistSrchRec = value;
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
