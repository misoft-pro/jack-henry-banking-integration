
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
 * <p>Java class for SubLogInIdRstr_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubLogInIdRstr_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinLenCharVal" type="{http://jackhenry.com/jxchange/TPG/2008}MinLenCharVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="MaxLenCharVal" type="{http://jackhenry.com/jxchange/TPG/2008}MaxLenCharVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinAlphaCharVal" type="{http://jackhenry.com/jxchange/TPG/2008}MinAlphaCharVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinNumCharVal" type="{http://jackhenry.com/jxchange/TPG/2008}MinNumCharVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinSpecCharVal" type="{http://jackhenry.com/jxchange/TPG/2008}MinSpecCharVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinLowCaseVal" type="{http://jackhenry.com/jxchange/TPG/2008}MinLowCaseVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinUpCaseVal" type="{http://jackhenry.com/jxchange/TPG/2008}MinUpCaseVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SpecCharRstrArray" type="{http://jackhenry.com/jxchange/TPG/2008}SpecCharRstrArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "SubLogInIdRstr_CType", propOrder = {
    "minLenCharVal",
    "maxLenCharVal",
    "minAlphaCharVal",
    "minNumCharVal",
    "minSpecCharVal",
    "minLowCaseVal",
    "minUpCaseVal",
    "specCharRstrArray",
    "ver1",
    "any"
})
public class SubLogInIdRstrCType {

    @XmlElement(name = "MinLenCharVal")
    protected MinLenCharValType minLenCharVal;
    @XmlElement(name = "MaxLenCharVal")
    protected MaxLenCharValType maxLenCharVal;
    @XmlElement(name = "MinAlphaCharVal")
    protected MinAlphaCharValType minAlphaCharVal;
    @XmlElement(name = "MinNumCharVal")
    protected MinNumCharValType minNumCharVal;
    @XmlElement(name = "MinSpecCharVal")
    protected MinSpecCharValType minSpecCharVal;
    @XmlElement(name = "MinLowCaseVal")
    protected MinLowCaseValType minLowCaseVal;
    @XmlElement(name = "MinUpCaseVal")
    protected MinUpCaseValType minUpCaseVal;
    @XmlElement(name = "SpecCharRstrArray")
    protected SpecCharRstrArrayAType specCharRstrArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the minLenCharVal property.
     * 
     * @return
     *     possible object is
     *     {@link MinLenCharValType }
     *     
     */
    public MinLenCharValType getMinLenCharVal() {
        return minLenCharVal;
    }

    /**
     * Sets the value of the minLenCharVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinLenCharValType }
     *     
     */
    public void setMinLenCharVal(MinLenCharValType value) {
        this.minLenCharVal = value;
    }

    /**
     * Gets the value of the maxLenCharVal property.
     * 
     * @return
     *     possible object is
     *     {@link MaxLenCharValType }
     *     
     */
    public MaxLenCharValType getMaxLenCharVal() {
        return maxLenCharVal;
    }

    /**
     * Sets the value of the maxLenCharVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxLenCharValType }
     *     
     */
    public void setMaxLenCharVal(MaxLenCharValType value) {
        this.maxLenCharVal = value;
    }

    /**
     * Gets the value of the minAlphaCharVal property.
     * 
     * @return
     *     possible object is
     *     {@link MinAlphaCharValType }
     *     
     */
    public MinAlphaCharValType getMinAlphaCharVal() {
        return minAlphaCharVal;
    }

    /**
     * Sets the value of the minAlphaCharVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinAlphaCharValType }
     *     
     */
    public void setMinAlphaCharVal(MinAlphaCharValType value) {
        this.minAlphaCharVal = value;
    }

    /**
     * Gets the value of the minNumCharVal property.
     * 
     * @return
     *     possible object is
     *     {@link MinNumCharValType }
     *     
     */
    public MinNumCharValType getMinNumCharVal() {
        return minNumCharVal;
    }

    /**
     * Sets the value of the minNumCharVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinNumCharValType }
     *     
     */
    public void setMinNumCharVal(MinNumCharValType value) {
        this.minNumCharVal = value;
    }

    /**
     * Gets the value of the minSpecCharVal property.
     * 
     * @return
     *     possible object is
     *     {@link MinSpecCharValType }
     *     
     */
    public MinSpecCharValType getMinSpecCharVal() {
        return minSpecCharVal;
    }

    /**
     * Sets the value of the minSpecCharVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinSpecCharValType }
     *     
     */
    public void setMinSpecCharVal(MinSpecCharValType value) {
        this.minSpecCharVal = value;
    }

    /**
     * Gets the value of the minLowCaseVal property.
     * 
     * @return
     *     possible object is
     *     {@link MinLowCaseValType }
     *     
     */
    public MinLowCaseValType getMinLowCaseVal() {
        return minLowCaseVal;
    }

    /**
     * Sets the value of the minLowCaseVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinLowCaseValType }
     *     
     */
    public void setMinLowCaseVal(MinLowCaseValType value) {
        this.minLowCaseVal = value;
    }

    /**
     * Gets the value of the minUpCaseVal property.
     * 
     * @return
     *     possible object is
     *     {@link MinUpCaseValType }
     *     
     */
    public MinUpCaseValType getMinUpCaseVal() {
        return minUpCaseVal;
    }

    /**
     * Sets the value of the minUpCaseVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinUpCaseValType }
     *     
     */
    public void setMinUpCaseVal(MinUpCaseValType value) {
        this.minUpCaseVal = value;
    }

    /**
     * Gets the value of the specCharRstrArray property.
     * 
     * @return
     *     possible object is
     *     {@link SpecCharRstrArrayAType }
     *     
     */
    public SpecCharRstrArrayAType getSpecCharRstrArray() {
        return specCharRstrArray;
    }

    /**
     * Sets the value of the specCharRstrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecCharRstrArrayAType }
     *     
     */
    public void setSpecCharRstrArray(SpecCharRstrArrayAType value) {
        this.specCharRstrArray = value;
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
